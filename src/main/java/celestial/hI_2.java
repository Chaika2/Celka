/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonNull
 *  com.google.gson.JsonObject
 */
package celestial;

import celestial.XX;
import celestial.Xh_1;
import celestial.an_3;
import celestial.iB_2;
import celestial.rXQ;
import celestial.rdy_3;
import celestial.rpY_2;
import celestial.rrEr_1;
import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;

public class hI_2 {
    public static final hI_2 id_class = new hI_2(Xh_1.id_class, Xh_1.id_class, Xh_1.id_class, Xh_1.id_class, Xh_1.id_class, Xh_1.id_class);
    public static final hI_2 id_break = new hI_2(XX.id_class().id_class(rdy_3.dY).id_class(rrEr_1.id_new().id_package()).id_break(), Xh_1.id_class, Xh_1.id_class, Xh_1.id_class, Xh_1.id_class, Xh_1.id_class);
    private final Xh_1 id_byte;
    private final Xh_1 id_protected;
    private final Xh_1 id_throws;
    private final Xh_1 id_case;
    private final Xh_1 id_catch;
    private final Xh_1 id_private;

    public hI_2(Xh_1 xh_1, Xh_1 xh_12, Xh_1 xh_13, Xh_1 xh_14, Xh_1 xh_15, Xh_1 xh_16) {
        this.id_byte = xh_1;
        this.id_protected = xh_12;
        this.id_throws = xh_13;
        this.id_case = xh_14;
        this.id_catch = xh_15;
        this.id_private = xh_16;
    }

    public boolean id_class(an_3 an_32) {
        if (this == id_class) {
            return true;
        }
        if (!(an_32 instanceof iB_2)) {
            return false;
        }
        iB_2 iB_22 = (iB_2)an_32;
        if (!this.id_byte.id_class(iB_22.id_class(rXQ.HEAD))) {
            return false;
        }
        if (!this.id_protected.id_class(iB_22.id_class(rXQ.CHEST))) {
            return false;
        }
        if (!this.id_throws.id_class(iB_22.id_class(rXQ.LEGS))) {
            return false;
        }
        if (!this.id_case.id_class(iB_22.id_class(rXQ.FEET))) {
            return false;
        }
        if (!this.id_catch.id_class(iB_22.id_class(rXQ.MAINHAND))) {
            return false;
        }
        return this.id_private.id_class(iB_22.id_class(rXQ.OFFHAND));
    }

    public JsonElement id_class() {
        if (this == id_class) {
            return JsonNull.INSTANCE;
        }
        JsonObject jsonObject = new JsonObject();
        jsonObject.add("head", this.id_byte.id_class());
        jsonObject.add("chest", this.id_protected.id_class());
        jsonObject.add("legs", this.id_throws.id_class());
        jsonObject.add("feet", this.id_case.id_class());
        jsonObject.add("mainhand", this.id_catch.id_class());
        jsonObject.add("offhand", this.id_private.id_class());
        return jsonObject;
    }

    public static hI_2 id_class(JsonElement jsonElement) {
        if (jsonElement != null && !jsonElement.isJsonNull()) {
            JsonObject jsonObject = rpY_2.id_private(jsonElement, "equipment");
            Xh_1 xh_1 = Xh_1.id_class(jsonObject.get("head"));
            Xh_1 xh_12 = Xh_1.id_class(jsonObject.get("chest"));
            Xh_1 xh_13 = Xh_1.id_class(jsonObject.get("legs"));
            Xh_1 xh_14 = Xh_1.id_class(jsonObject.get("feet"));
            Xh_1 xh_15 = Xh_1.id_class(jsonObject.get("mainhand"));
            Xh_1 xh_16 = Xh_1.id_class(jsonObject.get("offhand"));
            return new hI_2(xh_1, xh_12, xh_13, xh_14, xh_15, xh_16);
        }
        return id_class;
    }
}

