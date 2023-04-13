package activity03_a

//Note: Names are single word with no spaces example, "Marco", "Eugene", "Sarah", "Isaiah", "Anthony", "Henry".
//1. Create an ArrayList of names with 20 entries.
//2. Create a function "isStudentInRecord" that will accept a name and return true if the name is found, otherwise false.
//3. Create a function "addStudent" that will accept a name and add it to the ArrayList.
//4. Create a function "removeStudent"  that will accept a name and remove it from the ArrayList.
//5. Create a function "countStudent" that will return the size of the ArrayList.
//6. Create a function "searchStudentWildSearch" that will accept a String and search if that string is found with in the
// ArrayList, it will return an ArrayList of names that matched if there are.
//7. Create a function  "searchStudentName" that will accept a String and search if there is an exact match of the String
// input, it will return an ArrayList of names that matched if there are.
//8. Create a function "searchStudent" that will accept a String and call "searchStudentWildSearch" if the String input is
// less than or equal to three, and it will call "searchStudentName" if the String input is greater than three.
//9.  Create a function "showStudents" that will print all the entries in the ArrayList.


val names: ArrayList<String> = arrayListOf("Aria",
            "Bodhi",
            "Cai",
            "Dara",
            "Elsie",
            "Finn",
            "Gia",
            "Harper",
            "Iris",
            "Jaxon",
            "Kai",
            "Lila",
            "Maren",
            "Nova",
            "Odin",
            "Phoenix",
            "Quinn",
            "Reese",
            "Sawyer",
            "Teagan")

fun addStudent(name: String) {
        names.add(name)
    }

fun isStudentInRecord(name: String): Boolean {
        return names.contains(name)
    }

fun removeStudent(name: String) {
        names.remove(name)
    }

fun countStudent(): Int {
        return names.size
    }

fun searchStudentWildSearch(search: String): ArrayList<String> {
        val matches = ArrayList<String>()
        for (name in names) {
            if (name.contains(search)) {
                matches.add(name)
            }
        }
        return matches
    }

fun searchStudentName(search: String): ArrayList<String> {
        val matches = ArrayList<String>()
        for (name in names) {
            if (name == search) {
                matches.add(name)
            }
        }
        return matches
    }

fun searchStudent(search: String): ArrayList<String> {
        return if (search.length <= 3) {
            searchStudentWildSearch(search)
        } else {
            searchStudentName(search)
        }
    }

fun showStudents() {
        for (name in names) {
            println(name)
        }
    }

//fun main() {
//    var running = true
//
//    while (running) {
//        println("Welcome to Student Record Management System!")
//        println("1. Add a student")
//        println("2. Remove a student")
//        println("3. Search for a student")
//        println("4. Show all students")
//        println("5. Quit")
//
//        print("What do you want to do? ")
//        val choice = readLine()?.toIntOrNull()
//
//        when (choice) {
//            1 -> {
//                print("Enter student name: ")
//                val name = readLine()
//                if (name != null) {
//                    addStudent(name)
//                    println("$name has been added to the record.")
//                }
//            }
//            2 -> {
//                print("Enter student name: ")
//                val name = readLine()
//                if (name != null) {
//                    if (isStudentInRecord(name)) {
//                        removeStudent(name)
//                        println("$name has been removed from the record.")
//                    } else {
//                        println("$name is not in the record.")
//                    }
//                }
//            }
//            3 -> {
//                print("Enter search query: ")
//                val search = readLine()
//                if (search != null) {
//                    val matches = searchStudent(search)
//                    if (matches.isEmpty()) {
//                        println("No matches found.")
//                    } else {
//                        println("Matches:")
//                        for (match in matches) {
//                            println("- $match")
//                        }
//                    }
//                }
//            }
//            4 -> {
//                println("All students:")
//                showStudents()
//            }
//            5 -> {
//                println("Goodbye!")
//                running = false
//            }
//            else -> {
//                println("Invalid choice. Please choose again.")
//            }
//        }
//    }
//}
