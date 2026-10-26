/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.At_1;
import celestial.rhx_3;
import celestial.ruS_2;
import celestial.ruu_3;
import java.io.IOException;

public class rvf_3
implements ruS_2<At_1> {
    private boolean id_class;
    private boolean id_break;
    private boolean id_byte;
    private boolean id_protected;
    private float id_throws;
    private float id_case;

    public boolean id_byte() {
        return this.id_break;
    }

    public rvf_3() {
    }

    public rvf_3(rhx_3 rhx_32) {
        this.id_class = rhx_32.id_class;
        this.id_break = rhx_32.id_break;
        this.id_byte = rhx_32.id_byte;
        this.id_protected = rhx_32.id_protected;
        this.id_throws = rhx_32.id_class();
        this.id_case = rhx_32.id_break();
    }

    @Override
    public void id_class(At_1 at_1) {
        at_1.id_class(this);
    }

    @Override
    public void id_class(ruu_3 ruu_32) throws IOException {
        byte by = ruu_32.readByte();
        this.id_class = (by & 1) != 0;
        this.id_break = (by & 2) != 0;
        this.id_byte = (by & 4) != 0;
        this.id_protected = (by & 8) != 0;
        this.id_throws = ruu_32.readFloat();
        this.id_case = ruu_32.readFloat();
    }

    public boolean id_break() {
        return this.id_class;
    }

    @Override
    public void id_break(ruu_3 ruu_32) throws IOException {
        byte by = 0;
        if (this.id_class) {
            by = (byte)(by | 1);
        }
        if (this.id_break) {
            by = (byte)(by | 2);
        }
        if (this.id_byte) {
            by = (byte)(by | 4);
        }
        if (this.id_protected) {
            by = (byte)(by | 8);
        }
        ruu_32.writeByte(by);
        ruu_32.writeFloat(this.id_throws);
        ruu_32.writeFloat(this.id_case);
    }

    public boolean id_throws() {
        return this.id_protected;
    }

    public float id_catch() {
        return this.id_case;
    }

    public float id_case() {
        return this.id_throws;
    }

    public boolean id_protected() {
        return this.id_byte;
    }
}

