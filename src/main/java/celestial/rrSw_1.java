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

public class rrSw_1 {
    public static final Codec<rrSw_1> id_class = RecordCodecBuilder.create(instance -> instance.group((App)Codec.INT.fieldOf("target").forGetter(rrSw_1::id_class), (App)Codec.intRange((int)0, (int)256).fieldOf("size").forGetter(rrSw_1::id_break), (App)Codec.INT.fieldOf("offset").forGetter(rrSw_1::id_byte)).apply((Applicative)instance, rrSw_1::new));
    private final int id_break;
    private final int id_byte;
    private final int id_protected;

    public int id_byte() {
        return this.id_protected;
    }

    public rrSw_1(int n, int n2, int n3) {
        this.id_break = n;
        this.id_byte = n2;
        this.id_protected = n3;
    }

    public int id_class() {
        return this.id_break;
    }

    public int id_break() {
        return this.id_byte;
    }
}

