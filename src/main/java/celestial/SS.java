/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Bl_1;
import celestial.Bn_1;
import celestial.By_1;
import celestial.Ss_1;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class SS
extends Bn_1
implements By_1 {
    private static boolean[] id_protected;
    private static short[] id_throws;
    private static String[] id_case;
    public Object[] id_byte;

    public SS() {
        super(id_case[0], (Pattern[])Bl_1.id_class[id_throws[0]]);
        this.id_private();
    }

    static {
        SS.ntfClinit();
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xD5FB96E9BC09A23EL;
    }

    @Override
    public String id_class() {
        this.id_private();
        if ((Ss_1)((Object)this.id_byte[id_throws[4]]) == null) {
            return null;
        }
        return ((Ss_1)((Object)this.id_byte[id_throws[5]])).id_class();
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x7D679E39;
    }

    @Override
    public void id_throws(String string) {
        this.id_private();
        super.id_throws(string);
        Ss_1 ss_1 = Ss_1.id_class(string);
        this.id_byte[SS.id_throws[1]] = ss_1;
        if ((Ss_1)((Object)this.id_byte[id_throws[2]]) != null) {
            this.id_protected(((Ss_1)((Object)this.id_byte[id_throws[3]])).id_class() + " " + this.id_throws().toLowerCase());
        }
    }

    private static /* synthetic */ void ntfClinit() {
        SS.id_catch();
        SS.id_finally();
        SS.id_implements();
    }

    private static void id_finally() {
        id_case = new String[]{new String("\u0414\u0435\u0434 \u043c\u043e\u0440\u043e\u0437")};
    }

    public static String id_catch(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-66, 0, 24, 5, -12, 60, 12, -102}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static void id_catch() {
        id_protected = new boolean[]{true};
    }

    private static void id_implements() {
        short[] sArray = new short[6];
        sArray[0] = 21;
        id_throws = sArray;
    }

    private void id_private() {
        if (this.id_byte == null) {
            Object[] objectArray = this.id_byte = new Object[id_protected[0]];
        }
    }
}

