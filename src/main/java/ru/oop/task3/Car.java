package ru.oop.task3;


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
}
