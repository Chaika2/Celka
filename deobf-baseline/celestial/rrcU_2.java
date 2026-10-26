package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrcU_2 extends rrfI_2<Boolean> {
   private static boolean[] id_break;
   public Object[] id_class;
   private static short[] id_byte;
   private static String[] id_protected;

   @Override
   public boolean id_byte() {
      return this.id_break();
   }

   public rrcU_2(rrcD_2 var1, rrNw_1 var2) {
      this.id_throws();
      this.id_class[id_byte[0]] = var2;
   }

   static {
      ntfClinit();
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -839121486;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 1916070708354913941L;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-64, 44, 8, -15, 64, 29, -107, 67}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public Boolean id_break() {
      this.id_throws();
      rJY var1 = ((rrNw_1)this.id_class[id_byte[1]]).id_throws();
      rdn_3 var2 = var1 == null ? ((rrNw_1)this.id_class[id_byte[2]]).id_protected() : var1.id_class();
      return !var2.id_continue().getString().equals(id_protected[0]) && !var2.id_protected(id_protected[1]) ? id_break[1] : id_break[0];
   }

   private void id_throws() {
      if (this.id_class == null) {
         this.id_class = new Object[id_break[2]];
         Object[] var1 = this.id_class;
      }
   }

   private static void id_catch() {
      id_break = new boolean[]{true, false, true};
   }

   private static void id_case() {
      id_protected = new String[]{new String("[★] Серебро"), new String("isSilver")};
   }

   private static void id_protected() {
      id_byte = new short[3];
   }
}
