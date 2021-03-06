/*
 * KomMonitor Data Access API
 * erster Entwurf einer Datenzugriffs-API, die den Zugriff auf die KomMonitor-Datenhaltungsschicht kapselt.
 *
 * OpenAPI spec version: 0.0.1
 * Contact: christian.danowski-buhren@hs-bochum.de
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package org.n52.kommonitor.datamanagement.api.client;

import org.junit.Test;
import org.junit.Ignore;
import org.n52.kommonitor.models.UserInputType;
import org.n52.kommonitor.models.UserOverviewType;

import java.util.List;

/**
 * API tests for UsersApi
 */
@Ignore
public class UsersApiIT {

    private final UsersApi api = new UsersApi();


    /**
     * Register a new user
     * <p>
     * Add/Register a user
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void addUserTest() {
        UserInputType userData = null;
        api.addUser(userData);

        // TODO: test validations
    }

    /**
     * Delete the user
     * <p>
     * Delete the user
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteUserTest() {
        String userId = null;
        api.deleteUser(userId);

        // TODO: test validations
    }

    /**
     * retrieve information about the selected user and his/her role
     * <p>
     * retrieve information about the selected user and his/her role
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getUserByIdTest() {
        String userId = null;
        UserOverviewType response = api.getUserById(userId);

        // TODO: test validations
    }

    /**
     * retrieve information about available users and their roles
     * <p>
     * retrieve information about available users and their roles
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getUsersTest() {
        List<UserOverviewType> response = api.getUsers();

        // TODO: test validations
    }

    /**
     * Modify user information
     * <p>
     * Modify user information
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateUserTest() {
        String userId = null;
        UserInputType userData = null;
        api.updateUser(userId, userData);

        // TODO: test validations
    }

}
