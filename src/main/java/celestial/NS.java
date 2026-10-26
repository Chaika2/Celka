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

import celestial.rqA_2;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class NS {
    public static final Codec<NS> id_class = RecordCodecBuilder.create(instance -> instance.group((App)rqA_2.id_class.fieldOf("sound").forGetter(nS -> nS.id_break), (App)Codec.INT.fieldOf("min_delay").forGetter(nS -> nS.id_byte), (App)Codec.INT.fieldOf("max_delay").forGetter(nS -> nS.id_protected), (App)Codec.BOOL.fieldOf("replace_current_music").forGetter(nS -> nS.id_throws)).apply((Applicative)instance, NS::new));
    private final rqA_2 id_break;
    private final int id_byte;
    private final int id_protected;
    private final boolean id_throws;

    public int id_byte() {
        return this.id_protected;
    }

    public NS(rqA_2 rqA_22, int n, int n2, boolean bl) {
        this.id_break = rqA_22;
        this.id_byte = n;
        this.id_protected = n2;
        this.id_throws = bl;
    }

    public rqA_2 id_class() {
        return this.id_break;
    }

    public int id_break() {
        return this.id_byte;
    }

    public boolean id_protected() {
        return this.id_throws;
    }
}

