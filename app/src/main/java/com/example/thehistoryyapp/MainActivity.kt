package com.example.thehistoryyapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {


        //declare
        private lateinit var searchButton: Button
        private lateinit var resultTextView: TextView
        private lateinit var ageInput: EditText
        private lateinit var clearButton: Button

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main)

            //initialise
            searchButton = findViewById(R.id.searchbutton)
            clearButton = findViewById(R.id.clearbutton)
            ageInput = findViewById(R.id.ageInput)
            resultTextView = findViewById(R.id.resultTextView)

            searchButton.setOnClickListener {
                //create a variable of age to get value from user
                val age = ageInput.text.toString().toIntOrNull()

                if (age != null && age in 20..100) {
                    val FamousPeopleWhoDied = when (age) {
                        42 -> "Elvis Presley Elvis has been admitted into the Rock 'n' Roll, Country, Gospel, Rockabilly, and R&B Halls of Fame."
                        40 -> "John Lennon Songs by John Lennon, such as \"All You Need Is Love,\" were counterculture and anti-war anthems in the late 1960s."
                        49 -> "Kenneth Mitchell The Old Man: Mitchell's illness was integrated into the character when he was cast in the FX series The Old Man1.\n" +
                                "\n"
                        62 -> "Toby Keith On the Billboard Hot Country Songs charts, he has 61 singles, including 20 number one successes and 22 more top 10 hits1. "
                        94 -> "Sidney Poitier He became the first African American to win an Academy Award for Best Actor, shattering the color barrier in the American film business."
                        53 -> "Anna Heche Heche debuted as a professional actor in 1987 with the NBC soap series \"Another World.\""
                        99 -> "Betty white Prior to being well-known on television, White was a model, radio host, and performer."
                        78 -> "Wanda young She rose to stardom as a vocalist for the Marvelettes, an all-female Motown ensemble."
                        27 -> "Brian jones As a member of the Rolling Stones, he was inducted into the Rock and Roll Hall of Fame in 1989."
                        27 -> "Chris bell The life of Bell and the career of Big Star were chronicled in the 2013 documentary \"Big Star: Nothing Can Hurt Me.\""




                        else -> null
                    }
                    val message = if ( FamousPeopleWhoDied!= null) "The famous people name is $FamousPeopleWhoDied."
                    else "No employee found with the entered age."
                    resultTextView.text = message
1
                } else {
                    resultTextView.text = "Invalid input. Please enter a valid age between 20 and 100."
                }
            }

            clearButton.setOnClickListener {
                ageInput.text.clear()
                resultTextView.text = ""
            }
        }
}
