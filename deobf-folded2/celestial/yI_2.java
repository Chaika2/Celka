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
   private final QY id_class;
   private final Map<rfH_2, yj_3> id_break = Maps.newHashMap();
   private final Map<UUID, yf_3> id_byte = Maps.newHashMap();
   private UUID id_protected;

   private void id_byte() {
      long var1 = ((gm_3)this.id_class.id_class[56]).r() - 20L;
      this.id_break.entrySet().removeIf(var2 -> var2.getValue().id_case < var1);
   }

   private void id_byte(yf_3 var1) {
      boolean var2 = this.id_protected(var1);
      int var3 = 0;
      id_class(var1.id_byte, var3++, var1.toString(), -1, 0.03F);
      if (var1.id_throws == null) {
         id_class(var1.id_byte, var3++, "No hive", -98404, 0.02F);
      } else {
         id_class(var1.id_byte, var3++, "Hive: " + this.id_class(var1, var1.id_throws), -256, 0.02F);
      }

      if (var1.id_case == null) {
         id_class(var1.id_byte, var3++, "No flower", -98404, 0.02F);
      } else {
         id_class(var1.id_byte, var3++, "Flower: " + this.id_class(var1, var1.id_case), -256, 0.02F);
      }

      for (String var5 : var1.id_private) {
         id_class(var1.id_byte, var3++, var5, -16711936, 0.02F);
      }

      if (var2) {
         this.id_break(var1);
      }

      if (var1.id_catch > 0) {
         int var10 = var1.id_catch < 600 ? -3355444 : -23296;
         id_class(var1.id_byte, var3++, "Travelling: " + var1.id_catch + " ticks", var10, 0.02F);
      }
   }

   public yI_2(QY var1) {
      this.id_class = var1;
   }

   private static void id_class(eX_2 var0, int var1, String var2, int var3, float var4) {
      double var5 = 2.4;
      double var7 = 0.25;
      rfH_2 var9 = new rfH_2(var0);
      double var10 = (double)var9.b_() + 0.5;
      double var12 = var0.id_break() + 2.4 + (double)var1 * 0.25;
      double var14 = (double)var9.d_() + 0.5;
      float var16 = 0.5F;
      yK_2.id_class(var2, var10, var12, var14, var3, var4, false, 0.5F, true);
   }

   private static void id_class(String var0, rfH_2 var1, int var2, int var3) {
      double var4 = 1.3;
      double var6 = 0.2;
      double var8 = (double)var1.b_() + 0.5;
      double var10 = (double)var1.c_() + 1.3 + (double)var2 * 0.2;
      double var12 = (double)var1.d_() + 0.5;
      yK_2.id_class(var0, var8, var10, var12, var3, 0.02F, true, 0.0F, true);
   }

   private static void id_class(rfH_2 var0, float var1, float var2, float var3, float var4, float var5) {
      RenderSystem.enableBlend();
      RenderSystem.defaultBlendFunc();
      yK_2.id_class(var0, var1, var2, var3, var4, var5);
   }

   private static void id_class(String var0, yj_3 var1, int var2, int var3) {
      rfH_2 var4 = var1.id_class;
      id_class(var0, var4, var2, var3);
   }

   private void id_class(yj_3 var1, Collection<UUID> var2) {
      int var3 = 0;
      if (!var2.isEmpty()) {
         id_class("Blacklisted by " + id_class(var2), var1, var3++, -65536);
      }

      id_class("Out: " + id_class(this.id_break(var1.id_class)), var1, var3++, -3355444);
      if (var1.id_byte == 0) {
         id_class("In: -", var1, var3++, -256);
      } else if (var1.id_byte == 1) {
         id_class("In: 1 bee", var1, var3++, -256);
      } else {
         id_class("In: " + var1.id_byte + " bees", var1, var3++, -256);
      }

      id_class("Honey: " + var1.id_protected, var1, var3++, -23296);
      id_class(var1.id_break + (var1.id_throws ? " (sedated)" : ""), var1, var3++, -1);
   }

   private String id_class(yf_3 var1, rfH_2 var2) {
      float var3 = rfU_2.id_class(var2.id_class(var1.id_byte.id_class(), var1.id_byte.id_break(), var1.id_byte.id_byte(), true));
      double var4 = (double)Math.round(var3 * 10.0F) / 10.0;
      return var2.id_this() + " (dist " + var4 + ")";
   }

   @Override
   public void id_class(Ml_1 var1, Hx_1 var2, double var3, double var5, double var7) {
      RenderSystem.pushMatrix();
      RenderSystem.enableBlend();
      RenderSystem.defaultBlendFunc();
      RenderSystem.disableTexture();
      this.id_byte();
      this.id_break();
      this.id_protected();
      RenderSystem.enableTexture();
      RenderSystem.disableBlend();
      RenderSystem.popMatrix();
      if (!((cb_3)this.id_class.id_class[57]).id_native()) {
         this.id_implements();
      }
   }

   public void id_class(yf_3 var1) {
      this.id_byte.put(var1.id_class, var1);
   }

   public void id_class(yj_3 var1) {
      this.id_break.put(var1.id_class, var1);
   }

   @Override
   public void id_class() {
      this.id_break.clear();
      this.id_byte.clear();
      this.id_protected = null;
   }

   private void id_class(rfH_2 var1, List<String> var2) {
      float var3 = 0.05F;
      id_class(var1, 0.05F, 0.2F, 0.2F, 1.0F, 0.3F);
      id_class(var2 + "", var1, 0, -256);
      id_class("Ghost Hive", var1, 1, -65536);
   }

   private static void id_class(rfH_2 var0) {
      float var1 = 0.05F;
      id_class(var0, 0.05F, 0.2F, 0.2F, 1.0F, 0.3F);
   }

   private static String id_class(Collection<UUID> var0) {
      if (var0.isEmpty()) {
         return "-";
      } else {
         return var0.size() > 3 ? var0.size() + " bees" : var0.stream().map(rqG_2::id_class).collect(Collectors.toSet()).toString();
      }
   }

   private Collection<UUID> id_break(rfH_2 var1) {
      return this.id_byte.values().stream().filter(var1x -> var1x.id_class(var1)).map(yf_3::id_class).collect(Collectors.toSet());
   }

   private void id_break() {
      this.id_byte.entrySet().removeIf(var1 -> ((gm_3)this.id_class.id_class[56]).id_break(var1.getValue().id_break) == null);
   }

   private void id_break(yf_3 var1) {
      if (var1.id_protected != null) {
         ps_3.id_class(
            var1.id_protected,
            0.5F,
            false,
            false,
            this.id_catch().id_break().id_class(),
            this.id_catch().id_break().id_break(),
            this.id_catch().id_break().id_byte()
         );
      }
   }

   private Map<rfH_2, Set<UUID>> id_throws() {
      HashMap var1 = Maps.newHashMap();
      this.id_byte
         .values()
         .forEach(var1x -> var1x.id_implements.forEach(var2 -> var1.computeIfAbsent(var2, var0xx -> Sets.newHashSet()).add(var1x.id_class())));
      return var1;
   }

   private boolean id_throws(yf_3 var1) {
      cb_3 var2 = (cb_3)this.id_class.id_class[57];
      rfH_2 var3 = new rfH_2(var2.rx(), var1.id_byte.id_break(), var2.BO());
      rfH_2 var4 = new rfH_2(var1.id_byte);
      return var3.id_class(var4, 30.0);
   }

   private ly_3 id_catch() {
      return ((Hh_1)this.id_class.id_class[16]).id_finally();
   }

   private void id_case() {
      HashMap var1 = Maps.newHashMap();
      this.id_byte
         .values()
         .stream()
         .filter(yf_3::id_byte)
         .forEach(var1x -> var1.computeIfAbsent(var1x.id_case, var0x -> Sets.newHashSet()).add(var1x.id_class()));
      var1.entrySet().forEach(var0 -> {
         rfH_2 var1x = (rfH_2)var0.getKey();
         Set var2 = (Set)var0.getValue();
         Set var3 = var2.stream().map(rqG_2::id_class).collect(Collectors.toSet());
         int var4 = 1;
         id_class(var3.toString(), var1x, var4++, -256);
         id_class("Flower", var1x, var4++, -1);
         float var5 = 0.05F;
         id_class(var1x, 0.05F, 0.8F, 0.8F, 0.0F, 0.3F);
      });
   }

   private void id_implements() {
      yK_2.id_class(this.id_class.id_catch(), 8).ifPresent(var1 -> this.id_protected = var1.ro());
   }

   private void id_protected() {
      rfH_2 var1 = this.id_catch().id_byte();
      this.id_byte.values().forEach(var1x -> {
         if (this.id_throws(var1x)) {
            this.id_byte(var1x);
         }
      });
      this.id_case();

      for (rfH_2 var3 : this.id_break.keySet()) {
         if (var1.id_class(var3, 30.0)) {
            id_class(var3);
         }
      }

      Map var4 = this.id_throws();
      this.id_break.values().forEach(var3x -> {
         if (var1.id_class(var3x.id_class, 30.0)) {
            Set var4x = (Set)var4.get(var3x.id_class);
            this.id_class(var3x, (Collection<UUID>)(var4x == null ? Sets.newHashSet() : var4x));
         }
      });
      this.id_private().forEach((var2, var3x) -> {
         if (var1.id_class(var2, 30.0)) {
            this.id_class(var2, (List<String>)var3x);
         }
      });
   }

   private boolean id_protected(yf_3 var1) {
      return Objects.equals(this.id_protected, var1.id_class);
   }

   private Map<rfH_2, List<String>> id_private() {
      HashMap var1 = Maps.newHashMap();

      for (yf_3 var3 : this.id_byte.values()) {
         if (var3.id_throws != null && !this.id_break.containsKey(var3.id_throws)) {
            var1.computeIfAbsent(var3.id_throws, var0 -> Lists.newArrayList()).add(var3.id_break());
         }
      }

      return var1;
   }
}
