package com.example.android_solid_principles_examples

class MonitorFilter {
    fun filterByType(computerMonitorList: List<ComputerMonitor>, type: MonitorType): List<ComputerMonitor> {
        val filteredComputerMonitorList = mutableListOf<ComputerMonitor>()
        for (computer in computerMonitorList) {
            if (computer.type == type) {
                filteredComputerMonitorList.add(computer)
            }
        }
        return filteredComputerMonitorList
    }

    /**
     *  But, after a couple of days, we receive a request that
     *  our customers want to have the filter by Screen functionality as well.
     */
    fun filterByScreen(computerMonitorList: List<ComputerMonitor>, screen: Screen): List<ComputerMonitor> {
        val filteredComputerMonitorList = mutableListOf<ComputerMonitor>()
        for (computer in computerMonitorList) {
            if (computer.screen == screen) {
                filteredComputerMonitorList.add(computer)
            }
        }
        return filteredComputerMonitorList
    }

    /**
     * And what if we receive another request to filter all the monitors by type and screen together?
     * We all see where this lead us, towards breaking the OCP.
     */
}