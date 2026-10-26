package celestial;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.function.Predicate;

public class Fv_1 extends cc_3<FF> {
   private static final rqO_2 id_throws = new rqO_2("textures/gui/container/creative_inventory/tabs.png");
   static final rXA id_case = new rXA(45);
   private static final rgP_2 id_catch = new rgn_3("inventory.binSlot");
   private static int id_private = rdX_2.id_break.id_class();
   private float id_implements;
   private boolean id_finally;
   private Lu_1 id_boolean;
   private List<rJY> id_transient;
   private rJY id_for;
   private FZ id_double;
   private boolean id_switch;
   private boolean r;
   private final Map<rqO_2, rlb_3<rdb_3>> P = Maps.newTreeMap();

   private void id_char() {
      this.id_instanceof.id_class.clear();
      this.P.clear();
      String var1 = this.id_boolean.id_private();
      if (var1.isEmpty()) {
         for (rdb_3 var3 : rVL.id_for) {
            var3.id_class(rdX_2.id_catch, this.id_instanceof.id_class);
         }
      } else {
         Vo_1 var4;
         if (var1.startsWith("#")) {
            var1 = var1.substring(1);
            var4 = this.id_volatile.id_class(gJ_2.id_break);
            this.id_class(var1);
         } else {
            var4 = this.id_volatile.id_class(gJ_2.id_class);
         }

         this.id_instanceof.id_class.addAll(var4.id_class(var1.toLowerCase(Locale.ROOT)));
      }

      this.id_implements = 0.0F;
      this.id_instanceof.id_class(0.0F);
   }

   public Fv_1(rhd_3 var1) {
      super(new FF(var1), (rhz_3)var1.id_implements[1], rgN_2.id_byte);
      rJr_1 var6 = this.id_instanceof;
      var1.id_implements[4] = var6;
      this.id_continue = true;
      this.id_return = 136;
      this.id_synchronized = 195;
   }

   public int id_interface() {
      return id_private;
   }

   @Override
   public void id_class(Ml_1 var1, int var2, int var3, float var4) {
      this.id_class(var1);
      super.id_class(var1, var2, var3, var4);

      for (rdX_2 var8 : rdX_2.id_class) {
         if (this.id_class(var1, var8, var2, var3)) {
            break;
         }
      }

      if (this.id_for != null
         && id_private == rdX_2.id_final.id_class()
         && this.id_class(this.id_for.id_throws, this.id_for.id_case, 16, 16, (double)var2, (double)var3)) {
         this.id_class(var1, id_catch, var2, var3);
      }

      RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
      this.id_break(var1, var2, var3);
   }

   @Override
   protected void id_class(Ml_1 var1, rdn_3 var2, int var3, int var4) {
      if (id_private == rdX_2.id_catch.id_class()) {
         List var5 = var2.id_class((cb_3)this.id_volatile.id_class[57], ((Qw_1)this.id_volatile.id_class[20]).id_int ? VU.ADVANCED : VU.NORMAL);
         ArrayList var6 = Lists.newArrayList(var5);
         rdb_3 var7 = var2.id_break();
         rdX_2 var8 = var7.id_new();
         if (var8 == null && var7 == rdy_3.dm) {
            Map var9 = eA_2.id_class(var2);
            if (var9.size() == 1) {
               ev_3 var10 = (ev_3)var9.keySet().iterator().next();

               for (rdX_2 var14 : rdX_2.id_class) {
                  if (var14.id_class(var10.id_break)) {
                     var8 = var14;
                     break;
                  }
               }
            }
         }

         this.P.forEach((var2x, var3x) -> {
            if (var3x.id_class(var7)) {
               var6.add(1, new rgN_2("#" + var2x).id_class(rgF_2.DARK_PURPLE));
            }
         });
         if (var8 != null) {
            var6.add(1, var8.id_byte().id_case().id_class(rgF_2.BLUE));
         }

         this.id_class(var1, var6, var3, var4);
      } else {
         super.id_class(var1, var2, var3, var4);
      }
   }

