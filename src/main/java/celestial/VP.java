/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParseException
 *  org.apache.commons.lang3.Validate
 */
package celestial;

import celestial.ja_3;
import celestial.ji_3;
import celestial.rAo_1;
import celestial.rpY_2;
import com.google.common.collect.Lists;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.util.ArrayList;
import org.apache.commons.lang3.Validate;

public class VP
implements rAo_1<ji_3> {
    @Override
    public String id_class() {
        return "animation";
    }

    private ja_3 id_class(int n, JsonElement jsonElement) {
        if (jsonElement.isJsonPrimitive()) {
            return new ja_3(rpY_2.id_case(jsonElement, "frames[" + n + "]"));
        }
        if (jsonElement.isJsonObject()) {
            JsonObject jsonObject = rpY_2.id_private(jsonElement, "frames[" + n + "]");
            int n2 = rpY_2.id_class(jsonObject, "time", -1);
            if (jsonObject.has("time")) {
                Validate.inclusiveBetween((long)1L, (long)Integer.MAX_VALUE, (long)n2, (String)"Invalid frame time");
            }
            int n3 = rpY_2.id_extends(jsonObject, "index");
            Validate.inclusiveBetween((long)0L, (long)Integer.MAX_VALUE, (long)n3, (String)"Invalid frame index");
            return new ja_3(n3, n2);
        }
        return null;
    }

    public ji_3 id_class(JsonObject jsonObject) {
        int n;
        ArrayList arrayList = Lists.newArrayList();
        int n2 = rpY_2.id_class(jsonObject, "frametime", 1);
        if (n2 != 1) {
            Validate.inclusiveBetween((long)1L, (long)Integer.MAX_VALUE, (long)n2, (String)"Invalid default frame time");
        }
        if (jsonObject.has("frames")) {
            try {
                JsonArray jsonArray = rpY_2.id_volatile(jsonObject, "frames");
                for (n = 0; n < jsonArray.size(); ++n) {
                    JsonElement jsonElement = jsonArray.get(n);
                    ja_3 ja_32 = this.id_class(n, jsonElement);
                    if (ja_32 == null) continue;
                    arrayList.add(ja_32);
                }
            }
            catch (ClassCastException classCastException) {
                throw new JsonParseException("Invalid animation->frames: expected array, was " + jsonObject.get("frames"), (Throwable)classCastException);
            }
        }
        int n3 = rpY_2.id_class(jsonObject, "width", -1);
        n = rpY_2.id_class(jsonObject, "height", -1);
        if (n3 != -1) {
            Validate.inclusiveBetween((long)1L, (long)Integer.MAX_VALUE, (long)n3, (String)"Invalid width");
        }
        if (n != -1) {
            Validate.inclusiveBetween((long)1L, (long)Integer.MAX_VALUE, (long)n, (String)"Invalid height");
        }
        boolean bl = rpY_2.id_class(jsonObject, "interpolate", false);
        return new ji_3(arrayList, n3, n, n2, bl);
    }

    @Override
    public /* synthetic */ Object id_break(JsonObject jsonObject) {
        return this.id_class(jsonObject);
    }
}

