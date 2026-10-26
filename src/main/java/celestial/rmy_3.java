/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.primitives.Doubles
 *  com.google.common.primitives.Floats
 *  com.mojang.brigadier.ParseResults
 *  com.mojang.brigadier.StringReader
 *  com.mojang.brigadier.suggestion.Suggestions
 *  io.netty.util.concurrent.Future
 *  io.netty.util.concurrent.GenericFutureListener
 *  it.unimi.dsi.fastutil.ints.Int2ShortMap
 *  it.unimi.dsi.fastutil.ints.Int2ShortOpenHashMap
 *  org.apache.commons.lang3.StringUtils
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package celestial;

import celestial.JC;
import celestial.KU;
import celestial.KY;
import celestial.Ko_1;
import celestial.OT;
import celestial.Oo_1;
import celestial.aD_2;
import celestial.an_3;
import celestial.iG_2;
import celestial.rFM;
import celestial.rFQ;
import celestial.rHF;
import celestial.rHZ;
import celestial.rHj_1;
import celestial.rHm_1;
import celestial.rJI;
import celestial.rJT;
import celestial.rJf_1;
import celestial.rJp_1;
import celestial.rJr_1;
import celestial.rLD;
import celestial.rOD;
import celestial.rRR;
import celestial.rRl_1;
import celestial.rRu_1;
import celestial.rSK;
import celestial.rVU;
import celestial.rVi_1;
import celestial.rXT;
import celestial.rYB;
import celestial.rZA;
import celestial.rZB;
import celestial.rZC;
import celestial.rZE;
import celestial.rZF;
import celestial.rZG;
import celestial.rZH;
import celestial.rZK;
import celestial.rZL;
import celestial.rZM;
import celestial.rZO;
import celestial.rZP;
import celestial.rZQ;
import celestial.rZR;
import celestial.rZS;
import celestial.rZT;
import celestial.rZW;
import celestial.rZZ;
import celestial.rZb_1;
import celestial.rZc_1;
import celestial.rZd_1;
import celestial.rZk_1;
import celestial.rZl_1;
import celestial.rZm_1;
import celestial.rZn_1;
import celestial.rZp_1;
import celestial.rZq_1;
import celestial.rZr_1;
import celestial.rZs_1;
import celestial.rZu_1;
import celestial.rZv_1;
import celestial.rZx_1;
import celestial.rZy_1;
import celestial.rZz_1;
import celestial.rca_3;
import celestial.rcd_3;
import celestial.rcy_3;
import celestial.rdb_3;
import celestial.rdn_3;
import celestial.rdy_3;
import celestial.rfH_2;
import celestial.rff_3;
import celestial.rfl_3;
import celestial.rgB_2;
import celestial.rgF_2;
import celestial.rgN_2;
import celestial.rgP_2;
import celestial.rgV_2;
import celestial.rgn_3;
import celestial.rhJ_2;
import celestial.rhN_2;
import celestial.rhd_3;
import celestial.rhm_3;
import celestial.rhx_3;
import celestial.rhz_3;
import celestial.rjC_2;
import celestial.rjN_2;
import celestial.rjU_2;
import celestial.rjw_3;
import celestial.rkm_3;
import celestial.rkw_3;
import celestial.rmD_2;
import celestial.rmH_2;
import celestial.rmI_2;
import celestial.rmK_2;
import celestial.rmR_2;
import celestial.rmT_2;
import celestial.rmV_2;
import celestial.rmY_2;
import celestial.rma_3;
import celestial.rme_3;
import celestial.rmf_3;
import celestial.rmg_3;
import celestial.rmi_3;
import celestial.rmj_3;
import celestial.rmo_3;
import celestial.rmq_3;
import celestial.rmt_3;
import celestial.rmw_3;
import celestial.rnW_2;
import celestial.rpm_3;
import celestial.rpr_3;
import celestial.rqO_2;
import celestial.rqR_2;
import celestial.rql_3;
import celestial.rqs_3;
import celestial.rqu_3;
import celestial.rrEm_1;
import celestial.rsE_2;
import celestial.rsP_2;
import celestial.ruS_2;
import celestial.ruZ_2;
import celestial.rud_3;
import celestial.rvD_2;
import celestial.rvS_2;
import celestial.rvU_2;
import celestial.rvb_3;
import celestial.rve_3;
import celestial.rvm_3;
import celestial.rvn_3;
import celestial.rvv_3;
import celestial.rxJ_2;
import celestial.rxN_2;
import celestial.ryG_2;
import celestial.ryM_2;
import celestial.ryO_2;
import celestial.ryS_2;
import celestial.ryZ_2;
import celestial.xK_2;
import celestial.xc_3;
import celestial.xu_3;
import com.google.common.collect.Lists;
import com.google.common.primitives.Doubles;
import com.google.common.primitives.Floats;
import com.mojang.brigadier.ParseResults;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.suggestion.Suggestions;
import io.netty.util.concurrent.Future;
import io.netty.util.concurrent.GenericFutureListener;
import it.unimi.dsi.fastutil.ints.Int2ShortMap;
import it.unimi.dsi.fastutil.ints.Int2ShortOpenHashMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.apache.commons.lang3.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class rmy_3
implements rmH_2 {
    private static final Logger id_byte = LogManager.getLogger();
    public final rud_3 id_class;
    private final rnW_2 id_protected;
    public rhN_2 id_break;
    private int id_throws;
    private long id_case;
    private boolean id_catch;
    private long id_private;
    private int id_implements;
    private int id_finally;
    private final Int2ShortMap id_extends = new Int2ShortOpenHashMap();
    private double id_native;
    private double id_volatile;
    private double id_final;
    private double id_package;
    private double id_int;
    private double id_new;
    private an_3 id_continue;
    private double id_super;
    private double id_this;
    private double id_else;
    private double id_synchronized;
    private double id_return;
    private double id_public;
    private rjU_2 id_goto;
    private int id_while;
    private int id_try;
    private boolean id_instanceof;
    private int id_throw;
    private boolean id_interface;
    private int id_char;
    private int id_abstract;
    private int id_long;

    public void id_byte() {
        this.id_native = this.id_break.rx();
        this.id_volatile = this.id_break.re();
        this.id_final = this.id_break.BO();
        this.id_package = this.id_break.rx();
        this.id_int = this.id_break.re();
        this.id_new = this.id_break.BO();
    }

    public rmy_3(rnW_2 rnW_22, rud_3 rud_32, rhN_2 rhN_22) {
        this.id_protected = rnW_22;
        this.id_class = rud_32;
        rud_32.id_class(this);
        this.id_break = rhN_22;
        rhN_22.id_class = this;
        rgV_2 rgV_22 = rhN_22.O();
        if (rgV_22 != null) {
            rgV_22.id_class();
        }
    }

    @Override
    public void id_class(rmI_2 rmI_22) {
        ruZ_2.id_class(rmI_22, this, this.id_break.id_continue());
        this.id_break.id_public();
        rmf_3 rmf_32 = rmI_22.id_break();
        switch (rmf_32) {
            case PERFORM_RESPAWN: {
                if (this.id_break.id_volatile) {
                    this.id_break.id_volatile = false;
                    this.id_break = this.id_protected.x().id_class(this.id_break, true);
                    Oo_1.id_synchronized.id_class(this.id_break, rYB.id_throws, rYB.id_byte);
                    break;
                }
                if (this.id_break.Ss() > 0.0f) {
                    return;
                }
                this.id_break = this.id_protected.x().id_class(this.id_break, false);
                if (!this.id_protected.id_int()) break;
                this.id_break.id_class(rRl_1.SPECTATOR);
                this.id_break.id_continue().B().id_class(rRu_1.id_int).id_class(false, this.id_protected);
                break;
            }
            case REQUEST_STATS: {
                this.id_break.id_long().id_class(this.id_break);
            }
        }
    }

    @Override
    public void id_class(rZq_1 rZq_12) {
        ruZ_2.id_class(rZq_12, this, this.id_break.id_continue());
        rrEm_1 rrEm_12 = this.id_break.id_continue();
        an_3 an_32 = rZq_12.id_class(rrEm_12);
        this.id_break.id_public();
        this.id_break.id_volatile(rZq_12.id_case());
        if (an_32 != null) {
            double d = 36.0;
            if (this.id_break.id_int(an_32) < 36.0) {
                rpm_3 rpm_32 = rZq_12.id_protected();
                rdn_3 rdn_32 = rpm_32 != null ? this.id_break.id_protected(rpm_32).id_implements() : rdn_3.id_break;
                Optional<Object> optional = Optional.empty();
                if (rZq_12.id_break() == rZT.INTERACT) {
                    optional = Optional.of(this.id_break.id_class(an_32, rpm_32));
                } else if (rZq_12.id_break() == rZT.INTERACT_AT) {
                    optional = Optional.of(an_32.id_class(this.id_break, rZq_12.id_throws(), rpm_32));
                } else if (rZq_12.id_break() == rZT.ATTACK) {
                    if (an_32 instanceof rsE_2 || an_32 instanceof rsP_2 || an_32 instanceof rhm_3 || an_32 == this.id_break) {
                        this.id_class(new rgn_3("multiplayer.disconnect.invalid_entity_attacked"));
                        id_byte.warn("Player {} tried to attack an invalid entity", (Object)this.id_break.g().getString());
                        return;
                    }
                    this.id_break.id_throw(an_32);
                }
                if (optional.isPresent() && ((ryZ_2)((Object)optional.get())).id_class()) {
                    Oo_1.id_boolean.id_class(this.id_break, rdn_32, an_32);
                    if (((ryZ_2)((Object)optional.get())).id_break()) {
                        this.id_break.id_class(rpm_32, true);
                    }
                }
            }
        }
    }

    @Override
    public void id_class(rmD_2 rmD_22) {
        ruZ_2.id_class(rmD_22, this, this.id_break.id_continue());
        this.id_break.id_public();
        switch (rmD_22.id_break()) {
            case PRESS_SHIFT_KEY: {
                this.id_break.id_volatile(true);
                break;
            }
            case RELEASE_SHIFT_KEY: {
                this.id_break.id_volatile(false);
                break;
            }
            case START_SPRINTING: {
                this.id_break.c_(true);
                break;
            }
            case STOP_SPRINTING: {
                this.id_break.c_(false);
                break;
            }
            case STOP_SLEEPING: {
                if (!this.id_break.Sc()) break;
                this.id_break.id_class(false, true);
                this.id_goto = this.id_break.Ps();
                break;
            }
            case START_RIDING_JUMP: {
                if (!(this.id_break.ra() instanceof aD_2)) break;
                aD_2 aD_22 = (aD_2)((Object)this.id_break.ra());
                int n = rmD_22.id_byte();
                if (!aD_22.id_throws() || n <= 0) break;
                aD_22.id_break(n);
                break;
            }
            case STOP_RIDING_JUMP: {
                if (!(this.id_break.ra() instanceof aD_2)) break;
                aD_2 aD_23 = (aD_2)((Object)this.id_break.ra());
                aD_23.id_case();
                break;
            }
            case OPEN_INVENTORY: {
                if (!(this.id_break.ra() instanceof rOD)) break;
                ((rOD)this.id_break.ra()).id_case(this.id_break);
                break;
            }
            case START_FALL_FLYING: {
                if (this.id_break.sw()) break;
                this.id_break.sx();
                break;
            }
            default: {
                throw new IllegalArgumentException("Invalid client command!");
            }
        }
    }

    @Override
    public void id_class(rmq_3 rmq_32) {
        ruZ_2.id_class(rmq_32, this, this.id_break.id_continue());
        this.id_break.id_public();
        this.id_break.id_class(rmq_32.id_break());
    }

    private void id_class(String string) {
        if (this.id_break.id_else() == rhJ_2.HIDDEN) {
            this.id_class(new rZK(new rgn_3("chat.cannotSend").id_class(rgF_2.RED), rVU.SYSTEM, rqR_2.id_break));
        } else {
            this.id_break.id_public();
            for (int i = 0; i < string.length(); ++i) {
                if (rqu_3.id_class(string.charAt(i))) continue;
                this.id_class(new rgn_3("multiplayer.disconnect.illegal_characters"));
                return;
            }
            if (string.startsWith("/")) {
                this.id_break(string);
            } else {
                rgn_3 rgn_32 = new rgn_3("chat.type.text", this.id_break.L_(), string);
                this.id_protected.x().id_class(rgn_32, rVU.CHAT, this.id_break.ro());
            }
            this.id_implements += 20;
            if (this.id_implements > 200 && !this.id_protected.x().id_case(this.id_break.sv())) {
                this.id_class(new rgn_3("disconnect.spam"));
            }
        }
    }

    @Override
    public void id_class(rmK_2 rmK_22) {
        ruZ_2.id_class(rmK_22, this, this.id_break.id_continue());
        this.id_break.id_public();
        if (((rJr_1)this.id_break.id_implements[4]).id_case == rmK_22.id_break() && ((rJr_1)this.id_break.id_implements[4]).id_byte(this.id_break) && !this.id_break.id_native()) {
            ((rJr_1)this.id_break.id_implements[4]).id_break((rhd_3)this.id_break, rmK_22.id_byte());
            ((rJr_1)this.id_break.id_implements[4]).id_native();
        }
    }

    @Override
    public void id_class(rZE rZE2) {
        ruZ_2.id_class(rZE2, this, this.id_break.id_continue());
        this.id_break.id_public();
        if (!this.id_break.id_native() && ((rJr_1)this.id_break.id_implements[4]).id_case == rZE2.id_break() && ((rJr_1)this.id_break.id_implements[4]).id_byte(this.id_break) && (rJr_1)this.id_break.id_implements[4] instanceof rJI) {
            this.id_protected.V().id_class(rZE2.id_byte()).ifPresent(rkw_32 -> ((rJI)((rJr_1)this.id_break.id_implements[4])).id_class(rZE2.id_protected(), (rkw_3<?>)rkw_32, this.id_break));
        }
    }

    @Override
    public void id_class(rmt_3 rmt_32) {
        ruZ_2.id_class(rmt_32, this, this.id_break.id_continue());
        this.id_break.id_public();
        if (((rJr_1)this.id_break.id_implements[4]).id_case == rmt_32.id_break() && ((rJr_1)this.id_break.id_implements[4]).id_byte(this.id_break)) {
            if (this.id_break.id_native()) {
                rqs_3<rdn_3> rqs_32 = rqs_3.id_class();
                for (int i = 0; i < ((rJr_1)this.id_break.id_implements[4]).id_throws.size(); ++i) {
                    rqs_32.add(((rJr_1)this.id_break.id_implements[4]).id_throws.get(i).id_class());
                }
                this.id_break.id_class((rJr_1)this.id_break.id_implements[4], rqs_32);
            } else {
                rdn_3 rdn_32 = ((rJr_1)this.id_break.id_implements[4]).id_class(rmt_32.id_byte(), rmt_32.id_protected(), rmt_32.id_catch(), this.id_break);
                if (rdn_3.id_break(rmt_32.id_case(), rdn_32)) {
                    this.id_break.id_class.id_class(new rvS_2(rmt_32.id_break(), rmt_32.id_throws(), true));
                    this.id_break.id_extends = true;
                    ((rJr_1)this.id_break.id_implements[4]).id_native();
                    this.id_break.id_private();
                    this.id_break.id_extends = false;
                } else {
                    this.id_extends.put(((rJr_1)this.id_break.id_implements[4]).id_case, rmt_32.id_throws());
                    this.id_break.id_class.id_class(new rvS_2(rmt_32.id_break(), rmt_32.id_throws(), false));
                    ((rJr_1)this.id_break.id_implements[4]).id_break((rhd_3)this.id_break, false);
                    rqs_3<rdn_3> rqs_33 = rqs_3.id_class();
                    for (int i = 0; i < ((rJr_1)this.id_break.id_implements[4]).id_throws.size(); ++i) {
                        rdn_3 rdn_33 = ((rJr_1)this.id_break.id_implements[4]).id_throws.get(i).id_class();
                        rqs_33.add(rdn_33.id_class() ? rdn_3.id_break : rdn_33);
                    }
                    this.id_break.id_class((rJr_1)this.id_break.id_implements[4], rqs_33);
                }
            }
        }
    }

    @Override
    public void id_class(rmj_3 rmj_32) {
        ruZ_2.id_class(rmj_32, this, this.id_break.id_continue());
        this.id_break.id_final();
    }

    @Override
    public void id_class(rgP_2 rgP_22, rgP_2 rgP_23) {
        id_byte.info("{} lost connection: {}", (Object)this.id_break.g().getString(), (Object)rgP_23.getString());
        this.id_protected.A();
        this.id_protected.x().id_class(new rgn_3("multiplayer.player.left", this.id_break.L_()).id_class(rgF_2.YELLOW), rVU.SYSTEM, rqR_2.id_break);
        this.id_break.id_package();
        this.id_protected.x().id_byte(this.id_break);
        rgV_2 rgV_22 = this.id_break.O();
        if (rgV_22 != null) {
            rgV_22.id_break();
        }
        if (this.id_protected()) {
            id_byte.info("Stopping singleplayer server as player logged out");
            this.id_protected.id_class(false);
        }
    }

    @Override
    public void id_class(rZF rZF2) {
        ruZ_2.id_class(rZF2, this, this.id_break.id_continue());
        an_3 an_32 = this.id_break.ra();
        if (an_32 instanceof rSK) {
            ((rSK)an_32).id_class(rZF2.id_break(), rZF2.id_byte());
        }
    }

    @Override
    public void id_class(rZQ rZQ2) {
    }

    @Override
    public void id_class(rZd_1 rZd_12) {
        ryZ_2 ryZ_22;
        ruZ_2.id_class(rZd_12, this, this.id_break.id_continue());
        rrEm_1 rrEm_12 = this.id_break.id_continue();
        rpm_3 rpm_32 = rZd_12.id_break();
        rdn_3 rdn_32 = this.id_break.id_protected(rpm_32);
        this.id_break.id_public();
        if (!rdn_32.id_class() && (ryZ_22 = this.id_break.id_finally.id_class(this.id_break, rrEm_12, rdn_32, rpm_32)).id_break()) {
            this.id_break.id_class(rpm_32, true);
        }
    }

    @Override
    public void id_class(rZx_1 rZx_12) {
        ruZ_2.id_class(rZx_12, this, this.id_break.id_continue());
        rrEm_1 rrEm_12 = this.id_break.id_continue();
        rpm_3 rpm_32 = rZx_12.id_break();
        rdn_3 rdn_32 = this.id_break.id_protected(rpm_32);
        rff_3 rff_32 = rZx_12.id_byte();
        rfH_2 rfH_22 = rff_32.id_class();
        rpr_3 rpr_32 = rff_32.id_break();
        this.id_break.id_public();
        if (rfH_22.c_() < this.id_protected.X()) {
            if (this.id_goto == null && this.id_break.id_class((double)rfH_22.b_() + 0.5, (double)rfH_22.c_() + 0.5, (double)rfH_22.d_() + 0.5) < 64.0 && rrEm_12.id_class(this.id_break, rfH_22)) {
                ryZ_2 ryZ_22 = this.id_break.id_finally.id_class(this.id_break, rrEm_12, rdn_32, rpm_32, rff_32);
                if (rpr_32 == rpr_3.UP && !ryZ_22.id_class() && rfH_22.c_() >= this.id_protected.X() - 1 && rmy_3.id_class(this.id_break, rdn_32)) {
                    rVi_1 rVi_12 = new rgn_3("build.tooHigh", this.id_protected.X()).id_class(rgF_2.RED);
                    this.id_break.id_class.id_class(new rZK(rVi_12, rVU.GAME_INFO, rqR_2.id_break));
                } else if (ryZ_22.id_break()) {
                    this.id_break.id_class(rpm_32, true);
                }
            }
        } else {
            rVi_1 rVi_13 = new rgn_3("build.tooHigh", this.id_protected.X()).id_class(rgF_2.RED);
            this.id_break.id_class.id_class(new rZK(rVi_13, rVU.GAME_INFO, rqR_2.id_break));
        }
        this.id_break.id_class.id_class(new rZR(rrEm_12, rfH_22));
        this.id_break.id_class.id_class(new rZR(rrEm_12, rfH_22.id_break(rpr_32)));
    }

    @Override
    public void id_class(rmT_2 rmT_22) {
        String string = StringUtils.normalizeSpace((String)rmT_22.id_break());
        if (string.startsWith("/")) {
            ruZ_2.id_class(rmT_22, this, this.id_break.id_continue());
            this.id_class(string);
        } else {
            this.id_class(string, this::id_class);
        }
    }

    @Override
    public void id_class(rme_3 rme_32) {
        ruZ_2.id_class(rme_32, this, this.id_break.id_continue());
        if (rme_32.id_break() >= 0 && rme_32.id_break() < rhz_3.id_protected()) {
            if (((rhz_3)this.id_break.id_implements[1]).id_protected != rme_32.id_break() && this.id_break.P() == rpm_3.MAIN_HAND) {
                this.id_break.id_throw();
            }
            ((rhz_3)this.id_break.id_implements[1]).id_protected = rme_32.id_break();
            this.id_break.id_public();
        } else {
            id_byte.warn("{} tried to set an invalid carried item", (Object)this.id_break.g().getString());
        }
    }

    public void id_class(ruS_2<?> ruS_22, GenericFutureListener<? extends Future<? super Void>> genericFutureListener) {
        Object object;
        if (ruS_22 instanceof rZK) {
            rZK rZK2 = (rZK)ruS_22;
            object = this.id_break.id_else();
            if (object == rhJ_2.HIDDEN && rZK2.id_protected() != rVU.GAME_INFO) {
                return;
            }
            if (object == rhJ_2.SYSTEM && !rZK2.id_byte()) {
                return;
            }
        }
        try {
            this.id_class.id_class(ruS_22, genericFutureListener);
        }
        catch (Throwable throwable) {
            object = KY.id_class(throwable, "Sending packet");
            Ko_1 ko_1 = ((KY)object).id_class("Packet being sent");
            ko_1.id_class("Packet class", () -> ruS_22.getClass().getCanonicalName());
            throw new KU((KY)object);
        }
    }

    public void id_class(ruS_2<?> ruS_22) {
        this.id_class(ruS_22, (GenericFutureListener<? extends Future<? super Void>>)((GenericFutureListener)null));
    }

    @Override
    public void id_class(rZP rZP2) {
        ruZ_2.id_class(rZP2, this, this.id_break.id_continue());
        if (this.id_break.id_catch(2) || this.id_protected()) {
            this.id_protected.id_break(rZP2.id_break());
        }
    }

    @Override
    public void id_class(rZv_1 rZv_12) {
        ruZ_2.id_class(rZv_12, this, this.id_break.id_continue());
        if (this.id_break.id_native()) {
            for (rrEm_1 rrEm_12 : this.id_protected.id_float()) {
                an_3 an_32 = rZv_12.id_class(rrEm_12);
                if (an_32 == null) continue;
                this.id_break.id_class(rrEm_12, an_32.rx(), an_32.re(), an_32.BO(), ((Float)an_32.id_throws[15]).floatValue(), ((Float)an_32.id_throws[16]).floatValue());
                return;
            }
        }
    }

    @Override
    public void id_class(rZr_1 rZr_12) {
        if (this.id_catch && rZr_12.id_break() == this.id_private) {
            int n = (int)(rqR_2.id_break() - this.id_case);
            this.id_break.id_native = (this.id_break.id_native * 3 + n) / 4;
            this.id_catch = false;
        } else if (!this.id_protected()) {
            this.id_class(new rgn_3("disconnect.timeout"));
        }
    }

    private void id_class(rZy_1 rZy_12, List<String> list) {
        this.id_break.id_public();
        rrEm_1 rrEm_12 = this.id_break.id_continue();
        rfH_2 rfH_22 = rZy_12.id_break();
        if (rrEm_12.id_int(rfH_22)) {
            xc_3 xc_32 = rrEm_12.id_byte(rfH_22);
            ryO_2 ryO_22 = rrEm_12.id_class(rfH_22);
            if (!(ryO_22 instanceof ryS_2)) {
                return;
            }
            ryS_2 ryS_22 = (ryS_2)ryO_22;
            if (!ryS_22.id_throws() || ryS_22.id_catch() != this.id_break) {
                id_byte.warn("Player {} just tried to change non-editable sign", (Object)this.id_break.g().getString());
                return;
            }
            for (int i = 0; i < list.size(); ++i) {
                ryS_22.id_class(i, new rgN_2(list.get(i)));
            }
            ryS_22.id_break();
            rrEm_12.id_class(rfH_22, xc_32, xc_32, 3);
        }
    }

    @Override
    public void id_class(rZy_1 rZy_12) {
        List<String> list2 = Stream.of(rZy_12.id_byte()).map(rgF_2::id_class).collect(Collectors.toList());
        this.id_class(list2, (List<String> list) -> this.id_class(rZy_12, (List<String>)list));
    }

    @Override
    public void id_class(rmg_3 rmg_32) {
        ruZ_2.id_class(rmg_32, this, this.id_break.id_continue());
        int n = ((rJr_1)this.id_break.id_implements[4]).id_case;
        if (n == rmg_32.id_break() && this.id_extends.getOrDefault(n, (short)(rmg_32.id_byte() + 1)) == rmg_32.id_byte() && !((rJr_1)this.id_break.id_implements[4]).id_byte(this.id_break) && !this.id_break.id_native()) {
            ((rJr_1)this.id_break.id_implements[4]).id_break((rhd_3)this.id_break, true);
        }
    }

    @Override
    public void id_class(rmR_2 rmR_22) {
        ruZ_2.id_class(rmR_22, this, this.id_break.id_continue());
        if (this.id_break.id_finally.id_throws()) {
            boolean bl;
            rfH_2 rfH_22;
            ryO_2 ryO_22;
            boolean bl2 = rmR_22.id_break() < 0;
            rdn_3 rdn_32 = rmR_22.id_byte();
            rcd_3 rcd_32 = rdn_32.id_break("BlockEntityTag");
            if (!rdn_32.id_class() && rcd_32 != null && rcd_32.id_throws("x") && rcd_32.id_throws("y") && rcd_32.id_throws("z") && (ryO_22 = ((rYB)this.id_break.id_throws[7]).id_class(rfH_22 = new rfH_2(rcd_32.id_private("x"), rcd_32.id_private("y"), rcd_32.id_private("z")))) != null) {
                rcd_3 rcd_33 = ryO_22.id_class(new rcd_3());
                rcd_33.id_continue("x");
                rcd_33.id_continue("y");
                rcd_33.id_continue("z");
                rdn_32.id_class("BlockEntityTag", rcd_33);
            }
            boolean bl3 = rmR_22.id_break() >= 1 && rmR_22.id_break() <= 45;
            boolean bl4 = bl = rdn_32.id_class() || rdn_32.id_catch() >= 0 && rdn_32.id_char() <= 64 && !rdn_32.id_class();
            if (bl3 && bl) {
                if (rdn_32.id_class()) {
                    ((rJT)this.id_break.id_implements[3]).id_class(rmR_22.id_break(), rdn_3.id_break);
                } else {
                    ((rJT)this.id_break.id_implements[3]).id_class(rmR_22.id_break(), rdn_32);
                }
                ((rJT)this.id_break.id_implements[3]).id_break((rhd_3)this.id_break, true);
                ((rJT)this.id_break.id_implements[3]).id_native();
            } else if (bl2 && bl && this.id_finally < 200) {
                this.id_finally += 20;
                this.id_break.id_class(rdn_32, true);
            }
        }
    }

    @Override
    public void id_class(rZZ rZZ2) {
        ruZ_2.id_class(rZZ2, this, this.id_break.id_continue());
        if (this.id_break.id_catch(2) || this.id_protected()) {
            this.id_protected.id_class(rZZ2.id_break(), false);
        }
    }

    @Override
    public void id_class(rmY_2 rmY_22) {
    }

    @Override
    public void id_class(rmw_3 rmw_32) {
        ruZ_2.id_class(rmw_32, this, this.id_break.id_continue());
        this.id_break.id_class(rmw_32);
    }

    @Override
    public void id_class(rZG rZG2) {
        ruZ_2.id_class(rZG2, this, this.id_break.id_continue());
        ((rhx_3)this.id_break.id_implements[18]).id_break = rZG2.id_break() && ((rhx_3)this.id_break.id_implements[18]).id_byte;
    }

    @Override
    public void id_class(rZn_1 rZn_12) {
        ruZ_2.id_class(rZn_12, this, this.id_break.id_continue());
        if (!this.id_protected.O()) {
            this.id_break.id_class((rgP_2)new rgn_3("advMode.notEnabled"), rqR_2.id_break);
        } else if (!this.id_break.sU()) {
            this.id_break.id_class((rgP_2)new rgn_3("advMode.notAllowed"), rqR_2.id_break);
        } else {
            rHm_1 rHm_12 = null;
            rHZ rHZ2 = null;
            rfH_2 rfH_22 = rZn_12.id_break();
            ryO_2 ryO_22 = ((rYB)this.id_break.id_throws[7]).id_class(rfH_22);
            if (ryO_22 instanceof rHZ) {
                rHZ2 = (rHZ)ryO_22;
                rHm_12 = rHZ2.id_throws();
            }
            String string = rZn_12.id_byte();
            boolean bl = rZn_12.id_protected();
            if (rHm_12 != null) {
                rHF rHF2 = rHZ2.id_final();
                rpr_3 rpr_32 = ((rYB)this.id_break.id_throws[7]).id_byte(rfH_22).id_byte(xK_2.id_volatile);
                switch (rZn_12.id_catch()) {
                    case SEQUENCE: {
                        xc_3 xc_32 = xu_3.bf.id_continue();
                        ((rYB)this.id_break.id_throws[7]).id_class(rfH_22, (xc_3)((xc_3)xc_32.id_class(xK_2.id_volatile, rpr_32)).id_class(xK_2.id_final, rZn_12.id_throws()), 2);
                        break;
                    }
                    case AUTO: {
                        xc_3 xc_33 = xu_3.bI.id_continue();
                        ((rYB)this.id_break.id_throws[7]).id_class(rfH_22, (xc_3)((xc_3)xc_33.id_class(xK_2.id_volatile, rpr_32)).id_class(xK_2.id_final, rZn_12.id_throws()), 2);
                        break;
                    }
                    default: {
                        xc_3 xc_34 = xu_3.SZ.id_continue();
                        ((rYB)this.id_break.id_throws[7]).id_class(rfH_22, (xc_3)((xc_3)xc_34.id_class(xK_2.id_volatile, rpr_32)).id_class(xK_2.id_final, rZn_12.id_throws()), 2);
                    }
                }
                ryO_22.id_int();
                ((rYB)this.id_break.id_throws[7]).id_class(rfH_22, ryO_22);
                rHm_12.id_class(string);
                rHm_12.id_class(bl);
                if (!bl) {
                    rHm_12.id_break((rgP_2)null);
                }
                rHZ2.id_break(rZn_12.id_case());
                if (rHF2 != rZn_12.id_catch()) {
                    rHZ2.id_finally();
                }
                rHm_12.id_break();
                if (!rql_3.id_break(string)) {
                    this.id_break.id_class((rgP_2)new rgn_3("advMode.setCommand.success", string), rqR_2.id_break);
                }
            }
        }
    }

    @Override
    public void id_class(rZL rZL2) {
        ruZ_2.id_class(rZL2, this, this.id_break.id_continue());
        StringReader stringReader = new StringReader(rZL2.id_byte());
        if (stringReader.canRead() && stringReader.peek() == '/') {
            stringReader.skip();
        }
        ParseResults parseResults = this.id_protected.f().id_class().parse(stringReader, (Object)this.id_break.PL());
        this.id_protected.f().id_class().getCompletionSuggestions(parseResults).thenAccept(suggestions -> this.id_class.id_class(new rFQ(rZL2.id_break(), (Suggestions)suggestions)));
    }

    @Override
    public void id_class(rZc_1 rZc_12) {
        ruZ_2.id_class(rZc_12, this, this.id_break.id_continue());
        if (rZc_12.id_byte() == rZu_1.OPENED_TAB) {
            rqO_2 rqO_22 = rZc_12.id_protected();
            OT oT = this.id_protected.t().id_class(rqO_22);
            if (oT != null) {
                this.id_break.r().id_class(oT);
            }
        }
    }

    @Override
    public void id_class(rZH rZH2) {
        ruZ_2.id_class(rZH2, this, this.id_break.id_continue());
        this.id_break.id_float().id_class(rZH2.id_break(), rZH2.id_byte(), rZH2.id_protected());
    }

    @Override
    public void id_class(rZB rZB2) {
        ruZ_2.id_class(rZB2, this, this.id_break.id_continue());
        this.id_protected.V().id_class(rZB2.id_break()).ifPresent(this.id_break.id_float()::id_throws);
    }

    @Override
    public void id_class(rZA rZA2) {
        ruZ_2.id_class(rZA2, this, this.id_break.id_continue());
        if ((rJr_1)this.id_break.id_implements[4] instanceof rXT) {
            ((rXT)((rJr_1)this.id_break.id_implements[4])).id_break(rZA2.id_break(), rZA2.id_byte());
        }
    }

    @Override
    public void id_class(rZz_1 rZz_12) {
        ruZ_2.id_class(rZz_12, this, this.id_break.id_continue());
        if ((rJr_1)this.id_break.id_implements[4] instanceof rJf_1) {
            rJf_1 rJf_12 = (rJf_1)((rJr_1)this.id_break.id_implements[4]);
            String string = rqu_3.id_class(rZz_12.id_break());
            if (string.length() <= 35) {
                rJf_12.id_class(string);
            }
        }
    }

    @Override
    public void id_class(rZs_1 rZs_12) {
        ruZ_2.id_class(rZs_12, this, this.id_break.id_continue());
        ((rhz_3)this.id_break.id_implements[1]).id_class(rZs_12.id_break());
        this.id_break.id_class.id_class(new rFM(-2, ((rhz_3)this.id_break.id_implements[1]).id_protected, ((rhz_3)this.id_break.id_implements[1]).id_extends(((rhz_3)this.id_break.id_implements[1]).id_protected)));
        this.id_break.id_class.id_class(new rFM(-2, rZs_12.id_break(), ((rhz_3)this.id_break.id_implements[1]).id_extends(rZs_12.id_break())));
        this.id_break.id_class.id_class(new rvm_3(((rhz_3)this.id_break.id_implements[1]).id_protected));
    }

    @Override
    public void id_class(rZl_1 rZl_12) {
        ruZ_2.id_class(rZl_12, this, this.id_break.id_continue());
        if (!this.id_protected.O()) {
            this.id_break.id_class((rgP_2)new rgn_3("advMode.notEnabled"), rqR_2.id_break);
        } else if (!this.id_break.sU()) {
            this.id_break.id_class((rgP_2)new rgn_3("advMode.notAllowed"), rqR_2.id_break);
        } else {
            rHm_1 rHm_12 = rZl_12.id_class((rYB)this.id_break.id_throws[7]);
            if (rHm_12 != null) {
                rHm_12.id_class(rZl_12.id_break());
                rHm_12.id_class(rZl_12.id_byte());
                if (!rZl_12.id_byte()) {
                    rHm_12.id_break((rgP_2)null);
                }
                rHm_12.id_break();
                this.id_break.id_class((rgP_2)new rgn_3("advMode.setCommand.success", rZl_12.id_break()), rqR_2.id_break);
            }
        }
    }

    private void id_class(List<String> list, Consumer<List<String>> consumer) {
        this.id_class(list, consumer, rgV_2::id_class);
    }

    private void id_class(String string, Consumer<String> consumer) {
        this.id_class(string, consumer, rgV_2::id_class);
    }

    private <T> void id_class(T t, Consumer<T> consumer, BiFunction<rgV_2, T, CompletableFuture<Optional<T>>> biFunction) {
        rnW_2 rnW_22 = this.id_break.id_continue().id_const();
        Consumer<Object> consumer2 = object -> {
            if (this.id_class().id_case()) {
                consumer.accept(object);
            } else {
                id_byte.debug("Ignoring packet due to disconnection");
            }
        };
        rgV_2 rgV_22 = this.id_break.O();
        if (rgV_22 != null) {
            biFunction.apply(rgV_22, (rgV_2)t).thenAcceptAsync(optional -> optional.ifPresent(consumer2), (Executor)rnW_22);
        } else {
            rnW_22.execute(() -> consumer2.accept(t));
        }
    }

    public void id_class(rgP_2 rgP_22) {
        this.id_class.id_class(new rvb_3(rgP_22), (GenericFutureListener<? extends Future<? super Void>>)((GenericFutureListener)future -> this.id_class.id_class(rgP_22)));
        this.id_class.id_extends();
        this.id_protected.id_catch(this.id_class::id_native);
    }

    @Override
    public rud_3 id_class() {
        return this.id_class;
    }

    @Override
    public void id_class(rmV_2 rmV_22) {
        ruZ_2.id_class(rmV_22, this, this.id_break.id_continue());
        if (rmV_22.id_break() == this.id_while) {
            this.id_break.id_break(this.id_goto.id_break, this.id_goto.id_byte, this.id_goto.id_protected, ((Float)this.id_break.id_throws[15]).floatValue(), ((Float)this.id_break.id_throws[16]).floatValue());
            this.id_package = this.id_goto.id_break;
            this.id_int = this.id_goto.id_byte;
            this.id_new = this.id_goto.id_protected;
            if (this.id_break.id_for()) {
                this.id_break.id_double();
            }
            this.id_goto = null;
        }
    }

    private boolean id_class(an_3 an_32) {
        return ((rYB)an_32.id_throws[7]).id_class(an_32.rN().id_class(0.0625).id_break(0.0, -0.55, 0.0)).allMatch(JC::id_catch);
    }

    @Override
    public void id_class(rZS rZS2) {
        ruZ_2.id_class(rZS2, this, this.id_break.id_continue());
        if (rmy_3.id_break(rZS2)) {
            this.id_class(new rgn_3("multiplayer.disconnect.invalid_vehicle_movement"));
        } else {
            an_3 an_32 = this.id_break.PO();
            if (an_32 != this.id_break && an_32.rU() == this.id_break && an_32 == this.id_continue) {
                rrEm_1 rrEm_12 = this.id_break.id_continue();
                double d = an_32.rx();
                double d2 = an_32.re();
                double d3 = an_32.BO();
                double d4 = rZS2.id_break();
                double d5 = rZS2.id_byte();
                double d6 = rZS2.id_protected();
                float f = rZS2.id_throws();
                float f2 = rZS2.id_case();
                double d7 = d4 - this.id_super;
                double d8 = d5 - this.id_this;
                double d9 = d6 - this.id_else;
                double d10 = d7 * d7 + d8 * d8 + d9 * d9;
                double d11 = an_32.rv().id_catch();
                if (d10 - d11 > 100.0 && !this.id_protected()) {
                    id_byte.warn("{} (vehicle of {}) moved too quickly! {},{},{}", (Object)an_32.g().getString(), (Object)this.id_break.g().getString(), (Object)d7, (Object)d8, (Object)d9);
                    this.id_class.id_class(new rvn_3(an_32));
                    return;
                }
                boolean bl = rrEm_12.a_(an_32, an_32.rN().id_break(0.0625));
                d7 = d4 - this.id_synchronized;
                d8 = d5 - this.id_return - 1.0E-6;
                d9 = d6 - this.id_public;
                an_32.id_class(iG_2.PLAYER, new rjU_2(d7, d8, d9));
                d7 = d4 - an_32.rx();
                d8 = d5 - an_32.re();
                if (d8 > -0.5 || d8 < 0.5) {
                    d8 = 0.0;
                }
                d9 = d6 - an_32.BO();
                d10 = d7 * d7 + d8 * d8 + d9 * d9;
                boolean bl2 = false;
                if (d10 > 0.0625) {
                    bl2 = true;
                    id_byte.warn("{} (vehicle of {}) moved wrongly! {}", (Object)an_32.g().getString(), (Object)this.id_break.g().getString(), (Object)Math.sqrt(d10));
                }
                an_32.id_break(d4, d5, d6, f, f2);
                boolean bl3 = rrEm_12.a_(an_32, an_32.rN().id_break(0.0625));
                if (bl && (bl2 || !bl3)) {
                    an_32.id_break(d, d2, d3, f, f2);
                    this.id_class.id_class(new rvn_3(an_32));
                    return;
                }
                this.id_break.id_continue().id_else().id_class(this.id_break);
                this.id_break.id_continue(this.id_break.rx() - d, this.id_break.re() - d2, this.id_break.BO() - d3);
                this.id_interface = d8 >= -0.03125 && !this.id_protected.M() && this.id_class(an_32);
                this.id_synchronized = an_32.rx();
                this.id_return = an_32.re();
                this.id_public = an_32.BO();
            }
        }
    }

    @Override
    public void id_class(rma_3 rma_32) {
        ruZ_2.id_class(rma_32, this, this.id_break.id_continue());
        this.id_break.id_class(rma_32.id_break(), rma_32.id_byte(), rma_32.id_protected(), rma_32.id_throws());
    }

    private static boolean id_class(rhN_2 rhN_22, rdn_3 rdn_32) {
        if (rdn_32.id_class()) {
            return false;
        }
        rdb_3 rdb_32 = rdn_32.id_break();
        return (rdb_32 instanceof rxJ_2 || rdb_32 instanceof rxN_2) && !rhN_22.sK().id_class(rdb_32);
    }

    @Override
    public void id_class(rZO rZO2) {
        ruZ_2.id_class(rZO2, this, this.id_break.id_continue());
        if (rmy_3.id_break(rZO2)) {
            this.id_class(new rgn_3("multiplayer.disconnect.invalid_player_movement"));
        } else {
            rrEm_1 rrEm_12 = this.id_break.id_continue();
            if (!this.id_break.id_volatile) {
                if (this.id_throws == 0) {
                    this.id_byte();
                }
                if (this.id_goto != null) {
                    if (this.id_throws - this.id_try > 20) {
                        this.id_try = this.id_throws;
                        this.id_class(this.id_goto.id_break, this.id_goto.id_byte, this.id_goto.id_protected, ((Float)this.id_break.id_throws[15]).floatValue(), ((Float)this.id_break.id_throws[16]).floatValue());
                    }
                } else {
                    this.id_try = this.id_throws;
                    if (this.id_break.Pm()) {
                        this.id_break.id_break(this.id_break.rx(), this.id_break.re(), this.id_break.BO(), rZO2.id_class(((Float)this.id_break.id_throws[15]).floatValue()), rZO2.id_break(((Float)this.id_break.id_throws[16]).floatValue()));
                        this.id_break.id_continue().id_else().id_class(this.id_break);
                    } else {
                        double d = this.id_break.rx();
                        double d2 = this.id_break.re();
                        double d3 = this.id_break.BO();
                        double d4 = this.id_break.re();
                        double d5 = rZO2.id_class(this.id_break.rx());
                        double d6 = rZO2.id_break(this.id_break.re());
                        double d7 = rZO2.id_byte(this.id_break.BO());
                        float f = rZO2.id_class(((Float)this.id_break.id_throws[15]).floatValue());
                        float f2 = rZO2.id_break(((Float)this.id_break.id_throws[16]).floatValue());
                        double d8 = d5 - this.id_native;
                        double d9 = d6 - this.id_volatile;
                        double d10 = d7 - this.id_final;
                        double d11 = this.id_break.rv().id_catch();
                        double d12 = d8 * d8 + d9 * d9 + d10 * d10;
                        if (this.id_break.Sc()) {
                            if (d12 > 1.0) {
                                this.id_class(this.id_break.rx(), this.id_break.re(), this.id_break.BO(), rZO2.id_class(((Float)this.id_break.id_throws[15]).floatValue()), rZO2.id_break(((Float)this.id_break.id_throws[16]).floatValue()));
                            }
                        } else {
                            boolean bl;
                            ++this.id_abstract;
                            int n = this.id_abstract - this.id_long;
                            if (n > 5) {
                                id_byte.debug("{} is sending move packets too frequently ({} packets since last tick)", (Object)this.id_break.g().getString(), (Object)n);
                                n = 1;
                            }
                            if (!(this.id_break.id_for() || this.id_break.id_continue().B().id_break(rRu_1.id_continue) && this.id_break.Sy())) {
                                float f3;
                                float f4 = f3 = this.id_break.Sy() ? 300.0f : 100.0f;
                                if (d12 - d11 > (double)(f3 * (float)n) && !this.id_protected()) {
                                    id_byte.warn("{} moved too quickly! {},{},{}", (Object)this.id_break.g().getString(), (Object)d8, (Object)d9, (Object)d10);
                                    this.id_class(this.id_break.rx(), this.id_break.re(), this.id_break.BO(), ((Float)this.id_break.id_throws[15]).floatValue(), ((Float)this.id_break.id_throws[16]).floatValue());
                                    return;
                                }
                            }
                            rfl_3 rfl_32 = this.id_break.rN();
                            d8 = d5 - this.id_package;
                            d9 = d6 - this.id_int;
                            d10 = d7 - this.id_new;
                            boolean bl2 = bl = d9 > 0.0;
                            if (this.id_break.BL() && !rZO2.id_break() && bl) {
                                this.id_break.sl();
                            }
                            this.id_break.id_class(iG_2.PLAYER, new rjU_2(d8, d9, d10));
                            d8 = d5 - this.id_break.rx();
                            d9 = d6 - this.id_break.re();
                            if (d9 > -0.5 || d9 < 0.5) {
                                d9 = 0.0;
                            }
                            d10 = d7 - this.id_break.BO();
                            d12 = d8 * d8 + d9 * d9 + d10 * d10;
                            boolean bl3 = false;
                            if (!this.id_break.id_for() && d12 > 0.0625 && !this.id_break.Sc() && !this.id_break.id_finally.id_throws() && this.id_break.id_finally.id_break() != rRl_1.SPECTATOR) {
                                bl3 = true;
                                id_byte.warn("{} moved wrongly!", (Object)this.id_break.g().getString());
                            }
                            this.id_break.id_break(d5, d6, d7, f, f2);
                            boolean bl4 = (Boolean)this.id_break.id_throws[38];
                            if (bl4 || this.id_break.Sc() || (!bl3 || !rrEm_12.a_(this.id_break, rfl_32)) && !this.id_class(rrEm_12, rfl_32)) {
                                this.id_instanceof = d9 >= -0.03125 && this.id_break.id_finally.id_break() != rRl_1.SPECTATOR && !this.id_protected.M() && !((rhx_3)this.id_break.id_implements[18]).id_byte && !this.id_break.id_break(rLD.id_goto) && !this.id_break.Sy() && this.id_class(this.id_break);
                                this.id_break.id_continue().id_else().id_class(this.id_break);
                                this.id_break.id_class(this.id_break.re() - d4, rZO2.id_break());
                                this.id_break.id_int(rZO2.id_break());
                                if (bl) {
                                    Float f5 = Float.valueOf(0.0f);
                                    this.id_break.id_throws[31] = f5;
                                }
                                this.id_break.id_continue(this.id_break.rx() - d, this.id_break.re() - d2, this.id_break.BO() - d3);
                                this.id_package = this.id_break.rx();
                                this.id_int = this.id_break.re();
                                this.id_new = this.id_break.BO();
                            } else {
                                this.id_class(d, d2, d3, f, f2);
                            }
                        }
                    }
                }
            }
        }
    }

    @Override
    public void id_class(rZW rZW2) {
        ruZ_2.id_class(rZW2, this, this.id_break.id_continue());
        if (this.id_break.id_catch(2)) {
            ryO_2 ryO_22 = this.id_break.id_continue().id_class(rZW2.id_byte());
            rcd_3 rcd_32 = ryO_22 != null ? ryO_22.id_class(new rcd_3()) : null;
            this.id_break.id_class.id_class(new rve_3(rZW2.id_break(), rcd_32));
        }
    }

    @Override
    public void id_class(rZk_1 rZk_12) {
        an_3 an_32;
        ruZ_2.id_class(rZk_12, this, this.id_break.id_continue());
        if (this.id_break.id_catch(2) && (an_32 = this.id_break.id_continue().id_break(rZk_12.id_byte())) != null) {
            rcd_3 rcd_32 = an_32.id_case(new rcd_3());
            this.id_break.id_class.id_class(new rve_3(rZk_12.id_break(), rcd_32));
        }
    }

    @Override
    public void id_class(rZb_1 rZb_12) {
        ruZ_2.id_class(rZb_12, this, this.id_break.id_continue());
        rfH_2 rfH_22 = rZb_12.id_break();
        this.id_break.id_public();
        rZM rZM2 = rZb_12.id_protected();
        switch (rZM2) {
            case SWAP_ITEM_WITH_OFFHAND: {
                if (!this.id_break.id_native()) {
                    rdn_3 rdn_32 = this.id_break.id_protected(rpm_3.OFF_HAND);
                    this.id_break.id_class(rpm_3.OFF_HAND, this.id_break.id_protected(rpm_3.MAIN_HAND));
                    this.id_break.id_class(rpm_3.MAIN_HAND, rdn_32);
                    this.id_break.id_throw();
                }
                return;
            }
            case DROP_ITEM: {
                if (!this.id_break.id_native()) {
                    this.id_break.id_protected(false);
                }
                return;
            }
            case DROP_ALL_ITEMS: {
                if (!this.id_break.id_native()) {
                    this.id_break.id_protected(true);
                }
                return;
            }
            case RELEASE_USE_ITEM: {
                this.id_break.SC();
                return;
            }
            case START_DESTROY_BLOCK: 
            case ABORT_DESTROY_BLOCK: 
            case STOP_DESTROY_BLOCK: {
                this.id_break.id_finally.id_class(rfH_22, rZM2, rZb_12.id_byte(), this.id_protected.X());
                return;
            }
        }
        throw new IllegalArgumentException("Invalid player action");
    }

    public void id_class(double d, double d2, double d3, float f, float f2, Set<rvU_2> set) {
        double d4 = set.contains((Object)rvU_2.X) ? this.id_break.rx() : 0.0;
        double d5 = set.contains((Object)rvU_2.Y) ? this.id_break.re() : 0.0;
        double d6 = set.contains((Object)rvU_2.Z) ? this.id_break.BO() : 0.0;
        float f3 = set.contains((Object)rvU_2.Y_ROT) ? ((Float)this.id_break.id_throws[15]).floatValue() : 0.0f;
        float f4 = set.contains((Object)rvU_2.X_ROT) ? ((Float)this.id_break.id_throws[16]).floatValue() : 0.0f;
        this.id_goto = new rjU_2(d, d2, d3);
        if (++this.id_while == Integer.MAX_VALUE) {
            this.id_while = 0;
        }
        this.id_try = this.id_throws;
        this.id_break.id_break(d, d2, d3, f, f2);
        this.id_break.id_class.id_class(new rvD_2(d - d4, d2 - d5, d3 - d6, f - f3, f2 - f4, set, this.id_while));
    }

    public void id_class(double d, double d2, double d3, float f, float f2) {
        this.id_class(d, d2, d3, f, f2, Collections.emptySet());
    }

    private boolean id_class(rRR rRR2, rfl_3 rfl_32) {
        Stream<rjC_2> stream = rRR2.id_byte(this.id_break, this.id_break.rN().id_break(1.0E-5f), an_32 -> true);
        rjC_2 rjC_22 = rjw_3.id_class(rfl_32.id_break(1.0E-5f));
        return stream.anyMatch(rjC_23 -> !rjw_3.id_byte(rjC_23, rjC_22, rjN_2.id_implements));
    }

    @Override
    public void id_class(rmo_3 rmo_32) {
        rcd_3 rcd_32;
        rdn_3 rdn_32 = rmo_32.id_break();
        if (rdn_32.id_break() == rdy_3.xi && rkm_3.id_class(rcd_32 = rdn_32.id_package())) {
            int n;
            ArrayList arrayList = Lists.newArrayList();
            boolean bl = rmo_32.id_byte();
            if (bl) {
                arrayList.add(rcd_32.id_native("title"));
            }
            rcy_3 rcy_32 = rcd_32.id_protected("pages", 8);
            for (n = 0; n < rcy_32.size(); ++n) {
                arrayList.add(rcy_32.id_implements(n));
            }
            n = rmo_32.id_protected();
            if (rhz_3.id_break(n) || n == 40) {
                this.id_class((List<String>)arrayList, bl ? list -> this.id_class((String)list.get(0), list.subList(1, list.size()), n) : list -> this.id_class((List<String>)list, n));
            }
        }
    }

    @Override
    public void id_class(rZp_1 rZp_12) {
        ruZ_2.id_class(rZp_12, this, this.id_break.id_continue());
        if (this.id_break.sU()) {
            rfH_2 rfH_22 = rZp_12.id_break();
            xc_3 xc_32 = ((rYB)this.id_break.id_throws[7]).id_byte(rfH_22);
            ryO_2 ryO_22 = ((rYB)this.id_break.id_throws[7]).id_class(rfH_22);
            if (ryO_22 instanceof ryG_2) {
                ryG_2 ryG_22 = (ryG_2)ryO_22;
                ryG_22.id_class(rZp_12.id_protected());
                ryG_22.id_class(rZp_12.id_throws());
                ryG_22.id_class(rZp_12.id_case());
                ryG_22.id_break(rZp_12.id_catch());
                ryG_22.id_class(rZp_12.id_private());
                ryG_22.id_class(rZp_12.id_implements());
                ryG_22.id_break(rZp_12.id_finally());
                ryG_22.id_class(rZp_12.id_extends());
                ryG_22.id_protected(rZp_12.id_native());
                ryG_22.id_throws(rZp_12.id_volatile());
                ryG_22.id_class(rZp_12.id_final());
                ryG_22.id_class(rZp_12.id_package());
                if (ryG_22.id_private()) {
                    String string = ryG_22.id_throws();
                    if (rZp_12.id_byte() == ryM_2.SAVE_AREA) {
                        if (ryG_22.id_synchronized()) {
                            this.id_break.id_class((rgP_2)new rgn_3("structure_block.save_success", string), false);
                        } else {
                            this.id_break.id_class((rgP_2)new rgn_3("structure_block.save_failure", string), false);
                        }
                    } else if (rZp_12.id_byte() == ryM_2.LOAD_AREA) {
                        if (!ryG_22.id_public()) {
                            this.id_break.id_class((rgP_2)new rgn_3("structure_block.load_not_found", string), false);
                        } else if (ryG_22.id_class(this.id_break.id_continue())) {
                            this.id_break.id_class((rgP_2)new rgn_3("structure_block.load_success", string), false);
                        } else {
                            this.id_break.id_class((rgP_2)new rgn_3("structure_block.load_prepare", string), false);
                        }
                    } else if (rZp_12.id_byte() == ryM_2.SCAN_AREA) {
                        if (ryG_22.id_else()) {
                            this.id_break.id_class((rgP_2)new rgn_3("structure_block.size_success", string), false);
                        } else {
                            this.id_break.id_class((rgP_2)new rgn_3("structure_block.size_failure"), false);
                        }
                    }
                } else {
                    this.id_break.id_class((rgP_2)new rgn_3("structure_block.invalid_structure_name", rZp_12.id_throws()), false);
                }
                ryG_22.id_break();
                ((rYB)this.id_break.id_throws[7]).id_class(rfH_22, xc_32, xc_32, 3);
            }
        }
    }

    @Override
    public void id_class(rZm_1 rZm_12) {
        ruZ_2.id_class(rZm_12, this, this.id_break.id_continue());
        int n = rZm_12.id_break();
        rJr_1 rJr_12 = (rJr_1)this.id_break.id_implements[4];
        if (rJr_12 instanceof rJp_1) {
            rJp_1 rJp_12 = (rJp_1)rJr_12;
            rJp_12.id_protected(n);
            rJp_12.id_catch(n);
        }
    }

    @Override
    public void id_class(rZC rZC2) {
        ruZ_2.id_class(rZC2, this, this.id_break.id_continue());
        if (this.id_break.sU()) {
            rfH_2 rfH_22 = rZC2.id_break();
            xc_3 xc_32 = ((rYB)this.id_break.id_throws[7]).id_byte(rfH_22);
            ryO_2 ryO_22 = ((rYB)this.id_break.id_throws[7]).id_class(rfH_22);
            if (ryO_22 instanceof rHj_1) {
                rHj_1 rHj_12 = (rHj_1)ryO_22;
                rHj_12.id_class(rZC2.id_byte());
                rHj_12.id_break(rZC2.id_protected());
                rHj_12.id_byte(rZC2.id_throws());
                rHj_12.id_class(rZC2.id_case());
                rHj_12.id_class(rZC2.id_catch());
                rHj_12.id_break();
                ((rYB)this.id_break.id_throws[7]).id_class(rfH_22, xc_32, xc_32, 3);
            }
        }
    }

    @Override
    public void id_class(rmi_3 rmi_32) {
        rfH_2 rfH_22;
        ryO_2 ryO_22;
        ruZ_2.id_class(rmi_32, this, this.id_break.id_continue());
        if (this.id_break.sU() && (ryO_22 = ((rYB)this.id_break.id_throws[7]).id_class(rfH_22 = rmi_32.id_break())) instanceof rHj_1) {
            rHj_1 rHj_12 = (rHj_1)ryO_22;
            rHj_12.id_class(this.id_break.id_continue(), rmi_32.id_byte(), rmi_32.id_protected());
        }
    }

    private void id_class(String string, List<String> list, int n) {
        rdn_3 rdn_32 = ((rhz_3)this.id_break.id_implements[1]).id_extends(n);
        if (rdn_32.id_break() == rdy_3.xi) {
            rdn_3 rdn_33 = new rdn_3(rdy_3.dr);
            rcd_3 rcd_32 = rdn_32.id_package();
            if (rcd_32 != null) {
                rdn_33.id_byte(rcd_32.id_catch());
            }
            rdn_33.id_class("author", rca_3.id_class(this.id_break.g().getString()));
            rdn_33.id_class("title", rca_3.id_class(string));
            rcy_3 rcy_32 = new rcy_3();
            for (String string2 : list) {
                rgN_2 rgN_22 = new rgN_2(string2);
                String string3 = rgB_2.id_class(rgN_22);
                rcy_32.add(rca_3.id_class(string3));
            }
            rdn_33.id_class("pages", rcy_32);
            ((rhz_3)this.id_break.id_implements[1]).id_break(n, rdn_33);
        }
    }

    private void id_class(List<String> list, int n) {
        rdn_3 rdn_32 = ((rhz_3)this.id_break.id_implements[1]).id_extends(n);
        if (rdn_32.id_break() == rdy_3.xi) {
            rcy_3 rcy_32 = new rcy_3();
            list.stream().map(rca_3::id_class).forEach(rcy_32::add);
            rdn_32.id_class("pages", rcy_32);
        }
    }

    public void id_break() {
        long l;
        this.id_byte();
        Double d = this.id_break.rx();
        this.id_break.id_throws[8] = d;
        Double d2 = this.id_break.re();
        this.id_break.id_throws[9] = d2;
        Double d3 = this.id_break.BO();
        this.id_break.id_throws[10] = d3;
        this.id_break.id_catch();
        this.id_break.id_break(this.id_native, this.id_volatile, this.id_final, ((Float)this.id_break.id_throws[15]).floatValue(), ((Float)this.id_break.id_throws[16]).floatValue());
        ++this.id_throws;
        this.id_long = this.id_abstract;
        if (this.id_instanceof && !this.id_break.Sc()) {
            if (++this.id_throw > 80) {
                id_byte.warn("{} was kicked for floating too long!", (Object)this.id_break.g().getString());
                this.id_class(new rgn_3("multiplayer.disconnect.flying"));
                return;
            }
        } else {
            this.id_instanceof = false;
            this.id_throw = 0;
        }
        this.id_continue = this.id_break.PO();
        if (this.id_continue != this.id_break && this.id_continue.rU() == this.id_break) {
            this.id_super = this.id_continue.rx();
            this.id_this = this.id_continue.re();
            this.id_else = this.id_continue.BO();
            this.id_synchronized = this.id_continue.rx();
            this.id_return = this.id_continue.re();
            this.id_public = this.id_continue.BO();
            if (this.id_interface && this.id_break.PO().rU() == this.id_break) {
                if (++this.id_char > 80) {
                    id_byte.warn("{} was kicked for floating a vehicle too long!", (Object)this.id_break.g().getString());
                    this.id_class(new rgn_3("multiplayer.disconnect.flying"));
                    return;
                }
            } else {
                this.id_interface = false;
                this.id_char = 0;
            }
        } else {
            this.id_continue = null;
            this.id_interface = false;
            this.id_char = 0;
        }
        if ((l = rqR_2.id_break()) - this.id_case >= 15000L) {
            if (this.id_catch) {
                this.id_class(new rgn_3("disconnect.timeout"));
            } else {
                this.id_catch = true;
                this.id_case = l;
                this.id_private = l;
                this.id_class(new rvv_3(this.id_private));
            }
        }
        if (this.id_implements > 0) {
            --this.id_implements;
        }
        if (this.id_finally > 0) {
            --this.id_finally;
        }
        if (this.id_break.id_short() > 0L && this.id_protected.m() > 0 && rqR_2.id_break() - this.id_break.id_short() > (long)(this.id_protected.m() * 1000 * 60)) {
            this.id_class(new rgn_3("multiplayer.disconnect.idling"));
        }
    }

    private void id_break(String string) {
        this.id_protected.f().id_class(this.id_break.PL(), string);
    }

    private static boolean id_break(rZS rZS2) {
        return !Doubles.isFinite((double)rZS2.id_break()) || !Doubles.isFinite((double)rZS2.id_byte()) || !Doubles.isFinite((double)rZS2.id_protected()) || !Floats.isFinite((float)rZS2.id_case()) || !Floats.isFinite((float)rZS2.id_throws());
    }

    private static boolean id_break(rZO rZO2) {
        if (Doubles.isFinite((double)rZO2.id_class(0.0)) && Doubles.isFinite((double)rZO2.id_break(0.0)) && Doubles.isFinite((double)rZO2.id_byte(0.0)) && Floats.isFinite((float)rZO2.id_break(0.0f)) && Floats.isFinite((float)rZO2.id_class(0.0f))) {
            return Math.abs(rZO2.id_class(0.0)) > 3.0E7 || Math.abs(rZO2.id_break(0.0)) > 3.0E7 || Math.abs(rZO2.id_byte(0.0)) > 3.0E7;
        }
        return true;
    }

    private boolean id_protected() {
        return this.id_protected.id_break(this.id_break.sv());
    }
}

