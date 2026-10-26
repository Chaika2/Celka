/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Qs_1;
import celestial.aI_2;
import celestial.an_3;
import celestial.ap_3;
import celestial.iB_2;
import celestial.iM_2;
import celestial.is_3;
import celestial.rLQ;
import celestial.rLX;
import celestial.rRo_1;
import celestial.rSg_1;
import celestial.rXN;
import celestial.rXQ;
import celestial.rYB;
import celestial.rcZ_2;
import celestial.rcd_3;
import celestial.rcy_3;
import celestial.rdn_3;
import celestial.rdy_3;
import celestial.rfH_2;
import celestial.rfl_3;
import celestial.rhd_3;
import celestial.rhm_3;
import celestial.rhx_3;
import celestial.rjO_2;
import celestial.rjU_2;
import celestial.rmE_2;
import celestial.rpZ_2;
import celestial.rpm_3;
import celestial.rqA_2;
import celestial.rqn_3;
import celestial.rqs_3;
import celestial.rrEm_1;
import celestial.rsJ_2;
import celestial.rsd_3;
import celestial.rut_3;
import celestial.ruw_3;
import celestial.ryZ_2;
import celestial.rye_3;
import celestial.xd_3;
import celestial.xu_3;
import java.util.List;
import java.util.function.Predicate;

