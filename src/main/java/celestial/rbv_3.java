/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.aI_2;
import celestial.an_3;
import celestial.ap_3;
import celestial.ay_3;
import celestial.eX_2;
import celestial.iM_2;
import celestial.iO_2;
import celestial.iQ_2;
import celestial.is_3;
import celestial.iz_3;
import celestial.rRg_1;
import celestial.rYB;
import celestial.rbm_3;
import celestial.rcd_3;
import celestial.rfH_2;
import celestial.rfU_2;
import celestial.rhd_3;
import celestial.rjU_2;
import celestial.rmE_2;
import celestial.rqA_2;
import celestial.rqn_3;
import celestial.rut_3;
import celestial.ruw_3;
import celestial.rye_3;
import celestial.xc_3;
import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.util.Random;

public class rbv_3
extends rbm_3 {
    private static final rut_3<Byte> id_class = rmE_2.id_class(rbv_3.class, ruw_3.id_class);
    private static final ay_3 id_break = new ay_3().id_class(4.0).id_break();
    private rfH_2 id_protected;

    @Override
    protected rqA_2 id_byte(rye_3 rye_32) {
        return rqn_3.Z;
    }

    @Override
    protected void id_double() {
        super.id_double();
        rfH_2 rfH_22 = this.Bs();
        rfH_2 rfH_23 = rfH_22.id_final();
        if (this.id_catch()) {
            boolean bl = this.BF();
            if (((rYB)this.id_throws[7]).id_byte(rfH_23).id_catch((rYB)this.id_throws[7], rfH_22)) {
                if (((Random)this.id_throws[40]).nextInt(200) == 0) {
                    Float f = Float.valueOf(((Random)this.id_throws[40]).nextInt(360));
                    this.id_private[25] = f;
                }
                if (((rYB)this.id_throws[7]).id_class(id_break, this) != null) {
                    this.id_this(false);
                    if (!bl) {
                        ((rYB)this.id_throws[7]).id_class((rhd_3)null, 1025, rfH_22, 0);
                    }
                }
            } else {
                this.id_this(false);
                if (!bl) {
                    ((rYB)this.id_throws[7]).id_class((rhd_3)null, 1025, rfH_22, 0);
                }
            }
        } else {
            if (!(this.id_protected == null || ((rYB)this.id_throws[7]).id_finally(this.id_protected) && this.id_protected.c_() >= 1)) {
                this.id_protected = null;
            }
            if (this.id_protected == null || ((Random)this.id_throws[40]).nextInt(30) == 0 || this.id_protected.id_class((eX_2)this.Ps(), 2.0)) {
                this.id_protected = new rfH_2(this.rx() + (double)((Random)this.id_throws[40]).nextInt(7) - (double)((Random)this.id_throws[40]).nextInt(7), this.re() + (double)((Random)this.id_throws[40]).nextInt(6) - 2.0, this.BO() + (double)((Random)this.id_throws[40]).nextInt(7) - (double)((Random)this.id_throws[40]).nextInt(7));
            }
            double d = (double)this.id_protected.b_() + 0.5 - this.rx();
            double d2 = (double)this.id_protected.c_() + 0.1 - this.re();
            double d3 = (double)this.id_protected.d_() + 0.5 - this.BO();
            rjU_2 rjU_22 = this.rv();
            rjU_2 rjU_23 = rjU_22.id_break((Math.signum(d) * 0.5 - rjU_22.id_break) * (double)0.1f, (Math.signum(d2) * (double)0.7f - rjU_22.id_byte) * (double)0.1f, (Math.signum(d3) * 0.5 - rjU_22.id_protected) * (double)0.1f);
            this.id_byte(rjU_23);
            float f = (float)(rfU_2.id_protected(rjU_23.id_protected, rjU_23.id_break) * 57.2957763671875) - 90.0f;
            float f2 = rfU_2.id_catch(f - ((Float)this.id_throws[15]).floatValue());
            Float f3 = Float.valueOf(0.5f);
            this.id_private[44] = f3;
            rbv_3 rbv_32 = this;
            Float f4 = Float.valueOf(((Float)rbv_32.id_throws[15]).floatValue() + f2);
            rbv_32.id_throws[15] = f4;
            if (((Random)this.id_throws[40]).nextInt(100) == 0 && ((rYB)this.id_throws[7]).id_byte(rfH_23).id_catch((rYB)this.id_throws[7], rfH_23)) {
                this.id_this(true);
            }
        }
    }

    public rbv_3(aI_2<? extends rbv_3> aI_22, rYB rYB2) {
        super((aI_2<? extends rbm_3>)aI_22, rYB2);
        this.id_this(true);
    }

    public void id_this(boolean bl) {
        byte by = ((rmE_2)this.id_throws[49]).id_class(id_class);
        if (bl) {
            ((rmE_2)this.id_throws[49]).id_break(id_class, (byte)(by | 1));
        } else {
            ((rmE_2)this.id_throws[49]).id_break(id_class, (byte)(by & 0xFFFFFFFE));
        }
    }

    @Override
    public void id_this() {
        super.id_this();
        if (this.id_catch()) {
            this.id_byte(rjU_2.id_class);
            this.id_volatile(this.rx(), (double)rfU_2.id_byte(this.re()) + 1.0 - (double)this.Bm(), this.BO());
        } else {
            this.id_byte(this.rv().id_throws(1.0, 0.6, 1.0));
        }
    }

    @Override
    public void id_class(rcd_3 rcd_32) {
        super.id_class(rcd_32);
        rcd_32.id_class("BatFlags", ((rmE_2)this.id_throws[49]).id_class(id_class));
    }

    @Override
    public boolean id_class(float f, float f2) {
        return false;
    }

    @Override
    protected void id_class(double d, boolean bl, xc_3 xc_32, rfH_2 rfH_22) {
    }

    @Override
    public boolean id_break(rye_3 rye_32, float f) {
        if (this.id_class(rye_32)) {
            return false;
        }
        if (!((rYB)this.id_throws[7]).id_continue && this.id_catch()) {
            this.id_this(false);
        }
        return super.id_break(rye_32, f);
    }

    @Override
    protected float id_break(iM_2 iM_22, ap_3 ap_32) {
        return ap_32.id_break / 2.0f;
    }

    public static boolean id_break(aI_2<rbv_3> aI_22, rRg_1 rRg_12, iO_2 iO_22, rfH_2 rfH_22, Random random) {
        if (rfH_22.c_() >= rRg_12.id_short()) {
            return false;
        }
        int n = rRg_12.id_package(rfH_22);
        int n2 = 4;
        if (rbv_3.id_implements()) {
            n2 = 7;
        } else if (random.nextBoolean()) {
            return false;
        }
        return n > random.nextInt(n2) ? false : rbv_3.id_class(aI_22, rRg_12, iO_22, rfH_22, random);
    }

    @Override
    public void id_break(rcd_3 rcd_32) {
        super.id_break(rcd_32);
        ((rmE_2)this.id_throws[49]).id_break(id_class, rcd_32.id_case("BatFlags"));
    }

    public static iz_3 id_throws() {
        return is_3.id_package().id_class(iQ_2.id_class, 6.0);
    }

    public boolean id_catch() {
        return (((rmE_2)this.id_throws[49]).id_class(id_class) & 1) != 0;
    }

    private static boolean id_implements() {
        LocalDate localDate = LocalDate.now();
        int n = localDate.get(ChronoField.DAY_OF_MONTH);
        int n2 = localDate.get(ChronoField.MONTH_OF_YEAR);
        return n2 == 10 && n >= 20 || n2 == 11 && n <= 3;
    }

    @Override
    protected void id_instanceof(an_3 an_32) {
    }

    @Override
    public rqA_2 id_static() {
        return this.id_catch() && ((Random)this.id_throws[40]).nextInt(4) != 0 ? null : rqn_3.u;
    }

    @Override
    public boolean rB() {
        return true;
    }

    @Override
    public boolean rG() {
        return false;
    }

    @Override
    protected boolean PK() {
        return false;
    }

    @Override
    protected rqA_2 Bt() {
        return rqn_3.m;
    }

    @Override
    protected void SS() {
    }

    @Override
    protected float SN() {
        return super.SN() * 0.95f;
    }

    @Override
    protected float Si() {
        return 0.1f;
    }

    @Override
    protected void m_() {
        super.m_();
        ((rmE_2)this.id_throws[49]).id_class(id_class, (byte)0);
    }
}

