package celestial;

import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class rHx_1 extends ryO_2 implements rHf_1 {
   private final List<rHd_1> id_class = Lists.newArrayList();
   private rfH_2 id_break = null;

   public rHx_1() {
      super(ryW_2.id_long);
   }

   private boolean id_class(xc_3 var1, rHd_1 var2, List<an_3> var3, rHk_1 var4) {
      if ((this.id_extends.id_boolean() || this.id_extends.s()) && var4 != rHk_1.EMERGENCY) {
         return false;
      } else {
         rfH_2 var5 = this.id_char();
         rcd_3 var6 = var2.id_class;
         var6.id_continue("Passengers");
         var6.id_continue("Leash");
         var6.id_continue("UUID");
         rpr_3 var7 = var1.id_byte(xO_2.id_volatile);
         rfH_2 var8 = var5.id_break(var7);
         boolean var9 = !this.id_extends.id_byte(var8).id_extends(this.id_extends, var8).id_break();
         if (var9 && var4 != rHk_1.EMERGENCY) {
            return false;
         } else {
            an_3 var10 = aI_2.id_class(var6, this.id_extends, var0 -> var0);
            if (var10 != null) {
               if (!var10.BC().id_class(rlE_2.id_protected)) {
                  return false;
               } else {
                  if (var10 instanceof rbF_2 var11) {
                     if (this.id_final() && !var11.n() && this.id_extends.id_int.nextFloat() < 0.9F) {
                        var11.id_implements(this.id_break);
                     }

                     if (var4 == rHk_1.HONEY_DELIVERED) {
                        var11.sZ();
                        if (var1.id_break().id_class(rls_3.k)) {
                           int var12 = id_class(var1);
                           if (var12 < 5) {
                              int var13 = this.id_extends.id_int.nextInt(100) == 0 ? 2 : 1;
                              if (var12 + var13 > 5) {
                                 var13--;
                              }

                              this.id_extends.id_break(this.id_char(), var1.id_class(xO_2.id_final, Integer.valueOf(var12 + var13)));
                           }
                        }
                     }

                     this.id_class(var2.id_break, var11);
                     if (var3 != null) {
                        var3.add(var11);
                     }

                     float var21 = var10.PN();
                     double var22 = var9 ? 0.0 : 0.55 + (double)(var21 / 2.0F);
                     double var15 = (double)var5.b_() + 0.5 + var22 * (double)var7.id_implements();
                     double var17 = (double)var5.c_() + 0.5 - (double)(var10.Bm() / 2.0F);
                     double var19 = (double)var5.d_() + 0.5 + var22 * (double)var7.id_extends();
                     var10.id_class(var15, var17, var19, (Float)var10.id_throws[15], (Float)var10.id_throws[16]);
                  }

                  this.id_extends.id_class((rhd_3)null, var5, rqn_3.I, rqL_2.BLOCKS, 1.0F, 1.0F);
                  return this.id_extends.a_(var10);
               }
            } else {
               return false;
            }
         }
      }
   }

   public void id_class(an_3 var1, boolean var2, int var3) {
      if (this.id_class.size() < 3) {
         var1.BH();
         var1.Bn();
         rcd_3 var4 = new rcd_3();
         var1.id_byte(var4);
         this.id_class.add(new rHd_1(var4, var3, var2 ? 2400 : 600));
         if (this.id_extends != null) {
            if (var1 instanceof rbF_2 var5 && var5.n() && (!this.id_final() || this.id_extends.id_int.nextBoolean())) {
               this.id_break = var5.L();
            }

            rfH_2 var6 = this.id_char();
            this.id_extends.id_class((rhd_3)null, (double)var6.b_(), (double)var6.c_(), (double)var6.d_(), rqn_3.w, rqL_2.BLOCKS, 1.0F, 1.0F);
         }

         var1.PD();
      }
   }

   public static int id_class(xc_3 var0) {
      return var0.id_byte(xO_2.id_final);
   }

   @Override
   public rcd_3 id_class(rcd_3 var1) {
      super.id_class(var1);
      var1.id_class("Bees", this.id_volatile());
      if (this.id_final()) {
         var1.id_class("FlowerPos", rco_3.id_class(this.id_break));
      }

      return var1;
   }

   @Override
   public void id_class(xc_3 var1, rcd_3 var2) {
      super.id_class(var1, var2);
      this.id_class.clear();
      rcy_3 var3 = var2.id_protected("Bees", 10);

      for (int var4 = 0; var4 < var3.size(); var4++) {
         rcd_3 var5 = var3.id_class(var4);
         rHd_1 var6 = new rHd_1(var5.id_int("EntityData"), var5.id_private("TicksInHive"), var5.id_private("MinOccupationTicks"));
         this.id_class.add(var6);
      }

      this.id_break = null;
      if (var2.id_throws("FlowerPos")) {
         this.id_break = rco_3.id_break(var2.id_int("FlowerPos"));
      }
   }

   private void id_class(int var1, rbF_2 var2) {
      int var3 = var2.O_();
      if (var3 < 0) {
         var2.e_(Math.min(0, var3 + var1));
      } else if (var3 > 0) {
         var2.e_(Math.max(0, var3 - var1));
      }

      var2.id_this(Math.max(0, var2.sW() - var1));
      var2.sJ();
   }

   private List<an_3> id_class(xc_3 var1, rHk_1 var2) {
      ArrayList var3 = Lists.newArrayList();
      this.id_class.removeIf(var4 -> this.id_class(var1, var4, var3, var2));
      return var3;
   }

   public void id_class(an_3 var1, boolean var2) {
      this.id_class(var1, var2, 0);
   }

   public boolean id_class() {
      if (this.id_extends == null) {
         return false;
      } else {
         for (rfH_2 var2 : rfH_2.id_class(this.id_native.id_break(-1, -1, -1), this.id_native.id_break(1, 1, 1))) {
            if (this.id_extends.id_byte(var2).id_break() instanceof dt_3) {
               return true;
            }
         }

         return false;
      }
   }

   public void id_class(rhd_3 var1, xc_3 var2, rHk_1 var3) {
      List var4 = this.id_class(var2, var3);
      if (var1 != null) {
         for (an_3 var6 : var4) {
            if (var6 instanceof rbF_2) {
               rbF_2 var7 = (rbF_2)var6;
               if (var1.Ps().id_implements(var6.Ps()) <= 16.0) {
                  if (!this.id_extends()) {
                     var7.id_byte(var1);
                  } else {
                     var7.id_else(400);
                  }
               }
            }
         }
      }
   }

   @Override
   public void id_break() {
      if (this.id_class()) {
         this.id_class((rhd_3)null, this.id_extends.id_byte(this.id_char()), rHk_1.EMERGENCY);
      }

      super.id_break();
   }

   @Override
   public void id_throws() {
      if (!this.id_extends.id_continue) {
         this.id_package();
         rfH_2 var1 = this.id_char();
         if (this.id_class.size() > 0 && this.id_extends.id_long().nextDouble() < 0.005) {
            double var2 = (double)var1.b_() + 0.5;
            double var4 = (double)var1.c_();
            double var6 = (double)var1.d_() + 0.5;
            this.id_extends.id_class((rhd_3)null, var2, var4, var6, rqn_3.j, rqL_2.BLOCKS, 1.0F, 1.0F);
         }

         this.id_native();
      }
   }

   public int id_finally() {
      return this.id_class.size();
   }

   public boolean id_catch() {
      return this.id_class.isEmpty();
   }

   public boolean id_extends() {
      return xn_3.id_class(this.id_extends, this.id_char());
   }

   private void id_package() {
      Iterator var1 = this.id_class.iterator();
      xc_3 var3 = this.id_abstract();

      while (var1.hasNext()) {
         rHd_1 var2 = (rHd_1)var1.next();
         if (var2.id_break > var2.id_byte) {
            rHk_1 var4 = var2.id_class.id_new("HasNectar") ? rHk_1.HONEY_DELIVERED : rHk_1.BEE_RELEASED;
            if (this.id_class(var3, var2, (List<an_3>)null, var4)) {
               var1.remove();
            }
         }

         var2.id_break++;
      }
   }

   public boolean id_private() {
      return this.id_class.size() == 3;
   }

   private boolean id_final() {
      return this.id_break != null;
   }

   public rcy_3 id_volatile() {
      rcy_3 var1 = new rcy_3();

      for (rHd_1 var3 : this.id_class) {
         var3.id_class.id_continue("UUID");
         rcd_3 var4 = new rcd_3();
         var4.id_class("EntityData", var3.id_class);
         var4.id_break("TicksInHive", var3.id_break);
         var4.id_break("MinOccupationTicks", var3.id_byte);
         var1.add(var4);
      }

      return var1;
   }

   protected void id_native() {
      ruP_2.id_class(this);
   }
}