public class rSY
extends iB_2 {
    private static final rjO_2 id_final = new rjO_2(0.0f, 0.0f, 0.0f);
    private static final rjO_2 id_package = new rjO_2(0.0f, 0.0f, 0.0f);
    private static final rjO_2 id_int = new rjO_2(-10.0f, 0.0f, -10.0f);
    private static final rjO_2 id_new = new rjO_2(-15.0f, 0.0f, 10.0f);
    private static final rjO_2 id_continue = new rjO_2(-1.0f, 0.0f, -1.0f);
    private static final rjO_2 id_super = new rjO_2(1.0f, 0.0f, 1.0f);
    private static final ap_3 id_this = new ap_3(0.0f, 0.0f, true);
    private static final ap_3 id_else = aI_2.id_break.id_volatile().id_class(0.5f);
    public static final rut_3<Byte> id_class = rmE_2.id_class(rSY.class, ruw_3.id_class);
    public static final rut_3<rjO_2> id_break = rmE_2.id_class(rSY.class, ruw_3.id_extends);
    public static final rut_3<rjO_2> id_protected = rmE_2.id_class(rSY.class, ruw_3.id_extends);
    public static final rut_3<rjO_2> id_implements = rmE_2.id_class(rSY.class, ruw_3.id_extends);
    public static final rut_3<rjO_2> id_finally = rmE_2.id_class(rSY.class, ruw_3.id_extends);
    public static final rut_3<rjO_2> id_extends = rmE_2.id_class(rSY.class, ruw_3.id_extends);
    public static final rut_3<rjO_2> id_native = rmE_2.id_class(rSY.class, ruw_3.id_extends);
    private static final Predicate<an_3> id_synchronized = an_32 -> an_32 instanceof rsJ_2 && ((rsJ_2)an_32).id_final() == rsd_3.RIDEABLE;
    private final rqs_3<rdn_3> id_return = rqs_3.id_class(2, rdn_3.id_break);
    private final rqs_3<rdn_3> id_public = rqs_3.id_class(4, rdn_3.id_break);
    private boolean id_goto;
    public long id_volatile;
    private int id_while;
    private rjO_2 id_try = id_final;
    private rjO_2 id_instanceof = id_package;
    private rjO_2 id_throw = id_int;
    private rjO_2 id_interface = id_new;
    private rjO_2 id_char = id_continue;
    private rjO_2 id_abstract = id_super;

    @Override
    protected rqA_2 id_byte(int n) {
        return rqn_3.id_switch;
    }

    public void id_byte(rjO_2 rjO_22) {
        this.id_throw = rjO_22;
        ((rmE_2)this.id_throws[49]).id_break(id_implements, rjO_22);
    }

    private void id_byte(boolean bl) {
        ((rmE_2)this.id_throws[49]).id_break(id_class, this.id_class(((rmE_2)this.id_throws[49]).id_class(id_class), 4, bl));
    }

    @Override
    protected rqA_2 id_byte(rye_3 rye_32) {
        return rqn_3.r;
    }

    public rjO_2 id_int() {
        return this.id_throw;
    }

    public rSY(aI_2<? extends rSY> aI_22, rYB rYB2) {
        super((aI_2<? extends iB_2>)aI_22, rYB2);
        Float f = Float.valueOf(0.0f);
        this.id_throws[37] = f;
    }

    public rSY(rYB rYB2, double d, double d2, double d3) {
        this((aI_2<? extends rSY>)aI_2.id_break, rYB2);
        this.id_new(d, d2, d3);
    }

    @Override
    public void id_this() {
        rjO_2 rjO_22;
        rjO_2 rjO_23;
        rjO_2 rjO_24;
        rjO_2 rjO_25;
        rjO_2 rjO_26;
        super.id_this();
        rjO_2 rjO_27 = ((rmE_2)this.id_throws[49]).id_class(id_break);
        if (!this.id_try.equals(rjO_27)) {
            this.id_class(rjO_27);
        }
        if (!this.id_instanceof.equals(rjO_26 = ((rmE_2)this.id_throws[49]).id_class(id_protected))) {
            this.id_break(rjO_26);
        }
        if (!this.id_throw.equals(rjO_25 = ((rmE_2)this.id_throws[49]).id_class(id_implements))) {
            this.id_byte(rjO_25);
        }
        if (!this.id_interface.equals(rjO_24 = ((rmE_2)this.id_throws[49]).id_class(id_finally))) {
            this.id_protected(rjO_24);
        }
        if (!this.id_char.equals(rjO_23 = ((rmE_2)this.id_throws[49]).id_class(id_extends))) {
            this.id_throws(rjO_23);
        }
        if (!this.id_abstract.equals(rjO_22 = ((rmE_2)this.id_throws[49]).id_class(id_native))) {
            this.id_case(rjO_22);
        }
    }

    private void id_class(boolean bl) {
        ((rmE_2)this.id_throws[49]).id_break(id_class, this.id_class(((rmE_2)this.id_throws[49]).id_class(id_class), 1, bl));
    }

    @Override
    public boolean id_class(double d) {
        double d2 = this.rN().id_class() * 4.0;
        if (Double.isNaN(d2) || d2 == 0.0) {
            d2 = 4.0;
        }
        return d < (d2 *= 64.0) * d2;
    }

    @Override
    public void id_class(byte by) {
        if (by == 32) {
            if (((rYB)this.id_throws[7]).id_continue) {
                ((rYB)this.id_throws[7]).id_class(this.rx(), this.re(), this.BO(), rqn_3.r, this.Pr(), 0.3f, 1.0f, false);
                this.id_volatile = ((rYB)this.id_throws[7]).r();
            }
        } else {
            super.id_class(by);
        }
    }

    private boolean id_class(rhd_3 rhd_32, rXQ rXQ2, rdn_3 rdn_32, rpm_3 rpm_32) {
        rdn_3 rdn_33 = this.id_class(rXQ2);
        if (!rdn_33.id_class() && (this.id_while & 1 << rXQ2.id_byte() + 8) != 0) {
            return false;
        }
        if (rdn_33.id_class() && (this.id_while & 1 << rXQ2.id_byte() + 16) != 0) {
            return false;
        }
        if (((rhx_3)rhd_32.id_implements[18]).id_protected && rdn_33.id_class() && !rdn_32.id_class()) {
            rdn_3 rdn_34 = rdn_32.id_implements();
            rdn_34.id_throws(1);
            this.id_class(rXQ2, rdn_34);
            return true;
        }
        if (!rdn_32.id_class() && rdn_32.id_char() > 1) {
            if (!rdn_33.id_class()) {
                return false;
            }
            rdn_3 rdn_35 = rdn_32.id_implements();
            rdn_35.id_throws(1);
            this.id_class(rXQ2, rdn_35);
            rdn_32.id_catch(1);
            return true;
        }
        this.id_class(rXQ2, rdn_32);
        rhd_32.id_class(rpm_32, rdn_33);
        return true;
    }

    @Override
    public ryZ_2 id_class(rhd_3 rhd_32, rjU_2 rjU_22, rpm_3 rpm_32) {
        rdn_3 rdn_32 = rhd_32.id_protected(rpm_32);
        if (!this.id_implements() && rdn_32.id_break() != rdy_3.dj) {
            if (rhd_32.id_native()) {
                return ryZ_2.SUCCESS;
            }
            if (((rYB)rhd_32.id_throws[7]).id_continue) {
                return ryZ_2.CONSUME;
            }
            rXQ rXQ2 = is_3.id_finally(rdn_32);
            if (rdn_32.id_class()) {
                rXQ rXQ3;
                rXQ rXQ4 = this.id_finally(rjU_22);
                rXQ rXQ5 = rXQ3 = this.id_protected(rXQ4) ? rXQ2 : rXQ4;
                if (this.id_byte(rXQ3) && this.id_class(rhd_32, rXQ3, rdn_32, rpm_32)) {
                    return ryZ_2.SUCCESS;
                }
            } else {
                if (this.id_protected(rXQ2)) {
                    return ryZ_2.FAIL;
                }
                if (rXQ2.id_class() == rXN.HAND && !this.id_catch()) {
                    return ryZ_2.FAIL;
                }
                if (this.id_class(rhd_32, rXQ2, rdn_32, rpm_32)) {
                    return ryZ_2.SUCCESS;
                }
            }
            return ryZ_2.PASS;
        }
        return ryZ_2.PASS;
    }

    @Override
    public void id_class(rut_3<?> rut_32) {
        if (id_class.equals(rut_32)) {
            this.q_();
            Boolean bl = !this.id_implements();
            this.id_throws[2] = bl;
        }
        super.id_class(rut_32);
    }

    @Override
    public void id_class(rrEm_1 rrEm_12, rSg_1 rSg_12) {
    }

    public void id_class(rjO_2 rjO_22) {
        this.id_try = rjO_22;
        ((rmE_2)this.id_throws[49]).id_break(id_break, rjO_22);
    }

    private byte id_class(byte by, int n, boolean bl) {
        by = bl ? (byte)(by | n) : (byte)(by & ~n);
        return by;
    }

    @Override
    public void id_class(rXQ rXQ2, rdn_3 rdn_32) {
        switch (rXQ2.id_class()) {
            case HAND: {
                this.id_break(rdn_32);
                this.id_return.set(rXQ2.id_break(), rdn_32);
                break;
            }
            case ARMOR: {
                this.id_break(rdn_32);
                this.id_public.set(rXQ2.id_break(), rdn_32);
            }
        }
    }

    @Override
    public boolean id_class(int n, rdn_3 rdn_32) {
        rXQ rXQ2;
        if (n == 98) {
            rXQ2 = rXQ.MAINHAND;
        } else if (n == 99) {
            rXQ2 = rXQ.OFFHAND;
        } else if (n == 100 + rXQ.HEAD.id_break()) {
            rXQ2 = rXQ.HEAD;
        } else if (n == 100 + rXQ.CHEST.id_break()) {
            rXQ2 = rXQ.CHEST;
        } else if (n == 100 + rXQ.LEGS.id_break()) {
            rXQ2 = rXQ.LEGS;
        } else {
            if (n != 100 + rXQ.FEET.id_break()) {
                return false;
            }
            rXQ2 = rXQ.FEET;
        }
        if (!rdn_32.id_class() && !is_3.id_byte(rXQ2, rdn_32) && rXQ2 != rXQ.HEAD) {
            return false;
        }
        this.id_class(rXQ2, rdn_32);
        return true;
    }

    @Override
    public rdn_3 id_class(rXQ rXQ2) {
        switch (rXQ2.id_class()) {
            case HAND: {
                return this.id_return.get(rXQ2.id_break());
            }
            case ARMOR: {
                return this.id_public.get(rXQ2.id_break());
            }
        }
        return rdn_3.id_break;
    }

    @Override
    public void id_class(rcd_3 rcd_32) {
        super.id_class(rcd_32);
        rcy_3 rcy_32 = new rcy_3();
        for (rdn_3 object : this.id_public) {
            rcd_3 rcd_33 = new rcd_3();
            if (!object.id_class()) {
                object.id_break(rcd_33);
            }
            rcy_32.add(rcd_33);
        }
        rcd_32.id_class("ArmorItems", rcy_32);
        rcy_3 rcy_33 = new rcy_3();
        for (rdn_3 rdn_32 : this.id_return) {
            rcd_3 rcd_34 = new rcd_3();
            if (!rdn_32.id_class()) {
                rdn_32.id_break(rcd_34);
            }
            rcy_33.add(rcd_34);
        }
        rcd_32.id_class("HandItems", rcy_33);
        rcd_32.id_class("Invisible", this.Pp());
        rcd_32.id_class("Small", this.id_throws());
        rcd_32.id_class("ShowArms", this.id_catch());
        rcd_32.id_break("DisabledSlots", this.id_while);
        rcd_32.id_class("NoBasePlate", this.id_private());
        if (this.id_implements()) {
            rcd_32.id_class("Marker", this.id_implements());
        }
        rcd_32.id_class("Pose", this.id_public());
    }

    @Override
    public void j() {
        this.PD();
    }

    protected float id_break(float f, float f2) {
        Float f3 = Float.valueOf(((Float)this.id_throws[17]).floatValue());
        this.id_private[24] = f3;
        Float f4 = Float.valueOf(((Float)this.id_throws[15]).floatValue());
        this.id_private[23] = f4;
        return 0.0f;
    }

    @Override
    public void id_break(rcd_3 rcd_32) {
        int n;
        rcZ_2 rcZ_22;
        super.id_break(rcd_32);
        if (rcd_32.id_byte("ArmorItems", 9)) {
            rcZ_22 = rcd_32.id_protected("ArmorItems", 10);
            for (n = 0; n < this.id_public.size(); ++n) {
                this.id_public.set(n, rdn_3.id_class(rcZ_22.id_class(n)));
            }
        }
        if (rcd_32.id_byte("HandItems", 9)) {
            rcZ_22 = rcd_32.id_protected("HandItems", 10);
            for (n = 0; n < this.id_return.size(); ++n) {
                this.id_return.set(n, rdn_3.id_class(rcZ_22.id_class(n)));
            }
        }
        this.id_package(rcd_32.id_new("Invisible"));
        this.id_class(rcd_32.id_new("Small"));
        this.id_byte(rcd_32.id_new("ShowArms"));
        this.id_while = rcd_32.id_private("DisabledSlots");
        this.id_protected(rcd_32.id_new("NoBasePlate"));
        this.id_throws(rcd_32.id_new("Marker"));
        Boolean bl = !this.id_else();
        this.id_throws[38] = bl;
        rcZ_22 = rcd_32.id_int("Pose");
        this.id_catch((rcd_3)rcZ_22);
    }

    @Override
    protected float id_break(iM_2 iM_22, ap_3 ap_32) {
        return ap_32.id_break * (this.n_() ? 0.5f : 0.9f);
    }

    @Override
    public boolean id_break(rye_3 rye_32, float f) {
        if (!((rYB)this.id_throws[7]).id_continue && !((Boolean)this.id_throws[27]).booleanValue()) {
            if (rye_3.id_volatile.equals(rye_32)) {
                this.PD();
                return false;
            }
            if (!(this.id_class(rye_32) || this.id_goto || this.id_implements())) {
                if (rye_32.id_protected()) {
                    this.id_catch(rye_32);
                    this.PD();
                    return false;
                }
                if (rye_3.id_class.equals(rye_32)) {
                    if (this.Pz()) {
                        this.id_case(rye_32, 0.15f);
                    } else {
                        this.id_case(5);
                    }
                    return false;
                }
                if (rye_3.id_byte.equals(rye_32) && this.Ss() > 0.5f) {
                    this.id_case(rye_32, 4.0f);
                    return false;
                }
                boolean bl = rye_32.id_finally() instanceof rhm_3;
                boolean bl2 = bl && ((rhm_3)rye_32.id_finally()).id_package() > 0;
                boolean bl3 = "player".equals(rye_32.id_new());
                if (!bl3 && !bl) {
                    return false;
                }
                if (rye_32.id_extends() instanceof rhd_3 && !((rhx_3)((rhd_3)rye_32.id_extends()).id_implements[18]).id_throws) {
                    return false;
                }
                if (rye_32.id_synchronized()) {
                    this.id_instanceof();
                    this.id_goto();
                    this.PD();
                    return bl2;
                }
                long l = ((rYB)this.id_throws[7]).r();
                if (l - this.id_volatile > 5L && !bl) {
                    ((rYB)this.id_throws[7]).id_class((an_3)this, (byte)32);
                    this.id_volatile = l;
                } else {
                    this.id_case(rye_32);
                    this.id_goto();
                    this.PD();
                }
                return true;
            }
            return false;
        }
        return false;
    }

    public void id_break(rjO_2 rjO_22) {
        this.id_instanceof = rjO_22;
        ((rmE_2)this.id_throws[49]).id_break(id_protected, rjO_22);
    }

    public boolean id_throws() {
        return (((rmE_2)this.id_throws[49]).id_class(id_class) & 1) != 0;
    }

    public void id_throws(rjO_2 rjO_22) {
        this.id_char = rjO_22;
        ((rmE_2)this.id_throws[49]).id_break(id_extends, rjO_22);
    }

    private void id_throws(boolean bl) {
        ((rmE_2)this.id_throws[49]).id_break(id_class, this.id_class(((rmE_2)this.id_throws[49]).id_class(id_class), 16, bl));
    }

    @Override
    public boolean id_throws(rdn_3 rdn_32) {
        rXQ rXQ2 = is_3.id_finally(rdn_32);
        return this.id_class(rXQ2).id_class() && !this.id_protected(rXQ2);
    }

    @Override
    public boolean id_finally(an_3 an_32) {
        return an_32 instanceof rhd_3 && !((rYB)this.id_throws[7]).id_class((rhd_3)an_32, this.Bs());
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private rXQ id_finally(rjU_2 rjU_22) {
        rXQ rXQ2 = rXQ.MAINHAND;
        boolean bl = this.id_throws();
        double d = bl ? rjU_22.id_byte * 2.0 : rjU_22.id_byte;
        rXQ rXQ3 = rXQ.FEET;
        if (d >= 0.1) {
            double d2 = bl ? 0.8 : 0.45;
            if (d < 0.1 + d2 && this.id_byte(rXQ3)) {
                return rXQ.FEET;
            }
        }
        double d3 = bl ? 0.3 : 0.0;
        if (d >= 0.9 + d3) {
            double d4 = bl ? 1.0 : 0.7;
            if (d < 0.9 + d4 && this.id_byte(rXQ.CHEST)) {
                return rXQ.CHEST;
            }
        }
        if (d >= 0.4) {
            double d5 = bl ? 1.0 : 0.8;
            if (d < 0.4 + d5 && this.id_byte(rXQ.LEGS)) {
                return rXQ.LEGS;
            }
        }
        if (d >= 1.6 && this.id_byte(rXQ.HEAD)) {
            return rXQ.HEAD;
        }
        if (this.id_byte(rXQ.MAINHAND)) return rXQ2;
        if (!this.id_byte(rXQ.OFFHAND)) return rXQ2;
        return rXQ.OFFHAND;
    }

    private void id_catch(rcd_3 rcd_32) {
        rcy_3 rcy_32 = rcd_32.id_protected("Head", 5);
        this.id_class(rcy_32.isEmpty() ? id_final : new rjO_2(rcy_32));
        rcy_3 rcy_33 = rcd_32.id_protected("Body", 5);
        this.id_break(rcy_33.isEmpty() ? id_package : new rjO_2(rcy_33));
        rcy_3 rcy_34 = rcd_32.id_protected("LeftArm", 5);
        this.id_byte(rcy_34.isEmpty() ? id_int : new rjO_2(rcy_34));
        rcy_3 rcy_35 = rcd_32.id_protected("RightArm", 5);
        this.id_protected(rcy_35.isEmpty() ? id_new : new rjO_2(rcy_35));
        rcy_3 rcy_36 = rcd_32.id_protected("LeftLeg", 5);
        this.id_throws(rcy_36.isEmpty() ? id_continue : new rjO_2(rcy_36));
        rcy_3 rcy_37 = rcd_32.id_protected("RightLeg", 5);
        this.id_case(rcy_37.isEmpty() ? id_super : new rjO_2(rcy_37));
    }

    public boolean id_catch() {
        return (((rmE_2)this.id_throws[49]).id_class(id_class) & 4) != 0;
    }

    private void id_catch(rye_3 rye_32) {
        rdn_3 rdn_32;
        int n;
        this.id_instanceof();
        this.id_protected(rye_32);
        for (n = 0; n < this.id_return.size(); ++n) {
            rdn_32 = this.id_return.get(n);
            if (rdn_32.id_class()) continue;
            xd_3.id_class((rYB)this.id_throws[7], this.Bs().id_final(), rdn_32);
            this.id_return.set(n, rdn_3.id_break);
        }
        for (n = 0; n < this.id_public.size(); ++n) {
            rdn_32 = this.id_public.get(n);
            if (rdn_32.id_class()) continue;
            xd_3.id_class((rYB)this.id_throws[7], this.Bs().id_final(), rdn_32);
            this.id_public.set(n, rdn_3.id_break);
        }
    }

    private void id_goto() {
        if ((rYB)this.id_throws[7] instanceof rrEm_1) {
            ((rrEm_1)((rYB)this.id_throws[7])).id_class(new rLX(rLQ.id_protected, xu_3.id_final.id_continue()), this.rx(), this.id_byte(0.6666666666666666), this.BO(), 10, (double)(this.PN() / 4.0f), (double)(this.Bm() / 4.0f), this.PN() / 4.0f, 0.05);
        }
    }

    private ap_3 id_case(boolean bl) {
        if (bl) {
            return id_this;
        }
        return this.n_() ? id_else : this.BC().id_volatile();
    }

    private void id_case(rye_3 rye_32) {
        xd_3.id_class((rYB)this.id_throws[7], this.Bs(), new rdn_3(rdy_3.dq));
        this.id_catch(rye_32);
    }

    public void id_case(rjO_2 rjO_22) {
        this.id_abstract = rjO_22;
        ((rmE_2)this.id_throws[49]).id_break(id_native, rjO_22);
    }

    private void id_case(rye_3 rye_32, float f) {
        float f2 = this.Ss();
        if ((f2 -= f) <= 0.5f) {
            this.id_catch(rye_32);
            this.PD();
        } else {
            this.id_public(f2);
        }
    }

    public rjO_2 id_continue() {
        return this.id_char;
    }

    private boolean id_else() {
        return !this.id_implements() && !this.rw();
    }

    public boolean id_implements() {
        return (((rmE_2)this.id_throws[49]).id_class(id_class) & 0x10) != 0;
    }

    @Override
    public void id_implements(float f) {
        float f2 = f;
        Float f3 = Float.valueOf(f2);
        this.id_throws[17] = f3;
        Float f4 = Float.valueOf(f2);
        this.id_private[24] = f4;
        float f5 = f;
        Float f6 = Float.valueOf(f5);
        this.id_private[25] = f6;
        Float f7 = Float.valueOf(f5);
        this.id_private[27] = f7;
    }

    @Override
    protected void id_instanceof(an_3 an_32) {
    }

    private void id_instanceof() {
        ((rYB)this.id_throws[7]).id_class((rhd_3)null, this.rx(), this.re(), this.BO(), rqn_3.id_double, this.Pr(), 1.0f, 1.0f);
    }

    public rjO_2 id_new() {
        return this.id_interface;
    }

    public rjO_2 id_package() {
        return this.id_instanceof;
    }

    @Override
    public void id_package(boolean bl) {
        this.id_goto = bl;
        super.id_package(bl);
    }

    public rjO_2 id_super() {
        return this.id_abstract;
    }

    @Override
    public boolean id_try() {
        return super.id_try() && this.id_else();
    }

    @Override
    public Iterable<rdn_3> rs() {
        return this.id_return;
    }

    private rcd_3 id_public() {
        rcd_3 rcd_32 = new rcd_3();
        if (!id_final.equals(this.id_try)) {
            rcd_32.id_class("Head", this.id_try.id_class());
        }
        if (!id_package.equals(this.id_instanceof)) {
            rcd_32.id_class("Body", this.id_instanceof.id_class());
        }
        if (!id_int.equals(this.id_throw)) {
            rcd_32.id_class("LeftArm", this.id_throw.id_class());
        }
        if (!id_new.equals(this.id_interface)) {
            rcd_32.id_class("RightArm", this.id_interface.id_class());
        }
        if (!id_continue.equals(this.id_char)) {
            rcd_32.id_class("LeftLeg", this.id_char.id_class());
        }
        if (!id_super.equals(this.id_abstract)) {
            rcd_32.id_class("RightLeg", this.id_abstract.id_class());
        }
        return rcd_32;
    }

    private boolean id_protected(rXQ rXQ2) {
        return (this.id_while & 1 << rXQ2.id_byte()) != 0 || rXQ2.id_class() == rXN.HAND && !this.id_catch();
    }

    private void id_protected(boolean bl) {
        ((rmE_2)this.id_throws[49]).id_break(id_class, this.id_class(((rmE_2)this.id_throws[49]).id_class(id_class), 8, bl));
    }

    public void id_protected(rjO_2 rjO_22) {
        this.id_interface = rjO_22;
        ((rmE_2)this.id_throws[49]).id_break(id_finally, rjO_22);
    }

    public boolean id_private() {
        return (((rmE_2)this.id_throws[49]).id_class(id_class) & 8) != 0;
    }

    @Override
    public void id_private(rjU_2 rjU_22) {
        if (this.id_else()) {
            super.id_private(rjU_22);
        }
    }

    public rjO_2 id_final() {
        return this.id_try;
    }

    @Override
    public rjU_2 id_volatile(float f) {
        if (this.id_implements()) {
            rfl_3 rfl_32 = this.id_case(false).id_class(this.Ps());
            rfH_2 rfH_22 = this.Bs();
            int n = Integer.MIN_VALUE;
            for (rfH_2 rfH_23 : rfH_2.id_class(new rfH_2(rfl_32.id_class, rfl_32.id_break, rfl_32.id_byte), new rfH_2(rfl_32.id_protected, rfl_32.id_throws, rfl_32.id_case))) {
                int n2 = Math.max(((rYB)this.id_throws[7]).id_class(rRo_1.BLOCK, rfH_23), ((rYB)this.id_throws[7]).id_class(rRo_1.SKY, rfH_23));
                if (n2 == 15) {
                    return rjU_2.id_class(rfH_23);
                }
                if (n2 <= n) continue;
                n = n2;
                rfH_22 = rfH_23.id_int();
            }
            return rjU_2.id_class(rfH_22);
        }
        return super.id_volatile(f);
    }

    @Override
    public void id_native(float f) {
        float f2 = f;
        Float f3 = Float.valueOf(f2);
        this.id_throws[17] = f3;
        Float f4 = Float.valueOf(f2);
        this.id_private[24] = f4;
        float f5 = f;
        Float f6 = Float.valueOf(f5);
        this.id_private[25] = f6;
        Float f7 = Float.valueOf(f5);
        this.id_private[27] = f7;
    }

    @Override
    public boolean rG() {
        return false;
    }

    @Override
    public double Pv() {
        return this.id_implements() ? 0.0 : (double)0.1f;
    }

    @Override
    public boolean rY() {
        return super.rY() && !this.id_implements();
    }

    @Override
    public Iterable<rdn_3> PV() {
        return this.id_public;
    }

    @Override
    public boolean Bl() {
        return this.Pp();
    }

    @Override
    protected rqA_2 Bt() {
        return rqn_3.id_double;
    }

    @Override
    protected void SS() {
        List<an_3> list = ((rYB)this.id_throws[7]).id_break((an_3)this, this.rN(), id_synchronized);
        for (int i = 0; i < list.size(); ++i) {
            an_3 an_32 = list.get(i);
            if (!(this.id_int(an_32) <= 0.2)) continue;
            an_32.id_byte(this);
        }
    }

    @Override
    public boolean SL() {
        return false;
    }

    @Override
    public rpZ_2 Su() {
        return rpZ_2.RIGHT;
    }

    @Override
    public boolean Sq() {
        return false;
    }

    @Override
    protected void SA() {
        this.id_package(this.id_goto);
    }

    @Override
    public ap_3 a_(iM_2 iM_22) {
        return this.id_case(this.id_implements());
    }

    @Override
    protected void m_() {
        super.m_();
        ((rmE_2)this.id_throws[49]).id_class(id_class, (byte)0);
        ((rmE_2)this.id_throws[49]).id_class(id_break, id_final);
        ((rmE_2)this.id_throws[49]).id_class(id_protected, id_package);
        ((rmE_2)this.id_throws[49]).id_class(id_implements, id_int);
        ((rmE_2)this.id_throws[49]).id_class(id_finally, id_new);
        ((rmE_2)this.id_throws[49]).id_class(id_extends, id_continue);
        ((rmE_2)this.id_throws[49]).id_class(id_native, id_super);
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
    public Qs_1 r_() {
        return this.id_implements() ? Qs_1.IGNORE : super.r_();
    }

    @Override
    public boolean n_() {
        return this.id_throws();
    }
}

