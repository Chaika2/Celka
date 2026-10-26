/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.C_throws;
import celestial.module.Category;
import celestial.rdn_3;
import celestial.rql_3;
import celestial.rrNA;
import celestial.rrNF;
import celestial.rrNW;
import celestial.rrNc_1;
import celestial.rrNd_1;
import celestial.rrNw_1;
import celestial.rrQX;
import celestial.rrZN;
import celestial.rrZj_1;
import celestial.util.MinecraftAccessor;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrNn_1
implements rrNA {
    private static boolean[] id_class;
    private static short[] id_break;
    private static String[] id_byte;
    private static byte[] id_protected;
    private static long[] id_throws;

    private static void id_byte() {
        boolean[] blArray = new boolean[3];
        blArray[1] = true;
        id_class = blArray;
    }

    public rrNn_1(rrNW rrNW2) {
    }

    static {
        rrNn_1.ntfClinit();
    }

    private static void id_class() {
        short[] sArray = new short[3];
        sArray[0] = 1;
        sArray[2] = 8;
        id_break = sArray;
    }

    @Override
    public void id_class(rrNF rrNF2) {
        rrNd_1 rrNd_12 = rrNF2.id_break();
        rrNw_1 rrNw_12 = rrNd_12.id_break();
        if (rrNw_12 == null) {
            return;
        }
        rdn_3 rdn_32 = rrNw_12.id_protected();
        String string = rrNd_12.id_case() == null ? rdn_32.id_continue().id_byte() : rrNd_12.id_case();
        int n = rrNw_12.id_case();
        long l = Math.max(id_throws[0], C_throws.id_byte().id_native().id_byte() - (long)n);
        switch (((int[])rrNc_1.id_class[id_break[0]])[rrNF2.id_class().ordinal()]) {
            case 1: {
                Object[] objectArray = new Object[id_protected[0]];
                objectArray[rrNn_1.id_class[0]] = rdn_32.id_char();
                objectArray[rrNn_1.id_class[1]] = string;
                objectArray[rrNn_1.id_protected[1]] = rql_3.id_class((Number)n, (char)id_protected[2]);
                objectArray[rrNn_1.id_protected[3]] = rql_3.id_class((Number)l, (char)id_protected[4]);
                MinecraftAccessor.a_(String.format(id_byte[0], objectArray), id_class[2]);
            }
        }
        rrZN rrZN2 = ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_break[1]]).id_byte().id_interface().id_extends().id_class((Category)((Object)Category.staticFieldse67813cd60183787b1de54ac6b91c916[id_break[2]]));
        if (rrZN2 instanceof rrZj_1) {
            rrZj_1 rrZj_12 = (rrZj_1)rrZN2;
            rrZj_12.id_class(rrNF2);
        }
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x869EEEB8;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x43FA09DB3A276076L;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-96, -114, -102, -116, -86, -45, 63, 24}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static void id_break() {
        id_byte = new String[]{new String("Auto Buy: \u0423\u0441\u043f\u0435\u0448\u043d\u043e \u043a\u0443\u043f\u0438\u043b %s %s \u0437\u0430 %s$! \u041e\u0441\u0442\u0430\u0442\u043e\u043a \u043d\u0430 \u0431\u0430\u043b\u0430\u043d\u0441\u0435: %s$")};
    }

    private static void id_throws() {
        id_throws = new long[1];
    }

    private static /* synthetic */ void ntfClinit() {
        rrNn_1.id_byte();
        rrNn_1.id_break();
        rrNn_1.id_throws();
        rrNn_1.id_class();
        rrNn_1.id_protected();
    }

    private static void id_protected() {
        id_protected = new byte[]{4, 2, 32, 3, 32};
    }
}

