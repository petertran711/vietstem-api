/*
 * drfrank
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.OffsetDateTime;

/**
 * Installation
 */

public class Installation {
  @SerializedName("appId")
  private String appId = null;

  @SerializedName("appVersion")
  private String appVersion = null;

  @SerializedName("badge")
  private Double badge = null;

  @SerializedName("created")
  private OffsetDateTime created = null;

  @SerializedName("deviceToken")
  private String deviceToken = null;

  @SerializedName("deviceType")
  private String deviceType = null;

  @SerializedName("modified")
  private OffsetDateTime modified = null;

  @SerializedName("status")
  private String status = null;

  @SerializedName("subscriptions")
  private List<String> subscriptions = null;

  @SerializedName("timeZone")
  private String timeZone = null;

  @SerializedName("userId")
  private String userId = null;

  @SerializedName("id")
  private Double id = null;

  public Installation appId(String appId) {
    this.appId = appId;
    return this;
  }

   /**
   * Get appId
   * @return appId
  **/
  @ApiModelProperty(required = true, value = "")
  public String getAppId() {
    return appId;
  }

  public void setAppId(String appId) {
    this.appId = appId;
  }

  public Installation appVersion(String appVersion) {
    this.appVersion = appVersion;
    return this;
  }

   /**
   * Get appVersion
   * @return appVersion
  **/
  @ApiModelProperty(value = "")
  public String getAppVersion() {
    return appVersion;
  }

  public void setAppVersion(String appVersion) {
    this.appVersion = appVersion;
  }

  public Installation badge(Double badge) {
    this.badge = badge;
    return this;
  }

   /**
   * Get badge
   * @return badge
  **/
  @ApiModelProperty(value = "")
  public Double getBadge() {
    return badge;
  }

  public void setBadge(Double badge) {
    this.badge = badge;
  }

  public Installation created(OffsetDateTime created) {
    this.created = created;
    return this;
  }

   /**
   * Get created
   * @return created
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getCreated() {
    return created;
  }

  public void setCreated(OffsetDateTime created) {
    this.created = created;
  }

  public Installation deviceToken(String deviceToken) {
    this.deviceToken = deviceToken;
    return this;
  }

   /**
   * Get deviceToken
   * @return deviceToken
  **/
  @ApiModelProperty(required = true, value = "")
  public String getDeviceToken() {
    return deviceToken;
  }

  public void setDeviceToken(String deviceToken) {
    this.deviceToken = deviceToken;
  }

  public Installation deviceType(String deviceType) {
    this.deviceType = deviceType;
    return this;
  }

   /**
   * Get deviceType
   * @return deviceType
  **/
  @ApiModelProperty(required = true, value = "")
  public String getDeviceType() {
    return deviceType;
  }

  public void setDeviceType(String deviceType) {
    this.deviceType = deviceType;
  }

  public Installation modified(OffsetDateTime modified) {
    this.modified = modified;
    return this;
  }

   /**
   * Get modified
   * @return modified
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getModified() {
    return modified;
  }

  public void setModified(OffsetDateTime modified) {
    this.modified = modified;
  }

  public Installation status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(value = "")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public Installation subscriptions(List<String> subscriptions) {
    this.subscriptions = subscriptions;
    return this;
  }

  public Installation addSubscriptionsItem(String subscriptionsItem) {
    if (this.subscriptions == null) {
      this.subscriptions = new ArrayList<String>();
    }
    this.subscriptions.add(subscriptionsItem);
    return this;
  }

   /**
   * Get subscriptions
   * @return subscriptions
  **/
  @ApiModelProperty(value = "")
  public List<String> getSubscriptions() {
    return subscriptions;
  }

  public void setSubscriptions(List<String> subscriptions) {
    this.subscriptions = subscriptions;
  }

  public Installation timeZone(String timeZone) {
    this.timeZone = timeZone;
    return this;
  }

   /**
   * Get timeZone
   * @return timeZone
  **/
  @ApiModelProperty(value = "")
  public String getTimeZone() {
    return timeZone;
  }

  public void setTimeZone(String timeZone) {
    this.timeZone = timeZone;
  }

  public Installation userId(String userId) {
    this.userId = userId;
    return this;
  }

   /**
   * Get userId
   * @return userId
  **/
  @ApiModelProperty(value = "")
  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public Installation id(Double id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  public Double getId() {
    return id;
  }

  public void setId(Double id) {
    this.id = id;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Installation installation = (Installation) o;
    return Objects.equals(this.appId, installation.appId) &&
        Objects.equals(this.appVersion, installation.appVersion) &&
        Objects.equals(this.badge, installation.badge) &&
        Objects.equals(this.created, installation.created) &&
        Objects.equals(this.deviceToken, installation.deviceToken) &&
        Objects.equals(this.deviceType, installation.deviceType) &&
        Objects.equals(this.modified, installation.modified) &&
        Objects.equals(this.status, installation.status) &&
        Objects.equals(this.subscriptions, installation.subscriptions) &&
        Objects.equals(this.timeZone, installation.timeZone) &&
        Objects.equals(this.userId, installation.userId) &&
        Objects.equals(this.id, installation.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appId, appVersion, badge, created, deviceToken, deviceType, modified, status, subscriptions, timeZone, userId, id);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Installation {\n");
    
    sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
    sb.append("    appVersion: ").append(toIndentedString(appVersion)).append("\n");
    sb.append("    badge: ").append(toIndentedString(badge)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    deviceToken: ").append(toIndentedString(deviceToken)).append("\n");
    sb.append("    deviceType: ").append(toIndentedString(deviceType)).append("\n");
    sb.append("    modified: ").append(toIndentedString(modified)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    subscriptions: ").append(toIndentedString(subscriptions)).append("\n");
    sb.append("    timeZone: ").append(toIndentedString(timeZone)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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
