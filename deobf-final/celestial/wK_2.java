package celestial;

public class wK_2 implements rrGt_1 {
   protected int[] class_;
   protected final int break_;
   protected rpr_3 byte_;
   protected fj_3 protected_;
   private final boolean throws_;
   private int[] case_ = null;
   private rrJt_1 catch_;
   private boolean private_;
   private wK_2 implements_;
   private rrxv_3 finally_;
   private final boolean extends_;

   public int byte_() {
      return this.break_;
   }

   public wK_2 int_() {
      if (this.private_) {
         return this.implements_;
      } else {
         if (this.implements_ == null && this.protected_ != null && this.protected_.final_ != null) {
            this.implements_ = new rrJl_1(this, this.protected_.final_);
         }

         this.private_ = true;
         return this.implements_;
      }
   }

   public wK_2(int[] var1, int var2, rpr_3 var3, fj_3 var4, boolean var5) {
      this.class_ = var1;
      this.break_ = var2;
      this.byte_ = var3;
      this.protected_ = var4;
      this.throws_ = var5;
      this.extends_ = var2 != -1;
      this.private_();
   }

   @Override
   public String toString() {
      return "vertexData: " + this.class_.length + ", tint: " + this.break_ + ", facing: " + this.byte_ + ", sprite: " + this.protected_;
   }

   @Override
   public void class_(rrGT var1) {
      rrxr_3.class_(rrxr_3.BX, var1, this);
   }

   private static int[] class_(int[] var0, fj_3 var1) {
      int[] var2 = (int[])var0.clone();
      int var3 = var2.length / 4;

      for (int var4 = 0; var4 < 4; var4++) {
         int var5 = var4 * var3;
         float var6 = Float.intBitsToFloat(var2[var5 + 4]);
         float var7 = Float.intBitsToFloat(var2[var5 + 4 + 1]);
         float var8 = var1.byte_(var6);
         float var9 = var1.protected_(var7);
         var2[var5 + 4] = Float.floatToRawIntBits(var8);
         var2[var5 + 4 + 1] = Float.floatToRawIntBits(var9);
      }

      return var2;
   }

   public int[] class_() {
      this.private_();
      return this.class_;
   }

   private static fj_3 class_(int[] var0) {
      float var1 = 1.0F;
      float var2 = 1.0F;
      float var3 = 0.0F;
      float var4 = 0.0F;
      int var5 = var0.length / 4;

      for (int var6 = 0; var6 < 4; var6++) {
         int var7 = var6 * var5;
         float var8 = Float.intBitsToFloat(var0[var7 + 4]);
         float var9 = Float.intBitsToFloat(var0[var7 + 4 + 1]);
         var1 = Math.min(var1, var8);
         var2 = Math.min(var2, var9);
         var3 = Math.max(var3, var8);
         var4 = Math.max(var4, var9);
      }

      float var10 = (var1 + var3) / 2.0F;
      float var11 = (var2 + var4) / 2.0F;
      return rrbb_3.rF().class_((double)var10, (double)var11);
   }

   public rrxq_3[] class_(int var1) {
      if (this.finally_ == null) {
         this.finally_ = new rrxv_3();
      }

      return this.finally_.class_(var1);
   }

   private static int[] class_(int[] var0, int var1) {
      int var2 = var0.length / 4;
      int var3 = var1 / 4;
      int[] var4 = new int[var3 * 4];

      for (int var5 = 0; var5 < 4; var5++) {
         int var6 = Math.min(var2, var3);
         System.arraycopy(var0, var5 * var2, var4, var5 * var3, var6);
      }

      return var4;
   }

   public boolean break_() {
      return this.extends_;
   }

   public boolean throws_() {
      return this.throws_;
   }

   public float finally_() {
      rrJt_1 var1 = this.implements_();
      return (var1.protected_() + var1.class_()) / 2.0F;
   }

   public int[] catch_() {
      if (this.case_ == null) {
         this.case_ = class_(this.class_(), this.case_());
      }

      if (this.case_.length != this.class_().length) {
         this.case_ = class_(this.class_(), this.case_());
      }

      return this.case_;
   }

   public double extends_() {
      rrJt_1 var1 = this.implements_();
      return (double)((var1.throws_() + var1.break_()) / 2.0F);
   }

   public fj_3 case_() {
      if (this.protected_ == null) {
         this.protected_ = class_(this.class_());
      }

      return this.protected_;
   }

   public rrJt_1 implements_() {
      if (this.catch_ == null) {
         this.catch_ = new rrJt_1(this.class_());
      }

      return this.catch_;
   }

   public boolean package_() {
      return this.final_() && this.volatile_();
   }

   public rpr_3 protected_() {
      if (this.byte_ == null) {
         this.byte_ = Ih_1.class_(this.class_());
      }

      return this.byte_;
   }

   protected void private_() {
      if (rrbb_3.rs()) {
         if (this.class_.length == ju_3.native_) {
            this.class_ = class_(this.class_, ju_3.volatile_);
         }
      } else if (this.class_.length == ju_3.volatile_) {
         this.class_ = class_(this.class_, ju_3.native_);
      }
   }

   public boolean final_() {
      rrJt_1 var1 = this.implements_();
      return var1.break_(this.byte_);
   }

   public boolean volatile_() {
      rrJt_1 var1 = this.implements_();
      return var1.class_(this.byte_);
   }

   public double native_() {
      rrJt_1 var1 = this.implements_();
      return (double)((var1.case_() + var1.byte_()) / 2.0F);
   }
}
