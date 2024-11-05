package ru.oop.task2;


interface Transport extends Positioned{

    /**
     * Сесть в транспорт
     *
     * @param person
     */
    void getIntoTheTransport(Person person);

    /**
     * Доехать до нужной точки
     * @param destination
     */
    void ride(Position destination);
}
