package celestial;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;

public abstract class rJr_1 {
   private final rqs_3<rdn_3> class_ = rqs_3.class_();
   public final List<rJY> throws_ = Lists.newArrayList();
   private final List<rpj_3> break_ = Lists.newArrayList();
   private final rJP<?> byte_;
   public final int case_;
   private short protected_;
   private int catch_ = -1;
   private int private_;
   private final Set<rJY> implements_ = Sets.newHashSet();
   private final List<rJu_1> finally_ = Lists.newArrayList();
   private final Set<rhd_3> extends_ = Sets.newHashSet();

   public static int byte_(int var0, int var1) {
      return var0 & 3 | (var1 & 3) << 2;
   }

   public boolean byte_(rhd_3 var1) {
      return !this.extends_.contains(var1);
   }

   public static int byte_(int var0) {
      return var0 & 3;
   }

   protected rJr_1(rJP<?> var1, int var2) {
      this.byte_ = var1;
      this.case_ = var2;
   }

   public rJY class_(List<rdn_3> var1, int var2) {
      rJY var3 = this.class_(var2);
      var3.break_((rdn_3)var1.get(var2));
      return var3;
   }

   public void class_(int var1, int var2) {
      this.break_.get(var1).class_(var2);
   }

   public short class_(rhz_3 var1) {
      this.protected_++;
      return this.protected_;
   }

   public abstract boolean class_(rhd_3 var1);

   protected void class_(rhd_3 var1, rYB var2, rXu_1 var3) {
      if (!var1.BM() || var1 instanceof rhN_2 && ((rhN_2)var1).int_()) {
         for (int var5 = 0; var5 < var3.else_(); var5++) {
            var1.class_(var3.native_(var5), false);
         }
      } else {
         for (int var4 = 0; var4 < var3.else_(); var4++) {
            ((rhz_3)var1.implements_[1]).class_(var2, var3.native_(var4));
         }
      }
   }

   public void class_(rXu_1 var1) {
      this.native_();
   }

   public void class_(List<rdn_3> var1) {
      for (int var2 = 0; var2 < var1.size(); var2++) {
         this.class_(var1, var2);
      }

      for (rJu_1 var3 : this.finally_) {
         var3.byte_(var1);
      }

      rrAT.class_(this, this.throws_, this.case_);
   }

   public void class_(int var1, rdn_3 var2) {
      rJY var3 = this.class_(var1);
      rdn_3 var4 = var3.class_();
      var3.break_(var2);
      rrAq_1.break_(this, var3, var4);
   }

   public static boolean class_(rJY var0, rdn_3 var1, boolean var2) {
      boolean var3 = var0 == null || !var0.break_();
      return !var3 && var1.class_(var0.class_()) && rdn_3.class_(var0.class_(), var1)
         ? var0.class_().char_() + (var2 ? 0 : var1.char_()) <= var1.byte_()
         : var3;
   }

   public static void class_(Set<rJY> var0, int var1, rdn_3 var2, int var3) {
      switch (var1) {
         case 0:
            var2.throws_(rfU_2.protected_((float)var2.char_() / (float)var0.size()));
            break;
         case 1:
            var2.throws_(1);
            break;
         case 2:
            var2.throws_(var2.break_().implements_());
      }

      var2.case_(var3);
   }

   public boolean class_(rJY var1) {
      return true;
   }

   public static int class_(ryO_2 var0) {
      return var0 instanceof rXu_1 ? break_((rXu_1)var0) : 0;
   }

