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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tenant tenant = (Tenant) o;
        if (numberRoom != tenant.numberRoom) return false;
        return name != null ? name.equals(tenant.name) : tenant.name == null;
    }
    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + numberRoom;
        return result;
    }
}
