/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rJY;
import celestial.rdn_3;
import celestial.rrNd_1;
import celestial.rrNw_1;
import celestial.rrcz_3;
import celestial.rrfI_2;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrcQ_2
extends rrfI_2<Boolean> {
    private static byte[] id_break;
    private static float[] id_byte;
    public Object[] id_class;
    private static short[] id_protected;
    private static boolean[] id_throws;

    @Override
    public boolean id_byte() {
        return this.id_break();
    }

    public rrcQ_2(rrcz_3 rrcz_32, rrNw_1 rrNw_12, rrNd_1 rrNd_12) {
        this.id_protected();
        rrNw_1 rrNw_13 = rrNw_12;
        this.id_class[rrcQ_2.id_protected[0]] = rrNw_13;
        rrNd_1 rrNd_13 = rrNd_12;
        this.id_class[rrcQ_2.id_protected[1]] = rrNd_13;
    }

    static {
        rrcQ_2.ntfClinit();
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-61, -81, -124, 79, -114, -2, -12, -118}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x3DF03FA8;
    }

    @Override
    public /* synthetic */ Object id_class() {
        return this.id_break();
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x58CD59195C1F8422L;
    }

    public Boolean id_break() {
        rdn_3 rdn_32;
        this.id_protected();
        rJY rJY2 = ((rrNw_1)this.id_class[id_protected[2]]).id_throws();
        rdn_3 rdn_33 = rdn_32 = rJY2 == null ? ((rrNw_1)this.id_class[id_protected[3]]).id_protected() : rJY2.id_class();
        if (!(((rrNd_1)this.id_class[id_protected[4]]).id_throws() && ((rrNd_1)this.id_class[id_protected[5]]).id_return() && rdn_32.id_throws())) {
            return id_throws[0];
        }
        int n = rdn_32.id_private();
        int n2 = n - rdn_32.id_catch();
        int n3 = (int)((float)n2 / (float)n * id_byte[0]);
        return n3 >= ((rrNd_1)this.id_class[id_protected[6]]).id_public() ? id_throws[1] : id_throws[2];
    }

    private static void id_throws() {
        id_byte = new float[]{100.0f};
    }

    private static /* synthetic */ void ntfClinit() {
        rrcQ_2.id_catch();
        rrcQ_2.id_case();
        rrcQ_2.id_throws();
        rrcQ_2.id_private();
    }

    private static void id_catch() {
        boolean[] blArray = new boolean[3];
        blArray[0] = true;
        blArray[1] = true;
        id_throws = blArray;
    }

    private static void id_case() {
        short[] sArray = new short[7];
        sArray[1] = 1;
        sArray[4] = 1;
        sArray[5] = 1;
        sArray[6] = 1;
        id_protected = sArray;
    }

    private void id_protected() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_break[0]];
        }
    }

    private static void id_private() {
        id_break = new byte[]{2};
    }
}

