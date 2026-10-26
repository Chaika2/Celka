/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 *  com.mojang.datafixers.util.Pair
 *  org.apache.commons.lang3.StringUtils
 */
package celestial;

import celestial.HQ;
import celestial.Hx_1;
import celestial.Hz_1;
import celestial.IC;
import celestial.IQ;
import celestial.Ig_1;
import celestial.JL;
import celestial.JU;
import celestial.Ml_1;
import celestial.Ok_1;
import celestial.Wp_1;
import celestial.fD_2;
import celestial.jx_3;
import celestial.jz_3;
import celestial.rHA;
import celestial.rHE;
import celestial.rHJ;
import celestial.rHb_1;
import celestial.rHq_1;
import celestial.rHu_1;
import celestial.rcd_3;
import celestial.rco_3;
import celestial.rdb_3;
import celestial.rdn_3;
import celestial.rdy_3;
import celestial.rkP_2;
import celestial.rrbY_2;
import celestial.rxJ_2;
import celestial.rxL_2;
import celestial.ryO_2;
import celestial.ryQ_2;
import celestial.ryr_3;
import celestial.rys_3;
import celestial.wm_3;
import celestial.wp_3;
import celestial.xb_3;
import celestial.xd_3;
import celestial.xu_3;
import com.mojang.authlib.GameProfile;
import com.mojang.datafixers.util.Pair;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.UUID;
import org.apache.commons.lang3.StringUtils;

public class jG_2 {
    private static final ryr_3[] id_byte = (ryr_3[])Arrays.stream(rxL_2.values()).sorted(Comparator.comparingInt(rxL_2::id_break)).map(ryr_3::new).toArray(ryr_3[]::new);
    private static final ryr_3 id_protected = new ryr_3((rxL_2)null);
    public static final jG_2 id_class = new jG_2();
    private final rHu_1 id_throws = new rHu_1();
    private final rHu_1 id_case = new ryQ_2();
    private final rHq_1 id_catch = new rHq_1();
    private final rHb_1 id_private = new rHb_1();
    private final rHJ id_implements = new rHJ();
    private final rHA id_finally = new rHA();
    private final wm_3 id_extends = new wm_3();
    public wp_3 id_break = new wp_3();

    public void id_class(rdn_3 rdn_32, IQ iQ, Ml_1 ml_1, Hx_1 hx_1, int n, int n2) {
        if (rrbY_2.id_class()) {
            rrbY_2.id_byte();
        }
        this.id_class(rdn_32, ml_1, hx_1, n, n2);
        if (rrbY_2.id_class()) {
            if (rrbY_2.id_protected()) {
                rrbY_2.id_throws();
                this.id_class(rdn_32, ml_1, hx_1, HQ.id_class, n2);
                rrbY_2.id_catch();
            }
            rrbY_2.id_private();
        }
    }

    public void id_class(rdn_3 rdn_32, Ml_1 ml_1, Hx_1 hx_1, int n, int n2) {
        rdb_3 rdb_32 = rdn_32.id_break();
        if (rdb_32 instanceof rxJ_2) {
            xd_3 xd_32 = ((rxJ_2)rdb_32).id_catch();
            if (xd_32 instanceof JU) {
                GameProfile gameProfile = null;
                if (rdn_32.id_final()) {
                    rcd_3 rcd_32 = rdn_32.id_package();
                    if (rcd_32.id_byte("SkullOwner", 10)) {
                        gameProfile = rco_3.id_class(rcd_32.id_int("SkullOwner"));
                    } else if (rcd_32.id_byte("SkullOwner", 8) && !StringUtils.isBlank((CharSequence)rcd_32.id_native("SkullOwner"))) {
                        GameProfile gameProfile2 = new GameProfile((UUID)null, rcd_32.id_native("SkullOwner"));
                        gameProfile = rys_3.id_break(gameProfile2);
                        rcd_32.id_continue("SkullOwner");
                        rcd_32.id_class("SkullOwner", rco_3.id_class(new rcd_3(), gameProfile));
                    }
                }
                jx_3.id_class(null, 180.0f, ((JU)xd_32).id_break(), gameProfile, 0.0f, ml_1, hx_1, n);
            } else {
                ryO_2 ryO_22;
                if (xd_32 instanceof JL) {
                    this.id_private.id_class(rdn_32, ((JL)xd_32).id_break());
                    ryO_22 = this.id_private;
                } else if (xd_32 instanceof xb_3) {
                    this.id_implements.id_class(((xb_3)xd_32).id_break());
                    ryO_22 = this.id_implements;
                } else if (xd_32 == xu_3.hB) {
                    ryO_22 = this.id_finally;
                } else if (xd_32 == xu_3.re) {
                    ryO_22 = this.id_throws;
                } else if (xd_32 == xu_3.SW) {
                    ryO_22 = this.id_catch;
                } else if (xd_32 == xu_3.sZ) {
                    ryO_22 = this.id_case;
                } else {
                    if (!(xd_32 instanceof Wp_1)) {
                        return;
                    }
                    rxL_2 rxL_22 = Wp_1.id_break(rdb_32);
                    ryO_22 = rxL_22 == null ? id_protected : id_byte[rxL_22.id_break()];
                }
                jz_3.id_break.id_class(ryO_22, ml_1, hx_1, n, n2);
            }
        } else if (rdb_32 == rdy_3.kN) {
            boolean bl = rdn_32.id_break("BlockEntityTag") != null;
            ml_1.id_class();
            ml_1.id_class(1.0f, -1.0f, -1.0f);
            Ig_1 ig_1 = bl ? IC.id_catch : IC.id_private;
            Ok_1 ok_1 = ig_1.id_byte().id_class(Hz_1.id_byte(hx_1, this.id_extends.id_class(ig_1.id_class()), true, rdn_32.id_else()));
            this.id_extends.id_break().id_class(ml_1, ok_1, n, n2, 1.0f, 1.0f, 1.0f, 1.0f);
            if (bl) {
                List<Pair<rHE, rxL_2>> list = rHb_1.id_class(rkP_2.id_protected(rdn_32), rHb_1.id_class(rdn_32));
                fD_2.id_class(ml_1, hx_1, n, n2, this.id_extends.id_class(), ig_1, false, list, rdn_32.id_else());
            } else {
                this.id_extends.id_class().id_class(ml_1, ok_1, n, n2, 1.0f, 1.0f, 1.0f, 1.0f);
            }
            ml_1.id_break();
        } else if (rdb_32 == rdy_3.kY) {
            ml_1.id_class();
            ml_1.id_class(1.0f, -1.0f, -1.0f);
            Ok_1 ok_1 = Hz_1.id_byte(hx_1, this.id_break.id_class(wp_3.id_class), false, rdn_32.id_else());
            this.id_break.id_class(ml_1, ok_1, n, n2, 1.0f, 1.0f, 1.0f, 1.0f);
            ml_1.id_break();
        }
    }
}

