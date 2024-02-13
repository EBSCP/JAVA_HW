public class SeniorDeveloper  extends RegularDeveloper implements  PromotionBehaviour{
    
    @Override
    public double Income() {
        return MonthlySalary+getPromotion();
    }
    @Override
    public double getPromotion() {
        return 1.5*MonthlySalary;
    }

    public SeniorDeveloper(int id,String FullName, double MonthlySalary) {
        super(id,FullName,MonthlySalary);
    }
}
