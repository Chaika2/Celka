/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParseException
 *  com.google.gson.JsonSyntaxException
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 */
package celestial;

import celestial.Oe_1;
import celestial.rVL;
import celestial.rVi_1;
import celestial.rcH_2;
import celestial.rcd_3;
import celestial.rdb_3;
import celestial.rdn_3;
import celestial.rgB_2;
import celestial.rgP_2;
import celestial.rpY_2;
import celestial.rqO_2;
import celestial.ruu_3;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSyntaxException;
import com.mojang.brigadier.exceptions.CommandSyntaxException;

public class OU {
    private final rgP_2 id_class;
    private final rgP_2 id_break;
    private final rdn_3 id_byte;
    private final rqO_2 id_protected;
    private final Oe_1 id_throws;
    private final boolean id_case;
    private final boolean id_catch;
    private final boolean id_private;
    private float id_implements;
    private float id_finally;

    public rdn_3 id_byte() {
        return this.id_byte;
    }

    public OU(rdn_3 rdn_32, rgP_2 rgP_22, rgP_2 rgP_23, rqO_2 rqO_22, Oe_1 oe_1, boolean bl, boolean bl2, boolean bl3) {
        this.id_class = rgP_22;
        this.id_break = rgP_23;
        this.id_byte = rdn_32;
        this.id_protected = rqO_22;
        this.id_throws = oe_1;
        this.id_case = bl;
        this.id_catch = bl2;
        this.id_private = bl3;
    }

    public static OU id_class(JsonObject jsonObject) {
        rVi_1 rVi_12 = rgB_2.id_class(jsonObject.get("title"));
        rVi_1 rVi_13 = rgB_2.id_class(jsonObject.get("description"));
        if (rVi_12 != null && rVi_13 != null) {
            rdn_3 rdn_32 = OU.id_break(rpY_2.id_native(jsonObject, "icon"));
            rqO_2 rqO_22 = jsonObject.has("background") ? new rqO_2(rpY_2.id_case(jsonObject, "background")) : null;
            Oe_1 oe_1 = jsonObject.has("frame") ? Oe_1.id_class(rpY_2.id_case(jsonObject, "frame")) : Oe_1.TASK;
            boolean bl = rpY_2.id_class(jsonObject, "show_toast", true);
            boolean bl2 = rpY_2.id_class(jsonObject, "announce_to_chat", true);
            boolean bl3 = rpY_2.id_class(jsonObject, "hidden", false);
            return new OU(rdn_32, rVi_12, rVi_13, rqO_22, oe_1, bl, bl2, bl3);
        }
        throw new JsonSyntaxException("Both title and description must be set");
    }

    public void id_class(float f, float f2) {
        this.id_implements = f;
        this.id_finally = f2;
    }

    public void id_class(ruu_3 ruu_32) {
        ruu_32.id_class(this.id_class);
        ruu_32.id_class(this.id_break);
        ruu_32.id_class(this.id_byte);
        ruu_32.id_class(this.id_throws);
        int n = 0;
        if (this.id_protected != null) {
            n |= 1;
        }
        if (this.id_case) {
            n |= 2;
        }
        if (this.id_private) {
            n |= 4;
        }
        ruu_32.writeInt(n);
        if (this.id_protected != null) {
            ruu_32.id_class(this.id_protected);
        }
        ruu_32.writeFloat(this.id_implements);
        ruu_32.writeFloat(this.id_finally);
    }

    public rgP_2 id_class() {
        return this.id_class;
    }

    public static OU id_break(ruu_3 ruu_32) {
        rgP_2 rgP_22 = ruu_32.id_throws();
        rgP_2 rgP_23 = ruu_32.id_throws();
        rdn_3 rdn_32 = ruu_32.id_extends();
        Oe_1 oe_1 = ruu_32.id_class(Oe_1.class);
        int n = ruu_32.readInt();
        rqO_2 rqO_22 = (n & 1) != 0 ? ruu_32.id_volatile() : null;
        boolean bl = (n & 2) != 0;
        boolean bl2 = (n & 4) != 0;
        OU oU = new OU(rdn_32, rgP_22, rgP_23, rqO_22, oe_1, bl, false, bl2);
        oU.id_class(ruu_32.readFloat(), ruu_32.readFloat());
        return oU;
    }

    private static rdn_3 id_break(JsonObject jsonObject) {
        if (!jsonObject.has("item")) {
            throw new JsonSyntaxException("Unsupported icon type, currently only items are supported (add 'item' key)");
        }
        rdb_3 rdb_32 = rpY_2.id_catch(jsonObject, "item");
        if (jsonObject.has("data")) {
            throw new JsonParseException("Disallowed data tag found");
        }
        rdn_3 rdn_32 = new rdn_3(rdb_32);
        if (jsonObject.has("nbt")) {
            try {
                rcd_3 rcd_32 = rcH_2.id_class(rpY_2.id_class(jsonObject.get("nbt"), "nbt"));
                rdn_32.id_byte(rcd_32);
            }
            catch (CommandSyntaxException commandSyntaxException) {
                throw new JsonSyntaxException("Invalid nbt tag: " + commandSyntaxException.getMessage());
            }
        }
        return rdn_32;
    }

    public rgP_2 id_break() {
        return this.id_break;
    }

    public Oe_1 id_throws() {
        return this.id_throws;
    }

    public boolean id_finally() {
        return this.id_private;
    }

    public float id_catch() {
        return this.id_finally;
    }

    public JsonElement id_extends() {
        JsonObject jsonObject = new JsonObject();
        jsonObject.add("icon", (JsonElement)this.id_native());
        jsonObject.add("title", rgB_2.id_break(this.id_class));
        jsonObject.add("description", rgB_2.id_break(this.id_break));
        jsonObject.addProperty("frame", this.id_throws.id_class());
        jsonObject.addProperty("show_toast", Boolean.valueOf(this.id_case));
        jsonObject.addProperty("announce_to_chat", Boolean.valueOf(this.id_catch));
        jsonObject.addProperty("hidden", Boolean.valueOf(this.id_private));
        if (this.id_protected != null) {
            jsonObject.addProperty("background", this.id_protected.toString());
        }
        return jsonObject;
    }

    public float id_case() {
        return this.id_implements;
    }

    public boolean id_implements() {
        return this.id_catch;
    }

    public rqO_2 id_protected() {
        return this.id_protected;
    }

    public boolean id_private() {
        return this.id_case;
    }

    private JsonObject id_native() {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("item", rVL.id_for.id_break(this.id_byte.id_break()).toString());
        if (this.id_byte.id_final()) {
            jsonObject.addProperty("nbt", this.id_byte.id_package().toString());
        }
        return jsonObject;
    }
}

