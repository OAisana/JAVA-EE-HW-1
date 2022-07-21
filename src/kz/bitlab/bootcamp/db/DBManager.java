package kz.bitlab.bootcamp.db;

import java.util.ArrayList;

public class DBManager {

    private static ArrayList<Computer> computers = new ArrayList<>();
    private static int id = 7;

    static {

        computers.add(new Computer(1, "Macbook Pro 13", "Very good computer", 970000, 20));
        computers.add(new Computer(2, "Macbook Pro 12", "Very very very computer", 870000, 19));
        computers.add(new Computer(3, "Macbook Pro 11", "Very perfect computer", 770000, 18));
        computers.add(new Computer(4, "Macbook Pro 10", "Very cool computer", 670000, 21));
        computers.add(new Computer(5, "Macbook Pro 9", "Very nice computer", 570000, 23));
        computers.add(new Computer(6, "Macbook Pro 8", "Very bad computer", 470000, 10));

    }

    public static ArrayList<Computer> getComputers(){
        return computers;
    }

    public static void addComputer(Computer computer){
        computer.setId(id);
        computers.add(computer);
        id++;
    }

    public static Computer getComputer(int id){
        for(Computer comp : computers){
            if(comp.getId()==id) return comp;
        }
        return null;
    }

    public static void updateComputer(Computer computer){
        for(int i=0;i<computers.size();i++){
            if(computers.get(i).getId()==computer.getId()){
                computers.set(i, computer);
                break;
            }
        }
    }

    public static void deleteComputer(Computer computer){
        for(int i=0;i<computers.size();i++){
            if(computers.get(i).getId()==computer.getId()){
                computers.remove(i);
                break;
            }
        }
    }

}
