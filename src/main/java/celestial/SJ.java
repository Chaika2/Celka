/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.BH;
import celestial.Bn_1;
import celestial.Sx_1;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class SJ
extends Bn_1 {
    private static boolean[] id_protected;
    private static short[] id_throws;
    public Object[] id_byte;
    private static String[] id_case;

    public SJ() {
        super(id_case[0], (Pattern[])BH.id_class[id_throws[0]]);
        this.id_extends();
    }

    static {
        SJ.ntfClinit();
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x66435B911CB55B8FL;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x4CBD2DDF;
    }

    @Override
    public void id_throws(String string) {
        this.id_extends();
        super.id_throws(string);
        Sx_1 sx_1 = Sx_1.id_break(string);
        this.id_byte[SJ.id_throws[1]] = sx_1;
        if ((Sx_1)((Object)this.id_byte[id_throws[2]]) != null) {
            this.id_protected(((Sx_1)((Object)this.id_byte[id_throws[3]])).id_class() + " " + this.id_throws().toLowerCase());
        }
    }

    private static /* synthetic */ void ntfClinit() {
        SJ.id_finally();
        SJ.id_implements();
        SJ.id_private();
    }

    private static void id_finally() {
        id_protected = new boolean[]{true};
    }

    public Sx_1 id_catch() {
        this.id_extends();
        return (Sx_1)((Object)this.id_byte[id_throws[4]]);
    }

    public static String id_catch(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{65, 50, -34, 93, 115, -35, 102, 23}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private void id_extends() {
        if (this.id_byte == null) {
            Object[] objectArray = this.id_byte = new Object[id_protected[0]];
        }
    }

    private static void id_implements() {
        id_case = new String[]{new String("\u0410\u0438\u0440-\u0434\u0440\u043e\u043f")};
    }

    private static void id_private() {
        short[] sArray = new short[5];
        sArray[0] = 4;
        id_throws = sArray;
    }
}

