package celestial;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.mojang.blaze3d.systems.RenderSystem;
import java.io.File;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class vm_3 extends cu_3 implements ZR, cp_3, MinecraftAccessor {
   private static final Logger class_ = LogManager.getLogger();
   private static final Set<String> throws_ = Sets.newHashSet(new String[]{"http", "https"});
   protected rgP_2 extends_;
   protected final List<cC_2> native_ = Lists.newArrayList();
   protected QY volatile_;
   protected Hz_1 final_;
   public int package_;
   public int int_;
   protected final List<LZ> new_ = Lists.newArrayList();
   public boolean continue_;
   protected cm_3 super_;
   private URI case_;
   private boolean catch_;
   private vZ_2 private_;
   public int this_;
   private int implements_;

   private void byte_(boolean var1) {
      if (var1) {
         this.class_(this.case_);
      }

      this.case_ = null;
      this.volatile_.break_(this);
   }

   protected vm_3(rgP_2 var1) {
      this.extends_ = var1;
   }

   public rrFo_1 this_() {
      return rrFo_1.break_(this);
   }

   public void class_(rgP_2 var1) {
      this.extends_ = var1;
   }

   public void class_(Ml_1 var1) {
      this.class_(var1, 0);
   }

   public void class_(Ml_1 var1, int var2) {
      if ((gm_3)this.volatile_.class_[56] != null) {
         this.class_(var1, 0, 0, this.package_, this.int_, -1072689136, -804253680);
      } else {
         this.protected_(var2);
      }
   }

   public boolean class_(rgc_3 var1) {
      if (var1 == null) {
         return false;
      } else {
         rgl_3 var2 = var1.private_();
         if (synchronized_()) {
            if (var1.finally_() != null) {
               this.class_(var1.finally_(), false);
            }
         } else if (var2 != null) {
            if (var2.class_() == rgH_2.OPEN_URL) {
               if (!((Qw_1)this.volatile_.class_[20]).default_) {
                  return false;
               }

               try {
                  URI var3 = new URI(var2.break_());
                  String var4 = var3.getScheme();
                  if (var4 == null) {
                     throw new URISyntaxException(var2.break_(), "Missing protocol");
                  }

                  if (!throws_.contains(var4.toLowerCase(Locale.ROOT))) {
                     throw new URISyntaxException(var2.break_(), "Unsupported protocol: " + var4.toLowerCase(Locale.ROOT));
                  }

                  if (((Qw_1)this.volatile_.class_[20]).const_) {
                     this.case_ = var3;
                     this.volatile_.break_(new mq_3(this::byte_, var2.break_(), false));
                  } else {
                     this.class_(var3);
                  }
               } catch (URISyntaxException var5) {
                  class_.error("Can't open url for {}", var2, var5);
               }
            } else if (var2.class_() == rgH_2.OPEN_FILE) {
               URI var6 = new File(var2.break_()).toURI();
               this.class_(var6);
            } else if (var2.class_() == rgH_2.SUGGEST_COMMAND) {
               this.class_(var2.break_(), true);
            } else if (var2.class_() == rgH_2.RUN_COMMAND) {
               this.break_(var2.break_(), false);
            } else if (var2.class_() == rgH_2.RUNNABLE) {
               var2.byte_().run();
            } else if (var2.class_() == rgH_2.COPY_TO_CLIPBOARD) {
               ((Qj_1)this.volatile_.class_[23]).class_(var2.break_());
            } else {
               class_.error("Don't know how to handle {}", var2);
            }

            return true;
         }

         return false;
      }
   }

   protected void class_(String var1, boolean var2) {
   }

   protected void class_(Ml_1 var1, rgc_3 var2, int var3, int var4) {
      if (var2 != null && var2.implements_() != null) {
         rgy_3 var5 = var2.implements_();
         rgT_2 var6 = var5.class_(rgp_3.break_);
         if (var6 != null) {
            this.class_(var1, var6.class_(), var3, var4);
         } else {
            rgq_3 var7 = var5.class_(rgp_3.byte_);
            if (var7 != null) {
               if (((Qw_1)this.volatile_.class_[20]).int_) {
                  this.class_(var1, var7.break_(), var3, var4);
               }
            } else {
               rgP_2 var8 = var5.class_(rgp_3.class_);
               if (var8 != null) {
                  this.break_(var1, ((cm_3)this.volatile_.class_[15]).break_(var8, Math.max(this.package_ / 2, 200)), var3, var4);
               }
            }
         }
      }
   }

   protected boolean class_(String var1, char var2, int var3) {
      int var4 = var1.indexOf(58);
      int var5 = var1.indexOf(47);
      if (var2 == ':') {
         return (var5 == -1 || var3 <= var5) && var4 == -1;
      } else {
         return var2 == '/' ? var3 > var4 : var2 == '_' || var2 == '-' || var2 >= 'a' && var2 <= 'z' || var2 >= '0' && var2 <= '9' || var2 == '.';
      }
   }

   public static void class_(Runnable var0, String var1, String var2) {
      try {
         var0.run();
      } catch (Throwable var6) {
         KY var4 = KY.class_(var6, var1);
         Ko_1 var5 = var4.class_("Affected screen");
         var5.class_("Screen name", () -> var2);
         throw new KU(var4);
      }
   }

   public void class_(QY var1, int var2, int var3) {
      this.break_(var1, var2, var3);
   }

   private void class_(URI var1) {
      rqR_2.implements_().class_(var1);
   }

   protected void class_(Ml_1 var1, rdn_3 var2, int var3, int var4) {
      this.class_(var1, this.class_(var2), var3, var4);
   }

   public List<rgP_2> class_(rdn_3 var1) {
      return var1.class_((cb_3)this.volatile_.class_[57], ((Qw_1)this.volatile_.class_[20]).int_ ? VU.ADVANCED : VU.NORMAL);
   }

   @Override
   public void class_(Ml_1 var1, int var2, int var3, float var4) {
      for (int var5 = 0; var5 < this.new_.size(); var5++) {
         this.new_.get(var5).class_(var1, var2, var3, var4);
      }
   }

   @Override
   public boolean class_(int var1, int var2, int var3) {
      if (var1 == 256 && this.E_()) {
         if (!rrFY.class_(this).byte_()) {
            if (this instanceof rrZv_1) {
               this.goto_();
            } else {
               this.volatile_();
               this.try_();
            }

            return true;
         } else {
            return false;
         }
      } else if (var1 == 258) {
         boolean var4 = !synchronized_();
         if (!this.break_(var4)) {
            this.break_(var4);
         }

         return false;
      } else {
         return super.class_(var1, var2, var3);
      }
   }

   public <T extends LZ> T class_(T var1) {
      this.new_.add(var1);
      return this.protected_((T)var1);
   }

   public void class_(Ml_1 var1, rgP_2 var2, int var3, int var4) {
      this.break_(var1, Arrays.asList(var2.catch_()), var3, var4);
   }

   public void class_(Ml_1 var1, List<rgP_2> var2, int var3, int var4) {
      this.break_(var1, Lists.transform(var2, rgP_2::catch_), var3, var4);
   }

   @Override
   public boolean break_(double var1, double var3) {
      return true;
   }

   public void break_(Ml_1 var1, List<? extends rpl_3> var2, int var3, int var4) {
      if (!var2.isEmpty()) {
         int var5 = 0;

         for (rpl_3 var7 : var2) {
            int var8 = this.super_.class_(var7);
            if (var8 > var5) {
               var5 = var8;
            }
         }

         int var19 = var3 + 12;
         int var20 = var4 - 12;
         int var21 = 8;
         if (var2.size() > 1) {
            var21 += 2 + (var2.size() - 1) * 10;
         }

         if (var19 + var5 > this.package_) {
            var19 -= 28 + var5;
         }

         if (var20 + this.this_ + var21 + 6 > this.int_) {
            var20 = this.int_ - this.this_ - var21 - 6;
         }

         int var9 = var19 - 4;
         int var10 = var20 - 4;
         int var11 = var5 + 6;
         int var12 = var21 + 8;
         var1.class_();
         yb_3 var13 = yb_3.class_();
         lD_2 var14 = var13.byte_();
         var14.class_(7, ju_3.this_);
         rjV_2 var15 = var1.byte_().class_();
         class_(var15, var14, var19 - 3, var20 - 4, var19 + var5 + 3, var20 - 3, 400, -267386864, -267386864);
         class_(var15, var14, var19 - 3, var20 + var21 + 3, var19 + var5 + 3, var20 + var21 + 4, 400, -267386864, -267386864);
         class_(var15, var14, var19 - 3, var20 - 3, var19 + var5 + 3, var20 + var21 + 3, 400, -267386864, -267386864);
         class_(var15, var14, var19 - 4, var20 - 3, var19 - 3, var20 + var21 + 3, 400, -267386864, -267386864);
         class_(var15, var14, var19 + var5 + 3, var20 - 3, var19 + var5 + 4, var20 + var21 + 3, 400, -267386864, -267386864);
         class_(var15, var14, var19 - 3, var20 - 3 + 1, var19 - 3 + 1, var20 + var21 + 3 - 1, 400, 1347420415, 1344798847);
         class_(var15, var14, var19 + var5 + 2, var20 - 3 + 1, var19 + var5 + 3, var20 + var21 + 3 - 1, 400, 1347420415, 1344798847);
         class_(var15, var14, var19 - 3, var20 - 3, var19 + var5 + 3, var20 - 3 + 1, 400, 1347420415, 1347420415);
         class_(var15, var14, var19 - 3, var20 + var21 + 2, var19 + var5 + 3, var20 + var21 + 3, 400, 1344798847, 1344798847);
         RenderSystem.enableDepthTest();
         RenderSystem.disableTexture();
         RenderSystem.enableBlend();
         RenderSystem.defaultBlendFunc();
         RenderSystem.shadeModel(7425);
         var14.finally_();
         yk_3.class_(var14);
         RenderSystem.shadeModel(7424);
         RenderSystem.disableBlend();
         RenderSystem.enableTexture();
         Hd_1 var16 = Hx_1.class_(yb_3.class_().byte_());
         var1.class_(0.0, 0.0, 400.0);

         for (int var17 = 0; var17 < var2.size(); var17++) {
            rpl_3 var18 = (rpl_3)var2.get(var17);
            if (var18 != null) {
               this.super_.class_(var18, (float)var19, (float)var20, -1, true, var15, var16, false, 0, 15728880);
            }

            if (var17 == 0) {
               var20 += 2;
            }

            var20 += 10;
         }

         var16.break_();
         var1.break_();
         this.private_ = new vZ_2((float)var9, (float)var10, (float)var11, (float)var12);
         this.this_ = 0;
      }
   }

   public void break_(String var1) {
      this.break_(var1, true);
   }

   public void break_(QY var1, int var2, int var3) {
      this.volatile_ = var1;
      this.final_ = var1.float_();
      this.super_ = (cm_3)var1.class_[15];
      this.package_ = var2;
      this.int_ = var3;
      this.new_.clear();
      this.native_.clear();
      this.class_((cC_2)null);
      this.v_();
   }

   public void break_(String var1, boolean var2) {
      if (var2) {
         ((cq_3)this.volatile_.class_[19]).throws_().class_(var1);
      }

      ((cb_3)this.volatile_.class_[57]).protected_(var1);
   }

   public static boolean throws_(int var0) {
      return var0 == 88 && else_() && !synchronized_() && !return_();
   }

   public static boolean catch_(int var0) {
      return var0 == 67 && else_() && !synchronized_() && !return_();
   }

   public void goto_() {
      this.catch_ = true;
      ((Qi_1)import_.class_[22]).break_(false);
      this.try_();
   }

   public static boolean case_(int var0) {
      return var0 == 86 && else_() && !synchronized_() && !return_();
   }

   public void continue_() {
      this.catch_ = false;
   }

   public static boolean else_() {
      return QY.break_[2]
         ? Ve_1.class_(QY.instanceof_().else_().implements_(), 343) || Ve_1.class_(QY.instanceof_().else_().implements_(), 347)
         : Ve_1.class_(QY.instanceof_().else_().implements_(), 341) || Ve_1.class_(QY.instanceof_().else_().implements_(), 345);
   }

   public void implements_(int var1) {
      this.implements_ = var1;
   }

   public vZ_2 instanceof_() {
      return this.private_;
   }

   public rgP_2 new_() {
      return this.extends_;
   }

   public static boolean return_() {
      return Ve_1.class_(QY.instanceof_().else_().implements_(), 342) || Ve_1.class_(QY.instanceof_().else_().implements_(), 346);
   }

   public void super_() {
      this.private_ = null;
      this.implements_++;
      rrAZ.class_(this);
   }

   public int throw_() {
      return this.implements_;
   }

   public void try_() {
   }

   public List<LZ> while_() {
      return this.new_;
   }

   public boolean public_() {
      return this.catch_;
   }

   protected <T extends cC_2> T protected_(T var1) {
      this.native_.add(var1);
      return (T)var1;
   }

   public void protected_(int var1) {
      yb_3 var2 = yb_3.class_();
      lD_2 var3 = var2.byte_();
      this.volatile_.A().class_(break_);
      RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
      float var4 = 32.0F;
      var3.class_(7, ju_3.public_);
      var3.class_(0.0, (double)this.int_, 0.0).class_(0.0F, (float)this.int_ / 32.0F + (float)var1).break_(64, 64, 64, 255).class_();
      var3.class_((double)this.package_, (double)this.int_, 0.0)
         .class_((float)this.package_ / 32.0F, (float)this.int_ / 32.0F + (float)var1)
         .break_(64, 64, 64, 255)
         .class_();
      var3.class_((double)this.package_, 0.0, 0.0).class_((float)this.package_ / 32.0F, (float)var1).break_(64, 64, 64, 255).class_();
      var3.class_(0.0, 0.0, 0.0).class_(0.0F, (float)var1).break_(64, 64, 64, 255).class_();
      var2.break_();
   }

   public static boolean private_(int var0) {
      return var0 == 65 && else_() && !synchronized_() && !return_();
   }

   @Override
   public void private_() {
      if (this instanceof rrZv_1 var1 && var1.final_()) {
         this.volatile_();
      }
   }

   public void volatile_() {
      this.volatile_.break_((vm_3)null);
   }

   public static boolean synchronized_() {
      return Ve_1.class_(QY.instanceof_().else_().implements_(), 340) || Ve_1.class_(QY.instanceof_().else_().implements_(), 344);
   }

   public void a_(List<Path> var1) {
   }

   public String D_() {
      return this.new_().getString();
   }

   public boolean E_() {
      return true;
   }

   @Override
   public List<? extends cC_2> x_() {
      return this.native_;
   }

   protected void v_() {
      this.implements_ = 0;
      rrLU.class_(this);
   }

   public boolean z_() {
      return true;
   }

   public void w_() {
   }
}
