/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.MP;
import celestial.a_1;
import celestial.rP_2;
import celestial.rU_2;
import celestial.rd_3;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class GX
extends MP {
    private static byte[] id_break;
    private static boolean[] id_byte;
    private static short[] id_protected;
    public Object[] id_class;

    @Override
    public rP_2 id_byte() {
        this.id_finally();
        return (rP_2)this.id_class[id_protected[4]];
    }

    private GX(List<rU_2> list, List<rd_3> list2, int n, rP_2 rP_22) {
        List<rd_3> list3;
        List<rU_2> list4;
        this.id_finally();
        this.id_class[GX.id_protected[0]] = list4 = list;
        this.id_class[GX.id_protected[1]] = list3 = list2;
        Integer n2 = n;
        this.id_class[GX.id_protected[2]] = n2;
        rP_2 rP_23 = rP_22;
        this.id_class[GX.id_protected[3]] = rP_23;
        this.id_throws();
    }

    static {
        GX.ntfClinit();
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x6791B049C4A8C0DFL;
    }

    @Override
    public int id_class() {
        this.id_finally();
        return ((List)this.id_class[id_protected[8]]).size();
    }

    public static Optional<GX> id_class(a_1 a_12, a_1 a_13, boolean bl) {
        int n;
        if (a_13 == null || a_12 == null) {
            return Optional.empty();
        }
        if (!a_12.id_protected().equals(a_13.id_implements())) {
            return Optional.empty();
        }
        HashSet<rU_2> hashSet = new HashSet<rU_2>(a_13.id_break());
        int n2 = id_break[0];
        for (n = id_byte[0]; n < a_12.id_class() - id_byte[1]; ++n) {
            if (!hashSet.contains(a_12.id_break().get(n))) continue;
            n2 = n;
            break;
        }
        if (n2 != id_break[1]) {
            if (!bl) {
                return Optional.empty();
            }
        } else {
            n2 = a_12.id_class() - id_byte[2];
        }
        n = a_13.id_break().indexOf(a_12.id_break().get(n2));
        if (!bl && n != 0) {
            throw new IllegalStateException();
        }
        ArrayList<rU_2> arrayList = new ArrayList<rU_2>();
        ArrayList<rd_3> arrayList2 = new ArrayList<rd_3>();
        arrayList.addAll(a_12.id_break().subList(id_byte[3], n2 + id_byte[4]));
        arrayList2.addAll(a_12.id_catch().subList(id_byte[5], n2));
        arrayList.addAll(a_13.id_break().subList(n + id_byte[6], a_13.id_class()));
        arrayList2.addAll(a_13.id_catch().subList(n, a_13.id_class() - id_byte[7]));
        return Optional.of(new GX(arrayList, arrayList2, a_12.id_case() + a_13.id_case(), a_12.id_byte()));
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{58, 72, 33, 5, 77, 53, -45, -126}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    @Override
    public List<rU_2> id_break() {
        this.id_finally();
        return Collections.unmodifiableList((List)this.id_class[id_protected[6]]);
    }

    private static int id_break(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x79E4C025;
    }

    private static /* synthetic */ void ntfClinit() {
        GX.id_volatile();
        GX.id_native();
        GX.id_extends();
    }

    private void id_finally() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_break[2]];
            objectArray[GX.id_break[3]] = id_byte[8];
        }
    }

    @Override
    public List<rd_3> id_catch() {
        this.id_finally();
        return Collections.unmodifiableList((List)this.id_class[id_protected[5]]);
    }

    private static void id_extends() {
        id_break = new byte[]{-1, -1, 4, 2};
    }

    @Override
    public int id_case() {
        this.id_finally();
        return (Integer)this.id_class[id_protected[7]];
    }

    private static void id_volatile() {
        boolean[] blArray = new boolean[9];
        blArray[1] = true;
        blArray[2] = true;
        blArray[4] = true;
        blArray[6] = true;
        blArray[7] = true;
        id_byte = blArray;
    }

    private static void id_native() {
        short[] sArray = new short[9];
        sArray[1] = 1;
        sArray[2] = 2;
        sArray[3] = 3;
        sArray[4] = 3;
        sArray[5] = 1;
        sArray[7] = 2;
        id_protected = sArray;
    }
}

