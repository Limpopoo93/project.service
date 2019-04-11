/*
 Класс заявка
 */
class Request {
    private String typeWork;
    private double scale;
    private int timePerfomance;

    public Request( String typeWork, double scale, int timePerfomance){
        this.typeWork = typeWork;
        this.scale = scale;
        this.timePerfomance = timePerfomance;
    }
    public String getTypeWork() { return typeWork; }
    public double getScale() { return scale; }
    public int getTimePerfomance() { return timePerfomance; }
    public void setTypeWork(String typeWork) {
        this.typeWork = typeWork;
    }
    public void setScale(double scale) {
        this.scale = scale;
    }
    public void setTimePerfomance(int timePerfomance) {
        this.timePerfomance = timePerfomance;
    }
    @Override
    public String toString() {
        return "Request{" +
                "typeWork='" + typeWork + '\'' +
                ", scale=" + scale +
                ", timePerfomance=" + timePerfomance +
                '}';
    }
}
