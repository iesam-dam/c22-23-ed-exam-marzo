package com.iesam.openbank.features.domain.models;

import com.iesam.openbank.features.domain.Movements;

public class GetMovementsFeed {

    private MovementsRepository movementsRepository;

    public GetMovementsFeed(MovementsRepository movementsRepository) {
        this.movementsRepository = movementsRepository;
    }

    public Movements execute(String idMovements){
        return this.movementsRepository.obtainMovements(idMovements);
    }
}
