/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Ja_1;
import celestial.rCZ;
import celestial.rl_3;
import celestial.rq_3;
import celestial.xc_3;
import celestial.xd_3;
import celestial.xu_3;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rV_2
extends rl_3 {
    private static short[] id_byte;
    public Object[] id_break;
    private static boolean[] id_protected;
    private static byte[] id_throws;

    public rV_2(rq_3 rq_32, Map<xd_3, List<xd_3>> map) {
        super(rq_32.id_break(), rq_32.id_class(), rq_32.id_byte());
        Map<xd_3, List<xd_3>> map2;
        HashMap hashMap;
        this.id_private();
        this.id_break[rV_2.id_byte[0]] = hashMap = new HashMap();
        rq_3 rq_33 = rq_32;
        this.id_break[rV_2.id_byte[1]] = rq_33;
        this.id_break[rV_2.id_byte[2]] = map2 = map;
    }

    static {
        rV_2.ntfClinit();
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x30B6D80879E74F57L;
    }

    @Override
    public boolean id_class(int n, int n2, int n3, xc_3 xc_32) {
        this.id_private();
        return ((rq_3)this.id_break[id_byte[3]]).id_class(n, n2, n3, xc_32);
    }

    private xc_3 id_class(xc_3 xc_33, xd_3 xd_32) {
        this.id_private();
        if (((Map)this.id_break[id_byte[7]]).containsKey(xc_33) && ((Map)((Map)this.id_break[id_byte[8]]).get(xc_33)).containsKey(xd_32)) {
            return (xc_3)((Map)((Map)this.id_break[id_byte[9]]).get(xc_33)).get(xd_32);
        }
        Collection<rCZ<?>> collection = xc_33.id_break().id_new().id_protected();
        xc_3 xc_34 = xd_32.id_continue();
        for (rCZ<?> rCZ2 : collection) {
            try {
                xc_34 = this.id_class(xc_33, xc_34, rCZ2);
            }
            catch (IllegalArgumentException illegalArgumentException) {}
        }
        ((Map)this.id_break[id_byte[10]]).computeIfAbsent(xc_33, xc_32 -> new HashMap()).put(xd_32, xc_34);
        return xc_34;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x17D878D4;
    }

    @Override
    public xc_3 id_class(int n, int n2, int n3, xc_3 xc_32, List<xc_3> list) {
        this.id_private();
        xc_3 xc_33 = ((rq_3)this.id_break[id_byte[4]]).id_class(n, n2, n3, xc_32, list);
        xd_3 xd_32 = xc_33.id_break();
        if (!((Map)this.id_break[id_byte[5]]).containsKey(xd_32)) {
            return xc_33;
        }
        List list2 = (List)((Map)this.id_break[id_byte[6]]).get(xd_32);
        if (list2.contains(xc_32.id_break()) && !(xc_32.id_break() instanceof Ja_1)) {
            return this.id_class(xc_33, xc_32.id_break());
        }
        for (xd_3 xd_33 : list2) {
            if (xd_33 instanceof Ja_1) {
                return xc_32.id_break() instanceof Ja_1 ? xc_32 : xu_3.id_class.id_continue();
            }
            for (xc_3 xc_34 : list) {
                if (!xd_33.equals(xc_34.id_break())) continue;
                return this.id_class(xc_33, xc_34.id_break());
            }
        }
        return ((xd_3)list2.get(id_protected[0])).id_continue();
    }

    private <T extends Comparable<T>> xc_3 id_class(xc_3 xc_32, xc_3 xc_33, rCZ<T> rCZ2) {
        return (xc_3)xc_33.id_class(rCZ2, xc_32.id_byte(rCZ2));
    }

    public static String id_break(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-24, -66, -85, -50, 64, 63, 123, 99}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static void id_throws() {
        short[] sArray = new short[11];
        sArray[0] = 2;
        sArray[2] = 1;
        sArray[5] = 1;
        sArray[6] = 1;
        sArray[7] = 2;
        sArray[8] = 2;
        sArray[9] = 2;
        sArray[10] = 2;
        id_byte = sArray;
    }

    private static /* synthetic */ void ntfClinit() {
        rV_2.id_catch();
        rV_2.id_throws();
        rV_2.id_case();
    }

    private static void id_catch() {
        id_protected = new boolean[1];
    }

    private static void id_case() {
        id_throws = new byte[]{3};
    }

    private void id_private() {
        if (this.id_break == null) {
            Object[] objectArray = this.id_break = new Object[id_throws[0]];
        }
    }
}

