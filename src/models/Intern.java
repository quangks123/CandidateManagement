
package models;

public class Intern extends Candidate{
    private String majors, semester, university;

    public Intern() {
        super();
    }



    public Intern(String majors, String semester, String university, String id, String FName, String LName, int dob, String address, String phone, String email, int type) {
        super(id, FName, LName, dob, address, phone, email, type);
        this.majors = majors;
        this.semester = semester;
        this.university = university;
    }

    public String getMajors() {
        return majors;
    }

    public void setMajors(String majors) {
        this.majors = majors;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
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
        System.out.println("Position: Internship");
        System.out.println("ID: " + id);
        System.out.println("Name: " + FName + " " + LName);
        System.out.println("Date of birth: " + dob);
        System.out.println("Address: " + address);
        System.out.println("Email: " + email);
        System.out.println("Phone: " + phone);
        System.out.println("Major: " + majors);
        System.out.println("Semester: " + semester);
        System.out.println("University: " + university);
    }
}
