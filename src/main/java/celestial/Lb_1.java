/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.MoreObjects
 *  com.google.common.collect.Lists
 */
package celestial;

import celestial.LB;
import celestial.LE;
import celestial.LM;
import celestial.LO;
import celestial.LS;
import celestial.LX;
import celestial.Lh_1;
import celestial.Ls_1;
import celestial.rgP_2;
import celestial.rgn_3;
import com.google.common.base.MoreObjects;
import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.List;

public class Lb_1 {
    private static final LS id_break = new LO();
    private static final LS id_byte = new Lh_1(-1, true);
    private static final LS id_protected = new Lh_1(1, true);
    private static final LS id_throws = new Lh_1(1, false);
    public static final rgP_2 id_case = new rgn_3("spectatorMenu.close");
    public static final rgP_2 id_catch = new rgn_3("spectatorMenu.previous_page");
    public static final rgP_2 id_private = new rgn_3("spectatorMenu.next_page");
    public static final LS id_class = new LM();
    private final Ls_1 id_implements;
    private LE id_finally = new LB();
    private int id_extends = -1;
    public int id_native;

    public LE id_byte() {
        return this.id_finally;
    }

    public Lb_1(Ls_1 ls_1) {
        this.id_implements = ls_1;
    }

    public LS id_class(int n) {
        int n2 = n + this.id_native * 6;
        if (this.id_native > 0 && n == 0) {
            return id_byte;
        }
        if (n == 7) {
            return n2 < this.id_finally.id_class().size() ? id_protected : id_throws;
        }
        if (n == 8) {
            return id_break;
        }
        return n2 >= 0 && n2 < this.id_finally.id_class().size() ? (LS)MoreObjects.firstNonNull((Object)this.id_finally.id_class().get(n2), (Object)id_class) : id_class;
    }

    public List<LS> id_class() {
        ArrayList arrayList = Lists.newArrayList();
        for (int i = 0; i <= 8; ++i) {
            arrayList.add(this.id_class(i));
        }
        return arrayList;
    }

    public void id_class(LE lE) {
        this.id_finally = lE;
        this.id_extends = -1;
        this.id_native = 0;
    }

    public void id_break(int n) {
        LS lS = this.id_class(n);
        if (lS != id_class) {
            if (this.id_extends == n && lS.id_protected()) {
                lS.id_class(this);
            } else {
                this.id_extends = n;
            }
        }
    }

    public LS id_break() {
        return this.id_class(this.id_extends);
    }

    public int id_throws() {
        return this.id_extends;
    }

    public LX id_case() {
        return new LX(this.id_finally, this.id_class(), this.id_extends);
    }

    public void id_protected() {
        this.id_implements.id_class(this);
    }
}

