/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rcC_2;
import celestial.rcK_2;
import celestial.rcZ_2;
import celestial.rcl_3;
import celestial.rcv_3;
import celestial.rgN_2;
import celestial.rgP_2;
import java.io.DataOutput;
import java.io.IOException;

public class rcn_3
extends rcK_2 {
    public static final rcv_3<rcn_3> id_class = new rcC_2();
    private final int id_break;

    @Override
    public /* synthetic */ rcZ_2 id_byte() {
        return this.id_protected();
    }

    public rcn_3(int n) {
        this.id_break = n;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        return object instanceof rcn_3 && this.id_break == ((rcn_3)object).id_break;
    }

    @Override
    public String toString() {
        return String.valueOf(this.id_break);
    }

    public int hashCode() {
        return this.id_break;
    }

    public static rcn_3 id_class(int n) {
        return n >= -128 && n <= 1024 ? rcl_3.id_class[n + 128] : new rcn_3(n);
    }

    @Override
    public void id_class(DataOutput dataOutput) throws IOException {
        dataOutput.writeInt(this.id_break);
    }

    @Override
    public rgP_2 id_class(String string, int n) {
        return new rgN_2(String.valueOf(this.id_break)).id_class(id_case);
    }

    @Override
    public byte id_class() {
        return 3;
    }

    public rcv_3<rcn_3> id_break() {
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
        return (short)(this.id_break & 0xFFFF);
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

    public rcn_3 id_protected() {
        return this;
    }

    @Override
    public byte id_private() {
        return (byte)(this.id_break & 0xFF);
    }
}

