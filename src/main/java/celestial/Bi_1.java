/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Bl_1;
import celestial.Bn_1;
import celestial.By_1;
import celestial.Sr_1;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class Bi_1
extends Bn_1
implements By_1 {
    public Object[] id_byte;
    private static String[] id_protected;
    private static boolean[] id_throws;
    private static short[] id_case;

    public Bi_1() {
        super(id_protected[0], (Pattern[])Bl_1.id_class[id_case[0]]);
        this.id_catch();
    }

    static {
        Bi_1.ntfClinit();
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x3B01DC5CC43B26B0L;
    }

    @Override
    public String id_class() {
        this.id_catch();
        if ((Sr_1)((Object)this.id_byte[id_case[4]]) == null) {
            return null;
        }
        return ((Sr_1)((Object)this.id_byte[id_case[5]])).id_class();
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x9C586608;
    }

    @Override
    public void id_throws(String string) {
        this.id_catch();
        super.id_throws(string);
        Sr_1 sr_1 = Sr_1.id_break(string);
        this.id_byte[Bi_1.id_case[1]] = sr_1;
        if ((Sr_1)((Object)this.id_byte[id_case[2]]) != null) {
            this.id_protected(((Sr_1)((Object)this.id_byte[id_case[3]])).id_class() + " " + this.id_throws().toLowerCase());
        }
    }

    private static /* synthetic */ void ntfClinit() {
        Bi_1.id_finally();
        Bi_1.id_private();
        Bi_1.id_implements();
    }

    private static void id_finally() {
        id_throws = new boolean[]{true};
    }

    public static String id_catch(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{52, 56, 36, -99, -63, 40, 37, 6}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private void id_catch() {
        if (this.id_byte == null) {
            Object[] objectArray = this.id_byte = new Object[id_throws[0]];
        }
    }

    private static void id_implements() {
        short[] sArray = new short[6];
        sArray[0] = 17;
        id_case = sArray;
    }

    private static void id_private() {
        id_protected = new String[]{new String("\u0417\u0430\u0433\u0430\u0434\u043e\u0447\u043d\u044b\u0439 \u043c\u0430\u044f\u043a")};
    }
}

