package FamilyTreeFinal_1;

import family_tree.view.ConsoleUI;

public class SortByDod extends Command {
    public SortByDod(ConsoleUI consoleUI){
        super(consoleUI);
        description = "Сортировка по дате рождения";
    }

    @Override
    public void execute(){
        consoleUI.sortByDob();
    }
}
