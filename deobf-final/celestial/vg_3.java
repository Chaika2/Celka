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
   private static final Logger class_ = LogManager.getLogger();
   private static final rqO_2 throws_ = new rqO_2("textures/gui/title/minecraft.png");
   private static final rqO_2 case_ = new rqO_2("textures/gui/title/edition.png");
   private static final rqO_2 catch_ = new rqO_2("textures/misc/vignette.png");
   private static final String private_ = "" + rgF_2.WHITE + rgF_2.OBFUSCATED + rgF_2.GREEN + rgF_2.AQUA;
   private final boolean implements_;
   private final Runnable finally_;
   private float else_;
   private List<rpl_3> synchronized_;
   private IntSet return_;
   private int public_;
   private float goto_ = 0.5F;

   public vg_3(boolean var1, Runnable var2) {
      super(rgN_2.byte_);
      this.implements_ = var1;
      this.finally_ = var2;
      if (!var1) {
         this.goto_ = 0.75F;
      }
   }

   @Override
   public void class_(Ml_1 var1, int var2, int var3, float var4) {
      this.class_(var2, var3, var4);
      short var5 = 274;
      int var6 = this.package_ / 2 - 137;
      int var7 = this.int_ + 50;
      this.else_ += var4;
      float var8 = -this.else_ * this.goto_;
      RenderSystem.pushMatrix();
      RenderSystem.translatef(0.0F, var8, 0.0F);
      this.volatile_.A().class_(throws_);
      RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
      RenderSystem.enableAlphaTest();
      RenderSystem.enableBlend();
      this.class_(var6, var7, (var2x, var3x) -> {
         this.break_(var1, var2x + 0, var3x, 0, 0, 155, 44);
         this.break_(var1, var2x + 155, var3x, 0, 45, 155, 44);
      });
      RenderSystem.disableBlend();
      this.volatile_.A().class_(case_);
      class_(var1, var6 + 88, var7 + 37, 0.0F, 0.0F, 98, 14, 128, 16);
      RenderSystem.disableAlphaTest();
      int var9 = var7 + 100;

      for (int var10 = 0; var10 < this.synchronized_.size(); var10++) {
         if (var10 == this.synchronized_.size() - 1) {
            float var11 = (float)var9 + var8 - (float)(this.int_ / 2 - 6);
            if (var11 < 0.0F) {
               RenderSystem.translatef(0.0F, -var11, 0.0F);
            }
         }

         if ((float)var9 + var8 + 12.0F + 8.0F > 0.0F && (float)var9 + var8 < (float)this.int_) {
            rpl_3 var15 = this.synchronized_.get(var10);
            if (this.return_.contains(var10)) {
               this.super_.class_(var1, var15, (float)(var6 + (274 - this.super_.class_(var15)) / 2), (float)var9, 16777215);
            } else {
               this.super_.break_.setSeed((long)((float)((long)var10 * 4238972211L) + this.else_ / 4.0F));
               this.super_.class_(var1, var15, (float)var6, (float)var9, 16777215);
            }
         }

         var9 += 12;
      }

      RenderSystem.popMatrix();
      this.volatile_.A().class_(catch_);
      RenderSystem.enableBlend();
      RenderSystem.blendFunc(OP.ZERO, MK.ONE_MINUS_SRC_COLOR);
      int var14 = this.package_;
      int var16 = this.int_;
      yb_3 var12 = yb_3.class_();
      lD_2 var13 = var12.byte_();
      var13.class_(7, ju_3.public_);
      var13.class_(0.0, (double)var16, (double)this.h_()).class_(0.0F, 1.0F).class_(1.0F, 1.0F, 1.0F, 1.0F).class_();
      var13.class_((double)var14, (double)var16, (double)this.h_()).class_(1.0F, 1.0F).class_(1.0F, 1.0F, 1.0F, 1.0F).class_();
      var13.class_((double)var14, 0.0, (double)this.h_()).class_(1.0F, 0.0F).class_(1.0F, 1.0F, 1.0F, 1.0F).class_();
      var13.class_(0.0, 0.0, (double)this.h_()).class_(0.0F, 0.0F).class_(1.0F, 1.0F, 1.0F, 1.0F).class_();
      var12.break_();
      RenderSystem.disableBlend();
      super.class_(var1, var2, var3, var4);
   }

   private void class_(int var1, int var2, float var3) {
      this.volatile_.A().class_(ch_3.break_);
      int var4 = this.package_;
      float var5 = -this.else_ * 0.5F * this.goto_;
      float var6 = (float)this.int_ - this.else_ * 0.5F * this.goto_;
      float var7 = 0.015625F;
      float var8 = this.else_ * 0.02F;
      float var9 = (float)(this.public_ + this.int_ + this.int_ + 24) / this.goto_;
      float var10 = (var9 - 20.0F - this.else_) * 0.005F;
      if (var10 < var8) {
         var8 = var10;
      }

      if (var8 > 1.0F) {
         var8 = 1.0F;
      }

      var8 *= var8;
      var8 = var8 * 96.0F / 255.0F;
      yb_3 var11 = yb_3.class_();
      lD_2 var12 = var11.byte_();
      var12.class_(7, ju_3.public_);
      var12.class_(0.0, (double)this.int_, (double)this.h_()).class_(0.0F, var5 * 0.015625F).class_(var8, var8, var8, 1.0F).class_();
      var12.class_((double)var4, (double)this.int_, (double)this.h_())
         .class_((float)var4 * 0.015625F, var5 * 0.015625F)
         .class_(var8, var8, var8, 1.0F)
         .class_();
      var12.class_((double)var4, 0.0, (double)this.h_()).class_((float)var4 * 0.015625F, var6 * 0.015625F).class_(var8, var8, var8, 1.0F).class_();
      var12.class_(0.0, 0.0, (double)this.h_()).class_(0.0F, var6 * 0.015625F).class_(var8, var8, var8, 1.0F).class_();
      var11.break_();
   }

   private void finally_() {
      this.finally_.run();
      this.volatile_.break_((vm_3)null);
   }

   @Override
   public void private_() {
      this.volatile_.N().class_();
      this.volatile_.c().class_(false);
      float var1 = (float)(this.public_ + this.int_ + this.int_ + 24) / this.goto_;
      if (this.else_ > var1) {
         this.finally_();
      }
   }

   @Override
   public void volatile_() {
      this.finally_();
   }

   @Override
   protected void v_() {
      if (this.synchronized_ == null) {
         this.synchronized_ = Lists.newArrayList();
         this.return_ = new IntOpenHashSet();
         rAF var1 = null;

         try {
            short var2 = 274;
            if (this.implements_) {
               var1 = this.volatile_.F().class_(new rqO_2("texts/end.txt"));
               InputStream var3 = var1.break_();
               BufferedReader var4 = new BufferedReader(new InputStreamReader(var3, StandardCharsets.UTF_8));
               Random var5 = new Random(8124371L);

               String var6;
               while ((var6 = var4.readLine()) != null) {
                  var6 = var6.replaceAll("PLAYERNAME", this.volatile_.while_().byte_());

                  int var7;
                  while ((var7 = var6.indexOf(private_)) != -1) {
                     Object var8 = var6.substring(0, var7);
                     String var9 = var6.substring(var7 + private_.length());
                     var6 = var8 + rgF_2.WHITE + rgF_2.OBFUSCATED + "XXXXXXXX".substring(0, var5.nextInt(4) + 3) + var9;
                  }

                  this.synchronized_.addAll(((cm_3)this.volatile_.class_[15]).break_(new rgN_2(var6), 274));
                  this.synchronized_.add(rpl_3.class_);
               }

               var3.close();

               for (int var22 = 0; var22 < 8; var22++) {
                  this.synchronized_.add(rpl_3.class_);
               }
            }

            InputStream var15 = this.volatile_.F().class_(new rqO_2("texts/credits.txt")).break_();
            BufferedReader var16 = new BufferedReader(new InputStreamReader(var15, StandardCharsets.UTF_8));

            String var17;
            while ((var17 = var16.readLine()) != null) {
               var17 = var17.replaceAll("PLAYERNAME", this.volatile_.while_().byte_());
               var17 = var17.replaceAll("\t", "    ");
               boolean var21;
               if (var17.startsWith("[C]")) {
                  var17 = var17.substring(3);
                  var21 = true;
               } else {
                  var21 = false;
               }

               for (rpl_3 var24 : ((cm_3)this.volatile_.class_[15]).break_(new rgN_2(var17), 274)) {
                  if (var21) {
                     this.return_.add(this.synchronized_.size());
                  }

                  this.synchronized_.add(var24);
               }

               this.synchronized_.add(rpl_3.class_);
            }

            var15.close();
            this.public_ = this.synchronized_.size() * 12;
         } catch (Exception var13) {
            class_.error("Couldn't load credits", var13);
         } finally {
            IOUtils.closeQuietly(var1);
         }
      }
   }
}
