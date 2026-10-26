/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 */
package celestial;

import celestial.Ax_1;
import celestial.FF;
import celestial.FH;
import celestial.FL;
import celestial.FZ;
import celestial.LZ;
import celestial.Lu_1;
import celestial.Ml_1;
import celestial.QY;
import celestial.Qj_1;
import celestial.Qw_1;
import celestial.VQ;
import celestial.VU;
import celestial.Ve_1;
import celestial.Vk_1;
import celestial.Vo_1;
import celestial.cb_3;
import celestial.cc_3;
import celestial.cq_3;
import celestial.eA_2;
import celestial.ev_3;
import celestial.gJ_2;
import celestial.rJT;
import celestial.rJY;
import celestial.rJr_1;
import celestial.rVL;
import celestial.rXA;
import celestial.rXa_1;
import celestial.rdX_2;
import celestial.rdb_3;
import celestial.rdn_3;
import celestial.rdy_3;
import celestial.rfU_2;
import celestial.rgF_2;
import celestial.rgN_2;
import celestial.rgP_2;
import celestial.rgn_3;
import celestial.rhd_3;
import celestial.rhz_3;
import celestial.rlW_2;
import celestial.rlb_3;
import celestial.rlc_3;
import celestial.rqO_2;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.function.Predicate;

