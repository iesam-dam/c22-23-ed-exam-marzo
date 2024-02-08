package com.iesam.openbank.features.data;

import com.iesam.openbank.features.domain.Movements;
import com.iesam.openbank.features.domain.models.MovementsRepository;

import java.util.ArrayList;

public class MovementsDataRepository implements MovementsRepository {

    private ArrayList<Movements> localMovements = new ArrayList<>();
    private static MovementsDataRepository instance = null;

    public static MovementsDataRepository newInstance() {
        if (instance == null)
            instance = new MovementsDataRepository();
        return instance;
    }

    @Override
    public Movements obtainMovements(String id) {
        for (Movements movements : localMovements)
            if (movements.getId().equals(id))
                return movements;
        return null;
    }

    @Override
    public void saveMovements(Movements movements) {
        localMovements.add(movements);
    }
}
