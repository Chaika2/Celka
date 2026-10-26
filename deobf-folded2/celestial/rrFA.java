package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrFA {
   private static short[] id_byte;
   public static Object[] id_class;
   private static float[] id_protected;
   private static byte[] id_throws;
   public Object[] id_break;
   private static boolean[] id_case;

   private static void id_byte() {
      id_protected = new float[]{0.55F, 0.5F, 0.5F, -8.0F, 11.0F, 8.0F, 0.5F, 8.0F, 8.0F, 0.5F, 3.0F};
   }

   public rrFA() {
      this.id_protected();
      rrFL[] var6 = new rrFL[6];
      this.id_break[0] = var6;

      for (int var1 = 0; var1 < 6; var1++) {
         ((rrFL[])this.id_break[0])[var1] = new rrFL(0.55F, 0.5F, 0.5F);
      }
   }

   static {
      ntfClinit();
   }

   private static rdn_3 id_class(iB_2 var0, int var1) {
      return switch (var1) {
         case 0 -> var0.id_class(rXQ.HEAD);
         case 1 -> var0.id_class(rXQ.CHEST);
         case 2 -> var0.id_class(rXQ.LEGS);
         case 3 -> var0.id_class(rXQ.FEET);
         case 4 -> var0.id_protected(rpm_3.MAIN_HAND);
         case 5 -> var0.id_protected(rpm_3.OFF_HAND);
         default -> throw new IllegalArgumentException("неверный индекс слота: " + var1);
      };
   }

   public void id_class(Ml_1 var1, float var2, float var3, float var4) {
      int var5 = 0;

      for (int var6 = 5; var6 >= 0; var6--) {
         if (((rrFL[])this.id_break[0])[var6].id_byte()) {
            float var7 = -8.0F - (float)var5 * 11.0F;
            ((rrFL[])this.id_break[0])[var6].id_class(var7);
            var5++;
         }
      }

      for (rrFL var9 : (rrFL[])this.id_break[0]) {
         if (var9.id_byte()) {
            var9.id_class(var1, var2 + var9.id_class(), var3, var4, 8.0F, 0.5F);
         }
      }
   }

   public void id_class(iB_2 var1) {
      for (int var2 = 0; var2 < 6; var2++) {
         ((rrFL[])this.id_break[0])[var2].id_class(id_class(var1, var2));
      }
   }

   public boolean id_class() {
      for (rrFL var4 : (rrFL[])this.id_break[0]) {
         if (var4.id_byte()) {
            return true;
         }
      }

      return id_case[4];
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-27, 75, -10, -40, -75, 79, 11, 68}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -5507683006095049234L;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -2053466081;
   }

   public void id_break() {
      for (rrFL var4 : (rrFL[])this.id_break[0]) {
         var4.id_break();
      }
   }

   private static void id_throws() {
      Object[] var0 = new Object[]{0.0F, 0.0F, 0.0F, 0.0F, 6};
      id_class = var0;
   }

   private static void id_catch() {
      id_case = new boolean[]{false, false, false, true, false, false, false, false, true, false, true};
   }

   private static void id_case() {
      id_byte = new short[8];
   }

   private void id_protected() {
      if (this.id_break == null) {
         this.id_break = new Object[1];
         Object[] var1 = this.id_break;
      }
   }

   private static void id_private() {
      id_throws = new byte[]{6, 6, 6, 5, 5, 2, 3, 4, 6};
   }
}
