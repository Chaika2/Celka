/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.http.conn.ConnectTimeoutException
 *  org.apache.logging.log4j.Logger
 */
package celestial;

import celestial.LF;
import celestial.Ml_1;
import celestial.QY;
import celestial.Qj_1;
import celestial.jI_2;
import celestial.rVi_1;
import celestial.rgF_2;
import celestial.rgP_2;
import celestial.rgn_3;
import celestial.rrQC;
import celestial.rrQH;
import celestial.rrQV;
import celestial.rrQW;
import celestial.rrQd_1;
import celestial.rrQf_1;
import celestial.rrQg_1;
import celestial.rrQk_1;
import celestial.rrQx_1;
import celestial.vm_3;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.apache.http.conn.ConnectTimeoutException;
import org.apache.logging.log4j.Logger;

public class rrQy_1
extends rrQH {
    private static short[] id_case;
    private static int[] id_catch;
    public Object[] id_throws;
    private static boolean[] id_private;
    private static byte[] id_implements;
    private static String[] id_finally;

    public static String id_byte(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-84, 86, -76, 82, -50, 80, 115, 118}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static void id_int() {
        id_implements = new byte[]{2, 50, 2, 22, 100, 20, 2, 2, 32, 2, 2, 6, 4};
    }

    public rrQy_1(rrQC rrQC2, vm_3 vm_32, vm_3 vm_33) {
        super(new rgn_3(id_finally[0]), vm_32, vm_33);
        this.id_final();
        rrQC rrQC3 = rrQC2;
        this.id_throws[rrQy_1.id_case[0]] = rrQC3;
        ((Qj_1)rrQy_1.id_import.id_class[id_case[1]]).id_class(id_private[0]);
        Boolean bl = id_private[1];
        this.id_class[rrQy_1.id_case[2]] = bl;
    }

    static {
        rrQy_1.ntfClinit();
    }

    private static void id_interface() {
        id_finally = new String[]{new String("gui.authme.mojang.title"), new String("gui.cancel"), new String("gui.authme.microsoft.status.checkBrowser"), new String("gui.authme.error.timeout"), new String("gui.authme.error.generic"), new String("gui.back"), new String("Successfully logged in via Microsoft!"), new String("gui.authme.microsoft.status.mcProfile"), new String("gui.authme.microsoft.status.mcAccessToken"), new String("Token"), new String("uhs"), new String("gui.authme.microsoft.status.xboxXstsToken"), new String("gui.authme.microsoft.status.xboxAccessToken"), new String("gui.authme.microsoft.status.msAccessToken"), new String("gui.authme.microsoft.browser")};
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xA409417ED0582514L;
    }

    @Override
    public void id_class(Ml_1 ml_1, int n, int n2, float f) {
        this.id_final();
        this.id_class(ml_1);
        this.id_super.id_class(ml_1, this.id_extends, this.id_package / id_implements[6], this.id_int / id_implements[7] - id_implements[8], id_catch[0]);
        if ((rgP_2)this.id_throws[id_case[7]] != null) {
            this.id_super.id_class(ml_1, (rgP_2)this.id_throws[id_case[8]], this.id_package / id_implements[9], this.id_int / id_implements[10] - id_implements[11], id_catch[1]);
        }
        super.id_class(ml_1, n, n2, f);
    }

    private static int id_break(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x66994FBA;
    }

    private static /* synthetic */ void ntfClinit() {
        rrQy_1.id_finally();
        rrQy_1.id_interface();
        rrQy_1.id_package();
        rrQy_1.id_int();
        rrQy_1.id_native();
    }

    private static void id_finally() {
        boolean[] blArray = new boolean[7];
        blArray[1] = true;
        blArray[2] = true;
        blArray[3] = true;
        blArray[4] = true;
        blArray[5] = true;
        id_private = blArray;
    }

    private static void id_package() {
        short[] sArray = new short[29];
        sArray[1] = 23;
        sArray[2] = 3;
        sArray[3] = 3;
        sArray[4] = 1;
        sArray[5] = 1;
        sArray[6] = 2;
        sArray[7] = 3;
        sArray[8] = 3;
        sArray[9] = 2;
        sArray[10] = 2;
        sArray[11] = 2;
        sArray[12] = 1;
        sArray[13] = 3;
        sArray[15] = 3;
        sArray[17] = 1;
        sArray[18] = 2;
        sArray[19] = 3;
        sArray[20] = 1;
        sArray[21] = 3;
        sArray[22] = 1;
        sArray[23] = 3;
        sArray[24] = 1;
        sArray[25] = 3;
        sArray[26] = 1;
        sArray[27] = 3;
        sArray[28] = 1;
        id_case = sArray;
    }

    private void id_final() {
        if (this.id_throws == null) {
            Object[] objectArray = this.id_throws = new Object[id_implements[12]];
        }
    }

    @Override
    public void id_volatile() {
        this.id_final();
        if ((CompletableFuture)this.id_throws[id_case[9]] != null && !((CompletableFuture)this.id_throws[id_case[10]]).isDone()) {
            ((CompletableFuture)this.id_throws[id_case[11]]).cancel(id_private[2]);
            ((ExecutorService)this.id_throws[id_case[12]]).shutdownNow();
        }
        super.id_volatile();
    }

    private static void id_native() {
        id_catch = new int[]{0xFFFFFF, 0xDDDDDD};
    }

    @Override
    public void v_() {
        this.id_final();
        super.v_();
        LF lF2 = new LF(this.id_package / id_implements[0] - id_implements[1], this.id_int / id_implements[2] + id_implements[3], id_implements[4], id_implements[5], new rgn_3(id_finally[1]), lF -> this.id_volatile());
        this.id_class(lF2);
        rgn_3 rgn_32 = new rgn_3(id_finally[2]);
        this.id_throws[rrQy_1.id_case[3]] = rgn_32;
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        this.id_throws[rrQy_1.id_case[4]] = executorService;
        CompletionStage completionStage = ((CompletableFuture)((CompletableFuture)((CompletableFuture)((CompletableFuture)((CompletableFuture)((CompletableFuture)rrQf_1.id_class(bl -> jI_2.id_class(id_finally[14], new Object[id_private[6]]), (Executor)((ExecutorService)this.id_throws[id_case[5]])).thenComposeAsync(string -> {
            this.id_final();
            rgn_3 rgn_32 = new rgn_3(id_finally[13]);
            this.id_throws[rrQy_1.id_case[27]] = rgn_32;
            return rrQf_1.id_protected(string, (ExecutorService)this.id_throws[id_case[28]]);
        })).thenComposeAsync(string -> {
            this.id_final();
            rgn_3 rgn_32 = new rgn_3(id_finally[12]);
            this.id_throws[rrQy_1.id_case[25]] = rgn_32;
            return rrQf_1.id_class(string, (Executor)((ExecutorService)this.id_throws[id_case[26]]));
        })).thenComposeAsync(string -> {
            this.id_final();
            rgn_3 rgn_32 = new rgn_3(id_finally[11]);
            this.id_throws[rrQy_1.id_case[23]] = rgn_32;
            return rrQf_1.id_byte(string, (ExecutorService)this.id_throws[id_case[24]]);
        })).thenComposeAsync(map -> {
            this.id_final();
            rgn_3 rgn_32 = new rgn_3(id_finally[8]);
            this.id_throws[rrQy_1.id_case[21]] = rgn_32;
            return rrQf_1.id_class((String)map.get(id_finally[9]), (String)map.get(id_finally[10]), (Executor)((ExecutorService)this.id_throws[id_case[22]]));
        })).thenComposeAsync(string -> {
            this.id_final();
            rgn_3 rgn_32 = new rgn_3(id_finally[7]);
            this.id_throws[rrQy_1.id_case[19]] = rgn_32;
            return rrQf_1.id_break(string, (ExecutorService)this.id_throws[id_case[20]]);
        })).thenAccept(rqN_22 -> {
            this.id_final();
            if (((rrQk_1)rrQk_1.staticFields9c4062aebf3b3e0dbb68c82ac08880ac[id_case[14]]).id_class((rrQx_1)new rrQW(rqN_22.id_byte(), rqN_22.id_protected(), rrQV.id_class(rqN_22.id_byte()), (rrQd_1)((Object)((Object)rrQd_1.staticFields634ba5beb257384d8792f008140c7c0a[id_case[15]]))), id_private[3], id_private[4])) {
                ((rrQC)this.id_throws[id_case[16]]).id_native();
                rrQg_1.id_class(rqN_22);
                ((Logger)QY.id_break[id_case[17]]).info(id_finally[6]);
                Boolean bl = id_private[5];
                this.id_class[rrQy_1.id_case[18]] = bl;
            }
        })).exceptionally(throwable -> {
            this.id_final();
            rVi_1 rVi_12 = new rgn_3(throwable.getCause() instanceof ConnectTimeoutException ? id_finally[3] : id_finally[4]).id_class(rgF_2.RED);
            this.id_throws[rrQy_1.id_case[13]] = rVi_12;
            lF2.id_break(new rgn_3(id_finally[5]));
            return null;
        });
        this.id_throws[rrQy_1.id_case[6]] = completionStage;
    }
}

