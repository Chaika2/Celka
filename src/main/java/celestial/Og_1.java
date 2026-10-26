/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonNull
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParseException
 */
package celestial;

import celestial.gt_3;
import celestial.gw_3;
import celestial.rJT;
import celestial.rYB;
import celestial.rdn_3;
import celestial.rhN_2;
import celestial.rhd_3;
import celestial.rnW_2;
import celestial.rpY_2;
import celestial.rqL_2;
import celestial.rqO_2;
import celestial.rqn_3;
import celestial.rsE_2;
import celestial.rzP_2;
import celestial.rzQ_2;
import celestial.rzr_3;
import celestial.rzz_3;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.util.Arrays;

public class Og_1 {
    public static final Og_1 id_class = new Og_1(0, new rqO_2[0], new rqO_2[0], gw_3.id_class);
    private final int id_break;
    private final rqO_2[] id_byte;
    private final rqO_2[] id_protected;
    private final gw_3 id_throws;

    public Og_1(int n, rqO_2[] rqO_2Array, rqO_2[] rqO_2Array2, gw_3 gw_32) {
        this.id_break = n;
        this.id_byte = rqO_2Array;
        this.id_protected = rqO_2Array2;
        this.id_throws = gw_32;
    }

    public String toString() {
        return "AdvancementRewards{experience=" + this.id_break + ", loot=" + Arrays.toString(this.id_byte) + ", recipes=" + Arrays.toString(this.id_protected) + ", function=" + this.id_throws + "}";
    }

    public JsonElement id_class() {
        JsonArray jsonArray;
        if (this == id_class) {
            return JsonNull.INSTANCE;
        }
        JsonObject jsonObject = new JsonObject();
        if (this.id_break != 0) {
            jsonObject.addProperty("experience", (Number)this.id_break);
        }
        if (this.id_byte.length > 0) {
            jsonArray = new JsonArray();
            for (rqO_2 rqO_22 : this.id_byte) {
                jsonArray.add(rqO_22.toString());
            }
            jsonObject.add("loot", (JsonElement)jsonArray);
        }
        if (this.id_protected.length > 0) {
            jsonArray = new JsonArray();
            for (rqO_2 rqO_22 : this.id_protected) {
                jsonArray.add(rqO_22.toString());
            }
            jsonObject.add("recipes", (JsonElement)jsonArray);
        }
        if (this.id_throws.id_class() != null) {
            jsonObject.addProperty("function", this.id_throws.id_class().toString());
        }
        return jsonObject;
    }

    public static Og_1 id_class(JsonObject jsonObject) throws JsonParseException {
        int n = rpY_2.id_class(jsonObject, "experience", 0);
        JsonArray jsonArray = rpY_2.id_class(jsonObject, "loot", new JsonArray());
        rqO_2[] rqO_2Array = new rqO_2[jsonArray.size()];
        for (int i = 0; i < rqO_2Array.length; ++i) {
            rqO_2Array[i] = new rqO_2(rpY_2.id_class(jsonArray.get(i), "loot[" + i + "]"));
        }
        JsonArray jsonArray2 = rpY_2.id_class(jsonObject, "recipes", new JsonArray());
        rqO_2[] rqO_2Array2 = new rqO_2[jsonArray2.size()];
        for (int i = 0; i < rqO_2Array2.length; ++i) {
            rqO_2Array2[i] = new rqO_2(rpY_2.id_class(jsonArray2.get(i), "recipes[" + i + "]"));
        }
        gw_3 gw_32 = jsonObject.has("function") ? new gw_3(new rqO_2(rpY_2.id_case(jsonObject, "function"))) : gw_3.id_class;
        return new Og_1(n, rqO_2Array, rqO_2Array2, gw_32);
    }

    public void id_class(rhN_2 rhN_22) {
        rhN_22.id_this(this.id_break);
        rzr_3 rzr_32 = new rzP_2(rhN_22.id_continue()).id_class(rzQ_2.id_class, rhN_22).id_class(rzQ_2.id_case, rhN_22.Ps()).id_class(rhN_22.Sa()).id_class(rzz_3.id_implements);
        boolean bl = false;
        for (rqO_2 rqO_22 : this.id_byte) {
            for (rdn_3 rdn_32 : rhN_22.id_break.o().id_class(rqO_22).id_class(rzr_32)) {
                if (rhN_22.id_catch(rdn_32)) {
                    ((rYB)rhN_22.id_throws[7]).id_class((rhd_3)null, rhN_22.rx(), rhN_22.re(), rhN_22.BO(), rqn_3.ER, rqL_2.PLAYERS, 0.2f, ((rhN_22.Sa().nextFloat() - rhN_22.Sa().nextFloat()) * 0.7f + 1.0f) * 2.0f);
                    bl = true;
                    continue;
                }
                rsE_2 rsE_22 = rhN_22.id_class(rdn_32, false);
                if (rsE_22 == null) continue;
                rsE_22.id_implements();
                rsE_22.id_break(rhN_22.ro());
            }
        }
        if (bl) {
            ((rJT)rhN_22.id_implements[3]).id_native();
        }
        if (this.id_protected.length > 0) {
            rhN_22.id_class(this.id_protected);
        }
        rnW_2 rnW_22 = rhN_22.id_break;
        this.id_throws.id_class(rnW_22.w()).ifPresent(gt_32 -> rnW_22.w().id_class((gt_3)gt_32, rhN_22.PL().id_finally().id_break(2)));
    }
}

