/**
 * This code was generated by
 * \ / _    _  _|   _  _
 *  | (_)\/(_)(_|\/| |(/_  v1.0.0
 *       /       /       
 */

package com.twilio.rest.taskrouter.v1.workspace;

import com.twilio.base.Fetcher;
import com.twilio.exception.ApiConnectionException;
import com.twilio.exception.ApiException;
import com.twilio.exception.RestException;
import com.twilio.http.HttpMethod;
import com.twilio.http.Request;
import com.twilio.http.Response;
import com.twilio.http.TwilioRestClient;
import com.twilio.rest.Domains;

public class WorkspaceStatisticsFetcher extends Fetcher<WorkspaceStatistics> {
    private final String workspaceSid;
    private Integer minutes;
    private String startDate;
    private String endDate;

    /**
     * Construct a new WorkspaceStatisticsFetcher.
     * 
     * @param workspaceSid The workspace_sid
     */
    public WorkspaceStatisticsFetcher(final String workspaceSid) {
        this.workspaceSid = workspaceSid;
    }

    /**
     * The minutes.
     * 
     * @param minutes The minutes
     * @return this
     */
    public WorkspaceStatisticsFetcher setMinutes(final Integer minutes) {
        this.minutes = minutes;
        return this;
    }

    /**
     * The start_date.
     * 
     * @param startDate The start_date
     * @return this
     */
    public WorkspaceStatisticsFetcher setStartDate(final String startDate) {
        this.startDate = startDate;
        return this;
    }

    /**
     * The end_date.
     * 
     * @param endDate The end_date
     * @return this
     */
    public WorkspaceStatisticsFetcher setEndDate(final String endDate) {
        this.endDate = endDate;
        return this;
    }

    /**
     * Make the request to the Twilio API to perform the fetch.
     * 
     * @param client TwilioRestClient with which to make the request
     * @return Fetched WorkspaceStatistics
     */
    @Override
    @SuppressWarnings("checkstyle:linelength")
    public WorkspaceStatistics fetch(final TwilioRestClient client) {
        Request request = new Request(
            HttpMethod.GET,
            Domains.TASKROUTER.toString(),
            "/v1/Workspaces/" + this.workspaceSid + "/Statistics",
            client.getRegion()
        );
        
        addQueryParams(request);
        Response response = client.request(request);
        
        if (response == null) {
            throw new ApiConnectionException("WorkspaceStatistics fetch failed: Unable to connect to server");
        } else if (!TwilioRestClient.SUCCESS.apply(response.getStatusCode())) {
            RestException restException = RestException.fromJson(response.getStream(), client.getObjectMapper());
            if (restException == null) {
                throw new ApiException("Server Error, no content");
            }
        
            throw new ApiException(
                restException.getMessage(),
                restException.getCode(),
                restException.getMoreInfo(),
                restException.getStatus(),
                null
            );
        }
        
        return WorkspaceStatistics.fromJson(response.getStream(), client.getObjectMapper());
    }

    /**
     * Add the requested query string arguments to the Request.
     * 
     * @param request Request to add query string arguments to
     */
    private void addQueryParams(final Request request) {
        if (minutes != null) {
            request.addQueryParam("Minutes", minutes.toString());
        }
        
        if (startDate != null) {
            request.addQueryParam("StartDate", startDate);
        }
        
        if (endDate != null) {
            request.addQueryParam("EndDate", endDate);
        }
    }
}