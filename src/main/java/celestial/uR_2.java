package celestial;

import com.google.common.collect.Ordering;
import com.mojang.authlib.GameProfile;
import com.mojang.blaze3d.systems.RenderSystem;
import java.awt.Color;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class uR_2 extends ch_3 {
   private static final Ordering<Aw_1> id_class = Ordering.from(new uY_2());
   private final QY id_throws;
   private final cq_3 id_case;
   private rgP_2 id_catch;
   private rgP_2 id_private;
   private long id_implements;
   private boolean id_finally;

   public static rgP_2 id_byte(Aw_1 var0) {
      return id_class(var0, rnB_2.id_class(var0.id_implements(), new rgN_2(var0.id_class().getName()), new rnO_2[]{rnO_2.SUFFIX}));
   }

   public uR_2(QY var1, cq_3 var2) {
      this.id_throws = var1;
      this.id_case = var2;
   }

   public static rgP_2 id_class(Aw_1 var0) {
      return var0.id_volatile() != null
         ? id_class(var0, var0.id_volatile().id_case())
         : id_class(var0, rnB_2.id_class(var0.id_implements(), new rgN_2(var0.id_class().getName()), rnO_2.values()));
   }

   private String id_class(rhd_3 var1) {
      float var2 = (Float)((cb_3)this.id_throws.id_class[57]).id_throws[15];
      double var3 = var1.rx() - ((cb_3)this.id_throws.id_class[57]).rx();
      double var5 = var1.BO() - ((cb_3)this.id_throws.id_class[57]).BO();
      float var7 = (float)(Math.atan2(var5, var3) * (180.0 / Math.PI)) - 90.0F;
      float var8 = rfU_2.id_catch(var7 - var2);
      String var9 = "⬆";
      if ((double)var8 >= 22.5 && (double)var8 < 67.5) {
         var9 = "⬈";
      } else if ((double)var8 >= 67.5 && (double)var8 < 112.5) {
         var9 = "➡";
      } else if ((double)var8 >= 112.5 && (double)var8 < 157.5) {
         var9 = "⬊";
      } else if ((double)var8 >= 157.5 || (double)var8 < -157.5) {
         var9 = "⬇";
      } else if ((double)var8 >= -157.5 && (double)var8 < -112.5) {
         var9 = "⬋";
      } else if ((double)var8 >= -112.5 && (double)var8 < -67.5) {
         var9 = "⬅";
      } else if ((double)var8 >= -67.5 && (double)var8 < -22.5) {
         var9 = "⬉";
      }

      return var9;
   }

   private void id_class(rnP_2 var1, int var2, String var3, int var4, int var5, Aw_1 var6, Ml_1 var7) {
      int var8 = var1.id_class().id_break(var3, var1).id_break();
      if (var1.id_case() == rnr_3.HEARTS) {
         this.id_throws.A().id_class(id_protected);
         long var9 = rqR_2.id_break();
         if (this.id_implements == var6.id_continue()) {
            if (var8 < var6.id_final()) {
               var6.id_class(var9);
               var6.id_break((long)(this.id_case.id_case() + 20));
            } else if (var8 > var6.id_final()) {
               var6.id_class(var9);
               var6.id_break((long)(this.id_case.id_case() + 10));
            }
         }

         if (var9 - var6.id_int() > 1000L || this.id_implements != var6.id_continue()) {
            var6.id_break(var8);
            var6.id_byte(var8);
            var6.id_class(var9);
         }

         var6.id_byte(this.id_implements);
         var6.id_break(var8);
         int var11 = rfU_2.id_case((float)Math.max(var8, var6.id_package()) / 2.0F);
         int var12 = Math.max(rfU_2.id_case((float)(var8 / 2)), Math.max(rfU_2.id_case((float)(var6.id_package() / 2)), 10));
         boolean var13 = var6.id_new() > (long)this.id_case.id_case() && (var6.id_new() - (long)this.id_case.id_case()) / 3L % 2L == 1L;
         if (var11 > 0) {
            int var14 = rfU_2.id_protected(Math.min((float)(var5 - var4 - 4) / (float)var12, 9.0F));
            if (var14 > 3) {
               for (int var15 = var11; var15 < var12; var15++) {
                  this.id_break(var7, var4 + var15 * var14, var2, var13 ? 25 : 16, 0, 9, 9);
               }

               for (int var19 = 0; var19 < var11; var19++) {
                  this.id_break(var7, var4 + var19 * var14, var2, var13 ? 25 : 16, 0, 9, 9);
                  if (var13) {
                     if (var19 * 2 + 1 < var6.id_package()) {
                        this.id_break(var7, var4 + var19 * var14, var2, 70, 0, 9, 9);
                     }

                     if (var19 * 2 + 1 == var6.id_package()) {
                        this.id_break(var7, var4 + var19 * var14, var2, 79, 0, 9, 9);
                     }
                  }

                  if (var19 * 2 + 1 < var8) {
                     this.id_break(var7, var4 + var19 * var14, var2, var19 >= 10 ? 160 : 52, 0, 9, 9);
                  }

                  if (var19 * 2 + 1 == var8) {
                     this.id_break(var7, var4 + var19 * var14, var2, var19 >= 10 ? 169 : 61, 0, 9, 9);
                  }
               }
            } else {
               float var20 = rfU_2.id_class((float)var8 / 20.0F, 0.0F, 1.0F);
               int var16 = (int)((1.0F - var20) * 255.0F) << 16 | (int)(var20 * 255.0F) << 8;
               String var17 = (float)var8 / 2.0F + "";
               if (var5 - ((cm_3)this.id_throws.id_class[15]).id_break(var17 + "hp") >= var4) {
                  var17 = var17 + "hp";
               }

               ((cm_3)this.id_throws.id_class[15])
                  .id_class(var7, var17, (float)((var5 + var4) / 2 - ((cm_3)this.id_throws.id_class[15]).id_break(var17) / 2), (float)var2, var16);
            }
         }
      } else {
         String var18 = "" + rgF_2.YELLOW + var8;
         ((cm_3)this.id_throws.id_class[15]).id_class(var7, var18, (float)(var5 - ((cm_3)this.id_throws.id_class[15]).id_break(var18)), (float)var2, 16777215);
      }
   }

   public void id_class(rgP_2 var1) {
      this.id_catch = var1;
   }

   public rgP_2 id_class() {
      return this.id_catch;
   }

   public static List<Aw_1> id_class(Aq_1 var0, boolean var1) {
      List var2 = id_class.sortedCopy(var0.id_throws());
      if (var1) {
         Collections.shuffle(var2);
      }

      return var2;
   }

   public static rgP_2 id_class(Aw_1 var0, rnO_2... var1) {
      return var0.id_volatile() != null
         ? id_class(var0, var0.id_volatile().id_case())
         : id_class(var0, rnB_2.id_class(var0.id_implements(), new rgN_2(var0.id_class().getName()), var1));
   }

   private static rgP_2 id_class(Aw_1 var0, rVi_1 var1) {
      return var0.id_break() == rRl_1.SPECTATOR ? var1.id_class(rgF_2.ITALIC) : var1;
   }

   public void id_class(boolean var1) {
      if (var1 && !this.id_finally) {
         this.id_implements = rqR_2.id_break();
      }

      this.id_finally = var1;
   }

   public void id_class(Ml_1 var1, int var2, rns_3 var3, rnP_2 var4) {
      Aq_1 var5 = (Aq_1)((cb_3)this.id_throws.id_class[57]).id_break[0];
      Collection var6 = var5.id_throws();
      List var7 = id_class.sortedCopy(var6);
      int var8 = 0;
      int var9 = 0;
      int var10 = 0;

      for (Aw_1 var12 : var7) {
         GameProfile var13 = var12.id_class();
         if (!var13.getId().equals(((cb_3)this.id_throws.id_class[57]).ro()) && !var12.id_super()) {
            var8++;
         }

         rVi_1 var14 = this.id_protected(var12);
         int var15 = ((cm_3)this.id_throws.id_class[15]).id_class(var14) + ((cm_3)this.id_throws.id_class[15]).id_break(String.valueOf(var12.id_byte())) - 12;
         var9 = Math.max(var9, var15);
         if (var4 != null && var4.id_case() != rnr_3.HEARTS) {
            var15 = ((cm_3)this.id_throws.id_class[15]).id_break(" " + var3.id_break(var12.id_class().getName(), var4).id_break());
            var10 = Math.max(var10, var15);
         }
      }

      var7 = var7.subList(0, Math.min(var7.size(), 80));
      int var37 = var7.size();
      int var38 = var37;

      int var39;
      for (var39 = 1; var38 > 20; var38 = (var37 + var39 - 1) / var39) {
         var39++;
      }

      boolean var40 = true;
      int var42;
      if (var4 != null) {
         if (var4.id_case() == rnr_3.HEARTS) {
            var42 = 90;
         } else {
            var42 = var10;
         }
      } else {
         var42 = 0;
      }

      int var16 = Math.min(var39 * ((var40 ? 9 : 0) + var9 + var42 + 13), var2 - 50) / var39;
      int var17 = var2 / 2 - (var16 * var39 + (var39 - 1) * 5) / 2;
      int var18 = 10;
      int var19 = var16 * var39 + (var39 - 1) * 5;
      List var20 = null;
      if (this.id_private != null) {
         Object var21 = this.id_private;
         String var22 = var21.getString();
         if ((rrfq_3)rrfp_3.id_class[1] == (rrfq_3)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[2]
            || (rrfq_3)rrfp_3.id_class[1] == (rrfq_3)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[4]) {
            boolean var23 = ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_private().id_throws().id_continue();
            if (var23 && var22.contains("Режим:")) {
               String var24 = var22.split("Режим:")[1].split(" ")[1];
               var21 = var21.id_case().id_class(var24, "Скрыт", true);
            }
         }

         if (var8 > 0 && !var22.toLowerCase().contains("онлайн")) {
            rVi_1 var48 = var21.id_case();
            if (!var48.getString().endsWith("\n")) {
               var48.id_break("\n");
            }

            var21 = var48.id_break("Онлайн: " + var8);
         }

         var20 = ((cm_3)this.id_throws.id_class[15]).id_break((rgS_2)var21, var2 - 50);

         for (rpl_3 var54 : var20) {
            var19 = Math.max(var19, ((cm_3)this.id_throws.id_class[15]).id_class(var54));
         }
      }

      List var44 = null;
      if (this.id_catch != null) {
         var44 = ((cm_3)this.id_throws.id_class[15]).id_break(this.id_catch, var2 - 50);

         for (rpl_3 var50 : var44) {
            var19 = Math.max(var19, ((cm_3)this.id_throws.id_class[15]).id_class(var50));
         }
      }

      if (var20 != null) {
         id_class(var1, var2 / 2 - var19 / 2 - 1, var18 - 1, var2 / 2 + var19 / 2 + 1, var18 + var20.size() * 9, Integer.MIN_VALUE);

         for (rpl_3 var51 : var20) {
            int var55 = ((cm_3)this.id_throws.id_class[15]).id_class(var51);
            ((cm_3)this.id_throws.id_class[15]).id_class(var1, var51, (float)(var2 / 2 - var55 / 2), (float)var18, -1);
            var18 += 9;
         }

         var18++;
      }

      id_class(var1, var2 / 2 - var19 / 2 - 1, var18 - 1, var2 / 2 + var19 / 2 + 1, var18 + var38 * 9, Integer.MIN_VALUE);
      int var47 = ((Qw_1)this.id_throws.id_class[20]).id_class(553648127);

      for (int var52 = 0; var52 < var37; var52++) {
         int var56 = var52 / var38;
         int var25 = var52 % var38;
         int var26 = var17 + var56 * var16 + var56 * 5;
         int var27 = var18 + var25 * 9;
         id_class(var1, var26, var27, var26 + var16, var27 + 8, var47);
         RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
         RenderSystem.enableAlphaTest();
         RenderSystem.enableBlend();
         RenderSystem.defaultBlendFunc();
         if (var52 < var7.size()) {
            Aw_1 var28 = (Aw_1)var7.get(var52);
            GameProfile var29 = var28.id_class();
            rhd_3 var30 = ((gm_3)this.id_throws.id_class[56]).id_class(var29.getId());
            if (var40) {
               boolean var31 = var30 != null && var30.id_class(rhQ_2.CAPE) && ("Dinnerbone".equals(var29.getName()) || "Grumm".equals(var29.getName()));
               this.id_throws.A().id_class(var28.id_case());
               int var32 = 8 + (var31 ? 8 : 0);
               int var33 = 8 * (var31 ? -1 : 1);
               ch_3.id_class(var1, var26, var27, 8, 8, 8.0F, (float)var32, 8, var33, 64, 64);
               if (var30 != null && var30.id_class(rhQ_2.HAT)) {
                  int var34 = 8 + (var31 ? 8 : 0);
                  int var35 = 8 * (var31 ? -1 : 1);
                  ch_3.id_class(var1, var26, var27, 8, 8, 40.0F, (float)var34, 8, var35, 64, 64);
               }

               var26 += 9;
            }

            rVi_1 var59 = this.id_protected(var28);
            ((cm_3)this.id_throws.id_class[15]).id_break(var1, var59, (float)var26, (float)var27, var28.id_break() == rRl_1.SPECTATOR ? -1862270977 : -1);
            if (var4 != null && var28.id_break() != rRl_1.SPECTATOR) {
               int var60 = var26 + var9 + 1;
               int var61 = var60 + var42;
               if (var61 - var60 > 5) {
                  this.id_class(var4, var27, var29.getName(), var60, var61, var28, var1);
               }
            }

            this.id_class(var1, var16, var26 - (var40 ? 9 : 0), var27, var28);
         }
      }

      if (var44 != null) {
         var18 = var18 + var38 * 9 + 1;
         id_class(var1, var2 / 2 - var19 / 2 - 1, var18 - 1, var2 / 2 + var19 / 2 + 1, var18 + var44.size() * 9, Integer.MIN_VALUE);

         for (rpl_3 var57 : var44) {
            int var58 = ((cm_3)this.id_throws.id_class[15]).id_class(var57);
            ((cm_3)this.id_throws.id_class[15]).id_class(var1, var57, (float)(var2 / 2 - var58 / 2), (float)var18, -1);
            var18 += 9;
         }
      }
   }

   protected void id_class(Ml_1 var1, int var2, int var3, int var4, Aw_1 var5) {
      int var7 = var5.id_byte();
      int var6;
      if (var7 < 150) {
         var6 = Color.GREEN.getRGB();
      } else if (var7 < 300) {
         var6 = Color.YELLOW.getRGB();
      } else {
         var6 = Color.RED.getRGB();
      }

      String var8 = String.valueOf(var7);
      ((cm_3)this.id_throws.id_class[15]).id_class(var1, var8, (float)(var3 + var2 - ((cm_3)this.id_throws.id_class[15]).id_break(var8)), (float)var4, var6);
   }

   public static rgP_2 id_break(Aw_1 var0, rnO_2... var1) {
      return id_class(var0, rnB_2.id_class(var0.id_implements(), new rgN_2(var0.id_class().getName()), var1));
   }

   public static rgP_2 id_break(Aw_1 var0) {
      return var0.id_volatile() != null
         ? id_class(var0, var0.id_volatile().id_case())
         : id_class(var0, rnB_2.id_class(var0.id_implements(), new rgN_2(var0.id_class().getName()), new rnO_2[]{rnO_2.PREFIX, rnO_2.NAME}));
   }

   public void id_break(rgP_2 var1) {
      this.id_private = var1;
   }

   public void id_throws() {
      this.id_private = null;
      this.id_catch = null;
   }

   public rgP_2 id_protected() {
      return this.id_private;
   }

   private rVi_1 id_protected(Aw_1 var1) {
      rVi_1 var2 = id_class(var1).id_case();
      GameProfile var3 = var1.id_class();
      rhd_3 var4 = ((gm_3)this.id_throws.id_class[56]).id_class(var3.getId());
      String var5 = var2.id_byte();
      if (var4 != null && var4 != (cb_3)this.id_throws.id_class[57]) {
         String var6 = this.id_class(var4);
         var2 = new rgN_2(rgF_2.YELLOW + "Рядом " + var6 + " ").id_class(var2);
      }

      if (((rrZW)rrZW.staticFieldsf09fd5e6d24c37ccb4408917cb188133[0]).id_break(var3.getName())) {
         var2 = new rgN_2(rgF_2.GREEN + "Друг ").id_class(var2);
      }

      if (!var5.contains(var3.getName())) {
         var2 = var2.id_break(rgF_2.YELLOW + " (" + rql_3.id_class(var3.getName()) + ")");
      }

      return var2;
   }
}
