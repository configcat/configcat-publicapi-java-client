/*
 * ConfigCat Public Management API
 * The purpose of this API is to access the ConfigCat platform programmatically. You can **Create**, **Read**, **Update** and **Delete** any entities like **Feature Flags, Configs, Environments** or **Products** within ConfigCat.  **Base API URL**: https://api.configcat.com  If you prefer the swagger documentation, you can find it here: [Swagger UI](https://api.configcat.com/swagger).  The API is based on HTTP REST, uses resource-oriented URLs, status codes and supports JSON  format.   **Important:** Do not use this API for accessing and evaluating feature flag values. Use the [SDKs](https://configcat.com/docs/sdk-reference/overview) or the [ConfigCat Proxy](https://configcat.com/docs/advanced/proxy/proxy-overview/) instead.  # OpenAPI Specification  The complete specification is publicly available in the following formats:  - [OpenAPI v3](https://api.configcat.com/docs/v1/swagger.json) - [Swagger v2](https://api.configcat.com/docs/v1/swagger.v2.json)  You can use it to generate client libraries in various languages with [OpenAPI Generator](https://github.com/OpenAPITools/openapi-generator) or [Swagger Codegen](https://swagger.io/tools/swagger-codegen/) to interact with this API.  # Authentication This API uses the [Basic HTTP Authentication Scheme](https://en.wikipedia.org/wiki/Basic_access_authentication).   <!-- ReDoc-Inject: <security-definitions> -->  # Throttling and rate limits All the rate limited API calls are returning information about the current rate limit period in the following HTTP headers:  | Header | Description | | :- | :- | | X-Rate-Limit-Remaining | The maximum number of requests remaining in the current rate limit period. | | X-Rate-Limit-Reset     | The time when the current rate limit period resets.        |  When the rate limit is exceeded by a request, the API returns with a `HTTP 429 - Too many requests` status along with a `Retry-After` HTTP header.
 *
 * The version of the OpenAPI document: v1
 * Contact: support@configcat.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.configcat.publicapi.java.client.model;


import com.configcat.publicapi.java.client.JSON;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/** Subscription limitations regarding Feature flag or Setting values and targeting. */
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        date = "2024-10-09T12:38:06.739118192Z[Etc/UTC]",
        comments = "Generator version: 7.7.0")
public class FeatureFlagLimitations {
    public static final String SERIALIZED_NAME_MAX_PERCENTAGE_OPTION_COUNT =
            "maxPercentageOptionCount";

    @SerializedName(SERIALIZED_NAME_MAX_PERCENTAGE_OPTION_COUNT)
    private Integer maxPercentageOptionCount;

    public static final String SERIALIZED_NAME_MAX_TARGETING_RULE_COUNT = "maxTargetingRuleCount";

    @SerializedName(SERIALIZED_NAME_MAX_TARGETING_RULE_COUNT)
    private Integer maxTargetingRuleCount;

    public static final String SERIALIZED_NAME_MAX_COMPARISON_VALUE_LENGTH =
            "maxComparisonValueLength";

    @SerializedName(SERIALIZED_NAME_MAX_COMPARISON_VALUE_LENGTH)
    private Integer maxComparisonValueLength;

    public static final String SERIALIZED_NAME_MAX_COMPARISON_VALUE_LIST_LENGTH =
            "maxComparisonValueListLength";

    @SerializedName(SERIALIZED_NAME_MAX_COMPARISON_VALUE_LIST_LENGTH)
    private Integer maxComparisonValueListLength;

    public static final String SERIALIZED_NAME_MAX_COMPARISON_VALUE_LIST_ITEM_LENGTH =
            "maxComparisonValueListItemLength";

    @SerializedName(SERIALIZED_NAME_MAX_COMPARISON_VALUE_LIST_ITEM_LENGTH)
    private Integer maxComparisonValueListItemLength;

    public static final String SERIALIZED_NAME_MAX_STRING_FLAG_VALUE_LENGTH =
            "maxStringFlagValueLength";

    @SerializedName(SERIALIZED_NAME_MAX_STRING_FLAG_VALUE_LENGTH)
    private Integer maxStringFlagValueLength;

    public static final String SERIALIZED_NAME_MAX_CONDITION_PER_TARGETING_RULE_COUNT =
            "maxConditionPerTargetingRuleCount";

    @SerializedName(SERIALIZED_NAME_MAX_CONDITION_PER_TARGETING_RULE_COUNT)
    private Integer maxConditionPerTargetingRuleCount;

