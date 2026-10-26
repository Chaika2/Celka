/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.LR;
import celestial.Lo_1;
import celestial.Ml_1;
import celestial.cC_2;
import celestial.cm_3;
import celestial.rgP_2;
import celestial.vm_3;
import java.util.Collections;
import java.util.List;

public class LY
extends Lo_1 {
    private final rgP_2 id_break;
    private final int id_byte;
    public final /* synthetic */ LR id_class;

    public LY(LR lR, rgP_2 rgP_22) {
        this.id_class = lR;
        this.id_break = rgP_22;
        this.id_byte = ((cm_3)lR.id_native.id_class[15]).id_class(this.id_break);
    }

    @Override
    public void id_class(Ml_1 ml_1, int n, int n2, int n3, int n4, int n5, int n6, int n7, boolean bl, float f) {
        ((cm_3)this.id_class.id_native.id_class[15]).id_byte(ml_1, this.id_break, ((vm_3)this.id_class.id_native.id_class[73]).id_package / 2 - this.id_byte / 2, n2 + n5 - 9 - 1, 0xFFFFFF);
    }

    @Override
    public boolean id_break(boolean bl) {
        return false;
    }

    @Override
    public List<? extends cC_2> x_() {
        return Collections.emptyList();
    }
}

