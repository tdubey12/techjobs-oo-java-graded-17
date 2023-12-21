package org.launchcode.techjobs.oo;

import java.util.Objects;


// extends baseclass jobfield because all common code is moved to jobfield class
public class CoreCompetency extends JobField {
    // default constructor with empty parameter
    public CoreCompetency() {
        // call base class constructor
        super();
    }
        // constructor with value parameter
    public CoreCompetency(String value) {
        //call base class constructor with value parameter
        super(value);
    }
}




