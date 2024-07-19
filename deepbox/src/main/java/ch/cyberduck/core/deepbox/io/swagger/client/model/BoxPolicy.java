/*
 * DeepBox
 * DeepBox API Documentation
 *
 * OpenAPI spec version: 1.0
 * Contact: info@deepcloud.swiss
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package ch.cyberduck.core.deepbox.io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
/**
 * BoxPolicy
 */



public class BoxPolicy {
  @JsonProperty("canPurge")
  private Boolean canPurge = null;

  @JsonProperty("canRename")
  private Boolean canRename = null;

  @JsonProperty("canAdminAccess")
  private Boolean canAdminAccess = null;

  @JsonProperty("canAdminShares")
  private Boolean canAdminShares = null;

  @JsonProperty("canAdminGenerics")
  private Boolean canAdminGenerics = null;

  @JsonProperty("canAdminAddresses")
  private Boolean canAdminAddresses = null;

  @JsonProperty("canAdminWebhooks")
  private Boolean canAdminWebhooks = null;

  @JsonProperty("canAdminVariant")
  private Boolean canAdminVariant = null;

  @JsonProperty("canAdminRelations")
  private Boolean canAdminRelations = null;

  public BoxPolicy canPurge(Boolean canPurge) {
    this.canPurge = canPurge;
    return this;
  }

   /**
   * Get canPurge
   * @return canPurge
  **/
  @Schema(description = "")
  public Boolean isCanPurge() {
    return canPurge;
  }

  public void setCanPurge(Boolean canPurge) {
    this.canPurge = canPurge;
  }

  public BoxPolicy canRename(Boolean canRename) {
    this.canRename = canRename;
    return this;
  }

   /**
   * Get canRename
   * @return canRename
  **/
  @Schema(description = "")
  public Boolean isCanRename() {
    return canRename;
  }

  public void setCanRename(Boolean canRename) {
    this.canRename = canRename;
  }

  public BoxPolicy canAdminAccess(Boolean canAdminAccess) {
    this.canAdminAccess = canAdminAccess;
    return this;
  }

   /**
   * Get canAdminAccess
   * @return canAdminAccess
  **/
  @Schema(description = "")
  public Boolean isCanAdminAccess() {
    return canAdminAccess;
  }

  public void setCanAdminAccess(Boolean canAdminAccess) {
    this.canAdminAccess = canAdminAccess;
  }

  public BoxPolicy canAdminShares(Boolean canAdminShares) {
    this.canAdminShares = canAdminShares;
    return this;
  }

   /**
   * Get canAdminShares
   * @return canAdminShares
  **/
  @Schema(description = "")
  public Boolean isCanAdminShares() {
    return canAdminShares;
  }

  public void setCanAdminShares(Boolean canAdminShares) {
    this.canAdminShares = canAdminShares;
  }

  public BoxPolicy canAdminGenerics(Boolean canAdminGenerics) {
    this.canAdminGenerics = canAdminGenerics;
    return this;
  }

   /**
   * Get canAdminGenerics
   * @return canAdminGenerics
  **/
  @Schema(description = "")
  public Boolean isCanAdminGenerics() {
    return canAdminGenerics;
  }

  public void setCanAdminGenerics(Boolean canAdminGenerics) {
    this.canAdminGenerics = canAdminGenerics;
  }

  public BoxPolicy canAdminAddresses(Boolean canAdminAddresses) {
    this.canAdminAddresses = canAdminAddresses;
    return this;
  }

   /**
   * Get canAdminAddresses
   * @return canAdminAddresses
  **/
  @Schema(description = "")
  public Boolean isCanAdminAddresses() {
    return canAdminAddresses;
  }

  public void setCanAdminAddresses(Boolean canAdminAddresses) {
    this.canAdminAddresses = canAdminAddresses;
  }

  public BoxPolicy canAdminWebhooks(Boolean canAdminWebhooks) {
    this.canAdminWebhooks = canAdminWebhooks;
    return this;
  }

   /**
   * Get canAdminWebhooks
   * @return canAdminWebhooks
  **/
  @Schema(description = "")
  public Boolean isCanAdminWebhooks() {
    return canAdminWebhooks;
  }

  public void setCanAdminWebhooks(Boolean canAdminWebhooks) {
    this.canAdminWebhooks = canAdminWebhooks;
  }

  public BoxPolicy canAdminVariant(Boolean canAdminVariant) {
    this.canAdminVariant = canAdminVariant;
    return this;
  }

   /**
   * Get canAdminVariant
   * @return canAdminVariant
  **/
  @Schema(description = "")
  public Boolean isCanAdminVariant() {
    return canAdminVariant;
  }

  public void setCanAdminVariant(Boolean canAdminVariant) {
    this.canAdminVariant = canAdminVariant;
  }

  public BoxPolicy canAdminRelations(Boolean canAdminRelations) {
    this.canAdminRelations = canAdminRelations;
    return this;
  }

   /**
   * Get canAdminRelations
   * @return canAdminRelations
  **/
  @Schema(description = "")
  public Boolean isCanAdminRelations() {
    return canAdminRelations;
  }

  public void setCanAdminRelations(Boolean canAdminRelations) {
    this.canAdminRelations = canAdminRelations;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BoxPolicy boxPolicy = (BoxPolicy) o;
    return Objects.equals(this.canPurge, boxPolicy.canPurge) &&
        Objects.equals(this.canRename, boxPolicy.canRename) &&
        Objects.equals(this.canAdminAccess, boxPolicy.canAdminAccess) &&
        Objects.equals(this.canAdminShares, boxPolicy.canAdminShares) &&
        Objects.equals(this.canAdminGenerics, boxPolicy.canAdminGenerics) &&
        Objects.equals(this.canAdminAddresses, boxPolicy.canAdminAddresses) &&
        Objects.equals(this.canAdminWebhooks, boxPolicy.canAdminWebhooks) &&
        Objects.equals(this.canAdminVariant, boxPolicy.canAdminVariant) &&
        Objects.equals(this.canAdminRelations, boxPolicy.canAdminRelations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(canPurge, canRename, canAdminAccess, canAdminShares, canAdminGenerics, canAdminAddresses, canAdminWebhooks, canAdminVariant, canAdminRelations);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BoxPolicy {\n");
    
    sb.append("    canPurge: ").append(toIndentedString(canPurge)).append("\n");
    sb.append("    canRename: ").append(toIndentedString(canRename)).append("\n");
    sb.append("    canAdminAccess: ").append(toIndentedString(canAdminAccess)).append("\n");
    sb.append("    canAdminShares: ").append(toIndentedString(canAdminShares)).append("\n");
    sb.append("    canAdminGenerics: ").append(toIndentedString(canAdminGenerics)).append("\n");
    sb.append("    canAdminAddresses: ").append(toIndentedString(canAdminAddresses)).append("\n");
    sb.append("    canAdminWebhooks: ").append(toIndentedString(canAdminWebhooks)).append("\n");
    sb.append("    canAdminVariant: ").append(toIndentedString(canAdminVariant)).append("\n");
    sb.append("    canAdminRelations: ").append(toIndentedString(canAdminRelations)).append("\n");
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