   protected boolean class_(rdn_3 var1, int var2, int var3, boolean var4) {
      boolean var5 = false;
      int var6 = var2;
      if (var4) {
         var6 = var3 - 1;
      }

      if (var1.protected_()) {
         while (!var1.class_() && (var4 ? var6 >= var2 : var6 < var3)) {
            rJY var7 = this.throws_.get(var6);
            rdn_3 var8 = var7.class_();
            if (!var8.class_() && class_(var1, var8)) {
               int var9 = var8.char_() + var1.char_();
               if (var9 <= var1.byte_()) {
                  var1.throws_(0);
                  var8.throws_(var9);
                  var7.byte_();
                  var5 = true;
               } else if (var8.char_() < var1.byte_()) {
                  var1.catch_(var1.byte_() - var8.char_());
                  var8.throws_(var1.byte_());
                  var7.byte_();
                  var5 = true;
               }
            }

            if (var4) {
               var6--;
            } else {
               var6++;
            }
         }
      }

      if (!var1.class_()) {
         if (var4) {
            var6 = var3 - 1;
         } else {
            var6 = var2;
         }

         while (var4 ? var6 >= var2 : var6 < var3) {
            rJY var11 = this.throws_.get(var6);
            rdn_3 var12 = var11.class_();
            if (var12.class_() && var11.class_(var1)) {
               if (var1.char_() > var11.protected_()) {
                  var11.break_(var1.class_(var11.protected_()));
               } else {
                  var11.break_(var1.class_(var1.char_()));
               }

               var11.byte_();
               var5 = true;
               break;
            }

            if (var4) {
               var6--;
            } else {
               var6++;
            }
         }
      }

      return var5;
   }

   public List<rJY> class_(Predicate<rJY> var1) {
      return this.throws_;
   }

   public static boolean class_(int var0, rhd_3 var1) {
      if (var0 == 0) {
         return true;
      } else {
         return var0 == 1 ? true : var0 == 2 && ((rhx_3)var1.implements_[18]).protected_;
      }
   }

   public rJY class_(int var1) {
      return this.throws_.get(var1);
   }

   protected void class_(rpF_2 var1) {
      for (int var2 = 0; var2 < var1.class_(); var2++) {
         this.class_(rpj_3.class_(var1, var2));
      }
   }

   protected static void class_(rXu_1 var0, int var1) {
      int var2 = var0.else_();
      if (var2 < var1) {
         throw new IllegalArgumentException("Container size " + var2 + " is smaller than expected " + var1);
      }
   }

   protected static void class_(rpF_2 var0, int var1) {
      int var2 = var0.class_();
      if (var2 < var1) {
         throw new IllegalArgumentException("Container data count " + var2 + " is smaller than expected " + var1);
      }
   }

   protected rpj_3 class_(rpj_3 var1) {
      this.break_.add(var1);
      return var1;
   }

   public void class_(rJu_1 var1) {
      if (!this.finally_.contains(var1)) {
         this.finally_.add(var1);
         var1.class_(this, this.extends_());
         this.native_();
      }
   }

   protected static boolean class_(rpq_3 var0, rhd_3 var1, xd_3 var2) {
      return var0.class_(
         (var2x, var3) -> !var2x.byte_(var3).class_(var2)
               ? false
               : var1.class_((double)var3.b_() + 0.5, (double)var3.c_() + 0.5, (double)var3.d_() + 0.5) <= 64.0,
         true
      );
   }

   public boolean class_(rdn_3 var1, rJY var2) {
      return true;
   }

   public static boolean class_(rdn_3 var0, rdn_3 var1) {
      return var0.break_() == var1.break_() && rdn_3.class_(var0, var1);
   }

   public rdn_3 class_(rhd_3 var1, int var2) {
      rJY var3 = this.throws_.get(var2);
      return var3 != null ? var3.class_() : rdn_3.break_;
   }

   public rdn_3 class_(int var1, int var2, rXa_1 var3, rhd_3 var4) {
      try {
         return this.break_(var1, var2, var3, var4);
      } catch (Exception var8) {
         KY var6 = KY.class_(var8, "Container click");
         Ko_1 var7 = var6.class_("Click info");
         var7.class_("Menu Type", () -> this.byte_ != null ? rVL.G.break_(this.byte_).toString() : "<no type>");
         var7.class_("Menu Class", () -> this.getClass().getCanonicalName());
         var7.class_("Slot Count", this.throws_.size());
         var7.class_("Slot", var1);
         var7.class_("Button", var2);
         var7.class_("Type", var3);
         throw new KU(var6);
      }
   }

