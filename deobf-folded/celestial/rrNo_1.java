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

public class rrNo_1 implements rrNi_1<rrfG_2> {
   private static short[] id_break;
   private static boolean[] id_byte;
   public Object[] id_class;

   private void id_byte() {
      if (this.id_class == null) {
         this.id_class = new Object[1];
         Object[] var1 = this.id_class;
      }
   }

   public rrNo_1(BiFunction<rrNw_1, rdn_3, Integer> var1) {
      this.id_byte();
      this.id_class[id_break[2]] = var1;
   }

   static {
      ntfClinit();
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -775704141;
   }

   @Override
   public boolean id_class(String var1, List<rrNw_1> var2, List<rrNd_1> var3, rrcr_3 var4) {
      Map var5 = this.id_class(var2);
      if (var5.isEmpty()) {
         return id_byte[0];
      } else {
         boolean var6 = id_byte[1];

         for (rrNd_1 var8 : var3) {
            rrfG_2 var9 = null;

            for (rrcT_2 var11 : var8.id_instanceof()) {
               if (var11 instanceof rrcO_2 var12) {
                  var9 = var12.id_class();
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

   public BiFunction<rrNw_1, rdn_3, Integer> id_class() {
      return (BiFunction<rrNw_1, rdn_3, Integer>)this.id_class[id_break[1]];
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 5766669142606784492L;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-85, 121, 16, -74, -30, -49, 125, -32}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public Map<rrfG_2, Pair<rrNw_1, Integer>> id_class(List<rrNw_1> var1) {
      HashMap var2 = new HashMap();

      for (rrNw_1 var4 : var1) {
         rdn_3 var5 = var4.id_protected();
         rrfG_2 var6 = rrfG_2.id_class(var5);
         if (var6 != null) {
            int var7 = (Integer)((BiFunction)this.id_class[id_break[0]]).apply(var4, var5);
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

   private static void id_break() {
      id_byte = new boolean[]{false, false, true, true};
   }

   private static void id_protected() {
      id_break = new short[3];
   }
}
