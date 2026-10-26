/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.At_1;
import celestial.rLR;
import celestial.rLY;
import celestial.ruS_2;
import celestial.ruu_3;
import java.io.IOException;

public class rvT_2
implements ruS_2<At_1> {
    private int id_class;
    private byte id_break;
    private byte id_byte;
    private int id_protected;
    private byte id_throws;

    public int id_byte() {
        return this.id_class;
    }

    public rvT_2() {
    }

    public rvT_2(int n, rLY rLY2) {
        this.id_class = n;
        this.id_break = (byte)(rLR.id_class(rLY2.id_class()) & 0xFF);
        this.id_byte = (byte)(rLY2.id_byte() & 0xFF);
        this.id_protected = rLY2.id_break() > Short.MAX_VALUE ? Short.MAX_VALUE : rLY2.id_break();
        this.id_throws = 0;
        if (rLY2.id_protected()) {
            this.id_throws = (byte)(this.id_throws | 1);
        }
        if (rLY2.id_throws()) {
            this.id_throws = (byte)(this.id_throws | 2);
        }
        if (rLY2.id_case()) {
            this.id_throws = (byte)(this.id_throws | 4);
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
        this.id_byte = ruu_32.readByte();
        this.id_protected = ruu_32.id_case();
        this.id_throws = ruu_32.readByte();
    }

    public boolean id_break() {
        return this.id_protected == Short.MAX_VALUE;
    }

    @Override
    public void id_break(ruu_3 ruu_32) throws IOException {
        ruu_32.id_protected(this.id_class);
        ruu_32.writeByte(this.id_break);
        ruu_32.writeByte(this.id_byte);
        ruu_32.id_protected(this.id_protected);
        ruu_32.writeByte(this.id_throws);
    }

    public byte id_throws() {
        return this.id_byte;
    }

    public boolean id_catch() {
        return (this.id_throws & 2) == 2;
    }

    public int id_case() {
        return this.id_protected;
    }

    public boolean id_implements() {
        return (this.id_throws & 4) == 4;
    }

    public byte id_protected() {
        return this.id_break;
    }

    public boolean id_private() {
        return (this.id_throws & 1) == 1;
    }
}

