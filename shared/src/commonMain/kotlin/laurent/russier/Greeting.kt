package laurent.russier

import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking

class Greeting {
    private val platform: Platform = getPlatform()

    fun greet(): String {
        runBlocking {
            fakeDelay()
        }
        return "Hello, ${platform.name}!"
    }

    suspend fun fakeDelay() {
        delay(100)
        println("lolo delay 100")
    }
}