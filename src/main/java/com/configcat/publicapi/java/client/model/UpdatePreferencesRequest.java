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
import com.configcat.publicapi.java.client.model.KeyGenerationMode;
import com.configcat.publicapi.java.client.model.UpdateReasonRequiredEnvironmentModel;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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
 * UpdatePreferencesRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-20T16:55:24.304297906Z[Etc/UTC]", comments = "Generator version: 7.7.0")
public class UpdatePreferencesRequest {
  public static final String SERIALIZED_NAME_REASON_REQUIRED = "reasonRequired";
  @SerializedName(SERIALIZED_NAME_REASON_REQUIRED)
  private Boolean reasonRequired;

  public static final String SERIALIZED_NAME_KEY_GENERATION_MODE = "keyGenerationMode";
  @SerializedName(SERIALIZED_NAME_KEY_GENERATION_MODE)
  private KeyGenerationMode keyGenerationMode;

  public static final String SERIALIZED_NAME_SHOW_VARIATION_ID = "showVariationId";
  @SerializedName(SERIALIZED_NAME_SHOW_VARIATION_ID)
  private Boolean showVariationId;

  public static final String SERIALIZED_NAME_MANDATORY_SETTING_HINT = "mandatorySettingHint";
  @SerializedName(SERIALIZED_NAME_MANDATORY_SETTING_HINT)
  private Boolean mandatorySettingHint;

  public static final String SERIALIZED_NAME_REASON_REQUIRED_ENVIRONMENTS = "reasonRequiredEnvironments";
  @SerializedName(SERIALIZED_NAME_REASON_REQUIRED_ENVIRONMENTS)
  private List<UpdateReasonRequiredEnvironmentModel> reasonRequiredEnvironments;

  public UpdatePreferencesRequest() {
  }

  public UpdatePreferencesRequest reasonRequired(Boolean reasonRequired) {
    this.reasonRequired = reasonRequired;
    return this;
  }

  /**
   * Indicates that a mandatory note is required for saving and publishing.
   * @return reasonRequired
   */
  @javax.annotation.Nullable
  public Boolean getReasonRequired() {
    return reasonRequired;
  }

  public void setReasonRequired(Boolean reasonRequired) {
    this.reasonRequired = reasonRequired;
  }


  public UpdatePreferencesRequest keyGenerationMode(KeyGenerationMode keyGenerationMode) {
    this.keyGenerationMode = keyGenerationMode;
    return this;
  }

  /**
   * Get keyGenerationMode
   * @return keyGenerationMode
   */
  @javax.annotation.Nullable
  public KeyGenerationMode getKeyGenerationMode() {
    return keyGenerationMode;
  }

  public void setKeyGenerationMode(KeyGenerationMode keyGenerationMode) {
    this.keyGenerationMode = keyGenerationMode;
  }


  public UpdatePreferencesRequest showVariationId(Boolean showVariationId) {
    this.showVariationId = showVariationId;
    return this;
  }

  /**
   * Indicates whether a variation ID&#39;s must be shown on the ConfigCat Dashboard.
   * @return showVariationId
   */
  @javax.annotation.Nullable
  public Boolean getShowVariationId() {
    return showVariationId;
  }

  public void setShowVariationId(Boolean showVariationId) {
    this.showVariationId = showVariationId;
  }


  public UpdatePreferencesRequest mandatorySettingHint(Boolean mandatorySettingHint) {
    this.mandatorySettingHint = mandatorySettingHint;
    return this;
  }

  /**
   * Indicates whether Feature flags and Settings must have a hint.
   * @return mandatorySettingHint
   */
  @javax.annotation.Nullable
  public Boolean getMandatorySettingHint() {
    return mandatorySettingHint;
  }

  public void setMandatorySettingHint(Boolean mandatorySettingHint) {
    this.mandatorySettingHint = mandatorySettingHint;
  }


  public UpdatePreferencesRequest reasonRequiredEnvironments(List<UpdateReasonRequiredEnvironmentModel> reasonRequiredEnvironments) {
    this.reasonRequiredEnvironments = reasonRequiredEnvironments;
    return this;
  }

  public UpdatePreferencesRequest addReasonRequiredEnvironmentsItem(UpdateReasonRequiredEnvironmentModel reasonRequiredEnvironmentsItem) {
    if (this.reasonRequiredEnvironments == null) {
      this.reasonRequiredEnvironments = new ArrayList<>();
    }
    this.reasonRequiredEnvironments.add(reasonRequiredEnvironmentsItem);
    return this;
  }

  /**
   * List of Environments where mandatory note must be set before saving and publishing.
   * @return reasonRequiredEnvironments
   */
  @javax.annotation.Nullable
  public List<UpdateReasonRequiredEnvironmentModel> getReasonRequiredEnvironments() {
    return reasonRequiredEnvironments;
  }

