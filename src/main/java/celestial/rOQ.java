/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Oo_1;
import celestial.aI_2;
import celestial.an_3;
import celestial.iB_2;
import celestial.rCE;
import celestial.rLO;
import celestial.rLQ;
import celestial.rRu_1;
import celestial.rYB;
import celestial.rbZ_2;
import celestial.rcd_3;
import celestial.rhN_2;
import celestial.rhd_3;
import celestial.rmE_2;
import celestial.rnM_2;
import celestial.rqR_2;
import celestial.rut_3;
import celestial.ruw_3;
import celestial.rye_3;
import java.util.Optional;
import java.util.Random;
import java.util.UUID;

public abstract class rOQ
extends rbZ_2 {
    protected static final rut_3<Byte> id_return = rmE_2.id_class(rOQ.class, ruw_3.id_class);
    protected static final rut_3<Optional<UUID>> id_public = rmE_2.id_class(rOQ.class, ruw_3.id_package);
    private boolean id_super;

    protected rOQ(aI_2<? extends rOQ> aI_22, rYB rYB2) {
        super((aI_2<? extends rbZ_2>)aI_22, rYB2);
        this.sm();
    }

    public boolean id_class(iB_2 iB_22, iB_2 iB_23) {
        return true;
    }

    @Override
    public void id_class(byte by) {
        if (by == 7) {
            this.id_synchronized(true);
        } else if (by == 6) {
            this.id_synchronized(false);
        } else {
            super.id_class(by);
        }
    }

    @Override
    public void id_class(rcd_3 rcd_32) {
        super.id_class(rcd_32);
        if (this.sv() != null) {
            rcd_32.id_class("Owner", this.sv());
        }
        rcd_32.id_class("Sitting", this.id_super);
    }

    protected void sm() {
    }

    @Override
    public void id_break(rye_3 rye_32) {
        if (!((rYB)this.id_throws[7]).id_continue && ((rYB)this.id_throws[7]).B().id_break(rRu_1.id_native) && this.sF() instanceof rhN_2) {
            this.sF().id_class(this.SW().id_break(), rqR_2.id_break);
        }
        super.id_break(rye_32);
    }

    public void id_break(UUID uUID) {
        ((rmE_2)this.id_throws[49]).id_break(id_public, Optional.ofNullable(uUID));
    }

    @Override
    public void id_break(rcd_3 rcd_32) {
        UUID uUID;
        super.id_break(rcd_32);
        if (rcd_32.id_break("Owner")) {
            uUID = rcd_32.id_class("Owner");
        } else {
            String string = rcd_32.id_native("Owner");
            uUID = rCE.id_class(this.rC(), string);
        }
        if (uUID != null) {
            try {
                this.id_break(uUID);
                this.id_return(true);
            }
            catch (Throwable throwable) {
                this.id_return(false);
            }
        }
        this.id_super = rcd_32.id_new("Sitting");
        this.id_public(this.id_super);
    }

    public UUID sv() {
        return ((rmE_2)this.id_throws[49]).id_class(id_public).orElse(null);
    }

    @Override
    public boolean Sc() {
        return (((rmE_2)this.id_throws[49]).id_class(id_return) & 1) != 0;
    }

    @Override
    public boolean id_catch(iB_2 iB_22) {
        return this.id_private(iB_22) ? false : super.id_catch(iB_22);
    }

    public void id_goto(boolean bl) {
        this.id_super = bl;
    }

    public void id_case(rhd_3 rhd_32) {
        this.id_return(true);
        this.id_break(rhd_32.ro());
        if (rhd_32 instanceof rhN_2) {
            Oo_1.id_public.id_class((rhN_2)rhd_32, this);
        }
    }

    public void id_return(boolean bl) {
        byte by = ((rmE_2)this.id_throws[49]).id_class(id_return);
        if (bl) {
            ((rmE_2)this.id_throws[49]).id_break(id_return, (byte)(by | 4));
        } else {
            ((rmE_2)this.id_throws[49]).id_break(id_return, (byte)(by & 0xFFFFFFFB));
        }
        this.sm();
    }

    public void id_public(boolean bl) {
        byte by = ((rmE_2)this.id_throws[49]).id_class(id_return);
        if (bl) {
            ((rmE_2)this.id_throws[49]).id_break(id_return, (byte)(by | 1));
        } else {
            ((rmE_2)this.id_throws[49]).id_break(id_return, (byte)(by & 0xFFFFFFFE));
        }
    }

    @Override
    public boolean id_protected(rhd_3 rhd_32) {
        return !this.z();
    }

    public boolean id_private(iB_2 iB_22) {
        return iB_22 == this.sF();
    }

    @Override
    public boolean id_final(an_3 an_32) {
        if (this.sZ()) {
            iB_2 iB_22 = this.sF();
            if (an_32 == iB_22) {
                return true;
            }
            if (iB_22 != null) {
                return iB_22.id_final(an_32);
            }
        }
        return super.id_final(an_32);
    }

    protected void id_synchronized(boolean bl) {
        rLO rLO2 = rLQ.id_long;
        if (!bl) {
            rLO2 = rLQ.id_double;
        }
        for (int i = 0; i < 7; ++i) {
            double d = ((Random)this.id_throws[40]).nextGaussian() * 0.02;
            double d2 = ((Random)this.id_throws[40]).nextGaussian() * 0.02;
            double d3 = ((Random)this.id_throws[40]).nextGaussian() * 0.02;
            ((rYB)this.id_throws[7]).id_class(rLO2, this.id_break(1.0), this.Ph() + 0.5, this.id_protected(1.0), d, d2, d3);
        }
    }

    @Override
    public rnM_2 BG() {
        iB_2 iB_22;
        if (this.sZ() && (iB_22 = this.sF()) != null) {
            return iB_22.BG();
        }
        return super.BG();
    }

    public boolean sL() {
        return this.id_super;
    }

    public boolean sZ() {
        return (((rmE_2)this.id_throws[49]).id_class(id_return) & 4) != 0;
    }

    public iB_2 sF() {
        try {
            UUID uUID = this.sv();
            return uUID == null ? null : ((rYB)this.id_throws[7]).id_class(uUID);
        }
        catch (IllegalArgumentException illegalArgumentException) {
            return null;
        }
    }

    @Override
    protected void m_() {
        super.m_();
        ((rmE_2)this.id_throws[49]).id_class(id_return, (byte)0);
        ((rmE_2)this.id_throws[49]).id_class(id_public, Optional.empty());
    }
}

