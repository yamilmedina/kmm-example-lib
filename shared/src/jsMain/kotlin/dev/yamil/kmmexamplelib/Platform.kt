package dev.yamil.kmmexamplelib

actual class Platform actual constructor() {

    actual val platform: String
        get() = kotlinx.browser.window.navigator.userAgent
}
