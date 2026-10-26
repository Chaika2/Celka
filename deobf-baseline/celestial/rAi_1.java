package celestial;

import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Optional;

public class rAi_1 {
   public static final Map<String, rAi_1> id_class = Maps.newHashMap();
   public static final rAi_1 id_break = new rAi_1("dummy");
   public static final rAi_1 id_byte = new rAi_1("trigger");
   public static final rAi_1 id_protected = new rAi_1("deathCount");
   public static final rAi_1 id_throws = new rAi_1("playerKillCount");
   public static final rAi_1 id_case = new rAi_1("totalKillCount");
   public static final rAi_1 id_catch = new rAi_1("health", true, rnr_3.HEARTS);
   public static final rAi_1 id_private = new rAi_1("food", true, rnr_3.INTEGER);
   public static final rAi_1 id_implements = new rAi_1("air", true, rnr_3.INTEGER);
   public static final rAi_1 id_finally = new rAi_1("armor", true, rnr_3.INTEGER);
   public static final rAi_1 id_extends = new rAi_1("xp", true, rnr_3.INTEGER);
   public static final rAi_1 id_native = new rAi_1("level", true, rnr_3.INTEGER);
   public static final rAi_1[] id_volatile = new rAi_1[]{
      new rAi_1("teamkill." + rgF_2.BLACK.id_throws()),
      new rAi_1("teamkill." + rgF_2.DARK_BLUE.id_throws()),
      new rAi_1("teamkill." + rgF_2.DARK_GREEN.id_throws()),
      new rAi_1("teamkill." + rgF_2.DARK_AQUA.id_throws()),
      new rAi_1("teamkill." + rgF_2.DARK_RED.id_throws()),
      new rAi_1("teamkill." + rgF_2.DARK_PURPLE.id_throws()),
      new rAi_1("teamkill." + rgF_2.GOLD.id_throws()),
      new rAi_1("teamkill." + rgF_2.GRAY.id_throws()),
      new rAi_1("teamkill." + rgF_2.DARK_GRAY.id_throws()),
      new rAi_1("teamkill." + rgF_2.BLUE.id_throws()),
      new rAi_1("teamkill." + rgF_2.GREEN.id_throws()),
      new rAi_1("teamkill." + rgF_2.AQUA.id_throws()),
      new rAi_1("teamkill." + rgF_2.RED.id_throws()),
      new rAi_1("teamkill." + rgF_2.LIGHT_PURPLE.id_throws()),
      new rAi_1("teamkill." + rgF_2.YELLOW.id_throws()),
      new rAi_1("teamkill." + rgF_2.WHITE.id_throws())
   };
   public static final rAi_1[] id_final = new rAi_1[]{
      new rAi_1("killedByTeam." + rgF_2.BLACK.id_throws()),
      new rAi_1("killedByTeam." + rgF_2.DARK_BLUE.id_throws()),
      new rAi_1("killedByTeam." + rgF_2.DARK_GREEN.id_throws()),
      new rAi_1("killedByTeam." + rgF_2.DARK_AQUA.id_throws()),
      new rAi_1("killedByTeam." + rgF_2.DARK_RED.id_throws()),
      new rAi_1("killedByTeam." + rgF_2.DARK_PURPLE.id_throws()),
      new rAi_1("killedByTeam." + rgF_2.GOLD.id_throws()),
      new rAi_1("killedByTeam." + rgF_2.GRAY.id_throws()),
      new rAi_1("killedByTeam." + rgF_2.DARK_GRAY.id_throws()),
      new rAi_1("killedByTeam." + rgF_2.BLUE.id_throws()),
      new rAi_1("killedByTeam." + rgF_2.GREEN.id_throws()),
      new rAi_1("killedByTeam." + rgF_2.AQUA.id_throws()),
      new rAi_1("killedByTeam." + rgF_2.RED.id_throws()),
      new rAi_1("killedByTeam." + rgF_2.LIGHT_PURPLE.id_throws()),
      new rAi_1("killedByTeam." + rgF_2.YELLOW.id_throws()),
      new rAi_1("killedByTeam." + rgF_2.WHITE.id_throws())
   };
   private final String id_package;
   private final boolean id_int;
   private final rnr_3 id_new;

   public rnr_3 id_byte() {
      return this.id_new;
   }

   public rAi_1(String var1) {
      this(var1, false, rnr_3.INTEGER);
   }

   protected rAi_1(String var1, boolean var2, rnr_3 var3) {
      this.id_package = var1;
      this.id_int = var2;
      this.id_new = var3;
      id_class.put(var1, this);
   }

   public String id_class() {
      return this.id_package;
   }

   public static Optional<rAi_1> id_class(String var0) {
      if (id_class.containsKey(var0)) {
         return Optional.of(id_class.get(var0));
      } else {
         int var1 = var0.indexOf(58);
         return var1 < 0
            ? Optional.empty()
            : rVL.h
               .id_break(rqO_2.id_class(var0.substring(0, var1), '.'))
               .flatMap(var2 -> id_class((rlr_3<?>)var2, rqO_2.id_class(var0.substring(var1 + 1), '.')));
      }
   }

   private static <T> Optional<rAi_1> id_class(rlr_3<T> var0, rqO_2 var1) {
      return var0.id_class().id_break(var1).map(var0::id_break);
   }

   public boolean id_break() {
      return this.id_int;
   }
}
