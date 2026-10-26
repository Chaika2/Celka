/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
package celestial;

import celestial.EC;
import celestial.EQ;
import celestial.EZ;
import celestial.Ev_1;
import celestial.GO;
import celestial.MP;
import celestial.PP;
import celestial.a_1;
import celestial.rP_2;
import celestial.rU_2;
import celestial.rd_3;
import com.google.common.collect.Lists;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class Ez_1
extends MP {
    private static short[] id_break;
    private static byte[] id_byte;
    public Object[] id_class;
    private static boolean[] id_protected;
    private static double[] id_throws;

    @Override
    public rP_2 id_byte() {
        this.id_volatile();
        return (rP_2)this.id_class[id_break[23]];
    }

    public Ez_1(rU_2 rU_22, EQ eQ, EQ eQ2, int n, rP_2 rP_22, EZ eZ) {
        ArrayList arrayList;
        this.id_volatile();
        rU_2 rU_23 = new rU_2((Integer)eQ2.id_class[id_break[0]], (Integer)eQ2.id_class[id_break[1]], (Integer)eQ2.id_class[id_break[2]]);
        this.id_class[Ez_1.id_break[3]] = rU_23;
        Integer n2 = n;
        this.id_class[Ez_1.id_break[4]] = n2;
        this.id_class[Ez_1.id_break[5]] = arrayList = new ArrayList();
        rP_2 rP_23 = rP_22;
        this.id_class[Ez_1.id_break[6]] = rP_23;
        EZ eZ2 = eZ;
        this.id_class[Ez_1.id_break[7]] = eZ2;
        EQ eQ3 = eQ2;
        ArrayList<rU_2> arrayList2 = new ArrayList<rU_2>();
        ArrayList<EQ> arrayList3 = new ArrayList<EQ>();
        while (eQ3 != null) {
            arrayList3.add(eQ3);
            arrayList2.add(new rU_2((Integer)eQ3.id_class[id_break[8]], (Integer)eQ3.id_class[id_break[9]], (Integer)eQ3.id_class[id_break[10]]));
            eQ3 = (EQ)eQ3.id_class[id_break[11]];
        }
        rU_2 rU_24 = new rU_2((Integer)eQ.id_class[id_break[12]], (Integer)eQ.id_class[id_break[13]], (Integer)eQ.id_class[id_break[14]]);
        if (!rU_22.equals(rU_24) && eQ.equals(eQ2)) {
            rU_2 rU_25 = rU_22;
            this.id_class[Ez_1.id_break[15]] = rU_25;
            EQ eQ4 = new EQ((Integer)rU_22.id_break[id_break[16]], (Integer)rU_22.id_break[id_break[17]], (Integer)rU_22.id_break[id_break[18]], rP_22);
            Double d = id_throws[0];
            eQ4.id_class[Ez_1.id_break[19]] = d;
            arrayList3.add(eQ4);
            arrayList2.add(rU_22);
        } else {
            rU_2 rU_26 = rU_24;
            this.id_class[Ez_1.id_break[20]] = rU_26;
        }
        List list = Lists.reverse(arrayList2);
        this.id_class[Ez_1.id_break[21]] = list;
        List list2 = Lists.reverse(arrayList3);
        this.id_class[Ez_1.id_break[22]] = list2;
    }

    static {
        Ez_1.ntfClinit();
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-1, 9, 64, 5, -26, 39, -91, -24}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private Ev_1 id_class(rU_2 rU_22, rU_2 rU_23, double d) {
        this.id_volatile();
        EC[] eCArray = EC.values();
        int n = eCArray.length;
        for (int i = id_protected[6]; i < n; ++i) {
            EC eC = eCArray[i];
            Ev_1 ev_1 = eC.id_class((EZ)this.id_class[id_break[34]], rU_22);
            if (!ev_1.id_implements().equals(rU_23)) continue;
            ev_1.id_byte(Math.min(ev_1.id_class((EZ)this.id_class[id_break[35]]), d));
            return ev_1;
        }
        PP.a_.id_byte("Movement became impossible during calculation " + rU_22 + " " + rU_23 + " " + rU_23.id_byte(rU_22));
        return null;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xB730E05CC9795DADL;
    }

    @Override
    public List<rU_2> id_break() {
        this.id_volatile();
        return Collections.unmodifiableList((List)this.id_class[id_break[42]]);
    }

    private static int id_break(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xADB62273;
    }

    private static /* synthetic */ void ntfClinit() {
        Ez_1.id_package();
        Ez_1.id_finally();
        Ez_1.id_final();
        Ez_1.id_native();
    }

    private static void id_finally() {
        short[] sArray = new short[47];
        sArray[1] = 1;
        sArray[2] = 2;
        sArray[3] = 1;
        sArray[4] = 6;
        sArray[5] = 3;
        sArray[6] = 5;
        sArray[7] = 7;
        sArray[9] = 1;
        sArray[10] = 2;
        sArray[11] = 6;
        sArray[13] = 1;
        sArray[14] = 2;
        sArray[17] = 1;
        sArray[18] = 2;
        sArray[19] = 4;
        sArray[21] = 2;
        sArray[22] = 4;
        sArray[23] = 5;
        sArray[24] = 2;
        sArray[25] = 3;
        sArray[26] = 2;
        sArray[27] = 4;
        sArray[28] = 4;
        sArray[29] = 4;
        sArray[30] = 4;
        sArray[31] = 2;
        sArray[32] = 2;
        sArray[33] = 3;
        sArray[34] = 7;
        sArray[35] = 7;
        sArray[36] = 8;
        sArray[37] = 8;
        sArray[38] = 3;
        sArray[39] = 3;
        sArray[40] = 8;
        sArray[41] = 3;
        sArray[42] = 2;
        sArray[43] = 6;
        sArray[45] = 1;
        sArray[46] = 7;
        id_break = sArray;
    }

    @Override
    public List<rd_3> id_catch() {
        this.id_volatile();
        if (!((Boolean)this.id_class[id_break[40]]).booleanValue()) {
            throw new IllegalStateException();
        }
        return Collections.unmodifiableList((List)this.id_class[id_break[41]]);
    }

    private boolean id_extends() {
        this.id_volatile();
        if (((List)this.id_class[id_break[24]]).isEmpty() || !((List)this.id_class[id_break[25]]).isEmpty()) {
            throw new IllegalStateException();
        }
        for (int i = id_protected[0]; i < ((List)this.id_class[id_break[26]]).size() - id_protected[1]; ++i) {
            double d = (Double)((EQ)((List)this.id_class[Ez_1.id_break[27]]).get((int)(i + Ez_1.id_protected[2]))).id_class[id_break[28]] - (Double)((EQ)((List)this.id_class[Ez_1.id_break[29]]).get((int)i)).id_class[id_break[30]];
            Ev_1 ev_1 = this.id_class((rU_2)((List)this.id_class[id_break[31]]).get(i), (rU_2)((List)this.id_class[id_break[32]]).get(i + id_protected[3]), d);
            if (ev_1 == null) {
                return id_protected[4];
            }
            ((List)this.id_class[id_break[33]]).add(ev_1);
        }
        return id_protected[5];
    }

    @Override
    public int id_case() {
        this.id_volatile();
        return (Integer)this.id_class[id_break[43]];
    }

    @Override
    public rU_2 id_implements() {
        this.id_volatile();
        return (rU_2)this.id_class[id_break[44]];
    }

    private static void id_package() {
        boolean[] blArray = new boolean[10];
        blArray[1] = true;
        blArray[2] = true;
        blArray[3] = true;
        blArray[4] = true;
        blArray[7] = true;
        id_protected = blArray;
    }

    @Override
    public rU_2 id_protected() {
        this.id_volatile();
        return (rU_2)this.id_class[id_break[45]];
    }

    @Override
    public a_1 id_private() {
        this.id_volatile();
        if (((Boolean)this.id_class[id_break[36]]).booleanValue()) {
            throw new IllegalStateException();
        }
        Boolean bl = id_protected[7];
        this.id_class[Ez_1.id_break[37]] = bl;
        boolean bl2 = this.id_extends();
        ((List)this.id_class[id_break[38]]).forEach(ev_1 -> {
            this.id_volatile();
            ev_1.id_byte((EZ)this.id_class[id_break[46]]);
        });
        if (bl2) {
            GO gO = new GO(this, this.id_catch().size());
            if (gO.id_catch().size() != ((List)this.id_class[id_break[39]]).size()) {
                throw new IllegalStateException();
            }
            return gO;
        }
        this.id_throws();
        return this;
    }

    private static void id_final() {
        id_throws = new double[1];
    }

    private void id_volatile() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_byte[0]];
            objectArray[Ez_1.id_byte[1]] = id_protected[8];
            objectArray[Ez_1.id_byte[2]] = id_protected[9];
        }
    }

    private static void id_native() {
        id_byte = new byte[]{9, 6, 8};
    }
}

