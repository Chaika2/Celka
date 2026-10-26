/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.C_throws;
import celestial.bO_2;
import celestial.cb_3;
import celestial.module.combat.AutoUse;
import celestial.rrTF;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public abstract class rrlg_3
extends rrTF<AutoUse> {
    private static short[] id_class;
    private static boolean[] id_break;
    public Object[] id_byte;

    private void id_byte() {
        if (this.id_byte == null) {
            this.id_byte = new Object[1];
            this.id_byte[0] = false;
        }
    }

    public rrlg_3(AutoUse autoUse) {
        super(autoUse);
        this.id_byte();
    }

    static {
        rrlg_3.ntfClinit();
    }

    public abstract boolean id_class();

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x7161CA92;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xA090DFCBDE143L;
    }

    public static String id_break(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-55, 73, -85, 99, -30, -123, 84, -17}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static void id_break() {
        boolean[] blArray = new boolean[7];
        blArray[1] = true;
        blArray[2] = true;
        blArray[4] = true;
        id_break = blArray;
    }

    public boolean id_throws() {
        this.id_byte();
        return (Boolean)this.id_byte[id_class[4]];
    }

    private static /* synthetic */ void ntfClinit() {
        rrlg_3.id_break();
        rrlg_3.id_implements();
    }

    public boolean id_case() {
        bO_2 bO_22 = C_throws.id_byte().id_break();
        if (((cb_3)rrlg_3.id_import.id_class[id_class[0]]).id_implements() || ((cb_3)rrlg_3.id_import.id_class[id_class[1]]).id_native() || bO_22.id_byte() && bO_22.id_private()) {
            return id_break[0];
        }
        return id_break[1];
    }

    private static void id_implements() {
        short[] sArray = new short[5];
        sArray[0] = 57;
        sArray[1] = 57;
        id_class = sArray;
    }

    public void id_protected() {
        this.id_byte();
        Boolean bl = id_break[3];
        this.id_byte[rrlg_3.id_class[3]] = bl;
    }

    public void id_private() {
        this.id_byte();
        Boolean bl = id_break[2];
        this.id_byte[rrlg_3.id_class[2]] = bl;
    }
}