public class Fv_1
extends cc_3<FF> {
    private static final rqO_2 id_throws = new rqO_2("textures/gui/container/creative_inventory/tabs.png");
    public static final rXA id_case = new rXA(45);
    private static final rgP_2 id_catch = new rgn_3("inventory.binSlot");
    private static int id_private = rdX_2.id_break.id_class();
    private float id_implements;
    private boolean id_finally;
    private Lu_1 id_boolean;
    private List<rJY> id_transient;
    private rJY id_for;
    private FZ id_double;
    private boolean id_switch;
    private boolean r;
    private final Map<rqO_2, rlb_3<rdb_3>> P = Maps.newTreeMap();

    private void id_char() {
        ((FF)this.id_instanceof).id_class.clear();
        this.P.clear();
        String string = this.id_boolean.id_private();
        if (string.isEmpty()) {
            for (rdb_3 rdb_32 : rVL.id_for) {
                rdb_32.id_class(rdX_2.id_catch, ((FF)this.id_instanceof).id_class);
            }
        } else {
            Vo_1<rdn_3> vo_1;
            if (string.startsWith("#")) {
                string = string.substring(1);
                vo_1 = this.id_volatile.id_class(gJ_2.id_break);
                this.id_class(string);
            } else {
                vo_1 = this.id_volatile.id_class(gJ_2.id_class);
            }
            ((FF)this.id_instanceof).id_class.addAll(vo_1.id_class(string.toLowerCase(Locale.ROOT)));
        }
        this.id_implements = 0.0f;
        ((FF)this.id_instanceof).id_class(0.0f);
    }

    public Fv_1(rhd_3 rhd_32) {
        super(new FF(rhd_32), (rhz_3)rhd_32.id_implements[1], rgN_2.id_byte);
        rJr_1 rJr_12 = this.id_instanceof;
        rhd_32.id_implements[4] = rJr_12;
        this.id_continue = true;
        this.id_return = 136;
        this.id_synchronized = 195;
    }

    public int id_interface() {
        return id_private;
    }

    @Override
    public void id_class(Ml_1 ml_1, int n, int n2, float f) {
        this.id_class(ml_1);
        super.id_class(ml_1, n, n2, f);
        for (rdX_2 rdX_22 : rdX_2.id_class) {
            if (this.id_class(ml_1, rdX_22, n, n2)) break;
        }
        if (this.id_for != null && id_private == rdX_2.id_final.id_class() && this.id_class(this.id_for.id_throws, this.id_for.id_case, 16, 16, n, n2)) {
            this.id_class(ml_1, id_catch, n, n2);
        }
        RenderSystem.color4f(1.0f, 1.0f, 1.0f, 1.0f);
        this.id_break(ml_1, n, n2);
    }

    @Override
    protected void id_class(Ml_1 ml_1, rdn_3 rdn_32, int n, int n2) {
        if (id_private == rdX_2.id_catch.id_class()) {
            Map<ev_3, Integer> map;
            List<rgP_2> list = rdn_32.id_class((cb_3)this.id_volatile.id_class[57], ((Qw_1)this.id_volatile.id_class[20]).id_int ? VU.ADVANCED : VU.NORMAL);
            ArrayList arrayList = Lists.newArrayList(list);
            rdb_3 rdb_32 = rdn_32.id_break();
            rdX_2 rdX_22 = rdb_32.id_new();
            if (rdX_22 == null && rdb_32 == rdy_3.dm && (map = eA_2.id_class(rdn_32)).size() == 1) {
                ev_3 ev_32 = map.keySet().iterator().next();
                for (rdX_2 rdX_23 : rdX_2.id_class) {
                    if (!rdX_23.id_class(ev_32.id_break)) continue;
                    rdX_22 = rdX_23;
                    break;
                }
            }
            this.P.forEach((rqO_22, rlb_32) -> {
                if (rlb_32.id_class(rdb_32)) {
                    arrayList.add(1, new rgN_2("#" + rqO_22).id_class(rgF_2.DARK_PURPLE));
                }
            });
            if (rdX_22 != null) {
                arrayList.add(1, rdX_22.id_byte().id_case().id_class(rgF_2.BLUE));
            }
            this.id_class(ml_1, arrayList, n, n2);
        } else {
            super.id_class(ml_1, rdn_32, n, n2);
        }
    }

    @Override
    protected void id_class(Ml_1 ml_1, float f, int n, int n2) {
        RenderSystem.color4f(1.0f, 1.0f, 1.0f, 1.0f);
        rdX_2 rdX_22 = rdX_2.id_class[id_private];
        for (rdX_2 rdX_23 : rdX_2.id_class) {
            this.id_volatile.A().id_class(id_throws);
            if (rdX_23.id_class() == id_private) continue;
            this.id_class(ml_1, rdX_23);
        }
        this.id_volatile.A().id_class(new rqO_2("textures/gui/container/creative_inventory/tab_" + rdX_22.id_case()));
        this.id_break(ml_1, this.id_char, this.id_abstract, 0, 0, this.id_synchronized, this.id_return);
        this.id_boolean.id_class(ml_1, n, n2, f);
        RenderSystem.color4f(1.0f, 1.0f, 1.0f, 1.0f);
        int n3 = this.id_char + 175;
        int n4 = this.id_abstract + 18;
        int n5 = n4 + 112;
        this.id_volatile.A().id_class(id_throws);
        if (rdX_22.id_implements()) {
            this.id_break(ml_1, n3, n4 + (int)((float)(n5 - n4 - 17) * this.id_implements), 232 + (this.id_abstract() ? 0 : 12), 0, 12, 15);
        }
        this.id_class(ml_1, rdX_22);
        if (rdX_22 == rdX_2.id_final) {
            FH.id_class(this.id_char + 88, this.id_abstract + 45, 20, (float)(this.id_char + 88 - n), (float)(this.id_abstract + 45 - 30 - n2), (cb_3)this.id_volatile.id_class[57]);
        }
    }

    protected boolean id_class(rdX_2 rdX_22, double d, double d2) {
        int n = rdX_22.id_extends();
        int n2 = 28 * n;
        int n3 = 0;
        if (rdX_22.id_volatile()) {
            n2 = this.id_synchronized - 28 * (6 - n) + 2;
        } else if (n > 0) {
            n2 += n;
        }
        n3 = rdX_22.id_native() ? (n3 -= 32) : (n3 += this.id_return);
        return d >= (double)n2 && d <= (double)(n2 + 28) && d2 >= (double)n3 && d2 <= (double)(n3 + 32);
    }

    private void id_class(rdX_2 rdX_22) {
        Object object;
        int n;
        int n2;
        Object object2;
        int n3 = id_private;
        id_private = rdX_22.id_class();
        this.id_long.clear();
        ((FF)this.id_instanceof).id_class.clear();
        if (rdX_22 == rdX_2.id_volatile) {
            object2 = this.id_volatile.id_super();
            for (n2 = 0; n2 < 9; ++n2) {
                VQ vQ = ((Vk_1)object2).id_class(n2);
                if (vQ.isEmpty()) {
                    for (n = 0; n < 9; ++n) {
                        if (n == n2) {
                            object = new rdn_3(rdy_3.Xb);
                            ((rdn_3)object).id_class("CustomCreativeLock");
                            rgP_2 rgP_22 = ((Qw_1)this.id_volatile.id_class[20]).t[n2].id_native();
                            rgP_2 rgP_23 = ((Qw_1)this.id_volatile.id_class[20]).w.id_native();
                            ((rdn_3)object).id_class(new rgn_3("inventory.hotbarInfo", rgP_23, rgP_22));
                            ((FF)this.id_instanceof).id_class.add((rdn_3)object);
                            continue;
                        }
                        ((FF)this.id_instanceof).id_class.add(rdn_3.id_break);
                    }
                    continue;
                }
                ((FF)this.id_instanceof).id_class.addAll((Collection<rdn_3>)((Object)vQ));
            }
        } else if (rdX_22 != rdX_2.id_catch) {
            rdX_22.id_class(((FF)this.id_instanceof).id_class);
        }
        if (rdX_22 == rdX_2.id_final) {
            object2 = (rJT)((cb_3)this.id_volatile.id_class[57]).id_implements[3];
            if (this.id_transient == null) {
                this.id_transient = ImmutableList.copyOf((Collection)((FF)this.id_instanceof).id_throws);
            }
            ((FF)this.id_instanceof).id_throws.clear();
            for (n2 = 0; n2 < ((rJr_1)object2).id_throws.size(); ++n2) {
                int n4;
                if (n2 >= 5 && n2 < 9) {
                    int n5 = n2 - 5;
                    var8_12 = n5 / 2;
                    var9_14 = n5 % 2;
                    n4 = 54 + var8_12 * 54;
                    n = 6 + var9_14 * 27;
                } else if (n2 >= 0 && n2 < 5) {
                    n4 = -2000;
                    n = -2000;
                } else if (n2 == 45) {
                    n4 = 35;
                    n = 20;
                } else {
                    int n6 = n2 - 9;
                    var8_12 = n6 % 9;
                    var9_14 = n6 / 9;
                    n4 = 9 + var8_12 * 18;
                    n = n2 >= 36 ? 112 : 54 + var9_14 * 18;
                }
                object = new FL(((rJr_1)object2).id_throws.get(n2), n2, n4, n);
                ((FF)this.id_instanceof).id_throws.add(object);
            }
            this.id_for = new rJY(id_case, 0, 173, 112);
            ((FF)this.id_instanceof).id_throws.add(this.id_for);
        } else if (n3 == rdX_2.id_final.id_class()) {
            ((FF)this.id_instanceof).id_throws.clear();
            ((FF)this.id_instanceof).id_throws.addAll(this.id_transient);
            this.id_transient = null;
        }
        if (this.id_boolean != null) {
            if (rdX_22 == rdX_2.id_catch) {
                this.id_boolean.id_private(true);
                this.id_boolean.id_catch(false);
                this.id_boolean.id_byte(true);
                if (n3 != rdX_22.id_class()) {
                    this.id_boolean.id_class("");
                }
                this.id_char();
            } else {
                this.id_boolean.id_private(false);
                this.id_boolean.id_catch(true);
                this.id_boolean.id_byte(false);
                this.id_boolean.id_class("");
            }
        }
        this.id_implements = 0.0f;
        ((FF)this.id_instanceof).id_class(0.0f);
    }

    @Override
    public boolean id_class(double d, double d2, double d3) {
        if (!this.id_abstract()) {
            return false;
        }
        int n = (((FF)this.id_instanceof).id_class.size() + 9 - 1) / 9 - 5;
        this.id_implements = (float)((double)this.id_implements - d3 / (double)n);
        this.id_implements = rfU_2.id_class(this.id_implements, 0.0f, 1.0f);
        ((FF)this.id_instanceof).id_class(this.id_implements);
        return true;
    }

    @Override
    protected boolean id_class(double d, double d2, int n, int n2, int n3) {
        boolean bl = d < (double)n || d2 < (double)n2 || d >= (double)(n + this.id_synchronized) || d2 >= (double)(n2 + this.id_return);
        this.r = bl && !this.id_class(rdX_2.id_class[id_private], d, d2);
        return this.r;
    }

    @Override
    public boolean id_class(double d, double d2, int n, double d3, double d4) {
        if (this.id_finally) {
            int n2 = this.id_abstract + 18;
            int n3 = n2 + 112;
            this.id_implements = ((float)d2 - (float)n2 - 7.5f) / ((float)(n3 - n2) - 15.0f);
            this.id_implements = rfU_2.id_class(this.id_implements, 0.0f, 1.0f);
            ((FF)this.id_instanceof).id_class(this.id_implements);
            return true;
        }
        return super.id_class(d, d2, n, d3, d4);
    }

    private /* synthetic */ void id_class(rlW_2 rlW_22, rqO_2 rqO_22) {
        rlb_3 rlb_32 = this.P.put(rqO_22, rlW_22.id_class(rqO_22));
    }

    private static /* synthetic */ boolean id_class(String string, String string2, rqO_2 rqO_22) {
        return rqO_22.id_byte().contains(string) && rqO_22.id_break().contains(string2);
    }

    public static void id_class(QY qY, int n, boolean bl, boolean bl2) {
        cb_3 cb_32 = (cb_3)qY.id_class[57];
        Vk_1 vk_1 = qY.id_super();
        VQ vQ = vk_1.id_class(n);
        if (bl) {
            for (int i = 0; i < rhz_3.id_protected(); ++i) {
                rdn_3 rdn_32 = ((rdn_3)vQ.get(i)).id_implements();
                ((rhz_3)cb_32.id_implements[1]).id_break(i, rdn_32);
                ((Ax_1)qY.id_class[55]).id_class(rdn_32, 36 + i);
            }
            ((rJT)cb_32.id_implements[3]).id_native();
        } else if (bl2) {
            for (int i = 0; i < rhz_3.id_protected(); ++i) {
                vQ.set(i, ((rhz_3)cb_32.id_implements[1]).id_extends(i).id_implements());
            }
            rgP_2 rgP_22 = ((Qw_1)qY.id_class[20]).t[n].id_native();
            rgP_2 rgP_23 = ((Qw_1)qY.id_class[20]).I.id_native();
            ((cq_3)qY.id_class[19]).id_class(new rgn_3("inventory.hotbarSaved", rgP_23, rgP_22), false, false);
            vk_1.id_class();
        }
    }

    protected void id_class(Ml_1 ml_1, rdX_2 rdX_22) {
        boolean bl = rdX_22.id_class() == id_private;
        boolean bl2 = rdX_22.id_native();
        int n = rdX_22.id_extends();
        int n2 = n * 28;
        int n3 = 0;
        int n4 = this.id_char + 28 * n;
        int n5 = this.id_abstract;
        int n6 = 32;
        if (bl) {
            n3 += 32;
        }
        if (rdX_22.id_volatile()) {
            n4 = this.id_char + this.id_synchronized - 28 * (6 - n);
        } else if (n > 0) {
            n4 += n;
        }
        if (bl2) {
            n5 -= 28;
        } else {
            n3 += 64;
            n5 += this.id_return - 4;
        }
        this.id_break(ml_1, n4, n5, n2, n3, 28, 32);
        this.id_final.id_break = 100.0f;
        n5 = n5 + 8 + (bl2 ? 1 : -1);
        RenderSystem.enableRescaleNormal();
        rdn_3 rdn_32 = rdX_22.id_protected();
        this.id_final.id_class(rdn_32, n4 += 6, n5);
        this.id_final.id_class(this.id_super, rdn_32, (float)n4, (float)n5);
        this.id_final.id_break = 0.0f;
    }

    protected boolean id_class(Ml_1 ml_1, rdX_2 rdX_22, int n, int n2) {
        int n3 = rdX_22.id_extends();
        int n4 = 28 * n3;
        int n5 = 0;
        if (rdX_22.id_volatile()) {
            n4 = this.id_synchronized - 28 * (6 - n3) + 2;
        } else if (n3 > 0) {
            n4 += n3;
        }
        n5 = rdX_22.id_native() ? (n5 -= 32) : (n5 += this.id_return);
        if (this.id_class(n4 + 3, n5 + 3, 23, 27, n, n2)) {
            this.id_class(ml_1, rdX_22.id_byte(), n, n2);
            return true;
        }
        return false;
    }

    private void id_class(String string) {
        Object object;
        Predicate<rqO_2> predicate;
        int n = string.indexOf(58);
        if (n == -1) {
            predicate = rqO_22 -> rqO_22.id_break().contains(string);
        } else {
            object = string.substring(0, n).trim();
            String string2 = string.substring(n + 1).trim();
            predicate = arg_0 -> Fv_1.id_class((String)object, string2, arg_0);
        }
        object = rlc_3.id_class();
        object.id_break().stream().filter(predicate).forEach(arg_0 -> this.id_class((rlW_2)object, arg_0));
    }

    @Override
    public void id_class(rJY rJY2, int n, int n2, rXa_1 rXa_12) {
        if (this.id_class(rJY2)) {
            this.id_boolean.id_native();
            this.id_boolean.id_native(0);
        }
        boolean bl = rXa_12 == rXa_1.QUICK_MOVE;
        rXa_1 rXa_13 = rXa_12 = n == -999 && rXa_12 == rXa_1.PICKUP ? rXa_1.THROW : rXa_12;
        if (rJY2 == null && id_private != rdX_2.id_final.id_class() && rXa_12 != rXa_1.QUICK_CRAFT) {
            rhz_3 rhz_32 = (rhz_3)((cb_3)this.id_volatile.id_class[57]).id_implements[1];
            if (!rhz_32.id_finally().id_class() && this.r) {
                if (n2 == 0) {
                    ((cb_3)this.id_volatile.id_class[57]).id_class(rhz_32.id_finally(), true);
                    ((Ax_1)this.id_volatile.id_class[55]).id_class(rhz_32.id_finally());
                    rhz_32.id_private(rdn_3.id_break);
                }
                if (n2 == 1) {
                    rdn_3 rdn_32 = rhz_32.id_finally().id_class(1);
                    ((cb_3)this.id_volatile.id_class[57]).id_class(rdn_32, true);
                    ((Ax_1)this.id_volatile.id_class[55]).id_class(rdn_32);
                }
            }
        } else {
            if (rJY2 != null && !rJY2.id_class((cb_3)this.id_volatile.id_class[57])) {
                return;
            }
            if (rJY2 == this.id_for && bl) {
                for (int i = 0; i < ((rJT)((cb_3)this.id_volatile.id_class[57]).id_implements[3]).id_extends().size(); ++i) {
                    ((Ax_1)this.id_volatile.id_class[55]).id_class(rdn_3.id_break, i);
                }
            } else if (id_private == rdX_2.id_final.id_class()) {
                if (rJY2 == this.id_for) {
                    ((rhz_3)((cb_3)this.id_volatile.id_class[57]).id_implements[1]).id_private(rdn_3.id_break);
                } else if (rXa_12 == rXa_1.THROW && rJY2 != null && rJY2.id_break()) {
                    rdn_3 rdn_33 = rJY2.id_class(n2 == 0 ? 1 : rJY2.id_class().id_byte());
                    rdn_3 rdn_34 = rJY2.id_class();
                    ((cb_3)this.id_volatile.id_class[57]).id_class(rdn_33, true);
                    ((Ax_1)this.id_volatile.id_class[55]).id_class(rdn_33);
                    ((Ax_1)this.id_volatile.id_class[55]).id_class(rdn_34, ((FL)rJY2).id_class.id_protected);
                } else if (rXa_12 == rXa_1.THROW && !((rhz_3)((cb_3)this.id_volatile.id_class[57]).id_implements[1]).id_finally().id_class()) {
                    ((cb_3)this.id_volatile.id_class[57]).id_class(((rhz_3)((cb_3)this.id_volatile.id_class[57]).id_implements[1]).id_finally(), true);
                    ((Ax_1)this.id_volatile.id_class[55]).id_class(((rhz_3)((cb_3)this.id_volatile.id_class[57]).id_implements[1]).id_finally());
                    ((rhz_3)((cb_3)this.id_volatile.id_class[57]).id_implements[1]).id_private(rdn_3.id_break);
                } else {
                    ((rJT)((cb_3)this.id_volatile.id_class[57]).id_implements[3]).id_class(rJY2 == null ? n : ((FL)rJY2).id_class.id_protected, n2, rXa_12, (cb_3)this.id_volatile.id_class[57]);
                    ((rJT)((cb_3)this.id_volatile.id_class[57]).id_implements[3]).id_native();
                }
            } else if (rXa_12 != rXa_1.QUICK_CRAFT && rJY2.id_byte == id_case) {
                rhz_3 rhz_33 = (rhz_3)((cb_3)this.id_volatile.id_class[57]).id_implements[1];
                rdn_3 rdn_35 = rhz_33.id_finally();
                rdn_3 rdn_36 = rJY2.id_class();
                if (rXa_12 == rXa_1.SWAP) {
                    if (!rdn_36.id_class()) {
                        rdn_3 rdn_37 = rdn_36.id_implements();
                        rdn_37.id_throws(rdn_37.id_byte());
                        ((rhz_3)((cb_3)this.id_volatile.id_class[57]).id_implements[1]).id_break(n2, rdn_37);
                        ((rJT)((cb_3)this.id_volatile.id_class[57]).id_implements[3]).id_native();
                    }
                    return;
                }
                if (rXa_12 == rXa_1.CLONE) {
                    if (rhz_33.id_finally().id_class() && rJY2.id_break()) {
                        rdn_3 rdn_38 = rJY2.id_class().id_implements();
                        rdn_38.id_throws(rdn_38.id_byte());
                        rhz_33.id_private(rdn_38);
                    }
                    return;
                }
                if (rXa_12 == rXa_1.THROW) {
                    if (!rdn_36.id_class()) {
                        rdn_3 rdn_39 = rdn_36.id_implements();
                        rdn_39.id_throws(n2 == 0 ? 1 : rdn_39.id_byte());
                        ((cb_3)this.id_volatile.id_class[57]).id_class(rdn_39, true);
                        ((Ax_1)this.id_volatile.id_class[55]).id_class(rdn_39);
                    }
                    return;
                }
                if (!rdn_35.id_class() && !rdn_36.id_class() && rdn_35.id_class(rdn_36) && rdn_3.id_class(rdn_35, rdn_36)) {
                    if (n2 == 0) {
                        if (bl) {
                            rdn_35.id_throws(rdn_35.id_byte());
                        } else if (rdn_35.id_char() < rdn_35.id_byte()) {
                            rdn_35.id_case(1);
                        }
                    } else {
                        rdn_35.id_catch(1);
                    }
                } else if (!rdn_36.id_class() && rdn_35.id_class()) {
                    rhz_33.id_private(rdn_36.id_implements());
                    rdn_35 = rhz_33.id_finally();
                    if (bl) {
                        rdn_35.id_throws(rdn_35.id_byte());
                    }
                } else if (n2 == 0) {
                    rhz_33.id_private(rdn_3.id_break);
                } else {
                    rhz_33.id_finally().id_catch(1);
                }
            } else if (this.id_instanceof != null) {
                rdn_3 rdn_310 = rJY2 == null ? rdn_3.id_break : ((FF)this.id_instanceof).id_class(rJY2.id_protected).id_class();
                ((FF)this.id_instanceof).id_class(rJY2 == null ? n : rJY2.id_protected, n2, rXa_12, (cb_3)this.id_volatile.id_class[57]);
                if (rJr_1.id_byte(n2) == 2) {
                    for (int i = 0; i < 9; ++i) {
                        ((Ax_1)this.id_volatile.id_class[55]).id_class(((FF)this.id_instanceof).id_class(45 + i).id_class(), 36 + i);
                    }
                } else if (rJY2 != null) {
                    rdn_3 rdn_311 = ((FF)this.id_instanceof).id_class(rJY2.id_protected).id_class();
                    ((Ax_1)this.id_volatile.id_class[55]).id_class(rdn_311, rJY2.id_protected - ((FF)this.id_instanceof).id_throws.size() + 9 + 36);
                    int n3 = 45 + n2;
                    if (rXa_12 == rXa_1.SWAP) {
                        ((Ax_1)this.id_volatile.id_class[55]).id_class(rdn_310, n3 - ((FF)this.id_instanceof).id_throws.size() + 9 + 36);
                    } else if (rXa_12 == rXa_1.THROW && !rdn_310.id_class()) {
                        rdn_3 rdn_312 = rdn_310.id_implements();
                        rdn_312.id_throws(n2 == 0 ? 1 : rdn_312.id_byte());
                        ((cb_3)this.id_volatile.id_class[57]).id_class(rdn_312, true);
                        ((Ax_1)this.id_volatile.id_class[55]).id_class(rdn_312);
                    }
                    ((rJT)((cb_3)this.id_volatile.id_class[57]).id_implements[3]).id_native();
                }
            }
        }
    }

    @Override
    public boolean id_class(int n, int n2, int n3) {
        this.id_switch = false;
        if (id_private != rdX_2.id_catch.id_class()) {
            if (((Qw_1)this.id_volatile.id_class[20]).v.id_class(n, n2)) {
                this.id_switch = true;
                this.id_class(rdX_2.id_catch);
                return true;
            }
            return super.id_class(n, n2, n3);
        }
        boolean bl = !this.id_class(this.id_interface) || this.id_interface.id_break();
        boolean bl2 = Ve_1.id_class(n, n2).id_throws().isPresent();
        if (bl && bl2 && this.id_class(n, n2)) {
            this.id_switch = true;
            return true;
        }
        String string = this.id_boolean.id_private();
        if (this.id_boolean.id_class(n, n2, n3)) {
            if (!Objects.equals(string, this.id_boolean.id_private())) {
                this.id_char();
            }
            return true;
        }
        return this.id_boolean.aO_() && this.id_boolean.id_int() && n != 256 ? true : super.id_class(n, n2, n3);
    }

    private boolean id_class(rJY rJY2) {
        return rJY2 != null && rJY2.id_byte == id_case;
    }

    @Override
    public void id_class(QY qY, int n, int n2) {
        String string = this.id_boolean.id_private();
        this.id_break(qY, n, n2);
        this.id_boolean.id_class(string);
        if (!this.id_boolean.id_private().isEmpty()) {
            this.id_char();
        }
    }

    @Override
    public boolean id_class(char c, int n) {
        if (this.id_switch) {
            return false;
        }
        if (id_private != rdX_2.id_catch.id_class()) {
            return false;
        }
        String string = this.id_boolean.id_private();
        if (this.id_boolean.id_class(c, n)) {
            if (!Objects.equals(string, this.id_boolean.id_private())) {
                this.id_char();
            }
            return true;
        }
        return false;
    }

    @Override
    public boolean id_class(double d, double d2, int n) {
        if (n == 0) {
            double d3 = d - (double)this.id_char;
            double d4 = d2 - (double)this.id_abstract;
            this.id_finally = false;
            for (rdX_2 rdX_22 : rdX_2.id_class) {
                if (!this.id_class(rdX_22, d3, d4)) continue;
                this.id_class(rdX_22);
                return true;
            }
        }
        return super.id_class(d, d2, n);
    }

    @Override
    protected void id_class(Ml_1 ml_1, int n, int n2) {
        rdX_2 rdX_22 = rdX_2.id_class[id_private];
        if (rdX_22.id_catch()) {
            RenderSystem.disableBlend();
            this.id_super.id_byte(ml_1, rdX_22.id_byte(), 8.0f, 6.0f, 0x404040);
        }
    }

    @Override
    public boolean id_break(int n, int n2, int n3) {
        this.id_switch = false;
        return super.id_break(n, n2, n3);
    }

    @Override
    public boolean id_break(double d, double d2, int n) {
        if (n == 0) {
            double d3 = d - (double)this.id_char;
            double d4 = d2 - (double)this.id_abstract;
            for (rdX_2 rdX_22 : rdX_2.id_class) {
                if (!this.id_class(rdX_22, d3, d4)) continue;
                return true;
            }
            if (id_private != rdX_2.id_final.id_class() && this.id_protected(d, d2)) {
                this.id_finally = this.id_abstract();
                return true;
            }
        }
        return super.id_break(d, d2, n);
    }

    @Override
    protected void id_throws() {
        int n = this.id_char;
        super.id_throws();
        if (this.id_boolean != null && this.id_char != n) {
            this.id_boolean.id_final(this.id_char - 125);
        }
    }

    @Override
    public boolean id_finally() {
        return false;
    }

    protected boolean id_protected(double d, double d2) {
        int n = this.id_char;
        int n2 = this.id_abstract;
        int n3 = n + 175;
        int n4 = n2 + 18;
        int n5 = n3 + 14;
        int n6 = n4 + 112;
        return d >= (double)n3 && d2 >= (double)n4 && d < (double)n5 && d2 < (double)n6;
    }

    @Override
    public void id_private() {
        if (!((Ax_1)this.id_volatile.id_class[55]).id_catch()) {
            this.id_volatile.id_break(new FH((cb_3)this.id_volatile.id_class[57]));
        } else if (this.id_boolean != null) {
            this.id_boolean.id_catch();
        }
    }

    private boolean id_abstract() {
        return id_private != rdX_2.id_final.id_class() && rdX_2.id_class[id_private].id_implements() && ((FF)this.id_instanceof).id_class();
    }

    @Override
    public List<LZ> id_native() {
        return null;
    }

    @Override
    protected void v_() {
        if (((Ax_1)this.id_volatile.id_class[55]).id_catch()) {
            super.v_();
            ((Qj_1)this.id_volatile.id_class[23]).id_class(true);
            this.id_boolean = new Lu_1(this.id_super, this.id_char + 82, this.id_abstract + 6, 80, 9, new rgn_3("itemGroup.search"));
            this.id_boolean.id_implements(50);
            this.id_boolean.id_protected(false);
            this.id_boolean.id_private(false);
            this.id_boolean.id_finally(0xFFFFFF);
            this.id_native.add(this.id_boolean);
            int n = id_private;
            id_private = -1;
            this.id_class(rdX_2.id_class[n]);
            ((rJT)((cb_3)this.id_volatile.id_class[57]).id_implements[3]).id_break(this.id_double);
            this.id_double = new FZ(this.id_volatile);
            ((rJT)((cb_3)this.id_volatile.id_class[57]).id_implements[3]).id_class(this.id_double);
        } else {
            this.id_volatile.id_break(new FH((cb_3)this.id_volatile.id_class[57]));
        }
    }

    @Override
    public void w_() {
        super.w_();
        if ((cb_3)this.id_volatile.id_class[57] != null && (rhz_3)((cb_3)this.id_volatile.id_class[57]).id_implements[1] != null) {
            ((rJT)((cb_3)this.id_volatile.id_class[57]).id_implements[3]).id_break(this.id_double);
        }
        ((Qj_1)this.id_volatile.id_class[23]).id_class(false);
    }
}

