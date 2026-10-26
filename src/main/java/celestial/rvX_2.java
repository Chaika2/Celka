/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.At_1;
import celestial.rmE_2;
import celestial.rmG_2;
import celestial.ruS_2;
import celestial.ruu_3;
import java.io.IOException;
import java.util.List;

public class rvX_2
implements ruS_2<At_1> {
    private int id_class;
    private List<rmG_2<?>> id_break;

    public int id_byte() {
        return this.id_class;
    }

    public rvX_2() {
    }

    public rvX_2(int n, rmE_2 rmE_22, boolean bl) {
        this.id_class = n;
        if (bl) {
            this.id_break = rmE_22.id_byte();
            rmE_22.id_throws();
        } else {
            this.id_break = rmE_22.id_break();
        }
    }

    @Override
    public void id_class(At_1 at_1) {
        at_1.id_class(this);
    }

    @Override
    public void id_class(ruu_3 ruu_32) throws IOException {
        this.id_class = ruu_32.id_case();
        this.id_break = rmE_2.id_class(ruu_32);
    }

    @Override
    public void id_break(ruu_3 ruu_32) throws IOException {
        ruu_32.id_protected(this.id_class);
        rmE_2.id_class(this.id_break, ruu_32);
    }

    public List<rmG_2<?>> id_break() {
        return this.id_break;
    }
}

