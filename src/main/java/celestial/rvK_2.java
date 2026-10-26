/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.At_1;
import celestial.Rm_1;
import celestial.an_3;
import celestial.rYB;
import celestial.rjU_2;
import celestial.ruS_2;
import celestial.ruu_3;
import java.io.IOException;

public class rvK_2
implements ruS_2<At_1> {
    private double id_class;
    private double id_break;
    private double id_byte;
    private int id_protected;
    private Rm_1 id_throws;
    private Rm_1 id_case;
    private boolean id_catch;

    public rvK_2(Rm_1 rm_1, an_3 an_32, Rm_1 rm_12) {
        this.id_throws = rm_1;
        this.id_protected = an_32.V();
        this.id_case = rm_12;
        rjU_2 rjU_22 = rm_12.id_class(an_32);
        this.id_class = rjU_22.id_break;
        this.id_break = rjU_22.id_byte;
        this.id_byte = rjU_22.id_protected;
        this.id_catch = true;
    }

    public rvK_2(Rm_1 rm_1, double d, double d2, double d3) {
        this.id_throws = rm_1;
        this.id_class = d;
        this.id_break = d2;
        this.id_byte = d3;
    }

    public rvK_2() {
    }

    public rjU_2 id_class(rYB rYB2) {
        if (this.id_catch) {
            an_3 an_32 = rYB2.id_break(this.id_protected);
            return an_32 == null ? new rjU_2(this.id_class, this.id_break, this.id_byte) : this.id_case.id_class(an_32);
        }
        return new rjU_2(this.id_class, this.id_break, this.id_byte);
    }

    @Override
    public void id_class(At_1 at_1) {
        at_1.id_class(this);
    }

    @Override
    public void id_class(ruu_3 ruu_32) throws IOException {
        this.id_throws = ruu_32.id_class(Rm_1.class);
        this.id_class = ruu_32.readDouble();
        this.id_break = ruu_32.readDouble();
        this.id_byte = ruu_32.readDouble();
        if (ruu_32.readBoolean()) {
            this.id_catch = true;
            this.id_protected = ruu_32.id_case();
            this.id_case = ruu_32.id_class(Rm_1.class);
        }
    }

    public Rm_1 id_break() {
        return this.id_throws;
    }

    @Override
    public void id_break(ruu_3 ruu_32) throws IOException {
        ruu_32.id_class(this.id_throws);
        ruu_32.writeDouble(this.id_class);
        ruu_32.writeDouble(this.id_break);
        ruu_32.writeDouble(this.id_byte);
        ruu_32.writeBoolean(this.id_catch);
        if (this.id_catch) {
            ruu_32.id_protected(this.id_protected);
            ruu_32.id_class(this.id_case);
        }
    }
}

