package com.maiora.conversion;

import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

@Service
public class ConversionService {
    private static final Map<String, Integer> MONTH_MAP;

    static {
        MONTH_MAP = new HashMap<>();
        MONTH_MAP.put("Apr", 4);
        MONTH_MAP.put("May", 5);
        MONTH_MAP.put("June", 6);
        MONTH_MAP.put("July", 7);
        MONTH_MAP.put("Aug", 8);
        MONTH_MAP.put("Sep", 9);
        MONTH_MAP.put("Oct", 10);
        MONTH_MAP.put("Nov", 11);
        MONTH_MAP.put("Decm", 12);
        MONTH_MAP.put("Jan", 1);
        MONTH_MAP.put("Feb", 2);
        MONTH_MAP.put("March", 3);
    }

    public List<RefResponse> getResponse(RequestData requestData) {
        RefRequest refRequest = requestData.getContent();
        String location = refRequest.getLocation();
        String code = refRequest.getCatName();
        String unit = refRequest.getUom();
        int year = Integer.parseInt(refRequest.getFyear());

        return MONTH_MAP.entrySet().stream()
                .map(entry -> createRefResponse(entry.getKey(), entry.getValue(), refRequest, location, code, unit, year))
                .filter(Objects::nonNull)
                .collect(Collectors.toList());
    }

    private RefResponse createRefResponse(String monthName, int month, RefRequest refRequest, String location, String code, String unit, int year) {
        String valueString = getMonthValue(monthName, refRequest);
        double value = Double.parseDouble(valueString);

        int adjustedYear = (month >= 4 && month <= 12) ? year - 1 : year;

        RefResponse record = new RefResponse();
        record.setLocation(location);
        record.setCode(code);
        record.setMonth(month);
        record.setYear(adjustedYear);
        record.setValue(value);
        record.setUnit(unit);

        return record;
    }

    private String getMonthValue(String monthName, RefRequest refRequest) {
        try {
            return (String) RefRequest.class.getMethod("get" + monthName).invoke(refRequest);
        } catch (Exception e) {
            return null;
        }
    }
}
