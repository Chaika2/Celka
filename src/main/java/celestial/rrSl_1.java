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

import celestial.rrSx_1;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class rrSl_1
implements rrSx_1 {
    public static final Codec<rrSl_1> id_class = RecordCodecBuilder.create(instance -> instance.group((App)Codec.INT.fieldOf("bottom_offset").orElse((Object)0).forGetter(rrSl_12 -> rrSl_12.id_break), (App)Codec.INT.fieldOf("top_offset").orElse((Object)0).forGetter(rrSl_12 -> rrSl_12.id_byte), (App)Codec.INT.fieldOf("maximum").orElse((Object)0).forGetter(rrSl_12 -> rrSl_12.id_protected)).apply((Applicative)instance, rrSl_1::new));
    public final int id_break;
    public final int id_byte;
    public final int id_protected;

    public rrSl_1(int n, int n2, int n3) {
        this.id_break = n;
        this.id_byte = n2;
        this.id_protected = n3;
    }
}

