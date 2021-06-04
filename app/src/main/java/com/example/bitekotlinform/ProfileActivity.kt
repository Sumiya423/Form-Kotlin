package com.example.bitekotlinform

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_profile.*

class ProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        val user: User? = intent.getParcelableExtra("user")
        if (user != null){
            profileImage.setImageURI(user.uri)
            nameText.text= user.name
            emailText.text= user.email
            if(user.gender=="Male"){
                genderText.text= user.gender
                genderImage.setImageResource(R.drawable.ic_male)
            }else{
                genderText.text= user.gender
                genderImage.setImageResource(R.drawable.ic_female)
            }

            dateText.text= user.date
            timeText.text= user.time
            bloodText.text= user.blood
            skillText.text= "Language Skills: \n"+"\n"+user.skill
        }
    }
}