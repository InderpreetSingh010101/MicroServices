package com.user.entites;

import com.user.dto.ContactDto;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId ;

    private String name ;


    @Transient
    private List<ContactDto> contactList ;

}
