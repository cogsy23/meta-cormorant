FILESEXTRAPATHS_prepend := "${THISDIR}/files:"

SRC_URI_append = " \
        file://defconfig \
        file://config.h \
        "

do_copy_configs () {
        cp ${WORKDIR}/defconfig ${S}/configs/${UBOOT_MACHINE}
        cp ${WORKDIR}/config.h ${S}/include/configs/${MACHINE}.h
}

addtask do_copy_configs after do_patch before do_configure
