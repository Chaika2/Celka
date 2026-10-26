/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.LF;
import celestial.LL;
import celestial.rgN_2;

public class rrXi_1
extends LF {
    public final int id_class;

    public rrXi_1(int n, int n2, int n3, String string) {
        this(n, n2, n3, 200, 20, string, (LF lF) -> {});
    }

    public rrXi_1(int n, int n2, int n3, int n4, int n5, String string) {
        this(n, n2, n3, n4, n5, string, (LF lF) -> {});
    }

    public rrXi_1(int n, int n2, int n3, int n4, int n5, String string, LL lL) {
        super(n2, n3, n4, n5, new rgN_2(string), lL);
        this.id_class = n;
    }

    public void id_class(String string) {
        super.id_break(new rgN_2(string));
    }
}

