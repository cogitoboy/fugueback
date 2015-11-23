#!/bin/bash
mvn install:install-file -DlocalRepositoryPath=repository -DcreateChecksum=true -Dpackaging=jar -Dfile=jfugue-5.0.4.jar -DgroupId=org.jfugue -DartifactId=jfugue -Dversion=5.0.4