package celestial;

import com.google.common.collect.Lists;
import com.mojang.blaze3d.systems.RenderSystem;
import it.unimi.dsi.fastutil.objects.ObjectLinkedOpenHashSet;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

public class ms_3 extends ch_3 implements cC_2, cp_3, mS_2, rkI_2<rkg_3> {
   protected static final rqO_2 class_ = new rqO_2("textures/gui/recipe_book.png");
   private static final rgP_2 implements_ = new rgn_3("gui.recipebook.search_hint").class_(rgF_2.ITALIC).class_(rgF_2.GRAY);
   private static final rgP_2 finally_ = new rgn_3("gui.recipebook.toggleRecipes.craftable");
   private static final rgP_2 extends_ = new rgn_3("gui.recipebook.toggleRecipes.all");
   private int native_;
   private int volatile_;
   private int final_;
   protected final mr_3 throws_ = new mr_3();
   private final List<mX_2> package_ = Lists.newArrayList();
   private mX_2 int_;
   protected Lm_1 case_;
   protected rJI<?> catch_;
   protected QY private_;
   private Lu_1 new_;
   private String continue_ = "";
   private VR super_;
   private final mE_2 this_ = new mE_2();
   private final rWr_1 else_ = new rWr_1();
   private int synchronized_;
   private boolean return_;

   public void byte_(Ml_1 var1, int var2, int var3, int var4, int var5) {
      if (this.private_()) {
         this.this_.class_(var1, var4, var5);
         if (this.case_.B_()) {
            rgP_2 var6 = this.volatile_();
            if ((vm_3)this.private_.class_[73] != null) {
               ((vm_3)this.private_.class_[73]).class_(var1, var6, var4, var5);
            }
         }

         this.protected_(var1, var2, var3, var4, var5);
      }
   }

   protected void byte_(boolean var1) {
      this.super_.class_(this.catch_.implements_(), var1);
      if (!var1) {
         this.this_.byte_();
      }

      this.extends_();
   }

   private boolean int_() {
      return this.native_ == 86;
   }

   @Override
   public boolean class_(char var1, int var2) {
      if (this.return_) {
         return false;
      } else if (!this.private_() || ((cb_3)this.private_.class_[57]).native_()) {
         return false;
      } else if (this.new_.class_(var1, var2)) {
         this.package_();
         return true;
      } else {
         return cC_2.super.class_(var1, var2);
      }
   }

   private void class_(String var1) {
      if ("excitedze".equals(var1)) {
         jV_2 var2 = this.private_.u();
         jj_3 var3 = var2.class_("en_pt");
         if (var2.break_().class_(var3) == 0) {
            return;
         }

         var2.class_(var3);
         ((Qw_1)this.private_.class_[20]).rG = var3.getCode();
         this.private_.private_();
         ((Qw_1)this.private_.class_[20]).break_();
      }
   }

   public void class_(boolean var1) {
      this.native_ = var1 ? 0 : 86;
      int var2 = (this.volatile_ - 147) / 2 - this.native_;
      int var3 = (this.final_ - 166) / 2;
      this.else_.class_();
      ((rhz_3)((cb_3)this.private_.class_[57]).implements_[1]).class_(this.else_);
      this.catch_.class_(this.else_);
      String var4 = this.new_ != null ? this.new_.private_() : "";
      this.new_ = new Lu_1((cm_3)this.private_.class_[15], var2 + 25, var3 + 14, 80, 14, new rgn_3("itemGroup.search"));
      this.new_.implements_(50);
      this.new_.protected_(false);
      this.new_.private_(true);
      this.new_.finally_(16777215);
      this.new_.class_(var4);
      this.this_.class_(this.private_, var2, var3);
      this.this_.class_(this);
      this.case_ = new Lm_1(var2 + 110, var3 + 12, 26, 16, this.super_.class_(this.catch_));
      this.class_();
      this.package_.clear();

      for (gM_2 var6 : gM_2.class_(this.catch_.implements_())) {
         this.package_.add(new mX_2(var6));
      }

      if (this.int_ != null) {
         this.int_ = this.package_.stream().filter(var1x -> var1x.class_().equals(this.int_.class_())).findFirst().orElse((mX_2)null);
      }

      if (this.int_ == null) {
         this.int_ = this.package_.get(0);
      }

      this.int_.byte_(true);
      this.protected_(false);
      this.protected_();
   }

   @Override
   public void class_(List<rkw_3<?>> var1) {
      for (rkw_3 var3 : var1) {
         ((cb_3)this.private_.class_[57]).class_(var3);
      }
   }

   @Override
   public boolean class_(int var1, int var2, int var3) {
      this.return_ = false;
      if (!this.private_() || ((cb_3)this.private_.class_[57]).native_()) {
         return false;
      } else if (var1 == 256 && !this.int_()) {
         this.byte_(false);
         return true;
      } else if (this.new_.class_(var1, var2, var3)) {
         this.package_();
         return true;
      } else if (this.new_.aO_() && this.new_.int_() && var1 != 256) {
         return true;
      } else if (((Qw_1)this.private_.class_[20]).v.class_(var1, var2) && !this.new_.aO_()) {
         this.return_ = true;
         this.new_.byte_(true);
         return true;
      } else {
         return false;
      }
   }

