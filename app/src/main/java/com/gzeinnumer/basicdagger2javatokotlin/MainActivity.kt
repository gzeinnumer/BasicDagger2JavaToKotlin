package com.gzeinnumer.basicdagger2javatokotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

//todo 10 ubah extend bagian ini jadi BaseActivity
class MainActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //todo 11
        Log.d("MYZEIN", "onCreate: Before " + preft.getInt("Number", 0))

        preft.edit().putInt("Number", 6).apply()

        Log.d("MYZEIN", "onCreate: After " + preft.getInt("Number", 0))

        //todo 12
//        textView.setBackgroundColor(context.getResources().getColor(android.R.color.holo_red_dark));
        //todo 13
        //komentarkan todo12 dan buat stp todo14, untuk pelamahamn lebih tentang dagger
        //liat pada AppModul dan BaseActivity

        //todo 15
        //kamu bsa panggil dengan cara ini
        textView.setBackgroundColor(res.getColor(android.R.color.holo_red_dark))

    }
}