   public static int break_(rXu_1 var0) {
      if (var0 == null) {
         return 0;
      } else {
         int var1 = 0;
         float var2 = 0.0F;

         for (int var3 = 0; var3 < var0.else_(); var3++) {
            rdn_3 var4 = var0.extends_(var3);
            if (!var4.class_()) {
               var2 += (float)var4.char_() / (float)Math.min(var0.ab_(), var4.byte_());
               var1++;
            }
         }

         var2 /= (float)var0.else_();
         return rfU_2.protected_(var2 * 14.0F) + (var1 > 0 ? 1 : 0);
      }
   }

   protected rJY break_(rJY var1) {
      var1.protected_ = this.throws_.size();
      this.throws_.add(var1);
      this.class_.add(rdn_3.break_);
      return var1;
   }

   public void break_(rhd_3 var1) {
      rhz_3 var2 = (rhz_3)var1.implements_[1];
      if (!var2.finally_().class_()) {
         var1.class_(var2.finally_(), false);
         var2.private_(rdn_3.break_);
      }
   }

   public boolean break_(rhd_3 var1, int var2) {
      return false;
   }

   public void break_(rhd_3 var1, boolean var2) {
      if (var2) {
         this.extends_.remove(var1);
      } else {
         this.extends_.add(var1);
      }
   }

   public static int break_(int var0) {
      return var0 >> 2 & 3;
   }

