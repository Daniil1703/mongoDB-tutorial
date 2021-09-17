package com.justai.jaicf.template.scenario

import com.justai.jaicf.builder.Scenario
import com.justai.jaicf.reactions.buttons
import com.justai.jaicf.reactions.toState

val mainScenario = Scenario {
    state("start") {
        activators {
            regex("/start")
        }
        action {
            reactions.say("Здравствуйте! Какое действие хотите выполнить?")
            reactions.buttons(
                "Создать  товар" toState "/create",
                "Посмотреть все товары" toState  "/read",
                "Обновить товар" toState "/update",
                "Удалить товар" toState "/delete"
            )
        }
    }

    state("create") {
        action {
            reactions.say("Давайте создадим товар!")
        }
    }

    state("read") {
        action {
            reactions.say("Давайте посмотрим товар!")
        }
    }

    state("update") {
        action {
            reactions.say("Давайте обновим товар!")
        }
    }

    state("delete") {
        action {
            reactions.say("Давайте удалим товар!")
        }
    }
}