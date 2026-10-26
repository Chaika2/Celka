/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Av_1;
import celestial.LF;
import celestial.Lu_1;
import celestial.Ml_1;
import celestial.Qj_1;
import celestial.Qw_1;
import celestial.cN_2;
import celestial.rVi_1;
import celestial.rgN_2;
import celestial.rgP_2;
import celestial.rgZ_2;
import celestial.rgn_3;
import celestial.rhQ_2;
import celestial.rqO_2;
import celestial.rrQA;
import celestial.rrQF;
import celestial.rrQL;
import celestial.rrQQ;
import celestial.rrQT;
import celestial.rrQV;
import celestial.rrQd_1;
import celestial.rrQk_1;
import celestial.rrQl_1;
import celestial.rrQn_1;
import celestial.rrQx_1;
import celestial.rruv_1;
import celestial.rrwp_3;
import celestial.rrwq_3;
import celestial.vm_3;
import com.mojang.blaze3d.systems.RenderSystem;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrQC
extends vm_3 {
    private static short[] id_case;
    private static double[] id_catch;
    private static int[] id_private;
    public Object[] id_class;
    private static byte[] id_implements;
    private static String[] id_finally;
    private static float[] id_else;
    public static Object[] id_throws;
    private static boolean[] id_synchronized;

    private void id_char() {
        this.id_short();
        rrQn_1 rrQn_12 = (rrQn_1)((rrQA)this.id_class[id_case[39]]).id_finally();
        if (rrQn_12 != null) {
            ((rrQk_1)rrQk_1.staticFields9c4062aebf3b3e0dbb68c82ac08880ac[id_case[40]]).id_class(rrQn_12.id_private());
        }
    }

    public void id_byte(boolean bl) {
        this.id_short();
        ((LF)this.id_class[rrQC.id_case[37]]).id_int = bl;
        ((LF)this.id_class[rrQC.id_case[38]]).id_int = bl;
    }

    private static void id_int() {
        id_private = new int[]{0xFFFFFF};
    }

    private static void id_long() {
        boolean[] blArray = new boolean[25];
        blArray[2] = true;
        blArray[3] = true;
        blArray[4] = true;
        blArray[5] = true;
        blArray[6] = true;
        blArray[7] = true;
        blArray[9] = true;
        blArray[11] = true;
        blArray[13] = true;
        blArray[15] = true;
        blArray[16] = true;
        blArray[18] = true;
        blArray[21] = true;
        blArray[24] = true;
        id_synchronized = blArray;
    }

    private static void id_float() {
        id_else = new float[]{2.0f, 16.0f, 16.0f, 4.0f, 4.0f, 4.0f, 1.0f, 1.0f, 1.0f, 1.0f, 8.0f, 8.0f, 20.0f, 20.0f, 44.0f, 20.0f, 36.0f, 52.0f, 4.0f, 20.0f, 20.0f, 52.0f, 40.0f, 8.0f, 44.0f, 36.0f, 52.0f, 52.0f, 4.0f, 36.0f, 4.0f, 52.0f};
    }

    public rrQC(vm_3 vm_32) {
        super(new rgn_3(id_finally[0]));
        ArrayList arrayList;
        this.id_short();
        Av_1 av_1 = new Av_1();
        this.id_class[rrQC.id_case[0]] = av_1;
        vm_3 vm_33 = vm_32;
        this.id_class[rrQC.id_case[1]] = vm_33;
        this.id_class[rrQC.id_case[2]] = arrayList = new ArrayList();
    }

    static {
        rrQC.ntfClinit();
    }

    private static void id_interface() {
        id_finally = new String[]{new String("account.switcher.title"), new String(","), new String("[ \"]"), new String(""), new String("account.switcher.randomaccount"), new String("account.switcher.deleteallrandom"), new String("account.switcher.findaccount"), new String("..."), new String("account.switcher.add"), new String("account.switcher.delete"), new String("account.switcher.login"), new String("uuid_list.txt")};
    }

    @Override
    public boolean id_class(int n, int n2, int n3) {
        rrQn_1 rrQn_12;
        this.id_short();
        if (vm_3.id_case(n)) {
            boolean bl = id_synchronized[0];
            String[] stringArray = ((Qj_1)this.id_volatile.id_class[id_case[7]]).id_class().split(id_finally[1]);
            if (stringArray != null) {
                String[] stringArray2 = stringArray;
                int n4 = stringArray2.length;
                for (int i = id_synchronized[1]; i < n4; ++i) {
                    String string = stringArray2[i];
                    if (!((rrQk_1)rrQk_1.staticFields9c4062aebf3b3e0dbb68c82ac08880ac[id_case[8]]).id_class((rrQx_1)new rrQQ(string = string.replaceAll(id_finally[2], id_finally[3]), rrQV.id_class(string), (rrQd_1)((Object)rrQd_1.staticFields634ba5beb257384d8792f008140c7c0a[id_case[9]])), id_synchronized[2], id_synchronized[3])) continue;
                    this.id_native();
                    bl = id_synchronized[4];
                }
            }
            if (bl) {
                return id_synchronized[5];
            }
        } else if (vm_3.id_catch(n) && (rrQn_12 = (rrQn_1)((rrQA)this.id_class[id_case[10]]).id_finally()) != null) {
            ((Qj_1)this.id_volatile.id_class[id_case[11]]).id_class(rrQn_12.id_private().id_class());
            return id_synchronized[6];
        }
        return super.id_class(n, n2, n3) || ((rrQA)this.id_class[id_case[12]]).id_class(n, n2, n3) ? id_synchronized[7] : id_synchronized[8];
    }

    @Override
    public void id_class(Ml_1 ml_1, int n, int n2, float f) {
        this.id_short();
        this.id_class(ml_1);
        ((rrQA)this.id_class[id_case[3]]).id_class(ml_1, n, n2, f);
        ((Lu_1)this.id_class[id_case[4]]).id_class(ml_1, n, n2, f);
        for (rrQT rrQT2 : (List)this.id_class[id_case[5]]) {
            rrQT2.id_class(ml_1, n, n2, f);
        }
        rrQC.id_class(ml_1, this.id_super, (rgP_2)this.id_extends.id_case().id_break(" (" + id_import.id_while().id_byte() + ")"), this.id_package / id_implements[0], (int)id_implements[1], id_private[0]);
        ((rrQA)this.id_class[id_case[6]]).id_private().ifPresent(rrQn_12 -> {
            boolean bl = rrQn_12.id_class();
            rqO_2 rqO_22 = rrQn_12.id_break();
            ml_1.id_class();
            ml_1.id_class(id_else[3], id_else[4], id_else[5]);
            ml_1.id_class(id_catch[0], (double)this.id_int / id_catch[1] - id_catch[2] - id_catch[3], id_catch[4]);
            RenderSystem.color4f(id_else[6], id_else[7], id_else[8], id_else[9]);
            id_import.A().id_class(rqO_22);
            vm_3.id_class(ml_1, id_implements[27], id_synchronized[17], id_else[10], id_else[11], (int)id_implements[28], (int)id_implements[29], (int)id_implements[30], (int)id_implements[31]);
            vm_3.id_class(ml_1, id_implements[32], (int)id_implements[33], id_else[12], id_else[13], (int)id_implements[34], (int)id_implements[35], (int)id_implements[36], (int)id_implements[37]);
            vm_3.id_class(ml_1, bl ? id_synchronized[18] : id_synchronized[19], (int)id_implements[38], id_else[14], id_else[15], (int)(bl ? id_implements[39] : id_implements[40]), (int)id_implements[41], (int)id_implements[42], (int)id_implements[43]);
            vm_3.id_class(ml_1, id_implements[44], (int)id_implements[45], id_else[16], id_else[17], (int)(bl ? id_implements[46] : id_implements[47]), (int)id_implements[48], (int)id_implements[49], (int)id_implements[50]);
            vm_3.id_class(ml_1, id_implements[51], (int)id_implements[52], id_else[18], id_else[19], (int)id_implements[53], (int)id_implements[54], (int)id_implements[55], (int)id_implements[56]);
            vm_3.id_class(ml_1, id_implements[57], (int)id_implements[58], id_else[20], id_else[21], (int)id_implements[59], (int)id_implements[60], (int)id_implements[61], (int)id_implements[62]);
            if (((Qw_1)this.id_volatile.id_class[id_case[52]]).id_break(rhQ_2.HAT)) {
                vm_3.id_class(ml_1, id_implements[63], id_synchronized[20], id_else[22], id_else[23], (int)id_implements[64], (int)id_implements[65], (int)id_implements[66], (int)id_implements[67]);
            }
            if (((Qw_1)this.id_volatile.id_class[id_case[53]]).id_break(rhQ_2.RIGHT_SLEEVE)) {
                vm_3.id_class(ml_1, bl ? id_synchronized[21] : id_synchronized[22], (int)id_implements[68], id_else[24], id_else[25], (int)(bl ? id_implements[69] : id_implements[70]), (int)id_implements[71], (int)id_implements[72], (int)id_implements[73]);
            }
            if (((Qw_1)this.id_volatile.id_class[id_case[54]]).id_break(rhQ_2.LEFT_SLEEVE)) {
                vm_3.id_class(ml_1, id_implements[74], (int)id_implements[75], id_else[26], id_else[27], (int)(bl ? id_implements[76] : id_implements[77]), (int)id_implements[78], (int)id_implements[79], (int)id_implements[80]);
            }
            if (((Qw_1)this.id_volatile.id_class[id_case[55]]).id_break(rhQ_2.RIGHT_PANTS_LEG)) {
                vm_3.id_class(ml_1, id_implements[81], (int)id_implements[82], id_else[28], id_else[29], (int)id_implements[83], (int)id_implements[84], (int)id_implements[85], (int)id_implements[86]);
            }
            if (((Qw_1)this.id_volatile.id_class[id_case[56]]).id_break(rhQ_2.LEFT_PANTS_LEG)) {
                vm_3.id_class(ml_1, id_implements[87], (int)id_implements[88], id_else[30], id_else[31], (int)id_implements[89], (int)id_implements[90], (int)id_implements[91], (int)id_implements[92]);
            }
            ml_1.id_break();
        });
        super.id_class(ml_1, n, n2, f);
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-118, 58, -93, -89, 0, -14, 118, 47}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public void id_class(rrQx_1 rrQx_12) {
        ((rrQk_1)rrQk_1.staticFields9c4062aebf3b3e0dbb68c82ac08880ac[id_case[36]]).id_break(rrQx_12.id_class());
        this.id_native();
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xA8C978239D338CE7L;
    }

    private void id_short() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_implements[96]];
        }
    }

    private static void id_void() {
        Object[] objectArray = new Object[]{((rgZ_2)new rgn_3(id_finally[6])).id_class(new rgN_2("...")), new rgn_3(id_finally[8]), new rgn_3(id_finally[9]), new rgn_3(id_finally[10]), new rrQL(id_finally[11])};
        id_throws = objectArray;
    }

    private static int id_break(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x1A6EA217;
    }

    @Override
    public boolean id_break(double d, double d2, int n) {
        this.id_short();
        for (rrQT rrQT2 : (List)this.id_class[id_case[29]]) {
            if (!rrQT2.id_class(d, d2, n)) continue;
            return id_synchronized[13];
        }
        return super.id_break(d, d2, n);
    }

    private static /* synthetic */ void ntfClinit() {
        rrQC.id_long();
        rrQC.id_interface();
        rrQC.id_import();
        rrQC.id_float();
        rrQC.id_static();
        rrQC.id_package();
        rrQC.id_int();
        rrQC.id_void();
    }

    public void id_finally() {
        this.id_short();
        ((rrQA)this.id_class[id_case[35]]).id_private().ifPresent(rrQn_12 -> this.id_class(rrQn_12.id_private()));
    }

    private static void id_import() {
        short[] sArray = new short[57];
        sArray[0] = 3;
        sArray[2] = 2;
        sArray[3] = 1;
        sArray[4] = 4;
        sArray[5] = 2;
        sArray[6] = 1;
        sArray[7] = 23;
        sArray[10] = 1;
        sArray[11] = 23;
        sArray[12] = 1;
        sArray[13] = 23;
        sArray[15] = 2;
        sArray[16] = 200;
        sArray[17] = 4;
        sArray[20] = 4;
        sArray[21] = 1;
        sArray[22] = 4;
        sArray[23] = 150;
        sArray[24] = 3;
        sArray[25] = 5;
        sArray[26] = 2;
        sArray[27] = 6;
        sArray[28] = 1;
        sArray[29] = 2;
        sArray[30] = 23;
        sArray[31] = 1;
        sArray[32] = 1;
        sArray[34] = 4;
        sArray[35] = 1;
        sArray[37] = 6;
        sArray[38] = 5;
        sArray[39] = 1;
        sArray[41] = 1;
        sArray[42] = 4;
        sArray[43] = 3;
        sArray[45] = 1;
        sArray[46] = 4;
        sArray[48] = 1;
        sArray[50] = 1;
        sArray[51] = 4;
        sArray[52] = 20;
        sArray[53] = 20;
        sArray[54] = 20;
        sArray[55] = 20;
        sArray[56] = 20;
        id_case = sArray;
    }

    private static void id_package() {
        id_implements = new byte[]{2, 8, 2, 20, 2, 100, 22, 20, 16, 48, 64, 16, 2, 2, 4, 52, 20, 28, 20, 52, 20, 28, 20, 52, 20, 28, 20, 4, 8, 8, 64, 64, 4, 8, 8, 12, 64, 64, 8, 3, 4, 12, 64, 64, 12, 8, 3, 4, 12, 64, 64, 4, 20, 4, 12, 64, 64, 8, 20, 4, 12, 64, 64, 4, 8, 8, 64, 64, 8, 3, 4, 12, 64, 64, 12, 8, 3, 4, 12, 64, 64, 4, 20, 4, 12, 64, 64, 8, 20, 4, 12, 64, 64, 2, 3, 4, 7, 5};
    }

    private static void id_static() {
        double[] dArray = new double[5];
        dArray[0] = 1.0;
        dArray[1] = 8.0;
        dArray[2] = 16.0;
        dArray[3] = 4.0;
        id_catch = dArray;
    }

    @Override
    public void id_private() {
        this.id_short();
        super.id_private();
        ((Lu_1)this.id_class[id_case[34]]).id_catch();
    }

    private void id_abstract() {
        id_import.id_break(new rrQl_1(this, this));
    }

    public Av_1 id_final() {
        this.id_short();
        return (Av_1)this.id_class[id_case[43]];
    }

    public void id_native() {
        this.id_short();
        ((rrQA)this.id_class[id_case[41]]).id_class(((Lu_1)this.id_class[id_case[42]]).id_private());
    }

    @Override
    public void v_() {
        int n;
        this.id_short();
        super.v_();
        ((Qj_1)this.id_volatile.id_class[id_case[13]]).id_class(id_synchronized[9]);
        ArrayList<rrQT> arrayList = new ArrayList<rrQT>();
        for (rrwp_3 object : ((rrwq_3)((Object)rrwq_3.staticFieldsd739829cf0613d349fc0bda49435f7f4[id_case[14]])).id_class()) {
            arrayList.add(new rrQT(this, object));
        }
        for (n = id_synchronized[10]; n < arrayList.size(); ++n) {
            rrQT rrQT2 = (rrQT)arrayList.get(n);
            rrQT2.id_class(new rruv_1(id_implements[2] + n * id_implements[3], id_else[0], id_else[1], id_else[2]));
            ((List)this.id_class[id_case[15]]).add(rrQT2);
        }
        Lu_1 lu_1 = this.id_class(new Lu_1(this.id_super, this.id_package / id_implements[4] - id_implements[5], id_implements[6], id_case[16], id_implements[7], (Lu_1)this.id_class[id_case[17]], (rVi_1)id_throws[id_case[18]], id_synchronized[11]).id_class((rVi_1)id_throws[id_case[19]]).id_implements(id_implements[8]));
        this.id_class[rrQC.id_case[20]] = lu_1;
        rrQA rrQA2 = this.id_protected(new rrQA(this, this.id_volatile, this.id_package, this.id_int, id_implements[9], this.id_int - id_implements[10], id_implements[11]));
        this.id_class[rrQC.id_case[21]] = rrQA2;
        ((Lu_1)this.id_class[id_case[22]]).id_class((String string) -> {
            this.id_short();
            ((rrQA)this.id_class[id_case[50]]).id_class(((Lu_1)this.id_class[id_case[51]]).id_private());
        });
        n = id_case[23];
        int n2 = this.id_package / id_implements[12] - n - n / id_implements[13];
        byte by = id_implements[14];
        LF lF2 = this.id_class(new LF(n2, this.id_int - id_implements[15], n, id_implements[16], (rgn_3)id_throws[id_case[24]], lF -> this.id_char()));
        this.id_class[rrQC.id_case[25]] = lF2;
        LF lF3 = this.id_class(new LF(n2, this.id_int - id_implements[17], n, id_implements[18], (rgn_3)id_throws[id_case[26]], lF -> this.id_finally()));
        this.id_class[rrQC.id_case[27]] = lF3;
        int n3 = n2 + (n + by);
        this.id_class(new LF(n3, this.id_int - id_implements[19], n, id_implements[20], (rgn_3)id_throws[id_case[28]], lF -> this.id_abstract()));
        this.id_class(new LF(n3, this.id_int - id_implements[21], n, id_implements[22], cN_2.id_protected, lF -> {
            this.id_short();
            this.id_volatile.id_break((vm_3)this.id_class[id_case[49]]);
        }));
        int n4 = n3 + (n + by);
        this.id_class(new LF(n4, this.id_int - id_implements[23], n, id_implements[24], new rgn_3(id_finally[4]), lF -> {
            CompletableFuture<String> completableFuture = ((rrQF)id_throws[id_case[46]]).id_class();
            if (completableFuture == null) {
                return;
            }
            completableFuture.thenAccept(string -> {
                if (((rrQk_1)rrQk_1.staticFields9c4062aebf3b3e0dbb68c82ac08880ac[id_case[47]]).id_class((rrQx_1)new rrQQ((String)string, rrQV.id_class(string), (rrQd_1)((Object)((Object)((Object)((Object)rrQd_1.staticFields634ba5beb257384d8792f008140c7c0a[id_case[48]]))))), id_synchronized[15], id_synchronized[16])) {
                    this.id_native();
                }
            });
        }));
        this.id_class(new LF(n4, this.id_int - id_implements[25], n, id_implements[26], new rgn_3(id_finally[5]), lF -> {
            if (((rrQk_1)rrQk_1.staticFields9c4062aebf3b3e0dbb68c82ac08880ac[id_case[44]]).id_class((rrQd_1)((Object)((Object)((Object)rrQd_1.staticFields634ba5beb257384d8792f008140c7c0a[id_case[45]]))))) {
                this.id_native();
            }
        }));
        this.id_byte(id_synchronized[12]);
        this.id_native();
    }

    @Override
    public void w_() {
        this.id_short();
        super.w_();
        ((Qj_1)this.id_volatile.id_class[id_case[30]]).id_class(id_synchronized[14]);
        if ((rrQA)this.id_class[id_case[31]] != null) {
            ((rrQA)this.id_class[id_case[32]]).x_().forEach(rrQn_1::close);
        }
        for (rrQx_1 rrQx_12 : ((rrQk_1)rrQk_1.staticFields9c4062aebf3b3e0dbb68c82ac08880ac[id_case[33]]).id_class()) {
            if (!(rrQx_12 instanceof AutoCloseable)) continue;
            AutoCloseable autoCloseable = (AutoCloseable)((Object)rrQx_12);
            try {
                autoCloseable.close();
            }
            catch (Exception exception) {}
        }
    }
}

