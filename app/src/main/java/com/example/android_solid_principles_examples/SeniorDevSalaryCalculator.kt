package com.example.android_solid_principles_examples

class SeniorDevSalaryCalculator(developerReport: DeveloperReport) : BaseSalaryCalculator(developerReport) {
    override fun calculateSalary(): Double {
        return developerReport.hourlyRate * developerReport.workingHours * 1.2
    }
}