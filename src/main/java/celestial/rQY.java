/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonDeserializationContext
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonSerializationContext
 */
package celestial;

import celestial.rQo_1;
import celestial.rpY_2;
import celestial.rqO_2;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import java.util.Random;

public final class rQY
implements rQo_1 {
    public static final rqO_2 id_class = new rqO_2("binomial_with_bonus_count");
    private final int id_break;
    private final float id_byte;

    public rQY(int n, float f) {
        this.id_break = n;
        this.id_byte = f;
    }

    public static rQo_1 id_class(JsonObject jsonObject, JsonDeserializationContext jsonDeserializationContext) {
        int n = rpY_2.id_extends(jsonObject, "extra");
        float f = rpY_2.id_implements(jsonObject, "probability");
        return new rQY(n, f);
    }

    @Override
    public rqO_2 id_class() {
        return id_class;
    }

    @Override
    public int id_class(Random random, int n, int n2) {
        for (int i = 0; i < n2 + this.id_break; ++i) {
            if (!(random.nextFloat() < this.id_byte)) continue;
            ++n;
        }
        return n;
    }

    @Override
    public void id_class(JsonObject jsonObject, JsonSerializationContext jsonSerializationContext) {
        jsonObject.addProperty("extra", (Number)this.id_break);
        jsonObject.addProperty("probability", (Number)Float.valueOf(this.id_byte));
    }
}

