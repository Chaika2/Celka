package celestial;

import com.mojang.serialization.Codec;
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public enum raU_2 implements rpH_2 {
   NORMAL("normal"),
   MESA("mesa");

   public static final Codec<raU_2> field_236324_c_ = rpH_2.id_class(raU_2::values, raU_2::id_class);
   private static final Map<String, raU_2> BY_NAME = Arrays.stream(values()).collect(Collectors.toMap(raU_2::id_break, var0 -> (raU_2)var0));
   private final String name;

   private raU_2(String var3) {
      this.name = var3;
   }

   public static raU_2 id_class(int var0) {
      return var0 >= 0 && var0 < values().length ? values()[var0] : NORMAL;
   }

   @Override
   public String id_class() {
      return this.name;
   }

   private static raU_2 id_class(String var0) {
      return BY_NAME.get(var0);
   }

   public String id_break() {
      return this.name;
   }
}
