/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 */
package celestial;

import celestial.XF;
import celestial.Xh_1;
import celestial.hZ_2;
import celestial.ho_3;
import celestial.hp_3;
import celestial.rWH;
import celestial.rdn_3;
import com.google.gson.JsonObject;

public class hq_3
extends hZ_2 {
    private final Xh_1 id_class;
    private final XF id_break;

    public hq_3(ho_3 ho_32, Xh_1 xh_1, XF xF) {
        super(hp_3.id_class, ho_32);
        this.id_class = xh_1;
        this.id_break = xF;
    }

    @Override
    public JsonObject id_class(rWH rWH2) {
        JsonObject jsonObject = super.id_class(rWH2);
        jsonObject.add("item", this.id_class.id_class());
        jsonObject.add("levels", this.id_break.id_protected());
        return jsonObject;
    }

    public boolean id_class(rdn_3 rdn_32, int n) {
        if (!this.id_class.id_class(rdn_32)) {
            return false;
        }
        return this.id_break.id_byte(n);
    }

    public static hq_3 id_break() {
        return new hq_3(ho_3.id_class, Xh_1.id_class, XF.id_throws);
    }
}

