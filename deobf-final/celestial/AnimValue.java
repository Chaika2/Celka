package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class AnimValue implements rrNG {
   private static double[] break_;
   public Object[] class_;
   private static float[] byte_;
   private static short[] protected_;
   private static boolean[] throws_;
   private static byte[] case_;

   @Override
   public float byte_() {
      return (Float)this.class_[2];
   }

   public float byte_(float var1) {
      return this.byte_() + Math.min(1.0F, var1) * (1.0F - this.byte_());
   }

   public rrNE int_() {
      return (rrNE)this.class_[1];
   }

   public AnimValue(float var1, boolean var2) {
      this((rrQK)rrQK.staticFieldsd7edc8a98bf936d38fa97cfea6cbd552[0], var1, var2);
   }

   public AnimValue(rrQK var1, float var2, boolean var3) {
      this.this_();
      rrNE var8 = (rrNE)rrNE.staticFieldsf494c4277fc533979058c6d61fda001b[0];
      this.class_[1] = var8;
      Float var9 = -1.0F;
      this.class_[3] = var9;
      Boolean var10 = true;
      this.class_[4] = var10;
      rrNb_1 var11 = new rrNb_1(var1, (double)var2);
      this.class_[0] = var11;
      if (var3) {
         this.class_();
      }
   }

   static {
      ntfClinit();
   }

   private void this_() {
      if (this.class_ == null) {
         this.class_ = new Object[6];
         Object[] var1 = this.class_;
         var1[2] = 0.0F;
         var1[3] = 0.0F;
         var1[4] = false;
         var1[5] = false;
      }
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -849740837;
   }

   public void class_(float var1) {
      Float var6 = var1;
      this.class_[2] = var6;
      ((rrNb_1)this.class_[0]).class_(var1);
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-75, -58, 3, -56, -37, 123, 112, -96}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public void class_(rrNE var1, float var2) {
      Float var7 = var2;
      this.class_[3] = var7;
      this.class_[1] = var1;
      if ((Boolean)this.class_[5] && (Float)this.class_[2] != var2) {
         Boolean var9 = false;
         this.class_[5] = var9;
         this.class_(var2);
      } else if (!(Boolean)this.class_[4] || !this.protected_()) {
         ((rrNb_1)this.class_[0]).class_((double)var2);
         ((rrNb_1)this.class_[0]).protected_();
         Float var10 = (float)((rrNb_1)this.class_[0]).byte_();
         this.class_[2] = var10;
      }
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -2512908034542653956L;
   }

   public void class_() {
      Float var5 = 1.0F;
      this.class_[3] = var5;
      Float var6 = 1.0F;
      this.class_[2] = var6;
      ((rrNb_1)this.class_[0]).class_(1.0);
      ((rrNb_1)this.class_[0]).break_();
   }

   public void class_(boolean var1) {
      byte var2 = var1 ? 1 : throws_[3];
      Float var7 = (float)var2;
      this.class_[3] = var7;
      rrNE var8 = var1 ? (rrNE)rrNE.staticFieldsf494c4277fc533979058c6d61fda001b[0] : (rrNE)rrNE.staticFieldsf494c4277fc533979058c6d61fda001b[1];
      this.class_[1] = var8;
      if ((Boolean)this.class_[5] && (Float)this.class_[2] != (float)var2) {
         Boolean var9 = false;
         this.class_[5] = var9;
         this.class_((float)var2);
      } else if (!(Boolean)this.class_[4] || !this.protected_()) {
         ((rrNb_1)this.class_[0]).class_((double)var2);
         ((rrNb_1)this.class_[0]).protected_();
         Float var10 = (float)((rrNb_1)this.class_[0]).byte_();
         this.class_[2] = var10;
      }
   }

   public rrNb_1 break_() {
      return (rrNb_1)this.class_[0];
   }

   public void break_(float var1) {
      this.class_((rrNE)rrNE.staticFieldsf494c4277fc533979058c6d61fda001b[0], var1);
   }

   public AnimValue throws_() {
      Boolean var5 = false;
      this.class_[4] = var5;
      return this;
   }

   public boolean finally_() {
      return (rrNE)this.class_[1] == (rrNE)rrNE.staticFieldsf494c4277fc533979058c6d61fda001b[0] ? true : throws_[15];
   }

   public boolean catch_() {
      return this.new_() && this.protected_() ? true : throws_[11];
   }

   public void extends_() {
      Float var5 = 0.0F;
      this.class_[2] = var5;
      ((rrNb_1)this.class_[0]).case_();
   }

   @Override
   public boolean case_() {
      return this.byte_() > 0.0F ? true : throws_[6];
   }

   public float continue_() {
      return this.class_[3] > 1.0F ? (Float)this.class_[3] - this.byte_() : byte_[5] - this.byte_();
   }

   private static void else_() {
      throws_ = new boolean[]{
         true, false, true, false, false, true, false, true, false, true, true, false, true, false, true, false, true, false, false, true, false, false, false
      };
   }

   public float implements_() {
      return (Float)this.class_[3];
   }

   public boolean new_() {
      return (rrNE)this.class_[1] == (rrNE)rrNE.staticFieldsf494c4277fc533979058c6d61fda001b[1] ? true : throws_[17];
   }

   public AnimValue package_() {
      Boolean var5 = true;
      this.class_[5] = var5;
      return this;
   }

   private static void return_() {
      byte_ = new float[]{-1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.999F, 0.0F, 1.0F, 0.0F, 0.0F};
   }

   private static void super_() {
      break_ = new double[]{1.0};
   }

   private static void public_() {
      case_ = new byte[]{6, 2, 3, 4, 5};
   }

   @Override
   public boolean protected_() {
      return this.byte_() == this.class_[3] ? true : throws_[8];
   }

   public boolean private_() {
      return (Boolean)this.class_[5];
   }

   public float final_() {
      if ((Float)this.class_[3] < 0.0F) {
         this.class_((rrNE)rrNE.staticFieldsf494c4277fc533979058c6d61fda001b[0], 1.0F);
      } else if (this.protected_()) {
         boolean var1 = this.class_[3] >= 0.999F ? true : throws_[20];
         this.class_(
            var1 ? (rrNE)rrNE.staticFieldsf494c4277fc533979058c6d61fda001b[1] : (rrNE)rrNE.staticFieldsf494c4277fc533979058c6d61fda001b[0],
            var1 ? 0.0F : byte_[13]
         );
      } else {
         this.class_((rrNE)this.class_[1], (Float)this.class_[3]);
      }

      return (Float)this.class_[2];
   }

   public boolean volatile_() {
      return this.finally_() && this.protected_() ? true : throws_[13];
   }

   private static void synchronized_() {
      protected_ = new short[]{
         0,
         1,
         3,
         4,
         0,
         0,
         0,
         3,
         1,
         5,
         2,
         5,
         4,
         0,
         0,
         0,
         2,
         3,
         0,
         1,
         1,
         5,
         2,
         5,
         4,
         0,
         0,
         0,
         2,
         3,
         2,
         3,
         3,
         2,
         0,
         3,
         2,
         0,
         0,
         5,
         2,
         0,
         1,
         0,
         1,
         1,
         4,
         3,
         0,
         3,
         1,
         0,
         1,
         3,
         2,
         0,
         1,
         3,
         4,
         5
      };
   }

   public boolean native_() {
      return (Boolean)this.class_[4];
   }
}
