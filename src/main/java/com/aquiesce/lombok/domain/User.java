package com.aquiesce.lombok.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

    Long id;

    String firstName;
    String lastName;

    public String toString(){
        return this.lastName;
    }

    public String saySomething(){



        return "wibble";


    }
}
