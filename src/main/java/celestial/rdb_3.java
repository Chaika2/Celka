/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMultimap
 *  com.google.common.collect.Maps
 *  com.google.common.collect.Multimap
 */
package celestial;

import celestial.VD;
import celestial.an_3;
import celestial.iB_2;
import celestial.iJ_2;
import celestial.ix_3;
import celestial.rVL;
import celestial.rXQ;
import celestial.rYB;
import celestial.rcd_3;
import celestial.rdH_2;
import celestial.rdO_2;
import celestial.rdX_2;
import celestial.rde_3;
import celestial.rdn_3;
import celestial.rdy_3;
import celestial.rfH_2;
import celestial.rfU_2;
import celestial.rff_3;
import celestial.rgP_2;
import celestial.rgn_3;
import celestial.rhd_3;
import celestial.rjB_2;
import celestial.rjS_2;
import celestial.rjU_2;
import celestial.rjs_3;
import celestial.rkc_3;
import celestial.rlb_3;
import celestial.rpL_2;
import celestial.rpm_3;
import celestial.rqA_2;
import celestial.rqR_2;
import celestial.rqn_3;
import celestial.rqs_3;
import celestial.rxK_2;
import celestial.ryZ_2;
import celestial.rye_3;
import celestial.rym_3;
import celestial.xc_3;
import celestial.xd_3;
import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Maps;
import com.google.common.collect.Multimap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.UUID;

