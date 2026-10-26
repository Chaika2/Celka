/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonNull
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParseException
 *  com.google.gson.JsonSyntaxException
 */
package celestial;

import celestial.XC;
import celestial.XF;
import celestial.eA_2;
import celestial.ev_3;
import celestial.hT_2;
import celestial.rAB;
import celestial.rLi_1;
import celestial.rVL;
import celestial.rdb_3;
import celestial.rdn_3;
import celestial.rlZ_2;
import celestial.rlb_3;
import celestial.rpY_2;
import celestial.rqO_2;
import celestial.rxy_3;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSyntaxException;
import java.util.Map;

public class Xh_1 {
    public static final Xh_1 id_class = new Xh_1();
    private final rlb_3<rdb_3> id_break;
    private final rdb_3 id_byte;
    private final XF id_protected;
    private final XF id_throws;
    private final hT_2[] id_case;
    private final hT_2[] id_catch;
    private final rLi_1 id_private;
    private final XC id_implements;

    public Xh_1() {
        this.id_break = null;
        this.id_byte = null;
        this.id_private = null;
        this.id_protected = XF.id_throws;
        this.id_throws = XF.id_throws;
        this.id_case = hT_2.id_break;
        this.id_catch = hT_2.id_break;
        this.id_implements = XC.id_class;
    }

    public Xh_1(rlb_3<rdb_3> rlb_32, rdb_3 rdb_32, XF xF, XF xF2, hT_2[] hT_2Array, hT_2[] hT_2Array2, rLi_1 rLi_12, XC xC) {
        this.id_break = rlb_32;
        this.id_byte = rdb_32;
        this.id_protected = xF;
        this.id_throws = xF2;
        this.id_case = hT_2Array;
        this.id_catch = hT_2Array2;
        this.id_private = rLi_12;
        this.id_implements = xC;
    }

    public JsonElement id_class() {
        JsonArray jsonArray;
        if (this == id_class) {
            return JsonNull.INSTANCE;
        }
        JsonObject jsonObject = new JsonObject();
        if (this.id_byte != null) {
            jsonObject.addProperty("item", rVL.id_for.id_break(this.id_byte).toString());
        }
        if (this.id_break != null) {
            jsonObject.addProperty("tag", rlZ_2.id_class().id_break().id_break(this.id_break).toString());
        }
        jsonObject.add("count", this.id_protected.id_protected());
        jsonObject.add("durability", this.id_throws.id_protected());
        jsonObject.add("nbt", this.id_implements.id_class());
        if (this.id_case.length > 0) {
            jsonArray = new JsonArray();
            for (hT_2 hT_22 : this.id_case) {
                jsonArray.add(hT_22.id_class());
            }
            jsonObject.add("enchantments", (JsonElement)jsonArray);
        }
        if (this.id_catch.length > 0) {
            jsonArray = new JsonArray();
            for (hT_2 hT_22 : this.id_catch) {
                jsonArray.add(hT_22.id_class());
            }
            jsonObject.add("stored_enchantments", (JsonElement)jsonArray);
        }
        if (this.id_private != null) {
            jsonObject.addProperty("potion", rVL.id_double.id_break(this.id_private).toString());
        }
        return jsonObject;
    }

    private static /* synthetic */ JsonSyntaxException id_class(rqO_2 rqO_22) {
        return new JsonSyntaxException("Unknown potion '" + rqO_22 + "'");
    }

    public static Xh_1 id_class(JsonElement jsonElement) {
        if (jsonElement != null && !jsonElement.isJsonNull()) {
            hT_2[] hT_2Array;
            Object object;
            rlb_3<rdb_3> rlb_32;
            JsonObject jsonObject = rpY_2.id_private(jsonElement, "item");
            XF xF = XF.id_class(jsonObject.get("count"));
            XF xF2 = XF.id_class(jsonObject.get("durability"));
            if (jsonObject.has("data")) {
                throw new JsonParseException("Disallowed data tag found");
            }
            XC xC = XC.id_class(jsonObject.get("nbt"));
            rdb_3 rdb_32 = null;
            if (jsonObject.has("item")) {
                rlb_32 = new rqO_2(rpY_2.id_case(jsonObject, "item"));
                rdb_32 = rVL.id_for.id_break((rqO_2)((Object)rlb_32)).orElseThrow(() -> Xh_1.id_break((rqO_2)((Object)rlb_32)));
            }
            rlb_32 = null;
            if (jsonObject.has("tag")) {
                object = new rqO_2(rpY_2.id_case(jsonObject, "tag"));
                rlb_32 = rlZ_2.id_class().id_break().id_class((rqO_2)object);
                if (rlb_32 == null) {
                    throw new JsonSyntaxException("Unknown item tag '" + (rqO_2)object + "'");
                }
            }
            object = null;
            if (jsonObject.has("potion")) {
                hT_2Array = new rqO_2(rpY_2.id_case(jsonObject, "potion"));
                object = rVL.id_double.id_break((rqO_2)hT_2Array).orElseThrow(() -> Xh_1.id_class((rqO_2)hT_2Array));
            }
            hT_2Array = hT_2.id_break(jsonObject.get("enchantments"));
            hT_2[] hT_2Array2 = hT_2.id_break(jsonObject.get("stored_enchantments"));
            return new Xh_1(rlb_32, rdb_32, xF, xF2, hT_2Array, hT_2Array2, (rLi_1)object, xC);
        }
        return id_class;
    }

    public boolean id_class(rdn_3 rdn_32) {
        Map<ev_3, Integer> map;
        if (this == id_class) {
            return true;
        }
        if (this.id_break != null && !this.id_break.id_class(rdn_32.id_break())) {
            return false;
        }
        if (this.id_byte != null && rdn_32.id_break() != this.id_byte) {
            return false;
        }
        if (!this.id_protected.id_byte(rdn_32.id_char())) {
            return false;
        }
        if (!this.id_throws.id_byte() && !rdn_32.id_throws()) {
            return false;
        }
        if (!this.id_throws.id_byte(rdn_32.id_private() - rdn_32.id_catch())) {
            return false;
        }
        if (!this.id_implements.id_class(rdn_32)) {
            return false;
        }
        if (this.id_case.length > 0) {
            map = eA_2.id_class(rdn_32.id_new());
            for (hT_2 hT_22 : this.id_case) {
                if (hT_22.id_class(map)) continue;
                return false;
            }
        }
        if (this.id_catch.length > 0) {
            map = eA_2.id_class(rxy_3.id_protected(rdn_32));
            for (hT_2 hT_22 : this.id_catch) {
                if (hT_22.id_class(map)) continue;
                return false;
            }
        }
        map = rAB.id_protected(rdn_32);
        return this.id_private == null || this.id_private == map;
    }

    public static Xh_1[] id_break(JsonElement jsonElement) {
        if (jsonElement != null && !jsonElement.isJsonNull()) {
            JsonArray jsonArray = rpY_2.id_implements(jsonElement, "items");
            Xh_1[] xh_1Array = new Xh_1[jsonArray.size()];
            for (int i = 0; i < xh_1Array.length; ++i) {
                xh_1Array[i] = Xh_1.id_class(jsonArray.get(i));
            }
            return xh_1Array;
        }
        return new Xh_1[0];
    }

    private static /* synthetic */ JsonSyntaxException id_break(rqO_2 rqO_22) {
        return new JsonSyntaxException("Unknown item id '" + rqO_22 + "'");
    }
}

