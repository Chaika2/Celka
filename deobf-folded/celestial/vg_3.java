package celestial;

import com.google.common.collect.Lists;
import com.mojang.blaze3d.systems.RenderSystem;
import it.unimi.dsi.fastutil.ints.IntOpenHashSet;
import it.unimi.dsi.fastutil.ints.IntSet;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Random;
import org.apache.commons.io.IOUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class vg_3 extends vm_3 {
   private static final Logger id_class = LogManager.getLogger();
   private static final rqO_2 id_throws = new rqO_2("textures/gui/title/minecraft.png");
   private static final rqO_2 id_case = new rqO_2("textures/gui/title/edition.png");
   private static final rqO_2 id_catch = new rqO_2("textures/misc/vignette.png");
   private static final String id_private = "" + rgF_2.WHITE + rgF_2.OBFUSCATED + rgF_2.GREEN + rgF_2.AQUA;
   private final boolean id_implements;
   private final Runnable id_finally;
   private float id_else;
   private List<rpl_3> id_synchronized;
   private IntSet id_return;
   private int id_public;
   private float id_goto = 0.5F;

   public vg_3(boolean var1, Runnable var2) {
      super(rgN_2.id_byte);
      this.id_implements = var1;
      this.id_finally = var2;
      if (!var1) {
         this.id_goto = 0.75F;
      }
   }

   @Override
   public void id_class(Ml_1 var1, int var2, int var3, float var4) {
      this.id_class(var2, var3, var4);
      short var5 = 274;
      int var6 = this.id_package / 2 - 137;
      int var7 = this.id_int + 50;
      this.id_else += var4;
      float var8 = -this.id_else * this.id_goto;
      RenderSystem.pushMatrix();
      RenderSystem.translatef(0.0F, var8, 0.0F);
      this.id_volatile.A().id_class(id_throws);
      RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
      RenderSystem.enableAlphaTest();
      RenderSystem.enableBlend();
      this.id_class(var6, var7, (var2x, var3x) -> {
         this.id_break(var1, var2x + 0, var3x, 0, 0, 155, 44);
         this.id_break(var1, var2x + 155, var3x, 0, 45, 155, 44);
      });
      RenderSystem.disableBlend();
      this.id_volatile.A().id_class(id_case);
      id_class(var1, var6 + 88, var7 + 37, 0.0F, 0.0F, 98, 14, 128, 16);
      RenderSystem.disableAlphaTest();
      int var9 = var7 + 100;

      for (int var10 = 0; var10 < this.id_synchronized.size(); var10++) {
         if (var10 == this.id_synchronized.size() - 1) {
            float var11 = (float)var9 + var8 - (float)(this.id_int / 2 - 6);
            if (var11 < 0.0F) {
               RenderSystem.translatef(0.0F, -var11, 0.0F);
            }
         }

         if ((float)var9 + var8 + 12.0F + 8.0F > 0.0F && (float)var9 + var8 < (float)this.id_int) {
            rpl_3 var15 = this.id_synchronized.get(var10);
            if (this.id_return.contains(var10)) {
               this.id_super.id_class(var1, var15, (float)(var6 + (274 - this.id_super.id_class(var15)) / 2), (float)var9, 16777215);
            } else {
               this.id_super.id_break.setSeed((long)((float)((long)var10 * 4238972211L) + this.id_else / 4.0F));
               this.id_super.id_class(var1, var15, (float)var6, (float)var9, 16777215);
            }
         }

         var9 += 12;
      }

      RenderSystem.popMatrix();
      this.id_volatile.A().id_class(id_catch);
      RenderSystem.enableBlend();
      RenderSystem.blendFunc(OP.ZERO, MK.ONE_MINUS_SRC_COLOR);
      int var14 = this.id_package;
      int var16 = this.id_int;
      yb_3 var12 = yb_3.id_class();
      lD_2 var13 = var12.id_byte();
      var13.id_class(7, ju_3.id_public);
      var13.id_class(0.0, (double)var16, (double)this.h_()).id_class(0.0F, 1.0F).id_class(1.0F, 1.0F, 1.0F, 1.0F).id_class();
      var13.id_class((double)var14, (double)var16, (double)this.h_()).id_class(1.0F, 1.0F).id_class(1.0F, 1.0F, 1.0F, 1.0F).id_class();
      var13.id_class((double)var14, 0.0, (double)this.h_()).id_class(1.0F, 0.0F).id_class(1.0F, 1.0F, 1.0F, 1.0F).id_class();
      var13.id_class(0.0, 0.0, (double)this.h_()).id_class(0.0F, 0.0F).id_class(1.0F, 1.0F, 1.0F, 1.0F).id_class();
      var12.id_break();
      RenderSystem.disableBlend();
      super.id_class(var1, var2, var3, var4);
   }

   private void id_class(int var1, int var2, float var3) {
      this.id_volatile.A().id_class(ch_3.id_break);
      int var4 = this.id_package;
      float var5 = -this.id_else * 0.5F * this.id_goto;
      float var6 = (float)this.id_int - this.id_else * 0.5F * this.id_goto;
      float var7 = 0.015625F;
      float var8 = this.id_else * 0.02F;
      float var9 = (float)(this.id_public + this.id_int + this.id_int + 24) / this.id_goto;
      float var10 = (var9 - 20.0F - this.id_else) * 0.005F;
      if (var10 < var8) {
         var8 = var10;
      }

      if (var8 > 1.0F) {
         var8 = 1.0F;
      }

      var8 *= var8;
      var8 = var8 * 96.0F / 255.0F;
      yb_3 var11 = yb_3.id_class();
      lD_2 var12 = var11.id_byte();
      var12.id_class(7, ju_3.id_public);
      var12.id_class(0.0, (double)this.id_int, (double)this.h_()).id_class(0.0F, var5 * 0.015625F).id_class(var8, var8, var8, 1.0F).id_class();
      var12.id_class((double)var4, (double)this.id_int, (double)this.h_())
         .id_class((float)var4 * 0.015625F, var5 * 0.015625F)
         .id_class(var8, var8, var8, 1.0F)
         .id_class();
      var12.id_class((double)var4, 0.0, (double)this.h_()).id_class((float)var4 * 0.015625F, var6 * 0.015625F).id_class(var8, var8, var8, 1.0F).id_class();
      var12.id_class(0.0, 0.0, (double)this.h_()).id_class(0.0F, var6 * 0.015625F).id_class(var8, var8, var8, 1.0F).id_class();
      var11.id_break();
   }

   private void id_finally() {
      this.id_finally.run();
      this.id_volatile.id_break((vm_3)null);
   }

   @Override
   public void id_private() {
      this.id_volatile.N().id_class();
      this.id_volatile.c().id_class(false);
      float var1 = (float)(this.id_public + this.id_int + this.id_int + 24) / this.id_goto;
      if (this.id_else > var1) {
         this.id_finally();
      }
   }

   @Override
   public void id_volatile() {
      this.id_finally();
   }

   @Override
   protected void v_() {
      if (this.id_synchronized == null) {
         this.id_synchronized = Lists.newArrayList();
         this.id_return = new IntOpenHashSet();
         rAF var1 = null;

         try {
            short var2 = 274;
            if (this.id_implements) {
               var1 = this.id_volatile.F().id_class(new rqO_2("texts/end.txt"));
               InputStream var3 = var1.id_break();
               BufferedReader var4 = new BufferedReader(new InputStreamReader(var3, StandardCharsets.UTF_8));
               Random var5 = new Random(8124371L);

               String var6;
               while ((var6 = var4.readLine()) != null) {
                  var6 = var6.replaceAll("PLAYERNAME", this.id_volatile.id_while().id_byte());

                  int var7;
                  while ((var7 = var6.indexOf(id_private)) != -1) {
                     Object var8 = var6.substring(0, var7);
                     String var9 = var6.substring(var7 + id_private.length());
                     var6 = var8 + rgF_2.WHITE + rgF_2.OBFUSCATED + "XXXXXXXX".substring(0, var5.nextInt(4) + 3) + var9;
                  }

                  this.id_synchronized.addAll(((cm_3)this.id_volatile.id_class[15]).id_break(new rgN_2(var6), 274));
                  this.id_synchronized.add(rpl_3.id_class);
               }

               var3.close();

               for (int var22 = 0; var22 < 8; var22++) {
                  this.id_synchronized.add(rpl_3.id_class);
               }
            }

            InputStream var15 = this.id_volatile.F().id_class(new rqO_2("texts/credits.txt")).id_break();
            BufferedReader var16 = new BufferedReader(new InputStreamReader(var15, StandardCharsets.UTF_8));

            String var17;
            while ((var17 = var16.readLine()) != null) {
               var17 = var17.replaceAll("PLAYERNAME", this.id_volatile.id_while().id_byte());
               var17 = var17.replaceAll("\t", "    ");
               boolean var21;
               if (var17.startsWith("[C]")) {
                  var17 = var17.substring(3);
                  var21 = true;
               } else {
                  var21 = false;
               }

               for (rpl_3 var24 : ((cm_3)this.id_volatile.id_class[15]).id_break(new rgN_2(var17), 274)) {
                  if (var21) {
                     this.id_return.add(this.id_synchronized.size());
                  }

                  this.id_synchronized.add(var24);
               }

               this.id_synchronized.add(rpl_3.id_class);
            }

            var15.close();
            this.id_public = this.id_synchronized.size() * 12;
         } catch (Exception var13) {
            id_class.error("Couldn't load credits", var13);
         } finally {
            IOUtils.closeQuietly(var1);
         }
      }
   }
}
