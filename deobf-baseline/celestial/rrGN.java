package celestial;

import com.mojang.serialization.Dynamic;
import com.mojang.serialization.OptionalDynamic;

public class rrGN {
   private final int id_class;
   private final long id_break;
   private final String id_byte;
   private final int id_protected;
   private final boolean id_throws;

   public String id_byte() {
      return this.id_byte;
   }

   public rrGN(int var1, long var2, String var4, int var5, boolean var6) {
      this.id_class = var1;
      this.id_break = var2;
      this.id_byte = var4;
      this.id_protected = var5;
      this.id_throws = var6;
   }

   public static rrGN id_class(Dynamic<?> var0) {
      int var1 = var0.get("version").asInt(0);
      long var2 = var0.get("LastPlayed").asLong(0L);
      OptionalDynamic var4 = var0.get("Version");
      return var4.result().isPresent()
         ? new rrGN(
            var1,
            var2,
            var4.get("Name").asString(rqu_3.id_class().getName()),
            var4.get("Id").asInt(rqu_3.id_class().getWorldVersion()),
            var4.get("Snapshot").asBoolean(!rqu_3.id_class().isStable())
         )
         : new rrGN(var1, var2, "", 0, false);
   }

   public int id_class() {
      return this.id_class;
   }

   public long id_break() {
      return this.id_break;
   }

   public boolean id_throws() {
      return this.id_throws;
   }

   public int id_protected() {
      return this.id_protected;
   }
}
