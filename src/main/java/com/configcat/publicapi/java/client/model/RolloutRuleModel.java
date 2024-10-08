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
import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;

/** RolloutRuleModel */
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        date = "2024-10-09T12:38:06.739118192Z[Etc/UTC]",
        comments = "Generator version: 7.7.0")
public class RolloutRuleModel {
    public static final String SERIALIZED_NAME_COMPARISON_ATTRIBUTE = "comparisonAttribute";

    @SerializedName(SERIALIZED_NAME_COMPARISON_ATTRIBUTE)
    private String comparisonAttribute;

    public static final String SERIALIZED_NAME_COMPARATOR = "comparator";

    @SerializedName(SERIALIZED_NAME_COMPARATOR)
    private RolloutRuleComparator comparator;

    public static final String SERIALIZED_NAME_COMPARISON_VALUE = "comparisonValue";

    @SerializedName(SERIALIZED_NAME_COMPARISON_VALUE)
    private String comparisonValue;

    public static final String SERIALIZED_NAME_VALUE = "value";

    @SerializedName(SERIALIZED_NAME_VALUE)
    private Object value = null;

    public static final String SERIALIZED_NAME_SEGMENT_COMPARATOR = "segmentComparator";

    @SerializedName(SERIALIZED_NAME_SEGMENT_COMPARATOR)
    private SegmentComparator segmentComparator;

    public static final String SERIALIZED_NAME_SEGMENT_ID = "segmentId";

    @SerializedName(SERIALIZED_NAME_SEGMENT_ID)
    private UUID segmentId;

    public RolloutRuleModel() {}

    public RolloutRuleModel comparisonAttribute(String comparisonAttribute) {
        this.comparisonAttribute = comparisonAttribute;
        return this;
    }

    /**
     * The user attribute to compare.
     *
     * @return comparisonAttribute
     */
    @javax.annotation.Nullable
    public String getComparisonAttribute() {
        return comparisonAttribute;
    }

    public void setComparisonAttribute(String comparisonAttribute) {
        this.comparisonAttribute = comparisonAttribute;
    }

    public RolloutRuleModel comparator(RolloutRuleComparator comparator) {
        this.comparator = comparator;
        return this;
    }

    /**
     * Get comparator
     *
     * @return comparator
     */
    @javax.annotation.Nullable
    public RolloutRuleComparator getComparator() {
        return comparator;
    }

    public void setComparator(RolloutRuleComparator comparator) {
        this.comparator = comparator;
    }

    public RolloutRuleModel comparisonValue(String comparisonValue) {
        this.comparisonValue = comparisonValue;
        return this;
    }

    /**
     * The value to compare against.
     *
     * @return comparisonValue
     */
    @javax.annotation.Nullable
    public String getComparisonValue() {
        return comparisonValue;
    }

    public void setComparisonValue(String comparisonValue) {
        this.comparisonValue = comparisonValue;
    }

    public RolloutRuleModel value(Object value) {
        this.value = value;
        return this;
    }

    /**
     * The value to serve when the comparison matches. It must respect the setting type.
     *
     * @return value
     */
    @javax.annotation.Nullable
    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public RolloutRuleModel segmentComparator(SegmentComparator segmentComparator) {
        this.segmentComparator = segmentComparator;
        return this;
    }

    /**
     * Get segmentComparator
     *
     * @return segmentComparator
     */
    @javax.annotation.Nullable
    public SegmentComparator getSegmentComparator() {
        return segmentComparator;
    }

    public void setSegmentComparator(SegmentComparator segmentComparator) {
        this.segmentComparator = segmentComparator;
    }

    public RolloutRuleModel segmentId(UUID segmentId) {
        this.segmentId = segmentId;
        return this;
    }

    /**
     * The segment to compare against.
     *
     * @return segmentId
     */
    @javax.annotation.Nullable
    public UUID getSegmentId() {
        return segmentId;
    }

