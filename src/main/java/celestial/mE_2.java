/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
package celestial;

import celestial.Lm_1;
import celestial.Ml_1;
import celestial.QY;
import celestial.cb_3;
import celestial.cm_3;
import celestial.mG_2;
import celestial.mJ_2;
import celestial.mS_2;
import celestial.mb_3;
import celestial.ms_3;
import celestial.rkU_2;
import celestial.rkw_3;
import celestial.vm_3;
import com.google.common.collect.Lists;
import java.util.List;

public class mE_2 {
    private final List<mJ_2> id_class = Lists.newArrayListWithCapacity((int)20);
    private mJ_2 id_break;
    private final mb_3 id_byte = new mb_3();
    private QY id_protected;
    private final List<mS_2> id_throws = Lists.newArrayList();
    private List<mG_2> id_case;
    private Lm_1 id_catch;
    private Lm_1 id_private;
    private int id_implements;
    private int id_finally;
    private rkU_2 id_extends;
    private rkw_3<?> id_native;
    private mG_2 id_volatile;

    public void id_byte() {
        this.id_byte.id_class(false);
    }

    public mE_2() {
        for (int i = 0; i < 20; ++i) {
            this.id_class.add(new mJ_2());
        }
    }

    public void id_class(Ml_1 ml_1, int n, int n2, int n3, int n4, float f) {
        if (this.id_implements > 1) {
            String string = this.id_finally + 1 + "/" + this.id_implements;
            int n5 = ((cm_3)this.id_protected.id_class[15]).id_break(string);
            ((cm_3)this.id_protected.id_class[15]).id_break(ml_1, string, (float)(n - n5 / 2 + 73), (float)(n2 + 141), -1);
        }
        this.id_break = null;
        for (mJ_2 mJ_22 : this.id_class) {
            mJ_22.id_class(ml_1, n3, n4, f);
            if (!mJ_22.id_new || !mJ_22.B_()) continue;
            this.id_break = mJ_22;
        }
        this.id_private.id_class(ml_1, n3, n4, f);
        this.id_catch.id_class(ml_1, n3, n4, f);
        this.id_byte.id_class(ml_1, n3, n4, f);
    }

    public void id_class(Ml_1 ml_1, int n, int n2) {
        if ((vm_3)this.id_protected.id_class[73] != null && this.id_break != null && !this.id_byte.id_throws()) {
            ((vm_3)this.id_protected.id_class[73]).id_class(ml_1, this.id_break.id_class((vm_3)this.id_protected.id_class[73]), n, n2);
        }
    }

    public rkw_3<?> id_class() {
        return this.id_native;
    }

    public void id_class(List<rkw_3<?>> list) {
        for (mS_2 mS_22 : this.id_throws) {
            mS_22.id_class(list);
        }
    }

    public boolean id_class(double d, double d2, int n, int n2, int n3, int n4, int n5) {
        this.id_native = null;
        this.id_volatile = null;
        if (this.id_byte.id_throws()) {
            if (this.id_byte.id_break(d, d2, n)) {
                this.id_native = this.id_byte.id_protected();
                this.id_volatile = this.id_byte.id_class();
            } else {
                this.id_byte.id_class(false);
            }
            return true;
        }
        if (this.id_catch.id_break(d, d2, n)) {
            ++this.id_finally;
            this.id_case();
            return true;
        }
        if (this.id_private.id_break(d, d2, n)) {
            --this.id_finally;
            this.id_case();
            return true;
        }
        for (mJ_2 mJ_22 : this.id_class) {
            if (!mJ_22.id_break(d, d2, n)) continue;
            if (n == 0) {
                this.id_native = mJ_22.id_throws();
                this.id_volatile = mJ_22.id_class();
            } else if (n == 1 && !this.id_byte.id_throws() && !mJ_22.id_protected()) {
                this.id_byte.id_class(this.id_protected, mJ_22.id_class(), mJ_22.id_volatile, mJ_22.id_final, n2 + n4 / 2, n3 + 13 + n5 / 2, (float)mJ_22.id_case());
            }
            return true;
        }
        return false;
    }

    public void id_class(ms_3 ms_32) {
        this.id_throws.remove(ms_32);
        this.id_throws.add(ms_32);
    }

    public void id_class(QY qY, int n, int n2) {
        this.id_protected = qY;
        this.id_extends = ((cb_3)qY.id_class[57]).Z();
        for (int i = 0; i < this.id_class.size(); ++i) {
            this.id_class.get(i).id_class(n + 11 + 25 * (i % 5), n2 + 31 + 25 * (i / 5));
        }
        this.id_catch = new Lm_1(n + 93, n2 + 137, 12, 17, false);
        this.id_catch.id_class(1, 208, 13, 18, ms_3.id_class);
        this.id_private = new Lm_1(n + 38, n2 + 137, 12, 17, true);
        this.id_private.id_class(1, 208, 13, 18, ms_3.id_class);
    }

    public void id_class(List<mG_2> list, boolean bl) {
        this.id_case = list;
        this.id_implements = (int)Math.ceil((double)list.size() / 20.0);
        if (this.id_implements <= this.id_finally || bl) {
            this.id_finally = 0;
        }
        this.id_case();
    }

    public mG_2 id_break() {
        return this.id_volatile;
    }

    public rkU_2 id_throws() {
        return this.id_extends;
    }

    private void id_catch() {
        this.id_catch.id_new = this.id_implements > 1 && this.id_finally < this.id_implements - 1;
        this.id_private.id_new = this.id_implements > 1 && this.id_finally > 0;
    }

    private void id_case() {
        int n = 20 * this.id_finally;
        for (int i = 0; i < this.id_class.size(); ++i) {
            mJ_2 mJ_22 = this.id_class.get(i);
            if (n + i < this.id_case.size()) {
                mG_2 mG_22 = this.id_case.get(n + i);
                mJ_22.id_class(mG_22, this);
                mJ_22.id_new = true;
                continue;
            }
            mJ_22.id_new = false;
        }
        this.id_catch();
    }

    public QY id_protected() {
        return this.id_protected;
    }
}

