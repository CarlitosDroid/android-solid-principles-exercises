package com.example.android_solid_principles_examples

class MonitorFilter() {
    fun filterByType(computerMonitorList: List<ComputerMonitor>, type: MonitorType): List<ComputerMonitor> {
        val filteredComputerMonitorList = mutableListOf<ComputerMonitor>()
        for (computer in computerMonitorList) {
            if (computer.type == type) {
                filteredComputerMonitorList.add(computer)
            }
        }
        return filteredComputerMonitorList
    }
}