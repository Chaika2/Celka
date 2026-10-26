/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Oo_1;
import celestial.eA_2;
import celestial.eL_2;
import celestial.rJG;
import celestial.rJM;
import celestial.rJP;
import celestial.rJY;
import celestial.rJb_1;
import celestial.rJr_1;
import celestial.rVL;
import celestial.rXu_1;
import celestial.rYB;
import celestial.rcd_3;
import celestial.rdn_3;
import celestial.rdy_3;
import celestial.rfH_2;
import celestial.rhN_2;
import celestial.rhd_3;
import celestial.rhx_3;
import celestial.rhz_3;
import celestial.rlB_2;
import celestial.rpj_3;
import celestial.rpq_3;
import celestial.rqL_2;
import celestial.rqn_3;
import celestial.rxy_3;
import celestial.xu_3;
import java.util.List;
import java.util.Random;

public class rJE
extends rJr_1 {
    private final rXu_1 id_protected = new rJG(this, 2);
    private final rpq_3 id_catch;
    private final Random id_private = new Random();
    private final rpj_3 id_implements = rpj_3.id_class();
    public final int[] id_class = new int[3];
    public final int[] id_break = new int[]{-1, -1, -1};
    public final int[] id_byte = new int[]{-1, -1, -1};

    public rJE(int n, rhz_3 rhz_32) {
        this(n, rhz_32, rpq_3.id_class);
    }

    public rJE(int n, rhz_3 rhz_32, rpq_3 rpq_32) {
        super(rJP.id_volatile, n);
        int n2;
        this.id_catch = rpq_32;
        this.id_break(new rJb_1(this, this.id_protected, 0, 15, 47));
        this.id_break(new rJM(this, this.id_protected, 1, 35, 47));
        for (n2 = 0; n2 < 3; ++n2) {
            for (int i = 0; i < 9; ++i) {
                this.id_break(new rJY(rhz_32, i + n2 * 9 + 9, 8 + i * 18, 84 + n2 * 18));
            }
        }
        for (n2 = 0; n2 < 9; ++n2) {
            this.id_break(new rJY(rhz_32, n2, 8 + n2 * 18, 142));
        }
        this.id_class(rpj_3.id_class(this.id_class, 0));
        this.id_class(rpj_3.id_class(this.id_class, 1));
        this.id_class(rpj_3.id_class(this.id_class, 2));
        this.id_class(this.id_implements).id_class(rhz_32.id_throws.sH());
        this.id_class(rpj_3.id_class(this.id_break, 0));
        this.id_class(rpj_3.id_class(this.id_break, 1));
        this.id_class(rpj_3.id_class(this.id_break, 2));
        this.id_class(rpj_3.id_class(this.id_byte, 0));
        this.id_class(rpj_3.id_class(this.id_byte, 1));
        this.id_class(rpj_3.id_class(this.id_byte, 2));
    }

    @Override
    public boolean id_class(rhd_3 rhd_32) {
        return rJE.id_class(this.id_catch, rhd_32, xu_3.SE);
    }

    @Override
    public rdn_3 id_class(rhd_3 rhd_32, int n) {
        rdn_3 rdn_32 = rdn_3.id_break;
        rJY rJY2 = (rJY)this.id_throws.get(n);
        if (rJY2 != null && rJY2.id_break()) {
            rdn_3 rdn_33 = rJY2.id_class();
            rdn_32 = rdn_33.id_implements();
            if (n == 0) {
                if (!this.id_class(rdn_33, 2, 38, true)) {
                    return rdn_3.id_break;
                }
            } else if (n == 1) {
                if (!this.id_class(rdn_33, 2, 38, true)) {
                    return rdn_3.id_break;
                }
            } else if (rdn_33.id_break() == rdy_3.XF) {
                if (!this.id_class(rdn_33, 1, 2, true)) {
                    return rdn_3.id_break;
                }
            } else {
                if (((rJY)this.id_throws.get(0)).id_break() || !((rJY)this.id_throws.get(0)).id_class(rdn_33)) {
                    return rdn_3.id_break;
                }
                rdn_3 rdn_34 = rdn_33.id_implements();
                rdn_34.id_throws(1);
                rdn_33.id_catch(1);
                ((rJY)this.id_throws.get(0)).id_break(rdn_34);
            }
            if (rdn_33.id_class()) {
                rJY2.id_break(rdn_3.id_break);
            } else {
                rJY2.id_byte();
            }
            if (rdn_33.id_char() == rdn_32.id_char()) {
                return rdn_3.id_break;
            }
            rJY2.id_class(rhd_32, rdn_33);
        }
        return rdn_32;
    }

    @Override
    public void id_class(rXu_1 rXu_12) {
        if (rXu_12 == this.id_protected) {
            rdn_3 rdn_32 = rXu_12.id_extends(0);
            if (!rdn_32.id_class() && rdn_32.id_return()) {
                this.id_catch.id_class((rYB rYB2, rfH_2 rfH_22) -> {
                    int n;
                    int n2 = 0;
                    for (n = -1; n <= 1; ++n) {
                        for (int i = -1; i <= 1; ++i) {
                            if (n == 0 && i == 0 || !rYB2.id_finally(rfH_22.id_break(i, 0, n)) || !rYB2.id_finally(rfH_22.id_break(i, 1, n))) continue;
                            if (rYB2.id_byte(rfH_22.id_break(i * 2, 0, n * 2)).id_class(xu_3.rj)) {
                                ++n2;
                            }
                            if (rYB2.id_byte(rfH_22.id_break(i * 2, 1, n * 2)).id_class(xu_3.rj)) {
                                ++n2;
                            }
                            if (i == 0 || n == 0) continue;
                            if (rYB2.id_byte(rfH_22.id_break(i * 2, 0, n)).id_class(xu_3.rj)) {
                                ++n2;
                            }
                            if (rYB2.id_byte(rfH_22.id_break(i * 2, 1, n)).id_class(xu_3.rj)) {
                                ++n2;
                            }
                            if (rYB2.id_byte(rfH_22.id_break(i, 0, n * 2)).id_class(xu_3.rj)) {
                                ++n2;
                            }
                            if (!rYB2.id_byte(rfH_22.id_break(i, 1, n * 2)).id_class(xu_3.rj)) continue;
                            ++n2;
                        }
                    }
                    this.id_private.setSeed(this.id_implements.id_break());
                    for (n = 0; n < 3; ++n) {
                        this.id_class[n] = eA_2.id_class(this.id_private, n, n2, rdn_32);
                        this.id_break[n] = -1;
                        this.id_byte[n] = -1;
                        if (this.id_class[n] >= n + 1) continue;
                        this.id_class[n] = 0;
                    }
                    for (n = 0; n < 3; ++n) {
                        List<eL_2> list;
                        if (this.id_class[n] <= 0 || (list = this.id_class(rdn_32, n, this.id_class[n])) == null || list.isEmpty()) continue;
                        eL_2 eL_22 = list.get(this.id_private.nextInt(list.size()));
                        this.id_break[n] = rVL.id_boolean.id_class(eL_22.id_class);
                        this.id_byte[n] = eL_22.id_break;
                    }
                    this.id_native();
                });
            } else {
                for (int i = 0; i < 3; ++i) {
                    this.id_class[i] = 0;
                    this.id_break[i] = -1;
                    this.id_byte[i] = -1;
                }
            }
        }
    }

    public int id_class() {
        rdn_3 rdn_32 = this.id_protected.id_extends(1);
        return rdn_32.id_class() ? 0 : rdn_32.id_char();
    }

    private List<eL_2> id_class(rdn_3 rdn_32, int n, int n2) {
        this.id_private.setSeed(this.id_implements.id_break() + n);
        List<eL_2> list = eA_2.id_break(this.id_private, rdn_32, n2, false);
        if (rdn_32.id_break() == rdy_3.XM && list.size() > 1) {
            list.remove(this.id_private.nextInt(list.size()));
        }
        return list;
    }

    public int id_break() {
        return this.id_implements.id_break();
    }

    @Override
    public boolean id_break(rhd_3 rhd_32, int n) {
        rdn_3 rdn_32 = this.id_protected.id_extends(0);
        rdn_3 rdn_33 = this.id_protected.id_extends(1);
        int n2 = n + 1;
        if ((rdn_33.id_class() || rdn_33.id_char() < n2) && !((rhx_3)rhd_32.id_implements[18]).id_protected) {
            return false;
        }
        if (this.id_class[n] <= 0 || rdn_32.id_class() || ((Integer)rhd_32.id_implements[19] < n2 || (Integer)rhd_32.id_implements[19] < this.id_class[n]) && !((rhx_3)rhd_32.id_implements[18]).id_protected) {
            return false;
        }
        this.id_catch.id_class((rYB rYB2, rfH_2 rfH_22) -> {
            rdn_3 rdn_34 = rdn_32;
            List<eL_2> list = this.id_class(rdn_32, n, this.id_class[n]);
            if (!list.isEmpty()) {
                boolean bl;
                rhd_32.id_break(rdn_32, n2);
                boolean bl2 = bl = rdn_32.id_break() == rdy_3.XM;
                if (bl) {
                    rdn_34 = new rdn_3(rdy_3.dm);
                    rcd_3 rcd_32 = rdn_32.id_package();
                    if (rcd_32 != null) {
                        rdn_34.id_byte(rcd_32.id_catch());
                    }
                    this.id_protected.id_break(0, rdn_34);
                }
                for (int i = 0; i < list.size(); ++i) {
                    eL_2 eL_22 = list.get(i);
                    if (bl) {
                        rxy_3.id_class(rdn_34, eL_22);
                        continue;
                    }
                    rdn_34.id_class(eL_22.id_class, eL_22.id_break);
                }
                if (!((rhx_3)rhd_32.id_implements[18]).id_protected) {
                    rdn_33.id_catch(n2);
                    if (rdn_33.id_class()) {
                        this.id_protected.id_break(1, rdn_3.id_break);
                    }
                }
                rhd_32.id_break(rlB_2.k);
                if (rhd_32 instanceof rhN_2) {
                    Oo_1.id_implements.id_class((rhN_2)rhd_32, rdn_34, n2);
                }
                this.id_protected.id_break();
                this.id_implements.id_class(rhd_32.sH());
                this.id_class(this.id_protected);
                rYB2.id_class((rhd_3)null, (rfH_2)rfH_22, rqn_3.BQ, rqL_2.BLOCKS, 1.0f, rYB2.id_int.nextFloat() * 0.1f + 0.9f);
            }
        });
        return true;
    }

    @Override
    public void id_break(rhd_3 rhd_32) {
        super.id_break(rhd_32);
        this.id_catch.id_class((rYB rYB2, rfH_2 rfH_22) -> this.id_class(rhd_32, (rYB)rhd_32.id_throws[7], this.id_protected));
    }
}

