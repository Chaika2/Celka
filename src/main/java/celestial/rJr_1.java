/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Sets
 */
package celestial;

import celestial.KU;
import celestial.KY;
import celestial.Ko_1;
import celestial.rJP;
import celestial.rJY;
import celestial.rJu_1;
import celestial.rVL;
import celestial.rXa_1;
import celestial.rXu_1;
import celestial.rYB;
import celestial.rdn_3;
import celestial.rfH_2;
import celestial.rfU_2;
import celestial.rhN_2;
import celestial.rhd_3;
import celestial.rhx_3;
import celestial.rhz_3;
import celestial.rpF_2;
import celestial.rpj_3;
import celestial.rpq_3;
import celestial.rqs_3;
import celestial.rrAT;
import celestial.rrAq_1;
import celestial.ryO_2;
import celestial.xd_3;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;

public abstract class rJr_1 {
    private final rqs_3<rdn_3> id_class = rqs_3.id_class();
    public final List<rJY> id_throws = Lists.newArrayList();
    private final List<rpj_3> id_break = Lists.newArrayList();
    private final rJP<?> id_byte;
    public final int id_case;
    private short id_protected;
    private int id_catch = -1;
    private int id_private;
    private final Set<rJY> id_implements = Sets.newHashSet();
    private final List<rJu_1> id_finally = Lists.newArrayList();
    private final Set<rhd_3> id_extends = Sets.newHashSet();

    public static int id_byte(int n, int n2) {
        return n & 3 | (n2 & 3) << 2;
    }

    public boolean id_byte(rhd_3 rhd_32) {
        return !this.id_extends.contains(rhd_32);
    }

    public static int id_byte(int n) {
        return n & 3;
    }

    protected rJr_1(rJP<?> rJP2, int n) {
        this.id_byte = rJP2;
        this.id_case = n;
    }

    public rJY id_class(List<rdn_3> list, int n) {
        rJY rJY2 = this.id_class(n);
        rJY2.id_break(list.get(n));
        return rJY2;
    }

    public void id_class(int n, int n2) {
        this.id_break.get(n).id_class(n2);
    }

    public short id_class(rhz_3 rhz_32) {
        this.id_protected = (short)(this.id_protected + 1);
        return this.id_protected;
    }

    public abstract boolean id_class(rhd_3 var1);

    protected void id_class(rhd_3 rhd_32, rYB rYB2, rXu_1 rXu_12) {
        if (!rhd_32.BM() || rhd_32 instanceof rhN_2 && ((rhN_2)rhd_32).id_int()) {
            for (int i = 0; i < rXu_12.id_else(); ++i) {
                rhd_32.id_class(rXu_12.id_native(i), false);
            }
        } else {
            for (int i = 0; i < rXu_12.id_else(); ++i) {
                ((rhz_3)rhd_32.id_implements[1]).id_class(rYB2, rXu_12.id_native(i));
            }
        }
    }

    public void id_class(rXu_1 rXu_12) {
        this.id_native();
    }

    public void id_class(List<rdn_3> list) {
        for (int i = 0; i < list.size(); ++i) {
            this.id_class(list, i);
        }
        for (rJu_1 rJu_12 : this.id_finally) {
            rJu_12.id_byte(list);
        }
        rrAT.id_class(this, this.id_throws, this.id_case);
    }

    public void id_class(int n, rdn_3 rdn_32) {
        rJY rJY2 = this.id_class(n);
        rdn_3 rdn_33 = rJY2.id_class();
        rJY2.id_break(rdn_32);
        rrAq_1.id_break(this, rJY2, rdn_33);
    }

    public static boolean id_class(rJY rJY2, rdn_3 rdn_32, boolean bl) {
        boolean bl2;
        boolean bl3 = bl2 = rJY2 == null || !rJY2.id_break();
        if (!bl2 && rdn_32.id_class(rJY2.id_class()) && rdn_3.id_class(rJY2.id_class(), rdn_32)) {
            return rJY2.id_class().id_char() + (bl ? 0 : rdn_32.id_char()) <= rdn_32.id_byte();
        }
        return bl2;
    }

