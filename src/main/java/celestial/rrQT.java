/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.hash.Hashing
 *  org.apache.commons.lang3.Validate
 */
package celestial;

import celestial.Ak_1;
import celestial.Ml_1;
import celestial.Qw_1;
import celestial.ch_3;
import celestial.fN_2;
import celestial.ff_3;
import celestial.fk_3;
import celestial.mt_3;
import celestial.rgN_2;
import celestial.rqO_2;
import celestial.rrQC;
import celestial.rrQX;
import celestial.rruv_1;
import celestial.rrwA_2;
import celestial.util.MinecraftAccessor;
import celestial.vF_2;
import celestial.vm_3;
import com.google.common.hash.Hashing;
import com.mojang.blaze3d.systems.RenderSystem;
import java.net.UnknownHostException;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Objects;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.apache.commons.lang3.Validate;

public class rrQT
implements MinecraftAccessor {
    private static int[] id_break;
    private static long[] id_byte;
    private static byte[] id_protected;
    public Object[] id_class;
    private static float[] id_throws;
    private static boolean[] id_case;
    private static String[] id_catch;
    private static short[] id_private;

    public rrQC id_byte() {
        return (rrQC)this.id_class[id_private[43]];
    }

    private static void id_int() {
        id_catch = new String[]{new String("Must be 64 pixels wide"), new String("Must be 64 pixels high")};
    }

    public rrQT(rrQC rrQC2, Ak_1 ak_1) {
        this.id_extends();
        rruv_1 rruv_12 = new rruv_1(id_throws[0], id_throws[1], id_throws[2], id_throws[3]);
        this.id_class[rrQT.id_private[0]] = rruv_12;
        rrQC rrQC3 = rrQC2;
        this.id_class[rrQT.id_private[1]] = rrQC3;
        Ak_1 ak_12 = ak_1;
        this.id_class[rrQT.id_private[2]] = ak_12;
        rqO_2 rqO_22 = new rqO_2("servers/" + Hashing.sha1().hashUnencodedChars((CharSequence)ak_1.id_break) + "/icon");
        this.id_class[rrQT.id_private[3]] = rqO_22;
        fk_3 fk_32 = (fk_3)id_import.A().id_break((rqO_2)this.id_class[id_private[4]]);
        this.id_class[rrQT.id_private[5]] = fk_32;
    }

    static {
        rrQT.ntfClinit();
    }

    private static void id_class(Ml_1 ml_1, int n, int n2, int n3, int n4, rqO_2 rqO_22) {
        id_import.A().id_class(rqO_22);
        RenderSystem.enableBlend();
        ch_3.id_class(ml_1, n, n2, id_throws[10], id_throws[11], n3, n4, n3, n4);
        RenderSystem.disableBlend();
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x1D9F1AF503A624B5L;
    }

    public boolean id_class(double d, double d2, int n) {
        if (((rruv_1)this.id_class[id_private[28]]).id_break((float)d, (float)d2) && n == 0) {
            id_import.id_break(new mt_3((vm_3)rrQT.id_import.id_class[id_private[29]], id_import, (Ak_1)this.id_class[id_private[30]]));
            return id_case[1];
        }
        return id_case[2];
    }

    public void id_class(rruv_1 rruv_12) {
        rruv_1 rruv_13 = rruv_12;
        this.id_class[rrQT.id_private[31]] = rruv_13;
    }

    public boolean id_class(String string) {
        if (string == null) {
            id_import.A().id_byte((rqO_2)this.id_class[id_private[32]]);
            if ((fk_3)this.id_class[id_private[33]] != null && ((fk_3)this.id_class[id_private[34]]).id_break() != null) {
                ((fk_3)this.id_class[id_private[35]]).id_break().close();
            }
            Object var7_2 = null;
            this.id_class[rrQT.id_private[36]] = var7_2;
        } else {
            try {
                fN_2 fN_22 = fN_2.id_class(string);
                Validate.validState((boolean)(fN_22.id_class() == id_protected[1] ? id_case[3] : id_case[4]), (String)id_catch[0], (Object[])new Object[id_case[5]]);
                Validate.validState((boolean)(fN_22.id_break() == id_protected[2] ? id_case[6] : id_case[7]), (String)id_catch[1], (Object[])new Object[id_case[8]]);
                if ((fk_3)this.id_class[id_private[37]] == null) {
                    fk_3 fk_32 = new fk_3(fN_22);
                    this.id_class[rrQT.id_private[38]] = fk_32;
                } else {
                    ((fk_3)this.id_class[id_private[39]]).id_class(fN_22);
                    ((fk_3)this.id_class[id_private[40]]).id_class();
                }
                id_import.A().id_class((rqO_2)this.id_class[id_private[41]], (ff_3)((fk_3)this.id_class[id_private[42]]));
            }
            catch (Throwable throwable) {
                return id_case[9];
            }
        }
        return id_case[10];
    }

    public void id_class(Ml_1 ml_1, int n, int n2, float f) {
        if (!((Ak_1)this.id_class[rrQT.id_private[6]]).id_private) {
            ((Ak_1)this.id_class[rrQT.id_private[7]]).id_private = id_case[0];
            ((Ak_1)this.id_class[rrQT.id_private[8]]).id_throws = id_byte[0];
            ((Ak_1)this.id_class[rrQT.id_private[9]]).id_protected = rgN_2.id_byte;
            ((Ak_1)this.id_class[rrQT.id_private[10]]).id_byte = rgN_2.id_byte;
            vF_2.id_class.submit(() -> {
                try {
                    ((rrQC)this.id_class[id_private[49]]).id_final().id_class((Ak_1)this.id_class[id_private[50]], () -> {});
                }
                catch (UnknownHostException unknownHostException) {
                    ((Ak_1)this.id_class[rrQT.id_private[51]]).id_throws = id_byte[1];
                    ((Ak_1)this.id_class[rrQT.id_private[52]]).id_protected = vF_2.id_catch;
                }
                catch (Exception exception) {
                    ((Ak_1)this.id_class[rrQT.id_private[53]]).id_throws = id_byte[2];
                    ((Ak_1)this.id_class[rrQT.id_private[54]]).id_protected = vF_2.id_private;
                }
            });
        }
        float f2 = ((rruv_1)this.id_class[id_private[11]]).id_break();
        float f3 = ((rruv_1)this.id_class[id_private[12]]).id_protected();
        float f4 = ((rruv_1)this.id_class[id_private[13]]).id_byte();
        float f5 = ((rruv_1)this.id_class[id_private[14]]).id_class();
        String string = ((Ak_1)this.id_class[id_private[15]]).id_byte();
        if (!Objects.equals(string, (String)this.id_class[id_private[16]])) {
            if (this.id_class(string)) {
                String string2 = string;
                this.id_class[rrQT.id_private[17]] = string2;
            } else {
                ((Ak_1)this.id_class[id_private[18]]).id_class((String)null);
            }
        }
        RenderSystem.color4f(id_throws[4], id_throws[5], id_throws[6], id_throws[7]);
        boolean bl = ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_private[19]]).id_private().id_throws().id_super();
        if (bl && (Ak_1)this.id_class[id_private[20]] instanceof rrwA_2) {
            Object var16_12 = null;
            this.id_class[rrQT.id_private[21]] = var16_12;
        }
        if ((fk_3)this.id_class[id_private[22]] != null) {
            rrQT.id_class(ml_1, (int)f2, (int)f3, (int)f4, (int)f5, (rqO_2)this.id_class[id_private[23]]);
        } else {
            rrQT.id_class(ml_1, (int)f2, (int)f3, (int)f4, (int)f5, vF_2.id_throws);
        }
        if (((Qw_1)rrQT.id_import.id_class[rrQT.id_private[24]]).S || ((rruv_1)this.id_class[id_private[25]]).id_break(n, n2)) {
            id_import.A().id_class(vF_2.id_case);
            ch_3.id_class(ml_1, f2, f3, f2 + f4, f3 + f5, id_break[0]);
            ch_3.id_class(ml_1, (int)f2 - id_protected[0], (int)f3, id_throws[8], id_throws[9], (int)f4, (int)f5, (int)id_private[26], (int)id_private[27]);
        }
    }

    public rruv_1 id_class() {
        return (rruv_1)this.id_class[id_private[48]];
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x8AECA37B;
    }

    public static String id_break(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-127, 72, 42, -87, 0, 95, 105, 121}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public String id_break() {
        return (String)this.id_class[id_private[47]];
    }

    public fk_3 id_throws() {
        return (fk_3)this.id_class[id_private[46]];
    }

    private static /* synthetic */ void ntfClinit() {
        rrQT.id_final();
        rrQT.id_int();
        rrQT.id_package();
        rrQT.id_native();
        rrQT.id_volatile();
        rrQT.id_finally();
        rrQT.id_catch();
    }

    private static void id_finally() {
        id_protected = new byte[]{2, 64, 64, 6};
    }

    private static void id_catch() {
        id_break = new int[]{-1601138544};
    }

    private void id_extends() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_protected[3]];
        }
    }

    public rqO_2 id_case() {
        return (rqO_2)this.id_class[id_private[45]];
    }

    private static void id_package() {
        id_byte = new long[]{-2L, -1L, -1L};
    }

    public Ak_1 id_protected() {
        return (Ak_1)this.id_class[id_private[44]];
    }

    private static void id_final() {
        boolean[] blArray = new boolean[11];
        blArray[0] = true;
        blArray[1] = true;
        blArray[3] = true;
        blArray[6] = true;
        blArray[10] = true;
        id_case = blArray;
    }

    private static void id_volatile() {
        short[] sArray = new short[55];
        sArray[0] = 5;
        sArray[2] = 1;
        sArray[3] = 2;
        sArray[4] = 2;
        sArray[5] = 3;
        sArray[6] = 1;
        sArray[7] = 1;
        sArray[8] = 1;
        sArray[9] = 1;
        sArray[10] = 1;
        sArray[11] = 5;
        sArray[12] = 5;
        sArray[13] = 5;
        sArray[14] = 5;
        sArray[15] = 1;
        sArray[16] = 4;
        sArray[17] = 4;
        sArray[18] = 1;
        sArray[20] = 1;
        sArray[21] = 3;
        sArray[22] = 3;
        sArray[23] = 2;
        sArray[24] = 20;
        sArray[25] = 5;
        sArray[26] = 128;
        sArray[27] = 128;
        sArray[28] = 5;
        sArray[29] = 73;
        sArray[30] = 1;
        sArray[31] = 5;
        sArray[32] = 2;
        sArray[33] = 3;
        sArray[34] = 3;
        sArray[35] = 3;
        sArray[36] = 3;
        sArray[37] = 3;
        sArray[38] = 3;
        sArray[39] = 3;
        sArray[40] = 3;
        sArray[41] = 2;
        sArray[42] = 3;
        sArray[44] = 1;
        sArray[45] = 2;
        sArray[46] = 3;
        sArray[47] = 4;
        sArray[48] = 5;
        sArray[50] = 1;
        sArray[51] = 1;
        sArray[52] = 1;
        sArray[53] = 1;
        sArray[54] = 1;
        id_private = sArray;
    }

    private static void id_native() {
        float[] fArray = new float[12];
        fArray[4] = 1.0f;
        fArray[5] = 1.0f;
        fArray[6] = 1.0f;
        fArray[7] = 1.0f;
        fArray[9] = 16.0f;
        id_throws = fArray;
    }
}

