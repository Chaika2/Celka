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

public final class rQe_1
implements rQo_1 {
    public static final rqO_2 id_class = new rqO_2("uniform_bonus_count");
    private final int id_break;

    public rQe_1(int n) {
        this.id_break = n;
    }

    public static rQo_1 id_class(JsonObject jsonObject, JsonDeserializationContext jsonDeserializationContext) {
        int n = rpY_2.id_extends(jsonObject, "bonusMultiplier");
        return new rQe_1(n);
    }

    @Override
    public rqO_2 id_class() {
        return id_class;
    }

    @Override
    public int id_class(Random random, int n, int n2) {
        return n + random.nextInt(this.id_break * n2 + 1);
    }

    @Override
    public void id_class(JsonObject jsonObject, JsonSerializationContext jsonSerializationContext) {
        jsonObject.addProperty("bonusMultiplier", (Number)this.id_break);
    }
}

