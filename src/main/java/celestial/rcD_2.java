/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rVi_1;
import celestial.rcK_2;
import celestial.rcU_2;
import celestial.rcZ_2;
import celestial.rce_3;
import celestial.rcv_3;
import celestial.rgN_2;
import celestial.rgP_2;
import java.io.DataOutput;
import java.io.IOException;

public class rcD_2
extends rcK_2 {
    public static final rcv_3<rcD_2> id_class = new rcU_2();
    private final short id_break;

    @Override
    public /* synthetic */ rcZ_2 id_byte() {
        return this.id_protected();
    }

    public rcD_2(short s) {
        this.id_break = s;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        return object instanceof rcD_2 && this.id_break == ((rcD_2)object).id_break;
    }

    @Override
    public String toString() {
        return this.id_break + "s";
    }

    public int hashCode() {
        return this.id_break;
    }

    public static rcD_2 id_class(short s) {
        return s >= -128 && s <= 1024 ? rce_3.id_class[s + 128] : new rcD_2(s);
    }

    @Override
    public void id_class(DataOutput dataOutput) throws IOException {
        dataOutput.writeShort(this.id_break);
    }

    @Override
    public rgP_2 id_class(String string, int n) {
        rVi_1 rVi_12 = new rgN_2("s").id_class(id_catch);
        return new rgN_2(String.valueOf(this.id_break)).id_class(rVi_12).id_class(id_case);
    }

    @Override
    public byte id_class() {
        return 2;
    }

    public rcv_3<rcD_2> id_break() {
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
        return this.id_break;
    }

    @Override
    public Number id_extends() {
        return this.id_break;
    }

    @Override
    public int id_case() {
        return this.id_break;
    }

    @Override
    public double id_implements() {
        return this.id_break;
    }

    public rcD_2 id_protected() {
        return this;
    }

    @Override
    public byte id_private() {
        return (byte)(this.id_break & 0xFF);
    }
}

