/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 */
package celestial;

import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class in_3<T> {
    private final T id_class;
    private long id_break;

    public boolean id_byte() {
        return this.id_break <= 0L;
    }

    public in_3(T t, long l) {
        this.id_class = t;
        this.id_break = l;
    }

    public String toString() {
        return this.id_class.toString() + (String)(this.id_protected() ? " (ttl: " + this.id_break + ")" : "");
    }

    public static <T> Codec<in_3<T>> id_class(Codec<T> codec) {
        return RecordCodecBuilder.create(instance -> instance.group((App)codec.fieldOf("value").forGetter(in_32 -> in_32.id_class), (App)Codec.LONG.optionalFieldOf("ttl").forGetter(in_32 -> in_32.id_protected() ? Optional.of(in_32.id_break) : Optional.empty())).apply((Applicative)instance, (object, optional) -> new in_3<Object>(object, optional.orElse(Long.MAX_VALUE))));
    }

    public static <T> in_3<T> id_class(T t) {
        return new in_3<T>(t, Long.MAX_VALUE);
    }

    public void id_class() {
        if (this.id_protected()) {
            --this.id_break;
        }
    }

    public static <T> in_3<T> id_class(T t, long l) {
        return new in_3<T>(t, l);
    }

    public T id_break() {
        return this.id_class;
    }

    public boolean id_protected() {
        return this.id_break != Long.MAX_VALUE;
    }
}

