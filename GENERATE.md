1. Regenerate public api
   
   Linux:
   ```docker run --rm -v ${PWD}:/local openapitools/openapi-generator-cli:v7.7.0 generate -i https://api.configcat.com/docs/v1/swagger.json -g java -o /local  --additional-properties=modelPackage=com.configcat.publicapi.java.client.model,apiPackage=com.configcat.publicapi.java.client.api,invokerPackage=com.configcat.publicapi.java.client,groupId=com.configcat,artifactId=configcat-publicapi-java-client,dateLibrary=java8,useRuntimeException=true```

   Windows:
   ```docker run --rm -v %CD%:/local openapitools/openapi-generator-cli:v7.7.0 generate -i https://api.configcat.com/docs/v1/swagger.json -g java -o /local --additional-properties=modelPackage=com.configcat.publicapi.java.client.model,apiPackage=com.configcat.publicapi.java.client.api,invokerPackage=com.configcat.publicapi.java.client,groupId=com.configcat,artifactId=configcat-publicapi-java-client,dateLibrary=java8,useRuntimeException=true```
 
