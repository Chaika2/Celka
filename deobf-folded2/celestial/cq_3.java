package celestial;

import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.datafixers.util.Pair;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.UUID;
import java.util.stream.Collectors;
import org.apache.commons.lang3.StringUtils;

public class cq_3 extends ch_3 {
   private static final rqO_2 id_throws = new rqO_2("textures/misc/vignette.png");
   private static final rqO_2 id_case = new rqO_2("textures/gui/widgets.png");
   private static final rqO_2 id_catch = new rqO_2("textures/misc/pumpkinblur.png");
   private static final rgP_2 id_private = new rgn_3("demo.demoExpired");
   private final Random id_implements = new Random();
   private final QY id_finally;
   private final Hz_1 id_extends;
   private final cI_2 id_native;
   private int id_volatile;
   private rgP_2 id_final;
   private int id_package;
   private boolean id_int;
   private boolean id_new;
   public float id_class = 1.0F;
   private int id_continue;
   private rdn_3 id_super = rdn_3.id_break;
   private final uV_2 id_this;
   private final uo_3 id_else;
   private final cY_2 id_synchronized;
   private final uR_2 id_return;
   private final uj_3 id_public;
   private int id_goto;
   private rgP_2 id_while;
   private rgP_2 id_try;
   private int id_instanceof;
   private int id_throw;
   private int id_interface;
   private int id_char;
   private int id_abstract;
   private long id_long;
   private long id_float;
   private int id_void;
   private int id_static;
   private int id_import;
   private final Map<rVU, List<ur_3>> id_short = Maps.newHashMap();
   private final Set<String> id_default = new HashSet<>();
   private rnP_2 id_const;

