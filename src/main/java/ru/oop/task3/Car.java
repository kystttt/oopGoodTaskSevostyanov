package ru.oop.task3;

/**
 * Машина
 */
public class Car implements Transport {
    private Position position;


    public Car(Person person){
        this.position = person.getPosition();
    }

    /**
     * Геттер, который показывает расположение
     * @return
     */
    @Override
    public Position getPosition() {
        return position;
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
