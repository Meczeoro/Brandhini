package com.mec.brandhini;

import javax.servlet.*;

/**
 * Created by Mec on 12/12/2016.
 */
public class Config implements ServletContextListener {

    public void contextInitialized(ServletContextEvent event) {
        // Do stuff during webapp's startup.
        String[] args = {};
        PuppyTest.main(args);
    }


    public void contextDestroyed(ServletContextEvent event) {
        // Do stuff during webapp's shutdown.
    }

}
