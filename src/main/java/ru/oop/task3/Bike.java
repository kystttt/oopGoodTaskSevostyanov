package ru.oop.task3;


/**
 * Велосипед
 */
public class Bike implements Transport {
    private Position position;

    public Bike(Person person){
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

    }

}
