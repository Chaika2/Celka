package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public abstract class rrFr_1 implements MinecraftAccessor {
   private static byte[] break_;
   public Object[] class_;
   private static boolean[] byte_;
   private static short[] protected_;
   private static String[] throws_;
   private static float[] case_;

   private static long byte_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 948579838036317781L;
   }

   public abstract boolean byte_();

   private static void int_() {
      throws_ = new String[]{new String("")};
   }

   public rrFr_1() {
      this.extends_();
      AnimValue var5 = new AnimValue((rrQK)rrQK.staticFieldsd7edc8a98bf936d38fa97cfea6cbd552[7], 0.4F, false);
      this.class_[0] = var5;
      AnimValue var6 = new AnimValue(0.5F, false).package_();
      this.class_[1] = var6;
      AnimValue var7 = new AnimValue((rrQK)rrQK.staticFieldsd7edc8a98bf936d38fa97cfea6cbd552[7], 0.4F, false);
      this.class_[2] = var7;
      AnimValue var8 = new AnimValue((rrQK)rrQK.staticFieldsd7edc8a98bf936d38fa97cfea6cbd552[7], 0.4F, false);
      this.class_[3] = var8;
      Boolean var9 = false;
      this.class_[4] = var9;
      String var10 = "";
      this.class_[6] = var10;
   }

   static {
      ntfClinit();
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{61, 76, -28, -29, 11, -95, 69, -111}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public void class_(rrZO var1) {
      this.break_(var1);
      String var2 = this.implements_();
      if (!var2.equals((String)this.class_[6])) {
         this.class_[6] = var2;
         Float var8 = 14.0F + var1.break_(var2) + 2.5F;
         this.class_[5] = var8;
      }
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 49873142;
   }

   public float class_(long var1) {
      return 0.0F;
   }

   public boolean class_(boolean var1) {
      return var1 && this.protected_() ? true : byte_[6];
   }

   public void class_(float var1, float var2) {
      if (!(Boolean)this.class_[4]) {
         ((AnimValue)this.class_[2]).class_(var1);
         ((AnimValue)this.class_[3]).class_(var2);
         Boolean var7 = true;
         this.class_[4] = var7;
      } else {
         if (this.finally_()) {
            ((AnimValue)this.class_[2]).break_(var1);
            ((AnimValue)this.class_[3]).break_(var2);
         } else {
            ((AnimValue)this.class_[2]).class_(var1);
            ((AnimValue)this.class_[3]).class_(var2);
         }
      }
   }

   public void class_(boolean var1, long var2) {
      if (!((Float)this.class_[5] <= 0.0F)) {
         boolean var4 = this.class_(var1);
         if (this.break_(var1)) {
            if (this.throws_()) {
               ((AnimValue)this.class_[0]).class_(var4);
            } else {
               ((AnimValue)this.class_[0]).class_(var4 ? 1.0F : case_[9]);
            }
         }

         ((AnimValue)this.class_[1]).break_((Float)this.class_[5]);
         this.break_(var2);
      }
   }

   public abstract rdn_3 class_();

   public boolean break_(boolean var1) {
      return true;
   }

   public void break_(long var1) {
   }

   public void break_(rrZO var1) {
   }

   public float break_() {
      return ((AnimValue)this.class_[2]).byte_();
   }

   public boolean throws_() {
      return true;
   }

   public boolean finally_() {
      return this.throws_();
   }

   public float catch_() {
      return ((AnimValue)this.class_[1]).byte_();
   }

   private void extends_() {
      if (this.class_ == null) {
         this.class_ = new Object[7];
         Object[] var1 = this.class_;
         var1[4] = false;
         var1[5] = 0.0F;
      }
   }

   public void case_() {
      Boolean var5 = false;
      this.class_[4] = var5;
   }

   public abstract String implements_();

   private static void package_() {
      case_ = new float[]{0.4F, 0.5F, 0.4F, 0.4F, 0.0F, 14.0F, 2.5F, 0.0F, 1.0F, 0.0F, 0.0F};
   }

   public abstract boolean protected_();

   public float private_() {
      return ((AnimValue)this.class_[3]).byte_();
   }

   private static void final_() {
      protected_ = new short[]{7, 0, 1, 7, 2, 7, 3, 4, 6, 1, 6, 6, 5, 5, 0, 0, 1, 5, 4, 2, 3, 4, 2, 3, 2, 3, 4, 2, 3};
   }

   private static void volatile_() {
      break_ = new byte[]{7, 4, 5};
   }

   private static void native_() {
      byte_ = new boolean[]{false, false, false, false, false, true, false, true, true, true, false, false};
   }
}
