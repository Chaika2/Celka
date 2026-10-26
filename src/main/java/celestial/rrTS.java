/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rVa_1;
import celestial.rVi_1;
import celestial.rgF_2;
import celestial.rrfu_3;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrTS
extends Enum<rrTS> {
    private static byte[] bytes35fc53f9a5633735b32b94862e310fdb;
    private static String[] strings35fc53f9a5633735b32b94862e310fdb;
    private static boolean[] booleans35fc53f9a5633735b32b94862e310fdb;
    private static short[] shorts35fc53f9a5633735b32b94862e310fdb;
    public Object[] fields35fc53f9a5633735b32b94862e310fdb;
    public static Object[] staticFields35fc53f9a5633735b32b94862e310fdb;

    private static void id_byte() {
        short[] sArray = new short[5];
        sArray[0] = 2;
        sArray[4] = 1;
        shorts35fc53f9a5633735b32b94862e310fdb = sArray;
    }

    private rrTS(rVi_1 rVi_12) {
        this.id_break();
        rVi_1 rVi_13 = rVi_12;
        this.fields35fc53f9a5633735b32b94862e310fdb[rrTS.shorts35fc53f9a5633735b32b94862e310fdb[2]] = rVi_13;
    }

    static {
        rrTS.ntfClinit();
    }

    public static rrTS[] values() {
        return (rrTS[])((rrTS[])staticFields35fc53f9a5633735b32b94862e310fdb[shorts35fc53f9a5633735b32b94862e310fdb[0]]).clone();
    }

    public static rrTS valueOf(String string) {
        return Enum.valueOf(rrTS.class, string);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x3BBBAB44;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xBDC178604656A7FFL;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{2, -108, 30, 34, 24, 60, 45, 95}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public rVi_1 id_class() {
        return (rVi_1)this.fields35fc53f9a5633735b32b94862e310fdb[shorts35fc53f9a5633735b32b94862e310fdb[1]];
    }

    private void id_break() {
        if (this.fields35fc53f9a5633735b32b94862e310fdb == null) {
            this.fields35fc53f9a5633735b32b94862e310fdb = new Object[1];
        }
    }

    private static void id_throws() {
        Object[] objectArray;
        objectArray = new Object[]{new rrTS(rrfu_3.id_class().id_break(rVa_1.id_class(rgF_2.GOLD), rVa_1.id_class(rgF_2.YELLOW)).id_class(strings35fc53f9a5633735b32b94862e310fdb[1]).id_break()), new rrTS(rrfu_3.id_class().id_break(rVa_1.id_class(rgF_2.DARK_RED), rVa_1.id_class(rgF_2.RED)).id_class(strings35fc53f9a5633735b32b94862e310fdb[3]).id_break()), new rrTS[]{(rrTS)((Object)objectArray[0]), (rrTS)((Object)objectArray[1])}};
        staticFields35fc53f9a5633735b32b94862e310fdb = objectArray;
    }

    private static /* synthetic */ void ntfClinit() {
        rrTS.id_case();
        rrTS.id_private();
        rrTS.id_byte();
        rrTS.id_catch();
        rrTS.id_throws();
    }

    private static void id_catch() {
        bytes35fc53f9a5633735b32b94862e310fdb = new byte[]{2, 2, 3};
    }

    private static void id_case() {
        boolean[] blArray = new boolean[7];
        blArray[1] = true;
        blArray[4] = true;
        blArray[5] = true;
        blArray[6] = true;
        booleans35fc53f9a5633735b32b94862e310fdb = blArray;
    }

    private static /* synthetic */ rrTS[] id_protected() {
        rrTS[] rrTSArray = new rrTS[bytes35fc53f9a5633735b32b94862e310fdb[0]];
        rrTSArray[rrTS.booleans35fc53f9a5633735b32b94862e310fdb[0]] = (rrTS)((Object)staticFields35fc53f9a5633735b32b94862e310fdb[shorts35fc53f9a5633735b32b94862e310fdb[3]]);
        rrTSArray[rrTS.booleans35fc53f9a5633735b32b94862e310fdb[1]] = (rrTS)((Object)staticFields35fc53f9a5633735b32b94862e310fdb[shorts35fc53f9a5633735b32b94862e310fdb[4]]);
        return rrTSArray;
    }

    private static void id_private() {
        strings35fc53f9a5633735b32b94862e310fdb = new String[]{new String("REALLY_WORLD"), new String("ReallyWorld"), new String("FUNTIME"), new String("Funtime")};
    }
}

