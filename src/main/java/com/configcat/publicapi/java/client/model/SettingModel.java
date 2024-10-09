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
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;

/** Metadata of a Feature Flag or Setting. */
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        date = "2024-10-09T12:38:06.739118192Z[Etc/UTC]",
        comments = "Generator version: 7.7.0")
public class SettingModel {
    public static final String SERIALIZED_NAME_SETTING_ID = "settingId";

    @SerializedName(SERIALIZED_NAME_SETTING_ID)
    private Integer settingId;

    public static final String SERIALIZED_NAME_KEY = "key";

    @SerializedName(SERIALIZED_NAME_KEY)
    private String key;

    public static final String SERIALIZED_NAME_NAME = "name";

    @SerializedName(SERIALIZED_NAME_NAME)
    private String name;

    public static final String SERIALIZED_NAME_HINT = "hint";

    @SerializedName(SERIALIZED_NAME_HINT)
    private String hint;

    public static final String SERIALIZED_NAME_ORDER = "order";

    @SerializedName(SERIALIZED_NAME_ORDER)
    private Integer order;

    public static final String SERIALIZED_NAME_SETTING_TYPE = "settingType";

    @SerializedName(SERIALIZED_NAME_SETTING_TYPE)
    private SettingType settingType;

    public static final String SERIALIZED_NAME_CONFIG_ID = "configId";

    @SerializedName(SERIALIZED_NAME_CONFIG_ID)
    private UUID configId;

    public static final String SERIALIZED_NAME_CONFIG_NAME = "configName";

    @SerializedName(SERIALIZED_NAME_CONFIG_NAME)
    private String configName;

    public static final String SERIALIZED_NAME_TAGS = "tags";

    @SerializedName(SERIALIZED_NAME_TAGS)
    private List<TagModel> tags;

    public SettingModel() {}

    public SettingModel settingId(Integer settingId) {
        this.settingId = settingId;
        return this;
    }

    /**
     * Identifier of the Feature Flag or Setting.
     *
     * @return settingId
     */
    @javax.annotation.Nullable
    public Integer getSettingId() {
        return settingId;
    }

    public void setSettingId(Integer settingId) {
        this.settingId = settingId;
    }

    public SettingModel key(String key) {
        this.key = key;
        return this;
    }

    /**
     * Key of the Feature Flag or Setting.
     *
     * @return key
     */
    @javax.annotation.Nullable
    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public SettingModel name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Name of the Feature Flag or Setting.
     *
     * @return name
     */
    @javax.annotation.Nullable
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SettingModel hint(String hint) {
        this.hint = hint;
        return this;
    }

    /**
     * Description of the Feature Flag or Setting.
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

    public SettingModel order(Integer order) {
        this.order = order;
        return this;
    }

    /**
     * The order of the Feature Flag or Setting represented on the ConfigCat Dashboard.
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

    public SettingModel settingType(SettingType settingType) {
        this.settingType = settingType;
        return this;
    }

    /**
     * Get settingType
     *
     * @return settingType
     */
    @javax.annotation.Nullable
    public SettingType getSettingType() {
        return settingType;
    }

    public void setSettingType(SettingType settingType) {
        this.settingType = settingType;
    }

    public SettingModel configId(UUID configId) {
        this.configId = configId;
        return this;
    }

    /**
     * Identifier of the Feature Flag&#39;s Config.
     *
     * @return configId
     */
    @javax.annotation.Nullable
    public UUID getConfigId() {
        return configId;
    }

    public void setConfigId(UUID configId) {
        this.configId = configId;
    }

    public SettingModel configName(String configName) {
        this.configName = configName;
        return this;
    }

    /**
     * Name of the Feature Flag&#39;s Config.
     *
     * @return configName
     */
    @javax.annotation.Nullable
    public String getConfigName() {
        return configName;
    }

    public void setConfigName(String configName) {
        this.configName = configName;
    }

    public SettingModel tags(List<TagModel> tags) {
        this.tags = tags;
        return this;
    }

