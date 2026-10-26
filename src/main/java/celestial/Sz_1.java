/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Sm_1;
import celestial.rrfp_3;
import celestial.rrfq_3;
import celestial.xd_3;
import celestial.xu_3;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.function.LongSupplier;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class Sz_1
extends Enum<Sz_1>
implements Sm_1 {
    public Object[] fieldsdce61febeabf31e796c6d56c411faa28;
    private static long[] longsdce61febeabf31e796c6d56c411faa28;
    private static byte[] bytesdce61febeabf31e796c6d56c411faa28;
    private static boolean[] booleansdce61febeabf31e796c6d56c411faa28;
    private static short[] shortsdce61febeabf31e796c6d56c411faa28;
    public static Object[] staticFieldsdce61febeabf31e796c6d56c411faa28;
    private static String[] stringsdce61febeabf31e796c6d56c411faa28;

    public String id_byte() {
        return (String)this.fieldsdce61febeabf31e796c6d56c411faa28[shortsdce61febeabf31e796c6d56c411faa28[9]];
    }

    private static long id_byte(long l) {
        return Long.rotateLeft(l, 32) ^ 0x9DFBEDCF484F8F25L;
    }

    private static void id_int() {
        boolean[] blArray = new boolean[7];
        blArray[2] = true;
        blArray[5] = true;
        blArray[6] = true;
        booleansdce61febeabf31e796c6d56c411faa28 = blArray;
    }

    private Sz_1(String string2, LongSupplier longSupplier, LongSupplier longSupplier2, Set<xd_3> set, Set<xd_3> set2) {
        Set<xd_3> set3;
        Set<xd_3> set4;
        this.id_volatile();
        String string3 = string2;
        this.fieldsdce61febeabf31e796c6d56c411faa28[Sz_1.shortsdce61febeabf31e796c6d56c411faa28[1]] = string3;
        LongSupplier longSupplier3 = longSupplier;
        this.fieldsdce61febeabf31e796c6d56c411faa28[Sz_1.shortsdce61febeabf31e796c6d56c411faa28[2]] = longSupplier3;
        this.fieldsdce61febeabf31e796c6d56c411faa28[Sz_1.shortsdce61febeabf31e796c6d56c411faa28[3]] = set4 = set2;
        this.fieldsdce61febeabf31e796c6d56c411faa28[Sz_1.shortsdce61febeabf31e796c6d56c411faa28[4]] = set3 = set;
        LongSupplier longSupplier4 = longSupplier2;
        this.fieldsdce61febeabf31e796c6d56c411faa28[Sz_1.shortsdce61febeabf31e796c6d56c411faa28[5]] = longSupplier4;
    }

    private Sz_1(String string2, long l, long l2, Set<xd_3> set) {
        this(string2, () -> l, () -> l2, set, null);
    }

    private Sz_1(String string2, long l, long l2, Set<xd_3> set, Set<xd_3> set2) {
        this(string2, () -> l, () -> l2, set, set2);
    }

    static {
        Sz_1.ntfClinit();
    }

    public static Sz_1[] values() {
        return (Sz_1[])((Sz_1[])staticFieldsdce61febeabf31e796c6d56c411faa28[shortsdce61febeabf31e796c6d56c411faa28[0]]).clone();
    }

    public static Sz_1 valueOf(String string) {
        return Enum.valueOf(Sz_1.class, string);
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-87, 61, 32, -26, -83, -49, -23, -72}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public Set<xd_3> id_class() {
        return (Set)this.fieldsdce61febeabf31e796c6d56c411faa28[shortsdce61febeabf31e796c6d56c411faa28[12]];
    }

    public static Sz_1 id_class(Collection<xd_3> collection) {
        Sz_1[] sz_1Array = (Sz_1[])staticFieldsdce61febeabf31e796c6d56c411faa28[shortsdce61febeabf31e796c6d56c411faa28[6]];
        int n = sz_1Array.length;
        for (int i = booleansdce61febeabf31e796c6d56c411faa28[0]; i < n; ++i) {
            Sz_1 sz_1 = sz_1Array[i];
            Set<xd_3> set = sz_1.id_class();
            if (set.equals(collection)) {
                return sz_1;
            }
            Set<xd_3> set2 = sz_1.id_catch();
            if (set2 == null) continue;
            HashSet<xd_3> hashSet = new HashSet<xd_3>(set);
            hashSet.addAll(set2);
            if (!hashSet.equals(collection)) continue;
            return sz_1;
        }
        return null;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x3BD2018;
    }

    public LongSupplier id_break() {
        return (LongSupplier)this.fieldsdce61febeabf31e796c6d56c411faa28[shortsdce61febeabf31e796c6d56c411faa28[11]];
    }

    @Override
    public Stream<xd_3> id_throws() {
        return ((Set)this.fieldsdce61febeabf31e796c6d56c411faa28[shortsdce61febeabf31e796c6d56c411faa28[7]]).stream();
    }

    private static /* synthetic */ void ntfClinit() {
        Sz_1.id_int();
        Sz_1.id_finally();
        Sz_1.id_native();
        Sz_1.id_extends();
        Sz_1.id_implements();
        Sz_1.id_package();
    }

    private static void id_finally() {
        stringsdce61febeabf31e796c6d56c411faa28 = new String[]{new String("DEFAULT"), new String("\u041e\u0431\u044b\u0447\u043d\u044b\u0439"), new String("DRAGON"), new String("\u0414\u0440\u0430\u043a\u043e\u043d\u0438\u0439"), new String("PEARL"), new String("\u0416\u0435\u043c\u0447\u0443\u0436\u043d\u044b\u0439"), new String("MYSTIC"), new String("\u041c\u0438\u0441\u0442\u0438\u0447\u0435\u0441\u043a\u0438\u0439"), new String("GHOST"), new String("\u041f\u0440\u0438\u0437\u0440\u0430\u0447\u043d\u044b\u0439"), new String("NIGHTMARISH"), new String("\u041a\u043e\u0448\u043c\u0430\u0440\u043d\u044b\u0439"), new String("SPOOKY"), new String("\u0417\u043b\u043e\u0432\u0435\u0449\u0438\u0439"), new String("LETHAL"), new String("\u0421\u043c\u0435\u0440\u0442\u0435\u043b\u044c\u043d\u044b\u0439"), new String("CRUEL"), new String("\u0416\u0435\u0441\u0442\u043e\u043a\u0438\u0439"), new String("ICY"), new String("\u041b\u0435\u0434\u044f\u043d\u043e\u0439"), new String("INSIDIOUS"), new String("\u041a\u043e\u0432\u0430\u0440\u043d\u044b\u0439"), new String("CURSED"), new String("\u041f\u0440\u043e\u043a\u043b\u044f\u0442\u044b\u0439"), new String("EXCRUCIATING"), new String("\u041c\u0443\u0447\u0438\u0442\u0435\u043b\u044c\u043d\u044b\u0439"), new String("ROYAL"), new String("\u0426\u0430\u0440\u0441\u043a\u0438\u0439"), new String("SINGULAR"), new String("\u0421\u0438\u043d\u0433\u0443\u043b\u044f\u0440\u043d\u044b\u0439"), new String("UNVOIDABLE"), new String("\u041d\u0435\u0438\u0437\u0431\u0435\u0436\u043d\u044b\u0439")};
    }

    public Set<xd_3> id_catch() {
        return (Set)this.fieldsdce61febeabf31e796c6d56c411faa28[shortsdce61febeabf31e796c6d56c411faa28[13]];
    }

    private static void id_extends() {
        short[] sArray = new short[34];
        sArray[0] = 17;
        sArray[2] = 1;
        sArray[3] = 4;
        sArray[4] = 3;
        sArray[5] = 2;
        sArray[6] = 16;
        sArray[7] = 3;
        sArray[8] = 3;
        sArray[10] = 1;
        sArray[11] = 2;
        sArray[12] = 3;
        sArray[13] = 4;
        sArray[14] = 1;
        sArray[15] = 4;
        sArray[16] = 1;
        sArray[17] = 4;
        sArray[19] = 1;
        sArray[20] = 2;
        sArray[21] = 3;
        sArray[22] = 4;
        sArray[23] = 5;
        sArray[24] = 6;
        sArray[25] = 7;
        sArray[26] = 8;
        sArray[27] = 9;
        sArray[28] = 10;
        sArray[29] = 11;
        sArray[30] = 12;
        sArray[31] = 13;
        sArray[32] = 14;
        sArray[33] = 15;
        shortsdce61febeabf31e796c6d56c411faa28 = sArray;
    }

    @Override
    public int id_case() {
        return ((Set)this.fieldsdce61febeabf31e796c6d56c411faa28[shortsdce61febeabf31e796c6d56c411faa28[8]]).size();
    }

    private static void id_implements() {
        bytesdce61febeabf31e796c6d56c411faa28 = new byte[]{16, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7, 7, 8, 8, 9, 9, 10, 10, 11, 11, 12, 12, 13, 13, 14, 14, 15, 15, 17, 16, 5, 18};
    }

    private static /* synthetic */ Sz_1[] id_new() {
        Sz_1[] sz_1Array = new Sz_1[bytesdce61febeabf31e796c6d56c411faa28[0]];
        sz_1Array[Sz_1.booleansdce61febeabf31e796c6d56c411faa28[1]] = (Sz_1)staticFieldsdce61febeabf31e796c6d56c411faa28[shortsdce61febeabf31e796c6d56c411faa28[18]];
        sz_1Array[Sz_1.booleansdce61febeabf31e796c6d56c411faa28[2]] = (Sz_1)staticFieldsdce61febeabf31e796c6d56c411faa28[shortsdce61febeabf31e796c6d56c411faa28[19]];
        sz_1Array[Sz_1.bytesdce61febeabf31e796c6d56c411faa28[1]] = (Sz_1)staticFieldsdce61febeabf31e796c6d56c411faa28[shortsdce61febeabf31e796c6d56c411faa28[20]];
        sz_1Array[Sz_1.bytesdce61febeabf31e796c6d56c411faa28[2]] = (Sz_1)staticFieldsdce61febeabf31e796c6d56c411faa28[shortsdce61febeabf31e796c6d56c411faa28[21]];
        sz_1Array[Sz_1.bytesdce61febeabf31e796c6d56c411faa28[3]] = (Sz_1)staticFieldsdce61febeabf31e796c6d56c411faa28[shortsdce61febeabf31e796c6d56c411faa28[22]];
        sz_1Array[Sz_1.bytesdce61febeabf31e796c6d56c411faa28[4]] = (Sz_1)staticFieldsdce61febeabf31e796c6d56c411faa28[shortsdce61febeabf31e796c6d56c411faa28[23]];
        sz_1Array[Sz_1.bytesdce61febeabf31e796c6d56c411faa28[5]] = (Sz_1)staticFieldsdce61febeabf31e796c6d56c411faa28[shortsdce61febeabf31e796c6d56c411faa28[24]];
        sz_1Array[Sz_1.bytesdce61febeabf31e796c6d56c411faa28[6]] = (Sz_1)staticFieldsdce61febeabf31e796c6d56c411faa28[shortsdce61febeabf31e796c6d56c411faa28[25]];
        sz_1Array[Sz_1.bytesdce61febeabf31e796c6d56c411faa28[7]] = (Sz_1)staticFieldsdce61febeabf31e796c6d56c411faa28[shortsdce61febeabf31e796c6d56c411faa28[26]];
        sz_1Array[Sz_1.bytesdce61febeabf31e796c6d56c411faa28[8]] = (Sz_1)staticFieldsdce61febeabf31e796c6d56c411faa28[shortsdce61febeabf31e796c6d56c411faa28[27]];
        sz_1Array[Sz_1.bytesdce61febeabf31e796c6d56c411faa28[9]] = (Sz_1)staticFieldsdce61febeabf31e796c6d56c411faa28[shortsdce61febeabf31e796c6d56c411faa28[28]];
        sz_1Array[Sz_1.bytesdce61febeabf31e796c6d56c411faa28[10]] = (Sz_1)staticFieldsdce61febeabf31e796c6d56c411faa28[shortsdce61febeabf31e796c6d56c411faa28[29]];
        sz_1Array[Sz_1.bytesdce61febeabf31e796c6d56c411faa28[11]] = (Sz_1)staticFieldsdce61febeabf31e796c6d56c411faa28[shortsdce61febeabf31e796c6d56c411faa28[30]];
        sz_1Array[Sz_1.bytesdce61febeabf31e796c6d56c411faa28[12]] = (Sz_1)staticFieldsdce61febeabf31e796c6d56c411faa28[shortsdce61febeabf31e796c6d56c411faa28[31]];
        sz_1Array[Sz_1.bytesdce61febeabf31e796c6d56c411faa28[13]] = (Sz_1)staticFieldsdce61febeabf31e796c6d56c411faa28[shortsdce61febeabf31e796c6d56c411faa28[32]];
        sz_1Array[Sz_1.bytesdce61febeabf31e796c6d56c411faa28[14]] = (Sz_1)staticFieldsdce61febeabf31e796c6d56c411faa28[shortsdce61febeabf31e796c6d56c411faa28[33]];
        return sz_1Array;
    }

    private static void id_package() {
        Object[] objectArray;
        objectArray = new Object[]{new Sz_1(stringsdce61febeabf31e796c6d56c411faa28[1], 20L, 60L, Set.of((Object)xu_3.id_catch, (Object)xu_3.OJ, (Object)xu_3.id_volatile)), new Sz_1(stringsdce61febeabf31e796c6d56c411faa28[3], () -> (rrfq_3)((Object)((Object)((Object)rrfp_3.id_class[shortsdce61febeabf31e796c6d56c411faa28[16]]))) == (rrfq_3)((Object)((Object)((Object)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[shortsdce61febeabf31e796c6d56c411faa28[17]]))) ? longsdce61febeabf31e796c6d56c411faa28[2] : longsdce61febeabf31e796c6d56c411faa28[3], () -> (rrfq_3)((Object)((Object)((Object)rrfp_3.id_class[shortsdce61febeabf31e796c6d56c411faa28[16]]))) == (rrfq_3)((Object)((Object)((Object)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[shortsdce61febeabf31e796c6d56c411faa28[17]]))) ? longsdce61febeabf31e796c6d56c411faa28[2] : longsdce61febeabf31e796c6d56c411faa28[3], Set.of((Object)xu_3.JL, (Object)xu_3.PD, (Object)xu_3.Jn, (Object)xu_3.bO, (Object)xu_3.JF, (Object)xu_3.Jc), Set.of((Object)xu_3.JJ)), new Sz_1(stringsdce61febeabf31e796c6d56c411faa28[5], 20L, 60L, Set.of((Object)xu_3.EZ, (Object)xu_3.Ev, (Object)xu_3.Em)), new Sz_1(stringsdce61febeabf31e796c6d56c411faa28[7], 20L, 60L, Set.of((Object)xu_3.bq, (Object)xu_3.Bd, (Object)xu_3.bH, (Object)xu_3.by)), new Sz_1(stringsdce61febeabf31e796c6d56c411faa28[9], 20L, 60L, Set.of((Object)xu_3.bX, (Object)xu_3.Bs, (Object)xu_3.sp, (Object)xu_3.sy)), new Sz_1(stringsdce61febeabf31e796c6d56c411faa28[11], 20L, 60L, Set.of((Object)xu_3.bY, (Object)xu_3.PD, (Object)xu_3.Ju)), new Sz_1(stringsdce61febeabf31e796c6d56c411faa28[13], 20L, 60L, Set.of((Object)xu_3.Bq, (Object)xu_3.By, (Object)xu_3.Jc, (Object)xu_3.Bp), Set.of((Object)xu_3.BT)), new Sz_1(stringsdce61febeabf31e796c6d56c411faa28[15], 20L, 60L, Set.of((Object)xu_3.bR, (Object)xu_3.JI, (Object)xu_3.SP, (Object)xu_3.bV)), new Sz_1(stringsdce61febeabf31e796c6d56c411faa28[17], 20L, 60L, Set.of((Object)xu_3.Jd, (Object)xu_3.JJ, (Object)xu_3.Jy, (Object)xu_3.JL, (Object)xu_3.Ju)), new Sz_1(stringsdce61febeabf31e796c6d56c411faa28[19], 20L, 60L, Set.of((Object)xu_3.Pt, (Object)xu_3.Ei, (Object)xu_3.PT)), new Sz_1(stringsdce61febeabf31e796c6d56c411faa28[21], 20L, 60L, Set.of((Object)xu_3.bR, (Object)xu_3.JI, (Object)xu_3.bg, (Object)xu_3.SP)), new Sz_1(stringsdce61febeabf31e796c6d56c411faa28[23], 20L, 60L, Set.of((Object)xu_3.Jd, (Object)xu_3.Jn, (Object)xu_3.Jk, (Object)xu_3.Ju, (Object)xu_3.JL)), new Sz_1(stringsdce61febeabf31e796c6d56c411faa28[25], 20L, 60L, Set.of((Object)xu_3.JJ, (Object)xu_3.Ju, (Object)xu_3.JL, (Object)xu_3.Ea)), new Sz_1(stringsdce61febeabf31e796c6d56c411faa28[27], 20L, 60L, Set.of((Object)xu_3.JJ, (Object)xu_3.id_throws, (Object)xu_3.id_case, (Object)xu_3.BJ), Set.of((Object)xu_3.Jy)), new Sz_1(stringsdce61febeabf31e796c6d56c411faa28[29], 20L, 60L, Set.of((Object)xu_3.MR, (Object)xu_3.Ea)), new Sz_1(stringsdce61febeabf31e796c6d56c411faa28[31], 20L, 60L, Set.of((Object)xu_3.id_catch, (Object)xu_3.OJ, (Object)xu_3.PD)), new Sz_1[]{(Sz_1)objectArray[0], (Sz_1)objectArray[1], (Sz_1)objectArray[2], (Sz_1)objectArray[3], (Sz_1)objectArray[4], (Sz_1)objectArray[5], (Sz_1)objectArray[6], (Sz_1)objectArray[7], (Sz_1)objectArray[8], (Sz_1)objectArray[9], (Sz_1)objectArray[10], (Sz_1)objectArray[11], (Sz_1)objectArray[12], (Sz_1)objectArray[13], (Sz_1)objectArray[14], (Sz_1)objectArray[15]}, new Sz_1[]{(Sz_1)objectArray[0], (Sz_1)objectArray[1], (Sz_1)objectArray[2], (Sz_1)objectArray[3], (Sz_1)objectArray[4], (Sz_1)objectArray[5], (Sz_1)objectArray[6], (Sz_1)objectArray[7], (Sz_1)objectArray[8], (Sz_1)objectArray[9], (Sz_1)objectArray[10], (Sz_1)objectArray[11], (Sz_1)objectArray[12], (Sz_1)objectArray[13], (Sz_1)objectArray[14], (Sz_1)objectArray[15]}};
        staticFieldsdce61febeabf31e796c6d56c411faa28 = objectArray;
    }

    public LongSupplier id_protected() {
        return (LongSupplier)this.fieldsdce61febeabf31e796c6d56c411faa28[shortsdce61febeabf31e796c6d56c411faa28[10]];
    }

    public /* synthetic */ Collection id_private() {
        return this.id_class();
    }

    private static /* synthetic */ long id_final() {
        return (rrfq_3)((Object)rrfp_3.id_class[shortsdce61febeabf31e796c6d56c411faa28[14]]) == (rrfq_3)((Object)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[shortsdce61febeabf31e796c6d56c411faa28[15]]) ? longsdce61febeabf31e796c6d56c411faa28[0] : longsdce61febeabf31e796c6d56c411faa28[1];
    }

    private void id_volatile() {
        if (this.fieldsdce61febeabf31e796c6d56c411faa28 == null) {
            Object[] objectArray = this.fieldsdce61febeabf31e796c6d56c411faa28 = new Object[bytesdce61febeabf31e796c6d56c411faa28[45]];
        }
    }

    private static void id_native() {
        longsdce61febeabf31e796c6d56c411faa28 = new long[]{30L, 60L, 30L, 20L, 20L, 60L, 20L, 60L, 20L, 60L, 20L, 60L, 20L, 60L, 20L, 60L, 20L, 60L, 20L, 60L, 20L, 60L, 20L, 60L, 20L, 60L, 20L, 60L, 20L, 60L, 20L, 60L, 20L, 60L};
    }
}

