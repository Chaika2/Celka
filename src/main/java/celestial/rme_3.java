/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rmH_2;
import celestial.ruS_2;
import celestial.ruu_3;
import java.io.IOException;

public class rme_3
implements ruS_2<rmH_2> {
    private int id_break;
    public static int id_class;

    public rme_3() {
    }

    public rme_3(int n) {
        this.id_break = n;
        id_class = n;
    }

    @Override
    public void id_class(rmH_2 rmH_22) {
        rmH_22.id_class(this);
    }

    @Override
    public void id_class(ruu_3 ruu_32) throws IOException {
        id_class = this.id_break = (int)ruu_32.readShort();
    }

    public int id_break() {
        return this.id_break;
    }

    @Override
    public void id_break(ruu_3 ruu_32) throws IOException {
        ruu_32.writeShort(this.id_break);
    }
}

