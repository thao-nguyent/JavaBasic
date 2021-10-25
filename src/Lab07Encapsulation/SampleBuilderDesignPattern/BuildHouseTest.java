package Lab07Encapsulation.SampleBuilderDesignPattern;

public class BuildHouseTest {
    public static void main(String[] args) {
        //Mục đích: xử lý gọn gàng hơn
        House house1 = new House.Builder().hasOngKhoi(true).color("black").build();
        House house2 = new House.Builder().hasOngKhoi(false).color("white").build();
        House house3 = new House.Builder().build();

        house1.buildHouse();
        house2.buildHouse();
        house3.buildHouse();
    }
}
