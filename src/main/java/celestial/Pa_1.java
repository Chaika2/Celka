/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.C_class;
import celestial.PP;
import celestial.Pi_1;
import celestial.Pv_1;
import celestial.Y;
import celestial.an_3;
import celestial.iB_2;
import celestial.q_1;
import celestial.rjG_2;
import celestial.rrAQ;
import celestial.rrFK;
import celestial.rrFj_1;
import celestial.rrQX;
import celestial.rrnx_3;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class Pa_1
extends Pv_1
implements PP {
    private static boolean[] id_throws;
    public Object[] id_break;
    private static byte[] id_case;
    private static short[] id_catch;

    private static void id_byte() {
        short[] sArray = new short[14];
        sArray[3] = 74;
        sArray[4] = 74;
        sArray[6] = 74;
        sArray[7] = 74;
        sArray[8] = 74;
        sArray[10] = 64;
        id_catch = sArray;
    }

    public Pa_1(C_class c_class) {
        super(c_class);
        HashSet hashSet;
        this.id_throws();
        this.id_break[Pa_1.id_catch[0]] = hashSet = new HashSet();
    }

    static {
        Pa_1.ntfClinit();
    }

    @Override
    public void id_class(rrFK rrFK2) {
        this.id_throws();
        ((Set)this.id_break[id_catch[12]]).clear();
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x3017D44AA981DF02L;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xFDBEE3BC;
    }

    @Override
    public void id_class(q_1 q_12) {
        this.id_throws();
        if (q_12.id_class() == (Y)((Object)Y.staticFields22c81230f53b33f2a682b4198db24cc4[id_catch[1]])) {
            Iterator iterator = ((Set)this.id_break[id_catch[2]]).iterator();
            while (iterator.hasNext()) {
                Pi_1 pi_1 = (Pi_1)iterator.next();
                iB_2 iB_22 = pi_1.id_break();
                rjG_2 rjG_22 = pi_1.id_class();
                iB_2 iB_23 = iB_22;
                Integer n = (Integer)iB_23.id_private[id_catch[3]] + id_throws[0];
                iB_23.id_private[Pa_1.id_catch[4]] = n;
                if (!iB_22.Pu()) {
                    ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_catch[5]]).id_finally().id_class(rrnx_3.id_class(iB_22, rjG_22));
                    iterator.remove();
                    continue;
                }
                if ((Integer)iB_22.id_private[id_catch[6]] <= id_case[0]) continue;
                iterator.remove();
                Integer n2 = id_throws[1];
                iB_22.id_private[Pa_1.id_catch[7]] = n2;
            }
        }
    }

    public Set<Pi_1> id_class() {
        this.id_throws();
        return (Set)this.id_break[id_catch[13]];
    }

    @Override
    public void id_class(rrFj_1 rrFj_12) {
        this.id_throws();
        an_3 an_32 = rrFj_12.id_class();
        if (an_32 instanceof iB_2) {
            iB_2 iB_22 = (iB_2)an_32;
            Integer n = id_throws[2];
            iB_22.id_private[Pa_1.id_catch[8]] = n;
            ((Set)this.id_break[id_catch[9]]).add(new Pi_1(iB_22, (rjG_2)Pa_1.b_.id_class[id_catch[10]]));
        }
    }

    @Override
    public void id_class(rrAQ rrAQ2) {
        this.id_throws();
        ((Set)this.id_break[id_catch[11]]).removeIf(pi_1 -> pi_1.id_break().equals(rrAQ2.id_class()));
    }

    public static String id_break(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{23, 93, 42, -107, 90, 77, -60, 69}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static void id_break() {
        id_case = new byte[]{5};
    }

    private void id_throws() {
        if (this.id_break == null) {
            Object[] objectArray = this.id_break = new Object[id_throws[3]];
        }
    }

    private static /* synthetic */ void ntfClinit() {
        Pa_1.id_protected();
        Pa_1.id_byte();
        Pa_1.id_break();
    }

    private static void id_protected() {
        boolean[] blArray = new boolean[4];
        blArray[0] = true;
        blArray[3] = true;
        id_throws = blArray;
    }
}

