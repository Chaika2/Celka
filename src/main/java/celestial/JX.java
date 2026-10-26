/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 */
package celestial;

import celestial.Jh_1;
import celestial.hY_2;
import celestial.hZ_2;
import celestial.ho_3;
import celestial.rWH;
import celestial.rzr_3;
import com.google.gson.JsonObject;

public class JX
extends hZ_2 {
    private final ho_3 id_class;

    public JX(ho_3 ho_32, ho_3 ho_33) {
        super(Jh_1.id_class, ho_32);
        this.id_class = ho_33;
    }

    @Override
    public JsonObject id_class(rWH rWH2) {
        JsonObject jsonObject = super.id_class(rWH2);
        jsonObject.add("entity", this.id_class.id_class(rWH2));
        return jsonObject;
    }

    public boolean id_class(rzr_3 rzr_32) {
        return this.id_class.id_class(rzr_32);
    }

    public static JX id_class(hY_2 hY_22) {
        return new JX(ho_3.id_class, ho_3.id_class(hY_22));
    }

    public static JX id_break() {
        return new JX(ho_3.id_class, ho_3.id_class);
    }
}

