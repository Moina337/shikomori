package com.moinammaoueni.shikomori.api.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name = "translations_history")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class TranslationHistory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String inputText;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String translatedText;

    private String sourceLang;

    private String targetLang;

    private LocalDateTime createdAt = LocalDateTime.now();

   
}
