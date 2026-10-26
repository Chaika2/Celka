/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 */
package celestial;

import celestial.DI;
import celestial.Df_1;
import celestial.rCF;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.List;
import java.util.function.Supplier;

public class DV
implements DI {
    private final Df_1 id_class;
    private final List<DI> id_break;

    public DV(Df_1 df_1, List<DI> list) {
        this.id_class = df_1;
        this.id_break = list;
    }

    @Override
    public /* synthetic */ Object get() {
        return this.id_break();
    }

    @Override
    public void id_class(rCF<?, ?> rCF2) {
        this.id_break.forEach(dI -> dI.id_class(rCF2));
    }

    public JsonElement id_break() {
        JsonArray jsonArray = new JsonArray();
        this.id_break.stream().map(Supplier::get).forEach(arg_0 -> ((JsonArray)jsonArray).add(arg_0));
        JsonObject jsonObject = new JsonObject();
        jsonObject.add(this.id_class.field_240094_c_, (JsonElement)jsonArray);
        return jsonObject;
    }
}

