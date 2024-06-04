package FamilyTreeFinal_1;

import family_tree.view.ConsoleUI;

public class GetData extends Command {
    public GetData(ConsoleUI consoleUI){
        super(consoleUI);
        description = "Получить список членов семьи";
    }

    @Override
    public void execute(){
        consoleUI.getData();
    }
}
