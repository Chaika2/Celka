/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rJY;
import celestial.rcd_3;
import celestial.rcy_3;
import celestial.rdn_3;
import celestial.rgB_2;
import celestial.rrNI;
import celestial.rrNt_1;
import celestial.rrNw_1;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrNa_1
extends Enum<rrNa_1>
implements rrNI {
    private static boolean[] booleans477bc35efba33c1cba244cd88c6fd655;
    public static Object[] staticFields477bc35efba33c1cba244cd88c6fd655;
    private static short[] shorts477bc35efba33c1cba244cd88c6fd655;
    private static byte[] bytes477bc35efba33c1cba244cd88c6fd655;
    private static String[] strings477bc35efba33c1cba244cd88c6fd655;

    private static void id_byte() {
        strings477bc35efba33c1cba244cd88c6fd655 = new String[]{new String("display"), new String("display"), new String("Lore"), new String("Lore"), new String("\u0426\u0435\u043da"), new String("\u0426\u0435\u043d\u0430"), new String("$"), new String("\u0437\u0430 \u0448\u0442\u0443\u043a\u0443"), new String("\\D"), new String(""), new String("\u041f\u0440\u043e\u0434\u0430\u0432\u0435\u0446"), new String("INSTANCE")};
    }

    static {
        rrNa_1.ntfClinit();
    }

    public static rrNa_1[] values() {
        return (rrNa_1[])((rrNa_1[])staticFields477bc35efba33c1cba244cd88c6fd655[shorts477bc35efba33c1cba244cd88c6fd655[0]]).clone();
    }

    public static rrNa_1 valueOf(String string) {
        return Enum.valueOf(rrNa_1.class, string);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xB49841B1;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x89F78739D4D2941DL;
    }

    @Override
    public /* synthetic */ rrNw_1 id_class(rJY rJY2) {
        return this.id_break(rJY2);
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{10, -71, -114, -89, 60, -9, -123, -123}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static void id_class() {
        bytes477bc35efba33c1cba244cd88c6fd655 = new byte[]{-1, 10, 9, 8, -1, 58, -1, 2};
    }

    private static void id_break() {
        short[] sArray = new short[2];
        sArray[0] = 1;
        shorts477bc35efba33c1cba244cd88c6fd655 = sArray;
    }

    public rrNt_1 id_break(rJY rJY2) {
        rcd_3 rcd_32;
        rdn_3 rdn_32 = rJY2.id_class();
        if (!rdn_32.id_final()) {
            return null;
        }
        rcd_3 rcd_33 = rdn_32.id_package();
        String string = null;
        int n = bytes477bc35efba33c1cba244cd88c6fd655[0];
        if (rcd_33.id_byte(strings477bc35efba33c1cba244cd88c6fd655[0], bytes477bc35efba33c1cba244cd88c6fd655[1]) && (rcd_32 = rcd_33.id_int(strings477bc35efba33c1cba244cd88c6fd655[1])).id_protected(strings477bc35efba33c1cba244cd88c6fd655[2]) == bytes477bc35efba33c1cba244cd88c6fd655[2]) {
            rcy_3 rcy_32 = rcd_32.id_protected(strings477bc35efba33c1cba244cd88c6fd655[3], bytes477bc35efba33c1cba244cd88c6fd655[3]);
            for (int i = booleans477bc35efba33c1cba244cd88c6fd655[0]; i < rcy_32.size(); ++i) {
                String string2 = rgB_2.id_class(rcy_32.id_implements(i)).getString();
                if ((string2.contains(strings477bc35efba33c1cba244cd88c6fd655[4]) || string2.contains(strings477bc35efba33c1cba244cd88c6fd655[5])) && string2.contains(strings477bc35efba33c1cba244cd88c6fd655[6]) && !string2.contains(strings477bc35efba33c1cba244cd88c6fd655[7])) {
                    try {
                        n = Integer.parseInt(string2.replaceAll(strings477bc35efba33c1cba244cd88c6fd655[8], strings477bc35efba33c1cba244cd88c6fd655[9]));
                    }
                    catch (NumberFormatException numberFormatException) {
                        n = bytes477bc35efba33c1cba244cd88c6fd655[4];
                    }
                } else if (string2.contains(strings477bc35efba33c1cba244cd88c6fd655[10])) {
                    string = string2.substring(string2.indexOf(bytes477bc35efba33c1cba244cd88c6fd655[5]) + booleans477bc35efba33c1cba244cd88c6fd655[1]).trim();
                }
                if (n != bytes477bc35efba33c1cba244cd88c6fd655[6] && string != null) break;
            }
        }
        return new rrNt_1(rJY2, string, n);
    }

    private static void id_throws() {
        Object[] objectArray;
        objectArray = new Object[]{new rrNa_1(), new rrNa_1[]{(rrNa_1)objectArray[0]}};
        staticFields477bc35efba33c1cba244cd88c6fd655 = objectArray;
    }

    private static /* synthetic */ void ntfClinit() {
        rrNa_1.id_protected();
        rrNa_1.id_byte();
        rrNa_1.id_break();
        rrNa_1.id_class();
        rrNa_1.id_throws();
    }

    private static /* synthetic */ rrNa_1[] id_case() {
        rrNa_1[] rrNa_1Array = new rrNa_1[booleans477bc35efba33c1cba244cd88c6fd655[2]];
        rrNa_1Array[rrNa_1.booleans477bc35efba33c1cba244cd88c6fd655[3]] = (rrNa_1)staticFields477bc35efba33c1cba244cd88c6fd655[shorts477bc35efba33c1cba244cd88c6fd655[1]];
        return rrNa_1Array;
    }

    private static void id_protected() {
        boolean[] blArray = new boolean[7];
        blArray[1] = true;
        blArray[2] = true;
        blArray[6] = true;
        booleans477bc35efba33c1cba244cd88c6fd655 = blArray;
    }
}

