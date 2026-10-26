package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrne_3 implements MinecraftAccessor {
   private static boolean[] break_;
   private static byte[] byte_;
   public Object[] class_;
   private static double[] protected_;
   private static long[] throws_;
   private static short[] case_;

   private static void byte_() {
      byte_ = new byte[]{3, 19, 4, 2, 3};
   }

   public rrne_3() {
      this.throws_();
   }

   static {
      ntfClinit();
   }

   @EventTarget
   public void class_(rrFK var1) {
      Integer var6 = 0;
      this.class_[1] = var6;
      Long var7 = 0L;
      this.class_[0] = var7;
      Boolean var8 = false;
      this.class_[3] = var8;
      Double var9 = 0.0;
      this.class_[2] = var9;
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1327682761;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 2284296490563143417L;
   }

   @EventTarget
   public void class_(rrLZ var1) {
      ruS_2 var2 = var1.class_();
      if (var2 instanceof rZq_1 var3 && var3.break_() == rZT.ATTACK && var3.byte_() instanceof rhd_3) {
         long var19 = System.currentTimeMillis();
         long var20 = var19 - (Long)this.class_[0];
         Long var13 = var19;
         this.class_[0] = var13;
         if ((Boolean)this.class_[3]) {
            if (var20 > 400L) {
               Integer var14 = (Integer)this.class_[1] + 1;
               this.class_[1] = var14;
               return;
            }
         } else {
            Integer var15 = 0;
            this.class_[1] = var15;
         }

         return;
      }

      if (var2 instanceof rZO var4) {
         double var5 = var4.break_(((cb_3)import_.class_[57]).re()) - ((cb_3)import_.class_[57]).O();
         double var7 = (Double)this.class_[2];
         if (var5 >= 0.0) {
            Double var16 = 0.0;
            this.class_[2] = var16;
         } else {
            Double var17 = (Double)this.class_[2] - var5;
            this.class_[2] = var17;
         }

         if (rrjS_2.protected_() || ((cb_3)import_.class_[57]).Bj() >= 3) {
            Boolean var18 = var7 == 0.0 && this.class_[2] != 0.0 ? true : break_[3];
            this.class_[3] = var18;
         }
      }
   }

   public boolean class_() {
      return (Boolean)this.class_[3];
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{94, 79, 77, -49, 37, -128, 102, -125}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public boolean break_() {
      return this.class_[1] >= 19 ? true : break_[7];
   }

   private void throws_() {
      if (this.class_ == null) {
         this.class_ = new Object[4];
         this.class_[0] = 0L;
         this.class_[1] = 0;
         this.class_[2] = 0.0;
         this.class_[3] = false;
      }
   }

   private static void catch_() {
      throws_ = new long[]{400L, 0L, 0L};
   }

   private static void case_() {
      protected_ = new double[6];
   }

   private static void protected_() {
      case_ = new short[]{0, 0, 3, 1, 1, 1, 57, 57, 2, 2, 2, 2, 57, 2, 3, 1, 0, 3, 2, 1, 3};
   }

   private static void private_() {
      break_ = new boolean[]{true, false, true, false, false, false, true, false, false, true, false, false};
   }
}
