/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 */
package celestial;

import celestial.JJ;
import celestial.XF;
import celestial.hZ_2;
import celestial.ho_3;
import celestial.rWH;
import celestial.rjU_2;
import celestial.rzr_3;
import com.google.gson.JsonObject;

public class Jx_1
extends hZ_2 {
    private final XF id_class;
    private final ho_3 id_break;

    public Jx_1(ho_3 ho_32, XF xF, ho_3 ho_33) {
        super(JJ.id_class, ho_32);
        this.id_class = xF;
        this.id_break = ho_33;
    }

    public boolean id_class(rzr_3 rzr_32, rjU_2 rjU_22, int n) {
        if (!this.id_class.id_byte(n)) {
            return false;
        }
        return this.id_break.id_class(rzr_32);
    }

    @Override
    public JsonObject id_class(rWH rWH2) {
        JsonObject jsonObject = super.id_class(rWH2);
        jsonObject.add("signal_strength", this.id_class.id_protected());
        jsonObject.add("projectile", this.id_break.id_class(rWH2));
        return jsonObject;
    }

    public static Jx_1 id_class(XF xF, ho_3 ho_32) {
        return new Jx_1(ho_3.id_class, xF, ho_32);
    }
}

