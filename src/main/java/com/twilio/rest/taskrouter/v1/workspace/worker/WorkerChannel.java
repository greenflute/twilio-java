/**
 * This code was generated by
 * \ / _    _  _|   _  _
 *  | (_)\/(_)(_|\/| |(/_  v1.0.0
 *       /       /       
 */

package com.twilio.rest.taskrouter.v1.workspace.worker;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.base.MoreObjects;
import com.twilio.base.Resource;
import com.twilio.converter.DateConverter;
import com.twilio.exception.ApiConnectionException;
import com.twilio.exception.ApiException;
import com.twilio.exception.RestException;
import com.twilio.http.HttpMethod;
import com.twilio.http.Request;
import com.twilio.http.Response;
import com.twilio.http.TwilioRestClient;
import com.twilio.rest.Domains;
import org.joda.time.DateTime;

import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.util.Map;
import java.util.Objects;

@JsonIgnoreProperties(ignoreUnknown = true)
public class WorkerChannel extends Resource {
    private static final long serialVersionUID = 1787446627857L;

    /**
     * Create a WorkerChannelReader to execute read.
     * 
     * @param workspaceSid The workspace_sid
     * @param workerSid The worker_sid
     * @return WorkerChannelReader capable of executing the read
     */
    public static WorkerChannelReader reader(final String workspaceSid, 
                                             final String workerSid) {
        return new WorkerChannelReader(workspaceSid, workerSid);
    }

    /**
     * Create a WorkerChannelFetcher to execute fetch.
     * 
     * @param workspaceSid The workspace_sid
     * @param workerSid The worker_sid
     * @param sid The sid
     * @return WorkerChannelFetcher capable of executing the fetch
     */
    public static WorkerChannelFetcher fetcher(final String workspaceSid, 
                                               final String workerSid, 
                                               final String sid) {
        return new WorkerChannelFetcher(workspaceSid, workerSid, sid);
    }

    /**
     * Create a WorkerChannelUpdater to execute update.
     * 
     * @param workspaceSid The workspace_sid
     * @param workerSid The worker_sid
     * @param sid The sid
     * @return WorkerChannelUpdater capable of executing the update
     */
    public static WorkerChannelUpdater updater(final String workspaceSid, 
                                               final String workerSid, 
                                               final String sid) {
        return new WorkerChannelUpdater(workspaceSid, workerSid, sid);
    }

