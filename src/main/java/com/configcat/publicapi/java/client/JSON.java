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


package com.configcat.publicapi.java.client;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.bind.util.ISO8601Utils;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.google.gson.JsonElement;
import io.gsonfire.GsonFireBuilder;
import io.gsonfire.TypeSelector;

import okio.ByteString;

import java.io.IOException;
import java.io.StringReader;
import java.lang.reflect.Type;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import java.util.HashMap;

/*
 * A JSON utility class
 *
 * NOTE: in the future, this class may be converted to static, which may break
 *       backward-compatibility
 */
public class JSON {
    private static Gson gson;
    private static boolean isLenientOnJson = false;
    private static DateTypeAdapter dateTypeAdapter = new DateTypeAdapter();
    private static SqlDateTypeAdapter sqlDateTypeAdapter = new SqlDateTypeAdapter();
    private static OffsetDateTimeTypeAdapter offsetDateTimeTypeAdapter = new OffsetDateTimeTypeAdapter();
    private static LocalDateTypeAdapter localDateTypeAdapter = new LocalDateTypeAdapter();
    private static ByteArrayAdapter byteArrayAdapter = new ByteArrayAdapter();

    @SuppressWarnings("unchecked")
    public static GsonBuilder createGson() {
        GsonFireBuilder fireBuilder = new GsonFireBuilder()
        ;
        GsonBuilder builder = fireBuilder.createGsonBuilder();
        return builder;
    }

    private static String getDiscriminatorValue(JsonElement readElement, String discriminatorField) {
        JsonElement element = readElement.getAsJsonObject().get(discriminatorField);
        if (null == element) {
            throw new IllegalArgumentException("missing discriminator field: <" + discriminatorField + ">");
        }
        return element.getAsString();
    }

    /**
     * Returns the Java class that implements the OpenAPI schema for the specified discriminator value.
     *
     * @param classByDiscriminatorValue The map of discriminator values to Java classes.
     * @param discriminatorValue The value of the OpenAPI discriminator in the input data.
     * @return The Java class that implements the OpenAPI schema
     */
    private static Class getClassByDiscriminator(Map classByDiscriminatorValue, String discriminatorValue) {
        Class clazz = (Class) classByDiscriminatorValue.get(discriminatorValue);
        if (null == clazz) {
            throw new IllegalArgumentException("cannot determine model class of name: <" + discriminatorValue + ">");
        }
        return clazz;
    }

