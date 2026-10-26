/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonDeserializationContext
 *  com.google.gson.JsonDeserializer
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParseException
 */
package celestial;

import celestial.IG;
import celestial.rpY_2;
import celestial.rpr_3;
import celestial.wD_2;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;

public class Ib_1
implements JsonDeserializer<IG> {
    private rpr_3 id_byte(JsonObject jsonObject) {
        String string = rpY_2.id_class(jsonObject, "cullface", "");
        return rpr_3.id_class(string);
    }

    protected Ib_1() {
    }

    public IG id_class(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        JsonObject jsonObject = jsonElement.getAsJsonObject();
        rpr_3 rpr_32 = this.id_byte(jsonObject);
        int n = this.id_class(jsonObject);
        String string = this.id_break(jsonObject);
        wD_2 wD_22 = (wD_2)jsonDeserializationContext.deserialize((JsonElement)jsonObject, wD_2.class);
        return new IG(rpr_32, n, string, wD_22);
    }

    protected int id_class(JsonObject jsonObject) {
        return rpY_2.id_class(jsonObject, "tintindex", -1);
    }

    private String id_break(JsonObject jsonObject) {
        return rpY_2.id_case(jsonObject, "texture");
    }

    public /* synthetic */ Object deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        return this.id_class(jsonElement, type, jsonDeserializationContext);
    }
}

