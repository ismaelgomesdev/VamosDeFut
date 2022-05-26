package ufc.smd.esqueleto_placar

import android.Manifest
import android.content.Context
import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import data.UIEducacionalPermissao
class PermissionActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_permission)
    }
    fun ligar(v: View){
        ligarFunc("tel:85999999999")
       /*

        if ((ContextCompat.checkSelfPermission(this, android.Manifest.permission.CALL_PHONE)
                    == PackageManager.PERMISSION_GRANTED)
        ) {
            Log.v("SMD", "Tenho permissão")
        } else {
            if (shouldShowRequestPermissionRationale(Manifest.permission.CALL_PHONE)) {
                Log.v("SMD", "Primeira Vez")
                val mensagem =
                    "Nossa aplicação precisa acessar o telefone para discagem automática. Uma janela de permissão será solicitada"
                val titulo = "Permissão de acesso a chamadas"
                val codigo = 1
                val mensagemPermissao = UIEducacionalPermissao(mensagem, titulo, codigo)
                mensagemPermissao.onAttach(this as Context)
                mensagemPermissao.show(supportFragmentManager, "primeiravez2")
            } else {
                val mensagem =
                    "Nossa aplicação precisa acessar o telefone para discagem automática. Uma janela de permissão será solicitada"
                val titulo = "Permissão de acesso a chamadas II"
                val codigo = 1
                val mensagemPermissao = UIEducacionalPermissao(mensagem, titulo, codigo)
                mensagemPermissao.onAttach(this as Context)
                mensagemPermissao.show(supportFragmentManager, "segundavez2")
                Log.v("SMD", "Outra Vez")
            }
        }*/
    }

    fun ligarFunc (numeroCall:String){
        val uri = Uri.parse(numeroCall)
        //   Intent itLigar = new Intent(Intent.ACTION_DIAL, uri);
        val itLigar = Intent(Intent.ACTION_CALL, uri)
        startActivity(itLigar)
    }


    /*
    override fun onRequestPermissionsResult(requestCode: Int,
                                            permissions: Array<String>, grantResults: IntArray) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)

        when (requestCode) {
        2222 -> if (grantResults[0] == PackageManager.PERMISSION_GRANTED) {
            Toast.makeText(this, "VALEU", Toast.LENGTH_LONG).show()
            val uri = Uri.parse(numeroCall)
            //   Intent itLigar = new Intent(Intent.ACTION_DIAL, uri);
            val itLigar = Intent(Intent.ACTION_CALL, uri)
            startActivity(itLigar)
        } else {
            Toast.makeText(this, "SEU FELA!", Toast.LENGTH_LONG).show()
            val mensagem =
                "Seu aplicativo pode ligar diretamente, mas sem permissão não funciona. Se você marcou não perguntar mais, você deve ir na tela de configurações para mudar a instalação ou reinstalar o aplicativo  "
            val titulo = "Porque precisamos telefonar?"
            val mensagemPermisso = UIEducacionalPermissao(mensagem, titulo, 2)
            mensagemPermisso.onAttach(this as Context?)
            mensagemPermisso.show(getSupportFragmentManager(), "segundavez")
        }
    }
}*/
}