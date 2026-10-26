/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ComparisonChain
 */
package celestial;

import celestial.aI_2;
import celestial.bd_3;
import celestial.cb_3;
import celestial.iB_2;
import com.google.common.collect.ComparisonChain;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class bh_3
implements bd_3 {
    private static boolean[] id_class;
    private static short[] id_break;

    static {
        bh_3.ntfClinit();
    }

    @Override
    public /* synthetic */ int compare(Object object, Object object2) {
        return this.id_class((iB_2)object, (iB_2)object2);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xBD526DE8CD451525L;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x219D64BD;
    }

    private static void id_class() {
        boolean[] blArray = new boolean[4];
        blArray[0] = true;
        blArray[2] = true;
        id_class = blArray;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-66, -88, 53, 27, -33, -35, -43, -109}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public int id_class(iB_2 iB_22, iB_2 iB_23) {
        cb_3 cb_32 = (cb_3)bh_3.id_import.id_class[id_break[0]];
        ComparisonChain comparisonChain = ComparisonChain.start();
        comparisonChain = comparisonChain.compareTrueFirst(iB_22.BC() == aI_2.id_volatile ? id_class[0] : id_class[1], iB_23.BC() == aI_2.id_volatile ? id_class[2] : id_class[3]);
        comparisonChain = comparisonChain.compare(cb_32.id_int(iB_22), cb_32.id_int(iB_23));
        comparisonChain = comparisonChain.compare(iB_22.V(), iB_23.V());
        return comparisonChain.result();
    }

    private static void id_break() {
        id_break = new short[]{57};
    }

    private static /* synthetic */ void ntfClinit() {
        bh_3.id_class();
        bh_3.id_break();
    }
}