   public boolean class_(double var1, double var3, int var5, int var6, int var7, int var8, int var9) {
      if (!this.private_()) {
         return true;
      } else {
         boolean var10 = var1 < (double)var5 || var3 < (double)var6 || var1 >= (double)(var5 + var7) || var3 >= (double)(var6 + var8);
         boolean var11 = (double)(var5 - 147) < var1 && var1 < (double)var5 && (double)var6 < var3 && var3 < (double)(var6 + var8);
         return var10 && !var11 && !this.int_.B_();
      }
   }

   public void class_(Ml_1 var1, int var2, int var3, boolean var4, float var5) {
      this.throws_.class_(var1, this.private_, var2, var3, var4, var5);
   }

   public void class_(int var1, int var2, QY var3, boolean var4, rJI<?> var5) {
      this.private_ = var3;
      this.volatile_ = var1;
      this.final_ = var2;
      this.catch_ = var5;
      ((cb_3)var3.class_[57]).implements_[4] = var5;
      this.super_ = ((cb_3)var3.class_[57]).Z();
      this.synchronized_ = ((rhz_3)((cb_3)var3.class_[57]).implements_[1]).implements_();
      if (this.private_()) {
         this.class_(var4);
      }

      ((Qj_1)var3.class_[23]).class_(true);
   }

   @Override
   public void class_(Iterator<rkg_3> var1, int var2, int var3, int var4, int var5) {
      rkg_3 var6 = (rkg_3)var1.next();
      if (!var6.protected_()) {
         rJY var7 = this.catch_.throws_.get(var2);
         this.throws_.class_(var6, var7.throws_, var7.case_);
      }
   }

   public void class_(rkw_3<?> var1, List<rJY> var2) {
      rdn_3 var3 = var1.byte_();
      this.throws_.class_(var1);
      this.throws_.class_(rkg_3.class_(var3), ((rJY)var2.get(0)).throws_, ((rJY)var2.get(0)).case_);
      this.class_(this.catch_.byte_(), this.catch_.protected_(), this.catch_.break_(), var1, var1.class_().iterator(), 0);
   }

   @Override
   public void class_(Ml_1 var1, int var2, int var3, float var4) {
      if (this.private_()) {
         RenderSystem.pushMatrix();
         RenderSystem.translatef(0.0F, 0.0F, 100.0F);
         this.private_.A().class_(class_);
         RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
         int var5 = (this.volatile_ - 147) / 2 - this.native_;
         int var6 = (this.final_ - 166) / 2;
         this.break_(var1, var5, var6, 1, 1, 147, 166);
         if (!this.new_.aO_() && this.new_.private_().isEmpty()) {
            break_(var1, (cm_3)this.private_.class_[15], implements_, var5 + 25, var6 + 14, -1);
         } else {
            this.new_.class_(var1, var2, var3, var4);
         }

         for (mX_2 var8 : this.package_) {
            var8.class_(var1, var2, var3, var4);
         }

         this.case_.class_(var1, var2, var3, var4);
         this.this_.class_(var1, var5, var6, var2, var3, var4);
         RenderSystem.popMatrix();
      }
   }

   public int class_(boolean var1, int var2, int var3) {
      int var4;
      if (this.private_() && !var1) {
         var4 = 177 + (var2 - var3 - 200) / 2;
      } else {
         var4 = (var2 - var3) / 2;
      }

      return var4;
   }

   protected void class_() {
      this.case_.class_(152, 41, 28, 18, class_);
   }

   public void class_(rJY var1) {
      if (var1 != null && var1.protected_ < this.catch_.throws_()) {
         this.throws_.class_();
         if (this.private_()) {
            this.native_();
         }
      }
   }

   @Override
   public boolean break_(int var1, int var2, int var3) {
      this.return_ = false;
      return cC_2.super.break_(var1, var2, var3);
   }

   @Override
   public boolean break_(double var1, double var3) {
      return false;
   }

   @Override
   public boolean break_(boolean var1) {
      return false;
   }

