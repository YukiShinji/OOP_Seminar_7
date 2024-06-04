package FamilyTreeFinal_1;

import family_tree.view.ConsoleUI;

public class Finish extends Command {
    public Finish (ConsoleUI consoleUI){
        super(consoleUI);
        description = "Закончить работу";
    }

    @Override
    public void execute(){
        consoleUI.finish();
    }
}