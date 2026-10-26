/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Sets
 */
package celestial;

import celestial.LV;
import celestial.Ml_1;
import celestial.Np_1;
import celestial.QY;
import celestial.Qi_1;
import celestial.rVL;
import celestial.rdb_3;
import celestial.rdy_3;
import celestial.rgP_2;
import celestial.rlB_2;
import celestial.rlr_3;
import celestial.rpL_2;
import celestial.rqn_3;
import celestial.vf_3;
import celestial.vj_3;
import celestial.vp_3;
import celestial.xd_3;
import celestial.yb_3;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.Comparator;
import java.util.List;
import java.util.Set;

public class vI_2
extends LV<vj_3> {
    protected final List<rlr_3<xd_3>> id_class;
    protected final List<rlr_3<rdb_3>> id_throws;
    private final int[] id_return;
    protected int id_case;
    protected final List<rdb_3> id_catch;
    protected final Comparator<rdb_3> id_private;
    protected rlr_3<?> id_implements;
    protected int id_finally;
    public final /* synthetic */ vp_3 id_extends;

    public vI_2(vp_3 vp_32, QY qY) {
        boolean bl;
        this.id_extends = vp_32;
        super(qY, vp_32.id_package, vp_32.id_int, 32, vp_32.id_int - 64, 20);
        this.id_return = new int[]{3, 4, 1, 2, 5, 6};
        this.id_case = -1;
        this.id_private = new vf_3(this);
        this.id_class = Lists.newArrayList();
        this.id_class.add(rlB_2.id_class);
        this.id_throws = Lists.newArrayList((Object[])new rlr_3[]{rlB_2.id_protected, rlB_2.id_break, rlB_2.id_byte, rlB_2.id_throws, rlB_2.id_case});
        this.id_class(true, 20);
        Set set = Sets.newIdentityHashSet();
        for (rdb_3 rpL_22 : rVL.id_for) {
            bl = false;
            for (rlr_3<rdb_3> rlr_32 : this.id_throws) {
                if (!rlr_32.id_class(rpL_22) || vp_32.id_finally.id_class(rlr_32.id_break(rpL_22)) <= 0) continue;
                bl = true;
            }
            if (!bl) continue;
            set.add(rpL_22);
        }
        for (xd_3 xd_32 : rVL.id_strictfp) {
            bl = false;
            for (rlr_3<rpL_2> rlr_33 : this.id_class) {
                if (!rlr_33.id_class(xd_32) || vp_32.id_finally.id_class(rlr_33.id_break(xd_32)) <= 0) continue;
                bl = true;
            }
            if (!bl) continue;
            set.add(xd_32.id_case());
        }
        set.remove(rdy_3.id_class);
        this.id_catch = Lists.newArrayList((Iterable)set);
        for (int i = 0; i < this.id_catch.size(); ++i) {
            this.id_break(new vj_3(this));
        }
    }

    @Override
    protected void id_class(Ml_1 ml_1, int n, int n2) {
        if (n2 >= this.id_int && n2 <= this.id_new) {
            vj_3 vj_32 = (vj_3)this.id_protected(n, n2);
            int n3 = (this.id_final - this.F_()) / 2;
            if (vj_32 != null) {
                if (n < n3 + 40 || n > n3 + 40 + 20) {
                    return;
                }
                rdb_3 rdb_32 = this.id_catch.get(this.x_().indexOf(vj_32));
                this.id_class(ml_1, this.id_class(rdb_32), n, n2);
            } else {
                rgP_2 rgP_22 = null;
                int n4 = n - n3;
                for (int i = 0; i < this.id_return.length; ++i) {
                    int n5 = this.id_extends.id_break(i);
                    if (n4 < n5 - 18 || n4 > n5) continue;
                    rgP_22 = this.id_private(i).id_byte();
                    break;
                }
                this.id_class(ml_1, rgP_22, n, n2);
            }
        }
    }

    @Override
    protected void id_class(rlr_3<?> rlr_32) {
        if (rlr_32 != this.id_implements) {
            this.id_implements = rlr_32;
            this.id_finally = -1;
        } else if (this.id_finally == -1) {
            this.id_finally = 1;
        } else {
            this.id_implements = null;
            this.id_finally = 0;
        }
        this.id_catch.sort(this.id_private);
    }

    @Override
    protected void id_class(int n, int n2) {
        this.id_case = -1;
        for (int i = 0; i < this.id_return.length; ++i) {
            int n3 = n - this.id_extends.id_break(i);
            if (n3 < -36 || n3 > 0) continue;
            this.id_case = i;
            break;
        }
        if (this.id_case >= 0) {
            this.id_class(this.id_private(this.id_case));
            this.id_native.c().id_class(Np_1.id_class(rqn_3.dw, 1.0f));
        }
    }

    protected void id_class(Ml_1 ml_1, rgP_2 rgP_22, int n, int n2) {
        if (rgP_22 != null) {
            int n3 = n + 12;
            int n4 = n2 - 12;
            int n5 = this.id_extends.id_super.id_class(rgP_22);
            this.id_class(ml_1, n3 - 3, n4 - 3, n3 + n5 + 3, n4 + 8 + 3, -1073741824, -1073741824);
            RenderSystem.pushMatrix();
            RenderSystem.translatef(0.0f, 0.0f, 400.0f);
            this.id_extends.id_super.id_break(ml_1, rgP_22, (float)n3, (float)n4, -1);
            RenderSystem.popMatrix();
        }
    }

    protected rgP_2 id_class(rdb_3 rdb_32) {
        return rdb_32.id_native();
    }

    @Override
    protected void id_class(Ml_1 ml_1, int n, int n2, yb_3 yb_32) {
        int n3;
        int n4;
        if (!((Qi_1)this.id_native.id_class[22]).id_class()) {
            this.id_case = -1;
        }
        for (n4 = 0; n4 < this.id_return.length; ++n4) {
            this.id_extends.id_byte(ml_1, n + this.id_extends.id_break(n4) - 18, n2 + 1, 0, this.id_case == n4 ? 0 : 18);
        }
        if (this.id_implements != null) {
            n4 = this.id_extends.id_break(this.id_break(this.id_implements)) - 36;
            n3 = this.id_finally == 1 ? 2 : 1;
            this.id_extends.id_byte(ml_1, n + n4, n2 + 1, 18 * n3, 0);
        }
        for (n4 = 0; n4 < this.id_return.length; ++n4) {
            n3 = this.id_case == n4 ? 1 : 0;
            this.id_extends.id_byte(ml_1, n + this.id_extends.id_break(n4) - 18 + n3, n2 + 1 + n3, 18 * this.id_return[n4], 18);
        }
    }

    @Override
    protected void id_class(Ml_1 ml_1) {
        this.id_extends.id_class(ml_1);
    }

    @Override
    private int id_break(rlr_3<?> rlr_32) {
        int n = this.id_class.indexOf(rlr_32);
        if (n >= 0) {
            return n;
        }
        int n2 = this.id_throws.indexOf(rlr_32);
        return n2 >= 0 ? n2 + this.id_class.size() : -1;
    }

    @Override
    protected int id_protected() {
        return this.id_final / 2 + 140;
    }

    private rlr_3<?> id_private(int n) {
        return n < this.id_class.size() ? this.id_class.get(n) : this.id_throws.get(n - this.id_class.size());
    }

    @Override
    public int F_() {
        return 375;
    }
}

