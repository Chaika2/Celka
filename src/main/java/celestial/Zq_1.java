/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 */
package celestial;

import celestial.LF;
import celestial.Ml_1;
import celestial.QY;
import celestial.ZT;
import celestial.cv_3;
import celestial.rgP_2;
import celestial.rgS_2;
import celestial.vm_3;
import com.google.common.collect.ImmutableList;
import java.util.List;

public class Zq_1
extends vm_3 {
    private final rgS_2 id_class;
    private final ImmutableList<ZT> id_throws;
    private cv_3 id_case = cv_3.id_class;
    private int id_catch;
    private int id_private;

    protected Zq_1(rgP_2 rgP_22, List<rgS_2> list, ImmutableList<ZT> immutableList) {
        super(rgP_22);
        this.id_class = rgS_2.id_class(list);
        this.id_throws = immutableList;
    }

    @Override
    public void id_class(Ml_1 ml_1, int n, int n2, float f) {
        this.id_protected(0);
        Zq_1.id_class(ml_1, this.id_super, this.id_extends, this.id_package / 2, this.id_catch - 18, -1);
        this.id_case.id_class(ml_1, this.id_package / 2, this.id_catch);
        super.id_class(ml_1, n, n2, f);
    }

    @Override
    public void id_break(QY qY, int n, int n2) {
        super.id_break(qY, n, n2);
        for (ZT zT : this.id_throws) {
            this.id_private = Math.max(this.id_private, 20 + this.id_super.id_class(zT.id_class) + 20);
        }
        int n3 = 5 + this.id_private + 5;
        int n4 = n3 * this.id_throws.size();
        this.id_case = cv_3.id_class(this.id_super, this.id_class, n4);
        int n5 = this.id_case.id_class() * 9;
        this.id_catch = (int)((double)n2 / 2.0 - (double)n5 / 2.0);
        int n6 = this.id_catch + n5 + 18;
        int n7 = (int)((double)n / 2.0 - (double)n4 / 2.0);
        for (ZT zT : this.id_throws) {
            this.id_class(new LF(n7, n6, this.id_private, 20, zT.id_class, zT.id_break));
            n7 += n3;
        }
    }

    @Override
    public String D_() {
        return super.D_() + ". " + this.id_class.getString();
    }

    @Override
    public boolean E_() {
        return false;
    }
}

