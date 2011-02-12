#!/bin/bash

usage()
{
cat << EOF
usage: $0 -s [-p]

OPTIONS:
-s|--scdir	Path to SuperCollider source directory
-p|--prefix	Installation prefix (/usr/local)
EOF
}

SCDIR=""
PREFIX="/usr/local"

while [[ $1 == -* ]]; do
    case "$1" in
      -h|--help|-\?) usage; exit 0;;
      -s|--scdir) if (($# > 1)); then
            SCDIR=$2; shift 2
          else
            echo "-s|--scdir requires an argument" 1>&2
            exit 1
          fi ;;
      -p|--prefix) if (($# > 1)); then
            PREFIX=$2; shift 2
          else
            echo "-p|--prefix requires an argument" 1>&2
            exit 1
          fi ;;
      -*) echo "invalid option: $1" 1>&2; usage; exit 0;;
    esac
done


if [[ -z "$SCDIR" ]]
then
    echo "ERROR: you didn't specify your SC source directory"
	usage; exit 0;
fi


rm -rf {gx_sc,GXPlugins}
mkdir -p {GXPlugins,gx_sc,gx,pkgdir}

cp ./valve.h *.cc ./GXPlugins


ls *.dsp | ./scbuilder \
	FAUST2SC=/usr/bin/faust2sc \
	FAUST2SC_PREFIX="GX" \
	BUILD_SC=yes \
	BUILD_XML=no \
	DESTDIR=./pkgdir \
	BUILD_DIR=./gx_sc \
	INSTALL_DIR=./gx \
	PREFIX=$PREFIX \
	SC_SOURCE_DIR=$SCDIR \
	BUILD_DIR=./GXPlugins

rm ./GXPlugins/valve.h
rm ./GXPlugins/*.cc

