package com.example.android_solid_principles_examples

class SalaryCalculator(private var developerReportList: List<DeveloperReport>) {

    fun calculateTotalSalary(): Double {
        var totalSalaries = 0.0
        for (developerReport in developerReportList) {
            totalSalaries += developerReport.hourlyRate * developerReport.workingHours
        }
        return totalSalaries
    }
}