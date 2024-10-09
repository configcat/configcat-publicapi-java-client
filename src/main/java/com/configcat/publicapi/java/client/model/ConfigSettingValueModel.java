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
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import org.openapitools.jackson.nullable.JsonNullable;

/** ConfigSettingValueModel */
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        date = "2024-10-09T12:38:06.739118192Z[Etc/UTC]",
        comments = "Generator version: 7.7.0")
public class ConfigSettingValueModel {
    public static final String SERIALIZED_NAME_ROLLOUT_RULES = "rolloutRules";

    @SerializedName(SERIALIZED_NAME_ROLLOUT_RULES)
    private List<RolloutRuleModel> rolloutRules;

    public static final String SERIALIZED_NAME_ROLLOUT_PERCENTAGE_ITEMS = "rolloutPercentageItems";

    @SerializedName(SERIALIZED_NAME_ROLLOUT_PERCENTAGE_ITEMS)
    private List<RolloutPercentageItemModel> rolloutPercentageItems;

    public static final String SERIALIZED_NAME_VALUE = "value";

    @SerializedName(SERIALIZED_NAME_VALUE)
    private Object value = null;

    public static final String SERIALIZED_NAME_SETTING = "setting";

    @SerializedName(SERIALIZED_NAME_SETTING)
    private SettingDataModel setting;

    public static final String SERIALIZED_NAME_UPDATED_AT = "updatedAt";

    @SerializedName(SERIALIZED_NAME_UPDATED_AT)
    private OffsetDateTime updatedAt;

    public static final String SERIALIZED_NAME_LAST_UPDATER_USER_EMAIL = "lastUpdaterUserEmail";

    @SerializedName(SERIALIZED_NAME_LAST_UPDATER_USER_EMAIL)
    private String lastUpdaterUserEmail;

    public static final String SERIALIZED_NAME_LAST_UPDATER_USER_FULL_NAME =
            "lastUpdaterUserFullName";

    @SerializedName(SERIALIZED_NAME_LAST_UPDATER_USER_FULL_NAME)
    private String lastUpdaterUserFullName;

    public static final String SERIALIZED_NAME_INTEGRATION_LINKS = "integrationLinks";

    @SerializedName(SERIALIZED_NAME_INTEGRATION_LINKS)
    private List<IntegrationLinkModel> integrationLinks;

    public static final String SERIALIZED_NAME_SETTING_TAGS = "settingTags";

    @SerializedName(SERIALIZED_NAME_SETTING_TAGS)
    private List<SettingTagModel> settingTags;

    public ConfigSettingValueModel() {}

    public ConfigSettingValueModel rolloutRules(List<RolloutRuleModel> rolloutRules) {
        this.rolloutRules = rolloutRules;
        return this;
    }

    public ConfigSettingValueModel addRolloutRulesItem(RolloutRuleModel rolloutRulesItem) {
        if (this.rolloutRules == null) {
            this.rolloutRules = new ArrayList<>();
        }
        this.rolloutRules.add(rolloutRulesItem);
        return this;
    }

    /**
     * The targeting rule collection.
     *
     * @return rolloutRules
     */
    @javax.annotation.Nullable
    public List<RolloutRuleModel> getRolloutRules() {
        return rolloutRules;
    }

    public void setRolloutRules(List<RolloutRuleModel> rolloutRules) {
        this.rolloutRules = rolloutRules;
    }

    public ConfigSettingValueModel rolloutPercentageItems(
            List<RolloutPercentageItemModel> rolloutPercentageItems) {
        this.rolloutPercentageItems = rolloutPercentageItems;
        return this;
    }

    public ConfigSettingValueModel addRolloutPercentageItemsItem(
            RolloutPercentageItemModel rolloutPercentageItemsItem) {
        if (this.rolloutPercentageItems == null) {
            this.rolloutPercentageItems = new ArrayList<>();
        }
        this.rolloutPercentageItems.add(rolloutPercentageItemsItem);
        return this;
    }

