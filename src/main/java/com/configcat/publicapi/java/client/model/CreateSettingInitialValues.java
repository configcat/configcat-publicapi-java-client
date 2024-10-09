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

/** CreateSettingInitialValues */
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        date = "2024-10-09T12:38:06.739118192Z[Etc/UTC]",
        comments = "Generator version: 7.7.0")
public class CreateSettingInitialValues {
    public static final String SERIALIZED_NAME_HINT = "hint";

    @SerializedName(SERIALIZED_NAME_HINT)
    private String hint;

    public static final String SERIALIZED_NAME_TAGS = "tags";

    @SerializedName(SERIALIZED_NAME_TAGS)
    private List<Long> tags;

    public static final String SERIALIZED_NAME_ORDER = "order";

    @SerializedName(SERIALIZED_NAME_ORDER)
    private Integer order;

    public static final String SERIALIZED_NAME_KEY = "key";

    @SerializedName(SERIALIZED_NAME_KEY)
    private String key;

    public static final String SERIALIZED_NAME_NAME = "name";

    @SerializedName(SERIALIZED_NAME_NAME)
    private String name;

    public static final String SERIALIZED_NAME_SETTING_TYPE = "settingType";

    @SerializedName(SERIALIZED_NAME_SETTING_TYPE)
    private SettingType settingType;

    public static final String SERIALIZED_NAME_INITIAL_VALUES = "initialValues";

    @SerializedName(SERIALIZED_NAME_INITIAL_VALUES)
    private List<InitialValue> initialValues;

    public CreateSettingInitialValues() {}

    public CreateSettingInitialValues hint(String hint) {
        this.hint = hint;
        return this;
    }

    /**
     * A short description for the setting, shown on the Dashboard UI.
     *
     * @return hint
     */
    @javax.annotation.Nullable
    public String getHint() {
        return hint;
    }

    public void setHint(String hint) {
        this.hint = hint;
    }

    public CreateSettingInitialValues tags(List<Long> tags) {
        this.tags = tags;
        return this;
    }