    public FeatureFlagLimitations() {}

    public FeatureFlagLimitations maxPercentageOptionCount(Integer maxPercentageOptionCount) {
        this.maxPercentageOptionCount = maxPercentageOptionCount;
        return this;
    }

    /**
     * Maximum number of percentage options a Feature Flag or Setting can have within a targeting
     * rule.
     *
     * @return maxPercentageOptionCount
     */
    @javax.annotation.Nullable
    public Integer getMaxPercentageOptionCount() {
        return maxPercentageOptionCount;
    }

    public void setMaxPercentageOptionCount(Integer maxPercentageOptionCount) {
        this.maxPercentageOptionCount = maxPercentageOptionCount;
    }

    public FeatureFlagLimitations maxTargetingRuleCount(Integer maxTargetingRuleCount) {
        this.maxTargetingRuleCount = maxTargetingRuleCount;
        return this;
    }

    /**
     * Maximum number of targeting rules a Feature Flag or Setting can have.
     *
     * @return maxTargetingRuleCount
     */
    @javax.annotation.Nullable
    public Integer getMaxTargetingRuleCount() {
        return maxTargetingRuleCount;
    }

    public void setMaxTargetingRuleCount(Integer maxTargetingRuleCount) {
        this.maxTargetingRuleCount = maxTargetingRuleCount;
    }

    public FeatureFlagLimitations maxComparisonValueLength(Integer maxComparisonValueLength) {
        this.maxComparisonValueLength = maxComparisonValueLength;
        return this;
    }

    /**
     * Maximum length of a text comparison value.
     *
     * @return maxComparisonValueLength
     */
    @javax.annotation.Nullable
    public Integer getMaxComparisonValueLength() {
        return maxComparisonValueLength;
    }

    public void setMaxComparisonValueLength(Integer maxComparisonValueLength) {
        this.maxComparisonValueLength = maxComparisonValueLength;
    }

    public FeatureFlagLimitations maxComparisonValueListLength(
            Integer maxComparisonValueListLength) {
        this.maxComparisonValueListLength = maxComparisonValueListLength;
        return this;
    }

    /**
     * Maximum item count of a list comparison value.
     *
     * @return maxComparisonValueListLength
     */
    @javax.annotation.Nullable
    public Integer getMaxComparisonValueListLength() {
        return maxComparisonValueListLength;
    }

    public void setMaxComparisonValueListLength(Integer maxComparisonValueListLength) {
        this.maxComparisonValueListLength = maxComparisonValueListLength;
    }

    public FeatureFlagLimitations maxComparisonValueListItemLength(
            Integer maxComparisonValueListItemLength) {
        this.maxComparisonValueListItemLength = maxComparisonValueListItemLength;
        return this;
    }

    /**
     * Maximum length of a list comparison value&#39;s item.
     *
     * @return maxComparisonValueListItemLength
     */
    @javax.annotation.Nullable
    public Integer getMaxComparisonValueListItemLength() {
        return maxComparisonValueListItemLength;
    }

    public void setMaxComparisonValueListItemLength(Integer maxComparisonValueListItemLength) {
        this.maxComparisonValueListItemLength = maxComparisonValueListItemLength;
    }

    public FeatureFlagLimitations maxStringFlagValueLength(Integer maxStringFlagValueLength) {
        this.maxStringFlagValueLength = maxStringFlagValueLength;
        return this;
    }

    /**
     * Maximum length of a text Setting&#39;s value.
     *
     * @return maxStringFlagValueLength
     */
    @javax.annotation.Nullable
    public Integer getMaxStringFlagValueLength() {
        return maxStringFlagValueLength;
    }

    public void setMaxStringFlagValueLength(Integer maxStringFlagValueLength) {
        this.maxStringFlagValueLength = maxStringFlagValueLength;
    }

    public FeatureFlagLimitations maxConditionPerTargetingRuleCount(
            Integer maxConditionPerTargetingRuleCount) {
        this.maxConditionPerTargetingRuleCount = maxConditionPerTargetingRuleCount;
        return this;
    }

    /**
     * Maximum number of &#x60;AND&#x60; conditions a Feature Flag or Setting can have within a
     * targeting rule.
     *
     * @return maxConditionPerTargetingRuleCount
     */
    @javax.annotation.Nullable
    public Integer getMaxConditionPerTargetingRuleCount() {
        return maxConditionPerTargetingRuleCount;
    }

