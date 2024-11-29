package com.cc.java.singleton;

import com.cc.java.tools.Helper;

public class App {
    
    public static void main(String[] args) {
    
    // Singleton obj = new Singleton(); // Das geht nicht mehr!  
        
    /* Klasische Instanziierung    
    Singleton singleton1 = new Singleton();    
    Helper.output(singleton1);
    Singleton singleton2 = new Singleton();    
    Helper.output(singleton2);
    Singleton singleton3 = new Singleton();    
    Helper.output(singleton3); */
    

    Singleton object1 = Singleton.getInstance();
    Helper.output(object1);

    Singleton object2 = Singleton.getInstance();
    Helper.output(object2);

    Singleton object3 = Singleton.getInstance();
    Helper.output(object3);
    
    object1.actOnEvent();
        object1.actOnEvent();
        // Events werden kumuliert ... 0 + 2
        Helper.output(object1.getCounter());
        Helper.output("---------------------");

    object2.actOnEvent();
        object2.actOnEvent();
        object2.actOnEvent();
        // Events werden kumuliert ... 2 + 3
        Helper.output(object2.getCounter());
        Helper.output("---------------------");


     object3.actOnEvent();
        object3.actOnEvent();
        object3.actOnEvent();
        object3.actOnEvent();
        object3.actOnEvent();
		
        // Events werden kumuliert ... 5 + 5
        Helper.output(object3.getCounter());



    }
} 