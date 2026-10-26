/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rVi_1;
import celestial.rcI_2;
import celestial.rcK_2;
import celestial.rcZ_2;
import celestial.rcv_3;
import celestial.rcw_3;
import celestial.rgN_2;
import celestial.rgP_2;
import java.io.DataOutput;
import java.io.IOException;

public class rct_3
extends rcK_2 {
    public static final rcv_3<rct_3> id_class = new rcw_3();
    private final long id_break;

    @Override
    public /* synthetic */ rcZ_2 id_byte() {
        return this.id_protected();
    }

    public rct_3(long l) {
        this.id_break = l;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        return object instanceof rct_3 && this.id_break == ((rct_3)object).id_break;
    }

    @Override
    public String toString() {
        return this.id_break + "L";
    }

    public int hashCode() {
        return (int)(this.id_break ^ this.id_break >>> 32);
    }

    public static rct_3 id_class(long l) {
        return l >= -128L && l <= 1024L ? rcI_2.id_class[(int)l + 128] : new rct_3(l);
    }

    @Override
    public void id_class(DataOutput dataOutput) throws IOException {
        dataOutput.writeLong(this.id_break);
    }

    @Override
    public rgP_2 id_class(String string, int n) {
        rVi_1 rVi_12 = new rgN_2("L").id_class(id_catch);
        return new rgN_2(String.valueOf(this.id_break)).id_class(rVi_12).id_class(id_case);
    }

    @Override
    public byte id_class() {
        return 4;
    }

    public rcv_3<rct_3> id_break() {
        return id_class;
    }

    @Override
    public long id_throws() {
        return this.id_break;
    }

    @Override
    public float id_finally() {
        return this.id_break;
    }

    @Override
    public short id_catch() {
        return (short)(this.id_break & 0xFFFFL);
    }

    @Override
    public Number id_extends() {
        return this.id_break;
    }

    @Override
    public int id_case() {
        return (int)(this.id_break & 0xFFFFFFFFFFFFFFFFL);
    }

    @Override
    public double id_implements() {
        return this.id_break;
    }

    public rct_3 id_protected() {
        return this;
    }

    @Override
    public byte id_private() {
        return (byte)(this.id_break & 0xFFL);
    }
}