   @Override
   protected void id_class(Ml_1 var1, float var2, int var3, int var4) {
      RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
      rdX_2 var5 = rdX_2.id_class[id_private];

      for (rdX_2 var9 : rdX_2.id_class) {
         this.id_volatile.A().id_class(id_throws);
         if (var9.id_class() != id_private) {
            this.id_class(var1, var9);
         }
      }

      this.id_volatile.A().id_class(new rqO_2("textures/gui/container/creative_inventory/tab_" + var5.id_case()));
      this.id_break(var1, this.id_char, this.id_abstract, 0, 0, this.id_synchronized, this.id_return);
      this.id_boolean.id_class(var1, var3, var4, var2);
      RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
      int var10 = this.id_char + 175;
      int var11 = this.id_abstract + 18;
      int var12 = var11 + 112;
      this.id_volatile.A().id_class(id_throws);
      if (var5.id_implements()) {
         this.id_break(var1, var10, var11 + (int)((float)(var12 - var11 - 17) * this.id_implements), 232 + (this.id_abstract() ? 0 : 12), 0, 12, 15);
      }

      this.id_class(var1, var5);
      if (var5 == rdX_2.id_final) {
         FH.id_class(
            this.id_char + 88,
            this.id_abstract + 45,
            20,
            (float)(this.id_char + 88 - var3),
            (float)(this.id_abstract + 45 - 30 - var4),
            (cb_3)this.id_volatile.id_class[57]
         );
      }
   }

   protected boolean id_class(rdX_2 var1, double var2, double var4) {
      int var6 = var1.id_extends();
      int var7 = 28 * var6;
      int var8 = 0;
      if (var1.id_volatile()) {
         var7 = this.id_synchronized - 28 * (6 - var6) + 2;
      } else if (var6 > 0) {
         var7 += var6;
      }

      if (var1.id_native()) {
         var8 -= 32;
      } else {
         var8 += this.id_return;
      }

      return var2 >= (double)var7 && var2 <= (double)(var7 + 28) && var4 >= (double)var8 && var4 <= (double)(var8 + 32);
   }

   private void id_class(rdX_2 var1) {
      int var2 = id_private;
      id_private = var1.id_class();
      this.id_long.clear();
      this.id_instanceof.id_class.clear();
      if (var1 == rdX_2.id_volatile) {
         Vk_1 var3 = this.id_volatile.id_super();

         for (int var4 = 0; var4 < 9; var4++) {
            VQ var5 = var3.id_class(var4);
            if (var5.isEmpty()) {
               for (int var6 = 0; var6 < 9; var6++) {
                  if (var6 == var4) {
                     rdn_3 var7 = new rdn_3(rdy_3.Xb);
                     var7.id_class("CustomCreativeLock");
                     rgP_2 var8 = ((Qw_1)this.id_volatile.id_class[20]).t[var4].id_native();
                     rgP_2 var9 = ((Qw_1)this.id_volatile.id_class[20]).w.id_native();
                     var7.id_class(new rgn_3("inventory.hotbarInfo", var9, var8));
                     this.id_instanceof.id_class.add(var7);
                  } else {
                     this.id_instanceof.id_class.add(rdn_3.id_break);
                  }
               }
            } else {
               this.id_instanceof.id_class.addAll(var5);
            }
         }
      } else if (var1 != rdX_2.id_catch) {
         var1.id_class(this.id_instanceof.id_class);
      }

      if (var1 == rdX_2.id_final) {
         rJT var10 = (rJT)((cb_3)this.id_volatile.id_class[57]).id_implements[3];
         if (this.id_transient == null) {
            this.id_transient = ImmutableList.copyOf(this.id_instanceof.id_throws);
         }

         this.id_instanceof.id_throws.clear();

         for (int var11 = 0; var11 < var10.id_throws.size(); var11++) {
            int var12;
            int var13;
            if (var11 >= 5 && var11 < 9) {
               int var15 = var11 - 5;
               int var18 = var15 / 2;
               int var20 = var15 % 2;
               var12 = 54 + var18 * 54;
               var13 = 6 + var20 * 27;
            } else if (var11 >= 0 && var11 < 5) {
               var12 = -2000;
               var13 = -2000;
            } else if (var11 == 45) {
               var12 = 35;
               var13 = 20;
            } else {
               int var14 = var11 - 9;
               int var17 = var14 % 9;
               int var19 = var14 / 9;
               var12 = 9 + var17 * 18;
               if (var11 >= 36) {
                  var13 = 112;
               } else {
                  var13 = 54 + var19 * 18;
               }
            }

            FL var16 = new FL(var10.id_throws.get(var11), var11, var12, var13);
            this.id_instanceof.id_throws.add(var16);
         }

         this.id_for = new rJY(id_case, 0, 173, 112);
         this.id_instanceof.id_throws.add(this.id_for);
      } else if (var2 == rdX_2.id_final.id_class()) {
         this.id_instanceof.id_throws.clear();
         this.id_instanceof.id_throws.addAll(this.id_transient);
         this.id_transient = null;
      }

      if (this.id_boolean != null) {
         if (var1 == rdX_2.id_catch) {
            this.id_boolean.id_private(true);
            this.id_boolean.id_catch(false);
            this.id_boolean.id_byte(true);
            if (var2 != var1.id_class()) {
               this.id_boolean.id_class("");
            }

            this.id_char();
         } else {
            this.id_boolean.id_private(false);
            this.id_boolean.id_catch(true);
            this.id_boolean.id_byte(false);
            this.id_boolean.id_class("");
         }
      }

      this.id_implements = 0.0F;
      this.id_instanceof.id_class(0.0F);
   }

