package ru.otus.cars

/**
 * Горловина
 */
sealed interface TankMouth {
    fun addFuel(liters: Int)

    class PetrolMouth : TankMouth {
        override fun addFuel(liters: Int) {
            println("Заправляемся бензином, $liters литров")
        }
    }

    class LpgMouth : TankMouth {
        override fun addFuel(liters: Int) {
            println("Заправляемся газом, $liters литров")
        }
    }
}