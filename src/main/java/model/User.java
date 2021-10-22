package model;


import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class User {

    private int id;
    String name;
    private String lastName;
    private int age;
    private String email;
}
