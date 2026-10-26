/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParseException
 */
package celestial;

import celestial.rAK;
import celestial.rAo_1;
import celestial.rVi_1;
import celestial.rgB_2;
import celestial.rpY_2;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;

public class rAD
implements rAo_1<rAK> {
    @Override
    public String id_class() {
        return "pack";
    }

    public rAK id_class(JsonObject jsonObject) {
        rVi_1 rVi_12 = rgB_2.id_class(jsonObject.get("description"));
        if (rVi_12 == null) {
            throw new JsonParseException("Invalid/missing description!");
        }
        int n = rpY_2.id_extends(jsonObject, "pack_format");
        return new rAK(rVi_12, n);
    }

    @Override
    public /* synthetic */ Object id_break(JsonObject jsonObject) {
        return this.id_class(jsonObject);
    }
}

