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
import ch.cyberduck.core.deepbox.io.swagger.client.model.AccessInfo;
import ch.cyberduck.core.deepbox.io.swagger.client.model.BoxPolicy;
import ch.cyberduck.core.deepbox.io.swagger.client.model.OutShareInfo;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 * AdminBox
 */



public class AdminBox {
  @JsonProperty("deepBoxNodeId")
  private String deepBoxNodeId = null;

  @JsonProperty("boxNodeId")
  private String boxNodeId = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("boxPolicy")
  private BoxPolicy boxPolicy = null;

  @JsonProperty("companyId")
  private String companyId = null;

  @JsonProperty("boxType")
  private String boxType = null;

  @JsonProperty("boxVariant")
  private String boxVariant = null;

  @JsonProperty("roots")
  private Map<String, String> roots = null;

  @JsonProperty("accesses")
  private List<AccessInfo> accesses = null;

  @JsonProperty("outShares")
  private List<OutShareInfo> outShares = null;

  public AdminBox deepBoxNodeId(String deepBoxNodeId) {
    this.deepBoxNodeId = deepBoxNodeId;
    return this;
  }

   /**
   * Get deepBoxNodeId
   * @return deepBoxNodeId
  **/
  @Schema(description = "")
  public String getDeepBoxNodeId() {
    return deepBoxNodeId;
  }

  public void setDeepBoxNodeId(String deepBoxNodeId) {
    this.deepBoxNodeId = deepBoxNodeId;
  }

  public AdminBox boxNodeId(String boxNodeId) {
    this.boxNodeId = boxNodeId;
    return this;
  }

   /**
   * Get boxNodeId
   * @return boxNodeId
  **/
  @Schema(description = "")
  public String getBoxNodeId() {
    return boxNodeId;
  }

  public void setBoxNodeId(String boxNodeId) {
    this.boxNodeId = boxNodeId;
  }

  public AdminBox name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @Schema(description = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public AdminBox boxPolicy(BoxPolicy boxPolicy) {
    this.boxPolicy = boxPolicy;
    return this;
  }

   /**
   * Get boxPolicy
   * @return boxPolicy
  **/
  @Schema(description = "")
  public BoxPolicy getBoxPolicy() {
    return boxPolicy;
  }

  public void setBoxPolicy(BoxPolicy boxPolicy) {
    this.boxPolicy = boxPolicy;
  }

  public AdminBox companyId(String companyId) {
    this.companyId = companyId;
    return this;
  }

   /**
   * Get companyId
   * @return companyId
  **/
  @Schema(description = "")
  public String getCompanyId() {
    return companyId;
  }

  public void setCompanyId(String companyId) {
    this.companyId = companyId;
  }

  public AdminBox boxType(String boxType) {
    this.boxType = boxType;
    return this;
  }

   /**
   * Get boxType
   * @return boxType
  **/
  @Schema(description = "")
  public String getBoxType() {
    return boxType;
  }

  public void setBoxType(String boxType) {
    this.boxType = boxType;
  }

  public AdminBox boxVariant(String boxVariant) {
    this.boxVariant = boxVariant;
    return this;
  }

   /**
   * Box Variant. null is simple box.
   * @return boxVariant
  **/
  @Schema(description = "Box Variant. null is simple box.")
  public String getBoxVariant() {
    return boxVariant;
  }

  public void setBoxVariant(String boxVariant) {
    this.boxVariant = boxVariant;
  }

  public AdminBox roots(Map<String, String> roots) {
    this.roots = roots;
    return this;
  }

  public AdminBox putRootsItem(String key, String rootsItem) {
    if (this.roots == null) {
      this.roots = new HashMap<>();
    }
    this.roots.put(key, rootsItem);
    return this;
  }

   /**
   * Get roots
   * @return roots
  **/
  @Schema(description = "")
  public Map<String, String> getRoots() {
    return roots;
  }

  public void setRoots(Map<String, String> roots) {
    this.roots = roots;
  }

  public AdminBox accesses(List<AccessInfo> accesses) {
    this.accesses = accesses;
    return this;
  }

  public AdminBox addAccessesItem(AccessInfo accessesItem) {
    if (this.accesses == null) {
      this.accesses = new ArrayList<>();
    }
    this.accesses.add(accessesItem);
    return this;
  }

   /**
   * Get accesses
   * @return accesses
  **/
  @Schema(description = "")
  public List<AccessInfo> getAccesses() {
    return accesses;
  }

  public void setAccesses(List<AccessInfo> accesses) {
    this.accesses = accesses;
  }

  public AdminBox outShares(List<OutShareInfo> outShares) {
    this.outShares = outShares;
    return this;
  }

  public AdminBox addOutSharesItem(OutShareInfo outSharesItem) {
    if (this.outShares == null) {
      this.outShares = new ArrayList<>();
    }
    this.outShares.add(outSharesItem);
    return this;
  }

   /**
   * Get outShares
   * @return outShares
  **/
  @Schema(description = "")
  public List<OutShareInfo> getOutShares() {
    return outShares;
  }

  public void setOutShares(List<OutShareInfo> outShares) {
    this.outShares = outShares;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdminBox adminBox = (AdminBox) o;
    return Objects.equals(this.deepBoxNodeId, adminBox.deepBoxNodeId) &&
        Objects.equals(this.boxNodeId, adminBox.boxNodeId) &&
        Objects.equals(this.name, adminBox.name) &&
        Objects.equals(this.boxPolicy, adminBox.boxPolicy) &&
        Objects.equals(this.companyId, adminBox.companyId) &&
        Objects.equals(this.boxType, adminBox.boxType) &&
        Objects.equals(this.boxVariant, adminBox.boxVariant) &&
        Objects.equals(this.roots, adminBox.roots) &&
        Objects.equals(this.accesses, adminBox.accesses) &&
        Objects.equals(this.outShares, adminBox.outShares);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deepBoxNodeId, boxNodeId, name, boxPolicy, companyId, boxType, boxVariant, roots, accesses, outShares);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdminBox {\n");
    
    sb.append("    deepBoxNodeId: ").append(toIndentedString(deepBoxNodeId)).append("\n");
    sb.append("    boxNodeId: ").append(toIndentedString(boxNodeId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    boxPolicy: ").append(toIndentedString(boxPolicy)).append("\n");
    sb.append("    companyId: ").append(toIndentedString(companyId)).append("\n");
    sb.append("    boxType: ").append(toIndentedString(boxType)).append("\n");
    sb.append("    boxVariant: ").append(toIndentedString(boxVariant)).append("\n");
    sb.append("    roots: ").append(toIndentedString(roots)).append("\n");
    sb.append("    accesses: ").append(toIndentedString(accesses)).append("\n");
    sb.append("    outShares: ").append(toIndentedString(outShares)).append("\n");
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