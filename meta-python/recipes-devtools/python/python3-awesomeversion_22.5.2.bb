DESCRIPTION = "One version package to rule them all, One version package to find them, One version package to bring them all, and in the darkness bind them."
HOMEPAGE = "https://pypi.org/project/awesomeversion/"
SECTION = "devel/python"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENCE.md;md5=92622b5a8e216099be741d78328bae5d"

SRC_URI[sha256sum] = "051f89efd8ba0b157fb516bda5e1dad4d63f87e8f9c0c148930023d984fce62f"

RDEPENDS:${PN} += "python3-profile python3-logging"

inherit pypi setuptools3
