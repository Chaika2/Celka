/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
package celestial;

import celestial.At_1;
import celestial.rRo_1;
import celestial.rfj_3;
import celestial.rjh_3;
import celestial.roH_2;
import celestial.rrse_3;
import celestial.ruS_2;
import celestial.ruu_3;
import com.google.common.collect.Lists;
import java.io.IOException;
import java.util.List;

public class rFC
implements ruS_2<At_1> {
    private int id_class;
    private int id_break;
    private int id_byte;
    private int id_protected;
    private int id_throws;
    private int id_case;
    private List<byte[]> id_catch;
    private List<byte[]> id_private;
    private boolean id_implements;

    public int id_byte() {
        return this.id_break;
    }

    public rFC() {
    }

    public rFC(rfj_3 rfj_32, rrse_3 rrse_32, int n, int n2, boolean bl) {
        this.id_class = rfj_32.id_break;
        this.id_break = rfj_32.id_byte;
        this.id_implements = bl;
        this.id_byte = n;
        this.id_protected = n2;
        this.id_catch = Lists.newArrayList();
        this.id_private = Lists.newArrayList();
        for (int i = 0; i < 18; ++i) {
            roH_2 roH_22;
            if ((this.id_byte & 1 << i) != 0) {
                roH_22 = rrse_32.id_class(rRo_1.SKY).id_class(rjh_3.id_class(rfj_32, -1 + i));
                if (roH_22 != null && !roH_22.id_byte()) {
                    this.id_catch.add((byte[])roH_22.id_class().clone());
                } else {
                    this.id_byte &= ~(1 << i);
                    if (roH_22 != null) {
                        this.id_throws |= 1 << i;
                    }
                }
            }
            if ((this.id_protected & 1 << i) == 0) continue;
            roH_22 = rrse_32.id_class(rRo_1.BLOCK).id_class(rjh_3.id_class(rfj_32, -1 + i));
            if (roH_22 != null && !roH_22.id_byte()) {
                this.id_private.add((byte[])roH_22.id_class().clone());
                continue;
            }
            this.id_protected &= ~(1 << i);
            if (roH_22 == null) continue;
            this.id_case |= 1 << i;
        }
    }

    public rFC(rfj_3 rfj_32, rrse_3 rrse_32, boolean bl) {
        this.id_class = rfj_32.id_break;
        this.id_break = rfj_32.id_byte;
        this.id_implements = bl;
        this.id_catch = Lists.newArrayList();
        this.id_private = Lists.newArrayList();
        for (int i = 0; i < 18; ++i) {
            roH_2 roH_22 = rrse_32.id_class(rRo_1.SKY).id_class(rjh_3.id_class(rfj_32, -1 + i));
            roH_2 roH_23 = rrse_32.id_class(rRo_1.BLOCK).id_class(rjh_3.id_class(rfj_32, -1 + i));
            if (roH_22 != null) {
                if (roH_22.id_byte()) {
                    this.id_throws |= 1 << i;
                } else {
                    this.id_byte |= 1 << i;
                    this.id_catch.add((byte[])roH_22.id_class().clone());
                }
            }
            if (roH_23 == null) continue;
            if (roH_23.id_byte()) {
                this.id_case |= 1 << i;
                continue;
            }
            this.id_protected |= 1 << i;
            this.id_private.add((byte[])roH_23.id_class().clone());
        }
    }

    @Override
    public void id_class(At_1 at_1) {
        at_1.id_class(this);
    }

    @Override
    public void id_class(ruu_3 ruu_32) throws IOException {
        int n;
        this.id_class = ruu_32.id_case();
        this.id_break = ruu_32.id_case();
        this.id_implements = ruu_32.readBoolean();
        this.id_byte = ruu_32.id_case();
        this.id_protected = ruu_32.id_case();
        this.id_throws = ruu_32.id_case();
        this.id_case = ruu_32.id_case();
        this.id_catch = Lists.newArrayList();
        for (n = 0; n < 18; ++n) {
            if ((this.id_byte & 1 << n) == 0) continue;
            this.id_catch.add(ruu_32.id_break(2048));
        }
        this.id_private = Lists.newArrayList();
        for (n = 0; n < 18; ++n) {
            if ((this.id_protected & 1 << n) == 0) continue;
            this.id_private.add(ruu_32.id_break(2048));
        }
    }

    public int id_break() {
        return this.id_class;
    }

    @Override
    public void id_break(ruu_3 ruu_32) throws IOException {
        ruu_32.id_protected(this.id_class);
        ruu_32.id_protected(this.id_break);
        ruu_32.writeBoolean(this.id_implements);
        ruu_32.id_protected(this.id_byte);
        ruu_32.id_protected(this.id_protected);
        ruu_32.id_protected(this.id_throws);
        ruu_32.id_protected(this.id_case);
        for (byte[] byArray : this.id_catch) {
            ruu_32.id_class(byArray);
        }
        for (byte[] byArray : this.id_private) {
            ruu_32.id_class(byArray);
        }
    }

    public int id_throws() {
        return this.id_throws;
    }

    public boolean id_finally() {
        return this.id_implements;
    }

    public int id_catch() {
        return this.id_protected;
    }

    public List<byte[]> id_case() {
        return this.id_catch;
    }

    public List<byte[]> id_implements() {
        return this.id_private;
    }

    public int id_protected() {
        return this.id_byte;
    }

    public int id_private() {
        return this.id_case;
    }
}

