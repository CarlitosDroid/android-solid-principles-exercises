package com.example.android_solid_principles_examples

interface IFilter<T> {
    fun filter(monitorList: List<T>, specification: ISpecification<T>): List<T>
}