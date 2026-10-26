package celestial;

import java.nio.charset.StandardCharsets;
import java.util.function.Supplier;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrun_1 extends rruu_1 {
   private static float[] byte_;
   private static byte[] protected_;
   public Object[] break_;
   private static boolean[] throws_;
   private static short[] case_;

   public static String byte_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{52, -70, 102, 58, -127, 123, -110, -68}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void int_() {
      case_ = new short[]{0, 4, 5, 0, 1, 2, 3, 3, 0, 0, 5, 0, 4, 1, 2, 5, 5, 4};
   }

   public rrun_1(Supplier<rqO_2> var1, Supplier<rjK_2> var2, Supplier<rjK_2> var3, Supplier<Integer> var4) {
      this.new_();
      rrul_1 var9 = (rrul_1)rrul_1.staticFields9897caebb88b3588975198b6a548d1f7[0];
      this.break_[4] = var9;
      Supplier var10 = () -> 1.0F;
      this.break_[5] = var10;
      this.break_[0] = var1;
      this.break_[1] = var2;
      this.break_[2] = var3;
      this.break_[3] = var4;
   }

   static {
      ntfClinit();
   }

   private static void this_() {
      throws_ = new boolean[]{true, false};
   }

   @Override
   public void class_(boolean var1) {
      super.class_(!var1 && this.native_() ? throws_[1] : throws_[0]);
   }

   public <T extends rrun_1> T class_(Supplier<Float> var1) {
      this.new_();
      this.break_[5] = var1;
      return (T)this;
   }

   @Override
   public void class_(Ml_1 var1, rrtu_3 var2, int var3, int var4, boolean var5) {
      this.new_();
      super.class_(var1, var2, var3, var4, var5);
      rruv_1 var6 = this.catch_();
      rjK_2 var7 = this.extends_().get();
      int var8 = ColorHelper.class_((Integer)((Supplier)this.break_[3]).get(), this.finally_());
      if ((Supplier)this.break_[0] != null) {
         rrfD_2.class_(
            var1,
            (rqO_2)((Supplier)this.break_[0]).get(),
            var6.break_(),
            var6.protected_(),
            var7.byte_,
            var7.protected_,
            ColorHelper.break_(var8, (int)(255.0F * (Float)((Supplier)this.break_[5]).get()))
         );
      }
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -96387269;
   }

   @Override
   public Supplier<rjK_2> class_() {
      this.new_();
      return (Supplier<rjK_2>)this.break_[1];
   }

   public <T extends rrun_1> T class_(rrul_1 var1) {
      this.new_();
      this.break_[4] = var1;
      return (T)this;
   }

   private static long break_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -5724297939063835166L;
   }

   @Override
   public float finally_() {
      this.new_();

      return switch (((int[])rruC.class_[0])[((rrul_1)this.break_[4]).ordinal()]) {
         case 1 -> byte_[1] - 0.2F * this.protected_();
         case 2 -> byte_[3] + 0.2F * this.protected_();
         default -> throw new IncompatibleClassChangeError();
      };
   }

   @Override
   public Supplier<rjK_2> extends_() {
      this.new_();
      return (Supplier<rjK_2>)this.break_[2];
   }

   private static void else_() {
      protected_ = new byte[]{6};
   }

   private void new_() {
      if (this.break_ == null) {
         this.break_ = new Object[6];
         Object[] var1 = this.break_;
      }
   }

   public Supplier<Float> package_() {
      this.new_();
      return (Supplier<Float>)this.break_[5];
   }

   private static void super_() {
      byte_ = new float[]{255.0F, 1.0F, 0.2F, 0.8F, 0.2F, 1.0F};
   }
}
