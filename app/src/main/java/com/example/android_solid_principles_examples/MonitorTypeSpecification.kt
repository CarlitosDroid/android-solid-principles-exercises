package com.example.android_solid_principles_examples

class MonitorTypeSpecification(var monitorType: MonitorType) : ISpecification<ComputerMonitor> {
    override fun isSatisfied(item: ComputerMonitor): Boolean {
        return item.type == monitorType
    }
}