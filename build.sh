#!/bin/bash

cd moviecruiser
source ./env-variable.sh
mvn clean package
cd ..
cd movieauthservice
source ./env-variable.sh
mvn clean package
cd ..
