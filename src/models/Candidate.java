
package models;

public class Candidate {
    protected String id, FName, LName, address, phone, email;
    protected int type, dob;

    public Candidate() {
    }

    public Candidate(String id, String FName, String LName, int dob, String address, String phone, String email, int type) {
        this.id = id;
        this.FName = FName;
        this.LName = LName;
        this.dob = dob;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.type = type;
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
    
    
}
