package celestial;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.datafixers.util.Pair;
import java.util.EnumMap;
import java.util.Map;

public final class rka_3 {
   private static final Map<rke_3, Pair<String, String>> id_class = ImmutableMap.of(
      rke_3.CRAFTING,
      Pair.of("isGuiOpen", "isFilteringCraftable"),
      rke_3.FURNACE,
      Pair.of("isFurnaceGuiOpen", "isFurnaceFilteringCraftable"),
      rke_3.BLAST_FURNACE,
      Pair.of("isBlastingFurnaceGuiOpen", "isBlastingFurnaceFilteringCraftable"),
      rke_3.SMOKER,
      Pair.of("isSmokerGuiOpen", "isSmokerFilteringCraftable")
   );
   private final Map<rke_3, rki_3> id_break;

   private rka_3(Map<rke_3, rki_3> var1) {
      this.id_break = var1;
   }

   public rka_3() {
      this(rqR_2.id_class(Maps.newEnumMap(rke_3.class), var0 -> {
         for (rke_3 var4 : rke_3.values()) {
            var0.put(var4, new rki_3(false, false));
         }
      }));
   }

   @Override
   public boolean equals(Object var1) {
      return this == var1 || var1 instanceof rka_3 && this.id_break.equals(((rka_3)var1).id_break);
   }

   @Override
   public int hashCode() {
      return this.id_break.hashCode();
   }

   public rka_3 id_class() {
      EnumMap var1 = Maps.newEnumMap(rke_3.class);

      for (rke_3 var5 : rke_3.values()) {
         rki_3 var6 = this.id_break.get(var5);
         var1.put(var5, var6.id_class());
      }

      return new rka_3(var1);
   }

   public void id_class(rka_3 var1) {
      this.id_break.clear();

      for (rke_3 var5 : rke_3.values()) {
         rki_3 var6 = var1.id_break.get(var5);
         this.id_break.put(var5, var6.id_class());
      }
   }

   public void id_class(rke_3 var1, boolean var2) {
      this.id_break.get(var1).id_class = var2;
   }

   public static rka_3 id_class(ruu_3 var0) {
      EnumMap var1 = Maps.newEnumMap(rke_3.class);

      for (rke_3 var5 : rke_3.values()) {
         boolean var6 = var0.readBoolean();
         boolean var7 = var0.readBoolean();
         var1.put(var5, new rki_3(var6, var7));
      }

      return new rka_3(var1);
   }

   public boolean id_class(rke_3 var1) {
      return this.id_break.get(var1).id_class;
   }

   public static rka_3 id_class(rcd_3 var0) {
      EnumMap var1 = Maps.newEnumMap(rke_3.class);
      id_class.forEach((var2, var3) -> {
         boolean var4 = var0.id_new((String)var3.getFirst());
         boolean var5 = var0.id_new((String)var3.getSecond());
         var1.put(var2, new rki_3(var4, var5));
      });
      return new rka_3(var1);
   }

   public boolean id_break(rke_3 var1) {
      return this.id_break.get(var1).id_break;
   }

   public void id_break(rcd_3 var1) {
      id_class.forEach((var2, var3) -> {
         rki_3 var4 = this.id_break.get(var2);
         var1.id_class((String)var3.getFirst(), var4.id_class);
         var1.id_class((String)var3.getSecond(), var4.id_break);
      });
   }

   public void id_break(rke_3 var1, boolean var2) {
      this.id_break.get(var1).id_break = var2;
   }

   public void id_break(ruu_3 var1) {
      for (rke_3 var5 : rke_3.values()) {
         rki_3 var6 = this.id_break.get(var5);
         if (var6 == null) {
            var1.writeBoolean(false);
            var1.writeBoolean(false);
         } else {
            var1.writeBoolean(var6.id_class);
            var1.writeBoolean(var6.id_break);
         }
      }
   }
}
