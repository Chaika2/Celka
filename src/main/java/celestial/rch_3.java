/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rVi_1;
import celestial.rcJ_2;
import celestial.rcK_2;
import celestial.rcX_2;
import celestial.rcZ_2;
import celestial.rcv_3;
import celestial.rgN_2;
import celestial.rgP_2;
import java.io.DataOutput;
import java.io.IOException;

public class rch_3
extends rcK_2 {
    public static final rcv_3<rch_3> id_class = new rcX_2();
    public static final rch_3 id_break = rch_3.id_class((byte)0);
    public static final rch_3 id_byte = rch_3.id_class((byte)1);
    private final byte id_private;

    @Override
    public /* synthetic */ rcZ_2 id_byte() {
        return this.id_protected();
    }

    public rch_3(byte by) {
        this.id_private = by;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        return object instanceof rch_3 && this.id_private == ((rch_3)object).id_private;
    }

    @Override
    public String toString() {
        return this.id_private + "b";
    }

    public int hashCode() {
        return this.id_private;
    }

    public static rch_3 id_class(byte by) {
        return rcJ_2.id_class[128 + by];
    }

    public static rch_3 id_class(boolean bl) {
        return bl ? id_byte : id_break;
    }

    @Override
    public rgP_2 id_class(String string, int n) {
        rVi_1 rVi_12 = new rgN_2("b").id_class(id_catch);
        return new rgN_2(String.valueOf(this.id_private)).id_class(rVi_12).id_class(id_case);
    }

    @Override
    public void id_class(DataOutput dataOutput) throws IOException {
        dataOutput.writeByte(this.id_private);
    }

    @Override
    public byte id_class() {
        return 1;
    }

    public rcv_3<rch_3> id_break() {
        return id_class;
    }

    @Override
    public long id_throws() {
        return this.id_private;
    }

    @Override
    public float id_finally() {
        return this.id_private;
    }

    @Override
    public short id_catch() {
        return this.id_private;
    }

    @Override
    public Number id_extends() {
        return this.id_private;
    }

    @Override
    public int id_case() {
        return this.id_private;
    }

    @Override
    public double id_implements() {
        return this.id_private;
    }

    public rch_3 id_protected() {
        return this;
    }

    @Override
    public byte id_private() {
        return this.id_private;
    }
}

