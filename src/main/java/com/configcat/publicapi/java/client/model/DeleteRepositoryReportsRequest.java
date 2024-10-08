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

/** DeleteRepositoryReportsRequest */
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        date = "2024-10-09T12:38:06.739118192Z[Etc/UTC]",
        comments = "Generator version: 7.7.0")
public class DeleteRepositoryReportsRequest {
    public static final String SERIALIZED_NAME_CONFIG_ID = "configId";

    @SerializedName(SERIALIZED_NAME_CONFIG_ID)
    private UUID configId;

    public static final String SERIALIZED_NAME_REPOSITORY = "repository";

    @SerializedName(SERIALIZED_NAME_REPOSITORY)
    private String repository;

    public static final String SERIALIZED_NAME_BRANCH = "branch";

    @SerializedName(SERIALIZED_NAME_BRANCH)
    private String branch;

    public static final String SERIALIZED_NAME_SETTING_ID = "settingId";

    @SerializedName(SERIALIZED_NAME_SETTING_ID)
    private Integer settingId;

    public DeleteRepositoryReportsRequest() {}

    public DeleteRepositoryReportsRequest configId(UUID configId) {
        this.configId = configId;
        return this;
    }

    /**
     * The Config&#39;s identifier from where the reports should be deleted.
     *
     * @return configId
     */
    @javax.annotation.Nonnull
    public UUID getConfigId() {
        return configId;
    }

    public void setConfigId(UUID configId) {
        this.configId = configId;
    }

    public DeleteRepositoryReportsRequest repository(String repository) {
        this.repository = repository;
        return this;
    }

    /**
     * The source control repository which&#39;s reports should be deleted.
     *
     * @return repository
     */
    @javax.annotation.Nonnull
    public String getRepository() {
        return repository;
    }

    public void setRepository(String repository) {
        this.repository = repository;
    }

    public DeleteRepositoryReportsRequest branch(String branch) {
        this.branch = branch;
        return this;
    }

    /**
     * If it&#39;s set, only this branch&#39;s reports belonging to the given repository will be
     * deleted.
     *
     * @return branch
     */
    @javax.annotation.Nullable
    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public DeleteRepositoryReportsRequest settingId(Integer settingId) {
        this.settingId = settingId;
        return this;
    }

    /**
     * If it&#39;s set, only this setting&#39;s reports belonging to the given repository will be
     * deleted.
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DeleteRepositoryReportsRequest deleteRepositoryReportsRequest =
                (DeleteRepositoryReportsRequest) o;
        return Objects.equals(this.configId, deleteRepositoryReportsRequest.configId)
                && Objects.equals(this.repository, deleteRepositoryReportsRequest.repository)
                && Objects.equals(this.branch, deleteRepositoryReportsRequest.branch)
                && Objects.equals(this.settingId, deleteRepositoryReportsRequest.settingId);
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
        return Objects.hash(configId, repository, branch, settingId);
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
        sb.append("class DeleteRepositoryReportsRequest {\n");
        sb.append("    configId: ").append(toIndentedString(configId)).append("\n");
        sb.append("    repository: ").append(toIndentedString(repository)).append("\n");
        sb.append("    branch: ").append(toIndentedString(branch)).append("\n");
        sb.append("    settingId: ").append(toIndentedString(settingId)).append("\n");
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
        openapiFields.add("configId");
        openapiFields.add("repository");
        openapiFields.add("branch");
        openapiFields.add("settingId");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
        openapiRequiredFields.add("configId");
        openapiRequiredFields.add("repository");
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to
     *     DeleteRepositoryReportsRequest
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!DeleteRepositoryReportsRequest.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in DeleteRepositoryReportsRequest is not"
                                        + " found in the empty JSON string",
                                DeleteRepositoryReportsRequest.openapiRequiredFields.toString()));
            }
        }

        Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
        // check to see if the JSON string contains additional fields
        for (Map.Entry<String, JsonElement> entry : entries) {
            if (!DeleteRepositoryReportsRequest.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `DeleteRepositoryReportsRequest` properties. JSON: %s",
                                entry.getKey(), jsonElement.toString()));
            }
        }

        // check to make sure all required properties/fields are present in the JSON string
        for (String requiredField : DeleteRepositoryReportsRequest.openapiRequiredFields) {
            if (jsonElement.getAsJsonObject().get(requiredField) == null) {
                throw new IllegalArgumentException(
                        String.format(
                                "The required field `%s` is not found in the JSON string: %s",
                                requiredField, jsonElement.toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        if (!jsonObj.get("configId").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `configId` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("configId").toString()));
        }
        if (!jsonObj.get("repository").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `repository` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("repository").toString()));
        }
        if ((jsonObj.get("branch") != null && !jsonObj.get("branch").isJsonNull())
                && !jsonObj.get("branch").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `branch` to be a primitive type in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("branch").toString()));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!DeleteRepositoryReportsRequest.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'DeleteRepositoryReportsRequest' and its
                // subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<DeleteRepositoryReportsRequest> thisAdapter =
                    gson.getDelegateAdapter(
                            this, TypeToken.get(DeleteRepositoryReportsRequest.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<DeleteRepositoryReportsRequest>() {
                        @Override
                        public void write(JsonWriter out, DeleteRepositoryReportsRequest value)
                                throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public DeleteRepositoryReportsRequest read(JsonReader in)
                                throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            validateJsonElement(jsonElement);
                            return thisAdapter.fromJsonTree(jsonElement);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of DeleteRepositoryReportsRequest given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of DeleteRepositoryReportsRequest
     * @throws IOException if the JSON string is invalid with respect to
     *     DeleteRepositoryReportsRequest
     */
    public static DeleteRepositoryReportsRequest fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, DeleteRepositoryReportsRequest.class);
    }

    /**
     * Convert an instance of DeleteRepositoryReportsRequest to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