   private void id_byte(Ml_1 var1) {
      Qw_1 var2 = (Qw_1)this.id_finally.id_class[20];
      if ((var2.id_volatile().id_class() || ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_private().K().aJ_())
         && (((Ax_1)this.id_finally.id_class[55]).id_native() != rRl_1.SPECTATOR || this.id_class((rjG_2)this.id_finally.id_class[64]))) {
         if (var2.R && !var2.g && !((cb_3)this.id_finally.id_class[57]).sW() && !var2.id_switch) {
            RenderSystem.pushMatrix();
            RenderSystem.translatef((float)(this.id_void / 2), (float)(this.id_static / 2), (float)this.h_());
            ly_3 var8 = ((Hh_1)this.id_finally.id_class[16]).id_finally();
            RenderSystem.rotatef(var8.id_protected(), -1.0F, 0.0F, 0.0F);
            RenderSystem.rotatef(var8.id_throws(), 0.0F, 1.0F, 0.0F);
            RenderSystem.scalef(-1.0F, -1.0F, -1.0F);
            RenderSystem.renderCrosshair(10);
            RenderSystem.popMatrix();
         } else {
            RenderSystem.blendFuncSeparate(OP.ONE_MINUS_DST_COLOR, MK.ONE_MINUS_SRC_COLOR, OP.ONE, MK.ZERO);
            if (!((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_finally().id_class(rrAa_1.id_class()).id_byte()) {
               this.id_break(var1, (this.id_void - 15) / 2, (this.id_static - 15) / 2, 0, 0, 15, 15);
               if (((Qw_1)this.id_finally.id_class[20]).id_interface == VX.CROSSHAIR) {
                  float var3 = ((cb_3)this.id_finally.id_class[57]).id_class(0.0F, false);
                  boolean var4 = false;
                  if ((an_3)this.id_finally.id_class[63] != null && (an_3)this.id_finally.id_class[63] instanceof iB_2 && var3 >= 1.0F) {
                     var4 = ((cb_3)this.id_finally.id_class[57]).id_byte(false) > 5.0F;
                     var4 &= ((an_3)this.id_finally.id_class[63]).BM();
                  }

                  int var5 = this.id_static / 2 - 7 + 16;
                  int var6 = this.id_void / 2 - 8;
                  if (var4) {
                     this.id_break(var1, var6, var5, 68, 94, 16, 16);
                  } else if (var3 < 1.0F) {
                     int var7 = (int)(var3 * 17.0F);
                     this.id_break(var1, var6, var5, 36, 94, 16, 4);
                     this.id_break(var1, var6, var5, 52, 94, var7, 4);
                  }
               }
            }
         }
      }
   }

   public int id_int() {
      return this.id_import;
   }

   public cq_3(QY var1) {
      this.id_finally = var1;
      this.id_extends = var1.id_float();
      this.id_this = new uV_2(var1);
      this.id_synchronized = new cY_2(var1);
      this.id_native = new cI_2(var1);
      this.id_return = new uR_2(var1, this);
      this.id_public = new uj_3(var1);
      this.id_else = new uo_3(var1);

      for (rVU var5 : rVU.values()) {
         this.id_short.put(var5, Lists.newArrayList());
      }

      this.id_short.get(rVU.CHAT).add(new uP_2(var1));
      this.id_short.get(rVU.SYSTEM).add(new uP_2(var1));
      this.id_short.get(rVU.GAME_INFO).add(new uB_2(var1));
      this.id_class();
   }

   private iB_2 id_this() {
      rhd_3 var1 = this.id_super();
      if (var1 != null) {
         an_3 var2 = var1.ra();
         if (var2 == null) {
            return null;
         }

         if (var2 instanceof iB_2) {
            return (iB_2)var2;
         }
      }

      return null;
   }

   public void id_class(float var1, float var2, float var3, rhd_3 var4, rdn_3 var5, boolean var6) {
      if (!var5.id_class()) {
         int var7 = var5.id_interface();
         float var8 = (float)var7 - var3;
         if (var8 > 0.0F) {
            RenderSystem.pushMatrix();
            float var9 = 1.0F + var8 / 5.0F;
            RenderSystem.translatef(var1 + 8.0F, var2 + 12.0F, 0.0F);
            RenderSystem.scalef(1.0F / var9, (var9 + 1.0F) / 2.0F, 1.0F);
            RenderSystem.translatef(-(var1 + 8.0F), -(var2 + 12.0F), 0.0F);
         }

         this.id_extends.id_class(var4, var5, var1, var2);
         if (var8 > 0.0F) {
            RenderSystem.popMatrix();
         }

         this.id_extends.id_class((cm_3)this.id_finally.id_class[15], var5, var1, var2);
         if (var6) {
            int var10 = var5.id_class((rhd_3)((cb_3)this.id_finally.id_class[57]));
            this.id_extends.id_class((cm_3)this.id_finally.id_class[15], var5, var1, var2, var10 + "");
         }
      }
   }

   public void id_class(Ml_1 var1, float var2) {
      this.id_void = this.id_finally.id_else().id_super();
      this.id_static = this.id_finally.id_else().id_this();
      cm_3 var3 = this.id_catch();
      RenderSystem.enableBlend();
      if (rrbb_3.A()) {
         this.id_break(this.id_finally.id_catch());
      } else {
         RenderSystem.enableDepthTest();
         RenderSystem.defaultBlendFunc();
      }

      rrnE_2.id_class(var1, var2);
      if (((Ax_1)this.id_finally.id_class[55]).id_native() == rRl_1.SPECTATOR) {
         this.id_synchronized.id_class(var1, var2);
      } else if (!((Qw_1)this.id_finally.id_class[20]).g) {
         this.id_class(var2, var1);
      }

      if (!((Qw_1)this.id_finally.id_class[20]).g) {
         RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
         this.id_finally.A().id_class(id_protected);
         RenderSystem.enableBlend();
         RenderSystem.enableAlphaTest();
         this.id_byte(var1);
         MT.id_throws();
         RenderSystem.defaultBlendFunc();
         if (((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_private().h().id_continue()) {
            this.id_public.id_class(var1);
         }

         RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
         this.id_finally.A().id_class(id_protected);
         if (((Ax_1)this.id_finally.id_class[55]).id_class()) {
            this.id_protected(var1);
         }

         this.id_throws(var1);
         RenderSystem.disableBlend();
         int var4 = this.id_void / 2 - 91;
         if (((cb_3)this.id_finally.id_class[57]).L()) {
            this.id_class(var1, var4);
         } else if (((Ax_1)this.id_finally.id_class[55]).id_throws()) {
            this.id_break(var1, var4);
         }

         if (((Qw_1)this.id_finally.id_class[20]).id_else && ((Ax_1)this.id_finally.id_class[55]).id_native() != rRl_1.SPECTATOR) {
            this.id_class(var1);
         } else if (((cb_3)this.id_finally.id_class[57]).id_native()) {
            this.id_synchronized.id_class(var1);
         }

         this.id_synchronized.id_class(var1);
      }

      if (((cb_3)this.id_finally.id_class[57]).su() > 0) {
         RenderSystem.disableDepthTest();
         RenderSystem.disableAlphaTest();
         float var10 = (float)((cb_3)this.id_finally.id_class[57]).su();
         float var5 = var10 / 100.0F;
         if (var5 > 1.0F) {
            var5 = 1.0F - (var10 - 100.0F) / 10.0F;
         }

         int var6 = (int)(220.0F * var5) << 24 | 1052704;
         id_class(var1, 0, 0, this.id_void, this.id_static, var6);
         RenderSystem.enableAlphaTest();
         RenderSystem.enableDepthTest();
         RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
      }

      if (this.id_finally.id_int()) {
         this.id_break(var1);
      }

      if (((Qw_1)this.id_finally.id_class[20]).R) {
         this.id_this.id_class(var1);
      }

      if (!((Qw_1)this.id_finally.id_class[20]).g) {
         boolean var11 = ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_private().h().id_new();
         if (this.id_final != null && this.id_package > 0 && (var11 || this.id_final instanceof rVe_1)) {
            float var12 = (float)this.id_package - var2;
            int var15 = (int)(var12 * 255.0F / 20.0F);
            if (var15 > 255) {
               var15 = 255;
            }

            if (var15 > 8) {
               RenderSystem.pushMatrix();
               RenderSystem.translatef((float)(this.id_void / 2), (float)(this.id_static - 68 + this.id_import + 15), 0.0F);
               RenderSystem.enableBlend();
               RenderSystem.defaultBlendFunc();
               int var7 = 16777215;
               if (this.id_int) {
                  var7 = rfU_2.id_case(var12 / 50.0F, 0.7F, 0.6F) & 16777215;
               }

               int var8 = var15 << 24 & 0xFF000000;
               int var9 = var3.id_class(this.id_final);
               this.id_class(var1, -4, var9, 16777215 | var8);
               if (this.id_new) {
                  var3.id_break(var1, this.id_final, (float)(-var9 / 2), -4.0F, var7 | var8);
               } else {
                  var3.id_byte(var1, this.id_final, (float)(-var9 / 2), -4.0F, var7 | var8);
               }

               RenderSystem.disableBlend();
               RenderSystem.popMatrix();
            }
         }

         if (this.id_while != null && this.id_goto > 0 && (var11 || this.id_while instanceof rVe_1)) {
            float var13 = (float)this.id_goto - var2;
            int var16 = 255;
            if (this.id_goto > this.id_interface + this.id_throw) {
               float var19 = (float)(this.id_instanceof + this.id_throw + this.id_interface) - var13;
               var16 = (int)(var19 * 255.0F / (float)this.id_instanceof);
            }

            if (this.id_goto <= this.id_interface) {
               var16 = (int)(var13 * 255.0F / (float)this.id_interface);
            }

            var16 = rfU_2.id_class(var16, 0, 255);
            if (var16 > 8) {
               RenderSystem.pushMatrix();
               RenderSystem.translatef((float)(this.id_void / 2), (float)(this.id_static / 2), 0.0F);
               RenderSystem.enableBlend();
               RenderSystem.defaultBlendFunc();
               RenderSystem.pushMatrix();
               RenderSystem.scalef(4.0F, 4.0F, 4.0F);
               int var20 = var16 << 24 & 0xFF000000;
               int var22 = var3.id_class(this.id_while);
               this.id_class(var1, -10, var22, 16777215 | var20);
               var3.id_break(var1, this.id_while, (float)(-var22 / 2), -10.0F, 16777215 | var20);
               RenderSystem.popMatrix();
               if (this.id_try != null) {
                  RenderSystem.pushMatrix();
                  RenderSystem.scalef(2.0F, 2.0F, 2.0F);
                  int var26 = var3.id_class(this.id_try);
                  this.id_class(var1, 5, var26, 16777215 | var20);
                  var3.id_break(var1, this.id_try, (float)(-var26 / 2), 5.0F, 16777215 | var20);
                  RenderSystem.popMatrix();
               }

               RenderSystem.disableBlend();
               RenderSystem.popMatrix();
            }
         }

         this.id_else.id_class(var1);
         rns_3 var14 = ((gm_3)this.id_finally.id_class[56]).id_package();
         rnP_2 var18 = null;
         rnB_2 var21 = var14.id_private(((cb_3)this.id_finally.id_class[57]).i());
         if (var21 != null) {
            int var23 = var21.id_volatile().id_class();
            if (var23 >= 0) {
               var18 = var14.id_class(3 + var23);
            }
         }

         rnP_2 var24 = var18 != null ? var18 : var14.id_class(1);
         this.id_const = var24;
         this.id_default.clear();
         if (var24 != null) {
            this.id_class(var1, var24);
         }

         RenderSystem.enableBlend();
         RenderSystem.defaultBlendFunc();
         RenderSystem.disableAlphaTest();
         RenderSystem.pushMatrix();
         RenderSystem.translatef(
            0.0F, (float)(this.id_static - 48) - ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_private().w().id_new(), 0.0F
         );
         this.id_native.id_class(var1, this.id_volatile);
         RenderSystem.popMatrix();
         var24 = var14.id_class(0);
         rrnB_2.id_class(var1, var2);
         if (!((Qw_1)this.id_finally.id_class[20]).F.id_protected()
            || this.id_finally.id_switch() && ((Aq_1)((cb_3)this.id_finally.id_class[57]).id_break[0]).id_throws().size() <= 1 && var24 == null) {
            this.id_return.id_class(false);
         } else {
            this.id_return.id_class(true);
            this.id_return.id_class(var1, this.id_void, var14, var24);
         }
      }

      RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
      RenderSystem.enableAlphaTest();
   }

   public void id_class(rgP_2 var1) {
      this.id_class(new rgn_3("record.nowPlaying", var1), true, false);
   }

   private void id_class(an_3 var1) {
      if (var1 != null) {
         float var2 = rfU_2.id_class(1.0F - var1.rX(), 0.0F, 1.0F);
         this.id_class = (float)((double)this.id_class + (double)(var2 - this.id_class) * 0.01);
      }
   }

   private int id_class(iB_2 var1) {
      if (var1 != null && var1.R()) {
         float var2 = var1.SK();
         int var3 = (int)(var2 + 0.5F) / 2;
         if (var3 > 30) {
            var3 = 30;
         }

         return var3;
      } else {
         return 0;
      }
   }

   public void id_class() {
      this.id_instanceof = 10;
      this.id_throw = 70;
      this.id_interface = 20;
   }

   public void id_class(rVU var1, rgP_2 var2, UUID var3) {
      if (!this.id_finally.id_class(var3) && (!((Qw_1)this.id_finally.id_class[20]).M || !this.id_finally.id_class(this.id_break(var2)))) {
         for (ur_3 var5 : this.id_short.get(var1)) {
            var5.id_class(var1, var2, var3);
         }
      }
   }

   public void id_class(rgP_2 var1, rgP_2 var2, int var3, int var4, int var5) {
      if (var1 == null && var2 == null && var3 < 0 && var4 < 0 && var5 < 0) {
         this.id_while = null;
         this.id_try = null;
         this.id_goto = 0;
      } else if (var1 != null) {
         this.id_while = var1;
         this.id_goto = this.id_instanceof + this.id_throw + this.id_interface;
      } else if (var2 != null) {
         this.id_try = var2;
      } else {
         if (var3 >= 0) {
            this.id_instanceof = var3;
         }

         if (var4 >= 0) {
            this.id_throw = var4;
         }

         if (var5 >= 0) {
            this.id_interface = var5;
         }

         if (this.id_goto > 0) {
            this.id_goto = this.id_instanceof + this.id_throw + this.id_interface;
         }
      }
   }

   public void id_class(rgP_2 var1, boolean var2, boolean var3) {
      this.id_final = var1;
      this.id_package = 60;
      this.id_int = var2;
      this.id_new = var3;
   }

   public void id_class(Ml_1 var1, int var2) {
      this.id_finally.A().id_class(ch_3.id_protected);
      float var3 = ((cb_3)this.id_finally.id_class[57]).E();
      short var4 = 182;
      int var5 = (int)(var3 * 183.0F);
      int var6 = this.id_static - 32 + 3;
      this.id_break(var1, var2, var6, 0, 84, 182, 5);
      if (var5 > 0) {
         this.id_break(var1, var2, var6, 0, 89, var5, 5);
      }
   }

   private void id_class(Ml_1 var1, rnP_2 var2) {
      rns_3 var3 = var2.id_class();
      Collection var4 = var3.id_class(var2);
      List var5 = var4.stream().filter(var0 -> var0.id_throws() != null && !var0.id_throws().startsWith("#")).collect(Collectors.toList());
      if (var5.size() > 15) {
         var4 = Lists.newArrayList(Iterables.skip(var5, var4.size() - 15));
      } else {
         var4 = var5;
      }

      ArrayList var6 = Lists.newArrayListWithCapacity(var4.size());
      boolean var7 = ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_private().id_throws().id_continue();
      rgP_2 var8 = var2.id_protected();
      int var9 = this.id_catch().id_class(var8);
      int var10 = var9;
      int var11 = this.id_catch().id_break(": ");

      for (rAa_1 var13 : var4) {
         rnB_2 var14 = var3.id_private(var13.id_throws());
         rVi_1 var15 = rnB_2.id_class(var14, new rgN_2(var13.id_throws()), rnO_2.values());
         var6.add(Pair.of(var13, var15));
         var10 = Math.max(var10, this.id_catch().id_class(var15) + var11 + this.id_catch().id_break(Integer.toString(var13.id_break())));
         this.id_default.add(var15.getString());
      }

      if (((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_private().h().id_this()) {
         int var26 = var4.size() * 9;
         int var27 = this.id_static / 2 + var26 / 2;
         int var28 = this.id_void - var10 - 3;
         int var29 = 0;
         int var16 = ((Qw_1)this.id_finally.id_class[20]).id_break(0.3F);
         int var17 = ((Qw_1)this.id_finally.id_class[20]).id_break(0.4F);

         for (Pair var19 : var6) {
            var29++;
            rAa_1 var20 = (rAa_1)var19.getFirst();
            rgP_2 var21 = (rgP_2)var19.getSecond();
            String var22 = "" + rgF_2.RED + var20.id_break();
            int var23 = var27 - var29 * 9;
            int var24 = this.id_void - 3 + 2;
            id_class(var1, var28 - 2, var23, var24, var23 + 9, var16);
            this.id_catch().id_byte(var1, var21, (float)var28, (float)var23, -1);
            this.id_catch().id_break(var1, var22, (float)(var24 - this.id_catch().id_break(var22)), (float)var23, -1);
            if (var29 == var4.size()) {
               id_class(var1, var28 - 2, var23 - (var7 ? 2 : 1), var24, var23, var16);
               if (!var7) {
                  id_class(var1, var28 - 2, var23 - 9 - 1, var24, var23 - 1, var17);
                  this.id_catch().id_byte(var1, var8, (float)(var28 + var10 / 2 - var9 / 2), (float)(var23 - 9), -1);
               }
            }
         }
      }
   }

   private boolean id_class(rjG_2 var1) {
      if (var1 == null) {
         return false;
      } else if (var1.id_byte() == rjM_2.ENTITY) {
         return ((rfo_3)var1).id_class() instanceof rJZ;
      } else if (var1.id_byte() == rjM_2.BLOCK) {
         rfH_2 var2 = ((rff_3)var1).id_class();
         gm_3 var3 = (gm_3)this.id_finally.id_class[56];
         return var3.id_byte(var2).id_break(var3, var2) != null;
      } else {
         return false;
      }
   }

   public void id_class(Ml_1 var1) {
      if (this.id_continue > 0 && !this.id_super.id_class()) {
         rVi_1 var2 = new rgN_2("").id_class(this.id_super.id_continue()).id_class(this.id_super.id_synchronized().color);
         if (this.id_super.id_this()) {
            var2.id_class(rgF_2.ITALIC);
         }

         Object var3 = var2;
         if (rrxr_3.PQ.id_byte()) {
            var3 = (rgP_2)rrxr_3.id_private(this.id_super, rrxr_3.PQ, var2);
         }

         int var4 = this.id_catch().id_class((rgS_2)var3);
         int var5 = (this.id_void - var4) / 2;
         int var6 = this.id_static - 59;
         if (!((Ax_1)this.id_finally.id_class[55]).id_class()) {
            var6 += 14;
         }

         int var7 = (int)((float)this.id_continue * 256.0F / 10.0F);
         if (var7 > 255) {
            var7 = 255;
         }

         if (var7 > 0) {
            RenderSystem.pushMatrix();
            RenderSystem.enableBlend();
            RenderSystem.defaultBlendFunc();
            id_class(var1, var5 - 2, var6 - 2, var5 + var4 + 2, var6 + 9 + 2, ((Qw_1)this.id_finally.id_class[20]).id_class(0));
            cm_3 var8 = null;
            if (rrxr_3.PG.id_byte()) {
               var8 = (cm_3)rrxr_3.id_private(this.id_super.id_break(), rrxr_3.PG, this.id_super);
            }

            if (var8 != null) {
               var4 = (this.id_void - var8.id_class((rgS_2)var3)) / 2;
               var8.id_break(var1, ((rgP_2)var3).id_catch(), (float)var5, (float)var6, 16777215 + (var7 << 24));
            } else {
               this.id_catch().id_break(var1, (rgP_2)var3, (float)var5, (float)var6, 16777215 + (var7 << 24));
            }

            RenderSystem.disableBlend();
            RenderSystem.popMatrix();
         }
      }
   }

   private void id_class(Ml_1 var1, int var2, int var3, int var4) {
      int var5 = ((Qw_1)this.id_finally.id_class[20]).id_break(0.0F);
      if (var5 != 0) {
         int var6 = -var3 / 2;
         id_class(var1, var6 - 2, var2 - 2, var6 + var3 + 2, var2 + 9 + 2, ryj_3.id_class(var5, var4));
      }
   }

   protected void id_class(float var1, Ml_1 var2) {
      rhd_3 var3 = this.id_super();
      if (var3 != null) {
         RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
         this.id_finally.A().id_class(id_case);
         rdn_3 var4 = var3.Sn();
         rpZ_2 var5 = var3.Su().id_class();
         int var6 = this.id_void / 2;
         int var7 = this.h_();
         this.id_class(-90);
         int var8 = this.id_static - 22;
         this.id_break(var2, var6 - 91, var8, 0, 0, 182, 22);
         this.id_break(var2, var6 - 91 - 1 + ((rhz_3)var3.id_implements[1]).id_protected * 20, this.id_static - 22 - 1, 0, 22, 24, 22);
         if (!var4.id_class()) {
            if (var5 == rpZ_2.LEFT) {
               this.id_break(var2, var6 - 91 - 29, this.id_static - 23, 24, 22, 29, 24);
            } else {
               this.id_break(var2, var6 + 91, this.id_static - 23, 53, 22, 29, 24);
            }
         }

         this.id_class(var7);
         RenderSystem.enableRescaleNormal();
         RenderSystem.enableBlend();
         RenderSystem.defaultBlendFunc();
         rrby_3.id_class(false);

         for (int var9 = 0; var9 < 9; var9++) {
            int var10 = var6 - 90 + var9 * 20 + 2;
            int var11 = this.id_static - 16 - 3;
            this.id_class((float)var10, (float)var11, var1, var3, ((rhz_3)var3.id_implements[1]).id_class.get(var9), false);
         }

         if (!var4.id_class()) {
            rrby_3.id_class(true);
            int var13 = this.id_static - 16 - 3;
            if (var5 == rpZ_2.LEFT) {
               this.id_class((float)(var6 - 91 - 26), (float)var13, var1, var3, var4, false);
            } else {
               this.id_class((float)(var6 + 91 + 10), (float)var13, var1, var3, var4, false);
            }

            rrby_3.id_class(false);
         }

         if (((Qw_1)this.id_finally.id_class[20]).id_interface == VX.HOTBAR) {
            float var14 = ((cb_3)this.id_finally.id_class[57]).id_class(0.0F, false);
            if (var14 < 1.0F) {
               int var15 = this.id_static - 20;
               int var16 = var6 + 91 + 6;
               if (var5 == rpZ_2.RIGHT) {
                  var16 = var6 - 91 - 22;
               }

               this.id_finally.A().id_class(ch_3.id_protected);
               int var12 = (int)(var14 * 19.0F);
               RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
               this.id_break(var2, var16, var15, 0, 94, 18, 18);
               this.id_break(var2, var16, var15 + 18 - var12, 18, 112 - var12, 18, var12);
            }
         }

         RenderSystem.disableRescaleNormal();
         RenderSystem.disableBlend();
      }
   }

   public void id_break(Ml_1 var1, int var2) {
      this.id_finally.A().id_class(ch_3.id_protected);
      int var3 = ((cb_3)this.id_finally.id_class[57]).sn();
      if (var3 > 0) {
         short var4 = 182;
         int var5 = (int)((Float)((cb_3)this.id_finally.id_class[57]).id_implements[21] * 183.0F);
         int var6 = this.id_static - 32 + 3;
         this.id_break(var1, var2, var6, 0, 64, 182, 5);
         if (var5 > 0) {
            this.id_break(var1, var2, var6, 0, 69, var5, 5);
         }
      }

      if ((Integer)((cb_3)this.id_finally.id_class[57]).id_implements[19] > 0) {
         int var8 = 8453920;
         if (rrbb_3.K()) {
            var8 = rrbN_2.id_class(var8);
         }

         String var9 = (Integer)((cb_3)this.id_finally.id_class[57]).id_implements[19] + "";
         int var10 = (this.id_void - this.id_catch().id_break(var9)) / 2;
         int var7 = this.id_static - 31 - 4;
         this.id_catch().id_break(var1, var9, (float)(var10 + 1), (float)var7, 0);
         this.id_catch().id_break(var1, var9, (float)(var10 - 1), (float)var7, 0);
         this.id_catch().id_break(var1, var9, (float)var10, (float)(var7 + 1), 0);
         this.id_catch().id_break(var1, var9, (float)var10, (float)(var7 - 1), 0);
         this.id_catch().id_break(var1, var9, (float)var10, (float)var7, var8);
      }
   }

   public UUID id_break(rgP_2 var1) {
      String var2 = rgL_2.id_class(var1);
      String var3 = StringUtils.substringBetween(var2, "<", ">");
      return var3 == null ? rqR_2.id_break : this.id_finally.id_volatile().id_class(var3);
   }

   private void id_break(an_3 var1) {
      if (!rrbb_3.A()) {
         RenderSystem.enableDepthTest();
         RenderSystem.blendFuncSeparate(OP.SRC_ALPHA, MK.ONE_MINUS_SRC_ALPHA, OP.ONE, MK.ZERO);
      } else {
         roE_2 var2 = ((gm_3)this.id_finally.id_class[56]).id_instanceof();
         float var3 = (float)var2.id_class(var1);
         double var4 = Math.min(var2.id_int() * (double)var2.id_new() * 1000.0, Math.abs(var2.id_extends() - var2.id_implements()));
         double var6 = Math.max((double)var2.id_continue(), var4);
         if ((double)var3 < var6) {
            var3 = 1.0F - (float)((double)var3 / var6);
         } else {
            var3 = 0.0F;
         }

         RenderSystem.disableDepthTest();
         RenderSystem.depthMask(false);
         RenderSystem.blendFuncSeparate(OP.ZERO, MK.ONE_MINUS_SRC_COLOR, OP.ONE, MK.ZERO);
         if (var3 > 0.0F) {
            RenderSystem.color4f(0.0F, var3, var3, 1.0F);
         } else {
            RenderSystem.color4f(this.id_class, this.id_class, this.id_class, 1.0F);
         }

         this.id_finally.A().id_class(id_throws);
         yb_3 var8 = yb_3.id_class();
         lD_2 var9 = var8.id_byte();
         var9.id_class(7, ju_3.id_synchronized);
         var9.id_class(0.0, (double)this.id_static, -90.0).id_class(0.0F, 1.0F).id_class();
         var9.id_class((double)this.id_void, (double)this.id_static, -90.0).id_class(1.0F, 1.0F).id_class();
         var9.id_class((double)this.id_void, 0.0, -90.0).id_class(1.0F, 0.0F).id_class();
         var9.id_class(0.0, 0.0, -90.0).id_class(0.0F, 0.0F).id_class();
         var8.id_break();
         RenderSystem.depthMask(true);
         RenderSystem.enableDepthTest();
         RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
         RenderSystem.defaultBlendFunc();
      }
   }

   public void id_break(Ml_1 var1) {
      Object var2;
      if (((gm_3)this.id_finally.id_class[56]).r() >= 120500L) {
         var2 = id_private;
      } else {
         var2 = new rgn_3("demo.remainingTime", rql_3.id_class((int)(120500L - ((gm_3)this.id_finally.id_class[56]).r())));
      }

      int var3 = this.id_catch().id_class((rgS_2)var2);
      this.id_catch().id_break(var1, (rgP_2)var2, (float)(this.id_void - var3 - 10), 5.0F, 16777215);
   }

   private int id_break(int var1) {
      return (int)Math.ceil((double)var1 / 10.0);
   }

   public cI_2 id_throws() {
      return this.id_native;
   }

   private void id_throws(Ml_1 var1) {
      iB_2 var2 = this.id_this();
      if (var2 != null) {
         int var3 = this.id_class(var2);
         if (var3 != 0) {
            int var4 = (int)Math.ceil((double)var2.Ss());
            int var5 = this.id_static - 39;
            int var6 = this.id_void / 2 + 91;
            int var7 = var5;
            byte var8 = 0;

            for (boolean var9 = false; var3 > 0; var8 += 20) {
               int var10 = Math.min(var3, 10);
               var3 -= var10;

               for (int var11 = 0; var11 < var10; var11++) {
                  byte var12 = 52;
                  byte var13 = 0;
                  int var14 = var6 - var11 * 8 - 9;
                  this.id_break(var1, var14, var7, 52 + var13 * 9, 9, 9, 9);
                  if (var11 * 2 + 1 + var8 < var4) {
                     this.id_break(var1, var14, var7, 88, 9, 9, 9);
                  }

                  if (var11 * 2 + 1 + var8 == var4) {
                     this.id_break(var1, var14, var7, 97, 9, 9, 9);
                  }
               }

               var7 -= 10;
            }
         }
      }
   }

   public void id_finally() {
      this.id_return.id_throws();
      this.id_public.id_class();
   }

   public cm_3 id_catch() {
      return (cm_3)this.id_finally.id_class[15];
   }

   public uj_3 id_extends() {
      return this.id_public;
   }

   public int id_case() {
      return this.id_volatile;
   }

   public rnP_2 id_continue() {
      return this.id_const;
   }

   public uR_2 id_implements() {
      return this.id_return;
   }

   public Set<String> id_new() {
      return this.id_default;
   }

   public int id_package() {
      return this.id_package;
   }

   private rhd_3 id_super() {
      return !(this.id_finally.id_catch() instanceof rhd_3) ? null : (rhd_3)this.id_finally.id_catch();
   }

   public void id_protected() {
      if ((gm_3)this.id_finally.id_class[56] == null) {
         rrMd_1.id_byte();
      }

      if (this.id_package > 0) {
         this.id_package--;
      }

      if (this.id_goto > 0) {
         this.id_goto--;
         if (this.id_goto <= 0) {
            this.id_while = null;
            this.id_try = null;
         }
      }

      this.id_volatile++;
      an_3 var1 = this.id_finally.id_catch();
      if (var1 != null) {
         this.id_class(var1);
      }

      if ((cb_3)this.id_finally.id_class[57] != null) {
         rdn_3 var2 = ((rhz_3)((cb_3)this.id_finally.id_class[57]).id_implements[1]).id_byte();
         boolean var3 = true;
         if (rrxr_3.PQ.id_byte()) {
            rgP_2 var4 = (rgP_2)rrxr_3.id_private(var2, rrxr_3.PQ, var2.id_continue());
            rgP_2 var5 = (rgP_2)rrxr_3.id_private(this.id_super, rrxr_3.PQ, this.id_super.id_continue());
            var3 = rrbb_3.id_class(var4, var5);
         }

         if (var2.id_class()) {
            this.id_continue = 0;
         } else if (this.id_super.id_class() || var2.id_break() != this.id_super.id_break() || !var2.id_continue().equals(this.id_super.id_continue()) || !var3
            )
          {
            this.id_continue = 40;
         } else if (this.id_continue > 0) {
            this.id_continue--;
         }

         this.id_super = var2;
      }
   }

   private void id_protected(Ml_1 var1) {
      rhd_3 var2 = this.id_super();
      if (var2 != null) {
         int var3 = rfU_2.id_case(var2.Ss());
         boolean var4 = this.id_float > (long)this.id_volatile && (this.id_float - (long)this.id_volatile) / 3L % 2L == 1L;
         long var5 = rqR_2.id_break();
         if (var3 < this.id_char && (Integer)var2.id_throws[47] > 0) {
            this.id_long = var5;
            this.id_float = (long)(this.id_volatile + 20);
         } else if (var3 > this.id_char && (Integer)var2.id_throws[47] > 0) {
            this.id_long = var5;
            this.id_float = (long)(this.id_volatile + 10);
         }

         if (var5 - this.id_long > 1000L) {
            this.id_char = var3;
            this.id_abstract = var3;
            this.id_long = var5;
         }

         this.id_char = var3;
         int var7 = this.id_abstract;
         this.id_implements.setSeed((long)this.id_volatile * 312871L);
         rpQ_2 var8 = var2.sk();
         int var9 = var8.id_class();
         int var10 = this.id_void / 2 - 91;
         int var11 = this.id_void / 2 + 91;
         int var12 = this.id_static - 39;
         float var13 = (float)var2.id_class(iQ_2.id_class);
         int var14 = rfU_2.id_case(var2.Sd());
         int var15 = rfU_2.id_case((var13 + (float)var14) / 2.0F / 10.0F);
         int var16 = Math.max(10 - (var15 - 2), 3);
         int var17 = var12 - (var15 - 1) * var16 - 10;
         int var18 = var12 - 10;
         int var19 = 0;
         int var20 = var14;
         int var21 = var2.Bq();
         int var22 = -1;
         if (var2.id_break(rLD.id_finally)) {
            var22 = this.id_volatile % rfU_2.id_case(var13 + 5.0F);
         }

         for (int var23 = 0; var23 < 10; var23++) {
            if (var21 > 0) {
               int var24 = var10 + var23 * 8;
               if (var23 * 2 + 1 < var21) {
                  this.id_break(var1, var24, var17, 34, 9, 9, 9);
               }

               if (var23 * 2 + 1 == var21) {
                  this.id_break(var1, var24, var17, 25, 9, 9, 9);
               }

               if (var23 * 2 + 1 > var21) {
                  this.id_break(var1, var24, var17, 16, 9, 9, 9);
               }
            }
         }

         boolean var36 = var2.id_break(rLD.id_super);

         for (int var37 = rfU_2.id_case((var13 + (float)var14) / 2.0F) - 1; var37 >= 0; var37--) {
            byte var25 = 16;
            if (var36) {
               var25 += 36;
            }

            byte var26 = 0;
            if (var4) {
               var26 = 1;
            }

            int var27 = rfU_2.id_case((float)(var37 + 1) / 10.0F) - 1;
            int var28 = var10 + var37 % 10 * 8;
            int var29 = var12 - var27 * var16;
            if (var3 <= 4) {
               var29 += this.id_implements.nextInt(2);
            }

            if (var20 <= 0 && var37 == var22) {
               var29 -= 2;
            }

            byte var30 = 0;
            if (((rYB)var2.id_throws[7]).id_public().id_implements()) {
               var30 = 5;
            }

            this.id_break(var1, var28, var29, 16 + var26 * 9, 9 * var30, 9, 9);
            if (var4) {
               if (var37 * 2 + 1 < var7) {
                  this.id_break(var1, var28, var29, var25 + 54, 9 * var30, 9, 9);
               }

               if (var37 * 2 + 1 == var7) {
                  this.id_break(var1, var28, var29, var25 + 63, 9 * var30, 9, 9);
               }
            }

            if (var20 > 0) {
               if (var20 == var14 && var14 % 2 == 1) {
                  this.id_break(var1, var28, var29, var25 + 153, 9 * var30, 9, 9);
                  var20--;
               } else {
                  this.id_break(var1, var28, var29, var25 + 144, 9 * var30, 9, 9);
                  var20 -= 2;
               }
            } else {
               if (var37 * 2 + 1 < var3) {
                  this.id_break(var1, var28, var29, var25 + 36, 9 * var30, 9, 9);
               }

               if (var37 * 2 + 1 == var3) {
                  this.id_break(var1, var28, var29, var25 + 45, 9 * var30, 9, 9);
               }
            }
         }

         iB_2 var38 = this.id_this();
         int var39 = this.id_class(var38);
         boolean var40 = var2.id_break(rLD.id_new);
         if (var39 != 0) {
            var19 -= 10 * this.id_break(var39);
         } else {
            for (int var41 = 0; var41 < 10; var41++) {
               int var44 = var12;
               byte var47 = 16;
               byte var50 = 0;
               if (var40) {
                  var47 += 36;
                  var50 = 13;
               }

               if (var2.sk().id_byte() <= 0.0F && this.id_volatile % (var9 * 3 + 1) == 0) {
                  var44 = var12 + (this.id_implements.nextInt(3) - 1);
               }

               int var31 = var11 - var41 * 8 - 9;
               this.id_break(var1, var31, var44, 16 + var50 * 9, 27, 9, 9);
               if (var41 * 2 + 1 < var9) {
                  this.id_break(var1, var31, var44, var47 + 36, 27, 9, 9);
               }

               if (var41 * 2 + 1 == var9) {
                  this.id_break(var1, var31, var44, var47 + 45, 27, 9, 9);
               }
            }

            var18 -= 10;
            var19 -= 10;
            float var42 = var8.id_byte();
            if (var42 > 0.0F) {
               int var45 = rfU_2.id_case(var42 / 2.0F);

               for (int var48 = 0; var48 < var45; var48++) {
                  int var51 = var12 - 10;
                  byte var53 = 16;
                  byte var32 = 0;
                  if (var40) {
                     var53 += 36;
                     var32 = 13;
                  }

                  int var33 = var11 - var48 * 8 - 9;
                  this.id_break(var1, var33, var51, 16 + var32 * 9, 27, 9, 9);
                  if ((float)(var48 * 2 + 1) < var42) {
                     this.id_break(var1, var33, var51, var53 + 36, 27, 9, 9);
                  }

                  if (var48 * 2 + 1 == rfU_2.id_case(var42)) {
                     this.id_break(var1, var33, var51, var53 + 45, 27, 9, 9);
                  }
               }

               var18 -= 10;
               var19 -= 10;
            }
         }

         int var43 = var2.ri();
         int var46 = Math.min(var2.PA(), var43);
         if (var2.id_class(rlG_2.id_break) || var46 < var43) {
            int var49 = this.id_break(var39) - 1;
            int var52 = var49 * 10;
            var18 -= var52;
            int var54 = rfU_2.id_throws((double)(var46 - 2) * 10.0 / (double)var43);
            int var55 = rfU_2.id_throws((double)var46 * 10.0 / (double)var43) - var54;

            for (int var56 = 0; var56 < var54 + var55; var56++) {
               if (var56 < var54) {
                  this.id_break(var1, var11 - var56 * 8 - 9, var18, 16, 18, 9, 9);
               } else {
                  this.id_break(var1, var11 - var56 * 8 - 9, var18, 25, 18, 9, 9);
               }
            }

            if (var2.PA() > 0) {
               var19 -= 10;
            }
         }

         this.id_import = var19;
      }
   }

   public cY_2 id_private() {
      return this.id_synchronized;
   }

   public rgP_2 id_final() {
      return this.id_final;
   }

   public String id_volatile() {
      return this.id_while == null ? "" : this.id_while.id_byte();
   }

   public void id_native() {
      this.id_this.id_class();
   }
}
