/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.mojang.serialization.Codec
 */
package celestial;

import celestial.rTS;
import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

public class rTB<U> {
    protected final List<rTS<U>> id_class;
    private final Random id_break = new Random();

    public Stream<U> id_byte() {
        return this.id_class.stream().map(rTS::id_class);
    }

    private rTB(List<rTS<U>> list) {
        this.id_class = Lists.newArrayList(list);
    }

    public rTB() {
        this(Lists.newArrayList());
    }

    public String toString() {
        return "WeightedList[" + this.id_class + "]";
    }

    public static <U> Codec<rTB<U>> id_class(Codec<U> codec) {
        return rTS.id_class(codec).listOf().xmap(rTB::new, rTB2 -> rTB2.id_class);
    }

    public rTB<U> id_class(U u, int n) {
        this.id_class.add(new rTS<U>(u, n));
        return this;
    }

    public rTB<U> id_class() {
        return this.id_class(this.id_break);
    }

    public rTB<U> id_class(Random random) {
        this.id_class.forEach(rTS2 -> rTS2.id_class(random.nextFloat()));
        this.id_class.sort(Comparator.comparingDouble(rTS2 -> rTS2.id_break()));
        return this;
    }

    public U id_break(Random random) {
        return this.id_class(random).id_byte().findFirst().orElseThrow(RuntimeException::new);
    }

    public boolean id_break() {
        return this.id_class.isEmpty();
    }
}

