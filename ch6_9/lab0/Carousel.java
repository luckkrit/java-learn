package ch6_9.lab0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Carousel {
    private List<String> images;
    private int width;
    private int height;
    private int interval;

    public Carousel() {
        this.images = new ArrayList<String>(Arrays.asList("Image1.jpg", "Image2.jpg"));
        this.width = 500;
        this.height = 300;
        this.interval = 3000;
    }

    /**
     * Show iamges
     */
    public void showImages() {
        for (String image :
                images) {
            System.out.println(image);
        }
    }

    /**
     * Get image from specific index
     *
     * @param index
     * @return
     */
    public String getImages(int index) {
        return this.images.get(index);
    }

    /**
     * Show images to the screen
     */
    public void show() {
        // Show carousel to screen
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "Carousel{" +
                "images=" + images +
                ", width=" + width +
                ", height=" + height +
                ", interval=" + interval +
                '}';
    }
}
