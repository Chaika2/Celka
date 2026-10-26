/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.Lists
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 */
package celestial;

import celestial.DH;
import celestial.DI;
import celestial.DS;
import celestial.Dt_1;
import celestial.Dy_1;
import celestial.rCF;
import celestial.xc_3;
import celestial.xd_3;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.List;

public class Dl_1
implements Dt_1 {
    private final xd_3 id_class;
    private final List<Dy_1> id_break = Lists.newArrayList();

    private Dl_1(xd_3 xd_32) {
        this.id_class = xd_32;
    }

    @Override
    public /* synthetic */ Object get() {
        return this.id_break();
    }

    public Dl_1 id_class(DI dI, List<DS> list) {
        this.id_break.add(new DH(dI, list));
        return this;
    }

    public Dl_1 id_class(DI dI, DS ... dSArray) {
        return this.id_class(dI, (List<DS>)ImmutableList.copyOf((Object[])dSArray));
    }

    public Dl_1 id_class(DI dI, DS dS) {
        return this.id_class(dI, (List<DS>)ImmutableList.of((Object)dS));
    }

    public static Dl_1 id_class(xd_3 xd_32) {
        return new Dl_1(xd_32);
    }

    @Override
    public xd_3 id_class() {
        return this.id_class;
    }

    public Dl_1 id_class(List<DS> list) {
        this.id_break.add(new Dy_1(list));
        return this;
    }

    public Dl_1 id_class(DS dS) {
        return this.id_class((List<DS>)ImmutableList.of((Object)dS));
    }

    public JsonElement id_break() {
        rCF<xd_3, xc_3> rCF2 = this.id_class.id_new();
        this.id_break.forEach(dy_1 -> dy_1.id_class(rCF2));
        JsonArray jsonArray = new JsonArray();
        this.id_break.stream().map(Dy_1::id_class).forEach(arg_0 -> ((JsonArray)jsonArray).add(arg_0));
        JsonObject jsonObject = new JsonObject();
        jsonObject.add("multipart", (JsonElement)jsonArray);
        return jsonObject;
    }
}

