package edu.byu.cs.tweeter.client.model.service.observer;

import edu.byu.cs.tweeter.model.domain.AuthToken;
import edu.byu.cs.tweeter.model.domain.User;

/**
 * An observer interface to be implemented by observers who want to be notified when
 * asynchronous operations complete.
 */
public interface LoginObserver {
    void handleSuccess(User user, AuthToken authToken);

    void handleFailure(String message);

    void handleException(Exception exception);
}
