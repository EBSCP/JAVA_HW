public class FreeLanceDeveloper extends Developer implements BonusSalaryBehaviour {
    public int UnitPrice;
    public int  Hours;

    @Override
    public double getBonusSalary() {
        return Hours*1.5;
    }
    @Override
    public double Income(){
        return Hours*UnitPrice+getBonusSalary();
    }
    public FreeLanceDeveloper(int id,String FullName, int Hours) {
        super(FullName,id);
        this.Hours=Hours;
    }
}
