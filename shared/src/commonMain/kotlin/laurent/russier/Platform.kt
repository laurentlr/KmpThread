package laurent.russier

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform