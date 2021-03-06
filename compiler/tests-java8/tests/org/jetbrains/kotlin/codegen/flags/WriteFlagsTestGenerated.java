/*
 * Copyright 2010-2017 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.jetbrains.kotlin.codegen.flags;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.JUnit3RunnerWithInners;
import org.jetbrains.kotlin.test.KotlinTestUtils;
import org.jetbrains.kotlin.test.TargetBackend;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.runner.RunWith;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.TestsPackage}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("compiler/testData/codegen/java8/writeFlags")
@TestDataPath("$PROJECT_ROOT")
@RunWith(JUnit3RunnerWithInners.class)
public class WriteFlagsTestGenerated extends AbstractWriteFlagsTest {
    public void testAllFilesPresentInWriteFlags() throws Exception {
        KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/codegen/java8/writeFlags"), Pattern.compile("^(.+)\\.kt$"), TargetBackend.ANY, true);
    }

    @TestMetadata("interfaceMethod.kt")
    public void testInterfaceMethod() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/java8/writeFlags/interfaceMethod.kt");
        doTest(fileName);
    }

    @TestMetadata("interfaceProperty.kt")
    public void testInterfaceProperty() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/java8/writeFlags/interfaceProperty.kt");
        doTest(fileName);
    }

    @TestMetadata("compiler/testData/codegen/java8/writeFlags/defaults")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class Defaults extends AbstractWriteFlagsTest {
        public void testAllFilesPresentInDefaults() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/codegen/java8/writeFlags/defaults"), Pattern.compile("^(.+)\\.kt$"), TargetBackend.ANY, true);
        }

        @TestMetadata("defaultMethod.kt")
        public void testDefaultMethod() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/java8/writeFlags/defaults/defaultMethod.kt");
            doTest(fileName);
        }

        @TestMetadata("defaultMethodCompatibility.kt")
        public void testDefaultMethodCompatibility() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/java8/writeFlags/defaults/defaultMethodCompatibility.kt");
            doTest(fileName);
        }

        @TestMetadata("defaultProperty.kt")
        public void testDefaultProperty() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/java8/writeFlags/defaults/defaultProperty.kt");
            doTest(fileName);
        }

        @TestMetadata("defaultPropertyCompatibility.kt")
        public void testDefaultPropertyCompatibility() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/java8/writeFlags/defaults/defaultPropertyCompatibility.kt");
            doTest(fileName);
        }
    }
}
