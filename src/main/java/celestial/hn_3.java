/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonNull
 *  com.google.gson.JsonObject
 */
package celestial;

import celestial.hC_2;
import celestial.hY_2;
import celestial.rhN_2;
import celestial.rjU_2;
import celestial.rpY_2;
import celestial.rrEm_1;
import celestial.rye_3;
import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;

public class hn_3 {
    public static final hn_3 id_class = hC_2.id_class().id_break();
    private final Boolean id_break;
    private final Boolean id_byte;
    private final Boolean id_protected;
    private final Boolean id_throws;
    private final Boolean id_case;
    private final Boolean id_catch;
    private final Boolean id_private;
    private final Boolean id_implements;
    private final hY_2 id_finally;
    private final hY_2 id_extends;

    public hn_3(Boolean bl, Boolean bl2, Boolean bl3, Boolean bl4, Boolean bl5, Boolean bl6, Boolean bl7, Boolean bl8, hY_2 hY_22, hY_2 hY_23) {
        this.id_break = bl;
        this.id_byte = bl2;
        this.id_protected = bl3;
        this.id_throws = bl4;
        this.id_case = bl5;
        this.id_catch = bl6;
        this.id_private = bl7;
        this.id_implements = bl8;
        this.id_finally = hY_22;
        this.id_extends = hY_23;
    }

    private static Boolean id_class(JsonObject jsonObject, String string) {
        return jsonObject.has(string) ? Boolean.valueOf(rpY_2.id_private(jsonObject, string)) : null;
    }

    private void id_class(JsonObject jsonObject, String string, Boolean bl) {
        if (bl != null) {
            jsonObject.addProperty(string, bl);
        }
    }

    public JsonElement id_class() {
        if (this == id_class) {
            return JsonNull.INSTANCE;
        }
        JsonObject jsonObject = new JsonObject();
        this.id_class(jsonObject, "is_projectile", this.id_break);
        this.id_class(jsonObject, "is_explosion", this.id_byte);
        this.id_class(jsonObject, "bypasses_armor", this.id_protected);
        this.id_class(jsonObject, "bypasses_invulnerability", this.id_throws);
        this.id_class(jsonObject, "bypasses_magic", this.id_case);
        this.id_class(jsonObject, "is_fire", this.id_catch);
        this.id_class(jsonObject, "is_magic", this.id_private);
        this.id_class(jsonObject, "is_lightning", this.id_implements);
        jsonObject.add("direct_entity", this.id_finally.id_class());
        jsonObject.add("source_entity", this.id_extends.id_class());
        return jsonObject;
    }

    public boolean id_class(rhN_2 rhN_22, rye_3 rye_32) {
        return this.id_class(rhN_22.id_continue(), rhN_22.Ps(), rye_32);
    }

    public static hn_3 id_class(JsonElement jsonElement) {
        if (jsonElement != null && !jsonElement.isJsonNull()) {
            JsonObject jsonObject = rpY_2.id_private(jsonElement, "damage type");
            Boolean bl = hn_3.id_class(jsonObject, "is_projectile");
            Boolean bl2 = hn_3.id_class(jsonObject, "is_explosion");
            Boolean bl3 = hn_3.id_class(jsonObject, "bypasses_armor");
            Boolean bl4 = hn_3.id_class(jsonObject, "bypasses_invulnerability");
            Boolean bl5 = hn_3.id_class(jsonObject, "bypasses_magic");
            Boolean bl6 = hn_3.id_class(jsonObject, "is_fire");
            Boolean bl7 = hn_3.id_class(jsonObject, "is_magic");
            Boolean bl8 = hn_3.id_class(jsonObject, "is_lightning");
            hY_2 hY_22 = hY_2.id_class(jsonObject.get("direct_entity"));
            hY_2 hY_23 = hY_2.id_class(jsonObject.get("source_entity"));
            return new hn_3(bl, bl2, bl3, bl4, bl5, bl6, bl7, bl8, hY_22, hY_23);
        }
        return id_class;
    }

    public boolean id_class(rrEm_1 rrEm_12, rjU_2 rjU_22, rye_3 rye_32) {
        if (this == id_class) {
            return true;
        }
        if (this.id_break != null && this.id_break.booleanValue() != rye_32.id_break()) {
            return false;
        }
        if (this.id_byte != null && this.id_byte.booleanValue() != rye_32.id_protected()) {
            return false;
        }
        if (this.id_protected != null && this.id_protected.booleanValue() != rye_32.id_case()) {
            return false;
        }
        if (this.id_throws != null && this.id_throws.booleanValue() != rye_32.id_private()) {
            return false;
        }
        if (this.id_case != null && this.id_case.booleanValue() != rye_32.id_implements()) {
            return false;
        }
        if (this.id_catch != null && this.id_catch.booleanValue() != rye_32.id_int()) {
            return false;
        }
        if (this.id_private != null && this.id_private.booleanValue() != rye_32.id_this()) {
            return false;
        }
        if (this.id_implements != null && this.id_implements != (rye_32 == rye_3.id_break)) {
            return false;
        }
        if (!this.id_finally.id_class(rrEm_12, rjU_22, rye_32.id_finally())) {
            return false;
        }
        return this.id_extends.id_class(rrEm_12, rjU_22, rye_32.id_extends());
    }
}

