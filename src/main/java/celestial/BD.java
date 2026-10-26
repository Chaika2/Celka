/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.BU;
import celestial.Bl_1;
import celestial.Bn_1;
import celestial.By_1;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class BD
extends Bn_1
implements By_1 {
    private static short[] id_protected;
    private static boolean[] id_throws;
    public Object[] id_byte;
    private static String[] id_case;

    public BD() {
        super(id_case[0], (Pattern[])Bl_1.id_class[id_protected[0]]);
        this.id_private();
    }

    static {
        BD.ntfClinit();
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xC3F9353FC606495FL;
    }

    @Override
    public String id_class() {
        this.id_private();
        if ((BU)((Object)this.id_byte[id_protected[4]]) == null) {
            return null;
        }
        return ((BU)((Object)this.id_byte[id_protected[5]])).id_class();
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x714DA9B6;
    }

    @Override
    public void id_throws(String string) {
        this.id_private();
        super.id_throws(string);
        BU bU = BU.id_class(string);
        this.id_byte[BD.id_protected[1]] = bU;
        if ((BU)((Object)this.id_byte[id_protected[2]]) != null) {
            this.id_protected(((BU)((Object)this.id_byte[id_protected[3]])).id_class() + " " + this.id_throws().toLowerCase());
        }
    }

    private static /* synthetic */ void ntfClinit() {
        BD.id_finally();
        BD.id_implements();
        BD.id_catch();
    }

    private static void id_finally() {
        id_throws = new boolean[]{true};
    }

    private static void id_catch() {
        short[] sArray = new short[6];
        sArray[0] = 23;
        id_protected = sArray;
    }

    public static String id_catch(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-107, -82, 77, 43, 5, -80, -107, -38}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static void id_implements() {
        id_case = new String[]{new String("\u0413\u0435\u0439\u0437\u0435\u0440")};
    }

    private void id_private() {
        if (this.id_byte == null) {
            Object[] objectArray = this.id_byte = new Object[id_throws[0]];
        }
    }
}

