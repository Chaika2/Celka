/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.BufferUtils
 *  org.lwjgl.opengl.GL11
 */
package celestial;

import celestial.MT;
import celestial.QY;
import celestial.fJ_2;
import celestial.fN_2;
import celestial.fY_2;
import celestial.ff_3;
import celestial.fj_3;
import celestial.fk_3;
import celestial.fo_3;
import celestial.rAF;
import celestial.rAL;
import celestial.rqO_2;
import celestial.rrbb_3;
import celestial.rrdE;
import celestial.rrdJ;
import celestial.rrdZ;
import celestial.rrxn_3;
import celestial.rrzJ_2;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import javax.imageio.ImageIO;
import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.GL11;

public class rrdA {
    public static final int id_class = 0x100000;
    public static ByteBuffer id_break = BufferUtils.createByteBuffer((int)0x400000);
    public static IntBuffer id_byte = id_break.asIntBuffer();
    public static int[] id_protected = new int[0x100000];
    public static final int id_throws = 0;
    public static final int id_case = -8421377;
    public static final int id_catch = 0;
    public static Map<Integer, rrdE> id_private = new HashMap<Integer, rrdE>();

    private static fN_2 id_byte(int n, int n2, int n3) {
        fN_2 fN_22 = new fN_2(n, n2, false);
        int n4 = rrzJ_2.id_case(n3);
        fN_22.id_throws(n4);
        return fN_22;
    }

    public static void id_byte(int[] nArray, int n, int n2, int n3) {
    }

    public static int id_byte(int n) {
        int n2 = n - 1;
        n2 |= n2 >> 1;
        n2 |= n2 >> 2;
        n2 |= n2 >> 4;
        n2 |= n2 >> 8;
        n2 |= n2 >> 16;
        return n2 + 1;
    }

    public static boolean id_class(int[] nArray, int n, int n2) {
        int n3 = n * n2;
        if (nArray[0] >>> 24 == 255 && nArray[n3 - 1] == 0) {
            return true;
        }
        for (int i = 0; i < n3; ++i) {
            int n4 = nArray[i] >>> 24;
            if (n4 == 0 || n4 == 255) continue;
            return true;
        }
        return false;
    }

    public static void id_class(int[] nArray, int n, int n2, int n3, int n4) {
        int n5 = 0;
        int n6 = n;
        int n7 = n2;
        int n8 = n3;
        int n9 = n4;
        while (n6 > 0 && n7 > 0) {
            GL11.glCopyTexSubImage2D((int)3553, (int)n5, (int)n8, (int)n9, (int)0, (int)0, (int)n6, (int)n7);
            ++n5;
            n6 /= 2;
            n7 /= 2;
            n8 /= 2;
            n9 /= 2;
        }
    }

    public static void id_class(rrdE rrdE2, int[] nArray, int n, int n2, int n3, int n4, boolean bl, boolean bl2) {
        int n5 = n * n2;
        IntBuffer intBuffer = rrdA.id_class(n5);
        rrzJ_2.id_catch();
        ((Buffer)intBuffer).clear();
        intBuffer.put(nArray, 0, n5);
        ((Buffer)intBuffer).position(0).limit(n5);
        MT.id_super(rrdE2.id_class);
        GL11.glTexParameteri((int)3553, (int)10241, (int)9728);
        GL11.glTexParameteri((int)3553, (int)10240, (int)9728);
        GL11.glTexParameteri((int)3553, (int)10242, (int)10497);
        GL11.glTexParameteri((int)3553, (int)10243, (int)10497);
        GL11.glTexSubImage2D((int)3553, (int)0, (int)n3, (int)n4, (int)n, (int)n2, (int)32993, (int)33639, (IntBuffer)intBuffer);
        if (nArray.length == n5 * 3) {
            ((Buffer)intBuffer).clear();
            ((Buffer)intBuffer.put(nArray, n5, n5)).position(0);
            ((Buffer)intBuffer).position(0).limit(n5);
        }
        MT.id_super(rrdE2.id_break);
        GL11.glTexParameteri((int)3553, (int)10241, (int)9728);
        GL11.glTexParameteri((int)3553, (int)10240, (int)9728);
        GL11.glTexParameteri((int)3553, (int)10242, (int)10497);
        GL11.glTexParameteri((int)3553, (int)10243, (int)10497);
        GL11.glTexSubImage2D((int)3553, (int)0, (int)n3, (int)n4, (int)n, (int)n2, (int)32993, (int)33639, (IntBuffer)intBuffer);
        if (nArray.length == n5 * 3) {
            ((Buffer)intBuffer).clear();
            intBuffer.put(nArray, n5 * 2, n5);
            ((Buffer)intBuffer).position(0).limit(n5);
        }
        MT.id_super(rrdE2.id_byte);
        GL11.glTexParameteri((int)3553, (int)10241, (int)9728);
        GL11.glTexParameteri((int)3553, (int)10240, (int)9728);
        GL11.glTexParameteri((int)3553, (int)10242, (int)10497);
        GL11.glTexParameteri((int)3553, (int)10243, (int)10497);
        GL11.glTexSubImage2D((int)3553, (int)0, (int)n3, (int)n4, (int)n, (int)n2, (int)32993, (int)33639, (IntBuffer)intBuffer);
        MT.id_new(33984);
    }

