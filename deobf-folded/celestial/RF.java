package celestial;

import com.google.common.collect.Maps;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Map.Entry;
import java.util.function.Predicate;

public class RF {
   private static final Map<String, RA> id_implements = Maps.newHashMap();
   public static final DynamicCommandExceptionType id_class = new DynamicCommandExceptionType(var0 -> new rgn_3("argument.entity.options.unknown", var0));
   public static final DynamicCommandExceptionType id_break = new DynamicCommandExceptionType(var0 -> new rgn_3("argument.entity.options.inapplicable", var0));
   public static final SimpleCommandExceptionType id_byte = new SimpleCommandExceptionType(new rgn_3("argument.entity.options.distance.negative"));
   public static final SimpleCommandExceptionType id_protected = new SimpleCommandExceptionType(new rgn_3("argument.entity.options.level.negative"));
   public static final SimpleCommandExceptionType id_throws = new SimpleCommandExceptionType(new rgn_3("argument.entity.options.limit.toosmall"));
   public static final DynamicCommandExceptionType id_case = new DynamicCommandExceptionType(
      var0 -> new rgn_3("argument.entity.options.sort.irreversible", var0)
   );
   public static final DynamicCommandExceptionType id_catch = new DynamicCommandExceptionType(var0 -> new rgn_3("argument.entity.options.mode.invalid", var0));
   public static final DynamicCommandExceptionType id_private = new DynamicCommandExceptionType(var0 -> new rgn_3("argument.entity.options.type.invalid", var0));

