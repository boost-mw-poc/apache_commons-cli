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

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/**
 * TODO Needs a rework using JUnit parameterized tests.
 */
@SuppressWarnings("deprecation") // tests some deprecated classes
class BasicParserTest extends AbstractParserTestCase {
    @Override
    @BeforeEach
    public void setUp() {
        super.setUp();
        parser = new BasicParser();
    }

    @Override
    @Test
    @Disabled("not supported by the BasicParser")
    void testAmbiguousLongWithoutEqualSingleDash() throws Exception {
    }

    @Override
    @Test
    @Disabled("not supported by the BasicParser")
    void testAmbiguousLongWithoutEqualSingleDash2() throws Exception {
    }

    @Override
    @Test
    @Disabled("not supported by the BasicParser")
    void testAmbiguousPartialLongOption1() throws Exception {
    }

    @Override
    @Test
    @Disabled("not supported by the BasicParser")
    void testAmbiguousPartialLongOption2() throws Exception {
    }

    @Override
    @Test
    @Disabled("not supported by the BasicParser")
    void testAmbiguousPartialLongOption3() throws Exception {
    }

    @Override
    @Test
    @Disabled("not supported by the BasicParser")
    void testAmbiguousPartialLongOption4() throws Exception {
    }

    @Override
    @Test
    @Disabled("not supported by the BasicParser")
    void testBursting() throws Exception {
    }

    @Override
    @Test
    @Disabled("not supported by the BasicParser")
    void testDoubleDash2() throws Exception {
    }

    @Override
    @Test
    @Disabled("not supported by the BasicParser")
    void testLongOptionWithEqualsQuoteHandling() throws Exception {
    }

    @Override
    @Test
    @Disabled("not supported by the BasicParser")
    void testLongWithEqualDoubleDash() throws Exception {
    }

    @Override
    @Test
    @Disabled("not supported by the BasicParser")
    void testLongWithEqualSingleDash() throws Exception {
    }

    @Override
    @Test
    @Disabled("not supported by the BasicParser")
    void testLongWithoutEqualSingleDash() throws Exception {
    }

    @Override
    @Test
    @Disabled("not supported by the BasicParser")
    void testMissingArgWithBursting() throws Exception {
    }

    @Override
    @Test
    @Disabled("not supported by the BasicParser (CLI-184)")
    void testNegativeOption() throws Exception {
    }

    @Override
    @Test
    @Disabled("not supported by the BasicParser")
    void testPartialLongOptionSingleDash() throws Exception {
    }

    @Override
    @Test
    @Disabled("not supported by the BasicParser")
    void testPropertiesOption1() throws Exception {
    }

    @Override
    @Test
    @Disabled("not supported by the BasicParser")
    void testPropertiesOption2() throws Exception {
    }

    @Override
    @Test
    @Disabled("not supported by the BasicParser")
    void testShortOptionConcatenatedQuoteHandling() throws Exception {
    }

    @Override
    @Test
    @Disabled("not supported by the BasicParser")
    void testShortWithEqual() throws Exception {
    }

    @Override
    @Test
    @Disabled("not supported by the BasicParser")
    void testShortWithoutEqual() throws Exception {
    }

    @Override
    @Test
    @Disabled("not supported by the BasicParser")
    void testStopBursting() throws Exception {
    }

    @Override
    @Test
    @Disabled("not supported by the BasicParser")
    void testStopBursting2() throws Exception {
    }

    @Override
    @Test
    @Disabled("not supported by the BasicParser")
    void testUnambiguousPartialLongOption1() throws Exception {
    }

    @Override
    @Test
    @Disabled("not supported by the BasicParser")
    void testUnambiguousPartialLongOption2() throws Exception {
    }

    @Override
    @Test
    @Disabled("not supported by the BasicParser")
    void testUnambiguousPartialLongOption3() throws Exception {
    }

    @Override
    @Test
    @Disabled("not supported by the BasicParser")
    void testUnambiguousPartialLongOption4() throws Exception {
    }

    @Override
    @Test
    @Disabled("not supported by the BasicParser")
    void testUnrecognizedOptionWithBursting() throws Exception {
    }
}