    static {
        GsonBuilder gsonBuilder = createGson();
        gsonBuilder.registerTypeAdapter(Date.class, dateTypeAdapter);
        gsonBuilder.registerTypeAdapter(java.sql.Date.class, sqlDateTypeAdapter);
        gsonBuilder.registerTypeAdapter(OffsetDateTime.class, offsetDateTimeTypeAdapter);
        gsonBuilder.registerTypeAdapter(LocalDate.class, localDateTypeAdapter);
        gsonBuilder.registerTypeAdapter(byte[].class, byteArrayAdapter);
        gsonBuilder.registerTypeAdapterFactory(new com.configcat.publicapi.java.client.model.AddOrUpdateIntegrationLinkModel.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.configcat.publicapi.java.client.model.AddOrUpdateJiraIntegrationLinkModel.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.configcat.publicapi.java.client.model.AuditLogItemModel.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.configcat.publicapi.java.client.model.CodeReferenceModel.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.configcat.publicapi.java.client.model.CodeReferenceRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.configcat.publicapi.java.client.model.ComparisonValueListModel.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.configcat.publicapi.java.client.model.ComparisonValueModel.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.configcat.publicapi.java.client.model.ConditionModel.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.configcat.publicapi.java.client.model.ConfigModel.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.configcat.publicapi.java.client.model.ConfigSettingFormulaModel.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.configcat.publicapi.java.client.model.ConfigSettingFormulasModel.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.configcat.publicapi.java.client.model.ConfigSettingValueModel.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.configcat.publicapi.java.client.model.ConfigSettingValuesModel.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.configcat.publicapi.java.client.model.ConnectRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.configcat.publicapi.java.client.model.CreateConfigRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.configcat.publicapi.java.client.model.CreateEnvironmentModel.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.configcat.publicapi.java.client.model.CreateIntegrationModel.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.configcat.publicapi.java.client.model.CreateOrUpdateEnvironmentAccessModel.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.configcat.publicapi.java.client.model.CreatePermissionGroupRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.configcat.publicapi.java.client.model.CreateProductRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.configcat.publicapi.java.client.model.CreateSegmentModel.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.configcat.publicapi.java.client.model.CreateSettingInitialValues.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.configcat.publicapi.java.client.model.CreateTagModel.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.configcat.publicapi.java.client.model.DeleteIntegrationLinkModel.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.configcat.publicapi.java.client.model.DeleteRepositoryReportsRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.configcat.publicapi.java.client.model.DeletedSettingModel.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.configcat.publicapi.java.client.model.EnvironmentAccessModel.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.configcat.publicapi.java.client.model.EnvironmentModel.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.configcat.publicapi.java.client.model.FeatureFlagLimitations.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.configcat.publicapi.java.client.model.FlagReference.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.configcat.publicapi.java.client.model.InitialValue.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.configcat.publicapi.java.client.model.IntegrationLinkDetail.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.configcat.publicapi.java.client.model.IntegrationLinkDetailsModel.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.configcat.publicapi.java.client.model.IntegrationLinkModel.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.configcat.publicapi.java.client.model.IntegrationModel.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.configcat.publicapi.java.client.model.IntegrationsModel.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.configcat.publicapi.java.client.model.InvitationModel.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.configcat.publicapi.java.client.model.InviteMembersRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.configcat.publicapi.java.client.model.JsonPatchOperation.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.configcat.publicapi.java.client.model.MeModel.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.configcat.publicapi.java.client.model.MemberModel.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.configcat.publicapi.java.client.model.ModifyIntegrationRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.configcat.publicapi.java.client.model.OrganizationAdminModel.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.configcat.publicapi.java.client.model.OrganizationInvitationModel.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.configcat.publicapi.java.client.model.OrganizationMemberModel.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.configcat.publicapi.java.client.model.OrganizationMembersModel.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.configcat.publicapi.java.client.model.OrganizationModel.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.configcat.publicapi.java.client.model.OrganizationPermissionGroupModel.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.configcat.publicapi.java.client.model.OrganizationPermissionModel.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.configcat.publicapi.java.client.model.OrganizationProductModel.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.configcat.publicapi.java.client.model.PercentageOptionModel.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.configcat.publicapi.java.client.model.PermissionGroupModel.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.configcat.publicapi.java.client.model.PreferencesModel.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.configcat.publicapi.java.client.model.PrerequisiteFlagConditionModel.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.configcat.publicapi.java.client.model.ProductModel.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.configcat.publicapi.java.client.model.ReasonRequiredEnvironmentModel.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.configcat.publicapi.java.client.model.ReferenceLineModel.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.configcat.publicapi.java.client.model.ReferenceLineRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.configcat.publicapi.java.client.model.ReferenceLinesModel.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.configcat.publicapi.java.client.model.ReferenceLinesRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.configcat.publicapi.java.client.model.ReplaceSettingModel.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.configcat.publicapi.java.client.model.RolloutPercentageItemModel.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.configcat.publicapi.java.client.model.RolloutRuleModel.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.configcat.publicapi.java.client.model.SdkKeysModel.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.configcat.publicapi.java.client.model.SegmentConditionModel.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.configcat.publicapi.java.client.model.SegmentListModel.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.configcat.publicapi.java.client.model.SegmentModel.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.configcat.publicapi.java.client.model.SettingDataModel.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.configcat.publicapi.java.client.model.SettingFormulaModel.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.configcat.publicapi.java.client.model.SettingModel.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.configcat.publicapi.java.client.model.SettingTagModel.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.configcat.publicapi.java.client.model.SettingValueModel.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.configcat.publicapi.java.client.model.SettingValueType.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.configcat.publicapi.java.client.model.StaleFlagConfigModel.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.configcat.publicapi.java.client.model.StaleFlagEnvironmentModel.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.configcat.publicapi.java.client.model.StaleFlagProductModel.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.configcat.publicapi.java.client.model.StaleFlagSettingModel.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.configcat.publicapi.java.client.model.StaleFlagSettingTagModel.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.configcat.publicapi.java.client.model.StaleFlagSettingValueModel.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.configcat.publicapi.java.client.model.TagModel.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.configcat.publicapi.java.client.model.TargetingRuleModel.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.configcat.publicapi.java.client.model.UpdateComparisonValueListModel.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.configcat.publicapi.java.client.model.UpdateComparisonValueModel.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.configcat.publicapi.java.client.model.UpdateConditionModel.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.configcat.publicapi.java.client.model.UpdateConfigRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.configcat.publicapi.java.client.model.UpdateEnvironmentModel.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.configcat.publicapi.java.client.model.UpdateEvaluationFormulaModel.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.configcat.publicapi.java.client.model.UpdateEvaluationFormulaWithIdModel.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.configcat.publicapi.java.client.model.UpdateEvaluationFormulasModel.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.configcat.publicapi.java.client.model.UpdateMemberPermissionsRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.configcat.publicapi.java.client.model.UpdatePercentageOptionModel.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.configcat.publicapi.java.client.model.UpdatePermissionGroupRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.configcat.publicapi.java.client.model.UpdatePreferencesRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.configcat.publicapi.java.client.model.UpdatePrerequisiteFlagConditionModel.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.configcat.publicapi.java.client.model.UpdateProductRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.configcat.publicapi.java.client.model.UpdateReasonRequiredEnvironmentModel.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.configcat.publicapi.java.client.model.UpdateRolloutPercentageItemModel.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.configcat.publicapi.java.client.model.UpdateRolloutRuleModel.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.configcat.publicapi.java.client.model.UpdateSegmentConditionModel.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.configcat.publicapi.java.client.model.UpdateSegmentModel.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.configcat.publicapi.java.client.model.UpdateSettingValueModel.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.configcat.publicapi.java.client.model.UpdateSettingValueWithSettingIdModel.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.configcat.publicapi.java.client.model.UpdateSettingValuesWithIdModel.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.configcat.publicapi.java.client.model.UpdateTagModel.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.configcat.publicapi.java.client.model.UpdateTargetingRuleModel.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.configcat.publicapi.java.client.model.UpdateUserConditionModel.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.configcat.publicapi.java.client.model.UpdateValueModel.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.configcat.publicapi.java.client.model.UserConditionModel.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.configcat.publicapi.java.client.model.UserModel.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.configcat.publicapi.java.client.model.ValueModel.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.configcat.publicapi.java.client.model.WebHookRequestModel.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.configcat.publicapi.java.client.model.WebhookConfig.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.configcat.publicapi.java.client.model.WebhookEnvironment.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.configcat.publicapi.java.client.model.WebhookHeaderModel.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.configcat.publicapi.java.client.model.WebhookHeaderResponseModel.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.configcat.publicapi.java.client.model.WebhookResponseModel.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.configcat.publicapi.java.client.model.WebhookSigningKeysModel.CustomTypeAdapterFactory());
        gson = gsonBuilder.create();
    }

