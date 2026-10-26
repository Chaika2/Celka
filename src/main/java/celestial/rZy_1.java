/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rfH_2;
import celestial.rmH_2;
import celestial.ruS_2;
import celestial.ruu_3;
import java.io.IOException;

public class rZy_1
implements ruS_2<rmH_2> {
    private rfH_2 id_class;
    private String[] id_break;

    public String[] id_byte() {
        return this.id_break;
    }

    public rZy_1() {
    }

    public rZy_1(rfH_2 rfH_22, String string, String string2, String string3, String string4) {
        this.id_class = rfH_22;
        this.id_break = new String[]{string, string2, string3, string4};
    }

    @Override
    public void id_class(rmH_2 rmH_22) {
        rmH_22.id_class(this);
    }

    @Override
    public void id_class(ruu_3 ruu_32) throws IOException {
        this.id_class = ruu_32.id_byte();
        this.id_break = new String[4];
        for (int i = 0; i < 4; ++i) {
            this.id_break[i] = ruu_32.id_throws(384);
        }
    }

    @Override
    public void id_break(ruu_3 ruu_32) throws IOException {
        ruu_32.id_class(this.id_class);
        for (int i = 0; i < 4; ++i) {
            ruu_32.id_class(this.id_break[i]);
        }
    }

    public rfH_2 id_break() {
        return this.id_class;
    }
}

