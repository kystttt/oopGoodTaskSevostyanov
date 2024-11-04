package ru.oop.task3;


public class Bus implements Transport {
    private String busNumber;
    private Position position;

    public Bus(String busNumber, Person person){
        this.busNumber = busNumber;
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
