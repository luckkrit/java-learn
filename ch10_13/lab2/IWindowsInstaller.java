package ch10_13.lab2;

public interface IWindowsInstaller {
    void formatWindows();

    void installWindows(String version, String productKey);

    String getLastInstalledWindowsVersion();
}
