package id.ac.pelitabangsa.uas_jamaludin.data;

import java.io.IOException;

import id.ac.pelitabangsa.uas_jamaludin.data.model.LoggedInUser;

/**
 * Class that handles authentication w/ login credentials and retrieves user information.
 */
public class LoginDataSource {
    public Result<LoggedInUser> login(String username, String password) {

        try {
            // TODO: handle loggedInUser authentication
            LoggedInUser fakeUser =
                    new LoggedInUser(
                            java.util.UUID.randomUUID().toString(),
                            "jane Doe");
            return new Result.Success<>(fakeUser);
        } catch (Exception e) {
            return new Result.Error(new IOException("Error logging", e));
        }
    }

    public void logout(){
        // TODO: revoke authentication
    }
}


