/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.commons.cli.bug;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.OptionBuilder;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;
import org.apache.commons.cli.PosixParser;
import org.junit.jupiter.api.Test;

@SuppressWarnings("deprecation") // tests some deprecated classes
class BugCLI13Test {

    @Test
    void testCLI13() throws ParseException {
        final String debugOpt = "debug";
        @SuppressWarnings("static-access")
        //@formatter:off
        final Option debug = OptionBuilder
            .withArgName(debugOpt)
            .withDescription("turn on debugging")
            .withLongOpt(debugOpt)
            .hasArg()
            .create('d');
        //@formatter:on
        final Options options = new Options();
        options.addOption(debug);
        final CommandLine commandLine = new PosixParser().parse(options, new String[] {"-d", "true"});

        assertEquals("true", commandLine.getOptionValue(debugOpt));
        assertEquals("true", commandLine.getOptionValue('d'));
        assertTrue(commandLine.hasOption('d'));
        assertTrue(commandLine.hasOption(debugOpt));
    }
}
