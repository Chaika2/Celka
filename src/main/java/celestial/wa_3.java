/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 *  com.google.gson.JsonDeserializationContext
 *  com.google.gson.JsonDeserializer
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParseException
 *  com.mojang.datafixers.util.Either
 */
package celestial;

import celestial.IS;
import celestial.IZ;
import celestial.Ig_1;
import celestial.Ik_1;
import celestial.fJ_2;
import celestial.rpY_2;
import celestial.rqO_2;
import celestial.we_3;
import celestial.wi_3;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.mojang.datafixers.util.Either;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class wa_3
implements JsonDeserializer<we_3> {
    private String id_byte(JsonObject jsonObject) {
        return rpY_2.id_class(jsonObject, "parent", "");
    }

    protected boolean id_class(JsonObject jsonObject) {
        return rpY_2.id_class(jsonObject, "ambientocclusion", true);
    }

    private static Either<Ig_1, String> id_class(rqO_2 rqO_22, String string) {
        if (we_3.id_throws(string)) {
            return Either.right((Object)string.substring(1));
        }
        rqO_2 rqO_23 = rqO_2.id_break(string);
        if (rqO_23 == null) {
            throw new JsonParseException(string + " is not valid resource location");
        }
        return Either.left((Object)new Ig_1(rqO_22, rqO_23));
    }

    public we_3 id_class(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        Object object;
        JsonObject jsonObject = jsonElement.getAsJsonObject();
        List<IS> list = this.id_break(jsonDeserializationContext, jsonObject);
        String string = this.id_byte(jsonObject);
        Map<String, Either<Ig_1, String>> map = this.id_break(jsonObject);
        boolean bl = this.id_class(jsonObject);
        Ik_1 ik_1 = Ik_1.id_class;
        if (jsonObject.has("display")) {
            object = rpY_2.id_native(jsonObject, "display");
            ik_1 = (Ik_1)jsonDeserializationContext.deserialize((JsonElement)object, Ik_1.class);
        }
        object = this.id_class(jsonDeserializationContext, jsonObject);
        wi_3 wi_32 = null;
        if (jsonObject.has("gui_light")) {
            wi_32 = wi_3.id_class(rpY_2.id_case(jsonObject, "gui_light"));
        }
        rqO_2 rqO_22 = string.isEmpty() ? null : new rqO_2(string);
        return new we_3(rqO_22, list, map, bl, wi_32, ik_1, (List<IZ>)object);
    }

    protected List<IZ> id_class(JsonDeserializationContext jsonDeserializationContext, JsonObject jsonObject) {
        ArrayList arrayList = Lists.newArrayList();
        if (jsonObject.has("overrides")) {
            for (JsonElement jsonElement : rpY_2.id_volatile(jsonObject, "overrides")) {
                arrayList.add((IZ)jsonDeserializationContext.deserialize(jsonElement, IZ.class));
            }
        }
        return arrayList;
    }

    protected List<IS> id_break(JsonDeserializationContext jsonDeserializationContext, JsonObject jsonObject) {
        ArrayList arrayList = Lists.newArrayList();
        if (jsonObject.has("elements")) {
            for (JsonElement jsonElement : rpY_2.id_volatile(jsonObject, "elements")) {
                arrayList.add((IS)jsonDeserializationContext.deserialize(jsonElement, IS.class));
            }
        }
        return arrayList;
    }

    private Map<String, Either<Ig_1, String>> id_break(JsonObject jsonObject) {
        rqO_2 rqO_22 = fJ_2.id_class;
        HashMap hashMap = Maps.newHashMap();
        if (jsonObject.has("textures")) {
            JsonObject jsonObject2 = rpY_2.id_native(jsonObject, "textures");
            for (Map.Entry entry : jsonObject2.entrySet()) {
                hashMap.put((String)entry.getKey(), wa_3.id_class(rqO_22, ((JsonElement)entry.getValue()).getAsString()));
            }
        }
        return hashMap;
    }

    public /* synthetic */ Object deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        return this.id_class(jsonElement, type, jsonDeserializationContext);
    }
}

