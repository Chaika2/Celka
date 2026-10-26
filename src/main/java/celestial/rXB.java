/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  com.mojang.datafixers.util.Pair
 *  it.unimi.dsi.fastutil.objects.Object2ByteLinkedOpenHashMap
 *  it.unimi.dsi.fastutil.shorts.Short2BooleanMap
 *  it.unimi.dsi.fastutil.shorts.Short2BooleanOpenHashMap
 *  it.unimi.dsi.fastutil.shorts.Short2ObjectMap
 *  it.unimi.dsi.fastutil.shorts.Short2ObjectOpenHashMap
 */
package celestial;

import celestial.JC;
import celestial.QP;
import celestial.dN_2;
import celestial.kJ_2;
import celestial.rCL;
import celestial.rCN;
import celestial.rCT;
import celestial.rCZ;
import celestial.rCm_1;
import celestial.rRR;
import celestial.rRg_1;
import celestial.rRq_1;
import celestial.rXE;
import celestial.rXG;
import celestial.rXS;
import celestial.rXs_1;
import celestial.rYB;
import celestial.rfH_2;
import celestial.rfw_3;
import celestial.rjC_2;
import celestial.rjU_2;
import celestial.rja_3;
import celestial.rjw_3;
import celestial.rls_3;
import celestial.rpb_3;
import celestial.rpr_3;
import celestial.xc_3;
import celestial.xd_3;
import celestial.xu_3;
import celestial.xz_3;
import com.google.common.collect.Maps;
import com.mojang.datafixers.util.Pair;
import it.unimi.dsi.fastutil.objects.Object2ByteLinkedOpenHashMap;
import it.unimi.dsi.fastutil.shorts.Short2BooleanMap;
import it.unimi.dsi.fastutil.shorts.Short2BooleanOpenHashMap;
import it.unimi.dsi.fastutil.shorts.Short2ObjectMap;
import it.unimi.dsi.fastutil.shorts.Short2ObjectOpenHashMap;
import java.util.EnumMap;
import java.util.Map;

