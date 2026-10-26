package celestial;

import com.google.common.collect.ImmutableSet;
import com.mojang.brigadier.context.StringRange;
import com.mojang.brigadier.suggestion.Suggestion;
import com.mojang.brigadier.suggestion.Suggestions;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.function.BiFunction;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public enum C_break implements MinecraftAccessor {
   ;
   private static short[] shortsf9703d96375232b196815afd59d1eb48;
   public static Object[] staticFieldsf9703d96375232b196815afd59d1eb48;
   private static String[] stringsf9703d96375232b196815afd59d1eb48;
   private static byte[] bytesf9703d96375232b196815afd59d1eb48;
   private static boolean[] booleansf9703d96375232b196815afd59d1eb48;

   public void byte_() {
      BiFunction var1 = j_1.break_();

      for (C_case var3 : C_throws.class_().case_()) {
         V var4 = var3.throw_().catch_() != null && var3.throw_().case_() != null
            ? (V)V.staticFields30e1cd8580ce39faa61be3646b7cc079[0]
            : (V)V.staticFields30e1cd8580ce39faa61be3646b7cc079[1];
         j_1 var5 = (j_1)var1.apply((Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[0], var4);
         var3.s().class_(var5);
         ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).finally_().class_(var5);
         rrtu_3.protected_();
      }
   }

   public void byte_(ruS_2<?> var1, rum_3 var2) {
      if (var2 == rum_3.CLIENTBOUND) {
         for (C_case var4 : C_throws.class_().case_()) {
            if (var4.throw_().catch_() != null && ((Aq_1)var4.throw_().catch_().break_[0]).class_() == ((Aq_1)((cb_3)import_.class_[57]).break_[0]).class_()) {
               var4.s().break_(new y_1(((Aq_1)((cb_3)import_.class_[57]).break_[0]).class_(), (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[0], var1));
            }
         }
      }
   }

   static {
      ntfClinit();
   }

   public void class_(rrLC var1) {
      for (C_case var3 : C_throws.class_().case_()) {
         var3.s().class_(var1);
      }
   }

   public void class_(rrnM_2 var1) {
      for (C_case var3 : C_throws.class_().case_()) {
         var3.s().class_(var1);
      }
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 3863380551831026542L;
   }

   public void class_(rrLm_1 var1) {
      for (C_case var3 : C_throws.class_().case_()) {
         var3.s().class_(var1);
      }
   }

   public void class_(rrFY var1) {
      for (C_case var3 : C_throws.class_().case_()) {
         var3.s().class_(var1);
      }
   }

   public void class_(rvC_2 var1) {
      if ((Boolean)C_class.instanceof_().M.class_[0]) {
         rfj_3[] var2 = new rfj_3[booleansf9703d96375232b196815afd59d1eb48[4]];
         var1.class_((var1x, var2x) -> {
            if (((ImmutableSet)St_1.class_[0]).contains(var2x.break_())) {
               var2[0] = new rfj_3(var1x);
            }
         });
         if (var2[0] != null) {
            for (C_case var4 : C_throws.class_().case_()) {
               cb_3 var5 = var4.throw_().catch_();
               if (var5 != null && (Aq_1)var5.break_[0] == (Aq_1)((cb_3)import_.class_[57]).break_[0]) {
                  l_1 var6 = new l_1(
                     (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[1], (H)H.staticFields1fafa9bf76ed3352892023b88da3732d[2], var2[0].break_, var2[0].byte_
                  );
                  var4.s().class_(var6);
               }
            }
         }
      }
   }

   public void class_(rrLE var1) {
      for (C_case var3 : C_throws.class_().case_()) {
         var3.s().class_(var1);
      }
   }

   public void class_(rrLF var1) {
      for (C_case var3 : C_throws.class_().case_()) {
         var3.s().class_(var1);
      }
   }

   public void class_(rrLc_1 var1) {
      for (C_case var3 : C_throws.class_().case_()) {
         var3.s().class_(var1);
      }
   }

   public void class_(rrAq_1 var1) {
      for (C_case var3 : C_throws.class_().case_()) {
         var3.s().class_(var1);
      }
   }

   public void class_(rrAz_1 var1) {
      C_case var2 = C_throws.class_().private_();
      if (var2 != null) {
         var2.s().class_(var1);
      }
   }

   public void class_(rrnB_2 var1) {
      for (C_case var3 : C_throws.class_().case_()) {
         var3.s().class_(var1);
      }
   }

   public void class_(rrnd_3 var1) {
      for (C_case var3 : C_throws.class_().case_()) {
         var3.s().class_(var1);
      }
   }

   public void class_(rrLf_1 var1) {
      for (C_case var3 : C_throws.class_().case_()) {
         var3.s().class_(var1);
      }
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-43, 25, 19, -8, 69, -62, -79, 101}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public void class_(rrAH var1) {
      for (C_case var3 : C_throws.class_().case_()) {
         var3.s().class_(var1);
      }
   }

   public void class_(rZD var1) {
      for (C_case var3 : C_throws.class_().case_()) {
         cb_3 var4 = var3.throw_().catch_();
         if (var4 != null && (Aq_1)var4.break_[0] == (Aq_1)((cb_3)import_.class_[57]).break_[0]) {
            l_1 var5 = new l_1(
               (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[1],
               var1.case_() ? (H)H.staticFields1fafa9bf76ed3352892023b88da3732d[2] : (H)H.staticFields1fafa9bf76ed3352892023b88da3732d[3],
               var1.byte_(),
               var1.protected_()
            );
            var3.s().class_(var5);
         }
      }
   }

   public void class_(rrFU var1) {
      for (C_case var3 : C_throws.class_().case_()) {
         var3.s().class_(var1);
      }
   }

   public void class_(rrLu_1 var1) {
      for (C_case var3 : C_throws.class_().case_()) {
         var3.s().class_(var1);
      }
   }

   public void class_(rrAg_1 var1) {
      for (C_case var3 : C_throws.class_().case_()) {
         var3.s().class_(var1);
      }
   }

   public boolean class_(rhx_3 var1) {
      C_case var2 = C_throws.class_().private_();
      if (var2 == null) {
         return var1.byte_;
      } else {
         return !var2.this_().catch_() && var1.byte_ ? true : booleansf9703d96375232b196815afd59d1eb48[1];
      }
   }

   public void class_(rrAQ var1) {
      for (C_case var3 : C_throws.class_().case_()) {
         var3.s().class_(var1);
      }
   }

   public void class_(rrLI var1) {
      for (C_case var3 : C_throws.class_().case_()) {
         var3.s().class_(var1);
      }
   }

   public void class_(rrFj_1 var1) {
      for (C_case var3 : C_throws.class_().case_()) {
         var3.s().class_(var1);
      }
   }

   public void class_(rZR var1) {
      if ((Boolean)C_class.instanceof_().M.class_[0]) {
         if (((ImmutableSet)St_1.class_[0]).contains(var1.break_().break_())) {
            for (C_case var3 : C_throws.class_().case_()) {
               cb_3 var4 = var3.throw_().catch_();
               if (var4 != null && (Aq_1)var4.break_[0] == (Aq_1)((cb_3)import_.class_[57]).break_[0]) {
                  l_1 var5 = new l_1(
                     (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[1],
                     (H)H.staticFields1fafa9bf76ed3352892023b88da3732d[2],
                     var1.byte_().b_() >> 4,
                     var1.byte_().d_() >> 4
                  );
                  var3.s().class_(var5);
               }
            }
         }
      }
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 169463401;
   }

   public boolean class_(Vu_1 var1) {
      C_case var2 = C_throws.class_().private_();
      if (var2 == null) {
         return var1.protected_();
      } else {
         I var3 = ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).finally_().class_(I.break_(null));
         var2.s().class_(var3);
         if (var3.class_() != null) {
            return var3.class_();
         } else {
            return var2 != C_throws.class_().break_() ? false : var1.protected_();
         }
      }
   }

   public void class_(rrAN var1) {
      for (C_case var3 : C_throws.class_().case_()) {
         var3.s().class_(var1);
      }
   }

   public void class_(q_1 var1) {
      C_case var2 = C_throws.class_().private_();
      if (var2 != null) {
         var2.s().class_(var1);
      }
   }

   public void class_(rrns_3 var1) {
      C_case var2 = C_throws.class_().private_();
      if (var2 != null) {
         var2.s().class_(var1);
      }
   }

   public void class_(iB_2 var1) {
      if (cb_3.class.isInstance(var1)) {
         C_case var2 = C_throws.class_().private_();
         if (var2 != null) {
            t_1 var3 = ((t_1)t_1.class_[0]).break_((w_1)w_1.staticFieldsa114f317008a3fe78339d2b3c5e6fe39[0]);
            var2.s().class_(var3);
         }
      }
   }

   public void class_(rrLX var1) {
      for (C_case var3 : C_throws.class_().case_()) {
         var3.s().class_(var1);
      }
   }

   public void class_(rrAO var1) {
      for (C_case var3 : C_throws.class_().case_()) {
         var3.s().class_(var1);
      }
   }

   public void class_(rrLp_1 var1) {
      for (C_case var3 : C_throws.class_().case_()) {
         var3.s().class_(var1);
      }
   }

   public void class_(Ml_1 var1, float var2, rjV_2 var3) {
      for (C_case var5 : C_throws.class_().case_()) {
         var5.s().class_(new T(var2, var1, var3));
      }
   }

   public void class_(rrAK var1) {
      for (C_case var3 : C_throws.class_().case_()) {
         var3.s().class_(var1);
      }
   }

   public void class_(rrLx_1 var1) {
      for (C_case var3 : C_throws.class_().case_()) {
         var3.s().class_(var1);
      }
   }

   public void class_(rrLO var1) {
      for (C_case var3 : C_throws.class_().case_()) {
         var3.s().class_(var1);
      }
   }

   public void class_(rrFi_1 var1) {
      for (C_case var3 : C_throws.class_().case_()) {
         var3.s().class_(var1);
      }
   }

   public void class_(ruS_2<?> var1, rum_3 var2) {
      if (var2 == rum_3.CLIENTBOUND) {
         for (C_case var4 : C_throws.class_().case_()) {
            if (var4.throw_().catch_() != null && ((Aq_1)var4.throw_().catch_().break_[0]).class_() == ((Aq_1)((cb_3)import_.class_[57]).break_[0]).class_()) {
               var4.s().break_(new y_1(((Aq_1)((cb_3)import_.class_[57]).break_[0]).class_(), (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[1], var1));
            }
         }
      }
   }

   public void class_(rrFe_1 var1) {
      for (C_case var3 : C_throws.class_().case_()) {
         var3.s().class_(var1);
      }
   }

   public void class_() {
      for (C_case var2 : C_throws.class_().case_()) {
         cb_3 var3 = var2.throw_().catch_();
         if (var3 != null && (Aq_1)var3.break_[0] == (Aq_1)((cb_3)import_.class_[57]).break_[0]) {
            var2.s().volatile_();
         }
      }
   }

   public void class_(rrAZ var1) {
      for (C_case var3 : C_throws.class_().case_()) {
         var3.s().class_(var1);
      }
   }

   public void class_(t_1 var1) {
      C_case var2 = C_throws.class_().private_();
      if (var2 != null) {
         var2.s().class_(var1);
      }
   }

   public void class_(rrAS var1) {
      for (C_case var3 : C_throws.class_().case_()) {
         var3.s().class_(var1);
      }
   }

   public void class_(rrFK var1) {
      for (C_case var3 : C_throws.class_().case_()) {
         var3.s().class_(var1);
      }
   }

   public void class_(rrAo_1 var1) {
      for (C_case var3 : C_throws.class_().case_()) {
         var3.s().class_(var1);
      }
   }

   public void class_(rrAc_1 var1) {
      for (C_case var3 : C_throws.class_().case_()) {
         var3.s().class_(var1);
      }
   }

   public boolean class_(vm_3 var1) {
      return (!C_throws.class_().break_().this_().catch_() || (cb_3)import_.class_[57] == null) && !var1.continue_
         ? booleansf9703d96375232b196815afd59d1eb48[16]
         : booleansf9703d96375232b196815afd59d1eb48[15];
   }

   public void class_(rrLv_1 var1) {
      for (C_case var3 : C_throws.class_().case_()) {
         var3.s().class_(var1);
      }
   }

   public boolean class_(cW_2 var1) {
      Lu_1 var2 = var1.byte_();
      String var3 = var2.private_();
      String var4 = var3.substring(0, Math.min(var3.length(), var2.final_()));
      f_1 var5 = new f_1(var4);
      C_throws.class_().break_().s().class_(var5);
      if (var5.byte_()) {
         return false;
      } else if ((String[])var5.class_[1] != null) {
         var5.break_();
         var1.class_(null);
         if (var1.case_()) {
            return false;
         } else {
            var2.byte_(null);
            var1.class_(null);
            var1.throws_().clear();
            if (((String[])var5.class_[1]).length == 0) {
               var1.class_(Suggestions.empty());
            } else {
               StringRange var6 = StringRange.between(var4.lastIndexOf(" ") + 1, var4.length());
               List var7 = Stream.<String>of((String[])var5.class_[1]).map(var1x -> new Suggestion(var6, var1x)).collect(Collectors.toList());
               Suggestions var8 = new Suggestions(var6, var7);
               var1.class_(new CompletableFuture<>());
               var1.protected_().complete(var8);
            }

            var1.break_(true);
            return false;
         }
      } else {
         return booleansf9703d96375232b196815afd59d1eb48[14];
      }
   }

   public void class_(rrLU var1) {
      for (C_case var3 : C_throws.class_().case_()) {
         var3.s().class_(var1);
      }
   }

   public void class_(an_3 var1) {
      Float var7 = (Float)var1.throws_[15];
      var1.throws_[72] = var7;
      if (cb_3.class.isInstance(var1) && C_throws.class_().private_() != null) {
         t_1 var2 = ((t_1)t_1.class_[0]).break_((w_1)w_1.staticFieldsa114f317008a3fe78339d2b3c5e6fe39[0]);
         Float var8 = var2.class_().throws_();
         var1.throws_[15] = var8;
      }
   }

   public void class_(rrFo_1 var1) {
      for (C_case var3 : C_throws.class_().case_()) {
         var3.s().class_(var1);
      }
   }

   public void class_(rrLz_1 var1) {
      for (C_case var3 : C_throws.class_().case_()) {
         var3.s().class_(var1);
      }
   }

   public void class_(rrAT var1) {
      for (C_case var3 : C_throws.class_().case_()) {
         var3.s().class_(var1);
      }
   }

   public void class_(rrLV var1) {
      for (C_case var3 : C_throws.class_().case_()) {
         var3.s().class_(var1);
      }
   }

   public void class_(rrLs_1 var1) {
      if ((cb_3)import_.class_[57] != null && (gm_3)import_.class_[56] != null) {
         for (C_case var3 : C_throws.class_().case_()) {
            var3.s().class_(var1);
         }
      }
   }

   public void class_(PacketEvent var1) {
      for (C_case var3 : C_throws.class_().case_()) {
         var3.s().class_(var1);
      }
   }

   public void class_(rrAX var1) {
      C_case var2 = C_throws.class_().private_();
      if (var2 != null) {
         var2.s().class_(var1);
      }
   }

   public void class_(gm_3 var1) {
      C_throws.class_().break_().s().class_(new g_1(var1, (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[1]));
   }

   public void class_(rrAM var1) {
      for (C_case var3 : C_throws.class_().case_()) {
         var3.s().class_(var1);
      }
   }

   public void class_(rrnG_2 var1) {
      for (C_case var3 : C_throws.class_().case_()) {
         var3.s().class_(var1);
      }
   }

   public void class_(rFZ var1) {
      for (C_case var3 : C_throws.class_().case_()) {
         cb_3 var4 = var3.throw_().catch_();
         if (var4 != null && (Aq_1)var4.break_[0] == (Aq_1)((cb_3)import_.class_[57]).break_[0]) {
            l_1 var5 = new l_1(
               (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[0], (H)H.staticFields1fafa9bf76ed3352892023b88da3732d[1], var1.break_(), var1.byte_()
            );
            var3.s().class_(var5);
         }
      }
   }

   public void class_(rrLa_1 var1) {
      for (C_case var3 : C_throws.class_().case_()) {
         var3.s().class_(var1);
      }
   }

   public void class_(rrLh_1 var1) {
      for (C_case var3 : C_throws.class_().case_()) {
         var3.s().class_(var1);
      }
   }

   public void class_(rrAl_1 var1) {
      for (C_case var3 : C_throws.class_().case_()) {
         var3.s().class_(var1);
      }
   }

   public void class_(rrFf_1 var1) {
      for (C_case var3 : C_throws.class_().case_()) {
         var3.s().class_(var1);
      }
   }

   public void class_(rrFw_1 var1) {
      for (C_case var3 : C_throws.class_().case_()) {
         var3.s().class_(var1);
      }
   }

   public void break_(ruS_2<?> var1, rum_3 var2) {
      if (var2 == rum_3.CLIENTBOUND) {
         for (C_case var4 : C_throws.class_().case_()) {
            if (var4.throw_().catch_() != null && ((Aq_1)var4.throw_().catch_().break_[0]).class_() == ((Aq_1)((cb_3)import_.class_[57]).break_[0]).class_()) {
               var4.s().class_(new y_1(((Aq_1)((cb_3)import_.class_[57]).break_[0]).class_(), (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[0], var1));
            }
         }
      }
   }

   public void break_() {
      C_case var1 = C_throws.class_().private_();
      if (var1 != null) {
         ((Br_1)var1.catch_()).throws_();
      }
   }

   public boolean break_(String var1) {
      C var2 = new C(var1);
      C_case var3 = C_throws.class_().private_();
      if (var3 == null) {
         return false;
      } else {
         var3.s().class_(var2);
         return var2.byte_();
      }
   }

   public void break_(gm_3 var1) {
      if ((gm_3)import_.class_[56] != null || var1 != null) {
         C_throws.class_().break_().s().class_(new g_1(var1, (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[0]));
         ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).finally_().class_(rrnu_3.class_(var1));
      }
   }

   public void break_(rFZ var1) {
      for (C_case var3 : C_throws.class_().case_()) {
         cb_3 var4 = var3.throw_().catch_();
         if (var4 != null && (Aq_1)var4.break_[0] == (Aq_1)((cb_3)import_.class_[57]).break_[0]) {
            l_1 var5 = new l_1(
               (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[1], (H)H.staticFields1fafa9bf76ed3352892023b88da3732d[1], var1.break_(), var1.byte_()
            );
            var3.s().class_(var5);
         }
      }
   }

   private static void throws_() {
      Object[] var0 = new Object[]{new C_break(), null};
      var0[1] = new C_break[]{(C_break)var0[0]};
      staticFieldsf9703d96375232b196815afd59d1eb48 = var0;
   }

   private static void catch_() {
      shortsf9703d96375232b196815afd59d1eb48 = new short[]{
         1,
         0,
         0,
         57,
         0,
         1,
         2,
         3,
         0,
         57,
         0,
         0,
         1,
         0,
         57,
         0,
         1,
         1,
         0,
         0,
         0,
         57,
         0,
         1,
         2,
         0,
         0,
         57,
         0,
         1,
         2,
         0,
         57,
         0,
         1,
         1,
         1,
         15,
         72,
         0,
         0,
         15,
         0,
         0,
         0,
         1,
         0,
         0,
         56,
         0,
         0,
         1,
         57,
         0,
         57,
         0,
         57,
         0,
         0,
         0,
         57,
         0,
         57,
         0,
         1,
         0,
         57,
         0,
         57,
         0,
         0,
         0,
         57,
         0,
         57,
         0,
         1,
         57,
         56,
         0,
         0
      };
   }

   private static void implements_() {
      booleansf9703d96375232b196815afd59d1eb48 = new boolean[]{
         true,
         false,
         false,
         false,
         true,
         false,
         false,
         false,
         false,
         false,
         false,
         true,
         true,
         false,
         true,
         true,
         false,
         false,
         true,
         false,
         false,
         false,
         true
      };
   }

   private static void protected_() {
      bytesf9703d96375232b196815afd59d1eb48 = new byte[]{4, 4, 2};
   }

   public void protected_(ruS_2<?> var1, rum_3 var2) {
      if (var2 == rum_3.CLIENTBOUND) {
         for (C_case var4 : C_throws.class_().case_()) {
            if (var4.throw_().catch_() != null && ((Aq_1)var4.throw_().catch_().break_[0]).class_() == ((Aq_1)((cb_3)import_.class_[57]).break_[0]).class_()) {
               var4.s().class_(new y_1(((Aq_1)((cb_3)import_.class_[57]).break_[0]).class_(), (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[1], var1));
            }
         }
      }
   }

   private static void private_() {
      stringsf9703d96375232b196815afd59d1eb48 = new String[]{new String(" "), new String("INSTANCE")};
   }
}
