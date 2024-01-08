package com.Darif.school;

import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class FullCoursResponse {

    private String name;
    private String email;
    List<Student> cours;
}
