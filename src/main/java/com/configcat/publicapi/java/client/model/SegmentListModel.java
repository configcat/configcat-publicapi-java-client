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
import com.configcat.publicapi.java.client.model.ProductModel;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;
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
 * SegmentListModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-20T16:55:24.304297906Z[Etc/UTC]", comments = "Generator version: 7.7.0")
public class SegmentListModel {
  public static final String SERIALIZED_NAME_PRODUCT = "product";
  @SerializedName(SERIALIZED_NAME_PRODUCT)
  private ProductModel product;

  public static final String SERIALIZED_NAME_SEGMENT_ID = "segmentId";
  @SerializedName(SERIALIZED_NAME_SEGMENT_ID)
  private UUID segmentId;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_CREATOR_EMAIL = "creatorEmail";
  @SerializedName(SERIALIZED_NAME_CREATOR_EMAIL)
  private String creatorEmail;

  public static final String SERIALIZED_NAME_CREATOR_FULL_NAME = "creatorFullName";
  @SerializedName(SERIALIZED_NAME_CREATOR_FULL_NAME)
  private String creatorFullName;

  public static final String SERIALIZED_NAME_CREATED_AT = "createdAt";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_LAST_UPDATER_EMAIL = "lastUpdaterEmail";
  @SerializedName(SERIALIZED_NAME_LAST_UPDATER_EMAIL)
  private String lastUpdaterEmail;

  public static final String SERIALIZED_NAME_LAST_UPDATER_FULL_NAME = "lastUpdaterFullName";
  @SerializedName(SERIALIZED_NAME_LAST_UPDATER_FULL_NAME)
  private String lastUpdaterFullName;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updatedAt";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private OffsetDateTime updatedAt;

  public static final String SERIALIZED_NAME_USAGE = "usage";
  @SerializedName(SERIALIZED_NAME_USAGE)
  private Integer usage;

  public SegmentListModel() {
  }

  public SegmentListModel product(ProductModel product) {
    this.product = product;
    return this;
  }

  /**
   * Get product
   * @return product
   */
  @javax.annotation.Nullable
  public ProductModel getProduct() {
    return product;
  }

  public void setProduct(ProductModel product) {
    this.product = product;
  }


  public SegmentListModel segmentId(UUID segmentId) {
    this.segmentId = segmentId;
    return this;
  }

  /**
   * Identifier of the Segment.
   * @return segmentId
   */
  @javax.annotation.Nullable
  public UUID getSegmentId() {
    return segmentId;
  }

  public void setSegmentId(UUID segmentId) {
    this.segmentId = segmentId;
  }


  public SegmentListModel name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the Segment.
   * @return name
   */
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public SegmentListModel description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Description of the Segment.
   * @return description
   */
  @javax.annotation.Nullable
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  public SegmentListModel creatorEmail(String creatorEmail) {
    this.creatorEmail = creatorEmail;
    return this;
  }

  /**
   * The email of the user who created the Segment.
   * @return creatorEmail
   */
  @javax.annotation.Nullable
  public String getCreatorEmail() {
    return creatorEmail;
  }

  public void setCreatorEmail(String creatorEmail) {
    this.creatorEmail = creatorEmail;
  }


  public SegmentListModel creatorFullName(String creatorFullName) {
    this.creatorFullName = creatorFullName;
    return this;
  }

  /**
   * The name of the user who created the Segment.
   * @return creatorFullName
   */
  @javax.annotation.Nullable
  public String getCreatorFullName() {
    return creatorFullName;
  }

  public void setCreatorFullName(String creatorFullName) {
    this.creatorFullName = creatorFullName;
  }


  public SegmentListModel createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * The date and time when the Segment was created.
   * @return createdAt
   */
  @javax.annotation.Nullable
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public SegmentListModel lastUpdaterEmail(String lastUpdaterEmail) {
    this.lastUpdaterEmail = lastUpdaterEmail;
    return this;
  }

  /**
   * The email of the user who last updated the Segment.
   * @return lastUpdaterEmail
   */
  @javax.annotation.Nullable
  public String getLastUpdaterEmail() {
    return lastUpdaterEmail;
  }

  public void setLastUpdaterEmail(String lastUpdaterEmail) {
    this.lastUpdaterEmail = lastUpdaterEmail;
  }


  public SegmentListModel lastUpdaterFullName(String lastUpdaterFullName) {
    this.lastUpdaterFullName = lastUpdaterFullName;
    return this;
  }

  /**
   * The name of the user who last updated the Segment.
   * @return lastUpdaterFullName
   */
  @javax.annotation.Nullable
  public String getLastUpdaterFullName() {
    return lastUpdaterFullName;
  }

  public void setLastUpdaterFullName(String lastUpdaterFullName) {
    this.lastUpdaterFullName = lastUpdaterFullName;
  }


