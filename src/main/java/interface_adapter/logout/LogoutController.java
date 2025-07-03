package interface_adapter.logout;

import use_case.logout.LogoutInputBoundary;
import use_case.logout.LogoutInputData;

/**
 * The controller for the Logout Use Case.
 */
public class LogoutController {

    // the instance variable
    private final LogoutInputBoundary logoutUseCaseInteractor;

    public LogoutController(LogoutInputBoundary logoutUseCaseInteractor) {
        // receiving an object (logoutUseCaseInteractor) that implements the logout logic
        // need to store this object in the class to use later (like in the execute method)
        // do so by saving the interactor in the instance variable
        this.logoutUseCaseInteractor = logoutUseCaseInteractor;
    }

    /**
     * Executes the Logout Use Case.
     * @param username the username of the user logging in
     */
    // this method gets called when the user clicks "Log Out"
    // need to create a LogoutInputData object with the username
    // also need to tell the interactor to execute using that input
    public void execute(String username) {
        // 1. instantiate the `LogoutInputData`, which should contain the username.
        final LogoutInputData inputData = new LogoutInputData(username);
        // 2. tell the Interactor to execute.
        logoutUseCaseInteractor.execute(inputData);
        // this runs the use case interactor for the logout use case
    }
}