    /**
     * The percentage rule collection.
     *
     * @return rolloutPercentageItems
     */
    @javax.annotation.Nullable
    public List<RolloutPercentageItemModel> getRolloutPercentageItems() {
        return rolloutPercentageItems;
    }

    public void setRolloutPercentageItems(List<RolloutPercentageItemModel> rolloutPercentageItems) {
        this.rolloutPercentageItems = rolloutPercentageItems;
    }

    public ConfigSettingValueModel value(Object value) {
        this.value = value;
        return this;
    }

    /**
     * The value to serve. It must respect the setting type.
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

    public ConfigSettingValueModel setting(SettingDataModel setting) {
        this.setting = setting;
        return this;
    }

    /**
     * Get setting
     *
     * @return setting
     */
    @javax.annotation.Nullable
    public SettingDataModel getSetting() {
        return setting;
    }

    public void setSetting(SettingDataModel setting) {
        this.setting = setting;
    }

    public ConfigSettingValueModel updatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * The last updated date and time when the Feature Flag or Setting.
     *
     * @return updatedAt
     */
    @javax.annotation.Nullable
    public OffsetDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public ConfigSettingValueModel lastUpdaterUserEmail(String lastUpdaterUserEmail) {
        this.lastUpdaterUserEmail = lastUpdaterUserEmail;
        return this;
    }

    /**
     * The email of the user who last updated the Feature Flag or Setting.
     *
     * @return lastUpdaterUserEmail
     */
    @javax.annotation.Nullable
    public String getLastUpdaterUserEmail() {
        return lastUpdaterUserEmail;
    }

    public void setLastUpdaterUserEmail(String lastUpdaterUserEmail) {
        this.lastUpdaterUserEmail = lastUpdaterUserEmail;
    }

    public ConfigSettingValueModel lastUpdaterUserFullName(String lastUpdaterUserFullName) {
        this.lastUpdaterUserFullName = lastUpdaterUserFullName;
        return this;
    }

    /**
     * The name of the user who last updated the Feature Flag or Setting.
     *
     * @return lastUpdaterUserFullName
     */
    @javax.annotation.Nullable
    public String getLastUpdaterUserFullName() {
        return lastUpdaterUserFullName;
    }

    public void setLastUpdaterUserFullName(String lastUpdaterUserFullName) {
        this.lastUpdaterUserFullName = lastUpdaterUserFullName;
    }

    public ConfigSettingValueModel integrationLinks(List<IntegrationLinkModel> integrationLinks) {
        this.integrationLinks = integrationLinks;
        return this;
    }

    public ConfigSettingValueModel addIntegrationLinksItem(
            IntegrationLinkModel integrationLinksItem) {
        if (this.integrationLinks == null) {
            this.integrationLinks = new ArrayList<>();
        }
        this.integrationLinks.add(integrationLinksItem);
        return this;
    }

    /**
     * The integration links attached to the Feature Flag or Setting.
     *
     * @return integrationLinks
     */
    @javax.annotation.Nullable
    public List<IntegrationLinkModel> getIntegrationLinks() {
        return integrationLinks;
    }

    public void setIntegrationLinks(List<IntegrationLinkModel> integrationLinks) {
        this.integrationLinks = integrationLinks;
    }

    public ConfigSettingValueModel settingTags(List<SettingTagModel> settingTags) {
        this.settingTags = settingTags;
        return this;
    }

    public ConfigSettingValueModel addSettingTagsItem(SettingTagModel settingTagsItem) {
        if (this.settingTags == null) {
            this.settingTags = new ArrayList<>();
        }
        this.settingTags.add(settingTagsItem);
        return this;
    }

    /**
     * The tags attached to the Feature Flag or Setting.
     *
     * @return settingTags
     */
    @javax.annotation.Nullable
    public List<SettingTagModel> getSettingTags() {
        return settingTags;
    }