    public static rqO_2 id_class(rqO_2 rqO_22, String string) {
        if (rqO_22 == null) {
            return null;
        }
        String string2 = rqO_22.id_break();
        String[] stringArray = string2.split(".png");
        String string3 = stringArray[0];
        return new rqO_2(rqO_22.id_byte(), string3 + "_" + string + ".png");
    }

    public static int[][] id_class(int n, int n2, int[][] nArray) {
        for (int i = 1; i <= n; ++i) {
            if (nArray[i] != null) continue;
            int n3 = n2 >> i;
            int n4 = n3 * 2;
            int[] nArray2 = nArray[i - 1];
            nArray[i] = new int[n3 * n3];
            int[] nArray3 = nArray[i];
            for (int j = 0; j < n3; ++j) {
                for (int k = 0; k < n3; ++k) {
                    int n5 = j * 2 * n4 + k * 2;
                    nArray3[j * n3 + k] = rrdA.id_break(nArray2[n5], nArray2[n5 + 1], nArray2[n5 + n4], nArray2[n5 + n4 + 1]);
                }
            }
        }
        return nArray;
    }

    public static void id_class(int[][] nArray, int n, int n2, int n3, int n4, int n5) {
        rrzJ_2.id_catch();
        int n6 = n * n2;
        IntBuffer intBuffer = rrdA.id_class(n6);
        int n7 = nArray.length;
        int n8 = 0;
        int n9 = n;
        int n10 = n2;
        int n11 = n3;
        int n12 = n4;
        while (n9 > 0 && n10 > 0 && n8 < n7) {
            int n13 = n9 * n10;
            int[] nArray2 = nArray[n8];
            ((Buffer)intBuffer).clear();
            if (nArray2.length >= n13 * (n5 + 1)) {
                ((Buffer)intBuffer.put(nArray2, n13 * n5, n13)).position(0).limit(n13);
                GL11.glTexSubImage2D((int)3553, (int)n8, (int)n11, (int)n12, (int)n9, (int)n10, (int)32993, (int)33639, (IntBuffer)intBuffer);
            }
            n9 >>= 1;
            n10 >>= 1;
            n11 >>= 1;
            n12 >>= 1;
            ++n8;
        }
        ((Buffer)intBuffer).clear();
    }

