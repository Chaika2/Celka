/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rVi_1;
import celestial.rcK_2;
import celestial.rcZ_2;
import celestial.rcm_3;
import celestial.rcv_3;
import celestial.rfU_2;
import celestial.rgN_2;
import celestial.rgP_2;
import java.io.DataOutput;
import java.io.IOException;

public class rcu_3
extends rcK_2 {
    public static final rcu_3 id_class = new rcu_3(0.0f);
    public static final rcv_3<rcu_3> id_break = new rcm_3();
    private final float id_byte;

    @Override
    public /* synthetic */ rcZ_2 id_byte() {
        return this.id_protected();
    }

    private rcu_3(float f) {
        this.id_byte = f;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        return object instanceof rcu_3 && this.id_byte == ((rcu_3)object).id_byte;
    }

    @Override
    public String toString() {
        return this.id_byte + "f";
    }

    public int hashCode() {
        return Float.floatToIntBits(this.id_byte);
    }

    public static rcu_3 id_class(float f) {
        return f == 0.0f ? id_class : new rcu_3(f);
    }

    @Override
    public void id_class(DataOutput dataOutput) throws IOException {
        dataOutput.writeFloat(this.id_byte);
    }

    @Override
    public rgP_2 id_class(String string, int n) {
        rVi_1 rVi_12 = new rgN_2("f").id_class(id_catch);
        return new rgN_2(String.valueOf(this.id_byte)).id_class(rVi_12).id_class(id_case);
    }

    @Override
    public byte id_class() {
        return 5;
    }

    public rcv_3<rcu_3> id_break() {
        return id_break;
    }

    @Override
    public long id_throws() {
        return (long)this.id_byte;
    }

    @Override
    public float id_finally() {
        return this.id_byte;
    }

    @Override
    public short id_catch() {
        return (short)(rfU_2.id_protected(this.id_byte) & 0xFFFF);
    }

    @Override
    public Number id_extends() {
        return Float.valueOf(this.id_byte);
    }

    @Override
    public int id_case() {
        return rfU_2.id_protected(this.id_byte);
    }

    @Override
    public double id_implements() {
        return this.id_byte;
    }

    public rcu_3 id_protected() {
        return this;
    }

    @Override
    public byte id_private() {
        return (byte)(rfU_2.id_protected(this.id_byte) & 0xFF);
    }
}

