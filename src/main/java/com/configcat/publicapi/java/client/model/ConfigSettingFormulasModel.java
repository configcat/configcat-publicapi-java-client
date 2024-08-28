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
import com.configcat.publicapi.java.client.model.ConfigModel;
import com.configcat.publicapi.java.client.model.ConfigSettingFormulaModel;
import com.configcat.publicapi.java.client.model.EnvironmentModel;
import com.configcat.publicapi.java.client.model.FeatureFlagLimitations;
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
 * ConfigSettingFormulasModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-08-27T15:17:02.569404381Z[Etc/UTC]", comments = "Generator version: 7.7.0")
public class ConfigSettingFormulasModel {
  public static final String SERIALIZED_NAME_CONFIG = "config";
  @SerializedName(SERIALIZED_NAME_CONFIG)
  private ConfigModel config;

  public static final String SERIALIZED_NAME_ENVIRONMENT = "environment";
  @SerializedName(SERIALIZED_NAME_ENVIRONMENT)
  private EnvironmentModel environment;

  public static final String SERIALIZED_NAME_READ_ONLY = "readOnly";
  @SerializedName(SERIALIZED_NAME_READ_ONLY)
  private Boolean readOnly;

  public static final String SERIALIZED_NAME_SETTING_FORMULAS = "settingFormulas";
  @SerializedName(SERIALIZED_NAME_SETTING_FORMULAS)
  private List<ConfigSettingFormulaModel> settingFormulas;

  public static final String SERIALIZED_NAME_FEATURE_FLAG_LIMITATIONS = "featureFlagLimitations";
  @SerializedName(SERIALIZED_NAME_FEATURE_FLAG_LIMITATIONS)
  private FeatureFlagLimitations featureFlagLimitations;

  public ConfigSettingFormulasModel() {
  }

  public ConfigSettingFormulasModel config(ConfigModel config) {
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


  public ConfigSettingFormulasModel environment(EnvironmentModel environment) {
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


  public ConfigSettingFormulasModel readOnly(Boolean readOnly) {
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


  public ConfigSettingFormulasModel settingFormulas(List<ConfigSettingFormulaModel> settingFormulas) {
    this.settingFormulas = settingFormulas;
    return this;
  }

  public ConfigSettingFormulasModel addSettingFormulasItem(ConfigSettingFormulaModel settingFormulasItem) {
    if (this.settingFormulas == null) {
      this.settingFormulas = new ArrayList<>();
    }
    this.settingFormulas.add(settingFormulasItem);
    return this;
  }

  /**
   * Evaluation descriptors of each updated Feature Flag and Setting.
   * @return settingFormulas
   */
  @javax.annotation.Nullable
  public List<ConfigSettingFormulaModel> getSettingFormulas() {
    return settingFormulas;
  }

  public void setSettingFormulas(List<ConfigSettingFormulaModel> settingFormulas) {
    this.settingFormulas = settingFormulas;
  }


  public ConfigSettingFormulasModel featureFlagLimitations(FeatureFlagLimitations featureFlagLimitations) {
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
    ConfigSettingFormulasModel configSettingFormulasModel = (ConfigSettingFormulasModel) o;
    return Objects.equals(this.config, configSettingFormulasModel.config) &&
        Objects.equals(this.environment, configSettingFormulasModel.environment) &&
        Objects.equals(this.readOnly, configSettingFormulasModel.readOnly) &&
        Objects.equals(this.settingFormulas, configSettingFormulasModel.settingFormulas) &&
        Objects.equals(this.featureFlagLimitations, configSettingFormulasModel.featureFlagLimitations);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(config, environment, readOnly, settingFormulas, featureFlagLimitations);
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
    sb.append("class ConfigSettingFormulasModel {\n");
    sb.append("    config: ").append(toIndentedString(config)).append("\n");
    sb.append("    environment: ").append(toIndentedString(environment)).append("\n");
    sb.append("    readOnly: ").append(toIndentedString(readOnly)).append("\n");
    sb.append("    settingFormulas: ").append(toIndentedString(settingFormulas)).append("\n");
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
    openapiFields.add("config");
    openapiFields.add("environment");
    openapiFields.add("readOnly");
    openapiFields.add("settingFormulas");
    openapiFields.add("featureFlagLimitations");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ConfigSettingFormulasModel
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ConfigSettingFormulasModel.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ConfigSettingFormulasModel is not found in the empty JSON string", ConfigSettingFormulasModel.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ConfigSettingFormulasModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ConfigSettingFormulasModel` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `config`
      if (jsonObj.get("config") != null && !jsonObj.get("config").isJsonNull()) {
        ConfigModel.validateJsonElement(jsonObj.get("config"));
      }
      // validate the optional field `environment`
      if (jsonObj.get("environment") != null && !jsonObj.get("environment").isJsonNull()) {
        EnvironmentModel.validateJsonElement(jsonObj.get("environment"));
      }
      if (jsonObj.get("settingFormulas") != null && !jsonObj.get("settingFormulas").isJsonNull()) {
        JsonArray jsonArraysettingFormulas = jsonObj.getAsJsonArray("settingFormulas");
        if (jsonArraysettingFormulas != null) {
          // ensure the json data is an array
          if (!jsonObj.get("settingFormulas").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `settingFormulas` to be an array in the JSON string but got `%s`", jsonObj.get("settingFormulas").toString()));
          }

          // validate the optional field `settingFormulas` (array)
          for (int i = 0; i < jsonArraysettingFormulas.size(); i++) {
            ConfigSettingFormulaModel.validateJsonElement(jsonArraysettingFormulas.get(i));
          };
        }
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
       if (!ConfigSettingFormulasModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ConfigSettingFormulasModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ConfigSettingFormulasModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ConfigSettingFormulasModel.class));

       return (TypeAdapter<T>) new TypeAdapter<ConfigSettingFormulasModel>() {
           @Override
           public void write(JsonWriter out, ConfigSettingFormulasModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ConfigSettingFormulasModel read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ConfigSettingFormulasModel given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ConfigSettingFormulasModel
   * @throws IOException if the JSON string is invalid with respect to ConfigSettingFormulasModel
   */
  public static ConfigSettingFormulasModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ConfigSettingFormulasModel.class);
  }

  /**
   * Convert an instance of ConfigSettingFormulasModel to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

