/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 */
package celestial;

import celestial.rVL;
import celestial.rkf_3;
import celestial.rqO_2;
import com.google.gson.JsonObject;

public interface Dw_1 {
    public JsonObject id_byte();

    public rkf_3<?> id_class();

    public void id_class(JsonObject var1);

    public rqO_2 id_break();

    default public JsonObject id_throws() {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("type", rVL.M.id_break(this.id_class()).toString());
        this.id_class(jsonObject);
        return jsonObject;
    }

    public rqO_2 id_protected();
}

