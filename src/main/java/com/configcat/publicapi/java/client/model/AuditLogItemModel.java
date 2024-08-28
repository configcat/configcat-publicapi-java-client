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
 * AuditLogItemModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-08-27T15:17:02.569404381Z[Etc/UTC]", comments = "Generator version: 7.7.0")
public class AuditLogItemModel {
  public static final String SERIALIZED_NAME_AUDIT_LOG_ID = "auditLogId";
  @SerializedName(SERIALIZED_NAME_AUDIT_LOG_ID)
  private Long auditLogId;

  public static final String SERIALIZED_NAME_AUDIT_LOG_DATE_TIME = "auditLogDateTime";
  @SerializedName(SERIALIZED_NAME_AUDIT_LOG_DATE_TIME)
  private OffsetDateTime auditLogDateTime;

  /**
   * Gets or Sets auditLogTypeEnum
   */
  @JsonAdapter(AuditLogTypeEnumEnum.Adapter.class)
  public enum AuditLogTypeEnumEnum {
    PRODUCT_CREATED("productCreated"),
    
    PRODUCT_CHANGED("productChanged"),
    
    PRODUCT_OWNERSHIP_TRANSFERRED("productOwnershipTransferred"),
    
    PRODUCT_DELETED("productDeleted"),
    
    PRODUCTS_REORDERED("productsReordered"),
    
    TEAM_MEMBER_INVITED("teamMemberInvited"),
    
    TEAM_MEMBER_INVITATION_REVOKED("teamMemberInvitationRevoked"),
    
    TEAM_MEMBER_JOINED("teamMemberJoined"),
    
    TEAM_MEMBER_PERMISSION_GROUP_CHANGED("teamMemberPermissionGroupChanged"),
    
    TEAM_MEMBER_REMOVED("teamMemberRemoved"),
    
    TEAM_MEMBER_LEFT("teamMemberLeft"),
    
    TEAM_MEMBER_INVITATION_CHANGED("teamMemberInvitationChanged"),
    
    TEAM_MEMBER_INVITATION_RESENT("teamMemberInvitationResent"),
    
    TEAM_MEMBER_INVITATION_REJECTED("teamMemberInvitationRejected"),
    
    CONFIG_CREATED("configCreated"),
    
    CONFIG_CHANGED("configChanged"),
    
    CONFIG_DELETED("configDeleted"),
    
    CONFIGS_REORDERED("configsReordered"),
    
    ENVIRONMENT_CREATED("environmentCreated"),
    
    ENVIRONMENT_CHANGED("environmentChanged"),
    
    ENVIRONMENT_DELETED("environmentDeleted"),
    
    ENVIRONMENTS_REORDERED("environmentsReordered"),
    
    SETTING_CREATED("settingCreated"),
    
    SETTING_CHANGED("settingChanged"),
    
    SETTING_DELETED("settingDeleted"),
    
    SETTINGS_REORDERED("settingsReordered"),
    
    SETTING_VALUE_CHANGED("settingValueChanged"),
    
    WEB_HOOK_CREATED("webHookCreated"),
    
    WEB_HOOK_CHANGED("webHookChanged"),
    
    WEB_HOOK_DELETED("webHookDeleted"),
    
    PERMISSION_GROUP_CREATED("permissionGroupCreated"),
    
    PERMISSION_GROUP_CHANGED("permissionGroupChanged"),
    
    PERMISSION_GROUP_DELETED("permissionGroupDeleted"),
    
    PERMISSION_GROUP_DEFAULT("permissionGroupDefault"),
    
    API_KEY_ADDED("apiKeyAdded"),
    
    API_KEY_REMOVED("apiKeyRemoved"),
    
    INTEGRATION_ADDED("integrationAdded"),
    
    INTEGRATION_CHANGED("integrationChanged"),
    
    INTEGRATION_REMOVED("integrationRemoved"),
    
    API_KEY_CONNECTED("apiKeyConnected"),
    