   @Override
   public boolean break_(double var1, double var3, int var5) {
      if (this.private_() && !((cb_3)this.private_.class_[57]).native_()) {
         if (this.this_.class_(var1, var3, var5, (this.volatile_ - 147) / 2 - this.native_, (this.final_ - 166) / 2, 147, 166)) {
            rkw_3 var9 = this.this_.class_();
            mG_2 var10 = this.this_.break_();
            if (var9 != null && var10 != null) {
               if (!var10.class_(var9) && this.throws_.byte_() == var9) {
                  return false;
               }

               this.throws_.class_();
               ((Ax_1)this.private_.class_[55]).class_(((rJr_1)((cb_3)this.private_.class_[57]).implements_[4]).case_, var9, vm_3.synchronized_());
               if (!this.int_()) {
                  this.byte_(false);
               }
            }

            return true;
         } else if (this.new_.break_(var1, var3, var5)) {
            return true;
         } else if (this.case_.break_(var1, var3, var5)) {
            boolean var8 = this.final_();
            this.case_.byte_(var8);
            this.extends_();
            this.protected_(false);
            return true;
         } else {
            for (mX_2 var7 : this.package_) {
               if (var7.break_(var1, var3, var5)) {
                  if (this.int_ != var7) {
                     this.int_.byte_(false);
                     this.int_ = var7;
                     this.int_.byte_(true);
                     this.protected_(true);
                  }

                  return true;
               }
            }

            return false;
         }
      } else {
         return false;
      }
   }

   protected rgP_2 throws_() {
      return finally_;
   }

   public void finally_() {
      this.protected_();
      if (this.private_()) {
         this.protected_(false);
      }
   }

   public void catch_() {
      this.byte_(!this.private_());
   }

   protected void extends_() {
      if (this.private_.void_() != null) {
         rke_3 var1 = this.catch_.implements_();
         boolean var2 = this.super_.break_().class_(var1);
         boolean var3 = this.super_.break_().break_(var1);
         this.private_.void_().class_(new rZH(var1, var2, var3));
      }
   }

   public void case_() {
      this.new_ = null;
      this.int_ = null;
      ((Qj_1)this.private_.class_[23]).class_(false);
   }

   public void implements_() {
      if (this.private_()) {
         if (this.synchronized_ != ((rhz_3)((cb_3)this.private_.class_[57]).implements_[1]).implements_()) {
            this.native_();
            this.synchronized_ = ((rhz_3)((cb_3)this.private_.class_[57]).implements_[1]).implements_();
         }

         this.new_.catch_();
      }
   }

   private void package_() {
      String var1 = this.new_.private_().toLowerCase(Locale.ROOT);
      this.class_(var1);
      if (!var1.equals(this.continue_)) {
         this.protected_(false);
         this.continue_ = var1;
      }
   }

   private void protected_(Ml_1 var1, int var2, int var3, int var4, int var5) {
      rdn_3 var6 = null;

      for (int var7 = 0; var7 < this.throws_.break_(); var7++) {
         mP_2 var8 = this.throws_.class_(var7);
         int var9 = var8.class_() + var2;
         int var10 = var8.break_() + var3;
         if (var4 >= var9 && var5 >= var10 && var4 < var9 + 16 && var5 < var10 + 16) {
            var6 = var8.byte_();
         }
      }

      if (var6 != null && (vm_3)this.private_.class_[73] != null) {
         ((vm_3)this.private_.class_[73]).class_(var1, ((vm_3)this.private_.class_[73]).class_(var6), var4, var5);
      }
   }

   private void protected_(boolean var1) {
      List var2 = this.super_.class_(this.int_.class_());
      var2.forEach(var1x -> var1x.class_(this.else_, this.catch_.byte_(), this.catch_.protected_(), this.super_));
      ArrayList var3 = Lists.newArrayList(var2);
      var3.removeIf(var0 -> !var0.class_());
      var3.removeIf(var0 -> !var0.byte_());
      String var4 = this.new_.private_();
      if (!var4.isEmpty()) {
         ObjectLinkedOpenHashSet var5 = new ObjectLinkedOpenHashSet(this.private_.class_(gJ_2.byte_).class_(var4.toLowerCase(Locale.ROOT)));
         var3.removeIf(var1x -> !var5.contains(var1x));
      }

      if (this.super_.class_(this.catch_)) {
         var3.removeIf(var0 -> !var0.break_());
      }

      this.this_.class_(var3, var1);
   }

   private void protected_() {
      int var1 = (this.volatile_ - 147) / 2 - this.native_ - 30;
      int var2 = (this.final_ - 166) / 2 + 3;
      byte var3 = 27;
      int var4 = 0;

      for (mX_2 var6 : this.package_) {
         gM_2 var7 = var6.class_();
         if (var7 == gM_2.CRAFTING_SEARCH || var7 == gM_2.FURNACE_SEARCH) {
            var6.new_ = true;
            var6.class_(var1, var2 + 27 * var4++);
         } else if (var6.class_(this.super_)) {
            var6.class_(var1, var2 + 27 * var4++);
            var6.class_(this.private_);
         }
      }
   }

   public boolean private_() {
      return this.super_.class_(this.catch_.implements_());
   }

   private boolean final_() {
      rke_3 var1 = this.catch_.implements_();
      boolean var2 = !this.super_.break_(var1);
      this.super_.break_(var1, var2);
      return var2;
   }

   private rgP_2 volatile_() {
      return this.case_.catch_() ? this.throws_() : extends_;
   }

   private void native_() {
      this.else_.class_();
      ((rhz_3)((cb_3)this.private_.class_[57]).implements_[1]).class_(this.else_);
      this.catch_.class_(this.else_);
      this.protected_(false);
   }
}
