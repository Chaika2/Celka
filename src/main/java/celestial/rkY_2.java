/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 */
package celestial;

import celestial.rVL;
import celestial.rdn_3;
import celestial.rkR_2;
import com.google.gson.JsonObject;
import java.util.Collection;
import java.util.Collections;

public class rkY_2
implements rkR_2 {
    private final rdn_3 id_class;

    public rkY_2(rdn_3 rdn_32) {
        this.id_class = rdn_32;
    }

    @Override
    public Collection<rdn_3> id_class() {
        return Collections.singleton(this.id_class);
    }

    @Override
    public JsonObject id_break() {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("item", rVL.id_for.id_break(this.id_class.id_break()).toString());
        return jsonObject;
    }
}

