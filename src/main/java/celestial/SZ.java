/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Sm_1;
import celestial.xd_3;
import celestial.xu_3;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Collection;
import java.util.Set;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class SZ
extends Enum<SZ>
implements Sm_1 {
    private static byte[] bytes42f0bef4cd2c3bea87db6b6dddd86070;
    public static Object[] staticFields42f0bef4cd2c3bea87db6b6dddd86070;
    public Object[] fields42f0bef4cd2c3bea87db6b6dddd86070;
    private static long[] longs42f0bef4cd2c3bea87db6b6dddd86070;
    private static boolean[] booleans42f0bef4cd2c3bea87db6b6dddd86070;
    private static String[] strings42f0bef4cd2c3bea87db6b6dddd86070;
    private static short[] shorts42f0bef4cd2c3bea87db6b6dddd86070;

    public long id_byte() {
        return (Long)this.fields42f0bef4cd2c3bea87db6b6dddd86070[shorts42f0bef4cd2c3bea87db6b6dddd86070[5]];
    }

    private SZ(String string2, long l, Set<xd_3> set) {
        Set<xd_3> set2;
        this.id_protected();
        String string3 = string2;
        this.fields42f0bef4cd2c3bea87db6b6dddd86070[SZ.shorts42f0bef4cd2c3bea87db6b6dddd86070[7]] = string3;
        Long l2 = l;
        this.fields42f0bef4cd2c3bea87db6b6dddd86070[SZ.shorts42f0bef4cd2c3bea87db6b6dddd86070[8]] = l2;
        this.fields42f0bef4cd2c3bea87db6b6dddd86070[SZ.shorts42f0bef4cd2c3bea87db6b6dddd86070[9]] = set2 = set;
    }

    static {
        SZ.ntfClinit();
    }

    public static SZ[] values() {
        return (SZ[])((SZ[])staticFields42f0bef4cd2c3bea87db6b6dddd86070[shorts42f0bef4cd2c3bea87db6b6dddd86070[0]]).clone();
    }

    public static SZ valueOf(String string) {
        return Enum.valueOf(SZ.class, string);
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-58, 78, -59, -58, 65, 85, 44, -98}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x7C49F1DEDF149237L;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xDC8D003D;
    }

    public static SZ id_class(Collection<xd_3> collection) {
        SZ[] sZArray = (SZ[])staticFields42f0bef4cd2c3bea87db6b6dddd86070[shorts42f0bef4cd2c3bea87db6b6dddd86070[1]];
        int n = sZArray.length;
        for (int i = booleans42f0bef4cd2c3bea87db6b6dddd86070[0]; i < n; ++i) {
            SZ sZ = sZArray[i];
            if (!sZ.id_class().equals(collection)) continue;
            return sZ;
        }
        return null;
    }

    public Set<xd_3> id_class() {
        return (Set)this.fields42f0bef4cd2c3bea87db6b6dddd86070[shorts42f0bef4cd2c3bea87db6b6dddd86070[6]];
    }

    public String id_break() {
        return (String)this.fields42f0bef4cd2c3bea87db6b6dddd86070[shorts42f0bef4cd2c3bea87db6b6dddd86070[4]];
    }

    @Override
    public Stream<xd_3> id_throws() {
        return ((Set)this.fields42f0bef4cd2c3bea87db6b6dddd86070[shorts42f0bef4cd2c3bea87db6b6dddd86070[2]]).stream();
    }

    private static /* synthetic */ void ntfClinit() {
        SZ.id_volatile();
        SZ.id_implements();
        SZ.id_final();
        SZ.id_catch();
        SZ.id_extends();
        SZ.id_finally();
    }

    private static void id_finally() {
        Object[] objectArray;
        objectArray = new Object[]{new SZ(strings42f0bef4cd2c3bea87db6b6dddd86070[1], 15L, Set.of((Object)xu_3.id_volatile, (Object)xu_3.OJ, (Object)xu_3.hN, (Object)xu_3.id_catch)), new SZ(strings42f0bef4cd2c3bea87db6b6dddd86070[3], 30L, Set.of((Object)xu_3.JC, (Object)xu_3.Jn, (Object)xu_3.PD, (Object)xu_3.Jl, (Object)xu_3.JJ, (Object)xu_3.Jk, (Object)xu_3.JL, (Object)xu_3.Ge, (Object)xu_3.Jc, (Object)xu_3.JF)), new SZ(strings42f0bef4cd2c3bea87db6b6dddd86070[5], 15L, Set.of((Object)xu_3.Ev, (Object)xu_3.EZ, (Object)xu_3.EA, (Object)xu_3.Em, (Object)xu_3.EH, (Object)xu_3.El)), new SZ(strings42f0bef4cd2c3bea87db6b6dddd86070[7], 15L, Set.of((Object)xu_3.bH, (Object)xu_3.by, (Object)xu_3.bp, (Object)xu_3.hK, (Object)xu_3.bq, (Object)xu_3.Sh, (Object)xu_3.Bd)), new SZ(strings42f0bef4cd2c3bea87db6b6dddd86070[9], 15L, Set.of((Object)xu_3.sp, (Object)xu_3.sy, (Object)xu_3.EH, (Object)xu_3.Bs, (Object)xu_3.hl, (Object)xu_3.sq, (Object)xu_3.id_throws)), new SZ(strings42f0bef4cd2c3bea87db6b6dddd86070[11], 15L, Set.of((Object)xu_3.sy, (Object)xu_3.bY, (Object)xu_3.PD, (Object)xu_3.Ju, (Object)xu_3.Jv)), new SZ(strings42f0bef4cd2c3bea87db6b6dddd86070[13], 15L, Set.of((Object)xu_3.bS, (Object)xu_3.hV, (Object)xu_3.Jc, (Object)xu_3.BT, (Object)xu_3.Bp, (Object)xu_3.By, (Object)xu_3.Ba, (Object)xu_3.Bq)), new SZ(strings42f0bef4cd2c3bea87db6b6dddd86070[15], 15L, Set.of((Object)xu_3.bR, (Object)xu_3.hc, (Object)xu_3.JI, (Object)xu_3.hY, (Object)xu_3.SP, (Object)xu_3.bV)), new SZ(strings42f0bef4cd2c3bea87db6b6dddd86070[17], 15L, Set.of((Object)xu_3.Jd, (Object)xu_3.JC, (Object)xu_3.JJ, (Object)xu_3.Jy, (Object)xu_3.JL, (Object)xu_3.Ju, (Object)xu_3.Jv)), new SZ(strings42f0bef4cd2c3bea87db6b6dddd86070[19], 15L, Set.of((Object)xu_3.Pq, (Object)xu_3.Mn, (Object)xu_3.Pt, (Object)xu_3.Ei, (Object)xu_3.PT)), new SZ(strings42f0bef4cd2c3bea87db6b6dddd86070[21], 15L, Set.of((Object)xu_3.bR, (Object)xu_3.SS, (Object)xu_3.hc, (Object)xu_3.JI, (Object)xu_3.bs, (Object)xu_3.bg, (Object)xu_3.SP)), new SZ(strings42f0bef4cd2c3bea87db6b6dddd86070[23], 15L, Set.of((Object)xu_3.Jd, (Object)xu_3.Jn, (Object)xu_3.Jl, (Object)xu_3.JJ, (Object)xu_3.Jk, (Object)xu_3.JL, (Object)xu_3.Ju, (Object)xu_3.Jm, (Object)xu_3.Jv, (Object)xu_3.JA)), new SZ(strings42f0bef4cd2c3bea87db6b6dddd86070[25], 15L, Set.of((Object)xu_3.JC, (Object)xu_3.MR, (Object)xu_3.Jl, (Object)xu_3.JJ, (Object)xu_3.JL, (Object)xu_3.Ju, (Object)xu_3.Ea, (Object)xu_3.Jw, (Object)xu_3.Jm)), new SZ(strings42f0bef4cd2c3bea87db6b6dddd86070[27], 15L, Set.of((Object)xu_3.JJ, (Object)xu_3.hD, (Object)xu_3.hm, (Object)xu_3.Jy, (Object)xu_3.id_throws, (Object)xu_3.id_case, (Object)xu_3.BJ, (Object)xu_3.hL)), new SZ(strings42f0bef4cd2c3bea87db6b6dddd86070[29], 15L, Set.of((Object)xu_3.MR, (Object)xu_3.Ea, (Object)xu_3.Jv)), new SZ(strings42f0bef4cd2c3bea87db6b6dddd86070[31], 15L, Set.of((Object)xu_3.id_catch, (Object)xu_3.OJ, (Object)xu_3.PD, (Object)xu_3.hN)), new SZ[]{(SZ)objectArray[0], (SZ)objectArray[1], (SZ)objectArray[2], (SZ)objectArray[3], (SZ)objectArray[4], (SZ)objectArray[5], (SZ)objectArray[6], (SZ)objectArray[7], (SZ)objectArray[8], (SZ)objectArray[9], (SZ)objectArray[10], (SZ)objectArray[11], (SZ)objectArray[12], (SZ)objectArray[13], (SZ)objectArray[14], (SZ)objectArray[15]}, new SZ[]{(SZ)objectArray[0], (SZ)objectArray[1], (SZ)objectArray[2], (SZ)objectArray[3], (SZ)objectArray[4], (SZ)objectArray[5], (SZ)objectArray[6], (SZ)objectArray[7], (SZ)objectArray[8], (SZ)objectArray[9], (SZ)objectArray[10], (SZ)objectArray[11], (SZ)objectArray[12], (SZ)objectArray[13], (SZ)objectArray[14], (SZ)objectArray[15]}};
        staticFields42f0bef4cd2c3bea87db6b6dddd86070 = objectArray;
    }

    private static void id_catch() {
        short[] sArray = new short[26];
        sArray[0] = 17;
        sArray[1] = 16;
        sArray[2] = 2;
        sArray[3] = 2;
        sArray[5] = 1;
        sArray[6] = 2;
        sArray[8] = 1;
        sArray[9] = 2;
        sArray[11] = 1;
        sArray[12] = 2;
        sArray[13] = 3;
        sArray[14] = 4;
        sArray[15] = 5;
        sArray[16] = 6;
        sArray[17] = 7;
        sArray[18] = 8;
        sArray[19] = 9;
        sArray[20] = 10;
        sArray[21] = 11;
        sArray[22] = 12;
        sArray[23] = 13;
        sArray[24] = 14;
        sArray[25] = 15;
        shorts42f0bef4cd2c3bea87db6b6dddd86070 = sArray;
    }

    private static void id_extends() {
        bytes42f0bef4cd2c3bea87db6b6dddd86070 = new byte[]{16, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7, 7, 8, 8, 9, 9, 10, 10, 11, 11, 12, 12, 13, 13, 14, 14, 15, 15, 17, 16, 3, 18};
    }

    @Override
    public int id_case() {
        return ((Set)this.fields42f0bef4cd2c3bea87db6b6dddd86070[shorts42f0bef4cd2c3bea87db6b6dddd86070[3]]).size();
    }

    private static void id_implements() {
        strings42f0bef4cd2c3bea87db6b6dddd86070 = new String[]{new String("DEFAULT"), new String("\u041e\u0431\u044b\u0447\u043d\u0430\u044f"), new String("DRAGON"), new String("\u0414\u0440\u0430\u043a\u043e\u043d\u044c\u044f"), new String("PEARL"), new String("\u0416\u0435\u043c\u0447\u0443\u0436\u043d\u0430\u044f"), new String("MYSTIC"), new String("\u041c\u0438\u0441\u0442\u0438\u0447\u0435\u0441\u043a\u0430\u044f"), new String("GHOST"), new String("\u041f\u0440\u0438\u0437\u0440\u0430\u0447\u043d\u0430\u044f"), new String("NIGHTMARISH"), new String("\u041a\u043e\u0448\u043c\u0430\u0440\u043d\u0430\u044f"), new String("SPOOKY"), new String("\u0417\u043b\u043e\u0432\u0435\u0449\u0430\u044f"), new String("LETHAL"), new String("\u0421\u043c\u0435\u0440\u0442\u0435\u043b\u044c\u043d\u0430\u044f"), new String("CRUEL"), new String("\u0416\u0435\u0441\u0442\u043e\u043a\u0430\u044f"), new String("ICY"), new String("\u041b\u0435\u0434\u044f\u043d\u0430\u044f"), new String("INSIDIOUS"), new String("\u041a\u043e\u0432\u0430\u0440\u043d\u0430\u044f"), new String("CURSED"), new String("\u041f\u0440\u043e\u043a\u043b\u044f\u0442\u0430\u044f"), new String("EXCRUCIATING"), new String("\u041c\u0443\u0447\u0438\u0442\u0435\u043b\u044c\u043d\u0430\u044f"), new String("ROYAL"), new String("\u0426\u0430\u0440\u0441\u043a\u0430\u044f"), new String("SINGULAR"), new String("\u0421\u0438\u043d\u0433\u0443\u043b\u044f\u0440\u043d\u0430\u044f"), new String("UNVOIDABLE"), new String("\u041d\u0435\u0438\u0437\u0431\u0435\u0436\u043d\u0430\u044f")};
    }

    private void id_protected() {
        if (this.fields42f0bef4cd2c3bea87db6b6dddd86070 == null) {
            Object[] objectArray = this.fields42f0bef4cd2c3bea87db6b6dddd86070 = new Object[bytes42f0bef4cd2c3bea87db6b6dddd86070[45]];
            objectArray[SZ.booleans42f0bef4cd2c3bea87db6b6dddd86070[7]] = longs42f0bef4cd2c3bea87db6b6dddd86070[16];
        }
    }

    public /* synthetic */ Collection id_private() {
        return this.id_class();
    }

    private static void id_final() {
        long[] lArray = new long[17];
        lArray[0] = 15L;
        lArray[1] = 30L;
        lArray[2] = 15L;
        lArray[3] = 15L;
        lArray[4] = 15L;
        lArray[5] = 15L;
        lArray[6] = 15L;
        lArray[7] = 15L;
        lArray[8] = 15L;
        lArray[9] = 15L;
        lArray[10] = 15L;
        lArray[11] = 15L;
        lArray[12] = 15L;
        lArray[13] = 15L;
        lArray[14] = 15L;
        lArray[15] = 15L;
        longs42f0bef4cd2c3bea87db6b6dddd86070 = lArray;
    }

    private static void id_volatile() {
        boolean[] blArray = new boolean[8];
        blArray[2] = true;
        blArray[5] = true;
        blArray[6] = true;
        blArray[7] = true;
        booleans42f0bef4cd2c3bea87db6b6dddd86070 = blArray;
    }

    private static /* synthetic */ SZ[] id_native() {
        SZ[] sZArray = new SZ[bytes42f0bef4cd2c3bea87db6b6dddd86070[0]];
        sZArray[SZ.booleans42f0bef4cd2c3bea87db6b6dddd86070[1]] = (SZ)staticFields42f0bef4cd2c3bea87db6b6dddd86070[shorts42f0bef4cd2c3bea87db6b6dddd86070[10]];
        sZArray[SZ.booleans42f0bef4cd2c3bea87db6b6dddd86070[2]] = (SZ)staticFields42f0bef4cd2c3bea87db6b6dddd86070[shorts42f0bef4cd2c3bea87db6b6dddd86070[11]];
        sZArray[SZ.bytes42f0bef4cd2c3bea87db6b6dddd86070[1]] = (SZ)staticFields42f0bef4cd2c3bea87db6b6dddd86070[shorts42f0bef4cd2c3bea87db6b6dddd86070[12]];
        sZArray[SZ.bytes42f0bef4cd2c3bea87db6b6dddd86070[2]] = (SZ)staticFields42f0bef4cd2c3bea87db6b6dddd86070[shorts42f0bef4cd2c3bea87db6b6dddd86070[13]];
        sZArray[SZ.bytes42f0bef4cd2c3bea87db6b6dddd86070[3]] = (SZ)staticFields42f0bef4cd2c3bea87db6b6dddd86070[shorts42f0bef4cd2c3bea87db6b6dddd86070[14]];
        sZArray[SZ.bytes42f0bef4cd2c3bea87db6b6dddd86070[4]] = (SZ)staticFields42f0bef4cd2c3bea87db6b6dddd86070[shorts42f0bef4cd2c3bea87db6b6dddd86070[15]];
        sZArray[SZ.bytes42f0bef4cd2c3bea87db6b6dddd86070[5]] = (SZ)staticFields42f0bef4cd2c3bea87db6b6dddd86070[shorts42f0bef4cd2c3bea87db6b6dddd86070[16]];
        sZArray[SZ.bytes42f0bef4cd2c3bea87db6b6dddd86070[6]] = (SZ)staticFields42f0bef4cd2c3bea87db6b6dddd86070[shorts42f0bef4cd2c3bea87db6b6dddd86070[17]];
        sZArray[SZ.bytes42f0bef4cd2c3bea87db6b6dddd86070[7]] = (SZ)staticFields42f0bef4cd2c3bea87db6b6dddd86070[shorts42f0bef4cd2c3bea87db6b6dddd86070[18]];
        sZArray[SZ.bytes42f0bef4cd2c3bea87db6b6dddd86070[8]] = (SZ)staticFields42f0bef4cd2c3bea87db6b6dddd86070[shorts42f0bef4cd2c3bea87db6b6dddd86070[19]];
        sZArray[SZ.bytes42f0bef4cd2c3bea87db6b6dddd86070[9]] = (SZ)staticFields42f0bef4cd2c3bea87db6b6dddd86070[shorts42f0bef4cd2c3bea87db6b6dddd86070[20]];
        sZArray[SZ.bytes42f0bef4cd2c3bea87db6b6dddd86070[10]] = (SZ)staticFields42f0bef4cd2c3bea87db6b6dddd86070[shorts42f0bef4cd2c3bea87db6b6dddd86070[21]];
        sZArray[SZ.bytes42f0bef4cd2c3bea87db6b6dddd86070[11]] = (SZ)staticFields42f0bef4cd2c3bea87db6b6dddd86070[shorts42f0bef4cd2c3bea87db6b6dddd86070[22]];
        sZArray[SZ.bytes42f0bef4cd2c3bea87db6b6dddd86070[12]] = (SZ)staticFields42f0bef4cd2c3bea87db6b6dddd86070[shorts42f0bef4cd2c3bea87db6b6dddd86070[23]];
        sZArray[SZ.bytes42f0bef4cd2c3bea87db6b6dddd86070[13]] = (SZ)staticFields42f0bef4cd2c3bea87db6b6dddd86070[shorts42f0bef4cd2c3bea87db6b6dddd86070[24]];
        sZArray[SZ.bytes42f0bef4cd2c3bea87db6b6dddd86070[14]] = (SZ)staticFields42f0bef4cd2c3bea87db6b6dddd86070[shorts42f0bef4cd2c3bea87db6b6dddd86070[25]];
        return sZArray;
    }
}

