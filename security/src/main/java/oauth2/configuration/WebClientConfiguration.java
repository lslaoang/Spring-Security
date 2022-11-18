package oauth2.configuration;
//
//import com.azure.spring.cloud.autoconfigure.aad.AadClientRegistrationRepository;
//import com.azure.spring.cloud.autoconfigure.aad.properties.AadAuthenticationProperties;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.oauth2.client.OAuth2AuthorizedClientManager;
//import org.springframework.security.oauth2.client.registration.ClientRegistration;
//import org.springframework.security.oauth2.client.registration.ClientRegistrationRepository;
//import org.springframework.security.oauth2.client.web.reactive.function.client.ServletOAuth2AuthorizedClientExchangeFilterFunction;
//import org.springframework.web.reactive.function.client.WebClient;
//
//@Configuration
//public class WebClientConfiguration {
//
//    @Bean
//    public WebClient webClient(OAuth2AuthorizedClientManager oAu2AuthorizedClientManager){
//        ServletOAuth2AuthorizedClientExchangeFilterFunction function =
//                new ServletOAuth2AuthorizedClientExchangeFilterFunction(oAu2AuthorizedClientManager);
//        return WebClient.builder()
//                .apply(function.oauth2Configuration())
//                .build();
//    }

//    @Bean
//    public ClientRegistrationRepository clientRegistrationRepository(AadAuthenticationProperties properties){
//        return new AadClientRegistrationRepository(properties);
//    }
//}