    /**
     * Get Gson.
     *
     * @return Gson
     */
    public static Gson getGson() {
        return gson;
    }

    /**
     * Set Gson.
     *
     * @param gson Gson
     */
    public static void setGson(Gson gson) {
        JSON.gson = gson;
    }

    public static void setLenientOnJson(boolean lenientOnJson) {
        isLenientOnJson = lenientOnJson;
    }

    /**
     * Serialize the given Java object into JSON string.
     *
     * @param obj Object
     * @return String representation of the JSON
     */
    public static String serialize(Object obj) {
        return gson.toJson(obj);
    }

    /**
     * Deserialize the given JSON string to Java object.
     *
     * @param <T>        Type
     * @param body       The JSON string
     * @param returnType The type to deserialize into
     * @return The deserialized Java object
     */
    @SuppressWarnings("unchecked")
    public static <T> T deserialize(String body, Type returnType) {
        try {
            if (isLenientOnJson) {
                JsonReader jsonReader = new JsonReader(new StringReader(body));
                // see https://google-gson.googlecode.com/svn/trunk/gson/docs/javadocs/com/google/gson/stream/JsonReader.html#setLenient(boolean)
                jsonReader.setLenient(true);
                return gson.fromJson(jsonReader, returnType);
            } else {
                return gson.fromJson(body, returnType);
            }
        } catch (JsonParseException e) {
            // Fallback processing when failed to parse JSON form response body:
            // return the response body string directly for the String return type;
            if (returnType.equals(String.class)) {
                return (T) body;
            } else {
                throw (e);
            }
        }
    }

    /**
     * Gson TypeAdapter for Byte Array type
     */
    public static class ByteArrayAdapter extends TypeAdapter<byte[]> {

        @Override
        public void write(JsonWriter out, byte[] value) throws IOException {
            if (value == null) {
                out.nullValue();
            } else {
                out.value(ByteString.of(value).base64());
            }
        }

        @Override
        public byte[] read(JsonReader in) throws IOException {
            switch (in.peek()) {
                case NULL:
                    in.nextNull();
                    return null;
                default:
                    String bytesAsBase64 = in.nextString();
                    ByteString byteString = ByteString.decodeBase64(bytesAsBase64);
                    return byteString.toByteArray();
            }
        }
    }

    /**
     * Gson TypeAdapter for JSR310 OffsetDateTime type
     */
    public static class OffsetDateTimeTypeAdapter extends TypeAdapter<OffsetDateTime> {

        private DateTimeFormatter formatter;

        public OffsetDateTimeTypeAdapter() {
            this(DateTimeFormatter.ISO_OFFSET_DATE_TIME);
        }

        public OffsetDateTimeTypeAdapter(DateTimeFormatter formatter) {
            this.formatter = formatter;
        }

        public void setFormat(DateTimeFormatter dateFormat) {
            this.formatter = dateFormat;
        }

        @Override
        public void write(JsonWriter out, OffsetDateTime date) throws IOException {
            if (date == null) {
                out.nullValue();
            } else {
                out.value(formatter.format(date));
            }
        }

