package com.iesam.openbank.features.domain.models;

import com.iesam.openbank.features.domain.Movements;

public interface MovementsRepository {
    Movements obtainMovements(String id);

    void saveMovements(Movements movements);
}
