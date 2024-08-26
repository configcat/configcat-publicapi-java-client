# Steps to deploy
1. In the `GENERATE.md` command update the `artifactVersion` property value to the new version.
2. Run the command and generate the client.
4. Commit & Push
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
1. Log in to [Maven Repository](https://oss.sonatype.org/) and follow these steps:
    1. Select `Staging Repositories` and select the version you published.
    2. Click `Close`. The process might take some time, click `Refresh` to get the latest state.
    3. When the repo is closed click `Release`, tick the `Automatically drop when released` option.
2. Make sure the new version is available on [Maven Central](https://search.maven.org/artifact/com.configcat/configcat-publicapi-java-client).

