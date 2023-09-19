/*
 * DRACOON API
 * REST Web Services for DRACOON<br><br>This page provides an overview of all available and documented DRACOON APIs, which are grouped by tags.<br>Each tag provides a collection of APIs that are intended for a specific area of the DRACOON.<br><br><a title='Developer Information' href='https://developer.dracoon.com'>Developer Information</a>&emsp;&emsp;<a title='Get SDKs on GitHub' href='https://github.com/dracoon'>Get SDKs on GitHub</a><br><br><a title='Terms of service' href='https://www.dracoon.com/terms/general-terms-and-conditions/'>Terms of service</a>
 *
 * OpenAPI spec version: 4.45.1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package ch.cyberduck.core.sds.io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
/**
 * OAuthClientInfo
 */
@Schema(description = "OAuthClientInfo")

public class FeaturedOAuthClient {
  @JsonProperty("isAvailable")
  private Boolean isAvailable = null;

  @JsonProperty("oauthClientName")
  private String oauthClientName = null;

  public FeaturedOAuthClient isAvailable(Boolean isAvailable) {
    this.isAvailable = isAvailable;
    return this;
  }

   /**
   * Is Available
   * @return isAvailable
  **/
  @Schema(required = true, description = "Is Available")
  public Boolean isIsAvailable() {
    return isAvailable;
  }

  public void setIsAvailable(Boolean isAvailable) {
    this.isAvailable = isAvailable;
  }

  public FeaturedOAuthClient oauthClientName(String oauthClientName) {
    this.oauthClientName = oauthClientName;
    return this;
  }

   /**
   * Get oauthClientName
   * @return oauthClientName
  **/
  @Schema(description = "")
  public String getOauthClientName() {
    return oauthClientName;
  }

  public void setOauthClientName(String oauthClientName) {
    this.oauthClientName = oauthClientName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FeaturedOAuthClient featuredOAuthClient = (FeaturedOAuthClient) o;
    return Objects.equals(this.isAvailable, featuredOAuthClient.isAvailable) &&
        Objects.equals(this.oauthClientName, featuredOAuthClient.oauthClientName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isAvailable, oauthClientName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FeaturedOAuthClient {\n");
    
    sb.append("    isAvailable: ").append(toIndentedString(isAvailable)).append("\n");
    sb.append("    oauthClientName: ").append(toIndentedString(oauthClientName)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}