package com.stackroute.domain;

import org.springframework.data.annotation.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

//Calls Jpa Repository
@Document(collection = "track")
//Manages all getter and setter methods
@Data
//create a constructor with No Arguements
@NoArgsConstructor
//create a constructor with All Arguements
@AllArgsConstructor
//@Table(name="track")//Reference for mysql table
public class Track {

    @Id//Primary Key
    int trackId;
    String trackName;
    String trackComments;

}
