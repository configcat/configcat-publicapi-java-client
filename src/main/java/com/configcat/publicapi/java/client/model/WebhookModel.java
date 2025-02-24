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
import com.configcat.publicapi.java.client.model.WebHookHttpMethod;
import com.configcat.publicapi.java.client.model.WebhookConfig;
import com.configcat.publicapi.java.client.model.WebhookEnvironment;
import com.configcat.publicapi.java.client.model.WebhookHeaderModel;
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
 * WebhookModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-20T16:55:24.304297906Z[Etc/UTC]", comments = "Generator version: 7.7.0")
public class WebhookModel {
  public static final String SERIALIZED_NAME_WEBHOOK_ID = "webhookId";
  @SerializedName(SERIALIZED_NAME_WEBHOOK_ID)
  private Integer webhookId;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;

  public static final String SERIALIZED_NAME_HTTP_METHOD = "httpMethod";
  @SerializedName(SERIALIZED_NAME_HTTP_METHOD)
  private WebHookHttpMethod httpMethod;

  public static final String SERIALIZED_NAME_CONTENT = "content";
  @SerializedName(SERIALIZED_NAME_CONTENT)
  private String content;

  public static final String SERIALIZED_NAME_WEB_HOOK_HEADERS = "webHookHeaders";
  @SerializedName(SERIALIZED_NAME_WEB_HOOK_HEADERS)
  private List<WebhookHeaderModel> webHookHeaders;

  public static final String SERIALIZED_NAME_CONFIG = "config";
  @SerializedName(SERIALIZED_NAME_CONFIG)
  private WebhookConfig config;

  public static final String SERIALIZED_NAME_ENVIRONMENT = "environment";
  @SerializedName(SERIALIZED_NAME_ENVIRONMENT)
  private WebhookEnvironment environment;

  public WebhookModel() {
  }

  public WebhookModel webhookId(Integer webhookId) {
    this.webhookId = webhookId;
    return this;
  }

  /**
   * The identifier of the Webhook.
   * @return webhookId
   */
  @javax.annotation.Nullable
  public Integer getWebhookId() {
    return webhookId;
  }

  public void setWebhookId(Integer webhookId) {
    this.webhookId = webhookId;
  }


  public WebhookModel url(String url) {
    this.url = url;
    return this;
  }

