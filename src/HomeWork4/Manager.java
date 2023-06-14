package HomeWork4;

public class Manager extends Coworkers {

    int percentOfSale = 10;
    double valueOfSale;

    public Manager(String name, int age, int experience) throws MyExceptions, EmptyNameException {
        super(name, age, experience);
        salary = 500;
        position="Manager";
        salaryWithBonus=salary;
    }

    public void setPercentOfSale(int percentOfSale) {
        this.percentOfSale = percentOfSale;
    }

    public void setValueOfSale(double valueOfSale) {
        this.valueOfSale = valueOfSale;
    }

    @Override
    public void doWork() {
        System.out.println("I am manager and I'm working");
        salaryWithBonus= Math.round((salary+valueOfSale*percentOfSale/100) * 100.0) / 100.0;
    }
}
