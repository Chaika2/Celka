/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
package celestial;

import celestial.MT;
import celestial.fN_2;
import celestial.fk_3;
import celestial.fo_3;
import celestial.rrbb_3;
import celestial.util.ColorHelper;
import celestial.util.MinecraftAccessor;
import java.awt.image.BufferedImage;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.lwjgl.opengl.GL11;

public class rrjr_3
implements MinecraftAccessor {
    private static int[] id_break;
    private static float[] id_byte;
    public static Object[] id_class;
    private static byte[] id_protected;
    private static short[] id_throws;
    private static boolean[] id_case;
    private static String[] id_catch;

    private static void id_byte() {
        Object[] objectArray = new Object[]{ByteBuffer.allocateDirect(0x1000000).order(ByteOrder.nativeOrder()).asIntBuffer(), new int[0x400000]};
        id_class = objectArray;
    }

    private static int id_byte(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x75FD187B;
    }

    static {
        rrjr_3.ntfClinit();
    }

    public static void id_class(boolean bl) {
        if (bl) {
            GL11.glTexParameterf((int)id_throws[9], (int)id_throws[10], (float)id_byte[2]);
            GL11.glTexParameterf((int)id_throws[11], (int)id_throws[12], (float)id_byte[3]);
        } else {
            GL11.glTexParameterf((int)id_throws[13], (int)id_throws[14], (float)id_byte[4]);
            GL11.glTexParameterf((int)id_throws[15], (int)id_throws[16], (float)id_byte[5]);
        }
    }

    public static void id_class(int n, int n2, int n3) {
        rrjr_3.id_class(n, id_case[2], n2, n3);
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-29, -125, -83, -16, -97, 44, 81, 43}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public static void id_class(boolean bl, boolean bl2) {
        if (bl) {
            GL11.glTexParameterf((int)id_throws[17], (int)id_throws[18], (float)(bl2 ? id_byte[6] : id_byte[7]));
            GL11.glTexParameterf((int)id_throws[19], (int)id_throws[20], (float)id_byte[8]);
        } else {
            int n = rrbb_3.id_new();
            GL11.glTexParameterf((int)id_throws[21], (int)id_throws[22], (float)(bl2 ? (float)n : id_byte[9]));
            GL11.glTexParameterf((int)id_throws[23], (int)id_throws[24], (float)id_byte[10]);
        }
    }

    private static void id_class(int[] nArray, int n) {
        ((IntBuffer)id_class[id_throws[25]]).clear();
        ((IntBuffer)id_class[id_throws[26]]).put(nArray, id_case[10], n);
        ((IntBuffer)id_class[id_throws[27]]).position(id_case[11]).limit(n);
    }

    private static void id_class(BufferedImage bufferedImage, int n, int n2, boolean bl, boolean bl2) {
        int n3 = bufferedImage.getWidth();
        int n4 = bufferedImage.getHeight();
        int n5 = id_break[6] / n3;
        int[] nArray = (int[])id_class[id_throws[6]];
        rrjr_3.id_break(bl);
        rrjr_3.id_class(bl2);
        for (int i = id_case[5]; i < n3 * n4; i += n3 * n5) {
            int n6 = i / n3;
            int n7 = Math.min(n5, n4 - n6);
            int n8 = n3 * n7;
            bufferedImage.getRGB(id_case[6], n6, n3, n7, nArray, id_case[7], n3);
            rrjr_3.id_break(nArray, n8);
            GL11.glTexSubImage2D((int)id_throws[7], (int)id_case[8], (int)n, (int)(n2 + n6), (int)n3, (int)n7, (int)id_break[7], (int)id_break[8], (IntBuffer)((IntBuffer)id_class[id_throws[8]]));
        }
    }

    public static int id_class(int n, BufferedImage bufferedImage, int n2, int n3, boolean bl, boolean bl2) {
        rrjr_3.id_break(n);
        rrjr_3.id_class(bufferedImage, n2, n3, bl, bl2);
        return n;
    }

    public static void id_class(int n) {
        MT.id_continue(n);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x3874E25BBA244DABL;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void id_class(int n, int n2, int n3, int n4) {
        Class<fo_3> clazz;
        Class<fo_3> clazz2 = clazz = fo_3.class;
        synchronized (clazz2) {
            rrjr_3.id_class(n);
            rrjr_3.id_break(n);
        }
        if (n2 >= 0) {
            GL11.glTexParameterf((int)id_throws[0], (int)id_break[0], (float)n2);
            GL11.glTexParameterf((int)id_throws[1], (int)id_break[1], (float)id_byte[0]);
            GL11.glTexParameterf((int)id_throws[2], (int)id_break[2], (float)n2);
            GL11.glTexParameterf((int)id_throws[3], (int)id_break[3], (float)id_byte[1]);
        }
        for (int i = id_case[3]; i <= n2; ++i) {
            GL11.glTexImage2D((int)id_throws[4], (int)i, (int)id_throws[5], (int)(n3 >> i), (int)(n4 >> i), (int)id_case[4], (int)id_break[4], (int)id_break[5], (IntBuffer)null);
        }
    }

    public static fk_3 id_class(BufferedImage bufferedImage, boolean bl, boolean bl2, boolean bl3, boolean bl4) {
        fk_3 fk_32;
        int n;
        int n2 = bufferedImage.getWidth();
        int n3 = bufferedImage.getHeight();
        int[] nArray = bufferedImage.getRGB(id_case[12], id_case[13], n2, n3, null, id_case[14], n2);
        fN_2 fN_22 = new fN_2(n2, n3, id_case[15]);
        for (int i = id_case[16]; i < nArray.length; ++i) {
            n = nArray[i];
            int n4 = n >> id_protected[0] & id_throws[28];
            int n5 = n >> id_protected[1] & id_throws[29];
            int n6 = n >> id_protected[2] & id_throws[30];
            int n7 = n & id_throws[31];
            fN_22.id_class(i % n2, i / n2, ColorHelper.id_class(n5, n6, n7, n4));
        }
        try {
            fk_32 = new fk_3(fN_22);
            fk_32.a_(id_import.F());
            n = fk_32.id_new();
            MT.id_super(n);
            GL11.glTexParameteri((int)id_throws[32], (int)id_throws[33], (int)id_throws[34]);
            GL11.glTexParameteri((int)id_throws[35], (int)id_throws[36], (int)id_throws[37]);
            GL11.glTexParameteri((int)id_throws[38], (int)id_throws[39], (int)id_throws[40]);
            GL11.glTexParameteri((int)id_throws[41], (int)id_throws[42], (int)id_throws[43]);
            GL11.glTexParameteri((int)id_throws[44], (int)id_break[9], (int)id_throws[45]);
            GL11.glTexParameteri((int)id_throws[46], (int)id_break[10], (int)id_throws[47]);
            GL11.glTexParameteri((int)id_throws[48], (int)id_break[11], (int)id_throws[49]);
            GL11.glTexImage2D((int)id_throws[50], (int)id_case[17], (int)id_throws[51], (int)n2, (int)n3, (int)id_case[18], (int)id_throws[52], (int)id_throws[53], (ByteBuffer)null);
            fN_22.id_class(id_case[19], id_case[20], id_case[21], id_case[22], id_case[23], n2, n3, bl, bl2, bl3, bl4);
            MT.id_super(id_case[24]);
        }
        catch (Exception exception) {
            throw new RuntimeException(id_catch[0], exception);
        }
        return fk_32;
    }

    public static int id_class(int n, BufferedImage bufferedImage, boolean bl, boolean bl2) {
        rrjr_3.id_class(n, bufferedImage.getWidth(), bufferedImage.getHeight());
        return rrjr_3.id_class(n, bufferedImage, id_case[0], id_case[1], bl, bl2);
    }

    private static void id_class() {
        boolean[] blArray = new boolean[27];
        blArray[26] = true;
        id_case = blArray;
    }

    private static void id_break(int[] nArray, int n) {
        rrjr_3.id_class(nArray, n);
    }

    private static void id_break() {
        id_protected = new byte[]{24, 16, 8, 2};
    }

    public static void id_break(int n) {
        MT.id_super(n);
    }

    private static void id_break(boolean bl) {
        rrjr_3.id_class(bl, id_case[9]);
    }

    private static void id_throws() {
        float[] fArray = new float[11];
        fArray[2] = 33071.0f;
        fArray[3] = 33071.0f;
        fArray[4] = 10497.0f;
        fArray[5] = 10497.0f;
        fArray[6] = 9987.0f;
        fArray[7] = 9729.0f;
        fArray[8] = 9729.0f;
        fArray[9] = 9728.0f;
        fArray[10] = 9728.0f;
        id_byte = fArray;
    }

    private static /* synthetic */ void ntfClinit() {
        rrjr_3.id_class();
        rrjr_3.id_case();
        rrjr_3.id_catch();
        rrjr_3.id_throws();
        rrjr_3.id_break();
        rrjr_3.id_protected();
        rrjr_3.id_byte();
    }

    private static void id_catch() {
        short[] sArray = new short[54];
        sArray[0] = 3553;
        sArray[1] = 3553;
        sArray[2] = 3553;
        sArray[3] = 3553;
        sArray[4] = 3553;
        sArray[5] = 6408;
        sArray[6] = 1;
        sArray[7] = 3553;
        sArray[9] = 3553;
        sArray[10] = 10242;
        sArray[11] = 3553;
        sArray[12] = 10243;
        sArray[13] = 3553;
        sArray[14] = 10242;
        sArray[15] = 3553;
        sArray[16] = 10243;
        sArray[17] = 3553;
        sArray[18] = 10241;
        sArray[19] = 3553;
        sArray[20] = 10240;
        sArray[21] = 3553;
        sArray[22] = 10241;
        sArray[23] = 3553;
        sArray[24] = 10240;
        sArray[28] = 255;
        sArray[29] = 255;
        sArray[30] = 255;
        sArray[31] = 255;
        sArray[32] = 3553;
        sArray[33] = 10240;
        sArray[34] = 9729;
        sArray[35] = 3553;
        sArray[36] = 10241;
        sArray[37] = 9986;
        sArray[38] = 3553;
        sArray[39] = 10242;
        sArray[40] = 10497;
        sArray[41] = 3553;
        sArray[42] = 10243;
        sArray[43] = 10497;
        sArray[44] = 3553;
        sArray[45] = 1000;
        sArray[46] = 3553;
        sArray[47] = 1000;
        sArray[48] = 3553;
        sArray[49] = -1000;
        sArray[50] = 3553;
        sArray[51] = 6408;
        sArray[52] = 6408;
        sArray[53] = 5121;
        id_throws = sArray;
    }

    private static void id_case() {
        id_catch = new String[]{new String("Failed to create texture")};
    }

    private static void id_protected() {
        id_break = new int[]{33085, 33082, 33083, 34049, 32993, 33639, 0x400000, 32993, 33639, 33085, 33083, 33082, 0x400000, 0x400000};
    }
}

