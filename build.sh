#!/bin/bash

# Compile Java source code
javac src/**/*.java

# Run unit tests
java -cp src org.junit.runner.JUnitCore test.TestSuite
