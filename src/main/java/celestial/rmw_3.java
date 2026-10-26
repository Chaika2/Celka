/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rhJ_2;
import celestial.rmH_2;
import celestial.rpZ_2;
import celestial.ruS_2;
import celestial.ruu_3;
import java.io.IOException;

public class rmw_3
implements ruS_2<rmH_2> {
    private String id_class;
    private int id_break;
    private rhJ_2 id_byte;
    private boolean id_protected;
    private int id_throws;
    private rpZ_2 id_case;

    public boolean id_byte() {
        return this.id_protected;
    }

    public rmw_3() {
    }

    public rmw_3(String string, int n, rhJ_2 rhJ_22, boolean bl, int n2, rpZ_2 rpZ_22) {
        this.id_class = string;
        this.id_break = n;
        this.id_byte = rhJ_22;
        this.id_protected = bl;
        this.id_throws = n2;
        this.id_case = rpZ_22;
    }

    @Override
    public void id_class(rmH_2 rmH_22) {
        rmH_22.id_class(this);
    }

    @Override
    public void id_class(ruu_3 ruu_32) throws IOException {
        this.id_class = ruu_32.id_throws(16);
        this.id_break = ruu_32.readByte();
        this.id_byte = ruu_32.id_class(rhJ_2.class);
        this.id_protected = ruu_32.readBoolean();
        this.id_throws = ruu_32.readUnsignedByte();
        this.id_case = ruu_32.id_class(rpZ_2.class);
    }

    public rhJ_2 id_break() {
        return this.id_byte;
    }

    @Override
    public void id_break(ruu_3 ruu_32) throws IOException {
        ruu_32.id_class(this.id_class);
        ruu_32.writeByte(this.id_break);
        ruu_32.id_class(this.id_byte);
        ruu_32.writeBoolean(this.id_protected);
        ruu_32.writeByte(this.id_throws);
        ruu_32.id_class(this.id_case);
    }

    public rpZ_2 id_throws() {
        return this.id_case;
    }

    public int id_protected() {
        return this.id_throws;
    }
}

