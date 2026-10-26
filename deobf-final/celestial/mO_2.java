package celestial;

import com.google.common.collect.Lists;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.Iterator;
import java.util.List;

class mO_2 extends LZ implements rkI_2<rkg_3> {
   final rkw_3<?> case_;
   private final boolean catch_;
   protected final List<mh_3> class_;

   public mO_2(int var1, int var2, rkw_3<?> var3, boolean var4, boolean var5) {
      super(var2, var3, 200, 20, rgN_2.byte_);
      this.throws_ = var1;
      this.class_ = Lists.newArrayList();
      this.extends_ = 24;
      this.native_ = 24;
      this.case_ = var4;
      this.catch_ = var5;
      this.class_(var4);
   }

   @Override
   public void class_(Iterator<rkg_3> var1, int var2, int var3, int var4, int var5) {
      rdn_3[] var6 = ((rkg_3)var1.next()).class_();
      if (var6.length != 0) {
         this.class_.add(new mh_3(this, 3 + var5 * 7, 3 + var4 * 7, var6));
      }
   }

   protected void class_(rkw_3<?> var1) {
      this.class_(3, 3, -1, var1, var1.class_().iterator(), 0);
   }

   @Override
   public void break_(Ml_1 var1, int var2, int var3, float var4) {
      RenderSystem.enableAlphaTest();
      this.throws_.implements_.A().class_(mb_3.class_);
      short var5 = 152;
      if (!this.catch_) {
         var5 += 26;
      }

      int var6 = this.throws_.volatile_ ? 130 : 78;
      if (this.B_()) {
         var6 += 26;
      }

      this.break_(var1, this.volatile_, this.final_, var5, var6, this.extends_, this.native_);

      for (mh_3 var8 : this.class_) {
         RenderSystem.pushMatrix();
         float var9 = 0.42F;
         int var10 = (int)((float)(this.volatile_ + var8.break_) / 0.42F - 3.0F);
         int var11 = (int)((float)(this.final_ + var8.byte_) / 0.42F - 3.0F);
         RenderSystem.scalef(0.42F, 0.42F, 1.0F);
         this.throws_.implements_.float_().class_(var8.class_[rfU_2.protected_(this.throws_.native_ / 30.0F) % var8.class_.length], var10, var11);
         RenderSystem.popMatrix();
      }

      RenderSystem.disableAlphaTest();
   }
}