   @Override
   public boolean id_class(double var1, double var3, double var5) {
      if (!this.id_abstract()) {
         return false;
      } else {
         int var7 = (this.id_instanceof.id_class.size() + 9 - 1) / 9 - 5;
         this.id_implements = (float)((double)this.id_implements - var5 / (double)var7);
         this.id_implements = rfU_2.id_class(this.id_implements, 0.0F, 1.0F);
         this.id_instanceof.id_class(this.id_implements);
         return true;
      }
   }

   @Override
   protected boolean id_class(double var1, double var3, int var5, int var6, int var7) {
      boolean var8 = var1 < (double)var5 || var3 < (double)var6 || var1 >= (double)(var5 + this.id_synchronized) || var3 >= (double)(var6 + this.id_return);
      this.r = var8 && !this.id_class(rdX_2.id_class[id_private], var1, var3);
      return this.r;
   }

   @Override
   public boolean id_class(double var1, double var3, int var5, double var6, double var8) {
      if (this.id_finally) {
         int var10 = this.id_abstract + 18;
         int var11 = var10 + 112;
         this.id_implements = ((float)var3 - (float)var10 - 7.5F) / ((float)(var11 - var10) - 15.0F);
         this.id_implements = rfU_2.id_class(this.id_implements, 0.0F, 1.0F);
         this.id_instanceof.id_class(this.id_implements);
         return true;
      } else {
         return super.id_class(var1, var3, var5, var6, var8);
      }
   }

   public static void id_class(QY var0, int var1, boolean var2, boolean var3) {
      cb_3 var4 = (cb_3)var0.id_class[57];
      Vk_1 var5 = var0.id_super();
      VQ var6 = var5.id_class(var1);
      if (var2) {
         for (int var7 = 0; var7 < rhz_3.id_protected(); var7++) {
            rdn_3 var8 = ((rdn_3)var6.get(var7)).id_implements();
            ((rhz_3)var4.id_implements[1]).id_break(var7, var8);
            ((Ax_1)var0.id_class[55]).id_class(var8, 36 + var7);
         }

         ((rJT)var4.id_implements[3]).id_native();
      } else if (var3) {
         for (int var9 = 0; var9 < rhz_3.id_protected(); var9++) {
            var6.set(var9, ((rhz_3)var4.id_implements[1]).id_extends(var9).id_implements());
         }

         rgP_2 var10 = ((Qw_1)var0.id_class[20]).t[var1].id_native();
         rgP_2 var11 = ((Qw_1)var0.id_class[20]).I.id_native();
         ((cq_3)var0.id_class[19]).id_class(new rgn_3("inventory.hotbarSaved", var11, var10), false, false);
         var5.id_class();
      }
   }

