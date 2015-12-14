package org.geekhub.json.adapters;

import org.json.JSONObject;

import java.text.SimpleDateFormat;

import java.util.Date;

/**
 * Converts object of type java.util.Date to String by using dd/MM/yyyy format
 */
public class DateAdapter implements JsonDataAdapter<Date> {
    @Override
    public Object toJson(Date date) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("date",dateFormat.format(date));
        return jsonObject;
    }
}
