package com.example.android_solid_principles_examples

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val monitors = listOf(
            ComputerMonitor("Samsung S345", Screen.CurvedScreen, MonitorType.OLED),
            ComputerMonitor("Philips P532", Screen.WideScreen, MonitorType.LCD),
            ComputerMonitor("LG L888", Screen.WideScreen, MonitorType.LED),
            ComputerMonitor("Samsung S999", Screen.WideScreen, MonitorType.OLED),
            ComputerMonitor("Dell D2J47", Screen.CurvedScreen, MonitorType.LCD)
        )

        val monitorFilter = MonitorFilter()

        btnFilterByType.setOnClickListener {
            val lcdMonitors = monitorFilter.filter(monitors, MonitorTypeSpecification(MonitorType.LCD))
            for (lcdMonitor in lcdMonitors) {
                Log.e(
                    "Filtered monitor",
                    "Name: ${lcdMonitor.name}, Type: ${lcdMonitor.type}, Screen: ${lcdMonitor.screen}"
                )
            }
        }
    }
}
