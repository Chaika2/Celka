/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.aI_2;
import celestial.aU_2;
import celestial.iO_2;
import celestial.rOR;
import celestial.rOY;
import celestial.rOt_1;
import celestial.rRf_1;
import celestial.rRh_1;
import celestial.rYB;
import celestial.rcd_3;
import celestial.rdn_3;
import celestial.rdy_3;
import celestial.rmE_2;
import celestial.rqA_2;
import celestial.rqO_2;
import celestial.rqR_2;
import celestial.rqn_3;
import celestial.rut_3;
import celestial.ruw_3;
import celestial.rxL_2;
import celestial.rye_3;
import java.util.Random;

public class rOg_1
extends rOt_1 {
    private static final rut_3<Integer> id_break = rmE_2.id_class(rOg_1.class, ruw_3.id_break);
    private static final rqO_2[] id_protected = new rqO_2[]{new rqO_2("textures/entity/fish/tropical_a.png"), new rqO_2("textures/entity/fish/tropical_b.png")};
    private static final rqO_2[] id_super = new rqO_2[]{new rqO_2("textures/entity/fish/tropical_a_pattern_1.png"), new rqO_2("textures/entity/fish/tropical_a_pattern_2.png"), new rqO_2("textures/entity/fish/tropical_a_pattern_3.png"), new rqO_2("textures/entity/fish/tropical_a_pattern_4.png"), new rqO_2("textures/entity/fish/tropical_a_pattern_5.png"), new rqO_2("textures/entity/fish/tropical_a_pattern_6.png")};
    private static final rqO_2[] id_this = new rqO_2[]{new rqO_2("textures/entity/fish/tropical_b_pattern_1.png"), new rqO_2("textures/entity/fish/tropical_b_pattern_2.png"), new rqO_2("textures/entity/fish/tropical_b_pattern_3.png"), new rqO_2("textures/entity/fish/tropical_b_pattern_4.png"), new rqO_2("textures/entity/fish/tropical_b_pattern_5.png"), new rqO_2("textures/entity/fish/tropical_b_pattern_6.png")};
    public static final int[] id_class = new int[]{rOg_1.id_class(rOY.STRIPEY, rxL_2.ORANGE, rxL_2.GRAY), rOg_1.id_class(rOY.FLOPPER, rxL_2.GRAY, rxL_2.GRAY), rOg_1.id_class(rOY.FLOPPER, rxL_2.GRAY, rxL_2.BLUE), rOg_1.id_class(rOY.CLAYFISH, rxL_2.WHITE, rxL_2.GRAY), rOg_1.id_class(rOY.SUNSTREAK, rxL_2.BLUE, rxL_2.GRAY), rOg_1.id_class(rOY.KOB, rxL_2.ORANGE, rxL_2.WHITE), rOg_1.id_class(rOY.SPOTTY, rxL_2.PINK, rxL_2.LIGHT_BLUE), rOg_1.id_class(rOY.BLOCKFISH, rxL_2.PURPLE, rxL_2.YELLOW), rOg_1.id_class(rOY.CLAYFISH, rxL_2.WHITE, rxL_2.RED), rOg_1.id_class(rOY.SPOTTY, rxL_2.WHITE, rxL_2.YELLOW), rOg_1.id_class(rOY.GLITTER, rxL_2.WHITE, rxL_2.GRAY), rOg_1.id_class(rOY.CLAYFISH, rxL_2.WHITE, rxL_2.ORANGE), rOg_1.id_class(rOY.DASHER, rxL_2.CYAN, rxL_2.PINK), rOg_1.id_class(rOY.BRINELY, rxL_2.LIME, rxL_2.LIGHT_BLUE), rOg_1.id_class(rOY.BETTY, rxL_2.RED, rxL_2.WHITE), rOg_1.id_class(rOY.SNOOPER, rxL_2.GRAY, rxL_2.RED), rOg_1.id_class(rOY.BLOCKFISH, rxL_2.RED, rxL_2.WHITE), rOg_1.id_class(rOY.FLOPPER, rxL_2.WHITE, rxL_2.YELLOW), rOg_1.id_class(rOY.KOB, rxL_2.RED, rxL_2.WHITE), rOg_1.id_class(rOY.SUNSTREAK, rxL_2.GRAY, rxL_2.WHITE), rOg_1.id_class(rOY.DASHER, rxL_2.CYAN, rxL_2.YELLOW), rOg_1.id_class(rOY.FLOPPER, rxL_2.YELLOW, rxL_2.YELLOW)};
    private boolean id_else = true;

    @Override
    protected rqA_2 id_byte(rye_3 rye_32) {
        return rqn_3.dv;
    }

    public rOg_1(aI_2<? extends rOg_1> aI_22, rYB rYB2) {
        super((aI_2<? extends rOt_1>)aI_22, rYB2);
    }

    public static rxL_2 id_this(int n) {
        return rxL_2.id_class(rOg_1.id_goto(n));
    }

    @Override
    public aU_2 id_class(rRf_1 rRf_12, rRh_1 rRh_12, iO_2 iO_22, aU_2 aU_22, rcd_3 rcd_32) {
        int n;
        int n2;
        int n3;
        int n4;
        aU_22 = super.id_class(rRf_12, rRh_12, iO_22, aU_22, rcd_32);
        if (rcd_32 != null && rcd_32.id_byte("BucketVariantTag", 3)) {
            this.id_return(rcd_32.id_private("BucketVariantTag"));
            return aU_22;
        }
        if (aU_22 instanceof rOR) {
            rOR rOR2 = (rOR)aU_22;
            n4 = rOR2.id_break;
            n3 = rOR2.id_byte;
            n2 = rOR2.id_protected;
            n = rOR2.id_throws;
        } else if ((double)((Random)this.id_throws[40]).nextFloat() < 0.9) {
            int n5 = rqR_2.id_class(id_class, (Random)this.id_throws[40]);
            n4 = n5 & 0xFF;
            n3 = (n5 & 0xFF00) >> 8;
            n2 = (n5 & 0xFF0000) >> 16;
            n = (n5 & 0xFF000000) >> 24;
            aU_22 = new rOR(this, n4, n3, n2, n);
        } else {
            this.id_else = false;
            n4 = ((Random)this.id_throws[40]).nextInt(2);
            n3 = ((Random)this.id_throws[40]).nextInt(6);
            n2 = ((Random)this.id_throws[40]).nextInt(15);
            n = ((Random)this.id_throws[40]).nextInt(15);
        }
        this.id_return(n4 | n3 << 8 | n2 << 16 | n << 24);
        return aU_22;
    }

    private static int id_class(rOY rOY2, rxL_2 rxL_22, rxL_2 rxL_23) {
        return rOY2.id_class() & 0xFF | (rOY2.id_break() & 0xFF) << 8 | (rxL_22.id_break() & 0xFF) << 16 | (rxL_23.id_break() & 0xFF) << 24;
    }

    @Override
    public void id_class(rcd_3 rcd_32) {
        super.id_class(rcd_32);
        rcd_32.id_break("Variant", this.sc());
    }

    public float[] sm() {
        return rxL_2.id_class(rOg_1.id_while(this.sc())).id_protected();
    }

    public int sc() {
        return ((rmE_2)this.id_throws[49]).id_class(id_break);
    }

    @Override
    public void id_break(rcd_3 rcd_32) {
        super.id_break(rcd_32);
        this.id_return(rcd_32.id_private("Variant"));
    }

    public static String id_break(int n) {
        return "entity.minecraft.tropical_fish.predefined." + n;
    }

    @Override
    protected rdn_3 L() {
        return new rdn_3(rdy_3.XS);
    }

    public rqO_2 sv() {
        return rOg_1.id_public(this.sc()) == 0 ? id_super[rOg_1.id_try(this.sc())] : id_this[rOg_1.id_try(this.sc())];
    }

    @Override
    protected void id_extends(rdn_3 rdn_32) {
        super.id_extends(rdn_32);
        rcd_3 rcd_32 = rdn_32.id_int();
        rcd_32.id_break("BucketVariantTag", this.sc());
    }

    private static int id_goto(int n) {
        return (n & 0xFF0000) >> 16;
    }

    @Override
    public boolean id_continue(int n) {
        return !this.id_else;
    }

    public static rxL_2 id_else(int n) {
        return rxL_2.id_class(rOg_1.id_while(n));
    }

    public void id_return(int n) {
        ((rmE_2)this.id_throws[49]).id_break(id_break, n);
    }

    private static int id_try(int n) {
        return Math.min((n & 0xFF00) >> 8, 5);
    }

    private static int id_while(int n) {
        return (n & 0xFF000000) >> 24;
    }

    @Override
    protected rqA_2 id_static() {
        return rqn_3.du;
    }

    public static int id_public(int n) {
        return Math.min(n & 0xFF, 1);
    }

    public static String id_synchronized(int n) {
        int n2 = rOg_1.id_public(n);
        int n3 = rOg_1.id_try(n);
        return "entity.minecraft.tropical_fish.type." + rOY.id_class(n2, n3);
    }

    @Override
    protected rqA_2 Bt() {
        return rqn_3.dm;
    }

    @Override
    protected rqA_2 sJ() {
        return rqn_3.dZ;
    }

    public float[] su() {
        return rxL_2.id_class(rOg_1.id_goto(this.sc())).id_protected();
    }

    public int sZ() {
        return rOg_1.id_public(this.sc());
    }

    public rqO_2 sF() {
        return id_protected[rOg_1.id_public(this.sc())];
    }

    @Override
    protected void m_() {
        super.m_();
        ((rmE_2)this.id_throws[49]).id_class(id_break, 0);
    }
}