    public CreateSettingInitialValues addTagsItem(Long tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    /**
     * The IDs of the tags which are attached to the setting.
     *
     * @return tags
     */
    @javax.annotation.Nullable
    public List<Long> getTags() {
        return tags;
    }

    public void setTags(List<Long> tags) {
        this.tags = tags;
    }

    public CreateSettingInitialValues order(Integer order) {
        this.order = order;
        return this;
    }

    /**
     * The order of the Setting represented on the ConfigCat Dashboard. Determined from an ascending
     * sequence of integers.
     *
     * @return order
     */
    @javax.annotation.Nullable
    public Integer getOrder() {
        return order;
    }

    public void setOrder(Integer order) {
        this.order = order;
    }

    public CreateSettingInitialValues key(String key) {
        this.key = key;
        return this;
    }

    /**
     * The key of the Feature Flag or Setting.
     *
     * @return key
     */
    @javax.annotation.Nonnull
    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public CreateSettingInitialValues name(String name) {
        this.name = name;
        return this;
    }

    /**
     * The name of the Feature Flag or Setting.
     *
     * @return name
     */
    @javax.annotation.Nonnull
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreateSettingInitialValues settingType(SettingType settingType) {
        this.settingType = settingType;
        return this;
    }

    /**
     * Get settingType
     *
     * @return settingType
     */
    @javax.annotation.Nonnull
    public SettingType getSettingType() {
        return settingType;
    }

    public void setSettingType(SettingType settingType) {
        this.settingType = settingType;
    }

    public CreateSettingInitialValues initialValues(List<InitialValue> initialValues) {
        this.initialValues = initialValues;
        return this;
    }

    public CreateSettingInitialValues addInitialValuesItem(InitialValue initialValuesItem) {
        if (this.initialValues == null) {
            this.initialValues = new ArrayList<>();
        }
        this.initialValues.add(initialValuesItem);
        return this;
    }

    /**
     * Optional, initial value of the Feature Flag or Setting in the given Environments.
     *
     * @return initialValues
     */
    @javax.annotation.Nullable
    public List<InitialValue> getInitialValues() {
        return initialValues;
    }

    public void setInitialValues(List<InitialValue> initialValues) {
        this.initialValues = initialValues;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateSettingInitialValues createSettingInitialValues = (CreateSettingInitialValues) o;
        return Objects.equals(this.hint, createSettingInitialValues.hint)
                && Objects.equals(this.tags, createSettingInitialValues.tags)
                && Objects.equals(this.order, createSettingInitialValues.order)
                && Objects.equals(this.key, createSettingInitialValues.key)
                && Objects.equals(this.name, createSettingInitialValues.name)
                && Objects.equals(this.settingType, createSettingInitialValues.settingType)
                && Objects.equals(this.initialValues, createSettingInitialValues.initialValues);
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
        return Objects.hash(hint, tags, order, key, name, settingType, initialValues);
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
        sb.append("class CreateSettingInitialValues {\n");
        sb.append("    hint: ").append(toIndentedString(hint)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    order: ").append(toIndentedString(order)).append("\n");
        sb.append("    key: ").append(toIndentedString(key)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    settingType: ").append(toIndentedString(settingType)).append("\n");
        sb.append("    initialValues: ").append(toIndentedString(initialValues)).append("\n");
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
        openapiFields.add("hint");
        openapiFields.add("tags");
        openapiFields.add("order");
        openapiFields.add("key");
        openapiFields.add("name");
        openapiFields.add("settingType");
        openapiFields.add("initialValues");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
        openapiRequiredFields.add("key");
        openapiRequiredFields.add("name");
        openapiRequiredFields.add("settingType");
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to CreateSettingInitialValues
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!CreateSettingInitialValues.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in CreateSettingInitialValues is not"
                                        + " found in the empty JSON string",
                                CreateSettingInitialValues.openapiRequiredFields.toString()));
            }
        }

        Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
        // check to see if the JSON string contains additional fields
        for (Map.Entry<String, JsonElement> entry : entries) {
            if (!CreateSettingInitialValues.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `CreateSettingInitialValues` properties. JSON: %s",
                                entry.getKey(), jsonElement.toString()));
            }
        }

        // check to make sure all required properties/fields are present in the JSON string
        for (String requiredField : CreateSettingInitialValues.openapiRequiredFields) {
            if (jsonElement.getAsJsonObject().get(requiredField) == null) {
                throw new IllegalArgumentException(
                        String.format(
                                "The required field `%s` is not found in the JSON string: %s",
                                requiredField, jsonElement.toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        if ((jsonObj.get("hint") != null && !jsonObj.get("hint").isJsonNull())
                && !jsonObj.get("hint").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `hint` to be a primitive type in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("hint").toString()));
        }
        // ensure the optional json data is an array if present
        if (jsonObj.get("tags") != null
                && !jsonObj.get("tags").isJsonNull()
                && !jsonObj.get("tags").isJsonArray()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `tags` to be an array in the JSON string but got"
                                    + " `%s`",
                            jsonObj.get("tags").toString()));
        }
        if (!jsonObj.get("key").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `key` to be a primitive type in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("key").toString()));
        }
        if (!jsonObj.get("name").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `name` to be a primitive type in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("name").toString()));
        }
        // validate the required field `settingType`
        SettingType.validateJsonElement(jsonObj.get("settingType"));
        if (jsonObj.get("initialValues") != null && !jsonObj.get("initialValues").isJsonNull()) {
            JsonArray jsonArrayinitialValues = jsonObj.getAsJsonArray("initialValues");
            if (jsonArrayinitialValues != null) {
                // ensure the json data is an array
                if (!jsonObj.get("initialValues").isJsonArray()) {
                    throw new IllegalArgumentException(
                            String.format(
                                    "Expected the field `initialValues` to be an array in the JSON"
                                            + " string but got `%s`",
                                    jsonObj.get("initialValues").toString()));
                }

                // validate the optional field `initialValues` (array)
                for (int i = 0; i < jsonArrayinitialValues.size(); i++) {
                    InitialValue.validateJsonElement(jsonArrayinitialValues.get(i));
                }
                ;
            }
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!CreateSettingInitialValues.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'CreateSettingInitialValues' and its
                // subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<CreateSettingInitialValues> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(CreateSettingInitialValues.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<CreateSettingInitialValues>() {
                        @Override
                        public void write(JsonWriter out, CreateSettingInitialValues value)
                                throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public CreateSettingInitialValues read(JsonReader in) throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            validateJsonElement(jsonElement);
                            return thisAdapter.fromJsonTree(jsonElement);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of CreateSettingInitialValues given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of CreateSettingInitialValues
     * @throws IOException if the JSON string is invalid with respect to CreateSettingInitialValues
     */
    public static CreateSettingInitialValues fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, CreateSettingInitialValues.class);
    }

    /**
     * Convert an instance of CreateSettingInitialValues to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