  public void setReasonRequiredEnvironments(List<UpdateReasonRequiredEnvironmentModel> reasonRequiredEnvironments) {
    this.reasonRequiredEnvironments = reasonRequiredEnvironments;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key name of the property
   * @param value value of the property
   * @return the UpdatePreferencesRequest instance itself
   */
  public UpdatePreferencesRequest putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return a map of objects
   */
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key name of the property
   * @return an object
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdatePreferencesRequest updatePreferencesRequest = (UpdatePreferencesRequest) o;
    return Objects.equals(this.reasonRequired, updatePreferencesRequest.reasonRequired) &&
        Objects.equals(this.keyGenerationMode, updatePreferencesRequest.keyGenerationMode) &&
        Objects.equals(this.showVariationId, updatePreferencesRequest.showVariationId) &&
        Objects.equals(this.mandatorySettingHint, updatePreferencesRequest.mandatorySettingHint) &&
        Objects.equals(this.reasonRequiredEnvironments, updatePreferencesRequest.reasonRequiredEnvironments)&&
        Objects.equals(this.additionalProperties, updatePreferencesRequest.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(reasonRequired, keyGenerationMode, showVariationId, mandatorySettingHint, reasonRequiredEnvironments, additionalProperties);
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
    sb.append("class UpdatePreferencesRequest {\n");
    sb.append("    reasonRequired: ").append(toIndentedString(reasonRequired)).append("\n");
    sb.append("    keyGenerationMode: ").append(toIndentedString(keyGenerationMode)).append("\n");
    sb.append("    showVariationId: ").append(toIndentedString(showVariationId)).append("\n");
    sb.append("    mandatorySettingHint: ").append(toIndentedString(mandatorySettingHint)).append("\n");
    sb.append("    reasonRequiredEnvironments: ").append(toIndentedString(reasonRequiredEnvironments)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
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
    openapiFields.add("reasonRequired");
    openapiFields.add("keyGenerationMode");
    openapiFields.add("showVariationId");
    openapiFields.add("mandatorySettingHint");
    openapiFields.add("reasonRequiredEnvironments");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to UpdatePreferencesRequest
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!UpdatePreferencesRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UpdatePreferencesRequest is not found in the empty JSON string", UpdatePreferencesRequest.openapiRequiredFields.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `keyGenerationMode`
      if (jsonObj.get("keyGenerationMode") != null && !jsonObj.get("keyGenerationMode").isJsonNull()) {
        KeyGenerationMode.validateJsonElement(jsonObj.get("keyGenerationMode"));
      }
      if (jsonObj.get("reasonRequiredEnvironments") != null && !jsonObj.get("reasonRequiredEnvironments").isJsonNull()) {
        JsonArray jsonArrayreasonRequiredEnvironments = jsonObj.getAsJsonArray("reasonRequiredEnvironments");
        if (jsonArrayreasonRequiredEnvironments != null) {
          // ensure the json data is an array
          if (!jsonObj.get("reasonRequiredEnvironments").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `reasonRequiredEnvironments` to be an array in the JSON string but got `%s`", jsonObj.get("reasonRequiredEnvironments").toString()));
          }

          // validate the optional field `reasonRequiredEnvironments` (array)
          for (int i = 0; i < jsonArrayreasonRequiredEnvironments.size(); i++) {
            UpdateReasonRequiredEnvironmentModel.validateJsonElement(jsonArrayreasonRequiredEnvironments.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UpdatePreferencesRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UpdatePreferencesRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UpdatePreferencesRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UpdatePreferencesRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<UpdatePreferencesRequest>() {
           @Override
           public void write(JsonWriter out, UpdatePreferencesRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additional properties
             if (value.getAdditionalProperties() != null) {
               for (Map.Entry<String, Object> entry : value.getAdditionalProperties().entrySet()) {
                 if (entry.getValue() instanceof String)
                   obj.addProperty(entry.getKey(), (String) entry.getValue());
                 else if (entry.getValue() instanceof Number)
                   obj.addProperty(entry.getKey(), (Number) entry.getValue());
                 else if (entry.getValue() instanceof Boolean)
                   obj.addProperty(entry.getKey(), (Boolean) entry.getValue());
                 else if (entry.getValue() instanceof Character)
                   obj.addProperty(entry.getKey(), (Character) entry.getValue());
                 else {
                   JsonElement jsonElement = gson.toJsonTree(entry.getValue());
                   if (jsonElement.isJsonArray()) {
                     obj.add(entry.getKey(), jsonElement.getAsJsonArray());
                   } else {
                     obj.add(entry.getKey(), jsonElement.getAsJsonObject());
                   }
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public UpdatePreferencesRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             UpdatePreferencesRequest instance = thisAdapter.fromJsonTree(jsonObj);
             for (Map.Entry<String, JsonElement> entry : jsonObj.entrySet()) {
               if (!openapiFields.contains(entry.getKey())) {
                 if (entry.getValue().isJsonPrimitive()) { // primitive type
                   if (entry.getValue().getAsJsonPrimitive().isString())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsString());
                   else if (entry.getValue().getAsJsonPrimitive().isNumber())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsNumber());
                   else if (entry.getValue().getAsJsonPrimitive().isBoolean())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsBoolean());
                   else
                     throw new IllegalArgumentException(String.format("The field `%s` has unknown primitive type. Value: %s", entry.getKey(), entry.getValue().toString()));
                 } else if (entry.getValue().isJsonArray()) {
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), List.class));
                 } else { // JSON object
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), HashMap.class));
                 }
               }
             }
             return instance;
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of UpdatePreferencesRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of UpdatePreferencesRequest
   * @throws IOException if the JSON string is invalid with respect to UpdatePreferencesRequest
   */
  public static UpdatePreferencesRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UpdatePreferencesRequest.class);
  }

  /**
   * Convert an instance of UpdatePreferencesRequest to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