    public static int id_class(int n, int n2, int n3, int n4) {
        int n5;
        int n6 = n >>> 24 & 0xFF;
        int n7 = n2 >>> 24 & 0xFF;
        int n8 = n3 >>> 24 & 0xFF;
        int n9 = n4 >>> 24 & 0xFF;
        int n10 = n6 + n7 + n8 + n9;
        int n11 = (n10 + 2) / 4;
        if (n10 != 0) {
            n5 = n10;
        } else {
            n5 = 4;
            n6 = 1;
            n7 = 1;
            n8 = 1;
            n9 = 1;
        }
        int n12 = (n5 + 1) / 2;
        return n11 << 24 | ((n >>> 16 & 0xFF) * n6 + (n2 >>> 16 & 0xFF) * n7 + (n3 >>> 16 & 0xFF) * n8 + (n4 >>> 16 & 0xFF) * n9 + n12) / n5 << 16 | ((n >>> 8 & 0xFF) * n6 + (n2 >>> 8 & 0xFF) * n7 + (n3 >>> 8 & 0xFF) * n8 + (n4 >>> 8 & 0xFF) * n9 + n12) / n5 << 8 | ((n >>> 0 & 0xFF) * n6 + (n2 >>> 0 & 0xFF) * n7 + (n3 >>> 0 & 0xFF) * n8 + (n4 >>> 0 & 0xFF) * n9 + n12) / n5 << 0;
    }

    public static void id_class(int[] nArray, int n, int n2, int n3) {
        int n4;
        int n5;
        int n6;
        Math.min(n2, n3);
        int n7 = n;
        int n8 = n2;
        int n9 = n3;
        int n10 = 0;
        int n11 = 0;
        int n12 = 0;
        int n13 = 0;
        while (n8 > 1 && n9 > 1) {
            n10 = n7 + n8 * n9;
            n11 = n8 / 2;
            n12 = n9 / 2;
            for (n6 = 0; n6 < n12; ++n6) {
                n5 = n10 + n6 * n11;
                n4 = n7 + n6 * 2 * n8;
                for (int i = 0; i < n11; ++i) {
                    nArray[n5 + i] = rrdA.id_class(nArray[n4 + i * 2], nArray[n4 + i * 2 + 1], nArray[n4 + n8 + i * 2], nArray[n4 + n8 + i * 2 + 1]);
                }
            }
            ++n13;
            n8 = n11;
            n9 = n12;
            n7 = n10;
        }
        while (n13 > 0) {
            n8 = n2 >> --n13;
            n9 = n3 >> n13;
            n6 = n7 = n10 - n8 * n9;
            for (n5 = 0; n5 < n9; ++n5) {
                for (n4 = 0; n4 < n8; ++n4) {
                    if (nArray[n6] == 0) {
                        nArray[n6] = nArray[n10 + n5 / 2 * n11 + n4 / 2] & 0xFFFFFF;
                    }
                    ++n6;
                }
            }
            n10 = n7;
            n11 = n8;
        }
    }

    public static int[][] id_class(int[][] nArray, int n, int n2, int n3) {
        int n4 = nArray.length;
        int[][] nArrayArray = new int[n4][];
        for (int i = 0; i < n4; ++i) {
            int[] nArray2 = nArray[i];
            if (nArray2 == null) continue;
            int n5 = (n >> i) * (n2 >> i);
            int[] nArray3 = new int[n5 * 3];
            nArrayArray[i] = nArray3;
            int n6 = nArray2.length / 3;
            int n7 = n5 * n3;
            int n8 = 0;
            System.arraycopy(nArray2, n7, nArray3, n8, n5);
            System.arraycopy(nArray2, n7 += n6, nArray3, n8 += n5, n5);
            System.arraycopy(nArray2, n7 += n6, nArray3, n8 += n5, n5);
        }
        return nArrayArray;
    }

    public static int[][] id_class(fj_3 fj_32, int[][] nArray, int n, int n2) {
        boolean bl = true;
        return nArray;
    }

    public static void id_class(fj_3 fj_32, int[] nArray) {
    }

    public static BufferedImage id_class(rqO_2 rqO_22) {
        try {
            if (!rrbb_3.id_byte(rqO_22)) {
                return null;
            }
            InputStream inputStream = rrbb_3.id_class(rqO_22);
            if (inputStream == null) {
                return null;
            }
            BufferedImage bufferedImage = ImageIO.read(inputStream);
            inputStream.close();
            return bufferedImage;
        }
        catch (IOException iOException) {
            return null;
        }
    }

