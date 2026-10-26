/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.util.UUIDTypeAdapter
 *  org.apache.logging.log4j.Logger
 */
package celestial;

import celestial.LF;
import celestial.Lu_1;
import celestial.Ml_1;
import celestial.QY;
import celestial.Qj_1;
import celestial.rgn_3;
import celestial.rqN_2;
import celestial.rrQC;
import celestial.rrQH;
import celestial.rrQN;
import celestial.rrQQ;
import celestial.rrQd_1;
import celestial.rrQg_1;
import celestial.rrQk_1;
import celestial.rrQu_1;
import celestial.rrQv_1;
import celestial.rrQx_1;
import celestial.rrtR_2;
import celestial.vm_3;
import com.mojang.util.UUIDTypeAdapter;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.apache.logging.log4j.Logger;

public class rrQq_1
extends rrQH {
    private static String[] id_case;
    private static short[] id_catch;
    public Object[] id_throws;
    private static int[] id_private;
    private static byte[] id_implements;
    private static boolean[] id_finally;

    private static void id_char() {
        id_case = new String[]{new String("gui.authme.offline.title"), new String("gui.authme.offline.field.username"), new String("gui.authme.offline.button.login"), new String("gui.cancel"), new String("Successfully logged in offline-mode!")};
    }

    public static String id_byte(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-90, 23, 104, -6, 116, -115, -18, 126}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static void id_int() {
        short[] sArray = new short[36];
        sArray[1] = 3;
        sArray[2] = 23;
        sArray[3] = 200;
        sArray[4] = 1;
        sArray[5] = 1;
        sArray[6] = 1;
        sArray[7] = 1;
        sArray[8] = 1;
        sArray[9] = 2;
        sArray[10] = 2;
        sArray[11] = 1;
        sArray[12] = 23;
        sArray[13] = 1;
        sArray[17] = 1;
        sArray[18] = 2;
        sArray[20] = 1;
        sArray[21] = 2;
        sArray[22] = 1;
        sArray[23] = 1;
        sArray[24] = 2;
        sArray[25] = 1;
        sArray[26] = 1;
        sArray[27] = 1;
        sArray[28] = 1;
        sArray[29] = 1;
        sArray[30] = 257;
        sArray[31] = 335;
        sArray[32] = 2;
        sArray[33] = 1;
        sArray[34] = 7;
        sArray[35] = 2;
        id_catch = sArray;
    }

    public rrQq_1(rrQC rrQC2, vm_3 vm_32, vm_3 vm_33) {
        super(new rgn_3(id_case[0]), vm_32, vm_33);
        this.id_final();
        rrQC rrQC3 = rrQC2;
        this.id_throws[rrQq_1.id_catch[0]] = rrQC3;
        Boolean bl = id_finally[0];
        this.id_class[rrQq_1.id_catch[1]] = bl;
    }

    static {
        rrQq_1.ntfClinit();
    }

    private static void id_interface() {
        id_implements = new byte[]{2, 100, 2, 6, 20, 16, 2, 100, 2, 2, 26, 100, 20, 2, 2, 2, 26, 100, 20, 2, 16, 23, 16, 3};
    }

    @Override
    public boolean id_class(int n, int n2, int n3) {
        this.id_final();
        if ((n == id_catch[30] || n == id_catch[31]) && ((LF)this.id_throws[rrQq_1.id_catch[32]]).id_int) {
            this.id_finally();
            return id_finally[11];
        }
        return super.id_class(n, n2, n3);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xBB347CF92B836CDDL;
    }

    @Override
    public void id_class(Ml_1 ml_1, int n, int n2, float f) {
        this.id_final();
        this.id_class(ml_1);
        super.id_class(ml_1, n, n2, f);
        this.id_super.id_class(ml_1, this.id_extends, this.id_package / id_implements[19], ((Lu_1)this.id_throws[rrQq_1.id_catch[26]]).id_final - id_implements[20] - id_implements[21], id_private[0]);
        this.id_super.id_break(ml_1, ((Lu_1)this.id_throws[id_catch[27]]).C_(), (float)((Lu_1)this.id_throws[rrQq_1.id_catch[28]]).id_volatile, (float)(((Lu_1)this.id_throws[rrQq_1.id_catch[29]]).id_final - id_implements[22]), id_private[1]);
    }

    private static int id_break(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xA48E158A;
    }

    private static /* synthetic */ void ntfClinit() {
        rrQq_1.id_package();
        rrQq_1.id_char();
        rrQq_1.id_int();
        rrQq_1.id_interface();
        rrQq_1.id_abstract();
    }

    public void id_finally() {
        this.id_final();
        if (!this.id_native()) {
            return;
        }
        rqN_2 rqN_22 = rrQg_1.id_break(((Lu_1)this.id_throws[id_catch[13]]).id_private());
        if (((rrQk_1)rrQk_1.staticFields9c4062aebf3b3e0dbb68c82ac08880ac[id_catch[14]]).id_class((rrQx_1)new rrQQ(rqN_22.id_byte(), UUIDTypeAdapter.fromString((String)rqN_22.id_break()), (rrQd_1)((Object)rrQd_1.staticFields634ba5beb257384d8792f008140c7c0a[id_catch[15]])), id_finally[4], id_finally[5])) {
            ((rrQC)this.id_throws[id_catch[16]]).id_native();
            ((Lu_1)this.id_throws[rrQq_1.id_catch[17]]).id_int = id_finally[6];
            ((LF)this.id_throws[rrQq_1.id_catch[18]]).id_int = id_finally[7];
            rrQg_1.id_class(rqN_22);
            ((rrQv_1)((rrQu_1)((rrQN)((Object)rrQN.staticFields065bd3322daf3178a8bd0d03c4b20e54[rrQq_1.id_catch[19]])).fields065bd3322daf3178a8bd0d03c4b20e54[rrQq_1.id_catch[20]]).id_class[rrQq_1.id_catch[21]]).id_class = ((Lu_1)this.id_throws[id_catch[22]]).id_private();
            ((Logger)QY.id_break[id_catch[23]]).info(id_case[4]);
            Boolean bl = id_finally[8];
            this.id_class[rrQq_1.id_catch[24]] = bl;
        }
    }

    private static void id_package() {
        boolean[] blArray = new boolean[13];
        blArray[0] = true;
        blArray[1] = true;
        blArray[2] = true;
        blArray[4] = true;
        blArray[5] = true;
        blArray[8] = true;
        blArray[9] = true;
        blArray[11] = true;
        blArray[12] = true;
        id_finally = blArray;
    }

    @Override
    public void id_private() {
        this.id_final();
        super.id_private();
        ((Lu_1)this.id_throws[id_catch[33]]).id_catch();
    }

    private static void id_abstract() {
        id_private = new int[]{0xFFFFFF, 0xA0A0A0};
    }

    private void id_final() {
        if (this.id_throws == null) {
            Object[] objectArray = this.id_throws = new Object[id_implements[23]];
        }
    }

    public boolean id_native() {
        this.id_final();
        return !((Lu_1)this.id_throws[id_catch[25]]).id_private().isBlank() ? id_finally[9] : id_finally[10];
    }

    @Override
    public void v_() {
        this.id_final();
        super.v_();
        ((Qj_1)this.id_volatile.id_class[id_catch[2]]).id_class(id_finally[1]);
        Lu_1 lu_1 = new Lu_1(this.id_super, this.id_package / id_implements[0] - id_implements[1], this.id_int / id_implements[2] - id_implements[3], id_catch[3], id_implements[4], new rgn_3(id_case[1]));
        this.id_throws[rrQq_1.id_catch[4]] = lu_1;
        this.id_class(lu_1);
        ((Lu_1)this.id_throws[id_catch[5]]).id_implements(id_implements[5]);
        ((Lu_1)this.id_throws[id_catch[6]]).id_class((String string) -> {
            this.id_final();
            ((LF)this.id_throws[rrQq_1.id_catch[35]]).id_int = this.id_native();
        });
        ((Lu_1)this.id_throws[id_catch[7]]).id_class((String string) -> {
            if (string.isEmpty()) {
                return id_finally[12];
            }
            return ((Pattern)rrtR_2.id_class[id_catch[34]]).matcher((CharSequence)string).matches();
        });
        ((Lu_1)this.id_throws[id_catch[8]]).id_byte(id_finally[2]);
        LF lF2 = new LF(this.id_package / id_implements[6] - id_implements[7] - id_implements[8], this.id_int / id_implements[9] + id_implements[10], id_implements[11], id_implements[12], new rgn_3(id_case[2]), lF -> this.id_finally());
        this.id_throws[rrQq_1.id_catch[9]] = lF2;
        this.id_class(lF2);
        ((LF)this.id_throws[rrQq_1.id_catch[10]]).id_int = this.id_native();
        this.id_class(new LF(this.id_package / id_implements[13] + id_implements[14], this.id_int / id_implements[15] + id_implements[16], id_implements[17], id_implements[18], new rgn_3(id_case[3]), lF -> this.id_volatile()));
        this.id_class((Lu_1)this.id_throws[id_catch[11]]);
    }

    @Override
    public void w_() {
        super.w_();
        ((Qj_1)this.id_volatile.id_class[id_catch[12]]).id_class(id_finally[3]);
    }
}

