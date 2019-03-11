package com.example.android_solid_principles_examples

abstract class BaseSalaryCalculator(var developerReport: DeveloperReport) {
    abstract fun calculateSalary(): Double
}