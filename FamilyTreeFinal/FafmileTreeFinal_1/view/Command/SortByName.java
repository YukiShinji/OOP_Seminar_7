package FamilyTreeFinal_1;

import family_tree.view.ConsoleUI;

public class SortByName extends Command {
    public SortByName(ConsoleUI consoleUI){
        super(consoleUI);
        description = "Сортировка по алфавиту";
        }

    @Override
    public void execute(){
        consoleUI.sortByName();
    }
}
