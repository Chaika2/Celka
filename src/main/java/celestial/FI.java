/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.FM;
import celestial.Fb_1;
import celestial.LF;
import celestial.LL;
import celestial.rgP_2;
import celestial.util.MinecraftAccessor;

public abstract class FI
extends LF
implements MinecraftAccessor {
    private final Fb_1<?> id_class;

    public FI(Fb_1<?> fb_1, int n, int n2, int n3, int n4, rgP_2 rgP_22, LL lL) {
        super(n, n2, n3, n4, rgP_22, lL);
        this.id_class = fb_1;
    }

    public boolean id_extends() {
        return true;
    }

    public abstract FM id_implements();

    public abstract void id_private();

    public Fb_1<?> id_native() {
        return this.id_class;
    }
}