   private rdn_3 break_(int var1, int var2, rXa_1 var3, rhd_3 var4) {
      rdn_3 var5 = rdn_3.break_;
      rhz_3 var6 = (rhz_3)var4.implements_[1];
      if (var3 == rXa_1.QUICK_CRAFT) {
         int var22 = this.private_;
         this.private_ = byte_(var2);
         if ((var22 != 1 || this.private_ != 2) && var22 != this.private_) {
            this.volatile_();
         } else if (var6.finally_().class_()) {
            this.volatile_();
         } else if (this.private_ == 0) {
            this.catch_ = break_(var2);
            if (class_(this.catch_, var4)) {
               this.private_ = 1;
               this.implements_.clear();
            } else {
               this.volatile_();
            }
         } else if (this.private_ == 1) {
            rJY var29 = this.throws_.get(var1);
            rdn_3 var33 = var6.finally_();
            if (var29 != null
               && class_(var29, var33, true)
               && var29.class_(var33)
               && (this.catch_ == 2 || var33.char_() > this.implements_.size())
               && this.class_(var29)) {
               this.implements_.add(var29);
            }
         } else if (this.private_ == 2) {
            if (!this.implements_.isEmpty()) {
               rdn_3 var30 = var6.finally_().implements_();
               int var34 = var6.finally_().char_();

               for (rJY var42 : this.implements_) {
                  rdn_3 var43 = var6.finally_();
                  if (var42 != null
                     && class_(var42, var43, true)
                     && var42.class_(var43)
                     && (this.catch_ == 2 || var43.char_() >= this.implements_.size())
                     && this.class_(var42)) {
                     rdn_3 var44 = var30.implements_();
                     int var45 = var42.break_() ? var42.class_().char_() : 0;
                     class_(this.implements_, this.catch_, var44, var45);
                     int var46 = Math.min(var44.byte_(), var42.byte_(var44));
                     if (var44.char_() > var46) {
                        var44.throws_(var46);
                     }

                     var34 -= var44.char_() - var45;
                     var42.break_(var44);
                  }
               }

               var30.throws_(var34);
               var6.private_(var30);
            }

            this.volatile_();
         } else {
            this.volatile_();
         }
      } else if (this.private_ != 0) {
         this.volatile_();
      } else if ((var3 == rXa_1.PICKUP || var3 == rXa_1.QUICK_MOVE) && (var2 == 0 || var2 == 1)) {
         if (var1 == -999) {
            if (!var6.finally_().class_()) {
               if (var2 == 0) {
                  var4.class_(var6.finally_(), true);
                  var6.private_(rdn_3.break_);
               }

               if (var2 == 1) {
                  var4.class_(var6.finally_().class_(1), true);
               }
            }
         } else if (var3 == rXa_1.QUICK_MOVE) {
            if (var1 < 0) {
               return rdn_3.break_;
            }

            rJY var20 = this.throws_.get(var1);
            if (var20 == null || !var20.class_(var4)) {
               return rdn_3.break_;
            }

            for (rdn_3 var26 = this.class_(var4, var1); !var26.class_() && rdn_3.byte_(var20.class_(), var26); var26 = this.class_(var4, var1)) {
               var5 = var26.implements_();
            }
         } else {
            if (var1 < 0) {
               return rdn_3.break_;
            }

            rJY var21 = this.throws_.get(var1);
            if (var21 != null) {
               rdn_3 var27 = var21.class_();
               rdn_3 var32 = var6.finally_();
               if (!var27.class_()) {
                  var5 = var27.implements_();
               }

               if (var27.class_()) {
                  if (!var32.class_() && var21.class_(var32)) {
                     int var37 = var2 == 0 ? var32.char_() : 1;
                     if (var37 > var21.byte_(var32)) {
                        var37 = var21.byte_(var32);
                     }

                     var21.break_(var32.class_(var37));
                  }
               } else if (var21.class_(var4)) {
                  if (var32.class_()) {
                     if (var27.class_()) {
                        var21.break_(rdn_3.break_);
                        var6.private_(rdn_3.break_);
                     } else {
                        int var38 = var2 == 0 ? var27.char_() : (var27.char_() + 1) / 2;
                        var6.private_(var21.class_(var38));
                        if (var27.class_()) {
                           var21.break_(rdn_3.break_);
                        }

                        var21.class_(var4, var6.finally_());
                     }
                  } else if (var21.class_(var32)) {
                     if (class_(var27, var32)) {
                        int var39 = var2 == 0 ? var32.char_() : 1;
                        if (var39 > var21.byte_(var32) - var27.char_()) {
                           var39 = var21.byte_(var32) - var27.char_();
                        }

                        if (var39 > var32.byte_() - var27.char_()) {
                           var39 = var32.byte_() - var27.char_();
                        }

                        var32.catch_(var39);
                        var27.case_(var39);
                     } else if (var32.char_() <= var21.byte_(var32)) {
                        var21.break_(var32);
                        var6.private_(var27);
                     }
                  } else if (var32.byte_() > 1 && class_(var27, var32) && !var27.class_()) {
                     int var40 = var27.char_();
                     if (var40 + var32.char_() <= var32.byte_()) {
                        var32.case_(var40);
                        var27 = var21.class_(var40);
                        if (var27.class_()) {
                           var21.break_(rdn_3.break_);
                        }

                        var21.class_(var4, var6.finally_());
                     }
                  }
               }

               var21.byte_();
            }
         }
      } else if (var3 == rXa_1.SWAP) {
         rJY var7 = this.throws_.get(var1);
         rdn_3 var8 = var6.extends_(var2);
         rdn_3 var9 = var7.class_();
         if (!var8.class_() || !var9.class_()) {
            if (var8.class_()) {
               if (var7.class_(var4)) {
                  var6.break_(var2, var9);
                  var7.break_(var9.char_());
                  var7.break_(rdn_3.break_);
                  var7.class_(var4, var9);
               }
            } else if (var9.class_()) {
               if (var7.class_(var8)) {
                  int var10 = var7.byte_(var8);
                  if (var8.char_() > var10) {
                     var7.break_(var8.class_(var10));
                  } else {
                     var7.break_(var8);
                     var6.break_(var2, rdn_3.break_);
                  }
               }
            } else if (var7.class_(var4) && var7.class_(var8)) {
               int var35 = var7.byte_(var8);
               if (var8.char_() > var35) {
                  var7.break_(var8.class_(var35));
                  var7.class_(var4, var9);
                  if (!var6.throws_(var9)) {
                     var4.class_(var9, true);
                  }
               } else {
                  var7.break_(var8);
                  var6.break_(var2, var9);
                  var7.class_(var4, var9);
               }
            }
         }

         var5 = var9.implements_();
      } else if (var3 == rXa_1.CLONE && ((rhx_3)var4.implements_[18]).protected_ && var6.finally_().class_() && var1 >= 0) {
         rJY var19 = this.throws_.get(var1);
         if (var19 != null && var19.break_()) {
            rdn_3 var25 = var19.class_().implements_();
            var25.throws_(var25.byte_());
            var6.private_(var25);
         }
      } else if (var3 == rXa_1.THROW && var6.finally_().class_() && var1 >= 0) {
         rJY var18 = this.throws_.get(var1);
         if (var18 != null && var18.break_() && var18.class_(var4)) {
            rdn_3 var24 = var18.class_(var2 == 0 ? 1 : var18.class_().char_());
            var18.class_(var4, var24);
            var4.class_(var24, true);
            var5 = var24.implements_();
         }
      } else if (var3 == rXa_1.PICKUP_ALL && var1 >= 0) {
         rJY var17 = this.throws_.get(var1);
         rdn_3 var23 = var6.finally_();
         if (!var23.class_() && (var17 == null || !var17.break_() || !var17.class_(var4))) {
            int var31 = var2 == 0 ? 0 : this.throws_.size() - 1;
            int var36 = var2 == 0 ? 1 : -1;

            for (int var11 = 0; var11 < 2; var11++) {
               for (int var12 = var31; var12 >= 0 && var12 < this.throws_.size() && var23.char_() < var23.byte_(); var12 += var36) {
                  rJY var13 = this.throws_.get(var12);
                  if (var13.break_() && class_(var13, var23, true) && var13.class_(var4) && this.class_(var23, var13)) {
                     rdn_3 var14 = var13.class_();
                     if (var11 != 0 || var14.char_() != var14.byte_()) {
                        int var15 = Math.min(var23.byte_() - var23.char_(), var14.char_());
                        rdn_3 var16 = var13.class_(var15);
                        var23.case_(var15);
                        if (var16.class_()) {
                           var13.break_(rdn_3.break_);
                        }

                        var13.class_(var4, var16);
                     }
                  }
               }
            }
         }

         this.native_();
      }

      return var5;
   }

