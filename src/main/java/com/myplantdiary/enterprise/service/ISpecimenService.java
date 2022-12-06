package com.myplantdiary.enterprise.service;

import com.myplantdiary.enterprise.dto.Specimen;

public interface ISpecimenService {
    /**
     * Fetch a Specimen with a given id
     * @param id a unique identifier
     * @return a matching specimen or null
     */
    Specimen fetchById(int id);

    Specimen save(Specimen specimen) throws Exception;
}
