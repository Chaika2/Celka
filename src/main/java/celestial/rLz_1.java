/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
package celestial;

import celestial.rLd_1;
import celestial.rLx_1;
import com.mojang.serialization.Codec;

public abstract class rLz_1<T extends rLx_1> {
    private final boolean id_class;
    private final rLd_1<T> id_break;

    protected rLz_1(boolean bl, rLd_1<T> rLd_12) {
        this.id_class = bl;
        this.id_break = rLd_12;
    }

    public abstract Codec<T> id_break();

    public boolean id_throws() {
        return this.id_class;
    }

    public rLd_1<T> id_case() {
        return this.id_break;
    }
}

