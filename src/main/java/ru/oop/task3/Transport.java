package ru.oop.task3;


interface Transport extends Positioned {

    /**
     * Сесть в транспорт
     * @param person
     */
    void getIntoTheTransport(Person person);

    /**
     * Управлять транспортом
     * @param destination
     */
    void ride(Position destination);
}
