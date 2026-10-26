/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonNull
 *  com.google.gson.JsonPrimitive
 *  com.google.gson.JsonSyntaxException
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 */
package celestial;

import celestial.an_3;
import celestial.rcH_2;
import celestial.rcZ_2;
import celestial.rcd_3;
import celestial.rco_3;
import celestial.rdn_3;
import celestial.rhd_3;
import celestial.rhz_3;
import celestial.rpY_2;
import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSyntaxException;
import com.mojang.brigadier.exceptions.CommandSyntaxException;

public class XC {
    public static final XC id_class = new XC(null);
    private final rcd_3 id_break;

    public XC(rcd_3 rcd_32) {
        this.id_break = rcd_32;
    }

    public JsonElement id_class() {
        return this != id_class && this.id_break != null ? new JsonPrimitive(this.id_break.toString()) : JsonNull.INSTANCE;
    }

    public static XC id_class(JsonElement jsonElement) {
        if (jsonElement != null && !jsonElement.isJsonNull()) {
            rcd_3 rcd_32;
            try {
                rcd_32 = rcH_2.id_class(rpY_2.id_class(jsonElement, "nbt"));
            }
            catch (CommandSyntaxException commandSyntaxException) {
                throw new JsonSyntaxException("Invalid nbt tag: " + commandSyntaxException.getMessage());
            }
            return new XC(rcd_32);
        }
        return id_class;
    }

    public boolean id_class(rdn_3 rdn_32) {
        return this == id_class ? true : this.id_class(rdn_32.id_package());
    }

    public boolean id_class(rcZ_2 rcZ_22) {
        if (rcZ_22 == null) {
            return this == id_class;
        }
        return this.id_break == null || rco_3.id_class(this.id_break, rcZ_22, true);
    }

    public boolean id_class(an_3 an_32) {
        return this == id_class ? true : this.id_class(XC.id_break(an_32));
    }

    public static rcd_3 id_break(an_3 an_32) {
        rdn_3 rdn_32;
        rcd_3 rcd_32 = an_32.id_case(new rcd_3());
        if (an_32 instanceof rhd_3 && !(rdn_32 = ((rhz_3)((rhd_3)an_32).id_implements[1]).id_byte()).id_class()) {
            rcd_32.id_class("SelectedItem", rdn_32.id_break(new rcd_3()));
        }
        return rcd_32;
    }
}

