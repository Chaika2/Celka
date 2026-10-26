/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 */
package celestial;

import celestial.Oo_1;
import celestial.XN;
import celestial.hZ_2;
import celestial.ho_3;
import celestial.rWH;
import celestial.rqO_2;
import celestial.rrEm_1;
import com.google.gson.JsonObject;

public class XK
extends hZ_2 {
    private final XN id_class;

    public XK(rqO_2 rqO_22, ho_3 ho_32, XN xN) {
        super(rqO_22, ho_32);
        this.id_class = xN;
    }

    public boolean id_class(rrEm_1 rrEm_12, double d, double d2, double d3) {
        return this.id_class.id_class(rrEm_12, d, d2, d3);
    }

    @Override
    public JsonObject id_class(rWH rWH2) {
        JsonObject jsonObject = super.id_class(rWH2);
        jsonObject.add("location", this.id_class.id_class());
        return jsonObject;
    }

    public static XK id_class(XN xN) {
        return new XK(Oo_1.id_int.id_class, ho_3.id_class, xN);
    }

    public static XK id_break() {
        return new XK(Oo_1.id_new.id_class, ho_3.id_class, XN.id_class);
    }

    public static XK id_protected() {
        return new XK(Oo_1.id_float.id_class, ho_3.id_class, XN.id_class);
    }
}

