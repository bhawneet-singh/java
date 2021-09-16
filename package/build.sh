#!/bin/bash

javac ./com/bhawneet/*.java
if [[ $? -eq 0 ]]
then
	jar -cfe package_example.jar com.bhawneet.Main ./com/bhawneet/*.class
	if [[ $? -eq 0 ]]
	then
		java -jar package_example.jar
	else
		echo "some thing went wrong while create package"
	fi
else
	echo "compilation error"
fi
