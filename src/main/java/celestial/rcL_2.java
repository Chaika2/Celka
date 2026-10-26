/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.ArrayUtils
 */
package celestial;

import celestial.rVi_1;
import celestial.rcA_2;
import celestial.rcK_2;
import celestial.rcZ_2;
import celestial.rcn_3;
import celestial.rcv_3;
import celestial.rcx_3;
import celestial.rgN_2;
import celestial.rgP_2;
import java.io.DataOutput;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import org.apache.commons.lang3.ArrayUtils;

public class rcL_2
extends rcx_3<rcn_3> {
    public static final rcv_3<rcL_2> id_class = new rcA_2();
    private int[] id_break;

    @Override
    public /* synthetic */ rcZ_2 id_byte() {
        return this.id_protected();
    }

    @Override
    public /* synthetic */ rcZ_2 id_byte(int n) {
        return this.id_break(n);
    }

    @Override
    public /* synthetic */ void id_byte(int n, rcZ_2 rcZ_22) {
        this.id_break(n, (rcn_3)rcZ_22);
    }

    public rcL_2(int[] nArray) {
        this.id_break = nArray;
    }

    public rcL_2(List<Integer> list) {
        this(rcL_2.id_class(list));
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
        return object instanceof rcL_2 && Arrays.equals(this.id_break, ((rcL_2)object).id_break);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("[I;");
        for (int i = 0; i < this.id_break.length; ++i) {
            if (i != 0) {
                stringBuilder.append(',');
            }
            stringBuilder.append(this.id_break[i]);
        }
        return stringBuilder.append(']').toString();
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(this.id_break);
    }

    @Override
    public void clear() {
        this.id_break = new int[0];
    }

    @Override
    public /* synthetic */ void add(int n, Object object) {
        this.id_break(n, (rcn_3)object);
    }

    @Override
    public byte id_class() {
        return 11;
    }

    @Override
    public void id_class(DataOutput dataOutput) throws IOException {
        dataOutput.writeInt(this.id_break.length);
        for (int n : this.id_break) {
            dataOutput.writeInt(n);
        }
    }

    private static int[] id_class(List<Integer> list) {
        int[] nArray = new int[list.size()];
        for (int i = 0; i < list.size(); ++i) {
            Integer n = list.get(i);
            nArray[i] = n == null ? 0 : n;
        }
        return nArray;
    }

    @Override
    public rgP_2 id_class(String string, int n) {
        rVi_1 rVi_12 = new rgN_2("I").id_class(id_catch);
        rVi_1 rVi_13 = new rgN_2("[").id_class(rVi_12).id_break(";");
        for (int i = 0; i < this.id_break.length; ++i) {
            rVi_13.id_break(" ").id_class(new rgN_2(String.valueOf(this.id_break[i])).id_class(id_case));
            if (i == this.id_break.length - 1) continue;
            rVi_13.id_break(",");
        }
        rVi_13.id_break("]");
        return rVi_13;
    }

    public rcn_3 id_class(int n) {
        return rcn_3.id_class(this.id_break[n]);
    }

    public rcn_3 id_class(int n, rcn_3 rcn_32) {
        int n2 = this.id_break[n];
        this.id_break[n] = rcn_32.id_case();
        return rcn_3.id_class(n2);
    }

    @Override
    public boolean id_class(int n, rcZ_2 rcZ_22) {
        if (rcZ_22 instanceof rcK_2) {
            this.id_break[n] = ((rcK_2)rcZ_22).id_case();
            return true;
        }
        return false;
    }

    @Override
    public /* synthetic */ Object set(int n, Object object) {
        return this.id_class(n, (rcn_3)object);
    }

    public void id_break(int n, rcn_3 rcn_32) {
        this.id_break = ArrayUtils.add((int[])this.id_break, (int)n, (int)rcn_32.id_case());
    }

    public rcv_3<rcL_2> id_break() {
        return id_class;
    }

    public rcn_3 id_break(int n) {
        int n2 = this.id_break[n];
        this.id_break = ArrayUtils.remove((int[])this.id_break, (int)n);
        return rcn_3.id_class(n2);
    }

    @Override
    public boolean id_break(int n, rcZ_2 rcZ_22) {
        if (rcZ_22 instanceof rcK_2) {
            this.id_break = ArrayUtils.add((int[])this.id_break, (int)n, (int)((rcK_2)rcZ_22).id_case());
            return true;
        }
        return false;
    }

    @Override
    public byte id_throws() {
        return 3;
    }

    public int[] id_case() {
        return this.id_break;
    }

    public rcL_2 id_protected() {
        int[] nArray = new int[this.id_break.length];
        System.arraycopy(this.id_break, 0, nArray, 0, this.id_break.length);
        return new rcL_2(nArray);
    }

    @Override
    public /* synthetic */ rcZ_2 id_protected(int n, rcZ_2 rcZ_22) {
        return this.id_class(n, (rcn_3)rcZ_22);
    }
}

