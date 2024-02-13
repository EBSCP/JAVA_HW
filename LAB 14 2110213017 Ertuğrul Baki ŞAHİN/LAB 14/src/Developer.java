public abstract class Developer {
    public String FullName;
    public int id;
    protected abstract double Income();

    public Developer(String FullName,int id) {
        this.FullName = FullName;
        this.id = id;
    }
}

