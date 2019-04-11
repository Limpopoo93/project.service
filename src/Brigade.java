/*
 Класс бригада
 */
class Brigada {  // бригада
    private String typeBrigada;
    private int kolPeople;
    public Brigada(String nameBrigada, int kolPeople){
        this.kolPeople = kolPeople;
        this.typeBrigada = typeBrigada;
    }
    public String getTypeBrigada() {
        return typeBrigada;
    }
    public void setTypeBrigada(String typeBrigada){
        this.typeBrigada = typeBrigada;
    }
    public int getKolPeople(){
        return kolPeople;
    }
    public void setKolPeople(int kolPeople){
        this.kolPeople = kolPeople;
    }
    @Override
    public String toString() {
        return "Brigada{" +
                "typeBrigada='" + typeBrigada + '\'' +
                ", kolPeople=" + kolPeople +
                '}';
    }
}
