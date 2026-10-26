/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 */
package celestial;

import celestial.XF;
import celestial.XX;
import celestial.Xh_1;
import celestial.hZ_2;
import celestial.hb_3;
import celestial.ho_3;
import celestial.rVL;
import celestial.rWH;
import celestial.rdn_3;
import celestial.xd_3;
import com.google.gson.JsonObject;

public class hM_2
extends hZ_2 {
    private final xd_3 id_class;
    private final Xh_1 id_break;
    private final XF id_byte;

    public hM_2(ho_3 ho_32, xd_3 xd_32, Xh_1 xh_1, XF xF) {
        super(hb_3.id_class, ho_32);
        this.id_class = xd_32;
        this.id_break = xh_1;
        this.id_byte = xF;
    }

    @Override
    public JsonObject id_class(rWH rWH2) {
        JsonObject jsonObject = super.id_class(rWH2);
        if (this.id_class != null) {
            jsonObject.addProperty("block", rVL.id_strictfp.id_break(this.id_class).toString());
        }
        jsonObject.add("item", this.id_break.id_class());
        jsonObject.add("num_bees_inside", this.id_byte.id_protected());
        return jsonObject;
    }

    public boolean id_class(xd_3 xd_32, rdn_3 rdn_32, int n) {
        if (this.id_class != null && xd_32 != this.id_class) {
            return false;
        }
        return !this.id_break.id_class(rdn_32) ? false : this.id_byte.id_byte(n);
    }

    public static hM_2 id_class(xd_3 xd_32, XX xX, XF xF) {
        return new hM_2(ho_3.id_class, xd_32, xX.id_break(), xF);
    }
}

