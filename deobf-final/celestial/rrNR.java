package celestial;

import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.apache.commons.lang3.tuple.Pair;

public class rrNR implements rrNi_1<rdb_3> {
   private static short[] break_;
   public Object[] class_;
   private static byte[] byte_;
   private static boolean[] protected_;

   private static void byte_() {
      byte_ = new byte[]{2};
   }

   public rrNR(BiFunction<rrNw_1, rdn_3, Integer> var1, Predicate<rrNw_1> var2) {
      this.case_();
      this.class_[0] = var1;
      this.class_[1] = var2;
   }

   static {
      ntfClinit();
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{45, 76, 78, 50, 73, 56, 39, -62}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public Map<rdb_3, Pair<rrNw_1, Integer>> class_(List<rrNw_1> var1) {
      HashMap var2 = new HashMap();

      for (rrNw_1 var4 : var1) {
         if ((Predicate)this.class_[1] == null || ((Predicate)this.class_[1]).test(var4)) {
            rdn_3 var5 = var4.protected_();
            rdb_3 var6 = var5.break_();
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

   @Override
   public boolean class_(String var1, List<rrNw_1> var2, List<rrNd_1> var3, rrcr_3 var4) {
      Map var5 = this.class_(var2);
      if (var5.isEmpty()) {
         return false;
      } else {
         boolean var6 = protected_[1];

         for (rrNd_1 var8 : var3) {
            rdb_3 var9 = var8.catch_();
            Pair var10 = (Pair)var5.get(var9);
            if (var10 != null) {
               var4.accept(var8, (rrNw_1)var10.getLeft(), (Integer)var10.getRight());
               var6 = true;
            }
         }

         return var6;
      }
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1608829139;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 7912337134400388593L;
   }

   public BiFunction<rrNw_1, rdn_3, Integer> class_() {
      return (BiFunction<rrNw_1, rdn_3, Integer>)this.class_[0];
   }

   public Predicate<rrNw_1> break_() {
      return (Predicate<rrNw_1>)this.class_[1];
   }

   private static void throws_() {
      break_ = new short[]{1, 1, 0, 0, 1, 0, 1};
   }

   private void case_() {
      if (this.class_ == null) {
         this.class_ = new Object[2];
         Object[] var1 = this.class_;
      }
   }

   private static void protected_() {
      protected_ = new boolean[]{false, false, true};
   }
}
