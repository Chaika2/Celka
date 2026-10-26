package celestial;

import java.nio.charset.StandardCharsets;
import java.util.UUID;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public abstract class rryB {
   private static float[] class_;
   private static boolean[] byte_;
   private static long[] protected_;
   private static byte[] throws_;
   private static short[] case_;
   public Object[] break_;

   public abstract rfl_3 byte_();

   private void int_() {
      if (this.break_ == null) {
         this.break_ = new Object[7];
         this.break_[1] = 0L;
         this.break_[2] = 0;
         this.break_[3] = 0.0F;
         this.break_[4] = false;
         this.break_[5] = false;
      }
   }

   public rryB() {
      this.int_();
      UUID var5 = UUID.randomUUID();
      this.break_[0] = var5;
      Long var6 = rqR_2.break_();
      this.break_[1] = var6;
      AnimValue var7 = new AnimValue((rrQK)rrQK.staticFieldsd7edc8a98bf936d38fa97cfea6cbd552[3], 1.0F, false);
      this.break_[6] = var7;
   }

   static {
      ntfClinit();
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 4374535982436740689L;
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 161311662;
   }

   public abstract rjU_2 class_();

   public void class_(boolean var1) {
      Boolean var6 = var1;
      this.break_[5] = var6;
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-115, 20, 30, 30, 44, 114, 8, -82}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public abstract rdn_3 break_();

   public abstract long throws_();

   public AnimValue finally_() {
      return (AnimValue)this.break_[6];
   }

   public UUID catch_() {
      return (UUID)this.break_[0];
   }

   public boolean extends_() {
      return (Boolean)this.break_[4];
   }

   public abstract String case_();

   private static void continue_() {
      protected_ = new long[]{1000L, 1000L, 0L};
   }

   public int implements_() {
      return (Integer)this.break_[2];
   }

   private static void new_() {
      throws_ = new byte[]{7, 2, 3, 4, 5};
   }

   private static void package_() {
      byte_ = new boolean[]{false, true, false, true, false, false, false};
   }

   private static void super_() {
      case_ = new short[]{0, 1, 3, 6, 1, 2, 3, 3, 4, 0, 1, 2, 3, 4, 5, 6, 5};
   }

   private static void protected_() {
      class_ = new float[]{1.0F, 1.0F, 1.0F, 0.0F};
   }

   public long private_() {
      return (Long)this.break_[1];
   }

   public boolean final_() {
      return (Boolean)this.break_[5];
   }

   public float volatile_() {
      return (Float)this.break_[3];
   }

   public void native_() {
      long var1 = rqR_2.break_();
      long var3 = var1 - (Long)this.break_[1];
      long var5 = this.throws_();
      Integer var11 = (int)(var5 - var3 / 1000L);
      this.break_[2] = var11;
      Float var12 = Math.min(1.0F, (float)var3 / (float)(var5 * 1000L));
      this.break_[3] = var12;
      Boolean var13 = this.break_[3] >= 1.0F ? true : byte_[2];
      this.break_[4] = var13;
   }
}
