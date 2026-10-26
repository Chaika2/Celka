/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.an_3;
import celestial.rYB;
import celestial.rZT;
import celestial.rjU_2;
import celestial.rmH_2;
import celestial.rpm_3;
import celestial.ruS_2;
import celestial.ruu_3;
import java.io.IOException;

public class rZq_1
implements ruS_2<rmH_2> {
    private int id_class;
    private an_3 id_break;
    private rZT id_byte;
    private rjU_2 id_protected;
    private rpm_3 id_throws;
    private boolean id_case;

    public an_3 id_byte() {
        return this.id_break;
    }

    public rZq_1(an_3 an_32, rpm_3 rpm_32, rjU_2 rjU_22, boolean bl) {
        this.id_class = an_32.V();
        this.id_break = an_32;
        this.id_byte = rZT.INTERACT_AT;
        this.id_throws = rpm_32;
        this.id_protected = rjU_22;
        this.id_case = bl;
    }

    public rZq_1(an_3 an_32, rpm_3 rpm_32, boolean bl) {
        this.id_class = an_32.V();
        this.id_break = an_32;
        this.id_byte = rZT.INTERACT;
        this.id_throws = rpm_32;
        this.id_case = bl;
    }

    public rZq_1() {
    }

    public rZq_1(an_3 an_32, boolean bl) {
        this.id_class = an_32.V();
        this.id_break = an_32;
        this.id_byte = rZT.ATTACK;
        this.id_case = bl;
    }

    public an_3 id_class(rYB rYB2) {
        return rYB2.id_break(this.id_class);
    }

    @Override
    public void id_class(ruu_3 ruu_32) throws IOException {
        this.id_class = ruu_32.id_case();
        this.id_byte = ruu_32.id_class(rZT.class);
        if (this.id_byte == rZT.INTERACT_AT) {
            this.id_protected = new rjU_2(ruu_32.readFloat(), ruu_32.readFloat(), ruu_32.readFloat());
        }
        if (this.id_byte == rZT.INTERACT || this.id_byte == rZT.INTERACT_AT) {
            this.id_throws = ruu_32.id_class(rpm_3.class);
        }
        this.id_case = ruu_32.readBoolean();
    }

    @Override
    public void id_class(rmH_2 rmH_22) {
        rmH_22.id_class(this);
    }

    public rZT id_break() {
        return this.id_byte;
    }

    @Override
    public void id_break(ruu_3 ruu_32) throws IOException {
        ruu_32.id_protected(this.id_class);
        ruu_32.id_class(this.id_byte);
        if (this.id_byte == rZT.INTERACT_AT) {
            ruu_32.writeFloat((float)this.id_protected.id_break);
            ruu_32.writeFloat((float)this.id_protected.id_byte);
            ruu_32.writeFloat((float)this.id_protected.id_protected);
        }
        if (this.id_byte == rZT.INTERACT || this.id_byte == rZT.INTERACT_AT) {
            ruu_32.id_class(this.id_throws);
        }
        ruu_32.writeBoolean(this.id_case);
    }

    public rjU_2 id_throws() {
        return this.id_protected;
    }

    public boolean id_case() {
        return this.id_case;
    }

    public rpm_3 id_protected() {
        return this.id_throws;
    }
}

