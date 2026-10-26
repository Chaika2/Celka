package celestial;

public class rrJf_1 extends Ax_1 {
   private boolean catch_ = false;
   private rfH_2 private_ = null;
   private an_3 implements_ = null;

   public rrJf_1(QY var1, Aq_1 var2) {
      super(var1, var2);
   }

   @Override
   public ryZ_2 class_(cb_3 var1, gm_3 var2, rpm_3 var3, rff_3 var4) {
      this.catch_ = true;
      this.private_ = var4.class_();
      ryZ_2 var5 = super.class_(var1, var2, var3, var4);
      this.catch_ = false;
      return var5;
   }

   @Override
   public ryZ_2 class_(rhd_3 var1, an_3 var2, rpm_3 var3) {
      this.implements_ = var2;
      return super.class_(var1, var2, var3);
   }

   @Override
   public ryZ_2 class_(rhd_3 var1, an_3 var2, rfo_3 var3, rpm_3 var4) {
      this.implements_ = var2;
      return super.class_(var1, var2, var3, var4);
   }

   @Override
   public boolean class_(rfH_2 var1, rpr_3 var2, boolean var3) {
      this.catch_ = true;
      this.private_ = var1;
      boolean var4 = super.class_(var1, var2, var3);
      this.catch_ = false;
      return var4;
   }

   @Override
   public ryZ_2 class_(rpm_3 var1) {
      this.catch_ = true;
      ryZ_2 var2 = super.class_(var1);
      this.catch_ = false;
      return var2;
   }

   @Override
   public boolean break_(rfH_2 var1, rpr_3 var2, boolean var3) {
      this.catch_ = true;
      this.private_ = var1;
      boolean var4 = super.break_(var1, var2, var3);
      this.catch_ = false;
      return var4;
   }

   public rfH_2 continue_() {
      return this.private_;
   }

   public boolean new_() {
      return this.catch_;
   }

   public an_3 super_() {
      return this.implements_;
   }
}
