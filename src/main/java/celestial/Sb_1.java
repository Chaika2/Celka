/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Bl_1;
import celestial.Bn_1;
import celestial.By_1;
import celestial.SM;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class Sb_1
extends Bn_1
implements By_1 {
    private static short[] id_protected;
    private static String[] id_throws;
    public Object[] id_byte;
    private static boolean[] id_case;

    public Sb_1() {
        super(id_throws[0], (Pattern[])Bl_1.id_class[id_protected[0]]);
        this.id_finally();
    }

    static {
        Sb_1.ntfClinit();
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x5225D1E0C7362D88L;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x41C77F7D;
    }

    @Override
    public String id_class() {
        this.id_finally();
        if ((SM)((Object)this.id_byte[id_protected[4]]) == null) {
            return null;
        }
        return ((SM)((Object)this.id_byte[id_protected[5]])).id_class();
    }

    @Override
    public void id_throws(String string) {
        this.id_finally();
        super.id_throws(string);
        SM sM = SM.id_break(string);
        this.id_byte[Sb_1.id_protected[1]] = sM;
        if ((SM)((Object)this.id_byte[id_protected[2]]) != null) {
            this.id_protected(((SM)((Object)this.id_byte[id_protected[3]])).id_class() + " " + this.id_throws().toLowerCase());
        }
    }

    private static /* synthetic */ void ntfClinit() {
        Sb_1.id_implements();
        Sb_1.id_private();
        Sb_1.id_catch();
    }

    private void id_finally() {
        if (this.id_byte == null) {
            Object[] objectArray = this.id_byte = new Object[id_case[0]];
        }
    }

    private static void id_catch() {
        short[] sArray = new short[6];
        sArray[0] = 19;
        id_protected = sArray;
    }

    public static String id_catch(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-123, -115, -37, 13, 124, 74, 57, 54}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static void id_implements() {
        id_case = new boolean[]{true};
    }

    private static void id_private() {
        id_throws = new String[]{new String("\u0412\u0443\u043b\u043a\u0430\u043d")};
    }
}