    public static void id_class(Set<rJY> set, int n, rdn_3 rdn_32, int n2) {
        switch (n) {
            case 0: {
                rdn_32.id_throws(rfU_2.id_protected((float)rdn_32.id_char() / (float)set.size()));
                break;
            }
            case 1: {
                rdn_32.id_throws(1);
                break;
            }
            case 2: {
                rdn_32.id_throws(rdn_32.id_break().id_implements());
            }
        }
        rdn_32.id_case(n2);
    }

    public boolean id_class(rJY rJY2) {
        return true;
    }

    public static int id_class(ryO_2 ryO_22) {
        return ryO_22 instanceof rXu_1 ? rJr_1.id_break((rXu_1)((Object)ryO_22)) : 0;
    }

    protected boolean id_class(rdn_3 rdn_32, int n, int n2, boolean bl) {
        rdn_3 rdn_33;
        rJY rJY2;
        boolean bl2 = false;
        int n3 = n;
        if (bl) {
            n3 = n2 - 1;
        }
        if (rdn_32.id_protected()) {
            while (!rdn_32.id_class() && !(!bl ? n3 >= n2 : n3 < n)) {
                rJY2 = this.id_throws.get(n3);
                rdn_33 = rJY2.id_class();
                if (!rdn_33.id_class() && rJr_1.id_class(rdn_32, rdn_33)) {
                    int n4 = rdn_33.id_char() + rdn_32.id_char();
                    if (n4 <= rdn_32.id_byte()) {
                        rdn_32.id_throws(0);
                        rdn_33.id_throws(n4);
                        rJY2.id_byte();
                        bl2 = true;
                    } else if (rdn_33.id_char() < rdn_32.id_byte()) {
                        rdn_32.id_catch(rdn_32.id_byte() - rdn_33.id_char());
                        rdn_33.id_throws(rdn_32.id_byte());
                        rJY2.id_byte();
                        bl2 = true;
                    }
                }
                if (bl) {
                    --n3;
                    continue;
                }
                ++n3;
            }
        }
        if (!rdn_32.id_class()) {
            n3 = bl ? n2 - 1 : n;
            while (!(!bl ? n3 >= n2 : n3 < n)) {
                rJY2 = this.id_throws.get(n3);
                rdn_33 = rJY2.id_class();
                if (rdn_33.id_class() && rJY2.id_class(rdn_32)) {
                    if (rdn_32.id_char() > rJY2.id_protected()) {
                        rJY2.id_break(rdn_32.id_class(rJY2.id_protected()));
                    } else {
                        rJY2.id_break(rdn_32.id_class(rdn_32.id_char()));
                    }
                    rJY2.id_byte();
                    bl2 = true;
                    break;
                }
                if (bl) {
                    --n3;
                    continue;
                }
                ++n3;
            }
        }
        return bl2;
    }

    public List<rJY> id_class(Predicate<rJY> predicate) {
        return this.id_throws;
    }

    public static boolean id_class(int n, rhd_3 rhd_32) {
        if (n == 0) {
            return true;
        }
        if (n == 1) {
            return true;
        }
        return n == 2 && ((rhx_3)rhd_32.id_implements[18]).id_protected;
    }

    public rJY id_class(int n) {
        return this.id_throws.get(n);
    }

    protected void id_class(rpF_2 rpF_22) {
        for (int i = 0; i < rpF_22.id_class(); ++i) {
            this.id_class(rpj_3.id_class(rpF_22, i));
        }
    }

    protected static void id_class(rXu_1 rXu_12, int n) {
        int n2 = rXu_12.id_else();
        if (n2 < n) {
            throw new IllegalArgumentException("Container size " + n2 + " is smaller than expected " + n);
        }
    }

    protected static void id_class(rpF_2 rpF_22, int n) {
        int n2 = rpF_22.id_class();
        if (n2 < n) {
            throw new IllegalArgumentException("Container data count " + n2 + " is smaller than expected " + n);
        }
    }

    protected rpj_3 id_class(rpj_3 rpj_32) {
        this.id_break.add(rpj_32);
        return rpj_32;
    }

