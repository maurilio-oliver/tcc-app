package br.com.unip.tcc.app

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)

        val intent = Intent(this, InfoProdutoActivity::class.java)

        startActivity(intent)


    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val id = item.itemId
        if (id == R.id.menu_login) {
            startActivity(Intent(this, LoginActivity::class.java))
            return true
        } else if (id == R.id.menu_cadastro) {
            startActivity(Intent(this, CadastroActivity::class.java))
            return true
        } else if (id == R.id.menu_perfil) {
            //startActivity(Intent(this, ::class.java))
            return true
        } else if (id == R.id.menu_sobre) {
            //startActivity(Intent(this, ::class.java))
            return true
        }
        return super.onOptionsItemSelected(item)
    }
}