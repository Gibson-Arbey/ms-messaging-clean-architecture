package co.clean_architecture.model.notification.gateways;

import co.clean_architecture.model.notification.Notification;

public interface NotificationRepository {

    void send(Notification notification);
}
