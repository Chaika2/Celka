/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 */
package celestial;

import celestial.HU;
import celestial.Iq_1;
import celestial.Iy_1;
import celestial.Ml_1;
import celestial.an_3;
import celestial.iB_2;
import celestial.rfU_2;
import celestial.rpZ_2;
import celestial.rpm_3;
import celestial.rqO_2;
import celestial.tQ_2;
import celestial.tR_2;
import celestial.tX_2;
import celestial.tY_2;
import com.google.common.collect.ImmutableList;
import java.util.function.Function;

public class tW_2<T extends iB_2>
extends tX_2<T>
implements tR_2,
tY_2 {
    public Iq_1 id_class;
    public Iq_1 id_break;
    public Iq_1 id_byte;
    public Iq_1 id_protected;
    public Iq_1 id_throws;
    public Iq_1 id_case;
    public Iq_1 id_catch;
    public tQ_2 id_private = tQ_2.EMPTY;
    public tQ_2 id_implements = tQ_2.EMPTY;
    public boolean id_finally;
    public float id_extends;

    @Override
    public Iq_1 id_byte() {
        return this.id_class;
    }

    private void id_byte(T t) {
        switch (this.id_private) {
            case EMPTY: {
                this.id_throws.id_catch = 0.0f;
                break;
            }
            case BLOCK: {
                this.id_throws.id_case = this.id_throws.id_case * 0.5f - 0.9424779f;
                this.id_throws.id_catch = 0.5235988f;
                break;
            }
            case ITEM: {
                this.id_throws.id_case = this.id_throws.id_case * 0.5f - 0.31415927f;
                this.id_throws.id_catch = 0.0f;
                break;
            }
            case THROW_SPEAR: {
                this.id_throws.id_case = this.id_throws.id_case * 0.5f - (float)Math.PI;
                this.id_throws.id_catch = 0.0f;
                break;
            }
            case BOW_AND_ARROW: {
                this.id_protected.id_catch = -0.1f + this.id_class.id_catch - 0.4f;
                this.id_throws.id_catch = 0.1f + this.id_class.id_catch;
                this.id_protected.id_case = -1.5707964f + this.id_class.id_case;
                this.id_throws.id_case = -1.5707964f + this.id_class.id_case;
                break;
            }
            case CROSSBOW_CHARGE: {
                Iy_1.id_class(this.id_protected, this.id_throws, t, false);
                break;
            }
            case CROSSBOW_HOLD: {
                Iy_1.id_class(this.id_protected, this.id_throws, this.id_class, false);
            }
        }
    }

    public tW_2(float f) {
        this(HU::id_protected, f, 0.0f, 64, 32);
    }

    protected tW_2(float f, float f2, int n, int n2) {
        this(HU::id_protected, f, f2, n, n2);
    }

    public tW_2(Function<rqO_2, HU> function, float f, float f2, int n, int n2) {
        super(function, true, 16.0f, 0.0f, 2.0f, 2.0f, 24.0f);
        this.id_return = n;
        this.id_public = n2;
        this.id_class = new Iq_1(this, 0, 0);
        this.id_class.id_class(-4.0f, -8.0f, -4.0f, 8.0f, 8.0f, 8.0f, f);
        this.id_class.id_class(0.0f, 0.0f + f2, 0.0f);
        this.id_break = new Iq_1(this, 32, 0);
        this.id_break.id_class(-4.0f, -8.0f, -4.0f, 8.0f, 8.0f, 8.0f, f + 0.5f);
        this.id_break.id_class(0.0f, 0.0f + f2, 0.0f);
        this.id_byte = new Iq_1(this, 16, 16);
        this.id_byte.id_class(-4.0f, 0.0f, -2.0f, 8.0f, 12.0f, 4.0f, f);
        this.id_byte.id_class(0.0f, 0.0f + f2, 0.0f);
        this.id_protected = new Iq_1(this, 40, 16);
        this.id_protected.id_class(-3.0f, -2.0f, -2.0f, 4.0f, 12.0f, 4.0f, f);
        this.id_protected.id_class(-5.0f, 2.0f + f2, 0.0f);
        this.id_throws = new Iq_1(this, 40, 16);
        this.id_throws.id_implements = true;
        this.id_throws.id_class(-1.0f, -2.0f, -2.0f, 4.0f, 12.0f, 4.0f, f);
        this.id_throws.id_class(5.0f, 2.0f + f2, 0.0f);
        this.id_case = new Iq_1(this, 0, 16);
        this.id_case.id_class(-2.0f, 0.0f, -2.0f, 4.0f, 12.0f, 4.0f, f);
        this.id_case.id_class(-1.9f, 12.0f + f2, 0.0f);
        this.id_catch = new Iq_1(this, 0, 16);
        this.id_catch.id_implements = true;
        this.id_catch.id_class(-2.0f, 0.0f, -2.0f, 4.0f, 12.0f, 4.0f, f);
        this.id_catch.id_class(1.9f, 12.0f + f2, 0.0f);
    }

    private float id_class(float f) {
        return -65.0f * f + f * f;
    }

    @Override
    public void id_class(rpZ_2 rpZ_22, Ml_1 ml_1) {
        this.id_class(rpZ_22).id_class(ml_1);
    }

    @Override
    public void id_class(tW_2<T> tW_22) {
        super.id_class(tW_22);
        tW_22.id_private = this.id_private;
        tW_22.id_implements = this.id_implements;
        tW_22.id_finally = this.id_finally;
        tW_22.id_class.id_class(this.id_class);
        tW_22.id_break.id_class(this.id_break);
        tW_22.id_byte.id_class(this.id_byte);
        tW_22.id_protected.id_class(this.id_protected);
        tW_22.id_throws.id_class(this.id_throws);
        tW_22.id_case.id_class(this.id_case);
        tW_22.id_catch.id_class(this.id_catch);
    }

    protected rpZ_2 id_class(T t) {
        rpZ_2 rpZ_22 = ((iB_2)t).Su();
        return (rpm_3)((Object)((iB_2)t).id_private[6]) == rpm_3.MAIN_HAND ? rpZ_22 : rpZ_22.id_class();
    }

    protected Iq_1 id_class(rpZ_2 rpZ_22) {
        return rpZ_22 == rpZ_2.LEFT ? this.id_throws : this.id_protected;
    }

    @Override
    protected Iterable<Iq_1> id_class() {
        return ImmutableList.of((Object)this.id_class);
    }

    @Override
    public void id_class(T t, float f, float f2, float f3) {
        this.id_extends = ((iB_2)t).id_synchronized(f3);
        super.id_class(t, f, f2, f3);
    }

    @Override
    public void id_class(T t, float f, float f2, float f3, float f4, float f5) {
        boolean bl;
        boolean bl2 = ((iB_2)t).BD() > 4;
        boolean bl3 = ((iB_2)t).rP();
        this.id_class.id_catch = f4 * ((float)Math.PI / 180);
        this.id_class.id_case = bl2 ? -0.7853982f : (this.id_extends > 0.0f ? (bl3 ? this.id_class(this.id_extends, this.id_class.id_case, -0.7853982f) : this.id_class(this.id_extends, this.id_class.id_case, f5 * ((float)Math.PI / 180))) : f5 * ((float)Math.PI / 180));
        this.id_byte.id_catch = 0.0f;
        this.id_protected.id_throws = 0.0f;
        this.id_protected.id_byte = -5.0f;
        this.id_throws.id_throws = 0.0f;
        this.id_throws.id_byte = 5.0f;
        float f6 = 1.0f;
        if (bl2) {
            f6 = (float)((an_3)t).rv().id_catch();
            f6 /= 0.2f;
            f6 = f6 * f6 * f6;
        }
        if (f6 < 1.0f) {
            f6 = 1.0f;
        }
        this.id_protected.id_case = rfU_2.id_break(f * 0.6662f + (float)Math.PI) * 2.0f * f2 * 0.5f / f6;
        this.id_throws.id_case = rfU_2.id_break(f * 0.6662f) * 2.0f * f2 * 0.5f / f6;
        this.id_protected.id_private = 0.0f;
        this.id_throws.id_private = 0.0f;
        this.id_case.id_case = rfU_2.id_break(f * 0.6662f) * 1.4f * f2 / f6;
        this.id_catch.id_case = rfU_2.id_break(f * 0.6662f + (float)Math.PI) * 1.4f * f2 / f6;
        this.id_case.id_catch = 0.0f;
        this.id_catch.id_catch = 0.0f;
        this.id_case.id_private = 0.0f;
        this.id_catch.id_private = 0.0f;
        if (this.id_package) {
            this.id_protected.id_case += -0.62831855f;
            this.id_throws.id_case += -0.62831855f;
            this.id_case.id_case = -1.4137167f;
            this.id_case.id_catch = 0.31415927f;
            this.id_case.id_private = 0.07853982f;
            this.id_catch.id_case = -1.4137167f;
            this.id_catch.id_catch = -0.31415927f;
            this.id_catch.id_private = -0.07853982f;
        }
        this.id_protected.id_catch = 0.0f;
        this.id_throws.id_catch = 0.0f;
        boolean bl4 = ((iB_2)t).Su() == rpZ_2.RIGHT;
        boolean bl5 = bl = bl4 ? this.id_private.id_class() : this.id_implements.id_class();
        if (bl4 != bl) {
            this.id_byte(t);
            this.id_break(t);
        } else {
            this.id_break(t);
            this.id_byte(t);
        }
        this.id_class(t, f3);
        if (this.id_finally) {
            this.id_byte.id_case = 0.5f;
            this.id_protected.id_case += 0.4f;
            this.id_throws.id_case += 0.4f;
            this.id_case.id_throws = 4.0f;
            this.id_catch.id_throws = 4.0f;
            this.id_case.id_protected = 12.2f;
            this.id_catch.id_protected = 12.2f;
            this.id_class.id_protected = 4.2f;
            this.id_byte.id_protected = 3.2f;
            this.id_throws.id_protected = 5.2f;
            this.id_protected.id_protected = 5.2f;
        } else {
            this.id_byte.id_case = 0.0f;
            this.id_case.id_throws = 0.1f;
            this.id_catch.id_throws = 0.1f;
            this.id_case.id_protected = 12.0f;
            this.id_catch.id_protected = 12.0f;
            this.id_class.id_protected = 0.0f;
            this.id_byte.id_protected = 0.0f;
            this.id_throws.id_protected = 2.0f;
            this.id_protected.id_protected = 2.0f;
        }
        Iy_1.id_class(this.id_protected, this.id_throws, f3);
        if (this.id_extends > 0.0f) {
            float f7;
            float f8;
            float f9 = f % 26.0f;
            rpZ_2 rpZ_22 = this.id_class(t);
            float f10 = rpZ_22 == rpZ_2.RIGHT && this.id_final > 0.0f ? 0.0f : this.id_extends;
            float f11 = f8 = rpZ_22 == rpZ_2.LEFT && this.id_final > 0.0f ? 0.0f : this.id_extends;
            if (f9 < 14.0f) {
                this.id_throws.id_case = this.id_class(f8, this.id_throws.id_case, 0.0f);
                this.id_protected.id_case = rfU_2.id_catch(f10, this.id_protected.id_case, 0.0f);
                this.id_throws.id_catch = this.id_class(f8, this.id_throws.id_catch, (float)Math.PI);
                this.id_protected.id_catch = rfU_2.id_catch(f10, this.id_protected.id_catch, (float)Math.PI);
                this.id_throws.id_private = this.id_class(f8, this.id_throws.id_private, (float)Math.PI + 1.8707964f * this.id_class(f9) / this.id_class(14.0f));
                this.id_protected.id_private = rfU_2.id_catch(f10, this.id_protected.id_private, (float)Math.PI - 1.8707964f * this.id_class(f9) / this.id_class(14.0f));
            } else if (f9 >= 14.0f && f9 < 22.0f) {
                f7 = (f9 - 14.0f) / 8.0f;
                this.id_throws.id_case = this.id_class(f8, this.id_throws.id_case, 1.5707964f * f7);
                this.id_protected.id_case = rfU_2.id_catch(f10, this.id_protected.id_case, 1.5707964f * f7);
                this.id_throws.id_catch = this.id_class(f8, this.id_throws.id_catch, (float)Math.PI);
                this.id_protected.id_catch = rfU_2.id_catch(f10, this.id_protected.id_catch, (float)Math.PI);
                this.id_throws.id_private = this.id_class(f8, this.id_throws.id_private, 5.012389f - 1.8707964f * f7);
                this.id_protected.id_private = rfU_2.id_catch(f10, this.id_protected.id_private, 1.2707963f + 1.8707964f * f7);
            } else if (f9 >= 22.0f && f9 < 26.0f) {
                f7 = (f9 - 22.0f) / 4.0f;
                this.id_throws.id_case = this.id_class(f8, this.id_throws.id_case, 1.5707964f - 1.5707964f * f7);
                this.id_protected.id_case = rfU_2.id_catch(f10, this.id_protected.id_case, 1.5707964f - 1.5707964f * f7);
                this.id_throws.id_catch = this.id_class(f8, this.id_throws.id_catch, (float)Math.PI);
                this.id_protected.id_catch = rfU_2.id_catch(f10, this.id_protected.id_catch, (float)Math.PI);
                this.id_throws.id_private = this.id_class(f8, this.id_throws.id_private, (float)Math.PI);
                this.id_protected.id_private = rfU_2.id_catch(f10, this.id_protected.id_private, (float)Math.PI);
            }
            f7 = 0.3f;
            float f12 = 0.33333334f;
            this.id_catch.id_case = rfU_2.id_catch(this.id_extends, this.id_catch.id_case, 0.3f * rfU_2.id_break(f * 0.33333334f + (float)Math.PI));
            this.id_case.id_case = rfU_2.id_catch(this.id_extends, this.id_case.id_case, 0.3f * rfU_2.id_break(f * 0.33333334f));
        }
        this.id_break.id_class(this.id_class);
    }

    protected float id_class(float f, float f2, float f3) {
        float f4 = (f3 - f2) % ((float)Math.PI * 2);
        if (f4 < (float)(-Math.PI)) {
            f4 += (float)Math.PI * 2;
        }
        if (f4 >= (float)Math.PI) {
            f4 -= (float)Math.PI * 2;
        }
        return f2 + f * f4;
    }

    protected void id_class(T t, float f) {
        if (!(this.id_final <= 0.0f)) {
            rpZ_2 rpZ_22 = this.id_class(t);
            Iq_1 iq_1 = this.id_class(rpZ_22);
            float f2 = this.id_final;
            this.id_byte.id_catch = rfU_2.id_class(rfU_2.id_byte(f2) * ((float)Math.PI * 2)) * 0.2f;
            if (rpZ_22 == rpZ_2.LEFT) {
                this.id_byte.id_catch *= -1.0f;
            }
            this.id_protected.id_throws = rfU_2.id_class(this.id_byte.id_catch) * 5.0f;
            this.id_protected.id_byte = -rfU_2.id_break(this.id_byte.id_catch) * 5.0f;
            this.id_throws.id_throws = -rfU_2.id_class(this.id_byte.id_catch) * 5.0f;
            this.id_throws.id_byte = rfU_2.id_break(this.id_byte.id_catch) * 5.0f;
            this.id_protected.id_catch += this.id_byte.id_catch;
            this.id_throws.id_catch += this.id_byte.id_catch;
            this.id_throws.id_case += this.id_byte.id_catch;
            f2 = 1.0f - this.id_final;
            f2 *= f2;
            f2 *= f2;
            f2 = 1.0f - f2;
            float f3 = rfU_2.id_class(f2 * (float)Math.PI);
            float f4 = rfU_2.id_class(this.id_final * (float)Math.PI) * -(this.id_class.id_case - 0.7f) * 0.75f;
            iq_1.id_case = (float)((double)iq_1.id_case - ((double)f3 * 1.2 + (double)f4));
            iq_1.id_catch += this.id_byte.id_catch * 2.0f;
            iq_1.id_private += rfU_2.id_class(this.id_final * (float)Math.PI) * -0.4f;
        }
    }

    @Override
    protected Iterable<Iq_1> id_break() {
        return ImmutableList.of((Object)this.id_byte, (Object)this.id_protected, (Object)this.id_throws, (Object)this.id_case, (Object)this.id_catch, (Object)this.id_break);
    }

    private void id_break(T t) {
        switch (this.id_implements) {
            case EMPTY: {
                this.id_protected.id_catch = 0.0f;
                break;
            }
            case BLOCK: {
                this.id_protected.id_case = this.id_protected.id_case * 0.5f - 0.9424779f;
                this.id_protected.id_catch = -0.5235988f;
                break;
            }
            case ITEM: {
                this.id_protected.id_case = this.id_protected.id_case * 0.5f - 0.31415927f;
                this.id_protected.id_catch = 0.0f;
                break;
            }
            case THROW_SPEAR: {
                this.id_protected.id_case = this.id_protected.id_case * 0.5f - (float)Math.PI;
                this.id_protected.id_catch = 0.0f;
                break;
            }
            case BOW_AND_ARROW: {
                this.id_protected.id_catch = -0.1f + this.id_class.id_catch;
                this.id_throws.id_catch = 0.1f + this.id_class.id_catch + 0.4f;
                this.id_protected.id_case = -1.5707964f + this.id_class.id_case;
                this.id_throws.id_case = -1.5707964f + this.id_class.id_case;
                break;
            }
            case CROSSBOW_CHARGE: {
                Iy_1.id_class(this.id_protected, this.id_throws, t, true);
                break;
            }
            case CROSSBOW_HOLD: {
                Iy_1.id_class(this.id_protected, this.id_throws, this.id_class, true);
            }
        }
    }

    public void b_(boolean bl) {
        this.id_class.id_finally = bl;
        this.id_break.id_finally = bl;
        this.id_byte.id_finally = bl;
        this.id_protected.id_finally = bl;
        this.id_throws.id_finally = bl;
        this.id_case.id_finally = bl;
        this.id_catch.id_finally = bl;
    }
}

