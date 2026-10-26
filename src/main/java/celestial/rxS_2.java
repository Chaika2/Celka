/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMultimap
 *  com.google.common.collect.ImmutableMultimap$Builder
 *  com.google.common.collect.Multimap
 */
package celestial;

import celestial.UT;
import celestial.Uq_1;
import celestial.an_3;
import celestial.dQ_2;
import celestial.eU_2;
import celestial.iB_2;
import celestial.iJ_2;
import celestial.iQ_2;
import celestial.id_3;
import celestial.is_3;
import celestial.ix_3;
import celestial.rXQ;
import celestial.rYB;
import celestial.rdB_2;
import celestial.rdO_2;
import celestial.rdb_3;
import celestial.rdn_3;
import celestial.rfH_2;
import celestial.rfl_3;
import celestial.rhd_3;
import celestial.rpJ_2;
import celestial.rpm_3;
import celestial.rpx_3;
import celestial.rxE_2;
import celestial.rxs_3;
import celestial.rym_3;
import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import java.util.List;
import java.util.UUID;

public class rxS_2
extends rdb_3
implements eU_2 {
    private static final UUID[] id_finally = new UUID[]{UUID.fromString("845DB27C-C624-495F-8C9F-6020A9A58B6B"), UUID.fromString("D8499B04-0E66-4726-AB29-64469D734E0D"), UUID.fromString("9F3D476D-C118-4544-8365-64846904B48E"), UUID.fromString("2AD3F246-FEE1-4E67-B886-69FD380BB150")};
    public static final UT id_class = new rxs_3();
    protected final rXQ id_break;
    private final int id_extends;
    private final float id_native;
    protected final float id_byte;
    protected final rdB_2 id_protected;
    private final Multimap<iJ_2, ix_3> id_volatile;

    public rXQ id_byte() {
        return this.id_break;
    }

    public rxS_2(rdB_2 rdB_22, rXQ rXQ2, rdO_2 rdO_22) {
        super(rdO_22.id_break(rdB_22.id_class(rXQ2)));
        this.id_protected = rdB_22;
        this.id_break = rXQ2;
        this.id_extends = rdB_22.id_break(rXQ2);
        this.id_native = rdB_22.id_throws();
        this.id_byte = rdB_22.id_case();
        dQ_2.id_class(this, id_class);
        ImmutableMultimap.Builder builder = ImmutableMultimap.builder();
        UUID uUID = id_finally[rXQ2.id_break()];
        builder.put((Object)iQ_2.id_implements, (Object)new ix_3(uUID, "Armor modifier", (double)this.id_extends, id_3.ADDITION));
        builder.put((Object)iQ_2.id_finally, (Object)new ix_3(uUID, "Armor toughness", (double)this.id_native, id_3.ADDITION));
        if (rdB_22 == rxE_2.NETHERITE) {
            builder.put((Object)iQ_2.id_byte, (Object)new ix_3(uUID, "Armor knockback resistance", (double)this.id_byte, id_3.ADDITION));
        }
        this.id_volatile = builder.build();
    }

    @Override
    public rym_3<rdn_3> id_class(rYB rYB2, rhd_3 rhd_32, rpm_3 rpm_32) {
        rdn_3 rdn_32 = rhd_32.id_protected(rpm_32);
        rXQ rXQ2 = is_3.id_finally(rdn_32);
        rdn_3 rdn_33 = rhd_32.id_class(rXQ2);
        if (rdn_33.id_class()) {
            rhd_32.id_class(rXQ2, rdn_32.id_implements());
            rdn_32.id_throws(0);
            return rym_3.id_class(rdn_32, rYB2.id_import());
        }
        return rym_3.id_protected(rdn_32);
    }

    @Override
    public Multimap<iJ_2, ix_3> id_class(rXQ rXQ2) {
        return rXQ2 == this.id_break ? this.id_volatile : super.id_class(rXQ2);
    }

    public static boolean id_class(Uq_1 uq_1, rdn_3 rdn_32) {
        rfH_2 rfH_22 = uq_1.id_protected().id_break(uq_1.id_throws().id_byte(dQ_2.id_volatile));
        List<an_3> list = uq_1.id_catch().id_class(iB_2.class, new rfl_3(rfH_22), rpJ_2.id_catch.and(new rpx_3(rdn_32)));
        if (list.isEmpty()) {
            return false;
        }
        iB_2 iB_22 = (iB_2)list.get(0);
        rXQ rXQ2 = is_3.id_finally(rdn_32);
        rdn_3 rdn_33 = rdn_32.id_class(1);
        iB_22.id_class(rXQ2, rdn_33);
        if (iB_22 instanceof is_3) {
            ((is_3)iB_22).id_class(rXQ2, 2.0f);
            ((is_3)iB_22).b();
        }
        return true;
    }

    @Override
    public boolean id_class(rdn_3 rdn_32, rdn_3 rdn_33) {
        return this.id_protected.id_byte().id_class(rdn_33) || super.id_class(rdn_32, rdn_33);
    }

    public rdB_2 id_throws() {
        return this.id_protected;
    }

    public int id_catch() {
        return this.id_extends;
    }

    @Override
    public int id_protected() {
        return this.id_protected.id_class();
    }

    public float id_private() {
        return this.id_native;
    }
}

