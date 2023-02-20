package com.mryzhan;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class Java {



    //FIELD INJECTION
//    @Autowired
//    OfficeHours officeHours;

    OfficeHours officeHours;
//
//    @Autowired
//    public Java(OfficeHours officeHours) {
//        this.officeHours = officeHours;
//    }

    void getTeachingHours()
    {
        System.out.println("Teaching hours: " + (20 + officeHours.getOfficeHours()));
    }
}
