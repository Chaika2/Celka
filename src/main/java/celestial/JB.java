/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 */
package celestial;

import celestial.JP;
import celestial.JS;
import celestial.hZ_2;
import celestial.ho_3;
import celestial.rVL;
import celestial.rWH;
import celestial.xc_3;
import celestial.xd_3;
import com.google.gson.JsonObject;

public class JB
extends hZ_2 {
    private final xd_3 id_class;
    private final JS id_break;

    public JB(ho_3 ho_32, xd_3 xd_32, JS jS) {
        super(JP.id_class, ho_32);
        this.id_class = xd_32;
        this.id_break = jS;
    }

    public boolean id_class(xc_3 xc_32) {
        if (this.id_class != null && !xc_32.id_class(this.id_class)) {
            return false;
        }
        return this.id_break.id_class(xc_32);
    }

    @Override
    public JsonObject id_class(rWH rWH2) {
        JsonObject jsonObject = super.id_class(rWH2);
        if (this.id_class != null) {
            jsonObject.addProperty("block", rVL.id_strictfp.id_break(this.id_class).toString());
        }
        jsonObject.add("state", this.id_break.id_class());
        return jsonObject;
    }

    public static JB id_class(xd_3 xd_32) {
        return new JB(ho_3.id_class, xd_32, JS.id_class);
    }
}

