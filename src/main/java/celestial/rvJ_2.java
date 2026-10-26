/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.At_1;
import celestial.an_3;
import celestial.rYB;
import celestial.rfU_2;
import celestial.rjU_2;
import celestial.ruS_2;
import celestial.ruu_3;
import java.io.IOException;

public class rvJ_2
implements ruS_2<At_1> {
    protected int id_class;
    protected short id_break;
    protected short id_byte;
    protected short id_protected;
    protected byte id_throws;
    protected byte id_case;
    protected boolean id_catch;
    protected boolean id_private;
    protected boolean id_implements;

    public byte id_byte() {
        return this.id_case;
    }

    public rvJ_2() {
    }

    public rvJ_2(int n) {
        this.id_class = n;
    }

    public String toString() {
        return "Entity_" + super.toString();
    }

    @Override
    public void id_class(At_1 at_1) {
        at_1.id_class(this);
    }

    public an_3 id_class(rYB rYB2) {
        return rYB2.id_break(this.id_class);
    }

    public static long id_class(double d) {
        return rfU_2.id_protected(d * 4096.0);
    }

    public rjU_2 id_class(rjU_2 rjU_22) {
        double d = this.id_break == 0 ? rjU_22.id_break : rvJ_2.id_class(rvJ_2.id_class(rjU_22.id_break) + (long)this.id_break);
        double d2 = this.id_byte == 0 ? rjU_22.id_byte : rvJ_2.id_class(rvJ_2.id_class(rjU_22.id_byte) + (long)this.id_byte);
        double d3 = this.id_protected == 0 ? rjU_22.id_protected : rvJ_2.id_class(rvJ_2.id_class(rjU_22.id_protected) + (long)this.id_protected);
        return new rjU_2(d, d2, d3);
    }

    public static rjU_2 id_class(long l, long l2, long l3) {
        return new rjU_2(l, l2, l3).id_class(2.44140625E-4);
    }

    @Override
    public void id_class(ruu_3 ruu_32) throws IOException {
        this.id_class = ruu_32.id_case();
    }

    public static double id_class(long l) {
        return (double)l / 4096.0;
    }

    @Override
    public void id_break(ruu_3 ruu_32) throws IOException {
        ruu_32.id_protected(this.id_class);
    }

    public byte id_break() {
        return this.id_throws;
    }

    public boolean id_throws() {
        return this.id_implements;
    }

    public boolean id_case() {
        return this.id_catch;
    }

    public boolean id_protected() {
        return this.id_private;
    }
}

