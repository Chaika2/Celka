/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 */
package celestial;

import celestial.hK_2;
import celestial.hX_2;
import celestial.hY_2;
import celestial.hZ_2;
import celestial.ho_3;
import celestial.rWH;
import celestial.rzr_3;
import com.google.gson.JsonObject;

public class hJ_2
extends hZ_2 {
    private final ho_3 id_class;
    private final ho_3 id_break;
    private final ho_3 id_byte;

    public hJ_2(ho_3 ho_32, ho_3 ho_33, ho_3 ho_34, ho_3 ho_35) {
        super(hX_2.id_class, ho_32);
        this.id_class = ho_33;
        this.id_break = ho_34;
        this.id_byte = ho_35;
    }

    public static hJ_2 id_class(hY_2 hY_22, hY_2 hY_23, hY_2 hY_24) {
        return new hJ_2(ho_3.id_class, ho_3.id_class(hY_22), ho_3.id_class(hY_23), ho_3.id_class(hY_24));
    }

    public boolean id_class(rzr_3 rzr_32, rzr_3 rzr_33, rzr_3 rzr_34) {
        if (this.id_byte == ho_3.id_class || rzr_34 != null && this.id_byte.id_class(rzr_34)) {
            return this.id_class.id_class(rzr_32) && this.id_break.id_class(rzr_33) || this.id_class.id_class(rzr_33) && this.id_break.id_class(rzr_32);
        }
        return false;
    }

    @Override
    public JsonObject id_class(rWH rWH2) {
        JsonObject jsonObject = super.id_class(rWH2);
        jsonObject.add("parent", this.id_class.id_class(rWH2));
        jsonObject.add("partner", this.id_break.id_class(rWH2));
        jsonObject.add("child", this.id_byte.id_class(rWH2));
        return jsonObject;
    }

    public static hJ_2 id_class(hK_2 hK_22) {
        return new hJ_2(ho_3.id_class, ho_3.id_class, ho_3.id_class, ho_3.id_class(hK_22.id_break()));
    }

    public static hJ_2 id_break() {
        return new hJ_2(ho_3.id_class, ho_3.id_class, ho_3.id_class, ho_3.id_class);
    }
}

