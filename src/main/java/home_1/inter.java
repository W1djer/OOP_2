package home_1;

public interface inter {
    void greet();

    default String Owner(){
        return "Василий";
    }

    String OW = "Маргарита";
}
