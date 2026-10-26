/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.MA;
import celestial.ML;
import celestial.MZ;
import celestial.Mc_1;
import celestial.Mv_1;
import celestial.rfH_2;
import celestial.rqj_3;
import celestial.rw_3;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Optional;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class Mu_1
extends Enum<Mu_1> {
    public static Object[] staticFields053cbf67908b3ce2899bd53c6bc97554;
    private static short[] shorts053cbf67908b3ce2899bd53c6bc97554;
    private static boolean[] booleans053cbf67908b3ce2899bd53c6bc97554;

    private static void id_byte() {
        shorts053cbf67908b3ce2899bd53c6bc97554 = new short[1];
    }

    static {
        Mu_1.ntfClinit();
    }

    public static Mu_1[] values() {
        return (Mu_1[])((Mu_1[])staticFields053cbf67908b3ce2899bd53c6bc97554[shorts053cbf67908b3ce2899bd53c6bc97554[0]]).clone();
    }

    public static Mu_1 valueOf(String string) {
        return Enum.valueOf(Mu_1.class, string);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x24AA5CEF;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x3219638A3086DE2DL;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{47, 64, -117, 51, 25, 37, 12, 12}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public static Optional<rqj_3<rw_3, rfH_2>> id_class() {
        return Optional.ofNullable(MA.id_class).map(mL -> new rqj_3<Mc_1, MZ>(new Mc_1((ML)mL), mL.id_class));
    }

    public static boolean id_break() {
        try {
            Class.forName(Mv_1.class.getName());
            return booleans053cbf67908b3ce2899bd53c6bc97554[0];
        }
        catch (ClassNotFoundException | NoClassDefFoundError throwable) {
            return booleans053cbf67908b3ce2899bd53c6bc97554[1];
        }
    }

    private static void id_throws() {
        boolean[] blArray = new boolean[5];
        blArray[0] = true;
        blArray[4] = true;
        booleans053cbf67908b3ce2899bd53c6bc97554 = blArray;
    }

    private static /* synthetic */ void ntfClinit() {
        Mu_1.id_throws();
        Mu_1.id_byte();
        Mu_1.id_protected();
    }

    private static /* synthetic */ Mu_1[] id_case() {
        return new Mu_1[booleans053cbf67908b3ce2899bd53c6bc97554[2]];
    }

    private static void id_protected() {
        Mu_1[] mu_1Array = new Mu_1[5];
        Object[] objectArray = new Object[]{mu_1Array};
        staticFields053cbf67908b3ce2899bd53c6bc97554 = objectArray;
    }
}

