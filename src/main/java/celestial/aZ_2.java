/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 *  com.mojang.brigadier.StringReader
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package celestial;

import celestial.Qs_1;
import celestial.Yc_1;
import celestial.aI_2;
import celestial.an_3;
import celestial.ap_3;
import celestial.iB_2;
import celestial.iM_2;
import celestial.rAB;
import celestial.rAS;
import celestial.rFJ;
import celestial.rLQ;
import celestial.rLY;
import celestial.rLi_1;
import celestial.rLx_1;
import celestial.rVL;
import celestial.rYB;
import celestial.rcd_3;
import celestial.rcy_3;
import celestial.rfU_2;
import celestial.rmE_2;
import celestial.rrEm_1;
import celestial.ruS_2;
import celestial.rut_3;
import celestial.ruw_3;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.UUID;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class aZ_2
extends an_3 {
    private static final Logger id_class = LogManager.getLogger();
    private static final rut_3<Float> id_break = rmE_2.id_class(aZ_2.class, ruw_3.id_byte);
    private static final rut_3<Integer> id_protected = rmE_2.id_class(aZ_2.class, ruw_3.id_break);
    private static final rut_3<Boolean> id_catch = rmE_2.id_class(aZ_2.class, ruw_3.id_implements);
    private static final rut_3<rLx_1> id_private = rmE_2.id_class(aZ_2.class, ruw_3.id_finally);
    private rLi_1 id_implements = rAS.id_class;
    private final List<rLY> id_finally = Lists.newArrayList();
    private final Map<an_3, Integer> id_extends = Maps.newHashMap();
    private int id_native = 600;
    private int id_volatile = 20;
    private int id_final = 20;
    private boolean id_package;
    private int id_int;
    private float id_new;
    private float id_continue;
    private iB_2 id_super;
    private UUID id_this;

    public void id_byte(int n) {
        this.id_volatile = n;
    }

    public void id_byte(float f) {
        if (!((rYB)this.id_throws[7]).id_continue) {
            this.BQ().id_break(id_break, Float.valueOf(f));
        }
    }

    public aZ_2(aI_2<? extends aZ_2> aI_22, rYB rYB2) {
        super(aI_22, rYB2);
        Boolean bl = true;
        this.id_throws[38] = bl;
        this.id_byte(3.0f);
    }

    public aZ_2(rYB rYB2, double d, double d2, double d3) {
        this((aI_2<? extends aZ_2>)aI_2.id_class, rYB2);
        this.id_new(d, d2, d3);
    }

    @Override
    public void id_this() {
        block23: {
            boolean bl;
            float f;
            boolean bl2;
            block21: {
                rLx_1 rLx_12;
                block22: {
                    super.id_this();
                    bl2 = this.id_catch();
                    f = this.id_protected();
                    if (!((rYB)this.id_throws[7]).id_continue) break block21;
                    rLx_12 = this.id_case();
                    if (!bl2) break block22;
                    if (!((Random)this.id_throws[40]).nextBoolean()) break block23;
                    for (int i = 0; i < 2; ++i) {
                        float f2 = ((Random)this.id_throws[40]).nextFloat() * ((float)Math.PI * 2);
                        float f3 = rfU_2.id_byte(((Random)this.id_throws[40]).nextFloat()) * 0.2f;
                        float f4 = rfU_2.id_break(f2) * f3;
                        float f9 = rfU_2.id_class(f2) * f3;
                        if (rLx_12.id_protected() == rLQ.id_else) {
                            int f10 = ((Random)this.id_throws[40]).nextBoolean() ? 0xFFFFFF : this.id_throws();
                            int n5 = f10 >> 16 & 0xFF;
                            int n6 = f10 >> 8 & 0xFF;
                            int n7 = f10 & 0xFF;
                            ((rYB)this.id_throws[7]).id_break(rLx_12, this.rx() + (double)f4, this.re(), this.BO() + (double)f9, (double)((float)n5 / 255.0f), (double)((float)n6 / 255.0f), (float)n7 / 255.0f);
                            continue;
                        }
                        ((rYB)this.id_throws[7]).id_break(rLx_12, this.rx() + (double)f4, this.re(), this.BO() + (double)f9, 0.0, 0.0, 0.0);
                    }
                    break block23;
                }
                float f6 = (float)Math.PI * f * f;
                int n = 0;
                while ((float)n < f6) {
                    float f7 = ((Random)this.id_throws[40]).nextFloat() * ((float)Math.PI * 2);
                    float f8 = rfU_2.id_byte(((Random)this.id_throws[40]).nextFloat()) * f;
                    float iB_22 = rfU_2.id_break(f7) * f8;
                    float d2 = rfU_2.id_class(f7) * f8;
                    if (rLx_12.id_protected() == rLQ.id_else) {
                        int n2 = this.id_throws();
                        int d = n2 >> 16 & 0xFF;
                        int n3 = n2 >> 8 & 0xFF;
                        int d3 = n2 & 0xFF;
                        ((rYB)this.id_throws[7]).id_break(rLx_12, this.rx() + (double)iB_22, this.re(), this.BO() + (double)d2, (double)((float)d / 255.0f), (double)((float)n3 / 255.0f), (float)d3 / 255.0f);
                    } else {
                        ((rYB)this.id_throws[7]).id_break(rLx_12, this.rx() + (double)iB_22, this.re(), this.BO() + (double)d2, (0.5 - ((Random)this.id_throws[40]).nextDouble()) * 0.15, (double)0.01f, (0.5 - ((Random)this.id_throws[40]).nextDouble()) * 0.15);
                    }
                    ++n;
                }
                break block23;
            }
            if ((Integer)this.id_throws[41] >= this.id_volatile + this.id_native) {
                this.PD();
                return;
            }
            boolean bl3 = bl = (Integer)this.id_throws[41] < this.id_volatile;
            if (bl2 != bl) {
                this.id_class(bl);
            }
            if (bl) {
                return;
            }
            if (this.id_continue != 0.0f) {
                if ((f += this.id_continue) < 0.5f) {
                    this.PD();
                    return;
                }
                this.id_byte(f);
            }
            if ((Integer)this.id_throws[41] % 5 == 0) {
                Object object;
                Iterator<Map.Entry<an_3, Integer>> iterator = this.id_extends.entrySet().iterator();
                while (iterator.hasNext()) {
                    object = iterator.next();
                    if ((Integer)this.id_throws[41] < (Integer)object.getValue()) continue;
                    iterator.remove();
                }
                object = Lists.newArrayList();
                for (rLY object2 : this.id_implements.id_class()) {
                    object.add(new rLY(object2.id_class(), object2.id_break() / 4, object2.id_byte(), object2.id_protected(), object2.id_throws()));
                }
                object.addAll(this.id_finally);
                if (object.isEmpty()) {
                    this.id_extends.clear();
                } else {
                    List<iB_2> list = ((rYB)this.id_throws[7]).id_class(iB_2.class, this.rN());
                    if (!list.isEmpty()) {
                        for (iB_2 iB_22 : list) {
                            double d;
                            double d2;
                            double d3;
                            if (this.id_extends.containsKey(iB_22) || !iB_22.SL() || !((d3 = (d2 = iB_22.rx() - this.rx()) * d2 + (d = iB_22.BO() - this.BO()) * d) <= (double)(f * f))) continue;
                            this.id_extends.put(iB_22, (Integer)this.id_throws[41] + this.id_final);
                            Iterator iterator2 = object.iterator();
                            while (iterator2.hasNext()) {
                                rLY rLY2 = (rLY)iterator2.next();
                                if (rLY2.id_class().id_class()) {
                                    rLY2.id_class().id_class(this, this.id_implements(), iB_22, rLY2.id_byte(), 0.5);
                                    continue;
                                }
                                iB_22.id_break(new rLY(rLY2));
                            }
                            if (this.id_new != 0.0f) {
                                if ((f += this.id_new) < 0.5f) {
                                    this.PD();
                                    return;
                                }
                                this.id_byte(f);
                            }
                            if (this.id_int == 0) continue;
                            this.id_native += this.id_int;
                            if (this.id_native > 0) continue;
                            this.PD();
                            return;
                        }
                    }
                }
            }
        }
    }

    protected void id_class(boolean bl) {
        this.BQ().id_break(id_catch, bl);
    }

    public void id_class(rLx_1 rLx_12) {
        this.BQ().id_break(id_private, rLx_12);
    }

    public void id_class(int n) {
        this.id_package = true;
        this.BQ().id_break(id_protected, n);
    }

    @Override
    protected void id_class(rcd_3 rcd_32) {
        rcd_32.id_break("Age", (Integer)this.id_throws[41]);
        rcd_32.id_break("Duration", this.id_native);
        rcd_32.id_break("WaitTime", this.id_volatile);
        rcd_32.id_break("ReapplicationDelay", this.id_final);
        rcd_32.id_break("DurationOnUse", this.id_int);
        rcd_32.id_class("RadiusOnUse", this.id_new);
        rcd_32.id_class("RadiusPerTick", this.id_continue);
        rcd_32.id_class("Radius", this.id_protected());
        rcd_32.id_class("Particle", this.id_case().id_byte());
        if (this.id_this != null) {
            rcd_32.id_class("Owner", this.id_this);
        }
        if (this.id_package) {
            rcd_32.id_break("Color", this.id_throws());
        }
        if (this.id_implements != rAS.id_class && this.id_implements != null) {
            rcd_32.id_class("Potion", rVL.id_double.id_break(this.id_implements).toString());
        }
        if (!this.id_finally.isEmpty()) {
            rcy_3 rcy_32 = new rcy_3();
            for (rLY rLY2 : this.id_finally) {
                rcy_32.add(rLY2.id_class(new rcd_3()));
            }
            rcd_32.id_class("Effects", rcy_32);
        }
    }

    public void id_class(iB_2 iB_22) {
        this.id_super = iB_22;
        this.id_this = iB_22 == null ? null : iB_22.ro();
    }

    @Override
    public void id_class(rut_3<?> rut_32) {
        if (id_break.equals(rut_32)) {
            this.q_();
        }
        super.id_class(rut_32);
    }

    public void id_class(rLY rLY2) {
        this.id_finally.add(rLY2);
        if (!this.id_package) {
            this.id_final();
        }
    }

    public void id_class(rLi_1 rLi_12) {
        this.id_implements = rLi_12;
        if (!this.id_package) {
            this.id_final();
        }
    }

    public void id_break(int n) {
        this.id_native = n;
    }

    @Override
    protected void id_break(rcd_3 rcd_32) {
        Integer n = rcd_32.id_private("Age");
        this.id_throws[41] = n;
        this.id_native = rcd_32.id_private("Duration");
        this.id_volatile = rcd_32.id_private("WaitTime");
        this.id_final = rcd_32.id_private("ReapplicationDelay");
        this.id_int = rcd_32.id_private("DurationOnUse");
        this.id_new = rcd_32.id_finally("RadiusOnUse");
        this.id_continue = rcd_32.id_finally("RadiusPerTick");
        this.id_byte(rcd_32.id_finally("Radius"));
        if (rcd_32.id_break("Owner")) {
            this.id_this = rcd_32.id_class("Owner");
        }
        if (rcd_32.id_byte("Particle", 8)) {
            try {
                this.id_class(Yc_1.id_break(new StringReader(rcd_32.id_native("Particle"))));
            }
            catch (CommandSyntaxException commandSyntaxException) {
                id_class.warn("Couldn't load custom particle {}", (Object)rcd_32.id_native("Particle"), (Object)commandSyntaxException);
            }
        }
        if (rcd_32.id_byte("Color", 99)) {
            this.id_class(rcd_32.id_private("Color"));
        }
        if (rcd_32.id_byte("Potion", 8)) {
            this.id_class(rAB.id_byte(rcd_32));
        }
        if (rcd_32.id_byte("Effects", 9)) {
            rcy_3 rcy_32 = rcd_32.id_protected("Effects", 10);
            this.id_finally.clear();
            for (int i = 0; i < rcy_32.size(); ++i) {
                rLY rLY2 = rLY.id_break(rcy_32.id_class(i));
                if (rLY2 == null) continue;
                this.id_class(rLY2);
            }
        }
    }

    public int id_throws() {
        return this.BQ().id_class(id_protected);
    }

    public boolean id_catch() {
        return this.BQ().id_class(id_catch);
    }

    public void id_catch(float f) {
        this.id_continue = f;
    }

    public rLx_1 id_case() {
        return this.BQ().id_class(id_private);
    }

    public iB_2 id_implements() {
        an_3 an_32;
        if (this.id_super == null && this.id_this != null && (rYB)this.id_throws[7] instanceof rrEm_1 && (an_32 = ((rrEm_1)((rYB)this.id_throws[7])).id_break(this.id_this)) instanceof iB_2) {
            this.id_super = (iB_2)an_32;
        }
        return this.id_super;
    }

    public float id_protected() {
        return this.BQ().id_class(id_break).floatValue();
    }

    public void id_protected(float f) {
        this.id_new = f;
    }

    public int id_private() {
        return this.id_native;
    }

    private void id_final() {
        if (this.id_implements == rAS.id_class && this.id_finally.isEmpty()) {
            this.BQ().id_break(id_protected, 0);
        } else {
            this.BQ().id_break(id_protected, rAB.id_class(rAB.id_class(this.id_implements, this.id_finally)));
        }
    }

    @Override
    public ap_3 a_(iM_2 iM_22) {
        return ap_3.id_break(this.id_protected() * 2.0f, 0.5f);
    }

    @Override
    protected void m_() {
        this.BQ().id_class(id_protected, 0);
        this.BQ().id_class(id_break, Float.valueOf(0.5f));
        this.BQ().id_class(id_catch, false);
        this.BQ().id_class(id_private, rLQ.id_else);
    }

    @Override
    public void q_() {
        double d = this.rx();
        double d2 = this.re();
        double d3 = this.BO();
        super.q_();
        this.id_new(d, d2, d3);
    }

    @Override
    public ruS_2<?> p_() {
        return new rFJ(this);
    }

    @Override
    public Qs_1 r_() {
        return Qs_1.IGNORE;
    }
}

