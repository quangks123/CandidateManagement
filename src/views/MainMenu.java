
package views;

import controllers.CandidateManager;

public class MainMenu extends Menu{

    public MainMenu(String title, String[] choices) {
        super(title, choices);
    }

    @Override
    public void execute(int ch) {
        switch (ch) {
            case 4:
                new CandidateManager().view();
                break;
            case 5:
                String[] choices = { "Search by id", "Search by name", "Back"};
                new Search("-----SEARCH-----", choices).run();
                break;
            default:
                System.out.println("--ADD NEW CANDIDATE--");
                new InputInfor(ch);
        }
        
    }  
}
