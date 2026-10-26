package celestial;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.mojang.serialization.Dynamic;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class rrGb_1 extends rrGc_1 {
   private static final Logger extends_ = LogManager.getLogger();
   public int class_;
   public int break_;
   public rqM_2<rYB> byte_;
   public boolean protected_;
   public boolean throws_;
   public byte case_;
   public byte[] catch_ = new byte[16384];
   public boolean private_;
   public final List<rrGM> implements_ = Lists.newArrayList();
   private final Map<rhd_3, rrGM> native_ = Maps.newHashMap();
   private final Map<String, rrGE> volatile_ = Maps.newHashMap();
   public final Map<String, rrGO> finally_ = Maps.newLinkedHashMap();
   private final Map<String, rrGX> final_ = Maps.newHashMap();

   @Override
   public rcd_3 byte_(rcd_3 var1) {
      rqO_2.class_.encodeStart(rcf_3.class_, this.byte_.class_()).resultOrPartial(extends_::error).ifPresent(var1x -> var1.class_("dimension", var1x));
      var1.break_("xCenter", this.class_);
      var1.break_("zCenter", this.break_);
      var1.class_("scale", this.case_);
      var1.class_("colors", this.catch_);
      var1.class_("trackingPosition", this.protected_);
      var1.class_("unlimitedTracking", this.throws_);
      var1.class_("locked", this.private_);
      rcy_3 var2 = new rcy_3();

      for (rrGE var4 : this.volatile_.values()) {
         var2.add(var4.protected_());
      }

      var1.class_("banners", var2);
      rcy_3 var6 = new rcy_3();

      for (rrGX var5 : this.final_.values()) {
         var6.add(var5.class_());
      }

      var1.class_("frames", var6);
      return var1;
   }

   public rrGb_1(String var1) {
      super(var1);
   }

   public void class_(rRq_1 var1, int var2, int var3) {
      Iterator var4 = this.volatile_.values().iterator();

      while (var4.hasNext()) {
         rrGE var5 = (rrGE)var4.next();
         if (var5.class_().b_() == var2 && var5.class_().d_() == var3) {
            rrGE var6 = rrGE.class_(var1, var5.class_());
            if (!var5.equals(var6)) {
               var4.remove();
               this.finally_.remove(var5.throws_());
            }
         }
      }
   }

   public void class_(rRg_1 var1, rfH_2 var2) {
      double var3 = (double)var2.b_() + 0.5;
      double var5 = (double)var2.d_() + 0.5;
      int var7 = 1 << this.case_;
      double var8 = (var3 - (double)this.class_) / (double)var7;
      double var10 = (var5 - (double)this.break_) / (double)var7;
      byte var12 = 63;
      boolean var13 = false;
      if (var8 >= -63.0 && var10 >= -63.0 && var8 <= 63.0 && var10 <= 63.0) {
         rrGE var14 = rrGE.class_(var1, var2);
         if (var14 == null) {
            return;
         }

         boolean var15 = true;
         if (this.volatile_.containsKey(var14.throws_()) && this.volatile_.get(var14.throws_()).equals(var14)) {
            this.volatile_.remove(var14.throws_());
            this.finally_.remove(var14.throws_());
            var15 = false;
            var13 = true;
         }

         if (var15) {
            this.volatile_.put(var14.throws_(), var14);
            this.class_(var14.break_(), var1, var14.throws_(), var3, var5, 180.0, var14.byte_());
            var13 = true;
         }

         if (var13) {
            this.byte_();
         }
      }
   }

   public rrGM class_(rhd_3 var1) {
      rrGM var2 = this.native_.get(var1);
      if (var2 == null) {
         var2 = new rrGM(this, var1);
         this.native_.put(var1, var2);
         this.implements_.add(var2);
      }

      return var2;
   }

   public void class_(int var1, int var2) {
      this.byte_();

      for (rrGM var4 : this.implements_) {
         var4.class_(var1, var2);
      }
   }

   public void class_(rfH_2 var1, int var2) {
      this.finally_.remove("frame-" + var2);
      this.final_.remove(rrGX.class_(var1));
   }

   public ruS_2<?> class_(rdn_3 var1, rRq_1 var2, rhd_3 var3) {
      rrGM var4 = this.native_.get(var3);
      return var4 == null ? null : var4.class_(var1);
   }

   public void class_(rhd_3 var1, rdn_3 var2) {
      if (!this.native_.containsKey(var1)) {
         rrGM var3 = new rrGM(this, var1);
         this.native_.put(var1, var3);
         this.implements_.add(var3);
      }

      if (!((rhz_3)var1.implements_[1]).implements_(var2)) {
         this.finally_.remove(var1.g().getString());
      }

      for (int var7 = 0; var7 < this.implements_.size(); var7++) {
         rrGM var4 = this.implements_.get(var7);
         String var5 = var4.class_.g().getString();
         if (!(Boolean)var4.class_.throws_[27] && (((rhz_3)var4.class_.implements_[1]).implements_(var2) || var2.goto_())) {
            if (!var2.goto_() && ((rYB)var4.class_.throws_[7]).E() == this.byte_ && this.protected_) {
               this.class_(
                  rrGh_1.PLAYER,
                  (rYB)var4.class_.throws_[7],
                  var5,
                  var4.class_.rx(),
                  var4.class_.BO(),
                  (double)((Float)var4.class_.throws_[15]).floatValue(),
                  (rgP_2)null
               );
            }
         } else {
            this.native_.remove(var4.class_);
            this.implements_.remove(var4);
            this.finally_.remove(var5);
         }
      }

      if (var2.goto_() && this.protected_) {
         rsG_2 var8 = var2.while_();
         rfH_2 var10 = var8.implements_();
         rrGX var12 = this.final_.get(rrGX.class_(var10));
         if (var12 != null && var8.V() != var12.protected_() && this.final_.containsKey(var12.throws_())) {
            this.finally_.remove("frame-" + var12.protected_());
         }

         rrGX var6 = new rrGX(var10, var8.Pg().protected_() * 90, var8.V());
         this.class_(
            rrGh_1.FRAME, (rYB)var1.throws_[7], "frame-" + var8.V(), (double)var10.b_(), (double)var10.d_(), (double)(var8.Pg().protected_() * 90), (rgP_2)null
         );
         this.final_.put(var6.throws_(), var6);
      }

      rcd_3 var9 = var2.package_();
      if (var9 != null && var9.byte_("Decorations", 9)) {
         rcy_3 var11 = var9.protected_("Decorations", 10);

         for (int var13 = 0; var13 < var11.size(); var13++) {
            rcd_3 var14 = var11.class_(var13);
            if (!this.finally_.containsKey(var14.native_("id"))) {
               this.class_(
                  rrGh_1.class_(var14.case_("type")),
                  (rYB)var1.throws_[7],
                  var14.native_("id"),
                  var14.extends_("x"),
                  var14.extends_("z"),
                  var14.extends_("rot"),
                  (rgP_2)null
               );
            }
         }
      }
   }

   public void class_(rrGb_1 var1) {
      this.private_ = true;
      this.class_ = var1.class_;
      this.break_ = var1.break_;
      this.volatile_.putAll(var1.volatile_);
      this.finally_.putAll(var1.finally_);
      System.arraycopy(var1.catch_, 0, this.catch_, 0, var1.catch_.length);
      this.byte_();
   }

   public void class_(double var1, double var3, int var5) {
      int var6 = 128 * (1 << var5);
      int var7 = rfU_2.byte_((var1 + 64.0) / (double)var6);
      int var8 = rfU_2.byte_((var3 + 64.0) / (double)var6);
      this.class_ = var7 * var6 + var6 / 2 - 64;
      this.break_ = var8 * var6 + var6 / 2 - 64;
   }

   @Override
   public void class_(rcd_3 var1) {
      this.byte_ = (rqM_2<rYB>)rRJ.class_(new Dynamic(rcf_3.class_, var1.byte_("dimension")))
         .resultOrPartial(extends_::error)
         .orElseThrow(() -> new IllegalArgumentException("Invalid map dimension: " + var1.byte_("dimension")));
      this.class_ = var1.private_("xCenter");
      this.break_ = var1.private_("zCenter");
      this.case_ = (byte)rfU_2.class_(var1.case_("scale"), 0, 4);
      this.protected_ = !var1.byte_("trackingPosition", 1) || var1.new_("trackingPosition");
      this.throws_ = var1.new_("unlimitedTracking");
      this.private_ = var1.new_("locked");
      this.catch_ = var1.volatile_("colors");
      if (this.catch_.length != 16384) {
         this.catch_ = new byte[16384];
      }

      rcy_3 var2 = var1.protected_("banners", 10);

      for (int var3 = 0; var3 < var2.size(); var3++) {
         rrGE var4 = rrGE.class_(var2.class_(var3));
         this.volatile_.put(var4.throws_(), var4);
         this.class_(var4.break_(), (rRg_1)null, var4.throws_(), (double)var4.class_().b_(), (double)var4.class_().d_(), 180.0, var4.byte_());
      }

      rcy_3 var6 = var1.protected_("frames", 10);

      for (int var7 = 0; var7 < var6.size(); var7++) {
         rrGX var5 = rrGX.class_(var6.class_(var7));
         this.final_.put(var5.throws_(), var5);
         this.class_(
            rrGh_1.FRAME, (rRg_1)null, "frame-" + var5.protected_(), (double)var5.break_().b_(), (double)var5.break_().d_(), (double)var5.byte_(), (rgP_2)null
         );
      }
   }

   public void class_(int var1, int var2, int var3, boolean var4, boolean var5, rqM_2<rYB> var6) {
      this.case_ = (byte)var3;
      this.class_((double)var1, (double)var2, this.case_);
      this.byte_ = var6;
      this.protected_ = var4;
      this.throws_ = var5;
      this.byte_();
   }

   private void class_(rrGh_1 var1, rRg_1 var2, String var3, double var4, double var6, double var8, rgP_2 var10) {
      int var11 = 1 << this.case_;
      float var12 = (float)(var4 - (double)this.class_) / (float)var11;
      float var13 = (float)(var6 - (double)this.break_) / (float)var11;
      byte var14 = (byte)((int)((double)(var12 * 2.0F) + 0.5));
      byte var15 = (byte)((int)((double)(var13 * 2.0F) + 0.5));
      byte var16 = 63;
      byte var17;
      if (var12 >= -63.0F && var13 >= -63.0F && var12 <= 63.0F && var13 <= 63.0F) {
         var8 += var8 < 0.0 ? -8.0 : 8.0;
         var17 = (byte)((int)(var8 * 16.0 / 360.0));
         if (this.byte_ == rYB.protected_ && var2 != null) {
            int var20 = (int)(var2.public_().case_() / 10L);
            var17 = (byte)(var20 * var20 * 34187121 + var20 * 121 >> 15 & 15);
         }
      } else {
         if (var1 != rrGh_1.PLAYER) {
            this.finally_.remove(var3);
            return;
         }

         short var18 = 320;
         if (Math.abs(var12) < 320.0F && Math.abs(var13) < 320.0F) {
            var1 = rrGh_1.PLAYER_OFF_MAP;
         } else {
            if (!this.throws_) {
               this.finally_.remove(var3);
               return;
            }

            var1 = rrGh_1.PLAYER_OFF_LIMITS;
         }

         var17 = 0;
         if (var12 <= -63.0F) {
            var14 = -128;
         }

         if (var13 <= -63.0F) {
            var15 = -128;
         }

         if (var12 >= 63.0F) {
            var14 = 127;
         }

         if (var13 >= 63.0F) {
            var15 = 127;
         }
      }

      this.finally_.put(var3, new rrGO(var1, var14, var15, var17, var10));
   }

   public static void class_(rdn_3 var0, rfH_2 var1, String var2, rrGh_1 var3) {
      rcy_3 var4;
      if (var0.final_() && var0.package_().byte_("Decorations", 9)) {
         var4 = var0.package_().protected_("Decorations", 10);
      } else {
         var4 = new rcy_3();
         var0.class_("Decorations", var4);
      }

      rcd_3 var5 = new rcd_3();
      var5.class_("type", var3.class_());
      var5.class_("id", var2);
      var5.class_("x", (double)var1.b_());
      var5.class_("z", (double)var1.d_());
      var5.class_("rot", 180.0);
      var4.add(var5);
      if (var3.byte_()) {
         rcd_3 var6 = var0.class_("display");
         var6.break_("MapColor", var3.protected_());
      }
   }
}
