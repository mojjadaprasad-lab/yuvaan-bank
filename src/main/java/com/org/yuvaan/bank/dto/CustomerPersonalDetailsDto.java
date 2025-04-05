package com.org.yuvaan.bank.dto;
import lombok.*;

import java.util.Date;
@Data  // Lombok annotation to generate getters, setters, toString, equals, and hashCode
@NoArgsConstructor  // Generates a no-argument constructor
@AllArgsConstructor // Generates an all-arguments constructor
public class CustomerPersonalDetailsDto {
    private Long id;
    private String name;
    private String fatherHusbandName;
    private Date dob;
    private String phoneNumber;
    private String email;
    private String aadhaar;

}
