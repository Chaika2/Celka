/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.C;
import celestial.C_class;
import celestial.PH;
import celestial.Pv_1;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class Pl_1
extends Pv_1 {
    public Object[] id_break;
    private static boolean[] id_byte;
    private static short[] id_protected;

    public void id_byte() {
        this.id_class((PH)null);
    }

    public Pl_1(C_class c_class) {
        super(c_class);
        this.id_protected();
    }

    static {
        Pl_1.ntfClinit();
    }

    @Override
    public void id_class(C c) {
        PH pH;
        super.id_class(c);
        if (!this.id_break()) {
            return;
        }
        String string = c.id_class();
        if (!string.equalsIgnoreCase((pH = this.id_class()).id_break().toLowerCase())) {
            this.id_byte();
        }
    }

    public PH id_class() {
        this.id_protected();
        return (PH)this.id_break[id_protected[1]];
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xD9A554F2;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xB021A8D658B2A904L;
    }

    public void id_class(PH pH) {
        this.id_protected();
        PH pH2 = pH;
        this.id_break[Pl_1.id_protected[0]] = pH2;
    }

    public boolean id_break() {
        return this.id_class() != null ? id_byte[0] : id_byte[1];
    }

    public static String id_break(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-122, -49, 67, 9, 32, -89, -15, 4}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static void id_throws() {
        id_protected = new short[2];
    }

    private static /* synthetic */ void ntfClinit() {
        Pl_1.id_case();
        Pl_1.id_throws();
    }

    private static void id_case() {
        boolean[] blArray = new boolean[3];
        blArray[0] = true;
        blArray[2] = true;
        id_byte = blArray;
    }

    private void id_protected() {
        if (this.id_break == null) {
            Object[] objectArray = this.id_break = new Object[id_byte[2]];
        }
    }
}

