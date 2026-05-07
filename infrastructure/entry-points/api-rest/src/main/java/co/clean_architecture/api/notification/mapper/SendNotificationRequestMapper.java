package co.clean_architecture.api.notification.mapper;

import co.clean_architecture.api.notification.request.SendNotificationRequest;
import co.clean_architecture.usecase.notification.command.SendNotificationCommand;

public class SendNotificationRequestMapper {

    public static SendNotificationCommand toCommand(SendNotificationRequest request) {
        if(request == null) return null;
        return new SendNotificationCommand(request.getRecipient(), request.getMessage());
    }
}
