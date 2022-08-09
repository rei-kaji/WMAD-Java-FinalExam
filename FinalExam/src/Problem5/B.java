package Problem5;

public class B {
    private String Protocol;
    private String BaseURL;
    private String ResourceAddress;

    public B(String protocol, String baseURL, String resourceAddress) {
        Protocol = protocol;
        BaseURL = baseURL;
        ResourceAddress = resourceAddress;
    }

    public String getURL() {
        String result = this.Protocol + "://www." + this.BaseURL + "/" + this.ResourceAddress;
        return result;
    }
}
