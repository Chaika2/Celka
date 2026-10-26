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

import celestial.rUv_1;
import celestial.reu_3;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.Supplier;

public class rrrI
implements rUv_1 {
    public static final Codec<rrrI> id_class = RecordCodecBuilder.create(instance -> instance.group((App)reu_3.id_break.fieldOf("start_pool").forGetter(rrrI::id_byte), (App)Codec.intRange((int)0, (int)7).fieldOf("size").forGetter(rrrI::id_break)).apply((Applicative)instance, rrrI::new));
    private final Supplier<reu_3> id_break;
    private final int id_byte;

    public Supplier<reu_3> id_byte() {
        return this.id_break;
    }

    public rrrI(Supplier<reu_3> supplier, int n) {
        this.id_break = supplier;
        this.id_byte = n;
    }

    public int id_break() {
        return this.id_byte;
    }
}

