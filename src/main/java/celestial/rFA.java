/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.At_1;
import celestial.ruS_2;
import celestial.ruu_3;
import java.io.IOException;

public class rFA
implements ruS_2<At_1> {
    private int id_class;
    private int id_break;

    public int id_byte() {
        return this.id_break;
    }

    public rFA() {
    }

    public rFA(int n, int n2) {
        this.id_class = n;
        this.id_break = n2;
    }

    @Override
    public void id_class(At_1 at_1) {
        at_1.id_class(this);
    }

    @Override
    public void id_class(ruu_3 ruu_32) throws IOException {
        this.id_class = ruu_32.id_case();
        this.id_break = ruu_32.id_case();
    }

    @Override
    public void id_break(ruu_3 ruu_32) throws IOException {
        ruu_32.id_protected(this.id_class);
        ruu_32.id_protected(this.id_break);
    }

    public int id_break() {
        return this.id_class;
    }
}

