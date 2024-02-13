public class RegularDeveloper extends Developer {
    public double MonthlySalary;

    public RegularDeveloper(int id, String FullName,double MonthlySalary) {
        super(FullName, id);
        this.MonthlySalary = MonthlySalary;
    }

    @Override
    public double Income() {
        return MonthlySalary;
    }



}
