package FamilyTreeFinal_1;

import family_tree.view.ConsoleUI;

public class SortByPlaceOfBirth extends Command {
    public SortByPlaceOfBirth (ConsoleUI consoleUI){
        super( consoleUI);
        description =  "Сортировка по месту рождения";
    }

    @Override
    public void execute(){
        consoleUI.sortByPlaceOfBirth();
    }
}