package ru.otus.cars

/**
 * Горловина
 */
sealed interface TankMouth {
    class PetrolMouth : TankMouth
    class LpgMouth : TankMouth
}