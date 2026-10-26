package celestial;

import java.nio.charset.StandardCharsets;
import java.util.function.Supplier;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrIv_1 extends Setting<String> {
   private static float[] byte_;
   private static byte[] protected_;
   public Object[] break_;
   private static String[] throws_;
   private static boolean[] case_;
   private static short[] catch_;

   private static void int_() {
      throws_ = new String[]{new String(""), new String("")};
   }

   public rrIv_1(String var1, rrte_3 var2) {
      this(var1, "", var2);
      this.class_(80.0F);
      this.package_();
   }

   public rrIv_1(String var1, String var2, rrte_3 var3) {
      super(var1, var2);
      this.super_();
      Float var8 = Float.MAX_VALUE;
      this.break_[5] = var8;
      this.break_(() -> var1);
      this.byte_(this.native_().get());
      String var9 = this.break_[6] ? "" : var2;
      this.break_[3] = var9;
      this.break_[1] = var3;
      this.break_[4] = var2;
   }

   static {
      ntfClinit();
   }

   private static void this_() {
      protected_ = new byte[]{7, 5, 6};
   }

   public rrIv_1 class_(float var1) {
      this.super_();
      Float var6 = var1;
      this.break_[5] = var6;
      return this;
   }

   public rrIv_1 class_(Object var1) {
      this.super_();
      this.break_[3] = var1;
      return this;
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -2131739900;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -5232488641224152531L;
   }

   public void class_(rrtY_2 var1) {
      this.super_();
      this.break_[2] = var1;
   }

   public rrtY_2 class_() {
      this.super_();
      return (rrtY_2)this.break_[2];
   }

   public Object break_() {
      this.super_();
      return this.break_[3];
   }

   public rrIv_1 break_(Supplier<String> var1) {
      this.super_();
      this.break_[0] = var1;
      return this;
   }

   public rrte_3 finally_() {
      this.super_();
      return (rrte_3)this.break_[1];
   }

   public String extends_() {
      this.super_();
      return this.break_[3] + "";
   }

   private static void continue_() {
      catch_ = new short[]{5, 6, 3, 1, 4, 3, 0, 5, 6, 0, 3, 3, 1, 2, 2, 4, 5};
   }

   private static void else_() {
      case_ = new boolean[]{true, false};
   }

   private static void new_() {
      byte_ = new float[]{80.0F, Float.MAX_VALUE, 0.0F};
   }

   public rrIv_1 package_() {
      this.super_();
      Boolean var5 = true;
      this.break_[6] = var5;
      return this;
   }

   private void super_() {
      if (this.break_ == null) {
         this.break_ = new Object[7];
         Object[] var1 = this.break_;
         var1[5] = 0.0F;
         var1[6] = false;
      }
   }

   public static String protected_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{73, 33, 75, -36, 101, -66, 94, 50}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public String final_() {
      this.super_();
      return (String)this.break_[4];
   }

   public float volatile_() {
      this.super_();
      return (Float)this.break_[5];
   }

   public Supplier<String> native_() {
      this.super_();
      return (Supplier<String>)this.break_[0];
   }
}