    public void setSegmentId(UUID segmentId) {
        this.segmentId = segmentId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RolloutRuleModel rolloutRuleModel = (RolloutRuleModel) o;
        return Objects.equals(this.comparisonAttribute, rolloutRuleModel.comparisonAttribute)
                && Objects.equals(this.comparator, rolloutRuleModel.comparator)
                && Objects.equals(this.comparisonValue, rolloutRuleModel.comparisonValue)
                && Objects.equals(this.value, rolloutRuleModel.value)
                && Objects.equals(this.segmentComparator, rolloutRuleModel.segmentComparator)
                && Objects.equals(this.segmentId, rolloutRuleModel.segmentId);
    }

    private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
        return a == b
                || (a != null
                        && b != null
                        && a.isPresent()
                        && b.isPresent()
                        && Objects.deepEquals(a.get(), b.get()));
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                comparisonAttribute,
                comparator,
                comparisonValue,
                value,
                segmentComparator,
                segmentId);
    }

    private static <T> int hashCodeNullable(JsonNullable<T> a) {
        if (a == null) {
            return 1;
        }
        return a.isPresent() ? Arrays.deepHashCode(new Object[] {a.get()}) : 31;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RolloutRuleModel {\n");
        sb.append("    comparisonAttribute: ")
                .append(toIndentedString(comparisonAttribute))
                .append("\n");
        sb.append("    comparator: ").append(toIndentedString(comparator)).append("\n");
        sb.append("    comparisonValue: ").append(toIndentedString(comparisonValue)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
        sb.append("    segmentComparator: ")
                .append(toIndentedString(segmentComparator))
                .append("\n");
        sb.append("    segmentId: ").append(toIndentedString(segmentId)).append("\n");
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
        openapiFields.add("comparisonAttribute");
        openapiFields.add("comparator");
        openapiFields.add("comparisonValue");
        openapiFields.add("value");
        openapiFields.add("segmentComparator");
        openapiFields.add("segmentId");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to RolloutRuleModel
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!RolloutRuleModel.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in RolloutRuleModel is not found in the"
                                        + " empty JSON string",
                                RolloutRuleModel.openapiRequiredFields.toString()));
            }
        }

        Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
        // check to see if the JSON string contains additional fields
        for (Map.Entry<String, JsonElement> entry : entries) {
            if (!RolloutRuleModel.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `RolloutRuleModel` properties. JSON: %s",
                                entry.getKey(), jsonElement.toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        if ((jsonObj.get("comparisonAttribute") != null
                        && !jsonObj.get("comparisonAttribute").isJsonNull())
                && !jsonObj.get("comparisonAttribute").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `comparisonAttribute` to be a primitive type in"
                                    + " the JSON string but got `%s`",
                            jsonObj.get("comparisonAttribute").toString()));
        }
        // validate the optional field `comparator`
        if (jsonObj.get("comparator") != null && !jsonObj.get("comparator").isJsonNull()) {
            RolloutRuleComparator.validateJsonElement(jsonObj.get("comparator"));
        }
        if ((jsonObj.get("comparisonValue") != null && !jsonObj.get("comparisonValue").isJsonNull())
                && !jsonObj.get("comparisonValue").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `comparisonValue` to be a primitive type in the"
                                    + " JSON string but got `%s`",
                            jsonObj.get("comparisonValue").toString()));
        }
        // validate the optional field `segmentComparator`
        if (jsonObj.get("segmentComparator") != null
                && !jsonObj.get("segmentComparator").isJsonNull()) {
            SegmentComparator.validateJsonElement(jsonObj.get("segmentComparator"));
        }
        if ((jsonObj.get("segmentId") != null && !jsonObj.get("segmentId").isJsonNull())
                && !jsonObj.get("segmentId").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `segmentId` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("segmentId").toString()));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!RolloutRuleModel.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'RolloutRuleModel' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<RolloutRuleModel> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(RolloutRuleModel.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<RolloutRuleModel>() {
                        @Override
                        public void write(JsonWriter out, RolloutRuleModel value)
                                throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public RolloutRuleModel read(JsonReader in) throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            validateJsonElement(jsonElement);
                            return thisAdapter.fromJsonTree(jsonElement);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of RolloutRuleModel given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of RolloutRuleModel
     * @throws IOException if the JSON string is invalid with respect to RolloutRuleModel
     */
    public static RolloutRuleModel fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, RolloutRuleModel.class);
    }

    /**
     * Convert an instance of RolloutRuleModel to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
