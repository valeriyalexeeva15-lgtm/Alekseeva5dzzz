fun main() {
//    val weapon = Weapon()
//    weapon.showInfo()

//    val student = Student("Денис", 18)
//    student.introduce()
//    student.haveBirthday()

//    val student1 = Student("Иван", 19)
//    val student2 = Student("Денис", 20)
//
//    val group = Group("ИСП-231")
//
//    group.addStudent(student1)
//    group.addStudent(student2)
//
//    group.listStudents()
//
//    group.celebrateBirthdays()
//
//    group.listStudents()


    val calc = GeometryCalculator()

    println("=== ПРЯМОУГОЛЬНИКИ ===")
    calc.rectangleInfo(4, 5)
    println()
    calc.rectangleInfo(3, 6)
    println()

    println("=== ТРЕУГОЛЬНИКИ ===")
    calc.triangleInfo(3, 4, 5)
    println()
    calc.triangleInfo(5, 5, 5)
    println()
    calc.triangleInfo(2, 3, 4)
    println()

    println("=== ОКРУЖНОСТИ ===")
    calc.circleInfo(5)
    println()
    calc.circleInfo(10)
}