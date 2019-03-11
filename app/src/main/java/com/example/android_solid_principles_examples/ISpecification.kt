package com.example.android_solid_principles_examples

interface ISpecification<T> {
    fun isSatisfied(item: T): Boolean
}