/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Hz_1;
import celestial.rRl_1;
import celestial.rdn_3;
import celestial.rdy_3;
import celestial.rgP_2;
import celestial.rgn_3;
import celestial.xu_3;
import java.util.Optional;

public final class ZI
extends Enum<ZI> {
    public static final /* enum */ ZI CREATIVE = new ZI(new rgn_3("gameMode.creative"), "/gamemode creative", new rdn_3(xu_3.id_implements));
    public static final /* enum */ ZI SURVIVAL = new ZI(new rgn_3("gameMode.survival"), "/gamemode survival", new rdn_3(rdy_3.Oy));
    public static final /* enum */ ZI ADVENTURE = new ZI(new rgn_3("gameMode.adventure"), "/gamemode adventure", new rdn_3(rdy_3.dM));
    public static final /* enum */ ZI SPECTATOR = new ZI(new rgn_3("gameMode.spectator"), "/gamemode spectator", new rdn_3(rdy_3.JT));
    protected static final ZI[] field_238721_e_;
    public final rgP_2 field_238722_f_;
    public final String field_238723_g_;
    public final rdn_3 field_238724_h_;
    private static final /* synthetic */ ZI[] $VALUES;

    public Optional<ZI> id_byte() {
        switch (this) {
            case CREATIVE: {
                return Optional.of(SURVIVAL);
            }
            case SURVIVAL: {
                return Optional.of(ADVENTURE);
            }
            case ADVENTURE: {
                return Optional.of(SPECTATOR);
            }
        }
        return Optional.of(CREATIVE);
    }

    private ZI(rgP_2 rgP_22, String string2, rdn_3 rdn_32) {
        this.field_238722_f_ = rgP_22;
        this.field_238723_g_ = string2;
        this.field_238724_h_ = rdn_32;
    }

    static {
        $VALUES = ZI.id_protected();
        field_238721_e_ = ZI.values();
    }

    public static ZI[] values() {
        return (ZI[])$VALUES.clone();
    }

    public static ZI valueOf(String string) {
        return Enum.valueOf(ZI.class, string);
    }

    public static Optional<ZI> id_class(rRl_1 rRl_12) {
        switch (rRl_12) {
            case SPECTATOR: {
                return Optional.of(SPECTATOR);
            }
            case SURVIVAL: {
                return Optional.of(SURVIVAL);
            }
            case CREATIVE: {
                return Optional.of(CREATIVE);
            }
            case ADVENTURE: {
                return Optional.of(ADVENTURE);
            }
        }
        return Optional.empty();
    }

    public void id_class(Hz_1 hz_1, int n, int n2) {
        hz_1.id_class(this.field_238724_h_, n, n2);
    }

    public rgP_2 id_class() {
        return this.field_238722_f_;
    }

    public String id_break() {
        return this.field_238723_g_;
    }

    private static /* synthetic */ ZI[] id_protected() {
        return new ZI[]{CREATIVE, SURVIVAL, ADVENTURE, SPECTATOR};
    }
}

