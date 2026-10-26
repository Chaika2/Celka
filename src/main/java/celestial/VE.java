/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 */
package celestial;

import celestial.Vs_1;
import celestial.rAo_1;
import celestial.rpY_2;
import com.google.gson.JsonObject;

public class VE
implements rAo_1<Vs_1> {
    @Override
    public String id_class() {
        return "texture";
    }

    public Vs_1 id_class(JsonObject jsonObject) {
        boolean bl = rpY_2.id_class(jsonObject, "blur", false);
        boolean bl2 = rpY_2.id_class(jsonObject, "clamp", false);
        return new Vs_1(bl, bl2);
    }

    @Override
    public /* synthetic */ Object id_break(JsonObject jsonObject) {
        return this.id_class(jsonObject);
    }
}