   public void break_(rJu_1 var1) {
      this.finally_.remove(var1);
   }

   public rJP<?> finally_() {
      if (this.byte_ == null) {
         throw new UnsupportedOperationException("Unable to construct this menu by type");
      } else {
         return this.byte_;
      }
   }

   public rqs_3<rdn_3> extends_() {
      rqs_3 var1 = rqs_3.class_();

      for (int var2 = 0; var2 < this.throws_.size(); var2++) {
         var1.add(this.throws_.get(var2).class_());
      }

      return var1;
   }

   protected void volatile_() {
      this.private_ = 0;
      this.implements_.clear();
   }

   public void native_() {
      for (int var1 = 0; var1 < this.throws_.size(); var1++) {
         rdn_3 var2 = this.throws_.get(var1).class_();
         rdn_3 var3 = this.class_.get(var1);
         if (!rdn_3.break_(var3, var2)) {
            rdn_3 var4 = var2.implements_();
            this.class_.set(var1, var4);

            for (rJu_1 var6 : this.finally_) {
               var6.class_(this, var1, var4);
            }
         }
      }

      for (int var7 = 0; var7 < this.break_.size(); var7++) {
         rpj_3 var8 = this.break_.get(var7);
         if (var8.byte_()) {
            for (rJu_1 var10 : this.finally_) {
               var10.class_(this, var7, var8.break_());
            }
         }
      }
   }
}
