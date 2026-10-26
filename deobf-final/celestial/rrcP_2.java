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

public class rrcP_2 implements rrNi_1<String> {
   private static String[] break_;
   public Object[] class_;
   private static short[] byte_;
   private static boolean[] protected_;

   private static void byte_() {
      break_ = new String[]{new String("Shulker"), new String("Shulker"), new String("Shulker")};
   }

   public rrcP_2(BiFunction<rrNw_1, rdn_3, Integer> var1) {
      this.class_();
      this.class_[0] = var1;
   }

   static {
      ntfClinit();
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -7894408092369278109L;
   }

   @Override
   public boolean class_(String var1, List<rrNw_1> var2, List<rrNd_1> var3, rrcr_3 var4) {
      Map var5 = this.class_(var2);
      if (var5.isEmpty()) {
         return false;
      } else {
         boolean var6 = protected_[1];

         for (rrNd_1 var8 : var3) {
            Pair var9 = (Pair)var5.get("Shulker");
            if (var9 != null) {
               var4.accept(var8, (rrNw_1)var9.getLeft(), (Integer)var9.getRight());
               var6 = true;
            }
         }

         return var6;
      }
   }

   @Override
   public Map<String, Pair<rrNw_1, Integer>> class_(List<rrNw_1> var1) {
      HashMap var2 = new HashMap();

      for (rrNw_1 var4 : var1) {
         rdn_3 var5 = var4.protected_();
         int var6 = (Integer)((BiFunction)this.class_[0]).apply(var4, var5);
         if (var6 > 0) {
            Pair var7 = (Pair)var2.get("Shulker");
            if (var7 == null || (Integer)var7.getRight() > var6) {
               var2.put("Shulker", Pair.of(var4, var6));
            }
         }
      }

      return var2;
   }

   private void class_() {
      if (this.class_ == null) {
         this.class_ = new Object[1];
         Object[] var1 = this.class_;
      }
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -545923835;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-126, -91, 69, 68, 22, -6, -52, -74}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void break_() {
      byte_ = new short[2];
   }

   private static void protected_() {
      protected_ = new boolean[]{false, false, true, true};
   }
}