    public void id_class(rJu_1 rJu_12) {
        if (!this.id_finally.contains(rJu_12)) {
            this.id_finally.add(rJu_12);
            rJu_12.id_class(this, this.id_extends());
            this.id_native();
        }
    }

    protected static boolean id_class(rpq_3 rpq_32, rhd_3 rhd_32, xd_3 xd_32) {
        return rpq_32.id_class((rYB rYB2, rfH_2 rfH_22) -> !rYB2.id_byte((rfH_2)rfH_22).id_class(xd_32) ? false : rhd_32.id_class((double)rfH_22.b_() + 0.5, (double)rfH_22.c_() + 0.5, (double)rfH_22.d_() + 0.5) <= 64.0, true);
    }

    public boolean id_class(rdn_3 rdn_32, rJY rJY2) {
        return true;
    }

    public static boolean id_class(rdn_3 rdn_32, rdn_3 rdn_33) {
        return rdn_32.id_break() == rdn_33.id_break() && rdn_3.id_class(rdn_32, rdn_33);
    }

    public rdn_3 id_class(rhd_3 rhd_32, int n) {
        rJY rJY2 = this.id_throws.get(n);
        return rJY2 != null ? rJY2.id_class() : rdn_3.id_break;
    }

    public rdn_3 id_class(int n, int n2, rXa_1 rXa_12, rhd_3 rhd_32) {
        try {
            return this.id_break(n, n2, rXa_12, rhd_32);
        }
        catch (Exception exception) {
            KY kY = KY.id_class(exception, "Container click");
            Ko_1 ko_1 = kY.id_class("Click info");
            ko_1.id_class("Menu Type", () -> this.id_byte != null ? rVL.G.id_break(this.id_byte).toString() : "<no type>");
            ko_1.id_class("Menu Class", () -> this.getClass().getCanonicalName());
            ko_1.id_class("Slot Count", this.id_throws.size());
            ko_1.id_class("Slot", n);
            ko_1.id_class("Button", n2);
            ko_1.id_class("Type", (Object)rXa_12);
            throw new KU(kY);
        }
    }

    public static int id_break(rXu_1 rXu_12) {
        if (rXu_12 == null) {
            return 0;
        }
        int n = 0;
        float f = 0.0f;
        for (int i = 0; i < rXu_12.id_else(); ++i) {
            rdn_3 rdn_32 = rXu_12.id_extends(i);
            if (rdn_32.id_class()) continue;
            f += (float)rdn_32.id_char() / (float)Math.min(rXu_12.ab_(), rdn_32.id_byte());
            ++n;
        }
        return rfU_2.id_protected((f /= (float)rXu_12.id_else()) * 14.0f) + (n > 0 ? 1 : 0);
    }

    protected rJY id_break(rJY rJY2) {
        rJY2.id_protected = this.id_throws.size();
        this.id_throws.add(rJY2);
        this.id_class.add(rdn_3.id_break);
        return rJY2;
    }

    public void id_break(rhd_3 rhd_32) {
        rhz_3 rhz_32 = (rhz_3)rhd_32.id_implements[1];
        if (!rhz_32.id_finally().id_class()) {
            rhd_32.id_class(rhz_32.id_finally(), false);
            rhz_32.id_private(rdn_3.id_break);
        }
    }

    public boolean id_break(rhd_3 rhd_32, int n) {
        return false;
    }

    public void id_break(rhd_3 rhd_32, boolean bl) {
        if (bl) {
            this.id_extends.remove(rhd_32);
        } else {
            this.id_extends.add(rhd_32);
        }
    }

    public static int id_break(int n) {
        return n >> 2 & 3;
    }

