package ch6_9.lab0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Notification {
    private List<String> notifications;
    private String registerText;
    private String loginText;

    public Notification() {
        this.notifications = new ArrayList<String>(Arrays.asList("Notification 1", "Notification 2"));
        this.registerText = "Register";
        this.loginText = "Login";
    }

    /**
     * Return notification at specific index
     *
     * @param index
     * @return String at index
     */
    public String getNotification(int index) {
        return this.notifications.get(index);
    }

    /**
     * Remove notification at specific index
     *
     * @param index
     */
    public void deleteNotification(int index) {
        this.notifications.remove(index);
    }

    /**
     * Show notification to screen
     */
    public void show() {
        // Show notification to screen
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "Notification{" +
                "notifications=" + notifications +
                ", registerText='" + registerText + '\'' +
                ", loginText='" + loginText + '\'' +
                '}';
    }
}
