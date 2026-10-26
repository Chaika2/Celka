/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package celestial;

import celestial.rVi_1;
import celestial.rgB_2;
import celestial.rgp_3;
import celestial.rpY_2;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.Objects;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class rgy_3 {
    public static final Logger id_class = LogManager.getLogger();
    private final rgp_3<?> id_break;
    private final Object id_byte;

    public JsonObject id_byte() {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("action", this.id_break.id_break());
        jsonObject.add("contents", this.id_break.id_class(this.id_byte));
        return jsonObject;
    }

    public <T> rgy_3(rgp_3<T> rgp_32, T t) {
        this.id_break = rgp_32;
        this.id_byte = t;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null && this.getClass() == object.getClass()) {
            rgy_3 rgy_32 = (rgy_3)object;
            return this.id_break == rgy_32.id_break && Objects.equals(this.id_byte, rgy_32.id_byte);
        }
        return false;
    }

    public String toString() {
        return "HoverEvent{action=" + this.id_break + ", value='" + this.id_byte + "'}";
    }

    public int hashCode() {
        int n = this.id_break.hashCode();
        return 31 * n + (this.id_byte != null ? this.id_byte.hashCode() : 0);
    }

    public <T> T id_class(rgp_3<T> rgp_32) {
        return this.id_break == rgp_32 ? (T)rgp_32.id_break(this.id_byte) : null;
    }

    public static rgy_3 id_class(JsonObject jsonObject) {
        String string = rpY_2.id_class(jsonObject, "action", (String)null);
        if (string == null) {
            return null;
        }
        rgp_3 rgp_32 = rgp_3.id_class(string);
        if (rgp_32 == null) {
            return null;
        }
        JsonElement jsonElement = jsonObject.get("contents");
        if (jsonElement != null) {
            return rgp_32.id_class(jsonElement);
        }
        rVi_1 rVi_12 = rgB_2.id_class(jsonObject.get("value"));
        return rVi_12 != null ? rgp_32.id_class(rVi_12) : null;
    }

    public rgp_3<?> id_class() {
        return this.id_break;
    }

    public Object id_break() {
        return this.id_byte;
    }
}

