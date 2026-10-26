/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
package celestial;

import celestial.rVL;
import celestial.rqM_2;
import com.mojang.serialization.Codec;

public final class rVZ<E> {
    private final rqM_2<? extends rVL<E>> id_class;
    private final Codec<E> id_break;
    private final Codec<E> id_byte;

    public Codec<E> id_byte() {
        return this.id_byte;
    }

    public rVZ(rqM_2<? extends rVL<E>> rqM_22, Codec<E> codec, Codec<E> codec2) {
        this.id_class = rqM_22;
        this.id_break = codec;
        this.id_byte = codec2;
    }

    public rqM_2<? extends rVL<E>> id_class() {
        return this.id_class;
    }

    public Codec<E> id_break() {
        return this.id_break;
    }

    public boolean id_protected() {
        return this.id_byte != null;
    }
}

