/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package celestial;

import celestial.aI_2;
import celestial.aU_2;
import celestial.an_3;
import celestial.aq_3;
import celestial.iO_2;
import celestial.is_3;
import celestial.rLQ;
import celestial.rRR;
import celestial.rRg_1;
import celestial.rTE;
import celestial.rTb_1;
import celestial.rVL;
import celestial.rYB;
import celestial.rcd_3;
import celestial.rcy_3;
import celestial.rfH_2;
import celestial.rfl_3;
import celestial.rqO_2;
import celestial.rqX_2;
import celestial.rql_3;
import celestial.rrEm_1;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class rrEy_1 {
    private static final Logger id_class = LogManager.getLogger();
    private int id_break = 20;
    private final List<rTb_1> id_byte = Lists.newArrayList();
    private rTb_1 id_protected = new rTb_1();
    private double id_throws;
    private double id_case;
    private int id_catch = 200;
    private int id_private = 800;
    private int id_implements = 4;
    private an_3 id_finally;
    private int id_extends = 6;
    private int id_native = 16;
    private int id_volatile = 4;

    public void id_byte() {
        if (!this.id_private()) {
            this.id_case = this.id_throws;
        } else {
            rYB rYB2 = this.id_class();
            rfH_2 rfH_22 = this.id_break();
            if (!(rYB2 instanceof rrEm_1)) {
                double d = (double)rfH_22.b_() + rYB2.id_int.nextDouble();
                double d2 = (double)rfH_22.c_() + rYB2.id_int.nextDouble();
                double d3 = (double)rfH_22.d_() + rYB2.id_int.nextDouble();
                rYB2.id_class(rLQ.id_double, d, d2, d3, 0.0, 0.0, 0.0);
                rYB2.id_class(rLQ.id_try, d, d2, d3, 0.0, 0.0, 0.0);
                if (this.id_break > 0) {
                    --this.id_break;
                }
                this.id_case = this.id_throws;
                this.id_throws = (this.id_throws + (double)(1000.0f / ((float)this.id_break + 200.0f))) % 360.0;
            } else {
                if (this.id_break == -1) {
                    this.id_implements();
                }
                if (this.id_break > 0) {
                    --this.id_break;
                    return;
                }
                boolean bl = false;
                for (int i = 0; i < this.id_implements; ++i) {
                    double d;
                    rcd_3 rcd_32 = this.id_protected.id_break();
                    Optional<aI_2<?>> optional = aI_2.id_class(rcd_32);
                    if (!optional.isPresent()) {
                        this.id_implements();
                        return;
                    }
                    rcy_3 rcy_32 = rcd_32.id_protected("Pos", 6);
                    int n = rcy_32.size();
                    double d4 = n >= 1 ? rcy_32.id_catch(0) : (double)rfH_22.b_() + (rYB2.id_int.nextDouble() - rYB2.id_int.nextDouble()) * (double)this.id_volatile + 0.5;
                    double d5 = n >= 2 ? rcy_32.id_catch(1) : (double)(rfH_22.c_() + rYB2.id_int.nextInt(3) - 1);
                    double d6 = d = n >= 3 ? rcy_32.id_catch(2) : (double)rfH_22.d_() + (rYB2.id_int.nextDouble() - rYB2.id_int.nextDouble()) * (double)this.id_volatile + 0.5;
                    if (!rYB2.id_break(optional.get().id_class(d4, d5, d))) continue;
                    rrEm_1 rrEm_12 = (rrEm_1)rYB2;
                    if (!aq_3.id_class(optional.get(), rrEm_12, iO_2.SPAWNER, new rfH_2(d4, d5, d), rYB2.id_long())) continue;
                    an_3 an_33 = aI_2.id_class(rcd_32, rYB2, an_32 -> {
                        an_32.id_class(d4, d5, d, ((Float)an_32.id_throws[15]).floatValue(), ((Float)an_32.id_throws[16]).floatValue());
                        return an_32;
                    });
                    if (an_33 == null) {
                        this.id_implements();
                        return;
                    }
                    int n2 = rYB2.id_class(an_33.getClass(), new rfl_3(rfH_22.b_(), rfH_22.c_(), rfH_22.d_(), rfH_22.b_() + 1, rfH_22.c_() + 1, rfH_22.d_() + 1).id_class(this.id_volatile)).size();
                    if (n2 >= this.id_extends) {
                        this.id_implements();
                        return;
                    }
                    an_33.id_class(an_33.rx(), an_33.re(), an_33.BO(), rYB2.id_int.nextFloat() * 360.0f, 0.0f);
                    if (an_33 instanceof is_3) {
                        is_3 is_32 = (is_3)an_33;
                        if (!is_32.id_class((rRg_1)rYB2, iO_2.SPAWNER) || !is_32.id_class((rRR)rYB2)) continue;
                        if (this.id_protected.id_break().id_throws() == 1 && this.id_protected.id_break().id_byte("id", 8)) {
                            ((is_3)an_33).id_class(rrEm_12, rYB2.id_throws(an_33.Bs()), iO_2.SPAWNER, (aU_2)null, (rcd_3)null);
                        }
                    }
                    if (!rrEm_12.id_implements(an_33)) {
                        this.id_implements();
                        return;
                    }
                    rYB2.id_byte(2004, rfH_22, 0);
                    if (an_33 instanceof is_3) {
                        ((is_3)an_33).id_float();
                    }
                    bl = true;
                }
                if (bl) {
                    this.id_implements();
                }
            }
        }
    }

    public abstract void id_class(int var1);

    public abstract rYB id_class();

    public void id_class(rcd_3 rcd_32) {
        this.id_break = rcd_32.id_catch("Delay");
        this.id_byte.clear();
        if (rcd_32.id_byte("SpawnPotentials", 9)) {
            rcy_3 rcy_32 = rcd_32.id_protected("SpawnPotentials", 10);
            for (int i = 0; i < rcy_32.size(); ++i) {
                this.id_byte.add(new rTb_1(rcy_32.id_class(i)));
            }
        }
        if (rcd_32.id_byte("SpawnData", 10)) {
            this.id_class(new rTb_1(1, rcd_32.id_int("SpawnData")));
        } else if (!this.id_byte.isEmpty()) {
            this.id_class(rTE.id_class(this.id_class().id_int, this.id_byte));
        }
        if (rcd_32.id_byte("MinSpawnDelay", 99)) {
            this.id_catch = rcd_32.id_catch("MinSpawnDelay");
            this.id_private = rcd_32.id_catch("MaxSpawnDelay");
            this.id_implements = rcd_32.id_catch("SpawnCount");
        }
        if (rcd_32.id_byte("MaxNearbyEntities", 99)) {
            this.id_extends = rcd_32.id_catch("MaxNearbyEntities");
            this.id_native = rcd_32.id_catch("RequiredPlayerRange");
        }
        if (rcd_32.id_byte("SpawnRange", 99)) {
            this.id_volatile = rcd_32.id_catch("SpawnRange");
        }
        if (this.id_class() != null) {
            this.id_finally = null;
        }
    }

    public void id_class(rTb_1 rTb_12) {
        this.id_protected = rTb_12;
    }

    public void id_class(aI_2<?> aI_22) {
        this.id_protected.id_break().id_class("id", rVL.id_transient.id_break(aI_22).toString());
    }

    public boolean id_break(int n) {
        if (n == 1 && this.id_class().id_continue) {
            this.id_break = this.id_catch;
            return true;
        }
        return false;
    }

    public abstract rfH_2 id_break();

    public rcd_3 id_break(rcd_3 rcd_32) {
        rqO_2 rqO_22 = this.id_catch();
        if (rqO_22 == null) {
            return rcd_32;
        }
        rcd_32.id_class("Delay", (short)this.id_break);
        rcd_32.id_class("MinSpawnDelay", (short)this.id_catch);
        rcd_32.id_class("MaxSpawnDelay", (short)this.id_private);
        rcd_32.id_class("SpawnCount", (short)this.id_implements);
        rcd_32.id_class("MaxNearbyEntities", (short)this.id_extends);
        rcd_32.id_class("RequiredPlayerRange", (short)this.id_native);
        rcd_32.id_class("SpawnRange", (short)this.id_volatile);
        rcd_32.id_class("SpawnData", this.id_protected.id_break().id_catch());
        rcy_3 rcy_32 = new rcy_3();
        if (this.id_byte.isEmpty()) {
            rcy_32.add(this.id_protected.id_class());
        } else {
            for (rTb_1 rTb_12 : this.id_byte) {
                rcy_32.add(rTb_12.id_class());
            }
        }
        rcd_32.id_class("SpawnPotentials", rcy_32);
        return rcd_32;
    }

    public double id_throws() {
        return this.id_throws;
    }

    private rqO_2 id_catch() {
        String string = this.id_protected.id_break().id_native("id");
        try {
            return rql_3.id_break(string) ? null : new rqO_2(string);
        }
        catch (rqX_2 rqX_22) {
            rfH_2 rfH_22 = this.id_break();
            id_class.warn("Invalid entity id '{}' at spawner {}:[{},{},{}]", (Object)string, (Object)this.id_class().E().id_class(), (Object)rfH_22.b_(), (Object)rfH_22.c_(), (Object)rfH_22.d_());
            return null;
        }
    }

    public double id_case() {
        return this.id_case;
    }

    private void id_implements() {
        if (this.id_private <= this.id_catch) {
            this.id_break = this.id_catch;
        } else {
            int n = this.id_private - this.id_catch;
            this.id_break = this.id_catch + this.id_class().id_int.nextInt(n);
        }
        if (!this.id_byte.isEmpty()) {
            this.id_class(rTE.id_class(this.id_class().id_int, this.id_byte));
        }
        this.id_class(1);
    }

    public an_3 id_protected() {
        if (this.id_finally == null) {
            this.id_finally = aI_2.id_class(this.id_protected.id_break(), this.id_class(), Function.identity());
            if (this.id_protected.id_break().id_throws() != 1 || !this.id_protected.id_break().id_byte("id", 8) || this.id_finally instanceof is_3) {
                // empty if block
            }
        }
        return this.id_finally;
    }

    private boolean id_private() {
        rfH_2 rfH_22 = this.id_break();
        return this.id_class().id_class((double)rfH_22.b_() + 0.5, (double)rfH_22.c_() + 0.5, (double)rfH_22.d_() + 0.5, (double)this.id_native);
    }
}

