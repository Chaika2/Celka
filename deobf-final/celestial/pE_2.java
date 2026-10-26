package celestial;

import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import java.util.stream.Collectors;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class pE_2 implements yD_2 {
   private static final Logger class_ = LogManager.getLogger();
   private final QY break_;
   private final Map<rfH_2, pb_3> byte_ = Maps.newHashMap();
   private final Map<UUID, pG_2> protected_ = Maps.newHashMap();
   private UUID throws_;

   private boolean byte_(pG_2 var1) {
      cb_3 var2 = (cb_3)this.break_.class_[57];
      rfH_2 var3 = new rfH_2(var2.rx(), var1.private_.break_(), var2.BO());
      rfH_2 var4 = new rfH_2(var1.private_);
      return var3.class_(var4, 30.0);
   }

   private Collection<UUID> byte_(rfH_2 var1) {
      return this.protected_.values().stream().filter(var1x -> var1x.class_(var1)).map(pG_2::class_).collect(Collectors.toSet());
   }

   private Map<rfH_2, List<String>> byte_() {
      HashMap var1 = Maps.newHashMap();

      for (pG_2 var3 : this.protected_.values()) {
         for (rfH_2 var5 : Iterables.concat(var3.int_, var3.new_)) {
            if (!this.byte_.containsKey(var5)) {
               var1.computeIfAbsent(var5, var0 -> Lists.newArrayList()).add(var3.byte_);
            }
         }
      }

      return var1;
   }

   private Set<String> byte_(pb_3 var1) {
      return this.byte_(var1.class_).stream().map(rqG_2::class_).collect(Collectors.toSet());
   }

   public pE_2(QY var1) {
      this.break_ = var1;
   }

   public void class_(pb_3 var1) {
      this.byte_.put(var1.class_, var1);
   }

   @Override
   public void class_() {
      this.byte_.clear();
      this.protected_.clear();
      this.throws_ = null;
   }

   public void class_(rfH_2 var1) {
      this.byte_.remove(var1);
   }

   public void class_(pG_2 var1) {
      this.protected_.put(var1.class_, var1);
   }

   public void class_(rfH_2 var1, int var2) {
      pb_3 var3 = this.byte_.get(var1);
      if (var3 == null) {
         class_.warn("Strange, setFreeTicketCount was called for an unknown POI: " + var1);
      } else {
         var3.byte_ = var2;
      }
   }

   @Override
   public void class_(Ml_1 var1, Hx_1 var2, double var3, double var5, double var7) {
      RenderSystem.pushMatrix();
      RenderSystem.enableBlend();
      RenderSystem.defaultBlendFunc();
      RenderSystem.disableTexture();
      this.break_();
      this.class_(var3, var5, var7);
      RenderSystem.enableTexture();
      RenderSystem.disableBlend();
      RenderSystem.popMatrix();
      if (!((cb_3)this.break_.class_[57]).native_()) {
         this.protected_();
      }
   }

   private void class_(rfH_2 var1, List<String> var2) {
      float var3 = 0.05F;
      RenderSystem.enableBlend();
      RenderSystem.defaultBlendFunc();
      yK_2.class_(var1, 0.05F, 0.2F, 0.2F, 1.0F, 0.3F);
      class_(var2 + "", var1, 0, -256);
      class_("Ghost POI", var1, 1, -65536);
   }

   private void class_(pG_2 var1, double var2, double var4, double var6) {
      if (var1.finally_ != null) {
         ps_3.class_(var1.finally_, 0.5F, false, false, var2, var4, var6);
      }
   }

   private void class_(double var1, double var3, double var5) {
      rfH_2 var7 = new rfH_2(var1, var3, var5);
      this.protected_.values().forEach(var7x -> {
         if (this.byte_(var7x)) {
            this.break_(var7x, var1, var3, var5);
         }
      });

      for (rfH_2 var9 : this.byte_.keySet()) {
         if (var7.class_(var9, 30.0)) {
            break_(var9);
         }
      }

      this.byte_.values().forEach(var2 -> {
         if (var7.class_(var2.class_, 30.0)) {
            this.break_(var2);
         }
      });
      this.byte_().forEach((var2, var3x) -> {
         if (var7.class_(var2, 30.0)) {
            this.class_(var2, (List<String>)var3x);
         }
      });
   }

   private static void class_(eX_2 var0, int var1, String var2, int var3, float var4) {
      double var5 = 2.4;
      double var7 = 0.25;
      rfH_2 var9 = new rfH_2(var0);
      double var10 = (double)var9.b_() + 0.5;
      double var12 = var0.break_() + 2.4 + (double)var1 * 0.25;
      double var14 = (double)var9.d_() + 0.5;
      float var16 = 0.5F;
      yK_2.class_(var2, var10, var12, var14, var3, var4, false, 0.5F, true);
   }

   private static void class_(String var0, rfH_2 var1, int var2, int var3) {
      double var4 = 1.3;
      double var6 = 0.2;
      double var8 = (double)var1.b_() + 0.5;
      double var10 = (double)var1.c_() + 1.3 + (double)var2 * 0.2;
      double var12 = (double)var1.d_() + 0.5;
      yK_2.class_(var0, var8, var10, var12, var3, 0.02F, true, 0.0F, true);
   }

   private static void class_(String var0, pb_3 var1, int var2, int var3) {
      rfH_2 var4 = var1.class_;
      class_(var0, var4, var2, var3);
   }

   private void break_() {
      this.protected_.entrySet().removeIf(var1 -> {
         an_3 var2 = ((gm_3)this.break_.class_[56]).break_(var1.getValue().break_);
         return var2 == null || (Boolean)var2.throws_[27];
      });
   }

   private static void break_(rfH_2 var0) {
      float var1 = 0.05F;
      RenderSystem.enableBlend();
      RenderSystem.defaultBlendFunc();
      yK_2.class_(var0, 0.05F, 0.2F, 0.2F, 1.0F, 0.3F);
   }

   private boolean break_(pG_2 var1) {
      return Objects.equals(this.throws_, var1.class_);
   }

   private void break_(pG_2 var1, double var2, double var4, double var6) {
      boolean var8 = this.break_(var1);
      int var9 = 0;
      class_(var1.private_, var9, var1.byte_, -1, 0.03F);
      var9++;
      if (var8) {
         class_(var1.private_, var9, var1.protected_ + " " + var1.throws_ + " xp", -1, 0.02F);
         var9++;
      }

      if (var8) {
         int var10 = var1.case_ < var1.catch_ ? -23296 : -1;
         class_(var1.private_, var9, "health: " + String.format("%.1f", var1.case_) + " / " + String.format("%.1f", var1.catch_), var10, 0.02F);
         var9++;
      }

      if (var8 && !var1.implements_.equals("")) {
         class_(var1.private_, var9, var1.implements_, -98404, 0.02F);
         var9++;
      }

      if (var8) {
         for (String var11 : var1.volatile_) {
            class_(var1.private_, var9, var11, -16711681, 0.02F);
            var9++;
         }
      }

      if (var8) {
         for (String var17 : var1.native_) {
            class_(var1.private_, var9, var17, -16711936, 0.02F);
            var9++;
         }
      }

      if (var1.extends_) {
         class_(var1.private_, var9, "Wants Golem", -23296, 0.02F);
         var9++;
      }

      if (var8) {
         for (String var18 : var1.package_) {
            if (var18.startsWith(var1.byte_)) {
               class_(var1.private_, var9, var18, -1, 0.02F);
            } else {
               class_(var1.private_, var9, var18, -23296, 0.02F);
            }

            var9++;
         }
      }

      if (var8) {
         for (String var19 : Lists.reverse(var1.final_)) {
            class_(var1.private_, var9, var19, -3355444, 0.02F);
            var9++;
         }
      }

      if (var8) {
         this.class_(var1, var2, var4, var6);
      }
   }

   private void break_(pb_3 var1) {
      int var2 = 0;
      Set var3 = this.byte_(var1);
      if (var3.size() < 4) {
         class_("Owners: " + var3, var1, var2, -256);
      } else {
         class_(var3.size() + " ticket holders", var1, var2, -256);
      }

      var2++;
      Set var4 = this.protected_(var1);
      if (var4.size() < 4) {
         class_("Candidates: " + var4, var1, var2, -23296);
      } else {
         class_(var4.size() + " potential owners", var1, var2, -23296);
      }

      class_("Free tickets: " + var1.byte_, var1, ++var2, -256);
      class_(var1.break_, var1, ++var2, -1);
   }

   private Set<String> protected_(pb_3 var1) {
      return this.protected_(var1.class_).stream().map(rqG_2::class_).collect(Collectors.toSet());
   }

   private Collection<UUID> protected_(rfH_2 var1) {
      return this.protected_.values().stream().filter(var1x -> var1x.break_(var1)).map(pG_2::class_).collect(Collectors.toSet());
   }

   private void protected_() {
      yK_2.class_(this.break_.catch_(), 8).ifPresent(var1 -> this.throws_ = var1.ro());
   }
}
