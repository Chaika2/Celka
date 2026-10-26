/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonNull
 *  com.google.gson.JsonObject
 */
package celestial;

import celestial.Xm_1;
import celestial.rfU_2;
import celestial.rpY_2;
import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;

public class hl_3 {
    public static final hl_3 id_class = new hl_3(Xm_1.id_throws, Xm_1.id_throws, Xm_1.id_throws, Xm_1.id_throws, Xm_1.id_throws);
    private final Xm_1 id_break;
    private final Xm_1 id_byte;
    private final Xm_1 id_protected;
    private final Xm_1 id_throws;
    private final Xm_1 id_case;

    public hl_3(Xm_1 xm_1, Xm_1 xm_12, Xm_1 xm_13, Xm_1 xm_14, Xm_1 xm_15) {
        this.id_break = xm_1;
        this.id_byte = xm_12;
        this.id_protected = xm_13;
        this.id_throws = xm_14;
        this.id_case = xm_15;
    }

    public JsonElement id_class() {
        if (this == id_class) {
            return JsonNull.INSTANCE;
        }
        JsonObject jsonObject = new JsonObject();
        jsonObject.add("x", this.id_break.id_protected());
        jsonObject.add("y", this.id_byte.id_protected());
        jsonObject.add("z", this.id_protected.id_protected());
        jsonObject.add("horizontal", this.id_throws.id_protected());
        jsonObject.add("absolute", this.id_case.id_protected());
        return jsonObject;
    }

    public boolean id_class(double d, double d2, double d3, double d4, double d5, double d6) {
        float f = (float)(d - d4);
        float f2 = (float)(d2 - d5);
        float f3 = (float)(d3 - d6);
        if (this.id_break.id_break(rfU_2.id_throws(f)) && this.id_byte.id_break(rfU_2.id_throws(f2)) && this.id_protected.id_break(rfU_2.id_throws(f3))) {
            if (!this.id_throws.id_class(f * f + f3 * f3)) {
                return false;
            }
            return this.id_case.id_class(f * f + f2 * f2 + f3 * f3);
        }
        return false;
    }

    public static hl_3 id_class(Xm_1 xm_1) {
        return new hl_3(Xm_1.id_throws, Xm_1.id_throws, Xm_1.id_throws, xm_1, Xm_1.id_throws);
    }

    public static hl_3 id_class(JsonElement jsonElement) {
        if (jsonElement != null && !jsonElement.isJsonNull()) {
            JsonObject jsonObject = rpY_2.id_private(jsonElement, "distance");
            Xm_1 xm_1 = Xm_1.id_class(jsonObject.get("x"));
            Xm_1 xm_12 = Xm_1.id_class(jsonObject.get("y"));
            Xm_1 xm_13 = Xm_1.id_class(jsonObject.get("z"));
            Xm_1 xm_14 = Xm_1.id_class(jsonObject.get("horizontal"));
            Xm_1 xm_15 = Xm_1.id_class(jsonObject.get("absolute"));
            return new hl_3(xm_1, xm_12, xm_13, xm_14, xm_15);
        }
        return id_class;
    }

    public static hl_3 id_break(Xm_1 xm_1) {
        return new hl_3(Xm_1.id_throws, xm_1, Xm_1.id_throws, Xm_1.id_throws, Xm_1.id_throws);
    }
}

