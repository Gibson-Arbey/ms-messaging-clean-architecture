package co.clean_architecture.usecase.notification;

import co.clean_architecture.model.notification.Notification;
import co.clean_architecture.model.notification.gateways.NotificationRepository;
import co.clean_architecture.usecase.notification.command.SendNotificationCommand;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class SendNotificationUseCase {

    private final NotificationRepository notificationRepository;

    public void execute(SendNotificationCommand command) {
        Notification notification = Notification.create(command.recipient(), command.message());
        notificationRepository.send(notification);
    }
}
