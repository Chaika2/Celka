package celestial;

import com.mojang.serialization.Dynamic;
import com.mojang.serialization.OptionalDynamic;

public class rrGN {
   private final int class_;
   private final long break_;
   private final String byte_;
   private final int protected_;
   private final boolean throws_;

   public String byte_() {
      return this.byte_;
   }

   public rrGN(int var1, long var2, String var4, int var5, boolean var6) {
      this.class_ = var1;
      this.break_ = var2;
      this.byte_ = var4;
      this.protected_ = var5;
      this.throws_ = var6;
   }

   public static rrGN class_(Dynamic<?> var0) {
      int var1 = var0.get("version").asInt(0);
      long var2 = var0.get("LastPlayed").asLong(0L);
      OptionalDynamic var4 = var0.get("Version");
      return var4.result().isPresent()
         ? new rrGN(
            var1,
            var2,
            var4.get("Name").asString(rqu_3.class_().getName()),
            var4.get("Id").asInt(rqu_3.class_().getWorldVersion()),
            var4.get("Snapshot").asBoolean(!rqu_3.class_().isStable())
         )
         : new rrGN(var1, var2, "", 0, false);
   }

   public int class_() {
      return this.class_;
   }

   public long break_() {
      return this.break_;
   }

   public boolean throws_() {
      return this.throws_;
   }

   public int protected_() {
      return this.protected_;
   }
}
