/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.Streams
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonObject
 */
package celestial;

import celestial.rpY_2;
import celestial.rqO_2;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Streams;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import java.util.List;

public class lc_3 {
    private final List<rqO_2> id_class;

    private lc_3(List<rqO_2> list) {
        this.id_class = list;
    }

    public static lc_3 id_class(JsonObject jsonObject) {
        JsonArray jsonArray = rpY_2.id_class(jsonObject, "textures", (JsonArray)null);
        List list = jsonArray != null ? (List)Streams.stream((Iterable)jsonArray).map(jsonElement -> rpY_2.id_class(jsonElement, "texture")).map(rqO_2::new).collect(ImmutableList.toImmutableList()) : null;
        return new lc_3(list);
    }

    public List<rqO_2> id_class() {
        return this.id_class;
    }
}

