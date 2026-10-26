/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Ml_1;
import celestial.rrFS;
import celestial.rrFd_1;
import celestial.rrFu_1;
import celestial.rrtN_2;
import celestial.rrtu_3;
import celestial.rrvi_1;
import celestial.rrvo_1;
import celestial.ui.hud.HudWidget;
import celestial.ui.hud.TargetHud;
import celestial.util.MinecraftAccessor;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrvV
implements MinecraftAccessor {
    private static short[] id_byte;
    public Object[] id_class;
    public static Object[] id_break;
    private static boolean[] id_protected;
    private static byte[] id_throws;

    private static void id_byte() {
        Object[] objectArray = new Object[]{new rrtu_3()};
        id_break = objectArray;
    }

    public rrvV() {
        this.id_private();
        this.id_protected();
    }

    static {
        rrvV.ntfClinit();
    }

    public void id_class(int n, int n2, int n3) {
        ((rrtu_3)id_break[id_byte[4]]).id_class(n, n2, n3);
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-60, -67, -23, 19, 58, 66, -56, 101}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x2B0602B4E32ED91EL;
    }

    public void id_class(Ml_1 ml_1, int n, int n2) {
        ((rrtu_3)id_break[id_byte[2]]).id_class(ml_1, n, n2, id_protected[2]);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xA12AA2B4;
    }

    public void id_class(int n, int n2, int n3, boolean bl, boolean bl2) {
        ((rrtu_3)id_break[id_byte[3]]).id_class(n, n2, n3, bl, bl2);
    }

    public TargetHud id_class() {
        return (TargetHud)this.id_class[id_byte[6]];
    }

    public void id_break() {
        ((rrtu_3)id_break[id_byte[5]]).id_throws();
    }

    private static void id_throws() {
        id_byte = new short[7];
    }

    private static /* synthetic */ void ntfClinit() {
        rrvV.id_catch();
        rrvV.id_throws();
        rrvV.id_case();
        rrvV.id_byte();
    }

    private static void id_catch() {
        boolean[] blArray = new boolean[6];
        blArray[1] = true;
        blArray[4] = true;
        blArray[5] = true;
        id_protected = blArray;
    }

    private static void id_case() {
        id_throws = new byte[]{7, 2, 3, 4, 5, 6};
    }

    private void id_protected() {
        rrtN_2[] rrtN_2Array = new rrtN_2[id_throws[0]];
        TargetHud targetHud = new TargetHud();
        this.id_class[rrvV.id_byte[1]] = targetHud;
        rrtN_2Array[rrvV.id_protected[0]] = targetHud;
        rrtN_2Array[rrvV.id_protected[1]] = new HudWidget();
        rrtN_2Array[rrvV.id_throws[1]] = new rrFS();
        rrtN_2Array[rrvV.id_throws[2]] = new rrvi_1();
        rrtN_2Array[rrvV.id_throws[3]] = new rrFu_1();
        rrtN_2Array[rrvV.id_throws[4]] = new rrFd_1();
        rrtN_2Array[rrvV.id_throws[5]] = new rrvo_1();
        ((rrtu_3)id_break[id_byte[0]]).id_class(rrtN_2Array);
    }

    private void id_private() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_protected[4]];
        }
    }
}

