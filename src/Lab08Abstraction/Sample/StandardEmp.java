package Lab08Abstraction.Sample;

public class StandardEmp extends Employee{

    @Override
    protected int getSalary(){
        return  1000;
    }

    @Override
    protected int getSupportMoney(){
        return 500;
    }
}
