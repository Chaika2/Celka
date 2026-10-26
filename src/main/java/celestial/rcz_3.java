/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rVi_1;
import celestial.rcK_2;
import celestial.rcQ_2;
import celestial.rcZ_2;
import celestial.rcv_3;
import celestial.rfU_2;
import celestial.rgN_2;
import celestial.rgP_2;
import java.io.DataOutput;
import java.io.IOException;

public class rcz_3
extends rcK_2 {
    public static final rcz_3 id_class = new rcz_3(0.0);
    public static final rcv_3<rcz_3> id_break = new rcQ_2();
    private final double id_byte;

    @Override
    public /* synthetic */ rcZ_2 id_byte() {
        return this.id_protected();
    }

    private rcz_3(double d) {
        this.id_byte = d;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        return object instanceof rcz_3 && this.id_byte == ((rcz_3)object).id_byte;
    }

    @Override
    public String toString() {
        return this.id_byte + "d";
    }

    public int hashCode() {
        long l = Double.doubleToLongBits(this.id_byte);
        return (int)(l ^ l >>> 32);
    }

    public static rcz_3 id_class(double d) {
        return d == 0.0 ? id_class : new rcz_3(d);
    }

    @Override
    public void id_class(DataOutput dataOutput) throws IOException {
        dataOutput.writeDouble(this.id_byte);
    }

    @Override
    public rgP_2 id_class(String string, int n) {
        rVi_1 rVi_12 = new rgN_2("d").id_class(id_catch);
        return new rgN_2(String.valueOf(this.id_byte)).id_class(rVi_12).id_class(id_case);
    }

    @Override
    public byte id_class() {
        return 6;
    }

    public rcv_3<rcz_3> id_break() {
        return id_break;
    }

    @Override
    public long id_throws() {
        return (long)Math.floor(this.id_byte);
    }

    @Override
    public float id_finally() {
        return (float)this.id_byte;
    }

    @Override
    public short id_catch() {
        return (short)(rfU_2.id_byte(this.id_byte) & 0xFFFF);
    }

    @Override
    public Number id_extends() {
        return this.id_byte;
    }

    @Override
    public int id_case() {
        return rfU_2.id_byte(this.id_byte);
    }

    @Override
    public double id_implements() {
        return this.id_byte;
    }

    public rcz_3 id_protected() {
        return this;
    }

    @Override
    public byte id_private() {
        return (byte)(rfU_2.id_byte(this.id_byte) & 0xFF);
    }
}

