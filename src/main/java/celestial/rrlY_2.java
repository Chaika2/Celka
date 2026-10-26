/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Ax_1;
import celestial.Fc_1;
import celestial.Y;
import celestial.cb_3;
import celestial.event.EventTarget;
import celestial.module.player.ChestStealer;
import celestial.q_1;
import celestial.rJY;
import celestial.rJr_1;
import celestial.rXa_1;
import celestial.rXe_1;
import celestial.rhz_3;
import celestial.rrIm_1;
import celestial.rrNh_1;
import celestial.rrTF;
import celestial.rrfw_3;
import celestial.vm_3;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrlY_2
extends rrTF<ChestStealer> {
    private static boolean[] id_break;
    private static byte[] id_byte;
    public Object[] id_class;
    private static float[] id_protected;
    private static short[] id_case;
    private static String[] id_catch;

    private static void id_byte() {
        short[] sArray = new short[14];
        sArray[1] = 1;
        sArray[4] = 73;
        sArray[6] = 57;
        sArray[7] = 1;
        sArray[9] = 1;
        sArray[10] = 55;
        sArray[11] = 57;
        sArray[12] = 4;
        sArray[13] = 1;
        id_case = sArray;
    }

    public rrlY_2(ChestStealer chestStealer) {
        super(chestStealer);
        this.id_throws();
        rrIm_1 rrIm_12 = (rrIm_1)new rrIm_1(id_catch[0], Float.valueOf(id_protected[0]), Float.valueOf(id_protected[1]), Float.valueOf(id_protected[2]), Float.valueOf(id_protected[3])).id_class(() -> ((ChestStealer)this.id_continue()).id_new() == this ? id_break[4] : id_break[5]);
        this.id_class[rrlY_2.id_case[0]] = rrIm_12;
        rrfw_3 rrfw_32 = new rrfw_3();
        this.id_class[rrlY_2.id_case[1]] = rrfw_32;
        chestStealer.id_class((rrIm_1)this.id_class[id_case[2]]);
    }

    static {
        rrlY_2.ntfClinit();
    }

    private boolean id_class(rJY rJY2) {
        if (!rJY2.id_break()) {
            return id_break[2];
        }
        return id_break[3];
    }

    @EventTarget
    public void id_class(q_1 q_12) {
        Object object;
        this.id_throws();
        if (q_12.id_class() == (Y)((Object)Y.staticFields22c81230f53b33f2a682b4198db24cc4[id_case[3]]) && (object = (vm_3)rrlY_2.id_import.id_class[id_case[4]]) instanceof Fc_1) {
            Fc_1 fc_1 = (Fc_1)object;
            object = ((rrNh_1)((Object)rrNh_1.staticFieldsfb3637209df43f25b1ac5845136e2aa5[id_case[5]])).id_throws().id_switch();
            if (object != null) {
                return;
            }
            int n = ((rhz_3)((cb_3)rrlY_2.id_import.id_class[rrlY_2.id_case[6]]).id_implements[id_case[7]]).id_throws();
            if (n == id_byte[0]) {
                return;
            }
            List list = ((rXe_1)fc_1.G_()).id_class((Predicate<rJY>)null).stream().filter(this::id_class).collect(Collectors.toList());
            Collections.shuffle(list);
            float f = ((Float)((rrIm_1)this.id_class[id_case[8]]).id_byte()).floatValue();
            for (rJY rJY2 : list) {
                if (!((rrfw_3)this.id_class[id_case[9]]).id_class(f)) continue;
                ((Ax_1)rrlY_2.id_import.id_class[id_case[10]]).id_break(((rJr_1)((cb_3)rrlY_2.id_import.id_class[rrlY_2.id_case[11]]).id_implements[rrlY_2.id_case[12]]).id_case, rJY2.id_protected, id_break[0], rXa_1.QUICK_MOVE, id_break[1]);
                ((rrfw_3)this.id_class[id_case[13]]).id_class();
            }
        }
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-124, 1, 100, 30, -34, 8, -11, -31}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x82BCDEF1D6F5789BL;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xE7D99CFC;
    }

    private static void id_break() {
        id_catch = new String[]{new String("\u0417\u0430\u0434\u0435\u0440\u0436\u043a\u0430")};
    }

    private void id_throws() {
        if (this.id_class == null) {
            this.id_class = new Object[2];
        }
    }

    private static /* synthetic */ void ntfClinit() {
        rrlY_2.id_protected();
        rrlY_2.id_break();
        rrlY_2.id_case();
        rrlY_2.id_byte();
        rrlY_2.id_private();
    }

    private static void id_case() {
        id_protected = new float[]{10.0f, 10.0f, 500.0f, 10.0f};
    }

    private static void id_protected() {
        boolean[] blArray = new boolean[6];
        blArray[1] = true;
        blArray[3] = true;
        blArray[4] = true;
        id_break = blArray;
    }

    private static void id_private() {
        id_byte = new byte[]{-1, 2};
    }
}