   public static void id_class() {
      if (id_implements.isEmpty()) {
         id_class("name", var0 -> {
            int var1 = var0.id_catch().getCursor();
            boolean var2 = var0.id_throws();
            String var3 = var0.id_catch().readString();
            if (var0.id_synchronized() && !var2) {
               var0.id_catch().setCursor(var1);
               throw id_break.createWithContext(var0.id_catch(), "name");
            } else {
               if (var2) {
                  var0.id_byte(true);
               } else {
                  var0.id_break(true);
               }

               var0.id_class(var2x -> var2x.g().getString().equals(var3) != var2);
            }
         }, var0 -> !var0.id_else(), new rgn_3("argument.entity.options.name.description"));
         id_class("distance", var0 -> {
            int var1 = var0.id_catch().getCursor();
            Xm_1 var2 = Xm_1.id_class(var0.id_catch());
            if (var2.id_class() != null && var2.id_class() < 0.0F || var2.id_break() != null && var2.id_break() < 0.0F) {
               var0.id_catch().setCursor(var1);
               throw id_byte.createWithContext(var0.id_catch());
            } else {
               var0.id_class(var2);
               var0.id_private();
            }
         }, var0 -> var0.id_implements().id_byte(), new rgn_3("argument.entity.options.distance.description"));
         id_class("level", var0 -> {
            int var1 = var0.id_catch().getCursor();
            XF var2 = XF.id_class(var0.id_catch());
            if (var2.id_class() != null && var2.id_class() < 0 || var2.id_break() != null && var2.id_break() < 0) {
               var0.id_catch().setCursor(var1);
               throw id_protected.createWithContext(var0.id_catch());
            } else {
               var0.id_class(var2);
               var0.id_class(false);
            }
         }, var0 -> var0.id_finally().id_byte(), new rgn_3("argument.entity.options.level.description"));
         id_class("x", var0 -> {
            var0.id_private();
            var0.id_class(var0.id_catch().readDouble());
         }, var0 -> var0.id_volatile() == null, new rgn_3("argument.entity.options.x.description"));
         id_class("y", var0 -> {
            var0.id_private();
            var0.id_break(var0.id_catch().readDouble());
         }, var0 -> var0.id_final() == null, new rgn_3("argument.entity.options.y.description"));
         id_class("z", var0 -> {
            var0.id_private();
            var0.id_byte(var0.id_catch().readDouble());
         }, var0 -> var0.id_package() == null, new rgn_3("argument.entity.options.z.description"));
         id_class("dx", var0 -> {
            var0.id_private();
            var0.id_protected(var0.id_catch().readDouble());
         }, var0 -> var0.id_int() == null, new rgn_3("argument.entity.options.dx.description"));
         id_class("dy", var0 -> {
            var0.id_private();
            var0.id_throws(var0.id_catch().readDouble());
         }, var0 -> var0.id_new() == null, new rgn_3("argument.entity.options.dy.description"));
         id_class("dz", var0 -> {
            var0.id_private();
            var0.id_case(var0.id_catch().readDouble());
         }, var0 -> var0.id_continue() == null, new rgn_3("argument.entity.options.dz.description"));
         id_class(
            "x_rotation",
            var0 -> var0.id_class(XL.id_class(var0.id_catch(), true, rfU_2::id_catch)),
            var0 -> var0.id_extends() == XL.id_class,
            new rgn_3("argument.entity.options.x_rotation.description")
         );
         id_class(
            "y_rotation",
            var0 -> var0.id_break(XL.id_class(var0.id_catch(), true, rfU_2::id_catch)),
            var0 -> var0.id_native() == XL.id_class,
            new rgn_3("argument.entity.options.y_rotation.description")
         );
         id_class("limit", var0 -> {
            int var1 = var0.id_catch().getCursor();
            int var2 = var0.id_catch().readInt();
            if (var2 < 1) {
               var0.id_catch().setCursor(var1);
               throw id_throws.createWithContext(var0.id_catch());
            } else {
               var0.id_class(var2);
               var0.id_protected(true);
            }
         }, var0 -> !var0.id_this() && !var0.id_return(), new rgn_3("argument.entity.options.limit.description"));
         id_class("sort", var0 -> {
            int var1 = var0.id_catch().getCursor();
            String var2 = var0.id_catch().readUnquotedString();
            var0.id_class((var0x, var1x) -> gR_2.id_break(Arrays.asList("nearest", "furthest", "random", "arbitrary"), var0x));

            var0.id_class(switch (var2) {
               case "nearest" -> RC.id_private;
               case "furthest" -> RC.id_implements;
               case "random" -> RC.id_finally;
               case "arbitrary" -> RC.id_catch;
               default -> {
                  var0.id_catch().setCursor(var1);
                  throw id_case.createWithContext(var0.id_catch(), var2);
               }
            });
            var0.id_throws(true);
         }, var0 -> !var0.id_this() && !var0.id_public(), new rgn_3("argument.entity.options.sort.description"));
         id_class("gamemode", var0 -> {
            var0.id_class((var1x, var2x) -> {
               String var3x = var1x.getRemaining().toLowerCase(Locale.ROOT);
               boolean var4x = !var0.id_while();
               boolean var5 = true;
               if (!var3x.isEmpty()) {
                  if (var3x.charAt(0) == '!') {
                     var4x = false;
                     var3x = var3x.substring(1);
                  } else {
                     var5 = false;
                  }
               }

               for (rRl_1 var9 : rRl_1.values()) {
                  if (var9 != rRl_1.NOT_SET && var9.id_break().toLowerCase(Locale.ROOT).startsWith(var3x)) {
                     if (var5) {
                        var1x.suggest("!" + var9.id_break());
                     }

                     if (var4x) {
                        var1x.suggest(var9.id_break());
                     }
                  }
               }

               return var1x.buildFuture();
            });
            int var1 = var0.id_catch().getCursor();
            boolean var2 = var0.id_throws();
            if (var0.id_while() && !var2) {
               var0.id_catch().setCursor(var1);
               throw id_break.createWithContext(var0.id_catch(), "gamemode");
            } else {
               String var3 = var0.id_catch().readUnquotedString();
               rRl_1 var4 = rRl_1.id_class(var3, rRl_1.NOT_SET);
               if (var4 == rRl_1.NOT_SET) {
                  var0.id_catch().setCursor(var1);
                  throw id_catch.createWithContext(var0.id_catch(), var3);
               } else {
                  var0.id_class(false);
                  var0.id_class(var2x -> {
                     if (!(var2x instanceof rhN_2)) {
                        return false;
                     } else {
                        rRl_1 var3x = ((rhN_2)var2x).id_finally.id_break();
                        return var2 ? var3x != var4 : var3x == var4;
                     }
                  });
                  if (var2) {
                     var0.id_catch(true);
                  } else {
                     var0.id_case(true);
                  }
               }
            }
         }, var0 -> !var0.id_goto(), new rgn_3("argument.entity.options.gamemode.description"));
         id_class("team", var0 -> {
            boolean var1 = var0.id_throws();
            String var2 = var0.id_catch().readUnquotedString();
            var0.id_class(var2x -> {
               if (!(var2x instanceof iB_2)) {
                  return false;
               } else {
                  rnM_2 var3 = var2x.BG();
                  String var4 = var3 == null ? "" : var3.id_class();
                  return var4.equals(var2) != var1;
               }
            });
            if (var1) {
               var0.id_implements(true);
            } else {
               var0.id_private(true);
            }
         }, var0 -> !var0.id_try(), new rgn_3("argument.entity.options.team.description"));
         id_class("type", var0 -> {
            var0.id_class((var1x, var2x) -> {
               gR_2.id_class(rVL.id_transient.id_protected(), var1x, String.valueOf('!'));
               gR_2.id_class(rlE_2.id_class().id_break(), var1x, "!#");
               if (!var0.id_interface()) {
                  gR_2.id_class(rVL.id_transient.id_protected(), var1x);
                  gR_2.id_class(rlE_2.id_class().id_break(), var1x, String.valueOf('#'));
               }

               return var1x.buildFuture();
            });
            int var1 = var0.id_catch().getCursor();
            boolean var2 = var0.id_throws();
            if (var0.id_interface() && !var2) {
               var0.id_catch().setCursor(var1);
               throw id_break.createWithContext(var0.id_catch(), "type");
            } else {
               if (var2) {
                  var0.id_instanceof();
               }

               if (var0.id_case()) {
                  rqO_2 var3 = rqO_2.id_class(var0.id_catch());
                  var0.id_class(var2x -> var2x.rC().g().id_protected().id_break(var3).id_class(var2x.BC()) != var2);
               } else {
                  rqO_2 var5 = rqO_2.id_class(var0.id_catch());
                  aI_2 var4 = rVL.id_transient.id_break(var5).orElseThrow(() -> {
                     var0.id_catch().setCursor(var1);
                     return id_private.createWithContext(var0.id_catch(), var5.toString());
                  });
                  if (Objects.equals(aI_2.rM, var4) && !var2) {
                     var0.id_class(false);
                  }

                  var0.id_class(var2x -> Objects.equals(var4, var2x.BC()) != var2);
                  if (!var2) {
                     var0.id_class(var4);
                  }
               }
            }
         }, var0 -> !var0.id_throw(), new rgn_3("argument.entity.options.type.description"));
         id_class("tag", var0 -> {
            boolean var1 = var0.id_throws();
            String var2 = var0.id_catch().readUnquotedString();
            var0.id_class(var2x -> "".equals(var2) ? var2x.y().isEmpty() != var1 : var2x.y().contains(var2) != var1);
         }, var0 -> true, new rgn_3("argument.entity.options.tag.description"));
         id_class("nbt", var0 -> {
            boolean var1 = var0.id_throws();
            rcd_3 var2 = new rcH_2(var0.id_catch()).id_case();
            var0.id_class(var2x -> {
               rcd_3 var3 = var2x.id_case(new rcd_3());
               if (var2x instanceof rhN_2) {
                  rdn_3 var4 = ((rhz_3)((rhN_2)var2x).id_implements[1]).id_byte();
                  if (!var4.id_class()) {
                     var3.id_class("SelectedItem", var4.id_break(new rcd_3()));
                  }
               }

               return rco_3.id_class(var2, var3, true) != var1;
            });
         }, var0 -> true, new rgn_3("argument.entity.options.nbt.description"));
         id_class("scores", var0 -> {
            StringReader var1 = var0.id_catch();
            HashMap var2 = Maps.newHashMap();
            var1.expect('{');
            var1.skipWhitespace();

            while (var1.canRead() && var1.peek() != '}') {
               var1.skipWhitespace();
               String var3 = var1.readUnquotedString();
               var1.skipWhitespace();
               var1.expect('=');
               var1.skipWhitespace();
               XF var4 = XF.id_class(var1);
               var2.put(var3, var4);
               var1.skipWhitespace();
               if (var1.canRead() && var1.peek() == ',') {
                  var1.skip();
               }
            }

            var1.expect('}');
            if (!var2.isEmpty()) {
               var0.id_class(var1x -> {
                  rnG_2 var2x = var1x.rC().R();
                  String var3x = var1x.i();

                  for (Entry var5 : var2.entrySet()) {
                     rnP_2 var6 = var2x.id_byte((String)var5.getKey());
                     if (var6 == null) {
                        return false;
                     }

                     if (!var2x.id_class(var3x, var6)) {
                        return false;
                     }

                     rAa_1 var7 = var2x.id_break(var3x, var6);
                     int var8 = var7.id_break();
                     if (!((XF)var5.getValue()).id_byte(var8)) {
                        return false;
                     }
                  }

                  return true;
               });
            }

            var0.id_finally(true);
         }, var0 -> !var0.id_char(), new rgn_3("argument.entity.options.scores.description"));
         id_class("advancements", var0 -> {
            StringReader var1 = var0.id_catch();
            HashMap var2 = Maps.newHashMap();
            var1.expect('{');
            var1.skipWhitespace();

            while (var1.canRead() && var1.peek() != '}') {
               var1.skipWhitespace();
               rqO_2 var3 = rqO_2.id_class(var1);
               var1.skipWhitespace();
               var1.expect('=');
               var1.skipWhitespace();
               if (var1.canRead() && var1.peek() == '{') {
                  HashMap var7 = Maps.newHashMap();
                  var1.skipWhitespace();
                  var1.expect('{');
                  var1.skipWhitespace();

                  while (var1.canRead() && var1.peek() != '}') {
                     var1.skipWhitespace();
                     String var5 = var1.readUnquotedString();
                     var1.skipWhitespace();
                     var1.expect('=');
                     var1.skipWhitespace();
                     boolean var6 = var1.readBoolean();
                     var7.put(var5, var1x -> var1x.id_class() == var6);
                     var1.skipWhitespace();
                     if (var1.canRead() && var1.peek() == ',') {
                        var1.skip();
                     }
                  }

                  var1.skipWhitespace();
                  var1.expect('}');
                  var1.skipWhitespace();
                  var2.put(var3, var1x -> {
                     for (Entry var3x : var7.entrySet()) {
                        OD var4x = var1x.id_byte((String)var3x.getKey());
                        if (var4x == null || !((Predicate)var3x.getValue()).test(var4x)) {
                           return false;
                        }
                     }

                     return true;
                  });
               } else {
                  boolean var4 = var1.readBoolean();
                  var2.put(var3, var1x -> var1x.id_class() == var4);
               }

               var1.skipWhitespace();
               if (var1.canRead() && var1.peek() == ',') {
                  var1.skip();
               }
            }

            var1.expect('}');
            if (!var2.isEmpty()) {
               var0.id_class(var1x -> {
                  if (!(var1x instanceof rhN_2 var2x)) {
                     return false;
                  } else {
                     hs_3 var3x = var2x.r();
                     Of_1 var4x = var2x.rC().t();

                     for (Entry var6x : var2.entrySet()) {
                        OT var7x = var4x.id_class((rqO_2)var6x.getKey());
                        if (var7x == null || !((Predicate)var6x.getValue()).test(var3x.id_break(var7x))) {
                           return false;
                        }
                     }

                     return true;
                  }
               });
               var0.id_class(false);
            }

            var0.id_extends(true);
         }, var0 -> !var0.id_abstract(), new rgn_3("argument.entity.options.advancements.description"));
         id_class("predicate", var0 -> {
            boolean var1 = var0.id_throws();
            rqO_2 var2 = rqO_2.id_class(var0.id_catch());
            var0.id_class(var2x -> {
               if (!((rYB)var2x.id_throws[7] instanceof rrEm_1 var3)) {
                  return false;
               } else {
                  rQz_1 var4 = var3.id_const().K().id_class(var2);
                  if (var4 == null) {
                     return false;
                  } else {
                     rzr_3 var5 = new rzP_2(var3).id_class(rzQ_2.id_class, var2x).id_class(rzQ_2.id_case, var2x.Ps()).id_class(rzz_3.id_protected);
                     return var1 ^ var4.test(var5);
                  }
               }
            });
         }, var0 -> true, new rgn_3("argument.entity.options.predicate.description"));
      }
   }

   public static RL id_class(RC var0, String var1, int var2) throws CommandSyntaxException {
      RA var3 = id_implements.get(var1);
      if (var3 != null) {
         if (var3.id_break.test(var0)) {
            return var3.id_class;
         } else {
            throw id_break.createWithContext(var0.id_catch(), var1);
         }
      } else {
         var0.id_catch().setCursor(var2);
         throw id_class.createWithContext(var0.id_catch(), var1);
      }
   }

   public static void id_class(RC var0, SuggestionsBuilder var1) {
      String var2 = var1.getRemaining().toLowerCase(Locale.ROOT);

      for (Entry var4 : id_implements.entrySet()) {
         if (((RA)var4.getValue()).id_break.test(var0) && ((String)var4.getKey()).toLowerCase(Locale.ROOT).startsWith(var2)) {
            var1.suggest((String)var4.getKey() + "=", ((RA)var4.getValue()).id_byte);
         }
      }
   }

   private static void id_class(String var0, RL var1, Predicate<RC> var2, rgP_2 var3) {
      id_implements.put(var0, new RA(var1, var2, var3));
   }
}
