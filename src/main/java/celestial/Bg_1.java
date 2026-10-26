/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.BR;
import celestial.Bl_1;
import celestial.Bn_1;
import celestial.By_1;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class Bg_1
extends Bn_1
implements By_1 {
    private static boolean[] id_protected;
    public Object[] id_byte;
    private static short[] id_throws;
    private static String[] id_case;

    public Bg_1() {
        super(id_case[0], (Pattern[])Bl_1.id_class[id_throws[0]]);
        this.id_catch();
    }

    static {
        Bg_1.ntfClinit();
    }

    @Override
    public String id_class() {
        this.id_catch();
        if ((BR)((Object)this.id_byte[id_throws[4]]) == null) {
            return null;
        }
        return ((BR)((Object)this.id_byte[id_throws[5]])).id_class();
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xDAD9F41C;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xD1CA6BBB26DBA479L;
    }

    @Override
    public void id_throws(String string) {
        this.id_catch();
        super.id_throws(string);
        BR bR = BR.id_class(string);
        this.id_byte[Bg_1.id_throws[1]] = bR;
        if ((BR)((Object)this.id_byte[id_throws[2]]) != null) {
            this.id_protected(((BR)((Object)this.id_byte[id_throws[3]])).id_class() + " " + this.id_throws().toLowerCase());
        }
    }

    private static /* synthetic */ void ntfClinit() {
        Bg_1.id_finally();
        Bg_1.id_implements();
        Bg_1.id_private();
    }

    private static void id_finally() {
        id_protected = new boolean[]{true};
    }

    private void id_catch() {
        if (this.id_byte == null) {
            Object[] objectArray = this.id_byte = new Object[id_protected[0]];
        }
    }

    public static String id_catch(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{110, 26, -93, 80, -44, -29, 62, -117}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static void id_implements() {
        id_case = new String[]{new String("\u041c\u0430\u044f\u043a \u0443\u0431\u0438\u0439\u0446\u0430")};
    }

    private static void id_private() {
        short[] sArray = new short[6];
        sArray[0] = 18;
        id_throws = sArray;
    }
}

