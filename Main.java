package secction6lap1;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        QuanLySinhVien svlopa = new QuanLySinhVien();

        SinhVien sv1 = new SinhVien();
        sv1.setID("sv1");
        sv1.setName("Duy1");
        sv1.setDateOfBirth(LocalDate.parse("2022-05-04"));
        sv1.setAddress("Địa chỉ 1");
        sv1.setGpa(8.0);
        svlopa.DSSV.add(sv1);

        SinhVien sv2 = new SinhVien();
        sv2.setID("sv2");
        sv2.setName("Duy2");
        sv2.setDateOfBirth(LocalDate.parse("2022-05-04"));
        sv2.setAddress("Địa chỉ 1");
        sv2.setGpa(8.6);
        svlopa.DSSV.add(sv2);

        SinhVien sv3 = new SinhVien();
        sv3.setID("sv3");
        sv3.setName("Duy3");
        sv3.setDateOfBirth(LocalDate.parse("2022-05-04"));
        sv3.setAddress("Địa chỉ 1");
        sv3.setGpa(7.6);
        svlopa.DSSV.add(sv3);

        SinhVien sv4 = new SinhVien();
        sv4.setID("sv4");
        sv4.setName("Duy4");
        sv4.setDateOfBirth(LocalDate.parse("2022-05-04"));
        sv4.setAddress("Địa chỉ 1");
        sv4.setGpa(9.0);
        svlopa.DSSV.add(sv4);

        svlopa.edit("sv4");

        int x;
        Scanner sc = new Scanner(System.in);
        for(;;){
            System.out.println("Chọn chức năng:");
            System.out.println("1. Thêm học sinh");
            System.out.println("2. Sửa học sinh qua id");
            System.out.println("3. Xóa học sinh qua id");
            System.out.println("4. Xếp học sinh theo điểm trung bình");
            System.out.println("5. Xếp học sinh theo điểm tên");
            System.out.println("6. Thoát");
            do{
                x = sc.nextInt();
            }
            while (x<1 || x>6);
            switch (x){
                case 1:{
                    svlopa.add();
                    break;
                }
                case 2:{
                    System.out.println("Nhập id sinh viên cần sửa");
                    Scanner sv = new Scanner(System.in);
                    String y;
                    y = sv.nextLine();
                    svlopa.edit(y);
                    break;
                }
                case 3:{
                    System.out.println("Nhập id sinh viên cần xóa");
                    Scanner sv = new Scanner(System.in);
                    String y;
                    y = sv.nextLine();
                    svlopa.delete(y);
                    break;
                }
                case 4:{
                    svlopa.sortbygpa();
                    break;
                }
                case 5:{
                    svlopa.sortbyname();
                    break;
                }
                default:
                    System.out.println("Goodbye");

                }
            }
        }



}

//    int x;
//        for (; ; ) {
//                System.out.println("Choose the function you want");
//                System.out.println("1. Add student");
//                System.out.println("2. Edit student by ID");
//                System.out.println("3. Delete student by ID");
//                do {
//                x = sc.nextInt();
//                } while (x<1 || x>3);
//        switch (x) {
//        case 1: {
//        studentList.addStudent();
//        break;
//        }
//        case 2: {
//        studentList.editStudentbyID();
//        break;
//        }
//        case 3: {
//        studentList.deleteStudentbyID();
//        break;
//        }
//        }
//        }