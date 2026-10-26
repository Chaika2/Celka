/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonPrimitive
 */
package celestial;

import celestial.aI_2;
import celestial.hD_2;
import celestial.rVL;
import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;

public class ha_3
extends hD_2 {
    private final aI_2<?> id_break;

    public ha_3(aI_2<?> aI_22) {
        this.id_break = aI_22;
    }

    @Override
    public boolean id_class(aI_2<?> aI_22) {
        return this.id_break == aI_22;
    }

    @Override
    public JsonElement id_class() {
        return new JsonPrimitive(rVL.id_transient.id_break(this.id_break).toString());
    }
}

