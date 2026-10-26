/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.C_throws;
import celestial.Fc_1;
import celestial.Pj_1;
import celestial.event.EventTarget;
import celestial.module.util.FtHelper;
import celestial.rJY;
import celestial.rJr_1;
import celestial.rVi_1;
import celestial.rgF_2;
import celestial.rgN_2;
import celestial.rgP_2;
import celestial.rql_3;
import celestial.rrAT;
import celestial.rrAZ;
import celestial.rrFo_1;
import celestial.rrLU;
import celestial.rrNa_1;
import celestial.rrNt_1;
import celestial.rrTF;
import celestial.vm_3;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.List;
import java.util.function.Predicate;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrpL_2
extends rrTF<FtHelper> {
    private static boolean[] id_break;
    public Object[] id_class;
    private static String[] id_byte;
    private static byte[] id_protected;
    private static long[] id_case;
    private static short[] id_catch;

    private boolean id_byte() {
        this.id_class();
        if ((rgP_2)this.id_class[id_catch[10]] == null) {
            return id_break[4];
        }
        return ((Pattern)Pj_1.id_break[id_catch[11]]).matcher(((rgP_2)this.id_class[id_catch[12]]).id_byte()).find();
    }

    public rrpL_2(FtHelper ftHelper) {
        super(ftHelper);
        this.id_class();
    }

    static {
        rrpL_2.ntfClinit();
    }

    @EventTarget
    public void id_class(rrAZ rrAZ2) {
        Fc_1 fc_1;
        block5: {
            block4: {
                vm_3 vm_32 = rrAZ2.id_class();
                if (!(vm_32 instanceof Fc_1)) break block4;
                fc_1 = (Fc_1)vm_32;
                if (this.id_byte()) break block5;
            }
            return;
        }
        if (((FtHelper)this.id_continue()).id_continue()) {
            this.id_class(fc_1);
        }
    }

    @EventTarget
    public void id_class(rrLU rrLU2) {
        this.id_class();
        vm_3 vm_32 = rrLU2.id_class();
        rgP_2 rgP_22 = vm_32 == null ? null : vm_32.id_new();
        this.id_class[rrpL_2.id_catch[2]] = rgP_22;
        Integer n = id_break[0];
        this.id_class[rrpL_2.id_catch[3]] = n;
    }

    private void id_class(Fc_1 fc_1) {
        String string;
        this.id_class();
        if ((rgP_2)this.id_class[id_catch[6]] == null) {
            return;
        }
        rVi_1 rVi_12 = ((rgP_2)this.id_class[id_catch[7]]).id_case();
        if ((Integer)this.id_class[id_catch[8]] > 0) {
            rVi_12.id_break(id_byte[0]).id_class(new rgN_2(this.id_finally()).id_break(rgF_2.RED));
        }
        if ((string = this.id_break()) != null) {
            rVi_12.id_break(id_byte[1]).id_class(new rgN_2(string).id_break(rgF_2.YELLOW));
        }
        fc_1.id_class(rVi_12);
    }

    @EventTarget
    public void id_class(rrFo_1 rrFo_12) {
        this.id_class();
        Object var6_2 = null;
        this.id_class[rrpL_2.id_catch[4]] = var6_2;
        Integer n = id_break[1];
        this.id_class[rrpL_2.id_catch[5]] = n;
    }

    private int id_class(List<rJY> list) {
        int n = id_break[5];
        for (rJY rJY2 : list) {
            rrNt_1 rrNt_12;
            if (!rJY2.id_break() || (rrNt_12 = ((rrNa_1)rrNa_1.staticFields477bc35efba33c1cba244cd88c6fd655[id_catch[13]]).id_break(rJY2)) == null || rrNt_12.id_case() == id_protected[2]) continue;
            n += rrNt_12.id_case();
        }
        return n;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x7CA40C72316FAFACL;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x64A0C63B;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{26, 93, -120, 96, -25, -8, 67, 47}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private void id_class() {
        if (this.id_class == null) {
            this.id_class = new Object[2];
            this.id_class[1] = 0;
        }
    }

    @EventTarget
    public void id_class(rrAT rrAT2) {
        Fc_1 fc_1;
        Object object;
        block3: {
            block2: {
                this.id_class();
                object = (vm_3)rrpL_2.id_import.id_class[id_catch[0]];
                if (!(object instanceof Fc_1)) break block2;
                fc_1 = (Fc_1)object;
                if (this.id_byte()) break block3;
            }
            return;
        }
        object = rrAT2.id_class();
        List<rJY> list = ((rJr_1)object).id_class((Predicate<rJY>)null);
        Integer n = this.id_class(list);
        this.id_class[rrpL_2.id_catch[1]] = n;
        this.id_class(fc_1);
    }

    private String id_break() {
        if (!((FtHelper)this.id_continue()).id_continue()) {
            return null;
        }
        Pj_1 pj_1 = C_throws.id_byte().id_package();
        if (pj_1.id_byte()) {
            return null;
        }
        long l = System.currentTimeMillis() - pj_1.id_break();
        long l2 = Math.max(id_case[0], pj_1.id_class() - l - id_case[1]);
        long l3 = (l2 + id_case[2]) / id_case[3];
        long l4 = l3 / id_case[4];
        long l5 = l3 % id_case[5];
        Object[] objectArray = new Object[id_protected[1]];
        objectArray[rrpL_2.id_break[2]] = l4;
        objectArray[rrpL_2.id_break[3]] = l5;
        return String.format(id_byte[2], objectArray);
    }

    private static void id_throws() {
        id_protected = new byte[]{44, 2, -1, 2};
    }

    private static /* synthetic */ void ntfClinit() {
        rrpL_2.id_private();
        rrpL_2.id_protected();
        rrpL_2.id_case();
        rrpL_2.id_implements();
        rrpL_2.id_throws();
    }

    private String id_finally() {
        this.id_class();
        return "[$" + rql_3.id_class((Integer)this.id_class[id_catch[9]], (char)id_protected[0]) + "]";
    }

    private static void id_case() {
        long[] lArray = new long[6];
        lArray[1] = 1000L;
        lArray[2] = 999L;
        lArray[3] = 1000L;
        lArray[4] = 60L;
        lArray[5] = 60L;
        id_case = lArray;
    }

    private static void id_implements() {
        short[] sArray = new short[14];
        sArray[0] = 73;
        sArray[1] = 1;
        sArray[3] = 1;
        sArray[5] = 1;
        sArray[8] = 1;
        sArray[9] = 1;
        id_catch = sArray;
    }

    private static void id_protected() {
        id_byte = new String[]{new String(" "), new String(" "), new String("[\u27f2 %d:%02d]")};
    }

    private static void id_private() {
        boolean[] blArray = new boolean[8];
        blArray[3] = true;
        blArray[6] = true;
        id_break = blArray;
    }
}

