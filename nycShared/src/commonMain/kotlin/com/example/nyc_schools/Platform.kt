package com.example.nyc_schools

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform