package edu.fra.uas.v3autowired;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@Component
@Qualifier("pleaseTile")
public class Tiling implements Work {
    private static final Logger LOGGER = LoggerFactory.getLogger(Tiling.class);

    @Override
    public void doWork() {
        LOGGER.info(" --> tiling the floor with fancy tiles");
    }
}
