/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.collect.Multimap
 *  com.google.common.collect.Queues
 *  com.mojang.authlib.GameProfile
 *  com.mojang.authlib.GameProfileRepository
 *  com.mojang.authlib.exceptions.AuthenticationException
 *  com.mojang.authlib.minecraft.MinecraftSessionService
 *  com.mojang.authlib.minecraft.UserApiService
 *  com.mojang.authlib.properties.PropertyMap
 *  com.mojang.authlib.yggdrasil.YggdrasilAuthenticationService
 *  com.mojang.datafixers.DataFixer
 *  com.mojang.datafixers.util.Function4
 *  com.mojang.serialization.DataResult
 *  com.mojang.serialization.DynamicOps
 *  com.mojang.serialization.JsonOps
 *  com.mojang.serialization.Lifecycle
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package celestial;

import celestial.Ak_1;
import celestial.Al_1;
import celestial.Aq_1;
import celestial.Ax_1;
import celestial.C_break;
import celestial.Cy_1;
import celestial.FH;
import celestial.FP;
import celestial.FU;
import celestial.Fe_1;
import celestial.Fv_1;
import celestial.HB;
import celestial.HE;
import celestial.HM;
import celestial.Hh_1;
import celestial.Hk_1;
import celestial.Hz_1;
import celestial.IJ;
import celestial.Ip_1;
import celestial.JC;
import celestial.KU;
import celestial.KY;
import celestial.Ko_1;
import celestial.NL;
import celestial.NS;
import celestial.Nf_1;
import celestial.Ns_1;
import celestial.Oh_1;
import celestial.QD;
import celestial.QF;
import celestial.QK;
import celestial.QU;
import celestial.Qg_1;
import celestial.Qi_1;
import celestial.Qj_1;
import celestial.Qn_1;
import celestial.Qo_1;
import celestial.Qw_1;
import celestial.Qy_1;
import celestial.VC;
import celestial.VU;
import celestial.VW;
import celestial.VZ;
import celestial.Vd_1;
import celestial.Vh_1;
import celestial.Vk_1;
import celestial.Vo_1;
import celestial.Vu_1;
import celestial.ZA;
import celestial.ZB;
import celestial.ZE;
import celestial.ZS;
import celestial.ZY;
import celestial.aI_2;
import celestial.an_3;
import celestial.cN_2;
import celestial.cT_2;
import celestial.ca_3;
import celestial.cb_3;
import celestial.cg_3;
import celestial.cj_3;
import celestial.cm_3;
import celestial.cq_3;
import celestial.fC_2;
import celestial.fY_2;
import celestial.fj_3;
import celestial.fv_3;
import celestial.gJ_2;
import celestial.gW_2;
import celestial.gd_3;
import celestial.gh_3;
import celestial.gm_3;
import celestial.gq_3;
import celestial.gx_3;
import celestial.jR_2;
import celestial.jV_2;
import celestial.jg_3;
import celestial.jt_3;
import celestial.jw_3;
import celestial.jy_3;
import celestial.jz_3;
import celestial.lY_2;
import celestial.lo_3;
import celestial.mG_2;
import celestial.mT_2;
import celestial.manager.SkinProvider;
import celestial.mt_3;
import celestial.my_3;
import celestial.pg_3;
import celestial.rAC;
import celestial.rAI;
import celestial.rAK;
import celestial.rAL;
import celestial.rAT;
import celestial.rAV;
import celestial.rAZ;
import celestial.rAf_1;
import celestial.rAh_1;
import celestial.rAj_1;
import celestial.rAm_1;
import celestial.rAp_1;
import celestial.rAt_1;
import celestial.rAv_1;
import celestial.rAz_1;
import celestial.rCB;
import celestial.rRq_1;
import celestial.rSK;
import celestial.rSY;
import celestial.rSa_1;
import celestial.rTH;
import celestial.rTQ;
import celestial.rTu_1;
import celestial.rTz_1;
import celestial.rVL;
import celestial.rVN;
import celestial.rVm_1;
import celestial.rVp_1;
import celestial.rVq_1;
import celestial.rVv_1;
import celestial.rYB;
import celestial.rYE;
import celestial.rYh_1;
import celestial.rZM;
import celestial.rZb_1;
import celestial.rcZ_2;
import celestial.rca_3;
import celestial.rcd_3;
import celestial.rcf_3;
import celestial.rcy_3;
import celestial.rdX_2;
import celestial.rdb_3;
import celestial.rdn_3;
import celestial.rdy_3;
import celestial.rfH_2;
import celestial.rfU_2;
import celestial.rff_3;
import celestial.rfo_3;
import celestial.rgF_2;
import celestial.rgN_2;
import celestial.rgP_2;
import celestial.rgh_3;
import celestial.rgn_3;
import celestial.rhJ_2;
import celestial.rhd_3;
import celestial.rhx_3;
import celestial.rhz_3;
import celestial.rjG_2;
import celestial.rjM_2;
import celestial.rkG_2;
import celestial.rkO_2;
import celestial.rlc_3;
import celestial.rmJ_2;
import celestial.rmu_3;
import celestial.rnW_2;
import celestial.rng_3;
import celestial.rop_3;
import celestial.row_3;
import celestial.rpN_2;
import celestial.rpm_3;
import celestial.rpr_3;
import celestial.rqN_2;
import celestial.rqO_2;
import celestial.rqR_2;
import celestial.rqg_3;
import celestial.rqs_3;
import celestial.rqu_3;
import celestial.rqw_3;
import celestial.rrAY;
import celestial.rrAf_1;
import celestial.rrAm_1;
import celestial.rrAu_1;
import celestial.rrFo_1;
import celestial.rrGP;
import celestial.rrGQ;
import celestial.rrGd_1;
import celestial.rrGk_1;
import celestial.rrGr_1;
import celestial.rrLH;
import celestial.rrLP;
import celestial.rrLy_1;
import celestial.rrQJ;
import celestial.rrQX;
import celestial.rrQo_1;
import celestial.rrSp_1;
import celestial.rrZr_1;
import celestial.rrbb_3;
import celestial.rrfZ_2;
import celestial.rrfp_3;
import celestial.rrjl_3;
import celestial.rrnm_3;
import celestial.rrvL;
import celestial.rsG_2;
import celestial.rsJ_2;
import celestial.rsM_2;
import celestial.rsO_2;
import celestial.rud_3;
import celestial.ruv_3;
import celestial.ryO_2;
import celestial.ryZ_2;
import celestial.rys_3;
import celestial.ub_3;
import celestial.vB_2;
import celestial.vG_2;
import celestial.vS_2;
import celestial.vY_2;
import celestial.vg_3;
import celestial.vm_3;
import celestial.vo_3;
import celestial.vs_3;
import celestial.vy_3;
import celestial.xN_2;
import celestial.xc_3;
import celestial.xd_3;
import celestial.yB_2;
import celestial.yC_2;
import celestial.yK_2;
import celestial.yX_2;
import celestial.yh_3;
import celestial.yq_3;
import celestial.ys_3;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Multimap;
import com.google.common.collect.Queues;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.GameProfileRepository;
import com.mojang.authlib.exceptions.AuthenticationException;
import com.mojang.authlib.minecraft.MinecraftSessionService;
import com.mojang.authlib.minecraft.UserApiService;
import com.mojang.authlib.properties.PropertyMap;
import com.mojang.authlib.yggdrasil.YggdrasilAuthenticationService;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.datafixers.DataFixer;
import com.mojang.datafixers.util.Function4;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.JsonOps;
import com.mojang.serialization.Lifecycle;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.Proxy;
import java.net.SocketAddress;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Queue;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class QY
extends rTz_1<Runnable>
implements Hk_1 {
    private static byte[] id_byte;
    private static short[] id_protected;
    private static String[] id_throws;
    public Object[] id_class;
    private static boolean[] id_case;
    private static int[] id_catch;
    private static float[] id_private;
    public static Object[] id_break;
    private static long[] id_implements;

    public fv_3 id_boolean() {
        this.j();
        return (fv_3)this.id_class[id_protected[718]];
    }

    public rAt_1 id_char() {
        this.j();
        return (rAt_1)this.id_class[id_protected[666]];
    }

    @Override
    public boolean id_byte(Runnable runnable) {
        return id_case[106];
    }

    public static void id_byte(KY kY) {
        File file = new File((File)QY.id_instanceof().id_class[id_protected[210]], id_throws[29]);
        File file2 = new File(file, "crash-" + new SimpleDateFormat(id_throws[30]).format(new Date()) + "-client.txt");
        rVN.id_class(kY.id_protected());
        if (kY.id_throws() != null) {
            rVN.id_class("#@!@# Game crashed! Crash report saved to: #@!@# " + kY.id_throws());
            System.exit(id_byte[3]);
        } else if (kY.id_class(file2)) {
            rVN.id_class("#@!@# Game crashed! Crash report saved to: #@!@# " + file2.getAbsolutePath());
            System.exit(id_byte[4]);
        } else {
            rVN.id_class(id_throws[31]);
            System.exit(id_byte[5]);
        }
    }

    public PropertyMap id_byte() {
        this.j();
        if (((PropertyMap)this.id_class[id_protected[659]]).isEmpty()) {
            GameProfile gameProfile = this.r().fillProfileProperties(((rqN_2)this.id_class[id_protected[660]]).id_throws(), id_case[103]);
            ((PropertyMap)this.id_class[id_protected[661]]).putAll((Multimap)gameProfile.getProperties());
        }
        return (PropertyMap)this.id_class[id_protected[662]];
    }

    private void id_byte(String string) {
        this.j();
        if (!this.id_switch() && !this.id_final()) {
            if ((cb_3)this.id_class[id_protected[224]] != null) {
                ((cb_3)this.id_class[id_protected[225]]).id_class((rgP_2)new rgn_3(id_throws[36]).id_class(rgF_2.RED), rqR_2.id_break);
            }
        } else {
            this.id_break(new FP(string));
        }
    }

    private static int id_byte(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xF2E64129;
    }

    public void id_byte(vm_3 vm_32) {
        this.j();
        Aq_1 aq_1 = this.id_void();
        if (aq_1 != null) {
            this.rx();
            aq_1.id_byte();
        }
        rng_3 rng_32 = (rng_3)this.id_class[id_protected[583]];
        Object var8_4 = null;
        this.id_class[QY.id_protected[584]] = var8_4;
        ((Hh_1)this.id_class[id_protected[585]]).id_case();
        Object var9_5 = null;
        this.id_class[QY.id_protected[586]] = var9_5;
        this.id_protected(vm_32);
        if ((gm_3)this.id_class[id_protected[587]] != null) {
            ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_protected[588]]).id_finally().id_class(rrnm_3.id_class((gm_3)this.id_class[id_protected[589]]));
            if (rng_32 != null) {
                while (!rng_32.id_char()) {
                    this.id_throws(id_case[86]);
                }
            }
            ((jy_3)this.id_class[id_protected[590]]).id_break();
            ((cq_3)this.id_class[id_protected[591]]).id_finally();
            Object var10_6 = null;
            this.id_class[QY.id_protected[592]] = var10_6;
            Boolean bl = id_case[87];
            this.id_class[QY.id_protected[593]] = bl;
            ((QU)this.id_class[id_protected[594]]).id_class();
        }
        Object var12_8 = null;
        this.id_class[QY.id_protected[595]] = var12_8;
        this.id_break((gm_3)null);
        Object var13_9 = null;
        this.id_class[QY.id_protected[596]] = var13_9;
    }

    public void id_byte(boolean bl) {
        this.j();
        ((ub_3)this.id_class[id_protected[198]]).id_class((Map<rqO_2, rqO_2>)(bl ? ImmutableMap.of((Object)((rqO_2)id_break[id_protected[199]]), (Object)((rqO_2)id_break[id_protected[200]])) : ImmutableMap.of()));
    }

    public boolean id_int() {
        this.j();
        return (Boolean)this.id_class[id_protected[606]];
    }

    public cT_2 id_long() {
        this.j();
        return (cT_2)this.id_class[id_protected[723]];
    }

    public Hz_1 id_float() {
        this.j();
        return (Hz_1)this.id_class[id_protected[704]];
    }

    public void id_double() {
        this.j();
        Thread thread = Thread.currentThread();
        this.id_class[QY.id_protected[191]] = thread;
        try {
            boolean bl = id_case[18];
            while (((Boolean)this.id_class[id_protected[192]]).booleanValue()) {
                if ((KY)this.id_class[id_protected[193]] != null) {
                    QY.id_byte((KY)this.id_class[id_protected[194]]);
                    return;
                }
                try {
                    this.id_throws(!bl ? id_case[19] : id_case[20]);
                }
                catch (OutOfMemoryError outOfMemoryError) {
                    if (bl) {
                        throw outOfMemoryError;
                    }
                    this.b();
                    this.id_break(new vS_2());
                    System.gc();
                    ((Logger)id_break[id_protected[195]]).fatal(id_throws[21], (Throwable)outOfMemoryError);
                    bl = id_case[21];
                }
            }
        }
        catch (KU kU) {
            this.id_class(kU.id_class());
            this.b();
            ((Logger)id_break[id_protected[196]]).fatal(id_throws[22], (Throwable)kU);
            QY.id_byte(kU.id_class());
        }
        catch (Throwable throwable) {
            KY kY = this.id_class(new KY(id_throws[23], throwable));
            ((Logger)id_break[id_protected[197]]).fatal(id_throws[24], throwable);
            this.b();
            QY.id_byte(kY);
        }
    }

    public QY(Qy_1 qy_1) {
        super(id_throws[0]);
        Object object;
        int n;
        String string;
        AtomicReference atomicReference;
        this.j();
        rqw_3 rqw_32 = new rqw_3(id_private[0], id_implements[0]);
        this.id_class[QY.id_protected[0]] = rqw_32;
        gJ_2 gJ_22 = new gJ_2();
        this.id_class[QY.id_protected[1]] = gJ_22;
        this.id_class[QY.id_protected[2]] = atomicReference = new AtomicReference();
        rpN_2 rpN_22 = new rpN_2();
        this.id_class[QY.id_protected[3]] = rpN_22;
        QU qU = new QU(this);
        this.id_class[QY.id_protected[4]] = qU;
        Long l = rqR_2.id_byte();
        this.id_class[QY.id_protected[5]] = l;
        Boolean bl = id_case[0];
        this.id_class[QY.id_protected[6]] = bl;
        String string2 = id_throws[1];
        this.id_class[QY.id_protected[7]] = string2;
        Boolean bl2 = id_case[1];
        this.id_class[QY.id_protected[8]] = bl2;
        ConcurrentLinkedQueue concurrentLinkedQueue = Queues.newConcurrentLinkedQueue();
        this.id_class[QY.id_protected[9]] = concurrentLinkedQueue;
        String string3 = id_throws[2];
        this.id_class[QY.id_protected[10]] = string3;
        QY qY = this;
        QY.id_break[QY.id_protected[11]] = qY;
        File file = qy_1.id_byte.id_class;
        this.id_class[QY.id_protected[12]] = file;
        File file2 = qy_1.id_byte.id_byte;
        File file3 = qy_1.id_byte.id_break;
        this.id_class[QY.id_protected[13]] = file3;
        String string4 = qy_1.id_protected.id_break;
        this.id_class[QY.id_protected[14]] = string4;
        String string5 = qy_1.id_protected.id_byte;
        this.id_class[QY.id_protected[15]] = string5;
        PropertyMap propertyMap = qy_1.id_class.id_byte;
        this.id_class[QY.id_protected[16]] = propertyMap;
        jy_3 jy_32 = new jy_3(new File((File)this.id_class[id_protected[17]], id_throws[3]), qy_1.id_byte.id_class());
        this.id_class[QY.id_protected[18]] = jy_32;
        rAm_1[] rAm_1Array = new rAm_1[id_byte[0]];
        rAm_1Array[QY.id_case[2]] = (jy_3)this.id_class[id_protected[19]];
        rAm_1Array[QY.id_case[3]] = new rAz_1((File)this.id_class[id_protected[20]], rAZ.id_class);
        rAt_1 rAt_12 = new rAt_1(QY::id_class, rAm_1Array);
        this.id_class[QY.id_protected[21]] = rAt_12;
        Proxy proxy = qy_1.id_class.id_protected;
        this.id_class[QY.id_protected[22]] = proxy;
        YggdrasilAuthenticationService yggdrasilAuthenticationService = new YggdrasilAuthenticationService((Proxy)this.id_class[id_protected[23]]);
        MinecraftSessionService minecraftSessionService = yggdrasilAuthenticationService.createMinecraftSessionService();
        this.id_class[QY.id_protected[24]] = minecraftSessionService;
        UserApiService userApiService = this.id_class(yggdrasilAuthenticationService, qy_1);
        this.id_class[QY.id_protected[25]] = userApiService;
        rqN_2 rqN_22 = qy_1.id_class.id_class;
        this.id_class[QY.id_protected[26]] = rqN_22;
        ((Logger)id_break[id_protected[27]]).info(id_throws[4], (Object)((rqN_2)this.id_class[id_protected[28]]).id_byte());
        ((Logger)id_break[id_protected[29]]).debug(id_throws[5], (Object)((rqN_2)this.id_class[id_protected[30]]).id_class());
        Boolean bl3 = qy_1.id_protected.id_class;
        this.id_class[QY.id_protected[31]] = bl3;
        Boolean bl4 = !qy_1.id_protected.id_protected ? id_case[4] : id_case[5];
        this.id_class[QY.id_protected[32]] = bl4;
        Boolean bl5 = !qy_1.id_protected.id_throws ? id_case[6] : id_case[7];
        this.id_class[QY.id_protected[33]] = bl5;
        Boolean bl6 = QY.e();
        this.id_class[QY.id_protected[34]] = bl6;
        Object var40_31 = null;
        this.id_class[QY.id_protected[35]] = var40_31;
        if (this.J() && qy_1.id_throws.id_class != null) {
            string = qy_1.id_throws.id_class;
            n = qy_1.id_throws.id_break;
        } else {
            string = null;
            n = id_case[8];
        }
        rgh_3.id_class(Vu_1::id_class);
        DataFixer dataFixer = rTu_1.id_class();
        this.id_class[QY.id_protected[36]] = dataFixer;
        Thread thread = Thread.currentThread();
        this.id_class[QY.id_protected[37]] = thread;
        Qw_1 qw_1 = new Qw_1(this, (File)this.id_class[id_protected[38]]);
        this.id_class[QY.id_protected[39]] = qw_1;
        Vk_1 vk_1 = new Vk_1((File)this.id_class[id_protected[40]], (DataFixer)this.id_class[id_protected[41]]);
        this.id_class[QY.id_protected[42]] = vk_1;
        ((Logger)id_break[id_protected[43]]).info(id_throws[6], (Object)RenderSystem.getBackendDescription());
        ys_3 ys_32 = ((Qw_1)this.id_class[QY.id_protected[44]]).id_this > 0 && ((Qw_1)this.id_class[QY.id_protected[45]]).id_super > 0 ? new ys_3(((Qw_1)this.id_class[QY.id_protected[46]]).id_super, ((Qw_1)this.id_class[QY.id_protected[47]]).id_this, qy_1.id_break.id_byte, qy_1.id_break.id_protected, qy_1.id_break.id_throws) : qy_1.id_break;
        rqR_2.id_class = RenderSystem.initBackendSystem();
        yh_3 yh_32 = new yh_3(this);
        this.id_class[QY.id_protected[48]] = yh_32;
        Qg_1 qg_1 = ((yh_3)this.id_class[id_protected[49]]).id_class(ys_32, ((Qw_1)this.id_class[QY.id_protected[50]]).id_final, this.C());
        this.id_class[QY.id_protected[51]] = qg_1;
        this.id_class(id_case[9]);
        try {
            object = this.Z().id_class().id_class(rAI.CLIENT_RESOURCES, new rqO_2(id_throws[7]));
            InputStream inputStream = this.Z().id_class().id_class(rAI.CLIENT_RESOURCES, new rqO_2(id_throws[8]));
            ((Qg_1)this.id_class[id_protected[52]]).id_class((InputStream)object, inputStream);
        }
        catch (IOException iOException) {
            ((Logger)id_break[id_protected[53]]).error(id_throws[9], (Throwable)iOException);
        }
        ((Qg_1)this.id_class[id_protected[54]]).id_class(((Qw_1)this.id_class[QY.id_protected[55]]).id_protected);
        Qi_1 qi_1 = new Qi_1(this);
        this.id_class[QY.id_protected[56]] = qi_1;
        ((Qi_1)this.id_class[id_protected[57]]).id_class(((Qg_1)this.id_class[id_protected[58]]).id_implements());
        Qj_1 qj_1 = new Qj_1(this);
        this.id_class[QY.id_protected[59]] = qj_1;
        ((Qj_1)this.id_class[id_protected[60]]).id_class(((Qg_1)this.id_class[id_protected[61]]).id_implements());
        RenderSystem.initRenderer(((Qw_1)this.id_class[QY.id_protected[62]]).id_void, id_case[10]);
        VC vC = new VC(((Qg_1)this.id_class[id_protected[63]]).id_extends(), ((Qg_1)this.id_class[id_protected[64]]).id_native(), id_case[11], (Boolean)id_break[id_protected[65]]);
        this.id_class[QY.id_protected[66]] = vC;
        ((VC)this.id_class[id_protected[67]]).id_class(id_private[1], id_private[2], id_private[3], id_private[4]);
        rAj_1 rAj_12 = new rAj_1(rAI.CLIENT_RESOURCES);
        this.id_class[QY.id_protected[68]] = rAj_12;
        ((rAt_1)this.id_class[id_protected[69]]).id_class();
        ((Qw_1)this.id_class[id_protected[70]]).id_class((rAt_1)this.id_class[id_protected[71]]);
        jV_2 jV_22 = new jV_2(((Qw_1)this.id_class[QY.id_protected[72]]).rG);
        this.id_class[QY.id_protected[73]] = jV_22;
        ((rAv_1)this.id_class[id_protected[74]]).id_class((jV_2)this.id_class[id_protected[75]]);
        fY_2 fY_22 = new fY_2((rAv_1)this.id_class[id_protected[76]]);
        this.id_class[QY.id_protected[77]] = fY_22;
        ((rAv_1)this.id_class[id_protected[78]]).id_class((fY_2)this.id_class[id_protected[79]]);
        SkinProvider skinProvider = new SkinProvider((fY_2)this.id_class[id_protected[80]], new File(file2, id_throws[10]), (MinecraftSessionService)this.id_class[id_protected[81]]);
        this.id_class[QY.id_protected[82]] = skinProvider;
        rrGd_1 rrGd_12 = new rrGd_1(((File)this.id_class[id_protected[83]]).toPath().resolve(id_throws[11]), ((File)this.id_class[id_protected[84]]).toPath().resolve(id_throws[12]), (DataFixer)this.id_class[id_protected[85]]);
        this.id_class[QY.id_protected[86]] = rrGd_12;
        Nf_1 nf_1 = new Nf_1((rAv_1)this.id_class[id_protected[87]], (Qw_1)this.id_class[id_protected[88]]);
        this.id_class[QY.id_protected[89]] = nf_1;
        ((rAv_1)this.id_class[id_protected[90]]).id_class((Nf_1)this.id_class[id_protected[91]]);
        gW_2 gW_22 = new gW_2((rqN_2)this.id_class[id_protected[92]]);
        this.id_class[QY.id_protected[93]] = gW_22;
        ((rAv_1)this.id_class[id_protected[94]]).id_class((gW_2)this.id_class[id_protected[95]]);
        NL nL = new NL(this);
        this.id_class[QY.id_protected[96]] = nL;
        ub_3 ub_32 = new ub_3((fY_2)this.id_class[id_protected[97]]);
        this.id_class[QY.id_protected[98]] = ub_32;
        cm_3 cm_32 = ((ub_3)this.id_class[id_protected[99]]).id_class();
        this.id_class[QY.id_protected[100]] = cm_32;
        ((rAv_1)this.id_class[id_protected[101]]).id_class(((ub_3)this.id_class[id_protected[102]]).id_break());
        this.id_byte(this.id_continue());
        ((rAv_1)this.id_class[id_protected[103]]).id_class(new jw_3());
        ((rAv_1)this.id_class[id_protected[104]]).id_class(new jt_3());
        ((Qg_1)this.id_class[id_protected[105]]).id_class(id_throws[13]);
        RenderSystem.setupDefaultState(id_case[12], id_case[13], ((Qg_1)this.id_class[id_protected[106]]).id_extends(), ((Qg_1)this.id_class[id_protected[107]]).id_native());
        ((Qg_1)this.id_class[id_protected[108]]).id_class(id_throws[14]);
        yC_2 yC_22 = yC_2.id_class();
        this.id_class[QY.id_protected[109]] = yC_22;
        yq_3 yq_32 = yq_3.id_class((yC_2)this.id_class[id_protected[110]]);
        this.id_class[QY.id_protected[111]] = yq_32;
        Ip_1 ip_1 = new Ip_1((fY_2)this.id_class[id_protected[112]], (yC_2)this.id_class[id_protected[113]], ((Qw_1)this.id_class[QY.id_protected[114]]).id_instanceof);
        this.id_class[QY.id_protected[115]] = ip_1;
        ((rAv_1)this.id_class[id_protected[116]]).id_class((Ip_1)this.id_class[id_protected[117]]);
        Hz_1 hz_1 = new Hz_1((fY_2)this.id_class[id_protected[118]], (Ip_1)this.id_class[id_protected[119]], (yq_3)this.id_class[id_protected[120]]);
        this.id_class[QY.id_protected[121]] = hz_1;
        pg_3 pg_32 = new pg_3((fY_2)this.id_class[id_protected[122]], (Hz_1)this.id_class[id_protected[123]], (rAv_1)this.id_class[id_protected[124]], (cm_3)this.id_class[id_protected[125]], (Qw_1)this.id_class[id_protected[126]]);
        this.id_class[QY.id_protected[127]] = pg_32;
        HB hB = new HB(this);
        this.id_class[QY.id_protected[128]] = hB;
        ((rAv_1)this.id_class[id_protected[129]]).id_class((Hz_1)this.id_class[id_protected[130]]);
        yB_2 yB_22 = new yB_2();
        this.id_class[QY.id_protected[131]] = yB_22;
        Hh_1 hh_1 = new Hh_1(this, (rAv_1)this.id_class[id_protected[132]], (yB_2)this.id_class[id_protected[133]]);
        this.id_class[QY.id_protected[134]] = hh_1;
        ((rAv_1)this.id_class[id_protected[135]]).id_class((Hh_1)this.id_class[id_protected[136]]);
        FU fU = new FU(this, (UserApiService)this.id_class[id_protected[137]]);
        this.id_class[QY.id_protected[138]] = fU;
        lo_3 lo_32 = new lo_3(((Ip_1)this.id_class[id_protected[139]]).id_byte(), (yC_2)this.id_class[id_protected[140]]);
        this.id_class[QY.id_protected[141]] = lo_32;
        ((rAv_1)this.id_class[id_protected[142]]).id_class((lo_3)this.id_class[id_protected[143]]);
        yX_2 yX_22 = new yX_2(this, (yB_2)this.id_class[id_protected[144]]);
        this.id_class[QY.id_protected[145]] = yX_22;
        ((rAv_1)this.id_class[id_protected[146]]).id_class((yX_2)this.id_class[id_protected[147]]);
        this.U();
        ((rAv_1)this.id_class[id_protected[148]]).id_class((gJ_2)this.id_class[id_protected[149]]);
        Cy_1 cy_1 = new Cy_1((gm_3)this.id_class[id_protected[150]], (fY_2)this.id_class[id_protected[151]]);
        this.id_class[QY.id_protected[152]] = cy_1;
        ((rAv_1)this.id_class[id_protected[153]]).id_class((Cy_1)this.id_class[id_protected[154]]);
        fv_3 fv_32 = new fv_3((fY_2)this.id_class[id_protected[155]]);
        this.id_class[QY.id_protected[156]] = fv_32;
        ((rAv_1)this.id_class[id_protected[157]]).id_class((fv_3)this.id_class[id_protected[158]]);
        fC_2 fC_22 = new fC_2((fY_2)this.id_class[id_protected[159]]);
        this.id_class[QY.id_protected[160]] = fC_22;
        ((rAv_1)this.id_class[id_protected[161]]).id_class((fC_2)this.id_class[id_protected[162]]);
        HM hM = new HM();
        this.id_class[QY.id_protected[163]] = hM;
        ((rAv_1)this.id_class[id_protected[164]]).id_class((HM)this.id_class[id_protected[165]]);
        cq_3 cq_32 = new cq_3(this);
        this.id_class[QY.id_protected[166]] = cq_32;
        yK_2 yK_22 = new yK_2(this);
        this.id_class[QY.id_protected[167]] = yK_22;
        RenderSystem.setErrorCallback(this::id_class);
        if (((Qw_1)this.id_class[QY.id_protected[168]]).s && !((Qg_1)this.id_class[id_protected[169]]).id_finally()) {
            ((Qg_1)this.id_class[id_protected[170]]).id_private();
            ((Qw_1)this.id_class[QY.id_protected[171]]).s = ((Qg_1)this.id_class[id_protected[172]]).id_finally();
        }
        ((Qg_1)this.id_class[id_protected[173]]).id_class(((Qw_1)this.id_class[QY.id_protected[174]]).id_strictfp);
        ((Qg_1)this.id_class[id_protected[175]]).id_break(((Qw_1)this.id_class[QY.id_protected[176]]).id_float);
        ((Qg_1)this.id_class[id_protected[177]]).id_byte();
        this.v();
        if (string != null) {
            this.id_break(new mt_3((vm_3)new rrvL(), this, string, n));
        } else {
            this.id_break(new rrvL(id_case[14]));
        }
        cj_3.id_class(this);
        object = ((rAt_1)this.id_class[id_protected[178]]).id_case();
        this.id_class(new cj_3(this, ((rAv_1)this.id_class[id_protected[179]]).id_class(rqR_2.id_case(), (Executor)this, (CompletableFuture)id_break[id_protected[180]], (List<rAC>)object), optional -> rqR_2.id_class(optional, this::id_class, () -> {
            if (rqu_3.id_byte) {
                this.w();
            }
        }), id_case[15]));
        this.V();
    }

    static {
        QY.ntfClinit();
    }

    public VC B() {
        this.j();
        return (VC)this.id_class[id_protected[206]];
    }

    private String C() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(id_throws[15]);
        stringBuilder.append(id_throws[16]);
        stringBuilder.append(id_throws[17]);
        stringBuilder.append(id_throws[18]);
        stringBuilder.append(((rrZr_1)rrQJ.id_class[id_protected[184]]).id_protected());
        stringBuilder.append(id_throws[19]);
        return stringBuilder.toString();
    }

    private static void D() {
        id_byte = new byte[]{2, 3, 2, -1, -1, -2, 10, 6, 2, 3, 4, 5, 60, 10, 10, 4, 9, 2, 2, 36, -1, 3, 4, 2, 3, 4, 5, 6, 7, 8, 88, 30, 31, 32, 33, 61, 65, 66, 67, 68, 69, 70, 71, 72, 77, 80, 81, 82, 83, 87, 10, 2, 9};
    }

    public rAL F() {
        this.j();
        return (rAv_1)this.id_class[id_protected[665]];
    }

    public boolean J() {
        return id_case[90];
    }

    public Ak_1 S() {
        this.j();
        return (Ak_1)this.id_class[id_protected[652]];
    }

    public jy_3 Z() {
        this.j();
        return (jy_3)this.id_class[id_protected[667]];
    }

    private void V() {
        if (!((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_protected[181]]).id_case()) {
            this.G();
            return;
        }
        ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_protected[182]]).id_finally().id_class(new rrLP());
    }

    public rng_3 id_this() {
        this.j();
        return (rng_3)this.id_class[id_protected[656]];
    }

    private static boolean e() {
        String[] stringArray;
        String[] stringArray2 = new String[id_byte[1]];
        stringArray2[QY.id_case[23]] = id_throws[25];
        stringArray2[QY.id_case[24]] = id_throws[26];
        stringArray2[QY.id_byte[2]] = id_throws[27];
        String[] stringArray3 = stringArray = stringArray2;
        int n = stringArray3.length;
        for (int i = id_case[25]; i < n; ++i) {
            String string = stringArray3[i];
            String string2 = System.getProperty(string);
            if (string2 == null || !string2.contains(id_throws[28])) continue;
            return id_case[26];
        }
        return id_case[27];
    }

    private static void i() {
        long[] lArray = new long[7];
        lArray[1] = 1000L;
        lArray[2] = 1000L;
        lArray[3] = 16L;
        id_implements = lArray;
    }

    public void b() {
        this.j();
        try {
            byte[] byArray = new byte[id_case[46]];
            QY.id_break[QY.id_protected[348]] = byArray;
            ((yX_2)this.id_class[id_protected[349]]).id_extends();
        }
        catch (Throwable throwable) {
            // empty catch block
        }
        try {
            System.gc();
            if (((Boolean)this.id_class[id_protected[350]]).booleanValue() && (rng_3)this.id_class[id_protected[351]] != null) {
                ((rng_3)this.id_class[id_protected[352]]).id_class(id_case[47]);
            }
            this.id_byte(new ZE(new rgn_3(id_throws[49])));
        }
        catch (Throwable throwable) {
            // empty catch block
        }
        System.gc();
    }

    public CompletableFuture<Void> x() {
        return ((rTQ)this).id_class(this::id_private).thenCompose(completableFuture -> completableFuture);
    }

    public yC_2 s() {
        this.j();
        return (yC_2)this.id_class[id_protected[711]];
    }

    public Nf_1 c() {
        this.j();
        return (Nf_1)this.id_class[id_protected[674]];
    }

    public File h() {
        this.j();
        return (File)this.id_class[id_protected[668]];
    }

    private void f() {
        int n;
        this.j();
        while (((Qw_1)this.id_class[QY.id_protected[499]]).C.id_case()) {
            VZ vZ = ((Qw_1)this.id_class[id_protected[500]]).id_volatile();
            ((Qw_1)this.id_class[id_protected[501]]).id_class(((Qw_1)this.id_class[id_protected[502]]).id_volatile().id_byte());
            if (vZ.id_class() != ((Qw_1)this.id_class[id_protected[503]]).id_volatile().id_class()) {
                ((Hh_1)this.id_class[id_protected[504]]).id_class(((Qw_1)this.id_class[id_protected[505]]).id_volatile().id_class() ? this.id_catch() : null);
            }
            ((yX_2)this.id_class[id_protected[506]]).id_volatile();
        }
        while (((Qw_1)this.id_class[QY.id_protected[507]]).H.id_case()) {
            ((Qw_1)this.id_class[QY.id_protected[508]]).D = !((Qw_1)this.id_class[QY.id_protected[509]]).D ? id_case[65] : id_case[66];
        }
        for (n = id_case[67]; n < id_byte[16]; ++n) {
            boolean bl = ((Qw_1)this.id_class[QY.id_protected[510]]).w.id_protected();
            boolean bl2 = ((Qw_1)this.id_class[QY.id_protected[511]]).I.id_protected();
            if (!((Qw_1)this.id_class[QY.id_protected[512]]).t[n].id_case()) continue;
            if (((cb_3)this.id_class[id_protected[513]]).id_native()) {
                ((cq_3)this.id_class[id_protected[514]]).id_private().id_break(n);
                continue;
            }
            if (!((cb_3)this.id_class[id_protected[515]]).id_implements() || (vm_3)this.id_class[id_protected[516]] != null || !bl2 && !bl) {
                ((rhz_3)((cb_3)this.id_class[QY.id_protected[517]]).id_implements[QY.id_protected[518]]).id_protected = n;
                continue;
            }
            Fv_1.id_class(this, n, bl2, bl);
        }
        while (((Qw_1)this.id_class[QY.id_protected[519]]).A.id_case()) {
            if (!this.H()) {
                ((cb_3)this.id_class[id_protected[520]]).id_class((rgP_2)id_break[id_protected[521]], id_case[68]);
                continue;
            }
            this.id_break(new Fe_1());
        }
        while (((Qw_1)this.id_class[QY.id_protected[522]]).z.id_case()) {
            if (((Ax_1)this.id_class[id_protected[523]]).id_implements()) {
                ((cb_3)this.id_class[id_protected[524]]).id_else();
                continue;
            }
            this.id_break(new FH((cb_3)this.id_class[id_protected[525]]));
        }
        while (((Qw_1)this.id_class[QY.id_protected[526]]).q.id_case()) {
            this.id_break(new ca_3(((Aq_1)((cb_3)this.id_class[QY.id_protected[527]]).id_break[id_protected[528]]).id_private()));
        }
        while (((Qw_1)this.id_class[QY.id_protected[529]]).Q.id_case()) {
            if (((cb_3)this.id_class[id_protected[530]]).id_native()) continue;
            this.id_void().id_class(new rZb_1(rZM.SWAP_ITEM_WITH_OFFHAND, rfH_2.id_protected, rpr_3.DOWN));
        }
        while (((Qw_1)this.id_class[QY.id_protected[531]]).N.id_case()) {
            if (((cb_3)this.id_class[id_protected[532]]).id_native() || !((cb_3)this.id_class[id_protected[533]]).id_protected(vm_3.id_else())) continue;
            ((cb_3)this.id_class[id_protected[534]]).id_class(rpm_3.MAIN_HAND, id_case[69]);
        }
        int n2 = n = ((Qw_1)this.id_class[QY.id_protected[535]]).id_finally != rhJ_2.HIDDEN ? id_case[70] : id_case[71];
        if (n != 0) {
            while (((Qw_1)this.id_class[QY.id_protected[536]]).v.id_case()) {
                this.id_byte(id_throws[57]);
            }
            if ((vm_3)this.id_class[id_protected[537]] == null && (cT_2)this.id_class[id_protected[538]] == null && ((Qw_1)this.id_class[QY.id_protected[539]]).L.id_case()) {
                this.id_byte(id_throws[58]);
            }
        }
        if (((cb_3)this.id_class[id_protected[540]]).id_return()) {
            if (!((Qw_1)this.id_class[QY.id_protected[541]]).u.id_protected()) {
                ((Ax_1)this.id_class[id_protected[542]]).id_break((cb_3)this.id_class[id_protected[543]]);
            }
            while (((Qw_1)this.id_class[QY.id_protected[544]]).m.id_case()) {
            }
            while (((Qw_1)this.id_class[QY.id_protected[545]]).u.id_case()) {
            }
            while (((Qw_1)this.id_class[QY.id_protected[546]]).Z.id_case()) {
            }
        } else {
            while (((Qw_1)this.id_class[QY.id_protected[547]]).m.id_case()) {
                this.z();
            }
            while (((Qw_1)this.id_class[QY.id_protected[548]]).u.id_case()) {
                this.id_for();
            }
            while (((Qw_1)this.id_class[QY.id_protected[549]]).Z.id_case()) {
                this.K();
            }
        }
        if (((Qw_1)this.id_class[QY.id_protected[550]]).u.id_protected() && (Integer)this.id_class[id_protected[551]] == 0 && !((cb_3)this.id_class[id_protected[552]]).id_return()) {
            this.id_for();
        }
        this.id_protected((vm_3)this.id_class[id_protected[553]] == null && ((Qw_1)this.id_class[QY.id_protected[554]]).m.id_protected() && ((Qi_1)this.id_class[id_protected[555]]).id_case() ? id_case[72] : id_case[73]);
    }

    private static void l() {
        boolean[] blArray = new boolean[136];
        blArray[0] = true;
        blArray[1] = true;
        blArray[3] = true;
        blArray[4] = true;
        blArray[6] = true;
        blArray[9] = true;
        blArray[11] = true;
        blArray[14] = true;
        blArray[17] = true;
        blArray[19] = true;
        blArray[21] = true;
        blArray[24] = true;
        blArray[26] = true;
        blArray[28] = true;
        blArray[30] = true;
        blArray[31] = true;
        blArray[33] = true;
        blArray[39] = true;
        blArray[40] = true;
        blArray[41] = true;
        blArray[44] = true;
        blArray[47] = true;
        blArray[49] = true;
        blArray[51] = true;
        blArray[53] = true;
        blArray[55] = true;
        blArray[56] = true;
        blArray[57] = true;
        blArray[59] = true;
        blArray[60] = true;
        blArray[61] = true;
        blArray[62] = true;
        blArray[63] = true;
        blArray[65] = true;
        blArray[68] = true;
        blArray[70] = true;
        blArray[72] = true;
        blArray[76] = true;
        blArray[79] = true;
        blArray[84] = true;
        blArray[90] = true;
        blArray[91] = true;
        blArray[93] = true;
        blArray[95] = true;
        blArray[97] = true;
        blArray[99] = true;
        blArray[101] = true;
        blArray[104] = true;
        blArray[106] = true;
        blArray[107] = true;
        blArray[110] = true;
        blArray[111] = true;
        blArray[112] = true;
        blArray[114] = true;
        blArray[116] = true;
        blArray[117] = true;
        id_case = blArray;
    }

    public static boolean d() {
        return ((Qw_1)((QY)QY.id_break[QY.id_protected[614]]).id_class[QY.id_protected[615]]).id_case.id_class() >= VW.FABULOUS.id_class() ? id_case[97] : id_case[98];
    }

    private static void a() {
        id_catch = new int[]{0xA00000};
    }

    public yB_2 id_interface() {
        this.j();
        return (yB_2)this.id_class[id_protected[726]];
    }

    private void id_class(String string, rVv_1 rVv_12, Function<rrGk_1, rTH> function, Function4<rrGk_1, rVv_1, rAL, rTH, rrGP> function4, boolean bl, QD qD) {
        boolean bl2;
        QK qK;
        rrGk_1 rrGk_12;
        this.j();
        try {
            rrGk_12 = ((rrGd_1)this.id_class[id_protected[558]]).id_byte(string);
        }
        catch (IOException iOException) {
            ((Logger)id_break[id_protected[559]]).warn(id_throws[61], (Object)string, (Object)iOException);
            this.id_break((vm_3)null);
            return;
        }
        try {
            qK = this.id_class(rVv_12, function, function4, bl, rrGk_12);
        }
        catch (Exception exception) {
            ((Logger)id_break[id_protected[560]]).warn(id_throws[62], (Throwable)exception);
            this.id_break(new ZB(() -> this.id_class(string, rVv_12, function, function4, id_case[110], qD)));
            try {
                rrGk_12.close();
            }
            catch (IOException iOException) {
                ((Logger)id_break[id_protected[561]]).warn(id_throws[63], (Object)string, (Object)iOException);
            }
            return;
        }
        rrGP rrGP2 = qK.id_byte();
        boolean bl3 = rrGP2.id_long().id_implements();
        boolean bl4 = bl2 = rrGP2.id_float() != Lifecycle.stable() ? id_case[76] : id_case[77];
        if (qD == (QD)((Object)QD.staticFields25f7c1a34dee3bdaa6c7082af054c49d[id_protected[562]]) || !bl3 && !bl2) {
            Object object;
            Object object2;
            Object object3;
            Object object4;
            this.id_transient();
            ((AtomicReference)this.id_class[id_protected[563]]).set(null);
            try {
                rrGk_12.id_class(rVv_12, rrGP2);
                qK.id_break().id_implements();
                object4 = new YggdrasilAuthenticationService((Proxy)this.id_class[id_protected[564]]);
                object3 = object4.createMinecraftSessionService();
                object2 = object4.createProfileRepository();
                rCB rCB2 = new rCB((GameProfileRepository)object2, new File((File)this.id_class[id_protected[565]], rnW_2.id_class.getName()));
                rys_3.id_class(rCB2);
                rys_3.id_class((MinecraftSessionService)object3);
                rCB.id_class(id_case[78]);
                rng_3 rng_32 = rnW_2.id_class(arg_0 -> this.id_class(rVv_12, rrGk_12, qK, rrGP2, (MinecraftSessionService)object3, (GameProfileRepository)object2, rCB2, arg_0));
                this.id_class[QY.id_protected[566]] = rng_32;
                Boolean bl5 = id_case[79];
                this.id_class[QY.id_protected[567]] = bl5;
            }
            catch (Throwable throwable) {
                KY kY = KY.id_class(throwable, id_throws[64]);
                Ko_1 ko_1 = kY.id_class(id_throws[65]);
                ko_1.id_class(id_throws[66], string);
                ko_1.id_class(id_throws[67], rrGP2.id_volatile());
                throw new KU(kY);
            }
            while (((AtomicReference)this.id_class[id_protected[568]]).get() == null) {
                Thread.yield();
            }
            object4 = new vo_3((row_3)((AtomicReference)this.id_class[id_protected[569]]).get());
            this.id_break((vm_3)object4);
            while (!((rng_3)this.id_class[id_protected[570]]).W()) {
                ((vm_3)object4).id_private();
                this.id_throws(id_case[80]);
                try {
                    Thread.sleep(id_implements[3]);
                }
                catch (InterruptedException interruptedException) {
                    // empty catch block
                }
                if ((KY)this.id_class[id_protected[571]] == null) continue;
                QY.id_byte((KY)this.id_class[id_protected[572]]);
                return;
            }
            object3 = ((rng_3)this.id_class[id_protected[573]]).k().id_class();
            object2 = rud_3.id_class((SocketAddress)object3);
            ((rud_3)((Object)object2)).id_class(new Al_1((rud_3)((Object)object2), this, null, rgP_22 -> {}));
            ((rud_3)((Object)object2)).id_class(new rmJ_2(object3.toString(), id_case[81], ruv_3.LOGIN));
            ((rud_3)((Object)object2)).id_class(new rmu_3(this.id_while().id_throws()));
            this.id_class[QY.id_protected[574]] = object = object2;
        } else {
            this.id_class(qD, string, bl3, () -> this.id_class(string, rVv_12, function, function4, bl, (QD)((Object)((Object)QD.staticFields25f7c1a34dee3bdaa6c7082af054c49d[id_protected[736]]))));
            qK.close();
            try {
                rrGk_12.close();
            }
            catch (IOException iOException) {
                ((Logger)id_break[id_protected[575]]).warn(id_throws[68], (Object)string, (Object)iOException);
            }
        }
    }

    private void id_class(int n, long l) {
        this.j();
        ((Qw_1)this.id_class[QY.id_protected[204]]).id_strictfp = id_case[22];
        ((Qw_1)this.id_class[id_protected[205]]).id_break();
    }

    private rdn_3 id_class(rdn_3 rdn_32, ryO_2 ryO_22) {
        rcd_3 rcd_32 = ryO_22.id_class(new rcd_3());
        if (rdn_32.id_break() instanceof rkG_2 && rcd_32.id_throws(id_throws[78])) {
            rcd_3 rcd_33 = rcd_32.id_int(id_throws[79]);
            rdn_32.id_int().id_class(id_throws[80], rcd_33);
            return rdn_32;
        }
        rdn_32.id_class(id_throws[81], rcd_32);
        rcd_3 rcd_34 = new rcd_3();
        rcy_3 rcy_32 = new rcy_3();
        rcy_32.add(rca_3.id_class(id_throws[82]));
        rcd_34.id_class(id_throws[83], rcy_32);
        rdn_32.id_class(id_throws[84], rcd_34);
        return rdn_32;
    }

    private void id_class(QD qD, String string, boolean bl3, Runnable runnable) {
        if (qD == (QD)((Object)QD.staticFields25f7c1a34dee3bdaa6c7082af054c49d[id_protected[576]])) {
            rgn_3 rgn_32;
            rgn_3 rgn_33;
            if (bl3) {
                rgn_33 = new rgn_3(id_throws[69]);
                rgn_32 = new rgn_3(id_throws[70]);
            } else {
                rgn_33 = new rgn_3(id_throws[71]);
                rgn_32 = new rgn_3(id_throws[72]);
            }
            this.id_break(new my_3(null, (bl, bl2) -> {
                this.j();
                if (bl) {
                    ZA.id_class((rrGd_1)this.id_class[id_protected[735]], string);
                }
                runnable.run();
            }, rgn_33, rgn_32, id_case[82]));
        } else {
            this.id_break(new mT_2(bl -> {
                this.j();
                if (bl) {
                    runnable.run();
                } else {
                    this.id_break((vm_3)null);
                    try (rrGk_1 rrGk_12 = ((rrGd_1)this.id_class[id_protected[733]]).id_byte(string);){
                        rrGk_12.id_catch();
                    }
                    catch (IOException iOException) {
                        ((Logger)id_break[id_protected[734]]).error(id_throws[109], (Object)string, (Object)iOException);
                    }
                }
            }, new rgn_3(id_throws[73]), new rgn_3(id_throws[74]), cN_2.id_catch, cN_2.id_protected));
        }
    }

    public void id_class(String string, rYE rYE2, rVv_1 rVv_12, rrSp_1 rrSp_12) {
        this.id_class(string, rVv_12, rrGk_12 -> rYE2.id_catch(), (Function4<rrGk_1, rVv_1, rAL, rTH, rrGP>)((Function4)(rrGk_12, rVv_13, rAL2, rTH2) -> {
            rVp_1 rVp_12 = rVp_1.id_class(JsonOps.INSTANCE, rVv_12);
            rVq_1 rVq_12 = rVq_1.id_class(JsonOps.INSTANCE, rAL2, rVv_12);
            DataResult dataResult = rrSp_1.id_class.encodeStart(rVp_12, (Object)rrSp_12).setLifecycle(Lifecycle.stable()).flatMap(jsonElement -> rrSp_1.id_class.parse((DynamicOps)rVq_12, jsonElement));
            rrSp_1 rrSp_13 = dataResult.resultOrPartial((Consumer)((Object)rqR_2.id_class(id_throws[110], arg_0 -> ((Logger)((Logger)id_break[id_protected[739]])).error(arg_0)))).orElse(rrSp_12);
            return new rrGQ(rYE2, rrSp_13, dataResult.lifecycle());
        }), id_case[75], (QD)((Object)QD.staticFields25f7c1a34dee3bdaa6c7082af054c49d[id_protected[557]]));
    }

    @Override
    public void id_class(Qw_1 qw_1) {
        this.j();
        Qw_1 qw_12 = qw_1;
        this.id_class[QY.id_protected[732]] = qw_12;
    }

    @Override
    public void id_class(Ak_1 ak_1) {
        this.j();
        Ak_1 ak_12 = ak_1;
        this.id_class[QY.id_protected[650]] = ak_12;
        Ak_1 ak_13 = ak_1;
        rrfp_3.id_class[QY.id_protected[651]] = ak_13;
    }

    public void id_class(Throwable throwable, rgP_2 rgP_22) {
        this.j();
        ((Logger)id_break[id_protected[186]]).info(id_throws[20], throwable);
        ((rAt_1)this.id_class[id_protected[187]]).id_class(Collections.emptyList());
        ((Qw_1)this.id_class[QY.id_protected[188]]).id_private.clear();
        ((Qw_1)this.id_class[QY.id_protected[189]]).id_implements.clear();
        ((Qw_1)this.id_class[id_protected[190]]).id_break();
        this.id_private().thenRun(() -> {});
    }

    @Override
    public <T> Vo_1<T> id_class(gx_3<T> gx_32) {
        this.j();
        return ((gJ_2)this.id_class[id_protected[706]]).id_class(gx_32);
    }

    @Override
    public void id_class(cq_3 cq_32) {
        this.j();
        cq_3 cq_33 = cq_32;
        this.id_class[QY.id_protected[731]] = cq_33;
    }

    @Override
    public void id_class(rqN_2 rqN_22) {
        this.j();
        rqN_2 rqN_23 = rqN_22;
        this.id_class[QY.id_protected[658]] = rqN_23;
    }

    private static rAp_1 id_class(String string, boolean bl, Supplier<rAC> supplier, rAC rAC2, rAK rAK2, rAT rAT2, rAZ rAZ2) {
        int n = rAK2.id_break();
        Supplier<rAC> supplier2 = supplier;
        if (n <= id_byte[21]) {
            supplier2 = QY.id_protected(supplier);
        }
        if (n <= id_byte[22]) {
            supplier2 = QY.id_break(supplier2);
        }
        return new rAp_1(string, bl, supplier2, rAC2, rAK2, rAT2, rAZ2);
    }

    public static void id_class(jV_2 jV_22, String string, Qw_1 qw_1, KY kY) {
        Ko_1 ko_1 = kY.id_case();
        ko_1.id_class(id_throws[85], () -> string);
        ko_1.id_class(id_throws[86], RenderSystem::getBackendDescription);
        ko_1.id_class(id_throws[87], RenderSystem::getApiDescription);
        ko_1.id_class(id_throws[88], RenderSystem::getCapsString);
        ko_1.id_class(id_throws[89], () -> id_throws[108]);
        ko_1.id_class(id_throws[90], () -> {
            String string = Qn_1.id_class();
            if (!id_throws[105].equals(string)) {
                return "Definitely; Client brand changed to '" + string + "'";
            }
            return QY.class.getSigners() == null ? id_throws[106] : id_throws[107];
        });
        ko_1.id_class(id_throws[91], id_throws[92]);
        if (qw_1 != null) {
            String string2;
            if ((QY)id_break[id_protected[643]] != null && (string2 = ((QY)id_break[id_protected[644]]).id_new().id_volatile()) != null) {
                ko_1.id_class(id_throws[93], string2);
            }
            ko_1.id_class(id_throws[94], (Object)qw_1.id_case);
            ko_1.id_class(id_throws[95], () -> {
                StringBuilder stringBuilder = new StringBuilder();
                for (String string : qw_1.id_private) {
                    if (stringBuilder.length() > 0) {
                        stringBuilder.append(id_throws[103]);
                    }
                    stringBuilder.append(string);
                    if (!qw_1.id_implements.contains(string)) continue;
                    stringBuilder.append(id_throws[104]);
                }
                return stringBuilder.toString();
            });
        }
        if (jV_22 != null) {
            ko_1.id_class(id_throws[96], () -> jV_22.id_break().toString());
        }
        ko_1.id_class(id_throws[97], Oh_1::id_break);
    }

    public static rTH id_class(rrGk_1 rrGk_12) {
        rnW_2.id_class(rrGk_12);
        rTH rTH2 = rrGk_12.id_throws();
        if (rTH2 == null) {
            throw new IllegalStateException(id_throws[59]);
        }
        return rTH2;
    }

    public boolean id_class(an_3 an_32) {
        this.j();
        return an_32.w() || (cb_3)this.id_class[id_protected[698]] != null && ((cb_3)this.id_class[id_protected[699]]).id_native() && ((Qw_1)this.id_class[QY.id_protected[700]]).p.id_protected() && an_32.BC() == aI_2.rM ? id_case[104] : id_case[105];
    }

    private /* synthetic */ rng_3 id_class(rVv_1 rVv_12, rrGk_1 rrGk_12, QK qK, rrGP rrGP2, MinecraftSessionService minecraftSessionService, GameProfileRepository gameProfileRepository, rCB rCB2, Thread thread) {
        return new rng_3(thread, this, rVv_12, rrGk_12, qK.id_class(), qK.id_break(), rrGP2, minecraftSessionService, gameProfileRepository, rCB2, n -> {
            this.j();
            row_3 row_32 = new row_3(n);
            row_32.id_break();
            ((AtomicReference)this.id_class[id_protected[737]]).set(row_32);
            return new rop_3(row_32, ((Queue)this.id_class[id_protected[738]])::add);
        });
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x1712455253ECC58L;
    }

    @Override
    public void id_class(gm_3 gm_32) {
        this.j();
        ((C_break)C_break.staticFieldsf9703d96375232b196815afd59d1eb48[id_protected[577]]).id_break(gm_32);
        vY_2 vY_22 = new vY_2();
        vY_22.id_break(new rgn_3(id_throws[75]));
        this.id_protected(vY_22);
        gm_3 gm_33 = gm_32;
        this.id_class[QY.id_protected[578]] = gm_33;
        this.id_break(gm_32);
        if (!((Boolean)this.id_class[id_protected[579]]).booleanValue()) {
            YggdrasilAuthenticationService yggdrasilAuthenticationService = new YggdrasilAuthenticationService((Proxy)this.id_class[id_protected[580]]);
            MinecraftSessionService minecraftSessionService = yggdrasilAuthenticationService.createMinecraftSessionService();
            GameProfileRepository gameProfileRepository = yggdrasilAuthenticationService.createProfileRepository();
            rCB rCB2 = new rCB(gameProfileRepository, new File((File)this.id_class[id_protected[581]], rnW_2.id_class.getName()));
            rys_3.id_class(rCB2);
            rys_3.id_class(minecraftSessionService);
            rCB.id_class(id_case[85]);
        }
        ((C_break)C_break.staticFieldsf9703d96375232b196815afd59d1eb48[id_protected[582]]).id_class(gm_32);
    }

    public Function<rqO_2, fj_3> id_class(rqO_2 rqO_22) {
        this.j();
        return ((Ip_1)this.id_class[id_protected[670]]).id_class(rqO_22)::id_break;
    }

    private UserApiService id_class(YggdrasilAuthenticationService yggdrasilAuthenticationService, Qy_1 qy_1) {
        try {
            return yggdrasilAuthenticationService.createUserApiService(qy_1.id_class.id_class.id_protected());
        }
        catch (AuthenticationException authenticationException) {
            return UserApiService.OFFLINE;
        }
    }

    public String id_class() {
        this.j();
        return (String)this.id_class[id_protected[207]];
    }

    private static /* synthetic */ void id_class(CompletableFuture completableFuture) {
        completableFuture.complete(null);
    }

    @Override
    public void id_class(Qg_1 qg_1) {
        this.j();
        Qg_1 qg_12 = qg_1;
        this.id_class[QY.id_protected[730]] = qg_12;
    }

    @Override
    public void id_class(boolean bl) {
        this.j();
        Boolean bl2 = bl;
        this.id_class[QY.id_protected[720]] = bl2;
    }

    @Override
    public void id_class(vm_3 vm_32) {
        this.id_break(vm_32);
        this.id_throws(id_case[89]);
    }

    public boolean id_class(UUID uUID) {
        this.j();
        if (this.id_final()) {
            return ((FU)this.id_class[id_protected[602]]).id_byte(uUID);
        }
        return ((cb_3)this.id_class[id_protected[603]] == null || !uUID.equals(((cb_3)this.id_class[id_protected[604]]).ro())) && !uUID.equals(rqR_2.id_break) ? id_case[91] : id_case[92];
    }

    @Override
    public void id_class(Runnable runnable) {
        ((ConcurrentLinkedQueue)id_break[id_protected[729]]).add(runnable);
    }

    public KY id_class(KY kY) {
        this.j();
        QY.id_class((jV_2)this.id_class[id_protected[638]], (String)this.id_class[id_protected[639]], (Qw_1)this.id_class[id_protected[640]], kY);
        if ((gm_3)this.id_class[id_protected[641]] != null) {
            ((gm_3)this.id_class[id_protected[642]]).id_class(kY);
        }
        return kY;
    }

    @Override
    public void id_class(cT_2 cT_22) {
        this.j();
        cT_2 cT_23 = cT_22;
        this.id_class[QY.id_protected[243]] = cT_23;
    }

    public QK id_class(rVv_1 rVv_12, Function<rrGk_1, rTH> function, Function4<rrGk_1, rVv_1, rAL, rTH, rrGP> function4, boolean bl, rrGk_1 rrGk_12) throws ExecutionException, InterruptedException {
        rTH rTH2 = function.apply(rrGk_12);
        rAm_1[] rAm_1Array = new rAm_1[id_byte[17]];
        rAm_1Array[QY.id_case[83]] = new rAf_1();
        rAm_1Array[QY.id_case[84]] = new rAz_1(rrGk_12.id_class(rrGr_1.id_catch).toFile(), rAZ.id_byte);
        rAt_1 rAt_12 = new rAt_1(rAm_1Array);
        try {
            rTH rTH3 = rnW_2.id_class(rAt_12, rTH2, bl);
            CompletableFuture<rAh_1> completableFuture = rAh_1.id_class(rAt_12.id_case(), gq_3.INTEGRATED, id_byte[18], rqR_2.id_case(), this);
            this.id_byte(completableFuture::isDone);
            rAh_1 rAh_12 = completableFuture.get();
            rrGP rrGP2 = (rrGP)function4.apply((Object)rrGk_12, (Object)rVv_12, (Object)rAh_12.id_private(), (Object)rTH3);
            return new QK(rAt_12, rAh_12, rrGP2);
        }
        catch (InterruptedException | ExecutionException exception) {
            rAt_12.close();
            throw exception;
        }
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{57, -97, -33, 29, -1, -79, -69, 69}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    @Override
    public void id_class(int n) {
        this.j();
        Integer n2 = n;
        this.id_class[QY.id_protected[728]] = n2;
    }

    @Override
    private void id_class(Throwable throwable) {
        this.j();
        if (((rAt_1)this.id_class[id_protected[185]]).id_protected().size() > id_case[17]) {
            rgN_2 rgN_22 = throwable instanceof rAV ? new rgN_2(((rAV)throwable).id_class().id_class()) : null;
            this.id_class(throwable, rgN_22);
        } else {
            rqR_2.id_break(throwable);
        }
    }

    public static rrGP id_class(rrGk_1 rrGk_12, rVv_1 rVv_12, rAL rAL2, rTH rTH2) {
        rVq_1<rcZ_2> rVq_12 = rVq_1.id_class(rcf_3.id_class, rAL2, rVv_12);
        rrGP rrGP2 = rrGk_12.id_class(rVq_12, rTH2);
        if (rrGP2 == null) {
            throw new IllegalStateException(id_throws[60]);
        }
        return rrGP2;
    }

    public void m() {
        this.j();
        try {
            ((Logger)id_break[id_protected[244]]).info(id_throws[37]);
            try {
                if ((gm_3)this.id_class[id_protected[245]] != null) {
                    ((gm_3)this.id_class[id_protected[246]]).id_catch();
                }
                this.id_transient();
            }
            catch (Throwable throwable) {
                // empty catch block
            }
            if ((vm_3)this.id_class[id_protected[247]] != null) {
                ((vm_3)this.id_class[id_protected[248]]).w_();
                ((vm_3)this.id_class[id_protected[249]]).id_this();
            }
            this.close();
        }
        catch (Throwable throwable) {
            rqR_2.id_class = System::nanoTime;
            if ((KY)this.id_class[id_protected[251]] == null) {
                System.exit(id_case[36]);
            }
            throw throwable;
        }
        rqR_2.id_class = System::nanoTime;
        if ((KY)this.id_class[id_protected[250]] == null) {
            System.exit(id_case[35]);
        }
    }

    private static void p() {
        id_throws = new String[]{new String("Client"), new String(""), new String("root"), new String("server-resource-packs"), new String("Setting user: {}"), new String("(Session ID is {})"), new String("Backend library: {}"), new String("icons/icon_16x16.png"), new String("icons/icon_32x32.png"), new String("Couldn't set icon"), new String("skins"), new String("saves"), new String("backups"), new String("Startup"), new String("Post startup"), new String("Celestial Client"), new String(" - Build: "), new String("1.1"), new String(" ("), new String(")"), new String("Caught error loading resourcepacks, removing all selected resourcepacks"), new String("Out of memory"), new String("Reported exception thrown!"), new String("Unexpected error"), new String("Unreported exception thrown!"), new String("sun.arch.data.model"), new String("com.ibm.vm.bitmode"), new String("os.arch"), new String("64"), new String("crash-reports"), new String("yyyy-MM-dd_HH.mm.ss"), new String("#@?@# Game crashed! Crash report could not be saved. #@?@#"), new String("Missing model for: {}"), new String("Missing particle icon for: {}"), new String("Missing translation for: {} {} {}"), new String("Your game data is foobar, fix the errors above!"), new String("chat.cannotSend"), new String("Stopping!"), new String("Shutdown failure!"), new String("Pre render"), new String("Render"), new String("Post render"), new String("%d fps T: %s%s%s%s B: %d"), new String("inf"), new String(" vsync"), new String(""), new String(""), new String(" fast-clouds"), new String(" fancy-clouds"), new String("menu.savingLevel"), new String("Null returned as 'hitResult', this shouldn't happen!"), new String("Null returned as 'hitResult', this shouldn't happen!"), new String("Ticking screen"), new String("Exception in world tick"), new String("Affected level"), new String("Problem"), new String("Level is null!"), new String(""), new String("/"), new String("Failed to load data pack config"), new String("Failed to load world"), new String("Failed to read level {} data"), new String("Failed to load datapacks, can't proceed with server load"), new String("Failed to unlock access to level {}"), new String("Starting integrated server"), new String("Starting integrated server"), new String("Level ID"), new String("Level Name"), new String("Failed to unlock access to level {}"), new String("selectWorld.backupQuestion.customized"), new String("selectWorld.backupWarning.customized"), new String("selectWorld.backupQuestion.experimental"), new String("selectWorld.backupWarning.experimental"), new String("selectWorld.backupQuestion.experimental"), new String("selectWorld.backupWarning.experimental"), new String("connect.joining"), new String(""), new String("Picking on: [{}] {} gave null item"), new String("SkullOwner"), new String("SkullOwner"), new String("SkullOwner"), new String("BlockEntityTag"), new String("\"(+NBT)\""), new String("Lore"), new String("display"), new String("Launched Version"), new String("Backend library"), new String("Backend API"), new String("GL Caps"), new String("Using VBOs"), new String("Is Modded"), new String("Type"), new String("Client (map_client.txt)"), new String("GPU Warnings"), new String("Graphics mode"), new String("Resource Packs"), new String("Current Language"), new String("CPU"), new String("hosting_lan"), new String("singleplayer"), new String("playing_lan"), new String("multiplayer"), new String("out_of_game"), new String(", "), new String(" (incompatible)"), new String("vanilla"), new String("Very likely; Jar signature invalidated"), new String("Probably not. Jar signature remains and client brand is untouched."), new String("Yes"), new String("Failed to delete world {}"), new String("Error reading worldgen settings after loading data packs: "), new String("id_default"), new String("uniform"), new String("multiplayer.socialInteractions.not_available")};
    }

    public rpN_2 k() {
        this.j();
        return (rpN_2)this.id_class[id_protected[707]];
    }

    public float id_default() {
        this.j();
        return ((rqw_3)this.id_class[QY.id_protected[710]]).id_break;
    }

    @Override
    public void v() {
        this.j();
        int n = ((Qg_1)this.id_class[id_protected[329]]).id_class(((Qw_1)this.id_class[QY.id_protected[330]]).rs, this.id_continue());
        ((Qg_1)this.id_class[id_protected[331]]).id_class((double)n);
        VC vC = this.B();
        vC.id_class(((Qg_1)this.id_class[id_protected[332]]).id_extends(), ((Qg_1)this.id_class[id_protected[333]]).id_native(), (Boolean)id_break[id_protected[334]]);
        ((Hh_1)this.id_class[id_protected[335]]).id_class(((Qg_1)this.id_class[id_protected[336]]).id_extends(), ((Qg_1)this.id_class[id_protected[337]]).id_native());
        ((Qi_1)this.id_class[id_protected[338]]).id_throws();
        if ((vm_3)this.id_class[id_protected[339]] != null) {
            ((vm_3)this.id_class[id_protected[340]]).id_class(this, ((Qg_1)this.id_class[id_protected[341]]).id_super(), ((Qg_1)this.id_class[id_protected[342]]).id_this());
        }
    }

    private void j() {
        if (this.id_class == null) {
            this.id_class = new Object[88];
            this.id_class[30] = false;
            this.id_class[31] = false;
            this.id_class[32] = false;
            this.id_class[33] = false;
            this.id_class[61] = false;
            this.id_class[65] = 0;
            this.id_class[66] = 0;
            this.id_class[67] = false;
            this.id_class[68] = Float.valueOf(0.0f);
            this.id_class[69] = 0L;
            this.id_class[70] = 0L;
            this.id_class[71] = 0;
            this.id_class[72] = false;
            this.id_class[77] = false;
            this.id_class[80] = false;
            this.id_class[81] = false;
            this.id_class[82] = false;
            this.id_class[83] = false;
            this.id_class[87] = 0L;
        }
    }

    private static void q() {
        short[] sArray = new short[742];
        sArray[0] = 6;
        sArray[1] = 13;
        sArray[2] = 18;
        sArray[3] = 29;
        sArray[4] = 53;
        sArray[5] = 69;
        sArray[6] = 77;
        sArray[7] = 79;
        sArray[8] = 82;
        sArray[9] = 84;
        sArray[10] = 86;
        sArray[12] = 24;
        sArray[14] = 25;
        sArray[15] = 26;
        sArray[16] = 1;
        sArray[17] = 24;
        sArray[18] = 35;
        sArray[19] = 35;
        sArray[21] = 36;
        sArray[22] = 27;
        sArray[23] = 27;
        sArray[24] = 46;
        sArray[25] = 47;
        sArray[26] = 14;
        sArray[27] = 1;
        sArray[28] = 14;
        sArray[29] = 1;
        sArray[30] = 14;
        sArray[31] = 31;
        sArray[32] = 32;
        sArray[33] = 33;
        sArray[34] = 30;
        sArray[35] = 58;
        sArray[36] = 3;
        sArray[37] = 76;
        sArray[38] = 24;
        sArray[39] = 20;
        sArray[40] = 24;
        sArray[41] = 3;
        sArray[42] = 21;
        sArray[43] = 1;
        sArray[44] = 20;
        sArray[45] = 20;
        sArray[46] = 20;
        sArray[47] = 20;
        sArray[48] = 4;
        sArray[49] = 4;
        sArray[50] = 20;
        sArray[51] = 5;
        sArray[52] = 5;
        sArray[53] = 1;
        sArray[54] = 5;
        sArray[55] = 20;
        sArray[56] = 22;
        sArray[57] = 22;
        sArray[58] = 5;
        sArray[59] = 23;
        sArray[60] = 23;
        sArray[61] = 5;
        sArray[62] = 20;
        sArray[63] = 5;
        sArray[64] = 5;
        sArray[65] = 2;
        sArray[66] = 40;
        sArray[67] = 40;
        sArray[68] = 34;
        sArray[69] = 36;
        sArray[70] = 20;
        sArray[71] = 36;
        sArray[72] = 20;
        sArray[73] = 37;
        sArray[74] = 34;
        sArray[75] = 37;
        sArray[76] = 34;
        sArray[77] = 2;
        sArray[78] = 34;
        sArray[79] = 2;
        sArray[80] = 2;
        sArray[81] = 46;
        sArray[82] = 48;
        sArray[83] = 24;
        sArray[84] = 24;
        sArray[85] = 3;
        sArray[86] = 28;
        sArray[87] = 34;
        sArray[88] = 20;
        sArray[89] = 41;
        sArray[90] = 34;
        sArray[91] = 41;
        sArray[92] = 14;
        sArray[93] = 44;
        sArray[94] = 34;
        sArray[95] = 44;
        sArray[96] = 42;
        sArray[97] = 2;
        sArray[98] = 43;
        sArray[99] = 43;
        sArray[100] = 15;
        sArray[101] = 34;
        sArray[102] = 43;
        sArray[103] = 34;
        sArray[104] = 34;
        sArray[105] = 5;
        sArray[106] = 5;
        sArray[107] = 5;
        sArray[108] = 5;
        sArray[109] = 38;
        sArray[110] = 38;
        sArray[111] = 39;
        sArray[112] = 2;
        sArray[113] = 38;
        sArray[114] = 20;
        sArray[115] = 49;
        sArray[116] = 34;
        sArray[117] = 49;
        sArray[118] = 2;
        sArray[119] = 49;
        sArray[120] = 39;
        sArray[121] = 10;
        sArray[122] = 2;
        sArray[123] = 10;
        sArray[124] = 34;
        sArray[125] = 15;
        sArray[126] = 20;
        sArray[127] = 9;
        sArray[128] = 11;
        sArray[129] = 34;
        sArray[130] = 10;
        sArray[131] = 7;
        sArray[132] = 34;
        sArray[133] = 7;
        sArray[134] = 16;
        sArray[135] = 34;
        sArray[136] = 16;
        sArray[137] = 47;
        sArray[138] = 54;
        sArray[139] = 49;
        sArray[140] = 38;
        sArray[141] = 50;
        sArray[142] = 34;
        sArray[143] = 50;
        sArray[144] = 7;
        sArray[145] = 8;
        sArray[146] = 34;
        sArray[147] = 8;
        sArray[148] = 34;
        sArray[149] = 13;
        sArray[150] = 56;
        sArray[151] = 2;
        sArray[152] = 12;
        sArray[153] = 34;
        sArray[154] = 12;
        sArray[155] = 2;
        sArray[156] = 51;
        sArray[157] = 34;
        sArray[158] = 51;
        sArray[159] = 2;
        sArray[160] = 52;
        sArray[161] = 34;
        sArray[162] = 52;
        sArray[163] = 45;
        sArray[164] = 34;
        sArray[165] = 45;
        sArray[166] = 19;
        sArray[167] = 17;
        sArray[168] = 20;
        sArray[169] = 5;
        sArray[170] = 5;
        sArray[171] = 20;
        sArray[172] = 5;
        sArray[173] = 5;
        sArray[174] = 20;
        sArray[175] = 5;
        sArray[176] = 20;
        sArray[177] = 5;
        sArray[178] = 36;
        sArray[179] = 34;
        sArray[180] = 5;
        sArray[183] = 5;
        sArray[184] = 5;
        sArray[185] = 36;
        sArray[186] = 1;
        sArray[187] = 36;
        sArray[188] = 20;
        sArray[189] = 20;
        sArray[190] = 20;
        sArray[191] = 76;
        sArray[192] = 77;
        sArray[193] = 78;
        sArray[194] = 78;
        sArray[195] = 1;
        sArray[196] = 1;
        sArray[197] = 1;
        sArray[198] = 43;
        sArray[199] = 3;
        sArray[200] = 4;
        sArray[201] = 13;
        sArray[202] = 13;
        sArray[203] = 13;
        sArray[204] = 20;
        sArray[205] = 20;
        sArray[206] = 40;
        sArray[207] = 25;
        sArray[208] = 26;
        sArray[209] = 78;
        sArray[210] = 24;
        sArray[211] = 20;
        sArray[212] = 85;
        sArray[213] = 85;
        sArray[214] = 75;
        sArray[215] = 85;
        sArray[216] = 36;
        sArray[217] = 36;
        sArray[218] = 34;
        sArray[219] = 5;
        sArray[220] = 1;
        sArray[221] = 1;
        sArray[222] = 1;
        sArray[223] = 28;
        sArray[224] = 57;
        sArray[225] = 57;
        sArray[226] = 73;
        sArray[227] = 73;
        sArray[228] = 73;
        sArray[229] = 56;
        sArray[230] = 57;
        sArray[231] = 57;
        sArray[232] = 56;
        sArray[233] = 57;
        sArray[234] = 20;
        sArray[235] = 19;
        sArray[236] = 73;
        sArray[237] = 22;
        sArray[238] = 5;
        sArray[239] = 5;
        sArray[240] = 72;
        sArray[241] = 41;
        sArray[242] = 22;
        sArray[243] = 75;
        sArray[244] = 1;
        sArray[245] = 56;
        sArray[246] = 56;
        sArray[247] = 73;
        sArray[248] = 73;
        sArray[249] = 73;
        sArray[250] = 78;
        sArray[251] = 78;
        sArray[252] = 49;
        sArray[253] = 43;
        sArray[254] = 16;
        sArray[255] = 8;
        sArray[256] = 41;
        sArray[257] = 36;
        sArray[258] = 12;
        sArray[259] = 52;
        sArray[260] = 51;
        sArray[261] = 2;
        sArray[262] = 34;
        sArray[263] = 4;
        sArray[264] = 5;
        sArray[265] = 1;
        sArray[266] = 4;
        sArray[267] = 5;
        sArray[268] = 5;
        sArray[269] = 87;
        sArray[270] = 87;
        sArray[272] = 5;
        sArray[273] = 85;
        sArray[274] = 75;
        sArray[275] = 85;
        sArray[276] = 85;
        sArray[277] = 84;
        sArray[278] = 6;
        sArray[279] = 22;
        sArray[280] = 5;
        sArray[281] = 41;
        sArray[282] = 16;
        sArray[283] = 16640;
        sArray[284] = 2;
        sArray[285] = 40;
        sArray[286] = 72;
        sArray[287] = 16;
        sArray[288] = 67;
        sArray[289] = 68;
        sArray[290] = 6;
        sArray[291] = 40;
        sArray[292] = 40;
        sArray[293] = 5;
        sArray[294] = 5;
        sArray[295] = 5;
        sArray[296] = 5;
        sArray[297] = 71;
        sArray[298] = 71;
        sArray[299] = 73;
        sArray[300] = 73;
        sArray[301] = 75;
        sArray[302] = 75;
        sArray[303] = 58;
        sArray[304] = 67;
        sArray[305] = 67;
        sArray[306] = 6;
        sArray[307] = 68;
        sArray[308] = 6;
        sArray[309] = 68;
        sArray[310] = 67;
        sArray[311] = 29;
        sArray[312] = 69;
        sArray[313] = 69;
        sArray[314] = 70;
        sArray[315] = 71;
        sArray[316] = 9;
        sArray[317] = 9;
        sArray[318] = 20;
        sArray[319] = 20;
        sArray[320] = 20;
        sArray[321] = 20;
        sArray[322] = 20;
        sArray[323] = 20;
        sArray[324] = 20;
        sArray[325] = 79;
        sArray[326] = 70;
        sArray[327] = 70;
        sArray[328] = 71;
        sArray[329] = 5;
        sArray[330] = 20;
        sArray[331] = 5;
        sArray[332] = 5;
        sArray[333] = 5;
        sArray[334] = 2;
        sArray[335] = 16;
        sArray[336] = 5;
        sArray[337] = 5;
        sArray[338] = 22;
        sArray[339] = 73;
        sArray[340] = 73;
        sArray[341] = 5;
        sArray[342] = 5;
        sArray[343] = 22;
        sArray[344] = 5;
        sArray[345] = 56;
        sArray[346] = 73;
        sArray[347] = 75;
        sArray[348] = 8;
        sArray[349] = 8;
        sArray[350] = 61;
        sArray[351] = 58;
        sArray[352] = 58;
        sArray[353] = 77;
        sArray[354] = 77;
        sArray[355] = 73;
        sArray[356] = 58;
        sArray[357] = 41;
        sArray[358] = 66;
        sArray[359] = 66;
        sArray[360] = 57;
        sArray[361] = 64;
        sArray[362] = 64;
        sArray[363] = 64;
        sArray[364] = 56;
        sArray[367] = 55;
        sArray[368] = 12;
        sArray[369] = 57;
        sArray[371] = 1;
        sArray[372] = 55;
        sArray[373] = 66;
        sArray[374] = 64;
        sArray[375] = 1;
        sArray[376] = 55;
        sArray[377] = 66;
        sArray[378] = 57;
        sArray[380] = 64;
        sArray[381] = 55;
        sArray[382] = 57;
        sArray[383] = 64;
        sArray[384] = 64;
        sArray[385] = 56;
        sArray[386] = 55;
        sArray[387] = 55;
        sArray[388] = 66;
        sArray[389] = 57;
        sArray[390] = 64;
        sArray[391] = 55;
        sArray[393] = 65;
        sArray[394] = 57;
        sArray[395] = 64;
        sArray[396] = 1;
        sArray[397] = 57;
        sArray[399] = 64;
        sArray[401] = 64;
        sArray[402] = 64;
        sArray[403] = 55;
        sArray[404] = 57;
        sArray[405] = 55;
        sArray[406] = 57;
        sArray[407] = 57;
        sArray[408] = 64;
        sArray[409] = 55;
        sArray[410] = 57;
        sArray[411] = 56;
        sArray[412] = 57;
        sArray[413] = 55;
        sArray[414] = 16;
        sArray[415] = 55;
        sArray[417] = 57;
        sArray[418] = 16;
        sArray[420] = 42;
        sArray[421] = 7;
        sArray[422] = 7;
        sArray[424] = 65;
        sArray[425] = 65;
        sArray[426] = 65;
        sArray[427] = 67;
        sArray[428] = 19;
        sArray[429] = 16;
        sArray[430] = 67;
        sArray[431] = 56;
        sArray[432] = 55;
        sArray[433] = 56;
        sArray[434] = 2;
        sArray[435] = 73;
        sArray[436] = 57;
        sArray[437] = 57;
        sArray[438] = 73;
        sArray[439] = 57;
        sArray[440] = 56;
        sArray[441] = 73;
        sArray[442] = 73;
        sArray[443] = 57;
        sArray[444] = 73;
        sArray[445] = 10000;
        sArray[446] = 66;
        sArray[447] = 73;
        sArray[448] = 73;
        sArray[449] = 20;
        sArray[450] = 19;
        sArray[451] = 75;
        sArray[452] = 73;
        sArray[453] = 57;
        sArray[455] = 73;
        sArray[457] = 73;
        sArray[458] = 66;
        sArray[459] = 66;
        sArray[460] = 66;
        sArray[461] = 56;
        sArray[462] = 67;
        sArray[463] = 16;
        sArray[464] = 67;
        sArray[465] = 8;
        sArray[466] = 67;
        sArray[467] = 56;
        sArray[468] = 56;
        sArray[469] = 56;
        sArray[470] = 56;
        sArray[471] = 16;
        sArray[472] = 16;
        sArray[473] = 67;
        sArray[474] = 42;
        sArray[475] = 41;
        sArray[476] = 67;
        sArray[477] = 56;
        sArray[478] = 67;
        sArray[479] = 20;
        sArray[480] = 20;
        sArray[481] = 20;
        sArray[482] = 56;
        sArray[483] = 56;
        sArray[484] = 56;
        sArray[485] = 67;
        sArray[486] = 56;
        sArray[487] = 56;
        sArray[488] = 57;
        sArray[489] = 57;
        sArray[490] = 57;
        sArray[491] = 67;
        sArray[492] = 12;
        sArray[493] = 60;
        sArray[494] = 60;
        sArray[495] = 23;
        sArray[496] = 61;
        sArray[497] = 58;
        sArray[498] = 58;
        sArray[499] = 20;
        sArray[500] = 20;
        sArray[501] = 20;
        sArray[502] = 20;
        sArray[503] = 20;
        sArray[504] = 16;
        sArray[505] = 20;
        sArray[506] = 8;
        sArray[507] = 20;
        sArray[508] = 20;
        sArray[509] = 20;
        sArray[510] = 20;
        sArray[511] = 20;
        sArray[512] = 20;
        sArray[513] = 57;
        sArray[514] = 19;
        sArray[515] = 57;
        sArray[516] = 73;
        sArray[517] = 57;
        sArray[518] = 1;
        sArray[519] = 20;
        sArray[520] = 57;
        sArray[521] = 6;
        sArray[522] = 20;
        sArray[523] = 55;
        sArray[524] = 57;
        sArray[525] = 57;
        sArray[526] = 20;
        sArray[527] = 57;
        sArray[529] = 20;
        sArray[530] = 57;
        sArray[531] = 20;
        sArray[532] = 57;
        sArray[533] = 57;
        sArray[534] = 57;
        sArray[535] = 20;
        sArray[536] = 20;
        sArray[537] = 73;
        sArray[538] = 75;
        sArray[539] = 20;
        sArray[540] = 57;
        sArray[541] = 20;
        sArray[542] = 55;
        sArray[543] = 57;
        sArray[544] = 20;
        sArray[545] = 20;
        sArray[546] = 20;
        sArray[547] = 20;
        sArray[548] = 20;
        sArray[549] = 20;
        sArray[550] = 20;
        sArray[551] = 65;
        sArray[552] = 57;
        sArray[553] = 73;
        sArray[554] = 20;
        sArray[555] = 22;
        sArray[556] = 2;
        sArray[557] = 1;
        sArray[558] = 28;
        sArray[559] = 1;
        sArray[560] = 1;
        sArray[561] = 1;
        sArray[563] = 18;
        sArray[564] = 27;
        sArray[565] = 24;
        sArray[566] = 58;
        sArray[567] = 61;
        sArray[568] = 18;
        sArray[569] = 18;
        sArray[570] = 58;
        sArray[571] = 78;
        sArray[572] = 78;
        sArray[573] = 58;
        sArray[574] = 60;
        sArray[575] = 1;
        sArray[576] = 2;
        sArray[578] = 56;
        sArray[579] = 61;
        sArray[580] = 27;
        sArray[581] = 24;
        sArray[583] = 58;
        sArray[584] = 58;
        sArray[585] = 16;
        sArray[586] = 55;
        sArray[587] = 56;
        sArray[589] = 56;
        sArray[590] = 35;
        sArray[591] = 19;
        sArray[592] = 59;
        sArray[593] = 61;
        sArray[594] = 53;
        sArray[595] = 56;
        sArray[596] = 57;
        sArray[597] = 41;
        sArray[598] = 62;
        sArray[599] = 60;
        sArray[600] = 8;
        sArray[601] = 12;
        sArray[602] = 54;
        sArray[603] = 57;
        sArray[604] = 57;
        sArray[605] = 33;
        sArray[606] = 31;
        sArray[607] = 57;
        sArray[608] = 57;
        sArray[611] = 20;
        sArray[613] = 20;
        sArray[615] = 20;
        sArray[617] = 20;
        sArray[618] = 64;
        sArray[619] = 64;
        sArray[620] = 57;
        sArray[621] = 18;
        sArray[622] = 64;
        sArray[623] = 64;
        sArray[624] = 56;
        sArray[625] = 56;
        sArray[626] = 56;
        sArray[627] = 64;
        sArray[628] = 1;
        sArray[629] = 56;
        sArray[630] = 64;
        sArray[631] = 64;
        sArray[632] = 1;
        sArray[633] = 57;
        sArray[634] = 1;
        sArray[635] = 55;
        sArray[636] = 57;
        sArray[637] = 55;
        sArray[638] = 37;
        sArray[639] = 25;
        sArray[640] = 20;
        sArray[641] = 56;
        sArray[642] = 56;
        sArray[646] = 58;
        sArray[647] = 58;
        sArray[648] = 59;
        sArray[649] = 59;
        sArray[650] = 59;
        sArray[652] = 59;
        sArray[653] = 61;
        sArray[654] = 61;
        sArray[655] = 58;
        sArray[656] = 58;
        sArray[657] = 14;
        sArray[658] = 14;
        sArray[659] = 1;
        sArray[660] = 14;
        sArray[661] = 1;
        sArray[662] = 1;
        sArray[663] = 27;
        sArray[664] = 2;
        sArray[665] = 34;
        sArray[666] = 36;
        sArray[667] = 35;
        sArray[669] = 37;
        sArray[670] = 49;
        sArray[671] = 30;
        sArray[672] = 67;
        sArray[673] = 45;
        sArray[674] = 41;
        sArray[675] = 73;
        sArray[676] = 57;
        sArray[677] = 57;
        sArray[678] = 7;
        sArray[679] = 19;
        sArray[680] = 57;
        sArray[681] = 7;
        sArray[682] = 57;
        sArray[683] = 42;
        sArray[684] = 57;
        sArray[685] = 57;
        sArray[686] = 7;
        sArray[687] = 57;
        sArray[688] = 18;
        sArray[689] = 57;
        sArray[690] = 18;
        sArray[691] = 56;
        sArray[692] = 57;
        sArray[693] = 46;
        sArray[694] = 48;
        sArray[695] = 62;
        sArray[696] = 62;
        sArray[697] = 16;
        sArray[698] = 57;
        sArray[699] = 57;
        sArray[700] = 20;
        sArray[701] = 76;
        sArray[702] = 50;
        sArray[703] = 9;
        sArray[704] = 10;
        sArray[705] = 11;
        sArray[706] = 13;
        sArray[707] = 29;
        sArray[708] = 3;
        sArray[709] = 6;
        sArray[710] = 6;
        sArray[711] = 38;
        sArray[712] = 57;
        sArray[713] = 57;
        sArray[714] = 20;
        sArray[715] = 83;
        sArray[716] = 21;
        sArray[717] = 49;
        sArray[718] = 51;
        sArray[719] = 52;
        sArray[720] = 83;
        sArray[721] = 53;
        sArray[722] = 44;
        sArray[723] = 75;
        sArray[724] = 54;
        sArray[725] = 5;
        sArray[726] = 7;
        sArray[727] = 49;
        sArray[728] = 65;
        sArray[729] = 7;
        sArray[730] = 5;
        sArray[731] = 19;
        sArray[732] = 20;
        sArray[733] = 28;
        sArray[734] = 1;
        sArray[735] = 28;
        sArray[737] = 18;
        sArray[738] = 84;
        sArray[739] = 1;
        sArray[740] = 73;
        sArray[741] = 8;
        id_protected = sArray;
    }

    private void U() {
        this.j();
        gh_3<rdn_3> gh_32 = new gh_3<rdn_3>(rdn_32 -> rdn_32.id_class(null, VU.NORMAL).stream().map(rgP_22 -> rgF_2.id_class(rgP_22.getString()).trim()).filter(string -> !string.isEmpty() ? id_case[114] : id_case[115]), rdn_32 -> Stream.of(rVL.id_for.id_break(rdn_32.id_break())));
        gd_3<rdn_3> gd_32 = new gd_3<rdn_3>(rdn_32 -> rlc_3.id_class().id_class(rdn_32.id_break()).stream());
        rqs_3<rdn_3> rqs_32 = rqs_3.id_class();
        for (rdb_3 rdb_32 : rVL.id_for) {
            rdb_32.id_class(rdX_2.id_catch, rqs_32);
        }
        rqs_32.forEach(rdn_32 -> {
            gh_32.id_class((rdn_3)rdn_32);
            gd_32.id_class((rdn_3)rdn_32);
        });
        gh_3<mG_2> gh_33 = new gh_3<mG_2>(mG_22 -> mG_22.id_protected().stream().flatMap(rkw_32 -> rkw_32.id_byte().id_class(null, VU.NORMAL).stream()).map(rgP_22 -> rgF_2.id_class(rgP_22.getString()).trim()).filter(string -> !string.isEmpty() ? id_case[112] : id_case[113]), mG_22 -> mG_22.id_protected().stream().map(rkw_32 -> rVL.id_for.id_break(rkw_32.id_byte().id_break())));
        ((gJ_2)this.id_class[id_protected[201]]).id_class(gJ_2.id_class, gh_32);
        ((gJ_2)this.id_class[id_protected[202]]).id_class(gJ_2.id_break, gd_32);
        ((gJ_2)this.id_class[id_protected[203]]).id_class(gJ_2.id_byte, gh_33);
    }

    public QU id_short() {
        this.j();
        return (QU)this.id_class[id_protected[721]];
    }

    @Override
    public void close() {
        this.j();
        try {
            ((Ip_1)this.id_class[id_protected[252]]).close();
            ((ub_3)this.id_class[id_protected[253]]).close();
            ((Hh_1)this.id_class[id_protected[254]]).close();
            ((yX_2)this.id_class[id_protected[255]]).close();
            ((Nf_1)this.id_class[id_protected[256]]).id_protected();
            ((rAt_1)this.id_class[id_protected[257]]).close();
            ((Cy_1)this.id_class[id_protected[258]]).id_break();
            ((fC_2)this.id_class[id_protected[259]]).close();
            ((fv_3)this.id_class[id_protected[260]]).close();
            ((fY_2)this.id_class[id_protected[261]]).close();
            ((rAv_1)this.id_class[id_protected[262]]).close();
            rqR_2.id_private();
            ((yh_3)this.id_class[id_protected[263]]).close();
            ((Qg_1)this.id_class[id_protected[264]]).close();
        }
        catch (Throwable throwable) {
            try {
                ((Logger)id_break[id_protected[265]]).error(id_throws[38], throwable);
                throw throwable;
            }
            catch (Throwable throwable2) {
                ((yh_3)this.id_class[id_protected[266]]).close();
                ((Qg_1)this.id_class[id_protected[267]]).close();
                throw throwable2;
            }
        }
    }

    public void z() {
        this.j();
        if ((Integer)this.id_class[id_protected[373]] <= 0) {
            if ((rjG_2)this.id_class[id_protected[374]] == null) {
                ((Logger)id_break[id_protected[375]]).error(id_throws[50]);
                if (((Ax_1)this.id_class[id_protected[376]]).id_case()) {
                    Integer n = id_byte[13];
                    this.id_class[QY.id_protected[377]] = n;
                }
            } else if (!((cb_3)this.id_class[id_protected[378]]).id_long()) {
                switch (((int[])Qo_1.id_class[id_protected[379]])[((rjG_2)this.id_class[id_protected[380]]).id_byte().ordinal()]) {
                    case 1: {
                        ((Ax_1)this.id_class[id_protected[381]]).id_class((rhd_3)((cb_3)this.id_class[id_protected[382]]), ((rfo_3)((rjG_2)this.id_class[id_protected[383]])).id_class(), id_case[56]);
                        break;
                    }
                    case 2: {
                        rff_3 rff_32 = (rff_3)((rjG_2)this.id_class[id_protected[384]]);
                        rfH_2 rfH_22 = rff_32.id_class();
                        xc_3 xc_32 = ((gm_3)this.id_class[id_protected[385]]).id_byte(rfH_22);
                        if (!xc_32.id_catch()) {
                            ((Ax_1)this.id_class[id_protected[386]]).id_class(rfH_22, rff_32.id_break(), id_case[57]);
                            break;
                        }
                    }
                    case 3: {
                        if (((Ax_1)this.id_class[id_protected[387]]).id_case()) {
                            Integer n = id_byte[14];
                            this.id_class[QY.id_protected[388]] = n;
                        }
                        ((cb_3)this.id_class[id_protected[389]]).sg();
                    }
                }
                rrjl_3.id_class((rjG_2)this.id_class[id_protected[390]], rpm_3.MAIN_HAND);
            }
        }
    }

    public Aq_1 id_void() {
        this.j();
        return (cb_3)this.id_class[id_protected[607]] == null ? null : (Aq_1)((cb_3)this.id_class[QY.id_protected[608]]).id_break[id_protected[609]];
    }

    private void w() {
        boolean bl = id_case[29];
        lY_2 lY_22 = this.id_synchronized().id_break();
        IJ iJ = lY_22.id_class().id_break();
        for (xd_3 xd_32 : rVL.id_strictfp) {
            for (Object object : xd_32.id_new().id_class()) {
                Iterator iterator;
                if (((JC)object).id_private() != xN_2.MODEL || (iterator = lY_22.id_break((xc_3)object)) != iJ) continue;
                ((Logger)id_break[id_protected[220]]).debug(id_throws[32], object);
                bl = id_case[30];
            }
        }
        fj_3 fj_32 = iJ.id_throws();
        for (Object object : rVL.id_strictfp) {
            for (Iterator iterator : ((xd_3)object).id_new().id_class()) {
                Object object2 = lY_22.id_class((xc_3)((Object)iterator));
                if (((JC)((Object)iterator)).id_catch() || object2 != fj_32) continue;
                ((Logger)id_break[id_protected[221]]).debug(id_throws[33], iterator);
                bl = id_case[31];
            }
        }
        rqs_3<rdn_3> rqs_32 = rqs_3.id_class();
        for (Object object : rVL.id_for) {
            rqs_32.clear();
            ((rdb_3)object).id_class(rdX_2.id_catch, rqs_32);
            for (Object object2 : rqs_32) {
                String string = ((rdn_3)object2).id_finally();
                String string2 = new rgn_3(string).getString();
                if (!string2.toLowerCase(Locale.ROOT).equals(((rdb_3)object).id_break())) continue;
                ((Logger)id_break[id_protected[222]]).debug(id_throws[34], object2, (Object)string, (Object)((rdn_3)object2).id_break());
            }
        }
        if (bl |= cg_3.id_class()) {
            throw new IllegalStateException(id_throws[35]);
        }
    }

    public jV_2 u() {
        this.j();
        return (jV_2)this.id_class[id_protected[669]];
    }

    public MinecraftSessionService r() {
        this.j();
        return (MinecraftSessionService)this.id_class[id_protected[693]];
    }

    public NL N() {
        this.j();
        return (NL)this.id_class[id_protected[420]];
    }

    @Override
    public void id_break() {
        this.j();
        ((Qi_1)this.id_class[id_protected[343]]).id_implements();
    }

    public void id_break(vm_3 vm_32) {
        this.j();
        rrFo_1 rrFo_12 = null;
        if ((vm_3)this.id_class[id_protected[226]] != null) {
            ((vm_3)this.id_class[id_protected[227]]).w_();
            rrFo_12 = ((vm_3)this.id_class[id_protected[228]]).id_this();
        }
        if (vm_32 == null && (gm_3)this.id_class[id_protected[229]] == null) {
            vm_32 = new rrvL();
        } else if (vm_32 == null && ((cb_3)this.id_class[id_protected[230]]).Sl()) {
            if (((cb_3)this.id_class[id_protected[231]]).d()) {
                vm_32 = new ZS(null, ((gm_3)this.id_class[id_protected[232]]).id_synchronized().id_implements());
            } else {
                ((cb_3)this.id_class[id_protected[233]]).J();
            }
        }
        if (vm_32 instanceof vB_2 || vm_32 instanceof vG_2) {
            ((Qw_1)this.id_class[QY.id_protected[234]]).R = id_case[32];
            ((cq_3)this.id_class[id_protected[235]]).id_throws().id_class(id_case[33]);
        }
        vm_3 vm_33 = vm_32;
        this.id_class[QY.id_protected[236]] = vm_33;
        if (vm_32 != null) {
            ((Qi_1)this.id_class[id_protected[237]]).id_private();
            Vu_1.id_break();
            vm_32.id_break(this, ((Qg_1)this.id_class[id_protected[238]]).id_super(), ((Qg_1)this.id_class[id_protected[239]]).id_this());
            Boolean bl = id_case[34];
            this.id_class[QY.id_protected[240]] = bl;
        } else {
            ((Nf_1)this.id_class[id_protected[241]]).id_throws();
            if (rrFo_12 == null || !rrFo_12.id_class()) {
                ((Qi_1)this.id_class[id_protected[242]]).id_catch();
            }
            vs_3.INSTANCE.id_class();
        }
        this.id_implements();
    }

    public void id_break(an_3 an_32) {
        this.j();
        an_3 an_33 = an_32;
        this.id_class[QY.id_protected[696]] = an_33;
        ((Hh_1)this.id_class[id_protected[697]]).id_class(an_32);
    }

    @Override
    public Runnable id_break(Runnable runnable) {
        return runnable;
    }

    private static Supplier<rAC> id_break(Supplier<rAC> supplier) {
        return () -> new jR_2((rAC)supplier.get());
    }

    public void id_break(boolean bl) {
        this.j();
        if ((vm_3)this.id_class[id_protected[355]] == null) {
            boolean bl2;
            boolean bl3 = bl2 = this.id_finally() && !((rng_3)this.id_class[id_protected[356]]).d() ? id_case[49] : id_case[50];
            if (bl2) {
                this.id_break(new ZY(!bl ? id_case[51] : id_case[52]));
                ((Nf_1)this.id_class[id_protected[357]]).id_break();
            } else {
                this.id_break(new ZY(id_case[53]));
            }
        }
    }

    public void id_break(KY kY) {
        this.j();
        KY kY2 = kY;
        this.id_class[QY.id_protected[209]] = kY2;
    }

    private void id_break(gm_3 gm_32) {
        this.j();
        ((yX_2)this.id_class[id_protected[600]]).id_class(gm_32);
        ((Cy_1)this.id_class[id_protected[601]]).id_class(gm_32);
        jz_3.id_break.id_class(gm_32);
        this.id_implements();
    }

    public void id_break(String string) {
        this.id_class(string, rVm_1.id_break(), QY::id_class, (Function4<rrGk_1, rVv_1, rAL, rTH, rrGP>)((Function4)QY::id_class), id_case[74], (QD)((Object)QD.staticFields25f7c1a34dee3bdaa6c7082af054c49d[id_protected[556]]));
    }

    public void id_break(int n) {
        this.j();
        ((Ip_1)this.id_class[id_protected[727]]).id_class(n);
    }

    public SkinProvider id_throws() {
        this.j();
        return (SkinProvider)this.id_class[id_protected[694]];
    }

    @Override
    private void id_throws(boolean bl) {
        int n;
        int n2;
        Object object;
        this.j();
        ((Qg_1)this.id_class[id_protected[268]]).id_class(id_throws[39]);
        long l = rqR_2.id_byte();
        long l2 = System.currentTimeMillis();
        double d = (int)(l2 - (Long)this.id_class[id_protected[269]]);
        Long l3 = l2;
        this.id_class[QY.id_protected[270]] = l3;
        Double d2 = d;
        rrQo_1.id_class[QY.id_protected[271]] = d2;
        if (((Qg_1)this.id_class[id_protected[272]]).id_break()) {
            this.G();
        }
        if ((CompletableFuture)this.id_class[id_protected[273]] != null && !((cT_2)this.id_class[id_protected[274]] instanceof cj_3)) {
            object = (CompletableFuture)this.id_class[id_protected[275]];
            Object var19_8 = null;
            this.id_class[QY.id_protected[276]] = var19_8;
            this.id_private().thenRun(() -> QY.id_class((CompletableFuture)object));
        }
        while ((object = (Runnable)((Queue)this.id_class[id_protected[277]]).poll()) != null) {
            object.run();
        }
        if (bl) {
            n2 = ((rqw_3)this.id_class[id_protected[278]]).id_class(rqR_2.id_break());
            this.rd();
            for (n = id_case[37]; n < Math.min(id_byte[6], n2); n += 1) {
                this.id_package();
            }
        }
        ((Qi_1)this.id_class[id_protected[279]]).id_class(id_case[38]);
        ((Qg_1)this.id_class[id_protected[280]]).id_class(id_throws[40]);
        ((Nf_1)this.id_class[id_protected[281]]).id_class(((Hh_1)this.id_class[id_protected[282]]).id_finally());
        RenderSystem.pushMatrix();
        RenderSystem.clear(id_protected[283], (Boolean)id_break[id_protected[284]]);
        ((VC)this.id_class[id_protected[285]]).id_class(id_case[39]);
        HE.id_class();
        RenderSystem.enableTexture();
        RenderSystem.enableCull();
        if (!((Boolean)this.id_class[id_protected[286]]).booleanValue()) {
            ((Hh_1)this.id_class[id_protected[287]]).id_class((Boolean)this.id_class[id_protected[288]] != false ? ((Float)this.id_class[id_protected[289]]).floatValue() : ((rqw_3)this.id_class[QY.id_protected[290]]).id_class, l, bl);
        }
        ((VC)this.id_class[id_protected[291]]).id_throws();
        RenderSystem.popMatrix();
        RenderSystem.pushMatrix();
        ((VC)this.id_class[id_protected[292]]).id_class(((Qg_1)this.id_class[id_protected[293]]).id_extends(), ((Qg_1)this.id_class[id_protected[294]]).id_native());
        RenderSystem.popMatrix();
        ((Qg_1)this.id_class[id_protected[295]]).id_throws();
        n2 = this.R();
        if ((double)n2 < QF.id_extends.id_case()) {
            RenderSystem.limitDisplayFPS(n2);
        }
        Thread.yield();
        ((Qg_1)this.id_class[id_protected[296]]).id_class(id_throws[41]);
        QY qY = this;
        Integer n3 = (Integer)qY.id_class[id_protected[297]] + id_case[40];
        qY.id_class[QY.id_protected[298]] = n3;
        int n4 = n = this.id_finally() && ((vm_3)this.id_class[id_protected[299]] != null && ((vm_3)this.id_class[id_protected[300]]).z_() || (cT_2)this.id_class[id_protected[301]] != null && ((cT_2)this.id_class[id_protected[302]]).id_class()) && !((rng_3)this.id_class[id_protected[303]]).d() ? id_case[41] : id_case[42];
        if ((Boolean)this.id_class[id_protected[304]] != n) {
            if (((Boolean)this.id_class[id_protected[305]]).booleanValue()) {
                Float f = Float.valueOf(((rqw_3)this.id_class[QY.id_protected[306]]).id_class);
                this.id_class[QY.id_protected[307]] = f;
            } else {
                ((rqw_3)this.id_class[QY.id_protected[308]]).id_class = ((Float)this.id_class[id_protected[309]]).floatValue();
            }
            Boolean bl2 = n != 0;
            this.id_class[QY.id_protected[310]] = bl2;
        }
        long l4 = rqR_2.id_byte();
        ((rpN_2)this.id_class[id_protected[311]]).id_class(l4 - (Long)this.id_class[id_protected[312]]);
        Long l5 = l4;
        this.id_class[QY.id_protected[313]] = l5;
        while (rqR_2.id_break() >= (Long)this.id_class[id_protected[314]] + id_implements[1]) {
            Integer n5 = (int)((Integer)this.id_class[id_protected[315]]);
            QY.id_break[QY.id_protected[316]] = n5;
            Object[] objectArray = new Object[id_byte[7]];
            objectArray[QY.id_case[43]] = (int)((Integer)id_break[id_protected[317]]);
            objectArray[QY.id_case[44]] = (double)((Qw_1)this.id_class[QY.id_protected[318]]).id_protected == QF.id_extends.id_case() ? id_throws[43] : Integer.valueOf(((Qw_1)this.id_class[QY.id_protected[319]]).id_protected);
            objectArray[QY.id_byte[8]] = ((Qw_1)this.id_class[QY.id_protected[320]]).id_strictfp ? id_throws[44] : id_throws[45];
            objectArray[QY.id_byte[9]] = ((Qw_1)this.id_class[QY.id_protected[321]]).id_case.toString();
            objectArray[QY.id_byte[10]] = ((Qw_1)this.id_class[QY.id_protected[322]]).id_throws == Vd_1.OFF ? id_throws[46] : (((Qw_1)this.id_class[QY.id_protected[323]]).id_throws == Vd_1.FAST ? id_throws[47] : id_throws[48]);
            objectArray[QY.id_byte[11]] = ((Qw_1)this.id_class[QY.id_protected[324]]).id_abstract;
            String string = String.format(id_throws[42], objectArray);
            this.id_class[QY.id_protected[325]] = string;
            QY qY2 = this;
            Long l6 = (Long)qY2.id_class[id_protected[326]] + id_implements[2];
            qY2.id_class[QY.id_protected[327]] = l6;
            Integer n6 = id_case[45];
            this.id_class[QY.id_protected[328]] = n6;
        }
    }

    private static /* synthetic */ void ntfClinit() {
        QY.l();
        QY.p();
        QY.i();
        QY.rP();
        QY.q();
        QY.D();
        QY.a();
        QY.T();
    }

    public static boolean L() {
        return ((Qw_1)((QY)QY.id_break[QY.id_protected[616]]).id_class[QY.id_protected[617]]).id_catch != Vh_1.OFF ? id_case[99] : id_case[100];
    }

    public rrGd_1 M() {
        this.j();
        return (rrGd_1)this.id_class[id_protected[223]];
    }

    public Proxy W() {
        this.j();
        return (Proxy)this.id_class[id_protected[663]];
    }

    private boolean H() {
        this.j();
        return (Boolean)this.id_class[id_protected[496]] == false || (rng_3)this.id_class[id_protected[497]] != null && ((rng_3)this.id_class[id_protected[498]]).d() ? id_case[63] : id_case[64];
    }

    private int R() {
        this.j();
        int n = ((Qg_1)this.id_class[id_protected[344]]).id_protected();
        if (!this.id_static() || (gm_3)this.id_class[id_protected[345]] == null && ((vm_3)this.id_class[id_protected[346]] != null || (cT_2)this.id_class[id_protected[347]] != null)) {
            return Math.min(n, id_byte[12]);
        }
        return n;
    }

    @Override
    public Thread P() {
        this.j();
        return (Thread)this.id_class[id_protected[701]];
    }

    public boolean id_finally() {
        this.j();
        return (Boolean)this.id_class[id_protected[654]] != false && (rng_3)this.id_class[id_protected[655]] != null ? id_case[101] : id_case[102];
    }

    public an_3 id_catch() {
        this.j();
        return (an_3)this.id_class[id_protected[695]];
    }

    public void G() {
        this.j();
        Boolean bl = id_case[48];
        this.id_class[QY.id_protected[353]] = bl;
    }

    public boolean O() {
        return id_case[109];
    }

    public Ip_1 id_extends() {
        this.j();
        return (Ip_1)this.id_class[id_protected[717]];
    }

    public boolean id_goto() {
        this.j();
        return (Boolean)this.id_class[id_protected[354]];
    }

    private void K() {
        this.j();
        if ((rjG_2)this.id_class[id_protected[618]] != null && ((rjG_2)this.id_class[id_protected[619]]).id_byte() != rjM_2.MISS) {
            rdn_3 rdn_32;
            Object object;
            boolean bl = ((rhx_3)((cb_3)this.id_class[QY.id_protected[620]]).id_implements[QY.id_protected[621]]).id_protected;
            ryO_2 ryO_22 = null;
            rjM_2 rjM_22 = ((rjG_2)this.id_class[id_protected[622]]).id_byte();
            if (rjM_22 == rjM_2.BLOCK) {
                object = ((rff_3)((rjG_2)this.id_class[id_protected[623]])).id_class();
                var6_5 = ((gm_3)this.id_class[id_protected[624]]).id_byte((rfH_2)object);
                xd_3 xd_32 = ((JC)var6_5).id_break();
                if (((JC)var6_5).id_catch()) {
                    return;
                }
                rdn_32 = xd_32.id_class((rRq_1)((gm_3)this.id_class[id_protected[625]]), (rfH_2)object, (xc_3)var6_5);
                if (rdn_32.id_class()) {
                    return;
                }
                if (bl && vm_3.id_else() && xd_32.id_protected()) {
                    ryO_22 = ((gm_3)this.id_class[id_protected[626]]).id_class((rfH_2)object);
                }
            } else {
                if (rjM_22 != rjM_2.ENTITY || !bl) {
                    return;
                }
                object = ((rfo_3)((rjG_2)this.id_class[id_protected[627]])).id_class();
                if (object instanceof rsO_2) {
                    rdn_32 = new rdn_3(rdy_3.hH);
                } else if (object instanceof rsM_2) {
                    rdn_32 = new rdn_3(rdy_3.df);
                } else if (object instanceof rsG_2) {
                    var6_5 = (rsG_2)object;
                    rdn_3 rdn_33 = ((rsG_2)var6_5).id_final();
                    rdn_32 = rdn_33.id_class() ? new rdn_3(rdy_3.dB) : rdn_33.id_implements();
                } else if (object instanceof rsJ_2) {
                    rsJ_2 rsJ_22 = (rsJ_2)object;
                    rdn_32 = new rdn_3(switch (((int[])Qo_1.id_class[id_protected[628]])[rsJ_22.id_final().ordinal()]) {
                        case 1 -> rdy_3.XX;
                        case 2 -> rdy_3.Xh;
                        case 3 -> rdy_3.dF;
                        case 4 -> rdy_3.dL;
                        case 5 -> rdy_3.dV;
                        default -> rdy_3.ho;
                    });
                } else if (object instanceof rSK) {
                    rdn_32 = new rdn_3(((rSK)object).id_protected());
                } else if (object instanceof rSY) {
                    rdn_32 = new rdn_3(rdy_3.dq);
                } else if (object instanceof rSa_1) {
                    rdn_32 = new rdn_3(rdy_3.kM);
                } else {
                    rkO_2 rkO_22 = rkO_2.id_class(((an_3)object).BC());
                    if (rkO_22 == null) {
                        return;
                    }
                    rdn_32 = new rdn_3(rkO_22);
                }
            }
            if (rdn_32.id_class()) {
                object = id_throws[76];
                if (rjM_22 == rjM_2.BLOCK) {
                    object = rVL.id_strictfp.id_break(((gm_3)this.id_class[id_protected[629]]).id_byte(((rff_3)((rjG_2)this.id_class[id_protected[630]])).id_class()).id_break()).toString();
                } else if (rjM_22 == rjM_2.ENTITY) {
                    object = rVL.id_transient.id_break(((rfo_3)((rjG_2)this.id_class[id_protected[631]])).id_class().BC()).toString();
                }
                ((Logger)id_break[id_protected[632]]).warn(id_throws[77], (Object)rjM_22, object);
            } else {
                object = (rhz_3)((cb_3)this.id_class[QY.id_protected[633]]).id_implements[id_protected[634]];
                if (ryO_22 != null) {
                    this.id_class(rdn_32, ryO_22);
                }
                if (!rrfZ_2.id_byte()) {
                    int n = ((rhz_3)object).id_break(rdn_32);
                    if (bl) {
                        ((rhz_3)object).id_class(rdn_32);
                        ((Ax_1)this.id_class[id_protected[635]]).id_class(((cb_3)this.id_class[id_protected[636]]).id_protected(rpm_3.MAIN_HAND), id_byte[19] + ((rhz_3)object).id_protected);
                    } else if (n != id_byte[20]) {
                        if (rhz_3.id_break(n)) {
                            ((rhz_3)object).id_protected = n;
                        } else {
                            ((Ax_1)this.id_class[id_protected[637]]).id_class(n);
                        }
                    }
                }
            }
        }
    }

    public pg_3 id_case() {
        this.j();
        return (pg_3)this.id_class[id_protected[703]];
    }

    public gW_2 id_const() {
        this.j();
        return (gW_2)this.id_class[id_protected[722]];
    }

    public boolean id_continue() {
        this.j();
        return ((Qw_1)this.id_class[QY.id_protected[211]]).id_transient;
    }

    public Qg_1 id_else() {
        this.j();
        return (Qg_1)this.id_class[id_protected[725]];
    }

    public void id_for() {
        this.j();
        if (!((Ax_1)this.id_class[id_protected[391]]).id_volatile()) {
            rrAu_1 rrAu_12 = rrAu_1.id_break(id_byte[15]);
            if (((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_protected[392]]).id_finally().id_class(rrAu_12).id_byte()) {
                return;
            }
            Integer n = rrAu_12.id_class();
            this.id_class[QY.id_protected[393]] = n;
            if (!((cb_3)this.id_class[id_protected[394]]).id_long()) {
                if ((rjG_2)this.id_class[id_protected[395]] == null) {
                    ((Logger)id_break[id_protected[396]]).warn(id_throws[51]);
                }
                rpm_3[] rpm_3Array = rpm_3.values();
                int n2 = rpm_3Array.length;
                for (int i = id_case[58]; i < n2; ++i) {
                    Object object;
                    rpm_3 rpm_32 = rpm_3Array[i];
                    rdn_3 rdn_32 = ((cb_3)this.id_class[id_protected[397]]).id_protected(rpm_32);
                    if (((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_protected[398]]).id_finally().id_class(rrAY.id_class(rdn_32, rpm_32)).id_byte()) break;
                    if ((rjG_2)this.id_class[id_protected[399]] != null) {
                        switch (((int[])Qo_1.id_class[id_protected[400]])[((rjG_2)this.id_class[id_protected[401]]).id_byte().ordinal()]) {
                            case 1: {
                                object = (rfo_3)((rjG_2)this.id_class[id_protected[402]]);
                                an_3 an_32 = ((rfo_3)object).id_class();
                                ryZ_2 ryZ_22 = ((Ax_1)this.id_class[id_protected[403]]).id_class((rhd_3)((cb_3)this.id_class[id_protected[404]]), an_32, (rfo_3)object, rpm_32);
                                if (!ryZ_22.id_class()) {
                                    ryZ_22 = ((Ax_1)this.id_class[id_protected[405]]).id_class((rhd_3)((cb_3)this.id_class[id_protected[406]]), an_32, rpm_32);
                                }
                                if (!ryZ_22.id_class()) break;
                                if (ryZ_22.id_break()) {
                                    ((cb_3)this.id_class[id_protected[407]]).id_class(rpm_32);
                                }
                                return;
                            }
                            case 2: {
                                rff_3 rff_32 = (rff_3)((rjG_2)this.id_class[id_protected[408]]);
                                int n3 = rdn_32.id_char();
                                ryZ_2 ryZ_23 = ((Ax_1)this.id_class[id_protected[409]]).id_class((cb_3)this.id_class[id_protected[410]], (gm_3)this.id_class[id_protected[411]], rpm_32, rff_32);
                                if (ryZ_23.id_class()) {
                                    if (ryZ_23.id_break()) {
                                        ((cb_3)this.id_class[id_protected[412]]).id_class(rpm_32);
                                        if (!rdn_32.id_class() && (rdn_32.id_char() != n3 || ((Ax_1)this.id_class[id_protected[413]]).id_catch())) {
                                            ((Hh_1)this.id_class[QY.id_protected[414]]).id_class.id_class(rpm_32);
                                        }
                                    }
                                    return;
                                }
                                if (ryZ_23 != ryZ_2.FAIL) break;
                                return;
                            }
                        }
                    }
                    if (!rdn_32.id_class()) {
                        object = ((Ax_1)this.id_class[id_protected[415]]).id_class(rpm_32);
                        ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_protected[416]]).id_finally().id_class(rrAf_1.id_class((ryZ_2)((Object)object), rdn_32, rpm_32));
                        if (!((ryZ_2)((Object)object)).id_class()) continue;
                        if (((ryZ_2)((Object)object)).id_break()) {
                            ((cb_3)this.id_class[id_protected[417]]).id_class(rpm_32);
                        }
                        ((Hh_1)this.id_class[QY.id_protected[418]]).id_class.id_class(rpm_32);
                        return;
                    }
                    ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_protected[419]]).id_finally().id_class(rrAf_1.id_class(ryZ_2.PASS, rdn_32, rpm_32));
                }
            }
        }
    }

    public void id_implements() {
        this.j();
        ((Qg_1)this.id_class[id_protected[183]]).id_break(this.C());
    }

    public HB id_import() {
        this.j();
        return (HB)this.id_class[id_protected[705]];
    }

    public static QY id_instanceof() {
        return (QY)id_break[id_protected[645]];
    }

    public HM id_new() {
        this.j();
        return (HM)this.id_class[id_protected[673]];
    }

    public void id_package() {
        this.j();
        while (!((ConcurrentLinkedQueue)id_break[id_protected[421]]).isEmpty()) {
            ((Runnable)((ConcurrentLinkedQueue)id_break[id_protected[422]]).poll()).run();
        }
        ((C_break)C_break.staticFieldsf9703d96375232b196815afd59d1eb48[id_protected[423]]).id_byte();
        if ((Integer)this.id_class[id_protected[424]] > 0) {
            QY qY = this;
            Integer n = (Integer)qY.id_class[id_protected[425]] - id_case[59];
            qY.id_class[QY.id_protected[426]] = n;
        }
        if (!((Boolean)this.id_class[id_protected[427]]).booleanValue()) {
            ((cq_3)this.id_class[id_protected[428]]).id_protected();
        }
        ((Hh_1)this.id_class[id_protected[429]]).id_class(id_private[5]);
        if (!((Boolean)this.id_class[id_protected[430]]).booleanValue() && (gm_3)this.id_class[id_protected[431]] != null) {
            ((Ax_1)this.id_class[id_protected[432]]).id_protected();
        }
        if ((gm_3)this.id_class[id_protected[433]] != null) {
            ((fY_2)this.id_class[id_protected[434]]).id_break();
        }
        if ((vm_3)this.id_class[id_protected[435]] == null && (cb_3)this.id_class[id_protected[436]] != null) {
            if (((cb_3)this.id_class[id_protected[437]]).Sl() && !((vm_3)this.id_class[id_protected[438]] instanceof ZS)) {
                this.id_break((vm_3)null);
            } else if (((cb_3)this.id_class[id_protected[439]]).Sc() && (gm_3)this.id_class[id_protected[440]] != null) {
                this.id_break(new vy_3());
            }
        } else if ((vm_3)this.id_class[id_protected[441]] != null && (vm_3)this.id_class[id_protected[442]] instanceof vy_3 && !((cb_3)this.id_class[id_protected[443]]).Sc()) {
            this.id_break((vm_3)null);
        }
        if ((vm_3)this.id_class[id_protected[444]] != null) {
            Integer n = id_protected[445];
            this.id_class[QY.id_protected[446]] = n;
        }
        if ((vm_3)this.id_class[id_protected[447]] != null) {
            vm_3.id_class(() -> {
                this.j();
                ((vm_3)this.id_class[id_protected[740]]).id_private();
            }, id_throws[52], ((vm_3)this.id_class[id_protected[448]]).getClass().getCanonicalName());
        }
        if (!((Qw_1)this.id_class[QY.id_protected[449]]).R) {
            ((cq_3)this.id_class[id_protected[450]]).id_native();
        }
        if ((cT_2)this.id_class[id_protected[451]] == null && ((vm_3)this.id_class[id_protected[452]] == null || (cb_3)this.id_class[id_protected[453]] != null && ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_protected[454]]).id_finally().id_class(rrAm_1.id_class((vm_3)this.id_class[id_protected[455]])).id_break() || ((C_break)C_break.staticFieldsf9703d96375232b196815afd59d1eb48[id_protected[456]]).id_class((vm_3)this.id_class[id_protected[457]]))) {
            this.f();
            if ((Integer)this.id_class[id_protected[458]] > 0) {
                QY qY = this;
                Integer n = (Integer)qY.id_class[id_protected[459]] - id_case[60];
                qY.id_class[QY.id_protected[460]] = n;
            }
        }
        if ((gm_3)this.id_class[id_protected[461]] != null) {
            if (!((Boolean)this.id_class[id_protected[462]]).booleanValue()) {
                ((Hh_1)this.id_class[id_protected[463]]).id_protected();
            }
            if (!((Boolean)this.id_class[id_protected[464]]).booleanValue()) {
                ((yX_2)this.id_class[id_protected[465]]).id_finally();
            }
            if (!((Boolean)this.id_class[id_protected[466]]).booleanValue()) {
                if (((gm_3)this.id_class[id_protected[467]]).id_super() > 0) {
                    ((gm_3)this.id_class[id_protected[468]]).id_byte(((gm_3)this.id_class[id_protected[469]]).id_super() - id_case[61]);
                }
                ((gm_3)this.id_class[id_protected[470]]).id_protected();
            }
        } else if (((Hh_1)this.id_class[id_protected[471]]).id_throws() != null) {
            ((Hh_1)this.id_class[id_protected[472]]).id_break();
        }
        if (!((Boolean)this.id_class[id_protected[473]]).booleanValue()) {
            ((NL)this.id_class[id_protected[474]]).id_class();
        }
        ((Nf_1)this.id_class[id_protected[475]]).id_class((Boolean)this.id_class[id_protected[476]]);
        if ((gm_3)this.id_class[id_protected[477]] != null) {
            if (!((Boolean)this.id_class[id_protected[478]]).booleanValue()) {
                if (!((Qw_1)this.id_class[QY.id_protected[479]]).id_char && this.H()) {
                    ((Qw_1)this.id_class[QY.id_protected[480]]).id_char = id_case[62];
                    ((Qw_1)this.id_class[id_protected[481]]).id_break();
                }
                try {
                    ((gm_3)this.id_class[id_protected[482]]).id_class(() -> id_case[111]);
                }
                catch (Throwable throwable) {
                    KY kY = KY.id_class(throwable, id_throws[53]);
                    if ((gm_3)this.id_class[id_protected[483]] == null) {
                        Ko_1 ko_1 = kY.id_class(id_throws[54]);
                        ko_1.id_class(id_throws[55], id_throws[56]);
                    } else {
                        ((gm_3)this.id_class[id_protected[484]]).id_class(kY);
                    }
                    throw new KU(kY);
                }
            }
            if (!((Boolean)this.id_class[id_protected[485]]).booleanValue() && (gm_3)this.id_class[id_protected[486]] != null) {
                ((gm_3)this.id_class[id_protected[487]]).id_class(rfU_2.id_byte(((cb_3)this.id_class[id_protected[488]]).rx()), rfU_2.id_byte(((cb_3)this.id_class[id_protected[489]]).re()), rfU_2.id_byte(((cb_3)this.id_class[id_protected[490]]).BO()));
            }
            if (!((Boolean)this.id_class[id_protected[491]]).booleanValue()) {
                ((Cy_1)this.id_class[id_protected[492]]).id_byte();
            }
        } else if ((rud_3)((Object)this.id_class[id_protected[493]]) != null) {
            ((rud_3)((Object)this.id_class[id_protected[494]])).id_class();
        }
        ((Qj_1)this.id_class[id_protected[495]]).id_break();
    }

    public static boolean id_return() {
        return ((Qw_1)((QY)QY.id_break[QY.id_protected[612]]).id_class[QY.id_protected[613]]).id_case.id_class() >= VW.FANCY.id_class() ? id_case[95] : id_case[96];
    }

    public Vk_1 id_super() {
        this.j();
        return (Vk_1)this.id_class[id_protected[716]];
    }

    public boolean id_switch() {
        this.j();
        return (Boolean)this.id_class[id_protected[653]];
    }

    public boolean id_throw() {
        this.j();
        return (Boolean)this.id_class[id_protected[672]];
    }

    public NS id_try() {
        this.j();
        if ((vm_3)this.id_class[id_protected[675]] instanceof vg_3) {
            return Ns_1.id_byte;
        }
        if ((cb_3)this.id_class[id_protected[676]] != null) {
            if (((rYB)((cb_3)this.id_class[QY.id_protected[677]]).id_throws[id_protected[678]]).E() == rYB.id_throws) {
                return ((cq_3)this.id_class[id_protected[679]]).id_extends().id_protected() ? Ns_1.id_protected : Ns_1.id_throws;
            }
            rYh_1 rYh_12 = ((rYB)((cb_3)this.id_class[QY.id_protected[680]]).id_throws[id_protected[681]]).id_implements(((cb_3)this.id_class[id_protected[682]]).Bs()).id_this();
            if (!((NL)this.id_class[id_protected[683]]).id_break(Ns_1.id_case) && (!((cb_3)this.id_class[id_protected[684]]).W() || rYh_12 != rYh_1.OCEAN && rYh_12 != rYh_1.RIVER)) {
                return ((rYB)((cb_3)this.id_class[QY.id_protected[685]]).id_throws[id_protected[686]]).E() != rYB.id_protected && ((rhx_3)((cb_3)this.id_class[QY.id_protected[687]]).id_implements[QY.id_protected[688]]).id_protected && ((rhx_3)((cb_3)this.id_class[QY.id_protected[689]]).id_implements[QY.id_protected[690]]).id_byte ? Ns_1.id_break : ((gm_3)this.id_class[id_protected[691]]).id_static().id_break(((cb_3)this.id_class[id_protected[692]]).Bs()).id_super().orElse(Ns_1.id_catch);
            }
            return Ns_1.id_case;
        }
        return Ns_1.id_class;
    }

    public rqN_2 id_while() {
        this.j();
        return (rqN_2)this.id_class[id_protected[657]];
    }

    public boolean id_static() {
        this.j();
        return (Boolean)this.id_class[id_protected[715]];
    }

    public static boolean id_public() {
        return !((Qw_1)((QY)QY.id_break[QY.id_protected[610]]).id_class[QY.id_protected[611]]).g ? id_case[93] : id_case[94];
    }

    private static Supplier<rAC> id_protected(Supplier<rAC> supplier) {
        return () -> new jg_3((rAC)supplier.get(), jg_3.id_class);
    }

    private void id_protected(boolean bl) {
        this.j();
        if (!bl) {
            Integer n = id_case[54];
            this.id_class[QY.id_protected[358]] = n;
        }
        if ((Integer)this.id_class[id_protected[359]] <= 0 && !((cb_3)this.id_class[id_protected[360]]).id_return()) {
            if (bl && (rjG_2)this.id_class[id_protected[361]] != null && ((rjG_2)this.id_class[id_protected[362]]).id_byte() == rjM_2.BLOCK) {
                rff_3 rff_32 = (rff_3)((rjG_2)this.id_class[id_protected[363]]);
                rfH_2 rfH_22 = rff_32.id_class();
                xc_3 xc_32 = ((gm_3)this.id_class[id_protected[364]]).id_byte(rfH_22);
                if (!xc_32.id_catch()) {
                    rpr_3 rpr_32 = rff_32.id_break();
                    ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_protected[365]]).id_finally().id_class(rrLH.id_class(rfH_22, xc_32, (rrLy_1)((Object)rrLy_1.staticFields4117bd257b2839b395dedb8ac6b8a087[id_protected[366]])));
                    if (((Ax_1)this.id_class[id_protected[367]]).id_break(rfH_22, rpr_32, id_case[55])) {
                        if (rrbb_3.M()) {
                            ((Cy_1)this.id_class[id_protected[368]]).id_class(rfH_22, rpr_32);
                        }
                        ((cb_3)this.id_class[id_protected[369]]).id_class(rpm_3.MAIN_HAND);
                    }
                    ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_protected[370]]).id_finally().id_class(rrLH.id_class(rfH_22, xc_32, (rrLy_1)((Object)rrLy_1.staticFields4117bd257b2839b395dedb8ac6b8a087[id_protected[371]])));
                }
            } else {
                ((Ax_1)this.id_class[id_protected[372]]).id_break();
            }
        }
    }

    private void id_protected(vm_3 vm_32) {
        this.j();
        ((Nf_1)this.id_class[id_protected[597]]).id_byte();
        Object var6_2 = null;
        this.id_class[QY.id_protected[598]] = var6_2;
        Object var7_3 = null;
        this.id_class[QY.id_protected[599]] = var7_3;
        this.id_break(vm_32);
        this.id_throws(id_case[88]);
    }

    public DataFixer id_protected() {
        this.j();
        return (DataFixer)this.id_class[id_protected[708]];
    }

    public CompletableFuture<Void> id_private() {
        this.j();
        if ((CompletableFuture)this.id_class[id_protected[212]] != null) {
            return (CompletableFuture)this.id_class[id_protected[213]];
        }
        CompletableFuture<Void> completableFuture = new CompletableFuture<Void>();
        if ((cT_2)this.id_class[id_protected[214]] instanceof cj_3) {
            CompletableFuture<Void> completableFuture2;
            this.id_class[QY.id_protected[215]] = completableFuture2 = completableFuture;
            return completableFuture;
        }
        ((rAt_1)this.id_class[id_protected[216]]).id_class();
        List<rAC> list = ((rAt_1)this.id_class[id_protected[217]]).id_case();
        this.id_class(new cj_3(this, ((rAv_1)this.id_class[id_protected[218]]).id_class(rqR_2.id_case(), (Executor)this, (CompletableFuture)id_break[id_protected[219]], list), optional -> rqR_2.id_class(optional, this::id_class, () -> {
            this.j();
            ((yX_2)this.id_class[id_protected[741]]).id_throws();
            completableFuture.complete(null);
        }), id_case[28]));
        return completableFuture;
    }

    public fC_2 id_abstract() {
        this.j();
        return (fC_2)this.id_class[id_protected[719]];
    }

    public boolean id_final() {
        this.j();
        return (Boolean)this.id_class[id_protected[605]];
    }

    public void id_transient() {
        this.id_byte(new vY_2());
    }

    public FU id_volatile() {
        this.j();
        return (FU)this.id_class[id_protected[724]];
    }

    public lo_3 id_synchronized() {
        this.j();
        return (lo_3)this.id_class[id_protected[702]];
    }

    public boolean id_native() {
        return id_case[16];
    }

    public boolean id_strictfp() {
        this.j();
        return (Boolean)this.id_class[id_protected[671]];
    }

    public boolean E() {
        this.j();
        return (cb_3)this.id_class[id_protected[712]] != null && ((cb_3)this.id_class[id_protected[713]]).sW() || ((Qw_1)this.id_class[QY.id_protected[714]]).id_switch ? id_case[107] : id_case[108];
    }

    public fY_2 A() {
        this.j();
        return (fY_2)this.id_class[id_protected[664]];
    }

    private static void T() {
        Object[] objectArray = new Object[10];
        objectArray[1] = LogManager.getLogger();
        objectArray[2] = false;
        objectArray[3] = new rqO_2(id_throws[111]);
        objectArray[4] = new rqO_2(id_throws[112]);
        objectArray[5] = CompletableFuture.completedFuture((Object)((Object)rqg_3.INSTANCE));
        objectArray[6] = new rgn_3(id_throws[113]);
        objectArray[7] = Queues.newConcurrentLinkedQueue();
        objectArray[8] = new byte[0xA00000];
        objectArray[9] = 0;
        id_break = objectArray;
    }

    public float X() {
        this.j();
        return ((rqw_3)this.id_class[QY.id_protected[709]]).id_class;
    }

    public String Q() {
        this.j();
        return (String)this.id_class[id_protected[208]];
    }

    private String rr() {
        this.j();
        if ((rng_3)this.id_class[id_protected[646]] != null) {
            return ((rng_3)this.id_class[id_protected[647]]).d() ? id_throws[98] : id_throws[99];
        }
        if ((Ak_1)this.id_class[id_protected[648]] != null) {
            return ((Ak_1)this.id_class[id_protected[649]]).id_protected() ? id_throws[100] : id_throws[101];
        }
        return id_throws[102];
    }

    private static void rP() {
        float[] fArray = new float[7];
        fArray[0] = 20.0f;
        fArray[5] = 1.0f;
        id_private = fArray;
    }
}

