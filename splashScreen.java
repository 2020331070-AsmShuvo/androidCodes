package com.example.myapplication

import android.content.Intent
import android.os.AsyncTask
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.myapplication.ui.theme.MyApplicationTheme

class SpwithLoadingActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_spwith_loading)
        startSpalash();
    }
    private fun startSpalash(){
        SplashScreen().execute();
    }

    private open inner class SplashScreen : AsyncTask<String?, Void?, String?>() {
        override fun doInBackground(vararg p0: String?): String? {
            for( i in 1..6)
            {
                try{
                    Thread.sleep(1000)
                }
                catch (e: Exception)
                {
                    Thread.interrupted()
                }
            }
            return "Stephenn"
        }

        override fun onPostExecute(result: String?){
            super.onPostExecute(result)
            val x = Intent(this@SpwithLoadingActivity, MainActivity::class.java)
            startActivity(x)
        }
    }
}
