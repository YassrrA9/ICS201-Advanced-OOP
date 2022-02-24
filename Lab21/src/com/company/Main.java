package com.company;

import java.io.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ArrayList<students> FIRST_ARRAY = new ArrayList<>();
        students Ob1 = new students("Yasser Ali",201934);
        students Ob2 = new students("Ahmad Ali",201874);
        students Ob3 = new students("Faissal Ali",201554);
        FIRST_ARRAY.add(Ob1);
        FIRST_ARRAY.add(Ob2);
        FIRST_ARRAY.add(Ob3);

        FileOutputStream BINARY_FILE = new FileOutputStream("StudentsINFO.dat");
        ObjectOutputStream BINARY_WRITER = new ObjectOutputStream(BINARY_FILE);

        BINARY_WRITER.writeObject(FIRST_ARRAY);
        BINARY_WRITER.close();
        ArrayList<students> SECOND_ARRAY = new ArrayList<>();
        FileInputStream BINARY_FILE2 = new FileInputStream("StudentsINFO.dat");
        ObjectInputStream BINARY_READER = new ObjectInputStream(BINARY_FILE2);
        SECOND_ARRAY = (ArrayList<students>) BINARY_READER.readObject();

        for(int i=0; i<SECOND_ARRAY.size(); i++){
            System.out.println(SECOND_ARRAY.get(i));
        }

        BINARY_READER.close();


    }
}

class students implements java.io.Serializable{
    private String name;
    private int id;

    public students(String name, int id){
        this.name = name;
        this.id = id;
    }public String getName(){
        return this.name;
    }

    public int getId() {
        return this.id;
    }

    public String toString(){
        return String.format("Name: %s \t ID: %d",getName(), getId());
    }
}
