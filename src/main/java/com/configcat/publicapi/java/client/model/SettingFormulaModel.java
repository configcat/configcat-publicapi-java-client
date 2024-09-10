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
import com.configcat.publicapi.java.client.model.ConfigModel;
import com.configcat.publicapi.java.client.model.EnvironmentModel;
import com.configcat.publicapi.java.client.model.FeatureFlagLimitations;
import com.configcat.publicapi.java.client.model.IntegrationLinkModel;
import com.configcat.publicapi.java.client.model.SettingDataModel;
import com.configcat.publicapi.java.client.model.SettingTagModel;
import com.configcat.publicapi.java.client.model.TargetingRuleModel;
import com.configcat.publicapi.java.client.model.ValueModel;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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
 * SettingFormulaModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-09-10T12:39:37.024419310Z[Etc/UTC]", comments = "Generator version: 7.7.0")
public class SettingFormulaModel {
  public static final String SERIALIZED_NAME_LAST_VERSION_ID = "lastVersionId";
  @SerializedName(SERIALIZED_NAME_LAST_VERSION_ID)
  private UUID lastVersionId;

  public static final String SERIALIZED_NAME_DEFAULT_VALUE = "defaultValue";
  @SerializedName(SERIALIZED_NAME_DEFAULT_VALUE)
  private ValueModel defaultValue;

  public static final String SERIALIZED_NAME_TARGETING_RULES = "targetingRules";
  @SerializedName(SERIALIZED_NAME_TARGETING_RULES)
  private List<TargetingRuleModel> targetingRules;

  public static final String SERIALIZED_NAME_SETTING = "setting";
  @SerializedName(SERIALIZED_NAME_SETTING)
  private SettingDataModel setting;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updatedAt";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private OffsetDateTime updatedAt;

  public static final String SERIALIZED_NAME_PERCENTAGE_EVALUATION_ATTRIBUTE = "percentageEvaluationAttribute";
  @SerializedName(SERIALIZED_NAME_PERCENTAGE_EVALUATION_ATTRIBUTE)
  private String percentageEvaluationAttribute;

  public static final String SERIALIZED_NAME_LAST_UPDATER_USER_EMAIL = "lastUpdaterUserEmail";
  @SerializedName(SERIALIZED_NAME_LAST_UPDATER_USER_EMAIL)
  private String lastUpdaterUserEmail;

  public static final String SERIALIZED_NAME_LAST_UPDATER_USER_FULL_NAME = "lastUpdaterUserFullName";
  @SerializedName(SERIALIZED_NAME_LAST_UPDATER_USER_FULL_NAME)
  private String lastUpdaterUserFullName;

  public static final String SERIALIZED_NAME_INTEGRATION_LINKS = "integrationLinks";
  @SerializedName(SERIALIZED_NAME_INTEGRATION_LINKS)
  private List<IntegrationLinkModel> integrationLinks;

  public static final String SERIALIZED_NAME_SETTING_TAGS = "settingTags";
  @SerializedName(SERIALIZED_NAME_SETTING_TAGS)
  private List<SettingTagModel> settingTags;

  public static final String SERIALIZED_NAME_SETTING_IDS_WHERE_PREREQUISITE = "settingIdsWherePrerequisite";
  @SerializedName(SERIALIZED_NAME_SETTING_IDS_WHERE_PREREQUISITE)
  private List<Integer> settingIdsWherePrerequisite;

  public static final String SERIALIZED_NAME_CONFIG = "config";
  @SerializedName(SERIALIZED_NAME_CONFIG)
  private ConfigModel config;

  public static final String SERIALIZED_NAME_ENVIRONMENT = "environment";
  @SerializedName(SERIALIZED_NAME_ENVIRONMENT)
  private EnvironmentModel environment;

  public static final String SERIALIZED_NAME_READ_ONLY = "readOnly";
  @SerializedName(SERIALIZED_NAME_READ_ONLY)
  private Boolean readOnly;

  public static final String SERIALIZED_NAME_FEATURE_FLAG_LIMITATIONS = "featureFlagLimitations";
  @SerializedName(SERIALIZED_NAME_FEATURE_FLAG_LIMITATIONS)
  private FeatureFlagLimitations featureFlagLimitations;

  public SettingFormulaModel() {
  }

  public SettingFormulaModel lastVersionId(UUID lastVersionId) {
    this.lastVersionId = lastVersionId;
    return this;
  }

