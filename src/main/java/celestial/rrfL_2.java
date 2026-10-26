/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.tuple.Pair
 */
package celestial;

import celestial.ev_3;
import celestial.rdn_3;
import celestial.rgn_3;
import celestial.util.MinecraftAccessor;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.apache.commons.lang3.tuple.Pair;

public class rrfL_2
implements MinecraftAccessor {
    public Object[] id_class;
    private static boolean[] id_break;
    private static byte[] id_byte;
    private static short[] id_protected;
    private static String[] id_throws;

    private static void id_byte() {
        id_break = new boolean[1];
    }

    public rrfL_2() {
        Comparator<Map.Entry> comparator;
        ArrayList arrayList;
        this.id_throws();
        this.id_class[rrfL_2.id_protected[0]] = arrayList = new ArrayList();
        this.id_class[rrfL_2.id_protected[1]] = comparator = Comparator.comparingInt(entry -> -((List)this.id_class[id_protected[7]]).indexOf(entry.getKey()));
    }

    static {
        rrfL_2.ntfClinit();
    }

    public Pair<String, Integer> id_class(rdn_3 rdn_32) {
        StringBuilder stringBuilder = new StringBuilder();
        Map<ev_3, Integer> map = ((List)this.id_class[id_protected[2]]).isEmpty() ? rdn_32.id_static() : rdn_32.id_class((List)this.id_class[id_protected[3]]);
        map.entrySet().stream().sorted((Comparator)this.id_class[id_protected[4]]).forEach(entry -> stringBuilder.append(this.id_class((ev_3)entry.getKey(), (Integer)entry.getValue(), id_break[0], id_byte[0])).append(id_throws[0]));
        return Pair.of((Object)stringBuilder.toString(), (Object)map.size());
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-42, 77, 33, -63, -15, -109, 19, -22}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public rrfL_2 id_class(Comparator<Map.Entry<ev_3, Integer>> comparator) {
        Comparator<Map.Entry<ev_3, Integer>> comparator2;
        this.id_class[rrfL_2.id_protected[6]] = comparator2 = comparator;
        return this;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x198B56B842984944L;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x2F7CDEA3;
    }

    private static void id_class() {
        id_throws = new String[]{new String("\n")};
    }

    public String id_class(ev_3 ev_32, int n, int n2, int n3) {
        rgn_3 rgn_32 = new rgn_3(ev_32.id_catch());
        return rgn_32.getString().substring(n2, n3) + n;
    }

    public rrfL_2 id_class(ev_3 ... ev_3Array) {
        List<ev_3> list;
        this.id_class[rrfL_2.id_protected[5]] = list = List.of(ev_3Array);
        return this;
    }

    private static void id_break() {
        id_byte = new byte[]{2, 2};
    }

    private void id_throws() {
        if (this.id_class == null) {
            this.id_class = new Object[2];
        }
    }

    private static /* synthetic */ void ntfClinit() {
        rrfL_2.id_byte();
        rrfL_2.id_class();
        rrfL_2.id_protected();
        rrfL_2.id_break();
    }

    private static void id_protected() {
        short[] sArray = new short[8];
        sArray[1] = 1;
        sArray[4] = 1;
        sArray[6] = 1;
        id_protected = sArray;
    }
}

