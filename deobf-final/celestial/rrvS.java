package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrvS implements MinecraftAccessor {
   private static byte[] break_;
   public Object[] class_;
   private static short[] byte_;
   private static float[] protected_;
   private static boolean[] throws_;

   public float byte_() {
      return (Float)this.class_[2];
   }

   public rrvS(ClickGuiScreen var1) {
      this.throws_();
      this.class_[0] = var1;
   }

   static {
      ntfClinit();
   }

   public void class_(int var1) {
      if (var1 == 0) {
         this.class_(false);
      }
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{18, -39, -113, -75, -84, 92, 53, 0}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 4603828348822030199L;
   }

   public void class_(boolean var1) {
      Boolean var6 = var1;
      this.class_[1] = var6;
   }

   public void class_(int var1, int var2) {
      if (this.break_()) {
         ((ClickGuiScreen)this.class_[0]).class_((float)var1 - this.byte_(), (float)var2 - this.class_());
      }

      byte var3 = break_[0];
      float var4 = const_.volatile_() - 363.0F - (float)var3;
      float var5 = const_.final_() - 300.0F - (float)var3;
      if (var4 >= (float)var3 && var5 >= (float)var3) {
         float var6 = rfU_2.class_((float)((ClickGuiScreen)this.class_[0]).abstract_(), (float)var3, var4);
         float var7 = rfU_2.class_((float)((ClickGuiScreen)this.class_[0]).finally_(), (float)var3, var5);
         ((ClickGuiScreen)this.class_[0]).class_(var6, var7);
      }
   }

   public void class_(rrtu_3 var1, int var2, int var3, int var4, boolean var5) {
      if (!var5 || !rrtu_3.class_(var1, var2, var3)) {
         if (var4 == 0 && ((ClickGuiScreen)this.class_[0]).class_(var2, var3)) {
            this.break_((float)(var2 - ((ClickGuiScreen)this.class_[0]).abstract_()));
            this.class_((float)(var3 - ((ClickGuiScreen)this.class_[0]).finally_()));
            this.class_(true);
         }
      }
   }

   public void class_(float var1) {
      Float var6 = var1;
      this.class_[3] = var6;
   }

   public float class_() {
      return (Float)this.class_[3];
   }

   public void break_(float var1) {
      Float var6 = var1;
      this.class_[2] = var6;
   }

   public boolean break_() {
      return (Boolean)this.class_[1];
   }

   private static int break_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -704482675;
   }

   private void throws_() {
      if (this.class_ == null) {
         this.class_ = new Object[4];
         Object[] var1 = this.class_;
         var1[1] = false;
         var1[2] = 0.0F;
         var1[3] = 0.0F;
      }
   }

   private static void catch_() {
      break_ = new byte[]{5, 4, 2, 3};
   }

   private static void case_() {
      throws_ = new boolean[]{true, false, true, false};
   }

   private static void protected_() {
      byte_ = new short[]{0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 2, 3, 2, 3};
   }

   private static void private_() {
      protected_ = new float[]{363.0F, 300.0F, 0.0F, 0.0F};
   }
}
