package celestial;

import java.nio.charset.StandardCharsets;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rV_2 extends rl_3 {
   private static short[] byte_;
   public Object[] break_;
   private static boolean[] protected_;
   private static byte[] throws_;

   public rV_2(rq_3 var1, Map<xd_3, List<xd_3>> var2) {
      super(var1.break_(), var1.class_(), var1.byte_());
      this.private_();
      HashMap var7 = new HashMap();
      this.break_[2] = var7;
      this.break_[0] = var1;
      this.break_[1] = var2;
   }

   static {
      ntfClinit();
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 3510230490498420567L;
   }

   @Override
   public boolean class_(int var1, int var2, int var3, xc_3 var4) {
      this.private_();
      return ((rq_3)this.break_[0]).class_(var1, var2, var3, var4);
   }

   private xc_3 class_(xc_3 var1, xd_3 var2) {
      this.private_();
      if (((Map)this.break_[2]).containsKey(var1) && ((Map)((Map)this.break_[2]).get(var1)).containsKey(var2)) {
         return (xc_3)((Map)((Map)this.break_[2]).get(var1)).get(var2);
      } else {
         Collection var3 = var1.break_().new_().protected_();
         xc_3 var4 = var2.continue_();

         for (rCZ var6 : var3) {
            try {
               var4 = this.class_(var1, var4, var6);
            } catch (IllegalArgumentException var8) {
            }
         }

         ((Map)this.break_[2]).computeIfAbsent(var1, var0 -> new HashMap<>()).put(var2, var4);
         return var4;
      }
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 400062676;
   }

   @Override
   public xc_3 class_(int var1, int var2, int var3, xc_3 var4, List<xc_3> var5) {
      this.private_();
      xc_3 var6 = ((rq_3)this.break_[0]).class_(var1, var2, var3, var4, var5);
      xd_3 var7 = var6.break_();
      if (!((Map)this.break_[1]).containsKey(var7)) {
         return var6;
      } else {
         List var8 = (List)((Map)this.break_[1]).get(var7);
         if (var8.contains(var4.break_()) && !(var4.break_() instanceof Ja_1)) {
            return this.class_(var6, var4.break_());
         } else {
            for (xd_3 var10 : var8) {
               if (var10 instanceof Ja_1) {
                  return var4.break_() instanceof Ja_1 ? var4 : xu_3.class_.continue_();
               }

               for (xc_3 var12 : var5) {
                  if (var10.equals(var12.break_())) {
                     return this.class_(var6, var12.break_());
                  }
               }
            }

            return ((xd_3)var8.get(0)).continue_();
         }
      }
   }

   private <T extends Comparable<T>> xc_3 class_(xc_3 var1, xc_3 var2, rCZ<T> var3) {
      return var2.class_(var3, var1.byte_(var3));
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-24, -66, -85, -50, 64, 63, 123, 99}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void throws_() {
      byte_ = new short[]{2, 0, 1, 0, 0, 1, 1, 2, 2, 2, 2};
   }

   private static void catch_() {
      protected_ = new boolean[1];
   }

   private static void case_() {
      throws_ = new byte[]{3};
   }

   private void private_() {
      if (this.break_ == null) {
         this.break_ = new Object[3];
         Object[] var1 = this.break_;
      }
   }
}
