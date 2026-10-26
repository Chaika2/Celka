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

public class reB_2
extends rDQ {
    public static final Codec<reB_2> id_byte = RecordCodecBuilder.create(instance -> instance.group((App)Codec.intRange((int)0, (int)80).fieldOf("limit").orElse((Object)1).forGetter(reB_22 -> reB_22.id_protected), (App)Codec.intRange((int)0, (int)80).fieldOf("upper_limit").orElse((Object)1).forGetter(reB_22 -> reB_22.id_throws), (App)Codec.intRange((int)0, (int)16).fieldOf("lower_size").orElse((Object)0).forGetter(reB_22 -> reB_22.id_case), (App)Codec.intRange((int)0, (int)16).fieldOf("middle_size").orElse((Object)1).forGetter(reB_22 -> reB_22.id_catch), (App)Codec.intRange((int)0, (int)16).fieldOf("upper_size").orElse((Object)1).forGetter(reB_22 -> reB_22.id_private), reB_2.id_class()).apply((Applicative)instance, reB_2::new));
    private final int id_protected;
    private final int id_throws;
    private final int id_case;
    private final int id_catch;
    private final int id_private;

    public reB_2(int n, int n2, int n3, int n4, int n5, OptionalInt optionalInt) {
        super(optionalInt);
        this.id_protected = n;
        this.id_throws = n2;
        this.id_case = n3;
        this.id_catch = n4;
        this.id_private = n5;
    }

    @Override
    public int id_class(int n, int n2) {
        if (n2 < this.id_protected) {
            return this.id_case;
        }
        return n2 >= n - this.id_throws ? this.id_private : this.id_catch;
    }

    @Override
    protected rUh_1<?> id_break() {
        return rUh_1.id_break;
    }
}

