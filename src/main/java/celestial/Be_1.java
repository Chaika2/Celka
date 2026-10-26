/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Ba_1;
import celestial.Bl_1;
import celestial.Bn_1;
import celestial.By_1;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class Be_1
extends Bn_1
implements By_1 {
    private static short[] id_protected;
    private static boolean[] id_throws;
    private static String[] id_case;
    public Object[] id_byte;

    public Be_1() {
        super(id_case[0], (Pattern[])Bl_1.id_class[id_protected[0]]);
        this.id_catch();
    }

    static {
        Be_1.ntfClinit();
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x407D823;
    }

    @Override
    public String id_class() {
        this.id_catch();
        if ((Ba_1)((Object)this.id_byte[id_protected[4]]) == null) {
            return null;
        }
        return ((Ba_1)((Object)this.id_byte[id_protected[5]])).id_class();
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xA236B37192C49B69L;
    }

    @Override
    public void id_throws(String string) {
        this.id_catch();
        super.id_throws(string);
        Ba_1 ba_1 = Ba_1.id_class(string);
        this.id_byte[Be_1.id_protected[1]] = ba_1;
        if ((Ba_1)((Object)this.id_byte[id_protected[2]]) != null) {
            this.id_protected(((Ba_1)((Object)this.id_byte[id_protected[3]])).id_class() + " " + this.id_throws().toLowerCase());
        }
    }

    private static /* synthetic */ void ntfClinit() {
        Be_1.id_finally();
        Be_1.id_implements();
        Be_1.id_private();
    }

    private static void id_finally() {
        id_throws = new boolean[]{true};
    }

    private void id_catch() {
        if (this.id_byte == null) {
            Object[] objectArray = this.id_byte = new Object[id_throws[0]];
        }
    }

    public static String id_catch(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{96, -63, 84, -67, 81, 126, 57, -22}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static void id_implements() {
        id_case = new String[]{new String("\u041c\u0435\u0442\u0435\u043e\u0440. \u0434\u043e\u0436\u0434\u044c")};
    }

    private static void id_private() {
        short[] sArray = new short[6];
        sArray[0] = 15;
        id_protected = sArray;
    }
}

