package celestial;

import com.mojang.serialization.Codec;
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public enum aH_2 implements rpH_2 {
   MONSTER("monster", 70, false, false, 128),
   CREATURE("creature", 10, true, true, 128),
   AMBIENT("ambient", 15, true, false, 128),
   WATER_CREATURE("water_creature", 5, true, false, 128),
   WATER_AMBIENT("water_ambient", 20, true, false, 64),
   MISC("misc", -1, true, true, 128);

   public static final Codec<aH_2> CODEC = rpH_2.id_class(aH_2::values, aH_2::id_class);
   private static final Map<String, aH_2> VALUES_MAP = Arrays.stream(values()).collect(Collectors.toMap(aH_2::id_break, var0 -> (aH_2)var0));
   private final int maxNumberOfCreature;
   private final boolean isPeacefulCreature;
   private final boolean isAnimal;
   private final String name;
   private final int randomDespawnDistance = 32;
   private final int instantDespawnDistance;

   public int id_byte() {
      return this.maxNumberOfCreature;
   }

   private aH_2(String var3, int var4, boolean var5, boolean var6, int var7) {
      this.name = var3;
      this.maxNumberOfCreature = var4;
      this.isPeacefulCreature = var5;
      this.isAnimal = var6;
      this.instantDespawnDistance = var7;
   }

   @Override
   public String id_class() {
      return this.name;
   }

   public static aH_2 id_class(String var0) {
      return VALUES_MAP.get(var0);
   }

   public String id_break() {
      return this.name;
   }

   public boolean id_throws() {
      return this.isAnimal;
   }

   public int id_catch() {
      return 32;
   }

   public int id_case() {
      return this.instantDespawnDistance;
   }

   public boolean id_protected() {
      return this.isPeacefulCreature;
   }

   public boolean id_private() {
      return this == MONSTER;
   }
}
