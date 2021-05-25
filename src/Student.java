import javax.xml.bind.SchemaOutputResolver;
//import java.util.ArrayList;
//import java.util.Scanner;
//
//public class Student {
//    int id;
//    String name;
//
//    public Student() {
//    }
//    public Student(int id,String name){
//        this.id=id;
//        this.name=name;
//    }
//    public int getId() {
//        return id;
//    }
//    public void setId(int id) {
//        this.id = id;
//    }
//    public String getName() {
//        return name;
//    }
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public static void main(String[] args) {
//        Scanner scanner=new Scanner(System.in);
//        boolean check=true;
//
//        ArrayList<Student> students = new ArrayList<>();
//        while (check){
//            System.out.println("Menu");
//            System.out.println("1.Thêm");
//            System.out.println("2. Sửa ");
//            System.out.println("3. Xóa");
//            System.out.println("4. Hiển thị");
//            System.out.println("0. Thoát");
//            int number=scanner.nextInt();
//            switch (number){
//                case 1:
//                    Student student=new Student();
//                    System.out.println("Nhập id:");
//                    student.setId( scanner.nextInt()) ;
//                     scanner.nextLine();
//                    System.out.println("Nhập tên:");
//                  student.setName(scanner.nextLine());
//                    students.add(student);
//                    break;
//                case 3:
//                    System.out.println("Nhập vị trí muốn xóa");
//                    int idXoa=scanner.nextInt();
//                    System.out.println("Student xóa là :"+ students.remove(idXoa));
//                    break;
//                case 2:
//                    System.out.println("Nhập vị trí muốn sửa");
//                    int idSua= scanner.nextInt();
//                    System.out.println("Nhập id:");
//                    int id1= scanner.nextInt();
//                    System.out.println("Nhập tên:");
//                    String name1= scanner.nextLine();
//                    Student student1=new Student(id1,name1);
//                    students.set(idSua,student1);
//                    break;
//                case 4:
//                    System.out.println("nhập ");
//                    int idHienThi= scanner.nextInt();
//                    for(int i=0;i< students.size();i++){
//                        if()
//                    }
//                    break;
//                case 0:
//                    System.exit(0);
//
//
//            }
//        }
//    }
//}
