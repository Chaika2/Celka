package celestial;

import java.nio.charset.StandardCharsets;
import java.util.Set;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrcL_2 extends rrfI_2<Boolean> {
   private static boolean[] id_break;
   private static short[] id_byte;
   public Object[] id_class;

   @Override
   public boolean id_byte() {
      return this.id_break();
   }

   public rrcL_2(rrcF_2 var1, rrNw_1 var2) {
      this.id_protected();
      this.id_class[0] = var2;
   }

   static {
      ntfClinit();
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 976138470;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-35, -88, 45, -65, 45, 48, -85, -87}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 6829119020563490660L;
   }

   public Boolean id_break() {
      this.id_protected();
      if ((rrNw_1)this.id_class[0] instanceof rrNt_1 var1) {
         rJY var2 = var1.id_throws();
         int var3 = var1.id_case();
         rdn_3 var4 = var2 == null ? ((rrNw_1)this.id_class[0]).id_protected() : var2.id_class();
         rdb_3 var5 = var4.id_break();

         for (rrcA_2 var7 : (Set)rrcF_2.id_class[0]) {
            if (var7.id_break() == var5) {
               for (rrcn_3 var11 : var7.id_class()) {
                  Predicate var12 = var11.id_class();
                  if (var12 == null || var12.test(var2)) {
                     int var13 = var11.id_break();
                     if (var3 == var13) {
                        return false;
                     }
                  }
               }
            }
         }
      }

      return id_break[2];
   }

   private static void id_throws() {
      id_break = new boolean[]{false, false, true, true};
   }

   private static void id_case() {
      id_byte = new short[5];
   }

   private void id_protected() {
      if (this.id_class == null) {
         this.id_class = new Object[1];
         Object[] var1 = this.id_class;
      }
   }
}