    private rdn_3 id_break(int n, int n2, rXa_1 rXa_12, rhd_3 rhd_32) {
        rdn_3 rdn_32 = rdn_3.id_break;
        rhz_3 rhz_32 = (rhz_3)rhd_32.id_implements[1];
        if (rXa_12 == rXa_1.QUICK_CRAFT) {
            int n3 = this.id_private;
            this.id_private = rJr_1.id_byte(n2);
            if ((n3 != 1 || this.id_private != 2) && n3 != this.id_private) {
                this.id_volatile();
            } else if (rhz_32.id_finally().id_class()) {
                this.id_volatile();
            } else if (this.id_private == 0) {
                this.id_catch = rJr_1.id_break(n2);
                if (rJr_1.id_class(this.id_catch, rhd_32)) {
                    this.id_private = 1;
                    this.id_implements.clear();
                } else {
                    this.id_volatile();
                }
            } else if (this.id_private == 1) {
                rJY rJY2 = this.id_throws.get(n);
                rdn_3 rdn_33 = rhz_32.id_finally();
                if (rJY2 != null && rJr_1.id_class(rJY2, rdn_33, true) && rJY2.id_class(rdn_33) && (this.id_catch == 2 || rdn_33.id_char() > this.id_implements.size()) && this.id_class(rJY2)) {
                    this.id_implements.add(rJY2);
                }
            } else if (this.id_private == 2) {
                if (!this.id_implements.isEmpty()) {
                    rdn_3 rdn_34 = rhz_32.id_finally().id_implements();
                    int n4 = rhz_32.id_finally().id_char();
                    for (rJY rJY3 : this.id_implements) {
                        rdn_3 rdn_35 = rhz_32.id_finally();
                        if (rJY3 == null || !rJr_1.id_class(rJY3, rdn_35, true) || !rJY3.id_class(rdn_35) || this.id_catch != 2 && rdn_35.id_char() < this.id_implements.size() || !this.id_class(rJY3)) continue;
                        rdn_3 rdn_36 = rdn_34.id_implements();
                        int n5 = rJY3.id_break() ? rJY3.id_class().id_char() : 0;
                        rJr_1.id_class(this.id_implements, this.id_catch, rdn_36, n5);
                        int n6 = Math.min(rdn_36.id_byte(), rJY3.id_byte(rdn_36));
                        if (rdn_36.id_char() > n6) {
                            rdn_36.id_throws(n6);
                        }
                        n4 -= rdn_36.id_char() - n5;
                        rJY3.id_break(rdn_36);
                    }
                    rdn_34.id_throws(n4);
                    rhz_32.id_private(rdn_34);
                }
                this.id_volatile();
            } else {
                this.id_volatile();
            }
        } else if (this.id_private != 0) {
            this.id_volatile();
        } else if (!(rXa_12 != rXa_1.PICKUP && rXa_12 != rXa_1.QUICK_MOVE || n2 != 0 && n2 != 1)) {
            if (n == -999) {
                if (!rhz_32.id_finally().id_class()) {
                    if (n2 == 0) {
                        rhd_32.id_class(rhz_32.id_finally(), true);
                        rhz_32.id_private(rdn_3.id_break);
                    }
                    if (n2 == 1) {
                        rhd_32.id_class(rhz_32.id_finally().id_class(1), true);
                    }
                }
            } else if (rXa_12 == rXa_1.QUICK_MOVE) {
                if (n < 0) {
                    return rdn_3.id_break;
                }
                rJY rJY4 = this.id_throws.get(n);
                if (rJY4 == null || !rJY4.id_class(rhd_32)) {
                    return rdn_3.id_break;
                }
                rdn_3 rdn_37 = this.id_class(rhd_32, n);
                while (!rdn_37.id_class() && rdn_3.id_byte(rJY4.id_class(), rdn_37)) {
                    rdn_32 = rdn_37.id_implements();
                    rdn_37 = this.id_class(rhd_32, n);
                }
            } else {
                if (n < 0) {
                    return rdn_3.id_break;
                }
                rJY rJY5 = this.id_throws.get(n);
                if (rJY5 != null) {
                    rdn_3 rdn_38 = rJY5.id_class();
                    rdn_3 rdn_39 = rhz_32.id_finally();
                    if (!rdn_38.id_class()) {
                        rdn_32 = rdn_38.id_implements();
                    }
                    if (rdn_38.id_class()) {
                        if (!rdn_39.id_class() && rJY5.id_class(rdn_39)) {
                            int n7;
                            int n8 = n7 = n2 == 0 ? rdn_39.id_char() : 1;
                            if (n7 > rJY5.id_byte(rdn_39)) {
                                n7 = rJY5.id_byte(rdn_39);
                            }
                            rJY5.id_break(rdn_39.id_class(n7));
                        }
                    } else if (rJY5.id_class(rhd_32)) {
                        int n9;
                        if (rdn_39.id_class()) {
                            if (rdn_38.id_class()) {
                                rJY5.id_break(rdn_3.id_break);
                                rhz_32.id_private(rdn_3.id_break);
                            } else {
                                int n10 = n2 == 0 ? rdn_38.id_char() : (rdn_38.id_char() + 1) / 2;
                                rhz_32.id_private(rJY5.id_class(n10));
                                if (rdn_38.id_class()) {
                                    rJY5.id_break(rdn_3.id_break);
                                }
                                rJY5.id_class(rhd_32, rhz_32.id_finally());
                            }
                        } else if (rJY5.id_class(rdn_39)) {
                            if (rJr_1.id_class(rdn_38, rdn_39)) {
                                int n11;
                                int n12 = n11 = n2 == 0 ? rdn_39.id_char() : 1;
                                if (n11 > rJY5.id_byte(rdn_39) - rdn_38.id_char()) {
                                    n11 = rJY5.id_byte(rdn_39) - rdn_38.id_char();
                                }
                                if (n11 > rdn_39.id_byte() - rdn_38.id_char()) {
                                    n11 = rdn_39.id_byte() - rdn_38.id_char();
                                }
                                rdn_39.id_catch(n11);
                                rdn_38.id_case(n11);
                            } else if (rdn_39.id_char() <= rJY5.id_byte(rdn_39)) {
                                rJY5.id_break(rdn_39);
                                rhz_32.id_private(rdn_38);
                            }
                        } else if (rdn_39.id_byte() > 1 && rJr_1.id_class(rdn_38, rdn_39) && !rdn_38.id_class() && (n9 = rdn_38.id_char()) + rdn_39.id_char() <= rdn_39.id_byte()) {
                            rdn_39.id_case(n9);
                            rdn_38 = rJY5.id_class(n9);
                            if (rdn_38.id_class()) {
                                rJY5.id_break(rdn_3.id_break);
                            }
                            rJY5.id_class(rhd_32, rhz_32.id_finally());
                        }
                    }
                    rJY5.id_byte();
                }
            }
        } else if (rXa_12 == rXa_1.SWAP) {
            rJY rJY6 = this.id_throws.get(n);
            rdn_3 rdn_310 = rhz_32.id_extends(n2);
            rdn_3 rdn_311 = rJY6.id_class();
            if (!rdn_310.id_class() || !rdn_311.id_class()) {
                if (rdn_310.id_class()) {
                    if (rJY6.id_class(rhd_32)) {
                        rhz_32.id_break(n2, rdn_311);
                        rJY6.id_break(rdn_311.id_char());
                        rJY6.id_break(rdn_3.id_break);
                        rJY6.id_class(rhd_32, rdn_311);
                    }
                } else if (rdn_311.id_class()) {
                    if (rJY6.id_class(rdn_310)) {
                        int n13 = rJY6.id_byte(rdn_310);
                        if (rdn_310.id_char() > n13) {
                            rJY6.id_break(rdn_310.id_class(n13));
                        } else {
                            rJY6.id_break(rdn_310);
                            rhz_32.id_break(n2, rdn_3.id_break);
                        }
                    }
                } else if (rJY6.id_class(rhd_32) && rJY6.id_class(rdn_310)) {
                    int n14 = rJY6.id_byte(rdn_310);
                    if (rdn_310.id_char() > n14) {
                        rJY6.id_break(rdn_310.id_class(n14));
                        rJY6.id_class(rhd_32, rdn_311);
                        if (!rhz_32.id_throws(rdn_311)) {
                            rhd_32.id_class(rdn_311, true);
                        }
                    } else {
                        rJY6.id_break(rdn_310);
                        rhz_32.id_break(n2, rdn_311);
                        rJY6.id_class(rhd_32, rdn_311);
                    }
                }
            }
            rdn_32 = rdn_311.id_implements();
        } else if (rXa_12 == rXa_1.CLONE && ((rhx_3)rhd_32.id_implements[18]).id_protected && rhz_32.id_finally().id_class() && n >= 0) {
            rJY rJY7 = this.id_throws.get(n);
            if (rJY7 != null && rJY7.id_break()) {
                rdn_3 rdn_312 = rJY7.id_class().id_implements();
                rdn_312.id_throws(rdn_312.id_byte());
                rhz_32.id_private(rdn_312);
            }
        } else if (rXa_12 == rXa_1.THROW && rhz_32.id_finally().id_class() && n >= 0) {
            rJY rJY8 = this.id_throws.get(n);
            if (rJY8 != null && rJY8.id_break() && rJY8.id_class(rhd_32)) {
                rdn_3 rdn_313 = rJY8.id_class(n2 == 0 ? 1 : rJY8.id_class().id_char());
                rJY8.id_class(rhd_32, rdn_313);
                rhd_32.id_class(rdn_313, true);
                rdn_32 = rdn_313.id_implements();
            }
        } else if (rXa_12 == rXa_1.PICKUP_ALL && n >= 0) {
            rJY rJY9 = this.id_throws.get(n);
            rdn_3 rdn_314 = rhz_32.id_finally();
            if (!(rdn_314.id_class() || rJY9 != null && rJY9.id_break() && rJY9.id_class(rhd_32))) {
                int n15 = n2 == 0 ? 0 : this.id_throws.size() - 1;
                int n16 = n2 == 0 ? 1 : -1;
                for (int i = 0; i < 2; ++i) {
                    for (int j = n15; j >= 0 && j < this.id_throws.size() && rdn_314.id_char() < rdn_314.id_byte(); j += n16) {
                        rJY rJY10 = this.id_throws.get(j);
                        if (!rJY10.id_break() || !rJr_1.id_class(rJY10, rdn_314, true) || !rJY10.id_class(rhd_32) || !this.id_class(rdn_314, rJY10)) continue;
                        rdn_3 rdn_315 = rJY10.id_class();
                        if (i == 0 && rdn_315.id_char() == rdn_315.id_byte()) continue;
                        int n17 = Math.min(rdn_314.id_byte() - rdn_314.id_char(), rdn_315.id_char());
                        rdn_3 rdn_316 = rJY10.id_class(n17);
                        rdn_314.id_case(n17);
                        if (rdn_316.id_class()) {
                            rJY10.id_break(rdn_3.id_break);
                        }
                        rJY10.id_class(rhd_32, rdn_316);
                    }
                }
            }
            this.id_native();
        }
        return rdn_32;
    }

