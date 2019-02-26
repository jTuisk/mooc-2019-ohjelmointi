/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author janek
 */
public class Books {

    private String name;
    private int pages, year;

    public Books(String name, int pages, int year){
        this.name = name;
        this.pages = pages;
        this.year = year;
    }

    public String getName(){
        return this.name;
    }
    
    public int getPages(){
        return this.pages;
    }
    
    public int getYear(){
        return this.year;
    }
    
    public String tulostus(String t){
        String jenesaispas = "";
        switch(t){
            case "kaikki":
                jenesaispas = this.name+", "+this.pages+" sivua, "+this.year;
                    break;
            case "nimi":
                jenesaispas = this.name; 
                    break;
                    
            default: 
                break;
        }
        return jenesaispas;
    }
    
}
