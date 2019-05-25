include recipes-bsp/u-boot/u-boot-common.inc
include recipes-bsp/u-boot/u-boot.inc

LIC_FILES_CHKSUM = "file://COPYING;md5=4c6cde5df68eff615d36789dc18edd3b"

SRCREV = "0de06cfb7051f663d02912e5cb081348cc1ffbe5"
SRC_URI = "git://github.com/EmcraftSystems/u-boot.git;protocol=https;branch=linux-cortexm-2.3.2"

DEPENDS += "libgcc newlib"

SRC_URI += "file://0001-HACKS.patch"

do_configure() {
	oe_runmake -C ${S} O=${B} ${UBOOT_MACHINE}
}

do_compile() {
	unset LDFLAGS
	oe_runmake -C ${S} O=${B} ${UBOOT_MAKE_TARGET} ${B}/u-boot.hex
}
