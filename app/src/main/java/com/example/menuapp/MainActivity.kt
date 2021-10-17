package com.example.menuapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {

        menuInflater.inflate(R.menu.item_list,menu)
        return super.onCreateOptionsMenu(menu)

    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
when(item.itemId){
    R.id.home -> {
        val i = Intent(this, MainActivity::class.java)
        startActivity(i)
        Toast.makeText(this, "This is Home Activity", Toast.LENGTH_SHORT).show()
        return true
    }
    R.id.help-> {
        val i = Intent(this, MainActivity2::class.java)
        startActivity(i)
        Toast.makeText(this, "This is Help Activity", Toast.LENGTH_SHORT).show()
        return true
    }
    R.id.about ->{
        val i = Intent(this,MainActivity3::class.java)
        startActivity(i)
        Toast.makeText(this, "This is About Activity", Toast.LENGTH_SHORT).show()
        return true
    }

}
        return onOptionsItemSelected(item)
    }
}