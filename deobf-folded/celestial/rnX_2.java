package celestial;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public enum rnX_2 {
   ALWAYS("always", 0),
   NEVER("never", 1),
   HIDE_FOR_OTHER_TEAMS("hideForOtherTeams", 2),
   HIDE_FOR_OWN_TEAM("hideForOwnTeam", 3);

   private static final Map<String, rnX_2> nameMap = Arrays.stream(values()).collect(Collectors.toMap(var0 -> var0.internalName, var0 -> (rnX_2)var0));
   public final String internalName;
   public final int id;

   private rnX_2(String var3, int var4) {
      this.internalName = var3;
      this.id = var4;
   }

   public rgP_2 id_class() {
      return new rgn_3("team.visibility." + this.internalName);
   }

   public static rnX_2 id_class(String var0) {
      return nameMap.get(var0);
   }
}
