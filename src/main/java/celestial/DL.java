/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 */
package celestial;

import celestial.DF;
import celestial.Dw_1;
import celestial.rkf_3;
import celestial.rqO_2;
import com.google.gson.JsonObject;

public class DL
implements Dw_1 {
    public final /* synthetic */ String id_class;
    public final /* synthetic */ DF id_break;

    @Override
    public JsonObject id_byte() {
        return null;
    }

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    public DL(DF dF, String string) {
        this.id_break = dF;
        this.id_class = string;
    }

    @Override
    public void id_class(JsonObject jsonObject) {
    }

    @Override
    public rkf_3<?> id_class() {
        return this.id_break.id_class;
    }

    @Override
    public rqO_2 id_break() {
        return new rqO_2(this.id_class);
    }

    @Override
    public rqO_2 id_protected() {
        return new rqO_2("");
    }
}

