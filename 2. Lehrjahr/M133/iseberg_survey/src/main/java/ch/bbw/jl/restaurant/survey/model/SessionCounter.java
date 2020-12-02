package ch.bbw.jl.restaurant.survey.model;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
@Scope(value="session", proxyMode = ScopedProxyMode.TARGET_CLASS)
public class SessionCounter {

    private static int countOpenSessions = 0;

    @PostConstruct
    public void setup() {
        countOpenSessions++;
    }

    @PreDestroy
    public void shutdown() {
        countOpenSessions--;
    }

}
