package com.fox.furryqrcode.data.model;

/**
 * Data class that captures user information for logged in users retrieved from LoginRepository
 */
public class LoggedInUser {

    private String userId;
    private String displayName;
    private String base64Head;

    public LoggedInUser(String userId, String displayName, String base64Head) {
        this.userId = userId;
        this.displayName = displayName;
        this.base64Head = base64Head;
    }

    public String getUserId() {
        return userId;
    }

    public String getDisplayName() {
        return displayName;
    }

    public String getHead() {
        return base64Head;
    }
}
