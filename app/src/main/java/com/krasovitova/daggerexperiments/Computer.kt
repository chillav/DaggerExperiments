package com.krasovitova.daggerexperiments

data class Computer(
    val processor: Processor,
    val RAM: RAM,
    val motherboard: Motherboard
)

class Processor {
    override fun toString() = "AB2021"
}

class Motherboard {
    override fun toString() = "X7 3000"
}

class RAM {
    override fun toString() = "16 GB"
}