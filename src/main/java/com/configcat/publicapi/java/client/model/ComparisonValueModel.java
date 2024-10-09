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
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import org.openapitools.jackson.nullable.JsonNullable;

/** The value that the user object&#39;s attribute is compared to. */
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        date = "2024-10-09T12:38:06.739118192Z[Etc/UTC]",
        comments = "Generator version: 7.7.0")
public class ComparisonValueModel {
    public static final String SERIALIZED_NAME_STRING_VALUE = "stringValue";

    @SerializedName(SERIALIZED_NAME_STRING_VALUE)
    private String stringValue;

    public static final String SERIALIZED_NAME_DOUBLE_VALUE = "doubleValue";

    @SerializedName(SERIALIZED_NAME_DOUBLE_VALUE)
    private Double doubleValue;

    public static final String SERIALIZED_NAME_LIST_VALUE = "listValue";

    @SerializedName(SERIALIZED_NAME_LIST_VALUE)
    private List<ComparisonValueListModel> listValue;

    public ComparisonValueModel() {}

    public ComparisonValueModel stringValue(String stringValue) {
        this.stringValue = stringValue;
        return this;
    }

    /**
     * The string representation of the comparison value.
     *
     * @return stringValue
     */
    @javax.annotation.Nullable
    public String getStringValue() {
        return stringValue;
    }

    public void setStringValue(String stringValue) {
        this.stringValue = stringValue;
    }

    public ComparisonValueModel doubleValue(Double doubleValue) {
        this.doubleValue = doubleValue;
        return this;
    }

    /**
     * The number representation of the comparison value.
     *
     * @return doubleValue
     */
    @javax.annotation.Nullable
    public Double getDoubleValue() {
        return doubleValue;
    }

    public void setDoubleValue(Double doubleValue) {
        this.doubleValue = doubleValue;
    }

    public ComparisonValueModel listValue(List<ComparisonValueListModel> listValue) {
        this.listValue = listValue;
        return this;
    }

    public ComparisonValueModel addListValueItem(ComparisonValueListModel listValueItem) {
        if (this.listValue == null) {
            this.listValue = new ArrayList<>();
        }
        this.listValue.add(listValueItem);
        return this;
    }

    /**
     * The list representation of the comparison value.
     *
     * @return listValue
     */
    @javax.annotation.Nullable
    public List<ComparisonValueListModel> getListValue() {
        return listValue;
    }

    public void setListValue(List<ComparisonValueListModel> listValue) {
        this.listValue = listValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ComparisonValueModel comparisonValueModel = (ComparisonValueModel) o;
        return Objects.equals(this.stringValue, comparisonValueModel.stringValue)
                && Objects.equals(this.doubleValue, comparisonValueModel.doubleValue)
                && Objects.equals(this.listValue, comparisonValueModel.listValue);
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
        return Objects.hash(stringValue, doubleValue, listValue);
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
        sb.append("class ComparisonValueModel {\n");
        sb.append("    stringValue: ").append(toIndentedString(stringValue)).append("\n");
        sb.append("    doubleValue: ").append(toIndentedString(doubleValue)).append("\n");
        sb.append("    listValue: ").append(toIndentedString(listValue)).append("\n");
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
        openapiFields.add("stringValue");
        openapiFields.add("doubleValue");
        openapiFields.add("listValue");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to ComparisonValueModel
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!ComparisonValueModel.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in ComparisonValueModel is not found in"
                                        + " the empty JSON string",
                                ComparisonValueModel.openapiRequiredFields.toString()));
            }
        }

        Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
        // check to see if the JSON string contains additional fields
        for (Map.Entry<String, JsonElement> entry : entries) {
            if (!ComparisonValueModel.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `ComparisonValueModel` properties. JSON: %s",
                                entry.getKey(), jsonElement.toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        if ((jsonObj.get("stringValue") != null && !jsonObj.get("stringValue").isJsonNull())
                && !jsonObj.get("stringValue").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `stringValue` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("stringValue").toString()));
        }
        if (jsonObj.get("listValue") != null && !jsonObj.get("listValue").isJsonNull()) {
            JsonArray jsonArraylistValue = jsonObj.getAsJsonArray("listValue");
            if (jsonArraylistValue != null) {
                // ensure the json data is an array
                if (!jsonObj.get("listValue").isJsonArray()) {
                    throw new IllegalArgumentException(
                            String.format(
                                    "Expected the field `listValue` to be an array in the JSON"
                                            + " string but got `%s`",
                                    jsonObj.get("listValue").toString()));
                }

                // validate the optional field `listValue` (array)
                for (int i = 0; i < jsonArraylistValue.size(); i++) {
                    ComparisonValueListModel.validateJsonElement(jsonArraylistValue.get(i));
                }
                ;
            }
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!ComparisonValueModel.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'ComparisonValueModel' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<ComparisonValueModel> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(ComparisonValueModel.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<ComparisonValueModel>() {
                        @Override
                        public void write(JsonWriter out, ComparisonValueModel value)
                                throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public ComparisonValueModel read(JsonReader in) throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            validateJsonElement(jsonElement);
                            return thisAdapter.fromJsonTree(jsonElement);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of ComparisonValueModel given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of ComparisonValueModel
     * @throws IOException if the JSON string is invalid with respect to ComparisonValueModel
     */
    public static ComparisonValueModel fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, ComparisonValueModel.class);
    }

    /**
     * Convert an instance of ComparisonValueModel to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
