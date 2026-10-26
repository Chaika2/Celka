package celestial;

import com.google.common.collect.Lists;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.ArrayList;
import java.util.List;

public class mJ_2 extends LZ {
   private static final rqO_2 class_ = new rqO_2("textures/gui/recipe_book.png");
   private static final rgP_2 throws_ = new rgn_3("gui.recipebook.moreRecipes");
   private rJI<?> case_;
   private rkU_2 catch_;
   private mG_2 private_;
   private float implements_;
   private float super_;
   private int this_;

   public mJ_2() {
      super(0, 0, 25, 25, rgN_2.byte_);
   }

   public void class_(mG_2 var1, mE_2 var2) {
      this.private_ = var1;
      this.case_ = (rJI<?>)((rJr_1)((cb_3)var2.protected_().class_[57]).implements_[4]);
      this.catch_ = var2.throws_();
      List var3 = var1.class_(this.catch_.class_(this.case_));

      for (rkw_3 var5 : var3) {
         if (this.catch_.protected_(var5)) {
            var2.class_(var3);
            this.super_ = 15.0F;
            break;
         }
      }
   }

   public List<rgP_2> class_(vm_3 var1) {
      rdn_3 var2 = this.catch_().get(this.this_).byte_();
      ArrayList var3 = Lists.newArrayList(var1.class_(var2));
      if (this.private_.class_(this.catch_.class_(this.case_)).size() > 1) {
         var3.add(throws_);
      }

      return var3;
   }

   public mG_2 class_() {
      return this.private_;
   }

   public void class_(int var1, int var2) {
      this.volatile_ = var1;
      this.final_ = var2;
   }

   @Override
   protected boolean break_(int var1) {
      return var1 == 0 || var1 == 1;
   }

   @Override
   public void break_(Ml_1 var1, int var2, int var3, float var4) {
      if (!vm_3.else_()) {
         this.implements_ += var4;
      }

      QY var5 = QY.instanceof_();
      var5.A().class_(class_);
      byte var6 = 29;
      if (!this.private_.break_()) {
         var6 += 25;
      }

      short var7 = 206;
      if (this.private_.class_(this.catch_.class_(this.case_)).size() > 1) {
         var7 += 25;
      }

      boolean var8 = this.super_ > 0.0F;
      if (var8) {
         float var9 = 1.0F + 0.1F * (float)Math.sin((double)(this.super_ / 15.0F * (float) Math.PI));
         RenderSystem.pushMatrix();
         RenderSystem.translatef((float)(this.volatile_ + 8), (float)(this.final_ + 12), 0.0F);
         RenderSystem.scalef(var9, var9, 1.0F);
         RenderSystem.translatef((float)(-(this.volatile_ + 8)), (float)(-(this.final_ + 12)), 0.0F);
         this.super_ -= var4;
      }

      this.break_(var1, this.volatile_, this.final_, var6, var7, this.extends_, this.native_);
      List var12 = this.catch_();
      this.this_ = rfU_2.protected_(this.implements_ / 30.0F) % var12.size();
      rdn_3 var10 = ((rkw_3)var12.get(this.this_)).byte_();
      int var11 = 4;
      if (this.private_.throws_() && this.catch_().size() > 1) {
         var5.float_().class_(var10, this.volatile_ + var11 + 1, this.final_ + var11 + 1);
         var11--;
      }

      var5.float_().break_(var10, this.volatile_ + var11, this.final_ + var11);
      if (var8) {
         RenderSystem.popMatrix();
      }
   }

   public rkw_3<?> throws_() {
      List var1 = this.catch_();
      return (rkw_3<?>)var1.get(this.this_);
   }

   private List<rkw_3<?>> catch_() {
      List var1 = this.private_.break_(true);
      if (!this.catch_.class_(this.case_)) {
         var1.addAll(this.private_.break_(false));
      }

      return var1;
   }

   @Override
   public int case_() {
      return 25;
   }

   public boolean protected_() {
      return this.catch_().size() == 1;
   }
}
