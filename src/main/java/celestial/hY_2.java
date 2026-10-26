/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonNull
 *  com.google.gson.JsonObject
 */
package celestial;

import celestial.XA;
import celestial.XC;
import celestial.XN;
import celestial.Xj_1;
import celestial.an_3;
import celestial.hD_2;
import celestial.hI_2;
import celestial.hK_2;
import celestial.hj_3;
import celestial.hl_3;
import celestial.is_3;
import celestial.rWI;
import celestial.rbf_3;
import celestial.rhN_2;
import celestial.rjU_2;
import celestial.rnM_2;
import celestial.rpY_2;
import celestial.rqO_2;
import celestial.rrEm_1;
import celestial.rzP_2;
import celestial.rzQ_2;
import celestial.rzr_3;
import celestial.rzz_3;
import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;

public class hY_2 {
    public static final hY_2 id_class = new hY_2(hD_2.id_class, hl_3.id_class, XN.id_class, XA.id_class, XC.id_class, hj_3.id_class, hI_2.id_class, Xj_1.id_class, rWI.id_class, null, null);
    private final hD_2 id_break;
    private final hl_3 id_byte;
    private final XN id_protected;
    private final XA id_throws;
    private final XC id_case;
    private final hj_3 id_catch;
    private final hI_2 id_private;
    private final Xj_1 id_implements;
    private final rWI id_finally;
    private final hY_2 id_extends;
    private final hY_2 id_native;
    private final String id_volatile;
    private final rqO_2 id_final;

    private hY_2(hD_2 hD_22, hl_3 hl_32, XN xN, XA xA, XC xC, hj_3 hj_32, hI_2 hI_22, Xj_1 xj_1, rWI rWI2, String string, rqO_2 rqO_22) {
        this.id_break = hD_22;
        this.id_byte = hl_32;
        this.id_protected = xN;
        this.id_throws = xA;
        this.id_case = xC;
        this.id_catch = hj_32;
        this.id_private = hI_22;
        this.id_implements = xj_1;
        this.id_finally = rWI2;
        this.id_extends = this;
        this.id_native = this;
        this.id_volatile = string;
        this.id_final = rqO_22;
    }

    public hY_2(hD_2 hD_22, hl_3 hl_32, XN xN, XA xA, XC xC, hj_3 hj_32, hI_2 hI_22, Xj_1 xj_1, rWI rWI2, hY_2 hY_22, hY_2 hY_23, String string, rqO_2 rqO_22) {
        this.id_break = hD_22;
        this.id_byte = hl_32;
        this.id_protected = xN;
        this.id_throws = xA;
        this.id_case = xC;
        this.id_catch = hj_32;
        this.id_private = hI_22;
        this.id_implements = xj_1;
        this.id_finally = rWI2;
        this.id_extends = hY_22;
        this.id_native = hY_23;
        this.id_volatile = string;
        this.id_final = rqO_22;
    }

    public static hY_2 id_class(JsonElement jsonElement) {
        if (jsonElement != null && !jsonElement.isJsonNull()) {
            JsonObject jsonObject = rpY_2.id_private(jsonElement, "entity");
            hD_2 hD_22 = hD_2.id_class(jsonObject.get("type"));
            hl_3 hl_32 = hl_3.id_class(jsonObject.get("distance"));
            XN xN = XN.id_class(jsonObject.get("location"));
            XA xA = XA.id_class(jsonObject.get("effects"));
            XC xC = XC.id_class(jsonObject.get("nbt"));
            hj_3 hj_32 = hj_3.id_class(jsonObject.get("flags"));
            hI_2 hI_22 = hI_2.id_class(jsonObject.get("equipment"));
            Xj_1 xj_1 = Xj_1.id_class(jsonObject.get("player"));
            rWI rWI2 = rWI.id_class(jsonObject.get("fishing_hook"));
            hY_2 hY_22 = hY_2.id_class(jsonObject.get("vehicle"));
            hY_2 hY_23 = hY_2.id_class(jsonObject.get("targeted_entity"));
            String string = rpY_2.id_class(jsonObject, "team", (String)null);
            rqO_2 rqO_22 = jsonObject.has("catType") ? new rqO_2(rpY_2.id_case(jsonObject, "catType")) : null;
            return new hK_2().id_class(hD_22).id_class(hl_32).id_class(xN).id_class(xA).id_class(xC).id_class(hj_32).id_class(hI_22).id_class(xj_1).id_class(rWI2).id_class(string).id_class(hY_22).id_break(hY_23).id_break(rqO_22).id_break();
        }
        return id_class;
    }

