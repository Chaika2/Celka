/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  it.unimi.dsi.fastutil.objects.Object2BooleanMap
 *  it.unimi.dsi.fastutil.objects.Object2BooleanMap$Entry
 */
package celestial;

import celestial.OD;
import celestial.Oj_1;
import celestial.XY;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import it.unimi.dsi.fastutil.objects.Object2BooleanMap;

public class Xg_1
implements XY {
    private final Object2BooleanMap<String> id_class;

    public Xg_1(Object2BooleanMap<String> object2BooleanMap) {
        this.id_class = object2BooleanMap;
    }

    @Override
    public /* synthetic */ boolean test(Object object) {
        return this.id_class((Oj_1)object);
    }

    @Override
    public JsonElement id_class() {
        JsonObject jsonObject = new JsonObject();
        this.id_class.forEach((arg_0, arg_1) -> ((JsonObject)jsonObject).addProperty(arg_0, arg_1));
        return jsonObject;
    }

    public boolean id_class(Oj_1 oj_1) {
        for (Object2BooleanMap.Entry entry : this.id_class.object2BooleanEntrySet()) {
            OD oD = oj_1.id_byte((String)entry.getKey());
            if (oD != null && oD.id_class() == entry.getBooleanValue()) continue;
            return false;
        }
        return true;
    }
}

