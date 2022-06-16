package dev.shamy.calculator2ass

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class MainActivity : AppCompatActivity() {
    lateinit var etFirsNum:TextInputEditText
    lateinit var tilFirsNum:TextInputLayout
    lateinit var etSecNum:TextInputEditText
    lateinit var tilSecNum:TextInputLayout
    lateinit var btnAddMe:Button
    lateinit var btnSubMe:Button
    lateinit var btnModuMe:Button
    lateinit var btnDivMe:Button
    lateinit var tvAnsMe:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        etFirsNum=findViewById(R.id.etFirsNum)
        tilFirsNum=findViewById(R.id.tilFirsNum)
        etSecNum=findViewById(R.id.etSecNum)
        tilSecNum=findViewById(R.id.tilSecNum)
        btnAddMe=findViewById(R.id.btnAddMe)
        btnSubMe=findViewById(R.id.btnSubMe)
        btnModuMe=findViewById(R.id.btnModuMe)
        btnDivMe=findViewById(R.id.btnDivMe)
        tvAnsMe=findViewById(R.id.tvAnsMe)

        btnAddMe.setOnClickListener {
            var a=etFirsNum.text.toString().toDouble()
            var b=etSecNum.text.toString().toDouble()
//            if (etFirsNum.isBlank())

            add(a.toString().toDouble(),b.toString().toDouble())
            if (etFirsNum.toString().isBlank()){
                tilFirsNum.error="Enter a number"


            }
            if (etSecNum.toString().isBlank()){
                tilSecNum.error="Enter a number"
            }



//            if (){
//                tilFirsNum="Enter a first Number"
//            }


        }
        btnSubMe.setOnClickListener {
            var a=etFirsNum.text.toString().toDouble()
            var b=etSecNum.text.toString().toDouble()
            if (etFirsNum.toString().isBlank()){
                tilFirsNum.error="Enter a number"


            }
            if (etSecNum.toString().isBlank()){
                tilSecNum.error="Enter a number"
            }
            subb(a.toString().toDouble(),b.toString().toDouble())

        }
        btnDivMe.setOnClickListener {
            var a=etFirsNum.text.toString().toDouble()
            var b=etSecNum.text.toString().toDouble()
            divide(a.toString().toDouble(),b.toString().toDouble())
            if (etFirsNum.toString().isBlank()){
                tilFirsNum.error="Enter a number"


            }
            if (etSecNum.toString().isBlank()){
                tilSecNum.error="Enter a number"
            }
        }
        btnModuMe.setOnClickListener {
            var a =etFirsNum.text.toString().toDouble()
            var b=etSecNum.text.toString().toDouble()
            moduling(a.toString().toDouble(),b.toString().toDouble())
            if (etFirsNum.toString().isBlank()){
                tilFirsNum.error="Enter a number"


            }
            if (etSecNum.toString().isBlank()){
                tilSecNum.error="Enter a number"
            }

        }

    }
    //create functon and pass in two parameters each double
    //create variable to hold the two inputs
    //create variable for adding the two of them
    //display answer in the tv
    fun add(a:Double,b:Double){
        var a=etFirsNum.text.toString().toDouble()
        var b=etSecNum.text.toString().toDouble()
//        if (a.isBl)
        var adds=a+b
        tvAnsMe.text=adds.toString()

    }
    fun subb(a:Double,b: Double){
        var a=etFirsNum.text.toString().toDouble()
        var b=etSecNum.text.toString().toDouble()
        var subtract=a-b
        tvAnsMe.text=subtract.toString()

    }
    fun divide(number1:Double,Number2: Double){
        var number1=etFirsNum.text.toString().toDouble()
        var number2=etSecNum.text.toString().toDouble()
        var dividing=number1/number2
        tvAnsMe.text=dividing.toString()


    }
    fun moduling(a:Double,b: Double){
        var a =etFirsNum.text.toString().toDouble()
        var b=etSecNum.text.toString().toDouble()
        var modulus=a%b
        tvAnsMe.text=modulus.toString()
        if (a.toString().isBlank()){
            tilFirsNum.error="Enter a number"
        }

        if (b.toString().isBlank()){
            tilSecNum.error="Enter a number"
        }




    }


}