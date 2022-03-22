package edu.byu.cs.tweeter.client.model.service.observer;

import java.util.List;

import edu.byu.cs.tweeter.model.domain.User;

/**
 * An observer interface to be implemented by observers who want to be notified when
 * asynchronous operations complete.
 */
public interface GetFollowingObserver {
    void handleSuccess(List<User> followees, boolean hasMorePages);

    void handleFailure(String message);

    void handleException(Exception exception);
}
