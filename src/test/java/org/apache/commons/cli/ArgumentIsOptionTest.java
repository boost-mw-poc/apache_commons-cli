/*
  Licensed to the Apache Software Foundation (ASF) under one or more
  contributor license agreements.  See the NOTICE file distributed with
  this work for additional information regarding copyright ownership.
  The ASF licenses this file to You under the Apache License, Version 2.0
  (the "License"); you may not use this file except in compliance with
  the License.  You may obtain a copy of the License at

      https://www.apache.org/licenses/LICENSE-2.0

  Unless required by applicable law or agreed to in writing, software
  distributed under the License is distributed on an "AS IS" BASIS,
  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
  See the License for the specific language governing permissions and
  limitations under the License.
 */

package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

@SuppressWarnings("deprecation") // tests some deprecated classes
class ArgumentIsOptionTest {

    private Options options;
    private CommandLineParser parser;

    @BeforeEach
    public void setUp() {
        options = new Options().addOption("p", false, "Option p").addOption("attr", true, "Option accepts argument");
        parser = new PosixParser();
    }

    @Test
    void testOption() throws Exception {
        final String[] args = {"-p"};

        final CommandLine cl = parser.parse(options, args);
        assertTrue(cl.hasOption("p"), "Confirm -p is set");
        assertFalse(cl.hasOption("attr"), "Confirm -attr is not set");
        assertEquals(0, cl.getArgs().length, "Confirm all arguments recognized");
    }

    @Test
    void testOptionAndOptionWithArgument() throws Exception {
        final String[] args = {"-p", "-attr", "p"};

        final CommandLine cl = parser.parse(options, args);
        assertTrue(cl.hasOption("p"), "Confirm -p is set");
        assertTrue(cl.hasOption("attr"), "Confirm -attr is set");
        assertEquals("p", cl.getOptionValue("attr"), "Confirm arg of -attr");
        assertEquals(0, cl.getArgs().length, "Confirm all arguments recognized");
    }

    @Test
    void testOptionWithArgument() throws Exception {
        final String[] args = {"-attr", "p"};

        final CommandLine cl = parser.parse(options, args);
        assertFalse(cl.hasOption("p"), "Confirm -p is set");
        assertTrue(cl.hasOption("attr"), "Confirm -attr is set");
        assertEquals("p", cl.getOptionValue("attr"), "Confirm arg of -attr");
        assertEquals(0, cl.getArgs().length, "Confirm all arguments recognized");
    }
}
