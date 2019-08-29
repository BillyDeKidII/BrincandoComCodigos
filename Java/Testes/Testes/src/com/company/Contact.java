package com.company;

import java.util.ArrayList;
import java.util.List;

public class Contact {

    public Contact(String name){
        this.name = name;
        this.phoneList = new ArrayList<>();
    }

    private String name;

    private List<String> phoneList;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name= name;
    }

    public List<String> getPhoneList() {
        return this.phoneList;
    }

    public void addPhone(String number) {
        this.phoneList.add(number);
    }

    public void editPhone(int index, String newValue)
    {
        phoneList.remove(index);
        phoneList.add(newValue);
    }

    public void removePhone(int index)
    {
        phoneList.remove(index);
    }

}
