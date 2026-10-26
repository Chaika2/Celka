/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 */
package celestial;

import celestial.XN;
import celestial.Xl_1;
import celestial.hZ_2;
import celestial.hl_3;
import celestial.ho_3;
import celestial.rWH;
import celestial.rjU_2;
import celestial.rrEm_1;
import com.google.gson.JsonObject;

public class XH
extends hZ_2 {
    private final XN id_class;
    private final XN id_break;
    private final hl_3 id_byte;

    public XH(ho_3 ho_32, XN xN, XN xN2, hl_3 hl_32) {
        super(Xl_1.id_class, ho_32);
        this.id_class = xN;
        this.id_break = xN2;
        this.id_byte = hl_32;
    }

    @Override
    public JsonObject id_class(rWH rWH2) {
        JsonObject jsonObject = super.id_class(rWH2);
        jsonObject.add("entered", this.id_class.id_class());
        jsonObject.add("exited", this.id_break.id_class());
        jsonObject.add("distance", this.id_byte.id_class());
        return jsonObject;
    }

    public boolean id_class(rrEm_1 rrEm_12, rjU_2 rjU_22, double d, double d2, double d3) {
        if (!this.id_class.id_class(rrEm_12, rjU_22.id_break, rjU_22.id_byte, rjU_22.id_protected)) {
            return false;
        }
        if (!this.id_break.id_class(rrEm_12, d, d2, d3)) {
            return false;
        }
        return this.id_byte.id_class(rjU_22.id_break, rjU_22.id_byte, rjU_22.id_protected, d, d2, d3);
    }

    public static XH id_class(hl_3 hl_32) {
        return new XH(ho_3.id_class, XN.id_class, XN.id_class, hl_32);
    }
}

