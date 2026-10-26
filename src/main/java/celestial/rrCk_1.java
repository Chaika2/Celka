/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.module.combat.AutoTotem;
import celestial.rrTF;
import celestial.rrmi_3;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public abstract class rrCk_1
extends rrTF<AutoTotem> {
    private static byte[] id_break;
    public Object[] id_class;
    private static short[] id_byte;
    private static boolean[] id_protected;

    public abstract void id_byte();

    public rrCk_1(AutoTotem autoTotem) {
        super(autoTotem);
        this.id_implements();
        rrmi_3 rrmi_32 = new rrmi_3();
        this.id_class[rrCk_1.id_byte[0]] = rrmi_32;
    }

    static {
        rrCk_1.ntfClinit();
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-88, -88, 28, 80, 52, 125, 17, -95}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x56291ADC2C83290BL;
    }

    public abstract void id_class();

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x58EC9937;
    }

    public boolean id_break() {
        this.id_implements();
        return (Boolean)this.id_class[id_byte[2]];
    }

    private static void id_throws() {
        id_protected = new boolean[3];
    }

    private static /* synthetic */ void ntfClinit() {
        rrCk_1.id_throws();
        rrCk_1.id_private();
        rrCk_1.id_case();
    }

    private static void id_case() {
        id_break = new byte[]{2};
    }

    private void id_implements() {
        if (this.id_class == null) {
            this.id_class = new Object[2];
            this.id_class[0] = false;
        }
    }

    public rrmi_3 id_protected() {
        this.id_implements();
        return (rrmi_3)this.id_class[id_byte[3]];
    }

    private static void id_private() {
        short[] sArray = new short[4];
        sArray[0] = 1;
        sArray[3] = 1;
        id_byte = sArray;
    }

    @Override
    public boolean aK_() {
        this.id_implements();
        Boolean bl = id_protected[0];
        this.id_class[rrCk_1.id_byte[1]] = bl;
        return super.aK_();
    }
}

