/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Bt_1;
import celestial.By_1;
import celestial.SG;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class SE
extends Bt_1
implements By_1 {
    public Object[] id_class;
    private static short[] id_byte;
    private static String[] id_protected;
    private static boolean[] id_throws;

    public SE() {
        super(id_protected[0]);
        this.id_implements();
    }

    static {
        SE.ntfClinit();
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xC7B477B7;
    }

    @Override
    public String id_class() {
        this.id_implements();
        if ((SG)((Object)this.id_class[id_byte[3]]) == null) {
            return null;
        }
        return ((SG)((Object)this.id_class[id_byte[4]])).id_class();
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{81, -80, -67, 123, 63, -119, -59, -105}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x8B302C3C33BE5157L;
    }

    private static void id_break() {
        id_protected = new String[]{new String("\u0421\u043d\u0435\u0436\u043d\u0430\u044f \u0431\u043e\u0439\u043d\u044f")};
    }

    @Override
    public void id_throws(String string) {
        this.id_implements();
        super.id_throws(string);
        SG sG = SG.id_class(string);
        this.id_class[SE.id_byte[0]] = sG;
        if ((SG)((Object)this.id_class[id_byte[1]]) != null) {
            this.id_protected(((SG)((Object)this.id_class[id_byte[2]])).id_class() + " " + this.id_throws().toLowerCase());
        }
    }

    private static /* synthetic */ void ntfClinit() {
        SE.id_catch();
        SE.id_break();
        SE.id_private();
    }

    private static void id_catch() {
        id_throws = new boolean[]{true};
    }

    private void id_implements() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_throws[0]];
        }
    }

    private static void id_private() {
        id_byte = new short[5];
    }
}