   protected void id_class(Ml_1 var1, rdX_2 var2) {
      boolean var3 = var2.id_class() == id_private;
      boolean var4 = var2.id_native();
      int var5 = var2.id_extends();
      int var6 = var5 * 28;
      byte var7 = 0;
      int var8 = this.id_char + 28 * var5;
      int var9 = this.id_abstract;
      byte var10 = 32;
      if (var3) {
         var7 += 32;
      }

      if (var2.id_volatile()) {
         var8 = this.id_char + this.id_synchronized - 28 * (6 - var5);
      } else if (var5 > 0) {
         var8 += var5;
      }

      if (var4) {
         var9 -= 28;
      } else {
         var7 += 64;
         var9 += this.id_return - 4;
      }

      this.id_break(var1, var8, var9, var6, var7, 28, 32);
      this.id_final.id_break = 100.0F;
      var8 += 6;
      var9 = var9 + 8 + (var4 ? 1 : -1);
      RenderSystem.enableRescaleNormal();
      rdn_3 var11 = var2.id_protected();
      this.id_final.id_class(var11, var8, var9);
      this.id_final.id_class(this.id_super, var11, (float)var8, (float)var9);
      this.id_final.id_break = 0.0F;
   }

   protected boolean id_class(Ml_1 var1, rdX_2 var2, int var3, int var4) {
      int var5 = var2.id_extends();
      int var6 = 28 * var5;
      int var7 = 0;
      if (var2.id_volatile()) {
         var6 = this.id_synchronized - 28 * (6 - var5) + 2;
      } else if (var5 > 0) {
         var6 += var5;
      }

      if (var2.id_native()) {
         var7 -= 32;
      } else {
         var7 += this.id_return;
      }

      if (this.id_class(var6 + 3, var7 + 3, 23, 27, (double)var3, (double)var4)) {
         this.id_class(var1, var2.id_byte(), var3, var4);
         return true;
      } else {
         return false;
      }
   }

   private void id_class(String var1) {
      int var2 = var1.indexOf(58);
      Predicate var3;
      if (var2 == -1) {
         var3 = var1x -> var1x.id_break().contains(var1);
      } else {
         String var4 = var1.substring(0, var2).trim();
         String var5 = var1.substring(var2 + 1).trim();
         var3 = var2x -> var2x.id_byte().contains(var4) && var2x.id_break().contains(var5);
      }

      rlW_2 var6 = rlc_3.id_class();
      var6.id_break().stream().filter(var3).forEach(var2x -> {
         rlb_3 var3x = this.P.put(var2x, var6.id_class(var2x));
      });
   }

