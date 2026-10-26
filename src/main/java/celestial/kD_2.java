/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 */
package celestial;

import celestial.Jq_1;
import celestial.Qs_1;
import celestial.dz_3;
import celestial.iB_2;
import celestial.ka_3;
import celestial.ke_3;
import celestial.ky_3;
import celestial.rCL;
import celestial.rCN;
import celestial.rCT;
import celestial.rCg_1;
import celestial.rHa_1;
import celestial.rLT;
import celestial.rRg_1;
import celestial.rRq_1;
import celestial.rYB;
import celestial.rdn_3;
import celestial.rfH_2;
import celestial.rhd_3;
import celestial.rjC_2;
import celestial.rjm_3;
import celestial.rjw_3;
import celestial.rpa_3;
import celestial.rpr_3;
import celestial.rqL_2;
import celestial.rqd_3;
import celestial.rqn_3;
import celestial.rrEm_1;
import celestial.rxx_3;
import celestial.ryO_2;
import celestial.xc_3;
import celestial.xd_3;
import celestial.xu_3;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class kD_2
extends dz_3 {
    public static final rCN id_final = rCT.id_catch;
    protected static final rjC_2 id_package = xd_3.id_class(0.0, 0.0, 0.0, 12.0, 16.0, 16.0);
    protected static final rjC_2 id_int = xd_3.id_class(4.0, 0.0, 0.0, 16.0, 16.0, 16.0);
    protected static final rjC_2 id_new = xd_3.id_class(0.0, 0.0, 0.0, 16.0, 16.0, 12.0);
    protected static final rjC_2 id_continue = xd_3.id_class(0.0, 0.0, 4.0, 16.0, 16.0, 16.0);
    protected static final rjC_2 id_super = xd_3.id_class(0.0, 0.0, 0.0, 16.0, 12.0, 16.0);
    protected static final rjC_2 id_this = xd_3.id_class(0.0, 4.0, 0.0, 16.0, 16.0, 16.0);
    private final boolean id_else;

    public kD_2(boolean bl, Jq_1 jq_1) {
        super(jq_1);
        this.id_extends((xc_3)((xc_3)((xc_3)this.id_abstract.id_break()).id_class(id_volatile, rpr_3.NORTH)).id_class(id_final, false));
        this.id_else = bl;
    }

    @Override
    public xc_3 id_class(xc_3 xc_32, rpa_3 rpa_32) {
        return xc_32.id_class(rpa_32.id_class(xc_32.id_byte(id_volatile)));
    }

    @Override
    public xc_3 id_class(xc_3 xc_32, rqd_3 rqd_32) {
        return (xc_3)xc_32.id_class(id_volatile, rqd_32.id_class(xc_32.id_byte(id_volatile)));
    }

    private boolean id_class(rYB rYB2, rfH_2 rfH_22, rpr_3 rpr_32, boolean bl) {
        int n;
        Object object;
        Object object3;
        int n2;
        Object object4;
        xc_3[] xc_3Array;
        ke_3 ke_32;
        rfH_2 rfH_23 = rfH_22.id_break(rpr_32);
        if (!bl && rYB2.id_byte(rfH_23).id_class(xu_3.rS)) {
            rYB2.id_class(rfH_23, xu_3.id_class.id_continue(), 20);
        }
        if (!(ke_32 = new ke_3(rYB2, rfH_22, rpr_32, bl)).id_class()) {
            return false;
        }
        HashMap hashMap = Maps.newHashMap();
        List<rfH_2> list = ke_32.id_break();
        ArrayList arrayList = Lists.newArrayList();
        for (int i = 0; i < list.size(); ++i) {
            xc_3Array = list.get(i);
            object4 = rYB2.id_byte((rfH_2)xc_3Array);
            arrayList.add(object4);
            hashMap.put(xc_3Array, object4);
        }
        List<rfH_2> list2 = ke_32.id_byte();
        xc_3Array = new xc_3[list.size() + list2.size()];
        object4 = bl ? rpr_32 : rpr_32.id_case();
        int n3 = 0;
        for (n2 = list2.size() - 1; n2 >= 0; --n2) {
            object3 = list2.get(n2);
            xc_3 object22 = rYB2.id_byte((rfH_2)object3);
            object = object22.id_break().id_protected() ? rYB2.id_class((rfH_2)object3) : null;
            kD_2.id_class(object22, rYB2, (rfH_2)object3, (ryO_2)object);
            rYB2.id_class((rfH_2)object3, xu_3.id_class.id_continue(), 18);
            xc_3Array[n3++] = object22;
        }
        for (n2 = list.size() - 1; n2 >= 0; --n2) {
            object3 = list.get(n2);
            xc_3 xc_32 = rYB2.id_byte((rfH_2)object3);
            object3 = ((rfH_2)object3).id_break((rpr_3)object4);
            hashMap.remove(object3);
            rYB2.id_class((rfH_2)object3, (xc_3)xu_3.rc.id_continue().id_class(id_volatile, rpr_32), 68);
            rYB2.id_class((rfH_2)object3, ky_3.id_class((xc_3)arrayList.get(n2), rpr_32, bl, false));
            xc_3Array[n3++] = xc_32;
        }
        if (bl) {
            rCg_1 rCg_12 = this.id_else ? rCg_1.STICKY : rCg_1.DEFAULT;
            object3 = (xc_3)((xc_3)xu_3.rS.id_continue().id_class(ka_3.id_volatile, rpr_32)).id_class(ka_3.id_final, rCg_12);
            xc_3 xc_33 = (xc_3)((xc_3)xu_3.rc.id_continue().id_class(ky_3.id_volatile, rpr_32)).id_class(ky_3.id_final, this.id_else ? rCg_1.STICKY : rCg_1.DEFAULT);
            hashMap.remove(rfH_23);
            rYB2.id_class(rfH_23, xc_33, 68);
            rYB2.id_class(rfH_23, ky_3.id_class((xc_3)object3, rpr_32, true, true));
        }
        xc_3 xc_32 = xu_3.id_class.id_continue();
        for (rfH_2 rfH_24 : hashMap.keySet()) {
            rYB2.id_class(rfH_24, xc_32, 82);
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            object = (rfH_2)entry.getKey();
            xc_3 xc_34 = (xc_3)entry.getValue();
            xc_34.id_break(rYB2, (rfH_2)object, 2);
            xc_32.id_class((rRg_1)rYB2, (rfH_2)object, 2);
            xc_32.id_break(rYB2, (rfH_2)object, 2);
        }
        n3 = 0;
        for (n = list2.size() - 1; n >= 0; --n) {
            xc_3 xc_35 = xc_3Array[n3++];
            object = list2.get(n);
            xc_35.id_break(rYB2, (rfH_2)object, 2);
            rYB2.id_break((rfH_2)object, xc_35.id_break());
        }
        for (n = list.size() - 1; n >= 0; --n) {
            rYB2.id_break(list.get(n), xc_3Array[n3++].id_break());
        }
        if (bl) {
            rYB2.id_break(rfH_23, xu_3.rS);
        }
        return true;
    }

    public static boolean id_class(xc_3 xc_32, rYB rYB2, rfH_2 rfH_22, rpr_3 rpr_32, boolean bl, rpr_3 rpr_33) {
        if (rfH_22.c_() >= 0 && rfH_22.c_() <= rYB2.id_try() - 1 && rYB2.id_instanceof().id_class(rfH_22)) {
            if (xc_32.id_catch()) {
                return true;
            }
            if (!(xc_32.id_class(xu_3.rg) || xc_32.id_class(xu_3.Jd) || xc_32.id_class(xu_3.Jk))) {
                if (rpr_32 == rpr_3.DOWN && rfH_22.c_() == 0) {
                    return false;
                }
                if (rpr_32 == rpr_3.UP && rfH_22.c_() == rYB2.id_try() - 1) {
                    return false;
                }
                if (!xc_32.id_class(xu_3.rB) && !xc_32.id_class(xu_3.D)) {
                    if (xc_32.id_private(rYB2, rfH_22) == -1.0f) {
                        return false;
                    }
                    switch (xc_32.id_extends()) {
                        case BLOCK: {
                            return false;
                        }
                        case DESTROY: {
                            return bl;
                        }
                        case PUSH_ONLY: {
                            return rpr_32 == rpr_33;
                        }
                    }
                } else if (xc_32.id_byte(id_final).booleanValue()) {
                    return false;
                }
                return !xc_32.id_break().id_protected();
            }
            return false;
        }
        return false;
    }

    @Override
    protected void id_class(rCL<xd_3, xc_3> rCL2) {
        rCL2.id_class(id_volatile, id_final);
    }

    @Override
    public boolean id_class(xc_3 xc_32, rRq_1 rRq_12, rfH_2 rfH_22, rLT rLT2) {
        return false;
    }

    @Override
    public boolean id_class(xc_3 xc_32, rYB rYB2, rfH_2 rfH_22, int n, int n2) {
        rpr_3 rpr_32 = xc_32.id_byte(id_volatile);
        if (!rYB2.id_continue) {
            boolean bl = this.id_class(rYB2, rfH_22, rpr_32);
            if (bl && (n == 1 || n == 2)) {
                rYB2.id_class(rfH_22, (xc_3)xc_32.id_class(id_final, true), 2);
                return false;
            }
            if (!bl && n == 0) {
                return false;
            }
        }
        if (n == 0) {
            if (!this.id_class(rYB2, rfH_22, rpr_32, true)) {
                return false;
            }
            rYB2.id_class(rfH_22, (xc_3)xc_32.id_class(id_final, true), 67);
            rYB2.id_class((rhd_3)null, rfH_22, rqn_3.hN, rqL_2.BLOCKS, 0.5f, rYB2.id_int.nextFloat() * 0.25f + 0.6f);
        } else if (n == 1 || n == 2) {
            ryO_2 ryO_22 = rYB2.id_class(rfH_22.id_break(rpr_32));
            if (ryO_22 instanceof rHa_1) {
                ((rHa_1)ryO_22).id_volatile();
            }
            xc_3 xc_33 = (xc_3)((xc_3)xu_3.rc.id_continue().id_class(ky_3.id_volatile, rpr_32)).id_class(ky_3.id_final, this.id_else ? rCg_1.STICKY : rCg_1.DEFAULT);
            rYB2.id_class(rfH_22, xc_33, 20);
            rYB2.id_class(rfH_22, ky_3.id_class((xc_3)this.id_continue().id_class(id_volatile, rpr_3.id_class(n2 & 7)), rpr_32, false, true));
            rYB2.id_class(rfH_22, xc_33.id_break());
            xc_33.id_class((rRg_1)rYB2, rfH_22, 2);
            if (this.id_else) {
                rHa_1 rHa_12;
                ryO_2 ryO_23;
                rfH_2 rfH_23 = rfH_22.id_break(rpr_32.id_implements() * 2, rpr_32.id_finally() * 2, rpr_32.id_extends() * 2);
                xc_3 xc_34 = rYB2.id_byte(rfH_23);
                boolean bl = false;
                if (xc_34.id_class(xu_3.rc) && (ryO_23 = rYB2.id_class(rfH_23)) instanceof rHa_1 && (rHa_12 = (rHa_1)ryO_23).id_private() == rpr_32 && rHa_12.id_catch()) {
                    rHa_12.id_volatile();
                    bl = true;
                }
                if (!bl) {
                    if (n != 1 || xc_34.id_catch() || !kD_2.id_class(xc_34, rYB2, rfH_23, rpr_32.id_case(), false, rpr_32) || xc_34.id_extends() != Qs_1.NORMAL && !xc_34.id_class(xu_3.rB) && !xc_34.id_class(xu_3.D)) {
                        rYB2.id_class(rfH_22.id_break(rpr_32), false);
                    } else {
                        this.id_class(rYB2, rfH_22, rpr_32, false);
                    }
                }
            } else {
                rYB2.id_class(rfH_22.id_break(rpr_32), false);
            }
            rYB2.id_class((rhd_3)null, rfH_22, rqn_3.hQ, rqL_2.BLOCKS, 0.5f, rYB2.id_int.nextFloat() * 0.15f + 0.6f);
        }
        return true;
    }

    @Override
    public xc_3 id_class(rxx_3 rxx_32) {
        return (xc_3)((xc_3)this.id_continue().id_class(id_volatile, rxx_32.id_protected().id_case())).id_class(id_final, false);
    }

    @Override
    public void id_class(xc_3 xc_32, rYB rYB2, rfH_2 rfH_22, xc_3 xc_33, boolean bl) {
        if (!xc_33.id_class(xc_32.id_break()) && !rYB2.id_continue && rYB2.id_class(rfH_22) == null) {
            this.id_class(rYB2, rfH_22, xc_32);
        }
    }

    @Override
    public void id_class(xc_3 xc_32, rYB rYB2, rfH_2 rfH_22, xd_3 xd_32, rfH_2 rfH_23, boolean bl) {
        if (!rYB2.id_continue) {
            this.id_class(rYB2, rfH_22, xc_32);
        }
    }

    @Override
    public void id_class(rYB rYB2, rfH_2 rfH_22, xc_3 xc_32, iB_2 iB_22, rdn_3 rdn_32) {
        if (!rYB2.id_continue) {
            this.id_class(rYB2, rfH_22, xc_32);
        }
    }

    @Override
    public rjC_2 id_class(xc_3 xc_32, rRq_1 rRq_12, rfH_2 rfH_22, rjm_3 rjm_32) {
        if (xc_32.id_byte(id_final).booleanValue()) {
            switch (xc_32.id_byte(id_volatile)) {
                case DOWN: {
                    return id_this;
                }
                default: {
                    return id_super;
                }
                case NORTH: {
                    return id_continue;
                }
                case SOUTH: {
                    return id_new;
                }
                case WEST: {
                    return id_int;
                }
                case EAST: 
            }
            return id_package;
        }
        return rjw_3.id_break();
    }

    private boolean id_class(rYB rYB2, rfH_2 rfH_22, rpr_3 rpr_32) {
        for (rpr_3 rpr_33 : rpr_3.values()) {
            if (rpr_33 == rpr_32 || !rYB2.id_break(rfH_22.id_break(rpr_33), rpr_33)) continue;
            return true;
        }
        if (rYB2.id_break(rfH_22, rpr_3.DOWN)) {
            return true;
        }
        rfH_2 rfH_23 = rfH_22.id_final();
        for (rpr_3 rpr_34 : rpr_3.values()) {
            if (rpr_34 == rpr_3.DOWN || !rYB2.id_break(rfH_23.id_break(rpr_34), rpr_34)) continue;
            return true;
        }
        return false;
    }

    private void id_class(rYB rYB2, rfH_2 rfH_22, xc_3 xc_32) {
        rpr_3 rpr_32 = xc_32.id_byte(id_volatile);
        boolean bl = this.id_class(rYB2, rfH_22, rpr_32);
        if (bl && !xc_32.id_byte(id_final).booleanValue()) {
            if (new ke_3(rYB2, rfH_22, rpr_32, true).id_class()) {
                rYB2.id_class(rfH_22, this, 0, rpr_32.id_byte());
            }
        } else if (!bl && xc_32.id_byte(id_final).booleanValue()) {
            rHa_1 rHa_12;
            ryO_2 ryO_22;
            rfH_2 rfH_23 = rfH_22.id_class(rpr_32, 2);
            xc_3 xc_33 = rYB2.id_byte(rfH_23);
            int n = 1;
            if (xc_33.id_class(xu_3.rc) && xc_33.id_byte(id_volatile) == rpr_32 && (ryO_22 = rYB2.id_class(rfH_23)) instanceof rHa_1 && (rHa_12 = (rHa_1)ryO_22).id_catch() && (rHa_12.id_class(0.0f) < 0.5f || rYB2.r() == rHa_12.id_final() || ((rrEm_1)rYB2).id_case())) {
                n = 2;
            }
            rYB2.id_class(rfH_22, this, n, rpr_32.id_byte());
        }
    }

    @Override
    public boolean id_break(xc_3 xc_32) {
        return xc_32.id_byte(id_final);
    }
}

