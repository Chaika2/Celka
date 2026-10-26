/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Sets
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParseException
 */
package celestial;

import celestial.VB;
import celestial.jj_3;
import celestial.rAo_1;
import celestial.rpY_2;
import com.google.common.collect.Sets;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.util.HashSet;
import java.util.Map;

public class VS
implements rAo_1<VB> {
    @Override
    public String id_class() {
        return "language";
    }

    public VB id_class(JsonObject jsonObject) {
        HashSet hashSet = Sets.newHashSet();
        for (Map.Entry entry : jsonObject.entrySet()) {
            String string = (String)entry.getKey();
            if (string.length() > 16) {
                throw new JsonParseException("Invalid language->'" + string + "': language code must not be more than 16 characters long");
            }
            JsonObject jsonObject2 = rpY_2.id_private((JsonElement)entry.getValue(), "language");
            String string2 = rpY_2.id_case(jsonObject2, "region");
            String string3 = rpY_2.id_case(jsonObject2, "name");
            boolean bl = rpY_2.id_class(jsonObject2, "bidirectional", false);
            if (string2.isEmpty()) {
                throw new JsonParseException("Invalid language->'" + string + "'->region: empty value");
            }
            if (string3.isEmpty()) {
                throw new JsonParseException("Invalid language->'" + string + "'->name: empty value");
            }
            if (hashSet.add(new jj_3(string, string2, string3, bl))) continue;
            throw new JsonParseException("Duplicate language->'" + string + "' defined");
        }
        return new VB(hashSet);
    }

    @Override
    public /* synthetic */ Object id_break(JsonObject jsonObject) {
        return this.id_class(jsonObject);
    }
}

