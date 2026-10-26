/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 */
package celestial;

import celestial.Oo_1;
import celestial.hC_2;
import celestial.hK_2;
import celestial.hZ_2;
import celestial.hn_3;
import celestial.ho_3;
import celestial.rWH;
import celestial.rhN_2;
import celestial.rqO_2;
import celestial.rye_3;
import celestial.rzr_3;
import com.google.gson.JsonObject;

public class Xk_1
extends hZ_2 {
    private final ho_3 id_class;
    private final hn_3 id_break;

    public Xk_1(rqO_2 rqO_22, ho_3 ho_32, ho_3 ho_33, hn_3 hn_32) {
        super(rqO_22, ho_32);
        this.id_class = ho_33;
        this.id_break = hn_32;
    }

    public static Xk_1 id_class(hK_2 hK_22, hC_2 hC_22) {
        return new Xk_1(Oo_1.id_break.id_class, ho_3.id_class, ho_3.id_class(hK_22.id_break()), hC_22.id_break());
    }

    public boolean id_class(rhN_2 rhN_22, rzr_3 rzr_32, rye_3 rye_32) {
        return !this.id_break.id_class(rhN_22, rye_32) ? false : this.id_class.id_class(rzr_32);
    }

    @Override
    public JsonObject id_class(rWH rWH2) {
        JsonObject jsonObject = super.id_class(rWH2);
        jsonObject.add("entity", this.id_class.id_class(rWH2));
        jsonObject.add("killing_blow", this.id_break.id_class());
        return jsonObject;
    }

    public static Xk_1 id_class(hK_2 hK_22) {
        return new Xk_1(Oo_1.id_break.id_class, ho_3.id_class, ho_3.id_class(hK_22.id_break()), hn_3.id_class);
    }

    public static Xk_1 id_break() {
        return new Xk_1(Oo_1.id_break.id_class, ho_3.id_class, ho_3.id_class, hn_3.id_class);
    }

    public static Xk_1 id_protected() {
        return new Xk_1(Oo_1.id_byte.id_class, ho_3.id_class, ho_3.id_class, hn_3.id_class);
    }
}

