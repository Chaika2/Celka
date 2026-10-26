/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonSyntaxException
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 */
package celestial;

import celestial.aI_2;
import celestial.rVL;
import celestial.rVi_1;
import celestial.rcH_2;
import celestial.rcd_3;
import celestial.rgB_2;
import celestial.rgN_2;
import celestial.rgP_2;
import celestial.rgn_3;
import celestial.rpY_2;
import celestial.rqO_2;
import com.google.common.collect.Lists;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSyntaxException;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

public class rgq_3 {
    public final aI_2<?> id_class;
    public final UUID id_break;
    public final rgP_2 id_byte;
    private List<rgP_2> id_protected;

    public rgq_3(aI_2<?> aI_22, UUID uUID, rgP_2 rgP_22) {
        this.id_class = aI_22;
        this.id_break = uUID;
        this.id_byte = rgP_22;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null && this.getClass() == object.getClass()) {
            rgq_3 rgq_32 = (rgq_3)object;
            return this.id_class.equals(rgq_32.id_class) && this.id_break.equals(rgq_32.id_break) && Objects.equals(this.id_byte, rgq_32.id_byte);
        }
        return false;
    }

    public int hashCode() {
        int n = this.id_class.hashCode();
        n = 31 * n + this.id_break.hashCode();
        return 31 * n + (this.id_byte != null ? this.id_byte.hashCode() : 0);
    }

    public JsonElement id_class() {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("type", rVL.id_transient.id_break(this.id_class).toString());
        jsonObject.addProperty("id", this.id_break.toString());
        if (this.id_byte != null) {
            jsonObject.add("name", rgB_2.id_break(this.id_byte));
        }
        return jsonObject;
    }

    public static rgq_3 id_class(JsonElement jsonElement) {
        if (!jsonElement.isJsonObject()) {
            return null;
        }
        JsonObject jsonObject = jsonElement.getAsJsonObject();
        aI_2<?> aI_22 = rVL.id_transient.id_class(new rqO_2(rpY_2.id_case(jsonObject, "type")));
        UUID uUID = UUID.fromString(rpY_2.id_case(jsonObject, "id"));
        rVi_1 rVi_12 = rgB_2.id_class(jsonObject.get("name"));
        return new rgq_3(aI_22, uUID, rVi_12);
    }

    public static rgq_3 id_class(rgP_2 rgP_22) {
        try {
            rcd_3 rcd_32 = rcH_2.id_class(rgP_22.getString());
            rVi_1 rVi_12 = rgB_2.id_class(rcd_32.id_native("name"));
            aI_2<?> aI_22 = rVL.id_transient.id_class(new rqO_2(rcd_32.id_native("type")));
            UUID uUID = UUID.fromString(rcd_32.id_native("id"));
            return new rgq_3(aI_22, uUID, rVi_12);
        }
        catch (JsonSyntaxException | CommandSyntaxException throwable) {
            return null;
        }
    }

    public List<rgP_2> id_break() {
        if (this.id_protected == null) {
            this.id_protected = Lists.newArrayList();
            if (this.id_byte != null) {
                this.id_protected.add(this.id_byte);
            }
            this.id_protected.add(new rgn_3("gui.entity_tooltip.type", this.id_class.id_implements()));
            this.id_protected.add(new rgN_2(this.id_break.toString()));
        }
        return this.id_protected;
    }
}

