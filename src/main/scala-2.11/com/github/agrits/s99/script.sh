#!/bin/bash
#Simple script to generate object files for all exercises
for i in `seq 1 99`; do
	printf "package com.github.agrits.s99\n\nobject P$i{\n\n}" > P$i.scala
done
