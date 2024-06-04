package FamilyTreeFinal_1;


import java.time.LocalDate;

public interface Node<T> {
    String getFather();
    String getMother();
    String getSpouse();
    String getSpousa();
    String getName();
    StringBuilder getChildren();
    String getPlaceOfBirth();
    LocalDate getDateBirth();
    String getData();
    String getFatherInfo(); 
    String getMotherInfo(); 
    String getChildrenInfo();
    String getSpousaInfo();
    String getSpouseInfo();
}
