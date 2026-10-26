/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.exceptions.InvalidCredentialsException
 *  org.apache.logging.log4j.Logger
 */
package celestial;

import celestial.LF;
import celestial.Lu_1;
import celestial.Ml_1;
import celestial.QY;
import celestial.Qj_1;
import celestial.rVi_1;
import celestial.rgF_2;
import celestial.rgP_2;
import celestial.rgn_3;
import celestial.rrQC;
import celestial.rrQH;
import celestial.rrQN;
import celestial.rrQV;
import celestial.rrQY;
import celestial.rrQZ;
import celestial.rrQd_1;
import celestial.rrQg_1;
import celestial.rrQk_1;
import celestial.rrQu_1;
import celestial.rrQx_1;
import celestial.rrQz_1;
import celestial.vm_3;
import com.mojang.authlib.exceptions.InvalidCredentialsException;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.apache.logging.log4j.Logger;

public class rrQp_1
extends rrQH {
    private static int[] id_case;
    private static String[] id_catch;
    private static short[] id_private;
    private static boolean[] id_implements;
    private static byte[] id_finally;
    public Object[] id_throws;

    private static void id_char() {
        id_catch = new String[]{new String("gui.authme.mojang.title"), new String("gui.authme.mojang.field.username"), new String("gui.authme.mojang.field.password"), new String("gui.authme.mojang.button.login"), new String("gui.cancel"), new String("gui.authme.mojang.status.loggingIn"), new String("gui.authme.error.credentials"), new String("gui.authme.error.generic"), new String("Successfully logged in via Mojang (or legacy)!")};
    }

    public static String id_byte(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{15, 33, 9, 112, 4, -126, -46, 82}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static void id_int() {
        id_finally = new byte[]{2, 100, 2, 39, 20, 2, 100, 2, 6, 20, 2, 100, 2, 2, 59, 100, 20, 2, 2, 2, 59, 100, 20, 2, 16, 23, 16, 16, 2, 20, 7};
    }

    public rrQp_1(rrQC rrQC2, vm_3 vm_32, vm_3 vm_33) {
        super(new rgn_3(id_catch[0]), vm_32, vm_33);
        this.id_interface();
        Object var8_4 = null;
        this.id_throws[rrQp_1.id_private[0]] = var8_4;
        Object var9_5 = null;
        this.id_throws[rrQp_1.id_private[1]] = var9_5;
        Object var10_6 = null;
        this.id_throws[rrQp_1.id_private[2]] = var10_6;
        rrQC rrQC3 = rrQC2;
        this.id_throws[rrQp_1.id_private[3]] = rrQC3;
        Boolean bl = id_implements[0];
        this.id_class[rrQp_1.id_private[4]] = bl;
    }

    static {
        rrQp_1.ntfClinit();
    }

    private void id_interface() {
        if (this.id_throws == null) {
            Object[] objectArray = this.id_throws = new Object[id_finally[30]];
        }
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x6EB6D0844CC61E3L;
    }

    @Override
    public boolean id_class(int n, int n2, int n3) {
        this.id_interface();
        if ((n == id_private[46] || n == id_private[47]) && ((LF)this.id_throws[rrQp_1.id_private[48]]).id_int) {
            this.id_native();
            return id_implements[12];
        }
        return super.id_class(n, n2, n3);
    }

    @Override
    public void id_class(Ml_1 ml_1, int n, int n2, float f) {
        this.id_interface();
        this.id_class(ml_1);
        this.id_super.id_class(ml_1, this.id_extends, this.id_package / id_finally[23], ((Lu_1)this.id_throws[rrQp_1.id_private[30]]).id_final - id_finally[24] - id_finally[25], id_case[0]);
        this.id_super.id_break(ml_1, ((Lu_1)this.id_throws[id_private[31]]).C_(), (float)((Lu_1)this.id_throws[rrQp_1.id_private[32]]).id_volatile, (float)(((Lu_1)this.id_throws[rrQp_1.id_private[33]]).id_final - id_finally[26]), id_case[1]);
        this.id_super.id_break(ml_1, ((Lu_1)this.id_throws[id_private[34]]).C_(), (float)((Lu_1)this.id_throws[rrQp_1.id_private[35]]).id_volatile, (float)(((Lu_1)this.id_throws[rrQp_1.id_private[36]]).id_final - id_finally[27]), id_case[2]);
        if ((rgP_2)this.id_throws[id_private[37]] != null) {
            this.id_super.id_class(ml_1, (rgP_2)this.id_throws[id_private[38]], this.id_package / id_finally[28], ((LF)this.id_throws[rrQp_1.id_private[39]]).id_final - id_finally[29], id_case[3]);
        }
        super.id_class(ml_1, n, n2, f);
    }

    private static int id_break(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xB13440E5;
    }

    private static /* synthetic */ void ntfClinit() {
        rrQp_1.id_final();
        rrQp_1.id_char();
        rrQp_1.id_package();
        rrQp_1.id_int();
        rrQp_1.id_abstract();
    }

    public boolean id_finally() {
        this.id_interface();
        return !((Lu_1)this.id_throws[id_private[28]]).id_private().isEmpty() && !((Lu_1)this.id_throws[id_private[29]]).id_private().isEmpty() ? id_implements[7] : id_implements[8];
    }

    private static void id_package() {
        short[] sArray = new short[65];
        sArray[0] = 1;
        sArray[1] = 2;
        sArray[2] = 3;
        sArray[4] = 3;
        sArray[5] = 23;
        sArray[6] = 200;
        sArray[7] = 4;
        sArray[8] = 4;
        sArray[9] = 128;
        sArray[10] = 4;
        sArray[11] = 4;
        sArray[12] = 200;
        sArray[13] = 5;
        sArray[14] = 5;
        sArray[15] = 6;
        sArray[16] = 6;
        sArray[17] = 4;
        sArray[18] = 23;
        sArray[19] = 4;
        sArray[20] = 5;
        sArray[21] = 6;
        sArray[22] = 3;
        sArray[23] = 1;
        sArray[24] = 4;
        sArray[25] = 5;
        sArray[26] = 1;
        sArray[27] = 2;
        sArray[28] = 4;
        sArray[29] = 5;
        sArray[30] = 4;
        sArray[31] = 4;
        sArray[32] = 4;
        sArray[33] = 4;
        sArray[34] = 5;
        sArray[35] = 5;
        sArray[36] = 5;
        sArray[37] = 3;
        sArray[38] = 3;
        sArray[39] = 6;
        sArray[40] = 4;
        sArray[41] = 5;
        sArray[42] = 2;
        sArray[43] = 2;
        sArray[44] = 2;
        sArray[45] = 1;
        sArray[46] = 257;
        sArray[47] = 335;
        sArray[48] = 6;
        sArray[49] = 4;
        sArray[50] = 5;
        sArray[51] = 3;
        sArray[52] = 4;
        sArray[53] = 5;
        sArray[55] = 2;
        sArray[57] = 1;
        sArray[59] = 1;
        sArray[60] = 1;
        sArray[61] = 4;
        sArray[62] = 2;
        sArray[63] = 6;
        sArray[64] = 6;
        id_private = sArray;
    }

    @Override
    public void id_private() {
        this.id_interface();
        super.id_private();
        ((Lu_1)this.id_throws[id_private[49]]).id_catch();
        ((Lu_1)this.id_throws[id_private[50]]).id_catch();
    }

    private static void id_abstract() {
        id_case = new int[]{0xFFFFFF, 0xA0A0A0, 0xA0A0A0, 0xDDDDDD};
    }

    private static void id_final() {
        boolean[] blArray = new boolean[18];
        blArray[0] = true;
        blArray[1] = true;
        blArray[2] = true;
        blArray[7] = true;
        blArray[9] = true;
        blArray[11] = true;
        blArray[12] = true;
        blArray[13] = true;
        blArray[14] = true;
        blArray[15] = true;
        blArray[16] = true;
        blArray[17] = true;
        id_implements = blArray;
    }

    @Override
    public void id_volatile() {
        this.id_interface();
        if ((CompletableFuture)this.id_throws[id_private[42]] != null && !((CompletableFuture)this.id_throws[id_private[43]]).isDone()) {
            ((CompletableFuture)this.id_throws[id_private[44]]).cancel(id_implements[11]);
            ((ExecutorService)this.id_throws[id_private[45]]).shutdownNow();
        }
        super.id_volatile();
    }

    public void id_native() {
        this.id_interface();
        if (!this.id_finally()) {
            return;
        }
        ((Lu_1)this.id_throws[rrQp_1.id_private[19]]).id_int = id_implements[4];
        ((Lu_1)this.id_throws[rrQp_1.id_private[20]]).id_int = id_implements[5];
        ((LF)this.id_throws[rrQp_1.id_private[21]]).id_int = id_implements[6];
        rgn_3 rgn_32 = new rgn_3(id_catch[5]);
        this.id_throws[rrQp_1.id_private[22]] = rgn_32;
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        this.id_throws[rrQp_1.id_private[23]] = executorService;
        CompletionStage completionStage = ((CompletableFuture)rrQV.id_class(((Lu_1)this.id_throws[id_private[24]]).id_private(), ((Lu_1)this.id_throws[id_private[25]]).id_private(), (ExecutorService)this.id_throws[id_private[26]]).thenAccept(rqN_22 -> {
            this.id_interface();
            if (((rrQk_1)rrQk_1.staticFields9c4062aebf3b3e0dbb68c82ac08880ac[id_private[54]]).id_class((rrQx_1)new rrQz_1(rqN_22.id_byte(), rqN_22.id_protected(), rrQV.id_class(rqN_22.id_byte()), (rrQd_1)((Object)((Object)rrQd_1.staticFields634ba5beb257384d8792f008140c7c0a[id_private[55]]))), id_implements[15], id_implements[16])) {
                ((rrQC)this.id_throws[id_private[56]]).id_native();
                ((Logger)QY.id_break[id_private[57]]).info(id_catch[8]);
                rrQg_1.id_class(rqN_22);
                ((rrQZ)((rrQu_1)((rrQN)((Object)((Object)rrQN.staticFields065bd3322daf3178a8bd0d03c4b20e54[rrQp_1.id_private[58]]))).fields065bd3322daf3178a8bd0d03c4b20e54[rrQp_1.id_private[59]]).id_class[rrQp_1.id_private[60]]).id_class = ((Lu_1)this.id_throws[id_private[61]]).id_private();
                Boolean bl = id_implements[17];
                this.id_class[rrQp_1.id_private[62]] = bl;
            }
        })).exceptionally(throwable -> {
            this.id_interface();
            rVi_1 rVi_12 = new rgn_3(throwable.getCause() instanceof InvalidCredentialsException ? id_catch[6] : id_catch[7]).id_class(rgF_2.RED);
            this.id_throws[rrQp_1.id_private[51]] = rVi_12;
            ((Lu_1)this.id_throws[rrQp_1.id_private[52]]).id_int = id_implements[13];
            ((Lu_1)this.id_throws[rrQp_1.id_private[53]]).id_int = id_implements[14];
            return null;
        });
        this.id_throws[rrQp_1.id_private[27]] = completionStage;
    }

    @Override
    public boolean E_() {
        this.id_interface();
        return !((Lu_1)this.id_throws[id_private[40]]).aO_() && !((Lu_1)this.id_throws[id_private[41]]).aO_() ? id_implements[9] : id_implements[10];
    }

    @Override
    public void v_() {
        this.id_interface();
        super.v_();
        ((Qj_1)this.id_volatile.id_class[id_private[5]]).id_class(id_implements[1]);
        Lu_1 lu_1 = new Lu_1(this.id_super, this.id_package / id_finally[0] - id_finally[1], this.id_int / id_finally[2] - id_finally[3], id_private[6], id_finally[4], new rgn_3(id_catch[1]));
        this.id_throws[rrQp_1.id_private[7]] = lu_1;
        this.id_class(lu_1);
        ((Lu_1)this.id_throws[id_private[8]]).id_implements(id_private[9]);
        ((Lu_1)this.id_throws[id_private[10]]).id_class((String string) -> {
            this.id_interface();
            ((LF)this.id_throws[rrQp_1.id_private[64]]).id_int = this.id_finally();
        });
        ((Lu_1)this.id_throws[id_private[11]]).id_byte(id_implements[2]);
        rrQY rrQY2 = new rrQY(this.id_super, this.id_package / id_finally[5] - id_finally[6], this.id_int / id_finally[7] + id_finally[8], id_private[12], id_finally[9], new rgn_3(id_catch[2]));
        this.id_throws[rrQp_1.id_private[13]] = rrQY2;
        this.id_class(rrQY2);
        ((Lu_1)this.id_throws[id_private[14]]).id_class((String string) -> {
            this.id_interface();
            ((LF)this.id_throws[rrQp_1.id_private[63]]).id_int = this.id_finally();
        });
        LF lF2 = new LF(this.id_package / id_finally[10] - id_finally[11] - id_finally[12], this.id_int / id_finally[13] + id_finally[14], id_finally[15], id_finally[16], new rgn_3(id_catch[3]), lF -> this.id_native());
        this.id_throws[rrQp_1.id_private[15]] = lF2;
        this.id_class(lF2);
        ((LF)this.id_throws[rrQp_1.id_private[16]]).id_int = this.id_finally();
        this.id_class(new LF(this.id_package / id_finally[17] + id_finally[18], this.id_int / id_finally[19] + id_finally[20], id_finally[21], id_finally[22], new rgn_3(id_catch[4]), lF -> this.id_volatile()));
        this.id_class((Lu_1)this.id_throws[id_private[17]]);
    }

    @Override
    public void w_() {
        super.w_();
        ((Qj_1)this.id_volatile.id_class[id_private[18]]).id_class(id_implements[3]);
    }
}

