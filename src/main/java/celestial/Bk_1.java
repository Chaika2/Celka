/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.BN;
import celestial.BQ;
import celestial.BW;
import celestial.Bz_1;
import celestial.C_class;
import celestial.Ps_1;
import celestial.Pv_1;
import celestial.aI_2;
import celestial.an_3;
import celestial.cb_3;
import celestial.iB_2;
import celestial.j_1;
import celestial.rAB;
import celestial.rAS;
import celestial.rLR;
import celestial.rLY;
import celestial.rdn_3;
import celestial.rjU_2;
import celestial.rqR_2;
import celestial.rrLD;
import celestial.rrfO_2;
import celestial.rrnd_3;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class Bk_1
extends Pv_1 {
    private static double[] id_byte;
    private static byte[] id_protected;
    private static short[] id_throws;
    private static boolean[] id_case;
    public Object[] id_break;
    private static long[] id_catch;

    private void id_byte() {
        if (this.id_break == null) {
            Object[] objectArray = this.id_break = new Object[id_protected[1]];
        }
    }

    public Bk_1(C_class c_class) {
        super(c_class);
        HashSet hashSet;
        LinkedList linkedList;
        this.id_byte();
        this.id_break[Bk_1.id_throws[0]] = linkedList = new LinkedList();
        this.id_break[Bk_1.id_throws[1]] = hashSet = new HashSet();
    }

    static {
        Bk_1.ntfClinit();
    }

    @Override
    public void id_class(j_1 j_12) {
        this.id_byte();
        if (((LinkedList)this.id_break[id_throws[4]]).isEmpty() || ((Set)this.id_break[id_throws[5]]).isEmpty()) {
            return;
        }
        long l = rqR_2.id_break() - id_catch[0];
        if (!((LinkedList)this.id_break[id_throws[6]]).isEmpty()) {
            ((LinkedList)this.id_break[id_throws[7]]).removeIf(bQ -> bQ.id_class() < l ? id_case[4] : id_case[5]);
        }
        if (!((Set)this.id_break[id_throws[8]]).isEmpty()) {
            ((Set)this.id_break[id_throws[9]]).removeIf(bW -> bW.id_class() < l ? id_case[2] : id_case[3]);
        }
        if (((LinkedList)this.id_break[id_throws[10]]).isEmpty() || ((Set)this.id_break[id_throws[11]]).isEmpty()) {
            return;
        }
        this.id_private();
    }

    private BW id_class(BQ bQ, Collection<BW> collection) {
        if (collection.isEmpty()) {
            return null;
        }
        BW bW = null;
        double d = id_byte[0];
        rjU_2 rjU_22 = bQ.id_break();
        for (BW bW2 : collection) {
            double d2 = rjU_22.id_implements(bW2.id_break());
            if (!(d2 < d)) continue;
            d = d2;
            bW = bW2;
        }
        return bW;
    }

    private void id_class(Bz_1 bz_1) {
        rrfO_2 rrfO_22 = rrfO_2.id_class(((BW)bz_1.id_class[id_throws[15]]).id_byte());
        if (rrfO_22 == null) {
            return;
        }
        cb_3 cb_32 = ((Ps_1)this.id_class[id_throws[16]]).id_catch();
        rdn_3 rdn_32 = rrfO_22.id_byte();
        rLY[] rLYArray = rrfO_22.id_class();
        for (BN bN : ((BQ)bz_1.id_class[id_throws[17]]).id_protected()) {
            iB_2 iB_22 = bN.id_class();
            double d = bN.id_break();
            List<rLY> list = this.id_class(rLYArray, d);
            if (list.isEmpty()) continue;
            rrLD.id_class(iB_22, rdn_32, list, d);
            if (iB_22 == cb_32 || iB_22.BC() != aI_2.rM) continue;
            for (rLY rLY2 : list) {
                iB_22.id_break(rLY2);
            }
        }
    }

    private List<rLY> id_class(rLY[] rLYArray, double d) {
        ArrayList<rLY> arrayList = new ArrayList<rLY>(rLYArray.length);
        rLY[] rLYArray2 = rLYArray;
        int n = rLYArray2.length;
        for (int i = id_case[0]; i < n; ++i) {
            int n2;
            rLY rLY2 = rLYArray2[i];
            rLR rLR2 = rLY2.id_class();
            if (rLR2.id_class() || (n2 = (int)(d * (double)rLY2.id_break() + id_byte[1])) <= id_protected[0]) continue;
            arrayList.add(new rLY(rLR2, n2, rLY2.id_byte(), rLY2.id_protected(), rLY2.id_throws()));
        }
        return arrayList;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xD9DF137CF1E50A15L;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x66FC58EF;
    }

    public boolean id_class() {
        return id_case[1];
    }

    public void id_class(an_3 an_32, rjU_2 rjU_22, rdn_3 rdn_32, List<BN> list) {
        this.id_byte();
        ((LinkedList)this.id_break[id_throws[2]]).add(new BQ(an_32, rjU_22, rdn_32, list));
    }

    @Override
    public void id_class(rrnd_3 rrnd_32) {
        this.id_byte();
        if (!this.id_class()) {
            return;
        }
        rjU_2 rjU_22 = rrnd_32.id_break();
        int n = rrnd_32.id_class();
        if (n != rAB.id_class(rAS.id_break)) {
            ((Set)this.id_break[id_throws[3]]).add(new BW(rjU_22, n));
        }
    }

    public static String id_break(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{42, -14, -10, -81, -95, -85, 19, -79}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static void id_break() {
        short[] sArray = new short[18];
        sArray[1] = 1;
        sArray[3] = 1;
        sArray[5] = 1;
        sArray[8] = 1;
        sArray[9] = 1;
        sArray[11] = 1;
        sArray[13] = 1;
        sArray[14] = 1;
        sArray[15] = 1;
        sArray[16] = 1;
        id_throws = sArray;
    }

    private static void id_throws() {
        id_protected = new byte[]{20, 2};
    }

    private static /* synthetic */ void ntfClinit() {
        Bk_1.id_catch();
        Bk_1.id_case();
        Bk_1.id_break();
        Bk_1.id_protected();
        Bk_1.id_throws();
    }

    private static void id_catch() {
        boolean[] blArray = new boolean[6];
        blArray[1] = true;
        blArray[2] = true;
        blArray[4] = true;
        id_case = blArray;
    }

    private static void id_case() {
        id_catch = new long[]{1000L};
    }

    private static void id_protected() {
        id_byte = new double[]{Double.MAX_VALUE, 0.5};
    }

    private void id_private() {
        this.id_byte();
        ArrayList<Bz_1> arrayList = new ArrayList<Bz_1>();
        Iterator iterator = ((LinkedList)this.id_break[id_throws[12]]).iterator();
        while (iterator.hasNext()) {
            BQ bQ = (BQ)iterator.next();
            BW object = this.id_class(bQ, (Set)this.id_break[id_throws[13]]);
            if (object == null) continue;
            arrayList.add(new Bz_1(bQ, object));
            iterator.remove();
            ((Set)this.id_break[id_throws[14]]).remove(object);
        }
        for (Bz_1 bz_1 : arrayList) {
            this.id_class(bz_1);
        }
    }
}

