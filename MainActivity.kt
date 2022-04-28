package com.denizhan.hesapmakinesi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_main.*
import android.widget.TextView.BufferType


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



       // val inputt1 = editTextNumber.getText()
       // val inputt2 = inputt1.to()

        //val inputt3 = editTextNumber2.getText()
       // val inputt4 = inputt3.to(Int)

        //val editText = findViewById<EditText>(R.id.editTextNumber)
        //println(editText)



        //val editTextValue = editText.text

        button12.setOnClickListener{
            var deger1 = sayi1.text.toString().toLong()
            var deger2 = sayi2.text.toString().toLong()
            var toplamaSonucu = toplamaSetOn(aa = deger1 , bb = deger2)
            textView2.text = "${toplamaSonucu}"
        }

        button13.setOnClickListener{
            var deger3 = sayi1.text.toString().toLong()
            var deger4 = sayi2.text.toString().toLong()
            var cikarmaSonucu = cikarmaSetOn(aa = deger3 , bb = deger4)
            textView2.text = "${cikarmaSonucu}"
        }

        button14.setOnClickListener{
            var deger1 = sayi1.text.toString().toLong()
            var deger2 = sayi2.text.toString().toLong()
            var carpmaSonucu = carpmaSetOn(aa = deger1 , bb = deger2)
            textView2.text = "${carpmaSonucu}"
        }

        button15.setOnClickListener{
            var deger1 = sayi1.text.toString().toLong()
            var deger2 = sayi2.text.toString().toLong()
            var bolmeSonucu = bolmeSetOn(aa = deger1 , bb = deger2)
            textView2.text = "${bolmeSonucu}"
        }

       // button12.setOnClickListener{
         //   var toplamaSonucu = toplamaSetOn(aa = 2000 , bb = 5000)
        //    textView2.text = "Sonuc ${toplamaSonucu}"
      //  }

       // button13.setOnClickListener{
         //   var cikarmaSonucu = cikarmaSetOn(aa = 2000 , bb = 5000)
          //  textView2.text = "Sonuc ${cikarmaSonucu}"
       // }

       // button14.setOnClickListener{
          //  var carpmaSonucu = carpmaSetOn(aa = 2000 , bb = 5000)
         //   textView2.text = "Sonuc ${carpmaSonucu}"
       // }

      //  button15.setOnClickListener{
      //      var bolmeSonucu = bolmeSetOn(aa = 2000 , bb = 5000)
       //     textView2.text = "Sonuc ${bolmeSonucu}"
      // }




    }

    fun toplamaSetOn(aa: Long, bb: Long) : Long{
        return aa + bb
    }

    fun bolmeSetOn(aa : Long , bb : Long) : Long{
        return aa / bb
    }

    fun carpmaSetOn(aa : Long , bb : Long) : Long{
        return aa * bb
    }

    fun cikarmaSetOn(aa : Long , bb : Long) : Long{
        return aa - bb
    }


}
