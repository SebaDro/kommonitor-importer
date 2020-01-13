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
import org.n52.kommonitor.datamanagement.api.models.TopicInputType;
import org.n52.kommonitor.datamanagement.api.models.TopicOverviewType;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for TopicsApi
 */
@Ignore
public class TopicsApiTest {

    private final TopicsApi api = new TopicsApi();

    
    /**
     * Register a new topic
     *
     * Add/Register a topic
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addTopicTest() {
        TopicInputType topicData = null;
        api.addTopic(topicData);

        // TODO: test validations
    }
    
    /**
     * Delete the topic
     *
     * Delete the topic
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteTopicTest() {
        String topicId = null;
        api.deleteTopic(topicId);

        // TODO: test validations
    }
    
    /**
     * retrieve information about the selected topic
     *
     * retrieve information about the selected topic
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTopicByIdTest() {
        String topicId = null;
        TopicOverviewType response = api.getTopicById(topicId);

        // TODO: test validations
    }
    
    /**
     * retrieve information about available topics
     *
     * retrieve information about available topics
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTopicsTest() {
        List<TopicOverviewType> response = api.getTopics();

        // TODO: test validations
    }
    
    /**
     * Modify topic information
     *
     * Modify topic information
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateTopicTest() {
        String topicId = null;
        TopicInputType topicData = null;
        api.updateTopic(topicId, topicData);

        // TODO: test validations
    }
    
}
