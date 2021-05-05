package com.elrr.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@JsonIgnoreProperties(ignoreUnknown = true)
@Getter
@Setter
@ToString
public class ContactInformation {
private String contactinformation;
private String emergencycontact;
private String electronicmailaddresstype;
private String isprimaryindicator;
private String electronicmailaddress;
}
