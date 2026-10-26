/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 */
package celestial;

import celestial.DP;
import com.google.gson.JsonObject;

public class DB {
    private final T id_break;
    public final /* synthetic */ DP id_class;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    public DB(DP dP, Object object) {
        this.id_class = dP;
        this.id_break = object;
    }

    public String toString() {
        return this.id_class.id_class + "=" + this.id_break;
    }

    public void id_class(JsonObject jsonObject) {
        jsonObject.add(this.id_class.id_class, this.id_class.id_break.apply(this.id_break));
    }
}

