package ru.otus.cars

/**
 * Топливная система
 */
class TankSystem(private val mouthType: TankMouth) {

    private val tank = Tank()

    fun addFuel(liters: Int) {
        when (mouthType) {
            is TankMouth.PetrolMouth -> tank.addPetrolFuel(liters)
            is TankMouth.LpgMouth -> tank.addLpgFuel(liters)
        }
    }

    fun getFuelLevel(): Int {
        return tank.getFuelLevel()
    }

    private class Tank {
        var currentFuelLevel: Int = 0
        fun getFuelLevel(): Int = currentFuelLevel

        fun addPetrolFuel(liters: Int) {
            println("Заправляемся бензином, $liters литров")
            currentFuelLevel += liters
        }

        fun addLpgFuel(liters: Int) {
            println("Заправляемся газом, $liters литров")
            currentFuelLevel += liters
        }
    }
}


