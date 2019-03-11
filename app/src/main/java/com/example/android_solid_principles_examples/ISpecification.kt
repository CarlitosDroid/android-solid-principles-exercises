package com.example.android_solid_principles_examples

/**
 * We can determine whether or not our criterion is satisfied
 */
interface ISpecification<T> {
    fun isSatisfied(item: T): Boolean
}