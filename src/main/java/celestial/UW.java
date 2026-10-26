/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonElement
 */
package celestial;

import celestial.Do_1;
import celestial.Uk_1;
import celestial.rqO_2;
import celestial.xd_3;
import com.google.gson.JsonElement;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;

@FunctionalInterface
public interface UW {
    public Uk_1 get(xd_3 var1);

    default public UW id_class(Consumer<Do_1> consumer) {
        return xd_32 -> this.get(xd_32).id_class(consumer);
    }

    default public rqO_2 id_class(xd_3 xd_32, String string, BiConsumer<rqO_2, Supplier<JsonElement>> biConsumer) {
        return this.get(xd_32).id_class(xd_32, string, biConsumer);
    }

    default public rqO_2 id_class(xd_3 xd_32, BiConsumer<rqO_2, Supplier<JsonElement>> biConsumer) {
        return this.get(xd_32).id_class(xd_32, biConsumer);
    }
}

