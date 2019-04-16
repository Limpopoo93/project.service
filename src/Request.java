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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Request request = (Request) o;
        if (Double.compare(request.scale, scale) != 0) return false;
        if (timePerfomance != request.timePerfomance) return false;
        return typeWork != null ? typeWork.equals(request.typeWork) : request.typeWork == null;
    }
    @Override
    public int hashCode() {
        int result;
        long temp;
        result = typeWork != null ? typeWork.hashCode() : 0;
        temp = Double.doubleToLongBits(scale);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + timePerfomance;
        return result;
    }
}
