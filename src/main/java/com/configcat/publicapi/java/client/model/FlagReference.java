/*
 * ConfigCat Public Management API
 * The purpose of this API is to access the ConfigCat platform programmatically. You can **Create**, **Read**, **Update** and **Delete** any entities like **Feature Flags, Configs, Environments** or **Products** within ConfigCat.  **Base API URL**: https://test-api.configcat.com  If you prefer the swagger documentation, you can find it here: [Swagger UI](https://test-api.configcat.com/swagger).  The API is based on HTTP REST, uses resource-oriented URLs, status codes and supports JSON  format.   **Important:** Do not use this API for accessing and evaluating feature flag values. Use the [SDKs](https://configcat.com/docs/sdk-reference/overview) or the [ConfigCat Proxy](https://configcat.com/docs/advanced/proxy/proxy-overview/) instead.  # OpenAPI Specification  The complete specification is publicly available in the following formats:  - [OpenAPI v3](https://test-api.configcat.com/docs/v1/swagger.json) - [Swagger v2](https://test-api.configcat.com/docs/v1/swagger.v2.json)  You can use it to generate client libraries in various languages with [OpenAPI Generator](https://github.com/OpenAPITools/openapi-generator) or [Swagger Codegen](https://swagger.io/tools/swagger-codegen/) to interact with this API.  # Authentication This API uses the [Basic HTTP Authentication Scheme](https://en.wikipedia.org/wiki/Basic_access_authentication).   <!-- ReDoc-Inject: <security-definitions> -->  # Throttling and rate limits All the rate limited API calls are returning information about the current rate limit period in the following HTTP headers:  | Header | Description | | :- | :- | | X-Rate-Limit-Remaining | The maximum number of requests remaining in the current rate limit period. | | X-Rate-Limit-Reset     | The time when the current rate limit period resets.        |  When the rate limit is exceeded by a request, the API returns with a `HTTP 429 - Too many requests` status along with a `Retry-After` HTTP header. 
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
import com.configcat.publicapi.java.client.model.ReferenceLines;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
 * FlagReference
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-08-27T15:17:02.569404381Z[Etc/UTC]", comments = "Generator version: 7.7.0")
public class FlagReference {
  public static final String SERIALIZED_NAME_SETTING_ID = "settingId";
  @SerializedName(SERIALIZED_NAME_SETTING_ID)
  private Integer settingId;

  public static final String SERIALIZED_NAME_REFERENCES = "references";
  @SerializedName(SERIALIZED_NAME_REFERENCES)
  private List<ReferenceLines> references = new ArrayList<>();

  public FlagReference() {
  }

  public FlagReference settingId(Integer settingId) {
    this.settingId = settingId;
    return this;
  }

  /**
   * The identifier of the Feature Flag or Setting the code reference belongs to.
   * @return settingId
   */
  @javax.annotation.Nonnull
  public Integer getSettingId() {
    return settingId;
  }

  public void setSettingId(Integer settingId) {
    this.settingId = settingId;
  }


  public FlagReference references(List<ReferenceLines> references) {
    this.references = references;
    return this;
  }

  public FlagReference addReferencesItem(ReferenceLines referencesItem) {
    if (this.references == null) {
      this.references = new ArrayList<>();
    }
    this.references.add(referencesItem);
    return this;
  }

  /**
   * The actual references to the given Feature Flag or Setting.
   * @return references
   */
  @javax.annotation.Nonnull
  public List<ReferenceLines> getReferences() {
    return references;
  }

  public void setReferences(List<ReferenceLines> references) {
    this.references = references;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FlagReference flagReference = (FlagReference) o;
    return Objects.equals(this.settingId, flagReference.settingId) &&
        Objects.equals(this.references, flagReference.references);
  }

  @Override
  public int hashCode() {
    return Objects.hash(settingId, references);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FlagReference {\n");
    sb.append("    settingId: ").append(toIndentedString(settingId)).append("\n");
    sb.append("    references: ").append(toIndentedString(references)).append("\n");
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
    openapiFields.add("settingId");
    openapiFields.add("references");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("settingId");
    openapiRequiredFields.add("references");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to FlagReference
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!FlagReference.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in FlagReference is not found in the empty JSON string", FlagReference.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!FlagReference.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `FlagReference` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : FlagReference.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the json data is an array
      if (!jsonObj.get("references").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `references` to be an array in the JSON string but got `%s`", jsonObj.get("references").toString()));
      }

      JsonArray jsonArrayreferences = jsonObj.getAsJsonArray("references");
      // validate the required field `references` (array)
      for (int i = 0; i < jsonArrayreferences.size(); i++) {
        ReferenceLines.validateJsonElement(jsonArrayreferences.get(i));
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!FlagReference.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FlagReference' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FlagReference> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FlagReference.class));

       return (TypeAdapter<T>) new TypeAdapter<FlagReference>() {
           @Override
           public void write(JsonWriter out, FlagReference value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public FlagReference read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of FlagReference given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of FlagReference
   * @throws IOException if the JSON string is invalid with respect to FlagReference
   */
  public static FlagReference fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FlagReference.class);
  }

  /**
   * Convert an instance of FlagReference to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

