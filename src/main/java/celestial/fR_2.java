/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 */
package celestial;

import celestial.VG;
import celestial.Vb_1;
import celestial.rAo_1;
import celestial.rpY_2;
import com.google.gson.JsonObject;

public class fR_2
implements rAo_1<VG> {
    @Override
    public String id_class() {
        return "villager";
    }

    public VG id_class(JsonObject jsonObject) {
        return new VG(Vb_1.id_class(rpY_2.id_class(jsonObject, "hat", "none")));
    }

    @Override
    public /* synthetic */ Object id_break(JsonObject jsonObject) {
        return this.id_class(jsonObject);
    }
}

