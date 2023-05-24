package com.user.entites;

import com.user.dto.ContactDto;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
public class Contact {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cid ;

    private String email ;
    private String phone ;

    private Long uid ;

}
