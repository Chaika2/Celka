/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonNull
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonSyntaxException
 */
package celestial;

import celestial.Xn_1;
import celestial.an_3;
import celestial.iB_2;
import celestial.rLR;
import celestial.rLY;
import celestial.rVL;
import celestial.rpY_2;
import celestial.rqO_2;
import com.google.common.collect.Maps;
import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.google.gson.JsonSyntaxException;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class XA {
    public static final XA id_class = new XA(Collections.emptyMap());
    private final Map<rLR, Xn_1> id_break;

    public XA(Map<rLR, Xn_1> map) {
        this.id_break = map;
    }

    public static XA id_class() {
        return new XA(Maps.newLinkedHashMap());
    }

    public static XA id_class(JsonElement jsonElement) {
        if (jsonElement != null && !jsonElement.isJsonNull()) {
            JsonObject jsonObject = rpY_2.id_private(jsonElement, "effects");
            LinkedHashMap linkedHashMap = Maps.newLinkedHashMap();
            for (Map.Entry entry : jsonObject.entrySet()) {
                rqO_2 rqO_22 = new rqO_2((String)entry.getKey());
                rLR rLR2 = rVL.id_const.id_break(rqO_22).orElseThrow(() -> new JsonSyntaxException("Unknown effect '" + rqO_22 + "'"));
                Xn_1 xn_1 = Xn_1.id_class(rpY_2.id_private((JsonElement)entry.getValue(), (String)entry.getKey()));
                linkedHashMap.put(rLR2, xn_1);
            }
            return new XA(linkedHashMap);
        }
        return id_class;
    }

    public boolean id_class(Map<rLR, rLY> map) {
        if (this == id_class) {
            return true;
        }
        for (Map.Entry<rLR, Xn_1> entry : this.id_break.entrySet()) {
            rLY rLY2 = map.get(entry.getKey());
            if (entry.getValue().id_class(rLY2)) continue;
            return false;
        }
        return true;
    }

    public XA id_class(rLR rLR2) {
        this.id_break.put(rLR2, new Xn_1());
        return this;
    }

    public boolean id_class(an_3 an_32) {
        if (this == id_class) {
            return true;
        }
        return an_32 instanceof iB_2 ? this.id_class(((iB_2)an_32).sb()) : false;
    }

    public boolean id_class(iB_2 iB_22) {
        return this == id_class ? true : this.id_class(iB_22.sb());
    }

    public JsonElement id_break() {
        if (this == id_class) {
            return JsonNull.INSTANCE;
        }
        JsonObject jsonObject = new JsonObject();
        for (Map.Entry<rLR, Xn_1> entry : this.id_break.entrySet()) {
            jsonObject.add(rVL.id_const.id_break(entry.getKey()).toString(), entry.getValue().id_class());
        }
        return jsonObject;
    }
}

