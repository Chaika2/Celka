package celestial;

import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.apache.commons.lang3.tuple.Pair;

public class rrNY implements rrNi_1<rrfE_2> {
   private static short[] break_;
   public Object[] class_;
   private static boolean[] byte_;

   private static void byte_() {
      byte_ = new boolean[]{false, false, true, true};
   }

   public rrNY(BiFunction<rrNw_1, rdn_3, Integer> var1) {
      this.protected_();
      this.class_[0] = var1;
   }

   static {
      ntfClinit();
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{13, -105, 122, -6, 26, 85, -25, 64}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public boolean class_(String var1, List<rrNw_1> var2, List<rrNd_1> var3, rrcr_3 var4) {
      Map var5 = this.class_(var2);
      if (var5.isEmpty()) {
         return false;
      } else {
         boolean var6 = byte_[1];

         for (rrNd_1 var8 : var3) {
            rrfE_2 var9 = null;

            for (rrcT_2 var11 : var8.instanceof_()) {
               if (var11 instanceof rrcb_3 var12) {
                  var9 = var12.class_();
                  break;
               }
            }

            if (var9 != null) {
               Pair var13 = (Pair)var5.get(var9);
               if (var13 != null) {
                  var4.accept(var8, (rrNw_1)var13.getLeft(), (Integer)var13.getRight());
                  var6 = true;
               }
            }
         }

         return var6;
      }
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 182369317;
   }

   @Override
   public Map<rrfE_2, Pair<rrNw_1, Integer>> class_(List<rrNw_1> var1) {
      HashMap var2 = new HashMap();

      for (rrNw_1 var4 : var1) {
         rdn_3 var5 = var4.protected_();
         rrfE_2 var6 = rrfE_2.class_(var5);
         if (var6 != null) {
            int var7 = (Integer)((BiFunction)this.class_[0]).apply(var4, var5);
            if (var7 > 0) {
               Pair var8 = (Pair)var2.get(var6);
               if (var8 == null || (Integer)var8.getRight() > var7) {
                  var2.put(var6, Pair.of(var4, var7));
               }
            }
         }
      }

      return var2;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 2419857710495060737L;
   }

   public BiFunction<rrNw_1, rdn_3, Integer> class_() {
      return (BiFunction<rrNw_1, rdn_3, Integer>)this.class_[0];
   }

   private static void break_() {
      break_ = new short[3];
   }

   private void protected_() {
      if (this.class_ == null) {
         this.class_ = new Object[1];
         Object[] var1 = this.class_;
      }
   }
}
