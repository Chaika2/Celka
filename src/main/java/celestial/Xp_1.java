/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 */
package celestial;

import celestial.JS;
import celestial.XN;
import celestial.Xh_1;
import celestial.Xy_1;
import celestial.hZ_2;
import celestial.ho_3;
import celestial.rVL;
import celestial.rWH;
import celestial.rdn_3;
import celestial.rfH_2;
import celestial.rrEm_1;
import celestial.xc_3;
import celestial.xd_3;
import com.google.gson.JsonObject;

public class Xp_1
extends hZ_2 {
    private final xd_3 id_class;
    private final JS id_break;
    private final XN id_byte;
    private final Xh_1 id_protected;

    public Xp_1(ho_3 ho_32, xd_3 xd_32, JS jS, XN xN, Xh_1 xh_1) {
        super(Xy_1.id_class, ho_32);
        this.id_class = xd_32;
        this.id_break = jS;
        this.id_byte = xN;
        this.id_protected = xh_1;
    }

    @Override
    public JsonObject id_class(rWH rWH2) {
        JsonObject jsonObject = super.id_class(rWH2);
        if (this.id_class != null) {
            jsonObject.addProperty("block", rVL.id_strictfp.id_break(this.id_class).toString());
        }
        jsonObject.add("state", this.id_break.id_class());
        jsonObject.add("location", this.id_byte.id_class());
        jsonObject.add("item", this.id_protected.id_class());
        return jsonObject;
    }

    public boolean id_class(xc_3 xc_32, rfH_2 rfH_22, rrEm_1 rrEm_12, rdn_3 rdn_32) {
        if (this.id_class != null && !xc_32.id_class(this.id_class)) {
            return false;
        }
        if (!this.id_break.id_class(xc_32)) {
            return false;
        }
        if (!this.id_byte.id_class(rrEm_12, rfH_22.b_(), rfH_22.c_(), rfH_22.d_())) {
            return false;
        }
        return this.id_protected.id_class(rdn_32);
    }

    public static Xp_1 id_class(xd_3 xd_32) {
        return new Xp_1(ho_3.id_class, xd_32, JS.id_class, XN.id_class, Xh_1.id_class);
    }
}

