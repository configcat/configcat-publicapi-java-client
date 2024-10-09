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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;

/** ModifyIntegrationRequest */
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        date = "2024-10-09T12:38:06.739118192Z[Etc/UTC]",
        comments = "Generator version: 7.7.0")
public class ModifyIntegrationRequest {
    public static final String SERIALIZED_NAME_NAME = "name";

    @SerializedName(SERIALIZED_NAME_NAME)
    private String name;

    public static final String SERIALIZED_NAME_PARAMETERS = "parameters";

    @SerializedName(SERIALIZED_NAME_PARAMETERS)
    private Map<String, String> parameters = new HashMap<>();

    public static final String SERIALIZED_NAME_ENVIRONMENT_IDS = "environmentIds";

    @SerializedName(SERIALIZED_NAME_ENVIRONMENT_IDS)
    private List<UUID> environmentIds = new ArrayList<>();

    public static final String SERIALIZED_NAME_CONFIG_IDS = "configIds";

    @SerializedName(SERIALIZED_NAME_CONFIG_IDS)
    private List<UUID> configIds = new ArrayList<>();

    public ModifyIntegrationRequest() {}

    public ModifyIntegrationRequest name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Name of the Integration.
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

    public ModifyIntegrationRequest parameters(Map<String, String> parameters) {
        this.parameters = parameters;
        return this;
    }

    public ModifyIntegrationRequest putParametersItem(String key, String parametersItem) {
        if (this.parameters == null) {
            this.parameters = new HashMap<>();
        }
        this.parameters.put(key, parametersItem);
        return this;
    }

    /**
     * Parameters of the Integration.
     *
     * @return parameters
     */
    @javax.annotation.Nonnull
    public Map<String, String> getParameters() {
        return parameters;
    }

    public void setParameters(Map<String, String> parameters) {
        this.parameters = parameters;
    }

    public ModifyIntegrationRequest environmentIds(List<UUID> environmentIds) {
        this.environmentIds = environmentIds;
        return this;
    }

    public ModifyIntegrationRequest addEnvironmentIdsItem(UUID environmentIdsItem) {
        if (this.environmentIds == null) {
            this.environmentIds = new ArrayList<>();
        }
        this.environmentIds.add(environmentIdsItem);
        return this;
    }

    /**
     * List of Environment IDs that are connected with this Integration. If the list is empty, all
     * of the Environments are connected.
     *
     * @return environmentIds
     */
    @javax.annotation.Nonnull
    public List<UUID> getEnvironmentIds() {
        return environmentIds;
    }

    public void setEnvironmentIds(List<UUID> environmentIds) {
        this.environmentIds = environmentIds;
    }

    public ModifyIntegrationRequest configIds(List<UUID> configIds) {
        this.configIds = configIds;
        return this;
    }

    public ModifyIntegrationRequest addConfigIdsItem(UUID configIdsItem) {
        if (this.configIds == null) {
            this.configIds = new ArrayList<>();
        }
        this.configIds.add(configIdsItem);
        return this;
    }

    /**
     * List of Config IDs that are connected with this Integration. If the list is empty, all of the
     * Configs are connected.
     *
     * @return configIds
     */
    @javax.annotation.Nonnull
    public List<UUID> getConfigIds() {
        return configIds;
    }

    public void setConfigIds(List<UUID> configIds) {
        this.configIds = configIds;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ModifyIntegrationRequest modifyIntegrationRequest = (ModifyIntegrationRequest) o;
        return Objects.equals(this.name, modifyIntegrationRequest.name)
                && Objects.equals(this.parameters, modifyIntegrationRequest.parameters)
                && Objects.equals(this.environmentIds, modifyIntegrationRequest.environmentIds)
                && Objects.equals(this.configIds, modifyIntegrationRequest.configIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, parameters, environmentIds, configIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ModifyIntegrationRequest {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
        sb.append("    environmentIds: ").append(toIndentedString(environmentIds)).append("\n");
        sb.append("    configIds: ").append(toIndentedString(configIds)).append("\n");
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
        openapiFields.add("name");
        openapiFields.add("parameters");
        openapiFields.add("environmentIds");
        openapiFields.add("configIds");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
        openapiRequiredFields.add("name");
        openapiRequiredFields.add("parameters");
        openapiRequiredFields.add("environmentIds");
        openapiRequiredFields.add("configIds");
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to ModifyIntegrationRequest
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!ModifyIntegrationRequest.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in ModifyIntegrationRequest is not found"
                                        + " in the empty JSON string",
                                ModifyIntegrationRequest.openapiRequiredFields.toString()));
            }
        }

        Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
        // check to see if the JSON string contains additional fields
        for (Map.Entry<String, JsonElement> entry : entries) {
            if (!ModifyIntegrationRequest.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `ModifyIntegrationRequest` properties. JSON: %s",
                                entry.getKey(), jsonElement.toString()));
            }
        }

        // check to make sure all required properties/fields are present in the JSON string
        for (String requiredField : ModifyIntegrationRequest.openapiRequiredFields) {
            if (jsonElement.getAsJsonObject().get(requiredField) == null) {
                throw new IllegalArgumentException(
                        String.format(
                                "The required field `%s` is not found in the JSON string: %s",
                                requiredField, jsonElement.toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        if (!jsonObj.get("name").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `name` to be a primitive type in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("name").toString()));
        }
        // ensure the required json array is present
        if (jsonObj.get("environmentIds") == null) {
            throw new IllegalArgumentException(
                    "Expected the field `linkedContent` to be an array in the JSON string but got"
                            + " `null`");
        } else if (!jsonObj.get("environmentIds").isJsonArray()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `environmentIds` to be an array in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("environmentIds").toString()));
        }
        // ensure the required json array is present
        if (jsonObj.get("configIds") == null) {
            throw new IllegalArgumentException(
                    "Expected the field `linkedContent` to be an array in the JSON string but got"
                            + " `null`");
        } else if (!jsonObj.get("configIds").isJsonArray()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `configIds` to be an array in the JSON string but"
                                    + " got `%s`",
                            jsonObj.get("configIds").toString()));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!ModifyIntegrationRequest.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'ModifyIntegrationRequest' and its
                // subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<ModifyIntegrationRequest> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(ModifyIntegrationRequest.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<ModifyIntegrationRequest>() {
                        @Override
                        public void write(JsonWriter out, ModifyIntegrationRequest value)
                                throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public ModifyIntegrationRequest read(JsonReader in) throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            validateJsonElement(jsonElement);
                            return thisAdapter.fromJsonTree(jsonElement);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of ModifyIntegrationRequest given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of ModifyIntegrationRequest
     * @throws IOException if the JSON string is invalid with respect to ModifyIntegrationRequest
     */
    public static ModifyIntegrationRequest fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, ModifyIntegrationRequest.class);
    }

    /**
     * Convert an instance of ModifyIntegrationRequest to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
