package rest.test.config;


import org.aeonbits.owner.Config;

/**
 * @author amatsaylo on 10/15/19
 * @project rest-automation
 */

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({"file:/opt/config/rest-test.properties",
        "classpath:config/rest-test.properties"})
public interface QREConfig extends Config {

    @DefaultValue("${java.home}")
    String javaHome();

    @DefaultValue("${user.home}")
    String userHome();

}

