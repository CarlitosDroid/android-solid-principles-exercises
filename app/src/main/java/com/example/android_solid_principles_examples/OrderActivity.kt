package com.example.android_solid_principles_examples

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_order.*

class OrderActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_order)

        btnBuyProduct.setOnClickListener {
            val orderCreateRequest = OrderCreateRequest()
            orderCreateRequest.brand = tvBrand.text.toString()
            orderCreateRequest.model = tvModel.text.toString()
            orderCreateRequest.price = tvPrice.text.toString().toInt()
            createOrder(orderCreateRequest)
        }
    }

    //Making a POST HTTP REQUEST
    private fun createOrder(orderCreateRequest: OrderCreateRequest?) {
        if (orderCreateRequest != null &&
            !orderCreateRequest.brand!!.isEmpty() &&
            !orderCreateRequest.model!!.isEmpty() &&
            orderCreateRequest.price != 0
        ) {
            return
        }

        //Preparing your data
        Toast.makeText(this, "Preparing Data...", Toast.LENGTH_SHORT).show()

        //Data obtained from response
        val order = Order(1, "07-12-1992", "Buzz lightyear")

        //Sending email with order details for customer
        val smtp = SMTP()
        smtp.sendEmailToCustomer(
            "CarlitosDroid",
            "Resumen de Compra",
            "${order.date} \n${order.date} \n${order.date}"
        )

        //Go to HomeActivity
        Toast.makeText(this, "Order was successful", Toast.LENGTH_SHORT).show()
        startActivity(Intent(this, HomeActivity::class.java))
    }

}
