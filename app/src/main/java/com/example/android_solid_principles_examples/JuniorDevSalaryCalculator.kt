package com.example.android_solid_principles_examples

class JuniorDevSalaryCalculator(developerReport: DeveloperReport) : BaseSalaryCalculator(developerReport) {
    override fun calculateSalary(): Double {
        return developerReport.hourlyRate * developerReport.workingHours
    }
}