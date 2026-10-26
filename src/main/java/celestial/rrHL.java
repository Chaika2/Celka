/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.cb_3;
import celestial.module.util.CasinoBot;
import celestial.rrfQ_2;
import celestial.rrfw_3;
import celestial.util.MinecraftAccessor;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.concurrent.ThreadLocalRandom;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrHL {
    private static String[] id_break;
    private static byte[] id_byte;
    private static short[] id_protected;
    private static float[] id_throws;
    private static double[] id_case;
    private static boolean[] id_catch;
    public Object[] id_class;

    public int id_byte() {
        return (Integer)this.id_class[id_protected[23]];
    }

    public rrHL(CasinoBot casinoBot, int n, String string, rrfw_3 rrfw_32) {
        this.id_catch();
        CasinoBot casinoBot2 = casinoBot;
        this.id_class[rrHL.id_protected[26]] = casinoBot2;
        Integer n2 = n;
        this.id_class[rrHL.id_protected[27]] = n2;
        String string2 = string;
        this.id_class[rrHL.id_protected[28]] = string2;
        rrfw_3 rrfw_33 = rrfw_32;
        this.id_class[rrHL.id_protected[29]] = rrfw_33;
    }

    static {
        rrHL.ntfClinit();
    }

    private void id_class(int n) {
        Object[] objectArray = new Object[id_byte[0]];
        objectArray[rrHL.id_catch[0]] = (String)this.id_class[id_protected[1]];
        objectArray[rrHL.id_catch[1]] = n;
        ((cb_3)MinecraftAccessor.id_import.id_class[id_protected[0]]).id_protected(String.format(id_break[0], objectArray));
        Object[] objectArray2 = new Object[id_byte[1]];
        objectArray2[rrHL.id_catch[2]] = (String)this.id_class[id_protected[3]];
        objectArray2[rrHL.id_catch[3]] = n;
        ((cb_3)MinecraftAccessor.id_import.id_class[id_protected[2]]).id_protected(String.format(id_break[1], objectArray2));
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{115, -102, -94, 115, -51, 1, -67, -78}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public String id_class() {
        return (String)this.id_class[id_protected[24]];
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x2E812A6B52267848L;
    }

    private static int id_break(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x57360C48;
    }

    public rrfw_3 id_break() {
        return (rrfw_3)this.id_class[id_protected[25]];
    }

    private static void id_throws() {
        float[] fArray = new float[2];
        fArray[1] = 1.6f;
        id_throws = fArray;
    }

    private static /* synthetic */ void ntfClinit() {
        rrHL.id_case();
        rrHL.id_implements();
        rrHL.id_extends();
        rrHL.id_throws();
        rrHL.id_finally();
        rrHL.id_private();
    }

    private static void id_finally() {
        id_case = new double[]{1000.0};
    }

    private void id_catch() {
        if (this.id_class == null) {
            this.id_class = new Object[4];
            this.id_class[0] = 0;
        }
    }

    private static void id_extends() {
        short[] sArray = new short[30];
        sArray[0] = 57;
        sArray[1] = 1;
        sArray[2] = 57;
        sArray[3] = 1;
        sArray[5] = 2;
        sArray[6] = 3;
        sArray[7] = 3;
        sArray[8] = 3;
        sArray[10] = 57;
        sArray[11] = 1;
        sArray[13] = 57;
        sArray[14] = 1;
        sArray[16] = 57;
        sArray[17] = 1;
        sArray[20] = 57;
        sArray[21] = 1;
        sArray[24] = 1;
        sArray[25] = 2;
        sArray[26] = 3;
        sArray[28] = 1;
        sArray[29] = 2;
        id_protected = sArray;
    }

    private static void id_case() {
        boolean[] blArray = new boolean[18];
        blArray[1] = true;
        blArray[3] = true;
        blArray[4] = true;
        blArray[6] = true;
        blArray[7] = true;
        blArray[9] = true;
        blArray[11] = true;
        blArray[13] = true;
        blArray[14] = true;
        id_catch = blArray;
    }

    private static void id_implements() {
        id_break = new String[]{new String("/pay %s %s"), new String("/pay %s %s"), new String("/m %s %s"), new String("\u0418\u0437\u0432\u0438\u043d\u0438\u0442\u0435, \u0431\u0430\u043b\u0430\u043d\u0441\u0430 \u043d\u0435\u0434\u043e\u0441\u0442\u0430\u0442\u043e\u0447\u043d\u043e. \u0421\u0442\u0430\u0432\u043a\u0430 \u0432\u043e\u0437\u0432\u0440\u0430\u0449\u0435\u043d\u0430."), new String("/m %s %s"), new String("/m %s %s"), new String("/m %s %s")};
    }

    public boolean id_protected() {
        double d = rrfQ_2.id_class((double)ThreadLocalRandom.current().nextFloat(id_throws[0], id_throws[1]), id_byte[2]);
        int n = (int)Math.round((double)((Integer)this.id_class[id_protected[4]]).intValue() * d);
        if (((rrfw_3)this.id_class[id_protected[5]]).id_class(id_case[0])) {
            Integer n2 = (Integer)CasinoBot.id_byte[id_protected[6]] + id_catch[4];
            CasinoBot.id_byte[rrHL.id_protected[7]] = n2;
            if ((long)n > ((CasinoBot)this.id_class[id_protected[8]]).id_else()) {
                this.id_class((Integer)this.id_class[id_protected[9]]);
                Object[] objectArray = new Object[id_byte[3]];
                objectArray[rrHL.id_catch[5]] = (String)this.id_class[id_protected[11]];
                objectArray[rrHL.id_catch[6]] = id_break[3];
                ((cb_3)MinecraftAccessor.id_import.id_class[id_protected[10]]).id_protected(String.format(id_break[2], objectArray));
                return id_catch[7];
            }
            if (n > id_byte[4]) {
                this.id_class(n);
            }
            if (n == (Integer)this.id_class[id_protected[12]]) {
                Object[] objectArray = new Object[id_byte[5]];
                objectArray[rrHL.id_catch[8]] = (String)this.id_class[id_protected[14]];
                objectArray[rrHL.id_catch[9]] = "\u0412\u0430\u0448\u0430 \u0441\u0442\u0430\u0432\u043a\u0430 \u0432\u0435\u0440\u043d\u0443\u043b\u0430\u0441\u044c, \u043c\u043d\u043e\u0436\u0438\u0442\u0435\u043b\u044c " + d + "x";
                ((cb_3)MinecraftAccessor.id_import.id_class[id_protected[13]]).id_protected(String.format(id_break[4], objectArray));
            }
            if (n > (Integer)this.id_class[id_protected[15]]) {
                Object[] objectArray = new Object[id_byte[6]];
                objectArray[rrHL.id_catch[10]] = (String)this.id_class[id_protected[17]];
                objectArray[rrHL.id_catch[11]] = "\u041f\u043e\u0437\u0434\u0440\u0430\u0432\u043b\u044f\u044e, \u0442\u0432\u043e\u0438 \u0432\u044b\u0438\u0433\u0440\u044b\u0448 " + Math.abs(n - (Integer)this.id_class[id_protected[18]]) + "$, \u043c\u043d\u043e\u0436\u0438\u0442\u0435\u043b\u044c " + d + "x, \u043d\u0430\u043f\u0438\u0448\u0438\u0442\u0435 \u043e\u0442\u0437\u044b\u0432 \u043e \u043d\u0430\u0441 :)";
                ((cb_3)MinecraftAccessor.id_import.id_class[id_protected[16]]).id_protected(String.format(id_break[5], objectArray));
            }
            if (n < (Integer)this.id_class[id_protected[19]]) {
                Object[] objectArray = new Object[id_byte[7]];
                objectArray[rrHL.id_catch[12]] = (String)this.id_class[id_protected[21]];
                objectArray[rrHL.id_catch[13]] = "\u041a \u0441\u043e\u0436\u0430\u043b\u0435\u043d\u0438\u044e, \u0432\u044b \u043f\u0440\u043e\u0438\u0433\u0440\u0430\u043b\u0438 " + Math.abs(n - (Integer)this.id_class[id_protected[22]]) + "$, \u043c\u043d\u043e\u0436\u0438\u0442\u0435\u043b\u044c " + d + "x, \u043c\u043e\u0436\u0435\u0442 \u0432 \u0441\u043b\u0435\u0434\u0443\u044e\u0449\u0438\u0439 \u0440\u0430\u0437 \u043f\u043e\u0432\u0435\u0437\u0435\u0442";
                ((cb_3)MinecraftAccessor.id_import.id_class[id_protected[20]]).id_protected(String.format(id_break[6], objectArray));
            }
            return id_catch[14];
        }
        return id_catch[15];
    }

    private static void id_private() {
        id_byte = new byte[]{2, 2, 2, 2, 2, 2, 2, 2, 4};
    }
}