        @Override
        public OffsetDateTime read(JsonReader in) throws IOException {
            switch (in.peek()) {
                case NULL:
                    in.nextNull();
                    return null;
                default:
                    String date = in.nextString();
                    if (date.endsWith("+0000")) {
                        date = date.substring(0, date.length()-5) + "Z";
                    }
                    return OffsetDateTime.parse(date, formatter);
            }
        }
    }

    /**
     * Gson TypeAdapter for JSR310 LocalDate type
     */
    public static class LocalDateTypeAdapter extends TypeAdapter<LocalDate> {

        private DateTimeFormatter formatter;

        public LocalDateTypeAdapter() {
            this(DateTimeFormatter.ISO_LOCAL_DATE);
        }

        public LocalDateTypeAdapter(DateTimeFormatter formatter) {
            this.formatter = formatter;
        }

        public void setFormat(DateTimeFormatter dateFormat) {
            this.formatter = dateFormat;
        }

        @Override
        public void write(JsonWriter out, LocalDate date) throws IOException {
            if (date == null) {
                out.nullValue();
            } else {
                out.value(formatter.format(date));
            }
        }

        @Override
        public LocalDate read(JsonReader in) throws IOException {
            switch (in.peek()) {
                case NULL:
                    in.nextNull();
                    return null;
                default:
                    String date = in.nextString();
                    return LocalDate.parse(date, formatter);
            }
        }
    }

    public static void setOffsetDateTimeFormat(DateTimeFormatter dateFormat) {
        offsetDateTimeTypeAdapter.setFormat(dateFormat);
    }

    public static void setLocalDateFormat(DateTimeFormatter dateFormat) {
        localDateTypeAdapter.setFormat(dateFormat);
    }

    /**
     * Gson TypeAdapter for java.sql.Date type
     * If the dateFormat is null, a simple "yyyy-MM-dd" format will be used
     * (more efficient than SimpleDateFormat).
     */
    public static class SqlDateTypeAdapter extends TypeAdapter<java.sql.Date> {

        private DateFormat dateFormat;

        public SqlDateTypeAdapter() {}

        public SqlDateTypeAdapter(DateFormat dateFormat) {
            this.dateFormat = dateFormat;
        }

        public void setFormat(DateFormat dateFormat) {
            this.dateFormat = dateFormat;
        }

        @Override
        public void write(JsonWriter out, java.sql.Date date) throws IOException {
            if (date == null) {
                out.nullValue();
            } else {
                String value;
                if (dateFormat != null) {
                    value = dateFormat.format(date);
                } else {
                    value = date.toString();
                }
                out.value(value);
            }
        }

        @Override
        public java.sql.Date read(JsonReader in) throws IOException {
            switch (in.peek()) {
                case NULL:
                    in.nextNull();
                    return null;
                default:
                    String date = in.nextString();
                    try {
                        if (dateFormat != null) {
                            return new java.sql.Date(dateFormat.parse(date).getTime());
                        }
                        return new java.sql.Date(ISO8601Utils.parse(date, new ParsePosition(0)).getTime());
                    } catch (ParseException e) {
                        throw new JsonParseException(e);
                    }
            }
        }
    }

    /**
     * Gson TypeAdapter for java.util.Date type
     * If the dateFormat is null, ISO8601Utils will be used.
     */
    public static class DateTypeAdapter extends TypeAdapter<Date> {

        private DateFormat dateFormat;

        public DateTypeAdapter() {}

        public DateTypeAdapter(DateFormat dateFormat) {
            this.dateFormat = dateFormat;
        }

        public void setFormat(DateFormat dateFormat) {
            this.dateFormat = dateFormat;
        }

        @Override
        public void write(JsonWriter out, Date date) throws IOException {
            if (date == null) {
                out.nullValue();
            } else {
                String value;
                if (dateFormat != null) {
                    value = dateFormat.format(date);
                } else {
                    value = ISO8601Utils.format(date, true);
                }
                out.value(value);
            }
        }

        @Override
        public Date read(JsonReader in) throws IOException {
            try {
                switch (in.peek()) {
                    case NULL:
                        in.nextNull();
                        return null;
                    default:
                        String date = in.nextString();
                        try {
                            if (dateFormat != null) {
                                return dateFormat.parse(date);
                            }
                            return ISO8601Utils.parse(date, new ParsePosition(0));
                        } catch (ParseException e) {
                            throw new JsonParseException(e);
                        }
                }
            } catch (IllegalArgumentException e) {
                throw new JsonParseException(e);
            }
        }
    }

    public static void setDateFormat(DateFormat dateFormat) {
        dateTypeAdapter.setFormat(dateFormat);
    }

    public static void setSqlDateFormat(DateFormat dateFormat) {
        sqlDateTypeAdapter.setFormat(dateFormat);
    }
}
