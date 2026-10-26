/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rrZO;
import celestial.setting.Setting;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrIk_1
extends Setting<Boolean> {
    private static short[] id_byte;
    public Object[] id_break;
    private static boolean[] id_protected;
    private static byte[] id_throws;

    @Override
    public /* synthetic */ Object id_byte() {
        return this.id_class();
    }

    public rrIk_1(String string, boolean bl, rrZO rrZO2) {
        this(string, bl);
        rrZO rrZO3 = rrZO2;
        this.id_break[rrIk_1.id_byte[1]] = rrZO3;
    }

    public rrIk_1(String string, boolean bl) {
        super(string, bl);
        this.id_volatile();
        Boolean bl2 = bl;
        this.id_break[rrIk_1.id_byte[0]] = bl2;
    }

    static {
        rrIk_1.ntfClinit();
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x16C3F21721A3B4C1L;
    }

    public Boolean id_class() {
        return (Boolean)super.id_byte() != false && this.id_private() ? id_protected[0] : id_protected[1];
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xA51ED7E0;
    }

    public rrZO id_break() {
        this.id_volatile();
        return (rrZO)this.id_break[id_byte[3]];
    }

    private static /* synthetic */ void ntfClinit() {
        rrIk_1.id_native();
        rrIk_1.id_extends();
        rrIk_1.id_final();
    }

    public boolean id_finally() {
        this.id_volatile();
        return (Boolean)this.id_break[id_byte[2]];
    }

    private static void id_extends() {
        short[] sArray = new short[4];
        sArray[1] = 1;
        sArray[3] = 1;
        id_byte = sArray;
    }

    public static String id_protected(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{109, 2, -63, -13, -113, 25, -98, 47}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static void id_final() {
        id_throws = new byte[]{2};
    }

    private void id_volatile() {
        if (this.id_break == null) {
            Object[] objectArray = this.id_break = new Object[id_throws[0]];
            objectArray[rrIk_1.id_protected[2]] = id_protected[3];
        }
    }

    private static void id_native() {
        boolean[] blArray = new boolean[4];
        blArray[0] = true;
        id_protected = blArray;
    }
}

