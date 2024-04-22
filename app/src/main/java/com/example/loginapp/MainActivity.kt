package com.example.loginapp

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    lateinit var usernameInput : EditText
    lateinit var passwordInput : EditText
    lateinit var loginBtn : Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

            usernameInput = findViewById(R.id.username_input)
            passwordInput = findViewById(R.id.password_input)
            loginBtn = findViewById(R.id.login_btn)


            loginBtn.setOnClickListener{
                val username = usernameInput.text.toString()
                var password = passwordInput.text.toString()
                Log.i("test Credentials","Username: $username and Password : $password"  )


//                    dito ako natuwa kasi, nachecheck sa logcat kapag yung username and password
//                    is tama, kaya natutuwa ako heheheh

                // sir, aamin po ako na nanood po ako sa youtube, pero po hindi ko po basta kinopya
                // o ginaya yung mga nandon, inaral ko po siya and natuwa po ako kasi na apply ko po
                // lahat ng mga binigay niyo na activity. kung hindi ko po ala, yung mga basic na
                // tinuro mo po, possible po na hindi ko po maiintindihan yung pinapanood ko po sa
                // youtube yun lang po sir, heheh thank you po!!

            }
        }
    }
