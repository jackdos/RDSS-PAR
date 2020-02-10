package org.parcore.domain;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;

/**
 * PAR API
 * <p>
 * DeveloperInformation
 * <p>
 * Domain model for the DeveloperInformation object (part of the FileFormat Core Entity)
 * <p>
 * OpenAPI spec version: 1.0.0
 * <p>
 * This class is based on code auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 */
@SuppressWarnings("unused")
public class DeveloperInformation {
    @SerializedName("developerId")
    private String developerId = null;

    @SerializedName("developerIdNamespace")
    private String developerIdNamespace = null;

    @SerializedName("developerName")
    private String developerName = null;

    @SerializedName("organisationName")
    private String organisationName = null;

    @SerializedName("developerCompoundName")
    private String developerCompoundName = null;

    /**
     * Get developerId
     *
     * @return developerId
     **/
    @ApiModelProperty(required = true, value = "")
    public String getDeveloperId() {
        return developerId;
    }

    public void setDeveloperId(String developerId) {
        this.developerId = developerId;
    }

    /**
     * Get developerIdNamespace
     *
     * @return developerIdNamespace
     **/
    @ApiModelProperty(required = true, value = "")
    public String getDeveloperIdNamespace() {
        return developerIdNamespace;
    }

    public void setDeveloperIdNamespace(String developerIdNamespace) {
        this.developerIdNamespace = developerIdNamespace;
    }

    /**
     * Get developerName
     *
     * @return developerName
     **/
    @ApiModelProperty(value = "")
    public String getDeveloperName() {
        return developerName;
    }

    public void setDeveloperName(String developerName) {
        this.developerName = developerName;
    }

    /**
     * Get organisationName
     *
     * @return organisationName
     **/
    @ApiModelProperty(value = "")
    public String getOrganisationName() {
        return organisationName;
    }

    public void setOrganisationName(String organisationName) {
        this.organisationName = organisationName;
    }

    /**
     * Get developerCompoundName
     *
     * @return developerCompoundName
     **/
    @ApiModelProperty(value = "")
    public String getDeveloperCompoundName() {
        return developerCompoundName;
    }

    public void setDeveloperCompoundName(String developerCompoundName) {
        this.developerCompoundName = developerCompoundName;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DeveloperInformation developerInformation = (DeveloperInformation) o;
        return Objects.equals(this.developerId, developerInformation.developerId) &&
                Objects.equals(this.developerIdNamespace, developerInformation.developerIdNamespace) &&
                Objects.equals(this.developerName, developerInformation.developerName) &&
                Objects.equals(this.organisationName, developerInformation.organisationName) &&
                Objects.equals(this.developerCompoundName, developerInformation.developerCompoundName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(developerId, developerIdNamespace, developerName, organisationName, developerCompoundName);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeveloperInformation {\n");

        sb.append("    developerId: ").append(toIndentedString(developerId)).append("\n");
        sb.append("    developerIdNamespace: ").append(toIndentedString(developerIdNamespace)).append("\n");
        sb.append("    developerName: ").append(toIndentedString(developerName)).append("\n");
        sb.append("    organisationName: ").append(toIndentedString(organisationName)).append("\n");
        sb.append("    developerCompoundName: ").append(toIndentedString(developerCompoundName)).append("\n");
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