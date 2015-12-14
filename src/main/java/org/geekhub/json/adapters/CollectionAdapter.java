package org.geekhub.json.adapters;

import org.geekhub.json.JsonSerializer;
import org.json.JSONArray;
import org.json.JSONException;

import java.util.Collection;

/**
 * Converts all objects that extends java.util.Collections to JSONArray.
 */
public class CollectionAdapter implements JsonDataAdapter<Collection> {
    @Override
    public Object toJson(Collection c) throws JSONException{
        JSONArray jsonArray = new JSONArray();
        for(Object o:c){
            jsonArray.put(JsonSerializer.serialize(o));
        }
        return jsonArray;
    }
}
