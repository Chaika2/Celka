/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.At_1;
import celestial.rRJ;
import celestial.rRl_1;
import celestial.rVL;
import celestial.rYB;
import celestial.rqM_2;
import celestial.ruS_2;
import celestial.ruu_3;
import java.io.IOException;

public class rFP
implements ruS_2<At_1> {
    private rRJ id_class;
    private rqM_2<rYB> id_break;
    private long id_byte;
    private rRl_1 id_protected;
    private rRl_1 id_throws;
    private boolean id_case;
    private boolean id_catch;
    private boolean id_private;

    public rqM_2<rYB> id_byte() {
        return this.id_break;
    }

    public rFP() {
    }

    public rFP(rRJ rRJ2, rqM_2<rYB> rqM_22, long l, rRl_1 rRl_12, rRl_1 rRl_13, boolean bl, boolean bl2, boolean bl3) {
        this.id_class = rRJ2;
        this.id_break = rqM_22;
        this.id_byte = l;
        this.id_protected = rRl_12;
        this.id_throws = rRl_13;
        this.id_case = bl;
        this.id_catch = bl2;
        this.id_private = bl3;
    }

    @Override
    public void id_class(ruu_3 ruu_32) throws IOException {
        this.id_class = ruu_32.id_class(rRJ.id_final).get();
        this.id_break = rqM_2.id_class(rVL.id_static, ruu_32.id_volatile());
        this.id_byte = ruu_32.readLong();
        this.id_protected = rRl_1.id_class(ruu_32.readUnsignedByte());
        this.id_throws = rRl_1.id_class(ruu_32.readUnsignedByte());
        this.id_case = ruu_32.readBoolean();
        this.id_catch = ruu_32.readBoolean();
        this.id_private = ruu_32.readBoolean();
    }

    @Override
    public void id_class(At_1 at_1) {
        at_1.id_class(this);
    }

    public rRJ id_break() {
        return this.id_class;
    }

    @Override
    public void id_break(ruu_3 ruu_32) throws IOException {
        ruu_32.id_class(rRJ.id_final, () -> this.id_class);
        ruu_32.id_class(this.id_break.id_class());
        ruu_32.writeLong(this.id_byte);
        ruu_32.writeByte(this.id_protected.id_class());
        ruu_32.writeByte(this.id_throws.id_class());
        ruu_32.writeBoolean(this.id_case);
        ruu_32.writeBoolean(this.id_catch);
        ruu_32.writeBoolean(this.id_private);
    }

    public rRl_1 id_throws() {
        return this.id_protected;
    }

    public boolean id_catch() {
        return this.id_case;
    }

    public rRl_1 id_case() {
        return this.id_throws;
    }

    public boolean id_implements() {
        return this.id_private;
    }

    public long id_protected() {
        return this.id_byte;
    }

    public boolean id_private() {
        return this.id_catch;
    }
}

