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
 * Determines a code reference line.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-20T16:55:24.304297906Z[Etc/UTC]", comments = "Generator version: 7.7.0")
public class ReferenceLine {
  public static final String SERIALIZED_NAME_LINE_TEXT = "lineText";
  @SerializedName(SERIALIZED_NAME_LINE_TEXT)
  private String lineText;

  public static final String SERIALIZED_NAME_LINE_NUMBER = "lineNumber";
  @SerializedName(SERIALIZED_NAME_LINE_NUMBER)
  private Integer lineNumber;

  public ReferenceLine() {
  }

  public ReferenceLine lineText(String lineText) {
    this.lineText = lineText;
    return this;
  }

  /**
   * The content of the reference line.
   * @return lineText
   */
  @javax.annotation.Nullable
  public String getLineText() {
    return lineText;
  }

  public void setLineText(String lineText) {
    this.lineText = lineText;
  }


  public ReferenceLine lineNumber(Integer lineNumber) {
    this.lineNumber = lineNumber;
    return this;
  }

  /**
   * The line number.
   * @return lineNumber
   */
  @javax.annotation.Nonnull
  public Integer getLineNumber() {
    return lineNumber;
  }

  public void setLineNumber(Integer lineNumber) {
    this.lineNumber = lineNumber;
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
   * @return the ReferenceLine instance itself
   */
  public ReferenceLine putAdditionalProperty(String key, Object value) {
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
    ReferenceLine referenceLine = (ReferenceLine) o;
    return Objects.equals(this.lineText, referenceLine.lineText) &&
        Objects.equals(this.lineNumber, referenceLine.lineNumber)&&
        Objects.equals(this.additionalProperties, referenceLine.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(lineText, lineNumber, additionalProperties);
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
    sb.append("class ReferenceLine {\n");
    sb.append("    lineText: ").append(toIndentedString(lineText)).append("\n");
    sb.append("    lineNumber: ").append(toIndentedString(lineNumber)).append("\n");
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
    openapiFields.add("lineText");
    openapiFields.add("lineNumber");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("lineNumber");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ReferenceLine
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ReferenceLine.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ReferenceLine is not found in the empty JSON string", ReferenceLine.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ReferenceLine.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("lineText") != null && !jsonObj.get("lineText").isJsonNull()) && !jsonObj.get("lineText").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `lineText` to be a primitive type in the JSON string but got `%s`", jsonObj.get("lineText").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ReferenceLine.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ReferenceLine' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ReferenceLine> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ReferenceLine.class));

       return (TypeAdapter<T>) new TypeAdapter<ReferenceLine>() {
           @Override
           public void write(JsonWriter out, ReferenceLine value) throws IOException {
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
           public ReferenceLine read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             ReferenceLine instance = thisAdapter.fromJsonTree(jsonObj);
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
   * Create an instance of ReferenceLine given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ReferenceLine
   * @throws IOException if the JSON string is invalid with respect to ReferenceLine
   */
  public static ReferenceLine fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ReferenceLine.class);
  }

  /**
   * Convert an instance of ReferenceLine to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