    /**
     * Converts a JSON String into a WorkerChannel object using the provided
     * ObjectMapper.
     * 
     * @param json Raw JSON String
     * @param objectMapper Jackson ObjectMapper
     * @return WorkerChannel object represented by the provided JSON
     */
    public static WorkerChannel fromJson(final String json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, WorkerChannel.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    /**
     * Converts a JSON InputStream into a WorkerChannel object using the provided
     * ObjectMapper.
     * 
     * @param json Raw JSON InputStream
     * @param objectMapper Jackson ObjectMapper
     * @return WorkerChannel object represented by the provided JSON
     */
    public static WorkerChannel fromJson(final InputStream json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, WorkerChannel.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    private final String accountSid;
    private final Integer assignedTasks;
    private final Boolean available;
    private final Integer availableCapacityPercentage;
    private final Integer configuredCapacity;
    private final DateTime dateCreated;
    private final DateTime dateUpdated;
    private final String sid;
    private final String taskChannelSid;
    private final String taskChannelUniqueName;
    private final String workerSid;
    private final String workspaceSid;
    private final Map<String, String> links;
    private final URI url;

    @JsonCreator
    private WorkerChannel(@JsonProperty("account_sid")
                          final String accountSid, 
                          @JsonProperty("assigned_tasks")
                          final Integer assignedTasks, 
                          @JsonProperty("available")
                          final Boolean available, 
                          @JsonProperty("available_capacity_percentage")
                          final Integer availableCapacityPercentage, 
                          @JsonProperty("configured_capacity")
                          final Integer configuredCapacity, 
                          @JsonProperty("date_created")
                          final String dateCreated, 
                          @JsonProperty("date_updated")
                          final String dateUpdated, 
                          @JsonProperty("sid")
                          final String sid, 
                          @JsonProperty("task_channel_sid")
                          final String taskChannelSid, 
                          @JsonProperty("task_channel_unique_name")
                          final String taskChannelUniqueName, 
                          @JsonProperty("worker_sid")
                          final String workerSid, 
                          @JsonProperty("workspace_sid")
                          final String workspaceSid, 
                          @JsonProperty("links")
                          final Map<String, String> links, 
                          @JsonProperty("url")
                          final URI url) {
        this.accountSid = accountSid;
        this.assignedTasks = assignedTasks;
        this.available = available;
        this.availableCapacityPercentage = availableCapacityPercentage;
        this.configuredCapacity = configuredCapacity;
        this.dateCreated = DateConverter.iso8601DateTimeFromString(dateCreated);
        this.dateUpdated = DateConverter.iso8601DateTimeFromString(dateUpdated);
        this.sid = sid;
        this.taskChannelSid = taskChannelSid;
        this.taskChannelUniqueName = taskChannelUniqueName;
        this.workerSid = workerSid;
        this.workspaceSid = workspaceSid;
        this.links = links;
        this.url = url;
    }

    /**
     * Returns The The account_sid.
     * 
     * @return The account_sid
     */
    public final String getAccountSid() {
        return this.accountSid;
    }

    /**
     * Returns The The assigned_tasks.
     * 
     * @return The assigned_tasks
     */
    public final Integer getAssignedTasks() {
        return this.assignedTasks;
    }

    /**
     * Returns The The available.
     * 
     * @return The available
     */
    public final Boolean getAvailable() {
        return this.available;
    }

    /**
     * Returns The The available_capacity_percentage.
     * 
     * @return The available_capacity_percentage
     */
    public final Integer getAvailableCapacityPercentage() {
        return this.availableCapacityPercentage;
    }

    /**
     * Returns The The configured_capacity.
     * 
     * @return The configured_capacity
     */
    public final Integer getConfiguredCapacity() {
        return this.configuredCapacity;
    }

    /**
     * Returns The The date_created.
     * 
     * @return The date_created
     */
    public final DateTime getDateCreated() {
        return this.dateCreated;
    }

    /**
     * Returns The The date_updated.
     * 
     * @return The date_updated
     */
    public final DateTime getDateUpdated() {
        return this.dateUpdated;
    }

    /**
     * Returns The The sid.
     * 
     * @return The sid
     */
    public final String getSid() {
        return this.sid;
    }

    /**
     * Returns The The task_channel_sid.
     * 
     * @return The task_channel_sid
     */
    public final String getTaskChannelSid() {
        return this.taskChannelSid;
    }

    /**
     * Returns The The task_channel_unique_name.
     * 
     * @return The task_channel_unique_name
     */
    public final String getTaskChannelUniqueName() {
        return this.taskChannelUniqueName;
    }

    /**
     * Returns The The worker_sid.
     * 
     * @return The worker_sid
     */
    public final String getWorkerSid() {
        return this.workerSid;
    }

    /**
     * Returns The The workspace_sid.
     * 
     * @return The workspace_sid
     */
    public final String getWorkspaceSid() {
        return this.workspaceSid;
    }

    /**
     * Returns The The links.
     * 
     * @return The links
     */
    public final Map<String, String> getLinks() {
        return this.links;
    }

    /**
     * Returns The The url.
     * 
     * @return The url
     */
    public final URI getUrl() {
        return this.url;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        
        WorkerChannel other = (WorkerChannel) o;
        
        return Objects.equals(accountSid, other.accountSid) && 
               Objects.equals(assignedTasks, other.assignedTasks) && 
               Objects.equals(available, other.available) && 
               Objects.equals(availableCapacityPercentage, other.availableCapacityPercentage) && 
               Objects.equals(configuredCapacity, other.configuredCapacity) && 
               Objects.equals(dateCreated, other.dateCreated) && 
               Objects.equals(dateUpdated, other.dateUpdated) && 
               Objects.equals(sid, other.sid) && 
               Objects.equals(taskChannelSid, other.taskChannelSid) && 
               Objects.equals(taskChannelUniqueName, other.taskChannelUniqueName) && 
               Objects.equals(workerSid, other.workerSid) && 
               Objects.equals(workspaceSid, other.workspaceSid) && 
               Objects.equals(links, other.links) && 
               Objects.equals(url, other.url);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountSid,
                            assignedTasks,
                            available,
                            availableCapacityPercentage,
                            configuredCapacity,
                            dateCreated,
                            dateUpdated,
                            sid,
                            taskChannelSid,
                            taskChannelUniqueName,
                            workerSid,
                            workspaceSid,
                            links,
                            url);
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                          .add("accountSid", accountSid)
                          .add("assignedTasks", assignedTasks)
                          .add("available", available)
                          .add("availableCapacityPercentage", availableCapacityPercentage)
                          .add("configuredCapacity", configuredCapacity)
                          .add("dateCreated", dateCreated)
                          .add("dateUpdated", dateUpdated)
                          .add("sid", sid)
                          .add("taskChannelSid", taskChannelSid)
                          .add("taskChannelUniqueName", taskChannelUniqueName)
                          .add("workerSid", workerSid)
                          .add("workspaceSid", workspaceSid)
                          .add("links", links)
                          .add("url", url)
                          .toString();
    }
}