    private static fN_2 id_class(rAL rAL2, rqO_2 rqO_22, int n, int n2, int n3) {
        fN_2 fN_22 = rrdA.id_class(rAL2, rqO_22, n, n2);
        if (fN_22 == null) {
            fN_22 = new fN_2(n, n2, false);
            int n4 = rrzJ_2.id_case(n3);
            fN_22.id_class(0, 0, n, n2, n4);
        }
        return fN_22;
    }

    private static fN_2 id_class(rAL rAL2, rqO_2 rqO_22, int n, int n2) {
        if (rqO_22 == null) {
            return null;
        }
        try {
            rAF rAF2 = rAL2.id_class(rqO_22);
            fN_2 fN_22 = fN_2.id_class(rAF2.id_break());
            if (fN_22 == null) {
                return null;
            }
            if (fN_22.id_class() == n && fN_22.id_break() == n2) {
                return fN_22;
            }
            fN_22.close();
            return null;
        }
        catch (IOException iOException) {
            return null;
        }
    }

    public static void id_class(int n, fN_2 fN_22, boolean bl, boolean bl2, rAL rAL2, rqO_2 rqO_22, rrdE rrdE2) {
        int n2 = fN_22.id_class();
        int n3 = fN_22.id_break();
        rqO_2 rqO_23 = rrdA.id_class(rqO_22, "n");
        fN_2 fN_23 = rrdA.id_class(rAL2, rqO_23, n2, n3, -8421377);
        fo_3.id_class(rrdE2.id_break, 0, n2, n3);
        fN_23.id_class(0, 0, 0, 0, 0, n2, n3, bl, bl2, false, true);
        rqO_2 rqO_24 = rrdA.id_class(rqO_22, "s");
        fN_2 fN_24 = rrdA.id_class(rAL2, rqO_24, n2, n3, 0);
        fo_3.id_class(rrdE2.id_byte, 0, n2, n3);
        fN_24.id_class(0, 0, 0, 0, 0, n2, n3, bl, bl2, false, true);
        MT.id_super(rrdE2.id_class);
    }

    public static IntBuffer id_class(int n) {
        if (id_byte.capacity() < n) {
            int n2 = rrdA.id_byte(n);
            id_break = BufferUtils.createByteBuffer((int)(n2 * 4));
            id_byte = id_break.asIntBuffer();
        }
        return id_byte;
    }

    public static void id_class(rrdE rrdE2) {
        rrdA.id_class(rrdE2.id_break, rrdE2.id_byte, true, true, false);
    }

    public static IntBuffer id_class(int n, int n2) {
        int[] nArray = rrdA.id_break(n);
        IntBuffer intBuffer = rrdA.id_class(n);
        Arrays.fill(id_protected, 0, n, n2);
        id_byte.put(id_protected, 0, n);
        return id_byte;
    }

    public static void id_class(rrdE rrdE2, boolean bl, boolean bl2, boolean bl3) {
        if (rrdZ.id_volatile && MT.P() == 33984) {
            int n;
            if (rrdZ.SV) {
                MT.id_new(33985);
                MT.id_super(rrdE2.id_break);
                if (!bl) {
                    n = bl3 ? 9984 : 9728;
                    MT.id_break(3553, 10241, n);
                    MT.id_break(3553, 10240, 9728);
                }
            }
            if (rrdZ.Sg) {
                MT.id_new(33987);
                MT.id_super(rrdE2.id_byte);
                if (!bl2) {
                    n = bl3 ? 9984 : 9728;
                    MT.id_break(3553, 10241, n);
                    MT.id_break(3553, 10240, 9728);
                }
            }
            MT.id_new(33984);
        }
        MT.id_super(rrdE2.id_class);
    }

    public static void id_class(fk_3 fk_32) {
        rrdE rrdE2 = fk_32.id_this();
        fN_2 fN_22 = fk_32.id_break();
        int n = fN_22.id_class();
        int n2 = fN_22.id_break();
        fN_2 fN_23 = rrdA.id_byte(n, n2, -8421377);
        fo_3.id_class(rrdE2.id_break, n, n2);
        fN_23.id_class(0, 0, 0, 0, 0, n, n2, false, false, false, true);
        fN_2 fN_24 = rrdA.id_byte(n, n2, 0);
        fo_3.id_class(rrdE2.id_byte, n, n2);
        fN_24.id_class(0, 0, 0, 0, 0, n, n2, false, false, false, true);
        MT.id_super(rrdE2.id_class);
    }

