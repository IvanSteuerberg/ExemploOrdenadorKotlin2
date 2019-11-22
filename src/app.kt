import java.util.*

//@author irodriguezsteuerberg
/**
 * Main class ExampleComputer
 *
 * @author irodriguezsteuerberg
 */

    fun main(args: Array<String>) {
    var miComputadora=Computer2(Cpu2(),Mouse2(),Screen2())
    println(miComputadora.toString())
    println("Mi computadora tiene ${miComputadora.cpu.memoria} TB de memoria SSD y " +
            "${miComputadora.cpu.velocidad} Mhz de velocidad")
    var ratonSorpresa=Mouse2("Ay")
    println(ratonSorpresa.tipo)
    var miComp=Computer2(Cpu2(),Mouse2(),Screen2())
    println(miComp.toString())
    miComp.memoriaRam=16
    println("${miComp.memoriaRam} GB de RAM")
    println("Fin de la cita")
/*      println("Esto es una app")
        var mouseA=Mouse()
        println("MouseA es "+mouseA.type)
        var mouseB=Mouse("inalambrico")
        println("MouseB es "+mouseB.type)
        mouseA.type="Bluetooth"
        println("MouseA ahora es ${mouseA.type}")
        val miPantalla=Screen2()
        println("miPantalla es ${miPantalla.marca}")
        val sc = Scanner(System.`in`)
        println("Introduce o tipo de rato:")
        val type = sc.next()
        println("Introduce a marca da pantalla:")
        val brand = sc.next()
        println("Introduce as pulgadas:")
        val inches = sc.nextFloat()
        println("Introduce a velocidade do procesador (en MHz):")
        val speed = sc.nextInt()
        println("Introduce a memoria do procesador (en GB):")
        val memory = sc.nextInt()
        val mouse = Mouse(type)
        val screen = Screen(brand, inches)
        val cpu = Cpu(speed, memory)
        val pc = Computer(mouse, cpu, screen)
        pc.see() */
    }
