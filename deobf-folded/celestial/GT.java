package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class GT implements Gt_1 {
   private static byte[] id_break;
   private static short[] id_byte;
   public Object[] id_class;

   private static void id_byte() {
      id_break = new byte[]{2};
   }

   GT(GH var1, Gt_1 var2, Gt_1 var3) {
      this.id_protected();
      this.id_class[id_byte[0]] = var2;
      this.id_class[1] = var3;
   }

   static {
      ntfClinit();
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-65, -101, -80, 7, 46, -46, -122, -126}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 4000026578023414206L;
   }

   @Override
   public int id_class() {
      return Math.min(((Gt_1)this.id_class[id_byte[6]]).id_class(), ((Gt_1)this.id_class[1]).id_class());
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 2044465182;
   }

   @Override
   public GI id_class(int var1, int var2) {
      return ((Gt_1)this.id_class[id_byte[2]]).id_class(var1, var2) == (GI)GI.staticFields7b6dab6bace836ec83a51cd91190c39e[id_byte[3]]
         ? (GI)GI.staticFields7b6dab6bace836ec83a51cd91190c39e[id_byte[4]]
         : ((Gt_1)this.id_class[1]).id_class(var1, var2);
   }

   private static void id_break() {
      id_byte = new short[]{0, 1, 0, 0, 0, 1, 0, 1};
   }

   private void id_protected() {
      if (this.id_class == null) {
         this.id_class = new Object[2];
         Object[] var1 = this.id_class;
      }
   }
}
