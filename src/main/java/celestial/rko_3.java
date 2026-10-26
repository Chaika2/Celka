/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.gson.JsonObject
 */
package celestial;

import celestial.rdb_3;
import celestial.rdn_3;
import celestial.rkR_2;
import celestial.rlZ_2;
import celestial.rlb_3;
import com.google.common.collect.Lists;
import com.google.gson.JsonObject;
import java.util.ArrayList;
import java.util.Collection;

public class rko_3
implements rkR_2 {
    private final rlb_3<rdb_3> id_class;

    public rko_3(rlb_3<rdb_3> rlb_32) {
        this.id_class = rlb_32;
    }

    @Override
    public Collection<rdn_3> id_class() {
        ArrayList arrayList = Lists.newArrayList();
        for (rdb_3 rdb_32 : this.id_class.id_class()) {
            arrayList.add(new rdn_3(rdb_32));
        }
        return arrayList;
    }

    @Override
    public JsonObject id_break() {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("tag", rlZ_2.id_class().id_break().id_break(this.id_class).toString());
        return jsonObject;
    }
}

