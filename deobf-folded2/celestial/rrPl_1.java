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
   private final List<rrPT> id_class = Lists.newArrayList();
   private final List<rrPq_1> id_break = Lists.newArrayList();
   private rfH_2 id_byte = rfH_2.id_protected;
   private String id_protected = "?";

   public rfH_2 id_class(rfH_2 var1, rpa_3 var2, rqd_3 var3) {
      return id_class(var1, var2, var3, this.id_class().b_(), this.id_class().d_());
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public static rfH_2 id_class(rfH_2 var0, rpa_3 var1, rqd_3 var2, int var3, int var4) {
      var3--;
      var4--;
      int var5 = var1 == rpa_3.FRONT_BACK ? var3 : 0;
      int var6 = var1 == rpa_3.LEFT_RIGHT ? var4 : 0;
      rfH_2 var7 = var0;
      switch (var2) {
         case COUNTERCLOCKWISE_90:
            var7 = var0.id_break(var6, 0, var3 - var5);
            break;
         case CLOCKWISE_90:
            var7 = var0.id_break(var4 - var6, 0, var5);
            break;
         case CLOCKWISE_180:
            var7 = var0.id_break(var3 - var5, 0, var4 - var6);
            break;
         case NONE:
            var7 = var0.id_break(var5, 0, var6);
      }

      return var7;
   }

   public rfi_3 id_class(rfH_2 var1, rqd_3 var2, rfH_2 var3, rpa_3 var4) {
      rfH_2 var5 = this.id_class(var2);
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
            this.id_class(var2, var10, var8, var11, rpr_3.NORTH, rpr_3.SOUTH);
            break;
         case FRONT_BACK:
            this.id_class(var2, var8, var10, var11, rpr_3.WEST, rpr_3.EAST);
         case NONE:
      }

      var11.id_class(var1.b_(), var1.c_(), var1.d_());
      return var11;
   }

   private void id_class(rqd_3 var1, int var2, int var3, rfi_3 var4, rpr_3 var5, rpr_3 var6) {
      rfH_2 var7 = rfH_2.id_protected;
      if (var1 == rqd_3.CLOCKWISE_90 || var1 == rqd_3.COUNTERCLOCKWISE_90) {
         var7 = var7.id_class(var1.id_class(var5), var3);
      } else if (var1 == rqd_3.CLOCKWISE_180) {
         var7 = var7.id_class(var6, var2);
      } else {
         var7 = var7.id_class(var5, var2);
      }

      var4.id_class(var7.b_(), 0, var7.d_());
   }

   public rcd_3 id_class(rcd_3 var1) {
      if (this.id_class.isEmpty()) {
         var1.id_class("blocks", new rcy_3());
         var1.id_class("palette", new rcy_3());
      } else {
         ArrayList var2 = Lists.newArrayList();
         rrPy_1 var3 = new rrPy_1();
         var2.add(var3);

         for (int var4 = 1; var4 < this.id_class.size(); var4++) {
            var2.add(new rrPy_1());
         }

         rcy_3 var14 = new rcy_3();
         List var5 = this.id_class.get(0).id_class();

         for (int var6 = 0; var6 < var5.size(); var6++) {
            rrPp_1 var7 = (rrPp_1)var5.get(var6);
            rcd_3 var8 = new rcd_3();
            var8.id_class("pos", this.id_class(var7.id_class.b_(), var7.id_class.c_(), var7.id_class.d_()));
            int var9 = var3.id_class(var7.id_break);
            var8.id_break("state", var9);
            if (var7.id_byte != null) {
               var8.id_class("nbt", var7.id_byte);
            }

            var14.add(var8);

            for (int var10 = 1; var10 < this.id_class.size(); var10++) {
               rrPy_1 var11 = (rrPy_1)var2.get(var10);
               var11.id_class(this.id_class.get(var10).id_class().get(var6).id_break, var9);
            }
         }

         var1.id_class("blocks", var14);
         if (var2.size() == 1) {
            rcy_3 var17 = new rcy_3();

            for (xc_3 var21 : var3) {
               var17.add(rco_3.id_class(var21));
            }

            var1.id_class("palette", var17);
         } else {
            rcy_3 var18 = new rcy_3();

            for (rrPy_1 var22 : var2) {
               rcy_3 var23 = new rcy_3();

               for (xc_3 var25 : var22) {
                  var23.add(rco_3.id_class(var25));
               }

               var18.add(var23);
            }

            var1.id_class("palettes", var18);
         }
      }

      rcy_3 var12 = new rcy_3();

      for (rrPq_1 var15 : this.id_break) {
         rcd_3 var16 = new rcd_3();
         var16.id_class("pos", this.id_class(var15.id_class.id_break, var15.id_class.id_byte, var15.id_class.id_protected));
         var16.id_class("blockPos", this.id_class(var15.id_break.b_(), var15.id_break.c_(), var15.id_break.d_()));
         if (var15.id_byte != null) {
            var16.id_class("nbt", var15.id_byte);
         }

         var12.add(var16);
      }

      var1.id_class("entities", var12);
      var1.id_class("size", this.id_class(this.id_byte.b_(), this.id_byte.c_(), this.id_byte.d_()));
      var1.id_break("DataVersion", rqu_3.id_class().getWorldVersion());
      return var1;
   }

   private static Optional<an_3> id_class(rRf_1 var0, rcd_3 var1) {
      try {
         return aI_2.id_class(var1, var0.id_byte());
      } catch (Exception var3) {
         return Optional.empty();
      }
   }

   public rfH_2 id_class() {
      return this.id_byte;
   }

   public static rfH_2 id_class(rfH_2 var0, rpa_3 var1, rqd_3 var2, rfH_2 var3) {
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

   public static rjU_2 id_class(rjU_2 var0, rpa_3 var1, rqd_3 var2, rfH_2 var3) {
      double var4 = var0.id_break;
      double var6 = var0.id_byte;
      double var8 = var0.id_protected;
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

   public rfH_2 id_class(rqd_3 var1) {
      switch (var1) {
         case COUNTERCLOCKWISE_90:
         case CLOCKWISE_90:
            return new rfH_2(this.id_byte.d_(), this.id_byte.c_(), this.id_byte.b_());
         default:
            return this.id_byte;
      }
   }

   private void id_class(rcy_3 var1, rcy_3 var2) {
      rrPy_1 var3 = new rrPy_1();

      for (int var4 = 0; var4 < var1.size(); var4++) {
         var3.id_class(rco_3.id_byte(var1.id_class(var4)), var4);
      }

      ArrayList var14 = Lists.newArrayList();
      ArrayList var5 = Lists.newArrayList();
      ArrayList var6 = Lists.newArrayList();

      for (int var7 = 0; var7 < var2.size(); var7++) {
         rcd_3 var8 = var2.id_class(var7);
         rcy_3 var9 = var8.id_protected("pos", 3);
         rfH_2 var10 = new rfH_2(var9.id_throws(0), var9.id_throws(1), var9.id_throws(2));
         xc_3 var11 = var3.id_class(var8.id_private("state"));
         rcd_3 var12;
         if (var8.id_throws("nbt")) {
            var12 = var8.id_int("nbt");
         } else {
            var12 = null;
         }

         rrPp_1 var13 = new rrPp_1(var10, var11, var12);
         id_class(var13, var14, var5, var6);
      }

      List var15 = id_class(var14, var5, var6);
      this.id_class.add(new rrPT(var15));
   }

   private rcy_3 id_class(int... var1) {
      rcy_3 var2 = new rcy_3();

      for (int var6 : var1) {
         var2.add(rcn_3.id_class(var6));
      }

      return var2;
   }

   private rcy_3 id_class(double... var1) {
      rcy_3 var2 = new rcy_3();

      for (double var6 : var1) {
         var2.add(rcz_3.id_class(var6));
      }

      return var2;
   }

   public List<rrPp_1> id_class(rfH_2 var1, rrPN var2, xd_3 var3) {
      return this.id_class(var1, var2, var3, true);
   }

   public List<rrPp_1> id_class(rfH_2 var1, rrPN var2, xd_3 var3, boolean var4) {
      ArrayList var5 = Lists.newArrayList();
      rfi_3 var6 = var2.id_catch();
      if (this.id_class.isEmpty()) {
         return Collections.emptyList();
      } else {
         for (rrPp_1 var8 : var2.id_class(this.id_class, var1).id_class(var3)) {
            rfH_2 var9 = var4 ? id_class(var2, var8.id_class).id_break(var1) : var8.id_class;
            if (var6 == null || var6.id_break(var9)) {
               var5.add(new rrPp_1(var9, var8.id_break.id_class(var2.id_protected()), var8.id_byte));
            }
         }

         return var5;
      }
   }

   public void id_class(String var1) {
      this.id_protected = var1;
   }

   public rfH_2 id_class(rrPN var1, rfH_2 var2, rrPN var3, rfH_2 var4) {
      rfH_2 var5 = id_class(var1, var2);
      rfH_2 var6 = id_class(var3, var4);
      return var5.id_byte(var6);
   }

   public void id_class(rYB var1, rfH_2 var2, rfH_2 var3, boolean var4, xd_3 var5) {
      if (var3.b_() >= 1 && var3.c_() >= 1 && var3.d_() >= 1) {
         rfH_2 var6 = var2.id_break(var3).id_break(-1, -1, -1);
         ArrayList var7 = Lists.newArrayList();
         ArrayList var8 = Lists.newArrayList();
         ArrayList var9 = Lists.newArrayList();
         rfH_2 var10 = new rfH_2(Math.min(var2.b_(), var6.b_()), Math.min(var2.c_(), var6.c_()), Math.min(var2.d_(), var6.d_()));
         rfH_2 var11 = new rfH_2(Math.max(var2.b_(), var6.b_()), Math.max(var2.c_(), var6.c_()), Math.max(var2.d_(), var6.d_()));
         this.id_byte = var3;

         for (rfH_2 var13 : rfH_2.id_class(var10, var11)) {
            rfH_2 var14 = var13.id_byte(var10);
            xc_3 var15 = var1.id_byte(var13);
            if (var5 == null || var5 != var15.id_break()) {
               ryO_2 var16 = var1.id_class(var13);
               rrPp_1 var17;
               if (var16 != null) {
                  rcd_3 var18 = var16.id_class(new rcd_3());
                  var18.id_continue("x");
                  var18.id_continue("y");
                  var18.id_continue("z");
                  var17 = new rrPp_1(var14, var15, var18.id_catch());
               } else {
                  var17 = new rrPp_1(var14, var15, (rcd_3)null);
               }

               id_class(var17, var7, var8, var9);
            }
         }

         List var19 = id_class(var7, var8, var9);
         this.id_class.clear();
         this.id_class.add(new rrPT(var19));
         if (var4) {
            this.id_class(var1, var10, var11.id_break(1, 1, 1));
         } else {
            this.id_break.clear();
         }
      }
   }

   private static void id_class(rrPp_1 var0, List<rrPp_1> var1, List<rrPp_1> var2, List<rrPp_1> var3) {
      if (var0.id_byte != null) {
         var2.add(var0);
      } else if (!var0.id_break.id_break().id_super() && var0.id_break.id_new(rRx_1.INSTANCE, rfH_2.id_protected)) {
         var1.add(var0);
      } else {
         var3.add(var0);
      }
   }

   private static List<rrPp_1> id_class(List<rrPp_1> var0, List<rrPp_1> var1, List<rrPp_1> var2) {
      Comparator var3 = Comparator.<rrPp_1>comparingInt(var0x -> var0x.id_class.c_())
         .thenComparingInt(var0x -> var0x.id_class.b_())
         .thenComparingInt(var0x -> var0x.id_class.d_());
      var0.sort(var3);
      var2.sort(var3);
      var1.sort(var3);
      ArrayList var4 = Lists.newArrayList();
      var4.addAll(var0);
      var4.addAll(var2);
      var4.addAll(var1);
      return var4;
   }

   private void id_class(rYB var1, rfH_2 var2, rfH_2 var3) {
      List var4 = var1.id_class(an_3.class, new rfl_3(var2, var3), var0 -> !(var0 instanceof rhd_3));
      this.id_break.clear();

      for (an_3 var6 : var4) {
         rjU_2 var7 = new rjU_2(var6.rx() - (double)var2.b_(), var6.re() - (double)var2.c_(), var6.BO() - (double)var2.d_());
         rcd_3 var8 = new rcd_3();
         var6.id_byte(var8);
         rfH_2 var9;
         if (var6 instanceof rsO_2) {
            var9 = ((rsO_2)var6).id_implements().id_byte(var2);
         } else {
            var9 = new rfH_2(var7);
         }

         this.id_break.add(new rrPq_1(var7, var9, var8.id_catch()));
      }
   }

   public boolean id_class(rRf_1 var1, rfH_2 var2, rfH_2 var3, rrPN var4, Random var5, int var6) {
      if (this.id_class.isEmpty()) {
         return false;
      } else {
         List var7 = var4.id_class(this.id_class, var2).id_class();
         if ((!var7.isEmpty() || !var4.id_case() && !this.id_break.isEmpty()) && this.id_byte.b_() >= 1 && this.id_byte.c_() >= 1 && this.id_byte.d_() >= 1) {
            rfi_3 var8 = var4.id_catch();
            ArrayList var9 = Lists.newArrayListWithCapacity(var4.id_extends() ? var7.size() : 0);
            ArrayList var10 = Lists.newArrayListWithCapacity(var7.size());
            int var11 = Integer.MAX_VALUE;
            int var12 = Integer.MAX_VALUE;
            int var13 = Integer.MAX_VALUE;
            int var14 = Integer.MIN_VALUE;
            int var15 = Integer.MIN_VALUE;
            int var16 = Integer.MIN_VALUE;

            for (rrPp_1 var18 : id_class(var1, var2, var3, var4, var7)) {
               rfH_2 var19 = var18.id_class;
               if (var8 == null || var8.id_break(var19)) {
                  rXE var20 = var4.id_extends() ? var1.id_break(var19) : null;
                  xc_3 var21 = var18.id_break.id_class(var4.id_byte()).id_class(var4.id_protected());
                  if (var18.id_byte != null) {
                     ryO_2 var22 = var1.id_class(var19);
                     rXc_1.id_class(var22);
                     var1.id_class(var19, xu_3.Ec.id_continue(), 20);
                  }

                  if (var1.id_class(var19, var21, var6)) {
                     var11 = Math.min(var11, var19.b_());
                     var12 = Math.min(var12, var19.c_());
                     var13 = Math.min(var13, var19.d_());
                     var14 = Math.max(var14, var19.b_());
                     var15 = Math.max(var15, var19.c_());
                     var16 = Math.max(var16, var19.d_());
                     var10.add(Pair.of(var19, var18.id_byte));
                     if (var18.id_byte != null) {
                        ryO_2 var37 = var1.id_class(var19);
                        if (var37 != null) {
                           var18.id_byte.id_break("x", var19.b_());
                           var18.id_byte.id_break("y", var19.c_());
                           var18.id_byte.id_break("z", var19.d_());
                           if (var37 instanceof rHK) {
                              var18.id_byte.id_class("LootTableSeed", var5.nextLong());
                           }

                           var37.id_class(var18.id_break, var18.id_byte);
                           var37.id_break(var4.id_byte());
                           var37.id_break(var4.id_protected());
                        }
                     }

                     if (var20 != null && var21.id_break() instanceof kJ_2) {
                        ((kJ_2)var21.id_break()).id_class(var1, var19, var21, var20);
                        if (!var20.id_break()) {
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
                  rXE var38 = var1.id_break(var31);

                  for (int var23 = 0; var23 < var27.length && !var38.id_break(); var23++) {
                     rfH_2 var24 = var34.id_break(var27[var23]);
                     rXE var25 = var1.id_break(var24);
                     if (var25.id_class(var1, var24) > var38.id_class(var1, var34) || var25.id_break() && !var38.id_break()) {
                        var38 = var25;
                        var34 = var24;
                     }
                  }

                  if (var38.id_break()) {
                     xc_3 var42 = var1.id_byte(var31);
                     xd_3 var45 = var42.id_break();
                     if (var45 instanceof kJ_2) {
                        ((kJ_2)var45).id_class(var1, var31, var42, var38);
                        var26 = true;
                        var28.remove();
                     }
                  }
               }
            }

            if (var11 <= var14) {
               if (!var4.id_private()) {
                  rjd_3 var29 = new rjd_3(var14 - var11 + 1, var15 - var12 + 1, var16 - var13 + 1);
                  int var32 = var11;
                  int var35 = var12;
                  int var39 = var13;

                  for (Pair var46 : var10) {
                     rfH_2 var47 = (rfH_2)var46.getFirst();
                     var29.id_class(var47.b_() - var32, var47.c_() - var35, var47.d_() - var39, true, true);
                  }

                  id_class(var1, var6, var29, var32, var35, var39);
               }

               for (Pair var33 : var10) {
                  rfH_2 var36 = (rfH_2)var33.getFirst();
                  if (!var4.id_private()) {
                     xc_3 var40 = var1.id_byte(var36);
                     xc_3 var44 = xd_3.id_break(var40, var1, var36);
                     if (var40 != var44) {
                        var1.id_class(var36, var44, var6 & -2 | 16);
                     }

                     var1.id_class(var36, var44.id_break());
                  }

                  if (var33.getSecond() != null) {
                     ryO_2 var41 = var1.id_class(var36);
                     if (var41 != null) {
                        var41.id_break();
                     }
                  }
               }
            }

            if (!var4.id_case()) {
               this.id_class(var1, var2, var4.id_byte(), var4.id_protected(), var4.id_throws(), var8, var4.id_native());
            }

            return true;
         } else {
            return false;
         }
      }
   }

   public static void id_class(rRg_1 var0, int var1, rjp_3 var2, int var3, int var4, int var5) {
      var2.id_class((var5x, var6, var7, var8) -> {
         rfH_2 var9 = new rfH_2(var3 + var6, var4 + var7, var5 + var8);
         rfH_2 var10 = var9.id_break(var5x);
         xc_3 var11 = var0.id_byte(var9);
         xc_3 var12 = var0.id_byte(var10);
         xc_3 var13 = var11.id_class(var5x, var12, var0, var9, var10);
         if (var11 != var13) {
            var0.id_class(var9, var13, var1 & -2);
         }

         xc_3 var14 = var12.id_class(var5x.id_case(), var13, var0, var10, var9);
         if (var12 != var14) {
            var0.id_class(var10, var14, var1 & -2);
         }
      });
   }

   public static List<rrPp_1> id_class(rRg_1 var0, rfH_2 var1, rfH_2 var2, rrPN var3, List<rrPp_1> var4) {
      ArrayList var5 = Lists.newArrayList();

      for (rrPp_1 var7 : var4) {
         rfH_2 var8 = id_class(var3, var7.id_class).id_break(var1);
         rrPp_1 var9 = new rrPp_1(var8, var7.id_break, var7.id_byte != null ? var7.id_byte.id_catch() : null);
         Iterator var10 = var3.id_implements().iterator();

         while (var9 != null && var10.hasNext()) {
            var9 = ((rrPA)var10.next()).id_class(var0, var1, var2, var7, var9, var3);
         }

         if (var9 != null) {
            var5.add(var9);
         }
      }

      return var5;
   }

   private void id_class(rRf_1 var1, rfH_2 var2, rpa_3 var3, rqd_3 var4, rfH_2 var5, rfi_3 var6, boolean var7) {
      for (rrPq_1 var9 : this.id_break) {
         rfH_2 var10 = id_class(var9.id_break, var3, var4, var5).id_break(var2);
         if (var6 == null || var6.id_break(var10)) {
            rcd_3 var11 = var9.id_byte.id_catch();
            rjU_2 var12 = id_class(var9.id_class, var3, var4, var5);
            rjU_2 var13 = var12.id_break((double)var2.b_(), (double)var2.c_(), (double)var2.d_());
            rcy_3 var14 = new rcy_3();
            var14.add(rcz_3.id_class(var13.id_break));
            var14.add(rcz_3.id_class(var13.id_byte));
            var14.add(rcz_3.id_class(var13.id_protected));
            var11.id_class("Pos", var14);
            var11.id_continue("UUID");
            id_class(var1, var11).ifPresent(var6x -> {
               float var7x = var6x.id_class(var3);
               var7x += var6x.id_throws[15] - var6x.id_class(var4);
               var6x.id_class(var13.id_break, var13.id_byte, var13.id_protected, var7x, (Float)var6x.id_throws[16]);
               if (var7 && var6x instanceof is_3) {
                  ((is_3)var6x).id_class(var1, var1.id_throws(new rfH_2(var13)), iO_2.STRUCTURE, (aU_2)null, var11);
               }

               var1.id_class(var6x);
            });
         }
      }
   }

   public void id_class(rRf_1 var1, rfH_2 var2, rrPN var3, Random var4) {
      var3.id_finally();
      this.id_break(var1, var2, var3, var4);
   }

   public static rfH_2 id_class(rrPN var0, rfH_2 var1) {
      return id_class(var1, var0.id_byte(), var0.id_protected(), var0.id_throws());
   }

   public String id_break() {
      return this.id_protected;
   }

   public void id_break(rcd_3 var1) {
      this.id_class.clear();
      this.id_break.clear();
      rcy_3 var2 = var1.id_protected("size", 3);
      this.id_byte = new rfH_2(var2.id_throws(0), var2.id_throws(1), var2.id_throws(2));
      rcy_3 var3 = var1.id_protected("blocks", 10);
      if (var1.id_byte("palettes", 9)) {
         rcy_3 var4 = var1.id_protected("palettes", 9);

         for (int var5 = 0; var5 < var4.size(); var5++) {
            this.id_class(var4.id_break(var5), var3);
         }
      } else {
         this.id_class(var1.id_protected("palette", 10), var3);
      }

      rcy_3 var12 = var1.id_protected("entities", 10);

      for (int var13 = 0; var13 < var12.size(); var13++) {
         rcd_3 var6 = var12.id_class(var13);
         rcy_3 var7 = var6.id_protected("pos", 6);
         rjU_2 var8 = new rjU_2(var7.id_catch(0), var7.id_catch(1), var7.id_catch(2));
         rcy_3 var9 = var6.id_protected("blockPos", 3);
         rfH_2 var10 = new rfH_2(var9.id_throws(0), var9.id_throws(1), var9.id_throws(2));
         if (var6.id_throws("nbt")) {
            rcd_3 var11 = var6.id_int("nbt");
            this.id_break.add(new rrPq_1(var8, var10, var11));
         }
      }
   }

   public void id_break(rRf_1 var1, rfH_2 var2, rrPN var3, Random var4) {
      this.id_class(var1, var2, var2, var3, var4, 2);
   }

   public rfi_3 id_break(rrPN var1, rfH_2 var2) {
      return this.id_class(var2, var1.id_protected(), var1.id_throws(), var1.id_byte());
   }
}
