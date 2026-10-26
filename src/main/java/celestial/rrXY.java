/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rrXC;
import celestial.rrXg_1;
import celestial.rrXt_1;
import java.util.ArrayList;
import java.util.Arrays;

public class rrXY
implements rrXg_1 {
    private rrXC[] id_class;
    private rrXC[] id_break;
    private rrXC[] id_byte;
    private int id_protected = Integer.MAX_VALUE;
    private static final rrXC[] id_throws = new rrXC[0];

    public rrXC[] id_byte() {
        return this.id_byte;
    }

    public rrXY id_byte(rrXC ... rrXCArray) {
        return new rrXY(this.id_class, this.id_break, rrXCArray);
    }

    public rrXY() {
        this(null, null, null);
    }

    public rrXY(rrXC[] rrXCArray, rrXC[] rrXCArray2, rrXC[] rrXCArray3) {
        this(rrXCArray, rrXCArray2, rrXCArray3, Integer.MAX_VALUE);
    }

    public rrXY(rrXC[] rrXCArray, rrXC[] rrXCArray2, rrXC[] rrXCArray3, int n) {
        this.id_class = rrXY.id_protected(rrXCArray);
        this.id_break = rrXY.id_protected(rrXCArray2);
        this.id_byte = rrXY.id_protected(rrXCArray3);
        this.id_protected = n;
    }

    public rrXY id_class(rrXC ... rrXCArray) {
        return new rrXY(rrXCArray, this.id_break, this.id_byte);
    }

    @Override
    public rrXC[] id_class(rrXt_1[] rrXt_1Array) {
        int n = this.id_class.length + this.id_byte.length;
        int n2 = rrXt_1Array.length - n;
        int n3 = 0;
        int n4 = 0;
        while (n4 + this.id_break.length <= n2 && n + n4 + this.id_break.length <= this.id_protected) {
            ++n3;
            n4 += this.id_break.length;
        }
        ArrayList<rrXC> arrayList = new ArrayList<rrXC>();
        arrayList.addAll(Arrays.asList(this.id_class));
        for (int i = 0; i < n3; ++i) {
            arrayList.addAll(Arrays.asList(this.id_break));
        }
        arrayList.addAll(Arrays.asList(this.id_byte));
        return arrayList.toArray(new rrXC[arrayList.size()]);
    }

    public rrXC[] id_class() {
        return this.id_class;
    }

    public rrXY id_class(int n) {
        return new rrXY(this.id_class, this.id_break, this.id_byte, n);
    }

    public rrXY id_break(rrXC ... rrXCArray) {
        return new rrXY(this.id_class, rrXCArray, this.id_byte);
    }

    public rrXC[] id_break() {
        return this.id_break;
    }

    private static rrXC[] id_protected(rrXC[] rrXCArray) {
        return rrXCArray == null ? id_throws : rrXCArray;
    }

    public int id_protected() {
        return this.id_class == null ? 0 : this.id_class.length;
    }
}

