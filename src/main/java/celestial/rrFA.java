/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Ml_1;
import celestial.iB_2;
import celestial.rXQ;
import celestial.rdn_3;
import celestial.rpm_3;
import celestial.rrFL;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrFA {
    private static short[] id_byte;
    public static Object[] id_class;
    private static float[] id_protected;
    private static byte[] id_throws;
    public Object[] id_break;
    private static boolean[] id_case;

    private static void id_byte() {
        id_protected = new float[]{0.55f, 0.5f, 0.5f, -8.0f, 11.0f, 8.0f, 0.5f, 8.0f, 8.0f, 0.5f, 3.0f};
    }

    public rrFA() {
        rrFL[] rrFLArray;
        this.id_protected();
        this.id_break[rrFA.id_byte[0]] = rrFLArray = new rrFL[id_throws[0]];
        for (int i = id_case[0]; i < id_throws[1]; ++i) {
            ((rrFL[])this.id_break[rrFA.id_byte[1]])[i] = new rrFL(id_protected[0], id_protected[1], id_protected[2]);
        }
    }

    static {
        rrFA.ntfClinit();
    }

    private static rdn_3 id_class(iB_2 iB_22, int n) {
        return switch (n) {
            case 0 -> iB_22.id_class(rXQ.HEAD);
            case 1 -> iB_22.id_class(rXQ.CHEST);
            case 2 -> iB_22.id_class(rXQ.LEGS);
            case 3 -> iB_22.id_class(rXQ.FEET);
            case 4 -> iB_22.id_protected(rpm_3.MAIN_HAND);
            case 5 -> iB_22.id_protected(rpm_3.OFF_HAND);
            default -> throw new IllegalArgumentException("\u043d\u0435\u0432\u0435\u0440\u043d\u044b\u0439 \u0438\u043d\u0434\u0435\u043a\u0441 \u0441\u043b\u043e\u0442\u0430: " + n);
        };
    }

    public void id_class(Ml_1 ml_1, float f, float f2, float f3) {
        int n = id_case[6];
        for (int i = id_throws[3]; i >= 0; --i) {
            if (!((rrFL[])this.id_break[id_byte[5]])[i].id_byte()) continue;
            float f4 = id_protected[3] - (float)n * id_protected[4];
            ((rrFL[])this.id_break[id_byte[6]])[i].id_class(f4);
            ++n;
        }
        rrFL[] rrFLArray = (rrFL[])this.id_break[id_byte[7]];
        int n2 = rrFLArray.length;
        for (int i = id_case[7]; i < n2; ++i) {
            rrFL rrFL2 = rrFLArray[i];
            if (!rrFL2.id_byte()) continue;
            rrFL2.id_class(ml_1, f + rrFL2.id_class(), f2, f3, id_protected[5], id_protected[6]);
        }
    }

    public void id_class(iB_2 iB_22) {
        for (int i = id_case[5]; i < id_throws[2]; ++i) {
            ((rrFL[])this.id_break[id_byte[4]])[i].id_class(rrFA.id_class(iB_22, i));
        }
    }

    public boolean id_class() {
        rrFL[] rrFLArray = (rrFL[])this.id_break[id_byte[3]];
        int n = rrFLArray.length;
        for (int i = id_case[2]; i < n; ++i) {
            rrFL rrFL2 = rrFLArray[i];
            if (!rrFL2.id_byte()) continue;
            return id_case[3];
        }
        return id_case[4];
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-27, 75, -10, -40, -75, 79, 11, 68}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xB390C77CA63FBDEEL;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x859A981F;
    }

    public void id_break() {
        rrFL[] rrFLArray = (rrFL[])this.id_break[id_byte[2]];
        int n = rrFLArray.length;
        for (int i = id_case[1]; i < n; ++i) {
            rrFL rrFL2 = rrFLArray[i];
            rrFL2.id_break();
        }
    }

    private static void id_throws() {
        Object[] objectArray = new Object[]{Float.valueOf(0.0f), Float.valueOf(0.0f), Float.valueOf(0.0f), Float.valueOf(0.0f), 6};
        id_class = objectArray;
    }

    private static /* synthetic */ void ntfClinit() {
        rrFA.id_catch();
        rrFA.id_case();
        rrFA.id_byte();
        rrFA.id_private();
        rrFA.id_throws();
    }

    private static void id_catch() {
        boolean[] blArray = new boolean[11];
        blArray[3] = true;
        blArray[8] = true;
        blArray[10] = true;
        id_case = blArray;
    }

    private static void id_case() {
        id_byte = new short[8];
    }

    private void id_protected() {
        if (this.id_break == null) {
            Object[] objectArray = this.id_break = new Object[id_case[8]];
        }
    }

    private static void id_private() {
        id_throws = new byte[]{6, 6, 6, 5, 5, 2, 3, 4, 6};
    }
}

