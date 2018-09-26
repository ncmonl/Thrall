package com.ncmon.thrall

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import com.ncmon.thrall.viewmodel.ViewModelActivity
import kotlinx.android.synthetic.main.activity_main.*
/**
 * @author ncmon on 2018/9/26
 */
class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onClick(v: View?) {
        if (v != null) when(v.id){
                R.id.view_model-> startActivity(Intent(this,ViewModelActivity::class.java))
            }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        view_model.setOnClickListener (this)
    }
}
