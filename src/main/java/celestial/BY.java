/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Bo_1;
import celestial.Bt_1;
import celestial.By_1;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class BY
extends Bt_1
implements By_1 {
    private static String[] id_byte;
    public Object[] id_class;
    private static boolean[] id_protected;
    private static short[] id_throws;

    public BY() {
        super(id_byte[0]);
        this.id_private();
    }

    static {
        BY.ntfClinit();
    }

    @Override
    public String id_class() {
        this.id_private();
        if ((Bo_1)((Object)this.id_class[id_throws[3]]) == null) {
            return null;
        }
        return ((Bo_1)((Object)this.id_class[id_throws[4]])).id_class();
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-89, 54, 102, 85, 96, 55, 45, 38}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xE5B4F7C8594D6840L;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x8EDBE485;
    }

    private static void id_break() {
        id_byte = new String[]{new String("\u0421\u0443\u043d\u0434\u0443\u043a \u0441\u043c\u0435\u0440\u0442\u0438")};
    }

    @Override
    public void id_throws(String string) {
        this.id_private();
        super.id_throws(string);
        Bo_1 bo_1 = Bo_1.id_class(string);
        this.id_class[BY.id_throws[0]] = bo_1;
        if ((Bo_1)((Object)this.id_class[id_throws[1]]) != null) {
            this.id_protected(((Bo_1)((Object)this.id_class[id_throws[2]])).id_class() + " " + this.id_throws().toLowerCase());
        }
    }

    private static /* synthetic */ void ntfClinit() {
        BY.id_implements();
        BY.id_break();
        BY.id_catch();
    }

    private static void id_catch() {
        id_throws = new short[5];
    }

    private static void id_implements() {
        id_protected = new boolean[]{true};
    }

    private void id_private() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_protected[0]];
        }
    }
}

