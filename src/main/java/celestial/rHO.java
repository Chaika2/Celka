/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.Lists
 */
package celestial;

import celestial.Oo_1;
import celestial.kO_2;
import celestial.rFy_1;
import celestial.rHD;
import celestial.rHX;
import celestial.rHf_1;
import celestial.rHh_1;
import celestial.rJZ;
import celestial.rJr_1;
import celestial.rKv_1;
import celestial.rLD;
import celestial.rLR;
import celestial.rLY;
import celestial.rRK;
import celestial.rRq_1;
import celestial.rXT;
import celestial.rcd_3;
import celestial.rfH_2;
import celestial.rfl_3;
import celestial.rgB_2;
import celestial.rgP_2;
import celestial.rgn_3;
import celestial.rhN_2;
import celestial.rhd_3;
import celestial.rhz_3;
import celestial.rls_3;
import celestial.rpF_2;
import celestial.rpq_3;
import celestial.rqA_2;
import celestial.rqL_2;
import celestial.rqn_3;
import celestial.ryO_2;
import celestial.ryW_2;
import celestial.xc_3;
import celestial.xd_3;
import celestial.xu_3;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class rHO
extends ryO_2
implements rHf_1,
rJZ {
    public static final rLR[][] id_class = new rLR[][]{{rLD.id_class, rLD.id_byte}, {rLD.id_extends, rLD.id_private}, {rLD.id_throws}, {rLD.id_finally}};
    private static final Set<rLR> id_break = Arrays.stream(id_class).flatMap(Arrays::stream).collect(Collectors.toSet());
    public List<rHX> id_byte = Lists.newArrayList();
    private List<rHX> id_protected = Lists.newArrayList();
    public int id_throws;
    private int id_case = -1;
    public rLR id_catch;
    public rLR id_private;
    private rgP_2 id_implements;
    private rRK id_finally = rRK.id_class;
    private final rpF_2 id_final = new rHh_1(this);

    public rHO() {
        super(ryW_2.id_final);
    }

    public void id_class(rqA_2 rqA_22) {
        this.id_extends.id_class((rhd_3)null, this.id_native, rqA_22, rqL_2.BLOCKS, 1.0f, 1.0f);
    }

    public static rLR id_class(int n) {
        rLR rLR2 = rLR.id_class(n);
        return id_break.contains(rLR2) ? rLR2 : null;
    }

    @Override
    public rcd_3 id_class(rcd_3 rcd_32) {
        super.id_class(rcd_32);
        rcd_32.id_break("Primary", rLR.id_class(this.id_catch));
        rcd_32.id_break("Secondary", rLR.id_class(this.id_private));
        rcd_32.id_break("Levels", this.id_throws);
        if (this.id_implements != null) {
            rcd_32.id_class("CustomName", rgB_2.id_class(this.id_implements));
        }
        this.id_finally.id_class(rcd_32);
        return rcd_32;
    }

    @Override
    public void id_class(xc_3 xc_32, rcd_3 rcd_32) {
        super.id_class(xc_32, rcd_32);
        this.id_catch = rHO.id_class(rcd_32.id_private("Primary"));
        this.id_private = rHO.id_class(rcd_32.id_private("Secondary"));
        if (rcd_32.id_byte("CustomName", 8)) {
            this.id_implements = rgB_2.id_class(rcd_32.id_native("CustomName"));
        }
        this.id_finally = rRK.id_break(rcd_32);
    }

    private void id_class(int n, int n2, int n3) {
        int n4;
        this.id_throws = 0;
        int n5 = 1;
        while (n5 <= 4 && (n4 = n2 - n5) >= 0) {
            boolean bl = true;
            block1: for (int i = n - n5; i <= n + n5 && bl; ++i) {
                for (int j = n3 - n5; j <= n3 + n5; ++j) {
                    if (this.id_extends.id_byte(new rfH_2(i, n4, j)).id_class(rls_3.m)) continue;
                    bl = false;
                    continue block1;
                }
            }
            if (!bl) break;
            this.id_throws = n5++;
        }
    }

    public void id_class(rgP_2 rgP_22) {
        this.id_implements = rgP_22;
    }

    @Override
    public void id_throws() {
        Object object;
        int n;
        rfH_2 rfH_22;
        int n2 = this.id_native.b_();
        int n3 = this.id_native.c_();
        int n4 = this.id_native.d_();
        if (this.id_case < n3) {
            rfH_22 = this.id_native;
            this.id_protected = Lists.newArrayList();
            this.id_case = rfH_22.c_() - 1;
        } else {
            rfH_22 = new rfH_2(n2, this.id_case + 1, n4);
        }
        rHX rHX2 = this.id_protected.isEmpty() ? null : this.id_protected.get(this.id_protected.size() - 1);
        int n5 = this.id_extends.id_class(rKv_1.WORLD_SURFACE, n2, n4);
        for (n = 0; n < 10 && rfH_22.c_() <= n5; ++n) {
            xc_3 xc_32 = this.id_extends.id_byte(rfH_22);
            xd_3 xd_32 = xc_32.id_break();
            if (xd_32 instanceof kO_2) {
                object = ((kO_2)((Object)xd_32)).id_break().id_protected();
                if (this.id_protected.size() <= 1) {
                    rHX2 = new rHX((float[])object);
                    this.id_protected.add(rHX2);
                } else if (rHX2 != null) {
                    if (Arrays.equals((float[])object, rHX2.id_class)) {
                        rHX2.id_class();
                    } else {
                        rHX2 = new rHX(new float[]{(rHX2.id_class[0] + object[0]) / 2.0f, (rHX2.id_class[1] + object[1]) / 2.0f, (rHX2.id_class[2] + object[2]) / 2.0f});
                        this.id_protected.add(rHX2);
                    }
                }
            } else {
                if (rHX2 == null || xc_32.id_break((rRq_1)this.id_extends, rfH_22) >= 15 && xd_32 != xu_3.id_while) {
                    this.id_protected.clear();
                    this.id_case = n5;
                    break;
                }
                rHX2.id_class();
            }
            rfH_22 = rfH_22.id_final();
            ++this.id_case;
        }
        n = this.id_throws;
        if (this.id_extends.r() % 80L == 0L) {
            if (!this.id_byte.isEmpty()) {
                this.id_class(n2, n3, n4);
            }
            if (this.id_throws > 0 && !this.id_byte.isEmpty()) {
                this.id_finally();
                this.id_class(rqn_3.A);
            }
        }
        if (this.id_case >= n5) {
            this.id_case = -1;
            boolean bl = n > 0;
            this.id_byte = this.id_protected;
            if (!this.id_extends.id_continue) {
                boolean bl2;
                boolean bl3 = bl2 = this.id_throws > 0;
                if (!bl && bl2) {
                    this.id_class(rqn_3.L);
                    object = this.id_extends.id_class(rhN_2.class, new rfl_3(n2, n3, n4, n2, n3 - 4, n4).id_byte(10.0, 5.0, 10.0)).iterator();
                    while (object.hasNext()) {
                        rhN_2 rhN_22 = (rhN_2)object.next();
                        Oo_1.id_native.id_class(rhN_22, this);
                    }
                } else if (bl && !bl2) {
                    this.id_class(rqn_3.n);
                }
            }
        }
    }

    private void id_finally() {
        if (!this.id_extends.id_continue && this.id_catch != null) {
            double d = this.id_throws * 10 + 10;
            int n = 0;
            if (this.id_throws >= 4 && this.id_catch == this.id_private) {
                n = 1;
            }
            int n2 = (9 + this.id_throws * 2) * 20;
            rfl_3 rfl_32 = new rfl_3(this.id_native).id_class(d).id_break(0.0, this.id_extends.id_try(), 0.0);
            List<rhd_3> list = this.id_extends.id_class(rhd_3.class, rfl_32);
            for (rhd_3 rhd_32 : list) {
                rhd_32.id_break(new rLY(this.id_catch, n2, n, true, true));
            }
            if (this.id_throws >= 4 && this.id_catch != this.id_private && this.id_private != null) {
                for (rhd_3 rhd_32 : list) {
                    rhd_32.id_break(new rLY(this.id_private, n2, 0, true, true));
                }
            }
        }
    }

    public List<rHX> id_catch() {
        return this.id_throws == 0 ? ImmutableList.of() : this.id_byte;
    }

    @Override
    public double id_implements() {
        return 256.0;
    }

    public int id_private() {
        return this.id_throws;
    }

    @Override
    public void aa_() {
        this.id_class(rqn_3.n);
        super.aa_();
    }

    @Override
    public rgP_2 L_() {
        return this.id_implements != null ? this.id_implements : new rgn_3("container.beacon");
    }

    @Override
    public rFy_1 Y_() {
        return new rFy_1(this.id_native, 3, this.Z_());
    }

    @Override
    public rcd_3 Z_() {
        return this.id_class(new rcd_3());
    }

    @Override
    public rJr_1 createMenu(int n, rhz_3 rhz_32, rhd_3 rhd_32) {
        return rHD.id_class(rhd_32, this.id_finally, this.L_()) ? new rXT(n, rhz_32, this.id_final, rpq_3.id_class(this.id_extends, this.id_char())) : null;
    }
}

