package ru.oop.task2;

/**
 * Машина
 */
public class Car implements Transport{



    /**
     * Геттер, который показывает расположение
     * @return
     */
    @Override
    public Position getPosition() {
        return null;
    }


    /**
     * Перемещение на данном виде транспорта
     */
    @Override
    public void ride(Position destination){
        //something code here
    }

    /**
     * Сесть в этот транспорт
     * @param person
     */
    @Override
    public void getIntoTheTransport(Person person){
        //
    }
}
