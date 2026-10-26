package celestial;

import com.google.common.base.Splitter;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Zl_1 extends vm_3 {
   private static final Logger class_ = LogManager.getLogger();
   static final List<ZH> throws_ = Lists.newArrayList();
   final mg_3 case_;
   private rgP_2 catch_;
   private rgP_2 private_;
   private Zy_1 implements_;
   private LF finally_;
   Lu_1 else_;
   rKQ synchronized_;

   @Override
   public void byte_(boolean var1) {
      this.finally_.int_ = var1 || this.else_.private_().length() > 1;
   }

   public Zl_1(mg_3 var1) {
      super(new rgn_3("createWorld.customize.presets.title"));
      this.case_ = var1;
   }

   static {
      class_(
         new rgn_3("createWorld.customize.preset.classic_flat"),
         xu_3.implements_,
         rYl_1.break_,
         Arrays.asList(rrrZ.new_),
         false,
         false,
         false,
         new rKN(1, xu_3.implements_),
         new rKN(2, xu_3.finally_),
         new rKN(1, xu_3.while_)
      );
      class_(
         new rgn_3("createWorld.customize.preset.tunnelers_dream"),
         xu_3.break_,
         rYl_1.protected_,
         Arrays.asList(rrrZ.byte_),
         true,
         true,
         false,
         new rKN(1, xu_3.implements_),
         new rKN(5, xu_3.finally_),
         new rKN(230, xu_3.break_),
         new rKN(1, xu_3.while_)
      );
      class_(
         new rgn_3("createWorld.customize.preset.water_world"),
         rdy_3.hR,
         rYl_1.goto_,
         Arrays.asList(rrrZ.volatile_, rrrZ.implements_, rrrZ.native_),
         false,
         false,
         false,
         new rKN(90, xu_3.try_),
         new rKN(5, xu_3.throw_),
         new rKN(5, xu_3.finally_),
         new rKN(5, xu_3.break_),
         new rKN(1, xu_3.while_)
      );
      class_(
         new rgn_3("createWorld.customize.preset.overworld"),
         xu_3.e,
         rYl_1.break_,
         Arrays.asList(rrrZ.new_, rrrZ.byte_, rrrZ.break_, rrrZ.private_),
         true,
         true,
         true,
         new rKN(1, xu_3.implements_),
         new rKN(3, xu_3.finally_),
         new rKN(59, xu_3.break_),
         new rKN(1, xu_3.while_)
      );
      class_(
         new rgn_3("createWorld.customize.preset.snowy_kingdom"),
         xu_3.Pq,
         rYl_1.volatile_,
         Arrays.asList(rrrZ.new_, rrrZ.catch_),
         false,
         false,
         false,
         new rKN(1, xu_3.Pq),
         new rKN(1, xu_3.implements_),
         new rKN(3, xu_3.finally_),
         new rKN(59, xu_3.break_),
         new rKN(1, xu_3.while_)
      );
      class_(
         new rgn_3("createWorld.customize.preset.bottomless_pit"),
         rdy_3.Oi,
         rYl_1.break_,
         Arrays.asList(rrrZ.new_),
         false,
         false,
         false,
         new rKN(1, xu_3.implements_),
         new rKN(3, xu_3.finally_),
         new rKN(2, xu_3.volatile_)
      );
      class_(
         new rgn_3("createWorld.customize.preset.desert"),
         xu_3.throw_,
         rYl_1.byte_,
         Arrays.asList(rrrZ.new_, rrrZ.case_, rrrZ.byte_),
         true,
         true,
         false,
         new rKN(8, xu_3.throw_),
         new rKN(52, xu_3.F),
         new rKN(3, xu_3.break_),
         new rKN(1, xu_3.while_)
      );
      class_(
         new rgn_3("createWorld.customize.preset.redstone_ready"),
         rdy_3.hD,
         rYl_1.byte_,
         Collections.emptyList(),
         false,
         false,
         false,
         new rKN(52, xu_3.F),
         new rKN(3, xu_3.break_),
         new rKN(1, xu_3.while_)
      );
      class_(new rgn_3("createWorld.customize.preset.the_void"), xu_3.Ec, rYl_1.E, Collections.emptyList(), false, true, false, new rKN(1, xu_3.class_));
   }

   private static void class_(rgP_2 var0, rpL_2 var1, rqM_2<rYG> var2, List<rrrZ<?>> var3, boolean var4, boolean var5, boolean var6, rKN... var7) {
      throws_.add(new ZH(var1.case_(), var0, var6x -> {
         HashMap var7x = Maps.newHashMap();

         for (rrrZ var9 : var3) {
            var7x.put(var9, (rrSI)rrSq_1.break_.get(var9));
         }

         rrSq_1 var11 = new rrSq_1(var4 ? Optional.of(rrSq_1.byte_) : Optional.empty(), var7x);
         rKQ var12 = new rKQ(var11, var6x);
         if (var5) {
            var12.class_();
         }

         if (var6) {
            var12.break_();
         }

         for (int var10 = var7.length - 1; var10 >= 0; var10--) {
            var12.case_().add(var7[var10]);
         }

         var12.class_(() -> (rYG)var6x.byte_(var2));
         var12.private_();
         return var12.class_(var11);
      }));
   }

   private static rKN class_(String var0, int var1) {
      String[] var2 = var0.split("\\*", 2);
      int var3;
      if (var2.length == 2) {
         try {
            var3 = Math.max(Integer.parseInt(var2[0]), 0);
         } catch (NumberFormatException var10) {
            class_.error("Error while parsing flat world string => {}", var10.getMessage());
            return null;
         }
      } else {
         var3 = 1;
      }

      int var4 = Math.min(var1 + var3, 256);
      int var5 = var4 - var1;
      String var6 = var2[var2.length - 1];

      xd_3 var7;
      try {
         var7 = rVL.strictfp_.break_(new rqO_2(var6)).orElse((xd_3)null);
      } catch (Exception var9) {
         class_.error("Error while parsing flat world string => {}", var9.getMessage());
         return null;
      }

      if (var7 == null) {
         class_.error("Error while parsing flat world string => Unknown block, {}", var6);
         return null;
      } else {
         rKN var8 = new rKN(var5, var7);
         var8.class_(var1);
         return var8;
      }
   }

   @Override
   public void class_(Ml_1 var1, int var2, int var3, float var4) {
      this.class_(var1);
      this.implements_.class_(var1, var2, var3, var4);
      RenderSystem.pushMatrix();
      RenderSystem.translatef(0.0F, 0.0F, 400.0F);
      class_(var1, this.super_, this.extends_, this.package_ / 2, 8, 16777215);
      break_(var1, this.super_, this.catch_, 50, 30, 10526880);
      break_(var1, this.super_, this.private_, 50, 70, 10526880);
      RenderSystem.popMatrix();
      this.else_.class_(var1, var2, var3, var4);
      super.class_(var1, var2, var3, var4);
   }

   static String class_(rVL<rYG> var0, rKQ var1) {
      StringBuilder var2 = new StringBuilder();

      for (int var3 = 0; var3 < var1.case_().size(); var3++) {
         if (var3 > 0) {
            var2.append(",");
         }

         var2.append(var1.case_().get(var3));
      }

      var2.append(";");
      var2.append(var0.break_(var1.throws_()));
      return var2.toString();
   }

   public static rKQ class_(rVL<rYG> var0, String var1, rKQ var2) {
      Iterator var3 = Splitter.on(';').split(var1).iterator();
      if (!var3.hasNext()) {
         return rKQ.class_(var0);
      } else {
         List var4 = class_((String)var3.next());
         if (var4.isEmpty()) {
            return rKQ.class_(var0);
         } else {
            rKQ var5 = var2.class_(var4, var2.protected_());
            rqM_2 var6 = rYl_1.break_;
            if (var3.hasNext()) {
               try {
                  rqO_2 var7 = new rqO_2((String)var3.next());
                  var6 = rqM_2.class_(rVL.n, var7);
                  var0.break_(var6).orElseThrow(() -> new IllegalArgumentException("Invalid Biome: " + var7));
               } catch (Exception var8) {
                  class_.error("Error while parsing flat world string => {}", var8.getMessage());
               }
            }

            rqM_2 var9 = var6;
            var5.class_(() -> (rYG)var0.byte_(var9));
            return var5;
         }
      }
   }

   @Override
   public void class_(QY var1, int var2, int var3) {
      String var4 = this.else_.private_();
      this.break_(var1, var2, var3);
      this.else_.class_(var4);
   }

   private static List<rKN> class_(String var0) {
      ArrayList var1 = Lists.newArrayList();
      String[] var2 = var0.split(",");
      int var3 = 0;

      for (String var7 : var2) {
         rKN var8 = class_(var7, var3);
         if (var8 == null) {
            return Collections.emptyList();
         }

         var1.add(var8);
         var3 += var8.class_();
      }

      return var1;
   }

   @Override
   public boolean class_(double var1, double var3, double var5) {
      return this.implements_.class_(var1, var3, var5);
   }

   @Override
   public void private_() {
      this.else_.catch_();
      super.private_();
   }

   @Override
   public void volatile_() {
      this.volatile_.break_(this.case_);
   }

   @Override
   protected void v_() {
      ((Qj_1)this.volatile_.class_[23]).class_(true);
      this.catch_ = new rgn_3("createWorld.customize.presets.share");
      this.private_ = new rgn_3("createWorld.customize.presets.list");
      this.else_ = new Lu_1(this.super_, 50, 40, this.package_ - 100, 20, this.catch_);
      this.else_.implements_(1230);
      rVF var1 = this.case_.class_.case_.break_().break_(rVL.n);
      this.else_.class_(class_(var1, this.case_.finally_()));
      this.synchronized_ = this.case_.finally_();
      this.native_.add(this.else_);
      this.implements_ = new Zy_1(this);
      this.native_.add(this.implements_);
      this.finally_ = this.class_((LF)(new LF(this.package_ / 2 - 155, this.int_ - 28, 150, 20, new rgn_3("createWorld.customize.presets.select"), var2 -> {
         rKQ var3 = class_(var1, this.else_.private_(), this.synchronized_);
         this.case_.class_(var3);
         this.volatile_.break_(this.case_);
      })));
      this.class_((LF)(new LF(this.package_ / 2 + 5, this.int_ - 28, 150, 20, cN_2.protected_, var1x -> this.volatile_.break_(this.case_))));
      this.byte_(this.implements_.finally_() != null);
   }

   @Override
   public void w_() {
      super.w_();
      ((Qj_1)this.volatile_.class_[23]).class_(false);
   }
}