    public void id_break(rJu_1 rJu_12) {
        this.id_finally.remove(rJu_12);
    }

    public rJP<?> id_finally() {
        if (this.id_byte == null) {
            throw new UnsupportedOperationException("Unable to construct this menu by type");
        }
        return this.id_byte;
    }

    public rqs_3<rdn_3> id_extends() {
        rqs_3<rdn_3> rqs_32 = rqs_3.id_class();
        for (int i = 0; i < this.id_throws.size(); ++i) {
            rqs_32.add(this.id_throws.get(i).id_class());
        }
        return rqs_32;
    }

    protected void id_volatile() {
        this.id_private = 0;
        this.id_implements.clear();
    }

    public void id_native() {
        Object object;
        int n;
        for (n = 0; n < this.id_throws.size(); ++n) {
            object = this.id_throws.get(n).id_class();
            rdn_3 rdn_32 = this.id_class.get(n);
            if (rdn_3.id_break(rdn_32, (rdn_3)object)) continue;
            rdn_3 object2 = ((rdn_3)object).id_implements();
            this.id_class.set(n, object2);
            for (rJu_1 rJu_12 : this.id_finally) {
                rJu_12.id_class(this, n, object2);
            }
        }
        for (n = 0; n < this.id_break.size(); ++n) {
            object = this.id_break.get(n);
            if (!((rpj_3)object).id_byte()) continue;
            for (rJu_1 rJu_13 : this.id_finally) {
                rJu_13.id_class(this, n, ((rpj_3)object).id_break());
            }
        }
    }
}

