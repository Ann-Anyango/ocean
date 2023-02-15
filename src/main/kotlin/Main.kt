import javax.lang.model.element.Name

fun main() {
    school("AkiraChix")
   println(person("Ann",20))
    println( length("Anyango"))
    who("Ann")



}

fun  school(name: String){

    println(name[0])
    println(name[2])
    println(name[3])

}
 fun person(name: String,age:Int):String {

     return  "Hi, my name is $name and i am $age years old"

 }
 fun length (name: String):Int{
     return name.length
 }
fun who (name: String){
    val Name="Ann"
    if (name==Name){
        println("That's me!")
    }
    else{
        println("Don't know who that is")
    }







}