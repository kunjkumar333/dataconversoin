package com.maiora.conversion;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class RefRequest {
        @JsonProperty("Fyear")
        public String fyear;
        @JsonProperty("Srno")
        public String srno;
        @JsonProperty("CatName")
        public String catName;
        @JsonProperty("Location")
        public String location;
        @JsonProperty("Uom")
        public String uom;
        @JsonProperty("Apr")
        public String apr;
        @JsonProperty("May")
        public String may;
        @JsonProperty("June")
        public String june;
        @JsonProperty("July")
        public String july;
        @JsonProperty("Aug")
        public String aug;
        @JsonProperty("Sep")
        public String sep;
        @JsonProperty("Oct")
        public String oct;
        @JsonProperty("Nov")
        public String nov;
        @JsonProperty("Decm")
        public String decm;
        @JsonProperty("Jan")
        public String jan;
        @JsonProperty("Feb")
        public String feb;
        @JsonProperty("March")
        public String march;
        @JsonProperty("Total")
        public String total;
}

