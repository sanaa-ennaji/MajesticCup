package org.sanaa.brif10.majesticcup.model.entity;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "users")
public class User {
    private String id;
    private String username;
    private String password;
    private Role role;

}