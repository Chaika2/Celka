package celestial;

import java.nio.charset.StandardCharsets;
import java.util.Objects;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrFQ implements rrFz_1 {
   private static byte[] id_break;
   private static short[] id_byte;
   private static boolean[] id_protected;
   private static float[] id_throws;
   public Object[] id_class;

   @Override
   public boolean id_byte() {
      return false;
   }

   private static void id_int() {
      id_throws = new float[]{0.5F, 1.0F};
   }

   public rrFQ(rLY var1) {
      this.id_final();
      AnimValue var6 = new AnimValue(0.5F, false);
      this.id_class[3] = var6;
      this.id_class[0] = var1;
      String var8 = this.id_extends();
      this.id_class[1] = var8;
      String var9 = this.id_native();
      this.id_class[2] = var9;
   }

   static {
      ntfClinit();
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         rrFQ var2 = (rrFQ)var1;
         return Objects.equals(((rLY)this.id_class[0]).id_class(), ((rLY)var2.id_class[0]).id_class());
      } else {
         return id_protected[7];
      }
   }

   @Override
   public int hashCode() {
      return Objects.hash(((rLY)this.id_class[0]).id_class());
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 684957092659849671L;
   }

   @Override
   public AnimValue id_class() {
      return (AnimValue)this.id_class[3];
   }

   public void id_class(rLY var1) {
      this.id_class[0] = var1;
      this.id_case();
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-124, -28, -33, -14, 80, 53, -119, -33}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -470123910;
   }

   @Override
   public void id_class(boolean var1) {
      ((AnimValue)this.id_class[3]).id_class(var1);
   }

   @Override
   public String id_break() {
      return (String)this.id_class[2];
   }

   @Override
   public boolean id_throws() {
      return !((AnimValue)this.id_class[3]).id_new() ? true : id_protected[4];
   }

   private static void id_finally() {
      id_byte = new short[]{3, 0, 1, 2, 3, 2, 1, 0, 0, 0, 0, 3, 0, 0, 0, 0, 1, 2, 3};
   }

   public void id_catch() {
      String var5 = this.id_native();
      this.id_class[2] = var5;
   }

   private String id_extends() {
      int var1 = Math.max(0, ((rLY)this.id_class[0]).id_byte()) + 1;
      return ((rLY)this.id_class[0]).id_final() + " " + this.id_implements() + var1;
   }

   public void id_case() {
      String var5 = this.id_extends();
      this.id_class[1] = var5;
   }

   public rgF_2 id_implements() {
      return rgF_2.RED;
   }

   private static void id_package() {
      id_break = new byte[]{4};
   }

   @Override
   public String id_protected() {
      return (String)this.id_class[1];
   }

   public rLY id_private() {
      return (rLY)this.id_class[0];
   }

   private void id_final() {
      if (this.id_class == null) {
         this.id_class = new Object[4];
         Object[] var1 = this.id_class;
      }
   }

   private static void id_volatile() {
      id_protected = new boolean[]{false, false, true, true, false, false, true, false, true, false};
   }

   private String id_native() {
      return rLK.id_class((rLY)this.id_class[0], 1.0F);
   }
}
