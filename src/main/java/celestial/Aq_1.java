/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 *  com.google.common.collect.Multimap
 *  com.google.common.collect.Sets
 *  com.mojang.authlib.GameProfile
 *  com.mojang.brigadier.CommandDispatcher
 *  com.viaversion.viaversion.api.protocol.version.ProtocolVersion
 *  io.netty.buffer.Unpooled
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package celestial;

import celestial.AO;
import celestial.AQ;
import celestial.AX;
import celestial.Ab_1;
import celestial.Ak_1;
import celestial.At_1;
import celestial.Aw_1;
import celestial.Ax_1;
import celestial.Az_1;
import celestial.CN;
import celestial.C_break;
import celestial.Cy_1;
import celestial.Fl_1;
import celestial.Fv_1;
import celestial.Hh_1;
import celestial.NE;
import celestial.NF;
import celestial.NG;
import celestial.NN;
import celestial.NQ;
import celestial.Nb_1;
import celestial.Nk_1;
import celestial.Np_1;
import celestial.OT;
import celestial.QY;
import celestial.Qn_1;
import celestial.Qw_1;
import celestial.VR;
import celestial.Vo_1;
import celestial.ZG;
import celestial.ZS;
import celestial.Zb_1;
import celestial.Zs_1;
import celestial.aI_2;
import celestial.aZ_2;
import celestial.an_3;
import celestial.cM_2;
import celestial.cb_3;
import celestial.cg_3;
import celestial.cq_3;
import celestial.ct_3;
import celestial.cy_3;
import celestial.ex_3;
import celestial.gG_2;
import celestial.gJ_2;
import celestial.gR_2;
import celestial.gm_3;
import celestial.gv_3;
import celestial.iB_2;
import celestial.ic_3;
import celestial.ik_3;
import celestial.is_3;
import celestial.ix_3;
import celestial.mB_2;
import celestial.mG_2;
import celestial.mT_2;
import celestial.ml_3;
import celestial.ms_3;
import celestial.pG_2;
import celestial.pS_2;
import celestial.pb_3;
import celestial.px_3;
import celestial.rAZ;
import celestial.rAa_1;
import celestial.rAi_1;
import celestial.rCi_1;
import celestial.rEI;
import celestial.rFA;
import celestial.rFB;
import celestial.rFC;
import celestial.rFE;
import celestial.rFG;
import celestial.rFH;
import celestial.rFJ;
import celestial.rFM;
import celestial.rFN;
import celestial.rFO;
import celestial.rFP;
import celestial.rFQ;
import celestial.rFS;
import celestial.rFT;
import celestial.rFW;
import celestial.rFX;
import celestial.rFZ;
import celestial.rFb_1;
import celestial.rFc_1;
import celestial.rFd_1;
import celestial.rFh_1;
import celestial.rFj_1;
import celestial.rFk_1;
import celestial.rFl_1;
import celestial.rFm_1;
import celestial.rFn_1;
import celestial.rFp_1;
import celestial.rFq_1;
import celestial.rFr_1;
import celestial.rFs_1;
import celestial.rFt_1;
import celestial.rFu_1;
import celestial.rFv_1;
import celestial.rFw_1;
import celestial.rFx_1;
import celestial.rFy_1;
import celestial.rFz_1;
import celestial.rHA;
import celestial.rHJ;
import celestial.rHO;
import celestial.rHU;
import celestial.rHZ;
import celestial.rHb_1;
import celestial.rHc_1;
import celestial.rHj_1;
import celestial.rHx_1;
import celestial.rHy_1;
import celestial.rJQ;
import celestial.rJT;
import celestial.rJp_1;
import celestial.rJr_1;
import celestial.rLC;
import celestial.rLQ;
import celestial.rLR;
import celestial.rLY;
import celestial.rOD;
import celestial.rRJ;
import celestial.rRO;
import celestial.rRW;
import celestial.rRl_1;
import celestial.rRo_1;
import celestial.rSK;
import celestial.rSY;
import celestial.rSa_1;
import celestial.rSg_1;
import celestial.rSi_1;
import celestial.rSm_1;
import celestial.rSu_1;
import celestial.rVL;
import celestial.rVm_1;
import celestial.rWB;
import celestial.rXA;
import celestial.rXQ;
import celestial.rYB;
import celestial.rYZ;
import celestial.rZD;
import celestial.rZI;
import celestial.rZK;
import celestial.rZN;
import celestial.rZQ;
import celestial.rZR;
import celestial.rZS;
import celestial.rZU;
import celestial.rZV;
import celestial.rZX;
import celestial.rZY;
import celestial.rZa_1;
import celestial.rZe_1;
import celestial.rZf_1;
import celestial.rZg_1;
import celestial.rZj_1;
import celestial.rZo_1;
import celestial.rZr_1;
import celestial.rbF_2;
import celestial.rcd_3;
import celestial.rdX_2;
import celestial.rdf_3;
import celestial.rdn_3;
import celestial.rdy_3;
import celestial.rfH_2;
import celestial.rfU_2;
import celestial.rfi_3;
import celestial.rfj_3;
import celestial.rgN_2;
import celestial.rgP_2;
import celestial.rgn_3;
import celestial.rhA_2;
import celestial.rhC_2;
import celestial.rhD_2;
import celestial.rhF_2;
import celestial.rhH_2;
import celestial.rhI_2;
import celestial.rhR_2;
import celestial.rhU_2;
import celestial.rhY_2;
import celestial.rhd_3;
import celestial.rhg_3;
import celestial.rhl_3;
import celestial.rhm_3;
import celestial.rhn_3;
import celestial.rho_3;
import celestial.rhp_3;
import celestial.rhw_3;
import celestial.rhx_3;
import celestial.rhy_3;
import celestial.rhz_3;
import celestial.rjU_2;
import celestial.rjh_3;
import celestial.rkw_3;
import celestial.rlA_2;
import celestial.rlP_2;
import celestial.rlQ_2;
import celestial.rmG_2;
import celestial.rmI_2;
import celestial.rmV_2;
import celestial.rmY_2;
import celestial.rmf_3;
import celestial.rmg_3;
import celestial.rnB_2;
import celestial.rnP_2;
import celestial.rnX_2;
import celestial.rnh_3;
import celestial.rns_3;
import celestial.roH_2;
import celestial.roJ_2;
import celestial.rpm_3;
import celestial.rpr_3;
import celestial.rqL_2;
import celestial.rqM_2;
import celestial.rqO_2;
import celestial.rqP_2;
import celestial.rqn_3;
import celestial.rrAG;
import celestial.rrAH;
import celestial.rrAl_1;
import celestial.rrGb_1;
import celestial.rrLA;
import celestial.rrLL;
import celestial.rrLN;
import celestial.rrLQ;
import celestial.rrLf_1;
import celestial.rrLn_1;
import celestial.rrQX;
import celestial.rrfZ_2;
import celestial.rrjA_2;
import celestial.rrnO_2;
import celestial.rrse_3;
import celestial.rrvL;
import celestial.rsB_2;
import celestial.rsE_2;
import celestial.rsG_2;
import celestial.rsJ_2;
import celestial.rsM_2;
import celestial.rsN_2;
import celestial.rsO_2;
import celestial.rsP_2;
import celestial.rsW_2;
import celestial.rsX_2;
import celestial.rsc_3;
import celestial.rsk_3;
import celestial.rsm_3;
import celestial.rsr_3;
import celestial.rsu_3;
import celestial.rsv_3;
import celestial.ruS_2;
import celestial.ruZ_2;
import celestial.rud_3;
import celestial.ruu_3;
import celestial.rvA_2;
import celestial.rvC_2;
import celestial.rvD_2;
import celestial.rvE_2;
import celestial.rvF_2;
import celestial.rvG_2;
import celestial.rvH_2;
import celestial.rvI_2;
import celestial.rvJ_2;
import celestial.rvK_2;
import celestial.rvL_2;
import celestial.rvM_2;
import celestial.rvN_2;
import celestial.rvO_2;
import celestial.rvP_2;
import celestial.rvQ_2;
import celestial.rvS_2;
import celestial.rvT_2;
import celestial.rvU_2;
import celestial.rvV_2;
import celestial.rvW_2;
import celestial.rvX_2;
import celestial.rvY_2;
import celestial.rvZ_2;
import celestial.rva_3;
import celestial.rvb_3;
import celestial.rvc_3;
import celestial.rve_3;
import celestial.rvf_3;
import celestial.rvg_3;
import celestial.rvh_3;
import celestial.rvi_3;
import celestial.rvj_3;
import celestial.rvl_3;
import celestial.rvm_3;
import celestial.rvn_3;
import celestial.rvo_3;
import celestial.rvp_3;
import celestial.rvq_3;
import celestial.rvr_3;
import celestial.rvs_3;
import celestial.rvt_3;
import celestial.rvu_3;
import celestial.rvv_3;
import celestial.rvw_3;
import celestial.rvy_3;
import celestial.rvz_3;
import celestial.rxI_2;
import celestial.ryG_2;
import celestial.ryO_2;
import celestial.ryS_2;
import celestial.rys_3;
import celestial.vG_2;
import celestial.vg_3;
import celestial.vm_3;
import celestial.vu_3;
import celestial.vz_3;
import celestial.xc_3;
import celestial.xd_3;
import celestial.yK_2;
import celestial.yX_2;
import celestial.ye_3;
import celestial.yf_3;
import celestial.yj_3;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Multimap;
import com.google.common.collect.Sets;
import com.mojang.authlib.GameProfile;
import com.mojang.brigadier.CommandDispatcher;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import io.netty.buffer.Unpooled;
import java.io.File;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Aq_1
implements At_1 {
    private static final Logger id_break = LogManager.getLogger();
    public static final rgP_2 id_class = new rgn_3("disconnect.lost");
    private final rud_3 id_byte;
    private final GameProfile id_protected;
    private final vm_3 id_throws;
    private QY id_case;
    private gm_3 id_catch;
    private gv_3 id_private;
    private boolean id_implements;
    private final Map<UUID, Aw_1> id_finally = Maps.newHashMap();
    private final Ab_1 id_extends;
    private final AX id_native;
    private rlQ_2 id_volatile = rlQ_2.id_class;
    private final gG_2 id_final = new gG_2(this);
    private int id_package = 3;
    private final Random id_int = new Random();
    private CommandDispatcher<gR_2> id_new = new CommandDispatcher();
    private final rWB id_continue = new rWB();
    private final UUID id_super = UUID.randomUUID();
    private Set<rqM_2<rYB>> id_this;
    private rVm_1 id_else = rVm_1.id_break();

    public void id_byte() {
        this.id_catch = null;
    }

    public Aq_1(QY qY, vm_3 vm_32, rud_3 rud_32, GameProfile gameProfile) {
        this.id_case = qY;
        this.id_throws = vm_32;
        this.id_byte = rud_32;
        this.id_protected = gameProfile;
        this.id_extends = new Ab_1(qY);
        this.id_native = new AX(this, qY);
    }

    @Override
    public void id_class(rvv_3 rvv_32) {
        this.id_class(new rZr_1(rvv_32.id_break()));
    }

    @Override
    public void id_class(rvf_3 rvf_32) {
        ruZ_2.id_class(rvf_32, this, this.id_case);
        cb_3 cb_32 = (cb_3)this.id_case.id_class[57];
        ((rhx_3)cb_32.id_implements[18]).id_break = rvf_32.id_byte();
        ((rhx_3)cb_32.id_implements[18]).id_protected = rvf_32.id_throws();
        ((rhx_3)cb_32.id_implements[18]).id_class = rvf_32.id_break();
        ((rhx_3)cb_32.id_implements[18]).id_byte = rvf_32.id_protected();
        ((rhx_3)cb_32.id_implements[18]).id_class(rvf_32.id_case());
        ((rhx_3)cb_32.id_implements[18]).id_break(rvf_32.id_catch());
    }

    @Override
    public void id_class(rvt_3 rvt_32) {
        ruZ_2.id_class(rvt_32, this, this.id_case);
        ((gm_3)this.id_case.id_class[56]).id_class((cb_3)this.id_case.id_class[57], rvt_32.id_protected(), rvt_32.id_throws(), rvt_32.id_case(), rvt_32.id_break(), rvt_32.id_byte(), rvt_32.id_catch(), rvt_32.id_private());
    }

    @Override
    public void id_class(rFX rFX2) {
        ruZ_2.id_class(rFX2, this, this.id_case);
        an_3 an_32 = this.id_catch.id_break(rFX2.id_protected());
        if (an_32 != null) {
            ((gm_3)this.id_case.id_class[56]).id_class((rhd_3)((cb_3)this.id_case.id_class[57]), an_32, rFX2.id_break(), rFX2.id_byte(), rFX2.id_throws(), rFX2.id_case());
        }
    }

    @Override
    public void id_class(rvg_3 rvg_32) {
        ruZ_2.id_class(rvg_32, this, this.id_case);
        Aw_1 aw_1 = null;
        for (rvo_3 rvo_32 : rvg_32.id_break()) {
            if (rvg_32.id_byte() == rvY_2.REMOVE_PLAYER) {
                this.id_case.id_volatile().id_case(rvo_32.id_class().getId());
                aw_1 = this.id_finally.remove(rvo_32.id_class().getId());
                continue;
            }
            aw_1 = this.id_finally.get(rvo_32.id_class().getId());
            if (rvg_32.id_byte() == rvY_2.ADD_PLAYER) {
                aw_1 = new Aw_1(rvo_32);
                this.id_finally.put(aw_1.id_class().getId(), aw_1);
                this.id_case.id_volatile().id_class(aw_1);
            }
            if (aw_1 == null) continue;
            switch (rvg_32.id_byte()) {
                case ADD_PLAYER: {
                    aw_1.id_class(rvo_32.id_byte());
                    aw_1.id_class(rvo_32.id_break());
                    aw_1.id_class(rvo_32.id_protected());
                    break;
                }
                case UPDATE_GAME_MODE: {
                    aw_1.id_class(rvo_32.id_byte());
                    break;
                }
                case UPDATE_LATENCY: {
                    aw_1.id_class(rvo_32.id_break());
                    break;
                }
                case UPDATE_DISPLAY_NAME: {
                    aw_1.id_class(rvo_32.id_protected());
                }
            }
        }
        if (aw_1 != null) {
            ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_finally().id_class(rrLN.id_class(aw_1, rvg_32.id_byte()));
        }
    }

    @Override
    public void id_class(rFr_1 rFr_12) {
        ruZ_2.id_class(rFr_12, this, this.id_case);
        an_3 an_32 = rFr_12.id_class(this.id_catch);
        if (an_32 instanceof iB_2) {
            ((iB_2)an_32).id_class(rFr_12.id_break());
        }
    }

    @Override
    public void id_class(rvV_2 rvV_22) {
        ((cq_3)this.id_case.id_class[19]).id_implements().id_break(rvV_22.id_break().getString().isEmpty() ? null : rvV_22.id_break());
        ((cq_3)this.id_case.id_class[19]).id_implements().id_class(rvV_22.id_byte().getString().isEmpty() ? null : rvV_22.id_byte());
    }

    public void id_class(rZN rZN2) {
        this.id_byte.id_class(new rZQ(rZN2));
    }

    @Override
    public void id_class(rFv_1 rFv_12) {
        ruZ_2.id_class(rFv_12, this, this.id_case);
        ((cq_3)this.id_case.id_class[19]).id_extends().id_class(rFv_12);
    }

    @Override
    public void id_class(rvs_3 rvs_32) {
        ruZ_2.id_class(rvs_32, this, this.id_case);
        if (((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_finally().id_class(rrLn_1.id_class(rvs_32)).id_byte()) {
            return;
        }
        if (rvs_32.id_byte() == 0) {
            ((cb_3)this.id_case.id_class[57]).sK().id_break(rvs_32.id_break());
        } else {
            ((cb_3)this.id_case.id_class[57]).sK().id_class(rvs_32.id_break(), rvs_32.id_byte());
        }
        ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_finally().id_class(rrLA.id_class(rvs_32));
    }

    @Override
    public void id_class(rvn_3 rvn_32) {
        ruZ_2.id_class(rvn_32, this, this.id_case);
        an_3 an_32 = ((cb_3)this.id_case.id_class[57]).PO();
        if (an_32 != (cb_3)this.id_case.id_class[57] && an_32.Po()) {
            an_32.id_break(rvn_32.id_break(), rvn_32.id_byte(), rvn_32.id_protected(), rvn_32.id_throws(), rvn_32.id_case());
            this.id_byte.id_class(new rZS(an_32));
        }
    }

    private void id_class(CompletableFuture<?> completableFuture) {
        ((CompletableFuture)completableFuture.thenRun(() -> this.id_class(rZN.SUCCESSFULLY_LOADED))).exceptionally(throwable -> {
            this.id_class(rZN.FAILED_DOWNLOAD);
            return null;
        });
    }

    @Override
    public void id_class(rFs_1 rFs_12) {
        String string = rFs_12.id_break();
        String string2 = rFs_12.id_byte();
        if (this.id_break(string)) {
            if (string.startsWith("level://")) {
                File file = new File((File)this.id_case.id_class[24], "saves");
                String string3 = URLDecoder.decode(string.substring("level://".length()), StandardCharsets.UTF_8);
                File file2 = new File(file, string3);
                if (file2.isFile()) {
                    this.id_class(rZN.ACCEPTED);
                    CompletableFuture<Void> completableFuture = this.id_case.Z().id_class(file2, rAZ.id_byte);
                    this.id_class(completableFuture);
                    return;
                }
                this.id_class(rZN.FAILED_DOWNLOAD);
            } else {
                Ak_1 ak_1 = this.id_case.S();
                if (ak_1 != null && ak_1.id_break() == Az_1.ENABLED) {
                    this.id_class(rZN.ACCEPTED);
                    this.id_class(this.id_case.Z().id_class(string, string2));
                } else if (ak_1 != null && ak_1.id_break() != Az_1.PROMPT) {
                    this.id_class(rZN.DECLINED);
                } else {
                    this.id_case.execute(() -> this.id_case.id_break(new mT_2(bl -> {
                        this.id_case = QY.id_instanceof();
                        Ak_1 ak_1 = this.id_case.S();
                        if (bl) {
                            if (ak_1 != null) {
                                ak_1.id_class(Az_1.ENABLED);
                            }
                            this.id_class(rZN.ACCEPTED);
                            this.id_class(this.id_case.Z().id_class(string, string2));
                        } else {
                            if (ak_1 != null) {
                                ak_1.id_class(Az_1.DISABLED);
                            }
                            this.id_class(rZN.DECLINED);
                        }
                        AQ.id_byte(ak_1);
                        this.id_case.id_break((vm_3)null);
                    }, new rgn_3("multiplayer.texturePrompt.line1"), new rgn_3("multiplayer.texturePrompt.line2"))));
                }
            }
        }
    }

    @Override
    public void id_class(rvI_2 rvI_22) {
        ruZ_2.id_class(rvI_22, this, this.id_case);
        this.id_case.c().id_class(new Np_1(rvI_22.id_break(), rvI_22.id_byte(), rvI_22.id_catch(), rvI_22.id_private(), false, 0, NN.LINEAR, rvI_22.id_protected(), rvI_22.id_throws(), rvI_22.id_case(), false));
    }

    @Override
    public void id_class(rvK_2 rvK_22) {
        ruZ_2.id_class(rvK_22, this, this.id_case);
        rjU_2 rjU_22 = rvK_22.id_class(this.id_catch);
        if (rjU_22 != null) {
            ((cb_3)this.id_case.id_class[57]).id_class(rvK_22.id_break(), rjU_22);
        }
    }

    @Override
    public void id_class(rve_3 rve_32) {
        ruZ_2.id_class(rve_32, this, this.id_case);
        if (!this.id_final.id_class(rve_32.id_break(), rve_32.id_byte())) {
            id_break.debug("Got unhandled response to tag query {}", (Object)rve_32.id_break());
        }
    }

    @Override
    public void id_class(rFW rFW2) {
        ruZ_2.id_class(rFW2, this, this.id_case);
        for (Map.Entry<rCi_1<?>, Integer> entry : rFW2.id_break().entrySet()) {
            rCi_1<?> rCi_12 = entry.getKey();
            int n = entry.getValue();
            ((cb_3)this.id_case.id_class[57]).id_abstract().id_class((cb_3)this.id_case.id_class[57], rCi_12, n);
        }
        if ((vm_3)this.id_case.id_class[73] instanceof cy_3) {
            ((cy_3)((Object)((vm_3)this.id_case.id_class[73]))).id_break();
        }
    }

    @Override
    public void id_class(rvT_2 rvT_22) {
        rLR rLR2;
        ruZ_2.id_class(rvT_22, this, this.id_case);
        an_3 an_32 = this.id_catch.id_break(rvT_22.id_byte());
        if (an_32 instanceof iB_2 && (rLR2 = rLR.id_class(rvT_22.id_protected())) != null) {
            rLY rLY2 = new rLY(rLR2, rvT_22.id_case(), rvT_22.id_throws(), rvT_22.id_private(), rvT_22.id_catch(), rvT_22.id_implements());
            rLY2.id_class(rvT_22.id_break());
            ((iB_2)an_32).id_byte(rLY2);
        }
    }

    @Override
    public void id_class(rFl_1 rFl_12) {
        ruZ_2.id_class(rFl_12, this, this.id_case);
        this.id_continue.id_class(rFl_12.id_break());
        Vo_1<mG_2> vo_1 = this.id_case.id_class(gJ_2.id_byte);
        vo_1.id_class();
        VR vR = ((cb_3)this.id_case.id_class[57]).Z();
        vR.id_class(this.id_continue.id_break());
        vR.id_class().forEach(vo_1::id_class);
        vo_1.id_break();
    }

    @Override
    public void id_class(rFQ rFQ2) {
        ruZ_2.id_class(rFQ2, this, this.id_case);
        this.id_native.id_class(rFQ2.id_break(), rFQ2.id_byte());
    }

    @Override
    public void id_class(rFz_1 rFz_12) {
        ruZ_2.id_class(rFz_12, this, this.id_case);
        this.id_case.c().id_class(rFz_12.id_break(), rFz_12.id_byte());
    }

    @Override
    public void id_class(rFu_1 rFu_12) {
        ruZ_2.id_class(rFu_12, this, this.id_case);
        rFm_1 rFm_12 = rFu_12.id_break();
        rgP_2 rgP_22 = null;
        rgP_2 rgP_23 = null;
        rgP_2 rgP_24 = rFu_12.id_byte() != null ? rFu_12.id_byte() : rgN_2.id_byte;
        switch (rFm_12) {
            case TITLE: {
                rgP_22 = rgP_24;
                break;
            }
            case SUBTITLE: {
                rgP_23 = rgP_24;
                break;
            }
            case ACTIONBAR: {
                if (!rgP_24.getString().isEmpty()) {
                    ((cq_3)this.id_case.id_class[19]).id_class(rgP_24, false, false);
                }
                return;
            }
            case RESET: {
                ((cq_3)this.id_case.id_class[19]).id_class(null, null, -1, -1, -1);
                ((cq_3)this.id_case.id_class[19]).id_class();
                return;
            }
        }
        ((cq_3)this.id_case.id_class[19]).id_class(rgP_22, rgP_23, rFu_12.id_protected(), rFu_12.id_throws(), rFu_12.id_case());
    }

    @Override
    public void id_class(rFw_1 rFw_12) {
        ruZ_2.id_class(rFw_12, this, this.id_case);
        rFw_12.id_class(this.id_catch.id_instanceof());
    }

    @Override
    public void id_class(rZg_1 rZg_12) {
        ruZ_2.id_class(rZg_12, this, this.id_case);
        an_3 an_32 = rZg_12.id_class(this.id_catch);
        if (an_32 != null) {
            this.id_case.id_break(an_32);
        }
    }

    @Override
    public void id_class(rFE rFE2) {
        ruZ_2.id_class(rFE2, this, this.id_case);
        this.id_private.id_class(rFE2.id_byte());
        this.id_private.id_break(rFE2.id_break());
    }

    @Override
    public void id_class(rZa_1 rZa_12) {
        an_3 an_32;
        ruZ_2.id_class(rZa_12, this, this.id_case);
        if (rZa_12.id_class == rvr_3.ENTITY_DIED && (an_32 = this.id_catch.id_break(rZa_12.id_break)) == (cb_3)this.id_case.id_class[57]) {
            if (((cb_3)this.id_case.id_class[57]).d()) {
                ((C_break)C_break.staticFieldsf9703d96375232b196815afd59d1eb48[0]).id_class();
                ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_finally().id_class(rrAG.id_class(an_32.Ps()));
                this.id_case.id_break(new ZS(rZa_12.id_throws, this.id_catch.id_synchronized().id_implements()));
            } else {
                ((cb_3)this.id_case.id_class[57]).J();
            }
        }
    }

    @Override
    public void id_class(rFN rFN2) {
        ruZ_2.id_class(rFN2, this, this.id_case);
        rlQ_2 rlQ_22 = rFN2.id_break();
        Multimap<rqO_2, rqO_2> multimap = rlA_2.id_break(rlQ_22);
        if (!true) {
            id_break.warn("Incomplete server tags, disconnecting. Missing: {}", multimap);
            this.id_byte.id_class(new rgn_3("multiplayer.disconnect.missing_tags"));
        } else {
            this.id_volatile = rlQ_22;
            if (!this.id_byte.id_protected()) {
                rlQ_22.id_throws();
            }
            this.id_case.id_class(gJ_2.id_break).id_break();
        }
    }

    public Aw_1 id_class(UUID uUID) {
        return this.id_finally.get(uUID);
    }

    public Aw_1 id_class(String string) {
        for (Aw_1 aw_1 : this.id_finally.values()) {
            if (!aw_1.id_class().getName().equals(string)) continue;
            return aw_1;
        }
        return null;
    }

    @Override
    public rud_3 id_class() {
        return this.id_byte;
    }

    private void id_class(int n, int n2, rrse_3 rrse_32, rRo_1 rRo_12, int n3, int n4, Iterator<byte[]> iterator, boolean bl) {
        for (int i = 0; i < 18; ++i) {
            boolean bl2;
            int n5 = -1 + i;
            boolean bl3 = (n3 & 1 << i) != 0;
            boolean bl4 = bl2 = (n4 & 1 << i) != 0;
            if (!bl3 && !bl2) continue;
            rrse_32.id_class(rRo_12, rjh_3.id_class(n, n5, n2), bl3 ? new roH_2((byte[])iterator.next().clone()) : new roH_2(), bl);
            this.id_catch.id_break(n, n5, n2);
        }
    }

    @Override
    public void id_class(rvj_3 rvj_32) {
        ruZ_2.id_class(rvj_32, this, this.id_case);
        ((Ax_1)this.id_case.id_class[55]).id_class(this.id_catch, rvj_32.id_byte(), rvj_32.id_break(), rvj_32.id_throws(), rvj_32.id_protected());
    }

    @Override
    public void id_class(rva_3 rva_32) {
        ruZ_2.id_class(rva_32, this, this.id_case);
        VR vR = ((cb_3)this.id_case.id_class[57]).Z();
        vR.id_class(rva_32.id_protected());
        rvi_3 rvi_32 = rva_32.id_throws();
        switch (rvi_32) {
            case REMOVE: {
                for (rqO_2 rqO_22 : rva_32.id_break()) {
                    this.id_continue.id_class(rqO_22).ifPresent(vR::id_byte);
                }
                break;
            }
            case INIT: {
                for (rqO_2 rqO_23 : rva_32.id_break()) {
                    this.id_continue.id_class(rqO_23).ifPresent(vR::id_class);
                }
                for (rqO_2 rqO_23 : rva_32.id_byte()) {
                    this.id_continue.id_class(rqO_23).ifPresent(vR::id_case);
                }
                break;
            }
            case ADD: {
                for (rqO_2 rqO_24 : rva_32.id_break()) {
                    this.id_continue.id_class(rqO_24).ifPresent(rkw_32 -> {
                        vR.id_class((rkw_3<?>)rkw_32);
                        vR.id_case((rkw_3<?>)rkw_32);
                    });
                }
                break;
            }
        }
        vR.id_class().forEach(mG_22 -> mG_22.id_class(vR));
        if ((vm_3)this.id_case.id_class[73] instanceof mB_2) {
            ((mB_2)((Object)((vm_3)this.id_case.id_class[73]))).id_class();
        }
    }

    @Override
    public void id_class(rFH rFH2) {
        ruZ_2.id_class(rFH2, this, this.id_case);
        rns_3 rns_32 = this.id_catch.id_package();
        String string = rFH2.id_byte();
        switch (rFH2.id_throws()) {
            case CHANGE: {
                rnP_2 rnP_22 = rns_32.id_break(string);
                rAa_1 rAa_12 = rns_32.id_break(rFH2.id_break(), rnP_22);
                rAa_12.id_break(rFH2.id_protected());
                break;
            }
            case REMOVE: {
                rns_32.id_byte(rFH2.id_break(), rns_32.id_byte(string));
            }
        }
    }

    @Override
    public void id_class(rvM_2 rvM_22) {
        ruZ_2.id_class(rvM_22, this, this.id_case);
        rns_3 rns_32 = this.id_catch.id_package();
        String string = rvM_22.id_byte();
        rnP_2 rnP_22 = string == null ? null : rns_32.id_break(string);
        rns_32.id_class(rvM_22.id_break(), rnP_22);
    }

    @Override
    public void id_class(rFc_1 rFc_12) {
        ruZ_2.id_class(rFc_12, this, this.id_case);
        rns_3 rns_32 = this.id_catch.id_package();
        rnB_2 rnB_22 = rFc_12.id_throws() == 0 ? rns_32.id_case(rFc_12.id_break()) : rns_32.id_throws(rFc_12.id_break());
        if (rFc_12.id_throws() == 0 || rFc_12.id_throws() == 2) {
            Object object;
            rnB_22.id_class(rFc_12.id_byte());
            rnB_22.id_class(rFc_12.id_catch());
            rnB_22.id_class(rFc_12.id_case());
            rnX_2 rnX_22 = rnX_2.id_class(rFc_12.id_private());
            if (rnX_22 != null) {
                rnB_22.id_class(rnX_22);
            }
            if ((object = rnh_3.id_class(rFc_12.id_implements())) != null) {
                rnB_22.id_class((rnh_3)((Object)object));
            }
            rnB_22.id_break(rFc_12.id_finally());
            rnB_22.id_byte(rFc_12.id_extends());
        }
        if (rFc_12.id_throws() == 0 || rFc_12.id_throws() == 3) {
            for (Object object : rFc_12.id_protected()) {
                rns_32.id_class((String)object, rnB_22);
                ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_finally().id_class(rrLL.id_class(new Aw_1(new GameProfile(UUID.randomUUID(), object)), rFc_12.id_finally()));
            }
        }
        if (rFc_12.id_throws() == 4) {
            for (Object object : rFc_12.id_protected()) {
                ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_finally().id_class(rrLL.id_class(new Aw_1(new GameProfile(UUID.randomUUID(), object)), rFc_12.id_finally()));
                rns_32.id_break((String)object, rnB_22);
            }
        }
        if (rFc_12.id_throws() == 1) {
            rns_32.id_class(rnB_22);
        }
    }

    @Override
    public void id_class(rFd_1 rFd_12) {
        ruZ_2.id_class(rFd_12, this, this.id_case);
        double d = rFd_12.id_byte();
        double d2 = rFd_12.id_protected();
        double d3 = rFd_12.id_throws();
        if (Double.isInfinite(d) || Double.isInfinite(d2) || Double.isInfinite(d3)) {
            rrfZ_2.id_class();
            return;
        }
        if (rFd_12.id_finally() == 0) {
            double d4 = rFd_12.id_implements() * rFd_12.id_case();
            double d5 = rFd_12.id_implements() * rFd_12.id_catch();
            double d6 = rFd_12.id_implements() * rFd_12.id_private();
            try {
                this.id_catch.id_class(rFd_12.id_extends(), rFd_12.id_break(), d, d2, d3, d4, d5, d6);
            }
            catch (Throwable throwable) {
                id_break.warn("Could not spawn particle effect {}", (Object)rFd_12.id_extends());
            }
        } else {
            for (int i = 0; i < rFd_12.id_finally(); ++i) {
                double d7 = this.id_int.nextGaussian() * (double)rFd_12.id_case();
                double d8 = this.id_int.nextGaussian() * (double)rFd_12.id_catch();
                double d9 = this.id_int.nextGaussian() * (double)rFd_12.id_private();
                double d10 = this.id_int.nextGaussian() * (double)rFd_12.id_implements();
                double d11 = this.id_int.nextGaussian() * (double)rFd_12.id_implements();
                double d12 = this.id_int.nextGaussian() * (double)rFd_12.id_implements();
                try {
                    this.id_catch.id_class(rFd_12.id_extends(), rFd_12.id_break(), d + d7, d2 + d8, d3 + d9, d10, d11, d12);
                    continue;
                }
                catch (Throwable throwable) {
                    id_break.warn("Could not spawn particle effect {}", (Object)rFd_12.id_extends());
                    return;
                }
            }
        }
    }

    @Override
    public void id_class(rFB rFB2) {
        ruZ_2.id_class(rFB2, this, this.id_case);
        rns_3 rns_32 = this.id_catch.id_package();
        String string = rFB2.id_break();
        if (rFB2.id_protected() == 0) {
            rns_32.id_class(string, rAi_1.id_break, rFB2.id_byte(), rFB2.id_throws());
        } else if (rns_32.id_class(string)) {
            rnP_2 rnP_22 = rns_32.id_byte(string);
            if (rFB2.id_protected() == 1) {
                rns_32.id_byte(rnP_22);
            } else if (rFB2.id_protected() == 2) {
                rnP_22.id_class(rFB2.id_throws());
                rnP_22.id_class(rFB2.id_byte());
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void id_class(rvE_2 rvE_22) {
        ruZ_2.id_class(rvE_22, this, this.id_case);
        rqO_2 rqO_22 = rvE_22.id_break();
        ruu_3 ruu_32 = null;
        try {
            ruu_32 = rvE_22.id_byte();
            if (rvE_2.id_class.equals(rqO_22)) {
                ((cb_3)this.id_case.id_class[57]).id_byte(ruu_32.id_throws(Short.MAX_VALUE));
            } else if (rvE_2.id_break.equals(rqO_22)) {
                int n = ruu_32.readInt();
                float f = ruu_32.readFloat();
                rLC rLC2 = rLC.id_class(ruu_32);
                ((yK_2)this.id_case.id_class[17]).id_class.id_class(n, rLC2, f);
            } else if (rvE_2.id_byte.equals(rqO_22)) {
                long l = ruu_32.id_catch();
                rfH_2 rfH_22 = ruu_32.id_byte();
                ((pS_2)((yK_2)this.id_case.id_class[17]).id_case).id_class(l, rfH_22);
            } else if (rvE_2.id_protected.equals(rqO_22)) {
                rfH_2 rfH_23 = ruu_32.id_byte();
                int n = ruu_32.readInt();
                ArrayList arrayList = Lists.newArrayList();
                ArrayList arrayList2 = Lists.newArrayList();
                for (int i = 0; i < n; ++i) {
                    arrayList.add(ruu_32.id_byte());
                    arrayList2.add(Float.valueOf(ruu_32.readFloat()));
                }
                ((yK_2)this.id_case.id_class[17]).id_catch.id_class(rfH_23, arrayList, arrayList2);
            } else if (rvE_2.id_throws.equals(rqO_22)) {
                rRJ rRJ2 = this.id_else.id_class().id_class(ruu_32.id_volatile());
                rfi_3 rfi_32 = new rfi_3(ruu_32.readInt(), ruu_32.readInt(), ruu_32.readInt(), ruu_32.readInt(), ruu_32.readInt(), ruu_32.readInt());
                int n = ruu_32.readInt();
                ArrayList arrayList = Lists.newArrayList();
                ArrayList arrayList3 = Lists.newArrayList();
                for (int i = 0; i < n; ++i) {
                    arrayList.add(new rfi_3(ruu_32.readInt(), ruu_32.readInt(), ruu_32.readInt(), ruu_32.readInt(), ruu_32.readInt(), ruu_32.readInt()));
                    arrayList3.add(ruu_32.readBoolean());
                }
                ((yK_2)this.id_case.id_class[17]).id_private.id_class(rfi_32, arrayList, arrayList3, rRJ2);
            } else if (rvE_2.id_case.equals(rqO_22)) {
                ((px_3)((yK_2)this.id_case.id_class[17]).id_finally).id_class(ruu_32.id_byte(), ruu_32.readFloat(), ruu_32.readFloat(), ruu_32.readFloat(), ruu_32.readFloat(), ruu_32.readFloat());
            } else if (rvE_2.id_finally.equals(rqO_22)) {
                int n;
                int n2 = ruu_32.readInt();
                for (n = 0; n < n2; ++n) {
                    ((yK_2)this.id_case.id_class[17]).id_final.id_class(ruu_32.id_protected());
                }
                n = ruu_32.readInt();
                for (int i = 0; i < n; ++i) {
                    ((yK_2)this.id_case.id_class[17]).id_final.id_break(ruu_32.id_protected());
                }
            } else if (rvE_2.id_private.equals(rqO_22)) {
                rfH_2 rfH_24 = ruu_32.id_byte();
                String string = ruu_32.id_native();
                int n = ruu_32.readInt();
                pb_3 pb_32 = new pb_3(rfH_24, string, n);
                ((yK_2)this.id_case.id_class[17]).id_volatile.id_class(pb_32);
            } else if (rvE_2.id_implements.equals(rqO_22)) {
                rfH_2 rfH_25 = ruu_32.id_byte();
                ((yK_2)this.id_case.id_class[17]).id_volatile.id_class(rfH_25);
            } else if (rvE_2.id_catch.equals(rqO_22)) {
                rfH_2 rfH_26 = ruu_32.id_byte();
                int n = ruu_32.readInt();
                ((yK_2)this.id_case.id_class[17]).id_volatile.id_class(rfH_26, n);
            } else if (rvE_2.id_extends.equals(rqO_22)) {
                rfH_2 rfH_27 = ruu_32.id_byte();
                int n = ruu_32.readInt();
                int n3 = ruu_32.readInt();
                ArrayList arrayList = Lists.newArrayList();
                for (int i = 0; i < n3; ++i) {
                    int n4 = ruu_32.readInt();
                    boolean bl = ruu_32.readBoolean();
                    String string = ruu_32.id_throws(255);
                    arrayList.add(new ye_3(rfH_27, n4, string, bl));
                }
                ((yK_2)this.id_case.id_class[17]).id_new.id_class(n, arrayList);
            } else if (rvE_2.id_new.equals(rqO_22)) {
                int n = ruu_32.readInt();
                ArrayList arrayList = Lists.newArrayList();
                for (int i = 0; i < n; ++i) {
                    arrayList.add(ruu_32.id_byte());
                }
                ((yK_2)this.id_case.id_class[17]).id_int.id_class(arrayList);
            } else if (rvE_2.id_native.equals(rqO_22)) {
                int n;
                int n5;
                int n6;
                int n7;
                int n8;
                double d = ruu_32.readDouble();
                double d2 = ruu_32.readDouble();
                double d3 = ruu_32.readDouble();
                ex_3 ex_32 = new ex_3(d, d2, d3);
                UUID uUID = ruu_32.id_private();
                int n9 = ruu_32.readInt();
                String string = ruu_32.id_native();
                String string2 = ruu_32.id_native();
                int n10 = ruu_32.readInt();
                float f = ruu_32.readFloat();
                float f2 = ruu_32.readFloat();
                String string3 = ruu_32.id_native();
                boolean bl = ruu_32.readBoolean();
                rLC rLC3 = bl ? rLC.id_class(ruu_32) : null;
                boolean bl2 = ruu_32.readBoolean();
                pG_2 pG_22 = new pG_2(uUID, n9, string, string2, n10, f, f2, ex_32, string3, rLC3, bl2);
                int n11 = ruu_32.readInt();
                for (n8 = 0; n8 < n11; ++n8) {
                    String string4 = ruu_32.id_native();
                    pG_22.id_native.add(string4);
                }
                n8 = ruu_32.readInt();
                for (n7 = 0; n7 < n8; ++n7) {
                    String string5 = ruu_32.id_native();
                    pG_22.id_volatile.add(string5);
                }
                n7 = ruu_32.readInt();
                for (n6 = 0; n6 < n7; ++n6) {
                    String string6 = ruu_32.id_native();
                    pG_22.id_final.add(string6);
                }
                n6 = ruu_32.readInt();
                for (n5 = 0; n5 < n6; ++n5) {
                    rfH_2 rfH_28 = ruu_32.id_byte();
                    pG_22.id_int.add(rfH_28);
                }
                n5 = ruu_32.readInt();
                for (n = 0; n < n5; ++n) {
                    rfH_2 rfH_29 = ruu_32.id_byte();
                    pG_22.id_new.add(rfH_29);
                }
                n = ruu_32.readInt();
                for (int i = 0; i < n; ++i) {
                    String string7 = ruu_32.id_native();
                    pG_22.id_package.add(string7);
                }
                ((yK_2)this.id_case.id_class[17]).id_volatile.id_class(pG_22);
            } else if (rvE_2.id_volatile.equals(rqO_22)) {
                int n;
                double d = ruu_32.readDouble();
                double d4 = ruu_32.readDouble();
                double d5 = ruu_32.readDouble();
                ex_3 ex_33 = new ex_3(d, d4, d5);
                UUID uUID = ruu_32.id_private();
                int n12 = ruu_32.readInt();
                boolean bl = ruu_32.readBoolean();
                rfH_2 rfH_210 = null;
                if (bl) {
                    rfH_210 = ruu_32.id_byte();
                }
                boolean bl3 = ruu_32.readBoolean();
                rfH_2 rfH_211 = null;
                if (bl3) {
                    rfH_211 = ruu_32.id_byte();
                }
                int n13 = ruu_32.readInt();
                boolean bl4 = ruu_32.readBoolean();
                rLC rLC4 = null;
                if (bl4) {
                    rLC4 = rLC.id_class(ruu_32);
                }
                yf_3 yf_32 = new yf_3(uUID, n12, ex_33, rLC4, rfH_210, rfH_211, n13);
                int n14 = ruu_32.readInt();
                for (n = 0; n < n14; ++n) {
                    String string = ruu_32.id_native();
                    yf_32.id_private.add(string);
                }
                n = ruu_32.readInt();
                for (int i = 0; i < n; ++i) {
                    rfH_2 rfH_212 = ruu_32.id_byte();
                    yf_32.id_implements.add(rfH_212);
                }
                ((yK_2)this.id_case.id_class[17]).id_package.id_class(yf_32);
            } else if (rvE_2.id_final.equals(rqO_22)) {
                rfH_2 rfH_213 = ruu_32.id_byte();
                String string = ruu_32.id_native();
                int n = ruu_32.readInt();
                int n15 = ruu_32.readInt();
                boolean bl = ruu_32.readBoolean();
                yj_3 yj_32 = new yj_3(rfH_213, string, n, n15, bl, this.id_catch.r());
                ((yK_2)this.id_case.id_class[17]).id_package.id_class(yj_32);
            } else if (rvE_2.id_int.equals(rqO_22)) {
                ((yK_2)this.id_case.id_class[17]).id_continue.id_class();
            } else if (rvE_2.id_package.equals(rqO_22)) {
                rfH_2 rfH_214 = ruu_32.id_byte();
                int n = ruu_32.readInt();
                String string = ruu_32.id_native();
                int n16 = ruu_32.readInt();
                ((yK_2)this.id_case.id_class[17]).id_continue.id_class(rfH_214, n, string, n16);
            } else if (rqO_22.id_break().equals("custom_ping_packet") && rrjA_2.id_protected().id_throws().id_byte(ProtocolVersion.v1_17_1)) {
                ruu_3 ruu_33 = new ruu_3(Unpooled.buffer());
                ruu_33.writeInt(rvE_22.id_byte().readInt());
                this.id_byte.id_class(new rmY_2(rqO_22, ruu_33));
            } else {
                id_break.warn("Unknown custom packed identifier: {}", (Object)rqO_22);
            }
        }
        finally {
            if (ruu_32 != null) {
                ruu_32.release();
            }
        }
    }

    @Override
    public void id_class(rvl_3 rvl_32) {
        ruZ_2.id_class(rvl_32, this, this.id_case);
        rdn_3 rdn_32 = ((cb_3)this.id_case.id_class[57]).id_protected(rvl_32.id_break());
        if (rdn_32.id_break() == rdy_3.dr) {
            this.id_case.id_break(new vz_3(new vu_3(rdn_32)));
        }
    }

    @Override
    public void id_class(rFA rFA2) {
        ruZ_2.id_class(rFA2, this, this.id_case);
        this.id_catch.id_native().id_break(rFA2.id_break(), rFA2.id_byte());
    }

    @Override
    public void id_class(rFq_1 rFq_12) {
        ruZ_2.id_class(rFq_12, this, this.id_case);
        this.id_package = rFq_12.id_break();
        this.id_catch.id_native().id_class(rFq_12.id_break());
    }

    @Override
    public void id_class(rvL_2 rvL_22) {
        ruZ_2.id_class(rvL_22, this, this.id_case);
        rJr_1 rJr_12 = (rJr_1)((cb_3)this.id_case.id_class[57]).id_implements[4];
        if (rvL_22.id_break() == rJr_12.id_case && rJr_12 instanceof rJp_1) {
            ((rJp_1)rJr_12).id_class(new rdf_3(rvL_22.id_byte().id_class()));
            ((rJp_1)rJr_12).id_throws(rvL_22.id_throws());
            ((rJp_1)rJr_12).id_case(rvL_22.id_protected());
            ((rJp_1)rJr_12).id_class(rvL_22.id_case());
            ((rJp_1)rJr_12).id_break(rvL_22.id_catch());
        }
    }

    @Override
    public void id_class(rFC rFC2) {
        ruZ_2.id_class(rFC2, this, this.id_case);
        int n = rFC2.id_break();
        int n2 = rFC2.id_byte();
        rrse_3 rrse_32 = this.id_catch.id_native().id_class();
        int n3 = rFC2.id_protected();
        int n4 = rFC2.id_throws();
        Iterator<byte[]> iterator = rFC2.id_case().iterator();
        this.id_class(n, n2, rrse_32, rRo_1.SKY, n3, n4, iterator, rFC2.id_finally());
        int n5 = rFC2.id_catch();
        int n6 = rFC2.id_private();
        Iterator<byte[]> iterator2 = rFC2.id_implements().iterator();
        this.id_class(n, n2, rrse_32, rRo_1.BLOCK, n5, n6, iterator2, rFC2.id_finally());
    }

    @Override
    public void id_class(rvq_3 rvq_32) {
        ruZ_2.id_class(rvq_32, this, this.id_case);
        rJr_1 rJr_12 = (rJr_1)((cb_3)this.id_case.id_class[57]).id_implements[4];
        if (rJr_12.id_case == rvq_32.id_byte() && rJr_12.id_byte((cb_3)this.id_case.id_class[57])) {
            this.id_continue.id_class(rvq_32.id_break()).ifPresent(rkw_32 -> {
                if ((vm_3)this.id_case.id_class[73] instanceof mB_2) {
                    ms_3 ms_32 = ((mB_2)((Object)((vm_3)this.id_case.id_class[73]))).id_break();
                    ms_32.id_class((rkw_3<?>)rkw_32, rJr_12.id_throws);
                }
            });
        }
    }

    @Override
    public void id_class(rvW_2 rvW_22) {
        ruZ_2.id_class(rvW_22, this, this.id_case);
        an_3 an_32 = this.id_catch.id_break(rvW_22.id_break());
        if (an_32 != null) {
            if (!(an_32 instanceof iB_2)) {
                throw new IllegalStateException("Server tried to update attributes of a non-living entity (actually: " + an_32 + ")");
            }
            ik_3 ik_32 = ((iB_2)an_32).BT();
            for (rvz_3 rvz_32 : rvW_22.id_byte()) {
                ic_3 ic_32 = ik_32.id_class(rvz_32.id_class());
                if (ic_32 == null) {
                    id_break.warn("Entity {} does not have attribute {}", (Object)an_32, (Object)rVL.O.id_break(rvz_32.id_class()));
                    continue;
                }
                ic_32.id_class(rvz_32.id_break());
                ic_32.id_throws();
                for (ix_3 ix_32 : rvz_32.id_byte()) {
                    ic_32.id_break(ix_32);
                }
            }
        }
    }

    @Override
    public void id_class(rvb_3 rvb_32) {
        this.id_byte.id_class(rvb_32.id_break());
    }

    @Override
    public void id_class(rgP_2 rgP_22, rgP_2 rgP_23) {
        this.id_case.id_transient();
        if (this.id_throws != null) {
            this.id_case.id_break(new ZG(this.id_throws, rgP_22, rgP_23));
        } else {
            this.id_case.id_break(new ZG(new vG_2(new rrvL()), rgP_22, rgP_23));
        }
    }

    public void id_class(ruS_2<?> ruS_22) {
        this.id_byte.id_class(ruS_22);
    }

    @Override
    public void id_class(rvZ_2 rvZ_22) {
        gv_3 gv_32;
        ruZ_2.id_class(rvZ_22, this, this.id_case);
        Ax_1 ax_1 = new Ax_1(this.id_case, this);
        this.id_case.id_class[55] = ax_1;
        if (!this.id_byte.id_protected()) {
            rlA_2.id_class();
        }
        ArrayList arrayList = Lists.newArrayList(rvZ_22.id_catch());
        Collections.shuffle(arrayList);
        this.id_this = Sets.newLinkedHashSet((Iterable)arrayList);
        this.id_else = rvZ_22.id_private();
        rqM_2<rYB> rqM_22 = rvZ_22.id_finally();
        rRJ rRJ2 = rvZ_22.id_implements();
        this.id_package = rvZ_22.id_extends();
        boolean bl = rvZ_22.id_final();
        boolean bl2 = rvZ_22.id_package();
        this.id_private = gv_32 = new gv_3(rRO.NORMAL, rvZ_22.id_protected(), bl2);
        this.id_catch = new gm_3(this, gv_32, rqM_22, rRJ2, this.id_package, (yX_2)this.id_case.id_class[8], bl, rvZ_22.id_byte());
        this.id_case.id_class(this.id_catch);
        if ((cb_3)this.id_case.id_class[57] == null) {
            cb_3 cb_32 = ((Ax_1)this.id_case.id_class[55]).id_class(this.id_catch, new rlP_2(), new VR());
            this.id_case.id_class[57] = cb_32;
            Float f = Float.valueOf(-180.0f);
            ((cb_3)this.id_case.id_class[57]).id_throws[15] = f;
            if (this.id_case.id_this() != null) {
                this.id_case.id_this().id_class(((cb_3)this.id_case.id_class[57]).ro());
            }
        }
        ((yK_2)this.id_case.id_class[17]).id_class();
        ((cb_3)this.id_case.id_class[57]).Bc();
        int n = rvZ_22.id_break();
        this.id_catch.id_class(n, (cb_3)this.id_case.id_class[57]);
        rqP_2 rqP_22 = new rqP_2((Qw_1)this.id_case.id_class[20]);
        ((cb_3)this.id_case.id_class[57]).id_break[17] = rqP_22;
        ((Ax_1)this.id_case.id_class[55]).id_class((cb_3)this.id_case.id_class[57]);
        cb_3 cb_33 = (cb_3)this.id_case.id_class[57];
        this.id_case.id_class[62] = cb_33;
        this.id_case.id_break(new Zb_1());
        ((cb_3)this.id_case.id_class[57]).id_implements(n);
        ((cb_3)this.id_case.id_class[57]).id_synchronized(rvZ_22.id_native());
        ((cb_3)this.id_case.id_class[57]).id_throws(rvZ_22.id_volatile());
        ((Ax_1)this.id_case.id_class[55]).id_break(rvZ_22.id_throws());
        ((Ax_1)this.id_case.id_class[55]).id_class(rvZ_22.id_case());
        ((Qw_1)this.id_case.id_class[20]).id_byte();
        this.id_byte.id_class(new rmY_2(rmY_2.id_class, new ruu_3(Unpooled.buffer()).id_class(Qn_1.id_class())));
        this.id_case.id_short().id_break();
    }

    @Override
    public void id_class(rZR rZR2) {
        ruZ_2.id_class(rZR2, this, this.id_case);
        this.id_catch.id_class(rZR2.id_byte(), rZR2.id_break());
        ((C_break)C_break.staticFieldsf9703d96375232b196815afd59d1eb48[0]).id_class(rZR2);
    }

    @Override
    public void id_class(rFZ rFZ2) {
        ((C_break)C_break.staticFieldsf9703d96375232b196815afd59d1eb48[0]).id_class(rFZ2);
        ruZ_2.id_class(rFZ2, this, this.id_case);
        int n = rFZ2.id_break();
        int n2 = rFZ2.id_byte();
        AO aO = this.id_catch.id_native();
        aO.id_class(n, n2);
        rrse_3 rrse_32 = aO.id_class();
        for (int i = 0; i < 16; ++i) {
            this.id_catch.id_break(n, i, n2);
            rrse_32.id_class(rjh_3.id_class(n, i, n2), true);
        }
        rrse_32.id_class(new rfj_3(n, n2), false);
        ((C_break)C_break.staticFieldsf9703d96375232b196815afd59d1eb48[0]).id_break(rFZ2);
    }

    @Override
    public void id_class(rZD rZD2) {
        ruZ_2.id_class(rZD2, this, this.id_case);
        int n = rZD2.id_byte();
        int n2 = rZD2.id_protected();
        rYZ rYZ2 = rZD2.id_implements() == null ? null : new rYZ(this.id_else.id_break(rVL.n), rZD2.id_implements());
        roJ_2 roJ_22 = this.id_catch.id_native().id_class(n, n2, rYZ2, rZD2.id_break(), rZD2.id_catch(), rZD2.id_throws(), rZD2.id_case());
        if (roJ_22 != null && rZD2.id_case()) {
            this.id_catch.id_break(roJ_22);
        }
        for (int i = 0; i < 16; ++i) {
            this.id_catch.id_break(n, i, n2);
        }
        for (rcd_3 rcd_32 : rZD2.id_private()) {
            rfH_2 rfH_22 = new rfH_2(rcd_32.id_private("x"), rcd_32.id_private("y"), rcd_32.id_private("z"));
            ryO_2 ryO_22 = this.id_catch.id_class(rfH_22);
            ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_finally().id_class(rrnO_2.id_class(ryO_22, rfH_22));
            if (ryO_22 == null) continue;
            ryO_22.id_class(this.id_catch.id_byte(rfH_22), rcd_32);
        }
        ((C_break)C_break.staticFieldsf9703d96375232b196815afd59d1eb48[0]).id_class(rZD2);
    }

    @Override
    public void id_class(rFh_1 rFh_12) {
        ruZ_2.id_class(rFh_12, this, this.id_case);
        double d = rFh_12.id_throws();
        double d2 = rFh_12.id_case();
        double d3 = rFh_12.id_catch();
        float f = (float)(rFh_12.id_extends() * 360) / 256.0f;
        float f2 = (float)(rFh_12.id_native() * 360) / 256.0f;
        iB_2 iB_22 = (iB_2)aI_2.id_class(rFh_12.id_protected(), (rYB)((gm_3)this.id_case.id_class[56]));
        if (iB_22 != null) {
            iB_22.id_byte(d, d2, d3);
            Float f3 = Float.valueOf((float)(rFh_12.id_volatile() * 360) / 256.0f);
            iB_22.id_private[23] = f3;
            Float f4 = Float.valueOf((float)(rFh_12.id_volatile() * 360) / 256.0f);
            iB_22.id_private[25] = f4;
            if (iB_22 instanceof rSu_1) {
                rSm_1[] rSm_1Array = ((rSu_1)iB_22).id_implements();
                for (int i = 0; i < rSm_1Array.length; ++i) {
                    rSm_1Array[i].id_implements(i + rFh_12.id_break());
                }
            }
            iB_22.id_implements(rFh_12.id_break());
            iB_22.a_(rFh_12.id_byte());
            iB_22.id_break(d, d2, d3, f, f2);
            iB_22.id_catch((float)rFh_12.id_private() / 8000.0f, (float)rFh_12.id_implements() / 8000.0f, (float)rFh_12.id_finally() / 8000.0f);
            this.id_catch.id_class(rFh_12.id_break(), (an_3)iB_22);
            if (iB_22 instanceof rbF_2) {
                boolean bl = ((rbF_2)iB_22).T_();
                Nb_1 nb_1 = bl ? new NE((rbF_2)iB_22) : new NG((rbF_2)iB_22);
                this.id_case.c().id_class(nb_1);
            }
        }
    }

    @Override
    public void id_class(rFp_1 rFp_12) {
        ruZ_2.id_class(rFp_12, this, this.id_case);
        ((gm_3)this.id_case.id_class[56]).id_class(rFp_12.id_break());
        ((gm_3)this.id_case.id_class[56]).id_break(rFp_12.id_byte());
    }

    @Override
    public void id_class(rFj_1 rFj_12) {
        ruZ_2.id_class(rFj_12, this, this.id_case);
        ((gm_3)this.id_case.id_class[56]).id_break(rFj_12.id_break(), rFj_12.id_byte());
    }

    @Override
    public void id_class(rFb_1 rFb_12) {
        ruZ_2.id_class(rFb_12, this, this.id_case);
        an_3 an_32 = this.id_catch.id_break(rFb_12.id_byte());
        if (an_32 == null) {
            id_break.warn("Received passengers for unknown entity");
        } else {
            boolean bl = an_32.id_else((cb_3)this.id_case.id_class[57]);
            an_32.Bn();
            for (int n : rFb_12.id_break()) {
                an_3 an_33 = this.id_catch.id_break(n);
                if (an_33 == null) continue;
                an_33.id_class(an_32, true);
                if (an_33 != (cb_3)this.id_case.id_class[57] || bl) continue;
                ((cq_3)this.id_case.id_class[19]).id_class(new rgn_3("mount.onboard", ((Qw_1)this.id_case.id_class[20]).k.id_native()), false, false);
            }
        }
    }

    @Override
    public void id_class(rZj_1 rZj_12) {
        ruZ_2.id_class(rZj_12, this, this.id_case);
        an_3 an_32 = this.id_catch.id_break(rZj_12.id_break());
        if (an_32 != null) {
            if (rZj_12.id_byte() == 0) {
                iB_2 iB_22 = (iB_2)an_32;
                iB_22.id_class(rpm_3.MAIN_HAND);
            } else if (rZj_12.id_byte() == 3) {
                iB_2 iB_23 = (iB_2)an_32;
                iB_23.id_class(rpm_3.OFF_HAND);
            } else if (rZj_12.id_byte() == 1) {
                an_32.rF();
            } else if (rZj_12.id_byte() == 2) {
                rhd_3 rhd_32 = (rhd_3)an_32;
                rhd_32.id_class(false, false);
            } else if (rZj_12.id_byte() == 4) {
                ((Cy_1)this.id_case.id_class[12]).id_class(an_32, rLQ.id_catch);
            } else if (rZj_12.id_byte() == 5) {
                ((Cy_1)this.id_case.id_class[12]).id_class(an_32, rLQ.id_continue);
            }
        }
    }

    @Override
    public void id_class(rZK rZK2) {
        ruZ_2.id_class(rZK2, this, this.id_case);
        ((cq_3)this.id_case.id_class[19]).id_class(rZK2.id_protected(), rZK2.id_break(), rZK2.id_throws());
    }

    @Override
    public void id_class(rZe_1 rZe_12) {
        ruZ_2.id_class(rZe_12, this, this.id_case);
        an_3 an_32 = this.id_catch.id_break(rZe_12.id_break());
        iB_2 iB_22 = (iB_2)this.id_catch.id_break(rZe_12.id_byte());
        if (iB_22 == null) {
            iB_22 = (cb_3)this.id_case.id_class[57];
        }
        if (an_32 != null) {
            if (an_32 instanceof rsP_2) {
                this.id_catch.id_class(an_32.rx(), an_32.re(), an_32.BO(), rqn_3.SB, rqL_2.PLAYERS, 0.1f, (this.id_int.nextFloat() - this.id_int.nextFloat()) * 0.35f + 0.9f, false);
            } else {
                this.id_catch.id_class(an_32.rx(), an_32.re(), an_32.BO(), rqn_3.ER, rqL_2.PLAYERS, 0.2f, (this.id_int.nextFloat() - this.id_int.nextFloat()) * 1.4f + 2.0f, false);
            }
            ((Cy_1)this.id_case.id_class[12]).id_class(new CN(this.id_case.id_case(), this.id_case.id_interface(), this.id_catch, an_32, iB_22));
            if (an_32 instanceof rsE_2) {
                rsE_2 rsE_22 = (rsE_2)an_32;
                rdn_3 rdn_32 = rsE_22.id_protected();
                rrLf_1.id_class(iB_22, rdn_32.id_implements());
                rdn_32.id_catch(rZe_12.id_protected());
                if (rdn_32.id_class()) {
                    this.id_catch.id_class(rZe_12.id_break());
                }
            } else {
                this.id_catch.id_class(rZe_12.id_break());
            }
        }
    }

    @Override
    public void id_class(rvc_3 rvc_32) {
        ruZ_2.id_class(rvc_32, this, this.id_case);
        an_3 an_32 = this.id_catch.id_break(rvc_32.id_break());
        if (an_32 != null) {
            an_32.id_extends((double)rvc_32.id_byte() / 8000.0, (double)rvc_32.id_protected() / 8000.0, (double)rvc_32.id_throws() / 8000.0);
        }
    }

    @Override
    public void id_class(rvX_2 rvX_22) {
        ruZ_2.id_class(rvX_22, this, this.id_case);
        an_3 an_32 = this.id_catch.id_break(rvX_22.id_byte());
        List<rmG_2<?>> list = rvX_22.id_break();
        if (an_32 != null && list != null) {
            an_32.BQ().id_class(list);
            ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_finally().id_class(rrLQ.id_class(an_32, list));
        }
    }

    @Override
    public void id_class(rFk_1 rFk_12) {
        ruZ_2.id_class(rFk_12, this, this.id_case);
        UUID uUID = rFk_12.id_byte();
        if (uUID == null) {
            return;
        }
        Aw_1 aw_1 = this.id_class(uUID);
        if (aw_1 == null) {
            return;
        }
        double d = rFk_12.id_protected();
        double d2 = rFk_12.id_throws();
        double d3 = rFk_12.id_case();
        float f = (float)(rFk_12.id_catch() * 360) / 256.0f;
        float f2 = (float)(rFk_12.id_private() * 360) / 256.0f;
        int n = rFk_12.id_break();
        cM_2 cM_22 = new cM_2((gm_3)this.id_case.id_class[56], aw_1.id_class());
        cM_22.id_implements(n);
        cM_22.id_native(d, d2, d3);
        cM_22.id_byte(d, d2, d3);
        cM_22.id_break(d, d2, d3, f, f2);
        this.id_catch.id_class(n, cM_22);
    }

    @Override
    public void id_class(rvN_2 rvN_22) {
        ruZ_2.id_class(rvN_22, this, this.id_case);
        an_3 an_32 = this.id_catch.id_break(rvN_22.id_break());
        if (an_32 != null) {
            double d = rvN_22.id_byte();
            double d2 = rvN_22.id_protected();
            double d3 = rvN_22.id_throws();
            an_32.id_byte(d, d2, d3);
            if (!an_32.Po()) {
                float f = (float)(rvN_22.id_case() * 360) / 256.0f;
                float f2 = (float)(rvN_22.id_catch() * 360) / 256.0f;
                an_32.id_class(d, d2, d3, f, f2, 3, true);
                an_32.id_int(rvN_22.id_private());
            }
        }
    }

    @Override
    public void id_class(rFx_1 rFx_12) {
        ruZ_2.id_class(rFx_12, this, this.id_case);
        rsO_2 rsO_22 = new rsO_2(this.id_catch, rFx_12.id_protected(), rFx_12.id_throws(), rFx_12.id_case());
        rsO_22.id_implements(rFx_12.id_break());
        rsO_22.a_(rFx_12.id_byte());
        this.id_catch.id_class(rFx_12.id_break(), (an_3)rsO_22);
    }

    @Override
    public void id_class(rFO rFO2) {
        ruZ_2.id_class(rFO2, this, this.id_case);
        double d = rFO2.id_byte();
        double d2 = rFO2.id_protected();
        double d3 = rFO2.id_throws();
        rsP_2 rsP_22 = new rsP_2(this.id_catch, d, d2, d3, rFO2.id_case());
        rsP_22.id_byte(d, d2, d3);
        Float f = Float.valueOf(0.0f);
        rsP_22.id_throws[15] = f;
        Float f2 = Float.valueOf(0.0f);
        rsP_22.id_throws[16] = f2;
        rsP_22.id_implements(rFO2.id_break());
        this.id_catch.id_class(rFO2.id_break(), (an_3)rsP_22);
    }

    @Override
    public void id_class(rFJ rFJ2) {
        an_3 an_32;
        ruZ_2.id_class(rFJ2, this, this.id_case);
        double d = rFJ2.id_protected();
        double d2 = rFJ2.id_throws();
        double d3 = rFJ2.id_case();
        aI_2<?> aI_22 = rFJ2.id_native();
        if (aI_22 == aI_2.r) {
            an_32 = new rsk_3(this.id_catch, d, d2, d3);
        } else if (aI_22 == aI_2.B) {
            an_32 = new rsN_2(this.id_catch, d, d2, d3);
        } else if (aI_22 == aI_2.E) {
            an_32 = new rsv_3(this.id_catch, d, d2, d3);
        } else if (aI_22 == aI_2.s) {
            an_32 = new rsm_3(this.id_catch, d, d2, d3);
        } else if (aI_22 == aI_2.S) {
            an_32 = new rsc_3(this.id_catch, d, d2, d3);
        } else if (aI_22 == aI_2.P) {
            an_32 = new rsW_2(this.id_catch, d, d2, d3);
        } else if (aI_22 == aI_2.id_switch) {
            an_32 = new rsu_3(this.id_catch, d, d2, d3);
        } else if (aI_22 == aI_2.rO) {
            var10_7 = this.id_catch.id_break(rFJ2.id_volatile());
            an_32 = var10_7 instanceof rhd_3 ? new rhp_3(this.id_catch, (rhd_3)var10_7, d, d2, d3) : null;
        } else if (aI_22 == aI_2.id_byte) {
            an_32 = new rhF_2(this.id_catch, d, d2, d3);
            var10_7 = this.id_catch.id_break(rFJ2.id_volatile());
            if (var10_7 != null) {
                ((rhm_3)an_32).id_break(var10_7);
            }
        } else if (aI_22 == aI_2.p) {
            an_32 = new rho_3(this.id_catch, d, d2, d3);
            var10_7 = this.id_catch.id_break(rFJ2.id_volatile());
            if (var10_7 != null) {
                ((rhm_3)an_32).id_break(var10_7);
            }
        } else if (aI_22 == aI_2.g) {
            an_32 = new rhD_2(this.id_catch, d, d2, d3);
            var10_7 = this.id_catch.id_break(rFJ2.id_volatile());
            if (var10_7 != null) {
                ((rhm_3)an_32).id_break(var10_7);
            }
        } else {
            an_32 = aI_22 == aI_2.y ? new rhY_2(this.id_catch, d, d2, d3) : (aI_22 == aI_2.id_for ? new rhw_3(this.id_catch, d, d2, d3, rFJ2.id_catch(), rFJ2.id_private(), rFJ2.id_implements()) : (aI_22 == aI_2.id_default ? new rsG_2(this.id_catch, new rfH_2(d, d2, d3), rpr_3.id_class(rFJ2.id_volatile())) : (aI_22 == aI_2.id_strictfp ? new rsM_2(this.id_catch, new rfH_2(d, d2, d3)) : (aI_22 == aI_2.f ? new rSi_1(this.id_catch, d, d2, d3) : (aI_22 == aI_2.id_while ? new rhl_3(this.id_catch, d, d2, d3) : (aI_22 == aI_2.id_instanceof ? new rhy_3(this.id_catch, d, d2, d3, rdn_3.id_break) : (aI_22 == aI_2.id_const ? new rhH_2(this.id_catch, d, d2, d3, rFJ2.id_catch(), rFJ2.id_private(), rFJ2.id_implements()) : (aI_22 == aI_2.id_int ? new rhA_2(this.id_catch, d, d2, d3, rFJ2.id_catch(), rFJ2.id_private(), rFJ2.id_implements()) : (aI_22 == aI_2.l ? new rhR_2(this.id_catch, d, d2, d3, rFJ2.id_catch(), rFJ2.id_private(), rFJ2.id_implements()) : (aI_22 == aI_2.rP ? new rhU_2(this.id_catch, d, d2, d3, rFJ2.id_catch(), rFJ2.id_private(), rFJ2.id_implements()) : (aI_22 == aI_2.F ? new rhg_3(this.id_catch, d, d2, d3, rFJ2.id_catch(), rFJ2.id_private(), rFJ2.id_implements()) : (aI_22 == aI_2.I ? new rhn_3(this.id_catch, d, d2, d3) : (aI_22 == aI_2.id_public ? new rhC_2(this.id_catch, d, d2, d3, 0.0f, 0, null) : (aI_22 == aI_2.V ? new rhI_2(this.id_catch, d, d2, d3) : (aI_22 == aI_2.j ? new rsr_3(this.id_catch, d, d2, d3) : (aI_22 == aI_2.id_catch ? new rSK(this.id_catch, d, d2, d3) : (aI_22 == aI_2.Q ? new rsX_2(this.id_catch, d, d2, d3, null) : (aI_22 == aI_2.id_break ? new rSY(this.id_catch, d, d2, d3) : (aI_22 == aI_2.id_super ? new rSa_1(this.id_catch, d, d2, d3) : (aI_22 == aI_2.id_short ? new rsE_2(this.id_catch, d, d2, d3) : (aI_22 == aI_2.id_try ? new rsB_2(this.id_catch, d, d2, d3, xd_3.id_class(rFJ2.id_volatile())) : (aI_22 == aI_2.id_class ? new aZ_2(this.id_catch, d, d2, d3) : (aI_22 == aI_2.id_boolean ? new rSg_1((aI_2<? extends rSg_1>)aI_2.id_boolean, (rYB)this.id_catch) : null)))))))))))))))))))))));
        }
        if (an_32 != null) {
            int n = rFJ2.id_break();
            an_32.id_byte(d, d2, d3);
            an_32.id_private(d, d2, d3);
            Float f = Float.valueOf((float)(rFJ2.id_finally() * 360) / 256.0f);
            an_32.id_throws[16] = f;
            Float f2 = Float.valueOf((float)(rFJ2.id_extends() * 360) / 256.0f);
            an_32.id_throws[15] = f2;
            an_32.id_implements(n);
            an_32.a_(rFJ2.id_byte());
            this.id_catch.id_class(n, an_32);
            if (an_32 instanceof rsJ_2) {
                this.id_case.c().id_class((NQ)new NF((rsJ_2)an_32));
            }
        }
    }

    @Override
    public void id_class(rvC_2 rvC_22) {
        ruZ_2.id_class(rvC_22, this, this.id_case);
        int n = 0x13 | (rvC_22.id_break() ? 128 : 0);
        rvC_22.id_class((rfH_2 rfH_22, xc_3 xc_32) -> this.id_catch.id_class((rfH_2)rfH_22, (xc_3)xc_32, n));
        ((C_break)C_break.staticFieldsf9703d96375232b196815afd59d1eb48[0]).id_class(rvC_22);
    }

    @Override
    public void id_class(rvD_2 rvD_22) {
        double d;
        double d2;
        double d3;
        double d4;
        double d5;
        double d6;
        ruZ_2.id_class(rvD_22, this, this.id_case);
        double d7 = rvD_22.id_break();
        double d8 = rvD_22.id_byte();
        double d9 = rvD_22.id_protected();
        if (Double.isInfinite(d7) || Double.isInfinite(d8) || Double.isInfinite(d9)) {
            rrfZ_2.id_class();
            return;
        }
        cb_3 cb_32 = (cb_3)this.id_case.id_class[57];
        rjU_2 rjU_22 = cb_32.rv();
        boolean bl = rvD_22.id_private().contains((Object)rvU_2.X);
        boolean bl2 = rvD_22.id_private().contains((Object)rvU_2.Y);
        boolean bl3 = rvD_22.id_private().contains((Object)rvU_2.Z);
        rrAl_1 rrAl_12 = ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_finally().id_class(rrAl_1.id_class(d7, d8, d9, cb_32.rx(), cb_32.re(), cb_32.BO(), rvD_22.id_catch(), false, false));
        ((C_break)C_break.staticFieldsf9703d96375232b196815afd59d1eb48[0]).id_class(rrAl_12);
        rrAl_12.id_implements();
        if (rrAl_12.id_byte()) {
            return;
        }
        double d10 = rrAl_12.id_break();
        double d11 = rrAl_12.id_extends();
        double d12 = rrAl_12.id_catch();
        if (bl) {
            d6 = rjU_22.id_class();
            d5 = cb_32.rx() + d10;
            cb_3 cb_33 = cb_32;
            Double d13 = (Double)cb_33.id_throws[34] + d10;
            cb_33.id_throws[34] = d13;
        } else {
            d6 = 0.0;
            d5 = d10;
            Double d14 = d5;
            cb_32.id_throws[34] = d14;
        }
        if (bl2) {
            d4 = rjU_22.id_break();
            d3 = cb_32.re() + d11;
            cb_3 cb_34 = cb_32;
            Double d15 = (Double)cb_34.id_throws[35] + d11;
            cb_34.id_throws[35] = d15;
        } else {
            d4 = 0.0;
            d3 = d11;
            Double d16 = d3;
            cb_32.id_throws[35] = d16;
        }
        if (bl3) {
            d2 = rjU_22.id_byte();
            d = cb_32.BO() + d12;
            cb_3 cb_35 = cb_32;
            Double d17 = (Double)cb_35.id_throws[36] + d12;
            cb_35.id_throws[36] = d17;
        } else {
            d2 = 0.0;
            d = d12;
            Double d18 = d;
            cb_32.id_throws[36] = d18;
        }
        if ((Integer)cb_32.id_throws[41] > 0 && cb_32.ra() != null) {
            ((rhd_3)cb_32).id_const();
        }
        cb_32.id_volatile(d5, d3, d);
        Double d19 = d5;
        cb_32.id_throws[8] = d19;
        Double d20 = d3;
        cb_32.id_throws[9] = d20;
        Double d21 = d;
        cb_32.id_throws[10] = d21;
        cb_32.id_catch(d6, d4, d2);
        float f = rvD_22.id_throws();
        float f2 = rvD_22.id_case();
        if (rvD_22.id_private().contains((Object)rvU_2.X_ROT)) {
            f2 += ((Float)cb_32.id_throws[16]).floatValue();
        }
        if (rvD_22.id_private().contains((Object)rvU_2.Y_ROT)) {
            f += ((Float)cb_32.id_throws[15]).floatValue();
        }
        float f3 = f;
        float f4 = f2;
        if (rrAl_12.id_case()) {
            f3 = ((Float)cb_32.id_throws[15]).floatValue();
            f4 = ((Float)cb_32.id_throws[16]).floatValue();
        }
        rrAH rrAH2 = rrAH.id_class(((Float)cb_32.id_throws[15]).floatValue(), ((Float)cb_32.id_throws[16]).floatValue(), true);
        ((C_break)C_break.staticFieldsf9703d96375232b196815afd59d1eb48[0]).id_class(rrAH2);
        if (!rrAl_12.id_native()) {
            cb_32.id_class(d5, d3, d, f3, f4, rrAH2.id_break());
        }
        this.id_byte.id_class(new rmV_2(rrAl_12.id_finally()));
        this.id_byte.id_class(new rZX(cb_32.rx(), cb_32.re(), cb_32.BO(), rrAH2.id_class(), rrAH2.id_byte(), false));
        if (!this.id_implements) {
            this.id_implements = true;
            this.id_case.id_break((vm_3)null);
        }
    }

    @Override
    public void id_class(rvG_2 rvG_22) {
        ruZ_2.id_class(rvG_22, this, this.id_case);
        for (int i = 0; i < rvG_22.id_break().length; ++i) {
            int n = rvG_22.id_break()[i];
            this.id_catch.id_class(n);
        }
    }

    @Override
    public void id_class(rvh_3 rvh_32) {
        ruZ_2.id_class(rvh_32, this, this.id_case);
        an_3 an_32 = rvh_32.id_class(this.id_catch);
        if (an_32 != null) {
            float f = (float)(rvh_32.id_break() * 360) / 256.0f;
            an_32.id_class(f, 3);
        }
    }

    @Override
    public void id_class(rvJ_2 rvJ_22) {
        ruZ_2.id_class(rvJ_22, this, this.id_case);
        an_3 an_32 = rvJ_22.id_class(this.id_catch);
        if (an_32 != null && !an_32.Po()) {
            if (rvJ_22.id_throws()) {
                rjU_2 rjU_22 = rvJ_22.id_class(an_32.rm());
                an_32.id_catch(rjU_22);
                float f = rvJ_22.id_protected() ? (float)(rvJ_22.id_break() * 360) / 256.0f : ((Float)an_32.id_throws[15]).floatValue();
                float f2 = rvJ_22.id_protected() ? (float)(rvJ_22.id_byte() * 360) / 256.0f : ((Float)an_32.id_throws[16]).floatValue();
                an_32.id_class(rjU_22.id_class(), rjU_22.id_break(), rjU_22.id_byte(), f, f2, 3, false);
            } else if (rvJ_22.id_protected()) {
                float f = (float)(rvJ_22.id_break() * 360) / 256.0f;
                float f3 = (float)(rvJ_22.id_byte() * 360) / 256.0f;
                an_32.id_class(an_32.rx(), an_32.re(), an_32.BO(), f, f3, 3, false);
            }
            an_32.id_int(rvJ_22.id_case());
        }
    }

    @Override
    public void id_class(rvm_3 rvm_32) {
        ruZ_2.id_class(rvm_32, this, this.id_case);
        if (rhz_3.id_break(rvm_32.id_break())) {
            ((rhz_3)((cb_3)this.id_case.id_class[57]).id_implements[1]).id_protected = rvm_32.id_break();
        }
    }

    @Override
    public void id_class(rvO_2 rvO_22) {
        ruZ_2.id_class(rvO_22, this, this.id_case);
        an_3 an_32 = this.id_catch.id_break(rvO_22.id_break());
        if (an_32 != null) {
            rvO_22.id_byte().forEach(pair -> an_32.id_class((rXQ)((Object)((Object)pair.getFirst())), (rdn_3)pair.getSecond()));
        }
    }

    @Override
    public void id_class(rZU rZU2) {
        ruZ_2.id_class(rZU2, this, this.id_case);
        ((cb_3)this.id_case.id_class[57]).k();
    }

    @Override
    public void id_class(rZV rZV2) {
        ruZ_2.id_class(rZV2, this, this.id_case);
        ((gm_3)this.id_case.id_class[56]).id_class(rZV2.id_break(), rZV2.id_throws(), rZV2.id_byte(), rZV2.id_protected());
    }

    @Override
    public void id_class(rZf_1 rZf_12) {
        ruZ_2.id_class(rZf_12, this, this.id_case);
        ((gm_3)this.id_case.id_class[56]).id_class(rZf_12.id_break(), rZf_12.id_byte(), rZf_12.id_protected());
    }

    @Override
    public void id_class(rFt_1 rFt_12) {
        ruZ_2.id_class(rFt_12, this, this.id_case);
        cb_3 cb_32 = (cb_3)this.id_case.id_class[57];
        if ((rJr_1)cb_32.id_implements[4] != null && ((rJr_1)cb_32.id_implements[4]).id_case == rFt_12.id_break()) {
            ((rJr_1)cb_32.id_implements[4]).id_class(rFt_12.id_byte(), rFt_12.id_protected());
        }
    }

    @Override
    public void id_class(rFy_1 rFy_12) {
        boolean bl;
        ruZ_2.id_class(rFy_12, this, this.id_case);
        rfH_2 rfH_22 = rFy_12.id_break();
        ryO_2 ryO_22 = ((gm_3)this.id_case.id_class[56]).id_class(rfH_22);
        int n = rFy_12.id_byte();
        boolean bl2 = bl = n == 2 && ryO_22 instanceof rHZ;
        if (n == 1 && ryO_22 instanceof rHU || bl || n == 3 && ryO_22 instanceof rHO || n == 4 && ryO_22 instanceof rys_3 || n == 6 && ryO_22 instanceof rHb_1 || n == 7 && ryO_22 instanceof ryG_2 || n == 8 && ryO_22 instanceof rHy_1 || n == 9 && ryO_22 instanceof ryS_2 || n == 11 && ryO_22 instanceof rHJ || n == 5 && ryO_22 instanceof rHA || n == 12 && ryO_22 instanceof rHj_1 || n == 13 && ryO_22 instanceof rHc_1 || n == 14 && ryO_22 instanceof rHx_1) {
            ryO_22.id_class(((gm_3)this.id_case.id_class[56]).id_byte(rfH_22), rFy_12.id_protected());
        }
        if (bl && (vm_3)this.id_case.id_class[73] instanceof ml_3) {
            ((ml_3)((vm_3)this.id_case.id_class[73])).id_final();
        }
    }

    @Override
    public void id_class(rvy_3 rvy_32) {
        ruZ_2.id_class(rvy_32, this, this.id_case);
        ryO_2 ryO_22 = this.id_catch.id_class(rvy_32.id_break());
        if (!(ryO_22 instanceof ryS_2)) {
            ryO_22 = new ryS_2();
            ryO_22.id_break(this.id_catch, rvy_32.id_break());
        }
        ((cb_3)this.id_case.id_class[57]).id_class((ryS_2)ryO_22);
    }

    @Override
    public void id_class(rvP_2 rvP_22) {
        ruZ_2.id_class(rvP_22, this, this.id_case);
        this.id_new = new CommandDispatcher(rvP_22.id_break());
    }

    @Override
    public void id_class(rFS rFS2) {
        ruZ_2.id_class(rFS2, this, this.id_case);
        rqO_2 rqO_22 = rFS2.id_break();
        if (rqO_22 == null) {
            this.id_extends.id_class(null, false);
        } else {
            OT oT = this.id_extends.id_class().id_class(rqO_22);
            this.id_extends.id_class(oT, false);
        }
    }

    @Override
    public void id_class(rZI rZI2) {
        ruZ_2.id_class(rZI2, this, this.id_case);
        this.id_extends.id_class(rZI2);
    }

    @Override
    public void id_class(rvw_3 rvw_32) {
        ruZ_2.id_class(rvw_32, this, this.id_case);
        if (rvw_32.id_break()) {
            ((gm_3)this.id_case.id_class[56]).id_break(rvw_32.id_byte(), rvw_32.id_throws(), rvw_32.id_protected());
        } else {
            ((gm_3)this.id_case.id_class[56]).id_byte(rvw_32.id_byte(), rvw_32.id_throws(), rvw_32.id_protected());
        }
    }

    @Override
    public void id_class(rvF_2 rvF_22) {
        ruZ_2.id_class(rvF_22, this, this.id_case);
        ct_3 ct_32 = ((Hh_1)this.id_case.id_class[16]).id_catch();
        String string = rxI_2.id_class(rvF_22.id_break());
        rrGb_1 rrGb_12 = ((gm_3)this.id_case.id_class[56]).id_class(string);
        if (rrGb_12 == null) {
            rrGb_1 rrGb_13;
            rrGb_12 = new rrGb_1(string);
            if (ct_32.id_class(string) != null && (rrGb_13 = ct_32.id_class(ct_32.id_class(string))) != null) {
                rrGb_12 = rrGb_13;
            }
            ((gm_3)this.id_case.id_class[56]).id_class(rrGb_12);
        }
        rvF_22.id_class(rrGb_12);
        ct_32.id_class(rrGb_12);
    }

    @Override
    public void id_class(rZY rZY2) {
        ruZ_2.id_class(rZY2, this, this.id_case);
        cb_3 cb_32 = (cb_3)this.id_case.id_class[57];
        rZo_1 rZo_12 = rZY2.id_break();
        float f = rZY2.id_byte();
        int n = rfU_2.id_protected(f + 0.5f);
        if (rZo_12 == rZY.id_class) {
            ((rhd_3)cb_32).id_class((rgP_2)new rgn_3("block.minecraft.spawn.not_valid"), false);
        } else if (rZo_12 == rZY.id_break) {
            this.id_catch.id_synchronized().id_class(true);
            this.id_catch.id_implements(0.0f);
        } else if (rZo_12 == rZY.id_byte) {
            this.id_catch.id_synchronized().id_class(false);
            this.id_catch.id_implements(1.0f);
        } else if (rZo_12 == rZY.id_protected) {
            ((Ax_1)this.id_case.id_class[55]).id_break(rRl_1.id_class(n));
        } else if (rZo_12 == rZY.id_throws) {
            if (n == 0) {
                ((Aq_1)((cb_3)this.id_case.id_class[57]).id_break[0]).id_class(new rmI_2(rmf_3.PERFORM_RESPAWN));
                this.id_case.id_break(new Zb_1());
            } else if (n == 1) {
                this.id_case.id_break(new vg_3(true, () -> ((Aq_1)((cb_3)this.id_case.id_class[57]).id_break[0]).id_class(new rmI_2(rmf_3.PERFORM_RESPAWN))));
            }
        } else if (rZo_12 == rZY.id_case) {
            Qw_1 qw_1 = (Qw_1)this.id_case.id_class[20];
            if (f == 0.0f) {
                this.id_case.id_break(new Zs_1());
            } else if (f == 101.0f) {
                ((cq_3)this.id_case.id_class[19]).id_throws().id_class(new rgn_3("demo.help.movement", qw_1.h.id_native(), qw_1.X.id_native(), qw_1.J.id_native(), qw_1.x.id_native()));
            } else if (f == 102.0f) {
                ((cq_3)this.id_case.id_class[19]).id_throws().id_class(new rgn_3("demo.help.jump", qw_1.d.id_native()));
            } else if (f == 103.0f) {
                ((cq_3)this.id_case.id_class[19]).id_throws().id_class(new rgn_3("demo.help.inventory", qw_1.z.id_native()));
            } else if (f == 104.0f) {
                ((cq_3)this.id_case.id_class[19]).id_throws().id_class(new rgn_3("demo.day.6", qw_1.n.id_native()));
            }
        } else if (rZo_12 == rZY.id_catch) {
            this.id_catch.id_class(cb_32, cb_32.rx(), cb_32.rH(), cb_32.BO(), rqn_3.S, rqL_2.PLAYERS, 0.18f, 0.45f);
        } else if (rZo_12 == rZY.id_private) {
            this.id_catch.id_implements(f);
        } else if (rZo_12 == rZY.id_implements) {
            this.id_catch.id_catch(f);
        } else if (rZo_12 == rZY.id_finally) {
            this.id_catch.id_class(cb_32, cb_32.rx(), cb_32.re(), cb_32.BO(), rqn_3.XB, rqL_2.NEUTRAL, 1.0f, 1.0f);
        } else if (rZo_12 == rZY.id_extends) {
            this.id_catch.id_class(rLQ.id_new, cb_32.rx(), cb_32.re(), cb_32.BO(), 0.0, 0.0, 0.0);
            if (n == 1) {
                this.id_catch.id_class(cb_32, cb_32.rx(), cb_32.re(), cb_32.BO(), rqn_3.BX, rqL_2.HOSTILE, 1.0f, 1.0f);
            }
        } else if (rZo_12 == rZY.id_native) {
            ((cb_3)this.id_case.id_class[57]).id_throws(f == 0.0f);
        }
    }

    @Override
    public void id_class(rvH_2 rvH_22) {
        ruZ_2.id_class(rvH_22, this, this.id_case);
        an_3 an_32 = this.id_catch.id_break(rvH_22.id_protected());
        if (an_32 instanceof rOD) {
            rJQ rJQ2;
            rOD rOD2 = (rOD)an_32;
            cb_3 cb_32 = (cb_3)this.id_case.id_class[57];
            rXA rXA2 = new rXA(rvH_22.id_byte());
            rJQ rJQ3 = rJQ2 = new rJQ(rvH_22.id_break(), (rhz_3)cb_32.id_implements[1], rXA2, rOD2);
            cb_32.id_implements[4] = rJQ3;
            this.id_case.id_break(new Fl_1(rJQ2, (rhz_3)cb_32.id_implements[1], rOD2));
        }
    }

    @Override
    public void id_class(rvu_3 rvu_32) {
        ruZ_2.id_class(rvu_32, this, this.id_case);
        double d = rvu_32.id_throws();
        double d2 = rvu_32.id_case();
        double d3 = rvu_32.id_catch();
        if (Double.isInfinite(d) || Double.isInfinite(d2) || Double.isInfinite(d3)) {
            rrfZ_2.id_class();
            return;
        }
        rRW rRW2 = new rRW((gm_3)this.id_case.id_class[56], null, d, d2, d3, rvu_32.id_private(), rvu_32.id_implements());
        rRW2.id_class(true);
        ((cb_3)this.id_case.id_class[57]).id_byte(((cb_3)this.id_case.id_class[57]).rv().id_break(rvu_32.id_break(), rvu_32.id_byte(), rvu_32.id_protected()));
    }

    @Override
    public void id_class(rvQ_2 rvQ_22) {
        ruZ_2.id_class(rvQ_22, this, this.id_case);
        an_3 an_32 = rvQ_22.id_class(this.id_catch);
        if (an_32 != null) {
            if (rvQ_22.id_break() == 21) {
                this.id_case.c().id_class((NQ)new Nk_1((rEI)an_32));
            } else if (rvQ_22.id_break() == 35) {
                ((Cy_1)this.id_case.id_class[12]).id_class(an_32, rLQ.S, 30);
                this.id_catch.id_class(an_32.rx(), an_32.re(), an_32.BO(), rqn_3.dM, an_32.Pr(), 1.0f, 1.0f, false);
                if (an_32 == (cb_3)this.id_case.id_class[57] && ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_private().h().id_super()) {
                    ((Hh_1)this.id_case.id_class[16]).id_class(Aq_1.id_class((cb_3)this.id_case.id_class[57]));
                }
            } else {
                an_32.id_class(rvQ_22.id_break());
            }
        }
    }

    @Override
    public void id_class(rFn_1 rFn_12) {
        ruZ_2.id_class(rFn_12, this, this.id_case);
        ((cb_3)this.id_case.id_class[57]).id_byte(rFn_12.id_break());
        ((cb_3)this.id_case.id_class[57]).sk().id_class(rFn_12.id_byte());
        ((cb_3)this.id_case.id_class[57]).sk().id_break(rFn_12.id_protected());
    }

    @Override
    public void id_class(rFG rFG2) {
        ruZ_2.id_class(rFG2, this, this.id_case);
        ((cb_3)this.id_case.id_class[57]).id_class(rFG2.id_break(), rFG2.id_byte(), rFG2.id_protected());
    }

    @Override
    public void id_class(rFP rFP2) {
        Object object;
        ruZ_2.id_class(rFP2, this, this.id_case);
        rqM_2<rYB> rqM_22 = rFP2.id_byte();
        rRJ rRJ2 = rFP2.id_break();
        cb_3 cb_32 = (cb_3)this.id_case.id_class[57];
        int n = cb_32.V();
        this.id_implements = false;
        if (rqM_22 != ((rYB)cb_32.id_throws[7]).E()) {
            gv_3 gv_32;
            object = this.id_catch.id_package();
            boolean bl = rFP2.id_catch();
            boolean bl2 = rFP2.id_private();
            this.id_private = gv_32 = new gv_3(this.id_private.id_extends(), this.id_private.id_implements(), bl2);
            this.id_catch = new gm_3(this, gv_32, rqM_22, rRJ2, this.id_package, (yX_2)this.id_case.id_class[8], bl, rFP2.id_protected());
            this.id_catch.id_class((rns_3)object);
            this.id_case.id_class(this.id_catch);
            this.id_case.id_break(new Zb_1());
        }
        this.id_catch.id_private();
        object = cb_32.id_short();
        Object var14_11 = null;
        this.id_case.id_class[62] = var14_11;
        cb_3 cb_33 = ((Ax_1)this.id_case.id_class[55]).id_class(this.id_catch, cb_32.id_abstract(), cb_32.Z(), cb_32.h(), cb_32.PF());
        cb_33.id_implements(n);
        cb_3 cb_34 = cb_33;
        this.id_case.id_class[57] = cb_34;
        if (rqM_22 != ((rYB)cb_32.id_throws[7]).E()) {
            this.id_case.N().id_break();
        }
        cb_3 cb_35 = cb_33;
        this.id_case.id_class[62] = cb_35;
        cb_33.BQ().id_class(cb_32.BQ().id_byte());
        if (rFP2.id_implements()) {
            cb_33.BT().id_class(cb_32.BT());
        }
        cb_33.Bc();
        cb_33.id_byte((String)object);
        this.id_catch.id_class(n, cb_33);
        Float f = Float.valueOf(-180.0f);
        cb_33.id_throws[15] = f;
        rqP_2 rqP_22 = new rqP_2((Qw_1)this.id_case.id_class[20]);
        cb_33.id_break[17] = rqP_22;
        ((Ax_1)this.id_case.id_class[55]).id_class(cb_33);
        cb_33.id_synchronized(cb_32.sW());
        cb_33.id_throws(cb_32.d());
        if ((vm_3)this.id_case.id_class[73] instanceof ZS) {
            this.id_case.id_break((vm_3)null);
        }
        ((Ax_1)this.id_case.id_class[55]).id_break(rFP2.id_throws());
        ((Ax_1)this.id_case.id_class[55]).id_class(rFP2.id_case());
    }

    @Override
    public void id_class(rvS_2 rvS_22) {
        ruZ_2.id_class(rvS_22, this, this.id_case);
        rJr_1 rJr_12 = null;
        cb_3 cb_32 = (cb_3)this.id_case.id_class[57];
        if (rvS_22.id_break() == 0) {
            rJr_12 = (rJT)cb_32.id_implements[3];
        } else if (rvS_22.id_break() == ((rJr_1)cb_32.id_implements[4]).id_case) {
            rJr_12 = (rJr_1)cb_32.id_implements[4];
        }
        if (rJr_12 != null && !rvS_22.id_protected()) {
            this.id_class(new rmg_3(rvS_22.id_break(), rvS_22.id_byte(), true));
        }
    }

    @Override
    public void id_class(rFT rFT2) {
        ruZ_2.id_class(rFT2, this, this.id_case);
        cb_3 cb_32 = (cb_3)this.id_case.id_class[57];
        if (rFT2.id_break() == 0) {
            ((rJT)cb_32.id_implements[3]).id_class(rFT2.id_byte());
        } else if (rFT2.id_break() == ((rJr_1)cb_32.id_implements[4]).id_case) {
            ((rJr_1)cb_32.id_implements[4]).id_class(rFT2.id_byte());
        }
    }

    @Override
    public void id_class(rFM rFM2) {
        ruZ_2.id_class(rFM2, this, this.id_case);
        cb_3 cb_32 = (cb_3)this.id_case.id_class[57];
        rdn_3 rdn_32 = rFM2.id_protected();
        int n = rFM2.id_byte();
        if (rFM2.id_break() == -1) {
            if (!((vm_3)this.id_case.id_class[73] instanceof Fv_1)) {
                ((rhz_3)cb_32.id_implements[1]).id_private(rdn_32);
            }
        } else if (rFM2.id_break() == -2) {
            ((rhz_3)cb_32.id_implements[1]).id_break(n, rdn_32);
        } else {
            Object object;
            boolean bl = false;
            vm_3 vm_32 = (vm_3)this.id_case.id_class[73];
            if (vm_32 instanceof Fv_1) {
                object = (Fv_1)vm_32;
                boolean bl2 = bl = ((Fv_1)object).id_interface() != rdX_2.id_final.id_class();
            }
            if (rFM2.id_break() == 0 && rFM2.id_byte() >= 36 && n < 45) {
                if (!rdn_32.id_class() && (((rdn_3)(object = ((rJT)cb_32.id_implements[3]).id_class(n).id_class())).id_class() || ((rdn_3)object).id_char() < rdn_32.id_char())) {
                    rdn_32.id_protected(5);
                }
                ((rJT)cb_32.id_implements[3]).id_class(n, rdn_32);
            } else if (!(rFM2.id_break() != ((rJr_1)cb_32.id_implements[4]).id_case || rFM2.id_break() == 0 && bl)) {
                ((rJr_1)cb_32.id_implements[4]).id_class(n, rdn_32);
            }
        }
    }

    private static rdn_3 id_class(rhd_3 rhd_32) {
        for (rpm_3 rpm_32 : rpm_3.values()) {
            rdn_3 rdn_32 = rhd_32.id_protected(rpm_32);
            if (rdn_32.id_break() != rdy_3.kL) continue;
            return rdn_32;
        }
        return new rdn_3(rdy_3.kL);
    }

    @Override
    public void id_class(rvA_2 rvA_22) {
        ruZ_2.id_class(rvA_22, this, this.id_case);
        an_3 an_32 = this.id_catch.id_break(rvA_22.id_break());
        if (an_32 instanceof is_3) {
            ((is_3)an_32).id_super(rvA_22.id_byte());
        }
    }

    @Override
    public void id_class(rvp_3 rvp_32) {
        ruZ_2.id_class(rvp_32, this, this.id_case);
        cg_3.id_class(rvp_32.id_byte(), this.id_case, rvp_32.id_break(), rvp_32.id_protected());
    }

    public void id_break(ruS_2<?> ruS_22) {
        this.id_byte.id_break(ruS_22);
    }

    public AX id_break() {
        return this.id_native;
    }

    private boolean id_break(String string) {
        try {
            URI uRI = new URI(string);
            String string2 = uRI.getScheme();
            boolean bl = "level".equals(string2);
            if (!("http".equals(string2) || "https".equals(string2) || bl)) {
                throw new URISyntaxException(string, "Wrong protocol");
            }
            if (!bl || !string.contains("..") && string.endsWith("/resources.zip")) {
                return true;
            }
            throw new URISyntaxException(string, "Invalid levelstorage resourcepack path");
        }
        catch (URISyntaxException uRISyntaxException) {
            this.id_class(rZN.FAILED_DOWNLOAD);
            return false;
        }
    }

    public Collection<Aw_1> id_throws() {
        return this.id_finally.values();
    }

    public gm_3 id_finally() {
        return this.id_catch;
    }

    public GameProfile id_catch() {
        return this.id_protected;
    }

    public rlQ_2 id_extends() {
        return this.id_volatile;
    }

    public Collection<UUID> id_case() {
        return this.id_finally.keySet();
    }

    public CommandDispatcher<gR_2> id_implements() {
        return this.id_new;
    }

    public rVm_1 id_package() {
        return this.id_else;
    }

    public rWB id_protected() {
        return this.id_continue;
    }

    public Ab_1 id_private() {
        return this.id_extends;
    }

    public Set<rqM_2<rYB>> id_final() {
        return this.id_this;
    }

    public UUID id_volatile() {
        return this.id_super;
    }

    public gG_2 id_native() {
        return this.id_final;
    }
}

