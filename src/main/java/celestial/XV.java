/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonPrimitive
 */
package celestial;

import celestial.Oj_1;
import celestial.XY;
import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;

public class XV
implements XY {
    private final boolean id_class;

    public XV(boolean bl) {
        this.id_class = bl;
    }

    @Override
    public /* synthetic */ boolean test(Object object) {
        return this.id_class((Oj_1)object);
    }

    @Override
    public JsonElement id_class() {
        return new JsonPrimitive(Boolean.valueOf(this.id_class));
    }

    public boolean id_class(Oj_1 oj_1) {
        return oj_1.id_class() == this.id_class;
    }
}

