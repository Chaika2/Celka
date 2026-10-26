/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 */
package celestial;

import celestial.DI;
import celestial.rCF;
import celestial.rCZ;
import com.google.common.collect.Maps;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Dj_1
implements DI {
    private final Map<rCZ<?>, String> id_class = Maps.newHashMap();

    @Override
    public /* synthetic */ Object get() {
        return this.id_break();
    }

    @SafeVarargs
    public final <T extends Comparable<T>> Dj_1 id_class(rCZ<T> rCZ2, T t, T ... TArray) {
        this.id_class(rCZ2, Dj_1.id_break(rCZ2, t, TArray));
        return this;
    }

    @Override
    public void id_class(rCF<?, ?> rCF2) {
        List list = this.id_class.keySet().stream().filter(rCZ2 -> rCF2.id_class(rCZ2.id_throws()) != rCZ2).collect(Collectors.toList());
        if (!list.isEmpty()) {
            throw new IllegalStateException("Properties " + list + " are missing from " + rCF2);
        }
    }

    private static <T extends Comparable<T>> String id_class(rCZ<T> rCZ2, Stream<T> stream) {
        return stream.map(rCZ2::id_class).collect(Collectors.joining("|"));
    }

    public final <T extends Comparable<T>> Dj_1 id_class(rCZ<T> rCZ2, T t) {
        this.id_class(rCZ2, rCZ2.id_class(t));
        return this;
    }

    private <T extends Comparable<T>> void id_class(rCZ<T> rCZ2, String string) {
        String string2 = this.id_class.put(rCZ2, string);
        if (string2 != null) {
            throw new IllegalStateException("Tried to replace " + rCZ2 + " value from " + string2 + " to " + string);
        }
    }

    private static <T extends Comparable<T>> String id_break(rCZ<T> rCZ2, T t, T[] TArray) {
        return Dj_1.id_class(rCZ2, Stream.concat(Stream.of(t), Stream.of(TArray)));
    }

    public JsonElement id_break() {
        JsonObject jsonObject = new JsonObject();
        this.id_class.forEach((rCZ2, string) -> jsonObject.addProperty(rCZ2.id_throws(), string));
        return jsonObject;
    }
}

