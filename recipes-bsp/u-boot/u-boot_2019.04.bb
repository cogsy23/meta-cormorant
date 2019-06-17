require recipes-bsp/u-boot/u-boot.inc

DEPENDS += "bc-native dtc-native"

HOMEPAGE = "http://www.denx.de/wiki/U-Boot/WebHome"
SECTION = "bootloaders"
DEPENDS += "flex-native bison-native"

LICENSE = "GPLv2+"
LIC_FILES_CHKSUM = "file://Licenses/README;md5=30503fd321432fc713238f582193b78e"
PE = "1"

SRCREV = "5307b0fc600980821767a866fd6ac9e5df030c47"
SRC_URI = "git://github.com/cogsy23/u-boot-cormorant.git;branch=cormorant-bsp"

S = "${WORKDIR}/git"
