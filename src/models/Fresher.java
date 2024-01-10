
package models;

public class Fresher extends Candidate{
    private String graduation_Rank, education;
    private int graduation_Date;

    public Fresher() {
        super();
    }

    public Fresher(int graduation_Date, String graduation_Rank, String education, String id, String FName, String LName, int dob, String address, String phone, String email, int type) {
        super(id, FName, LName, dob, address, phone, email, type);
        this.graduation_Date = graduation_Date;
        this.graduation_Rank = graduation_Rank;
        this.education = education;
    }

    public int getGraduation_Date() {
        return graduation_Date;
    }

    public void setGraduation_Date(int graduation_Date) {
        this.graduation_Date = graduation_Date;
    }

    public String getGraduation_Rank() {
        return graduation_Rank;
    }

    public void setGraduation_Rank(String graduation_Rank) {
        this.graduation_Rank = graduation_Rank;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFName() {
        return FName;
    }

    public void setFName(String FName) {
        this.FName = FName;
    }

    public String getLName() {
        return LName;
    }

    public void setLName(String LName) {
        this.LName = LName;
    }

    public int getDob() {
        return dob;
    }

    public void setDob(int dob) {
        this.dob = dob;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }
    
    @Override
    public String toString() {
        return String.format("%-3s | %-12s | %-5d | %-16s | %-10s", id, (FName + " " + LName), dob, email, phone);
    }
    
    public void display() {
        System.out.println("Position: Fresher");
        System.out.println("ID: " + id);
        System.out.println("Name: " + FName + " " + LName);
        System.out.println("Date of birth: " + dob);
        System.out.println("Address: " + address);
        System.out.println("Email: " + email);
        System.out.println("Phone: " + phone);
        System.out.println("Graduated time: " + graduation_Date);
        System.out.println("Rank of graduation : " + graduation_Rank);
        System.out.println("University: " + education);
    }
}
