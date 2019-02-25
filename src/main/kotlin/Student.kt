class Student (val english: Int, var math: Int) {

}

fun main () {
    val stu = Student (77, 88);
    //stu.english = 99;  //wrong
    stu.math = 90; //right!!
}