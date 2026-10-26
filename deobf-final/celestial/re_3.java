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
   public static Object[] class_;
   private static byte[] byte_;
   private static String[] protected_;
   private static boolean[] throws_;
   private static short[] case_;
   public Object[] break_;

   private static synchronized List<rdb_3> byte_(xd_3 var0) {
      return ((Map)class_[3])
         .computeIfAbsent(
            var0,
            var0x -> {
               rqO_2 var1 = var0x.throws_();
               if (var1 == rzl_3.class_) {
                  return Collections.emptyList();
               } else {
                  ArrayList var2 = new ArrayList();
                  byte_()
                     .class_(var1)
                     .break_(
                        new rzP_2(null)
                           .class_(new Random())
                           .class_(rzQ_2.case_, rjU_2.byte_(rfH_2.case_))
                           .class_(rzQ_2.implements_, rdn_3.break_)
                           .break_(rzQ_2.private_, null)
                           .class_(rzQ_2.catch_, var0x.continue_())
                           .class_(rzz_3.native_),
                        var1x -> var2.add(var1x.break_())
                     );
                  return var2;
               }
            }
         );
   }

   private static int byte_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1065395862;
   }

   public static rzC_2 byte_() {
      if ((rzC_2)class_[1] == null) {
         rAt_1 var0 = new rAt_1(rAp_1::new, new rAf_1());
         var0.class_();
         rAC var1 = var0.byte_().iterator().next().protected_();
         rAj_1 var2 = new rAj_1(rAI.SERVER_DATA);
         rzC_2 var8 = new rzC_2((rzZ_2)class_[2]);
         class_[1] = var8;
         var2.class_((rzC_2)class_[1]);

         try {
            var2.class_(
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

      return (rzC_2)class_[1];
   }

   public re_3(@Nonnull xd_3 var1) {
      this.implements_();
      this.break_[0] = var1;
      Set var7 = break_(var1);
      this.break_[1] = var7;
      ImmutableSet var8 = class_((Set<xc_3>)this.break_[1]);
      this.break_[2] = var8;
      ImmutableSet var9 = break_((Set<xc_3>)this.break_[1]);
      this.break_[3] = var9;
   }

   public re_3(@Nonnull String var1) {
      this.implements_();
      Matcher var2 = ((Pattern)class_[0]).matcher(var1);
      if (!var2.find()) {
         throw new IllegalArgumentException("invalid block selector");
      } else {
         MatchResult var3 = var2.toMatchResult();
         xd_3 var8 = ri_3.break_(var3.group(1));
         this.break_[0] = var8;
         Set var9 = break_((xd_3)this.break_[0]);
         this.break_[1] = var9;
         ImmutableSet var10 = class_((Set<xc_3>)this.break_[1]);
         this.break_[2] = var10;
         ImmutableSet var11 = break_((Set<xc_3>)this.break_[1]);
         this.break_[3] = var11;
      }
   }

   static {
      ntfClinit();
   }

   @Override
   public String toString() {
      return String.format("BlockOptionalMeta{block=%s}", (xd_3)this.break_[0]);
   }

   public boolean class_(@Nonnull xc_3 var1) {
      xd_3 var2 = var1.break_();
      return var2 == (xd_3)this.break_[0] && ((ImmutableSet)this.break_[2]).contains(var1.hashCode()) ? true : throws_[4];
   }

   public boolean class_(rdn_3 var1) {
      int var2 = var1.short_();
      var2 -= var1.catch_();
      return ((ImmutableSet)this.break_[3]).contains(var2);
   }

   public static rzZ_2 class_() {
      return (rzZ_2)class_[2];
   }

   public boolean class_(@Nonnull xd_3 var1) {
      return var1 == (xd_3)this.break_[0] ? true : throws_[2];
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-64, 36, 37, -93, -117, -126, -15, -10}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 2827992761527414276L;
   }

   private static ImmutableSet<Integer> class_(Set<xc_3> var0) {
      return ImmutableSet.copyOf(var0.stream().map(Object::hashCode).toArray(Integer[]::new));
   }

   private static Set<xc_3> break_(@Nonnull xd_3 var0) {
      return new HashSet<>(var0.new_().class_());
   }

   private static ImmutableSet<Integer> break_(Set<xc_3> var0) {
      return ImmutableSet.copyOf(
         var0.stream().flatMap(var0x -> byte_(var0x.break_()).stream().map(var0xx -> new rdn_3(var0xx, 1))).map(rdn_3::short_).toArray(Integer[]::new)
      );
   }

   public xd_3 break_() {
      return (xd_3)this.break_[0];
   }

   private static void throws_() {
      throws_ = new boolean[]{true, true, false, true, false, true, false, true, false, true, false};
   }

   private static void finally_() {
      case_ = new short[]{0, 1, 1, 2, 1, 3, 0, 0, 0, 1, 1, 2, 1, 3, 0, 0, 0, 2, 3, 0, 1, 1, 1, 2, 1, 1, 1, 2, 3};
   }

   private static void catch_() {
      Object[] var0 = new Object[]{Pattern.compile("^(.+?)(?::(\\d+))?$"), null, new rzZ_2(), new HashMap()};
      class_ = var0;
   }

   private static void case_() {
      byte_ = new byte[]{2, 3, 4, 4};
   }

   private void implements_() {
      if (this.break_ == null) {
         this.break_ = new Object[4];
         Object[] var1 = this.break_;
      }
   }

   public xc_3 protected_() {
      return ((Set)this.break_[1]).size() > 0 ? (xc_3)((Set)this.break_[1]).iterator().next() : null;
   }

   private static void private_() {
      protected_ = new String[]{new String("invalid block selector"), new String("BlockOptionalMeta{block=%s}"), new String("^(.+?)(?::(\\d+))?$")};
   }
}
