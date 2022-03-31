package secction6lap1;

import java.time.LocalDate;

public class SinhVien {
    String ID,Name,address;
    LocalDate dateOfBirth;
    double gpa;

    public String getID() {
        return ID;
    }

    public String getName() {
        return Name;
    }

    public String getAddress() {
        return address;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public double getGpa() {
        return gpa;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }


}
