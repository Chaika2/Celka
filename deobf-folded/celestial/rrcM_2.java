package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrcM_2 extends rrfI_2<rrfE_2> {
   private static boolean[] id_break;
   public Object[] id_class;
   private static byte[] id_byte;
   private static short[] id_protected;

   @Override
   public boolean id_byte() {
      this.id_case();
      return this.id_break() == (rrfE_2)((rrcb_3)this.id_class[1]).id_class[id_protected[5]] ? true : id_break[1];
   }

   public rrcM_2(rrcb_3 var1, rrNw_1 var2) {
      this.id_case();
      this.id_class[1] = var1;
      this.id_class[id_protected[1]] = var2;
   }

   static {
      ntfClinit();
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 9017068998005378584L;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 774149698;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{117, 4, -115, -108, -46, 107, -89, -122}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public rrfE_2 id_break() {
      this.id_case();
      rJY var1 = ((rrNw_1)this.id_class[id_protected[2]]).id_throws();
      return rrfE_2.id_class(var1 == null ? ((rrNw_1)this.id_class[id_protected[3]]).id_protected() : var1.id_class());
   }

   private static void id_throws() {
      id_break = new boolean[]{true, false};
   }

   private static void id_catch() {
      id_byte = new byte[]{2};
   }

   private void id_case() {
      if (this.id_class == null) {
         this.id_class = new Object[2];
         Object[] var1 = this.id_class;
      }
   }

   private static void id_protected() {
      id_protected = new short[]{1, 0, 0, 0, 1, 0};
   }
}
