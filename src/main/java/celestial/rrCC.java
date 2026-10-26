/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ComparisonChain
 */
package celestial;

import celestial.rAB;
import celestial.rLD;
import celestial.rLY;
import celestial.rdn_3;
import com.google.common.collect.ComparisonChain;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Comparator;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrCC
implements Comparator<rdn_3> {
    private static boolean[] id_class;

    static {
        rrCC.id_class();
    }

    @Override
    public /* synthetic */ int compare(Object object, Object object2) {
        return this.id_class((rdn_3)object, (rdn_3)object2);
    }

    public int id_class(rdn_3 rdn_32, rdn_3 rdn_33) {
        int n = id_class[0];
        int n2 = id_class[1];
        for (rLY rLY2 : rAB.id_class(rdn_32)) {
            if (rLY2.id_class() != rLD.id_case) continue;
            n = rLY2.id_byte();
            break;
        }
        for (rLY rLY2 : rAB.id_class(rdn_33)) {
            if (rLY2.id_class() != rLD.id_case) continue;
            n2 = rLY2.id_byte();
            break;
        }
        return ComparisonChain.start().compare(n2, n).result();
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{106, 4, -99, -112, 23, 88, -19, -109}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x9AA94DE0;
    }

    private static void id_class() {
        id_class = new boolean[2];
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xBE7E0C52E1B6E002L;
    }
}

