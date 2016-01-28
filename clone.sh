#!/usr/bin/env bash

set -e

REPO_NAME=java-blank-gradle

echo "What's the name of the directory to be created? Abort by pressing [ENTER]:"
read TARGET

if [ "$TARGET" == "" ]; then
  echo "Abort..."
  exit 1
fi


git clone https://github.com/Egga/$REPO_NAME $TARGET
cd $TARGET
./gradlew idea
