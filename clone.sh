set -e

REPO_NAME=java-blank-gradle

git clone https://github.com/Egga/$REPO_NAME $1
cd $REPO_NAME
gradle idea
