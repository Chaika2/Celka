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
   private static final Map<String, RA> implements_ = Maps.newHashMap();
   public static final DynamicCommandExceptionType class_ = new DynamicCommandExceptionType(var0 -> new rgn_3("argument.entity.options.unknown", var0));
   public static final DynamicCommandExceptionType break_ = new DynamicCommandExceptionType(var0 -> new rgn_3("argument.entity.options.inapplicable", var0));
   public static final SimpleCommandExceptionType byte_ = new SimpleCommandExceptionType(new rgn_3("argument.entity.options.distance.negative"));
   public static final SimpleCommandExceptionType protected_ = new SimpleCommandExceptionType(new rgn_3("argument.entity.options.level.negative"));
   public static final SimpleCommandExceptionType throws_ = new SimpleCommandExceptionType(new rgn_3("argument.entity.options.limit.toosmall"));
   public static final DynamicCommandExceptionType case_ = new DynamicCommandExceptionType(var0 -> new rgn_3("argument.entity.options.sort.irreversible", var0));
   public static final DynamicCommandExceptionType catch_ = new DynamicCommandExceptionType(var0 -> new rgn_3("argument.entity.options.mode.invalid", var0));
   public static final DynamicCommandExceptionType private_ = new DynamicCommandExceptionType(var0 -> new rgn_3("argument.entity.options.type.invalid", var0));

   public static void class_() {
      if (implements_.isEmpty()) {
         class_("name", var0 -> {
            int var1 = var0.catch_().getCursor();
            boolean var2 = var0.throws_();
            String var3 = var0.catch_().readString();
            if (var0.synchronized_() && !var2) {
               var0.catch_().setCursor(var1);
               throw break_.createWithContext(var0.catch_(), "name");
            } else {
               if (var2) {
                  var0.byte_(true);
               } else {
                  var0.break_(true);
               }

               var0.class_(var2x -> var2x.g().getString().equals(var3) != var2);
            }
         }, var0 -> !var0.else_(), new rgn_3("argument.entity.options.name.description"));
         class_("distance", var0 -> {
            int var1 = var0.catch_().getCursor();
            Xm_1 var2 = Xm_1.class_(var0.catch_());
            if (var2.class_() != null && var2.class_() < 0.0F || var2.break_() != null && var2.break_() < 0.0F) {
               var0.catch_().setCursor(var1);
               throw byte_.createWithContext(var0.catch_());
            } else {
               var0.class_(var2);
               var0.private_();
            }
         }, var0 -> var0.implements_().byte_(), new rgn_3("argument.entity.options.distance.description"));
         class_("level", var0 -> {
            int var1 = var0.catch_().getCursor();
            XF var2 = XF.class_(var0.catch_());
            if (var2.class_() != null && var2.class_() < 0 || var2.break_() != null && var2.break_() < 0) {
               var0.catch_().setCursor(var1);
               throw protected_.createWithContext(var0.catch_());
            } else {
               var0.class_(var2);
               var0.class_(false);
            }
         }, var0 -> var0.finally_().byte_(), new rgn_3("argument.entity.options.level.description"));
         class_("x", var0 -> {
            var0.private_();
            var0.class_(var0.catch_().readDouble());
         }, var0 -> var0.volatile_() == null, new rgn_3("argument.entity.options.x.description"));
         class_("y", var0 -> {
            var0.private_();
            var0.break_(var0.catch_().readDouble());
         }, var0 -> var0.final_() == null, new rgn_3("argument.entity.options.y.description"));
         class_("z", var0 -> {
            var0.private_();
            var0.byte_(var0.catch_().readDouble());
         }, var0 -> var0.package_() == null, new rgn_3("argument.entity.options.z.description"));
         class_("dx", var0 -> {
            var0.private_();
            var0.protected_(var0.catch_().readDouble());
         }, var0 -> var0.int_() == null, new rgn_3("argument.entity.options.dx.description"));
         class_("dy", var0 -> {
            var0.private_();
            var0.throws_(var0.catch_().readDouble());
         }, var0 -> var0.new_() == null, new rgn_3("argument.entity.options.dy.description"));
         class_("dz", var0 -> {
            var0.private_();
            var0.case_(var0.catch_().readDouble());
         }, var0 -> var0.continue_() == null, new rgn_3("argument.entity.options.dz.description"));
         class_(
            "x_rotation",
            var0 -> var0.class_(XL.class_(var0.catch_(), true, rfU_2::catch_)),
            var0 -> var0.extends_() == XL.class_,
            new rgn_3("argument.entity.options.x_rotation.description")
         );
         class_(
            "y_rotation",
            var0 -> var0.break_(XL.class_(var0.catch_(), true, rfU_2::catch_)),
            var0 -> var0.native_() == XL.class_,
            new rgn_3("argument.entity.options.y_rotation.description")
         );
         class_("limit", var0 -> {
            int var1 = var0.catch_().getCursor();
            int var2 = var0.catch_().readInt();
            if (var2 < 1) {
               var0.catch_().setCursor(var1);
               throw throws_.createWithContext(var0.catch_());
            } else {
               var0.class_(var2);
               var0.protected_(true);
            }
         }, var0 -> !var0.this_() && !var0.return_(), new rgn_3("argument.entity.options.limit.description"));
         class_("sort", var0 -> {
            int var1 = var0.catch_().getCursor();
            String var2 = var0.catch_().readUnquotedString();
            var0.class_((var0x, var1x) -> gR_2.break_(Arrays.asList("nearest", "furthest", "random", "arbitrary"), var0x));

            var0.class_(switch (var2) {
               case "nearest" -> RC.private_;
               case "furthest" -> RC.implements_;
               case "random" -> RC.finally_;
               case "arbitrary" -> RC.catch_;
               default -> {
                  var0.catch_().setCursor(var1);
                  throw case_.createWithContext(var0.catch_(), var2);
               }
            });
            var0.throws_(true);
         }, var0 -> !var0.this_() && !var0.public_(), new rgn_3("argument.entity.options.sort.description"));
         class_("gamemode", var0 -> {
            var0.class_((var1x, var2x) -> {
               String var3x = var1x.getRemaining().toLowerCase(Locale.ROOT);
               boolean var4x = !var0.while_();
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
                  if (var9 != rRl_1.NOT_SET && var9.break_().toLowerCase(Locale.ROOT).startsWith(var3x)) {
                     if (var5) {
                        var1x.suggest("!" + var9.break_());
                     }

                     if (var4x) {
                        var1x.suggest(var9.break_());
                     }
                  }
               }

               return var1x.buildFuture();
            });
            int var1 = var0.catch_().getCursor();
            boolean var2 = var0.throws_();
            if (var0.while_() && !var2) {
               var0.catch_().setCursor(var1);
               throw break_.createWithContext(var0.catch_(), "gamemode");
            } else {
               String var3 = var0.catch_().readUnquotedString();
               rRl_1 var4 = rRl_1.class_(var3, rRl_1.NOT_SET);
               if (var4 == rRl_1.NOT_SET) {
                  var0.catch_().setCursor(var1);
                  throw catch_.createWithContext(var0.catch_(), var3);
               } else {
                  var0.class_(false);
                  var0.class_(var2x -> {
                     if (!(var2x instanceof rhN_2)) {
                        return false;
                     } else {
                        rRl_1 var3x = ((rhN_2)var2x).finally_.break_();
                        return var2 ? var3x != var4 : var3x == var4;
                     }
                  });
                  if (var2) {
                     var0.catch_(true);
                  } else {
                     var0.case_(true);
                  }
               }
            }
         }, var0 -> !var0.goto_(), new rgn_3("argument.entity.options.gamemode.description"));
         class_("team", var0 -> {
            boolean var1 = var0.throws_();
            String var2 = var0.catch_().readUnquotedString();
            var0.class_(var2x -> {
               if (!(var2x instanceof iB_2)) {
                  return false;
               } else {
                  rnM_2 var3 = var2x.BG();
                  String var4 = var3 == null ? "" : var3.class_();
                  return var4.equals(var2) != var1;
               }
            });
            if (var1) {
               var0.implements_(true);
            } else {
               var0.private_(true);
            }
         }, var0 -> !var0.try_(), new rgn_3("argument.entity.options.team.description"));
         class_("type", var0 -> {
            var0.class_((var1x, var2x) -> {
               gR_2.class_(rVL.transient_.protected_(), var1x, String.valueOf('!'));
               gR_2.class_(rlE_2.class_().break_(), var1x, "!#");
               if (!var0.interface_()) {
                  gR_2.class_(rVL.transient_.protected_(), var1x);
                  gR_2.class_(rlE_2.class_().break_(), var1x, String.valueOf('#'));
               }

               return var1x.buildFuture();
            });
            int var1 = var0.catch_().getCursor();
            boolean var2 = var0.throws_();
            if (var0.interface_() && !var2) {
               var0.catch_().setCursor(var1);
               throw break_.createWithContext(var0.catch_(), "type");
            } else {
               if (var2) {
                  var0.instanceof_();
               }

               if (var0.case_()) {
                  rqO_2 var3 = rqO_2.class_(var0.catch_());
                  var0.class_(var2x -> var2x.rC().g().protected_().break_(var3).class_(var2x.BC()) != var2);
               } else {
                  rqO_2 var5 = rqO_2.class_(var0.catch_());
                  aI_2 var4 = rVL.transient_.break_(var5).orElseThrow(() -> {
                     var0.catch_().setCursor(var1);
                     return private_.createWithContext(var0.catch_(), var5.toString());
                  });
                  if (Objects.equals(aI_2.rM, var4) && !var2) {
                     var0.class_(false);
                  }

                  var0.class_(var2x -> Objects.equals(var4, var2x.BC()) != var2);
                  if (!var2) {
                     var0.class_(var4);
                  }
               }
            }
         }, var0 -> !var0.throw_(), new rgn_3("argument.entity.options.type.description"));
         class_("tag", var0 -> {
            boolean var1 = var0.throws_();
            String var2 = var0.catch_().readUnquotedString();
            var0.class_(var2x -> "".equals(var2) ? var2x.y().isEmpty() != var1 : var2x.y().contains(var2) != var1);
         }, var0 -> true, new rgn_3("argument.entity.options.tag.description"));
         class_("nbt", var0 -> {
            boolean var1 = var0.throws_();
            rcd_3 var2 = new rcH_2(var0.catch_()).case_();
            var0.class_(var2x -> {
               rcd_3 var3 = var2x.case_(new rcd_3());
               if (var2x instanceof rhN_2) {
                  rdn_3 var4 = ((rhz_3)((rhN_2)var2x).implements_[1]).byte_();
                  if (!var4.class_()) {
                     var3.class_("SelectedItem", var4.break_(new rcd_3()));
                  }
               }

               return rco_3.class_(var2, var3, true) != var1;
            });
         }, var0 -> true, new rgn_3("argument.entity.options.nbt.description"));
         class_("scores", var0 -> {
            StringReader var1 = var0.catch_();
            HashMap var2 = Maps.newHashMap();
            var1.expect('{');
            var1.skipWhitespace();

            while (var1.canRead() && var1.peek() != '}') {
               var1.skipWhitespace();
               String var3 = var1.readUnquotedString();
               var1.skipWhitespace();
               var1.expect('=');
               var1.skipWhitespace();
               XF var4 = XF.class_(var1);
               var2.put(var3, var4);
               var1.skipWhitespace();
               if (var1.canRead() && var1.peek() == ',') {
                  var1.skip();
               }
            }

            var1.expect('}');
            if (!var2.isEmpty()) {
               var0.class_(var1x -> {
                  rnG_2 var2x = var1x.rC().R();
                  String var3x = var1x.i();

                  for (Entry var5 : var2.entrySet()) {
                     rnP_2 var6 = var2x.byte_((String)var5.getKey());
                     if (var6 == null) {
                        return false;
                     }

                     if (!var2x.class_(var3x, var6)) {
                        return false;
                     }

                     rAa_1 var7 = var2x.break_(var3x, var6);
                     int var8 = var7.break_();
                     if (!((XF)var5.getValue()).byte_(var8)) {
                        return false;
                     }
                  }

                  return true;
               });
            }

            var0.finally_(true);
         }, var0 -> !var0.char_(), new rgn_3("argument.entity.options.scores.description"));
         class_("advancements", var0 -> {
            StringReader var1 = var0.catch_();
            HashMap var2 = Maps.newHashMap();
            var1.expect('{');
            var1.skipWhitespace();

            while (var1.canRead() && var1.peek() != '}') {
               var1.skipWhitespace();
               rqO_2 var3 = rqO_2.class_(var1);
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
                     var7.put(var5, var1x -> var1x.class_() == var6);
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
                        OD var4x = var1x.byte_((String)var3x.getKey());
                        if (var4x == null || !((Predicate)var3x.getValue()).test(var4x)) {
                           return false;
                        }
                     }

                     return true;
                  });
               } else {
                  boolean var4 = var1.readBoolean();
                  var2.put(var3, var1x -> var1x.class_() == var4);
               }

               var1.skipWhitespace();
               if (var1.canRead() && var1.peek() == ',') {
                  var1.skip();
               }
            }

            var1.expect('}');
            if (!var2.isEmpty()) {
               var0.class_(var1x -> {
                  if (!(var1x instanceof rhN_2 var2x)) {
                     return false;
                  } else {
                     hs_3 var3x = var2x.r();
                     Of_1 var4x = var2x.rC().t();

                     for (Entry var6x : var2.entrySet()) {
                        OT var7x = var4x.class_((rqO_2)var6x.getKey());
                        if (var7x == null || !((Predicate)var6x.getValue()).test(var3x.break_(var7x))) {
                           return false;
                        }
                     }

                     return true;
                  }
               });
               var0.class_(false);
            }

            var0.extends_(true);
         }, var0 -> !var0.abstract_(), new rgn_3("argument.entity.options.advancements.description"));
         class_("predicate", var0 -> {
            boolean var1 = var0.throws_();
            rqO_2 var2 = rqO_2.class_(var0.catch_());
            var0.class_(var2x -> {
               if (!((rYB)var2x.throws_[7] instanceof rrEm_1 var3)) {
                  return false;
               } else {
                  rQz_1 var4 = var3.const_().K().class_(var2);
                  if (var4 == null) {
                     return false;
                  } else {
                     rzr_3 var5 = new rzP_2(var3).class_(rzQ_2.class_, var2x).class_(rzQ_2.case_, var2x.Ps()).class_(rzz_3.protected_);
                     return var1 ^ var4.test(var5);
                  }
               }
            });
         }, var0 -> true, new rgn_3("argument.entity.options.predicate.description"));
      }
   }

   public static RL class_(RC var0, String var1, int var2) throws CommandSyntaxException {
      RA var3 = implements_.get(var1);
      if (var3 != null) {
         if (var3.break_.test(var0)) {
            return var3.class_;
         } else {
            throw break_.createWithContext(var0.catch_(), var1);
         }
      } else {
         var0.catch_().setCursor(var2);
         throw class_.createWithContext(var0.catch_(), var1);
      }
   }

   public static void class_(RC var0, SuggestionsBuilder var1) {
      String var2 = var1.getRemaining().toLowerCase(Locale.ROOT);

      for (Entry var4 : implements_.entrySet()) {
         if (((RA)var4.getValue()).break_.test(var0) && ((String)var4.getKey()).toLowerCase(Locale.ROOT).startsWith(var2)) {
            var1.suggest((String)var4.getKey() + "=", ((RA)var4.getValue()).byte_);
         }
      }
   }

   private static void class_(String var0, RL var1, Predicate<RC> var2, rgP_2 var3) {
      implements_.put(var0, new RA(var1, var2, var3));
   }
}
