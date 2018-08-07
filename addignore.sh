#!/usr/bin/env bash

echo "nbproject/private/
build/
nbbuild/
dist/
nbdist/
.nb-gradle/" > .gitignore

git ls-files -ci --exclude-standard -z | xargs -0 git rm --cached