public abstract class rXB
extends rXs_1 {
    public static final rCN id_class = rCT.id_implements;
    public static final rCm_1 id_break = rCT.F;
    private static final ThreadLocal<Object2ByteLinkedOpenHashMap<xz_3>> id_throws = ThreadLocal.withInitial(() -> {
        rXS rXS2 = new rXS(200);
        rXS2.defaultReturnValue((byte)127);
        return rXS2;
    });
    private final Map<rXE, rjC_2> id_case = Maps.newIdentityHashMap();

    protected abstract int id_byte(rRR var1);

    private static boolean id_byte(rXE rXE2, rRq_1 rRq_12, rfH_2 rfH_22) {
        return rXE2.id_class().id_class(rRq_12.id_break(rfH_22.id_final()).id_class());
    }

    private boolean id_class(rRq_1 rRq_12, rfH_2 rfH_22, xc_3 xc_32, rXs_1 rXs_12) {
        xd_3 xd_32 = xc_32.id_break();
        if (xd_32 instanceof kJ_2) {
            return ((kJ_2)((Object)xd_32)).id_class(rRq_12, rfH_22, xc_32, rXs_12);
        }
        if (!(xd_32 instanceof dN_2) && !xd_32.id_class(rls_3.X) && xd_32 != xu_3.PJ && xd_32 != xu_3.Pf && xd_32 != xu_3.hM) {
            QP qP = xc_32.id_byte();
            if (qP != QP.id_byte && qP != QP.id_break && qP != QP.id_case && qP != QP.id_implements) {
                return !qP.id_byte();
            }
            return false;
        }
        return false;
    }

    protected boolean id_class(rRq_1 rRq_12, rfH_2 rfH_22, xc_3 xc_32, rpr_3 rpr_32, rfH_2 rfH_23, xc_3 xc_33, rXE rXE2, rXs_1 rXs_12) {
        return rXE2.id_class(rRq_12, rfH_23, rXs_12, rpr_32) && this.id_class(rpr_32, rRq_12, rfH_22, xc_32, rfH_23, xc_33) && this.id_class(rRq_12, rfH_23, xc_33, rXs_12);
    }

    @Override
    public rjU_2 id_class(rRq_1 rRq_12, rfH_2 rfH_22, rXE rXE2) {
        double d = 0.0;
        double d2 = 0.0;
        rfw_3 rfw_32 = new rfw_3();
        for (Object object : rpb_3.HORIZONTAL) {
            rfw_32.id_class((rja_3)rfH_22, (rpr_3)object);
            Object object2 = rRq_12.id_break(rfw_32);
            if (!this.id_catch((rXE)object2)) continue;
            float f = ((rXE)object2).id_protected();
            float f2 = 0.0f;
            if (f == 0.0f) {
                rfH_2 rfH_23;
                rXE rXE3;
                if (!rRq_12.id_byte(rfw_32).id_byte().id_byte() && this.id_catch(rXE3 = rRq_12.id_break(rfH_23 = rfw_32.id_break())) && (f = rXE3.id_protected()) > 0.0f) {
                    f2 = rXE2.id_protected() - (f - 0.8888889f);
                }
            } else if (f > 0.0f) {
                f2 = rXE2.id_protected() - f;
            }
            if (f2 == 0.0f) continue;
            d += (double)((float)((rpr_3)object).id_implements() * f2);
            d2 += (double)((float)((rpr_3)object).id_extends() * f2);
        }
        Object object = new rjU_2(d, 0.0, d2);
        if (rXE2.id_byte(id_class).booleanValue()) {
            for (Object object2 : rpb_3.HORIZONTAL) {
                rfw_32.id_class((rja_3)rfH_22, (rpr_3)object2);
                if (!this.id_class(rRq_12, (rfH_2)rfw_32, (rpr_3)object2) && !this.id_class(rRq_12, rfw_32.id_final(), (rpr_3)object2)) continue;
                object = ((rjU_2)object).id_protected().id_break(0.0, -6.0, 0.0);
                break;
            }
        }
        return ((rjU_2)object).id_protected();
    }

    protected int id_class(rYB rYB2, rfH_2 rfH_22, rXE rXE2, rXE rXE3) {
        return this.id_class(rYB2);
    }

    private int id_class(rRR rRR2, rfH_2 rfH_22) {
        int n = 0;
        for (rpr_3 rpr_32 : rpb_3.HORIZONTAL) {
            rfH_2 rfH_23 = rfH_22.id_break(rpr_32);
            rXE rXE2 = rRR2.id_break(rfH_23);
            if (!this.id_private(rXE2)) continue;
            ++n;
        }
        return n;
    }

    private boolean id_class(rRq_1 rRq_12, rXs_1 rXs_12, rfH_2 rfH_22, xc_3 xc_32, rpr_3 rpr_32, rfH_2 rfH_23, xc_3 xc_33, rXE rXE2) {
        return !this.id_private(rXE2) && this.id_class(rpr_32, rRq_12, rfH_22, xc_32, rfH_23, xc_33) && this.id_class(rRq_12, rfH_23, xc_33, rXs_12);
    }

    private boolean id_class(rRq_1 rRq_12, rXs_1 rXs_12, rfH_2 rfH_22, xc_3 xc_32, rfH_2 rfH_23, xc_3 xc_33) {
        if (!this.id_class(rpr_3.DOWN, rRq_12, rfH_22, xc_32, rfH_23, xc_33)) {
            return false;
        }
        return xc_33.id_volatile().id_class().id_class(this) ? true : this.id_class(rRq_12, rfH_23, xc_33, rXs_12);
    }

    @Override
    public float id_class(rXE rXE2) {
        return (float)rXE2.id_throws() / 9.0f;
    }

    @Override
    public float id_class(rXE rXE2, rRq_1 rRq_12, rfH_2 rfH_22) {
        return rXB.id_byte(rXE2, rRq_12, rfH_22) ? 1.0f : rXE2.id_protected();
    }

    @Override
    protected void id_class(rCL<rXs_1, rXE> rCL2) {
        rCL2.id_class(new rCZ[]{id_class});
    }

    @Override
    public void id_class(rYB rYB2, rfH_2 rfH_22, rXE rXE2) {
        if (!rXE2.id_break()) {
            rXE rXE3 = this.id_class((rRR)rYB2, rfH_22, rYB2.id_byte(rfH_22));
            int n = this.id_class(rYB2, rfH_22, rXE2, rXE3);
            if (rXE3.id_byte()) {
                rXE2 = rXE3;
                rYB2.id_class(rfH_22, xu_3.id_class.id_continue(), 3);
            } else if (!rXE3.equals(rXE2)) {
                rXE2 = rXE3;
                xc_3 xc_32 = rXE3.id_catch();
                rYB2.id_class(rfH_22, xc_32, 2);
                rYB2.id_extends().id_class(rfH_22, rXE3.id_class(), n);
                rYB2.id_break(rfH_22, xc_32.id_break());
            }
        }
        this.id_class((rRg_1)rYB2, rfH_22, rXE2);
    }

    public rXE id_class(int n, boolean bl) {
        return (rXE)((rXE)this.id_protected().id_private().id_class(id_break, n)).id_class(id_class, bl);
    }

    protected void id_class(rRg_1 rRg_12, rfH_2 rfH_22, rXE rXE2) {
        if (!rXE2.id_byte()) {
            xc_3 xc_32 = rRg_12.id_byte(rfH_22);
            rfH_2 rfH_23 = rfH_22.id_break();
            xc_3 xc_33 = rRg_12.id_byte(rfH_23);
            rXE rXE3 = this.id_class((rRR)rRg_12, rfH_23, xc_33);
            if (this.id_class((rRq_1)rRg_12, rfH_22, xc_32, rpr_3.DOWN, rfH_23, xc_33, rRg_12.id_break(rfH_23), rXE3.id_class())) {
                this.id_class(rRg_12, rfH_23, xc_33, rpr_3.DOWN, rXE3);
                if (this.id_class(rRg_12, rfH_22) >= 3) {
                    this.id_class(rRg_12, rfH_22, rXE2, xc_32);
                }
            } else if (rXE2.id_break() || !this.id_class(rRg_12, rXE3.id_class(), rfH_22, xc_32, rfH_23, xc_33)) {
                this.id_class(rRg_12, rfH_22, rXE2, xc_32);
            }
        }
    }

    public rXE id_class(boolean bl) {
        return (rXE)this.id_throws().id_private().id_class(id_class, bl);
    }

    protected boolean id_class(rRq_1 rRq_12, rfH_2 rfH_22, rpr_3 rpr_32) {
        xc_3 xc_32 = rRq_12.id_byte(rfH_22);
        rXE rXE2 = rRq_12.id_break(rfH_22);
        if (rXE2.id_class().id_class(this)) {
            return false;
        }
        if (rpr_32 == rpr_3.UP) {
            return true;
        }
        return xc_32.id_byte() == QP.id_long ? false : xc_32.id_protected(rRq_12, rfH_22, rpr_32);
    }

    private void id_class(rRg_1 rRg_12, rfH_2 rfH_22, rXE rXE2, xc_3 xc_32) {
        int n = rXE2.id_throws() - this.id_byte(rRg_12);
        if (rXE2.id_byte(id_class).booleanValue()) {
            n = 7;
        }
        if (n > 0) {
            Map<rpr_3, rXE> map = this.id_break(rRg_12, rfH_22, xc_32);
            for (Map.Entry<rpr_3, rXE> entry : map.entrySet()) {
                xc_3 xc_33;
                rpr_3 rpr_32 = entry.getKey();
                rXE rXE3 = entry.getValue();
                rfH_2 rfH_23 = rfH_22.id_break(rpr_32);
                if (!this.id_class((rRq_1)rRg_12, rfH_22, xc_32, rpr_32, rfH_23, xc_33 = rRg_12.id_byte(rfH_23), rRg_12.id_break(rfH_23), rXE3.id_class())) continue;
                this.id_class(rRg_12, rfH_23, xc_33, rpr_32, rXE3);
            }
        }
    }

    private boolean id_class(rpr_3 rpr_32, rRq_1 rRq_12, rfH_2 rfH_22, xc_3 xc_32, rfH_2 rfH_23, xc_3 xc_33) {
        rjC_2 rjC_22;
        rjC_2 rjC_23;
        boolean bl;
        xz_3 xz_32;
        Object2ByteLinkedOpenHashMap<xz_3> object2ByteLinkedOpenHashMap = !xc_32.id_break().id_super() && !xc_33.id_break().id_super() ? id_throws.get() : null;
        if (object2ByteLinkedOpenHashMap != null) {
            xz_32 = new xz_3(xc_32, xc_33, rpr_32);
            byte by = object2ByteLinkedOpenHashMap.getAndMoveToFirst((Object)xz_32);
            if (by != 127) {
                return by != 0;
            }
        } else {
            xz_32 = null;
        }
        boolean bl2 = bl = !rjw_3.id_break(rjC_23 = xc_32.id_extends(rRq_12, rfH_22), rjC_22 = xc_33.id_extends(rRq_12, rfH_23), rpr_32);
        if (object2ByteLinkedOpenHashMap != null) {
            if (object2ByteLinkedOpenHashMap.size() == 200) {
                object2ByteLinkedOpenHashMap.removeLastByte();
            }
            object2ByteLinkedOpenHashMap.putAndMoveToFirst((Object)xz_32, (byte)(bl ? 1 : 0));
        }
        return bl;
    }

    protected rXE id_class(rRR rRR2, rfH_2 rfH_22, xc_3 xc_32) {
        Object object;
        Object object2;
        int n = 0;
        int n2 = 0;
        Object object3 = rpb_3.HORIZONTAL.iterator();
        while (object3.hasNext()) {
            object2 = object3.next();
            object = rfH_22.id_break((rpr_3)object2);
            xc_3 xc_33 = rRR2.id_byte((rfH_2)object);
            rXE rXE2 = xc_33.id_volatile();
            if (!rXE2.id_class().id_class(this) || !this.id_class((rpr_3)object2, rRR2, rfH_22, xc_32, (rfH_2)object, xc_33)) continue;
            if (rXE2.id_break()) {
                ++n2;
            }
            n = Math.max(n, rXE2.id_throws());
        }
        if (this.id_case() && n2 >= 2) {
            object3 = rRR2.id_byte(rfH_22.id_break());
            object2 = ((JC)object3).id_volatile();
            if (((JC)object3).id_byte().id_break() || this.id_private((rXE)object2)) {
                return this.id_class(false);
            }
        }
        if (!((rXE)(object = ((JC)(object2 = rRR2.id_byte((rfH_2)(object3 = rfH_22.id_final())))).id_volatile())).id_byte() && ((rXE)object).id_class().id_class(this) && this.id_class(rpr_3.UP, rRR2, rfH_22, xc_32, (rfH_2)object3, (xc_3)object2)) {
            return this.id_class(8, true);
        }
        int n3 = n - this.id_byte(rRR2);
        return n3 <= 0 ? rXG.id_class.id_private() : this.id_class(n3, false);
    }

    private static short id_class(rfH_2 rfH_22, rfH_2 rfH_23) {
        int n = rfH_23.b_() - rfH_22.b_();
        int n2 = rfH_23.d_() - rfH_22.d_();
        return (short)((n + 128 & 0xFF) << 8 | n2 + 128 & 0xFF);
    }

    protected int id_class(rRR rRR2, rfH_2 rfH_22, int n2, rpr_3 rpr_32, xc_3 xc_32, rfH_2 rfH_23, Short2ObjectMap<Pair<xc_3, rXE>> short2ObjectMap, Short2BooleanMap short2BooleanMap) {
        int n3 = 1000;
        for (rpr_3 rpr_33 : rpb_3.HORIZONTAL) {
            int n4;
            if (rpr_33 == rpr_32) continue;
            rfH_2 rfH_24 = rfH_22.id_break(rpr_33);
            short s = rXB.id_class(rfH_23, rfH_24);
            Pair pair = (Pair)short2ObjectMap.computeIfAbsent(s, n -> {
                xc_3 xc_32 = rRR2.id_byte(rfH_24);
                return Pair.of((Object)xc_32, (Object)xc_32.id_volatile());
            });
            xc_3 xc_33 = (xc_3)pair.getFirst();
            rXE rXE2 = (rXE)pair.getSecond();
            if (!this.id_class((rRq_1)rRR2, this.id_protected(), rfH_22, xc_32, rpr_33, rfH_24, xc_33, rXE2)) continue;
            boolean bl = short2BooleanMap.computeIfAbsent(s, n -> {
                rfH_2 rfH_23 = rfH_24.id_break();
                xc_3 xc_33 = rRR2.id_byte(rfH_23);
                return this.id_class(rRR2, this.id_protected(), rfH_24, xc_33, rfH_23, xc_33);
            });
            if (bl) {
                return n2;
            }
            if (n2 >= this.id_break(rRR2) || (n4 = this.id_class(rRR2, rfH_24, n2 + 1, rpr_33.id_case(), xc_33, rfH_23, short2ObjectMap, short2BooleanMap)) >= n3) continue;
            n3 = n4;
        }
        return n3;
    }

    protected abstract void id_class(rRg_1 var1, rfH_2 var2, xc_3 var3);

    protected void id_class(rRg_1 rRg_12, rfH_2 rfH_22, xc_3 xc_32, rpr_3 rpr_32, rXE rXE2) {
        if (xc_32.id_break() instanceof kJ_2) {
            ((kJ_2)((Object)xc_32.id_break())).id_class(rRg_12, rfH_22, xc_32, rXE2);
        } else {
            if (!xc_32.id_catch()) {
                this.id_class(rRg_12, rfH_22, xc_32);
            }
            rRg_12.id_class(rfH_22, rXE2.id_catch(), 3);
        }
    }

    @Override
    public rjC_2 id_break(rXE rXE3, rRq_1 rRq_12, rfH_2 rfH_22) {
        return rXE3.id_throws() == 9 && rXB.id_byte(rXE3, rRq_12, rfH_22) ? rjw_3.id_break() : this.id_case.computeIfAbsent(rXE3, rXE2 -> rjw_3.id_class(0.0, 0.0, 0.0, 1.0, rXE2.id_class(rRq_12, rfH_22), 1.0));
    }

    protected abstract int id_break(rRR var1);

    protected Map<rpr_3, rXE> id_break(rRR rRR2, rfH_2 rfH_22, xc_3 xc_32) {
        int n2 = 1000;
        EnumMap enumMap = Maps.newEnumMap(rpr_3.class);
        Short2ObjectOpenHashMap short2ObjectOpenHashMap = new Short2ObjectOpenHashMap();
        Short2BooleanOpenHashMap short2BooleanOpenHashMap = new Short2BooleanOpenHashMap();
        for (rpr_3 rpr_32 : rpb_3.HORIZONTAL) {
            rfH_2 rfH_23 = rfH_22.id_break(rpr_32);
            short s = rXB.id_class(rfH_22, rfH_23);
            Pair pair = (Pair)short2ObjectOpenHashMap.computeIfAbsent(s, n -> {
                xc_3 xc_32 = rRR2.id_byte(rfH_23);
                return Pair.of((Object)xc_32, (Object)xc_32.id_volatile());
            });
            xc_3 xc_33 = (xc_3)pair.getFirst();
            rXE rXE2 = (rXE)pair.getSecond();
            rXE rXE3 = this.id_class(rRR2, rfH_23, xc_33);
            if (!this.id_class((rRq_1)rRR2, rXE3.id_class(), rfH_22, xc_32, rpr_32, rfH_23, xc_33, rXE2)) continue;
            rfH_2 rfH_24 = rfH_23.id_break();
            boolean bl = short2BooleanOpenHashMap.computeIfAbsent(s, n -> {
                xc_3 xc_33 = rRR2.id_byte(rfH_24);
                return this.id_class(rRR2, this.id_protected(), rfH_23, xc_33, rfH_24, xc_33);
            });
            int n3 = bl ? 0 : this.id_class(rRR2, rfH_23, 1, rpr_32.id_case(), xc_33, rfH_22, (Short2ObjectMap<Pair<xc_3, rXE>>)short2ObjectOpenHashMap, (Short2BooleanMap)short2BooleanOpenHashMap);
            if (n3 < n2) {
                enumMap.clear();
            }
            if (n3 > n2) continue;
            enumMap.put(rpr_32, rXE3);
            n2 = n3;
        }
        return enumMap;
    }

    public abstract rXs_1 id_throws();

    protected static int id_throws(rXE rXE2) {
        return rXE2.id_break() ? 0 : 8 - Math.min(rXE2.id_throws(), 8) + (rXE2.id_byte(id_class) != false ? 8 : 0);
    }

    private boolean id_catch(rXE rXE2) {
        return rXE2.id_byte() || rXE2.id_class().id_class(this);
    }

    protected abstract boolean id_case();

    public abstract rXs_1 id_protected();

    private boolean id_private(rXE rXE2) {
        return rXE2.id_class().id_class(this) && rXE2.id_break();
    }
}

