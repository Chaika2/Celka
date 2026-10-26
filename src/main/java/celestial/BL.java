/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.A;
import celestial.C_class;
import celestial.C_else;
import celestial.C_this;
import celestial.C_throw;
import celestial.C_while;
import celestial.PP;
import celestial.Ps_1;
import celestial.Pv_1;
import celestial.bw_3;
import celestial.n_1;
import celestial.rCp_1;
import celestial.rU_2;
import celestial.rVe_1;
import celestial.rVi_1;
import celestial.rgF_2;
import celestial.rgH_2;
import celestial.rgN_2;
import celestial.rgl_3;
import celestial.rgp_3;
import celestial.rgy_3;
import celestial.xb_3;
import celestial.xc_3;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class BL
extends Pv_1 {
    private static boolean[] id_break;
    private static byte[] id_byte;
    private static String[] id_protected;
    private static short[] id_throws;

    private static void id_byte() {
        short[] sArray = new short[11];
        sArray[1] = 1;
        sArray[2] = 1;
        sArray[4] = 2;
        sArray[6] = 2;
        sArray[8] = 1;
        sArray[9] = 1;
        id_throws = sArray;
    }

    public BL(C_class c_class) {
        super(c_class);
    }

    static {
        BL.ntfClinit();
    }

    private static void id_class() {
        boolean[] blArray = new boolean[4];
        blArray[1] = true;
        blArray[2] = true;
        id_break = blArray;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x7F1593FB;
    }

    @Override
    public void id_class(A a) {
        rU_2 rU_22;
        xc_3 xc_32;
        if (!((Boolean)C_class.id_instanceof().Pd.id_class[id_throws[0]]).booleanValue()) {
            return;
        }
        if (a.id_class() == (n_1)((Object)n_1.staticFieldse7df95b1dfb038edb75e6ac1f750d600[id_throws[1]]) && (xc_32 = bw_3.id_class((Ps_1)this.id_class[id_throws[2]], rU_22 = rU_2.id_class(a.id_break()))).id_break() instanceof xb_3) {
            if (xc_32.id_byte(xb_3.id_volatile) == rCp_1.FOOT) {
                rU_22 = rU_22.id_class(xc_32.id_byte(xb_3.p));
            }
            Set<C_this> set = ((C_class)this.id_class[id_throws[3]]).id_strictfp().id_byte().id_class().id_break((C_else)((Object)C_else.staticFieldsbc7116b836d43454b9c0677570bd159e[id_throws[4]]));
            boolean bl = set.stream().map(C_this::id_class).filter(rU_22::equals).findFirst().isPresent();
            if (!bl) {
                ((C_class)this.id_class[id_throws[5]]).id_strictfp().id_byte().id_class().id_class(new C_while(id_protected[0], (C_else)((Object)C_else.staticFieldsbc7116b836d43454b9c0677570bd159e[id_throws[6]]), rU_22));
            }
        }
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x7FDB5CAC6CE23081L;
    }

    public static String id_break(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-70, 56, -85, -102, 17, 106, -114, 77}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static void id_break() {
        id_protected = new String[]{new String("bed"), new String("death"), new String("Death position saved."), new String("Click to goto death"), new String("%s%s goto %s @ %d"), new String("wp")};
    }

    private static /* synthetic */ void ntfClinit() {
        BL.id_class();
        BL.id_break();
        BL.id_byte();
        BL.id_protected();
    }

    private static void id_protected() {
        id_byte = new byte[]{4, 2, 3};
    }

    @Override
    public void id_volatile() {
        if (!((Boolean)C_class.id_instanceof().y.id_class[id_throws[7]]).booleanValue()) {
            return;
        }
        C_while c_while = new C_while(id_protected[1], (C_else)((Object)C_else.staticFieldsbc7116b836d43454b9c0677570bd159e[id_throws[8]]), ((Ps_1)this.id_class[id_throws[9]]).id_volatile());
        ((C_class)this.id_class[id_throws[10]]).id_strictfp().id_byte().id_class().id_class(c_while);
        rVe_1 rVe_12 = new rVe_1(id_protected[2]);
        Object[] objectArray = new Object[id_byte[0]];
        objectArray[BL.id_break[0]] = C_throw.id_class;
        objectArray[BL.id_break[1]] = id_protected[5];
        objectArray[BL.id_byte[1]] = c_while.id_break().id_class();
        objectArray[BL.id_byte[2]] = c_while.id_protected();
        rVe_12.id_class(rVe_12.id_class().id_class(rgF_2.WHITE).id_class(new rgy_3(rgp_3.id_class, new rgN_2(id_protected[3]))).id_class(new rgl_3(rgH_2.RUN_COMMAND, String.format(id_protected[4], objectArray))));
        rVi_1[] rVi_1Array = new rVi_1[id_break[2]];
        rVi_1Array[BL.id_break[3]] = rVe_12;
        PP.a_.id_class(rVi_1Array);
    }
}

