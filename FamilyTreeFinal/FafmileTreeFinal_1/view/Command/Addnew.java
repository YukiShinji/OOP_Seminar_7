package FamilyTreeFinal_1;

import family_tree.view.ConsoleUI;

public class Addnew extends Command {
    public Addnew(ConsoleUI consoleUI){
        super(consoleUI);
        description = "Добавить члена";
    }

    @Override
    public void execute(){
        consoleUI.add();
    }
}