    public SettingModel addTagsItem(TagModel tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    /**
     * The tags attached to the Feature Flag or Setting.
     *
     * @return tags
     */
    @javax.annotation.Nullable
    public List<TagModel> getTags() {
        return tags;
    }

    public void setTags(List<TagModel> tags) {
        this.tags = tags;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SettingModel settingModel = (SettingModel) o;
        return Objects.equals(this.settingId, settingModel.settingId)
                && Objects.equals(this.key, settingModel.key)
                && Objects.equals(this.name, settingModel.name)
                && Objects.equals(this.hint, settingModel.hint)
                && Objects.equals(this.order, settingModel.order)
                && Objects.equals(this.settingType, settingModel.settingType)
                && Objects.equals(this.configId, settingModel.configId)
                && Objects.equals(this.configName, settingModel.configName)
                && Objects.equals(this.tags, settingModel.tags);
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
                settingId, key, name, hint, order, settingType, configId, configName, tags);
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
        sb.append("class SettingModel {\n");
        sb.append("    settingId: ").append(toIndentedString(settingId)).append("\n");
        sb.append("    key: ").append(toIndentedString(key)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    hint: ").append(toIndentedString(hint)).append("\n");
        sb.append("    order: ").append(toIndentedString(order)).append("\n");
        sb.append("    settingType: ").append(toIndentedString(settingType)).append("\n");
        sb.append("    configId: ").append(toIndentedString(configId)).append("\n");
        sb.append("    configName: ").append(toIndentedString(configName)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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
        openapiFields.add("settingId");
        openapiFields.add("key");
        openapiFields.add("name");
        openapiFields.add("hint");
        openapiFields.add("order");
        openapiFields.add("settingType");
        openapiFields.add("configId");
        openapiFields.add("configName");
        openapiFields.add("tags");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to SettingModel
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!SettingModel.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in SettingModel is not found in the"
                                        + " empty JSON string",
                                SettingModel.openapiRequiredFields.toString()));
            }
        }

        Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
        // check to see if the JSON string contains additional fields
        for (Map.Entry<String, JsonElement> entry : entries) {
            if (!SettingModel.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `SettingModel` properties. JSON: %s",
                                entry.getKey(), jsonElement.toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        if ((jsonObj.get("key") != null && !jsonObj.get("key").isJsonNull())
                && !jsonObj.get("key").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `key` to be a primitive type in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("key").toString()));
        }
        if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull())
                && !jsonObj.get("name").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `name` to be a primitive type in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("name").toString()));
        }
        if ((jsonObj.get("hint") != null && !jsonObj.get("hint").isJsonNull())
                && !jsonObj.get("hint").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `hint` to be a primitive type in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("hint").toString()));
        }
        // validate the optional field `settingType`
        if (jsonObj.get("settingType") != null && !jsonObj.get("settingType").isJsonNull()) {
            SettingType.validateJsonElement(jsonObj.get("settingType"));
        }
        if ((jsonObj.get("configId") != null && !jsonObj.get("configId").isJsonNull())
                && !jsonObj.get("configId").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `configId` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("configId").toString()));
        }
        if ((jsonObj.get("configName") != null && !jsonObj.get("configName").isJsonNull())
                && !jsonObj.get("configName").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `configName` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("configName").toString()));
        }
        if (jsonObj.get("tags") != null && !jsonObj.get("tags").isJsonNull()) {
            JsonArray jsonArraytags = jsonObj.getAsJsonArray("tags");
            if (jsonArraytags != null) {
                // ensure the json data is an array
                if (!jsonObj.get("tags").isJsonArray()) {
                    throw new IllegalArgumentException(
                            String.format(
                                    "Expected the field `tags` to be an array in the JSON string"
                                            + " but got `%s`",
                                    jsonObj.get("tags").toString()));
                }

                // validate the optional field `tags` (array)
                for (int i = 0; i < jsonArraytags.size(); i++) {
                    TagModel.validateJsonElement(jsonArraytags.get(i));
                }
                ;
            }
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!SettingModel.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'SettingModel' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<SettingModel> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(SettingModel.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<SettingModel>() {
                        @Override
                        public void write(JsonWriter out, SettingModel value) throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public SettingModel read(JsonReader in) throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            validateJsonElement(jsonElement);
                            return thisAdapter.fromJsonTree(jsonElement);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of SettingModel given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of SettingModel
     * @throws IOException if the JSON string is invalid with respect to SettingModel
     */
    public static SettingModel fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, SettingModel.class);
    }

    /**
     * Convert an instance of SettingModel to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
