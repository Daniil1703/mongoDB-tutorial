package com.justai.jaicf.template.scenario

import com.justai.jaicf.builder.Scenario

val mainScenario = Scenario {
    state("start") {
        activators {
            regex("/start")
        }
    }
}