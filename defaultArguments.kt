fun main(){
   val r=greet(name="Gee",age=19);
    val r2=greet(age=20);
   println(r);
    println(r2);
}
fun greet(name:String="hai",age:Int):String{
   return "$name\n$age"
}
