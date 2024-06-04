package FamilyTreeFinal_1;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


import family_tree.model.Human.Comparator.HumanComparatorByDob;
import family_tree.model.Human.Comparator.HumanComparatorByName;
import family_tree.model.Human.Comparator.HumanComparatorByPlaceOfBirth;

import java.util.Iterator;
/* 
 * Описание генеалогического древа
 */
public class Family_Tree<E extends Node<E>> implements Serializable, Iterable<E>{

    private List<E> humanList;

    public Family_Tree() 
    {
        humanList = new ArrayList<>();
    }

    public Family_Tree(List<E> humanList) 
    { 
        this.humanList = humanList; 
    }

    public void add(E human){
        humanList.add(human);
    }
    
    @Override
    public Iterator<E> iterator() {
        return new Family_TreeIterator(humanList);
    }

    public void sortByName(){humanList.sort(new HumanComparatorByName<>());}

    public void sortByDob(){humanList.sort(new HumanComparatorByDob<>());}

    public void sortByPlaceOfBirth(){humanList.sort(new HumanComparatorByPlaceOfBirth<>());}


}
