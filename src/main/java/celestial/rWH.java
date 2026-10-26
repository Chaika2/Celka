/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.Gson
 *  com.google.gson.JsonElement
 */
package celestial;

import celestial.rQz_1;
import celestial.rzF_2;
import com.google.gson.Gson;
import com.google.gson.JsonElement;

public class rWH {
    public static final rWH id_class = new rWH();
    private final Gson id_break = rzF_2.id_class().create();

    public final JsonElement id_class(rQz_1[] rQz_1Array) {
        return this.id_break.toJsonTree((Object)rQz_1Array);
    }
}

