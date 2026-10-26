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
   private static short[] id_byte;
   public Object[] id_break;
   private static boolean[] id_protected;
   private static byte[] id_throws;

   public rV_2(rq_3 var1, Map<xd_3, List<xd_3>> var2) {
      super(var1.id_break(), var1.id_class(), var1.id_byte());
      this.id_private();
      HashMap var7 = new HashMap();
      this.id_break[id_byte[0]] = var7;
      this.id_break[id_byte[1]] = var1;
      this.id_break[id_byte[2]] = var2;
   }

   static {
      ntfClinit();
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 3510230490498420567L;
   }

   @Override
   public boolean id_class(int var1, int var2, int var3, xc_3 var4) {
      this.id_private();
      return ((rq_3)this.id_break[id_byte[3]]).id_class(var1, var2, var3, var4);
   }

   private xc_3 id_class(xc_3 var1, xd_3 var2) {
      this.id_private();
      if (((Map)this.id_break[id_byte[7]]).containsKey(var1) && ((Map)((Map)this.id_break[id_byte[8]]).get(var1)).containsKey(var2)) {
         return (xc_3)((Map)((Map)this.id_break[id_byte[9]]).get(var1)).get(var2);
      } else {
         Collection var3 = var1.id_break().id_new().id_protected();
         xc_3 var4 = var2.id_continue();

         for (rCZ var6 : var3) {
            try {
               var4 = this.id_class(var1, var4, var6);
            } catch (IllegalArgumentException var8) {
            }
         }

         ((Map)this.id_break[id_byte[10]]).computeIfAbsent(var1, var0 -> new HashMap<>()).put(var2, var4);
         return var4;
      }
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 400062676;
   }

   @Override
   public xc_3 id_class(int var1, int var2, int var3, xc_3 var4, List<xc_3> var5) {
      this.id_private();
      xc_3 var6 = ((rq_3)this.id_break[id_byte[4]]).id_class(var1, var2, var3, var4, var5);
      xd_3 var7 = var6.id_break();
      if (!((Map)this.id_break[id_byte[5]]).containsKey(var7)) {
         return var6;
      } else {
         List var8 = (List)((Map)this.id_break[id_byte[6]]).get(var7);
         if (var8.contains(var4.id_break()) && !(var4.id_break() instanceof Ja_1)) {
            return this.id_class(var6, var4.id_break());
         } else {
            for (xd_3 var10 : var8) {
               if (var10 instanceof Ja_1) {
                  return var4.id_break() instanceof Ja_1 ? var4 : xu_3.id_class.id_continue();
               }

               for (xc_3 var12 : var5) {
                  if (var10.equals(var12.id_break())) {
                     return this.id_class(var6, var12.id_break());
                  }
               }
            }

            return ((xd_3)var8.get(id_protected[0])).id_continue();
         }
      }
   }

   private <T extends Comparable<T>> xc_3 id_class(xc_3 var1, xc_3 var2, rCZ<T> var3) {
      return var2.id_class(var3, var1.id_byte(var3));
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-24, -66, -85, -50, 64, 63, 123, 99}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_throws() {
      id_byte = new short[]{2, 0, 1, 0, 0, 1, 1, 2, 2, 2, 2};
   }

   private static void id_catch() {
      id_protected = new boolean[1];
   }

   private static void id_case() {
      id_throws = new byte[]{3};
   }

   private void id_private() {
      if (this.id_break == null) {
         this.id_break = new Object[id_throws[0]];
         Object[] var1 = this.id_break;
      }
   }
}