   @Override
   public void id_class(rJY var1, int var2, int var3, rXa_1 var4) {
      if (this.id_class(var1)) {
         this.id_boolean.id_native();
         this.id_boolean.id_native(0);
      }

      boolean var5 = var4 == rXa_1.QUICK_MOVE;
      var4 = var2 == -999 && var4 == rXa_1.PICKUP ? rXa_1.THROW : var4;
      if (var1 == null && id_private != rdX_2.id_final.id_class() && var4 != rXa_1.QUICK_CRAFT) {
         rhz_3 var14 = (rhz_3)((cb_3)this.id_volatile.id_class[57]).id_implements[1];
         if (!var14.id_finally().id_class() && this.r) {
            if (var3 == 0) {
               ((cb_3)this.id_volatile.id_class[57]).id_class(var14.id_finally(), true);
               ((Ax_1)this.id_volatile.id_class[55]).id_class(var14.id_finally());
               var14.id_private(rdn_3.id_break);
            }

            if (var3 == 1) {
               rdn_3 var19 = var14.id_finally().id_class(1);
               ((cb_3)this.id_volatile.id_class[57]).id_class(var19, true);
               ((Ax_1)this.id_volatile.id_class[55]).id_class(var19);
            }
         }
      } else {
         if (var1 != null && !var1.id_class((cb_3)this.id_volatile.id_class[57])) {
            return;
         }

         if (var1 == this.id_for && var5) {
            for (int var13 = 0; var13 < ((rJT)((cb_3)this.id_volatile.id_class[57]).id_implements[3]).id_extends().size(); var13++) {
               ((Ax_1)this.id_volatile.id_class[55]).id_class(rdn_3.id_break, var13);
            }
         } else if (id_private == rdX_2.id_final.id_class()) {
            if (var1 == this.id_for) {
               ((rhz_3)((cb_3)this.id_volatile.id_class[57]).id_implements[1]).id_private(rdn_3.id_break);
            } else if (var4 == rXa_1.THROW && var1 != null && var1.id_break()) {
               rdn_3 var6 = var1.id_class(var3 == 0 ? 1 : var1.id_class().id_byte());
               rdn_3 var7 = var1.id_class();
               ((cb_3)this.id_volatile.id_class[57]).id_class(var6, true);
               ((Ax_1)this.id_volatile.id_class[55]).id_class(var6);
               ((Ax_1)this.id_volatile.id_class[55]).id_class(var7, ((FL)var1).id_class.id_protected);
            } else if (var4 == rXa_1.THROW && !((rhz_3)((cb_3)this.id_volatile.id_class[57]).id_implements[1]).id_finally().id_class()) {
               ((cb_3)this.id_volatile.id_class[57]).id_class(((rhz_3)((cb_3)this.id_volatile.id_class[57]).id_implements[1]).id_finally(), true);
               ((Ax_1)this.id_volatile.id_class[55]).id_class(((rhz_3)((cb_3)this.id_volatile.id_class[57]).id_implements[1]).id_finally());
               ((rhz_3)((cb_3)this.id_volatile.id_class[57]).id_implements[1]).id_private(rdn_3.id_break);
            } else {
               ((rJT)((cb_3)this.id_volatile.id_class[57]).id_implements[3])
                  .id_class(var1 == null ? var2 : ((FL)var1).id_class.id_protected, var3, var4, (cb_3)this.id_volatile.id_class[57]);
               ((rJT)((cb_3)this.id_volatile.id_class[57]).id_implements[3]).id_native();
            }
         } else if (var4 != rXa_1.QUICK_CRAFT && var1.id_byte == id_case) {
            rhz_3 var12 = (rhz_3)((cb_3)this.id_volatile.id_class[57]).id_implements[1];
            rdn_3 var17 = var12.id_finally();
            rdn_3 var20 = var1.id_class();
            if (var4 == rXa_1.SWAP) {
               if (!var20.id_class()) {
                  rdn_3 var23 = var20.id_implements();
                  var23.id_throws(var23.id_byte());
                  ((rhz_3)((cb_3)this.id_volatile.id_class[57]).id_implements[1]).id_break(var3, var23);
                  ((rJT)((cb_3)this.id_volatile.id_class[57]).id_implements[3]).id_native();
               }

               return;
            }

            if (var4 == rXa_1.CLONE) {
               if (var12.id_finally().id_class() && var1.id_break()) {
                  rdn_3 var22 = var1.id_class().id_implements();
                  var22.id_throws(var22.id_byte());
                  var12.id_private(var22);
               }

               return;
            }

            if (var4 == rXa_1.THROW) {
               if (!var20.id_class()) {
                  rdn_3 var21 = var20.id_implements();
                  var21.id_throws(var3 == 0 ? 1 : var21.id_byte());
                  ((cb_3)this.id_volatile.id_class[57]).id_class(var21, true);
                  ((Ax_1)this.id_volatile.id_class[55]).id_class(var21);
               }

               return;
            }

            if (!var17.id_class() && !var20.id_class() && var17.id_class(var20) && rdn_3.id_class(var17, var20)) {
               if (var3 == 0) {
                  if (var5) {
                     var17.id_throws(var17.id_byte());
                  } else if (var17.id_char() < var17.id_byte()) {
                     var17.id_case(1);
                  }
               } else {
                  var17.id_catch(1);
               }
            } else if (!var20.id_class() && var17.id_class()) {
               var12.id_private(var20.id_implements());
               var17 = var12.id_finally();
               if (var5) {
                  var17.id_throws(var17.id_byte());
               }
            } else if (var3 == 0) {
               var12.id_private(rdn_3.id_break);
            } else {
               var12.id_finally().id_catch(1);
            }
         } else if (this.id_instanceof != null) {
            rdn_3 var11 = var1 == null ? rdn_3.id_break : this.id_instanceof.id_class(var1.id_protected).id_class();
            this.id_instanceof.id_class(var1 == null ? var2 : var1.id_protected, var3, var4, (cb_3)this.id_volatile.id_class[57]);
            if (rJr_1.id_byte(var3) == 2) {
               for (int var15 = 0; var15 < 9; var15++) {
                  ((Ax_1)this.id_volatile.id_class[55]).id_class(this.id_instanceof.id_class(45 + var15).id_class(), 36 + var15);
               }
            } else if (var1 != null) {
               rdn_3 var16 = this.id_instanceof.id_class(var1.id_protected).id_class();
               ((Ax_1)this.id_volatile.id_class[55]).id_class(var16, var1.id_protected - this.id_instanceof.id_throws.size() + 9 + 36);
               int var8 = 45 + var3;
               if (var4 == rXa_1.SWAP) {
                  ((Ax_1)this.id_volatile.id_class[55]).id_class(var11, var8 - this.id_instanceof.id_throws.size() + 9 + 36);
               } else if (var4 == rXa_1.THROW && !var11.id_class()) {
                  rdn_3 var9 = var11.id_implements();
                  var9.id_throws(var3 == 0 ? 1 : var9.id_byte());
                  ((cb_3)this.id_volatile.id_class[57]).id_class(var9, true);
                  ((Ax_1)this.id_volatile.id_class[55]).id_class(var9);
               }

               ((rJT)((cb_3)this.id_volatile.id_class[57]).id_implements[3]).id_native();
            }
         }
      }
   }

