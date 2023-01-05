package io.brule.mysticx

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform