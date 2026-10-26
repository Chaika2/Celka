/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.Gson
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonElement
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package celestial;

import celestial.rQs_1;
import celestial.rQz_1;
import celestial.rqO_2;
import celestial.rzF_2;
import celestial.rzZ_2;
import celestial.rzk_3;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class rWl_1 {
    private static final Logger id_class = LogManager.getLogger();
    private final rqO_2 id_break;
    private final rzZ_2 id_byte;
    private final Gson id_protected = rzF_2.id_class().create();

    public rWl_1(rqO_2 rqO_22, rzZ_2 rzZ_22) {
        this.id_break = rqO_22;
        this.id_byte = rzZ_22;
    }

    public final rQz_1[] id_class(JsonArray jsonArray, String string, rzk_3 rzk_32) {
        rQz_1[] rQz_1Array = (rQz_1[])this.id_protected.fromJson((JsonElement)jsonArray, rQz_1[].class);
        rQs_1 rQs_12 = new rQs_1(rzk_32, this.id_byte::id_class, rqO_22 -> null);
        for (rQz_1 rQz_12 : rQz_1Array) {
            rQz_12.id_class(rQs_12);
            rQs_12.id_class().forEach((string2, string3) -> id_class.warn("Found validation problem in advancement trigger {}/{}: {}", (Object)string, string2, string3));
        }
        return rQz_1Array;
    }

    public rqO_2 id_class() {
        return this.id_break;
    }
}

