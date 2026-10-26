package celestial;

import com.google.common.collect.ImmutableSet;
import io.netty.util.concurrent.ThreadPerTaskExecutor;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
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

   private static synchronized List<rdb_3> id_byte(xd_3 var0) {
      return ((Map)id_class[id_case[28]])
         .computeIfAbsent(
            var0,
            var0x -> {
               rqO_2 var1 = var0x.id_throws();
               if (var1 == rzl_3.id_class) {
                  return Collections.emptyList();
               } else {
                  ArrayList var2 = new ArrayList();
                  id_byte()
                     .id_class(var1)
                     .id_break(
                        new rzP_2(null)
                           .id_class(new Random())
                           .id_class(rzQ_2.id_case, rjU_2.id_byte(rfH_2.id_case))
                           .id_class(rzQ_2.id_implements, rdn_3.id_break)
                           .id_break(rzQ_2.id_private, null)
                           .id_class(rzQ_2.id_catch, var0x.id_continue())
                           .id_class(rzz_3.id_native),
                        var1x -> var2.add(var1x.id_break())
                     );
                  return var2;
               }
            }
         );
   }

   private static int id_byte(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1065395862;
   }

   public static rzC_2 id_byte() {
      if ((rzC_2)id_class[id_case[22]] == null) {
         rAq_1 var10002 = rAp_1::new;
         rAm_1[] var10003 = new rAm_1[id_throws[7]];
         var10003[id_throws[8]] = new rAf_1();
         rAt_1 var0 = new rAt_1(var10002, var10003);
         var0.id_class();
         rAC var1 = var0.id_byte().iterator().next().id_protected();
         rAj_1 var2 = new rAj_1(rAI.SERVER_DATA);
         rzC_2 var8 = new rzC_2((rzZ_2)id_class[id_case[23]]);
         id_class[id_case[24]] = var8;
         var2.id_class((rzC_2)id_class[id_case[25]]);

         try {
            var2.id_class(
                  new ThreadPerTaskExecutor(Thread::new),
                  new ThreadPerTaskExecutor(Thread::new),
                  Collections.singletonList(var1),
                  CompletableFuture.completedFuture(rqg_3.INSTANCE)
               )
               .get();
         } catch (Exception var9) {
            throw new RuntimeException(var9);
         }
      }

      return (rzC_2)id_class[id_case[26]];
   }

   public re_3(@Nonnull xd_3 var1) {
      this.id_implements();
      this.id_break[id_case[0]] = var1;
      Set var7 = id_break(var1);
      this.id_break[id_case[1]] = var7;
      ImmutableSet var8 = id_class((Set<xc_3>)this.id_break[id_case[2]]);
      this.id_break[id_case[3]] = var8;
      ImmutableSet var9 = id_break((Set<xc_3>)this.id_break[id_case[4]]);
      this.id_break[id_case[5]] = var9;
   }

   public re_3(@Nonnull String var1) {
      this.id_implements();
      Matcher var2 = ((Pattern)id_class[id_case[6]]).matcher(var1);
      if (!var2.find()) {
         throw new IllegalArgumentException(id_protected[0]);
      } else {
         MatchResult var3 = var2.toMatchResult();
         xd_3 var8 = ri_3.id_break(var3.group(id_throws[0]));
         this.id_break[id_case[7]] = var8;
         Set var9 = id_break((xd_3)this.id_break[id_case[8]]);
         this.id_break[id_case[9]] = var9;
         ImmutableSet var10 = id_class((Set<xc_3>)this.id_break[id_case[10]]);
         this.id_break[id_case[11]] = var10;
         ImmutableSet var11 = id_break((Set<xc_3>)this.id_break[id_case[12]]);
         this.id_break[id_case[13]] = var11;
      }
   }

   static {
      ntfClinit();
   }

   @Override
   public String toString() {
      String var10000 = id_protected[1];
      Object[] var10001 = new Object[id_throws[5]];
      var10001[id_throws[6]] = (xd_3)this.id_break[id_case[19]];
      return String.format(var10000, var10001);
   }

   public boolean id_class(@Nonnull xc_3 var1) {
      xd_3 var2 = var1.id_break();
      return var2 == (xd_3)this.id_break[id_case[16]] && ((ImmutableSet)this.id_break[id_case[17]]).contains(var1.hashCode()) ? id_throws[3] : id_throws[4];
   }

   public boolean id_class(rdn_3 var1) {
      int var2 = var1.id_short();
      var2 -= var1.id_catch();
      return ((ImmutableSet)this.id_break[id_case[18]]).contains(var2);
   }

   public static rzZ_2 id_class() {
      return (rzZ_2)id_class[id_case[27]];
   }

   public boolean id_class(@Nonnull xd_3 var1) {
      return var1 == (xd_3)this.id_break[id_case[15]] ? id_throws[1] : id_throws[2];
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-64, 36, 37, -93, -117, -126, -15, -10}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 2827992761527414276L;
   }

   private static ImmutableSet<Integer> id_class(Set<xc_3> var0) {
      return ImmutableSet.copyOf(var0.stream().map(Object::hashCode).toArray(Integer[]::new));
   }

   private static Set<xc_3> id_break(@Nonnull xd_3 var0) {
      return new HashSet<>(var0.id_new().id_class());
   }

   private static ImmutableSet<Integer> id_break(Set<xc_3> var0) {
      return ImmutableSet.copyOf(
         var0.stream()
            .flatMap(var0x -> id_byte(var0x.id_break()).stream().map(var0xx -> new rdn_3(var0xx, id_throws[9])))
            .map(rdn_3::id_short)
            .toArray(Integer[]::new)
      );
   }

   public xd_3 id_break() {
      return (xd_3)this.id_break[id_case[14]];
   }

   private static void id_throws() {
      id_throws = new boolean[]{true, true, false, true, false, true, false, true, false, true, false};
   }

   private static void id_finally() {
      id_case = new short[]{0, 1, 1, 2, 1, 3, 0, 0, 0, 1, 1, 2, 1, 3, 0, 0, 0, 2, 3, 0, 1, 1, 1, 2, 1, 1, 1, 2, 3};
   }

   private static void id_catch() {
      Object[] var0 = new Object[]{Pattern.compile(id_protected[2]), null, new rzZ_2(), new HashMap()};
      id_class = var0;
   }

   private static void id_case() {
      id_byte = new byte[]{2, 3, 4, 4};
   }

   private void id_implements() {
      if (this.id_break == null) {
         this.id_break = new Object[id_byte[2]];
         Object[] var1 = this.id_break;
      }
   }

   public xc_3 id_protected() {
      return ((Set)this.id_break[id_case[20]]).size() > 0 ? (xc_3)((Set)this.id_break[id_case[21]]).iterator().next() : null;
   }

   private static void id_private() {
      id_protected = new String[]{new String("invalid block selector"), new String("BlockOptionalMeta{block=%s}"), new String("^(.+?)(?::(\\d+))?$")};
   }
}
