/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 */
package celestial;

import celestial.ho_3;
import celestial.hr_3;
import celestial.rWH;
import celestial.rqO_2;
import com.google.gson.JsonObject;

public abstract class hZ_2
implements hr_3 {
    private final rqO_2 id_class;
    private final ho_3 id_break;

    protected ho_3 id_byte() {
        return this.id_break;
    }

    public hZ_2(rqO_2 rqO_22, ho_3 ho_32) {
        this.id_class = rqO_22;
        this.id_break = ho_32;
    }

    public String toString() {
        return "AbstractCriterionInstance{criterion=" + this.id_class + "}";
    }

    @Override
    public JsonObject id_class(rWH rWH2) {
        JsonObject jsonObject = new JsonObject();
        jsonObject.add("player", this.id_break.id_class(rWH2));
        return jsonObject;
    }

    @Override
    public rqO_2 id_class() {
        return this.id_class;
    }
}

