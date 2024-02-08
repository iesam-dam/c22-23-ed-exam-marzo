package com.iesam.openbank.features.domain.models;

import com.iesam.openbank.features.domain.Movements;

public class SaveMovementsFeed {

    private MovementsRepository movementsRepository;

    public SaveMovementsFeed(MovementsRepository movementsRepository) {
        this.movementsRepository = movementsRepository;
    }

    public void execute(Movements movements){
        this.movementsRepository.saveMovements(movements);
    }
}
