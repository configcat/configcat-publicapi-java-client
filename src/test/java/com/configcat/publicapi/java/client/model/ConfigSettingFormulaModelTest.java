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
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/**
 * Model tests for ConfigSettingFormulaModel
 */
public class ConfigSettingFormulaModelTest {
    private final ConfigSettingFormulaModel model = new ConfigSettingFormulaModel();

    /**
     * Model tests for ConfigSettingFormulaModel
     */
    @Test
    public void testConfigSettingFormulaModel() {
        // TODO: test ConfigSettingFormulaModel
    }

    /**
     * Test the property 'lastVersionId'
     */
    @Test
    public void lastVersionIdTest() {
        // TODO: test lastVersionId
    }

    /**
     * Test the property 'defaultValue'
     */
    @Test
    public void defaultValueTest() {
        // TODO: test defaultValue
    }

    /**
     * Test the property 'targetingRules'
     */
    @Test
    public void targetingRulesTest() {
        // TODO: test targetingRules
    }

    /**
     * Test the property 'setting'
     */
    @Test
    public void settingTest() {
        // TODO: test setting
    }

    /**
     * Test the property 'updatedAt'
     */
    @Test
    public void updatedAtTest() {
        // TODO: test updatedAt
    }

    /**
     * Test the property 'percentageEvaluationAttribute'
     */
    @Test
    public void percentageEvaluationAttributeTest() {
        // TODO: test percentageEvaluationAttribute
    }

    /**
     * Test the property 'lastUpdaterUserEmail'
     */
    @Test
    public void lastUpdaterUserEmailTest() {
        // TODO: test lastUpdaterUserEmail
    }

    /**
     * Test the property 'lastUpdaterUserFullName'
     */
    @Test
    public void lastUpdaterUserFullNameTest() {
        // TODO: test lastUpdaterUserFullName
    }

    /**
     * Test the property 'integrationLinks'
     */
    @Test
    public void integrationLinksTest() {
        // TODO: test integrationLinks
    }

    /**
     * Test the property 'settingTags'
     */
    @Test
    public void settingTagsTest() {
        // TODO: test settingTags
    }

    /**
     * Test the property 'settingIdsWherePrerequisite'
     */
    @Test
    public void settingIdsWherePrerequisiteTest() {
        // TODO: test settingIdsWherePrerequisite
    }

}
