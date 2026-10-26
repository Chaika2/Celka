/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Qw_1;
import celestial.rrIF;
import celestial.rrLS;
import celestial.rrQX;
import celestial.rrfk_3;
import celestial.rrvZ;
import celestial.ui.clickgui.ClickGuiTheme;
import celestial.util.MinecraftAccessor;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrLB
implements MinecraftAccessor {
    private static boolean[] id_byte;
    private static short[] id_protected;
    private static byte[] id_throws;
    public Object[] id_class;
    public static Object[] id_break;

    public boolean id_byte() {
        return (Boolean)this.id_class[id_protected[16]];
    }

    public rrLB() {
        this.id_private();
    }

    static {
        rrLB.ntfClinit();
    }

    public static rrLB id_class(rrLS rrLS2, int n, boolean bl) {
        rrLS rrLS3 = rrLS2;
        ((rrLB)rrLB.id_break[rrLB.id_protected[0]]).id_class[rrLB.id_protected[1]] = rrLS3;
        Integer n2 = n;
        ((rrLB)rrLB.id_break[rrLB.id_protected[2]]).id_class[rrLB.id_protected[3]] = n2;
        Boolean bl2 = bl;
        ((rrLB)rrLB.id_break[rrLB.id_protected[4]]).id_class[rrLB.id_protected[5]] = bl2;
        return (rrLB)id_break[id_protected[6]];
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{110, -92, 68, -87, 47, -93, -31, -119}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xB2F73DE8;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x61098CC7D79E816CL;
    }

    public rrLS id_class() {
        return (rrLS)((Object)this.id_class[id_protected[14]]);
    }

    public static void id_break(rrLS rrLS2, int n, boolean bl) {
        rrLB rrLB2 = rrLB.id_class(rrLS2, n, bl);
        ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_protected[7]]).id_finally().id_class(rrLB2);
        if (rrLB2.id_byte()) {
            return;
        }
        if (n == ((rrIF)ClickGuiTheme.id_class[id_protected[8]]).id_finally().id_byte()) {
            ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_protected[9]]).id_byte().id_int();
        } else if (n == ((Qw_1)rrLB.id_import.id_class[rrLB.id_protected[10]]).T.id_int().id_break()) {
            id_import.id_break((rrfk_3)rrfk_3.id_throws[id_protected[11]]);
        }
        ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_protected[12]]).id_private().id_class(n);
        ((rrvZ)rrvZ.staticFieldse90af7ec3c763bb3bd1d99a27ea561d9[id_protected[13]]).id_class(n);
    }

    public int id_break() {
        return (Integer)this.id_class[id_protected[15]];
    }

    private static void id_throws() {
        Object[] objectArray = new Object[]{new rrLB()};
        id_break = objectArray;
    }

    private static /* synthetic */ void ntfClinit() {
        rrLB.id_catch();
        rrLB.id_case();
        rrLB.id_protected();
        rrLB.id_throws();
    }

    private static void id_catch() {
        boolean[] blArray = new boolean[5];
        blArray[1] = true;
        blArray[4] = true;
        id_byte = blArray;
    }

    private static void id_case() {
        short[] sArray = new short[17];
        sArray[3] = 1;
        sArray[5] = 2;
        sArray[10] = 20;
        sArray[15] = 1;
        sArray[16] = 2;
        id_protected = sArray;
    }

    private static void id_protected() {
        id_throws = new byte[]{3, 2};
    }

    private void id_private() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_throws[0]];
            objectArray[rrLB.id_byte[1]] = id_byte[2];
            objectArray[rrLB.id_throws[1]] = id_byte[3];
        }
    }
}

