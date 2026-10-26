/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Sets
 */
package celestial;

import celestial.rVi_1;
import celestial.rgF_2;
import celestial.rgN_2;
import celestial.rgP_2;
import celestial.rgc_3;
import celestial.rgp_3;
import celestial.rgv_3;
import celestial.rgy_3;
import celestial.rnM_2;
import celestial.rnO_2;
import celestial.rnX_2;
import celestial.rnh_3;
import celestial.rns_3;
import celestial.rrLF;
import celestial.rrLv_1;
import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.Set;

public class rnB_2
extends rnM_2 {
    private final rns_3 id_class;
    private final String id_break;
    private final Set<String> id_byte = Sets.newHashSet();
    private rgP_2 id_protected;
    private rgP_2 id_throws = rgN_2.id_byte;
    private rgP_2 id_case = rgN_2.id_byte;
    private boolean id_catch = true;
    private boolean id_private = true;
    private rnX_2 id_implements = rnX_2.ALWAYS;
    private rnX_2 id_finally = rnX_2.ALWAYS;
    private rgF_2 id_extends = rgF_2.RESET;
    private rnh_3 id_native = rnh_3.ALWAYS;
    private final rgc_3 id_volatile;

    public rVi_1 id_byte() {
        rVi_1 rVi_12 = rgv_3.id_class(this.id_protected.id_case().id_break(this.id_volatile));
        rgF_2 rgF_22 = this.id_volatile();
        if (rgF_22 != rgF_2.RESET) {
            rVi_12.id_class(rgF_22);
        }
        return rVi_12;
    }

    public void id_byte(rgP_2 rgP_22) {
        rrLF rrLF2 = rrLF.id_class(this, rgP_22);
        this.id_case = (rgP_22 = rrLF2.id_class()) == null ? rgN_2.id_byte : rgP_22;
        this.id_class.id_byte(this);
    }

    public rnB_2(rns_3 rns_32, String string) {
        this.id_class = rns_32;
        this.id_break = string;
        this.id_protected = new rgN_2(string);
        this.id_volatile = rgc_3.id_class.id_class(string).id_class(new rgy_3(rgp_3.id_class, new rgN_2(string)));
    }

    public String toString() {
        return "ScorePlayerTeam{scoreboard=" + this.id_class + ", name='" + this.id_break + "', membershipSet=" + this.id_byte + ", displayName=" + this.id_protected + ", prefix=" + this.id_throws + ", suffix=" + this.id_case + ", allowFriendlyFire=" + this.id_catch + ", canSeeFriendlyInvisibles=" + this.id_private + ", nameTagVisibility=" + this.id_implements + ", deathMessageVisibility=" + this.id_finally + ", color=" + this.id_extends + ", collisionRule=" + this.id_native + ", field_237499_m_=" + this.id_volatile + "}";
    }

    public void id_class(rgF_2 rgF_22) {
        this.id_extends = rgF_22;
        this.id_class.id_byte(this);
    }

    public static rVi_1 id_class(rnM_2 rnM_22, rgP_2 rgP_22, rnO_2[] rnO_2Array) {
        return rnM_22 == null ? rgP_22.id_case() : rnM_22.id_class(rgP_22, rnO_2Array);
    }

    public void id_class(boolean bl) {
        this.id_catch = bl;
        this.id_class.id_byte(this);
    }

    public void id_class(int n) {
        this.id_class((n & 1) > 0);
        this.id_break((n & 2) > 0);
    }

    public rVi_1 id_class(rVi_1 rVi_12, rgP_2 rgP_22, rnO_2[] rnO_2Array) {
        block5: for (rnO_2 rnO_22 : rnO_2Array) {
            switch (rnO_22) {
                case NAME: {
                    rVi_12.id_class(rgP_22);
                    continue block5;
                }
                case PREFIX: {
                    rVi_12.id_class(this.id_throws);
                    continue block5;
                }
                case SUFFIX: {
                    rVi_12.id_class(this.id_case);
                }
            }
        }
        return rVi_12;
    }

    public void id_class(rnh_3 rnh_32) {
        this.id_native = rnh_32;
        this.id_class.id_byte(this);
    }

    public void id_class(rnX_2 rnX_22) {
        this.id_implements = rnX_22;
        this.id_class.id_byte(this);
    }

    public void id_class(rgP_2 rgP_22) {
        if (rgP_22 == null) {
            throw new IllegalArgumentException("Name cannot be null");
        }
        this.id_protected = rgP_22;
        this.id_class.id_byte(this);
    }

    @Override
    public String id_class() {
        return this.id_break;
    }

    @Override
    public rVi_1 id_class(rgP_2 rgP_22, rnO_2[] rnO_2Array) {
        rVi_1 rVi_12 = new rgN_2("");
        rVi_12 = this.id_class(rVi_12, rgP_22, rnO_2Array);
        rgF_2 rgF_22 = this.id_volatile();
        if (rgF_22 != rgF_2.RESET) {
            rVi_12.id_class(rgF_22);
        }
        return rVi_12;
    }

    public void id_break(rgP_2 rgP_22) {
        rrLv_1 rrLv_12 = rrLv_1.id_class(this, rgP_22);
        this.id_throws = (rgP_22 = rrLv_12.id_class()) == null ? rgN_2.id_byte : rgP_22;
        this.id_class.id_byte(this);
    }

    public void id_break(rnX_2 rnX_22) {
        this.id_finally = rnX_22;
        this.id_class.id_byte(this);
    }

    public rgP_2 id_break() {
        return this.id_protected;
    }

    public void id_break(boolean bl) {
        this.id_private = bl;
        this.id_class.id_byte(this);
    }

    public rgP_2 id_throws() {
        return this.id_case;
    }

    @Override
    public rnX_2 id_finally() {
        return this.id_finally;
    }

    @Override
    public boolean id_catch() {
        return this.id_catch;
    }

    @Override
    public rnh_3 id_extends() {
        return this.id_native;
    }

    @Override
    public Collection<String> id_case() {
        return this.id_byte;
    }

    @Override
    public rnX_2 id_implements() {
        return this.id_implements;
    }

    public rgP_2 id_protected() {
        return this.id_throws;
    }

    @Override
    public boolean id_private() {
        return this.id_private;
    }

    public rns_3 id_final() {
        return this.id_class;
    }

    @Override
    public rgF_2 id_volatile() {
        return this.id_extends;
    }

    public int id_native() {
        int n = 0;
        if (this.id_catch()) {
            n |= 1;
        }
        if (this.id_private()) {
            n |= 2;
        }
        return n;
    }
}

