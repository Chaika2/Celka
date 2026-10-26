package celestial;

public class mQ_2 extends vm_3 {
   private final Runnable case_;
   protected final rgP_2 class_;
   private cv_3 catch_ = cv_3.class_;
   protected final rgP_2 throws_;
   private int private_;

   public mQ_2(Runnable var1, rgP_2 var2, rgP_2 var3) {
      this(var1, var2, var3, cN_2.private_);
   }

   public mQ_2(Runnable var1, rgP_2 var2, rgP_2 var3, rgP_2 var4) {
      super(var2);
      this.case_ = var1;
      this.class_ = var3;
      this.throws_ = var4;
   }

   @Override
   public void class_(Ml_1 var1, int var2, int var3, float var4) {
      this.class_(var1);
      class_(var1, this.super_, this.extends_, this.package_ / 2, 70, 16777215);
      this.catch_.class_(var1, this.package_ / 2, 90);
      super.class_(var1, var2, var3, var4);
   }

   @Override
   public void private_() {
      super.private_();
      if (--this.private_ == 0) {
         for (LZ var2 : this.new_) {
            var2.int_ = true;
         }
      }
   }

   @Override
   protected void v_() {
      super.v_();
      this.class_(new LF(this.package_ / 2 - 100, this.int_ / 6 + 168, 200, 20, this.throws_, var1 -> this.case_.run()));
      this.catch_ = cv_3.class_(this.super_, this.class_, this.package_ - 50);
   }
}
