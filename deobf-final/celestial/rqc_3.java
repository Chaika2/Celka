package celestial;

import java.util.Arrays;
import java.util.Locale;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public enum rqc_3 {
   LEGACY("legacy"),
   MOJANG("mojang");

   private static final Map<String, rqc_3> SESSION_TYPES = Arrays.stream(values()).collect(Collectors.toMap(var0 -> var0.sessionType, Function.identity()));
   private final String sessionType;

   private rqc_3(String var3) {
      this.sessionType = var3;
   }

   public String class_() {
      return this.sessionType;
   }

   public static rqc_3 class_(String var0) {
      return SESSION_TYPES.get(var0.toLowerCase(Locale.ROOT));
   }

   public static rqc_3 break_(String var0) {
      return SESSION_TYPES.get(var0);
   }
}
