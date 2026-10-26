/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonDeserializationContext
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonSerializationContext
 */
package celestial;

import celestial.rNN;
import celestial.rQz_1;
import celestial.rpY_2;
import celestial.rrGh_1;
import celestial.rrrZ;
import celestial.rzO_2;
import celestial.rzX_2;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import java.util.Locale;

public class rNu_1
extends rzX_2<rNN> {
    @Override
    public /* synthetic */ rzO_2 id_class(JsonObject jsonObject, JsonDeserializationContext jsonDeserializationContext, rQz_1[] rQz_1Array) {
        return this.id_break(jsonObject, jsonDeserializationContext, rQz_1Array);
    }

    private static rrrZ<?> id_class(JsonObject jsonObject) {
        String string;
        rrrZ rrrZ2;
        if (jsonObject.has("destination") && (rrrZ2 = (rrrZ)rrrZ.id_class.get((Object)(string = rpY_2.id_case(jsonObject, "destination")).toLowerCase(Locale.ROOT))) != null) {
            return rrrZ2;
        }
        return rNN.id_break;
    }

    @Override
    public void id_class(JsonObject jsonObject, rNN rNN2, JsonSerializationContext jsonSerializationContext) {
        super.id_class(jsonObject, rNN2, jsonSerializationContext);
        if (!rNN2.id_throws.equals(rNN.id_break)) {
            jsonObject.add("destination", jsonSerializationContext.serialize((Object)rNN2.id_throws.id_catch()));
        }
        if (rNN2.id_case != rNN.id_byte) {
            jsonObject.add("decoration", jsonSerializationContext.serialize((Object)rNN2.id_case.toString().toLowerCase(Locale.ROOT)));
        }
        if (rNN2.id_catch != 2) {
            jsonObject.addProperty("zoom", (Number)rNN2.id_catch);
        }
        if (rNN2.id_private != 50) {
            jsonObject.addProperty("search_radius", (Number)rNN2.id_private);
        }
        if (!rNN2.id_implements) {
            jsonObject.addProperty("skip_existing_chunks", Boolean.valueOf(rNN2.id_implements));
        }
    }

    public rNN id_break(JsonObject jsonObject, JsonDeserializationContext jsonDeserializationContext, rQz_1[] rQz_1Array) {
        rrrZ<?> rrrZ2 = rNu_1.id_class(jsonObject);
        String string = jsonObject.has("decoration") ? rpY_2.id_case(jsonObject, "decoration") : "mansion";
        rrGh_1 rrGh_12 = rNN.id_byte;
        try {
            rrGh_12 = rrGh_1.valueOf(string.toUpperCase(Locale.ROOT));
        }
        catch (IllegalArgumentException illegalArgumentException) {
            rNN.id_protected.error("Error while parsing loot table decoration entry. Found {}. Defaulting to " + rNN.id_byte, (Object)string);
        }
        byte by = rpY_2.id_class(jsonObject, "zoom", (byte)2);
        int n = rpY_2.id_class(jsonObject, "search_radius", 50);
        boolean bl = rpY_2.id_class(jsonObject, "skip_existing_chunks", true);
        return new rNN(rQz_1Array, rrrZ2, rrGh_12, by, n, bl);
    }
}

