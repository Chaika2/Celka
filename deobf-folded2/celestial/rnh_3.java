package celestial;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public enum rnh_3 {
   ALWAYS("always", 0),
   NEVER("never", 1),
   PUSH_OTHER_TEAMS("pushOtherTeams", 2),
   PUSH_OWN_TEAM("pushOwnTeam", 3);

   private static final Map<String, rnh_3> nameMap = Arrays.stream(values()).collect(Collectors.toMap(var0 -> var0.name, var0 -> (rnh_3)var0));
   public final String name;
   public final int id;

   private rnh_3(String var3, int var4) {
      this.name = var3;
      this.id = var4;
   }

   public rgP_2 id_class() {
      return new rgn_3("team.collision." + this.name);
   }

   public static rnh_3 id_class(String var0) {
      return nameMap.get(var0);
   }
}
