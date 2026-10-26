/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rfH_2;
import celestial.rmH_2;
import celestial.ruS_2;
import celestial.ruu_3;
import java.io.IOException;

public class rZW
implements ruS_2<rmH_2> {
    private int id_class;
    private rfH_2 id_break;

    public rfH_2 id_byte() {
        return this.id_break;
    }

    public rZW() {
    }

    public rZW(int n, rfH_2 rfH_22) {
        this.id_class = n;
        this.id_break = rfH_22;
    }

    @Override
    public void id_class(rmH_2 rmH_22) {
        rmH_22.id_class(this);
    }

    @Override
    public void id_class(ruu_3 ruu_32) throws IOException {
        this.id_class = ruu_32.id_case();
        this.id_break = ruu_32.id_byte();
    }

    @Override
    public void id_break(ruu_3 ruu_32) throws IOException {
        ruu_32.id_protected(this.id_class);
        ruu_32.id_class(this.id_break);
    }

    public int id_break() {
        return this.id_class;
    }
}

