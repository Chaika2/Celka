/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  com.mojang.brigadier.ImmutableStringReader
 *  com.mojang.brigadier.Message
 *  com.mojang.brigadier.StringReader
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.exceptions.DynamicCommandExceptionType
 *  com.mojang.brigadier.exceptions.SimpleCommandExceptionType
 *  com.mojang.brigadier.suggestion.SuggestionsBuilder
 */
package celestial;

import celestial.OD;
import celestial.OT;
import celestial.Of_1;
import celestial.RA;
import celestial.RC;
import celestial.RL;
import celestial.XF;
import celestial.XL;
import celestial.Xm_1;
import celestial.aI_2;
import celestial.gR_2;
import celestial.hs_3;
import celestial.iB_2;
import celestial.rAa_1;
import celestial.rQz_1;
import celestial.rRl_1;
import celestial.rVL;
import celestial.rYB;
import celestial.rcH_2;
import celestial.rcd_3;
import celestial.rco_3;
import celestial.rdn_3;
import celestial.rfU_2;
import celestial.rgP_2;
import celestial.rgn_3;
import celestial.rhN_2;
import celestial.rhz_3;
import celestial.rlE_2;
import celestial.rnG_2;
import celestial.rnM_2;
import celestial.rnP_2;
import celestial.rqO_2;
import celestial.rrEm_1;
import celestial.rzP_2;
import celestial.rzQ_2;
import celestial.rzr_3;
import celestial.rzz_3;
import com.google.common.collect.Maps;
import com.mojang.brigadier.ImmutableStringReader;
import com.mojang.brigadier.Message;
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
import java.util.function.Predicate;

public class RF {
    private static final Map<String, RA> id_implements = Maps.newHashMap();
    public static final DynamicCommandExceptionType id_class = new DynamicCommandExceptionType(object -> new rgn_3("argument.entity.options.unknown", object));
    public static final DynamicCommandExceptionType id_break = new DynamicCommandExceptionType(object -> new rgn_3("argument.entity.options.inapplicable", object));
    public static final SimpleCommandExceptionType id_byte = new SimpleCommandExceptionType((Message)new rgn_3("argument.entity.options.distance.negative"));
    public static final SimpleCommandExceptionType id_protected = new SimpleCommandExceptionType((Message)new rgn_3("argument.entity.options.level.negative"));
    public static final SimpleCommandExceptionType id_throws = new SimpleCommandExceptionType((Message)new rgn_3("argument.entity.options.limit.toosmall"));
    public static final DynamicCommandExceptionType id_case = new DynamicCommandExceptionType(object -> new rgn_3("argument.entity.options.sort.irreversible", object));
    public static final DynamicCommandExceptionType id_catch = new DynamicCommandExceptionType(object -> new rgn_3("argument.entity.options.mode.invalid", object));
    public static final DynamicCommandExceptionType id_private = new DynamicCommandExceptionType(object -> new rgn_3("argument.entity.options.type.invalid", object));

