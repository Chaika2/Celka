/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.At_1;
import celestial.rVL;
import celestial.rfH_2;
import celestial.rpr_3;
import celestial.rsO_2;
import celestial.rsh_3;
import celestial.ruS_2;
import celestial.ruu_3;
import java.io.IOException;
import java.util.UUID;

public class rFx_1
implements ruS_2<At_1> {
    private int id_class;
    private UUID id_break;
    private rfH_2 id_byte;
    private rpr_3 id_protected;
    private int id_throws;

    public UUID id_byte() {
        return this.id_break;
    }

    public rFx_1() {
    }

    public rFx_1(rsO_2 rsO_22) {
        this.id_class = rsO_22.V();
        this.id_break = rsO_22.ro();
        this.id_byte = rsO_22.id_implements();
        this.id_protected = rsO_22.Pg();
        this.id_throws = rVL.P.id_class(rsO_22.id_catch);
    }

    @Override
    public void id_class(At_1 at_1) {
        at_1.id_class(this);
    }

    @Override
    public void id_class(ruu_3 ruu_32) throws IOException {
        this.id_class = ruu_32.id_case();
        this.id_break = ruu_32.id_private();
        this.id_throws = ruu_32.id_case();
        this.id_byte = ruu_32.id_byte();
        this.id_protected = rpr_3.id_break(ruu_32.readUnsignedByte());
    }

    public int id_break() {
        return this.id_class;
    }

    @Override
    public void id_break(ruu_3 ruu_32) throws IOException {
        ruu_32.id_protected(this.id_class);
        ruu_32.id_class(this.id_break);
        ruu_32.id_protected(this.id_throws);
        ruu_32.id_class(this.id_byte);
        ruu_32.writeByte(this.id_protected.id_protected());
    }

    public rpr_3 id_throws() {
        return this.id_protected;
    }

    public rsh_3 id_case() {
        return rVL.P.id_class(this.id_throws);
    }

    public rfH_2 id_protected() {
        return this.id_byte;
    }
}

