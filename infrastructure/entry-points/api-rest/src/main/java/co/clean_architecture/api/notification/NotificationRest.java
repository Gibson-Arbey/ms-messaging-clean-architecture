package co.clean_architecture.api.notification;

import co.clean_architecture.api.notification.mapper.SendNotificationRequestMapper;
import co.clean_architecture.api.notification.request.SendNotificationRequest;
import co.clean_architecture.usecase.notification.SendNotificationUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/notification")
public class NotificationRest {

    private final SendNotificationUseCase sendNotificationUseCase;

    @PostMapping
    public ResponseEntity<Void> sendNotification(@RequestBody SendNotificationRequest request) {
        sendNotificationUseCase.execute(SendNotificationRequestMapper.toCommand(request));
        return ResponseEntity.status(HttpStatus.OK).build();
    }
}
