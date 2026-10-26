/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableSet
 *  io.netty.util.concurrent.ThreadPerTaskExecutor
 *  javax.annotation.Nonnull
 */
package celestial;

import celestial.rAC;
import celestial.rAI;
import celestial.rAf_1;
import celestial.rAj_1;
import celestial.rAm_1;
import celestial.rAp_1;
import celestial.rAt_1;
import celestial.rdb_3;
import celestial.rdn_3;
import celestial.rfH_2;
import celestial.ri_3;
import celestial.rjU_2;
import celestial.rpL_2;
import celestial.rqO_2;
import celestial.rqg_3;
import celestial.rzC_2;
import celestial.rzP_2;
import celestial.rzQ_2;
import celestial.rzZ_2;
import celestial.rzl_3;
import celestial.rzz_3;
import celestial.xc_3;
import celestial.xd_3;
import com.google.common.collect.ImmutableSet;
import io.netty.util.concurrent.ThreadPerTaskExecutor;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.annotation.Nonnull;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class re_3 {
    public static Object[] id_class;
    private static byte[] id_byte;
    private static String[] id_protected;
    private static boolean[] id_throws;
    private static short[] id_case;
    public Object[] id_break;

    private static synchronized List<rdb_3> id_byte(xd_3 xd_33) {
        return ((Map)id_class[id_case[28]]).computeIfAbsent(xd_33, xd_32 -> {
            rqO_2 rqO_22 = xd_32.id_throws();
            if (rqO_22 == rzl_3.id_class) {
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            re_3.id_byte().id_class(rqO_22).id_break(new rzP_2(null).id_class(new Random()).id_class(rzQ_2.id_case, rjU_2.id_byte(rfH_2.id_case)).id_class(rzQ_2.id_implements, rdn_3.id_break).id_break(rzQ_2.id_private, null).id_class(rzQ_2.id_catch, xd_32.id_continue()).id_class(rzz_3.id_native), rdn_32 -> arrayList.add(rdn_32.id_break()));
            return arrayList;
        });
    }

    private static int id_byte(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x3F80A696;
    }

    public static rzC_2 id_byte() {
        if ((rzC_2)id_class[id_case[22]] == null) {
            rAm_1[] rAm_1Array = new rAm_1[id_throws[7]];
            rAm_1Array[re_3.id_throws[8]] = new rAf_1();
            rAt_1 rAt_12 = new rAt_1(rAp_1::new, rAm_1Array);
            rAt_12.id_class();
            rAC rAC2 = rAt_12.id_byte().iterator().next().id_protected();
            rAj_1 rAj_12 = new rAj_1(rAI.SERVER_DATA);
            rzC_2 rzC_22 = new rzC_2((rzZ_2)id_class[id_case[23]]);
            re_3.id_class[re_3.id_case[24]] = rzC_22;
            rAj_12.id_class((rzC_2)id_class[id_case[25]]);
            try {
                rAj_12.id_class((Executor)new ThreadPerTaskExecutor(Thread::new), (Executor)new ThreadPerTaskExecutor(Thread::new), Collections.singletonList(rAC2), CompletableFuture.completedFuture(rqg_3.INSTANCE)).get();
            }
            catch (Exception exception) {
                throw new RuntimeException(exception);
            }
        }
        return (rzC_2)id_class[id_case[26]];
    }

    public re_3(@Nonnull xd_3 xd_32) {
        ImmutableSet<Integer> immutableSet;
        ImmutableSet<Integer> immutableSet2;
        Set<xc_3> set;
        this.id_implements();
        xd_3 xd_33 = xd_32;
        this.id_break[re_3.id_case[0]] = xd_33;
        this.id_break[re_3.id_case[1]] = set = re_3.id_break(xd_32);
        this.id_break[re_3.id_case[3]] = immutableSet2 = re_3.id_class((Set)this.id_break[id_case[2]]);
        this.id_break[re_3.id_case[5]] = immutableSet = re_3.id_break((Set)this.id_break[id_case[4]]);
    }

    public re_3(@Nonnull String string) {
        ImmutableSet<Integer> immutableSet;
        ImmutableSet<Integer> immutableSet2;
        Set<xc_3> set;
        this.id_implements();
        Matcher matcher = ((Pattern)id_class[id_case[6]]).matcher(string);
        if (!matcher.find()) {
            throw new IllegalArgumentException(id_protected[0]);
        }
        MatchResult matchResult = matcher.toMatchResult();
        xd_3 xd_32 = ri_3.id_break(matchResult.group(id_throws[0]));
        this.id_break[re_3.id_case[7]] = xd_32;
        this.id_break[re_3.id_case[9]] = set = re_3.id_break((xd_3)this.id_break[id_case[8]]);
        this.id_break[re_3.id_case[11]] = immutableSet2 = re_3.id_class((Set)this.id_break[id_case[10]]);
        this.id_break[re_3.id_case[13]] = immutableSet = re_3.id_break((Set)this.id_break[id_case[12]]);
    }

    static {
        re_3.ntfClinit();
    }

    public String toString() {
        Object[] objectArray = new Object[id_throws[5]];
        objectArray[re_3.id_throws[6]] = (xd_3)this.id_break[id_case[19]];
        return String.format(id_protected[1], objectArray);
    }

    public boolean id_class(@Nonnull xc_3 xc_32) {
        xd_3 xd_32 = xc_32.id_break();
        return xd_32 == (xd_3)this.id_break[id_case[16]] && ((ImmutableSet)this.id_break[id_case[17]]).contains((Object)xc_32.hashCode()) ? id_throws[3] : id_throws[4];
    }

    public boolean id_class(rdn_3 rdn_32) {
        int n = rdn_32.id_short();
        return ((ImmutableSet)this.id_break[id_case[18]]).contains((Object)(n -= rdn_32.id_catch()));
    }

    public static rzZ_2 id_class() {
        return (rzZ_2)id_class[id_case[27]];
    }

    public boolean id_class(@Nonnull xd_3 xd_32) {
        return xd_32 == (xd_3)this.id_break[id_case[15]] ? id_throws[1] : id_throws[2];
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-64, 36, 37, -93, -117, -126, -15, -10}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x273F0C6EEA37AE04L;
    }

    private static ImmutableSet<Integer> id_class(Set<xc_3> set) {
        return ImmutableSet.copyOf((Object[])((Integer[])set.stream().map(Object::hashCode).toArray(Integer[]::new)));
    }

    private static Set<xc_3> id_break(@Nonnull xd_3 xd_32) {
        return new HashSet<xc_3>((Collection<xc_3>)xd_32.id_new().id_class());
    }

    private static ImmutableSet<Integer> id_break(Set<xc_3> set) {
        return ImmutableSet.copyOf((Object[])((Integer[])set.stream().flatMap(xc_32 -> re_3.id_byte(xc_32.id_break()).stream().map(rdb_32 -> new rdn_3((rpL_2)rdb_32, id_throws[9]))).map(rdn_3::id_short).toArray(Integer[]::new)));
    }

    public xd_3 id_break() {
        return (xd_3)this.id_break[id_case[14]];
    }

    private static void id_throws() {
        boolean[] blArray = new boolean[11];
        blArray[0] = true;
        blArray[1] = true;
        blArray[3] = true;
        blArray[5] = true;
        blArray[7] = true;
        blArray[9] = true;
        id_throws = blArray;
    }

    private static /* synthetic */ void ntfClinit() {
        re_3.id_throws();
        re_3.id_private();
        re_3.id_finally();
        re_3.id_case();
        re_3.id_catch();
    }

    private static void id_finally() {
        short[] sArray = new short[29];
        sArray[1] = 1;
        sArray[2] = 1;
        sArray[3] = 2;
        sArray[4] = 1;
        sArray[5] = 3;
        sArray[9] = 1;
        sArray[10] = 1;
        sArray[11] = 2;
        sArray[12] = 1;
        sArray[13] = 3;
        sArray[17] = 2;
        sArray[18] = 3;
        sArray[20] = 1;
        sArray[21] = 1;
        sArray[22] = 1;
        sArray[23] = 2;
        sArray[24] = 1;
        sArray[25] = 1;
        sArray[26] = 1;
        sArray[27] = 2;
        sArray[28] = 3;
        id_case = sArray;
    }

    private static void id_catch() {
        Object[] objectArray = new Object[4];
        objectArray[0] = Pattern.compile(id_protected[2]);
        objectArray[2] = new rzZ_2();
        objectArray[3] = new HashMap();
        id_class = objectArray;
    }

    private static void id_case() {
        id_byte = new byte[]{2, 3, 4, 4};
    }

    private void id_implements() {
        if (this.id_break == null) {
            Object[] objectArray = this.id_break = new Object[id_byte[2]];
        }
    }

    public xc_3 id_protected() {
        if (((Set)this.id_break[id_case[20]]).size() > 0) {
            return (xc_3)((Set)this.id_break[id_case[21]]).iterator().next();
        }
        return null;
    }

    private static void id_private() {
        id_protected = new String[]{new String("invalid block selector"), new String("BlockOptionalMeta{block=%s}"), new String("^(.+?)(?::(\\d+))?$")};
    }
}

