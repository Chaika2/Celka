/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.BB;
import celestial.BP;
import celestial.BS;
import celestial.Bs_1;
import celestial.C_class;
import celestial.C_package;
import celestial.C_throws;
import celestial.C_volatile;
import celestial.PJ;
import celestial.PX;
import celestial.Ps_1;
import celestial.Pv_1;
import celestial.V;
import celestial.g_1;
import celestial.j_1;
import celestial.q_1;
import celestial.rZJ;
import celestial.rZO;
import celestial.rZX;
import celestial.rrAX;
import celestial.rrAz_1;
import celestial.rrTT;
import celestial.rrTj_1;
import celestial.rrTq_1;
import celestial.ruS_2;
import celestial.rz_3;
import celestial.t_1;
import celestial.y_1;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Optional;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class Br_1
extends Pv_1
implements C_volatile {
    private static float[] id_byte;
    private static short[] id_protected;
    private static boolean[] id_throws;
    public Object[] id_break;
    private static byte[] id_case;

    @Override
    public PX id_byte() {
        rrTj_1 rrTj_12 = this.id_break();
        if (rrTj_12 == null) {
            return null;
        }
        return (PX)((BS)rrTj_12).id_class[id_protected[4]];
    }

    public Br_1(C_class c_class) {
        super(c_class);
        this.id_case();
        BB bB = new BB(c_class.id_throw());
        this.id_break[Br_1.id_protected[0]] = bB;
    }

    static {
        Br_1.ntfClinit();
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xAF00441A;
    }

    @Override
    public void id_class(j_1 j_12) {
        this.id_case();
        if (j_12.id_class() == (V)((Object)V.staticFields30e1cd8580ce39faa61be3646b7cc079[id_protected[5]])) {
            ((BB)this.id_break[id_protected[6]]).id_break();
            Object var6_2 = null;
            this.id_break[Br_1.id_protected[7]] = var6_2;
        }
    }

    @Override
    public void id_class(t_1 t_12) {
        this.id_case();
        if ((BS)this.id_break[id_protected[44]] != null) {
            PX pX = ((BB)this.id_break[id_protected[45]]).id_class((PX)((BS)this.id_break[Br_1.id_protected[46]]).id_class[id_protected[47]]);
            t_12.id_class(pX);
        }
    }

    @Override
    public void id_class(rrAz_1 rrAz_12) {
        this.id_case();
        if ((BS)this.id_break[id_protected[37]] != null) {
            rrTq_1 rrTq_12;
            rz_3 rz_32 = C_throws.id_byte().id_void().id_throws();
            if (rz_32 != null && (rrTq_12 = rz_32.id_throws()) != null) {
                rrAz_12.id_class(rrTq_12.id_break());
                rrAz_12.id_class(rrTq_12.id_class());
                return;
            }
            rrAz_12.id_class(((Ps_1)this.id_class[id_protected[38]]).id_catch().id_goto());
            rrAz_12.id_class(PJ.id_class(((Ps_1)this.id_class[id_protected[39]]).id_catch().id_goto(), rrAz_12.id_protected(), id_throws[0]));
        }
    }

    @Override
    public void id_class(g_1 g_12) {
        this.id_finally();
    }

    @Override
    public void id_class(q_1 q_12) {
        this.id_case();
        if ((BS)this.id_break[id_protected[8]] == null) {
            return;
        }
        switch (((int[])BP.id_class[id_protected[9]])[q_12.id_class().ordinal()]) {
            case 1: {
                if ((Bs_1)((Object)((BS)this.id_break[Br_1.id_protected[10]]).id_class[id_protected[11]]) == (Bs_1)((Object)Bs_1.staticFieldsab676614e82b32e79a1e1e0ca1d59f08[id_protected[12]])) {
                    return;
                }
                Br_1 br_1 = this;
                rrTT.id_break[Br_1.id_protected[13]] = br_1;
                if ((Bs_1)((Object)((BS)this.id_break[Br_1.id_protected[14]]).id_class[id_protected[15]]) == (Bs_1)((Object)Bs_1.staticFieldsab676614e82b32e79a1e1e0ca1d59f08[id_protected[16]])) {
                    PX pX = new PX(((Float)((Ps_1)this.id_class[Br_1.id_protected[17]]).id_catch().id_throws[id_protected[18]]).floatValue(), ((Float)((Ps_1)this.id_class[Br_1.id_protected[19]]).id_catch().id_throws[id_protected[20]]).floatValue());
                    this.id_break[Br_1.id_protected[21]] = pX;
                }
                PX pX = ((BB)this.id_break[id_protected[22]]).id_class((PX)((BS)this.id_break[Br_1.id_protected[23]]).id_class[id_protected[24]]);
                Float f = Float.valueOf(pX.id_throws());
                ((Ps_1)this.id_class[Br_1.id_protected[25]]).id_catch().id_throws[Br_1.id_protected[26]] = f;
                Float f2 = Float.valueOf(pX.id_protected());
                ((Ps_1)this.id_class[Br_1.id_protected[27]]).id_catch().id_throws[Br_1.id_protected[28]] = f2;
                break;
            }
            case 2: {
                if ((PX)this.id_break[id_protected[29]] == null) break;
                Float f = Float.valueOf(((PX)this.id_break[id_protected[31]]).id_throws());
                ((Ps_1)this.id_class[Br_1.id_protected[30]]).id_catch().id_throws[Br_1.id_protected[32]] = f;
                Float f3 = Float.valueOf(((PX)this.id_break[id_protected[34]]).id_protected());
                ((Ps_1)this.id_class[Br_1.id_protected[33]]).id_catch().id_throws[Br_1.id_protected[35]] = f3;
                Object var13_9 = null;
                this.id_break[Br_1.id_protected[36]] = var13_9;
            }
        }
    }

    public void id_class(PX pX, boolean bl) {
        this.id_case();
        BS bS = new BS(pX, bl);
        this.id_break[Br_1.id_protected[1]] = bS;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x465FB2275E1D5E25L;
    }

    @Override
    public C_package id_class() {
        this.id_case();
        return (BB)this.id_break[id_protected[2]];
    }

    @Override
    public void id_class(rrAX rrAX2) {
        this.id_case();
        if ((BS)this.id_break[id_protected[40]] != null) {
            PX pX = ((BB)this.id_break[id_protected[41]]).id_class((PX)((BS)this.id_break[Br_1.id_protected[42]]).id_class[id_protected[43]]);
            rrAX2.id_class(pX);
        }
    }

    @Override
    public rrTj_1 id_break() {
        this.id_case();
        return (BS)this.id_break[id_protected[3]];
    }

    public static String id_break(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-30, -116, -70, -25, 122, -106, -99, -92}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    @Override
    public void id_break(y_1 y_12) {
        rZO rZO2;
        this.id_case();
        ruS_2<?> ruS_22 = y_12.id_protected();
        if (ruS_22 instanceof rZO && ((rZO2 = (rZO)ruS_22) instanceof rZJ || rZO2 instanceof rZX)) {
            PX pX = new PX(rZO2.id_class(id_byte[0]), rZO2.id_break(id_byte[1]));
            this.id_break[Br_1.id_protected[48]] = pX;
        }
    }

    public void id_throws() {
        this.id_case();
        if ((BS)this.id_break[id_protected[51]] != null) {
            PX pX = ((BB)this.id_break[id_protected[52]]).id_class((PX)((BS)this.id_break[Br_1.id_protected[53]]).id_class[id_protected[54]]);
            Float f = Float.valueOf(pX.id_throws());
            ((Ps_1)this.id_class[Br_1.id_protected[55]]).id_catch().id_throws[Br_1.id_protected[56]] = f;
        }
    }

    private static /* synthetic */ void ntfClinit() {
        Br_1.id_private();
        Br_1.id_catch();
        Br_1.id_implements();
        Br_1.id_extends();
    }

    private void id_finally() {
        this.id_case();
        Object var5_1 = null;
        this.id_break[Br_1.id_protected[49]] = var5_1;
        Object var6_2 = null;
        this.id_break[Br_1.id_protected[50]] = var6_2;
    }

    private static void id_catch() {
        short[] sArray = new short[59];
        sArray[0] = 3;
        sArray[2] = 3;
        sArray[6] = 3;
        sArray[11] = 1;
        sArray[12] = 2;
        sArray[13] = 3;
        sArray[15] = 1;
        sArray[16] = 1;
        sArray[17] = 1;
        sArray[18] = 15;
        sArray[19] = 1;
        sArray[20] = 16;
        sArray[21] = 2;
        sArray[22] = 3;
        sArray[25] = 1;
        sArray[26] = 15;
        sArray[27] = 1;
        sArray[28] = 16;
        sArray[29] = 2;
        sArray[30] = 1;
        sArray[31] = 2;
        sArray[32] = 15;
        sArray[33] = 1;
        sArray[34] = 2;
        sArray[35] = 16;
        sArray[36] = 2;
        sArray[38] = 1;
        sArray[39] = 1;
        sArray[41] = 3;
        sArray[45] = 3;
        sArray[48] = 1;
        sArray[49] = 1;
        sArray[52] = 3;
        sArray[55] = 1;
        sArray[56] = 15;
        sArray[58] = 1;
        id_protected = sArray;
    }

    private static void id_extends() {
        id_case = new byte[]{4};
    }

    private void id_case() {
        if (this.id_break == null) {
            Object[] objectArray = this.id_break = new Object[id_case[0]];
        }
    }

    private static void id_implements() {
        id_byte = new float[2];
    }

    public Optional<PX> id_protected() {
        this.id_case();
        if (((Boolean)C_class.id_instanceof().n.id_class[id_protected[57]]).booleanValue()) {
            return Optional.ofNullable((PX)this.id_break[id_protected[58]]);
        }
        return Optional.empty();
    }

    private static void id_private() {
        id_throws = new boolean[1];
    }

    @Override
    public void id_native() {
        super.id_native();
        this.id_finally();
    }
}

