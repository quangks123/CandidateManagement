
package views;

import controllers.CandidateManager;
import controllers.Validation;

public class Search extends Menu{
    private CandidateManager c = new CandidateManager();
    private Validation val = new Validation();

    public Search(String title, String[] choices) {
        super(title, choices);
    }

    @Override
    public void execute(int ch) {
        switch (ch) {
            case 2:
                System.out.print("Name: ");
                String name = val.inputWord();
                System.out.print("Type: ");
                int type = val.inputNum();
                System.out.println("-------RESULT------");
                c.search(name, type);
                break;
            case 1:
                System.out.print("ID: ");
                String id = val.inputString();
                System.out.println("-------RESULT------");
                c.search(id); 
                break;
            
        }
    }
    
}
