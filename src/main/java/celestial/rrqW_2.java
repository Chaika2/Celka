/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ComparisonChain
 */
package celestial;

import celestial.rfH_2;
import celestial.rja_3;
import celestial.rrjc_3;
import celestial.rrqQ_2;
import celestial.xd_3;
import com.google.common.collect.ComparisonChain;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Comparator;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrqW_2
implements Comparator<rja_3> {
    private static short[] id_class;

    static {
        rrqW_2.id_class();
    }

    @Override
    public /* synthetic */ int compare(Object object, Object object2) {
        return this.id_class((rja_3)object, (rja_3)object2);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xBF8E624;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xA8EFA254BA4534DBL;
    }

    private static void id_class() {
        id_class = new short[2];
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{9, 36, 61, 26, -99, 100, 58, 77}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public int id_class(rja_3 rja_32, rja_3 rja_33) {
        xd_3 xd_32 = rrjc_3.id_protected(new rfH_2(rja_32));
        xd_3 xd_33 = rrjc_3.id_protected(new rfH_2(rja_33));
        return ComparisonChain.start().compareTrueFirst(((rrqQ_2)rrqQ_2.staticFieldsaf585ffa18e23930a314cd0048f74bf2[id_class[0]]).id_break(xd_32), ((rrqQ_2)rrqQ_2.staticFieldsaf585ffa18e23930a314cd0048f74bf2[id_class[1]]).id_break(xd_33)).result();
    }
}

