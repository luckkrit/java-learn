package ch6_9.lab0;

public class Shopee {
    private final Notification notification;
    private final SearchBar searchBar;
    private final Carousel carousel;

    public Shopee() {
        this.notification = new Notification();
        this.searchBar = new SearchBar();
        this.carousel = new Carousel();
    }

    public void showNotification() {
        this.notification.show();
    }

    public void showSearchBar() {
        this.searchBar.show();
    }

    public void showCarousel() {
        this.carousel.show();
    }
}
