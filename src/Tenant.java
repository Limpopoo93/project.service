/*
 Класс квартирант
 Этот класс будет иметь метод, который создает заявку и отправляет диспетчеру
 */
class Tenant { //квартирант
    private String name;
    private int numberRoom;
    public Tenant(String name, int numberRoom){
        this.name = name;
        this.numberRoom = numberRoom;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getNumberRoom() {
        return numberRoom;
    }
    public void setNumberRoom(int numberRoom) {
        this.numberRoom = numberRoom;
    }
    @Override
    public String toString() {
        return "Tenant{" +
                "name='" + name + '\'' +
                ", numberRoom=" + numberRoom +
                '}';
    }
}
