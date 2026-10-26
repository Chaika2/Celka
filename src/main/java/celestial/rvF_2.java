/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.At_1;
import celestial.rrGO;
import celestial.rrGb_1;
import celestial.rrGh_1;
import celestial.ruS_2;
import celestial.ruu_3;
import java.io.IOException;
import java.util.Collection;

public class rvF_2
implements ruS_2<At_1> {
    private int id_class;
    private byte id_break;
    private boolean id_byte;
    private boolean id_protected;
    private rrGO[] id_throws;
    private int id_case;
    private int id_catch;
    private int id_private;
    private int id_implements;
    private byte[] id_finally;

    public rvF_2() {
    }

    public rvF_2(int n, byte by, boolean bl, boolean bl2, Collection<rrGO> collection, byte[] byArray, int n2, int n3, int n4, int n5) {
        this.id_class = n;
        this.id_break = by;
        this.id_byte = bl;
        this.id_protected = bl2;
        this.id_throws = collection.toArray(new rrGO[collection.size()]);
        this.id_case = n2;
        this.id_catch = n3;
        this.id_private = n4;
        this.id_implements = n5;
        this.id_finally = new byte[n4 * n5];
        for (int i = 0; i < n4; ++i) {
            for (int j = 0; j < n5; ++j) {
                this.id_finally[i + j * n4] = byArray[n2 + i + (n3 + j) * 128];
            }
        }
    }

    @Override
    public void id_class(rrGb_1 rrGb_12) {
        int n;
        rrGb_12.id_case = this.id_break;
        rrGb_12.id_protected = this.id_byte;
        rrGb_12.id_private = this.id_protected;
        rrGb_12.id_finally.clear();
        for (n = 0; n < this.id_throws.length; ++n) {
            rrGO rrGO2 = this.id_throws[n];
            rrGb_12.id_finally.put("icon-" + n, rrGO2);
        }
        for (n = 0; n < this.id_private; ++n) {
            for (int i = 0; i < this.id_implements; ++i) {
                rrGb_12.id_catch[this.id_case + n + (this.id_catch + i) * 128] = this.id_finally[n + i * this.id_private];
            }
        }
    }

    @Override
    public void id_class(At_1 at_1) {
        at_1.id_class(this);
    }

    @Override
    public void id_class(ruu_3 ruu_32) throws IOException {
        this.id_class = ruu_32.id_case();
        this.id_break = ruu_32.readByte();
        this.id_byte = ruu_32.readBoolean();
        this.id_protected = ruu_32.readBoolean();
        this.id_throws = new rrGO[ruu_32.id_case()];
        for (int i = 0; i < this.id_throws.length; ++i) {
            rrGh_1 rrGh_12 = ruu_32.id_class(rrGh_1.class);
            this.id_throws[i] = new rrGO(rrGh_12, ruu_32.readByte(), ruu_32.readByte(), (byte)(ruu_32.readByte() & 0xF), ruu_32.readBoolean() ? ruu_32.id_throws() : null);
        }
        this.id_private = ruu_32.readUnsignedByte();
        if (this.id_private > 0) {
            this.id_implements = ruu_32.readUnsignedByte();
            this.id_case = ruu_32.readUnsignedByte();
            this.id_catch = ruu_32.readUnsignedByte();
            this.id_finally = ruu_32.id_class();
        }
    }

    @Override
    public void id_break(ruu_3 ruu_32) throws IOException {
        ruu_32.id_protected(this.id_class);
        ruu_32.writeByte(this.id_break);
        ruu_32.writeBoolean(this.id_byte);
        ruu_32.writeBoolean(this.id_protected);
        ruu_32.id_protected(this.id_throws.length);
        for (rrGO rrGO2 : this.id_throws) {
            ruu_32.id_class(rrGO2.id_break());
            ruu_32.writeByte(rrGO2.id_byte());
            ruu_32.writeByte(rrGO2.id_protected());
            ruu_32.writeByte(rrGO2.id_throws() & 0xF);
            if (rrGO2.id_catch() != null) {
                ruu_32.writeBoolean(true);
                ruu_32.id_class(rrGO2.id_catch());
                continue;
            }
            ruu_32.writeBoolean(false);
        }
        ruu_32.writeByte(this.id_private);
        if (this.id_private > 0) {
            ruu_32.writeByte(this.id_implements);
            ruu_32.writeByte(this.id_case);
            ruu_32.writeByte(this.id_catch);
            ruu_32.id_class(this.id_finally);
        }
    }

    public int id_break() {
        return this.id_class;
    }
}

