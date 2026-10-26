package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrFC implements MinecraftAccessor {
   private static short[] byte_;
   private static byte[] protected_;
   private static boolean[] throws_;
   public Object[] class_;
   public static Object[] break_;
   private static float[] case_;

   private void byte_() {
      if (this.class_ == null) {
         this.class_ = new Object[3];
         Object[] var1 = this.class_;
         var1[1] = 0;
         var1[2] = false;
      }
   }

   public rrFC() {
      this.byte_();
   }

   static {
      ntfClinit();
   }

   private boolean class_(iB_2 var1) {
      if ((cb_3)import_.class_[57] == null) {
         return false;
      } else {
         float var2 = ((cb_3)import_.class_[57]).u_() + ((cb_3)import_.class_[57]).Sd();
         float var3 = var1.u_() + var1.Sd();
         return var2 >= var3 ? true : throws_[4];
      }
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{33, -93, -86, -27, 60, 84, -97, -13}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public void class_(Ml_1 var1, iB_2 var2, float var3, float var4, int var5, int var6, float var7, float var8, float var9) {
      int var10 = (Integer)var2.private_[10];
      if (var2 != (iB_2)this.class_[0] || var10 > (Integer)this.class_[1]) {
         Boolean var16 = var2 != (cb_3)import_.class_[57] && this.class_(var2) ? true : throws_[1];
         this.class_[2] = var16;
      }

      Integer var17 = var10;
      this.class_[1] = var17;
      this.class_[0] = var2;
      int var11 = this.class_[2] ? (Integer)break_[0] : (Integer)break_[1];
      rrfD_2.class_(var1, var2, var3, var4, var5, var6, var7, var8, 1.0F * var9 / 255.0F, var11);
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 5759375175269915834L;
   }

   private static void class_() {
      Object[] var0 = new Object[]{-16718336, -65536};
      break_ = var0;
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 894441572;
   }

   private static void break_() {
      byte_ = new short[]{10, 0, 1, 57, 2, 1, 0, 2, 0, 1, 57, 57, 57, 230, 255};
   }

   private static void throws_() {
      throws_ = new boolean[]{true, false, false, true, false, false, false, false, false, false, true, true, false, false, false, false, true, false};
   }

   private static void case_() {
      protected_ = new byte[]{3, 2, 2};
   }

   private static void protected_() {
      case_ = new float[]{1.0F, 255.0F};
   }
}