    INTEGRATION_LINK_ADDED("integrationLinkAdded"),
    
    INTEGRATION_LINK_REMOVED("integrationLinkRemoved"),
    
    ORGANIZATION_ADDED("organizationAdded"),
    
    ORGANIZATION_REMOVED("organizationRemoved"),
    
    ORGANIZATION_CHANGED("organizationChanged"),
    
    ORGANIZATION_SUBSCRIPTION_TYPE_CHANGED("organizationSubscriptionTypeChanged"),
    
    ORGANIZATION_ADMIN_CHANGED("organizationAdminChanged"),
    
    ORGANIZATION_ADMIN_LEFT("organizationAdminLeft"),
    
    ORGANIZATION_ADMIN_DISABLED2_FA("organizationAdminDisabled2FA"),
    
    TAG_ADDED("tagAdded"),
    
    TAG_CHANGED("tagChanged"),
    
    TAG_REMOVED("tagRemoved"),
    
    SETTING_TAG_ADDED("settingTagAdded"),
    
    SETTING_TAG_REMOVED("settingTagRemoved"),
    
    PUBLIC_API_ACCESS_TOKEN_ADDED("publicApiAccessTokenAdded"),
    
    PUBLIC_API_ACCESS_TOKEN_REMOVED("publicApiAccessTokenRemoved"),
    
    DOMAIN_ADDED("domainAdded"),
    
    DOMAIN_VERIFIED("domainVerified"),
    
    DOMAIN_REMOVED("domainRemoved"),
    
    DOMAIN_SAML_CONFIGURED("domainSamlConfigured"),
    
    DOMAIN_SAML_DELETED("domainSamlDeleted"),
    
    AUTO_PROVISIONING_CONFIGURATION_CHANGED("autoProvisioningConfigurationChanged"),
    
    SAML_IDP_CONFIGURATION_ADDED("samlIdpConfigurationAdded"),
    
    SAML_IDP_CONFIGURATION_REMOVED("samlIdpConfigurationRemoved"),
    
    SAML_IDP_CONFIGURATION_UPDATED("samlIdpConfigurationUpdated"),
    
    ORGANIZATION_MEMBER_JOINED("organizationMemberJoined"),
    
    ORGANIZATION_MEMBER_PRODUCT_JOIN_REQUESTED("organizationMemberProductJoinRequested"),
    
    ORGANIZATION_MEMBER_PRODUCT_JOIN_REQUEST_REJECTED("organizationMemberProductJoinRequestRejected"),
    
    ORGANIZATION_MEMBER_PRODUCT_JOIN_REQUEST_APPROVED("organizationMemberProductJoinRequestApproved"),
    
    CODE_REFERENCES_UPLOADED("codeReferencesUploaded"),
    
    CODE_REFERENCE_DELETED("codeReferenceDeleted"),
    
    CODE_REFERENCE_STALE_BRANCH_DELETED("codeReferenceStaleBranchDeleted"),
    
    SEGMENT_CREATED("segmentCreated"),
    
    SEGMENT_CHANGED("segmentChanged"),
    
    SEGMENT_DELETED("segmentDeleted"),
    
    WEBHOOK_SIGNING_KEY_DELETED("webhookSigningKeyDeleted"),
    
    WEBHOOK_SIGNING_KEY_CREATED("webhookSigningKeyCreated");

    private String value;

    AuditLogTypeEnumEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static AuditLogTypeEnumEnum fromValue(String value) {
      for (AuditLogTypeEnumEnum b : AuditLogTypeEnumEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<AuditLogTypeEnumEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AuditLogTypeEnumEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public AuditLogTypeEnumEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return AuditLogTypeEnumEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      AuditLogTypeEnumEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_AUDIT_LOG_TYPE_ENUM = "auditLogTypeEnum";
  @SerializedName(SERIALIZED_NAME_AUDIT_LOG_TYPE_ENUM)
  private AuditLogTypeEnumEnum auditLogTypeEnum;

  public static final String SERIALIZED_NAME_CHANGE_SET_ID = "changeSetId";
  @SerializedName(SERIALIZED_NAME_CHANGE_SET_ID)
  private UUID changeSetId;

  public static final String SERIALIZED_NAME_TRUNCATED = "truncated";
  @SerializedName(SERIALIZED_NAME_TRUNCATED)
  private Boolean truncated;

  public static final String SERIALIZED_NAME_AUDIT_LOG_TYPE = "auditLogType";
  @SerializedName(SERIALIZED_NAME_AUDIT_LOG_TYPE)
  private String auditLogType;

  public static final String SERIALIZED_NAME_USER_EMAIL = "userEmail";
  @SerializedName(SERIALIZED_NAME_USER_EMAIL)
  private String userEmail;

  public static final String SERIALIZED_NAME_USER_NAME = "userName";
  @SerializedName(SERIALIZED_NAME_USER_NAME)
  private String userName;

  public static final String SERIALIZED_NAME_WHERE = "where";
  @SerializedName(SERIALIZED_NAME_WHERE)
  private String where;

  public static final String SERIALIZED_NAME_WHY = "why";
  @SerializedName(SERIALIZED_NAME_WHY)
  private String why;

  public static final String SERIALIZED_NAME_ACTION_TARGET = "actionTarget";
  @SerializedName(SERIALIZED_NAME_ACTION_TARGET)
  private String actionTarget;

  public static final String SERIALIZED_NAME_DETAILS = "details";
  @SerializedName(SERIALIZED_NAME_DETAILS)
  private String details;

  public AuditLogItemModel() {
  }

  public AuditLogItemModel auditLogId(Long auditLogId) {
    this.auditLogId = auditLogId;
    return this;
  }

  /**
   * Get auditLogId
   * @return auditLogId
   */
  @javax.annotation.Nullable
  public Long getAuditLogId() {
    return auditLogId;
  }

  public void setAuditLogId(Long auditLogId) {
    this.auditLogId = auditLogId;
  }


  public AuditLogItemModel auditLogDateTime(OffsetDateTime auditLogDateTime) {
    this.auditLogDateTime = auditLogDateTime;
    return this;
  }

  /**
   * Get auditLogDateTime
   * @return auditLogDateTime
   */
  @javax.annotation.Nullable
  public OffsetDateTime getAuditLogDateTime() {
    return auditLogDateTime;
  }

  public void setAuditLogDateTime(OffsetDateTime auditLogDateTime) {
    this.auditLogDateTime = auditLogDateTime;
  }


  public AuditLogItemModel auditLogTypeEnum(AuditLogTypeEnumEnum auditLogTypeEnum) {
    this.auditLogTypeEnum = auditLogTypeEnum;
    return this;
  }

  /**
   * Get auditLogTypeEnum
   * @return auditLogTypeEnum
   */
  @javax.annotation.Nullable
  public AuditLogTypeEnumEnum getAuditLogTypeEnum() {
    return auditLogTypeEnum;
  }

  public void setAuditLogTypeEnum(AuditLogTypeEnumEnum auditLogTypeEnum) {
    this.auditLogTypeEnum = auditLogTypeEnum;
  }


  public AuditLogItemModel changeSetId(UUID changeSetId) {
    this.changeSetId = changeSetId;
    return this;
  }

  /**
   * Get changeSetId
   * @return changeSetId
   */
  @javax.annotation.Nullable
  public UUID getChangeSetId() {
    return changeSetId;
  }

  public void setChangeSetId(UUID changeSetId) {
    this.changeSetId = changeSetId;
  }


  public AuditLogItemModel truncated(Boolean truncated) {
    this.truncated = truncated;
    return this;
  }

  /**
   * Get truncated
   * @return truncated
   */
  @javax.annotation.Nullable
  public Boolean getTruncated() {
    return truncated;
  }

  public void setTruncated(Boolean truncated) {
    this.truncated = truncated;
  }


  public AuditLogItemModel auditLogType(String auditLogType) {
    this.auditLogType = auditLogType;
    return this;
  }

  /**
   * Get auditLogType
   * @return auditLogType
   */
  @javax.annotation.Nullable
  public String getAuditLogType() {
    return auditLogType;
  }

  public void setAuditLogType(String auditLogType) {
    this.auditLogType = auditLogType;
  }


  public AuditLogItemModel userEmail(String userEmail) {
    this.userEmail = userEmail;
    return this;
  }

  /**
   * Get userEmail
   * @return userEmail
   */
  @javax.annotation.Nullable
  public String getUserEmail() {
    return userEmail;
  }

  public void setUserEmail(String userEmail) {
    this.userEmail = userEmail;
  }


  public AuditLogItemModel userName(String userName) {
    this.userName = userName;
    return this;
  }

  /**
   * Get userName
   * @return userName
   */
  @javax.annotation.Nullable
  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }


  public AuditLogItemModel where(String where) {
    this.where = where;
    return this;
  }

  /**
   * Get where
   * @return where
   */
  @javax.annotation.Nullable
  public String getWhere() {
    return where;
  }

  public void setWhere(String where) {
    this.where = where;
  }


  public AuditLogItemModel why(String why) {
    this.why = why;
    return this;
  }

  /**
   * Get why
   * @return why
   */
  @javax.annotation.Nullable
  public String getWhy() {
    return why;
  }

  public void setWhy(String why) {
    this.why = why;
  }


  public AuditLogItemModel actionTarget(String actionTarget) {
    this.actionTarget = actionTarget;
    return this;
  }

  /**
   * Get actionTarget
   * @return actionTarget
   */
  @javax.annotation.Nullable
  public String getActionTarget() {
    return actionTarget;
  }

  public void setActionTarget(String actionTarget) {
    this.actionTarget = actionTarget;
  }


  public AuditLogItemModel details(String details) {
    this.details = details;
    return this;
  }

  /**
   * Get details
   * @return details
   */
  @javax.annotation.Nullable
  public String getDetails() {
    return details;
  }

  public void setDetails(String details) {
    this.details = details;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuditLogItemModel auditLogItemModel = (AuditLogItemModel) o;
    return Objects.equals(this.auditLogId, auditLogItemModel.auditLogId) &&
        Objects.equals(this.auditLogDateTime, auditLogItemModel.auditLogDateTime) &&
        Objects.equals(this.auditLogTypeEnum, auditLogItemModel.auditLogTypeEnum) &&
        Objects.equals(this.changeSetId, auditLogItemModel.changeSetId) &&
        Objects.equals(this.truncated, auditLogItemModel.truncated) &&
        Objects.equals(this.auditLogType, auditLogItemModel.auditLogType) &&
        Objects.equals(this.userEmail, auditLogItemModel.userEmail) &&
        Objects.equals(this.userName, auditLogItemModel.userName) &&
        Objects.equals(this.where, auditLogItemModel.where) &&
        Objects.equals(this.why, auditLogItemModel.why) &&
        Objects.equals(this.actionTarget, auditLogItemModel.actionTarget) &&
        Objects.equals(this.details, auditLogItemModel.details);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(auditLogId, auditLogDateTime, auditLogTypeEnum, changeSetId, truncated, auditLogType, userEmail, userName, where, why, actionTarget, details);
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
    sb.append("class AuditLogItemModel {\n");
    sb.append("    auditLogId: ").append(toIndentedString(auditLogId)).append("\n");
    sb.append("    auditLogDateTime: ").append(toIndentedString(auditLogDateTime)).append("\n");
    sb.append("    auditLogTypeEnum: ").append(toIndentedString(auditLogTypeEnum)).append("\n");
    sb.append("    changeSetId: ").append(toIndentedString(changeSetId)).append("\n");
    sb.append("    truncated: ").append(toIndentedString(truncated)).append("\n");
    sb.append("    auditLogType: ").append(toIndentedString(auditLogType)).append("\n");
    sb.append("    userEmail: ").append(toIndentedString(userEmail)).append("\n");
    sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
    sb.append("    where: ").append(toIndentedString(where)).append("\n");
    sb.append("    why: ").append(toIndentedString(why)).append("\n");
    sb.append("    actionTarget: ").append(toIndentedString(actionTarget)).append("\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
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
    openapiFields.add("auditLogId");
    openapiFields.add("auditLogDateTime");
    openapiFields.add("auditLogTypeEnum");
    openapiFields.add("changeSetId");
    openapiFields.add("truncated");
    openapiFields.add("auditLogType");
    openapiFields.add("userEmail");
    openapiFields.add("userName");
    openapiFields.add("where");
    openapiFields.add("why");
    openapiFields.add("actionTarget");
    openapiFields.add("details");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to AuditLogItemModel
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AuditLogItemModel.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AuditLogItemModel is not found in the empty JSON string", AuditLogItemModel.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AuditLogItemModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AuditLogItemModel` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("auditLogTypeEnum") != null && !jsonObj.get("auditLogTypeEnum").isJsonNull()) && !jsonObj.get("auditLogTypeEnum").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `auditLogTypeEnum` to be a primitive type in the JSON string but got `%s`", jsonObj.get("auditLogTypeEnum").toString()));
      }
      // validate the optional field `auditLogTypeEnum`
      if (jsonObj.get("auditLogTypeEnum") != null && !jsonObj.get("auditLogTypeEnum").isJsonNull()) {
        AuditLogTypeEnumEnum.validateJsonElement(jsonObj.get("auditLogTypeEnum"));
      }
      if ((jsonObj.get("changeSetId") != null && !jsonObj.get("changeSetId").isJsonNull()) && !jsonObj.get("changeSetId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `changeSetId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("changeSetId").toString()));
      }
      if ((jsonObj.get("auditLogType") != null && !jsonObj.get("auditLogType").isJsonNull()) && !jsonObj.get("auditLogType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `auditLogType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("auditLogType").toString()));
      }
      if ((jsonObj.get("userEmail") != null && !jsonObj.get("userEmail").isJsonNull()) && !jsonObj.get("userEmail").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `userEmail` to be a primitive type in the JSON string but got `%s`", jsonObj.get("userEmail").toString()));
      }
      if ((jsonObj.get("userName") != null && !jsonObj.get("userName").isJsonNull()) && !jsonObj.get("userName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `userName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("userName").toString()));
      }
      if ((jsonObj.get("where") != null && !jsonObj.get("where").isJsonNull()) && !jsonObj.get("where").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `where` to be a primitive type in the JSON string but got `%s`", jsonObj.get("where").toString()));
      }
      if ((jsonObj.get("why") != null && !jsonObj.get("why").isJsonNull()) && !jsonObj.get("why").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `why` to be a primitive type in the JSON string but got `%s`", jsonObj.get("why").toString()));
      }
      if ((jsonObj.get("actionTarget") != null && !jsonObj.get("actionTarget").isJsonNull()) && !jsonObj.get("actionTarget").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `actionTarget` to be a primitive type in the JSON string but got `%s`", jsonObj.get("actionTarget").toString()));
      }
      if ((jsonObj.get("details") != null && !jsonObj.get("details").isJsonNull()) && !jsonObj.get("details").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `details` to be a primitive type in the JSON string but got `%s`", jsonObj.get("details").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AuditLogItemModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AuditLogItemModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AuditLogItemModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AuditLogItemModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AuditLogItemModel>() {
           @Override
           public void write(JsonWriter out, AuditLogItemModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AuditLogItemModel read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of AuditLogItemModel given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of AuditLogItemModel
   * @throws IOException if the JSON string is invalid with respect to AuditLogItemModel
   */
  public static AuditLogItemModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AuditLogItemModel.class);
  }

  /**
   * Convert an instance of AuditLogItemModel to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

