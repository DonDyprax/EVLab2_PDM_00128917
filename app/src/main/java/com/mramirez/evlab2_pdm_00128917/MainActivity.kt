package com.mramirez.evlab2_pdm_00128917

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.mramirez.evlab2_pdm_00128917.Fragments.DynamicImageFragment
import com.mramirez.evlab2_pdm_00128917.Fragments.StaticImageFragment

class MainActivity : AppCompatActivity(), StaticImageFragment.OnFragmentInteractionListener {
    var pos = 0

    override fun onClick(click: String) {
        Toast.makeText(this@MainActivity, click, Toast.LENGTH_LONG).show()


        if(click == "left") {
            if(pos == 0) {
                pos = 2
                supportFragmentManager.beginTransaction().replace(R.id.flImage, DynamicImageFragment.newInstance("left")).commit()
            }

            if(pos == 1) {
                pos = 0
                supportFragmentManager.beginTransaction().replace(R.id.flImage, DynamicImageFragment.newInstance("left")).commit()
            }

            if(pos == 2) {
                pos = 1
                supportFragmentManager.beginTransaction().replace(R.id.flImage, DynamicImageFragment.newInstance("left")).commit()
            }
        }

        if(click == "right") {
            if(pos == 0) {
                pos = 1
                supportFragmentManager.beginTransaction().replace(R.id.flImage, DynamicImageFragment.newInstance("left")).commit()
            }

            if(pos == 1) {
                pos = 2
                supportFragmentManager.beginTransaction().replace(R.id.flImage, DynamicImageFragment.newInstance("left")).commit()
            }

            if(pos == 2) {
                pos = 3
                supportFragmentManager.beginTransaction().replace(R.id.flImage, DynamicImageFragment.newInstance("left")).commit()
            }

        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager.beginTransaction().replace(R.id.flImage, DynamicImageFragment.newInstance("none")).commit()
    }



}
