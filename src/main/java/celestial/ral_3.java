/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
package celestial;

import celestial.raH_2;
import celestial.rrrI;
import celestial.rrrZ;
import celestial.rrrv_1;
import com.mojang.serialization.Codec;

public class ral_3
extends rrrZ<rrrI> {
    public final int id_else;
    public final boolean id_synchronized;
    public final boolean id_return;

    public ral_3(Codec<rrrI> codec, int n, boolean bl, boolean bl2) {
        super(codec);
        this.id_else = n;
        this.id_synchronized = bl;
        this.id_return = bl2;
    }

    @Override
    public rrrv_1<rrrI> id_class() {
        return (rrrZ2, n, n2, rfi_32, n3, l) -> new raH_2(this, n, n2, rfi_32, n3, l);
    }
}

