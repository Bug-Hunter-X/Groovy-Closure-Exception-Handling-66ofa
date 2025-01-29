# Groovy Closure Exception Handling Bug

This repository demonstrates a common, yet subtle, error in Groovy involving exception handling within closures.  The example code shows how an unhandled exception in a closure can abruptly terminate the program, even if the calling method doesn't explicitly handle it.

The `bug.groovy` file contains the problematic code, while `bugSolution.groovy` provides a corrected version. The issue is explained in detail in the file itself and highlights best practices for handling exceptions thrown from within closures.