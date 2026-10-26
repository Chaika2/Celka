/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.BV;
import celestial.Bl_1;
import celestial.Bn_1;
import celestial.By_1;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class Bj_1
extends Bn_1
implements By_1 {
    private static String[] id_protected;
    public Object[] id_byte;
    private static short[] id_throws;
    private static boolean[] id_case;

    public Bj_1() {
        super(id_protected[0], (Pattern[])Bl_1.id_class[id_throws[0]]);
        this.id_finally();
    }

    static {
        Bj_1.ntfClinit();
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x4A97529B933612FDL;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x1D4079EE;
    }

    @Override
    public String id_class() {
        this.id_finally();
        if ((BV)((Object)this.id_byte[id_throws[4]]) == null) {
            return null;
        }
        return ((BV)((Object)this.id_byte[id_throws[5]])).id_class();
    }

    @Override
    public void id_throws(String string) {
        this.id_finally();
        super.id_throws(string);
        BV bV = BV.id_break(string);
        this.id_byte[Bj_1.id_throws[1]] = bV;
        if ((BV)((Object)this.id_byte[id_throws[2]]) != null) {
            this.id_protected(((BV)((Object)this.id_byte[id_throws[3]])).id_class() + " " + this.id_throws().toLowerCase());
        }
    }

    private static /* synthetic */ void ntfClinit() {
        Bj_1.id_catch();
        Bj_1.id_private();
        Bj_1.id_implements();
    }

    private void id_finally() {
        if (this.id_byte == null) {
            Object[] objectArray = this.id_byte = new Object[id_case[0]];
        }
    }

    public static String id_catch(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{66, 50, -67, 87, -42, 3, 12, 66}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static void id_catch() {
        id_case = new boolean[]{true};
    }

    private static void id_implements() {
        short[] sArray = new short[6];
        sArray[0] = 20;
        id_throws = sArray;
    }

    private static void id_private() {
        id_protected = new String[]{new String("\u0410\u043b\u0442\u0430\u0440\u044c")};
    }
}

