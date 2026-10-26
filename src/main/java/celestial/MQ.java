/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.MN;
import celestial.Mx_1;
import celestial.rja_3;
import celestial.rpa_3;
import celestial.rqd_3;
import celestial.xc_3;
import fi.dy.masa.litematica.Litematica;
import fi.dy.masa.litematica.data.DataManager;
import java.io.File;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class MQ {
    private static boolean[] id_class;
    private static short[] id_break;
    private static byte[] id_byte;

    private static void id_byte() {
        boolean[] blArray = new boolean[19];
        blArray[0] = true;
        blArray[2] = true;
        blArray[4] = true;
        blArray[5] = true;
        blArray[6] = true;
        blArray[7] = true;
        blArray[12] = true;
        blArray[13] = true;
        blArray[15] = true;
        blArray[16] = true;
        blArray[17] = true;
        blArray[18] = true;
        id_class = blArray;
    }

    public static rja_3 id_byte(int n) {
        return DataManager.getSchematicPlacementManager().getAllSchematicsPlacements().get(n).getOrigin();
    }

    static {
        MQ.ntfClinit();
    }

    public static rja_3 id_class(Mx_1 mx_1, int n) {
        int n2 = MQ.id_byte(n).b_();
        int n3 = MQ.id_byte(n).c_();
        int n4 = MQ.id_byte(n).d_();
        int n5 = mx_1.id_case().b_();
        int n6 = mx_1.id_case().c_();
        int n7 = mx_1.id_case().d_();
        int n8 = (mx_1.id_throws() - id_class[4]) * id_byte[0];
        int n9 = (mx_1.id_catch() - id_class[5]) * id_byte[1];
        rpa_3 rpa_32 = MQ.id_class(n);
        rqd_3 rqd_32 = MQ.id_break(n);
        return switch (((int[])MN.id_class[id_break[0]])[rpa_32.ordinal()]) {
            case 1, 2 -> {
                switch ((rpa_32.ordinal() * id_byte[2] + rqd_32.ordinal()) % id_byte[3]) {
                    case 1: {
                        yield new rja_3(n2 + (n9 - n7), n3 + n6, n4 + (n8 - n5));
                    }
                    case 2: {
                        yield new rja_3(n2 + n5, n3 + n6, n4 + (n9 - n7));
                    }
                    case 3: {
                        yield new rja_3(n2 + n7, n3 + n6, n4 + n5);
                    }
                }
                yield new rja_3(n2 + (n8 - n5), n3 + n6, n4 + n7);
            }
            default -> {
                switch (((int[])MN.id_class[id_break[1]])[rqd_32.ordinal()]) {
                    case 1: {
                        yield new rja_3(n2 + (n9 - n7), n3 + n6, n4 + n5);
                    }
                    case 2: {
                        yield new rja_3(n2 + (n8 - n5), n3 + n6, n4 + (n9 - n7));
                    }
                    case 3: {
                        yield new rja_3(n2 + n7, n3 + n6, n4 + (n8 - n5));
                    }
                }
                yield new rja_3(n2 + n5, n3 + n6, n4 + n7);
            }
        };
    }

    public static rpa_3 id_class(int n) {
        return DataManager.getSchematicPlacementManager().getAllSchematicsPlacements().get(n).getMirror();
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xDFCC0F0A8E481DA3L;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-82, 34, 42, 101, -97, 97, 71, -92}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public static rja_3 id_class(rja_3 rja_32, int n, int n2, rpa_3 rpa_32) {
        int n3 = rja_32.b_();
        int n4 = rja_32.d_();
        if (rpa_32 == rpa_3.LEFT_RIGHT) {
            n4 = n2 - rja_32.d_();
        } else if (rpa_32 == rpa_3.FRONT_BACK) {
            n3 = n - rja_32.b_();
        }
        return new rja_3(n3, rja_32.c_(), n4);
    }

    public static rja_3 id_class(rja_3 rja_32, int n, int n2) {
        return new rja_3(n - (n - n2) - rja_32.d_(), rja_32.c_(), rja_32.b_());
    }

    public static boolean id_class() {
        try {
            Class.forName(Litematica.class.getName());
            return id_class[0];
        }
        catch (ClassNotFoundException | NoClassDefFoundError throwable) {
            return id_class[1];
        }
    }

    public static rqd_3 id_break(int n) {
        return DataManager.getSchematicPlacementManager().getAllSchematicsPlacements().get(n).getRotation();
    }

    public static Mx_1 id_break(Mx_1 mx_1, int n) {
        Mx_1 mx_12 = mx_1.id_class(MQ.id_break(n).ordinal() % id_byte[4] == id_class[6] ? id_class[7] : id_class[8]);
        for (int i = id_class[9]; i < mx_1.id_private(); ++i) {
            for (int j = id_class[10]; j < mx_1.id_catch(); ++j) {
                for (int k = id_class[11]; k < mx_1.id_throws(); ++k) {
                    rja_3 rja_32 = new rja_3(k, i, j);
                    rja_32 = MQ.id_class(rja_32, mx_1.id_throws() - id_class[12], mx_1.id_catch() - id_class[13], MQ.id_class(n));
                    for (int i2 = id_class[14]; i2 < MQ.id_break(n).ordinal(); ++i2) {
                        rja_32 = i2 % id_byte[5] == 0 ? MQ.id_class(rja_32, mx_1.id_throws() - id_class[15], mx_1.id_catch() - id_class[16]) : MQ.id_class(rja_32, mx_1.id_catch() - id_class[17], mx_1.id_throws() - id_class[18]);
                    }
                    xc_3 xc_32 = mx_1.id_class(k, i, j);
                    try {
                        xc_32 = xc_32.id_class(MQ.id_class(n)).id_class(MQ.id_break(n));
                    }
                    catch (NullPointerException nullPointerException) {
                        // empty catch block
                    }
                    mx_12.id_break(rja_32.b_(), rja_32.c_(), rja_32.d_(), xc_32);
                }
            }
        }
        return mx_12;
    }

    public static boolean id_break() {
        return DataManager.getSchematicPlacementManager().getAllSchematicsPlacements().size() > 0 ? id_class[2] : id_class[3];
    }

    private static void id_throws() {
        short[] sArray = new short[2];
        sArray[0] = 1;
        id_break = sArray;
    }

    public static File id_throws(int n) {
        return DataManager.getSchematicPlacementManager().getAllSchematicsPlacements().get(n).getSchematicFile();
    }

    private static /* synthetic */ void ntfClinit() {
        MQ.id_byte();
        MQ.id_throws();
        MQ.id_protected();
    }

    private static int id_case(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xFC3C7190;
    }

    public static String id_protected(int n) {
        return DataManager.getSchematicPlacementManager().getAllSchematicsPlacements().get(n).getName();
    }

    private static void id_protected() {
        id_byte = new byte[]{-1, -1, 2, 4, 2, 2};
    }
}

