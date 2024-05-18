package com.demo.kanjava2405.kanjava2405.repository;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;

import com.demo.kanjava2405.kanjava2405.model.personaldictInput;

public interface personaldictInputRepository extends CrudRepository<personaldictInput,Integer>{

    @Query("select id_generator()")
    Long findBymaxid();

}
