/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.C_class;
import celestial.Gx_1;
import celestial.JU;
import celestial.Ja_1;
import celestial.Jj_1;
import celestial.Ps_1;
import celestial.WD;
import celestial.Wg_1;
import celestial.Wp_1;
import celestial.aa_3;
import celestial.an_3;
import celestial.bJ_2;
import celestial.bx_3;
import celestial.cb_3;
import celestial.dN_2;
import celestial.dq_3;
import celestial.iB_2;
import celestial.rEJ;
import celestial.rLT;
import celestial.rP_2;
import celestial.rS_2;
import celestial.rXE;
import celestial.rYB;
import celestial.rfH_2;
import celestial.rfU_2;
import celestial.rfl_3;
import celestial.rfw_3;
import celestial.rrjZ_2;
import celestial.xC_2;
import celestial.xc_3;
import celestial.xd_3;
import celestial.xp_3;
import celestial.xu_3;
import celestial.zv_3;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class bX_2 {
    private static short[] id_class;
    private static boolean[] id_break;
    private static byte[] id_byte;
    private static double[] id_protected;
    private static float[] id_throws;

    private static void id_byte() {
        id_protected = new double[]{36.0, Double.MAX_VALUE, Double.MAX_VALUE, -1.7976931348623157E308, -1.7976931348623157E308, 1.0, 1.0, 1.0, 1.0, Double.MAX_VALUE, Double.MAX_VALUE};
    }

    static {
        bX_2.ntfClinit();
    }

    private static Gx_1 id_class(xc_3 xc_32) {
        xd_3 xd_32 = xc_32.id_break();
        if (xd_32 instanceof Ja_1) {
            return (Gx_1)((Object)Gx_1.staticFields5eb6de38577e3355bf35a0696e0b0ac4[id_class[1]]);
        }
        if (xd_32 instanceof Jj_1 || xd_32 == xu_3.SQ || xd_32 == xu_3.U || xd_32 == xu_3.SM || xd_32 == xu_3.Sx || xd_32 instanceof JU || xd_32 == xu_3.hM || xd_32 instanceof Wp_1 || xd_32 instanceof Wg_1 || xd_32 instanceof zv_3 || xd_32 == xu_3.Jh || xd_32 == xu_3.bn || xd_32 == xu_3.XJ) {
            return (Gx_1)((Object)Gx_1.staticFields5eb6de38577e3355bf35a0696e0b0ac4[id_class[2]]);
        }
        if (((List)C_class.id_instanceof().PD.id_class[id_class[3]]).contains(xd_32)) {
            return (Gx_1)((Object)Gx_1.staticFields5eb6de38577e3355bf35a0696e0b0ac4[id_class[4]]);
        }
        if (xd_32 instanceof dN_2 || xd_32 instanceof dq_3) {
            if (xd_32 == xu_3.PZ) {
                return (Gx_1)((Object)Gx_1.staticFields5eb6de38577e3355bf35a0696e0b0ac4[id_class[5]]);
            }
            return (Gx_1)((Object)Gx_1.staticFields5eb6de38577e3355bf35a0696e0b0ac4[id_class[6]]);
        }
        if (xd_32 instanceof xC_2) {
            return (Gx_1)((Object)Gx_1.staticFields5eb6de38577e3355bf35a0696e0b0ac4[id_class[7]]);
        }
        if (xd_32 instanceof WD) {
            return (Gx_1)((Object)Gx_1.staticFields5eb6de38577e3355bf35a0696e0b0ac4[id_class[8]]);
        }
        rXE rXE2 = xc_32.id_volatile();
        if (!rXE2.id_byte()) {
            if (rXE2.id_class().id_protected(rXE2) != id_byte[0]) {
                return (Gx_1)((Object)Gx_1.staticFields5eb6de38577e3355bf35a0696e0b0ac4[id_class[9]]);
            }
            return (Gx_1)((Object)Gx_1.staticFields5eb6de38577e3355bf35a0696e0b0ac4[id_class[10]]);
        }
        if (xd_32 instanceof xp_3) {
            return (Gx_1)((Object)Gx_1.staticFields5eb6de38577e3355bf35a0696e0b0ac4[id_class[11]]);
        }
        try {
            if (xc_32.id_class(null, null, rLT.LAND)) {
                return (Gx_1)((Object)Gx_1.staticFields5eb6de38577e3355bf35a0696e0b0ac4[id_class[12]]);
            }
            return (Gx_1)((Object)Gx_1.staticFields5eb6de38577e3355bf35a0696e0b0ac4[id_class[13]]);
        }
        catch (Throwable throwable) {
            System.out.println("The block " + xc_32.id_break().id_native().getString() + " requires a special case due to the exception " + throwable.getMessage());
            return (Gx_1)((Object)Gx_1.staticFields5eb6de38577e3355bf35a0696e0b0ac4[id_class[14]]);
        }
    }

    public rP_2 id_class(Ps_1 ps_1, rfl_3 rfl_32, List<iB_2> list, List<iB_2> list2) {
        rYB rYB2 = ps_1.id_case();
        cb_3 cb_32 = ps_1.id_catch();
        rfH_2 rfH_22 = cb_32.Bs();
        if (list2 != null && !list2.isEmpty()) {
            Object object;
            float f = id_throws[0];
            Object object2 = list2.iterator();
            while (object2.hasNext()) {
                object = object2.next();
                if (!((an_3)object).BC().id_throws().id_private() || object instanceof aa_3) continue;
                f = id_throws[1];
                break;
            }
            if (((bx_3)(object2 = this.id_class(rYB2, list2, rfl_32, rfH_22, f))).id_byte()) {
                return object2;
            }
            object = new ArrayList();
            for (iB_2 iB_22 : list) {
                if (!(iB_22.id_int(cb_32) <= id_protected[0])) continue;
                object.add(iB_22);
            }
            if (!object.isEmpty()) {
                return this.id_class(rYB2, (List<iB_2>)object, rfl_32, rfH_22, f);
            }
        }
        if (list != null && !list.isEmpty()) {
            return new rS_2(list.get(id_break[0]).Bs());
        }
        return null;
    }

    private bx_3 id_class(rYB rYB2, List<iB_2> list, rfl_3 rfl_32, rfH_2 rfH_22, float f) {
        int n;
        if (list == null || list.isEmpty()) {
            return new bx_3(rfH_22, f, id_break[2]);
        }
        double d = rfH_22.c_();
        double d2 = id_protected[1];
        double d3 = id_protected[2];
        double d4 = id_protected[3];
        double d5 = id_protected[4];
        float f2 = id_throws[2];
        boolean bl = id_break[3];
        for (iB_2 iB_22 : list) {
            rEJ rEJ2;
            double d6 = iB_22.rx();
            double d7 = iB_22.BO();
            d2 = Math.min(d2, d6);
            d4 = Math.max(d4, d6);
            d3 = Math.min(d3, d7);
            d5 = Math.max(d5, d7);
            if (!rfl_32.id_byte(iB_22.rN())) {
                f2 = id_throws[3];
                bl = id_break[4];
                continue;
            }
            if (!(iB_22 instanceof rEJ) || !rrjZ_2.id_class(rEJ2 = (rEJ)iB_22)) continue;
            f2 = id_throws[4];
            bl = id_break[5];
        }
        f = Math.max(f, f2);
        int n2 = rfU_2.id_byte(d2 - (double)f - id_protected[5]);
        int n3 = rfU_2.id_byte(d4 + (double)f + id_protected[6]);
        int n4 = rfU_2.id_byte(d3 - (double)f - id_protected[7]);
        int n5 = rfU_2.id_byte(d5 + (double)f + id_protected[8]);
        ArrayList<rfH_2> arrayList = new ArrayList<rfH_2>();
        rfw_3 rfw_32 = new rfw_3();
        for (n = n2; n <= n3; ++n) {
            bX_2.id_class(rYB2, arrayList, rfl_32, rfw_32, n, d, n4);
            bX_2.id_class(rYB2, arrayList, rfl_32, rfw_32, n, d, n5);
        }
        for (n = n4 + id_break[6]; n < n5; ++n) {
            bX_2.id_class(rYB2, arrayList, rfl_32, rfw_32, n2, d, n);
            bX_2.id_class(rYB2, arrayList, rfl_32, rfw_32, n3, d, n);
        }
        if (arrayList.isEmpty()) {
            return new bx_3(rfH_22, f, bl);
        }
        rfH_2 rfH_23 = null;
        double d8 = id_protected[9];
        ArrayList<rfH_2> arrayList2 = new ArrayList<rfH_2>();
        for (rfH_2 rfH_24 : arrayList) {
            double d9 = rfH_24.id_private(rfH_22);
            double d10 = id_protected[10];
            for (iB_2 iB_23 : list) {
                d10 = Math.min(d10, rfH_24.id_private(iB_23.Bs()));
            }
            if (d10 <= d9) continue;
            arrayList2.add(rfH_24);
            if (!(d9 < d8)) continue;
            d8 = d9;
            rfH_23 = rfH_24;
        }
        if (arrayList2.contains(rfH_22)) {
            return new bx_3(rfH_22, f, bl);
        }
        return new bx_3(rfH_23 != null ? rfH_23 : list.get(id_break[7]).Bs(), f, bl);
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-110, 38, -81, 69, 22, 14, 21, -35}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x2AE5D03B;
    }

    public rS_2 id_class(Ps_1 ps_1, rfl_3 rfl_32, int n, Runnable runnable) {
        rfH_2 rfH_22;
        rYB rYB2 = ps_1.id_case();
        int n2 = (int)rfl_32.id_class;
        int n3 = (int)rfl_32.id_break;
        int n4 = (int)rfl_32.id_byte;
        int n5 = (int)rfl_32.id_protected;
        int n6 = (int)rfl_32.id_case;
        ThreadLocalRandom threadLocalRandom = ThreadLocalRandom.current();
        int n7 = id_break[1];
        do {
            int n8 = threadLocalRandom.nextInt(n2, n5);
            int n9 = threadLocalRandom.nextInt(n4, n6);
            rfH_22 = new rfH_2(n8, n3, n9);
            if (++n7 < n) continue;
            if (runnable == null) break;
            runnable.run();
            break;
        } while (bX_2.id_class(rYB2.id_byte(rfH_22)) != (Gx_1)((Object)Gx_1.staticFields5eb6de38577e3355bf35a0696e0b0ac4[id_class[0]]));
        return new bJ_2(this, rfH_22);
    }

    private static void id_class(rYB rYB2, List<rfH_2> list, rfl_3 rfl_32, rfw_3 rfw_32, double d, double d2, double d3) {
        rfw_32.id_break(d, d2, d3);
        if (rfl_32.id_break(rfw_32) && rYB2.id_finally(rfw_32)) {
            list.add(rfw_32.id_int());
        }
    }

    private static void id_class() {
        boolean[] blArray = new boolean[8];
        blArray[4] = true;
        blArray[5] = true;
        blArray[6] = true;
        id_break = blArray;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x9DCB42691D1F0385L;
    }

    private static void id_break() {
        float[] fArray = new float[5];
        fArray[0] = 1.5f;
        fArray[1] = 3.5f;
        fArray[3] = 7.0f;
        fArray[4] = 7.0f;
        id_throws = fArray;
    }

    private static void id_throws() {
        id_byte = new byte[]{8};
    }

    private static /* synthetic */ void ntfClinit() {
        bX_2.id_class();
        bX_2.id_break();
        bX_2.id_byte();
        bX_2.id_protected();
        bX_2.id_throws();
    }

    private static void id_protected() {
        short[] sArray = new short[15];
        sArray[2] = 2;
        sArray[4] = 2;
        sArray[5] = 2;
        sArray[7] = 1;
        sArray[8] = 1;
        sArray[9] = 2;
        sArray[10] = 1;
        sArray[11] = 2;
        sArray[13] = 2;
        sArray[14] = 1;
        id_class = sArray;
    }
}

