package task4.models;

public class Order {
    private String title;
    private Integer price;
    private Integer jlmhPesan;
    private float totalSementara;
    
    public Order(String title, Integer price, Integer jlmhPesan) {
        this.title = title;
        this.price = price;
        this.jlmhPesan = jlmhPesan;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getJlmhPesan() {
        return jlmhPesan;
    }

    public void setJlmhPesan(Integer jlmhPesan) {
        this.jlmhPesan = jlmhPesan;
    }

    public float getTotalSementara() {
        totalSementara=(price*jlmhPesan);
        return totalSementara;
    }

    @Override
    public String toString() {
        return title + " - " + price + " jlmh: " + jlmhPesan + " total " + getTotalSementara();
    }
}
