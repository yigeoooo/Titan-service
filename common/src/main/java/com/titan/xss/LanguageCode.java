package com.titan.xss;

import java.util.HashMap;
import java.util.Map;

/**
 * @author wangq
 */
public enum LanguageCode {
    NONE("","",""),
    ENGLISH("EN", "en", ""),
    JAPANESE("JP", "ja", "JP"),
    S_CHINESE("CN", "zh", "CN"),
    T_CHINESE("TC", "zh", "TW"),
    THAI("TH", "th", "TH");

    private String languageTypeCode;
    private String language;
    private String country;

    private LanguageCode(String languageTypeCode, String language, String country) {
        this.languageTypeCode = languageTypeCode;
        this.language = language;
        this.country = country;
    }
    private static final Map<String, LanguageCode> CODE_MAP = new HashMap<>();

    static {
        for(LanguageCode code : values()) {
            CODE_MAP.put(code.getLanguageTypeCode(), code);
        }
    }

    public static LanguageCode getValueByCode(String code){
        if (CODE_MAP.containsKey(code)){
            return CODE_MAP.get(code);
        } else {
            return LanguageCode.NONE;
        }
    }

    public String getLanguageTypeCode() {
        return languageTypeCode;
    }

    public void setLanguageTypeCode(String languageTypeCode) {
        this.languageTypeCode = languageTypeCode;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public static String getPropertiesNameByCode(String languageTypeCode) {
        for (LanguageCode item : LanguageCode.values()) {
            if (languageTypeCode.equals(item.languageTypeCode)) {
                return item.language+"_"+item.languageTypeCode;
            }
        }
        return "";
    }
}
