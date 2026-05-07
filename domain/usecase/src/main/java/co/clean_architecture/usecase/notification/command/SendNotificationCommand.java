package co.clean_architecture.usecase.notification.command;

public record SendNotificationCommand(String recipient, String message) {
}