    public static void id_class() {
        if (id_implements.isEmpty()) {
            RF.id_class("name", rC -> {
                int n = rC.id_catch().getCursor();
                boolean bl = rC.id_throws();
                String string = rC.id_catch().readString();
                if (rC.id_synchronized() && !bl) {
                    rC.id_catch().setCursor(n);
                    throw id_break.createWithContext((ImmutableStringReader)rC.id_catch(), (Object)"name");
                }
                if (bl) {
                    rC.id_byte(true);
                } else {
                    rC.id_break(true);
                }
                rC.id_class(an_32 -> an_32.g().getString().equals(string) != bl);
            }, rC -> !rC.id_else(), new rgn_3("argument.entity.options.name.description"));
            RF.id_class("distance", rC -> {
                int n = rC.id_catch().getCursor();
                Xm_1 xm_1 = Xm_1.id_class(rC.id_catch());
                if (xm_1.id_class() != null && ((Float)xm_1.id_class()).floatValue() < 0.0f || xm_1.id_break() != null && ((Float)xm_1.id_break()).floatValue() < 0.0f) {
                    rC.id_catch().setCursor(n);
                    throw id_byte.createWithContext((ImmutableStringReader)rC.id_catch());
                }
                rC.id_class(xm_1);
                rC.id_private();
            }, rC -> rC.id_implements().id_byte(), new rgn_3("argument.entity.options.distance.description"));
            RF.id_class("level", rC -> {
                int n = rC.id_catch().getCursor();
                XF xF = XF.id_class(rC.id_catch());
                if (xF.id_class() != null && (Integer)xF.id_class() < 0 || xF.id_break() != null && (Integer)xF.id_break() < 0) {
                    rC.id_catch().setCursor(n);
                    throw id_protected.createWithContext((ImmutableStringReader)rC.id_catch());
                }
                rC.id_class(xF);
                rC.id_class(false);
            }, rC -> rC.id_finally().id_byte(), new rgn_3("argument.entity.options.level.description"));
            RF.id_class("x", rC -> {
                rC.id_private();
                rC.id_class(rC.id_catch().readDouble());
            }, rC -> rC.id_volatile() == null, new rgn_3("argument.entity.options.x.description"));
            RF.id_class("y", rC -> {
                rC.id_private();
                rC.id_break(rC.id_catch().readDouble());
            }, rC -> rC.id_final() == null, new rgn_3("argument.entity.options.y.description"));
            RF.id_class("z", rC -> {
                rC.id_private();
                rC.id_byte(rC.id_catch().readDouble());
            }, rC -> rC.id_package() == null, new rgn_3("argument.entity.options.z.description"));
            RF.id_class("dx", rC -> {
                rC.id_private();
                rC.id_protected(rC.id_catch().readDouble());
            }, rC -> rC.id_int() == null, new rgn_3("argument.entity.options.dx.description"));
            RF.id_class("dy", rC -> {
                rC.id_private();
                rC.id_throws(rC.id_catch().readDouble());
            }, rC -> rC.id_new() == null, new rgn_3("argument.entity.options.dy.description"));
            RF.id_class("dz", rC -> {
                rC.id_private();
                rC.id_case(rC.id_catch().readDouble());
            }, rC -> rC.id_continue() == null, new rgn_3("argument.entity.options.dz.description"));
            RF.id_class("x_rotation", rC -> rC.id_class(XL.id_class(rC.id_catch(), true, rfU_2::id_catch)), rC -> rC.id_extends() == XL.id_class, new rgn_3("argument.entity.options.x_rotation.description"));
            RF.id_class("y_rotation", rC -> rC.id_break(XL.id_class(rC.id_catch(), true, rfU_2::id_catch)), rC -> rC.id_native() == XL.id_class, new rgn_3("argument.entity.options.y_rotation.description"));
            RF.id_class("limit", rC -> {
                int n = rC.id_catch().getCursor();
                int n2 = rC.id_catch().readInt();
                if (n2 < 1) {
                    rC.id_catch().setCursor(n);
                    throw id_throws.createWithContext((ImmutableStringReader)rC.id_catch());
                }
                rC.id_class(n2);
                rC.id_protected(true);
            }, rC -> !rC.id_this() && !rC.id_return(), new rgn_3("argument.entity.options.limit.description"));
            RF.id_class("sort", rC -> {
                int n = rC.id_catch().getCursor();
                String string = rC.id_catch().readUnquotedString();
                rC.id_class((suggestionsBuilder, consumer) -> gR_2.id_break(Arrays.asList("nearest", "furthest", "random", "arbitrary"), suggestionsBuilder));
                int n2 = -1;
                switch (string.hashCode()) {
                    case -938285885: {
                        if (!string.equals("random")) break;
                        n2 = 2;
                        break;
                    }
                    case 1510793967: {
                        if (!string.equals("furthest")) break;
                        n2 = 1;
                        break;
                    }
                    case 1780188658: {
                        if (!string.equals("arbitrary")) break;
                        n2 = 3;
                        break;
                    }
                    case 1825779806: {
                        if (!string.equals("nearest")) break;
                        n2 = 0;
                    }
                }
                rC.id_class(switch (n2) {
                    case 0 -> RC.id_private;
                    case 1 -> RC.id_implements;
                    case 2 -> RC.id_finally;
                    case 3 -> RC.id_catch;
                    default -> {
                        rC.id_catch().setCursor(n);
                        throw id_case.createWithContext((ImmutableStringReader)rC.id_catch(), (Object)string);
                    }
                });
                rC.id_throws(true);
            }, rC -> !rC.id_this() && !rC.id_public(), new rgn_3("argument.entity.options.sort.description"));
            RF.id_class("gamemode", rC -> {
                rC.id_class((suggestionsBuilder, consumer) -> {
                    String string = suggestionsBuilder.getRemaining().toLowerCase(Locale.ROOT);
                    boolean bl = !rC.id_while();
                    boolean bl2 = true;
                    if (!string.isEmpty()) {
                        if (string.charAt(0) == '!') {
                            bl = false;
                            string = string.substring(1);
                        } else {
                            bl2 = false;
                        }
                    }
                    for (rRl_1 rRl_12 : rRl_1.values()) {
                        if (rRl_12 == rRl_1.NOT_SET || !rRl_12.id_break().toLowerCase(Locale.ROOT).startsWith(string)) continue;
                        if (bl2) {
                            suggestionsBuilder.suggest("!" + rRl_12.id_break());
                        }
                        if (!bl) continue;
                        suggestionsBuilder.suggest(rRl_12.id_break());
                    }
                    return suggestionsBuilder.buildFuture();
                });
                int n = rC.id_catch().getCursor();
                boolean bl = rC.id_throws();
                if (rC.id_while() && !bl) {
                    rC.id_catch().setCursor(n);
                    throw id_break.createWithContext((ImmutableStringReader)rC.id_catch(), (Object)"gamemode");
                }
                String string = rC.id_catch().readUnquotedString();
                rRl_1 rRl_12 = rRl_1.id_class(string, rRl_1.NOT_SET);
                if (rRl_12 == rRl_1.NOT_SET) {
                    rC.id_catch().setCursor(n);
                    throw id_catch.createWithContext((ImmutableStringReader)rC.id_catch(), (Object)string);
                }
                rC.id_class(false);
                rC.id_class(an_32 -> {
                    if (!(an_32 instanceof rhN_2)) {
                        return false;
                    }
                    rRl_1 rRl_13 = ((rhN_2)an_32).id_finally.id_break();
                    return bl ? rRl_13 != rRl_12 : rRl_13 == rRl_12;
                });
                if (bl) {
                    rC.id_catch(true);
                } else {
                    rC.id_case(true);
                }
            }, rC -> !rC.id_goto(), new rgn_3("argument.entity.options.gamemode.description"));
            RF.id_class("team", rC -> {
                boolean bl = rC.id_throws();
                String string = rC.id_catch().readUnquotedString();
                rC.id_class(an_32 -> {
                    if (!(an_32 instanceof iB_2)) {
                        return false;
                    }
                    rnM_2 rnM_22 = an_32.BG();
                    String string2 = rnM_22 == null ? "" : rnM_22.id_class();
                    return string2.equals(string) != bl;
                });
                if (bl) {
                    rC.id_implements(true);
                } else {
                    rC.id_private(true);
                }
            }, rC -> !rC.id_try(), new rgn_3("argument.entity.options.team.description"));
            RF.id_class("type", rC -> {
                rC.id_class((suggestionsBuilder, consumer) -> {
                    gR_2.id_class(rVL.id_transient.id_protected(), suggestionsBuilder, String.valueOf('!'));
                    gR_2.id_class(rlE_2.id_class().id_break(), suggestionsBuilder, "!#");
                    if (!rC.id_interface()) {
                        gR_2.id_class(rVL.id_transient.id_protected(), suggestionsBuilder);
                        gR_2.id_class(rlE_2.id_class().id_break(), suggestionsBuilder, String.valueOf('#'));
                    }
                    return suggestionsBuilder.buildFuture();
                });
                int n = rC.id_catch().getCursor();
                boolean bl = rC.id_throws();
                if (rC.id_interface() && !bl) {
                    rC.id_catch().setCursor(n);
                    throw id_break.createWithContext((ImmutableStringReader)rC.id_catch(), (Object)"type");
                }
                if (bl) {
                    rC.id_instanceof();
                }
                if (rC.id_case()) {
                    rqO_2 rqO_22 = rqO_2.id_class(rC.id_catch());
                    rC.id_class(an_32 -> an_32.rC().g().id_protected().id_break(rqO_22).id_class(an_32.BC()) != bl);
                } else {
                    rqO_2 rqO_23 = rqO_2.id_class(rC.id_catch());
                    aI_2<?> aI_22 = rVL.id_transient.id_break(rqO_23).orElseThrow(() -> {
                        rC.id_catch().setCursor(n);
                        return id_private.createWithContext((ImmutableStringReader)rC.id_catch(), (Object)rqO_23.toString());
                    });
                    if (Objects.equals(aI_2.rM, aI_22) && !bl) {
                        rC.id_class(false);
                    }
                    rC.id_class(an_32 -> Objects.equals(aI_22, an_32.BC()) != bl);
                    if (!bl) {
                        rC.id_class(aI_22);
                    }
                }
            }, rC -> !rC.id_throw(), new rgn_3("argument.entity.options.type.description"));
            RF.id_class("tag", rC -> {
                boolean bl = rC.id_throws();
                String string = rC.id_catch().readUnquotedString();
                rC.id_class(an_32 -> {
                    if ("".equals(string)) {
                        return an_32.y().isEmpty() != bl;
                    }
                    return an_32.y().contains(string) != bl;
                });
            }, rC -> true, new rgn_3("argument.entity.options.tag.description"));
            RF.id_class("nbt", rC -> {
                boolean bl = rC.id_throws();
                rcd_3 rcd_32 = new rcH_2(rC.id_catch()).id_case();
                rC.id_class(an_32 -> {
                    rdn_3 rdn_32;
                    rcd_3 rcd_33 = an_32.id_case(new rcd_3());
                    if (an_32 instanceof rhN_2 && !(rdn_32 = ((rhz_3)((rhN_2)an_32).id_implements[1]).id_byte()).id_class()) {
                        rcd_33.id_class("SelectedItem", rdn_32.id_break(new rcd_3()));
                    }
                    return rco_3.id_class(rcd_32, rcd_33, true) != bl;
                });
            }, rC -> true, new rgn_3("argument.entity.options.nbt.description"));
            RF.id_class("scores", rC -> {
                StringReader stringReader = rC.id_catch();
                HashMap hashMap = Maps.newHashMap();
                stringReader.expect('{');
                stringReader.skipWhitespace();
                while (stringReader.canRead() && stringReader.peek() != '}') {
                    stringReader.skipWhitespace();
                    String string = stringReader.readUnquotedString();
                    stringReader.skipWhitespace();
                    stringReader.expect('=');
                    stringReader.skipWhitespace();
                    XF xF = XF.id_class(stringReader);
                    hashMap.put(string, xF);
                    stringReader.skipWhitespace();
                    if (!stringReader.canRead() || stringReader.peek() != ',') continue;
                    stringReader.skip();
                }
                stringReader.expect('}');
                if (!hashMap.isEmpty()) {
                    rC.id_class(an_32 -> {
                        rnG_2 rnG_22 = an_32.rC().R();
                        String string = an_32.i();
                        for (Map.Entry entry : hashMap.entrySet()) {
                            rnP_2 rnP_22 = rnG_22.id_byte((String)entry.getKey());
                            if (rnP_22 == null) {
                                return false;
                            }
                            if (!rnG_22.id_class(string, rnP_22)) {
                                return false;
                            }
                            rAa_1 rAa_12 = rnG_22.id_break(string, rnP_22);
                            int n = rAa_12.id_break();
                            if (((XF)entry.getValue()).id_byte(n)) continue;
                            return false;
                        }
                        return true;
                    });
                }
                rC.id_finally(true);
            }, rC -> !rC.id_char(), new rgn_3("argument.entity.options.scores.description"));
            RF.id_class("advancements", rC -> {
                StringReader stringReader = rC.id_catch();
                HashMap hashMap = Maps.newHashMap();
                stringReader.expect('{');
                stringReader.skipWhitespace();
                while (stringReader.canRead() && stringReader.peek() != '}') {
                    stringReader.skipWhitespace();
                    rqO_2 rqO_22 = rqO_2.id_class(stringReader);
                    stringReader.skipWhitespace();
                    stringReader.expect('=');
                    stringReader.skipWhitespace();
                    if (stringReader.canRead() && stringReader.peek() == '{') {
                        HashMap hashMap2 = Maps.newHashMap();
                        stringReader.skipWhitespace();
                        stringReader.expect('{');
                        stringReader.skipWhitespace();
                        while (stringReader.canRead() && stringReader.peek() != '}') {
                            stringReader.skipWhitespace();
                            String string = stringReader.readUnquotedString();
                            stringReader.skipWhitespace();
                            stringReader.expect('=');
                            stringReader.skipWhitespace();
                            boolean bl = stringReader.readBoolean();
                            hashMap2.put(string, oD -> oD.id_class() == bl);
                            stringReader.skipWhitespace();
                            if (!stringReader.canRead() || stringReader.peek() != ',') continue;
                            stringReader.skip();
                        }
                        stringReader.skipWhitespace();
                        stringReader.expect('}');
                        stringReader.skipWhitespace();
                        hashMap.put(rqO_22, oj_1 -> {
                            for (Map.Entry entry : hashMap2.entrySet()) {
                                OD oD = oj_1.id_byte((String)entry.getKey());
                                if (oD != null && ((Predicate)entry.getValue()).test(oD)) continue;
                                return false;
                            }
                            return true;
                        });
                    } else {
                        boolean bl = stringReader.readBoolean();
                        hashMap.put(rqO_22, oj_1 -> oj_1.id_class() == bl);
                    }
                    stringReader.skipWhitespace();
                    if (!stringReader.canRead() || stringReader.peek() != ',') continue;
                    stringReader.skip();
                }
                stringReader.expect('}');
                if (!hashMap.isEmpty()) {
                    rC.id_class(an_32 -> {
                        if (!(an_32 instanceof rhN_2)) {
                            return false;
                        }
                        rhN_2 rhN_22 = (rhN_2)an_32;
                        hs_3 hs_32 = rhN_22.r();
                        Of_1 of_1 = rhN_22.rC().t();
                        for (Map.Entry entry : hashMap.entrySet()) {
                            OT oT = of_1.id_class((rqO_2)entry.getKey());
                            if (oT != null && ((Predicate)entry.getValue()).test(hs_32.id_break(oT))) continue;
                            return false;
                        }
                        return true;
                    });
                    rC.id_class(false);
                }
                rC.id_extends(true);
            }, rC -> !rC.id_abstract(), new rgn_3("argument.entity.options.advancements.description"));
            RF.id_class("predicate", rC -> {
                boolean bl = rC.id_throws();
                rqO_2 rqO_22 = rqO_2.id_class(rC.id_catch());
                rC.id_class(an_32 -> {
                    if (!((rYB)an_32.id_throws[7] instanceof rrEm_1)) {
                        return false;
                    }
                    rrEm_1 rrEm_12 = (rrEm_1)((rYB)an_32.id_throws[7]);
                    rQz_1 rQz_12 = rrEm_12.id_const().K().id_class(rqO_22);
                    if (rQz_12 == null) {
                        return false;
                    }
                    rzr_3 rzr_32 = new rzP_2(rrEm_12).id_class(rzQ_2.id_class, an_32).id_class(rzQ_2.id_case, an_32.Ps()).id_class(rzz_3.id_protected);
                    return bl ^ rQz_12.test(rzr_32);
                });
            }, rC -> true, new rgn_3("argument.entity.options.predicate.description"));
        }
    }

    public static RL id_class(RC rC, String string, int n) throws CommandSyntaxException {
        RA rA = id_implements.get(string);
        if (rA != null) {
            if (rA.id_break.test(rC)) {
                return rA.id_class;
            }
            throw id_break.createWithContext((ImmutableStringReader)rC.id_catch(), (Object)string);
        }
        rC.id_catch().setCursor(n);
        throw id_class.createWithContext((ImmutableStringReader)rC.id_catch(), (Object)string);
    }

    public static void id_class(RC rC, SuggestionsBuilder suggestionsBuilder) {
        String string = suggestionsBuilder.getRemaining().toLowerCase(Locale.ROOT);
        for (Map.Entry<String, RA> entry : id_implements.entrySet()) {
            if (!entry.getValue().id_break.test(rC) || !entry.getKey().toLowerCase(Locale.ROOT).startsWith(string)) continue;
            suggestionsBuilder.suggest(entry.getKey() + "=", (Message)entry.getValue().id_byte);
        }
    }

    private static void id_class(String string, RL rL, Predicate<RC> predicate, rgP_2 rgP_22) {
        id_implements.put(string, new RA(rL, predicate, rgP_22));
    }
}

