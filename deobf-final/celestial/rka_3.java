package celestial;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.datafixers.util.Pair;
import java.util.EnumMap;
import java.util.Map;

public final class rka_3 {
   private static final Map<rke_3, Pair<String, String>> class_ = ImmutableMap.of(
      rke_3.CRAFTING,
      Pair.of("isGuiOpen", "isFilteringCraftable"),
      rke_3.FURNACE,
      Pair.of("isFurnaceGuiOpen", "isFurnaceFilteringCraftable"),
      rke_3.BLAST_FURNACE,
      Pair.of("isBlastingFurnaceGuiOpen", "isBlastingFurnaceFilteringCraftable"),
      rke_3.SMOKER,
      Pair.of("isSmokerGuiOpen", "isSmokerFilteringCraftable")
   );
   private final Map<rke_3, rki_3> break_;

   private rka_3(Map<rke_3, rki_3> var1) {
      this.break_ = var1;
   }

   public rka_3() {
      this(rqR_2.class_(Maps.newEnumMap(rke_3.class), var0 -> {
         for (rke_3 var4 : rke_3.values()) {
            var0.put(var4, new rki_3(false, false));
         }
      }));
   }

   @Override
   public boolean equals(Object var1) {
      return this == var1 || var1 instanceof rka_3 && this.break_.equals(((rka_3)var1).break_);
   }

   @Override
   public int hashCode() {
      return this.break_.hashCode();
   }

   public rka_3 class_() {
      EnumMap var1 = Maps.newEnumMap(rke_3.class);

      for (rke_3 var5 : rke_3.values()) {
         rki_3 var6 = this.break_.get(var5);
         var1.put(var5, var6.class_());
      }

      return new rka_3(var1);
   }

   public void class_(rka_3 var1) {
      this.break_.clear();

      for (rke_3 var5 : rke_3.values()) {
         rki_3 var6 = var1.break_.get(var5);
         this.break_.put(var5, var6.class_());
      }
   }

   public void class_(rke_3 var1, boolean var2) {
      this.break_.get(var1).class_ = var2;
   }

   public static rka_3 class_(ruu_3 var0) {
      EnumMap var1 = Maps.newEnumMap(rke_3.class);

      for (rke_3 var5 : rke_3.values()) {
         boolean var6 = var0.readBoolean();
         boolean var7 = var0.readBoolean();
         var1.put(var5, new rki_3(var6, var7));
      }

      return new rka_3(var1);
   }

   public boolean class_(rke_3 var1) {
      return this.break_.get(var1).class_;
   }

   public static rka_3 class_(rcd_3 var0) {
      EnumMap var1 = Maps.newEnumMap(rke_3.class);
      class_.forEach((var2, var3) -> {
         boolean var4 = var0.new_((String)var3.getFirst());
         boolean var5 = var0.new_((String)var3.getSecond());
         var1.put(var2, new rki_3(var4, var5));
      });
      return new rka_3(var1);
   }

   public boolean break_(rke_3 var1) {
      return this.break_.get(var1).break_;
   }

   public void break_(rcd_3 var1) {
      class_.forEach((var2, var3) -> {
         rki_3 var4 = this.break_.get(var2);
         var1.class_((String)var3.getFirst(), var4.class_);
         var1.class_((String)var3.getSecond(), var4.break_);
      });
   }

   public void break_(rke_3 var1, boolean var2) {
      this.break_.get(var1).break_ = var2;
   }

   public void break_(ruu_3 var1) {
      for (rke_3 var5 : rke_3.values()) {
         rki_3 var6 = this.break_.get(var5);
         if (var6 == null) {
            var1.writeBoolean(false);
            var1.writeBoolean(false);
         } else {
            var1.writeBoolean(var6.class_);
            var1.writeBoolean(var6.break_);
         }
      }
   }
}
