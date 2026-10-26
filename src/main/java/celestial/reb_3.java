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

import celestial.rDQ;
import celestial.rUh_1;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.OptionalInt;

public class reb_3
extends rDQ {
    public static final Codec<reb_3> id_byte = RecordCodecBuilder.create(instance -> instance.group((App)Codec.intRange((int)0, (int)81).fieldOf("limit").orElse((Object)1).forGetter(reb_32 -> reb_32.id_protected), (App)Codec.intRange((int)0, (int)16).fieldOf("lower_size").orElse((Object)0).forGetter(reb_32 -> reb_32.id_throws), (App)Codec.intRange((int)0, (int)16).fieldOf("upper_size").orElse((Object)1).forGetter(reb_32 -> reb_32.id_case), reb_3.id_class()).apply((Applicative)instance, reb_3::new));
    private final int id_protected;
    private final int id_throws;
    private final int id_case;

    public reb_3(int n, int n2, int n3) {
        this(n, n2, n3, OptionalInt.empty());
    }

    public reb_3(int n, int n2, int n3, OptionalInt optionalInt) {
        super(optionalInt);
        this.id_protected = n;
        this.id_throws = n2;
        this.id_case = n3;
    }

    @Override
    public int id_class(int n, int n2) {
        return n2 < this.id_protected ? this.id_throws : this.id_case;
    }

    @Override
    protected rUh_1<?> id_break() {
        return rUh_1.id_class;
    }
}

