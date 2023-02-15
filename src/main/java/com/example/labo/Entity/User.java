package com.example.labo.Entity;
import lombok.*;
import lombok.experimental.FieldDefaults;


import javax.persistence.*;
import java.io.Serializable;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@ToString

@Entity
public class User implements Serializable {
    private static final long haja= 1L;
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    Integer idUser ;
    String nom ;
    String prenom ;
    int phone ;
    String email ;
    String password ;
    Role role ;
    int salaire ; // pour le formateur et le chef service et les biologiste
    int work_day_number ; // pour les biologiste
    int holiday_number ; // pour les biologiste
    String Social_number ; // pour les patient



}
