/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 */
package celestial;

import celestial.hZ_2;
import celestial.hk_3;
import celestial.ho_3;
import celestial.rWH;
import celestial.rYB;
import celestial.rqM_2;
import com.google.gson.JsonObject;

public class hW_2
extends hZ_2 {
    private final rqM_2<rYB> id_class;
    private final rqM_2<rYB> id_break;

    public hW_2(ho_3 ho_32, rqM_2<rYB> rqM_22, rqM_2<rYB> rqM_23) {
        super(hk_3.id_class, ho_32);
        this.id_class = rqM_22;
        this.id_break = rqM_23;
    }

    @Override
    public JsonObject id_class(rWH rWH2) {
        JsonObject jsonObject = super.id_class(rWH2);
        if (this.id_class != null) {
            jsonObject.addProperty("from", this.id_class.id_class().toString());
        }
        if (this.id_break != null) {
            jsonObject.addProperty("to", this.id_break.id_class().toString());
        }
        return jsonObject;
    }

    public boolean id_class(rqM_2<rYB> rqM_22, rqM_2<rYB> rqM_23) {
        if (this.id_class != null && this.id_class != rqM_22) {
            return false;
        }
        return this.id_break == null || this.id_break == rqM_23;
    }

    public static hW_2 id_class(rqM_2<rYB> rqM_22) {
        return new hW_2(ho_3.id_class, null, rqM_22);
    }
}

