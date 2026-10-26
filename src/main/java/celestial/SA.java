/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.SH;
import celestial.SL;
import celestial.ST;
import celestial.Sn_1;
import celestial.Sv_1;
import celestial.Sy_1;
import celestial.rrfp_3;
import celestial.rrfq_3;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Optional;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class SA {
    private static short[] id_break;
    private static byte[] id_byte;
    public Object[] id_class;

    private static void id_byte() {
        id_byte = new byte[]{3};
    }

    public SA(SL sL) {
        this.id_protected();
        ST sT = new ST(sL);
        this.id_class[SA.id_break[0]] = sT;
        SH sH = new SH(sL);
        this.id_class[SA.id_break[1]] = sH;
        Sy_1 sy_1 = new Sy_1(sL);
        this.id_class[SA.id_break[2]] = sy_1;
    }

    static {
        SA.ntfClinit();
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-98, 19, 50, 118, -95, -107, 75, -53}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x71FC224AC25C273BL;
    }

    public Optional<Sv_1> id_class() {
        rrfq_3 rrfq_32 = (rrfq_3)((Object)rrfp_3.id_class[id_break[3]]);
        if (rrfq_32 != null) {
            return switch (((int[])Sn_1.id_class[id_break[4]])[rrfq_32.ordinal()]) {
                case 1 -> Optional.of((ST)this.id_class[id_break[5]]);
                case 2, 3 -> Optional.of((SH)this.id_class[id_break[6]]);
                case 4 -> Optional.of((Sy_1)this.id_class[id_break[7]]);
                default -> Optional.empty();
            };
        }
        return Optional.empty();
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x7DFCB037;
    }

    private static void id_break() {
        short[] sArray = new short[8];
        sArray[1] = 1;
        sArray[2] = 2;
        sArray[3] = 1;
        sArray[6] = 1;
        sArray[7] = 2;
        id_break = sArray;
    }

    private static /* synthetic */ void ntfClinit() {
        SA.id_break();
        SA.id_byte();
    }

    private void id_protected() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_byte[0]];
        }
    }
}

