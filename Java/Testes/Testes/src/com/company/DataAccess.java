package com.company;

public class DataAccess {

    private static DataAccess dataAccessInstance;

    private DataAccess(){}

    public static DataAccess getDataAccessInstance(){
        if(dataAccessInstance == null){
            dataAccessInstance = new DataAccess();
        }
        return dataAccessInstance;
    }



}