package com.moinammaoueni.shikomori.api.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name = "user_favorites")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserFavorite {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private User user;

    @ManyToOne
    private Word word;

    private LocalDateTime createdAt = LocalDateTime.now();

    
}