    public void setMaxConditionPerTargetingRuleCount(Integer maxConditionPerTargetingRuleCount) {
        this.maxConditionPerTargetingRuleCount = maxConditionPerTargetingRuleCount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        FeatureFlagLimitations featureFlagLimitations = (FeatureFlagLimitations) o;
        return Objects.equals(
                        this.maxPercentageOptionCount,
                        featureFlagLimitations.maxPercentageOptionCount)
                && Objects.equals(
                        this.maxTargetingRuleCount, featureFlagLimitations.maxTargetingRuleCount)
                && Objects.equals(
                        this.maxComparisonValueLength,
                        featureFlagLimitations.maxComparisonValueLength)
                && Objects.equals(
                        this.maxComparisonValueListLength,
                        featureFlagLimitations.maxComparisonValueListLength)
                && Objects.equals(
                        this.maxComparisonValueListItemLength,
                        featureFlagLimitations.maxComparisonValueListItemLength)
                && Objects.equals(
                        this.maxStringFlagValueLength,
                        featureFlagLimitations.maxStringFlagValueLength)
                && Objects.equals(
                        this.maxConditionPerTargetingRuleCount,
                        featureFlagLimitations.maxConditionPerTargetingRuleCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                maxPercentageOptionCount,
                maxTargetingRuleCount,
                maxComparisonValueLength,
                maxComparisonValueListLength,
                maxComparisonValueListItemLength,
                maxStringFlagValueLength,
                maxConditionPerTargetingRuleCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FeatureFlagLimitations {\n");
        sb.append("    maxPercentageOptionCount: ")
                .append(toIndentedString(maxPercentageOptionCount))
                .append("\n");
        sb.append("    maxTargetingRuleCount: ")
                .append(toIndentedString(maxTargetingRuleCount))
                .append("\n");
        sb.append("    maxComparisonValueLength: ")
                .append(toIndentedString(maxComparisonValueLength))
                .append("\n");
        sb.append("    maxComparisonValueListLength: ")
                .append(toIndentedString(maxComparisonValueListLength))
                .append("\n");
        sb.append("    maxComparisonValueListItemLength: ")
                .append(toIndentedString(maxComparisonValueListItemLength))
                .append("\n");
        sb.append("    maxStringFlagValueLength: ")
                .append(toIndentedString(maxStringFlagValueLength))
                .append("\n");
        sb.append("    maxConditionPerTargetingRuleCount: ")
                .append(toIndentedString(maxConditionPerTargetingRuleCount))
                .append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces (except the first
     * line).
     */
    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

    public static HashSet<String> openapiFields;
    public static HashSet<String> openapiRequiredFields;

    static {
        // a set of all properties/fields (JSON key names)
        openapiFields = new HashSet<String>();
        openapiFields.add("maxPercentageOptionCount");
        openapiFields.add("maxTargetingRuleCount");
        openapiFields.add("maxComparisonValueLength");
        openapiFields.add("maxComparisonValueListLength");
        openapiFields.add("maxComparisonValueListItemLength");
        openapiFields.add("maxStringFlagValueLength");
        openapiFields.add("maxConditionPerTargetingRuleCount");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to FeatureFlagLimitations
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!FeatureFlagLimitations.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in FeatureFlagLimitations is not found"
                                        + " in the empty JSON string",
                                FeatureFlagLimitations.openapiRequiredFields.toString()));
            }
        }

        Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
        // check to see if the JSON string contains additional fields
        for (Map.Entry<String, JsonElement> entry : entries) {
            if (!FeatureFlagLimitations.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `FeatureFlagLimitations` properties. JSON: %s",
                                entry.getKey(), jsonElement.toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!FeatureFlagLimitations.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'FeatureFlagLimitations' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<FeatureFlagLimitations> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(FeatureFlagLimitations.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<FeatureFlagLimitations>() {
                        @Override
                        public void write(JsonWriter out, FeatureFlagLimitations value)
                                throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public FeatureFlagLimitations read(JsonReader in) throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            validateJsonElement(jsonElement);
                            return thisAdapter.fromJsonTree(jsonElement);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of FeatureFlagLimitations given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of FeatureFlagLimitations
     * @throws IOException if the JSON string is invalid with respect to FeatureFlagLimitations
     */
    public static FeatureFlagLimitations fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, FeatureFlagLimitations.class);
    }

    /**
     * Convert an instance of FeatureFlagLimitations to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
