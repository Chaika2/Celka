/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rmH_2;
import celestial.ruS_2;
import celestial.ruu_3;
import java.io.IOException;

public class rZL
implements ruS_2<rmH_2> {
    private int id_class;
    private String id_break;

    public String id_byte() {
        return this.id_break;
    }

    public rZL() {
    }

    public rZL(int n, String string) {
        this.id_class = n;
        this.id_break = string;
    }

    @Override
    public void id_class(rmH_2 rmH_22) {
        rmH_22.id_class(this);
    }

    @Override
    public void id_class(ruu_3 ruu_32) throws IOException {
        this.id_class = ruu_32.id_case();
        this.id_break = ruu_32.id_throws(32500);
    }

    @Override
    public void id_break(ruu_3 ruu_32) throws IOException {
        ruu_32.id_protected(this.id_class);
        ruu_32.id_class(this.id_break, 32500);
    }

    public int id_break() {
        return this.id_class;
    }
}

