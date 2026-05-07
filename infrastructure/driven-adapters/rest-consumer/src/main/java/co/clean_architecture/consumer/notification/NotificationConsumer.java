package co.clean_architecture.consumer.notification;

import co.clean_architecture.model.notification.Notification;
import co.clean_architecture.model.notification.gateways.NotificationRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestClient;

@Slf4j
@Component
@RequiredArgsConstructor
public class NotificationConsumer implements NotificationRepository {

    private final RestClient restClient;

    @Override
    public void send(Notification notification) {
        try {
            restClient.post()
                    .uri("/api/v1/notification/send")
                    .body(notification)
                    .retrieve()
                    .body(Void.class);
        } catch (Exception e) {
            log.error("Error consuming notification service: {}", e.getMessage());
        }
    }
}
