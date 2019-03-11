package com.example.android_solid_principles_examples

class MonitorFilter : IFilter<ComputerMonitor> {
    override fun filter(
        monitorList: List<ComputerMonitor>, specification: ISpecification<ComputerMonitor>
    ): List<ComputerMonitor> {
        return monitorList.filter {
            specification.isSatisfied(it)
        }
    }
}