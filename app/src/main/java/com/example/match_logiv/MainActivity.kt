package com.example.match_logiv

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle



class MainActivity : AppCompatActivity() {

    class Patient ( val name : String, val answer_1 : String, val answer_2 : String, val answer_3 : String, val answer_4 : String)
    class Psycologist (val name : String, val answer_1 : String, val answer_2 : String, val answer_3 : String, val answer_4 : String)
    class Match (var name_patiet : String, var name_psycologist : String, var classification : Int)

    private var  patients = listOf(
        Patient("Nome 1", "A", "A", "B", "A"),
        Patient("Nome 2", "C", "B", "D", "B"),
        Patient("Nome 3", "D", "C", "E", "A"),
        Patient("Nome 4", "B", "A", "A", "D"),
    )

    private var  psycologists = listOf(
        Psycologist("Nome 1", "A", "A", "B", "A"),
        Psycologist("Nome 2", "C", "B", "D", "B"),
        Psycologist("Nome 3", "D", "C", "E", "A"),
        Psycologist("Nome 4", "B", "A", "A", "D"),
    )

    private var matchList = emptyList<Match>()



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }


    fun get_match(patient : Patient){
        var count_match : Int = 0
            count_match = 0
            var actual_match : Match? = null
            for(psycologist in psycologists){
                if(psycologist.answer_1 == patient.answer_1){
                    count_match++
                }
                else if(psycologist.answer_2 == patient.answer_2){
                    count_match++
                }
                else if(psycologist.answer_3 == patient.answer_3){
                    count_match++
                }
                else if(psycologist.answer_4 == patient.answer_4) {
                    count_match++
                }
                actual_match?.name_patiet = patient.name
                actual_match?.name_psycologist = psycologist.name
                actual_match?.classification = count_match
            }
        if (actual_match != null) {
            matchList.toMutableList().add(actual_match)
        }
        }
}

