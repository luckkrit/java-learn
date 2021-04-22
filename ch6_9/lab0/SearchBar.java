package ch6_9.lab0;

public class SearchBar {
    private String queryString;
    private String placeholder;
    private int width;
    private int height;

    public SearchBar() {
        setQueryString("");
        setPlaceholder("Search products and shops");
        setWidth(500);
        setHeight(50);
    }

    /**
     * set width of searchbar
     *
     * @param width
     */
    public void setWidth(int width) {
        this.width = width;
    }

    /**
     * set height of searchbar
     *
     * @param height
     */
    public void setHeight(int height) {
        this.height = height;
    }

    /**
     * set querystring for search
     *
     * @param queryString
     */
    public void setQueryString(String queryString) {
        this.queryString = queryString;
    }

    /**
     * Search products or shops
     */
    public void search() {
        // Search by query string
        System.out.println("Search for query : " + this.queryString);
    }

    /**
     * set placholder text
     *
     * @param placeholder
     */
    private void setPlaceholder(String placeholder) {
        this.placeholder = placeholder;
    }

    /**
     * show Searchbar on screen
     */
    public void show() {
        // Show searchbar to screen
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "SearchBar{" +
                "queryString='" + queryString + '\'' +
                ", placeholder='" + placeholder + '\'' +
                ", width=" + width +
                ", height=" + height +
                '}';
    }
}
