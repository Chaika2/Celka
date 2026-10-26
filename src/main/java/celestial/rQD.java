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
import celestial.rqO_2;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import java.util.Random;

public final class rQD
implements rQo_1 {
    public static final rqO_2 id_class = new rqO_2("ore_drops");

    public static rQo_1 id_class(JsonObject jsonObject, JsonDeserializationContext jsonDeserializationContext) {
        return new rQD();
    }

    @Override
    public rqO_2 id_class() {
        return id_class;
    }

    @Override
    public int id_class(Random random, int n, int n2) {
        if (n2 > 0) {
            int n3 = random.nextInt(n2 + 2) - 1;
            if (n3 < 0) {
                n3 = 0;
            }
            return n * (n3 + 1);
        }
        return n;
    }

    @Override
    public void id_class(JsonObject jsonObject, JsonSerializationContext jsonSerializationContext) {
    }
}

