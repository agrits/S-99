#!/bin/bash
#Simple script to generate test classes for all exercises
for i in `seq 1 99`; do
	printf "package com.github.agrits.s99\nimport org.scalatest.FunSuite\n \n\nclass P%sSuite extends FunSuite{\n\n}" $i > P$i\Suite.scala
done
