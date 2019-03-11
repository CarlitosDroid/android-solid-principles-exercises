package com.example.android_solid_principles_examples

class SalaryCalculator(private var baseSalaryCalculatorList: List<BaseSalaryCalculator>) {

    fun calculateTotalSalary(): Double {
        var totalSalaries = 0.0
        for (baseSalaryCalculator in baseSalaryCalculatorList) {
            totalSalaries += baseSalaryCalculator.calculateSalary()
        }
        return totalSalaries
    }
}