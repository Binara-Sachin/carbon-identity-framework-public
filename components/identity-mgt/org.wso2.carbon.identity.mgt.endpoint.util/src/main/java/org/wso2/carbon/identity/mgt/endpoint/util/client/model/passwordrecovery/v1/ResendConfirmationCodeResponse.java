/*
 * Copyright (c) 2020, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * WSO2 Inc. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.wso2.carbon.identity.mgt.endpoint.util.client.model.passwordrecovery.v1;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Object to encapsulate the details regarding resend confirmation code
 **/
public class ResendConfirmationCodeResponse {

    private String code;
    private String message;
    private String notificationChannel;
    private String resendCode;
    private List<APICall> links = null;

    /**
    * Success status code
    **/
    public ResendConfirmationCodeResponse code(String code) {

        this.code = code;
        return this;
    }

    @JsonProperty("code")
    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }

    /**
    * Success status message
    **/
    public ResendConfirmationCodeResponse message(String message) {

        this.message = message;
        return this;
    }

    @JsonProperty("message")
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }

    /**
    * Channel that is used to send recovery information
    **/
    public ResendConfirmationCodeResponse notificationChannel(String notificationChannel) {

        this.notificationChannel = notificationChannel;
        return this;
    }

    @JsonProperty("notificationChannel")
    public String getNotificationChannel() {
        return notificationChannel;
    }
    public void setNotificationChannel(String notificationChannel) {
        this.notificationChannel = notificationChannel;
    }

    /**
    * Resend code to resend the confirmation code
    **/
    public ResendConfirmationCodeResponse resendCode(String resendCode) {

        this.resendCode = resendCode;
        return this;
    }

    @JsonProperty("resendCode")
    public String getResendCode() {
        return resendCode;
    }
    public void setResendCode(String resendCode) {
        this.resendCode = resendCode;
    }

    /**
    * Contains available api calls
    **/
    public ResendConfirmationCodeResponse links(List<APICall> links) {

        this.links = links;
        return this;
    }

    @JsonProperty("links")
    public List<APICall> getLinks() {
        return links;
    }
    public void setLinks(List<APICall> links) {
        this.links = links;
    }

    public ResendConfirmationCodeResponse addLinksItem(APICall linksItem) {
        if (this.links == null) {
            this.links = new ArrayList<>();
        }
        this.links.add(linksItem);
        return this;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ResendConfirmationCodeResponse ResendConfirmationCodeResponse = (ResendConfirmationCodeResponse) o;
        return Objects.equals(this.code, ResendConfirmationCodeResponse.code) &&
            Objects.equals(this.message, ResendConfirmationCodeResponse.message) &&
            Objects.equals(this.notificationChannel, ResendConfirmationCodeResponse.notificationChannel) &&
            Objects.equals(this.resendCode, ResendConfirmationCodeResponse.resendCode) &&
            Objects.equals(this.links, ResendConfirmationCodeResponse.links);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, message, notificationChannel, resendCode, links);
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append("class ResendConfirmationCodeResponse {\n");

        sb.append("    code: ").append(toIndentedString(code)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    notificationChannel: ").append(toIndentedString(notificationChannel)).append("\n");
        sb.append("    resendCode: ").append(toIndentedString(resendCode)).append("\n");
        sb.append("    links: ").append(toIndentedString(links)).append("\n");
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
        return o.toString().replace("\n", "\n");
    }
}
