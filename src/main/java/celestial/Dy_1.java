/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 */
package celestial;

import celestial.DS;
import celestial.rCF;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.List;
import java.util.function.Supplier;

public class Dy_1
implements Supplier<JsonElement> {
    private final List<DS> id_class;

    public Dy_1(List<DS> list) {
        this.id_class = list;
    }

    @Override
    public /* synthetic */ Object get() {
        return this.id_class();
    }

    public void id_class(rCF<?, ?> rCF2) {
    }

    public JsonElement id_class() {
        JsonObject jsonObject = new JsonObject();
        this.id_class(jsonObject);
        jsonObject.add("apply", DS.id_class(this.id_class));
        return jsonObject;
    }

    public void id_class(JsonObject jsonObject) {
    }
}

