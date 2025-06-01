# Steps to deploy
1. (Optional) Follow the guide in `REGENERATE.md` if you want to regenerate the full client code (e.g. refreshing with new API endpoints)
   1. If necessary update the dependencies manually OR
   2. Regenerate and update the `build.gradle` file.
      1. Before generating the client code, remove the `build.gradle` from the `.openapi-generator-ignore` file.
      2. In the newly generated `build.gradle`, set up the `mavenPublishing` task as before the regeneration.
      3. Clean out any not necessary task or dependencies.
      4. After generation, add the `build.gradle` back to the ignore file.   
2. Update the version in the `build.gradle` file.
3. Commit & Push

## Publish
Use the **same version** for the git tag as in the properties file.
- Via git tag
    1. Create a new version tag.
       ```bash
       git tag v[MAJOR].[MINOR].[PATCH]
       ```
       > Example: `git tag v2.5.5`
    2. Push the tag.
       ```bash
       git push origin --tags
       ```
- Via Github release 

  Create a new [Github release](https://github.com/configcat/configcat-publicapi-java-client/releases) with a new version tag and release notes.

## Sync
1. Log in to [Maven Central Repository](https://central.sonatype.org/) and follow these steps:
    1. Go to the `Publish` page and select the version you published.
    2. Click `Publish`. The process might take some time, click `Refresh` to get the latest state.
2. Make sure the new version is available on [Maven Central](https://central.sonatype.com/artifact/com.configcat/configcat-publicapi-java-client).