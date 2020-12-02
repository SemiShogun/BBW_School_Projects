package ch.bbw.jl.sport_table.service;

import ch.bbw.jl.sport_table.entity.Sport;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class SportService {

    private List<Sport> sports = new ArrayList<>(Arrays.asList(
            new Sport("Johnny","Test"),
            new Sport("Vue is better than","React")
    ));

    public List<Sport> getAllSports() {
        if (sports.isEmpty()) {
            return null;
        }
        return sports;
    }

    public void addSport(Sport sport) {
        sports.add(sport);
    }

}
