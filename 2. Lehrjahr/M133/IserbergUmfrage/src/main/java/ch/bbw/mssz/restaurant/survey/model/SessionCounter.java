package ch.bbw.mssz.restaurant.survey.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * SessionCounter
 *
 * @author Matthias Stierlin
 * @version 02.07.2020
 */
@Component
@Scope(value = "session", proxyMode = ScopedProxyMode.TARGET_CLASS)
public class SessionCounter {

    @Autowired
    ApplicationCounter surveyCounter;

    @PostConstruct
    public void setup() {
        System.out.println("setup");
        surveyCounter.incrementCountOverall();
        surveyCounter.incrementCountOpenSessions();
        System.out.println("SurveyCounter::setup():@PostConstruct: ");
    }

    @PreDestroy
    public void shutdown() {
        surveyCounter.decrementCountOpenSessions();
        System.out.println("SurveyCounter::shutdown():@PreDestroy: ");
    }

    @Override
    public String toString() {
        return "SessionCounter [" + surveyCounter + "]";
    }


}
