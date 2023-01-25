import java.util.Scanner;
public class Shop {
    public static void main(String[] args) {

        String Name;
        Employee emp = new Employee();
        Scanner sc = new Scanner(System.in);
        item itm = new item();
        System.out.println("Enter Shop Name :");
        String shopName = sc.next();
        Name = shopName;
        System.out.println("Enter Employee Name :");
        String empName = sc.next();
        emp.setName(empName);

        System.out.println("Enter ID :");
        int empId = sc.nextInt();
        emp.setId(empId);
        System.out.println(" employee info: " + emp.getId() + " " + emp.getName());


        ///////////////////////////////////////////////////////
        String itemName;
        while (true) {


            System.out.println("Enter Product Name :");
            itemName = sc.next();
            itm.setItemName(itemName);
            System.out.println("Enter Product Code :");
            int itemCode = sc.nextInt();
            itm.setItemCode(itemCode);

            itm.itemlist.add(itm);
            System.out.println("Do you want to add more ?");
            String option = sc.next();
            if
            (option.equals("Y") || option.equals("y") || option.equals("Yes") || option.equals("yes")) {
            } else if (option.equals("N") || option.equals("n") || option.equals("No") || option.equals("no")) {
                break;
            } else {
                System.out.println("Invalid Input");
                break;
            }

        }
        for (int i = 0; i < itm.itemlist.size(); i++) {
            System.out.println(itm.getItemCode());
            //System.out.println(itm.getItemCode());
        }

        // System.out.println(" product info: " + itm.getItemName() + " " + itm.getItemCode());

    }

    }
