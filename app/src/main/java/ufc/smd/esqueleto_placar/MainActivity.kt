package ufc.smd.esqueleto_placar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import data.Placar

class MainActivity : AppCompatActivity() {
    var placar: Placar= Placar("Jogo Padrão","0x0", false)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun openConfig(v: View){
        val intent = Intent(this, ConfigActivity::class.java).apply{}
        intent.putExtra("placar", placar)
        startActivity(intent)

    }
    fun openPreviusGames(v: View){
        val intent = Intent(this, PreviousGamesActivity::class.java).apply{
            putExtra("placar", placar)
        }
        startActivity(intent)

    }
}