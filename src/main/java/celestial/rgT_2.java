/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 */
package celestial;

import celestial.rVL;
import celestial.rcH_2;
import celestial.rcd_3;
import celestial.rdb_3;
import celestial.rdn_3;
import celestial.rgP_2;
import celestial.rgy_3;
import celestial.rpY_2;
import celestial.rqO_2;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Objects;

public class rgT_2 {
    private final rdb_3 id_class;
    private final int id_break;
    private final rcd_3 id_byte;
    private rdn_3 id_protected;

    public rgT_2(rdb_3 rdb_32, int n, rcd_3 rcd_32) {
        this.id_class = rdb_32;
        this.id_break = n;
        this.id_byte = rcd_32;
    }

    public rgT_2(rdn_3 rdn_32) {
        this(rdn_32.id_break(), rdn_32.id_char(), rdn_32.id_package() != null ? rdn_32.id_package().id_catch() : null);
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null && this.getClass() == object.getClass()) {
            rgT_2 rgT_22 = (rgT_2)object;
            return this.id_break == rgT_22.id_break && this.id_class.equals(rgT_22.id_class) && Objects.equals(this.id_byte, rgT_22.id_byte);
        }
        return false;
    }

    public int hashCode() {
        int n = this.id_class.hashCode();
        n = 31 * n + this.id_break;
        return 31 * n + (this.id_byte != null ? this.id_byte.hashCode() : 0);
    }

    public static rgT_2 id_class(rgP_2 rgP_22) {
        try {
            rcd_3 rcd_32 = rcH_2.id_class(rgP_22.getString());
            return new rgT_2(rdn_3.id_class(rcd_32));
        }
        catch (CommandSyntaxException commandSyntaxException) {
            rgy_3.id_class.warn("Failed to parse item tag: {}", (Object)rgP_22, (Object)commandSyntaxException);
            return null;
        }
    }

    public static rgT_2 id_class(JsonElement jsonElement) {
        if (jsonElement.isJsonPrimitive()) {
            return new rgT_2(rVL.id_for.id_class(new rqO_2(jsonElement.getAsString())), 1, null);
        }
        JsonObject jsonObject = rpY_2.id_private(jsonElement, "item");
        rdb_3 rdb_32 = rVL.id_for.id_class(new rqO_2(rpY_2.id_case(jsonObject, "id")));
        int n = rpY_2.id_class(jsonObject, "count", 1);
        if (jsonObject.has("tag")) {
            String string = rpY_2.id_case(jsonObject, "tag");
            try {
                rcd_3 rcd_32 = rcH_2.id_class(string);
                return new rgT_2(rdb_32, n, rcd_32);
            }
            catch (CommandSyntaxException commandSyntaxException) {
                rgy_3.id_class.warn("Failed to parse tag: {}", (Object)string, (Object)commandSyntaxException);
            }
        }
        return new rgT_2(rdb_32, n, null);
    }

    public rdn_3 id_class() {
        if (this.id_protected == null) {
            this.id_protected = new rdn_3(this.id_class, this.id_break);
            if (this.id_byte != null) {
                this.id_protected.id_byte(this.id_byte);
            }
        }
        return this.id_protected;
    }

    public JsonElement id_break() {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("id", rVL.id_for.id_break(this.id_class).toString());
        if (this.id_break != 1) {
            jsonObject.addProperty("count", (Number)this.id_break);
        }
        if (this.id_byte != null) {
            jsonObject.addProperty("tag", this.id_byte.toString());
        }
        return jsonObject;
    }
}

