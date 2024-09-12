/*
DELA CALZADA, Rykiel Louizze D.
September 9, 2024

Practice Activity 0 - Kotlin Basics
 */

fun main() {
    println(
        """
                                                       __ 
             _ _ _ _____ __    _____ _____ _____ _____|  |
            | | | |   __|  |  |     |     |     |   __|  |
            | | | |   __|  |__|   --|  |  | | | |   __|__|
            |_____|_____|_____|_____|_____|_|_|_|_____|__|
            
              ╭━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━╮
              ┃  SELECT AN OPTION FROM THE MENU BELOW  ┃
              ╰━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━╯
            """.trimIndent()
    )

    while (true) {
        println()
        println(
            """
            ╭──────────────────── MENU ───────────────────╮
            │ [1] Convert Pounds to Kilograms             │
            │ [2] Convert Miles to Kilometers             │
            │ [3] Convert Fahrenheit to Celsius           │       
            │ [4] Calculate the Average Age of 10 Students│
            │ [5] Create a Story                          │
            │ [6] Exit                                    │
            ╰─────────────────────────────────────────────╯
            """.trimIndent())

        println("─────────────────────────────────────────────")
        print("Enter your choice: ")

        when (readlnOrNull()) {
            "1" -> {
                println(
                    """
                        ─────────────────────────────────────────────
                         ╭─────────────────────────────────────────╮
                         │      Pounds to Kilograms Converter      │
                         ╰─────────────────────────────────────────╯
                    """.trimIndent()
                )
                print("Weight in pounds (lbs): ")
                val pounds = readlnOrNull()?.toDoubleOrNull() ?: 0.0
                val kilograms = pounds * 0.453592
                println("Weight in kilograms (kg): $kilograms")
                println("─────────────────────────────────────────────")
            }

            "2" -> {
                println(
                    """
                        ─────────────────────────────────────────────
                         ╭─────────────────────────────────────────╮
                         │      Miles to Kilometers Converter      │
                         ╰─────────────────────────────────────────╯
                    """.trimIndent()
                )
                print("Length in miles (mi): ")
                val miles = readlnOrNull()?.toDoubleOrNull() ?: 0.0
                val kilometers = miles * 1.60934
                println("Length in kilometers (km): $kilometers")
                println("─────────────────────────────────────────────")
            }

            "3" -> {
                println(
                    """
                        ─────────────────────────────────────────────
                         ╭─────────────────────────────────────────╮
                         │     Fahrenheit to Celsius Converter     │
                         ╰─────────────────────────────────────────╯
                    """.trimIndent()
                )
                print("Temperature in Fahrenheit (°F): ")
                val fahrenheit = readlnOrNull()?.toDoubleOrNull() ?: 0.0
                val celsius = (fahrenheit - 32) * 5 / 9
                println("Temperature in Celsius (°C): $celsius")
                println("─────────────────────────────────────────────")
            }

            "4" -> {
                println(
                    """
                        ─────────────────────────────────────────────
                         ╭─────────────────────────────────────────╮
                         │       Average Age of 10 Students        │
                         ╰─────────────────────────────────────────╯
                    """.trimIndent()
                )
                val studentAges = mutableListOf<Int>()
                for (i in 1..10) {
                    print("Age of student $i: ")
                    val age = readlnOrNull()?.toIntOrNull() ?: 0
                    studentAges.add(age)
                }
                val averageAge = studentAges.average()
                println("Student Ages: $studentAges")
                println("Average Age: $averageAge")
                println("─────────────────────────────────────────────")
            }

            "5" -> {
                println(
                    """
                        ─────────────────────────────────────────────
                         ╭─────────────────────────────────────────╮
                         │             Create a Story              │
                         ╰─────────────────────────────────────────╯
                    """.trimIndent()
                )
                println("─────────────────────────────────────────────")
                print("Enter a male name: ")
                val maleName = readlnOrNull() ?: "Unknown"
                print("Enter the name of your favorite teacher: ")
                val favoriteTeacher = readlnOrNull() ?: "Unknown"
                print("Enter an exclamation: ")
                val exclamation = readlnOrNull() ?: "Wow"
                print("Enter a number: ")
                val number = readlnOrNull() ?: "0"
                print("Enter plural objects: ")
                val pluralObjects = readlnOrNull() ?: "objects"
                print("Enter a store name: ")
                val storeName = readlnOrNull() ?: "Store"
                print("Enter a body part: ")
                val bodyPart = readlnOrNull() ?: "hand"
                print("Enter a silly word: ")
                val sillyWord = readlnOrNull() ?: "silly"
                print("Enter a name of a holiday: ")
                val holiday = readlnOrNull() ?: "Holiday"
                print("Enter a celebrity name: ")
                val celebrityName = readlnOrNull() ?: "Celebrity"
                print("Enter a movie title: ")
                val movieTitle = readlnOrNull() ?: "Movie"
                print("Enter a verb ending in -ing: ")
                val verbIng = readlnOrNull() ?: "running"
                print("Enter an amount of distance: ")
                val distance = readlnOrNull() ?: "10 meters"
                print("Enter a country: ")
                val country = readlnOrNull() ?: "Country"
                print("Enter an object: ")
                val objectItem = readlnOrNull() ?: "object"
                print("Enter an occupation: ")
                val occupation = readlnOrNull() ?: "occupation"
                print("Enter an animal: ")
                val animal = readlnOrNull() ?: "animal"
                print("Enter a famous movie quote: ")
                val movieQuote = readlnOrNull() ?: "quote"
                print("Enter another body part: ")
                val bodyPart2 = readlnOrNull() ?: "body part"
                print("Enter a children’s song: ")
                val childrenSong = readlnOrNull() ?: "song"
                print("Enter an adjective: ")
                val adjective = readlnOrNull() ?: "adjective"

                val story = """
                    DETECTIVE: Hello. I’m Detective $maleName. And, you are…
                    SUSPECT: $favoriteTeacher
                    DETECTIVE: You are here today under suspicion of second degree robbery.
                    SUSPECT: $exclamation!
                    DETECTIVE: That’s right. $number $pluralObjects were stolen from $storeName and the crime scene has your $bodyPart written ALL over it.
                    SUSPECT: That is $sillyWord.
                    DETECTIVE: Where were you on the night of $holiday?
                    SUSPECT: I was with $celebrityName. We were watching the movie $movieTitle.
                    DETECTIVE: Then why does security camera footage show you $verbIng just $distance away from the crime scene?
                    SUSPECT: That’s a coincidence.
                    DETECTIVE: Alright, I’m through playing games. Where are you from?
                    SUSPECT: $country.
                    DETECTIVE: What did your parents do for a living?
                    SUSPECT: My father was a $objectItem salesman and my mother was a $occupation.
                    DETECTIVE: Did they teach you to steal?
                    SUSPECT: No. I told you didn't do it!
                    DETECTIVE: That’s enough! One of the best parts about being a detective is that I get to lock up criminals like you, and go home to my children and my pet $animal and say, "$movieQuote"
                    SUSPECT: Fine, I did it. I committed the robbery. But I only did it because I needed the money to buy myself $bodyPart2 implants.
                    DETECTIVE: I knew it all along. And every time I solve a crime, I sing my favorite song, $childrenSong.
                    SUSPECT: You have a $adjective voice.
                """.trimIndent()
                println(story)
                println("─────────────────────────────────────────────")

            }

            "6" -> {
                println("""
                    ──────────────────────────────────────────────
                          THANK YOU FOR USING THE PROGRAM.
                                                               __                     
                     _____ _____ _____ ____  _____ __ __ _____|  |
                    |   __|     |     |    \| __  |  |  |   __|  |
                    |  |  |  |  |  |  |  |  | __ -|_   _|   __|__|
                    |_____|_____|_____|____/|_____| |_| |_____|__|
                """.trimIndent())
                break
            }

            else -> {
                println("Invalid choice. Please select a valid option.")
            }
        }
    }
}
