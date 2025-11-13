fun main() {
//    val weapon = Weapon()
//    weapon.showInfo()

//    val student = Student("Денис", 18)
//    student.introduce()
//    student.haveBirthday()

    val student1 = Student("Иван", 19)
    val student2 = Student("Денис", 20)

    val group = Group("ИСП-231")

    group.addStudent(student1)
    group.addStudent(student2)

    group.listStudents()

    group.celebrateBirthdays()

    group.listStudents()
}