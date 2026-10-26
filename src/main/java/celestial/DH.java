/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 */
package celestial;

import celestial.DI;
import celestial.DS;
import celestial.Dy_1;
import celestial.rCF;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.List;

public class DH
extends Dy_1 {
    private final DI id_class;

    public DH(DI dI, List<DS> list) {
        super(list);
        this.id_class = dI;
    }

    @Override
    public void id_class(rCF<?, ?> rCF2) {
        this.id_class.id_class(rCF2);
    }

    @Override
    public void id_class(JsonObject jsonObject) {
        jsonObject.add("when", (JsonElement)this.id_class.get());
    }
}

