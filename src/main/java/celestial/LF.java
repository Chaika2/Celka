/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.LA;
import celestial.LL;
import celestial.Lv_1;
import celestial.Ml_1;
import celestial.rgP_2;

public class LF
extends Lv_1 {
    public static final LA id_private = (lF, ml_1, n, n2) -> {};
    protected final LL id_implements;
    protected final LA id_super;

    public LF(int n, int n2, int n3, int n4, rgP_2 rgP_22, LL lL) {
        this(n, n2, n3, n4, rgP_22, lL, id_private);
    }

    public LF(int n, int n2, int n3, int n4, rgP_2 rgP_22, LL lL, LA lA) {
        super(n, n2, n3, n4, rgP_22);
        this.id_implements = lL;
        this.id_super = lA;
    }

    @Override
    public void id_class(Ml_1 ml_1, int n, int n2) {
        this.id_volatile().onTooltip(this, ml_1, n, n2);
    }

    @Override
    public void id_break(Ml_1 ml_1, int n, int n2, float f) {
        super.id_break(ml_1, n, n2, f);
        if (this.B_()) {
            this.id_class(ml_1, n, n2);
        }
    }

    @Override
    public void id_catch() {
        this.id_implements.onPress(this);
    }

    public LA id_volatile() {
        return this.id_super;
    }
}

