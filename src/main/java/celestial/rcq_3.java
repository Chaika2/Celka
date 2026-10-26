/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.longs.LongSet
 *  org.apache.commons.lang3.ArrayUtils
 */
package celestial;

import celestial.rVi_1;
import celestial.rcK_2;
import celestial.rcT_2;
import celestial.rcZ_2;
import celestial.rct_3;
import celestial.rcv_3;
import celestial.rcx_3;
import celestial.rgN_2;
import celestial.rgP_2;
import it.unimi.dsi.fastutil.longs.LongSet;
import java.io.DataOutput;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import org.apache.commons.lang3.ArrayUtils;

public class rcq_3
extends rcx_3<rct_3> {
    public static final rcv_3<rcq_3> id_class = new rcT_2();
    private long[] id_break;

    @Override
    public /* synthetic */ void id_byte(int n, rcZ_2 rcZ_22) {
        this.id_break(n, (rct_3)rcZ_22);
    }

    @Override
    public /* synthetic */ rcZ_2 id_byte(int n) {
        return this.id_break(n);
    }

    @Override
    public /* synthetic */ rcZ_2 id_byte() {
        return this.id_protected();
    }

    public rcq_3(long[] lArray) {
        this.id_break = lArray;
    }

    public rcq_3(List<Long> list) {
        this(rcq_3.id_class(list));
    }

    public rcq_3(LongSet longSet) {
        this.id_break = longSet.toLongArray();
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
        return object instanceof rcq_3 && Arrays.equals(this.id_break, ((rcq_3)object).id_break);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("[L;");
        for (int i = 0; i < this.id_break.length; ++i) {
            if (i != 0) {
                stringBuilder.append(',');
            }
            stringBuilder.append(this.id_break[i]).append('L');
        }
        return stringBuilder.append(']').toString();
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(this.id_break);
    }

    @Override
    public void clear() {
        this.id_break = new long[0];
    }

    @Override
    public /* synthetic */ void add(int n, Object object) {
        this.id_break(n, (rct_3)object);
    }

    @Override
    public byte id_class() {
        return 12;
    }

    public rct_3 id_class(int n, rct_3 rct_32) {
        long l = this.id_break[n];
        this.id_break[n] = rct_32.id_throws();
        return rct_3.id_class(l);
    }

    @Override
    public void id_class(DataOutput dataOutput) throws IOException {
        dataOutput.writeInt(this.id_break.length);
        for (long l : this.id_break) {
            dataOutput.writeLong(l);
        }
    }

    private static long[] id_class(List<Long> list) {
        long[] lArray = new long[list.size()];
        for (int i = 0; i < list.size(); ++i) {
            Long l = list.get(i);
            lArray[i] = l == null ? 0L : l;
        }
        return lArray;
    }

    @Override
    public boolean id_class(int n, rcZ_2 rcZ_22) {
        if (rcZ_22 instanceof rcK_2) {
            this.id_break[n] = ((rcK_2)rcZ_22).id_throws();
            return true;
        }
        return false;
    }

    @Override
    public rgP_2 id_class(String string, int n) {
        rVi_1 rVi_12 = new rgN_2("L").id_class(id_catch);
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

    public rct_3 id_class(int n) {
        return rct_3.id_class(this.id_break[n]);
    }

    @Override
    public /* synthetic */ Object set(int n, Object object) {
        return this.id_class(n, (rct_3)object);
    }

    public rct_3 id_break(int n) {
        long l = this.id_break[n];
        this.id_break = ArrayUtils.remove((long[])this.id_break, (int)n);
        return rct_3.id_class(l);
    }

    @Override
    public boolean id_break(int n, rcZ_2 rcZ_22) {
        if (rcZ_22 instanceof rcK_2) {
            this.id_break = ArrayUtils.add((long[])this.id_break, (int)n, (long)((rcK_2)rcZ_22).id_throws());
            return true;
        }
        return false;
    }

    public void id_break(int n, rct_3 rct_32) {
        this.id_break = ArrayUtils.add((long[])this.id_break, (int)n, (long)rct_32.id_throws());
    }

    public rcv_3<rcq_3> id_break() {
        return id_class;
    }

    @Override
    public byte id_throws() {
        return 4;
    }

    public long[] id_case() {
        return this.id_break;
    }

    public rcq_3 id_protected() {
        long[] lArray = new long[this.id_break.length];
        System.arraycopy(this.id_break, 0, lArray, 0, this.id_break.length);
        return new rcq_3(lArray);
    }

    @Override
    public /* synthetic */ rcZ_2 id_protected(int n, rcZ_2 rcZ_22) {
        return this.id_class(n, (rct_3)rcZ_22);
    }
}