    public static void id_class(int n, int n2, boolean bl, boolean bl2, boolean bl3) {
        if (rrdZ.id_volatile && MT.P() == 33984) {
            int n3;
            if (rrdZ.SV) {
                MT.id_new(33985);
                MT.id_super(n);
                if (!bl) {
                    n3 = bl3 ? 9984 : 9728;
                    MT.id_break(3553, 10241, n3);
                    MT.id_break(3553, 10240, 9728);
                }
            }
            if (rrdZ.Sg) {
                MT.id_new(33987);
                MT.id_super(n2);
                if (!bl2) {
                    n3 = bl3 ? 9984 : 9728;
                    MT.id_break(3553, 10241, n3);
                    MT.id_break(3553, 10240, 9728);
                }
            }
            MT.id_new(33984);
        }
    }

    public static void id_class(ff_3 ff_32, int n) {
        rrdE rrdE2 = ff_32.id_implements;
        if (rrdE2 != null) {
            ff_32.id_implements = null;
            id_private.remove(rrdE2.id_class);
            MT.id_continue(rrdE2.id_break);
            MT.id_continue(rrdE2.id_byte);
            if (rrdE2.id_class != n) {
                rrdJ.id_break("Error : MultiTexID.base mismatch: " + rrdE2.id_class + ", texid: " + n);
                MT.id_continue(rrdE2.id_class);
            }
        }
    }

    public static rrdE id_class(ff_3 ff_32) {
        rrdE rrdE2 = ff_32.id_implements;
        if (rrdE2 == null) {
            int n = ff_32.id_new();
            rrdE2 = id_private.get(n);
            if (rrdE2 == null) {
                rrdE2 = new rrdE(n, GL11.glGenTextures(), GL11.glGenTextures());
                id_private.put(n, rrdE2);
            }
            ff_32.id_implements = rrdE2;
        }
        return rrdE2;
    }

    public static ff_3 id_class() {
        fk_3 fk_32 = new fk_3(1, 1, true);
        fk_32.id_break().id_class(0, 0, -1);
        fk_32.id_class();
        return fk_32;
    }

    private static fN_2[] id_class(fN_2 fN_22, int n) {
        if (n < 0) {
            n = 0;
        }
        fN_2[] fN_2Array = new fN_2[n + 1];
        fN_2Array[0] = fN_22;
        if (n > 0) {
            for (int i = 1; i <= n; ++i) {
                fN_2 fN_23 = fN_2Array[i - 1];
                fN_2 fN_24 = new fN_2(fN_23.id_class() >> 1, fN_23.id_break() >> 1, false);
                int n2 = fN_24.id_class();
                int n3 = fN_24.id_break();
                for (int j = 0; j < n2; ++j) {
                    for (int k = 0; k < n3; ++k) {
                        fN_24.id_class(j, k, rrdA.id_break(fN_23.id_class(j * 2 + 0, k * 2 + 0), fN_23.id_class(j * 2 + 1, k * 2 + 0), fN_23.id_class(j * 2 + 0, k * 2 + 1), fN_23.id_class(j * 2 + 1, k * 2 + 1)));
                    }
                }
                fN_2Array[i] = fN_24;
            }
        }
        return fN_2Array;
    }

    public static void id_class(int[] nArray, int n, int n2, int n3, int n4, int n5) {
        int n6 = n * n2;
        IntBuffer intBuffer = rrdA.id_class(n6);
        ((Buffer)intBuffer).clear();
        int n7 = n5 * n6;
        if (nArray.length >= n7 + n6) {
            ((Buffer)intBuffer.put(nArray, n7, n6)).position(0).limit(n6);
            rrzJ_2.id_catch();
            GL11.glTexSubImage2D((int)3553, (int)0, (int)n3, (int)n4, (int)n, (int)n2, (int)32993, (int)33639, (IntBuffer)intBuffer);
            ((Buffer)intBuffer).clear();
        }
    }

