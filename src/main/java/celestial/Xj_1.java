/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonNull
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParseException
 *  it.unimi.dsi.fastutil.objects.Object2BooleanMap
 *  it.unimi.dsi.fastutil.objects.Object2BooleanMap$Entry
 *  it.unimi.dsi.fastutil.objects.Object2BooleanOpenHashMap
 */
package celestial;

import celestial.OT;
import celestial.Of_1;
import celestial.XF;
import celestial.XR;
import celestial.XV;
import celestial.XY;
import celestial.Xg_1;
import celestial.an_3;
import celestial.hs_3;
import celestial.rCa_1;
import celestial.rCi_1;
import celestial.rRl_1;
import celestial.rVL;
import celestial.rWs_1;
import celestial.rhN_2;
import celestial.rlr_3;
import celestial.rpY_2;
import celestial.rqO_2;
import com.google.common.collect.Maps;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import it.unimi.dsi.fastutil.objects.Object2BooleanMap;
import it.unimi.dsi.fastutil.objects.Object2BooleanOpenHashMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Xj_1 {
    public static final Xj_1 id_class = new XR().id_class();
    private final XF id_break;
    private final rRl_1 id_byte;
    private final Map<rCi_1<?>, XF> id_protected;
    private final Object2BooleanMap<rqO_2> id_throws;
    private final Map<rqO_2, XY> id_case;

    public Xj_1(XF xF, rRl_1 rRl_12, Map<rCi_1<?>, XF> map, Object2BooleanMap<rqO_2> object2BooleanMap, Map<rqO_2, XY> map2) {
        this.id_break = xF;
        this.id_byte = rRl_12;
        this.id_protected = map;
        this.id_throws = object2BooleanMap;
        this.id_case = map2;
    }

    private static /* synthetic */ void id_class(JsonObject jsonObject, rqO_2 rqO_22, XY xY) {
        jsonObject.add(rqO_22.toString(), xY.id_class());
    }

    private static /* synthetic */ void id_class(JsonObject jsonObject, rqO_2 rqO_22, Boolean bl) {
        jsonObject.addProperty(rqO_22.toString(), bl);
    }

    public JsonElement id_class() {
        JsonArray jsonArray;
        if (this == id_class) {
            return JsonNull.INSTANCE;
        }
        JsonObject jsonObject = new JsonObject();
        jsonObject.add("level", this.id_break.id_protected());
        if (this.id_byte != rRl_1.NOT_SET) {
            jsonObject.addProperty("gamemode", this.id_byte.id_break());
        }
        if (!this.id_protected.isEmpty()) {
            jsonArray = new JsonArray();
            this.id_protected.forEach((rCi_12, xF) -> {
                JsonObject jsonObject = new JsonObject();
                jsonObject.addProperty("type", rVL.h.id_break(rCi_12.id_protected()).toString());
                jsonObject.addProperty("stat", Xj_1.id_class(rCi_12).toString());
                jsonObject.add("value", xF.id_protected());
                jsonArray.add((JsonElement)jsonObject);
            });
            jsonObject.add("stats", (JsonElement)jsonArray);
        }
        if (!this.id_throws.isEmpty()) {
            jsonArray = new JsonObject();
            this.id_throws.forEach((arg_0, arg_1) -> Xj_1.id_class((JsonObject)jsonArray, arg_0, arg_1));
            jsonObject.add("recipes", (JsonElement)jsonArray);
        }
        if (!this.id_case.isEmpty()) {
            jsonArray = new JsonObject();
            this.id_case.forEach((arg_0, arg_1) -> Xj_1.id_class((JsonObject)jsonArray, arg_0, arg_1));
            jsonObject.add("advancements", (JsonElement)jsonArray);
        }
        return jsonObject;
    }

    private static /* synthetic */ void id_class(Object2BooleanMap object2BooleanMap, Map.Entry entry) {
        boolean bl = rpY_2.id_byte((JsonElement)entry.getValue(), "criterion test");
        object2BooleanMap.put((Object)((String)entry.getKey()), bl);
    }

    public boolean id_class(an_3 an_32) {
        if (this == id_class) {
            return true;
        }
        if (!(an_32 instanceof rhN_2)) {
            return false;
        }
        rhN_2 rhN_22 = (rhN_2)an_32;
        if (!this.id_break.id_byte((Integer)rhN_22.id_implements[19])) {
            return false;
        }
        if (this.id_byte != rRl_1.NOT_SET && this.id_byte != rhN_22.id_finally.id_break()) {
            return false;
        }
        rCa_1 rCa_12 = rhN_22.id_long();
        for (Map.Entry<rCi_1<?>, XF> object : this.id_protected.entrySet()) {
            int of_1 = rCa_12.id_class(object.getKey());
            if (object.getValue().id_byte(of_1)) continue;
            return false;
        }
        rWs_1 rWs_12 = rhN_22.id_float();
        for (Object2BooleanMap.Entry entry : this.id_throws.object2BooleanEntrySet()) {
            if (rWs_12.id_break((rqO_2)entry.getKey()) == entry.getBooleanValue()) continue;
            return false;
        }
        if (!this.id_case.isEmpty()) {
            hs_3 hs_32 = rhN_22.r();
            Of_1 of_1 = rhN_22.rC().t();
            for (Map.Entry<rqO_2, XY> entry : this.id_case.entrySet()) {
                OT oT = of_1.id_class(entry.getKey());
                if (oT != null && entry.getValue().test(hs_32.id_break(oT))) continue;
                return false;
            }
        }
        return true;
    }

    public static Xj_1 id_class(JsonElement jsonElement) {
        if (jsonElement != null && !jsonElement.isJsonNull()) {
            Object object;
            Object object2;
            Object object3;
            Object object42;
            Object object5;
            JsonElement jsonElement22;
            JsonObject jsonObject = rpY_2.id_private(jsonElement, "player");
            XF xF = XF.id_class(jsonObject.get("level"));
            String string = rpY_2.id_class(jsonObject, "gamemode", "");
            rRl_1 rRl_12 = rRl_1.id_class(string, rRl_1.NOT_SET);
            HashMap hashMap = Maps.newHashMap();
            JsonArray jsonArray = rpY_2.id_class(jsonObject, "stats", (JsonArray)null);
            if (jsonArray != null) {
                for (JsonElement jsonElement22 : jsonArray) {
                    object5 = rpY_2.id_private(jsonElement22, "stats entry");
                    object42 = new rqO_2(rpY_2.id_case((JsonObject)object5, "type"));
                    object3 = rVL.h.id_class((rqO_2)object42);
                    if (object3 == null) {
                        throw new JsonParseException("Invalid stat type: " + (rqO_2)object42);
                    }
                    rqO_2 rqO_22 = new rqO_2(rpY_2.id_case((JsonObject)object5, "stat"));
                    object2 = Xj_1.id_class(object3, rqO_22);
                    object = XF.id_class(object5.get("value"));
                    hashMap.put(object2, object);
                }
            }
            Iterator iterator = new Object2BooleanOpenHashMap();
            jsonElement22 = rpY_2.id_class(jsonObject, "recipes", new JsonObject());
            for (Object object42 : jsonElement22.entrySet()) {
                object3 = new rqO_2((String)object42.getKey());
                boolean bl = rpY_2.id_byte((JsonElement)object42.getValue(), "recipe present");
                iterator.put(object3, bl);
            }
            object5 = Maps.newHashMap();
            object42 = rpY_2.id_class(jsonObject, "advancements", new JsonObject());
            for (Map.Entry entry : object42.entrySet()) {
                object2 = new rqO_2((String)entry.getKey());
                object = Xj_1.id_break((JsonElement)entry.getValue());
                object5.put(object2, object);
            }
            return new Xj_1(xF, rRl_12, hashMap, (Object2BooleanMap<rqO_2>)iterator, (Map<rqO_2, XY>)object5);
        }
        return id_class;
    }

    private static <T> rCi_1<T> id_class(rlr_3<T> rlr_32, rqO_2 rqO_22) {
        rVL<T> rVL2 = rlr_32.id_class();
        T t = rVL2.id_class(rqO_22);
        if (t == null) {
            throw new JsonParseException("Unknown object " + rqO_22 + " for stat type " + rVL.h.id_break(rlr_32));
        }
        return rlr_32.id_break(t);
    }

    private static <T> rqO_2 id_class(rCi_1<T> rCi_12) {
        return rCi_12.id_protected().id_class().id_break(rCi_12.id_throws());
    }

    private static XY id_break(JsonElement jsonElement) {
        if (jsonElement.isJsonPrimitive()) {
            boolean bl = jsonElement.getAsBoolean();
            return new XV(bl);
        }
        Object2BooleanOpenHashMap object2BooleanOpenHashMap = new Object2BooleanOpenHashMap();
        JsonObject jsonObject = rpY_2.id_private(jsonElement, "criterion data");
        jsonObject.entrySet().forEach(arg_0 -> Xj_1.id_class((Object2BooleanMap)object2BooleanOpenHashMap, arg_0));
        return new Xg_1((Object2BooleanMap<String>)object2BooleanOpenHashMap);
    }
}