  /**
   * Get lastVersionId
   * @return lastVersionId
   */
  @javax.annotation.Nullable
  public UUID getLastVersionId() {
    return lastVersionId;
  }

  public void setLastVersionId(UUID lastVersionId) {
    this.lastVersionId = lastVersionId;
  }


  public SettingFormulaModel defaultValue(ValueModel defaultValue) {
    this.defaultValue = defaultValue;
    return this;
  }

  /**
   * Get defaultValue
   * @return defaultValue
   */
  @javax.annotation.Nullable
  public ValueModel getDefaultValue() {
    return defaultValue;
  }

  public void setDefaultValue(ValueModel defaultValue) {
    this.defaultValue = defaultValue;
  }


  public SettingFormulaModel targetingRules(List<TargetingRuleModel> targetingRules) {
    this.targetingRules = targetingRules;
    return this;
  }

  public SettingFormulaModel addTargetingRulesItem(TargetingRuleModel targetingRulesItem) {
    if (this.targetingRules == null) {
      this.targetingRules = new ArrayList<>();
    }
    this.targetingRules.add(targetingRulesItem);
    return this;
  }

  /**
   * The targeting rules of the Feature Flag or Setting.
   * @return targetingRules
   */
  @javax.annotation.Nullable
  public List<TargetingRuleModel> getTargetingRules() {
    return targetingRules;
  }

  public void setTargetingRules(List<TargetingRuleModel> targetingRules) {
    this.targetingRules = targetingRules;
  }


  public SettingFormulaModel setting(SettingDataModel setting) {
    this.setting = setting;
    return this;
  }

  /**
   * Get setting
   * @return setting
   */
  @javax.annotation.Nullable
  public SettingDataModel getSetting() {
    return setting;
  }

  public void setSetting(SettingDataModel setting) {
    this.setting = setting;
  }