    public static void id_class(int n, int n2, int n3) {
        if (rrdZ.id_volatile && MT.P() == 33984) {
            MT.id_new(33985);
            MT.id_super(n2);
            MT.id_new(33987);
            MT.id_super(n3);
            MT.id_new(33984);
        }
        MT.id_super(n);
    }

    public static void id_class(int n, int n2, int n3, fJ_2 fJ_22) {
        rrdE rrdE2 = rrdA.id_class(fJ_22);
        if (rrdZ.SV) {
            rrdJ.id_byte("Allocate texture map normal: " + n2 + "x" + n3 + ", mipmaps: " + n);
            fo_3.id_class(rrdE2.id_break, n, n2, n3);
        }
        if (rrdZ.Sg) {
            rrdJ.id_byte("Allocate texture map specular: " + n2 + "x" + n3 + ", mipmaps: " + n);
            fo_3.id_class(rrdE2.id_byte, n, n2, n3);
        }
        MT.id_super(rrdE2.id_class);
    }

    public static void id_break() {
        fY_2 fY_22 = QY.id_instanceof().A();
        ff_3 ff_32 = fY_22.id_break(fJ_2.id_class);
        if (ff_32 != null) {
            rrdE rrdE2 = ff_32.id_this();
            MT.id_super(rrdE2.id_class);
            GL11.glTexParameteri((int)3553, (int)10241, (int)rrdZ.Sa[rrdZ.Sq]);
            GL11.glTexParameteri((int)3553, (int)10240, (int)rrdZ.Si[rrdZ.Sw]);
            MT.id_super(rrdE2.id_break);
            GL11.glTexParameteri((int)3553, (int)10241, (int)rrdZ.Sa[rrdZ.ST]);
            GL11.glTexParameteri((int)3553, (int)10240, (int)rrdZ.Si[rrdZ.SI]);
            MT.id_super(rrdE2.id_byte);
            GL11.glTexParameteri((int)3553, (int)10241, (int)rrdZ.Sa[rrdZ.St]);
            GL11.glTexParameteri((int)3553, (int)10240, (int)rrdZ.Si[rrdZ.Sf]);
            MT.id_super(0);
        }
    }

    public static int id_break(int n, int n2, int n3) {
        int n4 = 255 - n3;
        return ((n >>> 24 & 0xFF) * n3 + (n2 >>> 24 & 0xFF) * n4) / 255 << 24 | ((n >>> 16 & 0xFF) * n3 + (n2 >>> 16 & 0xFF) * n4) / 255 << 16 | ((n >>> 8 & 0xFF) * n3 + (n2 >>> 8 & 0xFF) * n4) / 255 << 8 | ((n >>> 0 & 0xFF) * n3 + (n2 >>> 0 & 0xFF) * n4) / 255 << 0;
    }

    public static int[] id_break(int n, int n2) {
        int[] nArray = new int[n * 3];
        Arrays.fill(nArray, 0, n, n2);
        Arrays.fill(nArray, n, n * 2, -8421377);
        Arrays.fill(nArray, n * 2, n * 3, 0);
        return nArray;
    }

    public static void id_break(ff_3 ff_32) {
        int n = ff_32.id_new();
        boolean bl = true;
        boolean bl2 = true;
        boolean bl3 = false;
        if (ff_32 instanceof fJ_2) {
            fJ_2 fJ_22 = (fJ_2)ff_32;
            bl = fJ_22.id_package();
            bl2 = fJ_22.id_int();
            bl3 = fJ_22.id_volatile();
        }
        rrdA.id_class(ff_32.id_this(), bl, bl2, bl3);
        if (MT.P() == 33984) {
            int n2 = rrdZ.j;
            int n3 = rrdZ.V;
            if (ff_32 instanceof fJ_2) {
                rrdZ.j = ((fJ_2)ff_32).id_byte;
                rrdZ.V = ((fJ_2)ff_32).id_protected;
            } else {
                rrdZ.j = 0;
                rrdZ.V = 0;
            }
            if (rrdZ.j != n2 || rrdZ.V != n3) {
                boolean bl4 = rrxn_3.id_class(false);
                rrdZ.Pj.id_class(rrdZ.j, rrdZ.V);
                rrxn_3.id_class(bl4);
            }
        }
    }

