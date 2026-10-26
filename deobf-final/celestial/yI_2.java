package celestial;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import java.util.stream.Collectors;

public class yI_2 implements yD_2 {
   private final QY class_;
   private final Map<rfH_2, yj_3> break_ = Maps.newHashMap();
   private final Map<UUID, yf_3> byte_ = Maps.newHashMap();
   private UUID protected_;

   private void byte_() {
      long var1 = ((gm_3)this.class_.class_[56]).r() - 20L;
      this.break_.entrySet().removeIf(var2 -> var2.getValue().case_ < var1);
   }

   private void byte_(yf_3 var1) {
      boolean var2 = this.protected_(var1);
      int var3 = 0;
      class_(var1.byte_, var3++, var1.toString(), -1, 0.03F);
      if (var1.throws_ == null) {
         class_(var1.byte_, var3++, "No hive", -98404, 0.02F);
      } else {
         class_(var1.byte_, var3++, "Hive: " + this.class_(var1, var1.throws_), -256, 0.02F);
      }

      if (var1.case_ == null) {
         class_(var1.byte_, var3++, "No flower", -98404, 0.02F);
      } else {
         class_(var1.byte_, var3++, "Flower: " + this.class_(var1, var1.case_), -256, 0.02F);
      }

      for (String var5 : var1.private_) {
         class_(var1.byte_, var3++, var5, -16711936, 0.02F);
      }

      if (var2) {
         this.break_(var1);
      }

      if (var1.catch_ > 0) {
         int var10 = var1.catch_ < 600 ? -3355444 : -23296;
         class_(var1.byte_, var3++, "Travelling: " + var1.catch_ + " ticks", var10, 0.02F);
      }
   }

