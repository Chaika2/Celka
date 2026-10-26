package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrcW_2 extends rrfI_2<rrfh_3> {
   private static short[] id_break;
   private static boolean[] id_byte;
   private static byte[] id_protected;
   public Object[] id_class;

   @Override
   public boolean id_byte() {
      this.id_protected();
      return this.id_break() == (rrfh_3)((rrck_3)this.id_class[id_break[4]]).id_class[id_break[5]] ? id_byte[0] : id_byte[1];
   }

   public rrcW_2(rrck_3 var1, rrNw_1 var2) {
      this.id_protected();
      this.id_class[id_break[0]] = var1;
      this.id_class[id_break[1]] = var2;
   }

   static {
      ntfClinit();
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-108, 117, -1, -7, 81, 74, 122, 12}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -437765393;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -5707784649450404947L;
   }

   public rrfh_3 id_break() {
      this.id_protected();
      rJY var1 = ((rrNw_1)this.id_class[id_break[2]]).id_throws();
      return rrfh_3.id_class(var1 == null ? ((rrNw_1)this.id_class[id_break[3]]).id_protected() : var1.id_class());
   }

   private static void id_throws() {
      id_break = new short[]{1, 0, 0, 0, 1, 0};
   }

   private static void id_catch() {
      id_byte = new boolean[]{true, false};
   }

   private static void id_case() {
      id_protected = new byte[]{2};
   }

   private void id_protected() {
      if (this.id_class == null) {
         this.id_class = new Object[id_protected[0]];
         Object[] var1 = this.id_class;
      }
   }
}
