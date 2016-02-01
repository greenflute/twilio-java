package com.twilio.sdk.resources.api.v2010.account.address;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.base.MoreObjects;
import com.twilio.sdk.clients.TwilioRestClient;
import com.twilio.sdk.exceptions.ApiConnectionException;
import com.twilio.sdk.exceptions.ApiException;
import com.twilio.sdk.http.HttpMethod;
import com.twilio.sdk.http.Request;
import com.twilio.sdk.http.Response;
import com.twilio.sdk.readers.api.v2010.account.address.DependentPhoneNumberReader;
import com.twilio.sdk.resources.Resource;
import com.twilio.sdk.resources.RestException;

import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.util.Map;
import java.util.Objects;

@JsonIgnoreProperties(ignoreUnknown = true)
public class DependentPhoneNumber extends Resource {
    private static final long serialVersionUID = 249031953071048L;

    /**
     * read
     * 
     * @param accountSid The account_sid
     * @param addressSid The address_sid
     * @return DependentPhoneNumberReader capable of executing the read
     */
    public static DependentPhoneNumberReader read(final String accountSid, final String addressSid) {
        return new DependentPhoneNumberReader(accountSid, addressSid);
    }

    /**
     * Converts a JSON String into a DependentPhoneNumber object using the provided
     * ObjectMapper
     * 
     * @param json Raw JSON String
     * @param objectMapper Jackson ObjectMapper
     * @return DependentPhoneNumber object represented by the provided JSON
     */
    public static DependentPhoneNumber fromJson(final String json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, DependentPhoneNumber.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    /**
     * Converts a JSON InputStream into a DependentPhoneNumber object using the
     * provided ObjectMapper
     * 
     * @param json Raw JSON InputStream
     * @param objectMapper Jackson ObjectMapper
     * @return DependentPhoneNumber object represented by the provided JSON
     */
    public static DependentPhoneNumber fromJson(final InputStream json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, DependentPhoneNumber.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    private final com.twilio.types.PhoneNumber friendlyName;
    private final com.twilio.types.PhoneNumber phoneNumber;
    private final String lata;
    private final String rateCenter;
    private final BigDecimal latitude;
    private final BigDecimal longitude;
    private final String region;
    private final String postalCode;
    private final String isoCountry;
    private final String addressRequirements;
    private final Map<String, String> capabilities;

    @JsonCreator
    private DependentPhoneNumber(@JsonProperty("friendly_name")
                                 final com.twilio.types.PhoneNumber friendlyName, 
                                 @JsonProperty("phone_number")
                                 final com.twilio.types.PhoneNumber phoneNumber, 
                                 @JsonProperty("lata")
                                 final String lata, 
                                 @JsonProperty("rate_center")
                                 final String rateCenter, 
                                 @JsonProperty("latitude")
                                 final BigDecimal latitude, 
                                 @JsonProperty("longitude")
                                 final BigDecimal longitude, 
                                 @JsonProperty("region")
                                 final String region, 
                                 @JsonProperty("postal_code")
                                 final String postalCode, 
                                 @JsonProperty("iso_country")
                                 final String isoCountry, 
                                 @JsonProperty("address_requirements")
                                 final String addressRequirements, 
                                 @JsonProperty("capabilities")
                                 final Map<String, String> capabilities) {
        this.friendlyName = friendlyName;
        this.phoneNumber = phoneNumber;
        this.lata = lata;
        this.rateCenter = rateCenter;
        this.latitude = latitude;
        this.longitude = longitude;
        this.region = region;
        this.postalCode = postalCode;
        this.isoCountry = isoCountry;
        this.addressRequirements = addressRequirements;
        this.capabilities = capabilities;
    }

    /**
     * @return The friendly_name
     */
    public final com.twilio.types.PhoneNumber getFriendlyName() {
        return this.friendlyName;
    }

    /**
     * @return The phone_number
     */
    public final com.twilio.types.PhoneNumber getPhoneNumber() {
        return this.phoneNumber;
    }

    /**
     * @return The lata
     */
    public final String getLata() {
        return this.lata;
    }

    /**
     * @return The rate_center
     */
    public final String getRateCenter() {
        return this.rateCenter;
    }

    /**
     * @return The latitude
     */
    public final BigDecimal getLatitude() {
        return this.latitude;
    }

    /**
     * @return The longitude
     */
    public final BigDecimal getLongitude() {
        return this.longitude;
    }

    /**
     * @return The region
     */
    public final String getRegion() {
        return this.region;
    }

    /**
     * @return The postal_code
     */
    public final String getPostalCode() {
        return this.postalCode;
    }

    /**
     * @return The iso_country
     */
    public final String getIsoCountry() {
        return this.isoCountry;
    }

    /**
     * @return The address_requirements
     */
    public final String getAddressRequirements() {
        return this.addressRequirements;
    }

    /**
     * @return The capabilities
     */
    public final Map<String, String> getCapabilities() {
        return this.capabilities;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        
        DependentPhoneNumber other = (DependentPhoneNumber) o;
        
        return Objects.equals(friendlyName, other.friendlyName) && 
               Objects.equals(phoneNumber, other.phoneNumber) && 
               Objects.equals(lata, other.lata) && 
               Objects.equals(rateCenter, other.rateCenter) && 
               Objects.equals(latitude, other.latitude) && 
               Objects.equals(longitude, other.longitude) && 
               Objects.equals(region, other.region) && 
               Objects.equals(postalCode, other.postalCode) && 
               Objects.equals(isoCountry, other.isoCountry) && 
               Objects.equals(addressRequirements, other.addressRequirements) && 
               Objects.equals(capabilities, other.capabilities);
    }

    @Override
    public int hashCode() {
        return Objects.hash(friendlyName,
                            phoneNumber,
                            lata,
                            rateCenter,
                            latitude,
                            longitude,
                            region,
                            postalCode,
                            isoCountry,
                            addressRequirements,
                            capabilities);
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                          .add("friendlyName", friendlyName)
                          .add("phoneNumber", phoneNumber)
                          .add("lata", lata)
                          .add("rateCenter", rateCenter)
                          .add("latitude", latitude)
                          .add("longitude", longitude)
                          .add("region", region)
                          .add("postalCode", postalCode)
                          .add("isoCountry", isoCountry)
                          .add("addressRequirements", addressRequirements)
                          .add("capabilities", capabilities)
                          .toString();
    }
}