   public yI_2(QY var1) {
      this.class_ = var1;
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

   private static void class_(rfH_2 var0, float var1, float var2, float var3, float var4, float var5) {
      RenderSystem.enableBlend();
      RenderSystem.defaultBlendFunc();
      yK_2.class_(var0, var1, var2, var3, var4, var5);
   }

   private static void class_(String var0, yj_3 var1, int var2, int var3) {
      rfH_2 var4 = var1.class_;
      class_(var0, var4, var2, var3);
   }

   private void class_(yj_3 var1, Collection<UUID> var2) {
      int var3 = 0;
      if (!var2.isEmpty()) {
         class_("Blacklisted by " + class_(var2), var1, var3++, -65536);
      }

      class_("Out: " + class_(this.break_(var1.class_)), var1, var3++, -3355444);
      if (var1.byte_ == 0) {
         class_("In: -", var1, var3++, -256);
      } else if (var1.byte_ == 1) {
         class_("In: 1 bee", var1, var3++, -256);
      } else {
         class_("In: " + var1.byte_ + " bees", var1, var3++, -256);
      }

      class_("Honey: " + var1.protected_, var1, var3++, -23296);
      class_(var1.break_ + (var1.throws_ ? " (sedated)" : ""), var1, var3++, -1);
   }

   private String class_(yf_3 var1, rfH_2 var2) {
      float var3 = rfU_2.class_(var2.class_(var1.byte_.class_(), var1.byte_.break_(), var1.byte_.byte_(), true));
      double var4 = (double)Math.round(var3 * 10.0F) / 10.0;
      return var2.this_() + " (dist " + var4 + ")";
   }

   @Override
   public void class_(Ml_1 var1, Hx_1 var2, double var3, double var5, double var7) {
      RenderSystem.pushMatrix();
      RenderSystem.enableBlend();
      RenderSystem.defaultBlendFunc();
      RenderSystem.disableTexture();
      this.byte_();
      this.break_();
      this.protected_();
      RenderSystem.enableTexture();
      RenderSystem.disableBlend();
      RenderSystem.popMatrix();
      if (!((cb_3)this.class_.class_[57]).native_()) {
         this.implements_();
      }
   }

   public void class_(yf_3 var1) {
      this.byte_.put(var1.class_, var1);
   }

   public void class_(yj_3 var1) {
      this.break_.put(var1.class_, var1);
   }

   @Override
   public void class_() {
      this.break_.clear();
      this.byte_.clear();
      this.protected_ = null;
   }

   private void class_(rfH_2 var1, List<String> var2) {
      float var3 = 0.05F;
      class_(var1, 0.05F, 0.2F, 0.2F, 1.0F, 0.3F);
      class_(var2 + "", var1, 0, -256);
      class_("Ghost Hive", var1, 1, -65536);
   }

   private static void class_(rfH_2 var0) {
      float var1 = 0.05F;
      class_(var0, 0.05F, 0.2F, 0.2F, 1.0F, 0.3F);
   }

   private static String class_(Collection<UUID> var0) {
      if (var0.isEmpty()) {
         return "-";
      } else {
         return var0.size() > 3 ? var0.size() + " bees" : var0.stream().map(rqG_2::class_).collect(Collectors.toSet()).toString();
      }
   }

   private Collection<UUID> break_(rfH_2 var1) {
      return this.byte_.values().stream().filter(var1x -> var1x.class_(var1)).map(yf_3::class_).collect(Collectors.toSet());
   }

   private void break_() {
      this.byte_.entrySet().removeIf(var1 -> ((gm_3)this.class_.class_[56]).break_(var1.getValue().break_) == null);
   }

   private void break_(yf_3 var1) {
      if (var1.protected_ != null) {
         ps_3.class_(var1.protected_, 0.5F, false, false, this.catch_().break_().class_(), this.catch_().break_().break_(), this.catch_().break_().byte_());
      }
   }

   private Map<rfH_2, Set<UUID>> throws_() {
      HashMap var1 = Maps.newHashMap();
      this.byte_.values().forEach(var1x -> var1x.implements_.forEach(var2 -> var1.computeIfAbsent(var2, var0xx -> Sets.newHashSet()).add(var1x.class_())));
      return var1;
   }

   private boolean throws_(yf_3 var1) {
      cb_3 var2 = (cb_3)this.class_.class_[57];
      rfH_2 var3 = new rfH_2(var2.rx(), var1.byte_.break_(), var2.BO());
      rfH_2 var4 = new rfH_2(var1.byte_);
      return var3.class_(var4, 30.0);
   }

   private ly_3 catch_() {
      return ((Hh_1)this.class_.class_[16]).finally_();
   }

   private void case_() {
      HashMap var1 = Maps.newHashMap();
      this.byte_.values().stream().filter(yf_3::byte_).forEach(var1x -> var1.computeIfAbsent(var1x.case_, var0x -> Sets.newHashSet()).add(var1x.class_()));
      var1.entrySet().forEach(var0 -> {
         rfH_2 var1x = (rfH_2)var0.getKey();
         Set var2 = (Set)var0.getValue();
         Set var3 = var2.stream().map(rqG_2::class_).collect(Collectors.toSet());
         int var4 = 1;
         class_(var3.toString(), var1x, var4++, -256);
         class_("Flower", var1x, var4++, -1);
         float var5 = 0.05F;
         class_(var1x, 0.05F, 0.8F, 0.8F, 0.0F, 0.3F);
      });
   }

   private void implements_() {
      yK_2.class_(this.class_.catch_(), 8).ifPresent(var1 -> this.protected_ = var1.ro());
   }

   private void protected_() {
      rfH_2 var1 = this.catch_().byte_();
      this.byte_.values().forEach(var1x -> {
         if (this.throws_(var1x)) {
            this.byte_(var1x);
         }
      });
      this.case_();

      for (rfH_2 var3 : this.break_.keySet()) {
         if (var1.class_(var3, 30.0)) {
            class_(var3);
         }
      }

      Map var4 = this.throws_();
      this.break_.values().forEach(var3x -> {
         if (var1.class_(var3x.class_, 30.0)) {
            Set var4x = (Set)var4.get(var3x.class_);
            this.class_(var3x, (Collection<UUID>)(var4x == null ? Sets.newHashSet() : var4x));
         }
      });
      this.private_().forEach((var2, var3x) -> {
         if (var1.class_(var2, 30.0)) {
            this.class_(var2, (List<String>)var3x);
         }
      });
   }

   private boolean protected_(yf_3 var1) {
      return Objects.equals(this.protected_, var1.class_);
   }

   private Map<rfH_2, List<String>> private_() {
      HashMap var1 = Maps.newHashMap();

      for (yf_3 var3 : this.byte_.values()) {
         if (var3.throws_ != null && !this.break_.containsKey(var3.throws_)) {
            var1.computeIfAbsent(var3.throws_, var0 -> Lists.newArrayList()).add(var3.break_());
         }
      }

      return var1;
   }
}
