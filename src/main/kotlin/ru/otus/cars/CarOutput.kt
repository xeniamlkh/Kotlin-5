package ru.otus.cars

/**
 * Следит за машиной
 */
interface CarOutput {
    /**
     * Скажи текущую скорость
     */
    fun getCurrentSpeed(): Int

//    /**
//     * Получить уровень топлива
//     */
//    fun getFuelLevel(): Int
}