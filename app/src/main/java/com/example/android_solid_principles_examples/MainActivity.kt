package com.example.android_solid_principles_examples

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnCalculateTotalSalary.setOnClickListener {

            val developerReportList = mutableListOf<BaseSalaryCalculator>()
            developerReportList.add(SeniorDevSalaryCalculator(DeveloperReport(1, "Dev1", "Senior developer", 30.5, 160)))
            developerReportList.add(JuniorDevSalaryCalculator(DeveloperReport(2, "Dev2", "Junior developer", 20.0, 150)))
            developerReportList.add(SeniorDevSalaryCalculator(DeveloperReport(3, "Dev3", "Senior developer", 30.5, 180)))

            val salaryCalculator = SalaryCalculator(developerReportList)
            Toast.makeText(this,
                "Sum of all the developer salaries is ${salaryCalculator.calculateTotalSalary()} dollars",
                Toast.LENGTH_SHORT).show()

        }
    }
}
