/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ComparisonChain
 */
package celestial;

import celestial.bd_3;
import celestial.cb_3;
import celestial.iB_2;
import com.google.common.collect.ComparisonChain;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class bk_3
implements bd_3 {
    private static short[] id_class;

    static {
        bk_3.id_class();
    }

    @Override
    public /* synthetic */ int compare(Object object, Object object2) {
        return this.id_class((iB_2)object, (iB_2)object2);
    }

    private static void id_class() {
        id_class = new short[]{57};
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{29, 102, -112, 40, 6, -82, -111, 112}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public int id_class(iB_2 iB_22, iB_2 iB_23) {
        cb_3 cb_32 = (cb_3)bk_3.id_import.id_class[id_class[0]];
        ComparisonChain comparisonChain = ComparisonChain.start();
        comparisonChain = comparisonChain.compare(iB_22.id_int(cb_32), iB_23.id_int(cb_32));
        return comparisonChain.result();
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xD349E732;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xE017C288BD6D231CL;
    }
}

