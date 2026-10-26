/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonNull
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonSyntaxException
 */
package celestial;

import celestial.JS;
import celestial.XC;
import celestial.rVL;
import celestial.rcd_3;
import celestial.rfH_2;
import celestial.rlZ_2;
import celestial.rlb_3;
import celestial.rpY_2;
import celestial.rqO_2;
import celestial.rrEm_1;
import celestial.ryO_2;
import celestial.xc_3;
import celestial.xd_3;
import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.google.gson.JsonSyntaxException;

public class hO_2 {
    public static final hO_2 id_class = new hO_2(null, null, JS.id_class, XC.id_class);
    private final rlb_3<xd_3> id_break;
    private final xd_3 id_byte;
    private final JS id_protected;
    private final XC id_throws;

    public hO_2(rlb_3<xd_3> rlb_32, xd_3 xd_32, JS jS, XC xC) {
        this.id_break = rlb_32;
        this.id_byte = xd_32;
        this.id_protected = jS;
        this.id_throws = xC;
    }

    public boolean id_class(rrEm_1 rrEm_12, rfH_2 rfH_22) {
        ryO_2 ryO_22;
        if (this == id_class) {
            return true;
        }
        if (!rrEm_12.id_synchronized(rfH_22)) {
            return false;
        }
        xc_3 xc_32 = rrEm_12.id_byte(rfH_22);
        xd_3 xd_32 = xc_32.id_break();
        if (this.id_break != null && !this.id_break.id_class(xd_32)) {
            return false;
        }
        if (this.id_byte != null && xd_32 != this.id_byte) {
            return false;
        }
        if (!this.id_protected.id_class(xc_32)) {
            return false;
        }
        return this.id_throws == XC.id_class || (ryO_22 = rrEm_12.id_class(rfH_22)) != null && this.id_throws.id_class(ryO_22.id_class(new rcd_3()));
    }

    public JsonElement id_class() {
        if (this == id_class) {
            return JsonNull.INSTANCE;
        }
        JsonObject jsonObject = new JsonObject();
        if (this.id_byte != null) {
            jsonObject.addProperty("block", rVL.id_strictfp.id_break(this.id_byte).toString());
        }
        if (this.id_break != null) {
            jsonObject.addProperty("tag", rlZ_2.id_class().id_class().id_break(this.id_break).toString());
        }
        jsonObject.add("nbt", this.id_throws.id_class());
        jsonObject.add("state", this.id_protected.id_class());
        return jsonObject;
    }

    public static hO_2 id_class(JsonElement jsonElement) {
        if (jsonElement != null && !jsonElement.isJsonNull()) {
            Object object;
            rlb_3<xd_3> rlb_32;
            JsonObject jsonObject = rpY_2.id_private(jsonElement, "block");
            XC xC = XC.id_class(jsonObject.get("nbt"));
            xd_3 xd_32 = null;
            if (jsonObject.has("block")) {
                rlb_32 = new rqO_2(rpY_2.id_case(jsonObject, "block"));
                xd_32 = rVL.id_strictfp.id_class((rqO_2)((Object)rlb_32));
            }
            rlb_32 = null;
            if (jsonObject.has("tag")) {
                object = new rqO_2(rpY_2.id_case(jsonObject, "tag"));
                rlb_32 = rlZ_2.id_class().id_class().id_class((rqO_2)object);
                if (rlb_32 == null) {
                    throw new JsonSyntaxException("Unknown block tag '" + (rqO_2)object + "'");
                }
            }
            object = JS.id_class(jsonObject.get("state"));
            return new hO_2(rlb_32, xd_32, (JS)object, xC);
        }
        return id_class;
    }
}

