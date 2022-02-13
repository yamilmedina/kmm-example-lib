package dev.yamil.kmmexamplelib

class Greeting {
    fun greeting(): String {
        return "Hello, ${Platform().platform}!"
    }
}