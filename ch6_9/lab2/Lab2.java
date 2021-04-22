package ch6_9.lab2;

public class Lab2 {
    public static void main(String[] args) {
        SamsungGalaxyNote note8 = new SamsungGalaxyNote();
        iPhoneX iPhoneX = new iPhoneX();
        iPhone8 iPhone8 = new iPhone8();
        SamsungGalaxy s8 = new SamsungGalaxy();
        // Note 8
        System.out.println("=== Note 8 ===");
        note8.useGearVR();
        note8.transformToPC();
        note8.usePen();
        note8.launchGooglePlay();

        // iPhone X
        System.out.println("=== iPhone X ===");
        iPhoneX.useFaceId();
        iPhoneX.launchAppStore();

        // iPhone 8
        System.out.println("=== iPhone 8 ===");
        iPhone8.useTouchID();
        iPhone8.launchAppStore();

        // Galaxy S8
        System.out.println("=== Galaxy S8 ===");
        s8.useGearVR();
        s8.transformToPC();
        s8.launchGooglePlay();
    }
}
