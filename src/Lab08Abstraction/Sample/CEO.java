package Lab08Abstraction.Sample;

public class CEO extends Employee{

    @Override
    protected int getSalary(){
        return  5000;
    }

    @Override
    protected int getSupportMoney(){
        return 3000;
    }

}
