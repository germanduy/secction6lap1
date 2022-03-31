package secction6lap1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class QuanLySinhVien {
    public ArrayList<SinhVien> DSSV = new ArrayList<>();
    public void add(){
        Scanner sc = new Scanner(System.in);
        SinhVien p = new SinhVien();
        System.out.println("Nhập mã SV: ");
        p.setID(sc.nextLine());
        System.out.println("Nhập tên SV: ");
        p.setName(sc.nextLine());
        System.out.println("Nhập ngày sinh: ");
        LocalDate birth = LocalDate.parse(sc.nextLine());
        p.setDateOfBirth(birth);
        System.out.println("Nhập địa chỉ: ");
        p.setAddress(sc.nextLine());
        System.out.println("Nhập GPA: ");
        p.setGpa(sc.nextDouble());
        DSSV.add(p);
    }
    public void edit(String id) {
        for (SinhVien p : DSSV) {
            if (id.equals(p.getID())) {
                Scanner sc = new Scanner(System.in);
                System.out.println("Nhập mã SV: ");
                p.setID(sc.nextLine());
                System.out.println("Nhập tên SV: ");
                p.setName(sc.nextLine());
                System.out.println("Nhập ngày sinh: ");
                LocalDate birth = LocalDate.parse(sc.nextLine());
                p.setDateOfBirth(birth);
                System.out.println("Nhập địa chỉ: ");
                p.setAddress(sc.nextLine());
                System.out.println("Nhập GPA: ");
                p.setGpa(sc.nextDouble());
                return;
            }else {
                System.out.println("Chưa có mã sinh viên này");
                return;
            }
        }
    }
    public void delete(String id){
        for(SinhVien p:DSSV){
            if(id.equals(p.getID())){
                DSSV.remove(p);
                return;
            }else {
                System.out.println("Chưa có mã sinh viên này");
                return;
            }
        }
    }
    public void sortbygpa(){
        for(int i = 0 ; i < DSSV.size()-1 ; i++){
            for( int j =0 ; j < DSSV.size() -i -1 ; j++){
                if(DSSV.get(j).gpa > DSSV.get(j+1).gpa){
                    SinhVien temp = DSSV.get(j);
                    DSSV.set(j, DSSV.get(j+1));
                    DSSV.set(j+1, temp);
                }
            }
        }
        for(SinhVien p:DSSV){
            System.out.println(p.Name);
            System.out.println(p.getID());
        }

    }
    public void sortbyname(){
        Collections.sort(DSSV, new Comparator<SinhVien>() {
            @Override
            public int compare(SinhVien o1, SinhVien o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        for(SinhVien p:DSSV){
            System.out.println(p.Name);
            System.out.println(p.getID());
        }
    }
    public void show(){
        for(SinhVien p:DSSV){
            System.out.println(p.getID());
            System.out.println(p.getName());
            System.out.println(p.getDateOfBirth());
            System.out.println(p.getAddress());
            System.out.println(p.getGpa());
        }

    }

}
