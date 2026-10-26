/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 */
package celestial;

import celestial.Jc_1;
import celestial.XX;
import celestial.Xh_1;
import celestial.hZ_2;
import celestial.ho_3;
import celestial.rWH;
import celestial.rdn_3;
import celestial.rpL_2;
import com.google.gson.JsonObject;

public class Ju_1
extends hZ_2 {
    private final Xh_1 id_class;

    public Ju_1(ho_3 ho_32, Xh_1 xh_1) {
        super(Jc_1.id_class, ho_32);
        this.id_class = xh_1;
    }

    @Override
    public JsonObject id_class(rWH rWH2) {
        JsonObject jsonObject = super.id_class(rWH2);
        jsonObject.add("item", this.id_class.id_class());
        return jsonObject;
    }

    public boolean id_class(rdn_3 rdn_32) {
        return this.id_class.id_class(rdn_32);
    }

    public static Ju_1 id_class(rpL_2 rpL_22) {
        return new Ju_1(ho_3.id_class, XX.id_class().id_class(rpL_22).id_break());
    }
}

