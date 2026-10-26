package celestial;

import java.nio.charset.StandardCharsets;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrup_1 extends rruu_1 {
   private static boolean[] break_;
   public Object[] byte_;
   private static byte[] protected_;
   private static float[] throws_;
   private static short[] case_;

   public <T extends rrup_1> T byte_(boolean var1) {
      this.package_();
      Boolean var6 = var1;
      this.byte_[11] = var6;
      return (T)this;
   }

   private static void int_() {
      case_ = new short[]{7, 8, 9, 0, 1, 2, 3, 4, 5, 6, 4, 6, 5, 11, 7, 9, 9, 9, 9, 9, 1, 10, 0, 8, 0, 8, 2, 3, 8, 10, 11, 9, 8, 7, 11, 8};
   }

   public rrup_1(
      rrZO var1, Supplier<String> var2, Supplier<rjK_2> var3, Supplier<rjK_2> var4, Supplier<rjK_2> var5, Supplier<Integer> var6, Supplier<rji_3> var7
   ) {
      this.package_();
      Supplier var12 = () -> true;
      this.byte_[7] = var12;
      Supplier var13 = () -> 1.0F;
      this.byte_[8] = var13;
      Float var14 = 4.0F;
      this.byte_[9] = var14;
      this.byte_[0] = var1;
      this.byte_[1] = var2;
      this.byte_[2] = var3;
      this.byte_[3] = var4;
      this.byte_[4] = var5;
      this.byte_[5] = var6;
      this.byte_[6] = var7;
   }

   static {
      ntfClinit();
   }

   private static void this_() {
      break_ = new boolean[]{false, false, true, true, false, false};
   }

   public <T extends rrup_1> T class_(int var1) {
      this.package_();
      Float var6 = (float)var1;
      this.byte_[9] = var6;
      return (T)this;
   }

   public <T extends rrup_1> T class_(Supplier<Float> var1) {
      this.package_();
      this.byte_[8] = var1;
      return (T)this;
   }

   @Override
   public Supplier<rjK_2> class_() {
      this.package_();
      return (Supplier<rjK_2>)this.byte_[2];
   }

   @Override
   public void class_(Ml_1 var1, rrtu_3 var2, int var3, int var4, boolean var5) {
      this.package_();
      super.class_(var1, var2, var3, var4, var5);
      rruv_1 var6 = this.catch_();
      rjK_2 var7 = this.extends_().get();
      rjK_2 var8 = (rjK_2)((Supplier)this.byte_[4]).get();
      rji_3 var9 = (rji_3)((Supplier)this.byte_[6]).get();
      int var10 = ColorHelper.class_((Integer)((Supplier)this.byte_[5]).get(), this.finally_());
      UnaryOperator var11 = var1x -> {
         this.package_();
         return ColorHelper.break_(var1x, (int)(255.0F * (this.byte_[11] ? this.protected_() : throws_[9]) * (Float)((Supplier)this.byte_[8]).get()));
      };
      int var12 = var11.apply(Integer.valueOf((int)var9.class_()));
      int var13 = var11.apply(Integer.valueOf((int)var9.break_()));
      int var14 = var11.apply(Integer.valueOf((int)var9.byte_()));
      int var15 = var11.apply(Integer.valueOf((int)var9.protected_()));
      float var16 = var7.byte_ * (this.byte_[11] ? this.protected_() : throws_[1]);
      if ((Boolean)((Supplier)this.byte_[7]).get()) {
         rrfD_2.class_(
            var1, var6.break_(), var6.protected_() - 2.0F, var16, var7.protected_ + 4.0F, (Float)this.byte_[9] / 2.0F, 4, 9, var12, var13, var14, var15
         );
      }

      rrfD_2.break_(
         var1,
         var6.break_(),
         var6.protected_(),
         var16,
         var7.protected_,
         (Float)this.byte_[9],
         (Float)this.byte_[9],
         (Float)this.byte_[9],
         (Float)this.byte_[9],
         var12,
         var13,
         var14,
         var15
      );
      String var17 = this.class_((String)((Supplier)this.byte_[1]).get());
      if ((Boolean)this.byte_[10]) {
         ((rrZO)this.byte_[0])
            .byte_(
               var1,
               var17,
               var6.break_() + var6.byte_() / 2.0F + var8.byte_,
               var6.protected_() + var8.protected_,
               ColorHelper.break_(var10, (int)(255.0F * (Float)((Supplier)this.byte_[8]).get())),
               false
            );
      } else {
         ((rrZO)this.byte_[0])
            .protected_(
               var1,
               var17,
               var6.break_() + var8.byte_,
               var6.protected_() + var8.protected_,
               ColorHelper.break_(var10, (int)(255.0F * (Float)((Supplier)this.byte_[8]).get())),
               false
            );
      }
   }

   private static long break_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -4199915859870418433L;
   }

   public <T extends rrup_1> T break_(Supplier<Boolean> var1) {
      this.package_();
      this.byte_[7] = var1;
      return (T)this;
   }

   private static int break_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -824665302;
   }

   @Override
   public Supplier<rjK_2> extends_() {
      this.package_();
      return (Supplier<rjK_2>)this.byte_[3];
   }

   public Supplier<Float> continue_() {
      this.package_();
      return (Supplier<Float>)this.byte_[8];
   }

   private void package_() {
      if (this.byte_ == null) {
         this.byte_ = new Object[12];
         Object[] var1 = this.byte_;
         var1[9] = 0.0F;
         var1[10] = false;
         var1[11] = false;
      }
   }

   private static void return_() {
      protected_ = new byte[]{4, 9, 12, 9, 10, 11};
   }

   public rruu_1 super_() {
      this.package_();
      Boolean var5 = true;
      this.byte_[10] = var5;
      return this;
   }

   public static String protected_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{5, -122, -14, 77, 88, -58, 75, -106}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void synchronized_() {
      throws_ = new float[]{4.0F, 1.0F, 2.0F, 4.0F, 2.0F, 2.0F, 255.0F, 255.0F, 255.0F, 1.0F, 1.0F, 0.0F};
   }
}
