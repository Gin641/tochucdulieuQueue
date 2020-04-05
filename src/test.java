import java.util.ArrayList;

public class test {
    public static void main(String[] args) {
        Queue male = new Queue();
        Queue felame = new Queue();
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee("B","male", new int[]{1,1,1991}));
        employees.add(new Employee("C","female",new int[]{2,2,1992}));
        employees.add(new Employee("D","male",new int[]{3,3,1993}));
        employees.add(new Employee("E","female",new int[]{4,4,1994}));
        employees.add(new Employee("F","male",new int[]{5,5,1995}));
        employees.add(new Employee("G","female",new int[]{6,6,1996}));
        employees.add(new Employee("H","male",new int[]{7,7,1997}));
        employees.add(new Employee("I","female",new int[]{8,8,1998}));
        employees.add(new Employee("K","male",new int[]{9,9,1999}));
        employees.add(new Employee("L","female",new int[]{10,10,2000}));
        for (Employee value : employees){
            if (value.getGender().equals("male")){
                male.enQueue(value);
            }else {
                felame.enQueue(value);
            }
        }
        System.out.println("Male: ");
        while (male.getTail() != null){
            System.out.print(male.deQueue());
        }
        System.out.println("Felame: ");
        while (felame.getTail() != null){
            System.out.print(felame.deQueue());
        }
    }
}
