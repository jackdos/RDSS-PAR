package org.parcore.domain;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * PAR API
 * <p>
 * Tool
 * <p>
 * Domain model for the Tool Core Entity
 * <p>
 * OpenAPI spec version: 1.0.0
 * <p>
 * This class is based on code auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 */
@SuppressWarnings("unused")
@ApiModel(description = "A software tool or application that can be used to perform preservation actions")
public class Tool {
    @SerializedName("id")
    private ParIdentifier id = null;

    @SerializedName("localLastModifiedDate")
    private String localLastModifiedDate = null;

    @SerializedName("toolAcceptedParameters")
    private List<Parameter> toolAcceptedParameters = null;

    @SerializedName("toolLabel")
    private String toolLabel = null;

    @SerializedName("toolName")
    private String toolName = null;

    @SerializedName("toolOperatingEnvironments")
    private List<String> toolOperatingEnvironments = null;

    @SerializedName("toolPublisher")
    private String toolPublisher = null;

    @SerializedName("toolVersion")
    private String toolVersion = null;

    /**
     * Get id
     *
     * @return id
     **/
    @ApiModelProperty(required = true, value = "")
    public ParIdentifier getId() {
        return id;
    }

    public void setId(ParIdentifier id) {
        this.id = id;
    }

    /**
     * Get localLastModifiedDate
     *
     * @return localLastModifiedDate
     **/
    @ApiModelProperty(value = "")
    public String getLocalLastModifiedDate() {
        return localLastModifiedDate;
    }

    public void setLocalLastModifiedDate(String localLastModifiedDate) {
        this.localLastModifiedDate = localLastModifiedDate;
    }

    public void addToolAcceptedParametersItem(Parameter toolAcceptedParametersItem) {
        if (this.toolAcceptedParameters == null) {
            this.toolAcceptedParameters = new ArrayList<>();
        }
        this.toolAcceptedParameters.add(toolAcceptedParametersItem);
    }

    /**
     * Get toolAcceptedParameters
     *
     * @return toolAcceptedParameters
     **/
    @ApiModelProperty(value = "")
    public List<Parameter> getToolAcceptedParameters() {
        return toolAcceptedParameters;
    }

    public void setToolAcceptedParameters(List<Parameter> toolAcceptedParameters) {
        this.toolAcceptedParameters = toolAcceptedParameters;
    }

    /**
     * Get toolLabel
     *
     * @return toolLabel
     **/
    @ApiModelProperty(value = "")
    public String getToolLabel() {
        return toolLabel;
    }

    public void setToolLabel(String toolLabel) {
        this.toolLabel = toolLabel;
    }

    /**
     * Get toolName
     *
     * @return toolName
     **/
    @ApiModelProperty(required = true, value = "")
    public String getToolName() {
        return toolName;
    }

    public void setToolName(String toolName) {
        this.toolName = toolName;
    }

    public void addToolOperatingEnvironmentsItem(String toolOperatingEnvironmentsItem) {
        if (this.toolOperatingEnvironments == null) {
            this.toolOperatingEnvironments = new ArrayList<>();
        }
        this.toolOperatingEnvironments.add(toolOperatingEnvironmentsItem);
    }

    /**
     * Get toolOperatingEnvironments
     *
     * @return toolOperatingEnvironments
     **/
    @ApiModelProperty(value = "")
    public List<String> getToolOperatingEnvironments() {
        return toolOperatingEnvironments;
    }

    public void setToolOperatingEnvironments(List<String> toolOperatingEnvironments) {
        this.toolOperatingEnvironments = toolOperatingEnvironments;
    }

    /**
     * Get toolPublisher
     *
     * @return toolPublisher
     **/
    @ApiModelProperty(value = "")
    public String getToolPublisher() {
        return toolPublisher;
    }

    public void setToolPublisher(String toolPublisher) {
        this.toolPublisher = toolPublisher;
    }

    /**
     * Get toolVersion
     *
     * @return toolVersion
     **/
    @ApiModelProperty(value = "")
    public String getToolVersion() {
        return toolVersion;
    }

    public void setToolVersion(String toolVersion) {
        this.toolVersion = toolVersion;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Tool tool = (Tool) o;
        return Objects.equals(this.id, tool.id) &&
                Objects.equals(this.localLastModifiedDate, tool.localLastModifiedDate) &&
                Objects.equals(this.toolAcceptedParameters, tool.toolAcceptedParameters) &&
                Objects.equals(this.toolLabel, tool.toolLabel) &&
                Objects.equals(this.toolName, tool.toolName) &&
                Objects.equals(this.toolOperatingEnvironments, tool.toolOperatingEnvironments) &&
                Objects.equals(this.toolPublisher, tool.toolPublisher) &&
                Objects.equals(this.toolVersion, tool.toolVersion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, localLastModifiedDate, toolAcceptedParameters, toolLabel, toolName, toolOperatingEnvironments, toolPublisher, toolVersion);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Tool {\n");

        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    localLastModifiedDate: ").append(toIndentedString(localLastModifiedDate)).append("\n");
        sb.append("    toolAcceptedParameters: ").append(toIndentedString(toolAcceptedParameters)).append("\n");
        sb.append("    toolLabel: ").append(toIndentedString(toolLabel)).append("\n");
        sb.append("    toolName: ").append(toIndentedString(toolName)).append("\n");
        sb.append("    toolOperatingEnvironments: ").append(toIndentedString(toolOperatingEnvironments)).append("\n");
        sb.append("    toolPublisher: ").append(toIndentedString(toolPublisher)).append("\n");
        sb.append("    toolVersion: ").append(toIndentedString(toolVersion)).append("\n");
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