/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.C_class;
import celestial.bM_2;
import celestial.bb_3;
import celestial.rFm_1;
import celestial.rFu_1;
import celestial.rVi_1;
import celestial.rfH_2;
import celestial.rgF_2;
import celestial.rgN_2;
import celestial.rrLp_1;
import celestial.rrLq_1;
import celestial.rrLu_1;
import celestial.rrjM_2;
import celestial.ruS_2;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class bG_2
extends bb_3 {
    private static byte[] id_protected;
    private static boolean[] id_throws;
    public static Object[] id_class;
    private static short[] id_case;
    private static String[] id_catch;
    public Object[] id_break;

    public bG_2(C_class c_class, bM_2 bM_22) {
        super(c_class, bM_22);
        this.id_final();
    }

    static {
        bG_2.ntfClinit();
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x319E8DB678B005E0L;
    }

    @Override
    public void id_class(rrLu_1 rrLu_12) {
        ruS_2<?> ruS_22 = rrLu_12.id_class();
        if (ruS_22 instanceof rFu_1) {
            rFu_1 rFu_12 = (rFu_1)ruS_22;
            ruS_22 = rFu_12.id_byte();
            if (rFu_12.id_break() != rFm_1.ACTIONBAR || ruS_22 == null) {
                return;
            }
            String string = ruS_22.id_byte();
            if (((Pattern)rrjM_2.id_class[id_case[6]]).matcher(string).find()) {
                this.id_implements();
            }
        }
    }

    @Override
    public void id_class() {
        super.id_class();
        this.id_catch();
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xF35A2775;
    }

    @Override
    public void id_class(rrLp_1 rrLp_12) {
        this.id_final();
        if (rrLp_12.id_case() == (rrLq_1)((Object)rrLq_1.staticFields2d4389a28d3a3bcfbac26ede38e74314[id_case[0]])) {
            rfH_2 rfH_22 = rrLp_12.id_class();
            if (!rfH_22.equals((rfH_2)this.id_break[id_case[1]])) {
                rfH_2 rfH_23 = rfH_22;
                this.id_break[bG_2.id_case[2]] = rfH_23;
                Integer n = id_throws[0];
                this.id_break[bG_2.id_case[3]] = n;
            } else {
                bG_2 bG_22 = this;
                int n = (Integer)bG_22.id_break[id_case[4]] + id_throws[1];
                Integer n2 = n;
                bG_22.id_break[bG_2.id_case[5]] = n2;
                if (n >= id_protected[0]) {
                    this.id_implements();
                    this.id_catch();
                }
            }
        }
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{41, -15, -72, -80, -113, -32, -78, 82}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static void id_throws() {
        Object[] objectArray = new Object[]{15};
        id_class = objectArray;
    }

    private static /* synthetic */ void ntfClinit() {
        bG_2.id_private();
        bG_2.id_extends();
        bG_2.id_case();
        bG_2.id_finally();
        bG_2.id_throws();
    }

    private static void id_finally() {
        id_protected = new byte[]{15, 2, 15};
    }

    private void id_catch() {
        this.id_final();
        Object var5_1 = null;
        this.id_break[bG_2.id_case[7]] = var5_1;
        Integer n = id_throws[2];
        this.id_break[bG_2.id_case[8]] = n;
    }

    private static void id_extends() {
        id_catch = new String[]{new String("\u041d\u0430\u0439\u0434\u0435\u043d \u043f\u0440\u0438\u0432\u0430\u0442")};
    }

    private static void id_case() {
        short[] sArray = new short[9];
        sArray[0] = 2;
        sArray[3] = 1;
        sArray[4] = 1;
        sArray[5] = 1;
        sArray[8] = 1;
        id_case = sArray;
    }

    private void id_implements() {
        rVi_1 rVi_12 = new rgN_2(id_catch[0]).id_class(rgF_2.GRAY);
        this.id_class(rVi_12);
        this.id_catch();
    }

    private static void id_private() {
        boolean[] blArray = new boolean[7];
        blArray[0] = true;
        blArray[1] = true;
        blArray[3] = true;
        blArray[5] = true;
        id_throws = blArray;
    }

    private void id_final() {
        if (this.id_break == null) {
            Object[] objectArray = this.id_break = new Object[id_protected[1]];
            objectArray[bG_2.id_throws[3]] = id_throws[4];
        }
    }
}

