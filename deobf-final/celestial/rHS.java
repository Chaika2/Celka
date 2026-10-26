package celestial;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import it.unimi.dsi.fastutil.objects.Object2IntMap.Entry;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public abstract class rHS extends rHD implements rHf_1, rXF, rXZ, rXv_1 {
   private static final int[] protected_ = new int[]{0};
   private static final int[] throws_ = new int[]{2, 1};
   private static final int[] case_ = new int[]{1};
   protected rqs_3<rdn_3> class_ = rqs_3.class_(3, rdn_3.break_);
   int catch_;
   int private_;
   int implements_;
   int finally_;
   protected final rpF_2 break_ = new rHs_1(this);
   private final Object2IntOpenHashMap<rqO_2> final_ = new Object2IntOpenHashMap();
   protected final rkj_3<? extends rkv_3> byte_;

   private void byte_(rkw_3<?> var1) {
      if (var1 != null && this.break_(var1)) {
         rdn_3 var2 = this.class_.get(0);
         rdn_3 var3 = var1.byte_();
         rdn_3 var4 = this.class_.get(2);
         if (var4.class_()) {
            this.class_.set(2, var3.implements_());
         } else if (var4.break_() == var3.break_()) {
            var4.case_(1);
         }

         if (!this.extends_.continue_) {
            this.class_(var1);
         }

         if (var2.break_() == xu_3.c.case_() && !this.class_.get(1).class_() && this.class_.get(1).break_() == rdy_3.hg) {
            this.class_.set(1, new rdn_3(rdy_3.hR));
         }

         var2.catch_(1);
      }
   }

   @Override
   public rkw_3<?> byte_() {
      return null;
   }

   @Override
   public boolean byte_(rhd_3 var1) {
      return this.extends_.class_(this.native_) != this
         ? false
         : var1.class_((double)this.native_.b_() + 0.5, (double)this.native_.c_() + 0.5, (double)this.native_.d_() + 0.5) <= 64.0;
   }

   protected rHS(ryW_2<?> var1, rkj_3<? extends rkv_3> var2) {
      super(var1);
      this.byte_ = var2;
   }

   @Override
   public void class_(rWr_1 var1) {
      for (rdn_3 var3 : this.class_) {
         var1.break_(var3);
      }
   }

   private static void class_(Map<rdb_3, Integer> var0, rlb_3<rdb_3> var1, int var2) {
      for (rdb_3 var4 : var1.class_()) {
         if (!break_(var4)) {
            var0.put(var4, var2);
         }
      }
   }

   @Override
   public boolean class_(int var1, rdn_3 var2, rpr_3 var3) {
      return this.a_(var1, var2);
   }

   @Override
   public int[] class_(rpr_3 var1) {
      if (var1 == rpr_3.DOWN) {
         return throws_;
      } else {
         return var1 == rpr_3.UP ? protected_ : case_;
      }
   }

   @Override
   public void class_(rkw_3<?> var1) {
      if (var1 != null) {
         rqO_2 var2 = var1.case_();
         this.final_.addTo(var2, 1);
      }
   }

   @Override
   public void class_(rhd_3 var1) {
   }

   public List<rkw_3<?>> class_(rYB var1, rjU_2 var2) {
      ArrayList var3 = Lists.newArrayList();
      ObjectIterator var4 = this.final_.object2IntEntrySet().iterator();

      while (var4.hasNext()) {
         Entry var5 = (Entry)var4.next();
         var1.implements_().class_((rqO_2)var5.getKey()).ifPresent(var4x -> {
            var3.add(var4x);
            class_(var1, var2, var5.getIntValue(), ((rkv_3)var4x).break_());
         });
      }

      return var3;
   }

   private static void class_(rYB var0, rjU_2 var1, int var2, float var3) {
      int var4 = rfU_2.protected_((float)var2 * var3);
      float var5 = rfU_2.private_((float)var2 * var3);
      if (var5 != 0.0F && Math.random() < (double)var5) {
         var4++;
      }

      while (var4 > 0) {
         int var6 = rsP_2.class_(var4);
         var4 -= var6;
         var0.a_(new rsP_2(var0, var1.break_, var1.byte_, var1.protected_, var6));
      }
   }

   @Override
   public rcd_3 class_(rcd_3 var1) {
      super.class_(var1);
      var1.class_("BurnTime", (short)this.catch_);
      var1.class_("CookTime", (short)this.implements_);
      var1.class_("CookTimeTotal", (short)this.finally_);
      rXC.class_(var1, this.class_);
      rcd_3 var2 = new rcd_3();
      this.final_.forEach((var1x, var2x) -> var2.break_(var1x.toString(), var2x));
      var1.class_("RecipesUsed", var2);
      return var1;
   }

   private static void class_(Map<rdb_3, Integer> var0, rpL_2 var1, int var2) {
      rdb_3 var3 = var1.case_();
      if (break_(var3)) {
         if (rqu_3.byte_) {
            throw (IllegalStateException)rqR_2.byte_(
               new IllegalStateException(
                  "A developer tried to explicitly make fire resistant item "
                     + var3.implements_((rdn_3)null).getString()
                     + " a furnace fuel. That will not work!"
               )
            );
         }
      } else {
         var0.put(var3, var2);
      }
   }

   protected int class_(rdn_3 var1) {
      if (var1.class_()) {
         return 0;
      } else {
         rdb_3 var2 = var1.break_();
         return protected_().getOrDefault(var2, 0);
      }
   }

   @Override
   public rdn_3 class_(int var1, int var2) {
      return rXC.class_(this.class_, var1, var2);
   }

   @Override
   public void class_(xc_3 var1, rcd_3 var2) {
      super.class_(var1, var2);
      this.class_ = rqs_3.class_(this.else_(), rdn_3.break_);
      rXC.break_(var2, this.class_);
      this.catch_ = var2.catch_("BurnTime");
      this.implements_ = var2.catch_("CookTime");
      this.finally_ = var2.catch_("CookTimeTotal");
      this.private_ = this.class_(this.class_.get(1));
      rcd_3 var3 = var2.int_("RecipesUsed");

      for (String var5 : var3.protected_()) {
         this.final_.put(new rqO_2(var5), var3.private_(var5));
      }
   }

   @Override
   public void break_(int var1, rdn_3 var2) {
      rdn_3 var3 = this.class_.get(var1);
      boolean var4 = !var2.class_() && var2.class_(var3) && rdn_3.class_(var2, var3);
      this.class_.set(var1, var2);
      if (var2.char_() > this.ab_()) {
         var2.throws_(this.ab_());
      }

      if (var1 == 0 && !var4) {
         this.finally_ = this.case_();
         this.implements_ = 0;
         this.break_();
      }
   }

   private static boolean break_(rdb_3 var0) {
      return rlc_3.transient_.class_(var0);
   }

   @Override
   public boolean break_(int var1, rdn_3 var2, rpr_3 var3) {
      if (var3 == rpr_3.DOWN && var1 == 1) {
         rdb_3 var4 = var2.break_();
         if (var4 != rdy_3.hR && var4 != rdy_3.hg) {
            return false;
         }
      }

      return true;
   }

   protected boolean break_(rkw_3<?> var1) {
      if (!this.class_.get(0).class_() && var1 != null) {
         rdn_3 var2 = var1.byte_();
         if (var2.class_()) {
            return false;
         } else {
            rdn_3 var3 = this.class_.get(2);
            if (var3.class_()) {
               return true;
            } else if (!var3.class_(var2)) {
               return false;
            } else {
               return var3.char_() < this.ab_() && var3.char_() < var3.byte_() ? true : var3.char_() < var2.byte_();
            }
         }
      } else {
         return false;
      }
   }

   public static boolean break_(rdn_3 var0) {
      return protected_().containsKey(var0.break_());
   }

   @Override
   public void throws_() {
      boolean var1 = this.catch_();
      boolean var2 = false;
      if (this.catch_()) {
         this.catch_--;
      }

      if (!this.extends_.continue_) {
         rdn_3 var3 = this.class_.get(1);
         if (this.catch_() || !var3.class_() && !this.class_.get(0).class_()) {
            rkw_3 var4 = this.extends_.implements_().class_(this.byte_, this, this.extends_).orElse(null);
            if (!this.catch_() && this.break_(var4)) {
               this.catch_ = this.class_(var3);
               this.private_ = this.catch_;
               if (this.catch_()) {
                  var2 = true;
                  if (!var3.class_()) {
                     rdb_3 var5 = var3.break_();
                     var3.catch_(1);
                     if (var3.class_()) {
                        rdb_3 var6 = var5.package_();
                        this.class_.set(1, var6 == null ? rdn_3.break_ : new rdn_3(var6));
                     }
                  }
               }
            }

            if (this.catch_() && this.break_(var4)) {
               this.implements_++;
               if (this.implements_ == this.finally_) {
                  this.implements_ = 0;
                  this.finally_ = this.case_();
                  this.byte_(var4);
                  var2 = true;
               }
            } else {
               this.implements_ = 0;
            }
         } else if (!this.catch_() && this.implements_ > 0) {
            this.implements_ = rfU_2.class_(this.implements_ - 2, 0, this.finally_);
         }

         if (var1 != this.catch_()) {
            var2 = true;
            this.extends_.class_(this.native_, this.extends_.byte_(this.native_).class_(JV.final_, Boolean.valueOf(this.catch_())), 3);
         }
      }

      if (var2) {
         this.break_();
      }
   }

   private boolean catch_() {
      return this.catch_ > 0;
   }

   @Override
   public rdn_3 extends_(int var1) {
      return this.class_.get(var1);
   }

   protected int case_() {
      return this.extends_.implements_().class_(this.byte_, this, this.extends_).map(rkv_3::throws_).orElse(200);
   }

   @Override
   public int else_() {
      return this.class_.size();
   }

   @Override
   public boolean return_() {
      for (rdn_3 var2 : this.class_) {
         if (!var2.class_()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public void public_() {
      this.class_.clear();
   }

   public void protected_(rhd_3 var1) {
      List var2 = this.class_((rYB)var1.throws_[7], var1.Ps());
      var1.break_(var2);
      this.final_.clear();
   }

   public static Map<rdb_3, Integer> protected_() {
      LinkedHashMap var0 = Maps.newLinkedHashMap();
      class_(var0, rdy_3.hY, 20000);
      class_(var0, xu_3.Ea, 16000);
      class_(var0, rdy_3.JZ, 2400);
      class_(var0, rdy_3.Oh, 1600);
      class_(var0, rdy_3.OX, 1600);
      class_(var0, rlc_3.new_, 300);
      class_(var0, rlc_3.byte_, 300);
      class_(var0, rlc_3.implements_, 300);
      class_(var0, rlc_3.finally_, 150);
      class_(var0, rlc_3.volatile_, 300);
      class_(var0, rlc_3.native_, 300);
      class_(var0, xu_3.PV, 300);
      class_(var0, xu_3.bN, 300);
      class_(var0, xu_3.bQ, 300);
      class_(var0, xu_3.bc, 300);
      class_(var0, xu_3.bm, 300);
      class_(var0, xu_3.bu, 300);
      class_(var0, xu_3.BU, 300);
      class_(var0, xu_3.bd, 300);
      class_(var0, xu_3.bx, 300);
      class_(var0, xu_3.bk, 300);
      class_(var0, xu_3.bz, 300);
      class_(var0, xu_3.bW, 300);
      class_(var0, xu_3.n, 300);
      class_(var0, xu_3.rj, 300);
      class_(var0, xu_3.Xs, 300);
      class_(var0, xu_3.Pj, 300);
      class_(var0, xu_3.re, 300);
      class_(var0, xu_3.sZ, 300);
      class_(var0, xu_3.PP, 300);
      class_(var0, xu_3.sA, 300);
      class_(var0, rlc_3.while_, 300);
      class_(var0, rdy_3.OM, 300);
      class_(var0, rdy_3.Xd, 300);
      class_(var0, xu_3.PJ, 300);
      class_(var0, rlc_3.r, 200);
      class_(var0, rdy_3.OQ, 200);
      class_(var0, rdy_3.Oz, 200);
      class_(var0, rdy_3.Ou, 200);
      class_(var0, rdy_3.Oc, 200);
      class_(var0, rdy_3.ON, 200);
      class_(var0, rlc_3.private_, 200);
      class_(var0, rlc_3.double_, 1200);
      class_(var0, rlc_3.break_, 100);
      class_(var0, rlc_3.throws_, 100);
      class_(var0, rdy_3.OD, 100);
      class_(var0, rlc_3.package_, 100);
      class_(var0, rdy_3.OU, 100);
      class_(var0, rlc_3.catch_, 67);
      class_(var0, xu_3.Oh, 4001);
      class_(var0, rdy_3.kU, 300);
      class_(var0, xu_3.hs, 50);
      class_(var0, xu_3.i, 100);
      class_(var0, xu_3.hU, 400);
      class_(var0, xu_3.he, 300);
      class_(var0, xu_3.ha, 300);
      class_(var0, xu_3.XP, 300);
      class_(var0, xu_3.XB, 300);
      class_(var0, xu_3.XE, 300);
      class_(var0, xu_3.JG, 300);
      return var0;
   }

   @Override
   public rdn_3 native_(int var1) {
      return rXC.class_(this.class_, var1);
   }

   @Override
   public boolean a_(int var1, rdn_3 var2) {
      if (var1 == 2) {
         return false;
      } else if (var1 != 1) {
         return true;
      } else {
         rdn_3 var3 = this.class_.get(1);
         return break_(var2) || var2.break_() == rdy_3.hg && var3.break_() != rdy_3.hg;
      }
   }
}
