package celestial;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Supplier;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public abstract class rrtN_2 extends rrwI_2 implements MinecraftAccessor, rrtc_3 {
   private static double[] class_;
   private static byte[] break_;
   private static float[] byte_;
   public Object[] throws_;
   private static short[] protected_;
   private static boolean[] native_;

   public void boolean_() {
      this.class_();
      boolean var1 = this.aq_();
      if ((Boolean)this.throws_[9] && !var1) {
         this.ar_();
      }

      Boolean var6 = var1;
      this.throws_[9] = var6;
   }

   public void char_() {
      float var1 = const_.volatile_() / 2.00001F;
      float var2 = const_.final_() / 2.00001F;
      float var3 = this.implements_() / 2.0F;
      float var4 = this.ao_() / 2.0F;
      this.class_(var1 - var3, var2 - var4);
   }

   public void byte_(boolean var1) {
      for (rrtm_3 var3 : this.strictfp_()) {
         if (!var1 || !this.aq_()) {
            var3.native_();
         }
      }
   }

   public void byte_(int var1, int var2, int var3) {
   }

   public abstract String byte_();

   public void int_() {
      rrwX_2 var1 = this.interface_();
      if (var1.byte_()) {
         this.float_().class_(false);
         var1.class_(false);
      }

      for (rrtm_3 var3 : this.strictfp_()) {
         var3.aP_();
      }
   }

   public float long_() {
      return this.float_().byte_();
   }

   public rrNM float_() {
      this.class_();
      return (rrNM)this.throws_[7];
   }

   public float double_() {
      this.class_();
      return (Float)((Supplier)this.throws_[6]).get();
   }

   public rrtN_2(Supplier<Float> var1, Supplier<Float> var2, Supplier<Float> var3, Supplier<Float> var4) {
      this.class_();
      ArrayList var9 = new ArrayList();
      this.throws_[0] = var9;
      this.throws_[3] = var1;
      this.throws_[4] = var2;
      this.throws_[5] = var3;
      this.throws_[6] = var4;
      rrwX_2 var14 = new rrwX_2(this);
      this.throws_[1] = var14;
      rrws_3 var15 = new rrws_3(this);
      this.throws_[2] = var15;
      rrNM var16 = new rrNM((rrQK)rrQK.staticFieldsd7edc8a98bf936d38fa97cfea6cbd552[2], 0.3F);
      this.throws_[7] = var16;
   }

   public rrtN_2(Supplier<Float> var1, Supplier<Float> var2, rrNM var3) {
      this(var1, var2);
      this.throws_[7] = var3;
   }

   public rrtN_2(Supplier<Float> var1, Supplier<Float> var2) {
      this.class_();
      ArrayList var7 = new ArrayList();
      this.throws_[0] = var7;
      Supplier var8 = () -> 0.0F;
      this.throws_[3] = var8;
      Supplier var9 = () -> 0.0F;
      this.throws_[4] = var9;
      this.throws_[5] = var1;
      this.throws_[6] = var2;
      rrwX_2 var12 = new rrwX_2(this);
      this.throws_[1] = var12;
      rrws_3 var13 = new rrws_3(this);
      this.throws_[2] = var13;
      rrNM var14 = new rrNM((rrQK)rrQK.staticFieldsd7edc8a98bf936d38fa97cfea6cbd552[2], 0.3F);
      this.throws_[7] = var14;
   }

   static {
      ntfClinit();
   }

   public rrwX_2 interface_() {
      this.class_();
      return (rrwX_2)this.throws_[1];
   }

   public boolean class_(rrtu_3 var1, int var2, int var3) {
      if (var1.class_(this, var2, var3)) {
         return false;
      } else {
         float var4 = this.default_();
         float var5 = this.abstract_();
         float var6 = this.implements_();
         return (float)var2 >= var4 && (float)var2 <= var4 + var6 && (float)var3 >= var5 && (float)var3 <= var5 + 13.0F ? true : native_[25];
      }
   }

   public void class_(int var1, int var2, int var3) {
      this.short_().case_();
      Object var8 = null;
      rrws_3.class_[0] = var8;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -3900549124377365098L;
   }

   public int class_(List<rrtN_2> var1) {
      return var1.indexOf(this);
   }

   public void class_(Supplier<Float> var1) {
      this.class_();
      this.throws_[6] = var1;
   }

   public rrtN_2 class_(rrwE_2 var1, float var2, float var3) {
      this.class_();
      rrwM_2 var8 = new rrwM_2(var1, var2, var3);
      this.throws_[8] = var8;
      return this;
   }

   public void class_(Ml_1 var1, float var2) {
      float var3 = 1.0F - var2;
      var1.class_((double)(var3 * (this.default_() + this.implements_() / 2.0F)), (double)(var3 * (this.abstract_() + this.ao_() / 2.0F)), 0.0);
      var1.class_(var2, var2, 1.0F);
   }

   public rrtN_2 class_(float var1, float var2) {
      this.class_();
      if ((rrwM_2)this.throws_[8] != null) {
         rrwE_2 var3 = ((rrwM_2)this.throws_[8]).break_();
         ((rrwM_2)this.throws_[8]).class_(var1 - var3.class_(const_.volatile_(), this.implements_()));
         ((rrwM_2)this.throws_[8]).break_(var2 - var3.break_(const_.final_(), this.ao_()));
         return this;
      } else {
         Supplier var8 = () -> var1;
         this.throws_[3] = var8;
         Supplier var9 = () -> var2;
         this.throws_[4] = var9;
         return this;
      }
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -789043386;
   }

   public boolean class_(rrtu_3 var1, int var2, int var3, double var4, boolean var6, boolean var7) {
      return false;
   }

   public void class_(rrNM var1) {
      this.class_();
      this.throws_[7] = var1;
   }

   private void class_() {
      if (this.throws_ == null) {
         this.throws_ = new Object[10];
         Object[] var1 = this.throws_;
         var1[9] = false;
      }
   }

   public void class_(rrtu_3 var1) {
      rrwX_2 var2 = this.interface_();
      var2.class_(true);
      List var3 = var1.class_();
      Collections.swap(var3, var3.size() - 1, this.class_(var3));

      for (rrtm_3 var5 : this.strictfp_()) {
         var5.break_();
      }
   }

   public rrtN_2 class_(rrwE_2 var1) {
      this.class_();
      float var2 = this.default_();
      float var3 = this.abstract_();
      if ((rrwM_2)this.throws_[8] == null) {
         rrwM_2 var8 = new rrwM_2(var1, 0.0F, 0.0F);
         this.throws_[8] = var8;
      } else {
         ((rrwM_2)this.throws_[8]).class_(var1);
      }

      ((rrwM_2)this.throws_[8]).class_(var2 - var1.class_(const_.volatile_(), this.implements_()));
      ((rrwM_2)this.throws_[8]).break_(var3 - var1.break_(const_.final_(), this.ao_()));
      return this;
   }

   public boolean class_(int var1, int var2) {
      if (!this.aq_()) {
         return false;
      } else {
         for (rrtm_3 var4 : this.strictfp_()) {
            if (var4.implements_()) {
               return true;
            }
         }

         return this.transient_().break_((float)var1, (float)var2);
      }
   }

   public boolean class_(char var1, int var2) {
      return false;
   }

   public void class_(Ml_1 var1, rrtu_3 var2, int var3, int var4, boolean var5) {
      this.short_().class_(var2, var3, var4);
   }

   public boolean class_(rrtu_3 var1, int var2, int var3, int var4, boolean var5, boolean var6) {
      this.class_();
      if (var1.class_(this, var2, var3)) {
         return false;
      } else {
         this.interface_().break_().class_(var1, var2, var3, var4, var5);
         ((rrws_3)this.throws_[2]).class_(var1, var2, var3, var4);

         for (rrtm_3 var8 : this.strictfp_()) {
            if (var8.volatile_().break_((float)var2, (float)var3)) {
               var8.class_(var1, var2, var3, var4, var6);
               break;
            }
         }

         return native_[2];
      }
   }

   public float default_() {
      this.class_();
      return (rrwM_2)this.throws_[8] != null
         ? ((rrwM_2)this.throws_[8]).class_(const_.volatile_(), this.implements_())
         : (Float)((Supplier)this.throws_[3]).get();
   }

   public rrws_3 short_() {
      this.class_();
      return (rrws_3)this.throws_[2];
   }

   public void void_() {
   }

   public void r() {
   }

   public void break_(rrtu_3 var1, int var2, int var3, int var4, boolean var5, boolean var6) {
   }

   public void break_(Supplier<Float> var1) {
      this.class_();
      this.throws_[5] = var1;
   }

   public boolean break_(rrtu_3 var1, int var2, int var3) {
      if (!this.class_(var2, var3)) {
         return false;
      } else {
         return !var1.class_(this, var2, var3) ? true : native_[17];
      }
   }

   public boolean break_(int var1, int var2, int var3) {
      return false;
   }

   public void break_(Ml_1 var1, rrtu_3 var2, int var3, int var4, boolean var5) {
      this.class_();
      if (!var5) {
         if (!((List)this.throws_[0]).isEmpty()) {
            List var6 = this.strictfp_();

            for (int var7 = var6.size() - 1; var7 >= 0; var7--) {
               rrtm_3 var8 = (rrtm_3)var6.get(var7);
               var8.class_(var1, var2, var3, var4);
            }

            for (rrtm_3 var10 : var6) {
               var10.break_(var1, var2, var3, var4);
            }
         }
      }
   }

   public boolean P() {
      return this.float_().protected_();
   }

   public abstract String catch_();

   public boolean extends_() {
      return true;
   }

   public rrwM_2 const_() {
      this.class_();
      return (rrwM_2)this.throws_[8];
   }

   private static void else_() {
      native_ = new boolean[]{
         true,
         false,
         false,
         false,
         false,
         false,
         true,
         true,
         false,
         false,
         true,
         true,
         true,
         false,
         true,
         false,
         true,
         false,
         true,
         false,
         true,
         false,
         false,
         false,
         true,
         false,
         false
      };
   }

   public void for_() {
   }

   public float implements_() {
      this.class_();
      return (Float)((Supplier)this.throws_[5]).get();
   }

   public float import_() {
      return 5.0F;
   }

   public void instanceof_() {
   }

   public boolean new_() {
      return true;
   }

   private static void package_() {
      break_ = new byte[]{10, 9};
   }

   private static void return_() {
      class_ = new double[1];
   }

   private static void super_() {
      byte_ = new float[]{
         0.3F, 0.3F, 5.0F, 0.0F, 5.0F, 5.0F, 18.0F, 1.0F, 2.0F, 2.0F, 1.0F, 2.00001F, 2.00001F, 2.0F, 2.0F, 5.0F, 0.0F, 0.0F, 0.0F, 0.0F, 13.0F, 0.0F, 0.0F
      };
   }

   public void switch_() {
      this.class_();
      List var1 = (List)this.throws_[0];

      for (Setting var3 : this.b()) {
         float var4 = (Float)((Supplier)this.throws_[5]).get();
         rrtm_3 var5 = rrtZ_2.class_(this, var3, var4);
         if (var3 instanceof GroupSetting) {
            GroupSetting var6 = (GroupSetting)var3;
            List var7 = var6.byte_();
            var1.add(new rrtC_2(this, var6, 5.0F, 0.0F, var4 - 5.0F - 5.0F, 18.0F));

            for (Setting var9 : var7) {
               rrtm_3 var10 = rrtZ_2.class_(this, var9, var4);
               var1.add(var10);
            }
         } else if (var5 != null) {
            var1.add(var5);
         }
      }
   }

   private static void while_() {
      protected_ = new short[]{
         0,
         3,
         4,
         5,
         6,
         1,
         2,
         2,
         7,
         0,
         3,
         4,
         5,
         6,
         1,
         2,
         2,
         7,
         7,
         0,
         5,
         0,
         2,
         0,
         9,
         9,
         0,
         1,
         2,
         8,
         8,
         3,
         8,
         8,
         4,
         8,
         8,
         8,
         8,
         8,
         8,
         8,
         5,
         6,
         5,
         6,
         7,
         7,
         8,
         8,
         8,
         8,
         3,
         4
      };
   }

   public boolean static_() {
      return !this.interface_().byte_() && !this.float_().case_() ? true : native_[21];
   }

   public static String protected_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-15, -34, -15, 82, 60, 123, -41, -99}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public abstract boolean protected_();

   public void private_() {
   }

   public float abstract_() {
      this.class_();
      return (rrwM_2)this.throws_[8] != null ? ((rrwM_2)this.throws_[8]).break_(const_.final_(), this.ao_()) : (Float)((Supplier)this.throws_[4]).get();
   }

   public boolean final_() {
      return true;
   }

   public rruv_1 transient_() {
      return new rruv_1(this.default_(), this.abstract_(), this.implements_(), this.ao_());
   }

   @Override
   public String synchronized_() {
      return this.catch_();
   }

   public List<rrtm_3> strictfp_() {
      this.class_();
      return ((List)this.throws_[0]).stream().filter(rrtm_3::throws_).toList();
   }

   public void ar_() {
   }

   public boolean ap_() {
      return false;
   }

   public float au_() {
      return 0.0F;
   }

   public void as_() {
      this.float_().class_(this.interface_().byte_());
   }

   public float ao_() {
      float var1 = 0.0F;

      for (rrtm_3 var3 : this.strictfp_()) {
         var1 += var3.class_(var3);
      }

      return this.double_() + var1;
   }

   public boolean aq_() {
      return !this.interface_().byte_() && !this.float_().case_() ? native_[19] : native_[18];
   }

   public void at_() {
   }
}
