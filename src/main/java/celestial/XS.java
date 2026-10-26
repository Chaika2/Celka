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
import celestial.rVL;
import celestial.rXE;
import celestial.rXs_1;
import celestial.rfH_2;
import celestial.rlZ_2;
import celestial.rlb_3;
import celestial.rpY_2;
import celestial.rqO_2;
import celestial.rrEm_1;
import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.google.gson.JsonSyntaxException;

public class XS {
    public static final XS id_class = new XS(null, null, JS.id_class);
    private final rlb_3<rXs_1> id_break;
    private final rXs_1 id_byte;
    private final JS id_protected;

    public XS(rlb_3<rXs_1> rlb_32, rXs_1 rXs_12, JS jS) {
        this.id_break = rlb_32;
        this.id_byte = rXs_12;
        this.id_protected = jS;
    }

    public boolean id_class(rrEm_1 rrEm_12, rfH_2 rfH_22) {
        if (this == id_class) {
            return true;
        }
        if (!rrEm_12.id_synchronized(rfH_22)) {
            return false;
        }
        rXE rXE2 = rrEm_12.id_break(rfH_22);
        rXs_1 rXs_12 = rXE2.id_class();
        if (this.id_break != null && !this.id_break.id_class(rXs_12)) {
            return false;
        }
        if (this.id_byte != null && rXs_12 != this.id_byte) {
            return false;
        }
        return this.id_protected.id_class(rXE2);
    }

    public JsonElement id_class() {
        if (this == id_class) {
            return JsonNull.INSTANCE;
        }
        JsonObject jsonObject = new JsonObject();
        if (this.id_byte != null) {
            jsonObject.addProperty("fluid", rVL.id_default.id_break(this.id_byte).toString());
        }
        if (this.id_break != null) {
            jsonObject.addProperty("tag", rlZ_2.id_class().id_byte().id_break(this.id_break).toString());
        }
        jsonObject.add("state", this.id_protected.id_class());
        return jsonObject;
    }

    public static XS id_class(JsonElement jsonElement) {
        if (jsonElement != null && !jsonElement.isJsonNull()) {
            Object object;
            rlb_3<rXs_1> rlb_32;
            JsonObject jsonObject = rpY_2.id_private(jsonElement, "fluid");
            rXs_1 rXs_12 = null;
            if (jsonObject.has("fluid")) {
                rlb_32 = new rqO_2(rpY_2.id_case(jsonObject, "fluid"));
                rXs_12 = rVL.id_default.id_class((rqO_2)((Object)rlb_32));
            }
            rlb_32 = null;
            if (jsonObject.has("tag")) {
                object = new rqO_2(rpY_2.id_case(jsonObject, "tag"));
                rlb_32 = rlZ_2.id_class().id_byte().id_class((rqO_2)object);
                if (rlb_32 == null) {
                    throw new JsonSyntaxException("Unknown fluid tag '" + (rqO_2)object + "'");
                }
            }
            object = JS.id_class(jsonObject.get("state"));
            return new XS(rlb_32, rXs_12, (JS)object);
        }
        return id_class;
    }
}

