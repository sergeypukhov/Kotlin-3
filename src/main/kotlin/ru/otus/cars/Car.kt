package ru.otus.cars

/**
 * Машина целиком
 */
interface Car : CarInput {
    /**
     * Номерной знак
     */
    val plates: Plates

    /*
    * Горловина бака
     */
    val tankMouth: TankMouth

    /*
    * Бак
     */
    val tank: Tank

    /**
     * Цвет машины
     */
    val color: String

    /**
     * Следит за машиной
     */
    val carOutput: CarOutput

    /**
     * Получить оборудование
     */
    fun getEquipment(): String

    /**
     * Внутренний статический класс - номерой знак
     */
    data class Plates(val number: String, val region: Int)
}