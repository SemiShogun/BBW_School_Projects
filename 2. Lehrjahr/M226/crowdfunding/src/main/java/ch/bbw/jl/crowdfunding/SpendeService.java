package ch.bbw.jl.crowdfunding;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class SpendeService {

    private List<Spende> listVonBetragen = new ArrayList<>(
            Arrays.asList(
                    new Spende("Jamie",420.00)
            )
    );

    public List<Spende> getAllBetragen() {
        if (listVonBetragen.isEmpty()) {
            return null;
        }
        return listVonBetragen;
    }

    public void addBetrag(Spende spende) {
        listVonBetragen.add(spende);
    }

    public Double getSumOfAllBetragen() {
        Double test = listVonBetragen.stream().mapToDouble(value -> value.getBetrag()).sum();
        System.out.println(test);
        return test;
    }


}
