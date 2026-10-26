/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonNull
 *  com.google.gson.JsonObject
 */
package celestial;

import celestial.XF;
import celestial.rfH_2;
import celestial.rpY_2;
import celestial.rrEm_1;
import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;

public class XQ {
    public static final XQ id_class = new XQ(XF.id_throws);
    private final XF id_break;

    private XQ(XF xF) {
        this.id_break = xF;
    }

    public boolean id_class(rrEm_1 rrEm_12, rfH_2 rfH_22) {
        if (this == id_class) {
            return true;
        }
        if (!rrEm_12.id_synchronized(rfH_22)) {
            return false;
        }
        return this.id_break.id_byte(rrEm_12.id_package(rfH_22));
    }

    public static XQ id_class(JsonElement jsonElement) {
        if (jsonElement != null && !jsonElement.isJsonNull()) {
            JsonObject jsonObject = rpY_2.id_private(jsonElement, "light");
            XF xF = XF.id_class(jsonObject.get("light"));
            return new XQ(xF);
        }
        return id_class;
    }

    public JsonElement id_class() {
        if (this == id_class) {
            return JsonNull.INSTANCE;
        }
        JsonObject jsonObject = new JsonObject();
        jsonObject.add("light", this.id_break.id_protected());
        return jsonObject;
    }
}

