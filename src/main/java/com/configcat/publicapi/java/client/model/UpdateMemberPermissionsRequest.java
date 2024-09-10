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
 * UpdateMemberPermissionsRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-09-10T12:39:37.024419310Z[Etc/UTC]", comments = "Generator version: 7.7.0")
public class UpdateMemberPermissionsRequest {
  public static final String SERIALIZED_NAME_PERMISSION_GROUP_IDS = "permissionGroupIds";
  @SerializedName(SERIALIZED_NAME_PERMISSION_GROUP_IDS)
  private List<Long> permissionGroupIds;

  public static final String SERIALIZED_NAME_IS_ADMIN = "isAdmin";
  @SerializedName(SERIALIZED_NAME_IS_ADMIN)
  private Boolean isAdmin;

  public static final String SERIALIZED_NAME_IS_BILLING_MANAGER = "isBillingManager";
  @SerializedName(SERIALIZED_NAME_IS_BILLING_MANAGER)
  private Boolean isBillingManager;

  public static final String SERIALIZED_NAME_REMOVE_FROM_PERMISSION_GROUPS_WHERE_ID_NOT_SET = "removeFromPermissionGroupsWhereIdNotSet";
  @SerializedName(SERIALIZED_NAME_REMOVE_FROM_PERMISSION_GROUPS_WHERE_ID_NOT_SET)
  private Boolean removeFromPermissionGroupsWhereIdNotSet;

  public UpdateMemberPermissionsRequest() {
  }

  public UpdateMemberPermissionsRequest permissionGroupIds(List<Long> permissionGroupIds) {
    this.permissionGroupIds = permissionGroupIds;
    return this;
  }

  public UpdateMemberPermissionsRequest addPermissionGroupIdsItem(Long permissionGroupIdsItem) {
    if (this.permissionGroupIds == null) {
      this.permissionGroupIds = new ArrayList<>();
    }
    this.permissionGroupIds.add(permissionGroupIdsItem);
    return this;
  }

  /**
   * List of Permission Group identifiers to where the Member should be added.
   * @return permissionGroupIds
   */
  @javax.annotation.Nullable
  public List<Long> getPermissionGroupIds() {
    return permissionGroupIds;
  }

  public void setPermissionGroupIds(List<Long> permissionGroupIds) {
    this.permissionGroupIds = permissionGroupIds;
  }


  public UpdateMemberPermissionsRequest isAdmin(Boolean isAdmin) {
    this.isAdmin = isAdmin;
    return this;
  }

  /**
   * Indicates that the member must be Organization Admin.
   * @return isAdmin
   */
  @javax.annotation.Nullable
  public Boolean getIsAdmin() {
    return isAdmin;
  }

  public void setIsAdmin(Boolean isAdmin) {
    this.isAdmin = isAdmin;
  }


  public UpdateMemberPermissionsRequest isBillingManager(Boolean isBillingManager) {
    this.isBillingManager = isBillingManager;
    return this;
  }

  /**
   * Indicates that the member must be Billing Manager.
   * @return isBillingManager
   */
  @javax.annotation.Nullable
  public Boolean getIsBillingManager() {
    return isBillingManager;
  }

  public void setIsBillingManager(Boolean isBillingManager) {
    this.isBillingManager = isBillingManager;
  }


  public UpdateMemberPermissionsRequest removeFromPermissionGroupsWhereIdNotSet(Boolean removeFromPermissionGroupsWhereIdNotSet) {
    this.removeFromPermissionGroupsWhereIdNotSet = removeFromPermissionGroupsWhereIdNotSet;
    return this;
  }

  /**
   * When &#x60;true&#x60;, the member will be removed from those Permission Groups that are not listed in the &#x60;permissionGroupIds&#x60; field.
   * @return removeFromPermissionGroupsWhereIdNotSet
   */
  @javax.annotation.Nullable
  public Boolean getRemoveFromPermissionGroupsWhereIdNotSet() {
    return removeFromPermissionGroupsWhereIdNotSet;
  }

  public void setRemoveFromPermissionGroupsWhereIdNotSet(Boolean removeFromPermissionGroupsWhereIdNotSet) {
    this.removeFromPermissionGroupsWhereIdNotSet = removeFromPermissionGroupsWhereIdNotSet;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateMemberPermissionsRequest updateMemberPermissionsRequest = (UpdateMemberPermissionsRequest) o;
    return Objects.equals(this.permissionGroupIds, updateMemberPermissionsRequest.permissionGroupIds) &&
        Objects.equals(this.isAdmin, updateMemberPermissionsRequest.isAdmin) &&
        Objects.equals(this.isBillingManager, updateMemberPermissionsRequest.isBillingManager) &&
        Objects.equals(this.removeFromPermissionGroupsWhereIdNotSet, updateMemberPermissionsRequest.removeFromPermissionGroupsWhereIdNotSet);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(permissionGroupIds, isAdmin, isBillingManager, removeFromPermissionGroupsWhereIdNotSet);
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
    sb.append("class UpdateMemberPermissionsRequest {\n");
    sb.append("    permissionGroupIds: ").append(toIndentedString(permissionGroupIds)).append("\n");
    sb.append("    isAdmin: ").append(toIndentedString(isAdmin)).append("\n");
    sb.append("    isBillingManager: ").append(toIndentedString(isBillingManager)).append("\n");
    sb.append("    removeFromPermissionGroupsWhereIdNotSet: ").append(toIndentedString(removeFromPermissionGroupsWhereIdNotSet)).append("\n");
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
    openapiFields.add("permissionGroupIds");
    openapiFields.add("isAdmin");
    openapiFields.add("isBillingManager");
    openapiFields.add("removeFromPermissionGroupsWhereIdNotSet");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to UpdateMemberPermissionsRequest
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!UpdateMemberPermissionsRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UpdateMemberPermissionsRequest is not found in the empty JSON string", UpdateMemberPermissionsRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!UpdateMemberPermissionsRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UpdateMemberPermissionsRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the optional json data is an array if present
      if (jsonObj.get("permissionGroupIds") != null && !jsonObj.get("permissionGroupIds").isJsonNull() && !jsonObj.get("permissionGroupIds").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `permissionGroupIds` to be an array in the JSON string but got `%s`", jsonObj.get("permissionGroupIds").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UpdateMemberPermissionsRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UpdateMemberPermissionsRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UpdateMemberPermissionsRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UpdateMemberPermissionsRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<UpdateMemberPermissionsRequest>() {
           @Override
           public void write(JsonWriter out, UpdateMemberPermissionsRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UpdateMemberPermissionsRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of UpdateMemberPermissionsRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of UpdateMemberPermissionsRequest
   * @throws IOException if the JSON string is invalid with respect to UpdateMemberPermissionsRequest
   */
  public static UpdateMemberPermissionsRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UpdateMemberPermissionsRequest.class);
  }

  /**
   * Convert an instance of UpdateMemberPermissionsRequest to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

