package celestial;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public enum rqL_2 {
   MASTER("master", 1.0F),
   MUSIC("music", 0.0F),
   RECORDS("record", 1.0F),
   WEATHER("weather", 1.0F),
   BLOCKS("block", 1.0F),
   HOSTILE("hostile", 1.0F),
   NEUTRAL("neutral", 1.0F),
   PLAYERS("player", 1.0F),
   AMBIENT("ambient", 1.0F),
   VOICE("voice", 1.0F),
   CLIENT("client", 1.0F);

   private static final Map<String, rqL_2> SOUND_CATEGORIES = Arrays.stream(values()).collect(Collectors.toMap(rqL_2::class_, Function.identity()));
   private final String name;
   private float defaultVolume = 1.0F;

   private rqL_2(String var3, float var4) {
      this.name = var3;
      this.defaultVolume = var4;
   }

   public String class_() {
      return this.name;
   }

   public float break_() {
      return this.defaultVolume;
   }
}
