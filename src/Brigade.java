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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Brigada brigada = (Brigada) o;
        if (kolPeople != brigada.kolPeople) return false;
        return typeBrigada != null ? typeBrigada.equals(brigada.typeBrigada) : brigada.typeBrigada == null;
    }
    @Override
    public int hashCode() {
        int result = typeBrigada != null ? typeBrigada.hashCode() : 0;
        result = 31 * result + kolPeople;
        return result;
    }
}
