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
   private static short[] shortsf9703d96375232b196815afd59d1eb48;
   public static Object[] staticFieldsf9703d96375232b196815afd59d1eb48;
   private static String[] stringsf9703d96375232b196815afd59d1eb48;
   private static byte[] bytesf9703d96375232b196815afd59d1eb48;
   private static boolean[] booleansf9703d96375232b196815afd59d1eb48;

   public void id_byte() {
      BiFunction var1 = j_1.id_break();

      for (C_case var3 : C_throws.id_class().id_case()) {
         V var4 = var3.id_throw().id_catch() != null && var3.id_throw().id_case() != null
            ? (V)V.staticFields30e1cd8580ce39faa61be3646b7cc079[shortsf9703d96375232b196815afd59d1eb48[44]]
            : (V)V.staticFields30e1cd8580ce39faa61be3646b7cc079[shortsf9703d96375232b196815afd59d1eb48[45]];
         j_1 var5 = (j_1)var1.apply((Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[shortsf9703d96375232b196815afd59d1eb48[46]], var4);
         var3.s().id_class(var5);
         ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[shortsf9703d96375232b196815afd59d1eb48[47]]).id_finally().id_class(var5);
         rrtu_3.id_protected();
      }
   }

   public void id_byte(ruS_2<?> var1, rum_3 var2) {
      if (var2 == rum_3.CLIENTBOUND) {
         for (C_case var4 : C_throws.id_class().id_case()) {
            if (var4.id_throw().id_catch() != null
               && ((Aq_1)var4.id_throw().id_catch().id_break[shortsf9703d96375232b196815afd59d1eb48[53]]).id_class()
                  == ((Aq_1)((cb_3)id_import.id_class[shortsf9703d96375232b196815afd59d1eb48[54]]).id_break[shortsf9703d96375232b196815afd59d1eb48[55]])
                     .id_class()) {
               var4.s()
                  .id_break(
                     new y_1(
                        ((Aq_1)((cb_3)id_import.id_class[shortsf9703d96375232b196815afd59d1eb48[56]]).id_break[shortsf9703d96375232b196815afd59d1eb48[57]])
                           .id_class(),
                        (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[shortsf9703d96375232b196815afd59d1eb48[58]],
                        var1
                     )
                  );
            }
         }
      }
   }

   static {
      ntfClinit();
   }

   public void id_class(rrLC var1) {
      for (C_case var3 : C_throws.id_class().id_case()) {
         var3.s().id_class(var1);
      }
   }

   public void id_class(rrnM_2 var1) {
      for (C_case var3 : C_throws.id_class().id_case()) {
         var3.s().id_class(var1);
      }
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 3863380551831026542L;
   }

   public void id_class(rrLm_1 var1) {
      for (C_case var3 : C_throws.id_class().id_case()) {
         var3.s().id_class(var1);
      }
   }

   public void id_class(rrFY var1) {
      for (C_case var3 : C_throws.id_class().id_case()) {
         var3.s().id_class(var1);
      }
   }

   public void id_class(rvC_2 var1) {
      if ((Boolean)C_class.id_instanceof().M.id_class[shortsf9703d96375232b196815afd59d1eb48[25]]) {
         rfj_3[] var2 = new rfj_3[booleansf9703d96375232b196815afd59d1eb48[4]];
         var1.id_class((var1x, var2x) -> {
            if (((ImmutableSet)St_1.id_class[shortsf9703d96375232b196815afd59d1eb48[79]]).contains(var2x.id_break())) {
               var2[booleansf9703d96375232b196815afd59d1eb48[17]] = new rfj_3(var1x);
            }
         });
         if (var2[booleansf9703d96375232b196815afd59d1eb48[5]] != null) {
            for (C_case var4 : C_throws.id_class().id_case()) {
               cb_3 var5 = var4.id_throw().id_catch();
               if (var5 != null
                  && (Aq_1)var5.id_break[shortsf9703d96375232b196815afd59d1eb48[26]]
                     == (Aq_1)((cb_3)id_import.id_class[shortsf9703d96375232b196815afd59d1eb48[27]]).id_break[shortsf9703d96375232b196815afd59d1eb48[28]]) {
                  l_1 var6 = new l_1(
                     (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[shortsf9703d96375232b196815afd59d1eb48[29]],
                     (H)H.staticFields1fafa9bf76ed3352892023b88da3732d[shortsf9703d96375232b196815afd59d1eb48[30]],
                     var2[booleansf9703d96375232b196815afd59d1eb48[6]].id_break,
                     var2[booleansf9703d96375232b196815afd59d1eb48[7]].id_byte
                  );
                  var4.s().id_class(var6);
               }
            }
         }
      }
   }

   public void id_class(rrLE var1) {
      for (C_case var3 : C_throws.id_class().id_case()) {
         var3.s().id_class(var1);
      }
   }

   public void id_class(rrLF var1) {
      for (C_case var3 : C_throws.id_class().id_case()) {
         var3.s().id_class(var1);
      }
   }

   public void id_class(rrLc_1 var1) {
      for (C_case var3 : C_throws.id_class().id_case()) {
         var3.s().id_class(var1);
      }
   }

   public void id_class(rrAq_1 var1) {
      for (C_case var3 : C_throws.id_class().id_case()) {
         var3.s().id_class(var1);
      }
   }

   public void id_class(rrAz_1 var1) {
      C_case var2 = C_throws.id_class().id_private();
      if (var2 != null) {
         var2.s().id_class(var1);
      }
   }

   public void id_class(rrnB_2 var1) {
      for (C_case var3 : C_throws.id_class().id_case()) {
         var3.s().id_class(var1);
      }
   }

   public void id_class(rrnd_3 var1) {
      for (C_case var3 : C_throws.id_class().id_case()) {
         var3.s().id_class(var1);
      }
   }

   public void id_class(rrLf_1 var1) {
      for (C_case var3 : C_throws.id_class().id_case()) {
         var3.s().id_class(var1);
      }
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-43, 25, 19, -8, 69, -62, -79, 101}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public void id_class(rrAH var1) {
      for (C_case var3 : C_throws.id_class().id_case()) {
         var3.s().id_class(var1);
      }
   }

   public void id_class(rZD var1) {
      for (C_case var3 : C_throws.id_class().id_case()) {
         cb_3 var4 = var3.id_throw().id_catch();
         if (var4 != null
            && (Aq_1)var4.id_break[shortsf9703d96375232b196815afd59d1eb48[2]]
               == (Aq_1)((cb_3)id_import.id_class[shortsf9703d96375232b196815afd59d1eb48[3]]).id_break[shortsf9703d96375232b196815afd59d1eb48[4]]) {
            l_1 var5 = new l_1(
               (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[shortsf9703d96375232b196815afd59d1eb48[5]],
               var1.id_case()
                  ? (H)H.staticFields1fafa9bf76ed3352892023b88da3732d[shortsf9703d96375232b196815afd59d1eb48[6]]
                  : (H)H.staticFields1fafa9bf76ed3352892023b88da3732d[shortsf9703d96375232b196815afd59d1eb48[7]],
               var1.id_byte(),
               var1.id_protected()
            );
            var3.s().id_class(var5);
         }
      }
   }

   public void id_class(rrFU var1) {
      for (C_case var3 : C_throws.id_class().id_case()) {
         var3.s().id_class(var1);
      }
   }

   public void id_class(rrLu_1 var1) {
      for (C_case var3 : C_throws.id_class().id_case()) {
         var3.s().id_class(var1);
      }
   }

   public void id_class(rrAg_1 var1) {
      for (C_case var3 : C_throws.id_class().id_case()) {
         var3.s().id_class(var1);
      }
   }

   public boolean id_class(rhx_3 var1) {
      C_case var2 = C_throws.id_class().id_private();
      if (var2 == null) {
         return var1.id_byte;
      } else {
         return !var2.id_this().id_catch() && var1.id_byte ? booleansf9703d96375232b196815afd59d1eb48[0] : booleansf9703d96375232b196815afd59d1eb48[1];
      }
   }

   public void id_class(rrAQ var1) {
      for (C_case var3 : C_throws.id_class().id_case()) {
         var3.s().id_class(var1);
      }
   }

   public void id_class(rrLI var1) {
      for (C_case var3 : C_throws.id_class().id_case()) {
         var3.s().id_class(var1);
      }
   }

   public void id_class(rrFj_1 var1) {
      for (C_case var3 : C_throws.id_class().id_case()) {
         var3.s().id_class(var1);
      }
   }

   public void id_class(rZR var1) {
      if ((Boolean)C_class.id_instanceof().M.id_class[shortsf9703d96375232b196815afd59d1eb48[18]]) {
         if (((ImmutableSet)St_1.id_class[shortsf9703d96375232b196815afd59d1eb48[19]]).contains(var1.id_break().id_break())) {
            for (C_case var3 : C_throws.id_class().id_case()) {
               cb_3 var4 = var3.id_throw().id_catch();
               if (var4 != null
                  && (Aq_1)var4.id_break[shortsf9703d96375232b196815afd59d1eb48[20]]
                     == (Aq_1)((cb_3)id_import.id_class[shortsf9703d96375232b196815afd59d1eb48[21]]).id_break[shortsf9703d96375232b196815afd59d1eb48[22]]) {
                  l_1 var5 = new l_1(
                     (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[shortsf9703d96375232b196815afd59d1eb48[23]],
                     (H)H.staticFields1fafa9bf76ed3352892023b88da3732d[shortsf9703d96375232b196815afd59d1eb48[24]],
                     var1.id_byte().b_() >> bytesf9703d96375232b196815afd59d1eb48[0],
                     var1.id_byte().d_() >> bytesf9703d96375232b196815afd59d1eb48[1]
                  );
                  var3.s().id_class(var5);
               }
            }
         }
      }
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 169463401;
   }

   public boolean id_class(Vu_1 var1) {
      C_case var2 = C_throws.id_class().id_private();
      if (var2 == null) {
         return var1.id_protected();
      } else {
         I var3 = ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[shortsf9703d96375232b196815afd59d1eb48[1]]).id_finally().id_class(I.id_break(null));
         var2.s().id_class(var3);
         if (var3.id_class() != null) {
            return var3.id_class();
         } else {
            return var2 != C_throws.id_class().id_break() ? booleansf9703d96375232b196815afd59d1eb48[2] : var1.id_protected();
         }
      }
   }

   public void id_class(rrAN var1) {
      for (C_case var3 : C_throws.id_class().id_case()) {
         var3.s().id_class(var1);
      }
   }

   public void id_class(q_1 var1) {
      C_case var2 = C_throws.id_class().id_private();
      if (var2 != null) {
         var2.s().id_class(var1);
      }
   }

   public void id_class(rrns_3 var1) {
      C_case var2 = C_throws.id_class().id_private();
      if (var2 != null) {
         var2.s().id_class(var1);
      }
   }

   public void id_class(iB_2 var1) {
      if (cb_3.class.isInstance(var1)) {
         C_case var2 = C_throws.id_class().id_private();
         if (var2 != null) {
            t_1 var3 = ((t_1)t_1.id_class[shortsf9703d96375232b196815afd59d1eb48[42]])
               .id_break((w_1)w_1.staticFieldsa114f317008a3fe78339d2b3c5e6fe39[shortsf9703d96375232b196815afd59d1eb48[43]]);
            var2.s().id_class(var3);
         }
      }
   }

   public void id_class(rrLX var1) {
      for (C_case var3 : C_throws.id_class().id_case()) {
         var3.s().id_class(var1);
      }
   }

   public void id_class(rrAO var1) {
      for (C_case var3 : C_throws.id_class().id_case()) {
         var3.s().id_class(var1);
      }
   }

   public void id_class(rrLp_1 var1) {
      for (C_case var3 : C_throws.id_class().id_case()) {
         var3.s().id_class(var1);
      }
   }

   public void id_class(Ml_1 var1, float var2, rjV_2 var3) {
      for (C_case var5 : C_throws.id_class().id_case()) {
         var5.s().id_class(new T(var2, var1, var3));
      }
   }

   public void id_class(rrAK var1) {
      for (C_case var3 : C_throws.id_class().id_case()) {
         var3.s().id_class(var1);
      }
   }

   public void id_class(rrLx_1 var1) {
      for (C_case var3 : C_throws.id_class().id_case()) {
         var3.s().id_class(var1);
      }
   }

   public void id_class(rrLO var1) {
      for (C_case var3 : C_throws.id_class().id_case()) {
         var3.s().id_class(var1);
      }
   }

   public void id_class(rrFi_1 var1) {
      for (C_case var3 : C_throws.id_class().id_case()) {
         var3.s().id_class(var1);
      }
   }

   public void id_class(ruS_2<?> var1, rum_3 var2) {
      if (var2 == rum_3.CLIENTBOUND) {
         for (C_case var4 : C_throws.id_class().id_case()) {
            if (var4.id_throw().id_catch() != null
               && ((Aq_1)var4.id_throw().id_catch().id_break[shortsf9703d96375232b196815afd59d1eb48[59]]).id_class()
                  == ((Aq_1)((cb_3)id_import.id_class[shortsf9703d96375232b196815afd59d1eb48[60]]).id_break[shortsf9703d96375232b196815afd59d1eb48[61]])
                     .id_class()) {
               var4.s()
                  .id_break(
                     new y_1(
                        ((Aq_1)((cb_3)id_import.id_class[shortsf9703d96375232b196815afd59d1eb48[62]]).id_break[shortsf9703d96375232b196815afd59d1eb48[63]])
                           .id_class(),
                        (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[shortsf9703d96375232b196815afd59d1eb48[64]],
                        var1
                     )
                  );
            }
         }
      }
   }

   public void id_class(rrFe_1 var1) {
      for (C_case var3 : C_throws.id_class().id_case()) {
         var3.s().id_class(var1);
      }
   }

   public void id_class() {
      for (C_case var2 : C_throws.id_class().id_case()) {
         cb_3 var3 = var2.id_throw().id_catch();
         if (var3 != null
            && (Aq_1)var3.id_break[shortsf9703d96375232b196815afd59d1eb48[31]]
               == (Aq_1)((cb_3)id_import.id_class[shortsf9703d96375232b196815afd59d1eb48[32]]).id_break[shortsf9703d96375232b196815afd59d1eb48[33]]) {
            var2.s().id_volatile();
         }
      }
   }

   public void id_class(rrAZ var1) {
      for (C_case var3 : C_throws.id_class().id_case()) {
         var3.s().id_class(var1);
      }
   }

   public void id_class(t_1 var1) {
      C_case var2 = C_throws.id_class().id_private();
      if (var2 != null) {
         var2.s().id_class(var1);
      }
   }

   public void id_class(rrAS var1) {
      for (C_case var3 : C_throws.id_class().id_case()) {
         var3.s().id_class(var1);
      }
   }

   public void id_class(rrFK var1) {
      for (C_case var3 : C_throws.id_class().id_case()) {
         var3.s().id_class(var1);
      }
   }

   public void id_class(rrAo_1 var1) {
      for (C_case var3 : C_throws.id_class().id_case()) {
         var3.s().id_class(var1);
      }
   }

   public void id_class(rrAc_1 var1) {
      for (C_case var3 : C_throws.id_class().id_case()) {
         var3.s().id_class(var1);
      }
   }

   public boolean id_class(vm_3 var1) {
      return (!C_throws.id_class().id_break().id_this().id_catch() || (cb_3)id_import.id_class[shortsf9703d96375232b196815afd59d1eb48[52]] == null)
            && !var1.id_continue
         ? booleansf9703d96375232b196815afd59d1eb48[16]
         : booleansf9703d96375232b196815afd59d1eb48[15];
   }

   public void id_class(rrLv_1 var1) {
      for (C_case var3 : C_throws.id_class().id_case()) {
         var3.s().id_class(var1);
      }
   }

   public boolean id_class(cW_2 var1) {
      Lu_1 var2 = var1.id_byte();
      String var3 = var2.id_private();
      String var4 = var3.substring(booleansf9703d96375232b196815afd59d1eb48[8], Math.min(var3.length(), var2.id_final()));
      f_1 var5 = new f_1(var4);
      C_throws.id_class().id_break().s().id_class(var5);
      if (var5.id_byte()) {
         return booleansf9703d96375232b196815afd59d1eb48[9];
      } else if ((String[])var5.id_class[shortsf9703d96375232b196815afd59d1eb48[34]] != null) {
         var5.id_break();
         var1.id_class(null);
         if (var1.id_case()) {
            return booleansf9703d96375232b196815afd59d1eb48[10];
         } else {
            var2.id_byte(null);
            var1.id_class(null);
            var1.id_throws().clear();
            if (((String[])var5.id_class[shortsf9703d96375232b196815afd59d1eb48[35]]).length == 0) {
               var1.id_class(Suggestions.empty());
            } else {
               StringRange var6 = StringRange.between(
                  var4.lastIndexOf(stringsf9703d96375232b196815afd59d1eb48[0]) + booleansf9703d96375232b196815afd59d1eb48[11], var4.length()
               );
               List var7 = Stream.<String>of((String[])var5.id_class[shortsf9703d96375232b196815afd59d1eb48[36]])
                  .map(var1x -> new Suggestion(var6, var1x))
                  .collect(Collectors.toList());
               Suggestions var8 = new Suggestions(var6, var7);
               var1.id_class(new CompletableFuture<>());
               var1.id_protected().complete(var8);
            }

            var1.id_break(booleansf9703d96375232b196815afd59d1eb48[12]);
            return booleansf9703d96375232b196815afd59d1eb48[13];
         }
      } else {
         return booleansf9703d96375232b196815afd59d1eb48[14];
      }
   }

   public void id_class(rrLU var1) {
      for (C_case var3 : C_throws.id_class().id_case()) {
         var3.s().id_class(var1);
      }
   }

   public void id_class(an_3 var1) {
      Float var7 = (Float)var1.id_throws[shortsf9703d96375232b196815afd59d1eb48[37]];
      var1.id_throws[shortsf9703d96375232b196815afd59d1eb48[38]] = var7;
      if (cb_3.class.isInstance(var1) && C_throws.id_class().id_private() != null) {
         t_1 var2 = ((t_1)t_1.id_class[shortsf9703d96375232b196815afd59d1eb48[39]])
            .id_break((w_1)w_1.staticFieldsa114f317008a3fe78339d2b3c5e6fe39[shortsf9703d96375232b196815afd59d1eb48[40]]);
         Float var8 = var2.id_class().id_throws();
         var1.id_throws[shortsf9703d96375232b196815afd59d1eb48[41]] = var8;
      }
   }

   public void id_class(rrFo_1 var1) {
      for (C_case var3 : C_throws.id_class().id_case()) {
         var3.s().id_class(var1);
      }
   }

   public void id_class(rrLz_1 var1) {
      for (C_case var3 : C_throws.id_class().id_case()) {
         var3.s().id_class(var1);
      }
   }

   public void id_class(rrAT var1) {
      for (C_case var3 : C_throws.id_class().id_case()) {
         var3.s().id_class(var1);
      }
   }

   public void id_class(rrLV var1) {
      for (C_case var3 : C_throws.id_class().id_case()) {
         var3.s().id_class(var1);
      }
   }

   public void id_class(rrLs_1 var1) {
      if ((cb_3)id_import.id_class[shortsf9703d96375232b196815afd59d1eb48[77]] != null
         && (gm_3)id_import.id_class[shortsf9703d96375232b196815afd59d1eb48[78]] != null) {
         for (C_case var3 : C_throws.id_class().id_case()) {
            var3.s().id_class(var1);
         }
      }
   }

   public void id_class(PacketEvent var1) {
      for (C_case var3 : C_throws.id_class().id_case()) {
         var3.s().id_class(var1);
      }
   }

   public void id_class(rrAX var1) {
      C_case var2 = C_throws.id_class().id_private();
      if (var2 != null) {
         var2.s().id_class(var1);
      }
   }

   public void id_class(gm_3 var1) {
      C_throws.id_class().id_break().s().id_class(new g_1(var1, (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[shortsf9703d96375232b196815afd59d1eb48[51]]));
   }

   public void id_class(rrAM var1) {
      for (C_case var3 : C_throws.id_class().id_case()) {
         var3.s().id_class(var1);
      }
   }

   public void id_class(rrnG_2 var1) {
      for (C_case var3 : C_throws.id_class().id_case()) {
         var3.s().id_class(var1);
      }
   }

   public void id_class(rFZ var1) {
      for (C_case var3 : C_throws.id_class().id_case()) {
         cb_3 var4 = var3.id_throw().id_catch();
         if (var4 != null
            && (Aq_1)var4.id_break[shortsf9703d96375232b196815afd59d1eb48[8]]
               == (Aq_1)((cb_3)id_import.id_class[shortsf9703d96375232b196815afd59d1eb48[9]]).id_break[shortsf9703d96375232b196815afd59d1eb48[10]]) {
            l_1 var5 = new l_1(
               (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[shortsf9703d96375232b196815afd59d1eb48[11]],
               (H)H.staticFields1fafa9bf76ed3352892023b88da3732d[shortsf9703d96375232b196815afd59d1eb48[12]],
               var1.id_break(),
               var1.id_byte()
            );
            var3.s().id_class(var5);
         }
      }
   }

   public void id_class(rrLa_1 var1) {
      for (C_case var3 : C_throws.id_class().id_case()) {
         var3.s().id_class(var1);
      }
   }

   public void id_class(rrLh_1 var1) {
      for (C_case var3 : C_throws.id_class().id_case()) {
         var3.s().id_class(var1);
      }
   }

   public void id_class(rrAl_1 var1) {
      for (C_case var3 : C_throws.id_class().id_case()) {
         var3.s().id_class(var1);
      }
   }

   public void id_class(rrFf_1 var1) {
      for (C_case var3 : C_throws.id_class().id_case()) {
         var3.s().id_class(var1);
      }
   }

   public void id_class(rrFw_1 var1) {
      for (C_case var3 : C_throws.id_class().id_case()) {
         var3.s().id_class(var1);
      }
   }

   public void id_break(ruS_2<?> var1, rum_3 var2) {
      if (var2 == rum_3.CLIENTBOUND) {
         for (C_case var4 : C_throws.id_class().id_case()) {
            if (var4.id_throw().id_catch() != null
               && ((Aq_1)var4.id_throw().id_catch().id_break[shortsf9703d96375232b196815afd59d1eb48[65]]).id_class()
                  == ((Aq_1)((cb_3)id_import.id_class[shortsf9703d96375232b196815afd59d1eb48[66]]).id_break[shortsf9703d96375232b196815afd59d1eb48[67]])
                     .id_class()) {
               var4.s()
                  .id_class(
                     new y_1(
                        ((Aq_1)((cb_3)id_import.id_class[shortsf9703d96375232b196815afd59d1eb48[68]]).id_break[shortsf9703d96375232b196815afd59d1eb48[69]])
                           .id_class(),
                        (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[shortsf9703d96375232b196815afd59d1eb48[70]],
                        var1
                     )
                  );
            }
         }
      }
   }

   public void id_break() {
      C_case var1 = C_throws.id_class().id_private();
      if (var1 != null) {
         ((Br_1)var1.id_catch()).id_throws();
      }
   }

   public boolean id_break(String var1) {
      C var2 = new C(var1);
      C_case var3 = C_throws.id_class().id_private();
      if (var3 == null) {
         return booleansf9703d96375232b196815afd59d1eb48[3];
      } else {
         var3.s().id_class(var2);
         return var2.id_byte();
      }
   }

   public void id_break(gm_3 var1) {
      if ((gm_3)id_import.id_class[shortsf9703d96375232b196815afd59d1eb48[48]] != null || var1 != null) {
         C_throws.id_class()
            .id_break()
            .s()
            .id_class(new g_1(var1, (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[shortsf9703d96375232b196815afd59d1eb48[49]]));
         ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[shortsf9703d96375232b196815afd59d1eb48[50]]).id_finally().id_class(rrnu_3.id_class(var1));
      }
   }

   public void id_break(rFZ var1) {
      for (C_case var3 : C_throws.id_class().id_case()) {
         cb_3 var4 = var3.id_throw().id_catch();
         if (var4 != null
            && (Aq_1)var4.id_break[shortsf9703d96375232b196815afd59d1eb48[13]]
               == (Aq_1)((cb_3)id_import.id_class[shortsf9703d96375232b196815afd59d1eb48[14]]).id_break[shortsf9703d96375232b196815afd59d1eb48[15]]) {
            l_1 var5 = new l_1(
               (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[shortsf9703d96375232b196815afd59d1eb48[16]],
               (H)H.staticFields1fafa9bf76ed3352892023b88da3732d[shortsf9703d96375232b196815afd59d1eb48[17]],
               var1.id_break(),
               var1.id_byte()
            );
            var3.s().id_class(var5);
         }
      }
   }

   private static void id_throws() {
      Object[] var0 = new Object[]{new C_break(), null};
      var0[1] = new C_break[]{(C_break)var0[0]};
      staticFieldsf9703d96375232b196815afd59d1eb48 = var0;
   }

   private static void id_catch() {
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

   private static void id_implements() {
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

   private static void id_protected() {
      bytesf9703d96375232b196815afd59d1eb48 = new byte[]{4, 4, 2};
   }

   public void id_protected(ruS_2<?> var1, rum_3 var2) {
      if (var2 == rum_3.CLIENTBOUND) {
         for (C_case var4 : C_throws.id_class().id_case()) {
            if (var4.id_throw().id_catch() != null
               && ((Aq_1)var4.id_throw().id_catch().id_break[shortsf9703d96375232b196815afd59d1eb48[71]]).id_class()
                  == ((Aq_1)((cb_3)id_import.id_class[shortsf9703d96375232b196815afd59d1eb48[72]]).id_break[shortsf9703d96375232b196815afd59d1eb48[73]])
                     .id_class()) {
               var4.s()
                  .id_class(
                     new y_1(
                        ((Aq_1)((cb_3)id_import.id_class[shortsf9703d96375232b196815afd59d1eb48[74]]).id_break[shortsf9703d96375232b196815afd59d1eb48[75]])
                           .id_class(),
                        (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[shortsf9703d96375232b196815afd59d1eb48[76]],
                        var1
                     )
                  );
            }
         }
      }
   }

   private static void id_private() {
      stringsf9703d96375232b196815afd59d1eb48 = new String[]{new String(" "), new String("INSTANCE")};
   }
}
