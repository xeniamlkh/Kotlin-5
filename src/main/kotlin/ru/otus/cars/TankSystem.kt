package ru.otus.cars

class TankSystem(): TankMouth {

    override fun addFuel(liters: Int) {
        val tank = Tank()
        tank.addFuel(liters)
    }

    fun getFuelLevel() {
        val tank = Tank()
        tank.getFuelLevel()
    }

    private class Tank {
        var currentFuelLevel: Int = 0
        fun getFuelLevel(): Int = currentFuelLevel
        fun addFuel(liters: Int) {
            currentFuelLevel += liters
        }
    }
}


