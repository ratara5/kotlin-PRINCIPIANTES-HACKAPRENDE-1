fun main(args: Array<String>) {
    //1-4
    println("Hello World!")

    //5 OJO:En kotlin no es necesario mencionar el tipo de variable. poner f  para float y L para Long
    val age:Int=20 //resaltado amarillo: variable nunca es modificada y se puede dejar como fija
    var height:Double=1.80000
    var weight:Float=75.50000f
    var isWoman:Boolean=true
    var much:Long=4545554513L

    println(age)
    println(height)
    println(weight)
    println(isWoman)
    println(much)

    //6
    var name="Mariana"
    var nameLength=name.length;

    println(name)
    println(nameLength)

    var nameIsEmpty=name.isEmpty()

    println(nameIsEmpty)

    var nameContains=name.contains("Ma")

    println(nameContains)

    var mySubstring=name.substring(3,6)
    println(mySubstring)

    var myReplace=name.replace("a","o")
    println(myReplace)

    //7-8
    var description="Hola, soy $name, mido $height m, peso $weight kg y tengo $age años"
    println(description)

    var descriptionFormat=String.format("Hola, soy %s, mido %f m, peso %f kg y tengo %d años", name, height, weight,age)
    println(descriptionFormat)

    //11 'var' permite variable 'val' es fija
    val valFijo="valorFijo"
    //valFijo="intentoFallidoCambiarValorFijo"//
    var valVariable="valorVariable"
    valVariable="intentoExitosoCambiarValorVariable"


    //otro
    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")
}