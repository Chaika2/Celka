/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.At_1;
import celestial.an_3;
import celestial.ruS_2;
import celestial.ruu_3;
import java.io.IOException;
import java.util.List;

public class rFb_1
implements ruS_2<At_1> {
    private int id_class;
    private int[] id_break;

    public int id_byte() {
        return this.id_class;
    }

    public rFb_1() {
    }

    public rFb_1(an_3 an_32) {
        this.id_class = an_32.V();
        List<an_3> list = an_32.Bh();
        this.id_break = new int[list.size()];
        for (int i = 0; i < list.size(); ++i) {
            this.id_break[i] = list.get(i).V();
        }
    }

    @Override
    public void id_class(At_1 at_1) {
        at_1.id_class(this);
    }

    @Override
    public void id_class(ruu_3 ruu_32) throws IOException {
        this.id_class = ruu_32.id_case();
        this.id_break = ruu_32.id_break();
    }

    @Override
    public void id_break(ruu_3 ruu_32) throws IOException {
        ruu_32.id_protected(this.id_class);
        ruu_32.id_class(this.id_break);
    }

    public int[] id_break() {
        return this.id_break;
    }
}

