
package test;

import controllers.CandidateManager;
import views.MainMenu;

public class Main {
    public static void main(String[] args) {
        new CandidateManager().initiate();
        String[] choices = {"Experience", "Fresher", "Internship", "View", "Search", "Exit"};
        new MainMenu("-----MENU-----", choices).run();
    }
}
