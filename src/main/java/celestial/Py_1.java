/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Ax_1;
import celestial.C_class;
import celestial.FH;
import celestial.Fu_1;
import celestial.PP;
import celestial.Pv_1;
import celestial.Qw_1;
import celestial.Vu_1;
import celestial.cb_3;
import celestial.rJY;
import celestial.rJr_1;
import celestial.rXa_1;
import celestial.rdn_3;
import celestial.rhz_3;
import celestial.rrLY;
import celestial.rrLs_1;
import celestial.rrQX;
import celestial.rrfY_2;
import celestial.vm_3;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class Py_1
extends Pv_1
implements PP {
    private static byte[] id_break;
    private static short[] id_throws;
    private static boolean[] id_case;
    private static String[] id_catch;

    private static void id_byte() {
        boolean[] blArray = new boolean[10];
        blArray[0] = true;
        blArray[1] = true;
        blArray[2] = true;
        blArray[5] = true;
        blArray[6] = true;
        id_case = blArray;
    }

    public Py_1(C_class c_class) {
        super(c_class);
    }

    static {
        Py_1.ntfClinit();
    }

    @Override
    public void id_class(rrLs_1 rrLs_12) {
        if ((vm_3)Py_1.b_.id_class[id_throws[0]] != null && !((vm_3)Py_1.b_.id_class[id_throws[1]] instanceof Fu_1)) {
            return;
        }
        Vu_1 vu_1 = ((Qw_1)Py_1.b_.id_class[Py_1.id_throws[2]]).c;
        int n = rrLs_12.id_protected();
        int n2 = rrLs_12.id_class();
        if (n2 != id_case[0]) {
            return;
        }
        if (n != vu_1.id_int().id_break() || !Vu_1.id_class(vu_1)) {
            return;
        }
        Object object = (vm_3)Py_1.b_.id_class[id_throws[3]];
        if (object instanceof Fu_1) {
            Fu_1 fu_1 = (Fu_1)object;
            if ((object = fu_1.id_int()) == null) {
                return;
            }
            rdn_3 rdn_32 = ((rJY)object).id_class().id_implements();
            if (rdn_32.id_class()) {
                return;
            }
            Object t = fu_1.G_();
            for (rJY rJY2 : ((rJr_1)t).id_throws) {
                if (!this.id_class(rJY2.id_class(), rdn_32, rJY2.id_protected)) continue;
                ((Ax_1)Py_1.b_.id_class[id_throws[4]]).id_break(((rJr_1)t).id_case, rJY2.id_protected, id_case[1], rXa_1.THROW, id_case[2]);
            }
        } else {
            rdn_3 rdn_33 = ((cb_3)Py_1.b_.id_class[id_throws[5]]).ss().id_implements();
            if (rdn_33.id_class()) {
                return;
            }
            for (int i = id_case[3]; i < id_break[0]; ++i) {
                int n3 = rrfY_2.id_break(i);
                if (!this.id_class(((rhz_3)((cb_3)Py_1.b_.id_class[Py_1.id_throws[6]]).id_implements[id_throws[7]]).id_extends(i), rdn_33, n3)) continue;
                ((Ax_1)Py_1.b_.id_class[id_throws[8]]).id_break(id_case[4], n3, id_case[5], rXa_1.THROW, id_case[6]);
            }
            ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_throws[9]]).id_finally().id_class(rrLY.id_class());
        }
    }

    private boolean id_class(rdn_3 rdn_32, rdn_3 rdn_33, int n) {
        if ((vm_3)Py_1.b_.id_class[id_throws[10]] instanceof FH && n < id_break[1]) {
            return id_case[7];
        }
        if (rdn_32 == null || rdn_33 == null) {
            return id_case[8];
        }
        if (rdn_32.id_break() != rdn_33.id_break()) {
            return id_case[9];
        }
        return rdn_3.id_class(rdn_32, rdn_33, Set.of(id_catch[0], id_catch[1]));
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x95707C5A;
    }

    private static void id_class() {
        short[] sArray = new short[11];
        sArray[0] = 73;
        sArray[1] = 73;
        sArray[2] = 20;
        sArray[3] = 73;
        sArray[4] = 55;
        sArray[5] = 57;
        sArray[6] = 57;
        sArray[7] = 1;
        sArray[8] = 55;
        sArray[10] = 73;
        id_throws = sArray;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xC5BE277143E9CDC1L;
    }

    public static String id_break(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-59, 18, 16, 22, -72, 9, -45, -16}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static void id_break() {
        id_break = new byte[]{36, 9};
    }

    private static /* synthetic */ void ntfClinit() {
        Py_1.id_byte();
        Py_1.id_protected();
        Py_1.id_class();
        Py_1.id_break();
    }

    private static void id_protected() {
        id_catch = new String[]{new String("Damage"), new String("display")};
    }
}

