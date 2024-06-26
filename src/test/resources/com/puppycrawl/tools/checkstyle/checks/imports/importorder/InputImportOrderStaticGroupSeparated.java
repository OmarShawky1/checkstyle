/*
ImportOrder
option = top
groups = java, org
ordered = (default)true
separated = true
separatedStaticGroups = (default)false
caseSensitive = (default)true
staticGroups = (default)
sortStaticImportsAlphabetically = (default)false
useContainerOrderingForStatic = (default)false
tokens = (default)STATIC_IMPORT


*/

package com.puppycrawl.tools.checkstyle.checks.imports.importorder;

import static java.lang.Math.abs;

import static java.lang.Math.cos; // violation 'Extra separation in import group before 'java.lang.Math.cos''

import static org.junit.Assert.assertEquals; // violation 'Extra separation in import group before 'org.junit.Assert.assertEquals''
import static org.junit.Assert.fail;

public class InputImportOrderStaticGroupSeparated {
    void method() {
    }
}
