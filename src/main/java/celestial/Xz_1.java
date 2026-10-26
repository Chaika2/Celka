/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 */
package celestial;

import celestial.XF;
import celestial.XW;
import celestial.hZ_2;
import celestial.hl_3;
import celestial.ho_3;
import celestial.rWH;
import celestial.rhN_2;
import celestial.rjU_2;
import com.google.gson.JsonObject;

public class Xz_1
extends hZ_2 {
    private final hl_3 id_class;
    private final XF id_break;

    public Xz_1(ho_3 ho_32, hl_3 hl_32, XF xF) {
        super(XW.id_class, ho_32);
        this.id_class = hl_32;
        this.id_break = xF;
    }

    @Override
    public JsonObject id_class(rWH rWH2) {
        JsonObject jsonObject = super.id_class(rWH2);
        jsonObject.add("distance", this.id_class.id_class());
        jsonObject.add("duration", this.id_break.id_protected());
        return jsonObject;
    }

    public boolean id_class(rhN_2 rhN_22, rjU_2 rjU_22, int n) {
        if (!this.id_class.id_class(rjU_22.id_break, rjU_22.id_byte, rjU_22.id_protected, rhN_22.rx(), rhN_22.re(), rhN_22.BO())) {
            return false;
        }
        return this.id_break.id_byte(n);
    }

    public static Xz_1 id_class(hl_3 hl_32) {
        return new Xz_1(ho_3.id_class, hl_32, XF.id_throws);
    }
}

