package com.guppy.core.domain.enums;

/**
 * Created by kanghonggu on 2017. 7. 5..
 */
public enum SocialType {
    FACEBOOK("facebook"),
    TWITTER("twitter"),
    GOOGLE("google"),
    KAKAO("kakao");

    private final String ROLE_PREFIX = "ROLE_";
    private String name;

    SocialType(String name) {
        this.name = name;
    }

    public String getRoleType() { return ROLE_PREFIX + name.toUpperCase(); }

    public String getValue() { return name; }

    public boolean isEquals(String authority) {
        return this.getRoleType().equals(authority);
    }

}
