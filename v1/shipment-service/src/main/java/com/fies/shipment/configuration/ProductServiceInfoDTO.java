package com.fies.shipment.configuration;

public class ProductServiceInfoDTO {
    private String url;
    private String apiKey;
    public static ProductServiceInfoDTO of(String url, String apiKey) {
        ProductServiceInfoDTO infoDTO = new ProductServiceInfoDTO();
        infoDTO.setUrl(url);
        infoDTO.setApiKey(apiKey);
        return infoDTO;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getApiKey() {
        return apiKey;
    }

    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }
}
