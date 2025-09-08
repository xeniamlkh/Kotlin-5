package ru.otus.cars

import kotlin.random.Random

object Taz: Car {

    /**
     * Рандомный выбор горловины
     */
    private fun getRandomTankMouth(): TankMouth {
        return when (Random.nextInt(0, 2)) {
            0 -> TankMouth.PetrolMouth()
            else -> TankMouth.LpgMouth()
        }
    }

    /**
     * Горловина
     */
    override val tankMouth: TankMouth
        get() = getRandomTankMouth()

    /**
     * Номерной знак
     */
    override val plates: Car.Plates
        get() = throw NotImplementedError("Номера сняты")

    /**
     * Цвет машины
     */
    override val color: String = "Ржавый"

    /**
     * Следит за машиной
     */
    override val carOutput: CarOutput
        get() = throw NotImplementedError("Приборов нет")

    /**
     * Получить оборудование
     */
    override fun getEquipment(): String = "Крыса"

    /**
     * Руль вправо на [degrees] градусов
     */
    override fun wheelToRight(degrees: Int) {
        throw NotImplementedError("Руля нет")
    }

    /**
     * Руль влево на [degrees] градусов
     */
    override fun wheelToLeft(degrees: Int) {
        throw NotImplementedError("Руля нет")
    }

    override fun addFuel(liters: Int) {
        throw IllegalArgumentException("Топливная система не найдена! Взрыв!")
    }
}