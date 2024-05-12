#!/bin/bash

usage()
{
cat << EOF


usage: $0 -s [-p]

OPTIONS:
-h|--help	Print this help
-s|--scdir	Path to SuperCollider source directory
-p|--prefix	Installation prefix (/usr/local)


EOF
}

# variables
SCDIR=""
PREFIX="/usr/local"
FAUST_SC=""

# command-line arguments
while [[ $1 == -* ]]; do
    case "${1}" in
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

# -s|--scdir is required
if [[ -z "${SCDIR}" ]]; then
    echo "Error: you didn't specify your SC source directory" >&2;
	usage; exit 1;
fi

# faust2sc is required
FAUST_SC=`type -p faust2sc` || { echo "Error: faust2sc is not found.">&2; exit 1; }

rm -rf {gx_sc,GXPlugins}
mkdir -p {GXPlugins,gx_sc,gx,pkgdir}

cp ./valve.h *.cc ./GXPlugins


ls *.dsp | ./scbuilder \
	FAUST2SC=$FAUST_SC \
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

