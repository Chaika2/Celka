/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  celestial.DP$celestial.DB
 *  com.google.common.collect.Maps
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 */
package celestial;

import celestial.DB;
import celestial.DP;
import com.google.common.collect.Maps;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.List;
import java.util.Map;
import java.util.function.Supplier;

public class DS
implements Supplier<JsonElement> {
    private final Map<DP<?>, DP.DB> id_class = Maps.newLinkedHashMap();

    @Override
    public /* synthetic */ Object get() {
        return this.id_break();
    }

    public static JsonElement id_class(List<DS> list) {
        if (list.size() == 1) {
            return list.get(0).id_break();
        }
        JsonArray jsonArray = new JsonArray();
        list.forEach(dS -> jsonArray.add(dS.id_break()));
        return jsonArray;
    }

    public <T> DS id_class(DP<T> dP, T t) {
        DB dB = (DB)this.id_class.put(dP, (DP.DB)dP.id_class(t));
        if (dB != null) {
            throw new IllegalStateException("Replacing value of " + dB + " with " + t);
        }
        return this;
    }

    public static DS id_class() {
        return new DS();
    }

    public static DS id_class(DS dS, DS dS2) {
        DS dS3 = new DS();
        dS3.id_class.putAll(dS.id_class);
        dS3.id_class.putAll(dS2.id_class);
        return dS3;
    }

    public JsonElement id_break() {
        JsonObject jsonObject = new JsonObject();
        this.id_class.values().forEach(dB -> dB.id_class(jsonObject));
        return jsonObject;
    }
}