public class rdb_3
implements rpL_2 {
    public static final Map<xd_3, rdb_3> id_throws = Maps.newHashMap();
    protected static final UUID id_case = UUID.fromString("CB3F55D3-645C-4F38-A497-9C13A33DB5CF");
    protected static final UUID id_catch = UUID.fromString("FA233E1C-4180-4865-B01B-BCCE9785ACA3");
    protected static final Random id_private = new Random();
    protected final rdX_2 id_implements;
    private final rde_3 id_class;
    private final int id_break;
    private final int id_byte;
    private final boolean id_protected;
    private final rdb_3 id_finally;
    private String id_extends;
    private final rxK_2 id_native;
    private boolean id_volatile;

    public rkc_3 id_byte(rdn_3 rdn_32) {
        return rdn_32.id_break().id_super() ? rkc_3.EAT : rkc_3.NONE;
    }

    public boolean id_int() {
        return this.id_finally != null;
    }

    public rdb_3(rdO_2 rdO_22) {
        this.id_implements = rdO_22.id_protected;
        this.id_class = rdO_22.id_throws;
        this.id_finally = rdO_22.id_byte;
        this.id_byte = rdO_22.id_break;
        this.id_break = rdO_22.id_class;
        this.id_native = rdO_22.id_case;
        this.id_protected = rdO_22.id_catch;
        this.id_volatile = rdO_22.id_private;
    }

    public String toString() {
        return rVL.id_for.id_break(this).id_break();
    }

    public rxK_2 id_this() {
        return this.id_native;
    }

    public static int id_class(rdb_3 rdb_32) {
        return rdb_32 == null ? 0 : rVL.id_for.id_class(rdb_32);
    }

    public boolean id_class() {
        return false;
    }

    public void id_class(rdn_3 rdn_32, rYB rYB2, iB_2 iB_22, int n) {
    }

    public void id_class(rdn_3 rdn_32, rYB rYB2, an_3 an_32, int n, boolean bl) {
    }

    public boolean id_class(rye_3 rye_32) {
        return !this.id_protected || !rye_32.id_int();
    }

    protected static rff_3 id_class(rYB rYB2, rhd_3 rhd_32, rjs_3 rjs_32) {
        float f = ((Float)rhd_32.id_throws[16]).floatValue();
        float f2 = ((Float)rhd_32.id_throws[15]).floatValue();
        rjU_2 rjU_22 = rhd_32.id_new(1.0f);
        float f3 = rfU_2.id_break(-f2 * ((float)Math.PI / 180) - (float)Math.PI);
        float f4 = rfU_2.id_class(-f2 * ((float)Math.PI / 180) - (float)Math.PI);
        float f5 = -rfU_2.id_break(-f * ((float)Math.PI / 180));
        float f6 = rfU_2.id_class(-f * ((float)Math.PI / 180));
        float f7 = f4 * f5;
        float f8 = f3 * f5;
        double d = 5.0;
        rjU_2 rjU_23 = rjU_22.id_break((double)f7 * 5.0, (double)f6 * 5.0, (double)f8 * 5.0);
        return rYB2.id_class(new rjB_2(rjU_22, rjU_23, rjS_2.OUTLINE, rjs_32, rhd_32));
    }

    public void id_class(rdX_2 rdX_22, rqs_3<rdn_3> rqs_32) {
        if (this.id_class(rdX_22)) {
            rqs_32.add(new rdn_3(this));
        }
    }

    protected boolean id_class(rdX_2 rdX_22) {
        rdX_2 rdX_23 = this.id_new();
        return rdX_23 != null && (rdX_22 == rdX_2.id_catch || rdX_22 == rdX_23);
    }

    public boolean id_class(rdn_3 rdn_32, rdn_3 rdn_33) {
        return false;
    }

    public Multimap<iJ_2, ix_3> id_class(rXQ rXQ2) {
        return ImmutableMultimap.of();
    }

    public boolean id_class(rlb_3<rdb_3> rlb_32) {
        return rlb_32.id_class(this);
    }

    public boolean id_class(rdn_3 rdn_32) {
        return this.id_implements() == 1 && this.id_extends();
    }

    public void id_class(rdn_3 rdn_32, rYB rYB2, List<rgP_2> list, VD vD) {
    }

    public boolean id_class(xc_3 xc_32, rYB rYB2, rfH_2 rfH_22, rhd_3 rhd_32) {
        return true;
    }

    public ryZ_2 id_class(rdH_2 rdH_22) {
        return ryZ_2.PASS;
    }

    public boolean id_class(rdn_3 rdn_32, rYB rYB2, xc_3 xc_32, rfH_2 rfH_22, iB_2 iB_22) {
        return false;
    }

    public boolean id_class(rdn_3 rdn_32, iB_2 iB_22, iB_2 iB_23) {
        return false;
    }

    public float id_class(rdn_3 rdn_32, xc_3 xc_32) {
        return 1.0f;
    }

    public rdn_3 id_class(rdn_3 rdn_32, rYB rYB2, iB_2 iB_22) {
        return this.id_super() ? iB_22.id_class(rYB2, rdn_32) : rdn_32;
    }

    public ryZ_2 id_class(rdn_3 rdn_32, rhd_3 rhd_32, iB_2 iB_22, rpm_3 rpm_32) {
        return ryZ_2.PASS;
    }

    @Deprecated
    public static rdb_3 id_class(xd_3 xd_32) {
        return id_throws.getOrDefault(xd_32, rdy_3.id_class);
    }

    public void id_class(rYB rYB2, iB_2 iB_22, rdn_3 rdn_32, int n) {
    }

    public rym_3<rdn_3> id_class(rYB rYB2, rhd_3 rhd_32, rpm_3 rpm_32) {
        if (this.id_super()) {
            rdn_3 rdn_32 = rhd_32.id_protected(rpm_32);
            if (rhd_32.id_else(this.id_this().id_protected())) {
                rhd_32.id_break(rpm_32);
                return rym_3.id_break(rdn_32);
            }
            return rym_3.id_protected(rdn_32);
        }
        return rym_3.id_byte(rhd_32.id_protected(rpm_32));
    }

    public void id_break(rdn_3 rdn_32, rYB rYB2, rhd_3 rhd_32) {
    }

    public boolean id_break(rcd_3 rcd_32) {
        return false;
    }

    public static rdb_3 id_break(int n) {
        return rVL.id_for.id_class(n);
    }

    public boolean id_break(xc_3 xc_32) {
        return false;
    }

    public int id_break(rdn_3 rdn_32) {
        if (rdn_32.id_break().id_super()) {
            return this.id_this().id_throws() ? 16 : 32;
        }
        return 0;
    }

    public String id_break() {
        return this.id_volatile();
    }

    public boolean id_throws(rdn_3 rdn_32) {
        return rdn_32.id_public();
    }

    public final int id_finally() {
        return this.id_byte;
    }

    public rde_3 id_finally(rdn_3 rdn_32) {
        if (!rdn_32.id_public()) {
            return this.id_class;
        }
        switch (this.id_class) {
            case COMMON: 
            case UNCOMMON: {
                return rde_3.RARE;
            }
            case RARE: {
                return rde_3.EPIC;
            }
        }
        return this.id_class;
    }

    public boolean id_extends(rdn_3 rdn_32) {
        return rdn_32.id_break() == rdy_3.kU;
    }

    public boolean id_extends() {
        return this.id_byte > 0;
    }

    public String id_case(rdn_3 rdn_32) {
        return this.id_break();
    }

    @Override
    public rdb_3 id_case() {
        return this;
    }

    public rdn_3 id_continue() {
        return new rdn_3(this);
    }

    public boolean id_else() {
        return this.id_protected;
    }

    public rgP_2 id_implements(rdn_3 rdn_32) {
        return new rgn_3(this.id_case(rdn_32));
    }

    public final int id_implements() {
        return this.id_break;
    }

    public final rdX_2 id_new() {
        return this.id_implements;
    }

    public final rdb_3 id_package() {
        return this.id_finally;
    }

    public boolean id_super() {
        return this.id_native != null;
    }

    public int id_protected() {
        return 0;
    }

    public boolean id_final() {
        return true;
    }

    protected String id_volatile() {
        if (this.id_extends == null) {
            this.id_extends = rqR_2.id_class("item", rVL.id_for.id_break(this));
        }
        return this.id_extends;
    }

    public boolean id_synchronized() {
        return this.id_volatile;
    }

    public rgP_2 id_native() {
        return new rgn_3(this.id_break());
    }

    public rqA_2 U_() {
        return rqn_3.SV;
    }

    public rqA_2 V_() {
        return rqn_3.Sg;
    }
}

