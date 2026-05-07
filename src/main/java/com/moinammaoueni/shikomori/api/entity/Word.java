package com.moinammaoueni.shikomori.api.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name = "words")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Word {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String comorianWord;

    @Column(nullable = false)
    private String frenchTranslation;

    private String category;

    @Column(columnDefinition = "TEXT")
    private String exampleSentenceComorian;

    @Column(columnDefinition = "TEXT")
    private String exampleSentenceFrench;

    private String pronunciation;

    private LocalDateTime createdAt = LocalDateTime.now();

   
}
