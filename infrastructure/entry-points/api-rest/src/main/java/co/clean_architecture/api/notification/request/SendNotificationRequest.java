package co.clean_architecture.api.notification.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SendNotificationRequest {

    private String recipient;

    private String message;
}
