/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 */
package celestial;

import celestial.XP;
import celestial.Xh_1;
import celestial.an_3;
import celestial.hY_2;
import celestial.hZ_2;
import celestial.ho_3;
import celestial.rWH;
import celestial.rdn_3;
import celestial.rsE_2;
import celestial.rzQ_2;
import celestial.rzr_3;
import com.google.gson.JsonObject;
import java.util.Collection;

public class XB
extends hZ_2 {
    private final Xh_1 id_class;
    private final ho_3 id_break;
    private final Xh_1 id_byte;

    public XB(ho_3 ho_32, Xh_1 xh_1, ho_3 ho_33, Xh_1 xh_12) {
        super(XP.id_class, ho_32);
        this.id_class = xh_1;
        this.id_break = ho_33;
        this.id_byte = xh_12;
    }

    @Override
    public JsonObject id_class(rWH rWH2) {
        JsonObject jsonObject = super.id_class(rWH2);
        jsonObject.add("rod", this.id_class.id_class());
        jsonObject.add("entity", this.id_break.id_class(rWH2));
        jsonObject.add("item", this.id_byte.id_class());
        return jsonObject;
    }

    public boolean id_class(rdn_3 rdn_32, rzr_3 rzr_32, Collection<rdn_3> collection) {
        if (!this.id_class.id_class(rdn_32)) {
            return false;
        }
        if (!this.id_break.id_class(rzr_32)) {
            return false;
        }
        if (this.id_byte != Xh_1.id_class) {
            Object object;
            boolean bl = false;
            an_3 an_32 = rzr_32.id_break(rzQ_2.id_class);
            if (an_32 instanceof rsE_2 && this.id_byte.id_class(((rsE_2)(object = (rsE_2)an_32)).id_protected())) {
                bl = true;
            }
            for (rdn_3 rdn_33 : collection) {
                if (!this.id_byte.id_class(rdn_33)) continue;
                bl = true;
                break;
            }
            if (!bl) {
                return false;
            }
        }
        return true;
    }

    public static XB id_class(Xh_1 xh_1, hY_2 hY_22, Xh_1 xh_12) {
        return new XB(ho_3.id_class, xh_1, ho_3.id_class(hY_22), xh_12);
    }
}

