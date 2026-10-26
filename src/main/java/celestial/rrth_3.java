/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Ml_1;
import celestial.Qw_1;
import celestial.rrLr_1;
import celestial.rrQX;
import celestial.rrnE_2;
import celestial.rrtO_2;
import celestial.util.MinecraftAccessor;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrth_3
extends Enum<rrth_3>
implements MinecraftAccessor {
    private static String[] strings39e3fc1d50923a0b997a92f976964031;
    private static double[] doubles39e3fc1d50923a0b997a92f976964031;
    private static byte[] bytes39e3fc1d50923a0b997a92f976964031;
    public Object[] fields39e3fc1d50923a0b997a92f976964031;
    private static boolean[] booleans39e3fc1d50923a0b997a92f976964031;
    private static short[] shorts39e3fc1d50923a0b997a92f976964031;
    public static Object[] staticFields39e3fc1d50923a0b997a92f976964031;

    private static void id_byte() {
        doubles39e3fc1d50923a0b997a92f976964031 = new double[]{2.0};
    }

    private rrth_3() {
        CopyOnWriteArrayList copyOnWriteArrayList;
        this.id_throws();
        this.fields39e3fc1d50923a0b997a92f976964031[rrth_3.shorts39e3fc1d50923a0b997a92f976964031[1]] = copyOnWriteArrayList = new CopyOnWriteArrayList();
    }

    static {
        rrth_3.ntfClinit();
    }

    public static rrth_3[] values() {
        return (rrth_3[])((rrth_3[])staticFields39e3fc1d50923a0b997a92f976964031[shorts39e3fc1d50923a0b997a92f976964031[0]]).clone();
    }

    public static rrth_3 valueOf(String string) {
        return Enum.valueOf(rrth_3.class, string);
    }

    public void id_class(Ml_1 ml_1) {
        boolean bl;
        if (((List)this.fields39e3fc1d50923a0b997a92f976964031[shorts39e3fc1d50923a0b997a92f976964031[4]]).isEmpty()) {
            return;
        }
        boolean bl2 = bl = ((Qw_1)rrth_3.id_import.id_class[rrth_3.shorts39e3fc1d50923a0b997a92f976964031[5]]).rs != bytes39e3fc1d50923a0b997a92f976964031[0] ? booleans39e3fc1d50923a0b997a92f976964031[1] : booleans39e3fc1d50923a0b997a92f976964031[2];
        if (bl) {
            rrnE_2.id_class(doubles39e3fc1d50923a0b997a92f976964031[0]);
        }
        for (rrtO_2 rrtO_22 : (List)this.fields39e3fc1d50923a0b997a92f976964031[shorts39e3fc1d50923a0b997a92f976964031[6]]) {
            if (rrtO_22.id_byte()) {
                if (!((List)this.fields39e3fc1d50923a0b997a92f976964031[shorts39e3fc1d50923a0b997a92f976964031[7]]).remove(rrtO_22)) continue;
                rrtO_22.id_break();
                continue;
            }
            rrtO_22.id_class(ml_1, rrtO_22.id_extends(), rrtO_22.id_super(), rrtO_22.id_native(), rrtO_22.id_finally());
        }
        if (bl) {
            rrnE_2.id_class(id_const.id_return());
        }
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{97, -66, -84, 40, 5, 82, 32, -115}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public void id_class(rrtO_2 rrtO_22) {
        ((List)this.fields39e3fc1d50923a0b997a92f976964031[shorts39e3fc1d50923a0b997a92f976964031[2]]).add(booleans39e3fc1d50923a0b997a92f976964031[0], rrtO_22);
        ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[shorts39e3fc1d50923a0b997a92f976964031[3]]).id_finally().id_class(rrLr_1.id_class(rrtO_22));
    }

    public void id_class() {
        if (!((List)this.fields39e3fc1d50923a0b997a92f976964031[shorts39e3fc1d50923a0b997a92f976964031[8]]).isEmpty()) {
            ((List)this.fields39e3fc1d50923a0b997a92f976964031[shorts39e3fc1d50923a0b997a92f976964031[9]]).clear();
        }
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xECD8D184;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x96296240AB8A35E0L;
    }

    public List<rrtO_2> id_break() {
        return (List)this.fields39e3fc1d50923a0b997a92f976964031[shorts39e3fc1d50923a0b997a92f976964031[10]];
    }

    private void id_throws() {
        if (this.fields39e3fc1d50923a0b997a92f976964031 == null) {
            Object[] objectArray = this.fields39e3fc1d50923a0b997a92f976964031 = new Object[booleans39e3fc1d50923a0b997a92f976964031[8]];
        }
    }

    private static /* synthetic */ void ntfClinit() {
        rrth_3.id_implements();
        rrth_3.id_case();
        rrth_3.id_catch();
        rrth_3.id_byte();
        rrth_3.id_protected();
        rrth_3.id_finally();
    }

    private static void id_finally() {
        Object[] objectArray;
        objectArray = new Object[]{new rrth_3(), new rrth_3[]{(rrth_3)objectArray[0]}};
        staticFields39e3fc1d50923a0b997a92f976964031 = objectArray;
    }

    private static void id_catch() {
        short[] sArray = new short[12];
        sArray[0] = 1;
        sArray[5] = 20;
        shorts39e3fc1d50923a0b997a92f976964031 = sArray;
    }

    private static void id_case() {
        strings39e3fc1d50923a0b997a92f976964031 = new String[]{new String("INSTANCE")};
    }

    private static void id_implements() {
        boolean[] blArray = new boolean[9];
        blArray[1] = true;
        blArray[3] = true;
        blArray[7] = true;
        blArray[8] = true;
        booleans39e3fc1d50923a0b997a92f976964031 = blArray;
    }

    private static void id_protected() {
        bytes39e3fc1d50923a0b997a92f976964031 = new byte[]{2, 2};
    }

    private static /* synthetic */ rrth_3[] id_private() {
        rrth_3[] rrth_3Array = new rrth_3[booleans39e3fc1d50923a0b997a92f976964031[3]];
        rrth_3Array[rrth_3.booleans39e3fc1d50923a0b997a92f976964031[4]] = (rrth_3)staticFields39e3fc1d50923a0b997a92f976964031[shorts39e3fc1d50923a0b997a92f976964031[11]];
        return rrth_3Array;
    }
}

