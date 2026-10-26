package celestial;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class GX extends MP {
   private static byte[] break_;
   private static boolean[] byte_;
   private static short[] protected_;
   public Object[] class_;

   @Override
   public rP_2 byte_() {
      this.finally_();
      return (rP_2)this.class_[3];
   }

   private GX(List<rU_2> var1, List<rd_3> var2, int var3, rP_2 var4) {
      this.finally_();
      this.class_[0] = var1;
      this.class_[1] = var2;
      Integer var11 = var3;
      this.class_[2] = var11;
      this.class_[3] = var4;
      this.throws_();
   }

   static {
      ntfClinit();
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 7462939888408117471L;
   }

   @Override
   public int class_() {
      this.finally_();
      return ((List)this.class_[0]).size();
   }

   public static Optional<GX> class_(a_1 var0, a_1 var1, boolean var2) {
      if (var1 != null && var0 != null) {
         if (!var0.protected_().equals(var1.implements_())) {
            return Optional.empty();
         } else {
            HashSet var3 = new HashSet<>(var1.break_());
            int var4 = -1;

            for (int var5 = 0; var5 < var0.class_() - 1; var5++) {
               if (var3.contains(var0.break_().get(var5))) {
                  var4 = var5;
                  break;
               }
            }

            if (var4 != -1) {
               if (!var2) {
                  return Optional.empty();
               }
            } else {
               var4 = var0.class_() - 1;
            }

            int var8 = var1.break_().indexOf(var0.break_().get(var4));
            if (!var2 && var8 != 0) {
               throw new IllegalStateException();
            } else {
               ArrayList var6 = new ArrayList();
               ArrayList var7 = new ArrayList();
               var6.addAll(var0.break_().subList(0, var4 + 1));
               var7.addAll(var0.catch_().subList(0, var4));
               var6.addAll(var1.break_().subList(var8 + 1, var1.class_()));
               var7.addAll(var1.catch_().subList(var8, var1.class_() - 1));
               return Optional.of(new GX(var6, var7, var0.case_() + var1.case_(), var0.byte_()));
            }
         }
      } else {
         return Optional.empty();
      }
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{58, 72, 33, 5, 77, 53, -45, -126}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public List<rU_2> break_() {
      this.finally_();
      return Collections.unmodifiableList((List<? extends rU_2>)this.class_[0]);
   }

   private static int break_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 2045034533;
   }

   private void finally_() {
      if (this.class_ == null) {
         this.class_ = new Object[4];
         Object[] var1 = this.class_;
         var1[2] = 0;
      }
   }

   @Override
   public List<rd_3> catch_() {
      this.finally_();
      return Collections.unmodifiableList((List<? extends rd_3>)this.class_[1]);
   }

   private static void extends_() {
      break_ = new byte[]{-1, -1, 4, 2};
   }

   @Override
   public int case_() {
      this.finally_();
      return (Integer)this.class_[2];
   }

   private static void volatile_() {
      byte_ = new boolean[]{false, true, true, false, true, false, true, true, false};
   }

   private static void native_() {
      protected_ = new short[]{0, 1, 2, 3, 3, 1, 0, 2, 0};
   }
}
