/*
 * Harness feature flag service client apis
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: cf@harness.io
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.harness.cfsdk.cloud.core.model;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import io.swagger.annotations.ApiModelProperty;

/**
 * FeatureConfig
 */
public class FeatureConfig {

  public static final String SERIALIZED_NAME_PROJECT = "project";
  @SerializedName(SERIALIZED_NAME_PROJECT)
  private String project;

  public static final String SERIALIZED_NAME_ENVIRONMENT = "environment";
  @SerializedName(SERIALIZED_NAME_ENVIRONMENT)
  private String environment;

  public static final String SERIALIZED_NAME_FEATURE = "feature";
  @SerializedName(SERIALIZED_NAME_FEATURE)
  private String feature;

  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  private FeatureState state;

  /**
   * Gets or Sets kind
   */
  @JsonAdapter(KindEnum.Adapter.class)
  public enum KindEnum {
    BOOLEAN("boolean"),
    
    INT("int"),
    
    STRING("string"),
    
    JSON("json");

    private String value;

    KindEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static KindEnum fromValue(String value) {
      for (KindEnum b : KindEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<KindEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final KindEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public KindEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return KindEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_KIND = "kind";
  @SerializedName(SERIALIZED_NAME_KIND)
  private KindEnum kind;

  public static final String SERIALIZED_NAME_VARIATIONS = "variations";
  @SerializedName(SERIALIZED_NAME_VARIATIONS)
  private List<Variation> variations = new ArrayList<>();

  public static final String SERIALIZED_NAME_RULES = "rules";
  @SerializedName(SERIALIZED_NAME_RULES)
  private List<ServingRule> rules = null;

  public static final String SERIALIZED_NAME_DEFAULT_SERVE = "defaultServe";
  @SerializedName(SERIALIZED_NAME_DEFAULT_SERVE)
  private Serve defaultServe;

  public static final String SERIALIZED_NAME_OFF_VARIATION = "offVariation";
  @SerializedName(SERIALIZED_NAME_OFF_VARIATION)
  private String offVariation;

  public static final String SERIALIZED_NAME_PREREQUISITES = "prerequisites";
  @SerializedName(SERIALIZED_NAME_PREREQUISITES)
  private List<Prerequisite> prerequisites = null;

  public static final String SERIALIZED_NAME_VARIATION_TO_TARGET_MAP = "variationToTargetMap";
  @SerializedName(SERIALIZED_NAME_VARIATION_TO_TARGET_MAP)
  private List<VariationMap> variationToTargetMap = null;


  public FeatureConfig project(String project) {
    
    this.project = project;
    return this;
  }

   /**
   * Get project
   * @return project
  **/
  @ApiModelProperty(required = true, value = "")

  public String getProject() {
    return project;
  }


  public void setProject(String project) {
    this.project = project;
  }


  public FeatureConfig environment(String environment) {
    
    this.environment = environment;
    return this;
  }

   /**
   * Get environment
   * @return environment
  **/
  @ApiModelProperty(required = true, value = "")

  public String getEnvironment() {
    return environment;
  }


  public void setEnvironment(String environment) {
    this.environment = environment;
  }


  public FeatureConfig feature(String feature) {
    
    this.feature = feature;
    return this;
  }

   /**
   * Get feature
   * @return feature
  **/
  @ApiModelProperty(required = true, value = "")

  public String getFeature() {
    return feature;
  }


  public void setFeature(String feature) {
    this.feature = feature;
  }


  public FeatureConfig state(FeatureState state) {
    
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @ApiModelProperty(required = true, value = "")

  public FeatureState getState() {
    return state;
  }


  public void setState(FeatureState state) {
    this.state = state;
  }


  public FeatureConfig kind(KindEnum kind) {
    
    this.kind = kind;
    return this;
  }

   /**
   * Get kind
   * @return kind
  **/
  @ApiModelProperty(required = true, value = "")

  public KindEnum getKind() {
    return kind;
  }


  public void setKind(KindEnum kind) {
    this.kind = kind;
  }


  public FeatureConfig variations(List<Variation> variations) {
    
    this.variations = variations;
    return this;
  }

  public FeatureConfig addVariationsItem(Variation variationsItem) {
    this.variations.add(variationsItem);
    return this;
  }

   /**
   * Get variations
   * @return variations
  **/
  @ApiModelProperty(required = true, value = "")

  public List<Variation> getVariations() {
    return variations;
  }


  public void setVariations(List<Variation> variations) {
    this.variations = variations;
  }


  public FeatureConfig rules(List<ServingRule> rules) {
    
    this.rules = rules;
    return this;
  }

  public FeatureConfig addRulesItem(ServingRule rulesItem) {
    if (this.rules == null) {
      this.rules = new ArrayList<>();
    }
    this.rules.add(rulesItem);
    return this;
  }

   /**
   * Get rules
   * @return rules
  **/
  @androidx.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<ServingRule> getRules() {
    return rules;
  }


  public void setRules(List<ServingRule> rules) {
    this.rules = rules;
  }


  public FeatureConfig defaultServe(Serve defaultServe) {
    
    this.defaultServe = defaultServe;
    return this;
  }

   /**
   * Get defaultServe
   * @return defaultServe
  **/
  @ApiModelProperty(required = true, value = "")

  public Serve getDefaultServe() {
    return defaultServe;
  }


  public void setDefaultServe(Serve defaultServe) {
    this.defaultServe = defaultServe;
  }


  public FeatureConfig offVariation(String offVariation) {
    
    this.offVariation = offVariation;
    return this;
  }

   /**
   * Get offVariation
   * @return offVariation
  **/
  @ApiModelProperty(required = true, value = "")

  public String getOffVariation() {
    return offVariation;
  }


  public void setOffVariation(String offVariation) {
    this.offVariation = offVariation;
  }


  public FeatureConfig prerequisites(List<Prerequisite> prerequisites) {
    
    this.prerequisites = prerequisites;
    return this;
  }

  public FeatureConfig addPrerequisitesItem(Prerequisite prerequisitesItem) {
    if (this.prerequisites == null) {
      this.prerequisites = new ArrayList<>();
    }
    this.prerequisites.add(prerequisitesItem);
    return this;
  }

   /**
   * Get prerequisites
   * @return prerequisites
  **/
  @androidx.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Prerequisite> getPrerequisites() {
    return prerequisites;
  }


  public void setPrerequisites(List<Prerequisite> prerequisites) {
    this.prerequisites = prerequisites;
  }


  public FeatureConfig variationToTargetMap(List<VariationMap> variationToTargetMap) {
    
    this.variationToTargetMap = variationToTargetMap;
    return this;
  }

  public FeatureConfig addVariationToTargetMapItem(VariationMap variationToTargetMapItem) {
    if (this.variationToTargetMap == null) {
      this.variationToTargetMap = new ArrayList<>();
    }
    this.variationToTargetMap.add(variationToTargetMapItem);
    return this;
  }

   /**
   * Get variationToTargetMap
   * @return variationToTargetMap
  **/
  @androidx.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<VariationMap> getVariationToTargetMap() {
    return variationToTargetMap;
  }


  public void setVariationToTargetMap(List<VariationMap> variationToTargetMap) {
    this.variationToTargetMap = variationToTargetMap;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FeatureConfig featureConfig = (FeatureConfig) o;
    return Objects.equals(this.project, featureConfig.project) &&
        Objects.equals(this.environment, featureConfig.environment) &&
        Objects.equals(this.feature, featureConfig.feature) &&
        Objects.equals(this.state, featureConfig.state) &&
        Objects.equals(this.kind, featureConfig.kind) &&
        Objects.equals(this.variations, featureConfig.variations) &&
        Objects.equals(this.rules, featureConfig.rules) &&
        Objects.equals(this.defaultServe, featureConfig.defaultServe) &&
        Objects.equals(this.offVariation, featureConfig.offVariation) &&
        Objects.equals(this.prerequisites, featureConfig.prerequisites) &&
        Objects.equals(this.variationToTargetMap, featureConfig.variationToTargetMap);
  }

  @Override
  public int hashCode() {
    return Objects.hash(project, environment, feature, state, kind, variations, rules, defaultServe, offVariation, prerequisites, variationToTargetMap);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FeatureConfig {\n");
    sb.append("    project: ").append(toIndentedString(project)).append("\n");
    sb.append("    environment: ").append(toIndentedString(environment)).append("\n");
    sb.append("    feature: ").append(toIndentedString(feature)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    variations: ").append(toIndentedString(variations)).append("\n");
    sb.append("    rules: ").append(toIndentedString(rules)).append("\n");
    sb.append("    defaultServe: ").append(toIndentedString(defaultServe)).append("\n");
    sb.append("    offVariation: ").append(toIndentedString(offVariation)).append("\n");
    sb.append("    prerequisites: ").append(toIndentedString(prerequisites)).append("\n");
    sb.append("    variationToTargetMap: ").append(toIndentedString(variationToTargetMap)).append("\n");
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

}

