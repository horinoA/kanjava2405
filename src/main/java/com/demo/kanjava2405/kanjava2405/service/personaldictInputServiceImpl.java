package com.demo.kanjava2405.kanjava2405.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.demo.kanjava2405.kanjava2405.model.personaldictInput;
import com.demo.kanjava2405.kanjava2405.repository.personaldictInputRepository;

public class personaldictInputServiceImpl implements personaldictInputService{

    @Autowired
    personaldictInputRepository personaldictInputRepository;

    @Override
    public Integer savepersonaldict(personaldictInput personaldictInput) {
        Long getid = personaldictInputRepository.findBymaxid();
        personaldictInput savePerson = new personaldictInput(getid, personaldictInput.lastname(), personaldictInput.firstname(), personaldictInput.lastnamekana(), personaldictInput.firstnamekana(), personaldictInput.email(), personaldictInput.contactphone(), personaldictInput.postalcode(), personaldictInput.prefectures(), personaldictInput.address(), personaldictInput.birthdate());
        personaldictInputRepository.save(savePerson);
        return 0;
    }

}
