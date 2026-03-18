SUMMARY = "Hello World"
DESCRIPTION = "Hello World!"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=a405b4e1272cfc1719897e523929a782"

SRC_URI = "git://github.com/florianhumblot/hello-world-c.git;protocol=https;branch=main"

# Modify these as desired
PV = "1.0+git"
SRCREV = "f41c4f7ca3de6fd115a78267ca6e56cd307e3a45"

S = "${WORKDIR}/git"

EXTRA_OEMAKE = "PREFIX=${prefix} CC='${CC}' CFLAGS='${CFLAGS}' DESTDIR=${D} LIBDIR=${libdir} INCLUDEDIR=${includedir} BUILD_STATIC=no"

do_configure () {
	# Specify any needed configure commands here
	:
}

do_compile () {
	# Specify compilation commands here
	:
}

do_install () {
	oe_runmake install
}

FILES:${PN} += "${bindir}"

BBCLASSEXTEND = "native"
