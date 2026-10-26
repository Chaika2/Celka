/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.At_1;
import celestial.rgP_2;
import celestial.ruS_2;
import celestial.ruu_3;
import java.io.IOException;

public class rvb_3
implements ruS_2<At_1> {
    private rgP_2 id_class;

    public rvb_3() {
    }

    public rvb_3(rgP_2 rgP_22) {
        this.id_class = rgP_22;
    }

    @Override
    public void id_class(rgP_2 rgP_22) {
        this.id_class = rgP_22;
    }

    @Override
    public void id_class(At_1 at_1) {
        at_1.id_class(this);
    }

    @Override
    public void id_class(ruu_3 ruu_32) throws IOException {
        this.id_class = ruu_32.id_throws();
    }

    @Override
    public void id_break(ruu_3 ruu_32) throws IOException {
        ruu_32.id_class(this.id_class);
    }

    public rgP_2 id_break() {
        return this.id_class;
    }
}

