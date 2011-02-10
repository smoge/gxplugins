#!/bin/bash

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
    SC_SOURCE_DIR=/home/smoge/src/sc34/SuperCollider-Source/common \
    BUILD_DIR=./GXPlugins

rm ./GXPlugins/valve.h
rm ./GXPlugins/*.cc

