package QLSV;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ManageStudent manageStudent=new ManageStudent();
        Scanner scanner=new Scanner(System.in);

            boolean check=true;
            while (check){
                System.out.println("Menu");
                System.out.println("1.Thêm");
                System.out.println("2. Sửa ");
                System.out.println("3. Xóa");
                System.out.println("4. Tìm");
                System.out.println("0. Thoát");
                int number = scanner.nextInt();
                switch (number){
                    case 1:
                        System.out.println("Nhập id:");
                        int id=scanner.nextInt();
                        scanner.nextLine();
                        System.out.println("Nhập tên:");
                        String name = scanner.nextLine();
                        manageStudent.add(new Student(id,name));
                        break;
                    case 2:
                        System.out.println("Nhập tên muốn sửa");
                        scanner.nextLine();
                        String nameSua=scanner.nextLine();
                        System.out.println("Nhập id:");
                        int id2=scanner.nextInt();
                        scanner.nextLine();
                        System.out.println("Nhập tên:");
                        String name2 = scanner.nextLine();
                        manageStudent.edit(nameSua,new Student(id2,name2));
                        break;
                    case 3:
                        System.out.println("Nhập tên muốn xóa");
                        scanner.nextLine();

                        String name3=scanner.nextLine();
                        manageStudent.delete(name3);
                        break;
                    case 4:
                        System.out.println("Nhập tên muốn tìm");
                        scanner.nextLine();
                        String nameTim=scanner.nextLine();
                        System.out.println(nameTim+" có vị trí là: "+manageStudent.findByName(nameTim));
                        break;
                    case 0:
                        System.exit(0);
                }
            }
    }
}
