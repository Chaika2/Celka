/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rfU_2;
import celestial.rrtu_3;
import celestial.ui.clickgui.ClickGuiScreen;
import celestial.util.MinecraftAccessor;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrvS
implements MinecraftAccessor {
    private static byte[] id_break;
    public Object[] id_class;
    private static short[] id_byte;
    private static float[] id_protected;
    private static boolean[] id_throws;

    public float id_byte() {
        return ((Float)this.id_class[id_byte[10]]).floatValue();
    }

    public rrvS(ClickGuiScreen clickGuiScreen) {
        this.id_throws();
        ClickGuiScreen clickGuiScreen2 = clickGuiScreen;
        this.id_class[rrvS.id_byte[0]] = clickGuiScreen2;
    }

    static {
        rrvS.ntfClinit();
    }

    public void id_class(int n) {
        if (n == 0) {
            this.id_class(id_throws[1]);
        }
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{18, -39, -113, -75, -84, 92, 53, 0}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x3FE4157DBA690777L;
    }

    public void id_class(boolean bl) {
        Boolean bl2 = bl;
        this.id_class[rrvS.id_byte[9]] = bl2;
    }

    public void id_class(int n, int n2) {
        if (this.id_break()) {
            ((ClickGuiScreen)this.id_class[id_byte[1]]).id_class((float)n - this.id_byte(), (float)n2 - this.id_class());
        }
        byte by = id_break[0];
        float f = id_const.id_volatile() - id_protected[0] - (float)by;
        float f2 = id_const.id_final() - id_protected[1] - (float)by;
        if (f >= (float)by && f2 >= (float)by) {
            float f3 = rfU_2.id_class((float)((ClickGuiScreen)this.id_class[id_byte[2]]).id_abstract(), (float)by, f);
            float f4 = rfU_2.id_class((float)((ClickGuiScreen)this.id_class[id_byte[3]]).id_finally(), (float)by, f2);
            ((ClickGuiScreen)this.id_class[id_byte[4]]).id_class(f3, f4);
        }
    }

    public void id_class(rrtu_3 rrtu_32, int n, int n2, int n3, boolean bl) {
        if (bl && rrtu_3.id_class(rrtu_32, n, n2)) {
            return;
        }
        if (n3 == 0 && ((ClickGuiScreen)this.id_class[id_byte[5]]).id_class(n, n2)) {
            this.id_break(n - ((ClickGuiScreen)this.id_class[id_byte[6]]).id_abstract());
            this.id_class((float)(n2 - ((ClickGuiScreen)this.id_class[id_byte[7]]).id_finally()));
            this.id_class(id_throws[0]);
        }
    }

    public void id_class(float f) {
        Float f2 = Float.valueOf(f);
        this.id_class[rrvS.id_byte[13]] = f2;
    }

    public float id_class() {
        return ((Float)this.id_class[id_byte[11]]).floatValue();
    }

    public void id_break(float f) {
        Float f2 = Float.valueOf(f);
        this.id_class[rrvS.id_byte[12]] = f2;
    }

    public boolean id_break() {
        return (Boolean)this.id_class[id_byte[8]];
    }

    private static int id_break(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xD602728D;
    }

    private void id_throws() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_break[1]];
            objectArray[rrvS.id_throws[2]] = id_throws[3];
            objectArray[rrvS.id_break[2]] = Float.valueOf(id_protected[2]);
            objectArray[rrvS.id_break[3]] = Float.valueOf(id_protected[3]);
        }
    }

    private static /* synthetic */ void ntfClinit() {
        rrvS.id_case();
        rrvS.id_protected();
        rrvS.id_private();
        rrvS.id_catch();
    }

    private static void id_catch() {
        id_break = new byte[]{5, 4, 2, 3};
    }

    private static void id_case() {
        boolean[] blArray = new boolean[4];
        blArray[0] = true;
        blArray[2] = true;
        id_throws = blArray;
    }

    private static void id_protected() {
        short[] sArray = new short[14];
        sArray[8] = 1;
        sArray[9] = 1;
        sArray[10] = 2;
        sArray[11] = 3;
        sArray[12] = 2;
        sArray[13] = 3;
        id_byte = sArray;
    }

    private static void id_private() {
        float[] fArray = new float[4];
        fArray[0] = 363.0f;
        fArray[1] = 300.0f;
        id_protected = fArray;
    }
}

