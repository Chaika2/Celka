/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.C_class;
import celestial.D;
import celestial.EP;
import celestial.T;
import celestial.bj_3;
import celestial.rU_2;
import celestial.rfl_3;
import java.awt.Color;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class EB
implements D {
    public Object[] id_class;
    private static boolean[] id_break;
    private static short[] id_byte;

    private static void id_byte() {
        id_break = new boolean[]{true, true, true, true};
    }

    public EB(EP eP) {
        this.id_break();
        EP eP2 = eP;
        this.id_class[EB.id_byte[0]] = eP2;
    }

    static {
        EB.ntfClinit();
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xD55CCE757950EEADL;
    }

    @Override
    public void id_class(T t) {
        if (!((Boolean)C_class.id_instanceof().Pw.id_class[id_byte[1]]).booleanValue() || (rU_2)((EP)this.id_class[EB.id_byte[2]]).id_break[id_byte[3]] == null) {
            return;
        }
        Color color = (Color)C_class.id_instanceof().id_short.id_class[id_byte[4]];
        float f = ((Float)C_class.id_instanceof().id_super.id_class[id_byte[5]]).floatValue();
        float f2 = ((Float)C_class.id_instanceof().PT.id_class[id_byte[6]]).floatValue();
        boolean bl = (Boolean)C_class.id_instanceof().id_package.id_class[id_byte[7]];
        bj_3.id_class(color, f, f2, bl);
        bj_3.id_class(t.id_byte(), new rfl_3((rU_2)((EP)this.id_class[EB.id_byte[8]]).id_break[id_byte[9]], ((rU_2)((EP)this.id_class[EB.id_byte[10]]).id_break[id_byte[11]]).id_class(id_break[0], id_break[1], id_break[2])));
        bj_3.id_class(bl);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xFC9C93;
    }

    private static void id_class() {
        short[] sArray = new short[12];
        sArray[3] = 1;
        sArray[9] = 1;
        sArray[11] = 1;
        id_byte = sArray;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{109, -91, 68, 63, -57, -24, -78, -20}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private void id_break() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_break[3]];
        }
    }

    private static /* synthetic */ void ntfClinit() {
        EB.id_byte();
        EB.id_class();
    }
}

