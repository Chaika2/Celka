package celestial;

import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Pair;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.Random;

public class rrPl_1 {
   private final List<rrPT> class_ = Lists.newArrayList();
   private final List<rrPq_1> break_ = Lists.newArrayList();
   private rfH_2 byte_ = rfH_2.protected_;
   private String protected_ = "?";

   public rfH_2 class_(rfH_2 var1, rpa_3 var2, rqd_3 var3) {
      return class_(var1, var2, var3, this.class_().b_(), this.class_().d_());
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public static rfH_2 class_(rfH_2 var0, rpa_3 var1, rqd_3 var2, int var3, int var4) {
      var3--;
      var4--;
      int var5 = var1 == rpa_3.FRONT_BACK ? var3 : 0;
      int var6 = var1 == rpa_3.LEFT_RIGHT ? var4 : 0;
      rfH_2 var7 = var0;
      switch (var2) {
         case COUNTERCLOCKWISE_90:
            var7 = var0.break_(var6, 0, var3 - var5);
            break;
         case CLOCKWISE_90:
            var7 = var0.break_(var4 - var6, 0, var5);
            break;
         case CLOCKWISE_180:
            var7 = var0.break_(var3 - var5, 0, var4 - var6);
            break;
         case NONE:
            var7 = var0.break_(var5, 0, var6);
      }

      return var7;
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public rfi_3 class_(rfH_2 var1, rqd_3 var2, rfH_2 var3, rpa_3 var4) {
      rfH_2 var5 = this.class_(var2);
      int var6 = var3.b_();
      int var7 = var3.d_();
      int var8 = var5.b_() - 1;
      int var9 = var5.c_() - 1;
      int var10 = var5.d_() - 1;
      rfi_3 var11 = new rfi_3(0, 0, 0, 0, 0, 0);
      switch (var2) {
         case COUNTERCLOCKWISE_90:
            var11 = new rfi_3(var6 - var7, 0, var6 + var7 - var10, var6 - var7 + var8, var9, var6 + var7);
            break;
         case CLOCKWISE_90:
            var11 = new rfi_3(var6 + var7 - var8, 0, var7 - var6, var6 + var7, var9, var7 - var6 + var10);
            break;
         case CLOCKWISE_180:
            var11 = new rfi_3(var6 + var6 - var8, 0, var7 + var7 - var10, var6 + var6, var9, var7 + var7);
            break;
         case NONE:
            var11 = new rfi_3(0, 0, 0, var8, var9, var10);
      }

      switch (var4) {
         case LEFT_RIGHT:
            this.class_(var2, var10, var8, var11, rpr_3.NORTH, rpr_3.SOUTH);
            break;
         case FRONT_BACK:
            this.class_(var2, var8, var10, var11, rpr_3.WEST, rpr_3.EAST);
         case NONE:
      }

      var11.class_(var1.b_(), var1.c_(), var1.d_());
      return var11;
   }

   private void class_(rqd_3 var1, int var2, int var3, rfi_3 var4, rpr_3 var5, rpr_3 var6) {
      rfH_2 var7 = rfH_2.protected_;
      if (var1 == rqd_3.CLOCKWISE_90 || var1 == rqd_3.COUNTERCLOCKWISE_90) {
         var7 = var7.class_(var1.class_(var5), var3);
      } else if (var1 == rqd_3.CLOCKWISE_180) {
         var7 = var7.class_(var6, var2);
      } else {
         var7 = var7.class_(var5, var2);
      }

      var4.class_(var7.b_(), 0, var7.d_());
   }

   public rcd_3 class_(rcd_3 var1) {
      if (this.class_.isEmpty()) {
         var1.class_("blocks", new rcy_3());
         var1.class_("palette", new rcy_3());
      } else {
         ArrayList var2 = Lists.newArrayList();
         rrPy_1 var3 = new rrPy_1();
         var2.add(var3);

         for (int var4 = 1; var4 < this.class_.size(); var4++) {
            var2.add(new rrPy_1());
         }

         rcy_3 var14 = new rcy_3();
         List var5 = this.class_.get(0).class_();

         for (int var6 = 0; var6 < var5.size(); var6++) {
            rrPp_1 var7 = (rrPp_1)var5.get(var6);
            rcd_3 var8 = new rcd_3();
            var8.class_("pos", this.class_(var7.class_.b_(), var7.class_.c_(), var7.class_.d_()));
            int var9 = var3.class_(var7.break_);
            var8.break_("state", var9);
            if (var7.byte_ != null) {
               var8.class_("nbt", var7.byte_);
            }

            var14.add(var8);

            for (int var10 = 1; var10 < this.class_.size(); var10++) {
               rrPy_1 var11 = (rrPy_1)var2.get(var10);
               var11.class_(this.class_.get(var10).class_().get(var6).break_, var9);
            }
         }

         var1.class_("blocks", var14);
         if (var2.size() == 1) {
            rcy_3 var17 = new rcy_3();

            for (xc_3 var21 : var3) {
               var17.add(rco_3.class_(var21));
            }

            var1.class_("palette", var17);
         } else {
            rcy_3 var18 = new rcy_3();

            for (rrPy_1 var22 : var2) {
               rcy_3 var23 = new rcy_3();

               for (xc_3 var25 : var22) {
                  var23.add(rco_3.class_(var25));
               }

               var18.add(var23);
            }

            var1.class_("palettes", var18);
         }
      }

      rcy_3 var12 = new rcy_3();

      for (rrPq_1 var15 : this.break_) {
         rcd_3 var16 = new rcd_3();
         var16.class_("pos", this.class_(var15.class_.break_, var15.class_.byte_, var15.class_.protected_));
         var16.class_("blockPos", this.class_(var15.break_.b_(), var15.break_.c_(), var15.break_.d_()));
         if (var15.byte_ != null) {
            var16.class_("nbt", var15.byte_);
         }

         var12.add(var16);
      }

      var1.class_("entities", var12);
      var1.class_("size", this.class_(this.byte_.b_(), this.byte_.c_(), this.byte_.d_()));
      var1.break_("DataVersion", rqu_3.class_().getWorldVersion());
      return var1;
   }

   private static Optional<an_3> class_(rRf_1 var0, rcd_3 var1) {
      try {
         return aI_2.class_(var1, var0.byte_());
      } catch (Exception var3) {
         return Optional.empty();
      }
   }

   public rfH_2 class_() {
      return this.byte_;
   }

   public static rfH_2 class_(rfH_2 var0, rpa_3 var1, rqd_3 var2, rfH_2 var3) {
      int var4 = var0.b_();
      int var5 = var0.c_();
      int var6 = var0.d_();
      boolean var7 = true;
      switch (var1) {
         case LEFT_RIGHT:
            var6 = -var6;
            break;
         case FRONT_BACK:
            var4 = -var4;
            break;
         default:
            var7 = false;
      }

      int var8 = var3.b_();
      int var9 = var3.d_();
      switch (var2) {
         case COUNTERCLOCKWISE_90:
            return new rfH_2(var8 - var9 + var6, var5, var8 + var9 - var4);
         case CLOCKWISE_90:
            return new rfH_2(var8 + var9 - var6, var5, var9 - var8 + var4);
         case CLOCKWISE_180:
            return new rfH_2(var8 + var8 - var4, var5, var9 + var9 - var6);
         default:
            return var7 ? new rfH_2(var4, var5, var6) : var0;
      }
   }

   public static rjU_2 class_(rjU_2 var0, rpa_3 var1, rqd_3 var2, rfH_2 var3) {
      double var4 = var0.break_;
      double var6 = var0.byte_;
      double var8 = var0.protected_;
      boolean var10 = true;
      switch (var1) {
         case LEFT_RIGHT:
            var8 = 1.0 - var8;
            break;
         case FRONT_BACK:
            var4 = 1.0 - var4;
            break;
         default:
            var10 = false;
      }

      int var11 = var3.b_();
      int var12 = var3.d_();
      switch (var2) {
         case COUNTERCLOCKWISE_90:
            return new rjU_2((double)(var11 - var12) + var8, var6, (double)(var11 + var12 + 1) - var4);
         case CLOCKWISE_90:
            return new rjU_2((double)(var11 + var12 + 1) - var8, var6, (double)(var12 - var11) + var4);
         case CLOCKWISE_180:
            return new rjU_2((double)(var11 + var11 + 1) - var4, var6, (double)(var12 + var12 + 1) - var8);
         default:
            return var10 ? new rjU_2(var4, var6, var8) : var0;
      }
   }

   public rfH_2 class_(rqd_3 var1) {
      switch (var1) {
         case COUNTERCLOCKWISE_90:
         case CLOCKWISE_90:
            return new rfH_2(this.byte_.d_(), this.byte_.c_(), this.byte_.b_());
         default:
            return this.byte_;
      }
   }

   private void class_(rcy_3 var1, rcy_3 var2) {
      rrPy_1 var3 = new rrPy_1();

      for (int var4 = 0; var4 < var1.size(); var4++) {
         var3.class_(rco_3.byte_(var1.class_(var4)), var4);
      }

      ArrayList var14 = Lists.newArrayList();
      ArrayList var5 = Lists.newArrayList();
      ArrayList var6 = Lists.newArrayList();

      for (int var7 = 0; var7 < var2.size(); var7++) {
         rcd_3 var8 = var2.class_(var7);
         rcy_3 var9 = var8.protected_("pos", 3);
         rfH_2 var10 = new rfH_2(var9.throws_(0), var9.throws_(1), var9.throws_(2));
         xc_3 var11 = var3.class_(var8.private_("state"));
         rcd_3 var12;
         if (var8.throws_("nbt")) {
            var12 = var8.int_("nbt");
         } else {
            var12 = null;
         }

         rrPp_1 var13 = new rrPp_1(var10, var11, var12);
         class_(var13, var14, var5, var6);
      }

      List var15 = class_(var14, var5, var6);
      this.class_.add(new rrPT(var15));
   }

   private rcy_3 class_(int... var1) {
      rcy_3 var2 = new rcy_3();

      for (int var6 : var1) {
         var2.add(rcn_3.class_(var6));
      }

      return var2;
   }

   private rcy_3 class_(double... var1) {
      rcy_3 var2 = new rcy_3();

      for (double var6 : var1) {
         var2.add(rcz_3.class_(var6));
      }

      return var2;
   }

   public List<rrPp_1> class_(rfH_2 var1, rrPN var2, xd_3 var3) {
      return this.class_(var1, var2, var3, true);
   }

   public List<rrPp_1> class_(rfH_2 var1, rrPN var2, xd_3 var3, boolean var4) {
      ArrayList var5 = Lists.newArrayList();
      rfi_3 var6 = var2.catch_();
      if (this.class_.isEmpty()) {
         return Collections.emptyList();
      } else {
         for (rrPp_1 var8 : var2.class_(this.class_, var1).class_(var3)) {
            rfH_2 var9 = var4 ? class_(var2, var8.class_).break_(var1) : var8.class_;
            if (var6 == null || var6.break_(var9)) {
               var5.add(new rrPp_1(var9, var8.break_.class_(var2.protected_()), var8.byte_));
            }
         }

         return var5;
      }
   }

   public void class_(String var1) {
      this.protected_ = var1;
   }

   public rfH_2 class_(rrPN var1, rfH_2 var2, rrPN var3, rfH_2 var4) {
      rfH_2 var5 = class_(var1, var2);
      rfH_2 var6 = class_(var3, var4);
      return var5.byte_(var6);
   }

   public void class_(rYB var1, rfH_2 var2, rfH_2 var3, boolean var4, xd_3 var5) {
      if (var3.b_() >= 1 && var3.c_() >= 1 && var3.d_() >= 1) {
         rfH_2 var6 = var2.break_(var3).break_(-1, -1, -1);
         ArrayList var7 = Lists.newArrayList();
         ArrayList var8 = Lists.newArrayList();
         ArrayList var9 = Lists.newArrayList();
         rfH_2 var10 = new rfH_2(Math.min(var2.b_(), var6.b_()), Math.min(var2.c_(), var6.c_()), Math.min(var2.d_(), var6.d_()));
         rfH_2 var11 = new rfH_2(Math.max(var2.b_(), var6.b_()), Math.max(var2.c_(), var6.c_()), Math.max(var2.d_(), var6.d_()));
         this.byte_ = var3;

         for (rfH_2 var13 : rfH_2.class_(var10, var11)) {
            rfH_2 var14 = var13.byte_(var10);
            xc_3 var15 = var1.byte_(var13);
            if (var5 == null || var5 != var15.break_()) {
               ryO_2 var16 = var1.class_(var13);
               rrPp_1 var17;
               if (var16 != null) {
                  rcd_3 var18 = var16.class_(new rcd_3());
                  var18.continue_("x");
                  var18.continue_("y");
                  var18.continue_("z");
                  var17 = new rrPp_1(var14, var15, var18.catch_());
               } else {
                  var17 = new rrPp_1(var14, var15, (rcd_3)null);
               }

               class_(var17, var7, var8, var9);
            }
         }

         List var19 = class_(var7, var8, var9);
         this.class_.clear();
         this.class_.add(new rrPT(var19));
         if (var4) {
            this.class_(var1, var10, var11.break_(1, 1, 1));
         } else {
            this.break_.clear();
         }
      }
   }

   private static void class_(rrPp_1 var0, List<rrPp_1> var1, List<rrPp_1> var2, List<rrPp_1> var3) {
      if (var0.byte_ != null) {
         var2.add(var0);
      } else if (!var0.break_.break_().super_() && var0.break_.new_(rRx_1.INSTANCE, rfH_2.protected_)) {
         var1.add(var0);
      } else {
         var3.add(var0);
      }
   }

   private static List<rrPp_1> class_(List<rrPp_1> var0, List<rrPp_1> var1, List<rrPp_1> var2) {
      Comparator var3 = Comparator.<rrPp_1>comparingInt(var0x -> var0x.class_.c_())
         .thenComparingInt(var0x -> var0x.class_.b_())
         .thenComparingInt(var0x -> var0x.class_.d_());
      var0.sort(var3);
      var2.sort(var3);
      var1.sort(var3);
      ArrayList var4 = Lists.newArrayList();
      var4.addAll(var0);
      var4.addAll(var2);
      var4.addAll(var1);
      return var4;
   }

   private void class_(rYB var1, rfH_2 var2, rfH_2 var3) {
      List var4 = var1.class_(an_3.class, new rfl_3(var2, var3), var0 -> !(var0 instanceof rhd_3));
      this.break_.clear();

      for (an_3 var6 : var4) {
         rjU_2 var7 = new rjU_2(var6.rx() - (double)var2.b_(), var6.re() - (double)var2.c_(), var6.BO() - (double)var2.d_());
         rcd_3 var8 = new rcd_3();
         var6.byte_(var8);
         rfH_2 var9;
         if (var6 instanceof rsO_2) {
            var9 = ((rsO_2)var6).implements_().byte_(var2);
         } else {
            var9 = new rfH_2(var7);
         }

         this.break_.add(new rrPq_1(var7, var9, var8.catch_()));
      }
   }

   public boolean class_(rRf_1 var1, rfH_2 var2, rfH_2 var3, rrPN var4, Random var5, int var6) {
      if (this.class_.isEmpty()) {
         return false;
      } else {
         List var7 = var4.class_(this.class_, var2).class_();
         if ((!var7.isEmpty() || !var4.case_() && !this.break_.isEmpty()) && this.byte_.b_() >= 1 && this.byte_.c_() >= 1 && this.byte_.d_() >= 1) {
            rfi_3 var8 = var4.catch_();
            ArrayList var9 = Lists.newArrayListWithCapacity(var4.extends_() ? var7.size() : 0);
            ArrayList var10 = Lists.newArrayListWithCapacity(var7.size());
            int var11 = Integer.MAX_VALUE;
            int var12 = Integer.MAX_VALUE;
            int var13 = Integer.MAX_VALUE;
            int var14 = Integer.MIN_VALUE;
            int var15 = Integer.MIN_VALUE;
            int var16 = Integer.MIN_VALUE;

            for (rrPp_1 var18 : class_(var1, var2, var3, var4, var7)) {
               rfH_2 var19 = var18.class_;
               if (var8 == null || var8.break_(var19)) {
                  rXE var20 = var4.extends_() ? var1.break_(var19) : null;
                  xc_3 var21 = var18.break_.class_(var4.byte_()).class_(var4.protected_());
                  if (var18.byte_ != null) {
                     ryO_2 var22 = var1.class_(var19);
                     rXc_1.class_(var22);
                     var1.class_(var19, xu_3.Ec.continue_(), 20);
                  }

                  if (var1.class_(var19, var21, var6)) {
                     var11 = Math.min(var11, var19.b_());
                     var12 = Math.min(var12, var19.c_());
                     var13 = Math.min(var13, var19.d_());
                     var14 = Math.max(var14, var19.b_());
                     var15 = Math.max(var15, var19.c_());
                     var16 = Math.max(var16, var19.d_());
                     var10.add(Pair.of(var19, var18.byte_));
                     if (var18.byte_ != null) {
                        ryO_2 var37 = var1.class_(var19);
                        if (var37 != null) {
                           var18.byte_.break_("x", var19.b_());
                           var18.byte_.break_("y", var19.c_());
                           var18.byte_.break_("z", var19.d_());
                           if (var37 instanceof rHK) {
                              var18.byte_.class_("LootTableSeed", var5.nextLong());
                           }

                           var37.class_(var18.break_, var18.byte_);
                           var37.break_(var4.byte_());
                           var37.break_(var4.protected_());
                        }
                     }

                     if (var20 != null && var21.break_() instanceof kJ_2) {
                        ((kJ_2)var21.break_()).class_(var1, var19, var21, var20);
                        if (!var20.break_()) {
                           var9.add(var19);
                        }
                     }
                  }
               }
            }

            boolean var26 = true;
            rpr_3[] var27 = new rpr_3[]{rpr_3.UP, rpr_3.NORTH, rpr_3.EAST, rpr_3.SOUTH, rpr_3.WEST};

            while (var26 && !var9.isEmpty()) {
               var26 = false;
               Iterator var28 = var9.iterator();

               while (var28.hasNext()) {
                  rfH_2 var31 = (rfH_2)var28.next();
                  rfH_2 var34 = var31;
                  rXE var38 = var1.break_(var31);

                  for (int var23 = 0; var23 < var27.length && !var38.break_(); var23++) {
                     rfH_2 var24 = var34.break_(var27[var23]);
                     rXE var25 = var1.break_(var24);
                     if (var25.class_(var1, var24) > var38.class_(var1, var34) || var25.break_() && !var38.break_()) {
                        var38 = var25;
                        var34 = var24;
                     }
                  }

                  if (var38.break_()) {
                     xc_3 var42 = var1.byte_(var31);
                     xd_3 var45 = var42.break_();
                     if (var45 instanceof kJ_2) {
                        ((kJ_2)var45).class_(var1, var31, var42, var38);
                        var26 = true;
                        var28.remove();
                     }
                  }
               }
            }

            if (var11 <= var14) {
               if (!var4.private_()) {
                  rjd_3 var29 = new rjd_3(var14 - var11 + 1, var15 - var12 + 1, var16 - var13 + 1);
                  int var32 = var11;
                  int var35 = var12;
                  int var39 = var13;

                  for (Pair var46 : var10) {
                     rfH_2 var47 = (rfH_2)var46.getFirst();
                     var29.class_(var47.b_() - var32, var47.c_() - var35, var47.d_() - var39, true, true);
                  }

                  class_(var1, var6, var29, var32, var35, var39);
               }

               for (Pair var33 : var10) {
                  rfH_2 var36 = (rfH_2)var33.getFirst();
                  if (!var4.private_()) {
                     xc_3 var40 = var1.byte_(var36);
                     xc_3 var44 = xd_3.break_(var40, var1, var36);
                     if (var40 != var44) {
                        var1.class_(var36, var44, var6 & -2 | 16);
                     }

                     var1.class_(var36, var44.break_());
                  }

                  if (var33.getSecond() != null) {
                     ryO_2 var41 = var1.class_(var36);
                     if (var41 != null) {
                        var41.break_();
                     }
                  }
               }
            }

            if (!var4.case_()) {
               this.class_(var1, var2, var4.byte_(), var4.protected_(), var4.throws_(), var8, var4.native_());
            }

            return true;
         } else {
            return false;
         }
      }
   }

   public static void class_(rRg_1 var0, int var1, rjp_3 var2, int var3, int var4, int var5) {
      var2.class_((var5x, var6, var7, var8) -> {
         rfH_2 var9 = new rfH_2(var3 + var6, var4 + var7, var5 + var8);
         rfH_2 var10 = var9.break_(var5x);
         xc_3 var11 = var0.byte_(var9);
         xc_3 var12 = var0.byte_(var10);
         xc_3 var13 = var11.class_(var5x, var12, var0, var9, var10);
         if (var11 != var13) {
            var0.class_(var9, var13, var1 & -2);
         }

         xc_3 var14 = var12.class_(var5x.case_(), var13, var0, var10, var9);
         if (var12 != var14) {
            var0.class_(var10, var14, var1 & -2);
         }
      });
   }

   public static List<rrPp_1> class_(rRg_1 var0, rfH_2 var1, rfH_2 var2, rrPN var3, List<rrPp_1> var4) {
      ArrayList var5 = Lists.newArrayList();

      for (rrPp_1 var7 : var4) {
         rfH_2 var8 = class_(var3, var7.class_).break_(var1);
         rrPp_1 var9 = new rrPp_1(var8, var7.break_, var7.byte_ != null ? var7.byte_.catch_() : null);
         Iterator var10 = var3.implements_().iterator();

         while (var9 != null && var10.hasNext()) {
            var9 = ((rrPA)var10.next()).class_(var0, var1, var2, var7, var9, var3);
         }

         if (var9 != null) {
            var5.add(var9);
         }
      }

      return var5;
   }

   private void class_(rRf_1 var1, rfH_2 var2, rpa_3 var3, rqd_3 var4, rfH_2 var5, rfi_3 var6, boolean var7) {
      for (rrPq_1 var9 : this.break_) {
         rfH_2 var10 = class_(var9.break_, var3, var4, var5).break_(var2);
         if (var6 == null || var6.break_(var10)) {
            rcd_3 var11 = var9.byte_.catch_();
            rjU_2 var12 = class_(var9.class_, var3, var4, var5);
            rjU_2 var13 = var12.break_((double)var2.b_(), (double)var2.c_(), (double)var2.d_());
            rcy_3 var14 = new rcy_3();
            var14.add(rcz_3.class_(var13.break_));
            var14.add(rcz_3.class_(var13.byte_));
            var14.add(rcz_3.class_(var13.protected_));
            var11.class_("Pos", var14);
            var11.continue_("UUID");
            class_(var1, var11).ifPresent(var6x -> {
               float var7x = var6x.class_(var3);
               var7x += var6x.throws_[15] - var6x.class_(var4);
               var6x.class_(var13.break_, var13.byte_, var13.protected_, var7x, (Float)var6x.throws_[16]);
               if (var7 && var6x instanceof is_3) {
                  ((is_3)var6x).class_(var1, var1.throws_(new rfH_2(var13)), iO_2.STRUCTURE, (aU_2)null, var11);
               }

               var1.class_(var6x);
            });
         }
      }
   }

   public void class_(rRf_1 var1, rfH_2 var2, rrPN var3, Random var4) {
      var3.finally_();
      this.break_(var1, var2, var3, var4);
   }

   public static rfH_2 class_(rrPN var0, rfH_2 var1) {
      return class_(var1, var0.byte_(), var0.protected_(), var0.throws_());
   }

   public String break_() {
      return this.protected_;
   }

   public void break_(rcd_3 var1) {
      this.class_.clear();
      this.break_.clear();
      rcy_3 var2 = var1.protected_("size", 3);
      this.byte_ = new rfH_2(var2.throws_(0), var2.throws_(1), var2.throws_(2));
      rcy_3 var3 = var1.protected_("blocks", 10);
      if (var1.byte_("palettes", 9)) {
         rcy_3 var4 = var1.protected_("palettes", 9);

         for (int var5 = 0; var5 < var4.size(); var5++) {
            this.class_(var4.break_(var5), var3);
         }
      } else {
         this.class_(var1.protected_("palette", 10), var3);
      }

      rcy_3 var12 = var1.protected_("entities", 10);

      for (int var13 = 0; var13 < var12.size(); var13++) {
         rcd_3 var6 = var12.class_(var13);
         rcy_3 var7 = var6.protected_("pos", 6);
         rjU_2 var8 = new rjU_2(var7.catch_(0), var7.catch_(1), var7.catch_(2));
         rcy_3 var9 = var6.protected_("blockPos", 3);
         rfH_2 var10 = new rfH_2(var9.throws_(0), var9.throws_(1), var9.throws_(2));
         if (var6.throws_("nbt")) {
            rcd_3 var11 = var6.int_("nbt");
            this.break_.add(new rrPq_1(var8, var10, var11));
         }
      }
   }

   public void break_(rRf_1 var1, rfH_2 var2, rrPN var3, Random var4) {
      this.class_(var1, var2, var2, var3, var4, 2);
   }

   public rfi_3 break_(rrPN var1, rfH_2 var2) {
      return this.class_(var2, var1.protected_(), var1.throws_(), var1.byte_());
   }
}
