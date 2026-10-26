/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rHF;
import celestial.rfH_2;
import celestial.rmH_2;
import celestial.ruS_2;
import celestial.ruu_3;
import java.io.IOException;

public class rZn_1
implements ruS_2<rmH_2> {
    private rfH_2 id_class;
    private String id_break;
    private boolean id_byte;
    private boolean id_protected;
    private boolean id_throws;
    private rHF id_case;

    public String id_byte() {
        return this.id_break;
    }

    public rZn_1() {
    }

    public rZn_1(rfH_2 rfH_22, String string, rHF rHF2, boolean bl, boolean bl2, boolean bl3) {
        this.id_class = rfH_22;
        this.id_break = string;
        this.id_byte = bl;
        this.id_protected = bl2;
        this.id_throws = bl3;
        this.id_case = rHF2;
    }

    @Override
    public void id_class(rmH_2 rmH_22) {
        rmH_22.id_class(this);
    }

    @Override
    public void id_class(ruu_3 ruu_32) throws IOException {
        this.id_class = ruu_32.id_byte();
        this.id_break = ruu_32.id_throws(Short.MAX_VALUE);
        this.id_case = ruu_32.id_class(rHF.class);
        byte by = ruu_32.readByte();
        this.id_byte = (by & 1) != 0;
        this.id_protected = (by & 2) != 0;
        this.id_throws = (by & 4) != 0;
    }

    public rfH_2 id_break() {
        return this.id_class;
    }

    @Override
    public void id_break(ruu_3 ruu_32) throws IOException {
        ruu_32.id_class(this.id_class);
        ruu_32.id_class(this.id_break);
        ruu_32.id_class(this.id_case);
        int n = 0;
        if (this.id_byte) {
            n |= 1;
        }
        if (this.id_protected) {
            n |= 2;
        }
        if (this.id_throws) {
            n |= 4;
        }
        ruu_32.writeByte(n);
    }

    public boolean id_throws() {
        return this.id_protected;
    }

    public rHF id_catch() {
        return this.id_case;
    }

    public boolean id_case() {
        return this.id_throws;
    }

    public boolean id_protected() {
        return this.id_byte;
    }
}

