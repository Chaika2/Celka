package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrcJ_2 extends rrfI_2<rrfM_2> {
   public Object[] id_class;
   private static boolean[] id_break;
   private static short[] id_byte;
   private static byte[] id_protected;

   @Override
   public boolean id_byte() {
      this.id_case();
      return this.id_break() == (rrfM_2)((rrcX_2)this.id_class[1]).id_class[0] ? true : id_break[1];
   }

   public rrcJ_2(rrcX_2 var1, rrNw_1 var2) {
      this.id_case();
      this.id_class[1] = var1;
      this.id_class[0] = var2;
   }

   static {
      ntfClinit();
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1567958577;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{61, 30, -94, -43, -88, 32, 117, 21}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -7981966584593252488L;
   }

   public rrfM_2 id_break() {
      this.id_case();
      rJY var1 = ((rrNw_1)this.id_class[0]).id_throws();
      return rrfM_2.id_class(var1 == null ? ((rrNw_1)this.id_class[0]).id_protected() : var1.id_class());
   }

   private static void id_throws() {
      id_byte = new short[]{1, 0, 0, 0, 1, 0};
   }

   private static void id_catch() {
      id_protected = new byte[]{2};
   }

   private void id_case() {
      if (this.id_class == null) {
         this.id_class = new Object[2];
         Object[] var1 = this.id_class;
      }
   }

   private static void id_protected() {
      id_break = new boolean[]{true, false};
   }
}
