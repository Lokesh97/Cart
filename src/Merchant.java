

public class Merchant {

    private int merchantId;

    private String merchantName;

    private double merchantRating;

    private String merchantContact;

    public Merchant(int merchantId, String merchantName, double merchantRating, String merchantContact) {
        this.merchantId = merchantId;
        this.merchantName = merchantName;
        this.merchantRating = merchantRating;
        this.merchantContact = merchantContact;
    }

    public int getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(int merchantId) {
        this.merchantId = merchantId;
    }

    public String getMerchantName() {
        return merchantName;
    }

    public void setMerchantName(String merchantName) {
        this.merchantName = merchantName;
    }

    public double getMerchantRating() {
        return merchantRating;
    }

    public void setMerchantRating(double merchantRating) {
        this.merchantRating = merchantRating;
    }

    public String getMerchantContact() {
        return merchantContact;
    }

    public void setMerchantContact(String merchantContact) {
        this.merchantContact = merchantContact;
    }
}