   @Override
   public boolean id_class(int var1, int var2, int var3) {
      this.id_switch = false;
      if (id_private != rdX_2.id_catch.id_class()) {
         if (((Qw_1)this.id_volatile.id_class[20]).v.id_class(var1, var2)) {
            this.id_switch = true;
            this.id_class(rdX_2.id_catch);
            return true;
         } else {
            return super.id_class(var1, var2, var3);
         }
      } else {
         boolean var4 = !this.id_class(this.id_interface) || this.id_interface.id_break();
         boolean var5 = Ve_1.id_class(var1, var2).id_throws().isPresent();
         if (var4 && var5 && this.id_class(var1, var2)) {
            this.id_switch = true;
            return true;
         } else {
            String var6 = this.id_boolean.id_private();
            if (this.id_boolean.id_class(var1, var2, var3)) {
               if (!Objects.equals(var6, this.id_boolean.id_private())) {
                  this.id_char();
               }

               return true;
            } else {
               return this.id_boolean.aO_() && this.id_boolean.id_int() && var1 != 256 ? true : super.id_class(var1, var2, var3);
            }
         }
      }
   }

   private boolean id_class(rJY var1) {
      return var1 != null && var1.id_byte == id_case;
   }

   @Override
   public void id_class(QY var1, int var2, int var3) {
      String var4 = this.id_boolean.id_private();
      this.id_break(var1, var2, var3);
      this.id_boolean.id_class(var4);
      if (!this.id_boolean.id_private().isEmpty()) {
         this.id_char();
      }
   }

   @Override
   public boolean id_class(char var1, int var2) {
      if (this.id_switch) {
         return false;
      } else if (id_private != rdX_2.id_catch.id_class()) {
         return false;
      } else {
         String var3 = this.id_boolean.id_private();
         if (this.id_boolean.id_class(var1, var2)) {
            if (!Objects.equals(var3, this.id_boolean.id_private())) {
               this.id_char();
            }

            return true;
         } else {
            return false;
         }
      }
   }

