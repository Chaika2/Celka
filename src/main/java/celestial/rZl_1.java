/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.an_3;
import celestial.rHm_1;
import celestial.rYB;
import celestial.rmH_2;
import celestial.rsW_2;
import celestial.ruS_2;
import celestial.ruu_3;
import java.io.IOException;

public class rZl_1
implements ruS_2<rmH_2> {
    private int id_class;
    private String id_break;
    private boolean id_byte;

    public boolean id_byte() {
        return this.id_byte;
    }

    public rZl_1() {
    }

    public rZl_1(int n, String string, boolean bl) {
        this.id_class = n;
        this.id_break = string;
        this.id_byte = bl;
    }

    public rHm_1 id_class(rYB rYB2) {
        an_3 an_32 = rYB2.id_break(this.id_class);
        return an_32 instanceof rsW_2 ? ((rsW_2)an_32).id_else() : null;
    }

    @Override
    public void id_class(ruu_3 ruu_32) throws IOException {
        this.id_class = ruu_32.id_case();
        this.id_break = ruu_32.id_throws(Short.MAX_VALUE);
        this.id_byte = ruu_32.readBoolean();
    }

    @Override
    public void id_class(rmH_2 rmH_22) {
        rmH_22.id_class(this);
    }

    public String id_break() {
        return this.id_break;
    }

    @Override
    public void id_break(ruu_3 ruu_32) throws IOException {
        ruu_32.id_protected(this.id_class);
        ruu_32.id_class(this.id_break);
        ruu_32.writeBoolean(this.id_byte);
    }
}

