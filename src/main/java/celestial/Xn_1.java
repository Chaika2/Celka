/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 */
package celestial;

import celestial.XF;
import celestial.rLY;
import celestial.rpY_2;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

public class Xn_1 {
    private final XF id_class;
    private final XF id_break;
    private final Boolean id_byte;
    private final Boolean id_protected;

    public Xn_1(XF xF, XF xF2, Boolean bl, Boolean bl2) {
        this.id_class = xF;
        this.id_break = xF2;
        this.id_byte = bl;
        this.id_protected = bl2;
    }

    public Xn_1() {
        this(XF.id_throws, XF.id_throws, null, null);
    }

    public JsonElement id_class() {
        JsonObject jsonObject = new JsonObject();
        jsonObject.add("amplifier", this.id_class.id_protected());
        jsonObject.add("duration", this.id_break.id_protected());
        jsonObject.addProperty("ambient", this.id_byte);
        jsonObject.addProperty("visible", this.id_protected);
        return jsonObject;
    }

    public static Xn_1 id_class(JsonObject jsonObject) {
        XF xF = XF.id_class(jsonObject.get("amplifier"));
        XF xF2 = XF.id_class(jsonObject.get("duration"));
        Boolean bl = jsonObject.has("ambient") ? Boolean.valueOf(rpY_2.id_private(jsonObject, "ambient")) : null;
        Boolean bl2 = jsonObject.has("visible") ? Boolean.valueOf(rpY_2.id_private(jsonObject, "visible")) : null;
        return new Xn_1(xF, xF2, bl, bl2);
    }

    public boolean id_class(rLY rLY2) {
        if (rLY2 == null) {
            return false;
        }
        if (!this.id_class.id_byte(rLY2.id_byte())) {
            return false;
        }
        if (!this.id_break.id_byte(rLY2.id_break())) {
            return false;
        }
        if (this.id_byte != null && this.id_byte.booleanValue() != rLY2.id_protected()) {
            return false;
        }
        return this.id_protected == null || this.id_protected.booleanValue() == rLY2.id_throws();
    }
}

