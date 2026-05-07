package com.moinammaoueni.shikomori.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.moinammaoueni.shikomori.api.entity.Word;

public interface WordRepository extends JpaRepository<Word, Long> {

}