    public JsonElement id_class() {
        if (this == id_class) {
            return JsonNull.INSTANCE;
        }
        JsonObject jsonObject = new JsonObject();
        jsonObject.add("type", this.id_break.id_class());
        jsonObject.add("distance", this.id_byte.id_class());
        jsonObject.add("location", this.id_protected.id_class());
        jsonObject.add("effects", this.id_throws.id_break());
        jsonObject.add("nbt", this.id_case.id_class());
        jsonObject.add("flags", this.id_catch.id_class());
        jsonObject.add("equipment", this.id_private.id_class());
        jsonObject.add("player", this.id_implements.id_class());
        jsonObject.add("fishing_hook", this.id_finally.id_class());
        jsonObject.add("vehicle", this.id_extends.id_class());
        jsonObject.add("targeted_entity", this.id_native.id_class());
        jsonObject.addProperty("team", this.id_volatile);
        if (this.id_final != null) {
            jsonObject.addProperty("catType", this.id_final.toString());
        }
        return jsonObject;
    }

    public boolean id_class(rhN_2 rhN_22, an_3 an_32) {
        return this.id_class(rhN_22.id_continue(), rhN_22.Ps(), an_32);
    }

    public boolean id_class(rrEm_1 rrEm_12, rjU_2 rjU_22, an_3 an_32) {
        rnM_2 rnM_22;
        if (this == id_class) {
            return true;
        }
        if (an_32 == null) {
            return false;
        }
        if (!this.id_break.id_class(an_32.BC())) {
            return false;
        }
        if (rjU_22 == null ? this.id_byte != hl_3.id_class : !this.id_byte.id_class(rjU_22.id_break, rjU_22.id_byte, rjU_22.id_protected, an_32.rx(), an_32.re(), an_32.BO())) {
            return false;
        }
        if (!this.id_protected.id_class(rrEm_12, an_32.rx(), an_32.re(), an_32.BO())) {
            return false;
        }
        if (!this.id_throws.id_class(an_32)) {
            return false;
        }
        if (!this.id_case.id_class(an_32)) {
            return false;
        }
        if (!this.id_catch.id_class(an_32)) {
            return false;
        }
        if (!this.id_private.id_class(an_32)) {
            return false;
        }
        if (!this.id_implements.id_class(an_32)) {
            return false;
        }
        if (!this.id_finally.id_class(an_32)) {
            return false;
        }
        if (!this.id_extends.id_class(rrEm_12, rjU_22, an_32.ra())) {
            return false;
        }
        if (!this.id_native.id_class(rrEm_12, rjU_22, an_32 instanceof is_3 ? ((is_3)an_32).I_() : null)) {
            return false;
        }
        if (!(this.id_volatile == null || (rnM_22 = an_32.BG()) != null && this.id_volatile.equals(rnM_22.id_class()))) {
            return false;
        }
        return this.id_final == null || an_32 instanceof rbf_3 && ((rbf_3)an_32).L().equals(this.id_final);
    }

    public static rzr_3 id_break(rhN_2 rhN_22, an_3 an_32) {
        return new rzP_2(rhN_22.id_continue()).id_class(rzQ_2.id_class, an_32).id_class(rzQ_2.id_case, rhN_22.Ps()).id_class(rhN_22.Sa()).id_class(rzz_3.id_finally);
    }
}

