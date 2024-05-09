import java.util.*;

public class Main {
    private static List<User> users = new ArrayList<>();
    private static User currentUser;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(" Ten cua ban");
        String name = scanner.nextLine();
        System.out.println(" Dia chi dat hang");
        String address = scanner.nextLine();
        System.out.println(" So dien thoai ");
        int number = scanner.nextInt();
        System.out.println("ban da dang nhap thanh cong ");
        int numbercake1 = 100;
        int numbercake2 = 123;
        int numbercake3 = 142;
        int numberCake4 = 125;
        int numberCake5 = 176;
//        CakeManager cakeManager = new CakeManager();
        System.out.println("1. -----MENU-----");
        System.out.println("2. Kiểm tra số lượng bánh trong kho");
        System.out.println("Chọn một chức năng:");
        int choice = scanner.nextInt();
        if (choice == 1 ){
            System.out.println("-----MENU-----");
            System.out.println("1. Bông lan trứng muối");
            System.out.println("2. Bánh Cupcake");
            System.out.println("3. Bánh Muffin");
            System.out.println("4. Bánh Tiramisu");
            System.out.println("5. Bánh Cheesecake");
            System.out.println("6. thoat");
        }else{
            boolean sequent = true;
            int anotherchoice = scanner.nextInt();
            switch ( anotherchoice){
                case 1:
                    System.out.println("----Số lượng bánh còn lại ngày 09/05/2024");
                    System.out.println("Bông lan trứng muối:" +numbercake1+ "chiếc");
                    System.out.println("Bánh Cupcake:"+ numbercake2 + "chiếc");
                    System.out.println("Bánh Muffin:" + numbercake3 +"chiếc");
                    System.out.println("Bánh Tiramisu:" + numberCake4 + "chiếc");
                    System.out.println("Bánh Cheesecake:"+numberCake5 + "chiếc");
                break;
                case 2:

                System.out.println("2. thoát");
                break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
                    break;


            }
        }

                }
    }

