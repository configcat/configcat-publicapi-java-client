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
 * OrganizationInvitationModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-09-10T12:39:37.024419310Z[Etc/UTC]", comments = "Generator version: 7.7.0")
public class OrganizationInvitationModel {
  public static final String SERIALIZED_NAME_INVITATION_ID = "invitationId";
  @SerializedName(SERIALIZED_NAME_INVITATION_ID)
  private UUID invitationId;

  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;

  public static final String SERIALIZED_NAME_PRODUCT_ID = "productId";
  @SerializedName(SERIALIZED_NAME_PRODUCT_ID)
  private UUID productId;

  public static final String SERIALIZED_NAME_PRODUCT_NAME = "productName";
  @SerializedName(SERIALIZED_NAME_PRODUCT_NAME)
  private String productName;

  public static final String SERIALIZED_NAME_PERMISSION_GROUP_ID = "permissionGroupId";
  @SerializedName(SERIALIZED_NAME_PERMISSION_GROUP_ID)
  private Long permissionGroupId;

  public static final String SERIALIZED_NAME_CREATED_AT = "createdAt";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_EXPIRED = "expired";
  @SerializedName(SERIALIZED_NAME_EXPIRED)
  private Boolean expired;

  public static final String SERIALIZED_NAME_EXPIRES = "expires";
  @SerializedName(SERIALIZED_NAME_EXPIRES)
  private OffsetDateTime expires;

  public OrganizationInvitationModel() {
  }

  public OrganizationInvitationModel invitationId(UUID invitationId) {
    this.invitationId = invitationId;
    return this;
  }

  /**
   * The identifier of the Invitation.
   * @return invitationId
   */
  @javax.annotation.Nullable
  public UUID getInvitationId() {
    return invitationId;
  }

  public void setInvitationId(UUID invitationId) {
    this.invitationId = invitationId;
  }


  public OrganizationInvitationModel email(String email) {
    this.email = email;
    return this;
  }

  /**
   * The invited user&#39;s email address.
   * @return email
   */
  @javax.annotation.Nullable
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }


  public OrganizationInvitationModel productId(UUID productId) {
    this.productId = productId;
    return this;
  }

  /**
   * The identifier of the Product the user was invited to.
   * @return productId
   */
  @javax.annotation.Nullable
  public UUID getProductId() {
    return productId;
  }

  public void setProductId(UUID productId) {
    this.productId = productId;
  }


  public OrganizationInvitationModel productName(String productName) {
    this.productName = productName;
    return this;
  }

  /**
   * The name of the Product the user was invited to.
   * @return productName
   */
  @javax.annotation.Nullable
  public String getProductName() {
    return productName;
  }

  public void setProductName(String productName) {
    this.productName = productName;
  }


  public OrganizationInvitationModel permissionGroupId(Long permissionGroupId) {
    this.permissionGroupId = permissionGroupId;
    return this;
  }

  /**
   * The identifier of the Permission Group the user was invited to.
   * @return permissionGroupId
   */
  @javax.annotation.Nullable
  public Long getPermissionGroupId() {
    return permissionGroupId;
  }

  public void setPermissionGroupId(Long permissionGroupId) {
    this.permissionGroupId = permissionGroupId;
  }


  public OrganizationInvitationModel createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Creation time of the Invitation.
   * @return createdAt
   */
  @javax.annotation.Nullable
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public OrganizationInvitationModel expired(Boolean expired) {
    this.expired = expired;
    return this;
  }

  /**
   * Determines whether the Invitation is expired.
   * @return expired
   */
  @javax.annotation.Nullable
  public Boolean getExpired() {
    return expired;
  }

  public void setExpired(Boolean expired) {
    this.expired = expired;
  }


  public OrganizationInvitationModel expires(OffsetDateTime expires) {
    this.expires = expires;
    return this;
  }

  /**
   * Expiration time of the Invitation.
   * @return expires
   */
  @javax.annotation.Nullable
  public OffsetDateTime getExpires() {
    return expires;
  }

  public void setExpires(OffsetDateTime expires) {
    this.expires = expires;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrganizationInvitationModel organizationInvitationModel = (OrganizationInvitationModel) o;
    return Objects.equals(this.invitationId, organizationInvitationModel.invitationId) &&
        Objects.equals(this.email, organizationInvitationModel.email) &&
        Objects.equals(this.productId, organizationInvitationModel.productId) &&
        Objects.equals(this.productName, organizationInvitationModel.productName) &&
        Objects.equals(this.permissionGroupId, organizationInvitationModel.permissionGroupId) &&
        Objects.equals(this.createdAt, organizationInvitationModel.createdAt) &&
        Objects.equals(this.expired, organizationInvitationModel.expired) &&
        Objects.equals(this.expires, organizationInvitationModel.expires);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(invitationId, email, productId, productName, permissionGroupId, createdAt, expired, expires);
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
    sb.append("class OrganizationInvitationModel {\n");
    sb.append("    invitationId: ").append(toIndentedString(invitationId)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    productName: ").append(toIndentedString(productName)).append("\n");
    sb.append("    permissionGroupId: ").append(toIndentedString(permissionGroupId)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    expired: ").append(toIndentedString(expired)).append("\n");
    sb.append("    expires: ").append(toIndentedString(expires)).append("\n");
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
    openapiFields.add("invitationId");
    openapiFields.add("email");
    openapiFields.add("productId");
    openapiFields.add("productName");
    openapiFields.add("permissionGroupId");
    openapiFields.add("createdAt");
    openapiFields.add("expired");
    openapiFields.add("expires");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to OrganizationInvitationModel
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!OrganizationInvitationModel.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in OrganizationInvitationModel is not found in the empty JSON string", OrganizationInvitationModel.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!OrganizationInvitationModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `OrganizationInvitationModel` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("invitationId") != null && !jsonObj.get("invitationId").isJsonNull()) && !jsonObj.get("invitationId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `invitationId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("invitationId").toString()));
      }
      if ((jsonObj.get("email") != null && !jsonObj.get("email").isJsonNull()) && !jsonObj.get("email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("email").toString()));
      }
      if ((jsonObj.get("productId") != null && !jsonObj.get("productId").isJsonNull()) && !jsonObj.get("productId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `productId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("productId").toString()));
      }
      if ((jsonObj.get("productName") != null && !jsonObj.get("productName").isJsonNull()) && !jsonObj.get("productName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `productName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("productName").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OrganizationInvitationModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OrganizationInvitationModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OrganizationInvitationModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OrganizationInvitationModel.class));

       return (TypeAdapter<T>) new TypeAdapter<OrganizationInvitationModel>() {
           @Override
           public void write(JsonWriter out, OrganizationInvitationModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OrganizationInvitationModel read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of OrganizationInvitationModel given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of OrganizationInvitationModel
   * @throws IOException if the JSON string is invalid with respect to OrganizationInvitationModel
   */
  public static OrganizationInvitationModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OrganizationInvitationModel.class);
  }

  /**
   * Convert an instance of OrganizationInvitationModel to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