  public SettingFormulaModel updatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  /**
   * The last updated date and time when the Feature Flag or Setting.
   * @return updatedAt
   */
  @javax.annotation.Nullable
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }


  public SettingFormulaModel percentageEvaluationAttribute(String percentageEvaluationAttribute) {
    this.percentageEvaluationAttribute = percentageEvaluationAttribute;
    return this;
  }

  /**
   * The user attribute used for percentage evaluation. If not set, it defaults to the &#x60;Identifier&#x60; user object attribute.
   * @return percentageEvaluationAttribute
   */
  @javax.annotation.Nullable
  public String getPercentageEvaluationAttribute() {
    return percentageEvaluationAttribute;
  }

  public void setPercentageEvaluationAttribute(String percentageEvaluationAttribute) {
    this.percentageEvaluationAttribute = percentageEvaluationAttribute;
  }


  public SettingFormulaModel lastUpdaterUserEmail(String lastUpdaterUserEmail) {
    this.lastUpdaterUserEmail = lastUpdaterUserEmail;
    return this;
  }

  /**
   * The email of the user who last updated the Feature Flag or Setting.
   * @return lastUpdaterUserEmail
   */
  @javax.annotation.Nullable
  public String getLastUpdaterUserEmail() {
    return lastUpdaterUserEmail;
  }

  public void setLastUpdaterUserEmail(String lastUpdaterUserEmail) {
    this.lastUpdaterUserEmail = lastUpdaterUserEmail;
  }


  public SettingFormulaModel lastUpdaterUserFullName(String lastUpdaterUserFullName) {
    this.lastUpdaterUserFullName = lastUpdaterUserFullName;
    return this;
  }

  /**
   * The name of the user who last updated the Feature Flag or Setting.
   * @return lastUpdaterUserFullName
   */
  @javax.annotation.Nullable
  public String getLastUpdaterUserFullName() {
    return lastUpdaterUserFullName;
  }

  public void setLastUpdaterUserFullName(String lastUpdaterUserFullName) {
    this.lastUpdaterUserFullName = lastUpdaterUserFullName;
  }


  public SettingFormulaModel integrationLinks(List<IntegrationLinkModel> integrationLinks) {
    this.integrationLinks = integrationLinks;
    return this;
  }

  public SettingFormulaModel addIntegrationLinksItem(IntegrationLinkModel integrationLinksItem) {
    if (this.integrationLinks == null) {
      this.integrationLinks = new ArrayList<>();
    }
    this.integrationLinks.add(integrationLinksItem);
    return this;
  }

  /**
   * The integration links attached to the Feature Flag or Setting.
   * @return integrationLinks
   */
  @javax.annotation.Nullable
  public List<IntegrationLinkModel> getIntegrationLinks() {
    return integrationLinks;
  }

  public void setIntegrationLinks(List<IntegrationLinkModel> integrationLinks) {
    this.integrationLinks = integrationLinks;
  }


  public SettingFormulaModel settingTags(List<SettingTagModel> settingTags) {
    this.settingTags = settingTags;
    return this;
  }

  public SettingFormulaModel addSettingTagsItem(SettingTagModel settingTagsItem) {
    if (this.settingTags == null) {
      this.settingTags = new ArrayList<>();
    }
    this.settingTags.add(settingTagsItem);
    return this;
  }

  /**
   * The tags attached to the Feature Flag or Setting.
   * @return settingTags
   */
  @javax.annotation.Nullable
  public List<SettingTagModel> getSettingTags() {
    return settingTags;
  }

  public void setSettingTags(List<SettingTagModel> settingTags) {
    this.settingTags = settingTags;
  }


  public SettingFormulaModel settingIdsWherePrerequisite(List<Integer> settingIdsWherePrerequisite) {
    this.settingIdsWherePrerequisite = settingIdsWherePrerequisite;
    return this;
  }

  public SettingFormulaModel addSettingIdsWherePrerequisiteItem(Integer settingIdsWherePrerequisiteItem) {
    if (this.settingIdsWherePrerequisite == null) {
      this.settingIdsWherePrerequisite = new ArrayList<>();
    }
    this.settingIdsWherePrerequisite.add(settingIdsWherePrerequisiteItem);
    return this;
  }

  /**
   * List of Feature Flag and Setting IDs where the actual Feature Flag or Setting is prerequisite.
   * @return settingIdsWherePrerequisite
   */
  @javax.annotation.Nullable
  public List<Integer> getSettingIdsWherePrerequisite() {
    return settingIdsWherePrerequisite;
  }

  public void setSettingIdsWherePrerequisite(List<Integer> settingIdsWherePrerequisite) {
    this.settingIdsWherePrerequisite = settingIdsWherePrerequisite;
  }


  public SettingFormulaModel config(ConfigModel config) {
    this.config = config;
    return this;
  }

  /**
   * Get config
   * @return config
   */
  @javax.annotation.Nullable
  public ConfigModel getConfig() {
    return config;
  }

  public void setConfig(ConfigModel config) {
    this.config = config;
  }


  public SettingFormulaModel environment(EnvironmentModel environment) {
    this.environment = environment;
    return this;
  }

  /**
   * Get environment
   * @return environment
   */
  @javax.annotation.Nullable
  public EnvironmentModel getEnvironment() {
    return environment;
  }

  public void setEnvironment(EnvironmentModel environment) {
    this.environment = environment;
  }


  public SettingFormulaModel readOnly(Boolean readOnly) {
    this.readOnly = readOnly;
    return this;
  }

  /**
   * Get readOnly
   * @return readOnly
   */
  @javax.annotation.Nullable
  public Boolean getReadOnly() {
    return readOnly;
  }

  public void setReadOnly(Boolean readOnly) {
    this.readOnly = readOnly;
  }


  public SettingFormulaModel featureFlagLimitations(FeatureFlagLimitations featureFlagLimitations) {
    this.featureFlagLimitations = featureFlagLimitations;
    return this;
  }

  /**
   * Get featureFlagLimitations
   * @return featureFlagLimitations
   */
  @javax.annotation.Nullable
  public FeatureFlagLimitations getFeatureFlagLimitations() {
    return featureFlagLimitations;
  }

  public void setFeatureFlagLimitations(FeatureFlagLimitations featureFlagLimitations) {
    this.featureFlagLimitations = featureFlagLimitations;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SettingFormulaModel settingFormulaModel = (SettingFormulaModel) o;
    return Objects.equals(this.lastVersionId, settingFormulaModel.lastVersionId) &&
        Objects.equals(this.defaultValue, settingFormulaModel.defaultValue) &&
        Objects.equals(this.targetingRules, settingFormulaModel.targetingRules) &&
        Objects.equals(this.setting, settingFormulaModel.setting) &&
        Objects.equals(this.updatedAt, settingFormulaModel.updatedAt) &&
        Objects.equals(this.percentageEvaluationAttribute, settingFormulaModel.percentageEvaluationAttribute) &&
        Objects.equals(this.lastUpdaterUserEmail, settingFormulaModel.lastUpdaterUserEmail) &&
        Objects.equals(this.lastUpdaterUserFullName, settingFormulaModel.lastUpdaterUserFullName) &&
        Objects.equals(this.integrationLinks, settingFormulaModel.integrationLinks) &&
        Objects.equals(this.settingTags, settingFormulaModel.settingTags) &&
        Objects.equals(this.settingIdsWherePrerequisite, settingFormulaModel.settingIdsWherePrerequisite) &&
        Objects.equals(this.config, settingFormulaModel.config) &&
        Objects.equals(this.environment, settingFormulaModel.environment) &&
        Objects.equals(this.readOnly, settingFormulaModel.readOnly) &&
        Objects.equals(this.featureFlagLimitations, settingFormulaModel.featureFlagLimitations);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(lastVersionId, defaultValue, targetingRules, setting, updatedAt, percentageEvaluationAttribute, lastUpdaterUserEmail, lastUpdaterUserFullName, integrationLinks, settingTags, settingIdsWherePrerequisite, config, environment, readOnly, featureFlagLimitations);
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
    sb.append("class SettingFormulaModel {\n");
    sb.append("    lastVersionId: ").append(toIndentedString(lastVersionId)).append("\n");
    sb.append("    defaultValue: ").append(toIndentedString(defaultValue)).append("\n");
    sb.append("    targetingRules: ").append(toIndentedString(targetingRules)).append("\n");
    sb.append("    setting: ").append(toIndentedString(setting)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    percentageEvaluationAttribute: ").append(toIndentedString(percentageEvaluationAttribute)).append("\n");
    sb.append("    lastUpdaterUserEmail: ").append(toIndentedString(lastUpdaterUserEmail)).append("\n");
    sb.append("    lastUpdaterUserFullName: ").append(toIndentedString(lastUpdaterUserFullName)).append("\n");
    sb.append("    integrationLinks: ").append(toIndentedString(integrationLinks)).append("\n");
    sb.append("    settingTags: ").append(toIndentedString(settingTags)).append("\n");
    sb.append("    settingIdsWherePrerequisite: ").append(toIndentedString(settingIdsWherePrerequisite)).append("\n");
    sb.append("    config: ").append(toIndentedString(config)).append("\n");
    sb.append("    environment: ").append(toIndentedString(environment)).append("\n");
    sb.append("    readOnly: ").append(toIndentedString(readOnly)).append("\n");
    sb.append("    featureFlagLimitations: ").append(toIndentedString(featureFlagLimitations)).append("\n");
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
    openapiFields.add("lastVersionId");
    openapiFields.add("defaultValue");
    openapiFields.add("targetingRules");
    openapiFields.add("setting");
    openapiFields.add("updatedAt");
    openapiFields.add("percentageEvaluationAttribute");
    openapiFields.add("lastUpdaterUserEmail");
    openapiFields.add("lastUpdaterUserFullName");
    openapiFields.add("integrationLinks");
    openapiFields.add("settingTags");
    openapiFields.add("settingIdsWherePrerequisite");
    openapiFields.add("config");
    openapiFields.add("environment");
    openapiFields.add("readOnly");
    openapiFields.add("featureFlagLimitations");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to SettingFormulaModel
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!SettingFormulaModel.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SettingFormulaModel is not found in the empty JSON string", SettingFormulaModel.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!SettingFormulaModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SettingFormulaModel` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("lastVersionId") != null && !jsonObj.get("lastVersionId").isJsonNull()) && !jsonObj.get("lastVersionId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `lastVersionId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("lastVersionId").toString()));
      }
      // validate the optional field `defaultValue`
      if (jsonObj.get("defaultValue") != null && !jsonObj.get("defaultValue").isJsonNull()) {
        ValueModel.validateJsonElement(jsonObj.get("defaultValue"));
      }
      if (jsonObj.get("targetingRules") != null && !jsonObj.get("targetingRules").isJsonNull()) {
        JsonArray jsonArraytargetingRules = jsonObj.getAsJsonArray("targetingRules");
        if (jsonArraytargetingRules != null) {
          // ensure the json data is an array
          if (!jsonObj.get("targetingRules").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `targetingRules` to be an array in the JSON string but got `%s`", jsonObj.get("targetingRules").toString()));
          }

          // validate the optional field `targetingRules` (array)
          for (int i = 0; i < jsonArraytargetingRules.size(); i++) {
            TargetingRuleModel.validateJsonElement(jsonArraytargetingRules.get(i));
          };
        }
      }
      // validate the optional field `setting`
      if (jsonObj.get("setting") != null && !jsonObj.get("setting").isJsonNull()) {
        SettingDataModel.validateJsonElement(jsonObj.get("setting"));
      }
      if ((jsonObj.get("percentageEvaluationAttribute") != null && !jsonObj.get("percentageEvaluationAttribute").isJsonNull()) && !jsonObj.get("percentageEvaluationAttribute").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `percentageEvaluationAttribute` to be a primitive type in the JSON string but got `%s`", jsonObj.get("percentageEvaluationAttribute").toString()));
      }
      if ((jsonObj.get("lastUpdaterUserEmail") != null && !jsonObj.get("lastUpdaterUserEmail").isJsonNull()) && !jsonObj.get("lastUpdaterUserEmail").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `lastUpdaterUserEmail` to be a primitive type in the JSON string but got `%s`", jsonObj.get("lastUpdaterUserEmail").toString()));
      }
      if ((jsonObj.get("lastUpdaterUserFullName") != null && !jsonObj.get("lastUpdaterUserFullName").isJsonNull()) && !jsonObj.get("lastUpdaterUserFullName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `lastUpdaterUserFullName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("lastUpdaterUserFullName").toString()));
      }
      if (jsonObj.get("integrationLinks") != null && !jsonObj.get("integrationLinks").isJsonNull()) {
        JsonArray jsonArrayintegrationLinks = jsonObj.getAsJsonArray("integrationLinks");
        if (jsonArrayintegrationLinks != null) {
          // ensure the json data is an array
          if (!jsonObj.get("integrationLinks").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `integrationLinks` to be an array in the JSON string but got `%s`", jsonObj.get("integrationLinks").toString()));
          }

          // validate the optional field `integrationLinks` (array)
          for (int i = 0; i < jsonArrayintegrationLinks.size(); i++) {
            IntegrationLinkModel.validateJsonElement(jsonArrayintegrationLinks.get(i));
          };
        }
      }
      if (jsonObj.get("settingTags") != null && !jsonObj.get("settingTags").isJsonNull()) {
        JsonArray jsonArraysettingTags = jsonObj.getAsJsonArray("settingTags");
        if (jsonArraysettingTags != null) {
          // ensure the json data is an array
          if (!jsonObj.get("settingTags").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `settingTags` to be an array in the JSON string but got `%s`", jsonObj.get("settingTags").toString()));
          }

          // validate the optional field `settingTags` (array)
          for (int i = 0; i < jsonArraysettingTags.size(); i++) {
            SettingTagModel.validateJsonElement(jsonArraysettingTags.get(i));
          };
        }
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("settingIdsWherePrerequisite") != null && !jsonObj.get("settingIdsWherePrerequisite").isJsonNull() && !jsonObj.get("settingIdsWherePrerequisite").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `settingIdsWherePrerequisite` to be an array in the JSON string but got `%s`", jsonObj.get("settingIdsWherePrerequisite").toString()));
      }
      // validate the optional field `config`
      if (jsonObj.get("config") != null && !jsonObj.get("config").isJsonNull()) {
        ConfigModel.validateJsonElement(jsonObj.get("config"));
      }
      // validate the optional field `environment`
      if (jsonObj.get("environment") != null && !jsonObj.get("environment").isJsonNull()) {
        EnvironmentModel.validateJsonElement(jsonObj.get("environment"));
      }
      // validate the optional field `featureFlagLimitations`
      if (jsonObj.get("featureFlagLimitations") != null && !jsonObj.get("featureFlagLimitations").isJsonNull()) {
        FeatureFlagLimitations.validateJsonElement(jsonObj.get("featureFlagLimitations"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SettingFormulaModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SettingFormulaModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SettingFormulaModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SettingFormulaModel.class));

       return (TypeAdapter<T>) new TypeAdapter<SettingFormulaModel>() {
           @Override
           public void write(JsonWriter out, SettingFormulaModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SettingFormulaModel read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of SettingFormulaModel given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of SettingFormulaModel
   * @throws IOException if the JSON string is invalid with respect to SettingFormulaModel
   */
  public static SettingFormulaModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SettingFormulaModel.class);
  }

  /**
   * Convert an instance of SettingFormulaModel to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