    public void setSettingTags(List<SettingTagModel> settingTags) {
        this.settingTags = settingTags;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ConfigSettingValueModel configSettingValueModel = (ConfigSettingValueModel) o;
        return Objects.equals(this.rolloutRules, configSettingValueModel.rolloutRules)
                && Objects.equals(
                        this.rolloutPercentageItems, configSettingValueModel.rolloutPercentageItems)
                && Objects.equals(this.value, configSettingValueModel.value)
                && Objects.equals(this.setting, configSettingValueModel.setting)
                && Objects.equals(this.updatedAt, configSettingValueModel.updatedAt)
                && Objects.equals(
                        this.lastUpdaterUserEmail, configSettingValueModel.lastUpdaterUserEmail)
                && Objects.equals(
                        this.lastUpdaterUserFullName,
                        configSettingValueModel.lastUpdaterUserFullName)
                && Objects.equals(this.integrationLinks, configSettingValueModel.integrationLinks)
                && Objects.equals(this.settingTags, configSettingValueModel.settingTags);
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
                rolloutRules,
                rolloutPercentageItems,
                value,
                setting,
                updatedAt,
                lastUpdaterUserEmail,
                lastUpdaterUserFullName,
                integrationLinks,
                settingTags);
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
        sb.append("class ConfigSettingValueModel {\n");
        sb.append("    rolloutRules: ").append(toIndentedString(rolloutRules)).append("\n");
        sb.append("    rolloutPercentageItems: ")
                .append(toIndentedString(rolloutPercentageItems))
                .append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
        sb.append("    setting: ").append(toIndentedString(setting)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    lastUpdaterUserEmail: ")
                .append(toIndentedString(lastUpdaterUserEmail))
                .append("\n");
        sb.append("    lastUpdaterUserFullName: ")
                .append(toIndentedString(lastUpdaterUserFullName))
                .append("\n");
        sb.append("    integrationLinks: ").append(toIndentedString(integrationLinks)).append("\n");
        sb.append("    settingTags: ").append(toIndentedString(settingTags)).append("\n");
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
        openapiFields.add("rolloutRules");
        openapiFields.add("rolloutPercentageItems");
        openapiFields.add("value");
        openapiFields.add("setting");
        openapiFields.add("updatedAt");
        openapiFields.add("lastUpdaterUserEmail");
        openapiFields.add("lastUpdaterUserFullName");
        openapiFields.add("integrationLinks");
        openapiFields.add("settingTags");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to ConfigSettingValueModel
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!ConfigSettingValueModel.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in ConfigSettingValueModel is not found"
                                        + " in the empty JSON string",
                                ConfigSettingValueModel.openapiRequiredFields.toString()));
            }
        }

        Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
        // check to see if the JSON string contains additional fields
        for (Map.Entry<String, JsonElement> entry : entries) {
            if (!ConfigSettingValueModel.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `ConfigSettingValueModel` properties. JSON: %s",
                                entry.getKey(), jsonElement.toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        if (jsonObj.get("rolloutRules") != null && !jsonObj.get("rolloutRules").isJsonNull()) {
            JsonArray jsonArrayrolloutRules = jsonObj.getAsJsonArray("rolloutRules");
            if (jsonArrayrolloutRules != null) {
                // ensure the json data is an array
                if (!jsonObj.get("rolloutRules").isJsonArray()) {
                    throw new IllegalArgumentException(
                            String.format(
                                    "Expected the field `rolloutRules` to be an array in the JSON"
                                            + " string but got `%s`",
                                    jsonObj.get("rolloutRules").toString()));
                }

                // validate the optional field `rolloutRules` (array)
                for (int i = 0; i < jsonArrayrolloutRules.size(); i++) {
                    RolloutRuleModel.validateJsonElement(jsonArrayrolloutRules.get(i));
                }
                ;
            }
        }
        if (jsonObj.get("rolloutPercentageItems") != null
                && !jsonObj.get("rolloutPercentageItems").isJsonNull()) {
            JsonArray jsonArrayrolloutPercentageItems =
                    jsonObj.getAsJsonArray("rolloutPercentageItems");
            if (jsonArrayrolloutPercentageItems != null) {
                // ensure the json data is an array
                if (!jsonObj.get("rolloutPercentageItems").isJsonArray()) {
                    throw new IllegalArgumentException(
                            String.format(
                                    "Expected the field `rolloutPercentageItems` to be an array in"
                                            + " the JSON string but got `%s`",
                                    jsonObj.get("rolloutPercentageItems").toString()));
                }

                // validate the optional field `rolloutPercentageItems` (array)
                for (int i = 0; i < jsonArrayrolloutPercentageItems.size(); i++) {
                    RolloutPercentageItemModel.validateJsonElement(
                            jsonArrayrolloutPercentageItems.get(i));
                }
                ;
            }
        }
        // validate the optional field `setting`
        if (jsonObj.get("setting") != null && !jsonObj.get("setting").isJsonNull()) {
            SettingDataModel.validateJsonElement(jsonObj.get("setting"));
        }
        if ((jsonObj.get("lastUpdaterUserEmail") != null
                        && !jsonObj.get("lastUpdaterUserEmail").isJsonNull())
                && !jsonObj.get("lastUpdaterUserEmail").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `lastUpdaterUserEmail` to be a primitive type in"
                                    + " the JSON string but got `%s`",
                            jsonObj.get("lastUpdaterUserEmail").toString()));
        }
        if ((jsonObj.get("lastUpdaterUserFullName") != null
                        && !jsonObj.get("lastUpdaterUserFullName").isJsonNull())
                && !jsonObj.get("lastUpdaterUserFullName").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `lastUpdaterUserFullName` to be a primitive type"
                                    + " in the JSON string but got `%s`",
                            jsonObj.get("lastUpdaterUserFullName").toString()));
        }
        if (jsonObj.get("integrationLinks") != null
                && !jsonObj.get("integrationLinks").isJsonNull()) {
            JsonArray jsonArrayintegrationLinks = jsonObj.getAsJsonArray("integrationLinks");
            if (jsonArrayintegrationLinks != null) {
                // ensure the json data is an array
                if (!jsonObj.get("integrationLinks").isJsonArray()) {
                    throw new IllegalArgumentException(
                            String.format(
                                    "Expected the field `integrationLinks` to be an array in the"
                                            + " JSON string but got `%s`",
                                    jsonObj.get("integrationLinks").toString()));
                }

                // validate the optional field `integrationLinks` (array)
                for (int i = 0; i < jsonArrayintegrationLinks.size(); i++) {
                    IntegrationLinkModel.validateJsonElement(jsonArrayintegrationLinks.get(i));
                }
                ;
            }
        }
        if (jsonObj.get("settingTags") != null && !jsonObj.get("settingTags").isJsonNull()) {
            JsonArray jsonArraysettingTags = jsonObj.getAsJsonArray("settingTags");
            if (jsonArraysettingTags != null) {
                // ensure the json data is an array
                if (!jsonObj.get("settingTags").isJsonArray()) {
                    throw new IllegalArgumentException(
                            String.format(
                                    "Expected the field `settingTags` to be an array in the JSON"
                                            + " string but got `%s`",
                                    jsonObj.get("settingTags").toString()));
                }

                // validate the optional field `settingTags` (array)
                for (int i = 0; i < jsonArraysettingTags.size(); i++) {
                    SettingTagModel.validateJsonElement(jsonArraysettingTags.get(i));
                }
                ;
            }
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!ConfigSettingValueModel.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'ConfigSettingValueModel' and its
                // subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<ConfigSettingValueModel> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(ConfigSettingValueModel.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<ConfigSettingValueModel>() {
                        @Override
                        public void write(JsonWriter out, ConfigSettingValueModel value)
                                throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public ConfigSettingValueModel read(JsonReader in) throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            validateJsonElement(jsonElement);
                            return thisAdapter.fromJsonTree(jsonElement);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of ConfigSettingValueModel given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of ConfigSettingValueModel
     * @throws IOException if the JSON string is invalid with respect to ConfigSettingValueModel
     */
    public static ConfigSettingValueModel fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, ConfigSettingValueModel.class);
    }

    /**
     * Convert an instance of ConfigSettingValueModel to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
