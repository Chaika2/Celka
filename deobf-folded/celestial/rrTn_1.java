package celestial;

import java.nio.charset.StandardCharsets;
import java.util.Objects;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrTn_1 implements rrTA, MinecraftAccessor {
   private static boolean[] id_break;
   private static short[] id_byte;
   public Object[] id_class;

   public rrTn_1(rjU_2 var1) {
      this.id_case();
      this.id_class[id_byte[6]] = var1;
   }

   static {
      ntfClinit();
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         rrTn_1 var2 = (rrTn_1)var1;
         return Objects.equals((rjU_2)this.id_class[id_byte[3]], (rjU_2)var2.id_class[id_byte[4]]);
      } else {
         return id_break[6];
      }
   }

   @Override
   public int hashCode() {
      Object[] var10000 = new Object[1];
      var10000[id_break[8]] = (rjU_2)this.id_class[id_byte[5]];
      return Objects.hash(var10000);
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{36, -76, -64, 96, 88, 25, -104, 32}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 5642351483299387607L;
   }

   @Override
   public boolean id_class(rjU_2 var1, rrTj_1 var2, Predicate<xc_3> var3) {
      rjG_2 var4 = Ph_1.id_class(var1, (rjU_2)this.id_class[id_byte[1]], rjS_2.OUTLINE, id_break[0]);
      if (var4 instanceof rff_3 var5) {
         if (var3 != null && !var3.test(((gm_3)id_import.id_class[56]).id_byte(var5.id_class()))) {
            return true;
         }

         if (var2 instanceof rrTV var6 && var6.id_class(var5.id_class())) {
            return true;
         }
      }

      return var4 != null && var4.id_byte() != rjM_2.MISS ? id_break[4] : true;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1324837578;
   }

   private static void id_throws() {
      id_byte = new short[]{0, 0, 56, 0, 0, 0, 0};
   }

   private void id_case() {
      if (this.id_class == null) {
         this.id_class = new Object[1];
         Object[] var1 = this.id_class;
      }
   }

   private static void id_protected() {
      id_break = new boolean[]{false, true, true, true, false, true, false, true, false, true};
   }

   @Override
   public rjU_2 rr() {
      return (rjU_2)this.id_class[id_byte[0]];
   }
}
