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
   private static String[] id_break;
   public Object[] id_class;
   private static short[] id_byte;
   private static boolean[] id_protected;

   private static void id_byte() {
      id_break = new String[]{new String("Shulker"), new String("Shulker"), new String("Shulker")};
   }

   public rrcP_2(BiFunction<rrNw_1, rdn_3, Integer> var1) {
      this.id_class();
      this.id_class[id_byte[1]] = var1;
   }

   static {
      ntfClinit();
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -7894408092369278109L;
   }

   @Override
   public boolean id_class(String var1, List<rrNw_1> var2, List<rrNd_1> var3, rrcr_3 var4) {
      Map var5 = this.id_class(var2);
      if (var5.isEmpty()) {
         return id_protected[0];
      } else {
         boolean var6 = id_protected[1];

         for (rrNd_1 var8 : var3) {
            Pair var9 = (Pair)var5.get(id_break[0]);
            if (var9 != null) {
               var4.accept(var8, (rrNw_1)var9.getLeft(), (Integer)var9.getRight());
               var6 = id_protected[2];
            }
         }

         return var6;
      }
   }

   @Override
   public Map<String, Pair<rrNw_1, Integer>> id_class(List<rrNw_1> var1) {
      HashMap var2 = new HashMap();

      for (rrNw_1 var4 : var1) {
         rdn_3 var5 = var4.id_protected();
         int var6 = (Integer)((BiFunction)this.id_class[id_byte[0]]).apply(var4, var5);
         if (var6 > 0) {
            Pair var7 = (Pair)var2.get(id_break[1]);
            if (var7 == null || (Integer)var7.getRight() > var6) {
               var2.put(id_break[2], Pair.of(var4, var6));
            }
         }
      }

      return var2;
   }

   private void id_class() {
      if (this.id_class == null) {
         this.id_class = new Object[id_protected[3]];
         Object[] var1 = this.id_class;
      }
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -545923835;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-126, -91, 69, 68, 22, -6, -52, -74}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_break() {
      id_byte = new short[2];
   }

   private static void id_protected() {
      id_protected = new boolean[]{false, false, true, true};
   }
}
