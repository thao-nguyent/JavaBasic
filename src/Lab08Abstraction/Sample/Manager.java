package Lab08Abstraction.Sample;

public class Manager extends Employee{

    @Override
    protected int getSalary(){
        return  3000;
    }

    @Override
    protected int getSupportMoney(){
        return 2000;
    }
}
