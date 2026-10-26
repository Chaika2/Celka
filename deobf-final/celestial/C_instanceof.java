package celestial;

import java.nio.charset.StandardCharsets;
import java.time.Duration;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public abstract class C_instanceof extends C_try {
   private static byte[] throws_;
   private static short[] case_;
   private static float[] catch_;
   private static boolean[] private_;
   private static long[] implements_;
   public Object[] break_;
   private static String[] finally_;

   @Override
   public x_1 byte_() {
      this.volatile_();
      return System.currentTimeMillis() - this.break_[1] < ((Duration)this.break_[0]).toMillis()
         ? new X("Подождите " + this.new_() + " перед использованием этой команды")
         : null;
   }

   private static void int_() {
      finally_ = new String[]{new String("%.1fc")};
   }

   public C_instanceof(C_case var1, Duration var2, String... var3) {
      super(var1, var3);
      this.volatile_();
      this.break_[0] = var2;
   }

   static {
      ntfClinit();
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -5428057763776860054L;
   }

   @Override
   public void class_(String var1, C_static var2) throws x_1 {
      this.volatile_();
      Long var7 = System.currentTimeMillis();
      this.break_[1] = var7;
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -454647614;
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{55, -75, -120, 85, -17, 83, -117, -100}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public long throws_() {
      this.volatile_();
      return (Long)this.break_[1];
   }

   private static void finally_() {
      implements_ = new long[]{1000L, 0L, 1000L, 0L};
   }

   private static void extends_() {
      throws_ = new byte[]{2};
   }

   private String new_() {
      this.volatile_();
      long var1 = ((Duration)this.break_[0]).toMillis() - (System.currentTimeMillis() - (Long)this.break_[1]);
      return var1 / 1000L <= 0L ? String.format("%.1fc", (float)var1 / 1000.0F) : var1 / 1000L + "c";
   }

   private static void package_() {
      case_ = new short[]{0, 1, 1, 0, 0, 1, 0, 1};
   }

   public Duration protected_() {
      this.volatile_();
      return (Duration)this.break_[0];
   }

   private static void final_() {
      private_ = new boolean[]{true, false, true};
   }

   private void volatile_() {
      if (this.break_ == null) {
         this.break_ = new Object[2];
         Object[] var1 = this.break_;
         var1[1] = 0L;
      }
   }

   private static void native_() {
      catch_ = new float[]{1000.0F};
   }
}
