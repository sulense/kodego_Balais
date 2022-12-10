package activity01_f

import mu.KotlinLogging

private val logger = KotlinLogging.logger {}
fun main() {
    var input1 = readLine().toString()
    var input2 = readLine().toString()

    for(x in input1){
        if(x !in input2){
            logger.info{x}
        }
    }

    for(x in input2) {
        if (x !in input1) {
            logger.info { x }
        }
    }
}