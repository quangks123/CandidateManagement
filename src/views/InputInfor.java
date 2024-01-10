
package views;

import controllers.CandidateManager;
import controllers.Validation;
import models.Experience;
import models.Fresher;
import models.Intern;

public class InputInfor {
    protected String id, FName, LName, address, phone, email;
    protected int type, dob;
    private Validation val = new Validation();
    private CandidateManager c = new CandidateManager();

    public InputInfor(int flag) {
        type = flag;
        
        id = val.madeId(flag);
        
        while (true) {            
            System.out.print("First name: ");
            FName = val.inputWord();
            if (FName == "") {
                System.out.println("-----------------");
                System.out.println("Name just contain letters!!");
                System.out.println("-----------------");
            } else {
                break;
            }
        }
        
        while (true) {            
            System.out.print("Last name: ");
            LName = val.inputWord();
            if (LName == "") {
                System.out.println("-----------------");
                System.out.println("Name just contain letters!!");
                System.out.println("-----------------");
            } else {
                break;
            }
        }
        
        while (true) {            
            System.out.print("Date of birth: ");
            dob = val.inputNum();
            if (dob < 1900) {
                System.out.println("-----------------");
                System.out.println("Date is more than 1900!!");
                System.out.println("-----------------");
            } else {
                break;
            }
        }
        
        System.out.print("Address: ");
        address = val.inputWord();
        
        while (true) {            
            System.out.print("Phone: ");
            phone = val.inputWord();
            if (!val.checkPhone(phone)) {
                System.out.println("-----------------");
                System.out.println("Phone just contain number!!");
                System.out.println("-----------------");
            } else {
                break;
            }
        }
        
        System.out.print("Email: ");
        email = val.inputWord();
        
        switch (flag) {
            case 1:
                String proSkill;
                int expInYear;
                while (true) {            
                    System.out.print("Year of experience: ");
                    expInYear = val.inputNum();
                    if (expInYear < 0) {
                        System.out.println("-----------------");
                        System.out.println("Year of experience must be more than 0!!");
                        System.out.println("-----------------");
                    } else {
                         break;
                    }
                }
                
                System.out.print("Professional Skill: ");
                proSkill = val.inputWord();
                
                c.getE().add(new Experience(expInYear, proSkill, id, FName, LName, dob, address, phone, email, type));
 
                break;
            case 2:
                String graduation_Rank, education;
                int graduation_Date;
                
                while (true) {            
                    System.out.print("Graduated time: ");
                    graduation_Date = val.inputNum();
                    if (graduation_Date < 1900) {
                        System.out.println("-----------------");
                        System.out.println("Date is more than 1900!!");
                        System.out.println("-----------------");
                    } else {
                         break;
                    }
                }
                
                while (true) {                    
                    System.out.print("Rank of graduation: (Excellence, Good, Fair, Poor)");
                    graduation_Rank = val.inputWord();
                    if (!val.checkRank(graduation_Rank)) {
                        System.out.println("-----------------");
                        System.out.println("Rank is one of: Excellence, Good, Fair, Poor!!");
                        System.out.println("-----------------");
                    } else {
                        break;
                    }
                }
                
                System.out.print("University: ");
                education = val.inputWord();
                
                c.getF().add(new Fresher(graduation_Date, graduation_Rank, education, id, FName, LName, dob, address, phone, email, type));
                break;
                
            case 3:
                String majors, semester, university;
                System.out.print("Majors: ");
                majors = val.inputWord();
                System.out.print("Semester: ");
                semester = val.inputWord();
                System.out.print("University: ");
                university = val.inputWord();
                
                c.getI().add(new Intern(majors, semester, university, id, FName, LName, dob, address, phone, email, type));
                break;
        }
        
        System.out.println("ADD SUCCESS!!");
    }
}
