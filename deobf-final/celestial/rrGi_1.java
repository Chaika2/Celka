package celestial;

public class rrGi_1 extends rfH_2 {
   private int class_;
   private int break_;
   private int catch_;
   private int private_;
   private rrGi_1[] implements_;
   private boolean finally_;

   public static Iterable byte_(rfH_2 var0, rfH_2 var1) {
      rfH_2 var2 = new rfH_2(Math.min(var0.b_(), var1.b_()), Math.min(var0.c_(), var1.c_()), Math.min(var0.d_(), var1.d_()));
      rfH_2 var3 = new rfH_2(Math.max(var0.b_(), var1.b_()), Math.max(var0.c_(), var1.c_()), Math.max(var0.d_(), var1.d_()));
      return new rrbr_3(var2, var3);
   }

   @Override
   public rfH_2 int_() {
      return new rfH_2(this.class_, this.break_, this.catch_);
   }

   public rrGi_1(int var1, int var2, int var3, int var4) {
      super(0, 0, 0);
      this.class_ = var1;
      this.break_ = var2;
      this.catch_ = var3;
      this.private_ = var4;
   }

   public rrGi_1() {
      this(0, 0, 0, 0);
   }

   public rrGi_1(int var1, int var2, int var3) {
      this(var1, var2, var3, 0);
   }

   public rrGi_1(double var1, double var3, double var5) {
      this(rfU_2.byte_(var1), rfU_2.byte_(var3), rfU_2.byte_(var5));
   }

   public void class_(rfH_2 var1, rpr_3 var2, rpr_3 var3) {
      this.class_ = var1.b_() + var2.implements_() + var3.implements_();
      this.break_ = var1.c_() + var2.finally_() + var3.finally_();
      this.catch_ = var1.d_() + var2.extends_() + var3.extends_();
   }

   public void class_(rfH_2 var1, rpr_3 var2) {
      this.class_ = var1.b_() + var2.implements_();
      this.break_ = var1.c_() + var2.finally_();
      this.catch_ = var1.d_() + var2.extends_();
   }

   @Override
   public rfH_2 class_(rpr_3 var1, int var2) {
      return var2 == 1 ? this.break_(var1) : super.class_(var1, var2).int_();
   }

   public void class_(int var1, int var2, int var3) {
      this.class_ = var1;
      this.break_ = var2;
      this.catch_ = var3;
      this.finally_ = true;
   }

   @Override
   public rfH_2 break_(rpr_3 var1) {
      if (this.private_ <= 0) {
         return super.class_(var1, 1).int_();
      } else {
         if (this.implements_ == null) {
            this.implements_ = new rrGi_1[rpr_3.VALUES.length];
         }

         if (this.finally_) {
            this.finally_();
         }

         int var2 = var1.byte_();
         rrGi_1 var3 = this.implements_[var2];
         if (var3 == null) {
            int var4 = this.class_ + var1.implements_();
            int var5 = this.break_ + var1.finally_();
            int var6 = this.catch_ + var1.extends_();
            var3 = new rrGi_1(var4, var5, var6, this.private_ - 1);
            this.implements_[var2] = var3;
         }

         return var3;
      }
   }

   public void break_(double var1, double var3, double var5) {
      this.class_(rfU_2.byte_(var1), rfU_2.byte_(var3), rfU_2.byte_(var5));
   }

   private void finally_() {
      for (int var1 = 0; var1 < 6; var1++) {
         rrGi_1 var2 = this.implements_[var1];
         if (var2 != null) {
            rpr_3 var3 = rpr_3.VALUES[var1];
            int var4 = this.class_ + var3.implements_();
            int var5 = this.break_ + var3.finally_();
            int var6 = this.catch_ + var3.extends_();
            var2.class_(var4, var5, var6);
         }
      }

      this.finally_ = false;
   }

   @Override
   public int c_() {
      return this.break_;
   }

   @Override
   public int b_() {
      return this.class_;
   }

   @Override
   public int d_() {
      return this.catch_;
   }
}
