package com.example.signinoutlab4.firebase;

import android.util.Log;

import androidx.annotation.NonNull;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;

public class MessagingService extends FirebaseMessagingService {
    /**
     * This method creates a new token to be used for a message, the token and message are linked.
     * @param token The token used for sending messages to this application instance. This token is
     *     the same as the one retrieved.
     */
    @Override
    public void onNewToken(@NonNull String token) {
        super.onNewToken(token);
        Log.d("FCM","Token: " + token);
    }

    /**
     * This method receives messages from the Firebase Database that is connected.
     * @param message Remote message that has been received.
     */
    @Override
    public void onMessageReceived(@NonNull RemoteMessage message) {
        super.onMessageReceived(message);
        Log.d("FCM","460Message: "+message.getNotification().getBody());
    }
}
