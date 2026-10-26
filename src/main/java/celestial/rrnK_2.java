/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.tuple.Pair
 */
package celestial;

import celestial.PJ;
import celestial.PX;
import celestial.Y;
import celestial.an_3;
import celestial.cb_3;
import celestial.iB_2;
import celestial.module.combat.AttackAura;
import celestial.q_1;
import celestial.rfU_2;
import celestial.rfl_3;
import celestial.rhj_3;
import celestial.rjU_2;
import celestial.rmD_2;
import celestial.rrTA;
import celestial.rrTC;
import celestial.rrTF;
import celestial.rrTH;
import celestial.rrTI;
import celestial.rrTR;
import celestial.rrTT;
import celestial.rrTf_1;
import celestial.rrTj_1;
import celestial.rrTn_1;
import celestial.rrTq_1;
import celestial.rrnD_2;
import celestial.xc_3;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.apache.commons.lang3.tuple.Pair;

public abstract class rrnK_2
extends rrTF<AttackAura> {
    private static boolean[] id_byte;
    private static byte[] id_protected;
    public static Object[] id_class;
    public Object[] id_break;
    private static float[] id_case;
    private static short[] id_catch;
    private static double[] id_private;

    public abstract float id_byte();

    public abstract float id_int();

    public rrnK_2(AttackAura attackAura, rrTT rrTT2) {
        super(attackAura);
        this.id_goto();
        rrTT rrTT3 = rrTT2;
        this.id_break[rrnK_2.id_catch[0]] = rrTT3;
    }

    static {
        rrnK_2.ntfClinit();
    }

    private static void id_this() {
        double[] dArray = new double[10];
        dArray[0] = 180.0;
        dArray[1] = Math.PI;
        dArray[2] = 90.0;
        dArray[3] = 180.0;
        dArray[4] = Math.PI;
        dArray[5] = Double.MAX_VALUE;
        dArray[6] = 8.0;
        dArray[7] = 12.0;
        id_private = dArray;
    }

    public void id_class(boolean bl) {
        this.id_goto();
        Boolean bl2 = bl;
        this.id_break[rrnK_2.id_catch[18]] = bl2;
    }

    public void id_class(AttackAura attackAura, iB_2 iB_22, rrnD_2 rrnD_22) {
        if (iB_22 == null || !rmD_2.id_break || !attackAura.id_float()) {
            return;
        }
        if (rrnD_22.id_case() && rrnD_22.id_class(attackAura, id_case[0], id_protected[0], id_byte[0], id_byte[1], id_byte[2])) {
            ((cb_3)rrnK_2.id_import.id_class[id_catch[11]]).c_(id_byte[3]);
            Integer n = id_byte[4];
            rrnD_22.id_break[rrnK_2.id_catch[12]] = n;
        }
    }

    public List<rrTA> id_class(an_3 an_32, rfl_3 rfl_32) {
        Object object;
        rrTR rrTR2;
        ArrayList<rrTA> arrayList = new ArrayList<rrTA>();
        rjU_2 rjU_22 = ((cb_3)rrnK_2.id_import.id_class[id_catch[15]]).id_new(id_case[2]);
        float f = id_case[3];
        float f2 = id_case[4];
        float f3 = id_case[5];
        double d = rfl_32.id_class + (double)f;
        double d2 = rfl_32.id_protected - (double)f;
        double d3 = rfl_32.id_byte + (double)f;
        double d4 = rfl_32.id_case - (double)f;
        double d5 = d2 - d;
        double d6 = d5 / id_private[6];
        double d7 = (rfl_32.id_throws - rfl_32.id_break) / id_private[7];
        float f4 = ((AttackAura)this.id_continue()).id_try();
        for (double d8 = rfl_32.id_break; d8 < rfl_32.id_throws; d8 += d7) {
            if (d8 < an_32.re() + (double)f3 || d8 > rfl_32.id_throws - (double)f2) continue;
            for (double d9 = id_private[8]; d9 < d5; d9 += d6) {
                rrTA rrTA3 = new rrTn_1(new rjU_2(d, d8, d3 + d9));
                arrayList.add(rrTA3);
                rrTR2 = new rrTn_1(new rjU_2(d2, d8, d3 + d9));
                arrayList.add((rrTA)rrTR2);
                object = new rrTn_1(new rjU_2(d + d9, d8, d3));
                arrayList.add((rrTA)object);
                rrTn_1 rrTn_12 = new rrTn_1(new rjU_2(d + d9, d8, d4));
                arrayList.add(rrTn_12);
            }
            rrTn_1 rrTn_13 = new rrTn_1(new rjU_2(d2, d8, d4));
            arrayList.add(rrTn_13);
        }
        ArrayList<rrTA> arrayList2 = new ArrayList<rrTA>();
        boolean bl = this.id_native();
        boolean bl2 = !bl || arrayList.stream().anyMatch(rrTA2 -> rrTA2.id_class(rjU_22, an_32, (xc_3 xc_32) -> !this.id_class((xc_3)xc_32) ? id_byte[13] : id_byte[14])) ? id_byte[8] : id_byte[9];
        for (rrTA rrTA3 : arrayList) {
            rrTR2 = rrTA3.rr();
            if (bl && !rrTA3.id_class(rjU_22, an_32, (xc_3 xc_32) -> !this.id_class((xc_3)xc_32) ? id_byte[11] : id_byte[12]) && bl2 || (object = rhj_3.id_class((cb_3)rrnK_2.id_import.id_class[id_catch[16]], an_32, rjU_22, rrTR2, f4)) == null) continue;
            arrayList2.add(rrTA3);
        }
        if (arrayList2.isEmpty()) {
            return arrayList;
        }
        return arrayList2;
    }

    public void id_class(iB_2 iB_22) {
        this.id_goto();
        ((AttackAura)this.id_continue()).id_long().id_class(iB_22, (rrTT)this.id_break[id_catch[3]]);
    }

    public void id_class(q_1 q_12) {
        if (q_12.id_class() == (Y)((Object)Y.staticFields22c81230f53b33f2a682b4198db24cc4[id_catch[1]])) {
            AttackAura attackAura = (AttackAura)this.id_continue();
            this.id_class(attackAura, attackAura.id_continue(), attackAura.id_long());
        }
    }

    public boolean id_class(xc_3 xc_32) {
        return id_byte[5];
    }

    public void id_class(rrTj_1 rrTj_12, rrTI rrTI2) {
        this.id_goto();
        if (((AttackAura)this.id_continue()).B()) {
            ((rrTT)this.id_break[id_catch[2]]).id_class(rrTj_12, rrTI2);
        }
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{80, -91, 77, 17, 77, -123, 126, -74}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public double id_class(rrTA rrTA2, List<rrTA> list, PX pX, PX pX2) {
        double d = id_private[9];
        d += PJ.id_break(pX.id_throws(), pX2.id_throws());
        return d += PJ.id_class(pX.id_protected(), pX2.id_protected());
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x54BADE2314BC347CL;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xF1221D98;
    }

    public float id_class(rjU_2 rjU_22, rjU_2 rjU_23) {
        double d = rjU_23.id_break - rjU_22.id_break;
        double d2 = rjU_23.id_protected - rjU_22.id_protected;
        return (float)(Math.atan2(d2, d) * id_private[0] / id_private[1] - id_private[2]);
    }

    public Pair<rrTA, rrTA> id_class(an_3 an_32, PX pX) {
        ((List)rrTT.id_break[id_catch[13]]).clear();
        List<rrTA> list = this.id_class(an_32, an_32.rN());
        ((List)rrTT.id_break[id_catch[14]]).addAll(list);
        rrTA rrTA2 = new rrTn_1(an_32.id_new(id_case[1]));
        PX pX2 = pX.id_byte();
        double d = id_private[5];
        for (rrTA rrTA3 : list) {
            PX pX3;
            double d2 = this.id_class(rrTA3, list, pX2, pX3 = PJ.id_class(rrTA3));
            if (!(d2 < d)) continue;
            d = d2;
            rrTA2 = rrTA3;
        }
        return Pair.of((Object)rrTA2, (Object)rrTA2);
    }

    public void id_class() {
        this.id_goto();
        ((rrTT)this.id_break[id_catch[9]]).id_final();
    }

    public boolean id_class(PX pX) {
        return id_byte[6];
    }

    public float id_break(rjU_2 rjU_22, rjU_2 rjU_23) {
        double d = rjU_23.id_break - rjU_22.id_break;
        double d2 = rjU_23.id_byte - rjU_22.id_byte;
        double d3 = rjU_23.id_protected - rjU_22.id_protected;
        return (float)(-Math.atan2(d2, Math.sqrt(d * d + d3 * d3)) * id_private[3] / id_private[4]);
    }

    public boolean id_break(PX pX) {
        return id_byte[7];
    }

    public boolean id_break() {
        this.id_goto();
        return (Boolean)this.id_break[id_catch[17]];
    }

    public void id_throws() {
    }

    private static /* synthetic */ void ntfClinit() {
        rrnK_2.id_synchronized();
        rrnK_2.id_while();
        rrnK_2.id_this();
        rrnK_2.id_return();
        rrnK_2.id_else();
        rrnK_2.id_public();
    }

    public rrTH id_finally() {
        return (f, f2, f3) -> {
            float f4 = rfU_2.id_catch(f2 - f);
            if (f4 > f3) {
                return f + f3;
            }
            if (f4 < -f3) {
                return f - f3;
            }
            return f2;
        };
    }

    public rrTI id_extends() {
        this.id_goto();
        return ((rrTT)this.id_break[id_catch[4]]).id_implements();
    }

    private void id_goto() {
        if (this.id_break == null) {
            this.id_break = new Object[2];
            this.id_break[1] = false;
        }
    }

    public rrTq_1 id_case() {
        return null;
    }

    private static void id_else() {
        id_protected = new byte[]{50, 2};
    }

    public rrTC id_implements() {
        this.id_goto();
        return ((rrTT)this.id_break[id_catch[10]]).id_protected();
    }

    public PX id_new() {
        this.id_goto();
        return new PX(((rrTT)this.id_break[id_catch[6]]).id_private(), ((rrTT)this.id_break[id_catch[7]]).id_super());
    }

    public rrTH id_package() {
        return this.id_finally();
    }

    private static void id_return() {
        float[] fArray = new float[6];
        fArray[0] = 2.0f;
        fArray[1] = 1.0f;
        fArray[2] = 1.0f;
        fArray[3] = 0.08f;
        id_case = fArray;
    }

    private static void id_while() {
        short[] sArray = new short[19];
        sArray[11] = 57;
        sArray[12] = 6;
        sArray[13] = 1;
        sArray[14] = 1;
        sArray[15] = 57;
        sArray[16] = 57;
        sArray[17] = 1;
        sArray[18] = 1;
        id_catch = sArray;
    }

    private static void id_public() {
        Object[] objectArray = new Object[]{new Random()};
        id_class = objectArray;
    }

    public abstract rrTf_1 id_protected();

    public PX id_private() {
        this.id_goto();
        return ((rrTT)this.id_break[id_catch[5]]).id_byte();
    }

    public rrTj_1 id_final() {
        return null;
    }

    public void id_volatile() {
        this.id_goto();
        ((rrTT)this.id_break[id_catch[8]]).id_finally();
    }

    private static void id_synchronized() {
        boolean[] blArray = new boolean[19];
        blArray[2] = true;
        blArray[4] = true;
        blArray[6] = true;
        blArray[7] = true;
        blArray[8] = true;
        blArray[10] = true;
        blArray[11] = true;
        blArray[13] = true;
        blArray[16] = true;
        blArray[18] = true;
        id_byte = blArray;
    }

    public boolean id_native() {
        return id_byte[10];
    }

    @Override
    public boolean aK_() {
        this.id_class();
        return super.aK_();
    }
}

