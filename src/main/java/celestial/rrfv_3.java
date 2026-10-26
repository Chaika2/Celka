/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.C_throws;
import celestial.PH;
import celestial.Pl_1;
import celestial.rVi_1;
import celestial.rgF_2;
import celestial.rgN_2;
import celestial.rql_3;
import celestial.rrfu_3;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrfv_3 {
    private static String[] id_class;
    private static byte[] id_break;
    private static boolean[] id_byte;

    private static void id_byte() {
        id_class = new String[]{new String(""), new String("\u0440\u0430\u0437"), new String("\u0440\u0430\u0437\u0430"), new String("\u0440\u0430\u0437")};
    }

    static {
        rrfv_3.ntfClinit();
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x5DFCCBAA6D576CDFL;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x9DFDEC2B;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{88, -125, 54, -99, -78, -11, -106, -113}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public static boolean id_class(String string, boolean bl) {
        if (bl) {
            Pl_1 pl_1 = C_throws.id_byte().id_short();
            if (!pl_1.id_break()) {
                pl_1.id_class(new PH(string, id_break[0]));
            }
            PH pH = pl_1.id_class();
            pH.id_class(id_byte[0]);
            if (!pH.id_throws()) {
                int n = pH.id_byte();
                String[] stringArray = new String[id_break[1]];
                stringArray[rrfv_3.id_byte[1]] = id_class[1];
                stringArray[rrfv_3.id_byte[2]] = id_class[2];
                stringArray[rrfv_3.id_break[2]] = id_class[3];
                rVi_1 rVi_12 = new rgN_2(id_class[0]).id_break(rgF_2.GRAY).id_break("PVP Safe: \u041d\u0430\u043f\u0438\u0448\u0438\u0442\u0435 " + rgF_2.RED + "\"" + pH.id_break() + "\"" + rgF_2.GRAY + " \u0435\u0449\u0435 " + rgF_2.RED + n + " " + rql_3.id_class(n, stringArray) + rgF_2.GRAY + " \u0434\u043b\u044f \u043f\u043e\u0434\u0442\u0432\u0435\u0440\u0436\u0434\u0435\u043d\u0438\u044f");
                rrfu_3.id_class(rVi_12);
                return id_byte[3];
            }
            pl_1.id_byte();
        }
        return id_byte[4];
    }

    private static void id_class() {
        id_break = new byte[]{2, 3, 2};
    }

    private static void id_break() {
        boolean[] blArray = new boolean[5];
        blArray[0] = true;
        blArray[2] = true;
        blArray[3] = true;
        id_byte = blArray;
    }

    private static /* synthetic */ void ntfClinit() {
        rrfv_3.id_break();
        rrfv_3.id_byte();
        rrfv_3.id_class();
    }
}