   @Override
   public boolean id_class(double var1, double var3, int var5) {
      if (var5 == 0) {
         double var6 = var1 - (double)this.id_char;
         double var8 = var3 - (double)this.id_abstract;
         this.id_finally = false;

         for (rdX_2 var13 : rdX_2.id_class) {
            if (this.id_class(var13, var6, var8)) {
               this.id_class(var13);
               return true;
            }
         }
      }

      return super.id_class(var1, var3, var5);
   }

   @Override
   protected void id_class(Ml_1 var1, int var2, int var3) {
      rdX_2 var4 = rdX_2.id_class[id_private];
      if (var4.id_catch()) {
         RenderSystem.disableBlend();
         this.id_super.id_byte(var1, var4.id_byte(), 8.0F, 6.0F, 4210752);
      }
   }

   @Override
   public boolean id_break(int var1, int var2, int var3) {
      this.id_switch = false;
      return super.id_break(var1, var2, var3);
   }

   @Override
   public boolean id_break(double var1, double var3, int var5) {
      if (var5 == 0) {
         double var6 = var1 - (double)this.id_char;
         double var8 = var3 - (double)this.id_abstract;

         for (rdX_2 var13 : rdX_2.id_class) {
            if (this.id_class(var13, var6, var8)) {
               return true;
            }
         }

         if (id_private != rdX_2.id_final.id_class() && this.id_protected(var1, var3)) {
            this.id_finally = this.id_abstract();
            return true;
         }
      }

      return super.id_break(var1, var3, var5);
   }

   @Override
   protected void id_throws() {
      int var1 = this.id_char;
      super.id_throws();
      if (this.id_boolean != null && this.id_char != var1) {
         this.id_boolean.id_final(this.id_char - 125);
      }
   }

   @Override
   public boolean id_finally() {
      return false;
   }

   protected boolean id_protected(double var1, double var3) {
      int var5 = this.id_char;
      int var6 = this.id_abstract;
      int var7 = var5 + 175;
      int var8 = var6 + 18;
      int var9 = var7 + 14;
      int var10 = var8 + 112;
      return var1 >= (double)var7 && var3 >= (double)var8 && var1 < (double)var9 && var3 < (double)var10;
   }

   @Override
   public void id_private() {
      if (!((Ax_1)this.id_volatile.id_class[55]).id_catch()) {
         this.id_volatile.id_break(new FH((cb_3)this.id_volatile.id_class[57]));
      } else if (this.id_boolean != null) {
         this.id_boolean.id_catch();
      }
   }

   private boolean id_abstract() {
      return id_private != rdX_2.id_final.id_class() && rdX_2.id_class[id_private].id_implements() && this.id_instanceof.id_class();
   }

   @Override
   public List<LZ> id_native() {
      return null;
   }

   @Override
   protected void v_() {
      if (((Ax_1)this.id_volatile.id_class[55]).id_catch()) {
         super.v_();
         ((Qj_1)this.id_volatile.id_class[23]).id_class(true);
         this.id_boolean = new Lu_1(this.id_super, this.id_char + 82, this.id_abstract + 6, 80, 9, new rgn_3("itemGroup.search"));
         this.id_boolean.id_implements(50);
         this.id_boolean.id_protected(false);
         this.id_boolean.id_private(false);
         this.id_boolean.id_finally(16777215);
         this.id_native.add(this.id_boolean);
         int var1 = id_private;
         id_private = -1;
         this.id_class(rdX_2.id_class[var1]);
         ((rJT)((cb_3)this.id_volatile.id_class[57]).id_implements[3]).id_break(this.id_double);
         this.id_double = new FZ(this.id_volatile);
         ((rJT)((cb_3)this.id_volatile.id_class[57]).id_implements[3]).id_class(this.id_double);
      } else {
         this.id_volatile.id_break(new FH((cb_3)this.id_volatile.id_class[57]));
      }
   }

   @Override
   public void w_() {
      super.w_();
      if ((cb_3)this.id_volatile.id_class[57] != null && (rhz_3)((cb_3)this.id_volatile.id_class[57]).id_implements[1] != null) {
         ((rJT)((cb_3)this.id_volatile.id_class[57]).id_implements[3]).id_break(this.id_double);
      }

      ((Qj_1)this.id_volatile.id_class[23]).id_class(false);
   }
}
