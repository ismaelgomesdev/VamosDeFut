package ufc.smd.esqueleto_placar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import data.Placar

class PlacarActivity : AppCompatActivity() {
    lateinit var placar:Placar
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_placar)

    }
}