    public static int id_break(int n, int n2, int n3, int n4) {
        return ((n >>> 24 & 0xFF) + (n2 >>> 24 & 0xFF) + (n3 >>> 24 & 0xFF) + (n4 >>> 24 & 0xFF) + 2) / 4 << 24 | ((n >>> 16 & 0xFF) + (n2 >>> 16 & 0xFF) + (n3 >>> 16 & 0xFF) + (n4 >>> 16 & 0xFF) + 2) / 4 << 16 | ((n >>> 8 & 0xFF) + (n2 >>> 8 & 0xFF) + (n3 >>> 8 & 0xFF) + (n4 >>> 8 & 0xFF) + 2) / 4 << 8 | ((n >>> 0 & 0xFF) + (n2 >>> 0 & 0xFF) + (n3 >>> 0 & 0xFF) + (n4 >>> 0 & 0xFF) + 2) / 4 << 0;
    }

    public static int[] id_break(int n) {
        if (id_protected == null) {
            id_protected = new int[0x100000];
        }
        if (id_protected.length < n) {
            id_protected = new int[rrdA.id_byte(n)];
        }
        return id_protected;
    }

    public static void id_break(int[] nArray, int n, int n2, int n3) {
        int n4;
        int n5;
        int n6;
        Math.min(n2, n3);
        int n7 = n;
        int n8 = n2;
        int n9 = n3;
        int n10 = 0;
        int n11 = 0;
        int n12 = 0;
        int n13 = 0;
        while (n8 > 1 && n9 > 1) {
            n10 = n7 + n8 * n9;
            n11 = n8 / 2;
            n12 = n9 / 2;
            for (n6 = 0; n6 < n12; ++n6) {
                n5 = n10 + n6 * n11;
                n4 = n7 + n6 * 2 * n8;
                for (int i = 0; i < n11; ++i) {
                    nArray[n5 + i] = rrdA.id_break(nArray[n4 + i * 2], nArray[n4 + i * 2 + 1], nArray[n4 + n8 + i * 2], nArray[n4 + n8 + i * 2 + 1]);
                }
            }
            ++n13;
            n8 = n11;
            n9 = n12;
            n7 = n10;
        }
        while (n13 > 0) {
            n8 = n2 >> --n13;
            n9 = n3 >> n13;
            n6 = n7 = n10 - n8 * n9;
            for (n5 = 0; n5 < n9; ++n5) {
                for (n4 = 0; n4 < n8; ++n4) {
                    if (nArray[n6] == 0) {
                        nArray[n6] = nArray[n10 + n5 / 2 * n11 + n4 / 2] & 0xFFFFFF;
                    }
                    ++n6;
                }
            }
            n10 = n7;
            n11 = n8;
        }
    }

    public static int[] id_throws(int n) {
        int[] nArray = new int[n * 3];
        Arrays.fill(nArray, 0, n, 0);
        Arrays.fill(nArray, n, n * 2, -8421377);
        Arrays.fill(nArray, n * 2, n * 3, 0);
        return nArray;
    }

    public static void id_case(int n) {
        rrdE rrdE2 = id_private.get(n);
        rrdA.id_class(rrdE2, true, true, false);
    }

    public static int id_protected(int n) {
        int n2 = 0;
        if ((n & 0xFFFF0000) != 0) {
            n2 += 16;
            n >>= 16;
        }
        if ((n & 0xFF00) != 0) {
            n2 += 8;
            n >>= 8;
        }
        if ((n & 0xF0) != 0) {
            n2 += 4;
            n >>= 4;
        }
        if ((n & 6) != 0) {
            n2 += 2;
            n >>= 2;
        }
        if ((n & 2) != 0) {
            ++n2;
        }
        return n2;
    }
}

