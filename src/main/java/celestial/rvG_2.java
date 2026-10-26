/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.At_1;
import celestial.ruS_2;
import celestial.ruu_3;
import java.io.IOException;

public class rvG_2
implements ruS_2<At_1> {
    private int[] id_class;

    public rvG_2() {
    }

    public rvG_2(int ... nArray) {
        this.id_class = nArray;
    }

    @Override
    public void id_class(At_1 at_1) {
        at_1.id_class(this);
    }

    @Override
    public void id_class(ruu_3 ruu_32) throws IOException {
        this.id_class = new int[ruu_32.id_case()];
        for (int i = 0; i < this.id_class.length; ++i) {
            this.id_class[i] = ruu_32.id_case();
        }
    }

    public int[] id_break() {
        return this.id_class;
    }

    @Override
    public void id_break(ruu_3 ruu_32) throws IOException {
        ruu_32.id_protected(this.id_class.length);
        for (int n : this.id_class) {
            ruu_32.id_protected(n);
        }
    }
}

