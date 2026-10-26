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

import celestial.rYG;
import celestial.rYY;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Supplier;

public class rYo_1
extends rYY {
    public static final Codec<rYo_1> id_throws = RecordCodecBuilder.create(instance -> instance.group((App)rYG.id_throws.fieldOf("biomes").forGetter(rYo_12 -> rYo_12.id_case), (App)Codec.intRange((int)0, (int)62).fieldOf("scale").orElse((Object)2).forGetter(rYo_12 -> rYo_12.id_private)).apply((Applicative)instance, rYo_1::new));
    private final List<Supplier<rYG>> id_case;
    private final int id_catch;
    private final int id_private;

    public rYo_1(List<Supplier<rYG>> list, int n) {
        super(list.stream());
        this.id_case = list;
        this.id_catch = n + 2;
        this.id_private = n;
    }

    @Override
    protected Codec<? extends rYY> id_class() {
        return id_throws;
    }

    @Override
    public rYY id_class(long l) {
        return this;
    }

    @Override
    public rYG id_protected(int n, int n2, int n3) {
        return this.id_case.get(Math.floorMod((n >> this.id_catch) + (n3 >> this.id_catch), this.id_case.size())).get();
    }
}

