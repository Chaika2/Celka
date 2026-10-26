/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.ArrayUtils
 */
package celestial;

import celestial.rVi_1;
import celestial.rcK_2;
import celestial.rcO_2;
import celestial.rcZ_2;
import celestial.rch_3;
import celestial.rcv_3;
import celestial.rcx_3;
import celestial.rgN_2;
import celestial.rgP_2;
import java.io.DataOutput;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import org.apache.commons.lang3.ArrayUtils;

public class rcM_2
extends rcx_3<rch_3> {
    public static final rcv_3<rcM_2> id_class = new rcO_2();
    private byte[] id_break;

    @Override
    public rcZ_2 id_byte() {
        byte[] byArray = new byte[this.id_break.length];
        System.arraycopy(this.id_break, 0, byArray, 0, this.id_break.length);
        return new rcM_2(byArray);
    }

    @Override
    public /* synthetic */ void id_byte(int n, rcZ_2 rcZ_22) {
        this.id_break(n, (rch_3)rcZ_22);
    }

    @Override
    public /* synthetic */ rcZ_2 id_byte(int n) {
        return this.id_break(n);
    }

    public rcM_2(byte[] byArray) {
        this.id_break = byArray;
    }

    public rcM_2(List<Byte> list) {
        this(rcM_2.id_class(list));
    }

    @Override
    public /* synthetic */ Object remove(int n) {
        return this.id_break(n);
    }

    @Override
    public int size() {
        return this.id_break.length;
    }

    @Override
    public /* synthetic */ Object get(int n) {
        return this.id_class(n);
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        return object instanceof rcM_2 && Arrays.equals(this.id_break, ((rcM_2)object).id_break);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("[B;");
        for (int i = 0; i < this.id_break.length; ++i) {
            if (i != 0) {
                stringBuilder.append(',');
            }
            stringBuilder.append(this.id_break[i]).append('B');
        }
        return stringBuilder.append(']').toString();
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(this.id_break);
    }

    @Override
    public void clear() {
        this.id_break = new byte[0];
    }

    @Override
    public /* synthetic */ void add(int n, Object object) {
        this.id_break(n, (rch_3)object);
    }

    public rch_3 id_class(int n, rch_3 rch_32) {
        byte by = this.id_break[n];
        this.id_break[n] = rch_32.id_private();
        return rch_3.id_class(by);
    }

    @Override
    public void id_class(DataOutput dataOutput) throws IOException {
        dataOutput.writeInt(this.id_break.length);
        dataOutput.write(this.id_break);
    }

    private static byte[] id_class(List<Byte> list) {
        byte[] byArray = new byte[list.size()];
        for (int i = 0; i < list.size(); ++i) {
            Byte by = list.get(i);
            byArray[i] = by == null ? (byte)0 : by;
        }
        return byArray;
    }

    public rch_3 id_class(int n) {
        return rch_3.id_class(this.id_break[n]);
    }

    @Override
    public byte id_class() {
        return 7;
    }

    @Override
    public rgP_2 id_class(String string, int n) {
        rVi_1 rVi_12 = new rgN_2("B").id_class(id_catch);
        rVi_1 rVi_13 = new rgN_2("[").id_class(rVi_12).id_break(";");
        for (int i = 0; i < this.id_break.length; ++i) {
            rVi_1 rVi_14 = new rgN_2(String.valueOf(this.id_break[i])).id_class(id_case);
            rVi_13.id_break(" ").id_class(rVi_14).id_class(rVi_12);
            if (i == this.id_break.length - 1) continue;
            rVi_13.id_break(",");
        }
        rVi_13.id_break("]");
        return rVi_13;
    }

    @Override
    public boolean id_class(int n, rcZ_2 rcZ_22) {
        if (rcZ_22 instanceof rcK_2) {
            this.id_break[n] = ((rcK_2)rcZ_22).id_private();
            return true;
        }
        return false;
    }

    @Override
    public /* synthetic */ Object set(int n, Object object) {
        return this.id_class(n, (rch_3)object);
    }

    public rcv_3<rcM_2> id_break() {
        return id_class;
    }

    @Override
    public boolean id_break(int n, rcZ_2 rcZ_22) {
        if (rcZ_22 instanceof rcK_2) {
            this.id_break = ArrayUtils.add((byte[])this.id_break, (int)n, (byte)((rcK_2)rcZ_22).id_private());
            return true;
        }
        return false;
    }

    public rch_3 id_break(int n) {
        byte by = this.id_break[n];
        this.id_break = ArrayUtils.remove((byte[])this.id_break, (int)n);
        return rch_3.id_class(by);
    }

    public void id_break(int n, rch_3 rch_32) {
        this.id_break = ArrayUtils.add((byte[])this.id_break, (int)n, (byte)rch_32.id_private());
    }

    @Override
    public byte id_throws() {
        return 1;
    }

    @Override
    public /* synthetic */ rcZ_2 id_protected(int n, rcZ_2 rcZ_22) {
        return this.id_class(n, (rch_3)rcZ_22);
    }

    public byte[] id_protected() {
        return this.id_break;
    }
}

