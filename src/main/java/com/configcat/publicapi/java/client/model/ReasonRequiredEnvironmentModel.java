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

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.configcat.publicapi.java.client.JSON;

/**
 * ReasonRequiredEnvironmentModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-09-10T12:39:37.024419310Z[Etc/UTC]", comments = "Generator version: 7.7.0")
public class ReasonRequiredEnvironmentModel {
  public static final String SERIALIZED_NAME_ENVIRONMENT_ID = "environmentId";
  @SerializedName(SERIALIZED_NAME_ENVIRONMENT_ID)
  private UUID environmentId;

  public static final String SERIALIZED_NAME_REASON_REQUIRED = "reasonRequired";
  @SerializedName(SERIALIZED_NAME_REASON_REQUIRED)
  private Boolean reasonRequired;

  public static final String SERIALIZED_NAME_ENVIRONMENT_NAME = "environmentName";
  @SerializedName(SERIALIZED_NAME_ENVIRONMENT_NAME)
  private String environmentName;

  public ReasonRequiredEnvironmentModel() {
  }

  public ReasonRequiredEnvironmentModel environmentId(UUID environmentId) {
    this.environmentId = environmentId;
    return this;
  }

  /**
   * Identifier of the Environment.
   * @return environmentId
   */
  @javax.annotation.Nullable
  public UUID getEnvironmentId() {
    return environmentId;
  }

  public void setEnvironmentId(UUID environmentId) {
    this.environmentId = environmentId;
  }


  public ReasonRequiredEnvironmentModel reasonRequired(Boolean reasonRequired) {
    this.reasonRequired = reasonRequired;
    return this;
  }

  /**
   * Indicates that a mandatory note is required in this Environment for saving and publishing.
   * @return reasonRequired
   */
  @javax.annotation.Nullable
  public Boolean getReasonRequired() {
    return reasonRequired;
  }

  public void setReasonRequired(Boolean reasonRequired) {
    this.reasonRequired = reasonRequired;
  }


  public ReasonRequiredEnvironmentModel environmentName(String environmentName) {
    this.environmentName = environmentName;
    return this;
  }

  /**
   * Name of the Environment.
   * @return environmentName
   */
  @javax.annotation.Nullable
  public String getEnvironmentName() {
    return environmentName;
  }

  public void setEnvironmentName(String environmentName) {
    this.environmentName = environmentName;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReasonRequiredEnvironmentModel reasonRequiredEnvironmentModel = (ReasonRequiredEnvironmentModel) o;
    return Objects.equals(this.environmentId, reasonRequiredEnvironmentModel.environmentId) &&
        Objects.equals(this.reasonRequired, reasonRequiredEnvironmentModel.reasonRequired) &&
        Objects.equals(this.environmentName, reasonRequiredEnvironmentModel.environmentName);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(environmentId, reasonRequired, environmentName);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReasonRequiredEnvironmentModel {\n");
    sb.append("    environmentId: ").append(toIndentedString(environmentId)).append("\n");
    sb.append("    reasonRequired: ").append(toIndentedString(reasonRequired)).append("\n");
    sb.append("    environmentName: ").append(toIndentedString(environmentName)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
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
    openapiFields.add("environmentId");
    openapiFields.add("reasonRequired");
    openapiFields.add("environmentName");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ReasonRequiredEnvironmentModel
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ReasonRequiredEnvironmentModel.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ReasonRequiredEnvironmentModel is not found in the empty JSON string", ReasonRequiredEnvironmentModel.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ReasonRequiredEnvironmentModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ReasonRequiredEnvironmentModel` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("environmentId") != null && !jsonObj.get("environmentId").isJsonNull()) && !jsonObj.get("environmentId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `environmentId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("environmentId").toString()));
      }
      if ((jsonObj.get("environmentName") != null && !jsonObj.get("environmentName").isJsonNull()) && !jsonObj.get("environmentName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `environmentName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("environmentName").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ReasonRequiredEnvironmentModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ReasonRequiredEnvironmentModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ReasonRequiredEnvironmentModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ReasonRequiredEnvironmentModel.class));

       return (TypeAdapter<T>) new TypeAdapter<ReasonRequiredEnvironmentModel>() {
           @Override
           public void write(JsonWriter out, ReasonRequiredEnvironmentModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ReasonRequiredEnvironmentModel read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ReasonRequiredEnvironmentModel given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ReasonRequiredEnvironmentModel
   * @throws IOException if the JSON string is invalid with respect to ReasonRequiredEnvironmentModel
   */
  public static ReasonRequiredEnvironmentModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ReasonRequiredEnvironmentModel.class);
  }

  /**
   * Convert an instance of ReasonRequiredEnvironmentModel to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

