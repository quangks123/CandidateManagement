
package controllers;

import java.util.ArrayList;
import models.Experience;
import models.Fresher;
import models.Intern;

public class CandidateManager {
    private static ArrayList<Experience> e = new ArrayList<>();
    private static ArrayList<Fresher> f = new ArrayList<>();
    private static ArrayList<Intern> i = new ArrayList<>();

    public CandidateManager() {
        
    }

    
    public ArrayList<Experience> getE() {
        return e;
    }

    public void setE(ArrayList<Experience> e) {
        this.e = e;
    }

    public ArrayList<Fresher> getF() {
        return f;
    }

    public void setF(ArrayList<Fresher> f) {
        this.f = f;
    }

    public ArrayList<Intern> getI() {
        return i;
    }

    public void setI(ArrayList<Intern> i) {
        this.i = i;
    }
    
    public void search(String name, int type) {
        switch (type) {
            case 1:
                for (Experience el : e) {
                    if (el.getFName().contains(name) || el.getLName().contains(name)) {
                        System.out.println(el);
                    }
                    
                }
                break;
            case 2:
                for (Fresher fl : f) {
                    if (fl.getFName().contains(name) || fl.getLName().contains(name)) {
                        System.out.println(fl);
                    }
                }
                break;
            case 3:
                for (Intern il : i) {
                    if (il.getFName().contains(name) || il.getLName().contains(name)) {
                        System.out.println(il);
                    }
                }
                break;
        }
    }
    
    public void search(String id) {
        int ch = Integer.parseInt(String.valueOf(id.charAt(1)));
        switch (ch) {
            case 1:
                for (Experience el : e) {
                    if (el.getId().equalsIgnoreCase(id)) {
                        el.display();
                    }
                    
                }
                break;
            case 2:
                for (Fresher fl : f) {
                    if (fl.getId().equalsIgnoreCase(id)) {
                        fl.display();
                    }
                }
                break;
            case 3:
                for (Intern il : i) {
                    if (il.getId().equalsIgnoreCase(id)) {
                        il.display();
                    }
                }
                break;
        }
    }
    
    public void view() {
        System.out.println("---EXPERIENCE CANDIDATE---");
        for (Experience experience : e) {
            System.out.println(experience.getId() + " | " + experience.getFName() + " " + experience.getLName());
        }
        System.out.println("---FRESHER CANDIDATE---");
        for (Fresher fl : f) {
            System.out.println(fl.getId() + " | " + fl.getFName() + " " + fl.getLName());
        }
        System.out.println("---INTERN CANDIDATE---");
        for (Intern il : i) {
            System.out.println(il.getId() + " | " + il.getFName() + " " + il.getLName());
        }
    }
    
    public void initiate() {
        e.add(new Experience(1, "Java", "C10", "Quang", "Hoang", 2004, "Quang Tri", "111222333", "quang@gmail.com", 1));
        e.add(new Experience(2, "C/C++", "C11", "Dung", "Tran", 2004, "Quang Tri", "123456789", "dung@gmail.com", 1));
        e.add(new Experience(1, "Python", "C12", "Chinh", "Dinh", 2004, "Quang Tri", "234123456", "chinh@gmail.com", 1));
        f.add(new Fresher(2013, "Good", "FPT", "C20", "Cuong", "Nguyen", 2003, "Quang Nam", "123654987", "cuong@gmail.com", 2));
        f.add(new Fresher(2016, "Excellence", "VKU", "C21", "Bao", "Nguyen", 2001, "Quang Binh", "123654567", "bao@gmail.com", 2));
        f.add(new Fresher(2016, "Excellence", "FTU", "C22", "Phu", "Nguyen", 2005, "Ha Noi", "123234345", "phu@gmail.com", 2));
        i.add(new Intern("DE", "Fall", "FPT", "C30", "Son", "Hoang", 2004, "Quang Tri", "123745838", "son@gmail.com", 3));
        i.add(new Intern("SE", "Summer", "FPT", "C31", "Long", "Nguyen", 2004, "TP.HCM", "123543930", "long@gmail.com", 3));
        i.add(new Intern("DA", "Spring", "FPT", "C32", "Manh", "Nguyen", 2001, "TP.HCM", "092631264", "manh@gmail.com", 3));
    }
}
