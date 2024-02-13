class Movie implements Comparable<Movie> {
    public double Rate;
    public  String Name;

    public  int Brand;

    public double getRating() {
        return Rate;
    }
    public String getName() {
        return  Name;
    }
    public int getYear() {
        return Brand;
    }

    public Movie(double Rate, String Name, int Brand) {
        this.Rate = Rate;
        this.Brand = Brand;
        this.Name = Name;
    }

    @Override

    public int compareTo(Movie movie) {
        return movie.Brand;
    }
}
