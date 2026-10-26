/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Lz_1;
import celestial.Zo_1;
import celestial.rfU_2;
import celestial.rgP_2;
import celestial.rgn_3;

public class ZK
extends Lz_1 {
    public final /* synthetic */ Zo_1 id_class;

    public ZK(Zo_1 zo_1, int n, int n2, int n3, int n4, rgP_2 rgP_22, double d) {
        this.id_class = zo_1;
        super(n, n2, n3, n4, rgP_22, d);
        this.id_catch();
    }

    @Override
    protected void id_catch() {
        this.id_break(new rgn_3("jigsaw_block.levels", this.id_class.id_public));
    }

    @Override
    protected void id_private() {
        this.id_class.id_public = rfU_2.id_byte(rfU_2.id_break(0.0, 7.0, this.id_throws));
    }
}

