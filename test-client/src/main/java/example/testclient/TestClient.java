package example.testclient;

import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.impl.conn.PoolingHttpClientConnectionManager;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

// this program to test how connection pool works.
// start the server first (app module)
public class TestClient {

    public static void main(String[] args) {
        RestTemplate restTemplate = new RestTemplate(httpComponentsClientHttpRequestFactory());

        //recursiveCall(restTemplate);
        repeatCall(restTemplate);
    }

    private static void recursiveCall(RestTemplate restTemplate) {
        String result = restTemplate.getForObject("http://localhost:8080/greeting/me", String.class);
        System.out.println(result);
        recursiveCall(restTemplate);
    }

    private static void repeatCall(RestTemplate restTemplate) {
        while(true) {
            String result = restTemplate.getForObject("http://localhost:8080/greeting/me", String.class);
            System.out.println(result);
        }
    }

    private static HttpComponentsClientHttpRequestFactory httpComponentsClientHttpRequestFactory() {
        HttpComponentsClientHttpRequestFactory clientHttpRequestFactory = new HttpComponentsClientHttpRequestFactory();
        clientHttpRequestFactory.setHttpClient(httpClient());
        return clientHttpRequestFactory;
    }

    private static PoolingHttpClientConnectionManager poolingHttpClientConnectionManager() {
        PoolingHttpClientConnectionManager manager = new PoolingHttpClientConnectionManager();
        manager.setMaxTotal(5);
        return manager;
    }

    private static CloseableHttpClient httpClient() {
        return HttpClients.createMinimal(poolingHttpClientConnectionManager());
    }
}
