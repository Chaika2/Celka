package celestial;

import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Optional;

public class rAi_1 {
   public static final Map<String, rAi_1> class_ = Maps.newHashMap();
   public static final rAi_1 break_ = new rAi_1("dummy");
   public static final rAi_1 byte_ = new rAi_1("trigger");
   public static final rAi_1 protected_ = new rAi_1("deathCount");
   public static final rAi_1 throws_ = new rAi_1("playerKillCount");
   public static final rAi_1 case_ = new rAi_1("totalKillCount");
   public static final rAi_1 catch_ = new rAi_1("health", true, rnr_3.HEARTS);
   public static final rAi_1 private_ = new rAi_1("food", true, rnr_3.INTEGER);
   public static final rAi_1 implements_ = new rAi_1("air", true, rnr_3.INTEGER);
   public static final rAi_1 finally_ = new rAi_1("armor", true, rnr_3.INTEGER);
   public static final rAi_1 extends_ = new rAi_1("xp", true, rnr_3.INTEGER);
   public static final rAi_1 native_ = new rAi_1("level", true, rnr_3.INTEGER);
   public static final rAi_1[] volatile_ = new rAi_1[]{
      new rAi_1("teamkill." + rgF_2.BLACK.throws_()),
      new rAi_1("teamkill." + rgF_2.DARK_BLUE.throws_()),
      new rAi_1("teamkill." + rgF_2.DARK_GREEN.throws_()),
      new rAi_1("teamkill." + rgF_2.DARK_AQUA.throws_()),
      new rAi_1("teamkill." + rgF_2.DARK_RED.throws_()),
      new rAi_1("teamkill." + rgF_2.DARK_PURPLE.throws_()),
      new rAi_1("teamkill." + rgF_2.GOLD.throws_()),
      new rAi_1("teamkill." + rgF_2.GRAY.throws_()),
      new rAi_1("teamkill." + rgF_2.DARK_GRAY.throws_()),
      new rAi_1("teamkill." + rgF_2.BLUE.throws_()),
      new rAi_1("teamkill." + rgF_2.GREEN.throws_()),
      new rAi_1("teamkill." + rgF_2.AQUA.throws_()),
      new rAi_1("teamkill." + rgF_2.RED.throws_()),
      new rAi_1("teamkill." + rgF_2.LIGHT_PURPLE.throws_()),
      new rAi_1("teamkill." + rgF_2.YELLOW.throws_()),
      new rAi_1("teamkill." + rgF_2.WHITE.throws_())
   };
   public static final rAi_1[] final_ = new rAi_1[]{
      new rAi_1("killedByTeam." + rgF_2.BLACK.throws_()),
      new rAi_1("killedByTeam." + rgF_2.DARK_BLUE.throws_()),
      new rAi_1("killedByTeam." + rgF_2.DARK_GREEN.throws_()),
      new rAi_1("killedByTeam." + rgF_2.DARK_AQUA.throws_()),
      new rAi_1("killedByTeam." + rgF_2.DARK_RED.throws_()),
      new rAi_1("killedByTeam." + rgF_2.DARK_PURPLE.throws_()),
      new rAi_1("killedByTeam." + rgF_2.GOLD.throws_()),
      new rAi_1("killedByTeam." + rgF_2.GRAY.throws_()),
      new rAi_1("killedByTeam." + rgF_2.DARK_GRAY.throws_()),
      new rAi_1("killedByTeam." + rgF_2.BLUE.throws_()),
      new rAi_1("killedByTeam." + rgF_2.GREEN.throws_()),
      new rAi_1("killedByTeam." + rgF_2.AQUA.throws_()),
      new rAi_1("killedByTeam." + rgF_2.RED.throws_()),
      new rAi_1("killedByTeam." + rgF_2.LIGHT_PURPLE.throws_()),
      new rAi_1("killedByTeam." + rgF_2.YELLOW.throws_()),
      new rAi_1("killedByTeam." + rgF_2.WHITE.throws_())
   };
   private final String package_;
   private final boolean int_;
   private final rnr_3 new_;

   public rnr_3 byte_() {
      return this.new_;
   }

   public rAi_1(String var1) {
      this(var1, false, rnr_3.INTEGER);
   }

   protected rAi_1(String var1, boolean var2, rnr_3 var3) {
      this.package_ = var1;
      this.int_ = var2;
      this.new_ = var3;
      class_.put(var1, this);
   }

   public String class_() {
      return this.package_;
   }

   public static Optional<rAi_1> class_(String var0) {
      if (class_.containsKey(var0)) {
         return Optional.of(class_.get(var0));
      } else {
         int var1 = var0.indexOf(58);
         return var1 < 0
            ? Optional.empty()
            : rVL.h.break_(rqO_2.class_(var0.substring(0, var1), '.')).flatMap(var2 -> class_((rlr_3<?>)var2, rqO_2.class_(var0.substring(var1 + 1), '.')));
      }
   }

   private static <T> Optional<rAi_1> class_(rlr_3<T> var0, rqO_2 var1) {
      return var0.class_().break_(var1).map(var0::break_);
   }

   public boolean break_() {
      return this.int_;
   }
}
