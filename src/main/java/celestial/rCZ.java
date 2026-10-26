/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.MoreObjects
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 */
package celestial;

import celestial.rCn_1;
import celestial.rCv_1;
import com.google.common.base.MoreObjects;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.Collection;
import java.util.Optional;
import java.util.stream.Stream;

public abstract class rCZ<T extends Comparable<T>> {
    private final Class<T> id_class;
    private final String id_break;
    private Integer id_byte;
    private final Codec<T> id_protected = Codec.STRING.comapFlatMap(string -> this.id_break((String)string).map(DataResult::success).orElseGet(() -> DataResult.error((String)("Unable to read property: " + this + " with value: " + string))), this::id_class);
    private final Codec<rCv_1<T>> id_throws = this.id_protected.xmap(this::id_break, rCv_1::id_break);

    public Stream<rCv_1<T>> id_byte() {
        return this.id_class().stream().map(this::id_break);
    }

    protected rCZ(String string2, Class<T> clazz) {
        this.id_class = clazz;
        this.id_break = string2;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof rCZ)) {
            return false;
        }
        rCZ rCZ2 = (rCZ)object;
        return this.id_class.equals(rCZ2.id_class) && this.id_break.equals(rCZ2.id_break);
    }

    public String toString() {
        return MoreObjects.toStringHelper((Object)this).add("name", (Object)this.id_break).add("clazz", this.id_class).add("values", this.id_class()).toString();
    }

    public final int hashCode() {
        if (this.id_byte == null) {
            this.id_byte = this.id_break();
        }
        return this.id_byte;
    }

    public abstract String id_class(T var1);

    public rCv_1<T> id_class(rCn_1<?, ?> rCn_12) {
        return new rCv_1(this, rCn_12.id_byte(this));
    }

    public abstract Collection<T> id_class();

    public abstract Optional<T> id_break(String var1);

    public int id_break() {
        return 31 * this.id_class.hashCode() + this.id_break.hashCode();
    }

    public rCv_1<T> id_break(T t) {
        return new rCv_1<T>(this, t);
    }

    public String id_throws() {
        return this.id_break;
    }

    public Class<T> id_case() {
        return this.id_class;
    }

    public Codec<rCv_1<T>> id_protected() {
        return this.id_throws;
    }
}

