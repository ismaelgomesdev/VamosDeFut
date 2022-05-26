package ufc.smd.esqueleto_placar

import adapters.CustomAdapter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import data.Placar
import java.text.SimpleDateFormat
import java.util.*
import kotlin.collections.ArrayList

class PreviousGamesActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_previous_games)

        // Trazendo o Recycler View
        val recyclerview = findViewById<RecyclerView>(R.id.rcPreviousGames)

        // Tipo de Layout Manager será Linear
        recyclerview.layoutManager = LinearLayoutManager(this)

        // O ArrayList de Placares
        val data = ArrayList<Placar>()

       // val date = Calendar.getInstance().time
       // var dateTimeFormat = SimpleDateFormat("dd/MM/yy HH:mm:ss", Locale.getDefault())
       // val data_hora = dateTimeFormat.format(date)



        //Criando 10 Placares
        for (i in 1..10) {
            val date = Calendar.getInstance().time
            var dateTimeFormat = SimpleDateFormat("dd/MM/yy HH:mm:ss", Locale.getDefault())
            val data_hora = dateTimeFormat.format(date)
            data.add(Placar("Jogo "+i,""+i+"x"+i," O jogo foi 4x4 em "+data_hora+"h",true))
        }

        // ArrayList enviado ao Adapter
        val adapter = CustomAdapter(data)

        // Setando o Adapter no Recyclerview
        recyclerview.adapter = adapter

    }
}
