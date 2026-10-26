package celestial;

import com.mojang.blaze3d.systems.RenderSystem;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public abstract class ue_3 extends ms_3 {
   private Iterator<rdb_3> implements_;
   private Set<rdb_3> finally_;
   private rJY extends_;
   private rdb_3 native_;
   private float volatile_;

   @Override
   public void class_(Ml_1 var1, int var2, int var3, boolean var4, float var5) {
      super.class_(var1, var2, var3, var4, var5);
      if (this.extends_ != null) {
         if (!vm_3.else_()) {
            this.volatile_ += var5;
         }

         int var6 = this.extends_.throws_ + var2;
         int var7 = this.extends_.case_ + var3;
         ch_3.class_(var1, var6, var7, var6 + 16, var7 + 16, 822018048);
         this.private_.float_().class_((cb_3)this.private_.class_[57], this.native_().continue_(), (float)var6, (float)var7);
         RenderSystem.depthFunc(516);
         ch_3.class_(var1, var6, var7, var6 + 16, var7 + 16, 822083583);
         RenderSystem.depthFunc(515);
      }
   }

   @Override
   public void class_(rkw_3<?> var1, List<rJY> var2) {
      rdn_3 var3 = var1.byte_();
      this.throws_.class_(var1);
      this.throws_.class_(rkg_3.class_(var3), ((rJY)var2.get(2)).throws_, ((rJY)var2.get(2)).case_);
      rqs_3 var4 = var1.class_();
      this.extends_ = (rJY)var2.get(1);
      if (this.finally_ == null) {
         this.finally_ = this.protected_();
      }

      this.implements_ = this.finally_.iterator();
      this.native_ = null;
      Iterator var5 = var4.iterator();

      for (int var6 = 0; var6 < 2; var6++) {
         if (!var5.hasNext()) {
            return;
         }

         rkg_3 var7 = (rkg_3)var5.next();
         if (!var7.protected_()) {
            rJY var8 = (rJY)var2.get(var6);
            this.throws_.class_(var7, var8.throws_, var8.case_);
         }
      }
   }

   @Override
   protected void class_() {
      this.case_.class_(152, 182, 28, 18, class_);
   }

   @Override
   public void class_(rJY var1) {
      super.class_(var1);
      if (var1 != null && var1.protected_ < this.catch_.throws_()) {
         this.extends_ = null;
      }
   }

   protected abstract Set<rdb_3> protected_();

   private rdb_3 native_() {
      if (this.native_ == null || this.volatile_ > 30.0F) {
         this.volatile_ = 0.0F;
         if (this.implements_ == null || !this.implements_.hasNext()) {
            if (this.finally_ == null) {
               this.finally_ = this.protected_();
            }

            this.implements_ = this.finally_.iterator();
         }

         this.native_ = this.implements_.next();
      }

      return this.native_;
   }
}