  /**
   * The URL of the Webhook.
   * @return url
   */
  @javax.annotation.Nullable
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }


  public WebhookModel httpMethod(WebHookHttpMethod httpMethod) {
    this.httpMethod = httpMethod;
    return this;
  }

  /**
   * Get httpMethod
   * @return httpMethod
   */
  @javax.annotation.Nullable
  public WebHookHttpMethod getHttpMethod() {
    return httpMethod;
  }

  public void setHttpMethod(WebHookHttpMethod httpMethod) {
    this.httpMethod = httpMethod;
  }


  public WebhookModel content(String content) {
    this.content = content;
    return this;
  }

  /**
   * The HTTP body content.
   * @return content
   */
  @javax.annotation.Nullable
  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }


  public WebhookModel webHookHeaders(List<WebhookHeaderModel> webHookHeaders) {
    this.webHookHeaders = webHookHeaders;
    return this;
  }

  public WebhookModel addWebHookHeadersItem(WebhookHeaderModel webHookHeadersItem) {
    if (this.webHookHeaders == null) {
      this.webHookHeaders = new ArrayList<>();
    }
    this.webHookHeaders.add(webHookHeadersItem);
    return this;
  }

  /**
   * List of HTTP headers that the Webhook must send.
   * @return webHookHeaders
   */
  @javax.annotation.Nullable
  public List<WebhookHeaderModel> getWebHookHeaders() {
    return webHookHeaders;
  }

  public void setWebHookHeaders(List<WebhookHeaderModel> webHookHeaders) {
    this.webHookHeaders = webHookHeaders;
  }


  public WebhookModel config(WebhookConfig config) {
    this.config = config;
    return this;
  }

  /**
   * Get config
   * @return config
   */
  @javax.annotation.Nullable
  public WebhookConfig getConfig() {
    return config;
  }

  public void setConfig(WebhookConfig config) {
    this.config = config;
  }


  public WebhookModel environment(WebhookEnvironment environment) {
    this.environment = environment;
    return this;
  }

  /**
   * Get environment
   * @return environment
   */
  @javax.annotation.Nullable
  public WebhookEnvironment getEnvironment() {
    return environment;
  }

  public void setEnvironment(WebhookEnvironment environment) {
    this.environment = environment;
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
   * @return the WebhookModel instance itself
   */
  public WebhookModel putAdditionalProperty(String key, Object value) {
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
    WebhookModel webhookModel = (WebhookModel) o;
    return Objects.equals(this.webhookId, webhookModel.webhookId) &&
        Objects.equals(this.url, webhookModel.url) &&
        Objects.equals(this.httpMethod, webhookModel.httpMethod) &&
        Objects.equals(this.content, webhookModel.content) &&
        Objects.equals(this.webHookHeaders, webhookModel.webHookHeaders) &&
        Objects.equals(this.config, webhookModel.config) &&
        Objects.equals(this.environment, webhookModel.environment)&&
        Objects.equals(this.additionalProperties, webhookModel.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(webhookId, url, httpMethod, content, webHookHeaders, config, environment, additionalProperties);
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
    sb.append("class WebhookModel {\n");
    sb.append("    webhookId: ").append(toIndentedString(webhookId)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    httpMethod: ").append(toIndentedString(httpMethod)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    webHookHeaders: ").append(toIndentedString(webHookHeaders)).append("\n");
    sb.append("    config: ").append(toIndentedString(config)).append("\n");
    sb.append("    environment: ").append(toIndentedString(environment)).append("\n");
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
    openapiFields.add("webhookId");
    openapiFields.add("url");
    openapiFields.add("httpMethod");
    openapiFields.add("content");
    openapiFields.add("webHookHeaders");
    openapiFields.add("config");
    openapiFields.add("environment");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to WebhookModel
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!WebhookModel.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in WebhookModel is not found in the empty JSON string", WebhookModel.openapiRequiredFields.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("url") != null && !jsonObj.get("url").isJsonNull()) && !jsonObj.get("url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("url").toString()));
      }
      // validate the optional field `httpMethod`
      if (jsonObj.get("httpMethod") != null && !jsonObj.get("httpMethod").isJsonNull()) {
        WebHookHttpMethod.validateJsonElement(jsonObj.get("httpMethod"));
      }
      if ((jsonObj.get("content") != null && !jsonObj.get("content").isJsonNull()) && !jsonObj.get("content").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `content` to be a primitive type in the JSON string but got `%s`", jsonObj.get("content").toString()));
      }
      if (jsonObj.get("webHookHeaders") != null && !jsonObj.get("webHookHeaders").isJsonNull()) {
        JsonArray jsonArraywebHookHeaders = jsonObj.getAsJsonArray("webHookHeaders");
        if (jsonArraywebHookHeaders != null) {
          // ensure the json data is an array
          if (!jsonObj.get("webHookHeaders").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `webHookHeaders` to be an array in the JSON string but got `%s`", jsonObj.get("webHookHeaders").toString()));
          }

          // validate the optional field `webHookHeaders` (array)
          for (int i = 0; i < jsonArraywebHookHeaders.size(); i++) {
            WebhookHeaderModel.validateJsonElement(jsonArraywebHookHeaders.get(i));
          };
        }
      }
      // validate the optional field `config`
      if (jsonObj.get("config") != null && !jsonObj.get("config").isJsonNull()) {
        WebhookConfig.validateJsonElement(jsonObj.get("config"));
      }
      // validate the optional field `environment`
      if (jsonObj.get("environment") != null && !jsonObj.get("environment").isJsonNull()) {
        WebhookEnvironment.validateJsonElement(jsonObj.get("environment"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!WebhookModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'WebhookModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<WebhookModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(WebhookModel.class));

       return (TypeAdapter<T>) new TypeAdapter<WebhookModel>() {
           @Override
           public void write(JsonWriter out, WebhookModel value) throws IOException {
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
           public WebhookModel read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             WebhookModel instance = thisAdapter.fromJsonTree(jsonObj);
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
   * Create an instance of WebhookModel given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of WebhookModel
   * @throws IOException if the JSON string is invalid with respect to WebhookModel
   */
  public static WebhookModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, WebhookModel.class);
  }

  /**
   * Convert an instance of WebhookModel to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

