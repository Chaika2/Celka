/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.C_class;
import celestial.Pv_1;
import celestial.Y;
import celestial.q_1;
import celestial.rmT_2;
import celestial.y_1;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class PF
extends Pv_1 {
    private static short[] id_byte;
    public Object[] id_break;
    private static boolean[] id_protected;
    private static byte[] id_throws;

    public boolean id_byte() {
        this.id_case();
        return (Integer)this.id_break[id_byte[8]] == 0 ? id_protected[4] : id_protected[5];
    }

    public PF(C_class c_class) {
        super(c_class);
        this.id_case();
    }

    static {
        PF.ntfClinit();
    }

    public boolean id_class(boolean bl) {
        this.id_case();
        int n = id_protected[1];
        if (bl) {
            n = this.id_protected() * id_throws[0];
        }
        return (Integer)this.id_break[id_byte[7]] > this.id_break() - n ? id_protected[2] : id_protected[3];
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x25654E1E;
    }

    public int id_class() {
        this.id_case();
        return (Integer)this.id_break[id_byte[10]];
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xA0BC25D07A94752EL;
    }

    @Override
    public void id_class(q_1 q_12) {
        this.id_case();
        if (q_12.id_class() == (Y)((Object)Y.staticFields22c81230f53b33f2a682b4198db24cc4[id_byte[3]]) && (Integer)this.id_break[id_byte[4]] > 0) {
            PF pF = this;
            Integer n = (Integer)pF.id_break[id_byte[5]] - id_protected[0];
            pF.id_break[PF.id_byte[6]] = n;
        }
    }

    public int id_break() {
        return id_byte[9];
    }

    public static String id_break(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{55, -21, -94, 92, -10, 82, -120, 74}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    @Override
    public void id_break(y_1 y_12) {
        this.id_case();
        if (y_12.id_byte() == (Y)((Object)Y.staticFields22c81230f53b33f2a682b4198db24cc4[id_byte[0]]) && y_12.id_protected() instanceof rmT_2) {
            PF pF = this;
            Integer n = (Integer)pF.id_break[id_byte[1]] + this.id_protected();
            pF.id_break[PF.id_byte[2]] = n;
        }
    }

    private static void id_throws() {
        boolean[] blArray = new boolean[9];
        blArray[0] = true;
        blArray[2] = true;
        blArray[4] = true;
        blArray[6] = true;
        id_protected = blArray;
    }

    private static /* synthetic */ void ntfClinit() {
        PF.id_throws();
        PF.id_catch();
        PF.id_private();
    }

    private static void id_catch() {
        short[] sArray = new short[11];
        sArray[9] = 200;
        id_byte = sArray;
    }

    private void id_case() {
        if (this.id_break == null) {
            Object[] objectArray = this.id_break = new Object[id_protected[6]];
            objectArray[PF.id_protected[7]] = id_protected[8];
        }
    }

    public int id_protected() {
        return id_throws[1];
    }

    private static void id_private() {
        id_throws = new byte[]{2, 20};
    }
}

