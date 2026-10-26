/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Strings
 *  com.google.common.collect.Iterables
 *  com.google.common.collect.Lists
 *  it.unimi.dsi.fastutil.bytes.ByteOpenHashSet
 *  it.unimi.dsi.fastutil.bytes.ByteSet
 */
package celestial;

import celestial.rcD_2;
import celestial.rcL_2;
import celestial.rcY_2;
import celestial.rcZ_2;
import celestial.rcd_3;
import celestial.rcn_3;
import celestial.rcp_3;
import celestial.rcu_3;
import celestial.rcv_3;
import celestial.rcx_3;
import celestial.rcz_3;
import celestial.rgN_2;
import celestial.rgP_2;
import com.google.common.base.Strings;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.bytes.ByteOpenHashSet;
import it.unimi.dsi.fastutil.bytes.ByteSet;
import java.io.DataOutput;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class rcy_3
extends rcx_3<rcZ_2> {
    public static final rcv_3<rcy_3> id_class = new rcp_3();
    private static final ByteSet id_break = new ByteOpenHashSet(Arrays.asList((byte)1, (byte)2, (byte)3, (byte)4, (byte)5, (byte)6));
    private final List<rcZ_2> id_byte;
    private byte id_private;

    @Override
    public rcZ_2 id_byte(int n) {
        rcZ_2 rcZ_22 = this.id_byte.remove(n);
        this.id_case();
        return rcZ_22;
    }

    @Override
    public /* synthetic */ rcZ_2 id_byte() {
        return this.id_protected();
    }

    @Override
    public void id_byte(int n, rcZ_2 rcZ_22) {
        if (!this.id_break(n, rcZ_22)) {
            throw new UnsupportedOperationException(String.format("Trying to add tag of type %d to list of %d", rcZ_22.id_class(), this.id_private));
        }
    }

    public rcy_3(List<rcZ_2> list, byte by) {
        this.id_byte = list;
        this.id_private = by;
    }

    public rcy_3() {
        this(Lists.newArrayList(), 0);
    }

    @Override
    public /* synthetic */ Object remove(int n) {
        return this.id_byte(n);
    }

    @Override
    public int size() {
        return this.id_byte.size();
    }

    @Override
    public /* synthetic */ Object get(int n) {
        return this.id_finally(n);
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        return object instanceof rcy_3 && Objects.equals(this.id_byte, ((rcy_3)object).id_byte);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("[");
        for (int i = 0; i < this.id_byte.size(); ++i) {
            if (i != 0) {
                stringBuilder.append(',');
            }
            stringBuilder.append(this.id_byte.get(i));
        }
        return stringBuilder.append(']').toString();
    }

    @Override
    public int hashCode() {
        return this.id_byte.hashCode();
    }

    @Override
    public void clear() {
        this.id_byte.clear();
        this.id_private = 0;
    }

    @Override
    public boolean isEmpty() {
        return this.id_byte.isEmpty();
    }

    @Override
    public /* synthetic */ void add(int n, Object object) {
        this.id_byte(n, (rcZ_2)object);
    }

    @Override
    public byte id_class() {
        return 9;
    }

    @Override
    public rgP_2 id_class(String string, int n) {
        if (this.isEmpty()) {
            return new rgN_2("[]");
        }
        if (id_break.contains(this.id_private) && this.size() <= 8) {
            String string2 = ", ";
            rgN_2 rgN_22 = new rgN_2("[");
            for (int i = 0; i < this.id_byte.size(); ++i) {
                if (i != 0) {
                    rgN_22.id_break(", ");
                }
                rgN_22.id_class(this.id_byte.get(i).id_volatile());
            }
            rgN_22.id_break("]");
            return rgN_22;
        }
        rgN_2 rgN_23 = new rgN_2("[");
        if (!string.isEmpty()) {
            rgN_23.id_break("\n");
        }
        String string3 = String.valueOf(',');
        for (int i = 0; i < this.id_byte.size(); ++i) {
            rgN_2 rgN_24 = new rgN_2(Strings.repeat((String)string, (int)(n + 1)));
            rgN_24.id_class(this.id_byte.get(i).id_class(string, n + 1));
            if (i != this.id_byte.size() - 1) {
                rgN_24.id_break(string3).id_break(string.isEmpty() ? " " : "\n");
            }
            rgN_23.id_class(rgN_24);
        }
        if (!string.isEmpty()) {
            rgN_23.id_break("\n").id_break(Strings.repeat((String)string, (int)n));
        }
        rgN_23.id_break("]");
        return rgN_23;
    }

    @Override
    public boolean id_class(int n, rcZ_2 rcZ_22) {
        if (this.id_class(rcZ_22)) {
            this.id_byte.set(n, rcZ_22);
            return true;
        }
        return false;
    }

    private boolean id_class(rcZ_2 rcZ_22) {
        if (rcZ_22.id_class() == 0) {
            return false;
        }
        if (this.id_private == 0) {
            this.id_private = rcZ_22.id_class();
            return true;
        }
        return this.id_private == rcZ_22.id_class();
    }

    public rcd_3 id_class(int n) {
        rcZ_2 rcZ_22;
        if (n >= 0 && n < this.id_byte.size() && (rcZ_22 = this.id_byte.get(n)).id_class() == 10) {
            return (rcd_3)rcZ_22;
        }
        return new rcd_3();
    }

    @Override
    public void id_class(DataOutput dataOutput) throws IOException {
        this.id_private = this.id_byte.isEmpty() ? (byte)0 : this.id_byte.get(0).id_class();
        dataOutput.writeByte(this.id_private);
        dataOutput.writeInt(this.id_byte.size());
        for (rcZ_2 rcZ_22 : this.id_byte) {
            rcZ_22.id_class(dataOutput);
        }
    }

    @Override
    public /* synthetic */ Object set(int n, Object object) {
        return this.id_protected(n, (rcZ_2)object);
    }

    public rcy_3 id_break(int n) {
        rcZ_2 rcZ_22;
        if (n >= 0 && n < this.id_byte.size() && (rcZ_22 = this.id_byte.get(n)).id_class() == 9) {
            return (rcy_3)rcZ_22;
        }
        return new rcy_3();
    }

    public rcv_3<rcy_3> id_break() {
        return id_class;
    }

    @Override
    public boolean id_break(int n, rcZ_2 rcZ_22) {
        if (this.id_class(rcZ_22)) {
            this.id_byte.add(n, rcZ_22);
            return true;
        }
        return false;
    }

    @Override
    public byte id_throws() {
        return this.id_private;
    }

    public int id_throws(int n) {
        rcZ_2 rcZ_22;
        if (n >= 0 && n < this.id_byte.size() && (rcZ_22 = this.id_byte.get(n)).id_class() == 3) {
            return ((rcn_3)rcZ_22).id_case();
        }
        return 0;
    }

    public rcZ_2 id_finally(int n) {
        return this.id_byte.get(n);
    }

    public double id_catch(int n) {
        rcZ_2 rcZ_22;
        if (n >= 0 && n < this.id_byte.size() && (rcZ_22 = this.id_byte.get(n)).id_class() == 6) {
            return ((rcz_3)rcZ_22).id_implements();
        }
        return 0.0;
    }

    private void id_case() {
        if (this.id_byte.isEmpty()) {
            this.id_private = 0;
        }
    }

    public int[] id_case(int n) {
        rcZ_2 rcZ_22;
        if (n >= 0 && n < this.id_byte.size() && (rcZ_22 = this.id_byte.get(n)).id_class() == 11) {
            return ((rcL_2)rcZ_22).id_case();
        }
        return new int[0];
    }

    public String id_implements(int n) {
        if (n >= 0 && n < this.id_byte.size()) {
            rcZ_2 rcZ_22 = this.id_byte.get(n);
            return rcZ_22.id_class() == 8 ? rcZ_22.id_native() : rcZ_22.toString();
        }
        return "";
    }

    public short id_protected(int n) {
        rcZ_2 rcZ_22;
        if (n >= 0 && n < this.id_byte.size() && (rcZ_22 = this.id_byte.get(n)).id_class() == 2) {
            return ((rcD_2)rcZ_22).id_catch();
        }
        return 0;
    }

    public rcy_3 id_protected() {
        List<rcZ_2> list = rcY_2.id_class(this.id_private).id_byte() ? this.id_byte : Iterables.transform(this.id_byte, rcZ_2::id_byte);
        ArrayList arrayList = Lists.newArrayList(list);
        return new rcy_3(arrayList, this.id_private);
    }

    @Override
    public rcZ_2 id_protected(int n, rcZ_2 rcZ_22) {
        rcZ_2 rcZ_23 = this.id_finally(n);
        if (!this.id_class(n, rcZ_22)) {
            throw new UnsupportedOperationException(String.format("Trying to add tag of type %d to list of %d", rcZ_22.id_class(), this.id_private));
        }
        return rcZ_23;
    }

    public float id_private(int n) {
        rcZ_2 rcZ_22;
        if (n >= 0 && n < this.id_byte.size() && (rcZ_22 = this.id_byte.get(n)).id_class() == 5) {
            return ((rcu_3)rcZ_22).id_finally();
        }
        return 0.0f;
    }
}

