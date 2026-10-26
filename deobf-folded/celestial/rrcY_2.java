package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrcY_2 extends rrfI_2<Boolean> {
   public Object[] id_class;
   private static boolean[] id_break;
   private static short[] id_byte;

   @Override
   public boolean id_byte() {
      return this.id_break();
   }

   public rrcY_2(rrcR_2 var1, rrNw_1 var2) {
      this.id_protected();
      this.id_class[id_byte[0]] = var2;
   }

   static {
      ntfClinit();
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 7817861422760907657L;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1463435338;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{84, -22, 85, 38, -112, 40, -118, 73}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public Boolean id_break() {
      this.id_protected();
      String var1 = ((rrNw_1)this.id_class[id_byte[1]]).id_catch();
      if (var1 == null) {
         return id_break[0];
      } else {
         return var1.equals(MinecraftAccessor.id_import.id_while().id_byte()) ? id_break[1] : true;
      }
   }

   private static void id_throws() {
      id_byte = new short[2];
   }

   private static void id_case() {
      id_break = new boolean[]{false, false, true, true};
   }

   private void id_protected() {
      if (this.id_class == null) {
         this.id_class = new Object[1];
         Object[] var1 = this.id_class;
      }
   }
}
