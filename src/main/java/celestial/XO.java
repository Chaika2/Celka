/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 */
package celestial;

import celestial.XF;
import celestial.XM;
import celestial.Xh_1;
import celestial.hZ_2;
import celestial.ho_3;
import celestial.rWH;
import celestial.rdn_3;
import com.google.gson.JsonObject;

public class XO
extends hZ_2 {
    private final Xh_1 id_class;
    private final XF id_break;
    private final XF id_byte;

    public XO(ho_3 ho_32, Xh_1 xh_1, XF xF, XF xF2) {
        super(XM.id_class, ho_32);
        this.id_class = xh_1;
        this.id_break = xF;
        this.id_byte = xF2;
    }

    @Override
    public JsonObject id_class(rWH rWH2) {
        JsonObject jsonObject = super.id_class(rWH2);
        jsonObject.add("item", this.id_class.id_class());
        jsonObject.add("durability", this.id_break.id_protected());
        jsonObject.add("delta", this.id_byte.id_protected());
        return jsonObject;
    }

    public boolean id_class(rdn_3 rdn_32, int n) {
        if (!this.id_class.id_class(rdn_32)) {
            return false;
        }
        if (!this.id_break.id_byte(rdn_32.id_private() - n)) {
            return false;
        }
        return this.id_byte.id_byte(rdn_32.id_catch() - n);
    }

    public static XO id_class(ho_3 ho_32, Xh_1 xh_1, XF xF) {
        return new XO(ho_32, xh_1, xF, XF.id_throws);
    }
}

