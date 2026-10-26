package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class Pl_1 extends Pv_1 {
   public Object[] id_break;
   private static boolean[] id_byte;
   private static short[] id_protected;

   public void id_byte() {
      this.id_class(null);
   }

   public Pl_1(C_class var1) {
      super(var1);
      this.id_protected();
   }

   static {
      ntfClinit();
   }

   @Override
   public void id_class(C var1) {
      super.id_class(var1);
      if (this.id_break()) {
         String var2 = var1.id_class();
         PH var3 = this.id_class();
         if (!var2.equalsIgnoreCase(var3.id_break().toLowerCase())) {
            this.id_byte();
         }
      }
   }

   public PH id_class() {
      this.id_protected();
      return (PH)this.id_break[id_protected[1]];
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -643476238;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -5755133210238211836L;
   }

   public void id_class(PH var1) {
      this.id_protected();
      this.id_break[id_protected[0]] = var1;
   }

   public boolean id_break() {
      return this.id_class() != null ? true : id_byte[1];
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-122, -49, 67, 9, 32, -89, -15, 4}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_throws() {
      id_protected = new short[2];
   }

   private static void id_case() {
      id_byte = new boolean[]{true, false, true};
   }

   private void id_protected() {
      if (this.id_break == null) {
         this.id_break = new Object[1];
         Object[] var1 = this.id_break;
      }
   }
}
