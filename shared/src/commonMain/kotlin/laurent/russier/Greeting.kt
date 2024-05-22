package laurent.russier

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.IO
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.withContext

class Greeting {
    private val platform: Platform = getPlatform()

    fun greet(): String {
        runBlocking {
            withContext(Dispatchers.Default) {
                fakeDelay()
            }
        }
        return "Hello, ${platform.name}!"
    }

    suspend fun fakeDelay() {
        delay(1000)
        println("lolo delay 1000")
    }
}