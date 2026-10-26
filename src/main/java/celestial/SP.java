/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Bl_1;
import celestial.Bn_1;
import celestial.By_1;
import celestial.SB;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class SP
extends Bn_1
implements By_1 {
    private static String[] id_protected;
    private static short[] id_throws;
    public Object[] id_byte;
    private static boolean[] id_case;

    public SP() {
        super(id_protected[0], (Pattern[])Bl_1.id_class[id_throws[0]]);
        this.id_private();
    }

    static {
        SP.ntfClinit();
    }

    @Override
    public String id_class() {
        this.id_private();
        if ((SB)((Object)this.id_byte[id_throws[4]]) == null) {
            return null;
        }
        return ((SB)((Object)this.id_byte[id_throws[5]])).id_class();
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xAED05E99C2CFF6D1L;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x127AAD01;
    }

    @Override
    public void id_throws(String string) {
        this.id_private();
        super.id_throws(string);
        SB sB = SB.id_class(string);
        this.id_byte[SP.id_throws[1]] = sB;
        if ((SB)((Object)this.id_byte[id_throws[2]]) != null) {
            this.id_protected(((SB)((Object)this.id_byte[id_throws[3]])).id_class() + " " + this.id_throws().toLowerCase());
        }
    }

    private static /* synthetic */ void ntfClinit() {
        SP.id_finally();
        SP.id_catch();
        SP.id_implements();
    }

    private static void id_finally() {
        id_case = new boolean[]{true};
    }

    public static String id_catch(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-72, 119, -39, -91, -19, -114, 40, -109}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static void id_catch() {
        id_protected = new String[]{new String("\u041c\u0438\u0441\u0442\u0438\u043a")};
    }

    private static void id_implements() {
        short[] sArray = new short[6];
        sArray[0] = 16;
        id_throws = sArray;
    }

    private void id_private() {
        if (this.id_byte == null) {
            Object[] objectArray = this.id_byte = new Object[id_case[0]];
        }
    }
}

