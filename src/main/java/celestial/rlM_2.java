/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableSet
 *  com.google.common.collect.ImmutableSet$Builder
 *  com.google.common.collect.Lists
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 */
package celestial;

import celestial.rlJ_2;
import celestial.rlX_2;
import celestial.rlb_3;
import celestial.rld_3;
import celestial.rlh_3;
import celestial.rlk_3;
import celestial.rlx_3;
import celestial.rpY_2;
import celestial.rqO_2;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Stream;

public class rlM_2 {
    private final List<rld_3> id_class = Lists.newArrayList();

    public JsonObject id_byte() {
        JsonObject jsonObject = new JsonObject();
        JsonArray jsonArray = new JsonArray();
        for (rld_3 rld_32 : this.id_class) {
            rld_32.id_class().id_class(jsonArray);
        }
        jsonObject.addProperty("replace", Boolean.valueOf(false));
        jsonObject.add("values", (JsonElement)jsonArray);
        return jsonObject;
    }

    public rlM_2 id_class(JsonObject jsonObject, String string) {
        JsonArray jsonArray = rpY_2.id_volatile(jsonObject, "values");
        ArrayList arrayList = Lists.newArrayList();
        for (JsonElement jsonElement : jsonArray) {
            arrayList.add(rlM_2.id_class(jsonElement));
        }
        if (rpY_2.id_class(jsonObject, "replace", false)) {
            this.id_class.clear();
        }
        arrayList.forEach(rlh_32 -> this.id_class.add(new rld_3((rlh_3)rlh_32, string)));
        return this;
    }

    private static rlh_3 id_class(JsonElement jsonElement) {
        boolean bl;
        String string;
        Object object;
        if (jsonElement.isJsonObject()) {
            object = jsonElement.getAsJsonObject();
            string = rpY_2.id_case(object, "id");
            bl = rpY_2.id_class(object, "required", true);
        } else {
            string = rpY_2.id_class(jsonElement, "id");
            bl = true;
        }
        if (string.startsWith("#")) {
            object = new rqO_2(string.substring(1));
            return bl ? new rlk_3((rqO_2)object) : new rlx_3((rqO_2)object);
        }
        object = new rqO_2(string);
        return bl ? new rlX_2((rqO_2)object) : new rlJ_2((rqO_2)object);
    }

    public rlM_2 id_class(rqO_2 rqO_22, String string) {
        return this.id_class(new rlX_2(rqO_22), string);
    }

    public rlM_2 id_class(rlh_3 rlh_32, String string) {
        return this.id_class(new rld_3(rlh_32, string));
    }

    public rlM_2 id_class(rld_3 rld_32) {
        this.id_class.add(rld_32);
        return this;
    }

    public static rlM_2 id_class() {
        return new rlM_2();
    }

    public <T> Optional<rlb_3<T>> id_class(Function<rqO_2, rlb_3<T>> function, Function<rqO_2, T> function2) {
        ImmutableSet.Builder builder = ImmutableSet.builder();
        for (rld_3 rld_32 : this.id_class) {
            if (rld_32.id_class().id_class(function, function2, arg_0 -> ((ImmutableSet.Builder)builder).add(arg_0))) continue;
            return Optional.empty();
        }
        return Optional.of(rlb_3.id_class(builder.build()));
    }

    public Stream<rld_3> id_break() {
        return this.id_class.stream();
    }

    public rlM_2 id_break(rqO_2 rqO_22, String string) {
        return this.id_class(new rlk_3(rqO_22), string);
    }

    public <T> Stream<rld_3> id_break(Function<rqO_2, rlb_3<T>> function, Function<rqO_2, T> function2) {
        return this.id_break().filter(rld_32 -> !rld_32.id_class().id_class(function, function2, object -> {}));
    }
}

