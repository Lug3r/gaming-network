package org.launchcode.thegamingnetwork.models;

public interface BCryptPasswordEncoder {
    String encode(String password);

    boolean matches(String password, String pwHash);
}
