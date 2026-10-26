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
   private static final Logger id_class = LogManager.getLogger();
   private final QY id_break;
   private final Map<rfH_2, pb_3> id_byte = Maps.newHashMap();
   private final Map<UUID, pG_2> id_protected = Maps.newHashMap();
   private UUID id_throws;

   private boolean id_byte(pG_2 var1) {
      cb_3 var2 = (cb_3)this.id_break.id_class[57];
      rfH_2 var3 = new rfH_2(var2.rx(), var1.id_private.id_break(), var2.BO());
      rfH_2 var4 = new rfH_2(var1.id_private);
      return var3.id_class(var4, 30.0);
   }

   private Collection<UUID> id_byte(rfH_2 var1) {
      return this.id_protected.values().stream().filter(var1x -> var1x.id_class(var1)).map(pG_2::id_class).collect(Collectors.toSet());
   }

   private Map<rfH_2, List<String>> id_byte() {
      HashMap var1 = Maps.newHashMap();

      for (pG_2 var3 : this.id_protected.values()) {
         for (rfH_2 var5 : Iterables.concat(var3.id_int, var3.id_new)) {
            if (!this.id_byte.containsKey(var5)) {
               var1.computeIfAbsent(var5, var0 -> Lists.newArrayList()).add(var3.id_byte);
            }
         }
      }

      return var1;
   }

   private Set<String> id_byte(pb_3 var1) {
      return this.id_byte(var1.id_class).stream().map(rqG_2::id_class).collect(Collectors.toSet());
   }

   public pE_2(QY var1) {
      this.id_break = var1;
   }

   public void id_class(pb_3 var1) {
      this.id_byte.put(var1.id_class, var1);
   }

   @Override
   public void id_class() {
      this.id_byte.clear();
      this.id_protected.clear();
      this.id_throws = null;
   }

   public void id_class(rfH_2 var1) {
      this.id_byte.remove(var1);
   }

   public void id_class(pG_2 var1) {
      this.id_protected.put(var1.id_class, var1);
   }

   public void id_class(rfH_2 var1, int var2) {
      pb_3 var3 = this.id_byte.get(var1);
      if (var3 == null) {
         id_class.warn("Strange, setFreeTicketCount was called for an unknown POI: " + var1);
      } else {
         var3.id_byte = var2;
      }
   }

   @Override
   public void id_class(Ml_1 var1, Hx_1 var2, double var3, double var5, double var7) {
      RenderSystem.pushMatrix();
      RenderSystem.enableBlend();
      RenderSystem.defaultBlendFunc();
      RenderSystem.disableTexture();
      this.id_break();
      this.id_class(var3, var5, var7);
      RenderSystem.enableTexture();
      RenderSystem.disableBlend();
      RenderSystem.popMatrix();
      if (!((cb_3)this.id_break.id_class[57]).id_native()) {
         this.id_protected();
      }
   }

   private void id_class(rfH_2 var1, List<String> var2) {
      float var3 = 0.05F;
      RenderSystem.enableBlend();
      RenderSystem.defaultBlendFunc();
      yK_2.id_class(var1, 0.05F, 0.2F, 0.2F, 1.0F, 0.3F);
      id_class(var2 + "", var1, 0, -256);
      id_class("Ghost POI", var1, 1, -65536);
   }

   private void id_class(pG_2 var1, double var2, double var4, double var6) {
      if (var1.id_finally != null) {
         ps_3.id_class(var1.id_finally, 0.5F, false, false, var2, var4, var6);
      }
   }

   private void id_class(double var1, double var3, double var5) {
      rfH_2 var7 = new rfH_2(var1, var3, var5);
      this.id_protected.values().forEach(var7x -> {
         if (this.id_byte(var7x)) {
            this.id_break(var7x, var1, var3, var5);
         }
      });

      for (rfH_2 var9 : this.id_byte.keySet()) {
         if (var7.id_class(var9, 30.0)) {
            id_break(var9);
         }
      }

      this.id_byte.values().forEach(var2 -> {
         if (var7.id_class(var2.id_class, 30.0)) {
            this.id_break(var2);
         }
      });
      this.id_byte().forEach((var2, var3x) -> {
         if (var7.id_class(var2, 30.0)) {
            this.id_class(var2, (List<String>)var3x);
         }
      });
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

   private static void id_class(String var0, pb_3 var1, int var2, int var3) {
      rfH_2 var4 = var1.id_class;
      id_class(var0, var4, var2, var3);
   }

   private void id_break() {
      this.id_protected.entrySet().removeIf(var1 -> {
         an_3 var2 = ((gm_3)this.id_break.id_class[56]).id_break(var1.getValue().id_break);
         return var2 == null || (Boolean)var2.id_throws[27];
      });
   }

   private static void id_break(rfH_2 var0) {
      float var1 = 0.05F;
      RenderSystem.enableBlend();
      RenderSystem.defaultBlendFunc();
      yK_2.id_class(var0, 0.05F, 0.2F, 0.2F, 1.0F, 0.3F);
   }

   private boolean id_break(pG_2 var1) {
      return Objects.equals(this.id_throws, var1.id_class);
   }

   private void id_break(pG_2 var1, double var2, double var4, double var6) {
      boolean var8 = this.id_break(var1);
      int var9 = 0;
      id_class(var1.id_private, var9, var1.id_byte, -1, 0.03F);
      var9++;
      if (var8) {
         id_class(var1.id_private, var9, var1.id_protected + " " + var1.id_throws + " xp", -1, 0.02F);
         var9++;
      }

      if (var8) {
         int var10 = var1.id_case < var1.id_catch ? -23296 : -1;
         id_class(var1.id_private, var9, "health: " + String.format("%.1f", var1.id_case) + " / " + String.format("%.1f", var1.id_catch), var10, 0.02F);
         var9++;
      }

      if (var8 && !var1.id_implements.equals("")) {
         id_class(var1.id_private, var9, var1.id_implements, -98404, 0.02F);
         var9++;
      }

      if (var8) {
         for (String var11 : var1.id_volatile) {
            id_class(var1.id_private, var9, var11, -16711681, 0.02F);
            var9++;
         }
      }

      if (var8) {
         for (String var17 : var1.id_native) {
            id_class(var1.id_private, var9, var17, -16711936, 0.02F);
            var9++;
         }
      }

      if (var1.id_extends) {
         id_class(var1.id_private, var9, "Wants Golem", -23296, 0.02F);
         var9++;
      }

      if (var8) {
         for (String var18 : var1.id_package) {
            if (var18.startsWith(var1.id_byte)) {
               id_class(var1.id_private, var9, var18, -1, 0.02F);
            } else {
               id_class(var1.id_private, var9, var18, -23296, 0.02F);
            }

            var9++;
         }
      }

      if (var8) {
         for (String var19 : Lists.reverse(var1.id_final)) {
            id_class(var1.id_private, var9, var19, -3355444, 0.02F);
            var9++;
         }
      }

      if (var8) {
         this.id_class(var1, var2, var4, var6);
      }
   }

   private void id_break(pb_3 var1) {
      int var2 = 0;
      Set var3 = this.id_byte(var1);
      if (var3.size() < 4) {
         id_class("Owners: " + var3, var1, var2, -256);
      } else {
         id_class(var3.size() + " ticket holders", var1, var2, -256);
      }

      var2++;
      Set var4 = this.id_protected(var1);
      if (var4.size() < 4) {
         id_class("Candidates: " + var4, var1, var2, -23296);
      } else {
         id_class(var4.size() + " potential owners", var1, var2, -23296);
      }

      id_class("Free tickets: " + var1.id_byte, var1, ++var2, -256);
      id_class(var1.id_break, var1, ++var2, -1);
   }

   private Set<String> id_protected(pb_3 var1) {
      return this.id_protected(var1.id_class).stream().map(rqG_2::id_class).collect(Collectors.toSet());
   }

   private Collection<UUID> id_protected(rfH_2 var1) {
      return this.id_protected.values().stream().filter(var1x -> var1x.id_break(var1)).map(pG_2::id_class).collect(Collectors.toSet());
   }

   private void id_protected() {
      yK_2.id_class(this.id_break.id_catch(), 8).ifPresent(var1 -> this.id_throws = var1.ro());
   }
}
