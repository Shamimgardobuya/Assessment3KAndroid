package dev.shamy.calculator2ass

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import dev.shamy.calculator2ass.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
   lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var binding = ActivityMainBinding.inflate(layoutInflater)   //used binding
        setContentView(binding.root)


    }
        fun handleClicks() {

            binding.btnAddMe.setOnClickListener {


            }
            binding.btnSubMe.setOnClickListener {

            }
            binding.btnDivMe.setOnClickListener {


            }


        binding.btnModuMe.setOnClickListener {


        }
    }

    data class Inputs (var num1: Double,var num2: Double)
    fun obtaininputs():Inputs?{
        var num1 =binding.etFirsNum.text.toString().toDouble()
        var num2=binding.etSecNum.toString().toDouble()
        var error=false
        if (num1.isBlank()){
            binding.tilFirsNum.error="Enter a number"
            error=true

        }
        if (num2.isBlank()){
            binding.tilSecNum.error="Enter a number"
            error=true

        }
        if (!error) {
            return  Inputs(num1.toDouble(),num2.toDouble())
        }
        return null
    }
    //create functon and pass in two parameters each double
    //create variable to hold the two inputs
    //create variable for adding the two of them
    //display answer in the tv
    fun add(inputs: Inputs?){

      if (inputs!=null){
          displayResult(inputs.num1+inputs.num2)
        }


    }
    fun subb(inputs: Inputs?){
       if(inputs!=null){
           displayResult(inputs.num1-inputs.num2)

       }

    }
    fun divide(inputs:Inputs?){
        if (inputs!=null){
            displayResult(inputs.num1/inputs.num2)
        }
//        var number1=etFirsNum.text.toString().toDouble()
//        var number2=etSecNum.text.toString().toDouble()
//        var dividing=number1/number2
//        tvAnsMe.text=dividing.toString()


    }
    fun moduling(inputs:Inputs?){
        if(inputs!=null){
          displayResult(inputs.num1%inputs.num2)
        }






    }
fun displayResult(result: Double){
    binding.tvAnsMe.text=result.toString()


}



}

private fun Double.isBlank(): Boolean {
return true
}


//private fun Double.isBlank(): Boolean {}