  public SegmentListModel updatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  /**
   * The date and time when the Segment was last updated.
   * @return updatedAt
   */
  @javax.annotation.Nullable
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }


  public SegmentListModel usage(Integer usage) {
    this.usage = usage;
    return this;
  }

  /**
   * Determines how many Feature Flags and Settings are using the Segment.
   * @return usage
   */
  @javax.annotation.Nullable
  public Integer getUsage() {
    return usage;
  }

  public void setUsage(Integer usage) {
    this.usage = usage;
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
   * @return the SegmentListModel instance itself
   */
  public SegmentListModel putAdditionalProperty(String key, Object value) {
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
    SegmentListModel segmentListModel = (SegmentListModel) o;
    return Objects.equals(this.product, segmentListModel.product) &&
        Objects.equals(this.segmentId, segmentListModel.segmentId) &&
        Objects.equals(this.name, segmentListModel.name) &&
        Objects.equals(this.description, segmentListModel.description) &&
        Objects.equals(this.creatorEmail, segmentListModel.creatorEmail) &&
        Objects.equals(this.creatorFullName, segmentListModel.creatorFullName) &&
        Objects.equals(this.createdAt, segmentListModel.createdAt) &&
        Objects.equals(this.lastUpdaterEmail, segmentListModel.lastUpdaterEmail) &&
        Objects.equals(this.lastUpdaterFullName, segmentListModel.lastUpdaterFullName) &&
        Objects.equals(this.updatedAt, segmentListModel.updatedAt) &&
        Objects.equals(this.usage, segmentListModel.usage)&&
        Objects.equals(this.additionalProperties, segmentListModel.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(product, segmentId, name, description, creatorEmail, creatorFullName, createdAt, lastUpdaterEmail, lastUpdaterFullName, updatedAt, usage, additionalProperties);
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
    sb.append("class SegmentListModel {\n");
    sb.append("    product: ").append(toIndentedString(product)).append("\n");
    sb.append("    segmentId: ").append(toIndentedString(segmentId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    creatorEmail: ").append(toIndentedString(creatorEmail)).append("\n");
    sb.append("    creatorFullName: ").append(toIndentedString(creatorFullName)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    lastUpdaterEmail: ").append(toIndentedString(lastUpdaterEmail)).append("\n");
    sb.append("    lastUpdaterFullName: ").append(toIndentedString(lastUpdaterFullName)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    usage: ").append(toIndentedString(usage)).append("\n");
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
    openapiFields.add("product");
    openapiFields.add("segmentId");
    openapiFields.add("name");
    openapiFields.add("description");
    openapiFields.add("creatorEmail");
    openapiFields.add("creatorFullName");
    openapiFields.add("createdAt");
    openapiFields.add("lastUpdaterEmail");
    openapiFields.add("lastUpdaterFullName");
    openapiFields.add("updatedAt");
    openapiFields.add("usage");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to SegmentListModel
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!SegmentListModel.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SegmentListModel is not found in the empty JSON string", SegmentListModel.openapiRequiredFields.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `product`
      if (jsonObj.get("product") != null && !jsonObj.get("product").isJsonNull()) {
        ProductModel.validateJsonElement(jsonObj.get("product"));
      }
      if ((jsonObj.get("segmentId") != null && !jsonObj.get("segmentId").isJsonNull()) && !jsonObj.get("segmentId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `segmentId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("segmentId").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if ((jsonObj.get("creatorEmail") != null && !jsonObj.get("creatorEmail").isJsonNull()) && !jsonObj.get("creatorEmail").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `creatorEmail` to be a primitive type in the JSON string but got `%s`", jsonObj.get("creatorEmail").toString()));
      }
      if ((jsonObj.get("creatorFullName") != null && !jsonObj.get("creatorFullName").isJsonNull()) && !jsonObj.get("creatorFullName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `creatorFullName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("creatorFullName").toString()));
      }
      if ((jsonObj.get("lastUpdaterEmail") != null && !jsonObj.get("lastUpdaterEmail").isJsonNull()) && !jsonObj.get("lastUpdaterEmail").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `lastUpdaterEmail` to be a primitive type in the JSON string but got `%s`", jsonObj.get("lastUpdaterEmail").toString()));
      }
      if ((jsonObj.get("lastUpdaterFullName") != null && !jsonObj.get("lastUpdaterFullName").isJsonNull()) && !jsonObj.get("lastUpdaterFullName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `lastUpdaterFullName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("lastUpdaterFullName").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SegmentListModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SegmentListModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SegmentListModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SegmentListModel.class));

       return (TypeAdapter<T>) new TypeAdapter<SegmentListModel>() {
           @Override
           public void write(JsonWriter out, SegmentListModel value) throws IOException {
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
           public SegmentListModel read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             SegmentListModel instance = thisAdapter.fromJsonTree(jsonObj);
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
   * Create an instance of SegmentListModel given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of SegmentListModel
   * @throws IOException if the JSON string is invalid with respect to SegmentListModel
   */
  public static SegmentListModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SegmentListModel.class);
  }

  /**
   * Convert an instance of SegmentListModel to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

