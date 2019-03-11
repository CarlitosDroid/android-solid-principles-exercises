package com.example.android_solid_principles_examples

class SalaryCalculator(private var developerReportList: List<DeveloperReport>) {

    fun calculateTotalSalary(): Double {
        var totalSalaries = 0.0
        for (developerReport in developerReportList) {
            totalSalaries += developerReport.hourlyRate * developerReport.workingHours
        }
        return totalSalaries
    }

    /**
     * But what happens if our boss wants a different calculation for the senior and junior developer
     * The senior developer should have a bonus of 20% on a salary.
     */
    /*fun calculateTotalSalary1(): Double {
        var totalSalaries = 0.0
        for (developerReport in developerReportList) {
            totalSalaries += if (developerReport.level == "Senior developer")
                developerReport.hourlyRate * developerReport.workingHours * 1.2
            else
                developerReport.hourlyRate * developerReport.workingHours
        }
        return totalSalaries
    }*/

}