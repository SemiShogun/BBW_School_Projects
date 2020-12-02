package ch.bbw.mssz.restaurant.survey.model;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Rating
 *
 * @author Matthias Stierlin
 * @version 02.07.2020
 */
@Component
@Scope(value = "session", proxyMode = ScopedProxyMode.TARGET_CLASS)
public class Rating {

    private List<String> ratings = new ArrayList<>(Arrays.asList(
            "1 Stern",
            "2 Stern",
            "3 Stern",
            "4 Stern",
            "5 Stern"
    ));

    String rating;

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public List<String> getRatings() {
        return ratings;
    }
}
