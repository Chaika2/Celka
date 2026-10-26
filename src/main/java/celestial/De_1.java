/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Sets
 *  com.google.gson.Gson
 *  com.google.gson.GsonBuilder
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package celestial;

import celestial.DA;
import celestial.DF;
import celestial.DT;
import celestial.DZ;
import celestial.Dn_1;
import celestial.Dw_1;
import celestial.JS;
import celestial.Ot_1;
import celestial.UB;
import celestial.UG;
import celestial.UM;
import celestial.Us_1;
import celestial.XE;
import celestial.XF;
import celestial.XX;
import celestial.Xb_1;
import celestial.Xh_1;
import celestial.ho_3;
import celestial.hw_3;
import celestial.rVL;
import celestial.rdb_3;
import celestial.rdy_3;
import celestial.rkf_3;
import celestial.rkg_3;
import celestial.rkl_3;
import celestial.rlb_3;
import celestial.rlc_3;
import celestial.rpL_2;
import celestial.xd_3;
import celestial.xu_3;
import com.google.common.collect.Sets;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.attribute.FileAttribute;
import java.util.HashSet;
import java.util.Objects;
import java.util.function.Consumer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class De_1
implements DT {
    private static final Logger id_break = LogManager.getLogger();
    private static final Gson id_byte = new GsonBuilder().setPrettyPrinting().create();
    private final DA id_protected;

    private static void id_byte(Consumer<Dw_1> consumer, rpL_2 rpL_22, rpL_2 rpL_23) {
        Us_1.id_class(rpL_22).id_break(rpL_23).id_class("wooden_button").id_class("has_planks", De_1.id_class(rpL_23)).id_class(consumer);
    }

    private static void id_int(Consumer<Dw_1> consumer, rpL_2 rpL_22, rpL_2 rpL_23) {
        String string = rVL.id_for.id_break(rpL_22.id_case()).id_break();
        Us_1.id_class(rpL_22).id_break(rdy_3.XK).id_break(rpL_23).id_class("dyed_bed").id_class("has_bed", De_1.id_class(rdy_3.XK)).id_class(consumer, string + "_from_white_bed");
    }

    public De_1(DA dA) {
        this.id_protected = dA;
    }

    private static void id_this(Consumer<Dw_1> consumer, rpL_2 rpL_22, rpL_2 rpL_23) {
        String string = rVL.id_for.id_break(rpL_22.id_case()).id_break();
        String string2 = rVL.id_for.id_break(rpL_23.id_case()).id_break();
        UB.id_class(rpL_22, 8).id_class(Character.valueOf('#'), xu_3.BV).id_class(Character.valueOf('$'), rpL_23).id_class("###").id_class("#$#").id_class("###").id_break("stained_glass_pane").id_class("has_glass_pane", De_1.id_class((rpL_2)xu_3.BV)).id_class("has_" + string2, De_1.id_class(rpL_23)).id_class(consumer, string + "_from_glass_pane");
    }

    @Override
    public String id_class() {
        return "Recipes";
    }

    @Override
    public void id_class(Dn_1 dn_1) throws IOException {
        Path path = this.id_protected.id_break();
        HashSet hashSet = Sets.newHashSet();
        De_1.id_class((Dw_1 dw_1) -> {
            if (!hashSet.add(dw_1.id_break())) {
                throw new IllegalStateException("Duplicate recipe " + dw_1.id_break());
            }
            De_1.id_class(dn_1, dw_1.id_throws(), path.resolve("data/" + dw_1.id_break().id_byte() + "/recipes/" + dw_1.id_break().id_break() + ".json"));
            JsonObject jsonObject = dw_1.id_byte();
            if (jsonObject != null) {
                De_1.id_break(dn_1, jsonObject, path.resolve("data/" + dw_1.id_break().id_byte() + "/advancements/" + dw_1.id_protected().id_break() + ".json"));
            }
        });
        De_1.id_break(dn_1, Ot_1.id_class().id_class("impossible", new XE()).id_break(), path.resolve("data/minecraft/advancements/recipes/root.json"));
    }

    private static Xb_1 id_class(rlb_3<rdb_3> rlb_32) {
        return De_1.id_class(XX.id_class().id_class(rlb_32).id_break());
    }

    private static void id_class(Dn_1 dn_1, JsonObject jsonObject, Path path) {
        try {
            String string = id_byte.toJson((JsonElement)jsonObject);
            String string2 = id_class.hashUnencodedChars((CharSequence)string).toString();
            if (!Objects.equals(dn_1.id_class(path), string2) || !Files.exists(path, new LinkOption[0])) {
                Files.createDirectories(path.getParent(), new FileAttribute[0]);
                try (BufferedWriter bufferedWriter = Files.newBufferedWriter(path, new OpenOption[0]);){
                    bufferedWriter.write(string);
                }
            }
            dn_1.id_class(path, string2);
        }
        catch (IOException iOException) {
            id_break.error("Couldn't save recipe {}", (Object)path, (Object)iOException);
        }
    }

    private static Xb_1 id_class(rpL_2 rpL_22) {
        return De_1.id_class(XX.id_class().id_class(rpL_22).id_break());
    }

    private static hw_3 id_class(xd_3 xd_32) {
        return new hw_3(ho_3.id_class, xd_32, JS.id_class);
    }

    private static void id_class(Consumer<Dw_1> consumer, String string, rkl_3<?> rkl_32, int n) {
        DZ.id_class(rkg_3.id_class(rdy_3.Jz), rdy_3.JQ, 0.35f, n, rkl_32).id_class("has_beef", De_1.id_class(rdy_3.Jz)).id_class(consumer, "cooked_beef_from_" + string);
        DZ.id_class(rkg_3.id_class(rdy_3.JN), rdy_3.Jc, 0.35f, n, rkl_32).id_class("has_chicken", De_1.id_class(rdy_3.JN)).id_class(consumer, "cooked_chicken_from_" + string);
        DZ.id_class(rkg_3.id_class(rdy_3.Xz), rdy_3.Xu, 0.35f, n, rkl_32).id_class("has_cod", De_1.id_class(rdy_3.Xz)).id_class(consumer, "cooked_cod_from_" + string);
        DZ.id_class(rkg_3.id_class(xu_3.OM), rdy_3.Jd, 0.1f, n, rkl_32).id_class("has_kelp", De_1.id_class((rpL_2)xu_3.OM)).id_class(consumer, "dried_kelp_from_" + string);
        DZ.id_class(rkg_3.id_class(rdy_3.XQ), rdy_3.Xm, 0.35f, n, rkl_32).id_class("has_salmon", De_1.id_class(rdy_3.XQ)).id_class(consumer, "cooked_salmon_from_" + string);
        DZ.id_class(rkg_3.id_class(rdy_3.dg), rdy_3.dR, 0.35f, n, rkl_32).id_class("has_mutton", De_1.id_class(rdy_3.dg)).id_class(consumer, "cooked_mutton_from_" + string);
        DZ.id_class(rkg_3.id_class(rdy_3.hC), rdy_3.hl, 0.35f, n, rkl_32).id_class("has_porkchop", De_1.id_class(rdy_3.hC)).id_class(consumer, "cooked_porkchop_from_" + string);
        DZ.id_class(rkg_3.id_class(rdy_3.dE), rdy_3.dG, 0.35f, n, rkl_32).id_class("has_potato", De_1.id_class(rdy_3.dE)).id_class(consumer, "baked_potato_from_" + string);
        DZ.id_class(rkg_3.id_class(rdy_3.dC), rdy_3.dl, 0.35f, n, rkl_32).id_class("has_rabbit", De_1.id_class(rdy_3.dC)).id_class(consumer, "cooked_rabbit_from_" + string);
    }

    private static Xb_1 id_class(Xh_1 ... xh_1Array) {
        return new Xb_1(ho_3.id_class, XF.id_throws, XF.id_throws, XF.id_throws, xh_1Array);
    }

    private static void id_class(Consumer<Dw_1> consumer, rpL_2 rpL_22, rpL_2 rpL_23) {
        UB.id_class(rpL_22, 3).id_class(Character.valueOf('#'), rpL_23).id_class("##").id_class("##").id_break("bark").id_class("has_log", De_1.id_class(rpL_23)).id_class(consumer);
    }

    private static void id_class(Consumer<Dw_1> consumer, rpL_2 rpL_22, rlb_3<rdb_3> rlb_32) {
        Us_1.id_class(rpL_22, 4).id_class(rlb_32).id_class("planks").id_class("has_log", De_1.id_class(rlb_32)).id_class(consumer);
    }

    private static void id_class(Consumer<Dw_1> consumer) {
        De_1.id_class(consumer, (rpL_2)xu_3.id_continue, rlc_3.id_else);
        De_1.id_break(consumer, (rpL_2)xu_3.id_int, rlc_3.id_this);
        De_1.id_break(consumer, (rpL_2)xu_3.Xq, rlc_3.id_public);
        De_1.id_class(consumer, (rpL_2)xu_3.id_super, rlc_3.id_continue);
        De_1.id_break(consumer, (rpL_2)xu_3.id_new, rlc_3.id_synchronized);
        De_1.id_break(consumer, (rpL_2)xu_3.id_final, rlc_3.id_super);
        De_1.id_break(consumer, (rpL_2)xu_3.id_package, rlc_3.id_return);
        De_1.id_break(consumer, (rpL_2)xu_3.XT, rlc_3.id_goto);
        De_1.id_class(consumer, (rpL_2)xu_3.E, xu_3.id_const);
        De_1.id_class(consumer, (rpL_2)xu_3.S, xu_3.id_short);
        De_1.id_class(consumer, (rpL_2)xu_3.G, xu_3.id_strictfp);
        De_1.id_class(consumer, (rpL_2)xu_3.s, xu_3.id_default);
        De_1.id_class(consumer, (rpL_2)xu_3.P, xu_3.id_static);
        De_1.id_class(consumer, (rpL_2)xu_3.B, xu_3.id_import);
        De_1.id_class(consumer, (rpL_2)xu_3.Xv, xu_3.Xm);
        De_1.id_class(consumer, (rpL_2)xu_3.Xk, xu_3.Xx);
        De_1.id_class(consumer, (rpL_2)xu_3.X, xu_3.id_double);
        De_1.id_class(consumer, (rpL_2)xu_3.O, xu_3.id_transient);
        De_1.id_class(consumer, (rpL_2)xu_3.J, xu_3.id_switch);
        De_1.id_class(consumer, (rpL_2)xu_3.h, xu_3.id_for);
        De_1.id_class(consumer, (rpL_2)xu_3.b, xu_3.r);
        De_1.id_class(consumer, (rpL_2)xu_3.M, xu_3.id_boolean);
        De_1.id_class(consumer, (rpL_2)xu_3.XF, xu_3.XZ);
        De_1.id_class(consumer, (rpL_2)xu_3.XW, xu_3.Xd);
        De_1.id_break(consumer, (rpL_2)rdy_3.kv, xu_3.id_continue);
        De_1.id_break(consumer, (rpL_2)rdy_3.km, xu_3.id_int);
        De_1.id_break(consumer, (rpL_2)rdy_3.kF, xu_3.id_super);
        De_1.id_break(consumer, (rpL_2)rdy_3.kZ, xu_3.id_new);
        De_1.id_break(consumer, (rpL_2)rdy_3.he, xu_3.id_final);
        De_1.id_break(consumer, (rpL_2)rdy_3.ku, xu_3.id_package);
        De_1.id_byte(consumer, xu_3.sG, xu_3.id_continue);
        De_1.id_protected(consumer, xu_3.bL, xu_3.id_continue);
        De_1.id_throws(consumer, xu_3.bu, xu_3.id_continue);
        De_1.id_case(consumer, xu_3.bW, xu_3.id_continue);
        De_1.id_catch(consumer, xu_3.Pn, xu_3.id_continue);
        De_1.id_private(consumer, xu_3.GK, xu_3.id_continue);
        De_1.id_implements(consumer, xu_3.Ez, xu_3.id_continue);
        De_1.id_finally(consumer, xu_3.Bv, xu_3.id_continue);
        De_1.id_extends(consumer, xu_3.PM, xu_3.id_continue);
        De_1.id_byte(consumer, xu_3.ss, xu_3.id_int);
        De_1.id_protected(consumer, xu_3.bv, xu_3.id_int);
        De_1.id_throws(consumer, xu_3.bN, xu_3.id_int);
        De_1.id_case(consumer, xu_3.bd, xu_3.id_int);
        De_1.id_catch(consumer, xu_3.PL, xu_3.id_int);
        De_1.id_private(consumer, xu_3.GY, xu_3.id_int);
        De_1.id_implements(consumer, xu_3.Su, xu_3.id_int);
        De_1.id_finally(consumer, xu_3.Bm, xu_3.id_int);
        De_1.id_extends(consumer, xu_3.Pb, xu_3.id_int);
        De_1.id_byte(consumer, xu_3.XU, xu_3.Xq);
        De_1.id_protected(consumer, xu_3.Xa, xu_3.Xq);
        De_1.id_throws(consumer, xu_3.Xj, xu_3.Xq);
        De_1.id_case(consumer, xu_3.XY, xu_3.Xq);
        De_1.id_catch(consumer, xu_3.XI, xu_3.Xq);
        De_1.id_private(consumer, xu_3.Xt, xu_3.Xq);
        De_1.id_implements(consumer, xu_3.XK, xu_3.Xq);
        De_1.id_finally(consumer, xu_3.Xg, xu_3.Xq);
        De_1.id_extends(consumer, xu_3.Jr, xu_3.Xq);
        De_1.id_byte(consumer, xu_3.sb, xu_3.id_super);
        De_1.id_protected(consumer, xu_3.bA, xu_3.id_super);
        De_1.id_throws(consumer, xu_3.bm, xu_3.id_super);
        De_1.id_case(consumer, xu_3.bz, xu_3.id_super);
        De_1.id_catch(consumer, xu_3.PC, xu_3.id_super);
        De_1.id_private(consumer, xu_3.GD, xu_3.id_super);
        De_1.id_implements(consumer, xu_3.EQ, xu_3.id_super);
        De_1.id_finally(consumer, xu_3.BF, xu_3.id_super);
        De_1.id_extends(consumer, xu_3.Ph, xu_3.id_super);
        De_1.id_byte(consumer, xu_3.sE, xu_3.id_new);
        De_1.id_protected(consumer, xu_3.bF, xu_3.id_new);
        De_1.id_throws(consumer, xu_3.bc, xu_3.id_new);
        De_1.id_case(consumer, xu_3.bk, xu_3.id_new);
        De_1.id_catch(consumer, xu_3.PA, xu_3.id_new);
        De_1.id_private(consumer, xu_3.Go, xu_3.id_new);
        De_1.id_implements(consumer, xu_3.Sm, xu_3.id_new);
        De_1.id_finally(consumer, xu_3.BZ, xu_3.id_new);
        De_1.id_extends(consumer, xu_3.PO, xu_3.id_new);
        De_1.id_byte(consumer, xu_3.sB, xu_3.id_final);
        De_1.id_protected(consumer, xu_3.PX, xu_3.id_final);
        De_1.id_throws(consumer, xu_3.PV, xu_3.id_final);
        De_1.id_case(consumer, xu_3.BU, xu_3.id_final);
        De_1.id_catch(consumer, xu_3.Pv, xu_3.id_final);
        De_1.id_private(consumer, xu_3.Gg, xu_3.id_final);
        De_1.id_implements(consumer, xu_3.rU, xu_3.id_final);
        De_1.id_finally(consumer, xu_3.Bc, xu_3.id_final);
        De_1.id_extends(consumer, xu_3.PE, xu_3.id_final);
        De_1.id_byte(consumer, xu_3.sS, xu_3.id_package);
        De_1.id_protected(consumer, xu_3.bZ, xu_3.id_package);
        De_1.id_throws(consumer, xu_3.bQ, xu_3.id_package);
        De_1.id_case(consumer, xu_3.bx, xu_3.id_package);
        De_1.id_catch(consumer, xu_3.PF, xu_3.id_package);
        De_1.id_private(consumer, xu_3.GR, xu_3.id_package);
        De_1.id_implements(consumer, xu_3.Sc, xu_3.id_package);
        De_1.id_finally(consumer, xu_3.Bu, xu_3.id_package);
        De_1.id_extends(consumer, xu_3.PG, xu_3.id_package);
        De_1.id_byte(consumer, xu_3.Xe, xu_3.XT);
        De_1.id_protected(consumer, xu_3.Xi, xu_3.XT);
        De_1.id_throws(consumer, xu_3.XV, xu_3.XT);
        De_1.id_case(consumer, xu_3.Xo, xu_3.XT);
        De_1.id_catch(consumer, xu_3.Xf, xu_3.XT);
        De_1.id_private(consumer, xu_3.Xw, xu_3.XT);
        De_1.id_implements(consumer, xu_3.XD, xu_3.XT);
        De_1.id_finally(consumer, xu_3.XR, xu_3.XT);
        De_1.id_extends(consumer, xu_3.JP, xu_3.XT);
        De_1.id_native(consumer, xu_3.rN, rdy_3.XV);
        De_1.id_volatile(consumer, xu_3.EU, xu_3.rN);
        De_1.id_final(consumer, xu_3.EU, rdy_3.XV);
        De_1.id_package(consumer, rdy_3.JO, xu_3.rN);
        De_1.id_int(consumer, rdy_3.JO, rdy_3.XV);
        De_1.id_new(consumer, rdy_3.kb, xu_3.rN);
        De_1.id_native(consumer, xu_3.rk, rdy_3.Xw);
        De_1.id_volatile(consumer, xu_3.EY, xu_3.rk);
        De_1.id_final(consumer, xu_3.EY, rdy_3.Xw);
        De_1.id_package(consumer, rdy_3.JE, xu_3.rk);
        De_1.id_int(consumer, rdy_3.JE, rdy_3.Xw);
        De_1.id_new(consumer, rdy_3.kS, xu_3.rk);
        De_1.id_native(consumer, xu_3.rW, rdy_3.XI);
        De_1.id_volatile(consumer, xu_3.Eo, xu_3.rW);
        De_1.id_final(consumer, xu_3.Eo, rdy_3.XI);
        De_1.id_package(consumer, rdy_3.JG, xu_3.rW);
        De_1.id_int(consumer, rdy_3.JG, rdy_3.XI);
        De_1.id_new(consumer, rdy_3.ks, xu_3.rW);
        De_1.id_native(consumer, xu_3.rx, rdy_3.XT);
        De_1.id_volatile(consumer, xu_3.Eg, xu_3.rx);
        De_1.id_final(consumer, xu_3.Eg, rdy_3.XT);
        De_1.id_package(consumer, rdy_3.JS, xu_3.rx);
        De_1.id_int(consumer, rdy_3.JS, rdy_3.XT);
        De_1.id_new(consumer, rdy_3.kP, xu_3.rx);
        De_1.id_native(consumer, xu_3.rX, rdy_3.Xp);
        De_1.id_volatile(consumer, xu_3.Ej, xu_3.rX);
        De_1.id_final(consumer, xu_3.Ej, rdy_3.Xp);
        De_1.id_package(consumer, rdy_3.JP, xu_3.rX);
        De_1.id_int(consumer, rdy_3.JP, rdy_3.Xp);
        De_1.id_new(consumer, rdy_3.di, xu_3.rX);
        De_1.id_native(consumer, xu_3.rz, rdy_3.Xf);
        De_1.id_volatile(consumer, xu_3.EK, xu_3.rz);
        De_1.id_final(consumer, xu_3.EK, rdy_3.Xf);
        De_1.id_package(consumer, rdy_3.Jb, xu_3.rz);
        De_1.id_int(consumer, rdy_3.Jb, rdy_3.Xf);
        De_1.id_new(consumer, rdy_3.kE, xu_3.rz);
        De_1.id_native(consumer, xu_3.rb, rdy_3.XC);
        De_1.id_volatile(consumer, xu_3.Et, xu_3.rb);
        De_1.id_final(consumer, xu_3.Et, rdy_3.XC);
        De_1.id_package(consumer, rdy_3.Xe, xu_3.rb);
        De_1.id_int(consumer, rdy_3.Xe, rdy_3.XC);
        De_1.id_new(consumer, rdy_3.dD, xu_3.rb);
        De_1.id_native(consumer, xu_3.rJ, rdy_3.Xq);
        De_1.id_volatile(consumer, xu_3.EV, xu_3.rJ);
        De_1.id_final(consumer, xu_3.EV, rdy_3.Xq);
        De_1.id_package(consumer, rdy_3.JB, xu_3.rJ);
        De_1.id_int(consumer, rdy_3.JB, rdy_3.Xq);
        De_1.id_new(consumer, rdy_3.kr, xu_3.rJ);
        De_1.id_native(consumer, xu_3.rO, rdy_3.XH);
        De_1.id_volatile(consumer, xu_3.EI, xu_3.rO);
        De_1.id_final(consumer, xu_3.EI, rdy_3.XH);
        De_1.id_package(consumer, rdy_3.Xi, xu_3.rO);
        De_1.id_int(consumer, rdy_3.Xi, rdy_3.XH);
        De_1.id_new(consumer, rdy_3.de, xu_3.rO);
        De_1.id_native(consumer, xu_3.rG, rdy_3.Xn);
        De_1.id_volatile(consumer, xu_3.ET, xu_3.rG);
        De_1.id_final(consumer, xu_3.ET, rdy_3.Xn);
        De_1.id_package(consumer, rdy_3.XU, xu_3.rG);
        De_1.id_int(consumer, rdy_3.XU, rdy_3.Xn);
        De_1.id_new(consumer, rdy_3.dK, xu_3.rG);
        De_1.id_native(consumer, xu_3.rE, rdy_3.XA);
        De_1.id_volatile(consumer, xu_3.Eq, xu_3.rE);
        De_1.id_final(consumer, xu_3.Eq, rdy_3.XA);
        De_1.id_package(consumer, rdy_3.XD, xu_3.rE);
        De_1.id_int(consumer, rdy_3.XD, rdy_3.XA);
        De_1.id_new(consumer, rdy_3.id_do, xu_3.rE);
        De_1.id_native(consumer, xu_3.rh, rdy_3.Xy);
        De_1.id_volatile(consumer, xu_3.Ef, xu_3.rh);
        De_1.id_final(consumer, xu_3.Ef, rdy_3.Xy);
        De_1.id_package(consumer, rdy_3.Jr, xu_3.rh);
        De_1.id_int(consumer, rdy_3.Jr, rdy_3.Xy);
        De_1.id_new(consumer, rdy_3.da, xu_3.rh);
        De_1.id_native(consumer, xu_3.rd, rdy_3.Xt);
        De_1.id_volatile(consumer, xu_3.ER, xu_3.rd);
        De_1.id_final(consumer, xu_3.ER, rdy_3.Xt);
        De_1.id_package(consumer, rdy_3.Js, xu_3.rd);
        De_1.id_int(consumer, rdy_3.Js, rdy_3.Xt);
        De_1.id_new(consumer, rdy_3.kB, xu_3.rd);
        De_1.id_native(consumer, xu_3.rQ, rdy_3.Xj);
        De_1.id_volatile(consumer, xu_3.ED, xu_3.rQ);
        De_1.id_final(consumer, xu_3.ED, rdy_3.Xj);
        De_1.id_package(consumer, rdy_3.JM, xu_3.rQ);
        De_1.id_int(consumer, rdy_3.JM, rdy_3.Xj);
        De_1.id_new(consumer, rdy_3.kG, xu_3.rQ);
        De_1.id_volatile(consumer, xu_3.Ep, xu_3.rs);
        De_1.id_package(consumer, rdy_3.XK, xu_3.rs);
        De_1.id_new(consumer, rdy_3.dY, xu_3.rs);
        De_1.id_native(consumer, xu_3.rM, rdy_3.Xl);
        De_1.id_volatile(consumer, xu_3.Ew, xu_3.rM);
        De_1.id_final(consumer, xu_3.Ew, rdy_3.Xl);
        De_1.id_package(consumer, rdy_3.Xa, xu_3.rM);
        De_1.id_int(consumer, rdy_3.Xa, rdy_3.Xl);
        De_1.id_new(consumer, rdy_3.dU, xu_3.rM);
        De_1.id_continue(consumer, xu_3.BN, rdy_3.XV);
        De_1.id_super(consumer, xu_3.EW, xu_3.BN);
        De_1.id_this(consumer, xu_3.EW, rdy_3.XV);
        De_1.id_continue(consumer, xu_3.Bk, rdy_3.Xw);
        De_1.id_super(consumer, xu_3.EJ, xu_3.Bk);
        De_1.id_this(consumer, xu_3.EJ, rdy_3.Xw);
        De_1.id_continue(consumer, xu_3.BW, rdy_3.XI);
        De_1.id_super(consumer, xu_3.Ex, xu_3.BW);
        De_1.id_this(consumer, xu_3.Ex, rdy_3.XI);
        De_1.id_continue(consumer, xu_3.Bx, rdy_3.XT);
        De_1.id_super(consumer, xu_3.Eh, xu_3.Bx);
        De_1.id_this(consumer, xu_3.Eh, rdy_3.XT);
        De_1.id_continue(consumer, xu_3.BX, rdy_3.Xp);
        De_1.id_super(consumer, xu_3.EM, xu_3.BX);
        De_1.id_this(consumer, xu_3.EM, rdy_3.Xp);
        De_1.id_continue(consumer, xu_3.Bz, rdy_3.Xf);
        De_1.id_super(consumer, xu_3.Ed, xu_3.Bz);
        De_1.id_this(consumer, xu_3.Ed, rdy_3.Xf);
        De_1.id_continue(consumer, xu_3.Bb, rdy_3.XC);
        De_1.id_super(consumer, xu_3.Es, xu_3.Bb);
        De_1.id_this(consumer, xu_3.Es, rdy_3.XC);
        De_1.id_continue(consumer, xu_3.BJ, rdy_3.Xq);
        De_1.id_super(consumer, xu_3.EO, xu_3.BJ);
        De_1.id_this(consumer, xu_3.EO, rdy_3.Xq);
        De_1.id_continue(consumer, xu_3.BO, rdy_3.XH);
        De_1.id_super(consumer, xu_3.EG, xu_3.BO);
        De_1.id_this(consumer, xu_3.EG, rdy_3.XH);
        De_1.id_continue(consumer, xu_3.BG, rdy_3.Xn);
        De_1.id_super(consumer, xu_3.ES, xu_3.BG);
        De_1.id_this(consumer, xu_3.ES, rdy_3.Xn);
        De_1.id_continue(consumer, xu_3.BE, rdy_3.XA);
        De_1.id_super(consumer, xu_3.EB, xu_3.BE);
        De_1.id_this(consumer, xu_3.EB, rdy_3.XA);
        De_1.id_continue(consumer, xu_3.Bh, rdy_3.Xy);
        De_1.id_super(consumer, xu_3.Eb, xu_3.Bh);
        De_1.id_this(consumer, xu_3.Eb, rdy_3.Xy);
        De_1.id_continue(consumer, xu_3.Bd, rdy_3.Xt);
        De_1.id_super(consumer, xu_3.EX, xu_3.Bd);
        De_1.id_this(consumer, xu_3.EX, rdy_3.Xt);
        De_1.id_continue(consumer, xu_3.BQ, rdy_3.Xj);
        De_1.id_super(consumer, xu_3.Ek, xu_3.BQ);
        De_1.id_this(consumer, xu_3.Ek, rdy_3.Xj);
        De_1.id_continue(consumer, xu_3.Bs, rdy_3.XL);
        De_1.id_super(consumer, xu_3.EP, xu_3.Bs);
        De_1.id_this(consumer, xu_3.EP, rdy_3.XL);
        De_1.id_continue(consumer, xu_3.BM, rdy_3.Xl);
        De_1.id_super(consumer, xu_3.EE, xu_3.BM);
        De_1.id_this(consumer, xu_3.EE, rdy_3.Xl);
        De_1.id_else(consumer, xu_3.Er, rdy_3.XV);
        De_1.id_else(consumer, xu_3.sU, rdy_3.Xw);
        De_1.id_else(consumer, xu_3.se, rdy_3.XI);
        De_1.id_else(consumer, xu_3.sK, rdy_3.XT);
        De_1.id_else(consumer, xu_3.sY, rdy_3.Xp);
        De_1.id_else(consumer, xu_3.sa, rdy_3.Xf);
        De_1.id_else(consumer, xu_3.sj, rdy_3.XC);
        De_1.id_else(consumer, xu_3.so, rdy_3.Xq);
        De_1.id_else(consumer, xu_3.sg, rdy_3.XH);
        De_1.id_else(consumer, xu_3.sf, rdy_3.Xn);
        De_1.id_else(consumer, xu_3.sI, rdy_3.XA);
        De_1.id_else(consumer, xu_3.sR, rdy_3.Xy);
        De_1.id_else(consumer, xu_3.sD, rdy_3.Xt);
        De_1.id_else(consumer, xu_3.si, rdy_3.Xj);
        De_1.id_else(consumer, xu_3.sw, rdy_3.XL);
        De_1.id_else(consumer, xu_3.sV, rdy_3.Xl);
        De_1.id_synchronized(consumer, xu_3.Ob, rdy_3.XV);
        De_1.id_synchronized(consumer, xu_3.OS, rdy_3.Xw);
        De_1.id_synchronized(consumer, xu_3.Os, rdy_3.XI);
        De_1.id_synchronized(consumer, xu_3.OP, rdy_3.XT);
        De_1.id_synchronized(consumer, xu_3.Mi, rdy_3.Xp);
        De_1.id_synchronized(consumer, xu_3.OE, rdy_3.Xf);
        De_1.id_synchronized(consumer, xu_3.MD, rdy_3.XC);
        De_1.id_synchronized(consumer, xu_3.Or, rdy_3.Xq);
        De_1.id_synchronized(consumer, xu_3.Me, rdy_3.XH);
        De_1.id_synchronized(consumer, xu_3.MK, rdy_3.Xn);
        De_1.id_synchronized(consumer, xu_3.Mo, rdy_3.XA);
        De_1.id_synchronized(consumer, xu_3.Ma, rdy_3.Xy);
        De_1.id_synchronized(consumer, xu_3.OB, rdy_3.Xt);
        De_1.id_synchronized(consumer, xu_3.OG, rdy_3.Xj);
        De_1.id_synchronized(consumer, xu_3.MY, rdy_3.XL);
        De_1.id_synchronized(consumer, xu_3.MU, rdy_3.Xl);
        UB.id_class(xu_3.sT, 6).id_class(Character.valueOf('#'), xu_3.PH).id_class(Character.valueOf('S'), rdy_3.OD).id_class(Character.valueOf('X'), rdy_3.Ox).id_class("XSX").id_class("X#X").id_class("XSX").id_class("has_rail", De_1.id_class((rpL_2)xu_3.Px)).id_class(consumer);
        Us_1.id_class(xu_3.id_catch, 2).id_break(xu_3.id_throws).id_break(xu_3.id_volatile).id_class("has_stone", De_1.id_class((rpL_2)xu_3.id_throws)).id_class(consumer);
        UB.id_class(xu_3.sc).id_class(Character.valueOf('I'), xu_3.rw).id_class(Character.valueOf('i'), rdy_3.Ox).id_class("III").id_class(" i ").id_class("iii").id_class("has_iron_block", De_1.id_class((rpL_2)xu_3.rw)).id_class(consumer);
        UB.id_class(rdy_3.dq).id_class(Character.valueOf('/'), rdy_3.OD).id_class(Character.valueOf('_'), xu_3.Ge).id_class("///").id_class(" / ").id_class("/_/").id_class("has_stone_slab", De_1.id_class((rpL_2)xu_3.Ge)).id_class(consumer);
        UB.id_class(rdy_3.OO, 4).id_class(Character.valueOf('#'), rdy_3.OD).id_class(Character.valueOf('X'), rdy_3.hn).id_class(Character.valueOf('Y'), rdy_3.Oi).id_class("X").id_class("#").id_class("Y").id_class("has_feather", De_1.id_class(rdy_3.Oi)).id_class("has_flint", De_1.id_class(rdy_3.hn)).id_class(consumer);
        UB.id_class(xu_3.ha, 1).id_class(Character.valueOf('P'), rlc_3.id_byte).id_class(Character.valueOf('S'), rlc_3.id_finally).id_class("PSP").id_class("P P").id_class("PSP").id_class("has_planks", De_1.id_class(rlc_3.id_byte)).id_class("has_wood_slab", De_1.id_class(rlc_3.id_finally)).id_class(consumer);
        UB.id_class(xu_3.Sv).id_class(Character.valueOf('S'), rdy_3.dQ).id_class(Character.valueOf('G'), xu_3.u).id_class(Character.valueOf('O'), xu_3.rg).id_class("GGG").id_class("GSG").id_class("OOO").id_class("has_nether_star", De_1.id_class(rdy_3.dQ)).id_class(consumer);
        UB.id_class(xu_3.JO).id_class(Character.valueOf('P'), rlc_3.id_byte).id_class(Character.valueOf('H'), rdy_3.Wm).id_class("PPP").id_class("HHH").id_class("PPP").id_class("has_honeycomb", De_1.id_class(rdy_3.Wm)).id_class(consumer);
        Us_1.id_class(rdy_3.kx).id_break(rdy_3.OU).id_break(rdy_3.kX, 6).id_class("has_beetroot", De_1.id_class(rdy_3.kX)).id_class(consumer);
        Us_1.id_class(rdy_3.XV).id_break(rdy_3.XZ).id_class("black_dye").id_class("has_ink_sac", De_1.id_class(rdy_3.XZ)).id_class(consumer);
        Us_1.id_class(rdy_3.XV).id_break(xu_3.ry).id_class("black_dye").id_class("has_black_flower", De_1.id_class((rpL_2)xu_3.ry)).id_class(consumer, "black_dye_from_wither_rose");
        Us_1.id_class(rdy_3.JH, 2).id_break(rdy_3.JZ).id_class("has_blaze_rod", De_1.id_class(rdy_3.JZ)).id_class(consumer);
        Us_1.id_class(rdy_3.Xw).id_break(rdy_3.XF).id_class("blue_dye").id_class("has_lapis_lazuli", De_1.id_class(rdy_3.XF)).id_class(consumer);
        Us_1.id_class(rdy_3.Xw).id_break(xu_3.rH).id_class("blue_dye").id_class("has_blue_flower", De_1.id_class((rpL_2)xu_3.rH)).id_class(consumer, "blue_dye_from_cornflower");
        UB.id_class(xu_3.hP).id_class(Character.valueOf('#'), xu_3.Ei).id_class("###").id_class("###").id_class("###").id_class("has_packed_ice", De_1.id_class((rpL_2)xu_3.Ei)).id_class(consumer);
        UB.id_class(xu_3.bY).id_class(Character.valueOf('X'), rdy_3.Xg).id_class("XXX").id_class("XXX").id_class("XXX").id_class("has_bonemeal", De_1.id_class(rdy_3.Xg)).id_class(consumer);
        Us_1.id_class(rdy_3.Xg, 3).id_break(rdy_3.XR).id_class("bonemeal").id_class("has_bone", De_1.id_class(rdy_3.XR)).id_class(consumer);
        Us_1.id_class(rdy_3.Xg, 9).id_break(xu_3.bY).id_class("bonemeal").id_class("has_bone_block", De_1.id_class((rpL_2)xu_3.bY)).id_class(consumer, "bone_meal_from_bone_block");
        Us_1.id_class(rdy_3.XM).id_break(rdy_3.Xb, 3).id_break(rdy_3.ha).id_class("has_paper", De_1.id_class(rdy_3.Xb)).id_class(consumer);
        UB.id_class(xu_3.rj).id_class(Character.valueOf('#'), rlc_3.id_byte).id_class(Character.valueOf('X'), rdy_3.XM).id_class("###").id_class("XXX").id_class("###").id_class("has_book", De_1.id_class(rdy_3.XM)).id_class(consumer);
        UB.id_class(rdy_3.OM).id_class(Character.valueOf('#'), rdy_3.OD).id_class(Character.valueOf('X'), rdy_3.Oa).id_class(" #X").id_class("# X").id_class(" #X").id_class("has_string", De_1.id_class(rdy_3.Oa)).id_class(consumer);
        UB.id_class(rdy_3.OU, 4).id_class(Character.valueOf('#'), rlc_3.id_byte).id_class("# #").id_class(" # ").id_class("has_brown_mushroom", De_1.id_class((rpL_2)xu_3.rq)).id_class("has_red_mushroom", De_1.id_class((rpL_2)xu_3.rT)).id_class("has_mushroom_stew", De_1.id_class(rdy_3.Oe)).id_class(consumer);
        UB.id_class(rdy_3.hS).id_class(Character.valueOf('#'), rdy_3.hB).id_class("###").id_class("has_wheat", De_1.id_class(rdy_3.hB)).id_class(consumer);
        UB.id_class(xu_3.SG).id_class(Character.valueOf('B'), rdy_3.JZ).id_class(Character.valueOf('#'), rlc_3.M).id_class(" B ").id_class("###").id_class("has_blaze_rod", De_1.id_class(rdy_3.JZ)).id_class(consumer);
        UB.id_class(xu_3.rI).id_class(Character.valueOf('#'), rdy_3.Xs).id_class("##").id_class("##").id_class("has_brick", De_1.id_class(rdy_3.Xs)).id_class(consumer);
        UB.id_class(xu_3.bB, 6).id_class(Character.valueOf('#'), xu_3.rI).id_class("###").id_class("has_brick_block", De_1.id_class((rpL_2)xu_3.rI)).id_class(consumer);
        UB.id_class(xu_3.Be, 4).id_class(Character.valueOf('#'), xu_3.rI).id_class("#  ").id_class("## ").id_class("###").id_class("has_brick_block", De_1.id_class((rpL_2)xu_3.rI)).id_class(consumer);
        Us_1.id_class(rdy_3.XI).id_break(rdy_3.Xv).id_class("brown_dye").id_class("has_cocoa_beans", De_1.id_class(rdy_3.Xv)).id_class(consumer);
        UB.id_class(rdy_3.hg).id_class(Character.valueOf('#'), rdy_3.Ox).id_class("# #").id_class(" # ").id_class("has_iron_ingot", De_1.id_class(rdy_3.Ox)).id_class(consumer);
        UB.id_class(xu_3.BB).id_class(Character.valueOf('A'), rdy_3.hi).id_class(Character.valueOf('B'), rdy_3.XY).id_class(Character.valueOf('C'), rdy_3.hB).id_class(Character.valueOf('E'), rdy_3.XJ).id_class("AAA").id_class("BEB").id_class("CCC").id_class("has_egg", De_1.id_class(rdy_3.XJ)).id_class(consumer);
        UB.id_class(xu_3.Xh).id_class(Character.valueOf('L'), rlc_3.id_new).id_class(Character.valueOf('S'), rdy_3.OD).id_class(Character.valueOf('C'), rlc_3.S).id_class(" S ").id_class("SCS").id_class("LLL").id_class("has_stick", De_1.id_class(rdy_3.OD)).id_class("has_coal", De_1.id_class(rlc_3.S)).id_class(consumer);
        UB.id_class(rdy_3.dW).id_class(Character.valueOf('#'), rdy_3.Xd).id_class(Character.valueOf('X'), rdy_3.ds).id_class("# ").id_class(" X").id_class("has_carrot", De_1.id_class(rdy_3.ds)).id_class(consumer);
        UB.id_class(rdy_3.dz).id_class(Character.valueOf('#'), rdy_3.Xd).id_class(Character.valueOf('X'), rdy_3.rC).id_class("# ").id_class(" X").id_class("has_warped_fungus", De_1.id_class(rdy_3.rC)).id_class(consumer);
        UB.id_class(xu_3.Sb).id_class(Character.valueOf('#'), rdy_3.Ox).id_class("# #").id_class("# #").id_class("###").id_class("has_water_bucket", De_1.id_class(rdy_3.hR)).id_class(consumer);
        UB.id_class(xu_3.JG).id_class(Character.valueOf('#'), rlc_3.id_finally).id_class("# #").id_class("# #").id_class("###").id_class("has_wood_slab", De_1.id_class(rlc_3.id_finally)).id_class(consumer);
        UB.id_class(xu_3.re).id_class(Character.valueOf('#'), rlc_3.id_byte).id_class("###").id_class("# #").id_class("###").id_class("has_lots_of_items", new Xb_1(ho_3.id_class, XF.id_break(10), XF.id_throws, XF.id_throws, new Xh_1[0])).id_class(consumer);
        UB.id_class(rdy_3.Xh).id_class(Character.valueOf('A'), xu_3.re).id_class(Character.valueOf('B'), rdy_3.ho).id_class("A").id_class("B").id_class("has_minecart", De_1.id_class(rdy_3.ho)).id_class(consumer);
        UB.id_class(xu_3.JI).id_class(Character.valueOf('#'), xu_3.bs).id_class("#").id_class("#").id_class("has_nether_bricks", De_1.id_class((rpL_2)xu_3.SP)).id_class(consumer);
        UB.id_class(xu_3.sy).id_class(Character.valueOf('#'), xu_3.bE).id_class("#").id_class("#").id_class("has_chiseled_quartz_block", De_1.id_class((rpL_2)xu_3.sy)).id_class("has_quartz_block", De_1.id_class((rpL_2)xu_3.sH)).id_class("has_quartz_pillar", De_1.id_class((rpL_2)xu_3.sp)).id_class(consumer);
        UB.id_class(xu_3.BC).id_class(Character.valueOf('#'), xu_3.bS).id_class("#").id_class("#").id_class("has_stone_bricks", De_1.id_class(rlc_3.id_protected)).id_class(consumer);
        UB.id_class(xu_3.PI).id_class(Character.valueOf('#'), rdy_3.XE).id_class("##").id_class("##").id_class("has_clay_ball", De_1.id_class(rdy_3.XE)).id_class(consumer);
        UB.id_class(rdy_3.Xk).id_class(Character.valueOf('#'), rdy_3.Od).id_class(Character.valueOf('X'), rdy_3.hD).id_class(" # ").id_class("#X#").id_class(" # ").id_class("has_redstone", De_1.id_class(rdy_3.hD)).id_class(consumer);
        Us_1.id_class(rdy_3.Oh, 9).id_break(xu_3.Ea).id_class("has_coal_block", De_1.id_class((rpL_2)xu_3.Ea)).id_class(consumer);
        UB.id_class(xu_3.Ea).id_class(Character.valueOf('#'), rdy_3.Oh).id_class("###").id_class("###").id_class("###").id_class("has_coal", De_1.id_class(rdy_3.Oh)).id_class(consumer);
        UB.id_class(xu_3.id_extends, 4).id_class(Character.valueOf('D'), xu_3.id_finally).id_class(Character.valueOf('G'), xu_3.id_char).id_class("DG").id_class("GD").id_class("has_gravel", De_1.id_class((rpL_2)xu_3.id_char)).id_class(consumer);
        UB.id_class(xu_3.bP, 6).id_class(Character.valueOf('#'), xu_3.id_volatile).id_class("###").id_class("has_cobblestone", De_1.id_class((rpL_2)xu_3.id_volatile)).id_class(consumer);
        UB.id_class(xu_3.SF, 6).id_class(Character.valueOf('#'), xu_3.id_volatile).id_class("###").id_class("###").id_class("has_cobblestone", De_1.id_class((rpL_2)xu_3.id_volatile)).id_class(consumer);
        UB.id_class(xu_3.sL).id_class(Character.valueOf('#'), xu_3.PH).id_class(Character.valueOf('X'), rdy_3.dv).id_class(Character.valueOf('I'), xu_3.id_break).id_class(" # ").id_class("#X#").id_class("III").id_class("has_quartz", De_1.id_class(rdy_3.dv)).id_class(consumer);
        UB.id_class(rdy_3.Xx).id_class(Character.valueOf('#'), rdy_3.Ox).id_class(Character.valueOf('X'), rdy_3.hD).id_class(" # ").id_class("#X#").id_class(" # ").id_class("has_redstone", De_1.id_class(rdy_3.hD)).id_class(consumer);
        UB.id_class(rdy_3.Jh, 8).id_class(Character.valueOf('#'), rdy_3.hB).id_class(Character.valueOf('X'), rdy_3.Xv).id_class("#X#").id_class("has_cocoa", De_1.id_class(rdy_3.Xv)).id_class(consumer);
        UB.id_class(xu_3.PP).id_class(Character.valueOf('#'), rlc_3.id_byte).id_class("##").id_class("##").id_class("has_planks", De_1.id_class(rlc_3.id_byte)).id_class(consumer);
        UB.id_class(rdy_3.kU).id_class(Character.valueOf('~'), rdy_3.Oa).id_class(Character.valueOf('#'), rdy_3.OD).id_class(Character.valueOf('&'), rdy_3.Ox).id_class(Character.valueOf('$'), xu_3.Sz).id_class("#&#").id_class("~$~").id_class(" # ").id_class("has_string", De_1.id_class(rdy_3.Oa)).id_class("has_stick", De_1.id_class(rdy_3.OD)).id_class("has_iron_ingot", De_1.id_class(rdy_3.Ox)).id_class("has_tripwire_hook", De_1.id_class((rpL_2)xu_3.Sz)).id_class(consumer);
        UB.id_class(xu_3.he).id_class(Character.valueOf('#'), rlc_3.id_byte).id_class(Character.valueOf('@'), rdy_3.Oa).id_class("@@").id_class("##").id_class("has_string", De_1.id_class(rdy_3.Oa)).id_class(consumer);
        UB.id_class(xu_3.Gf).id_class(Character.valueOf('#'), xu_3.bG).id_class("#").id_class("#").id_class("has_red_sandstone", De_1.id_class((rpL_2)xu_3.GI)).id_class("has_chiseled_red_sandstone", De_1.id_class((rpL_2)xu_3.Gf)).id_class("has_cut_red_sandstone", De_1.id_class((rpL_2)xu_3.Gj)).id_class(consumer);
        UB.id_class(xu_3.L).id_class(Character.valueOf('#'), xu_3.Ga).id_class("#").id_class("#").id_class("has_stone_slab", De_1.id_class((rpL_2)xu_3.Ga)).id_class(consumer);
        Us_1.id_class(rdy_3.XT, 2).id_break(rdy_3.Xw).id_break(rdy_3.Xf).id_class("has_green_dye", De_1.id_class(rdy_3.Xf)).id_class("has_blue_dye", De_1.id_class(rdy_3.Xw)).id_class(consumer);
        UB.id_class(xu_3.Ev).id_class(Character.valueOf('S'), rdy_3.dA).id_class(Character.valueOf('I'), rdy_3.XV).id_class("SSS").id_class("SIS").id_class("SSS").id_class("has_prismarine_shard", De_1.id_class(rdy_3.dA)).id_class(consumer);
        UB.id_class(xu_3.EF, 4).id_class(Character.valueOf('#'), xu_3.Em).id_class("#  ").id_class("## ").id_class("###").id_class("has_prismarine", De_1.id_class((rpL_2)xu_3.Em)).id_class(consumer);
        UB.id_class(xu_3.EL, 4).id_class(Character.valueOf('#'), xu_3.EZ).id_class("#  ").id_class("## ").id_class("###").id_class("has_prismarine_bricks", De_1.id_class((rpL_2)xu_3.EZ)).id_class(consumer);
        UB.id_class(xu_3.EA, 4).id_class(Character.valueOf('#'), xu_3.Ev).id_class("#  ").id_class("## ").id_class("###").id_class("has_dark_prismarine", De_1.id_class((rpL_2)xu_3.Ev)).id_class(consumer);
        UB.id_class(xu_3.sA).id_class(Character.valueOf('Q'), rdy_3.dv).id_class(Character.valueOf('G'), xu_3.u).id_class(Character.valueOf('W'), rkg_3.id_class(rlc_3.id_finally)).id_class("GGG").id_class("QQQ").id_class("WWW").id_class("has_quartz", De_1.id_class(rdy_3.dv)).id_class(consumer);
        UB.id_class(xu_3.K, 6).id_class(Character.valueOf('R'), rdy_3.hD).id_class(Character.valueOf('#'), xu_3.Pm).id_class(Character.valueOf('X'), rdy_3.Ox).id_class("X X").id_class("X#X").id_class("XRX").id_class("has_rail", De_1.id_class((rpL_2)xu_3.Px)).id_class(consumer);
        Us_1.id_class(rdy_3.OJ, 9).id_break(xu_3.Pr).id_class("has_diamond_block", De_1.id_class((rpL_2)xu_3.Pr)).id_class(consumer);
        UB.id_class(rdy_3.Oj).id_class(Character.valueOf('#'), rdy_3.OD).id_class(Character.valueOf('X'), rdy_3.OJ).id_class("XX").id_class("X#").id_class(" #").id_class("has_diamond", De_1.id_class(rdy_3.OJ)).id_class(consumer);
        UB.id_class(xu_3.Pr).id_class(Character.valueOf('#'), rdy_3.OJ).id_class("###").id_class("###").id_class("###").id_class("has_diamond", De_1.id_class(rdy_3.OJ)).id_class(consumer);
        UB.id_class(rdy_3.hN).id_class(Character.valueOf('X'), rdy_3.OJ).id_class("X X").id_class("X X").id_class("has_diamond", De_1.id_class(rdy_3.OJ)).id_class(consumer);
        UB.id_class(rdy_3.hz).id_class(Character.valueOf('X'), rdy_3.OJ).id_class("X X").id_class("XXX").id_class("XXX").id_class("has_diamond", De_1.id_class(rdy_3.OJ)).id_class(consumer);
        UB.id_class(rdy_3.hW).id_class(Character.valueOf('X'), rdy_3.OJ).id_class("XXX").id_class("X X").id_class("has_diamond", De_1.id_class(rdy_3.OJ)).id_class(consumer);
        UB.id_class(rdy_3.OV).id_class(Character.valueOf('#'), rdy_3.OD).id_class(Character.valueOf('X'), rdy_3.OJ).id_class("XX").id_class(" #").id_class(" #").id_class("has_diamond", De_1.id_class(rdy_3.OJ)).id_class(consumer);
        UB.id_class(rdy_3.hQ).id_class(Character.valueOf('X'), rdy_3.OJ).id_class("XXX").id_class("X X").id_class("X X").id_class("has_diamond", De_1.id_class(rdy_3.OJ)).id_class(consumer);
        UB.id_class(rdy_3.Of).id_class(Character.valueOf('#'), rdy_3.OD).id_class(Character.valueOf('X'), rdy_3.OJ).id_class("XXX").id_class(" # ").id_class(" # ").id_class("has_diamond", De_1.id_class(rdy_3.OJ)).id_class(consumer);
        UB.id_class(rdy_3.OI).id_class(Character.valueOf('#'), rdy_3.OD).id_class(Character.valueOf('X'), rdy_3.OJ).id_class("X").id_class("#").id_class("#").id_class("has_diamond", De_1.id_class(rdy_3.OJ)).id_class(consumer);
        UB.id_class(rdy_3.Ow).id_class(Character.valueOf('#'), rdy_3.OD).id_class(Character.valueOf('X'), rdy_3.OJ).id_class("X").id_class("X").id_class("#").id_class("has_diamond", De_1.id_class(rdy_3.OJ)).id_class(consumer);
        UB.id_class(xu_3.id_throws, 2).id_class(Character.valueOf('Q'), rdy_3.dv).id_class(Character.valueOf('C'), xu_3.id_volatile).id_class("CQ").id_class("QC").id_class("has_quartz", De_1.id_class(rdy_3.dv)).id_class(consumer);
        UB.id_class(xu_3.v).id_class(Character.valueOf('R'), rdy_3.hD).id_class(Character.valueOf('#'), xu_3.id_volatile).id_class(Character.valueOf('X'), rdy_3.OM).id_class("###").id_class("#X#").id_class("#R#").id_class("has_bow", De_1.id_class(rdy_3.OM)).id_class(consumer);
        UB.id_class(xu_3.st).id_class(Character.valueOf('R'), rdy_3.hD).id_class(Character.valueOf('#'), xu_3.id_volatile).id_class("###").id_class("# #").id_class("#R#").id_class("has_redstone", De_1.id_class(rdy_3.hD)).id_class(consumer);
        Us_1.id_class(rdy_3.dP, 9).id_break(xu_3.SN).id_class("has_emerald_block", De_1.id_class((rpL_2)xu_3.SN)).id_class(consumer);
        UB.id_class(xu_3.SN).id_class(Character.valueOf('#'), rdy_3.dP).id_class("###").id_class("###").id_class("###").id_class("has_emerald", De_1.id_class(rdy_3.dP)).id_class(consumer);
        UB.id_class(xu_3.SE).id_class(Character.valueOf('B'), rdy_3.XM).id_class(Character.valueOf('#'), xu_3.rg).id_class(Character.valueOf('D'), rdy_3.OJ).id_class(" B ").id_class("D#D").id_class("###").id_class("has_obsidian", De_1.id_class((rpL_2)xu_3.rg)).id_class(consumer);
        UB.id_class(xu_3.SW).id_class(Character.valueOf('#'), xu_3.rg).id_class(Character.valueOf('E'), rdy_3.JT).id_class("###").id_class("#E#").id_class("###").id_class("has_ender_eye", De_1.id_class(rdy_3.JT)).id_class(consumer);
        Us_1.id_class(rdy_3.JT).id_break(rdy_3.Jm).id_break(rdy_3.JH).id_class("has_blaze_powder", De_1.id_class(rdy_3.JH)).id_class(consumer);
        UB.id_class(xu_3.bq, 4).id_class(Character.valueOf('#'), xu_3.Sh).id_class("##").id_class("##").id_class("has_end_stone", De_1.id_class((rpL_2)xu_3.Sh)).id_class(consumer);
        UB.id_class(rdy_3.kM).id_class(Character.valueOf('T'), rdy_3.Jv).id_class(Character.valueOf('E'), rdy_3.JT).id_class(Character.valueOf('G'), xu_3.u).id_class("GGG").id_class("GEG").id_class("GTG").id_class("has_ender_eye", De_1.id_class(rdy_3.JT)).id_class(consumer);
        UB.id_class(xu_3.bn, 4).id_class(Character.valueOf('#'), rdy_3.kh).id_class(Character.valueOf('/'), rdy_3.JZ).id_class("/").id_class("#").id_class("has_chorus_fruit_popped", De_1.id_class(rdy_3.kh)).id_class(consumer);
        Us_1.id_class(rdy_3.Jl).id_break(rdy_3.JC).id_break(xu_3.rq).id_break(rdy_3.XY).id_class("has_spider_eye", De_1.id_class(rdy_3.JC)).id_class(consumer);
        Us_1.id_class(rdy_3.xa, 3).id_break(rdy_3.hr).id_break(rdy_3.JH).id_class(rkg_3.id_class(rdy_3.Oh, rdy_3.OX)).id_class("has_blaze_powder", De_1.id_class(rdy_3.JH)).id_class(consumer);
        UB.id_class(rdy_3.Xd).id_class(Character.valueOf('#'), rdy_3.OD).id_class(Character.valueOf('X'), rdy_3.Oa).id_class("  #").id_class(" #X").id_class("# X").id_class("has_string", De_1.id_class(rdy_3.Oa)).id_class(consumer);
        Us_1.id_class(rdy_3.OG).id_break(rdy_3.Ox).id_break(rdy_3.hn).id_class("has_flint", De_1.id_class(rdy_3.hn)).id_class("has_obsidian", De_1.id_class((rpL_2)xu_3.rg)).id_class(consumer);
        UB.id_class(xu_3.SA).id_class(Character.valueOf('#'), rdy_3.Xs).id_class("# #").id_class(" # ").id_class("has_brick", De_1.id_class(rdy_3.Xs)).id_class(consumer);
        UB.id_class(xu_3.Ps).id_class(Character.valueOf('#'), rlc_3.M).id_class("###").id_class("# #").id_class("###").id_class("has_cobblestone", De_1.id_class(rlc_3.M)).id_class(consumer);
        UB.id_class(rdy_3.XX).id_class(Character.valueOf('A'), xu_3.Ps).id_class(Character.valueOf('B'), rdy_3.ho).id_class("A").id_class("B").id_class("has_minecart", De_1.id_class(rdy_3.ho)).id_class(consumer);
        UB.id_class(rdy_3.Jn, 3).id_class(Character.valueOf('#'), xu_3.u).id_class("# #").id_class(" # ").id_class("has_glass", De_1.id_class((rpL_2)xu_3.u)).id_class(consumer);
        UB.id_class(xu_3.BV, 16).id_class(Character.valueOf('#'), xu_3.u).id_class("###").id_class("###").id_class("has_glass", De_1.id_class((rpL_2)xu_3.u)).id_class(consumer);
        UB.id_class(xu_3.Pa).id_class(Character.valueOf('#'), rdy_3.XW).id_class("##").id_class("##").id_class("has_glowstone_dust", De_1.id_class(rdy_3.XW)).id_class(consumer);
        UB.id_class(rdy_3.hy).id_class(Character.valueOf('#'), rdy_3.Od).id_class(Character.valueOf('X'), rdy_3.Ob).id_class("###").id_class("#X#").id_class("###").id_class("has_gold_ingot", De_1.id_class(rdy_3.Od)).id_class(consumer);
        UB.id_class(rdy_3.Ol).id_class(Character.valueOf('#'), rdy_3.OD).id_class(Character.valueOf('X'), rdy_3.Od).id_class("XX").id_class("X#").id_class(" #").id_class("has_gold_ingot", De_1.id_class(rdy_3.Od)).id_class(consumer);
        UB.id_class(rdy_3.hZ).id_class(Character.valueOf('X'), rdy_3.Od).id_class("X X").id_class("X X").id_class("has_gold_ingot", De_1.id_class(rdy_3.Od)).id_class(consumer);
        UB.id_class(rdy_3.dO).id_class(Character.valueOf('#'), rdy_3.JF).id_class(Character.valueOf('X'), rdy_3.ds).id_class("###").id_class("#X#").id_class("###").id_class("has_gold_nugget", De_1.id_class(rdy_3.JF)).id_class(consumer);
        UB.id_class(rdy_3.hu).id_class(Character.valueOf('X'), rdy_3.Od).id_class("X X").id_class("XXX").id_class("XXX").id_class("has_gold_ingot", De_1.id_class(rdy_3.Od)).id_class(consumer);
        UB.id_class(rdy_3.hc).id_class(Character.valueOf('X'), rdy_3.Od).id_class("XXX").id_class("X X").id_class("has_gold_ingot", De_1.id_class(rdy_3.Od)).id_class(consumer);
        UB.id_class(rdy_3.OH).id_class(Character.valueOf('#'), rdy_3.OD).id_class(Character.valueOf('X'), rdy_3.Od).id_class("XX").id_class(" #").id_class(" #").id_class("has_gold_ingot", De_1.id_class(rdy_3.Od)).id_class(consumer);
        UB.id_class(rdy_3.hm).id_class(Character.valueOf('X'), rdy_3.Od).id_class("XXX").id_class("X X").id_class("X X").id_class("has_gold_ingot", De_1.id_class(rdy_3.Od)).id_class(consumer);
        UB.id_class(rdy_3.OC).id_class(Character.valueOf('#'), rdy_3.OD).id_class(Character.valueOf('X'), rdy_3.Od).id_class("XXX").id_class(" # ").id_class(" # ").id_class("has_gold_ingot", De_1.id_class(rdy_3.Od)).id_class(consumer);
        UB.id_class(xu_3.o, 6).id_class(Character.valueOf('R'), rdy_3.hD).id_class(Character.valueOf('#'), rdy_3.OD).id_class(Character.valueOf('X'), rdy_3.Od).id_class("X X").id_class("X#X").id_class("XRX").id_class("has_rail", De_1.id_class((rpL_2)xu_3.Px)).id_class(consumer);
        UB.id_class(rdy_3.On).id_class(Character.valueOf('#'), rdy_3.OD).id_class(Character.valueOf('X'), rdy_3.Od).id_class("X").id_class("#").id_class("#").id_class("has_gold_ingot", De_1.id_class(rdy_3.Od)).id_class(consumer);
        UB.id_class(rdy_3.OA).id_class(Character.valueOf('#'), rdy_3.OD).id_class(Character.valueOf('X'), rdy_3.Od).id_class("X").id_class("X").id_class("#").id_class("has_gold_ingot", De_1.id_class(rdy_3.Od)).id_class(consumer);
        UB.id_class(xu_3.rt).id_class(Character.valueOf('#'), rdy_3.Od).id_class("###").id_class("###").id_class("###").id_class("has_gold_ingot", De_1.id_class(rdy_3.Od)).id_class(consumer);
        Us_1.id_class(rdy_3.Od, 9).id_break(xu_3.rt).id_class("gold_ingot").id_class("has_gold_block", De_1.id_class((rpL_2)xu_3.rt)).id_class(consumer, "gold_ingot_from_gold_block");
        UB.id_class(rdy_3.Od).id_class(Character.valueOf('#'), rdy_3.JF).id_class("###").id_class("###").id_class("###").id_break("gold_ingot").id_class("has_gold_nugget", De_1.id_class(rdy_3.JF)).id_class(consumer, "gold_ingot_from_nuggets");
        Us_1.id_class(rdy_3.JF, 9).id_break(rdy_3.Od).id_class("has_gold_ingot", De_1.id_class(rdy_3.Od)).id_class(consumer);
        Us_1.id_class(xu_3.id_byte).id_break(xu_3.id_throws).id_break(rdy_3.dv).id_class("has_quartz", De_1.id_class(rdy_3.dv)).id_class(consumer);
        Us_1.id_class(rdy_3.Xp, 2).id_break(rdy_3.XV).id_break(rdy_3.XL).id_class("has_white_dye", De_1.id_class(rdy_3.XL)).id_class("has_black_dye", De_1.id_class(rdy_3.XV)).id_class(consumer);
        UB.id_class(xu_3.Ey).id_class(Character.valueOf('#'), rdy_3.hB).id_class("###").id_class("###").id_class("###").id_class("has_wheat", De_1.id_class(rdy_3.hB)).id_class(consumer);
        UB.id_class(xu_3.sF).id_class(Character.valueOf('#'), rdy_3.Ox).id_class("##").id_class("has_iron_ingot", De_1.id_class(rdy_3.Ox)).id_class(consumer);
        Us_1.id_class(rdy_3.WF, 4).id_break(rdy_3.WL).id_break(rdy_3.Jn, 4).id_class("has_honey_block", De_1.id_class((rpL_2)xu_3.Jh)).id_class(consumer);
        UB.id_class(xu_3.Jh, 1).id_class(Character.valueOf('S'), rdy_3.WF).id_class("SS").id_class("SS").id_class("has_honey_bottle", De_1.id_class(rdy_3.WF)).id_class(consumer);
        UB.id_class(xu_3.JX).id_class(Character.valueOf('H'), rdy_3.Wm).id_class("HH").id_class("HH").id_class("has_honeycomb", De_1.id_class(rdy_3.Wm)).id_class(consumer);
        UB.id_class(xu_3.sl).id_class(Character.valueOf('C'), xu_3.re).id_class(Character.valueOf('I'), rdy_3.Ox).id_class("I I").id_class("ICI").id_class(" I ").id_class("has_iron_ingot", De_1.id_class(rdy_3.Ox)).id_class(consumer);
        UB.id_class(rdy_3.dL).id_class(Character.valueOf('A'), xu_3.sl).id_class(Character.valueOf('B'), rdy_3.ho).id_class("A").id_class("B").id_class("has_minecart", De_1.id_class(rdy_3.ho)).id_class(consumer);
        UB.id_class(rdy_3.OT).id_class(Character.valueOf('#'), rdy_3.OD).id_class(Character.valueOf('X'), rdy_3.Ox).id_class("XX").id_class("X#").id_class(" #").id_class("has_iron_ingot", De_1.id_class(rdy_3.Ox)).id_class(consumer);
        UB.id_class(xu_3.Bf, 16).id_class(Character.valueOf('#'), rdy_3.Ox).id_class("###").id_class("###").id_class("has_iron_ingot", De_1.id_class(rdy_3.Ox)).id_class(consumer);
        UB.id_class(xu_3.rw).id_class(Character.valueOf('#'), rdy_3.Ox).id_class("###").id_class("###").id_class("###").id_class("has_iron_ingot", De_1.id_class(rdy_3.Ox)).id_class(consumer);
        UB.id_class(rdy_3.hk).id_class(Character.valueOf('X'), rdy_3.Ox).id_class("X X").id_class("X X").id_class("has_iron_ingot", De_1.id_class(rdy_3.Ox)).id_class(consumer);
        UB.id_class(rdy_3.hx).id_class(Character.valueOf('X'), rdy_3.Ox).id_class("X X").id_class("XXX").id_class("XXX").id_class("has_iron_ingot", De_1.id_class(rdy_3.Ox)).id_class(consumer);
        UB.id_class(xu_3.PZ, 3).id_class(Character.valueOf('#'), rdy_3.Ox).id_class("##").id_class("##").id_class("##").id_class("has_iron_ingot", De_1.id_class(rdy_3.Ox)).id_class(consumer);
        UB.id_class(rdy_3.hJ).id_class(Character.valueOf('X'), rdy_3.Ox).id_class("XXX").id_class("X X").id_class("has_iron_ingot", De_1.id_class(rdy_3.Ox)).id_class(consumer);
        UB.id_class(rdy_3.Ot).id_class(Character.valueOf('#'), rdy_3.OD).id_class(Character.valueOf('X'), rdy_3.Ox).id_class("XX").id_class(" #").id_class(" #").id_class("has_iron_ingot", De_1.id_class(rdy_3.Ox)).id_class(consumer);
        Us_1.id_class(rdy_3.Ox, 9).id_break(xu_3.rw).id_class("iron_ingot").id_class("has_iron_block", De_1.id_class((rpL_2)xu_3.rw)).id_class(consumer, "iron_ingot_from_iron_block");
        UB.id_class(rdy_3.Ox).id_class(Character.valueOf('#'), rdy_3.kn).id_class("###").id_class("###").id_class("###").id_break("iron_ingot").id_class("has_iron_nugget", De_1.id_class(rdy_3.kn)).id_class(consumer, "iron_ingot_from_nuggets");
        UB.id_class(rdy_3.hd).id_class(Character.valueOf('X'), rdy_3.Ox).id_class("XXX").id_class("X X").id_class("X X").id_class("has_iron_ingot", De_1.id_class(rdy_3.Ox)).id_class(consumer);
        Us_1.id_class(rdy_3.kn, 9).id_break(rdy_3.Ox).id_class("has_iron_ingot", De_1.id_class(rdy_3.Ox)).id_class(consumer);
        UB.id_class(rdy_3.Oq).id_class(Character.valueOf('#'), rdy_3.OD).id_class(Character.valueOf('X'), rdy_3.Ox).id_class("XXX").id_class(" # ").id_class(" # ").id_class("has_iron_ingot", De_1.id_class(rdy_3.Ox)).id_class(consumer);
        UB.id_class(rdy_3.Op).id_class(Character.valueOf('#'), rdy_3.OD).id_class(Character.valueOf('X'), rdy_3.Ox).id_class("X").id_class("#").id_class("#").id_class("has_iron_ingot", De_1.id_class(rdy_3.Ox)).id_class(consumer);
        UB.id_class(rdy_3.Oy).id_class(Character.valueOf('#'), rdy_3.OD).id_class(Character.valueOf('X'), rdy_3.Ox).id_class("X").id_class("X").id_class("#").id_class("has_iron_ingot", De_1.id_class(rdy_3.Ox)).id_class(consumer);
        UB.id_class(xu_3.Eu).id_class(Character.valueOf('#'), rdy_3.Ox).id_class("##").id_class("##").id_class("has_iron_ingot", De_1.id_class(rdy_3.Ox)).id_class(consumer);
        UB.id_class(rdy_3.dB).id_class(Character.valueOf('#'), rdy_3.OD).id_class(Character.valueOf('X'), rdy_3.ha).id_class("###").id_class("#X#").id_class("###").id_class("has_leather", De_1.id_class(rdy_3.ha)).id_class(consumer);
        UB.id_class(xu_3.Pj).id_class(Character.valueOf('#'), rlc_3.id_byte).id_class(Character.valueOf('X'), rdy_3.OJ).id_class("###").id_class("#X#").id_class("###").id_class("has_diamond", De_1.id_class(rdy_3.OJ)).id_class(consumer);
        UB.id_class(xu_3.PJ, 3).id_class(Character.valueOf('#'), rdy_3.OD).id_class("# #").id_class("###").id_class("# #").id_class("has_stick", De_1.id_class(rdy_3.OD)).id_class(consumer);
        UB.id_class(xu_3.Z).id_class(Character.valueOf('#'), rdy_3.XF).id_class("###").id_class("###").id_class("###").id_class("has_lapis", De_1.id_class(rdy_3.XF)).id_class(consumer);
        Us_1.id_class(rdy_3.XF, 9).id_break(xu_3.Z).id_class("has_lapis_block", De_1.id_class((rpL_2)xu_3.Z)).id_class(consumer);
        UB.id_class(rdy_3.df, 2).id_class(Character.valueOf('~'), rdy_3.Oa).id_class(Character.valueOf('O'), rdy_3.XO).id_class("~~ ").id_class("~O ").id_class("  ~").id_class("has_slime_ball", De_1.id_class(rdy_3.XO)).id_class(consumer);
        UB.id_class(rdy_3.ha).id_class(Character.valueOf('#'), rdy_3.dp).id_class("##").id_class("##").id_class("has_rabbit_hide", De_1.id_class(rdy_3.dp)).id_class(consumer);
        UB.id_class(rdy_3.hb).id_class(Character.valueOf('X'), rdy_3.ha).id_class("X X").id_class("X X").id_class("has_leather", De_1.id_class(rdy_3.ha)).id_class(consumer);
        UB.id_class(rdy_3.hE).id_class(Character.valueOf('X'), rdy_3.ha).id_class("X X").id_class("XXX").id_class("XXX").id_class("has_leather", De_1.id_class(rdy_3.ha)).id_class(consumer);
        UB.id_class(rdy_3.hs).id_class(Character.valueOf('X'), rdy_3.ha).id_class("XXX").id_class("X X").id_class("has_leather", De_1.id_class(rdy_3.ha)).id_class(consumer);
        UB.id_class(rdy_3.hG).id_class(Character.valueOf('X'), rdy_3.ha).id_class("XXX").id_class("X X").id_class("X X").id_class("has_leather", De_1.id_class(rdy_3.ha)).id_class(consumer);
        UB.id_class(rdy_3.dI).id_class(Character.valueOf('X'), rdy_3.ha).id_class("X X").id_class("XXX").id_class("X X").id_class("has_leather", De_1.id_class(rdy_3.ha)).id_class(consumer);
        UB.id_class(xu_3.Xs).id_class(Character.valueOf('S'), rlc_3.id_finally).id_class(Character.valueOf('B'), xu_3.rj).id_class("SSS").id_class(" B ").id_class(" S ").id_class("has_book", De_1.id_class(rdy_3.XM)).id_class(consumer);
        UB.id_class(xu_3.Pu).id_class(Character.valueOf('#'), xu_3.id_volatile).id_class(Character.valueOf('X'), rdy_3.OD).id_class("X").id_class("#").id_class("has_cobblestone", De_1.id_class((rpL_2)xu_3.id_volatile)).id_class(consumer);
        Us_1.id_class(rdy_3.XC).id_break(xu_3.rZ).id_class("light_blue_dye").id_class("has_red_flower", De_1.id_class((rpL_2)xu_3.rZ)).id_class(consumer, "light_blue_dye_from_blue_orchid");
        Us_1.id_class(rdy_3.XC, 2).id_break(rdy_3.Xw).id_break(rdy_3.XL).id_class("light_blue_dye").id_class("has_blue_dye", De_1.id_class(rdy_3.Xw)).id_class("has_white_dye", De_1.id_class(rdy_3.XL)).id_class(consumer, "light_blue_dye_from_blue_white_dye");
        Us_1.id_class(rdy_3.Xq).id_break(xu_3.rF).id_class("light_gray_dye").id_class("has_red_flower", De_1.id_class((rpL_2)xu_3.rF)).id_class(consumer, "light_gray_dye_from_azure_bluet");
        Us_1.id_class(rdy_3.Xq, 2).id_break(rdy_3.Xp).id_break(rdy_3.XL).id_class("light_gray_dye").id_class("has_gray_dye", De_1.id_class(rdy_3.Xp)).id_class("has_white_dye", De_1.id_class(rdy_3.XL)).id_class(consumer, "light_gray_dye_from_gray_white_dye");
        Us_1.id_class(rdy_3.Xq, 3).id_break(rdy_3.XV).id_break(rdy_3.XL, 2).id_class("light_gray_dye").id_class("has_white_dye", De_1.id_class(rdy_3.XL)).id_class("has_black_dye", De_1.id_class(rdy_3.XV)).id_class(consumer, "light_gray_dye_from_black_white_dye");
        Us_1.id_class(rdy_3.Xq).id_break(xu_3.rl).id_class("light_gray_dye").id_class("has_red_flower", De_1.id_class((rpL_2)xu_3.rl)).id_class(consumer, "light_gray_dye_from_oxeye_daisy");
        Us_1.id_class(rdy_3.Xq).id_break(xu_3.rn).id_class("light_gray_dye").id_class("has_red_flower", De_1.id_class((rpL_2)xu_3.rn)).id_class(consumer, "light_gray_dye_from_white_tulip");
        UB.id_class(xu_3.sv).id_class(Character.valueOf('#'), rdy_3.Od).id_class("##").id_class("has_gold_ingot", De_1.id_class(rdy_3.Od)).id_class(consumer);
        Us_1.id_class(rdy_3.XH, 2).id_break(rdy_3.Xf).id_break(rdy_3.XL).id_class("has_green_dye", De_1.id_class(rdy_3.Xf)).id_class("has_white_dye", De_1.id_class(rdy_3.XL)).id_class(consumer);
        UB.id_class(xu_3.BP).id_class(Character.valueOf('A'), xu_3.Br).id_class(Character.valueOf('B'), xu_3.rR).id_class("A").id_class("B").id_class("has_carved_pumpkin", De_1.id_class((rpL_2)xu_3.Br)).id_class(consumer);
        Us_1.id_class(rdy_3.Xn).id_break(xu_3.rv).id_class("magenta_dye").id_class("has_red_flower", De_1.id_class((rpL_2)xu_3.rv)).id_class(consumer, "magenta_dye_from_allium");
        Us_1.id_class(rdy_3.Xn, 4).id_break(rdy_3.Xw).id_break(rdy_3.Xj, 2).id_break(rdy_3.XL).id_class("magenta_dye").id_class("has_blue_dye", De_1.id_class(rdy_3.Xw)).id_class("has_rose_red", De_1.id_class(rdy_3.Xj)).id_class("has_white_dye", De_1.id_class(rdy_3.XL)).id_class(consumer, "magenta_dye_from_blue_red_white_dye");
        Us_1.id_class(rdy_3.Xn, 3).id_break(rdy_3.Xw).id_break(rdy_3.Xj).id_break(rdy_3.Xy).id_class("magenta_dye").id_class("has_pink_dye", De_1.id_class(rdy_3.Xy)).id_class("has_blue_dye", De_1.id_class(rdy_3.Xw)).id_class("has_red_dye", De_1.id_class(rdy_3.Xj)).id_class(consumer, "magenta_dye_from_blue_red_pink");
        Us_1.id_class(rdy_3.Xn, 2).id_break(xu_3.GP).id_class("magenta_dye").id_class("has_double_plant", De_1.id_class((rpL_2)xu_3.GP)).id_class(consumer, "magenta_dye_from_lilac");
        Us_1.id_class(rdy_3.Xn, 2).id_break(rdy_3.Xt).id_break(rdy_3.Xy).id_class("magenta_dye").id_class("has_pink_dye", De_1.id_class(rdy_3.Xy)).id_class("has_purple_dye", De_1.id_class(rdy_3.Xt)).id_class(consumer, "magenta_dye_from_purple_and_pink");
        UB.id_class(xu_3.bV).id_class(Character.valueOf('#'), rdy_3.Jy).id_class("##").id_class("##").id_class("has_magma_cream", De_1.id_class(rdy_3.Jy)).id_class(consumer);
        Us_1.id_class(rdy_3.Jy).id_break(rdy_3.JH).id_break(rdy_3.XO).id_class("has_blaze_powder", De_1.id_class(rdy_3.JH)).id_class(consumer);
        UB.id_class(rdy_3.dM).id_class(Character.valueOf('#'), rdy_3.Xb).id_class(Character.valueOf('X'), rdy_3.Xx).id_class("###").id_class("#X#").id_class("###").id_class("has_compass", De_1.id_class(rdy_3.Xx)).id_class(consumer);
        UB.id_class(xu_3.Bg).id_class(Character.valueOf('M'), rdy_3.Jx).id_class("MMM").id_class("MMM").id_class("MMM").id_class("has_melon", De_1.id_class(rdy_3.Jx)).id_class(consumer);
        Us_1.id_class(rdy_3.JW).id_break(rdy_3.Jx).id_class("has_melon", De_1.id_class(rdy_3.Jx)).id_class(consumer);
        UB.id_class(rdy_3.ho).id_class(Character.valueOf('#'), rdy_3.Ox).id_class("# #").id_class("###").id_class("has_iron_ingot", De_1.id_class(rdy_3.Ox)).id_class(consumer);
        Us_1.id_class(xu_3.rV).id_break(xu_3.id_volatile).id_break(xu_3.BD).id_class("has_vine", De_1.id_class((rpL_2)xu_3.BD)).id_class(consumer);
        UB.id_class(xu_3.SL, 6).id_class(Character.valueOf('#'), xu_3.rV).id_class("###").id_class("###").id_class("has_mossy_cobblestone", De_1.id_class((rpL_2)xu_3.rV)).id_class(consumer);
        Us_1.id_class(xu_3.BA).id_break(xu_3.BL).id_break(xu_3.BD).id_class("has_mossy_cobblestone", De_1.id_class((rpL_2)xu_3.rV)).id_class(consumer);
        Us_1.id_class(rdy_3.Oe).id_break(xu_3.rq).id_break(xu_3.rT).id_break(rdy_3.OU).id_class("has_mushroom_stew", De_1.id_class(rdy_3.Oe)).id_class("has_bowl", De_1.id_class(rdy_3.OU)).id_class("has_brown_mushroom", De_1.id_class((rpL_2)xu_3.rq)).id_class("has_red_mushroom", De_1.id_class((rpL_2)xu_3.rT)).id_class(consumer);
        UB.id_class(xu_3.SP).id_class(Character.valueOf('N'), rdy_3.dZ).id_class("NN").id_class("NN").id_class("has_netherbrick", De_1.id_class(rdy_3.dZ)).id_class(consumer);
        UB.id_class(xu_3.SB, 6).id_class(Character.valueOf('#'), xu_3.SP).id_class(Character.valueOf('-'), rdy_3.dZ).id_class("#-#").id_class("#-#").id_class("has_nether_brick", De_1.id_class((rpL_2)xu_3.SP)).id_class(consumer);
        UB.id_class(xu_3.bs, 6).id_class(Character.valueOf('#'), xu_3.SP).id_class("###").id_class("has_nether_brick", De_1.id_class((rpL_2)xu_3.SP)).id_class(consumer);
        UB.id_class(xu_3.SS, 4).id_class(Character.valueOf('#'), xu_3.SP).id_class("#  ").id_class("## ").id_class("###").id_class("has_nether_brick", De_1.id_class((rpL_2)xu_3.SP)).id_class(consumer);
        UB.id_class(xu_3.bg).id_class(Character.valueOf('#'), rdy_3.JL).id_class("###").id_class("###").id_class("###").id_class("has_nether_wart", De_1.id_class(rdy_3.JL)).id_class(consumer);
        UB.id_class(xu_3.n).id_class(Character.valueOf('#'), rlc_3.id_byte).id_class(Character.valueOf('X'), rdy_3.hD).id_class("###").id_class("#X#").id_class("###").id_class("has_redstone", De_1.id_class(rdy_3.hD)).id_class(consumer);
        UB.id_class(xu_3.bK).id_class(Character.valueOf('Q'), rdy_3.dv).id_class(Character.valueOf('R'), rdy_3.hD).id_class(Character.valueOf('#'), xu_3.id_volatile).id_class("###").id_class("RRQ").id_class("###").id_class("has_quartz", De_1.id_class(rdy_3.dv)).id_class(consumer);
        Us_1.id_class(rdy_3.XA).id_break(xu_3.rA).id_class("orange_dye").id_class("has_red_flower", De_1.id_class((rpL_2)xu_3.rA)).id_class(consumer, "orange_dye_from_orange_tulip");
        Us_1.id_class(rdy_3.XA, 2).id_break(rdy_3.Xj).id_break(rdy_3.Xl).id_class("orange_dye").id_class("has_red_dye", De_1.id_class(rdy_3.Xj)).id_class("has_yellow_dye", De_1.id_class(rdy_3.Xl)).id_class(consumer, "orange_dye_from_red_yellow");
        UB.id_class(rdy_3.hH).id_class(Character.valueOf('#'), rdy_3.OD).id_class(Character.valueOf('X'), rkg_3.id_class(rlc_3.id_break)).id_class("###").id_class("#X#").id_class("###").id_class("has_wool", De_1.id_class(rlc_3.id_break)).id_class(consumer);
        UB.id_class(rdy_3.Xb, 3).id_class(Character.valueOf('#'), xu_3.Pf).id_class("###").id_class("has_reeds", De_1.id_class((rpL_2)xu_3.Pf)).id_class(consumer);
        UB.id_class(xu_3.sp, 2).id_class(Character.valueOf('#'), xu_3.sH).id_class("#").id_class("#").id_class("has_chiseled_quartz_block", De_1.id_class((rpL_2)xu_3.sy)).id_class("has_quartz_block", De_1.id_class((rpL_2)xu_3.sH)).id_class("has_quartz_pillar", De_1.id_class((rpL_2)xu_3.sp)).id_class(consumer);
        Us_1.id_class(xu_3.Ei).id_break(xu_3.PT, 9).id_class("has_ice", De_1.id_class((rpL_2)xu_3.PT)).id_class(consumer);
        Us_1.id_class(rdy_3.Xy, 2).id_break(xu_3.GS).id_class("pink_dye").id_class("has_double_plant", De_1.id_class((rpL_2)xu_3.GS)).id_class(consumer, "pink_dye_from_peony");
        Us_1.id_class(rdy_3.Xy).id_break(xu_3.rC).id_class("pink_dye").id_class("has_red_flower", De_1.id_class((rpL_2)xu_3.rC)).id_class(consumer, "pink_dye_from_pink_tulip");
        Us_1.id_class(rdy_3.Xy, 2).id_break(rdy_3.Xj).id_break(rdy_3.XL).id_class("pink_dye").id_class("has_white_dye", De_1.id_class(rdy_3.XL)).id_class("has_red_dye", De_1.id_class(rdy_3.Xj)).id_class(consumer, "pink_dye_from_red_white_dye");
        UB.id_class(xu_3.rB).id_class(Character.valueOf('R'), rdy_3.hD).id_class(Character.valueOf('#'), xu_3.id_volatile).id_class(Character.valueOf('T'), rlc_3.id_byte).id_class(Character.valueOf('X'), rdy_3.Ox).id_class("TTT").id_class("#X#").id_class("#R#").id_class("has_redstone", De_1.id_class(rdy_3.hD)).id_class(consumer);
        UB.id_class(xu_3.PD, 4).id_class(Character.valueOf('S'), xu_3.PK).id_class("SS").id_class("SS").id_class("has_basalt", De_1.id_class((rpL_2)xu_3.PK)).id_class(consumer);
        UB.id_class(xu_3.id_protected, 4).id_class(Character.valueOf('S'), xu_3.id_byte).id_class("SS").id_class("SS").id_class("has_stone", De_1.id_class((rpL_2)xu_3.id_byte)).id_class(consumer);
        UB.id_class(xu_3.id_case, 4).id_class(Character.valueOf('S'), xu_3.id_throws).id_class("SS").id_class("SS").id_class("has_stone", De_1.id_class((rpL_2)xu_3.id_throws)).id_class(consumer);
        UB.id_class(xu_3.id_private, 4).id_class(Character.valueOf('S'), xu_3.id_catch).id_class("SS").id_class("SS").id_class("has_stone", De_1.id_class((rpL_2)xu_3.id_catch)).id_class(consumer);
        UB.id_class(xu_3.Em).id_class(Character.valueOf('S'), rdy_3.dA).id_class("SS").id_class("SS").id_class("has_prismarine_shard", De_1.id_class(rdy_3.dA)).id_class(consumer);
        UB.id_class(xu_3.EZ).id_class(Character.valueOf('S'), rdy_3.dA).id_class("SSS").id_class("SSS").id_class("SSS").id_class("has_prismarine_shard", De_1.id_class(rdy_3.dA)).id_class(consumer);
        UB.id_class(xu_3.En, 6).id_class(Character.valueOf('#'), xu_3.Em).id_class("###").id_class("has_prismarine", De_1.id_class((rpL_2)xu_3.Em)).id_class(consumer);
        UB.id_class(xu_3.EC, 6).id_class(Character.valueOf('#'), xu_3.EZ).id_class("###").id_class("has_prismarine_bricks", De_1.id_class((rpL_2)xu_3.EZ)).id_class(consumer);
        UB.id_class(xu_3.El, 6).id_class(Character.valueOf('#'), xu_3.Ev).id_class("###").id_class("has_dark_prismarine", De_1.id_class((rpL_2)xu_3.Ev)).id_class(consumer);
        Us_1.id_class(rdy_3.dN).id_break(xu_3.Pg).id_break(rdy_3.XY).id_break(rdy_3.XJ).id_class("has_carved_pumpkin", De_1.id_class((rpL_2)xu_3.Br)).id_class("has_pumpkin", De_1.id_class((rpL_2)xu_3.Pg)).id_class(consumer);
        Us_1.id_class(rdy_3.Jk, 4).id_break(xu_3.Pg).id_class("has_pumpkin", De_1.id_class((rpL_2)xu_3.Pg)).id_class(consumer);
        Us_1.id_class(rdy_3.Xt, 2).id_break(rdy_3.Xw).id_break(rdy_3.Xj).id_class("has_blue_dye", De_1.id_class(rdy_3.Xw)).id_class("has_red_dye", De_1.id_class(rdy_3.Xj)).id_class(consumer);
        UB.id_class(xu_3.bD).id_class(Character.valueOf('#'), xu_3.re).id_class(Character.valueOf('-'), rdy_3.kA).id_class("-").id_class("#").id_class("-").id_class("has_shulker_shell", De_1.id_class(rdy_3.kA)).id_class(consumer);
        UB.id_class(xu_3.bH, 4).id_class(Character.valueOf('F'), rdy_3.kh).id_class("FF").id_class("FF").id_class("has_chorus_fruit_popped", De_1.id_class(rdy_3.kh)).id_class(consumer);
        UB.id_class(xu_3.by).id_class(Character.valueOf('#'), xu_3.bM).id_class("#").id_class("#").id_class("has_purpur_block", De_1.id_class((rpL_2)xu_3.bH)).id_class(consumer);
        UB.id_class(xu_3.bM, 6).id_class(Character.valueOf('#'), rkg_3.id_class(xu_3.bH, xu_3.by)).id_class("###").id_class("has_purpur_block", De_1.id_class((rpL_2)xu_3.bH)).id_class(consumer);
        UB.id_class(xu_3.bp, 4).id_class(Character.valueOf('#'), rkg_3.id_class(xu_3.bH, xu_3.by)).id_class("#  ").id_class("## ").id_class("###").id_class("has_purpur_block", De_1.id_class((rpL_2)xu_3.bH)).id_class(consumer);
        UB.id_class(xu_3.sH).id_class(Character.valueOf('#'), rdy_3.dv).id_class("##").id_class("##").id_class("has_quartz", De_1.id_class(rdy_3.dv)).id_class(consumer);
        UB.id_class(xu_3.Jj, 4).id_class(Character.valueOf('#'), xu_3.sH).id_class("##").id_class("##").id_class("has_quartz_block", De_1.id_class((rpL_2)xu_3.sH)).id_class(consumer);
        UB.id_class(xu_3.bE, 6).id_class(Character.valueOf('#'), rkg_3.id_class(xu_3.sy, xu_3.sH, xu_3.sp)).id_class("###").id_class("has_chiseled_quartz_block", De_1.id_class((rpL_2)xu_3.sy)).id_class("has_quartz_block", De_1.id_class((rpL_2)xu_3.sH)).id_class("has_quartz_pillar", De_1.id_class((rpL_2)xu_3.sp)).id_class(consumer);
        UB.id_class(xu_3.sq, 4).id_class(Character.valueOf('#'), rkg_3.id_class(xu_3.sy, xu_3.sH, xu_3.sp)).id_class("#  ").id_class("## ").id_class("###").id_class("has_chiseled_quartz_block", De_1.id_class((rpL_2)xu_3.sy)).id_class("has_quartz_block", De_1.id_class((rpL_2)xu_3.sH)).id_class("has_quartz_pillar", De_1.id_class((rpL_2)xu_3.sp)).id_class(consumer);
        Us_1.id_class(rdy_3.dH).id_break(rdy_3.dG).id_break(rdy_3.dl).id_break(rdy_3.OU).id_break(rdy_3.ds).id_break(xu_3.rq).id_class("rabbit_stew").id_class("has_cooked_rabbit", De_1.id_class(rdy_3.dl)).id_class(consumer, "rabbit_stew_from_brown_mushroom");
        Us_1.id_class(rdy_3.dH).id_break(rdy_3.dG).id_break(rdy_3.dl).id_break(rdy_3.OU).id_break(rdy_3.ds).id_break(xu_3.rT).id_class("rabbit_stew").id_class("has_cooked_rabbit", De_1.id_class(rdy_3.dl)).id_class(consumer, "rabbit_stew_from_red_mushroom");
        UB.id_class(xu_3.Px, 16).id_class(Character.valueOf('#'), rdy_3.OD).id_class(Character.valueOf('X'), rdy_3.Ox).id_class("X X").id_class("X#X").id_class("X X").id_class("has_minecart", De_1.id_class(rdy_3.ho)).id_class(consumer);
        Us_1.id_class(rdy_3.hD, 9).id_break(xu_3.sn).id_class("has_redstone_block", De_1.id_class((rpL_2)xu_3.sn)).id_class(consumer);
        UB.id_class(xu_3.sn).id_class(Character.valueOf('#'), rdy_3.hD).id_class("###").id_class("###").id_class("###").id_class("has_redstone", De_1.id_class(rdy_3.hD)).id_class(consumer);
        UB.id_class(xu_3.SJ).id_class(Character.valueOf('R'), rdy_3.hD).id_class(Character.valueOf('G'), xu_3.Pa).id_class(" R ").id_class("RGR").id_class(" R ").id_class("has_glowstone", De_1.id_class((rpL_2)xu_3.Pa)).id_class(consumer);
        UB.id_class(xu_3.PH).id_class(Character.valueOf('#'), rdy_3.OD).id_class(Character.valueOf('X'), rdy_3.hD).id_class("X").id_class("#").id_class("has_redstone", De_1.id_class(rdy_3.hD)).id_class(consumer);
        Us_1.id_class(rdy_3.Xj).id_break(rdy_3.kX).id_class("red_dye").id_class("has_beetroot", De_1.id_class(rdy_3.kX)).id_class(consumer, "red_dye_from_beetroot");
        Us_1.id_class(rdy_3.Xj).id_break(xu_3.rm).id_class("red_dye").id_class("has_red_flower", De_1.id_class((rpL_2)xu_3.rm)).id_class(consumer, "red_dye_from_poppy");
        Us_1.id_class(rdy_3.Xj, 2).id_break(xu_3.GB).id_class("red_dye").id_class("has_double_plant", De_1.id_class((rpL_2)xu_3.GB)).id_class(consumer, "red_dye_from_rose_bush");
        Us_1.id_class(rdy_3.Xj).id_break(xu_3.rL).id_class("red_dye").id_class("has_red_flower", De_1.id_class((rpL_2)xu_3.rL)).id_class(consumer, "red_dye_from_tulip");
        UB.id_class(xu_3.bR).id_class(Character.valueOf('W'), rdy_3.JL).id_class(Character.valueOf('N'), rdy_3.dZ).id_class("NW").id_class("WN").id_class("has_nether_wart", De_1.id_class(rdy_3.JL)).id_class(consumer);
        UB.id_class(xu_3.GI).id_class(Character.valueOf('#'), xu_3.id_interface).id_class("##").id_class("##").id_class("has_sand", De_1.id_class((rpL_2)xu_3.id_interface)).id_class(consumer);
        UB.id_class(xu_3.bG, 6).id_class(Character.valueOf('#'), rkg_3.id_class(xu_3.GI, xu_3.Gf)).id_class("###").id_class("has_red_sandstone", De_1.id_class((rpL_2)xu_3.GI)).id_class("has_chiseled_red_sandstone", De_1.id_class((rpL_2)xu_3.Gf)).id_class(consumer);
        UB.id_class(xu_3.bb, 6).id_class(Character.valueOf('#'), xu_3.Gj).id_class("###").id_class("has_cut_red_sandstone", De_1.id_class((rpL_2)xu_3.Gj)).id_class(consumer);
        UB.id_class(xu_3.GV, 4).id_class(Character.valueOf('#'), rkg_3.id_class(xu_3.GI, xu_3.Gf, xu_3.Gj)).id_class("#  ").id_class("## ").id_class("###").id_class("has_red_sandstone", De_1.id_class((rpL_2)xu_3.GI)).id_class("has_chiseled_red_sandstone", De_1.id_class((rpL_2)xu_3.Gf)).id_class("has_cut_red_sandstone", De_1.id_class((rpL_2)xu_3.Gj)).id_class(consumer);
        UB.id_class(xu_3.BS).id_class(Character.valueOf('#'), xu_3.PH).id_class(Character.valueOf('X'), rdy_3.hD).id_class(Character.valueOf('I'), xu_3.id_break).id_class("#X#").id_class("III").id_class("has_redstone_torch", De_1.id_class((rpL_2)xu_3.PH)).id_class(consumer);
        UB.id_class(xu_3.F).id_class(Character.valueOf('#'), xu_3.id_throw).id_class("##").id_class("##").id_class("has_sand", De_1.id_class((rpL_2)xu_3.id_throw)).id_class(consumer);
        UB.id_class(xu_3.Ga, 6).id_class(Character.valueOf('#'), rkg_3.id_class(xu_3.F, xu_3.L)).id_class("###").id_class("has_sandstone", De_1.id_class((rpL_2)xu_3.F)).id_class("has_chiseled_sandstone", De_1.id_class((rpL_2)xu_3.L)).id_class(consumer);
        UB.id_class(xu_3.Gi, 6).id_class(Character.valueOf('#'), xu_3.A).id_class("###").id_class("has_cut_sandstone", De_1.id_class((rpL_2)xu_3.A)).id_class(consumer);
        UB.id_class(xu_3.Sd, 4).id_class(Character.valueOf('#'), rkg_3.id_class(xu_3.F, xu_3.L, xu_3.A)).id_class("#  ").id_class("## ").id_class("###").id_class("has_sandstone", De_1.id_class((rpL_2)xu_3.F)).id_class("has_chiseled_sandstone", De_1.id_class((rpL_2)xu_3.L)).id_class("has_cut_sandstone", De_1.id_class((rpL_2)xu_3.A)).id_class(consumer);
        UB.id_class(xu_3.EH).id_class(Character.valueOf('S'), rdy_3.dA).id_class(Character.valueOf('C'), rdy_3.dn).id_class("SCS").id_class("CCC").id_class("SCS").id_class("has_prismarine_crystals", De_1.id_class(rdy_3.dn)).id_class(consumer);
        UB.id_class(rdy_3.JJ).id_class(Character.valueOf('#'), rdy_3.Ox).id_class(" #").id_class("# ").id_class("has_iron_ingot", De_1.id_class(rdy_3.Ox)).id_class(consumer);
        UB.id_class(rdy_3.kN).id_class(Character.valueOf('W'), rlc_3.id_byte).id_class(Character.valueOf('o'), rdy_3.Ox).id_class("WoW").id_class("WWW").id_class(" W ").id_class("has_iron_ingot", De_1.id_class(rdy_3.Ox)).id_class(consumer);
        UB.id_class(xu_3.EN).id_class(Character.valueOf('#'), rdy_3.XO).id_class("###").id_class("###").id_class("###").id_class("has_slime_ball", De_1.id_class(rdy_3.XO)).id_class(consumer);
        Us_1.id_class(rdy_3.XO, 9).id_break(xu_3.EN).id_class("has_slime", De_1.id_class((rpL_2)xu_3.EN)).id_class(consumer);
        UB.id_class(xu_3.Gj, 4).id_class(Character.valueOf('#'), xu_3.GI).id_class("##").id_class("##").id_class("has_red_sandstone", De_1.id_class((rpL_2)xu_3.GI)).id_class(consumer);
        UB.id_class(xu_3.A, 4).id_class(Character.valueOf('#'), xu_3.F).id_class("##").id_class("##").id_class("has_sandstone", De_1.id_class((rpL_2)xu_3.F)).id_class(consumer);
        UB.id_class(xu_3.Pt).id_class(Character.valueOf('#'), rdy_3.hU).id_class("##").id_class("##").id_class("has_snowball", De_1.id_class(rdy_3.hU)).id_class(consumer);
        UB.id_class(xu_3.Pq, 6).id_class(Character.valueOf('#'), xu_3.Pt).id_class("###").id_class("has_snowball", De_1.id_class(rdy_3.hU)).id_class(consumer);
        UB.id_class(xu_3.XX).id_class(Character.valueOf('L'), rlc_3.id_new).id_class(Character.valueOf('S'), rdy_3.OD).id_class(Character.valueOf('#'), rlc_3.id_for).id_class(" S ").id_class("S#S").id_class("LLL").id_class("has_stick", De_1.id_class(rdy_3.OD)).id_class("has_soul_sand", De_1.id_class(rlc_3.id_for)).id_class(consumer);
        UB.id_class(rdy_3.Jt).id_class(Character.valueOf('#'), rdy_3.JF).id_class(Character.valueOf('X'), rdy_3.Jx).id_class("###").id_class("#X#").id_class("###").id_class("has_melon", De_1.id_class(rdy_3.Jx)).id_class(consumer);
        UB.id_class(rdy_3.kW, 2).id_class(Character.valueOf('#'), rdy_3.XW).id_class(Character.valueOf('X'), rdy_3.OO).id_class(" # ").id_class("#X#").id_class(" # ").id_class("has_glowstone_dust", De_1.id_class(rdy_3.XW)).id_class(consumer);
        UB.id_class(rdy_3.OD, 4).id_class(Character.valueOf('#'), rlc_3.id_byte).id_class("#").id_class("#").id_break("sticks").id_class("has_planks", De_1.id_class(rlc_3.id_byte)).id_class(consumer);
        UB.id_class(rdy_3.OD, 1).id_class(Character.valueOf('#'), xu_3.hs).id_class("#").id_class("#").id_break("sticks").id_class("has_bamboo", De_1.id_class((rpL_2)xu_3.hs)).id_class(consumer, "stick_from_bamboo_item");
        UB.id_class(xu_3.D).id_class(Character.valueOf('P'), xu_3.rB).id_class(Character.valueOf('S'), rdy_3.XO).id_class("S").id_class("P").id_class("has_slime_ball", De_1.id_class(rdy_3.XO)).id_class(consumer);
        UB.id_class(xu_3.BL, 4).id_class(Character.valueOf('#'), xu_3.id_break).id_class("##").id_class("##").id_class("has_stone", De_1.id_class((rpL_2)xu_3.id_break)).id_class(consumer);
        UB.id_class(rdy_3.OF).id_class(Character.valueOf('#'), rdy_3.OD).id_class(Character.valueOf('X'), rlc_3.b).id_class("XX").id_class("X#").id_class(" #").id_class("has_cobblestone", De_1.id_class(rlc_3.b)).id_class(consumer);
        UB.id_class(xu_3.bS, 6).id_class(Character.valueOf('#'), xu_3.BL).id_class("###").id_class("has_stone_bricks", De_1.id_class(rlc_3.id_protected)).id_class(consumer);
        UB.id_class(xu_3.Ba, 4).id_class(Character.valueOf('#'), xu_3.BL).id_class("#  ").id_class("## ").id_class("###").id_class("has_stone_bricks", De_1.id_class(rlc_3.id_protected)).id_class(consumer);
        Us_1.id_class(xu_3.Pp).id_break(xu_3.id_break).id_class("has_stone", De_1.id_class((rpL_2)xu_3.id_break)).id_class(consumer);
        UB.id_class(rdy_3.OL).id_class(Character.valueOf('#'), rdy_3.OD).id_class(Character.valueOf('X'), rlc_3.b).id_class("XX").id_class(" #").id_class(" #").id_class("has_cobblestone", De_1.id_class(rlc_3.b)).id_class(consumer);
        UB.id_class(rdy_3.Ov).id_class(Character.valueOf('#'), rdy_3.OD).id_class(Character.valueOf('X'), rlc_3.b).id_class("XXX").id_class(" # ").id_class(" # ").id_class("has_cobblestone", De_1.id_class(rlc_3.b)).id_class(consumer);
        UB.id_class(xu_3.Pm).id_class(Character.valueOf('#'), xu_3.id_break).id_class("##").id_class("has_stone", De_1.id_class((rpL_2)xu_3.id_break)).id_class(consumer);
        UB.id_class(rdy_3.OZ).id_class(Character.valueOf('#'), rdy_3.OD).id_class(Character.valueOf('X'), rlc_3.b).id_class("X").id_class("#").id_class("#").id_class("has_cobblestone", De_1.id_class(rlc_3.b)).id_class(consumer);
        UB.id_class(xu_3.GU, 6).id_class(Character.valueOf('#'), xu_3.id_break).id_class("###").id_class("has_stone", De_1.id_class((rpL_2)xu_3.id_break)).id_class(consumer);
        UB.id_class(xu_3.Ge, 6).id_class(Character.valueOf('#'), xu_3.bO).id_class("###").id_class("has_smooth_stone", De_1.id_class((rpL_2)xu_3.bO)).id_class(consumer);
        UB.id_class(xu_3.Pd, 4).id_class(Character.valueOf('#'), xu_3.id_volatile).id_class("#  ").id_class("## ").id_class("###").id_class("has_cobblestone", De_1.id_class((rpL_2)xu_3.id_volatile)).id_class(consumer);
        UB.id_class(rdy_3.Om).id_class(Character.valueOf('#'), rdy_3.OD).id_class(Character.valueOf('X'), rlc_3.b).id_class("X").id_class("X").id_class("#").id_class("has_cobblestone", De_1.id_class(rlc_3.b)).id_class(consumer);
        UB.id_class(xu_3.rs).id_class(Character.valueOf('#'), rdy_3.Oa).id_class("##").id_class("##").id_class("has_string", De_1.id_class(rdy_3.Oa)).id_class(consumer, "white_wool_from_string");
        Us_1.id_class(rdy_3.XY).id_break(xu_3.Pf).id_class("sugar").id_class("has_reeds", De_1.id_class((rpL_2)xu_3.Pf)).id_class(consumer, "sugar_from_sugar_cane");
        Us_1.id_class(rdy_3.XY, 3).id_break(rdy_3.WF).id_class("sugar").id_class("has_honey_bottle", De_1.id_class(rdy_3.WF)).id_class(consumer, "sugar_from_honey_bottle");
        UB.id_class(xu_3.Jb).id_class(Character.valueOf('H'), rdy_3.sR).id_class(Character.valueOf('R'), rdy_3.hD).id_class(" R ").id_class("RHR").id_class(" R ").id_class("has_redstone", De_1.id_class(rdy_3.hD)).id_class("has_hay_block", De_1.id_class((rpL_2)xu_3.Ey)).id_class(consumer);
        UB.id_class(xu_3.rf).id_class(Character.valueOf('#'), rkg_3.id_class(xu_3.id_throw, xu_3.id_interface)).id_class(Character.valueOf('X'), rdy_3.hr).id_class("X#X").id_class("#X#").id_class("X#X").id_class("has_gunpowder", De_1.id_class(rdy_3.hr)).id_class(consumer);
        UB.id_class(rdy_3.dF).id_class(Character.valueOf('A'), xu_3.rf).id_class(Character.valueOf('B'), rdy_3.ho).id_class("A").id_class("B").id_class("has_minecart", De_1.id_class(rdy_3.ho)).id_class(consumer);
        UB.id_class(xu_3.rR, 4).id_class(Character.valueOf('#'), rdy_3.OD).id_class(Character.valueOf('X'), rkg_3.id_class(rdy_3.Oh, rdy_3.OX)).id_class("X").id_class("#").id_class("has_stone_pickaxe", De_1.id_class(rdy_3.Ov)).id_class(consumer);
        UB.id_class(xu_3.PU, 4).id_class(Character.valueOf('X'), rkg_3.id_class(rdy_3.Oh, rdy_3.OX)).id_class(Character.valueOf('#'), rdy_3.OD).id_class(Character.valueOf('S'), rlc_3.id_for).id_class("X").id_class("#").id_class("S").id_class("has_soul_sand", De_1.id_class(rlc_3.id_for)).id_class(consumer);
        UB.id_class(xu_3.XM).id_class(Character.valueOf('#'), rdy_3.Pu).id_class(Character.valueOf('X'), rdy_3.kn).id_class("XXX").id_class("X#X").id_class("XXX").id_class("has_iron_nugget", De_1.id_class(rdy_3.kn)).id_class("has_iron_ingot", De_1.id_class(rdy_3.Ox)).id_class(consumer);
        UB.id_class(xu_3.XO).id_class(Character.valueOf('#'), rdy_3.Bu).id_class(Character.valueOf('X'), rdy_3.kn).id_class("XXX").id_class("X#X").id_class("XXX").id_class("has_soul_torch", De_1.id_class(rdy_3.Bu)).id_class(consumer);
        Us_1.id_class(xu_3.sZ).id_break(xu_3.re).id_break(xu_3.Sz).id_class("has_tripwire_hook", De_1.id_class((rpL_2)xu_3.Sz)).id_class(consumer);
        UB.id_class(xu_3.Sz, 2).id_class(Character.valueOf('#'), rlc_3.id_byte).id_class(Character.valueOf('S'), rdy_3.OD).id_class(Character.valueOf('I'), rdy_3.Ox).id_class("I").id_class("S").id_class("#").id_class("has_string", De_1.id_class(rdy_3.Oa)).id_class(consumer);
        UB.id_class(rdy_3.Os).id_class(Character.valueOf('X'), rdy_3.OE).id_class("XXX").id_class("X X").id_class("has_scute", De_1.id_class(rdy_3.OE)).id_class(consumer);
        Us_1.id_class(rdy_3.hB, 9).id_break(xu_3.Ey).id_class("has_hay_block", De_1.id_class((rpL_2)xu_3.Ey)).id_class(consumer);
        Us_1.id_class(rdy_3.XL).id_break(rdy_3.Xg).id_class("white_dye").id_class("has_bone_meal", De_1.id_class(rdy_3.Xg)).id_class(consumer);
        Us_1.id_class(rdy_3.XL).id_break(xu_3.rp).id_class("white_dye").id_class("has_white_flower", De_1.id_class((rpL_2)xu_3.rp)).id_class(consumer, "white_dye_from_lily_of_the_valley");
        UB.id_class(rdy_3.Oc).id_class(Character.valueOf('#'), rdy_3.OD).id_class(Character.valueOf('X'), rlc_3.id_byte).id_class("XX").id_class("X#").id_class(" #").id_class("has_stick", De_1.id_class(rdy_3.OD)).id_class(consumer);
        UB.id_class(rdy_3.Ou).id_class(Character.valueOf('#'), rdy_3.OD).id_class(Character.valueOf('X'), rlc_3.id_byte).id_class("XX").id_class(" #").id_class(" #").id_class("has_stick", De_1.id_class(rdy_3.OD)).id_class(consumer);
        UB.id_class(rdy_3.ON).id_class(Character.valueOf('#'), rdy_3.OD).id_class(Character.valueOf('X'), rlc_3.id_byte).id_class("XXX").id_class(" # ").id_class(" # ").id_class("has_stick", De_1.id_class(rdy_3.OD)).id_class(consumer);
        UB.id_class(rdy_3.OQ).id_class(Character.valueOf('#'), rdy_3.OD).id_class(Character.valueOf('X'), rlc_3.id_byte).id_class("X").id_class("#").id_class("#").id_class("has_stick", De_1.id_class(rdy_3.OD)).id_class(consumer);
        UB.id_class(rdy_3.Oz).id_class(Character.valueOf('#'), rdy_3.OD).id_class(Character.valueOf('X'), rlc_3.id_byte).id_class("X").id_class("X").id_class("#").id_class("has_stick", De_1.id_class(rdy_3.OD)).id_class(consumer);
        Us_1.id_class(rdy_3.xi).id_break(rdy_3.XM).id_break(rdy_3.XZ).id_break(rdy_3.Oi).id_class("has_book", De_1.id_class(rdy_3.XM)).id_class(consumer);
        Us_1.id_class(rdy_3.Xl).id_break(xu_3.ru).id_class("yellow_dye").id_class("has_yellow_flower", De_1.id_class((rpL_2)xu_3.ru)).id_class(consumer, "yellow_dye_from_dandelion");
        Us_1.id_class(rdy_3.Xl, 2).id_break(xu_3.Gr).id_class("yellow_dye").id_class("has_double_plant", De_1.id_class((rpL_2)xu_3.Gr)).id_class(consumer, "yellow_dye_from_sunflower");
        Us_1.id_class(rdy_3.Jd, 9).id_break(xu_3.Oh).id_class("has_dried_kelp_block", De_1.id_class((rpL_2)xu_3.Oh)).id_class(consumer);
        Us_1.id_class(xu_3.Oh).id_break(rdy_3.Jd, 9).id_class("has_dried_kelp", De_1.id_class(rdy_3.Jd)).id_class(consumer);
        UB.id_class(xu_3.hB).id_class(Character.valueOf('#'), rdy_3.kK).id_class(Character.valueOf('X'), rdy_3.kD).id_class("###").id_class("#X#").id_class("###").id_class("has_nautilus_core", De_1.id_class(rdy_3.kD)).id_class("has_nautilus_shell", De_1.id_class(rdy_3.kK)).id_class(consumer);
        UB.id_class(xu_3.hO, 4).id_class(Character.valueOf('#'), xu_3.id_protected).id_class("#  ").id_class("## ").id_class("###").id_class("has_polished_granite", De_1.id_class((rpL_2)xu_3.id_protected)).id_class(consumer);
        UB.id_class(xu_3.hh, 4).id_class(Character.valueOf('#'), xu_3.bJ).id_class("#  ").id_class("## ").id_class("###").id_class("has_smooth_red_sandstone", De_1.id_class((rpL_2)xu_3.bJ)).id_class(consumer);
        UB.id_class(xu_3.hX, 4).id_class(Character.valueOf('#'), xu_3.BA).id_class("#  ").id_class("## ").id_class("###").id_class("has_mossy_stone_bricks", De_1.id_class((rpL_2)xu_3.BA)).id_class(consumer);
        UB.id_class(xu_3.hJ, 4).id_class(Character.valueOf('#'), xu_3.id_case).id_class("#  ").id_class("## ").id_class("###").id_class("has_polished_diorite", De_1.id_class((rpL_2)xu_3.id_case)).id_class(consumer);
        UB.id_class(xu_3.hx, 4).id_class(Character.valueOf('#'), xu_3.rV).id_class("#  ").id_class("## ").id_class("###").id_class("has_mossy_cobblestone", De_1.id_class((rpL_2)xu_3.rV)).id_class(consumer);
        UB.id_class(xu_3.hd, 4).id_class(Character.valueOf('#'), xu_3.bq).id_class("#  ").id_class("## ").id_class("###").id_class("has_end_stone_bricks", De_1.id_class((rpL_2)xu_3.bq)).id_class(consumer);
        UB.id_class(xu_3.hk, 4).id_class(Character.valueOf('#'), xu_3.id_break).id_class("#  ").id_class("## ").id_class("###").id_class("has_stone", De_1.id_class((rpL_2)xu_3.id_break)).id_class(consumer);
        UB.id_class(xu_3.hW, 4).id_class(Character.valueOf('#'), xu_3.bh).id_class("#  ").id_class("## ").id_class("###").id_class("has_smooth_sandstone", De_1.id_class((rpL_2)xu_3.bh)).id_class(consumer);
        UB.id_class(xu_3.hz, 4).id_class(Character.valueOf('#'), xu_3.bX).id_class("#  ").id_class("## ").id_class("###").id_class("has_smooth_quartz", De_1.id_class((rpL_2)xu_3.bX)).id_class(consumer);
        UB.id_class(xu_3.hQ, 4).id_class(Character.valueOf('#'), xu_3.id_byte).id_class("#  ").id_class("## ").id_class("###").id_class("has_granite", De_1.id_class((rpL_2)xu_3.id_byte)).id_class(consumer);
        UB.id_class(xu_3.hN, 4).id_class(Character.valueOf('#'), xu_3.id_catch).id_class("#  ").id_class("## ").id_class("###").id_class("has_andesite", De_1.id_class((rpL_2)xu_3.id_catch)).id_class(consumer);
        UB.id_class(xu_3.hc, 4).id_class(Character.valueOf('#'), xu_3.bR).id_class("#  ").id_class("## ").id_class("###").id_class("has_red_nether_bricks", De_1.id_class((rpL_2)xu_3.bR)).id_class(consumer);
        UB.id_class(xu_3.hu, 4).id_class(Character.valueOf('#'), xu_3.id_private).id_class("#  ").id_class("## ").id_class("###").id_class("has_polished_andesite", De_1.id_class((rpL_2)xu_3.id_private)).id_class(consumer);
        UB.id_class(xu_3.hm, 4).id_class(Character.valueOf('#'), xu_3.id_throws).id_class("#  ").id_class("## ").id_class("###").id_class("has_diorite", De_1.id_class((rpL_2)xu_3.id_throws)).id_class(consumer);
        UB.id_class(xu_3.hZ, 6).id_class(Character.valueOf('#'), xu_3.id_protected).id_class("###").id_class("has_polished_granite", De_1.id_class((rpL_2)xu_3.id_protected)).id_class(consumer);
        UB.id_class(xu_3.hv, 6).id_class(Character.valueOf('#'), xu_3.bJ).id_class("###").id_class("has_smooth_red_sandstone", De_1.id_class((rpL_2)xu_3.bJ)).id_class(consumer);
        UB.id_class(xu_3.hF, 6).id_class(Character.valueOf('#'), xu_3.BA).id_class("###").id_class("has_mossy_stone_bricks", De_1.id_class((rpL_2)xu_3.BA)).id_class(consumer);
        UB.id_class(xu_3.hL, 6).id_class(Character.valueOf('#'), xu_3.id_case).id_class("###").id_class("has_polished_diorite", De_1.id_class((rpL_2)xu_3.id_case)).id_class(consumer);
        UB.id_class(xu_3.hA, 6).id_class(Character.valueOf('#'), xu_3.rV).id_class("###").id_class("has_mossy_cobblestone", De_1.id_class((rpL_2)xu_3.rV)).id_class(consumer);
        UB.id_class(xu_3.hn, 6).id_class(Character.valueOf('#'), xu_3.bq).id_class("###").id_class("has_end_stone_bricks", De_1.id_class((rpL_2)xu_3.bq)).id_class(consumer);
        UB.id_class(xu_3.hC, 6).id_class(Character.valueOf('#'), xu_3.bh).id_class("###").id_class("has_smooth_sandstone", De_1.id_class((rpL_2)xu_3.bh)).id_class(consumer);
        UB.id_class(xu_3.hl, 6).id_class(Character.valueOf('#'), xu_3.bX).id_class("###").id_class("has_smooth_quartz", De_1.id_class((rpL_2)xu_3.bX)).id_class(consumer);
        UB.id_class(xu_3.hH, 6).id_class(Character.valueOf('#'), xu_3.id_byte).id_class("###").id_class("has_granite", De_1.id_class((rpL_2)xu_3.id_byte)).id_class(consumer);
        UB.id_class(xu_3.hy, 6).id_class(Character.valueOf('#'), xu_3.id_catch).id_class("###").id_class("has_andesite", De_1.id_class((rpL_2)xu_3.id_catch)).id_class(consumer);
        UB.id_class(xu_3.hp, 6).id_class(Character.valueOf('#'), xu_3.bR).id_class("###").id_class("has_red_nether_bricks", De_1.id_class((rpL_2)xu_3.bR)).id_class(consumer);
        UB.id_class(xu_3.hq, 6).id_class(Character.valueOf('#'), xu_3.id_private).id_class("###").id_class("has_polished_andesite", De_1.id_class((rpL_2)xu_3.id_private)).id_class(consumer);
        UB.id_class(xu_3.hT, 6).id_class(Character.valueOf('#'), xu_3.id_throws).id_class("###").id_class("has_diorite", De_1.id_class((rpL_2)xu_3.id_throws)).id_class(consumer);
        UB.id_class(xu_3.ht, 6).id_class(Character.valueOf('#'), xu_3.rI).id_class("###").id_class("###").id_class("has_bricks", De_1.id_class((rpL_2)xu_3.rI)).id_class(consumer);
        UB.id_class(xu_3.hw, 6).id_class(Character.valueOf('#'), xu_3.Em).id_class("###").id_class("###").id_class("has_prismarine", De_1.id_class((rpL_2)xu_3.Em)).id_class(consumer);
        UB.id_class(xu_3.hI, 6).id_class(Character.valueOf('#'), xu_3.GI).id_class("###").id_class("###").id_class("has_red_sandstone", De_1.id_class((rpL_2)xu_3.GI)).id_class(consumer);
        UB.id_class(xu_3.hf, 6).id_class(Character.valueOf('#'), xu_3.BA).id_class("###").id_class("###").id_class("has_mossy_stone_bricks", De_1.id_class((rpL_2)xu_3.BA)).id_class(consumer);
        UB.id_class(xu_3.hj, 6).id_class(Character.valueOf('#'), xu_3.id_byte).id_class("###").id_class("###").id_class("has_granite", De_1.id_class((rpL_2)xu_3.id_byte)).id_class(consumer);
        UB.id_class(xu_3.hV, 6).id_class(Character.valueOf('#'), xu_3.BL).id_class("###").id_class("###").id_class("has_stone_bricks", De_1.id_class((rpL_2)xu_3.BL)).id_class(consumer);
        UB.id_class(xu_3.hg, 6).id_class(Character.valueOf('#'), xu_3.SP).id_class("###").id_class("###").id_class("has_nether_bricks", De_1.id_class((rpL_2)xu_3.SP)).id_class(consumer);
        UB.id_class(xu_3.hR, 6).id_class(Character.valueOf('#'), xu_3.id_catch).id_class("###").id_class("###").id_class("has_andesite", De_1.id_class((rpL_2)xu_3.id_catch)).id_class(consumer);
        UB.id_class(xu_3.hY, 6).id_class(Character.valueOf('#'), xu_3.bR).id_class("###").id_class("###").id_class("has_red_nether_bricks", De_1.id_class((rpL_2)xu_3.bR)).id_class(consumer);
        UB.id_class(xu_3.ho, 6).id_class(Character.valueOf('#'), xu_3.F).id_class("###").id_class("###").id_class("has_sandstone", De_1.id_class((rpL_2)xu_3.F)).id_class(consumer);
        UB.id_class(xu_3.hK, 6).id_class(Character.valueOf('#'), xu_3.bq).id_class("###").id_class("###").id_class("has_end_stone_bricks", De_1.id_class((rpL_2)xu_3.bq)).id_class(consumer);
        UB.id_class(xu_3.hD, 6).id_class(Character.valueOf('#'), xu_3.id_throws).id_class("###").id_class("###").id_class("has_diorite", De_1.id_class((rpL_2)xu_3.id_throws)).id_class(consumer);
        Us_1.id_class(rdy_3.Wr).id_break(rdy_3.Xb).id_break(rdy_3.dd).id_class("has_creeper_head", De_1.id_class(rdy_3.dd)).id_class(consumer);
        Us_1.id_class(rdy_3.WP).id_break(rdy_3.Xb).id_break(rdy_3.dX).id_class("has_wither_skeleton_skull", De_1.id_class(rdy_3.dX)).id_class(consumer);
        Us_1.id_class(rdy_3.ki).id_break(rdy_3.Xb).id_break(xu_3.rl).id_class("has_oxeye_daisy", De_1.id_class((rpL_2)xu_3.rl)).id_class(consumer);
        Us_1.id_class(rdy_3.WB).id_break(rdy_3.Xb).id_break(rdy_3.hp).id_class("has_enchanted_golden_apple", De_1.id_class(rdy_3.hp)).id_class(consumer);
        UB.id_class(xu_3.hU, 6).id_class(Character.valueOf('~'), rdy_3.Oa).id_class(Character.valueOf('I'), xu_3.hs).id_class("I~I").id_class("I I").id_class("I I").id_class("has_bamboo", De_1.id_class((rpL_2)xu_3.hs)).id_class(consumer);
        UB.id_class(xu_3.XS).id_class(Character.valueOf('I'), rdy_3.OD).id_class(Character.valueOf('-'), xu_3.GU).id_class(Character.valueOf('#'), rlc_3.id_byte).id_class("I-I").id_class("# #").id_class("has_stone_slab", De_1.id_class((rpL_2)xu_3.GU)).id_class(consumer);
        UB.id_class(xu_3.Xr).id_class(Character.valueOf('#'), xu_3.bO).id_class(Character.valueOf('X'), xu_3.Ps).id_class(Character.valueOf('I'), rdy_3.Ox).id_class("III").id_class("IXI").id_class("###").id_class("has_smooth_stone", De_1.id_class((rpL_2)xu_3.bO)).id_class(consumer);
        UB.id_class(xu_3.hi).id_class(Character.valueOf('#'), rlc_3.id_new).id_class(Character.valueOf('X'), xu_3.Ps).id_class(" # ").id_class("#X#").id_class(" # ").id_class("has_furnace", De_1.id_class((rpL_2)xu_3.Ps)).id_class(consumer);
        UB.id_class(xu_3.XP).id_class(Character.valueOf('#'), rlc_3.id_byte).id_class(Character.valueOf('@'), rdy_3.Xb).id_class("@@").id_class("##").id_class("##").id_class("has_paper", De_1.id_class(rdy_3.Xb)).id_class(consumer);
        UB.id_class(xu_3.XE).id_class(Character.valueOf('#'), rlc_3.id_byte).id_class(Character.valueOf('@'), rdy_3.Ox).id_class("@@").id_class("##").id_class("##").id_class("has_iron_ingot", De_1.id_class(rdy_3.Ox)).id_class(consumer);
        UB.id_class(xu_3.XB).id_class(Character.valueOf('#'), rlc_3.id_byte).id_class(Character.valueOf('@'), rdy_3.hn).id_class("@@").id_class("##").id_class("##").id_class("has_flint", De_1.id_class(rdy_3.hn)).id_class(consumer);
        UB.id_class(xu_3.XG).id_class(Character.valueOf('I'), rdy_3.Ox).id_class(Character.valueOf('#'), xu_3.id_break).id_class(" I ").id_class("###").id_class("has_stone", De_1.id_class((rpL_2)xu_3.id_break)).id_class(consumer);
        UB.id_class(xu_3.Jc).id_class(Character.valueOf('S'), rdy_3.BV).id_class(Character.valueOf('#'), rdy_3.Ok).id_class("SSS").id_class("S#S").id_class("SSS").id_class("has_netherite_ingot", De_1.id_class(rdy_3.Ok)).id_class(consumer);
        UB.id_class(xu_3.JJ).id_class(Character.valueOf('#'), rdy_3.Ok).id_class("###").id_class("###").id_class("###").id_class("has_netherite_ingot", De_1.id_class(rdy_3.Ok)).id_class(consumer);
        Us_1.id_class(rdy_3.Ok, 9).id_break(xu_3.JJ).id_class("netherite_ingot").id_class("has_netherite_block", De_1.id_class((rpL_2)xu_3.JJ)).id_class(consumer, "netherite_ingot_from_netherite_block");
        Us_1.id_class(rdy_3.Ok).id_break(rdy_3.OW, 4).id_break(rdy_3.Od, 4).id_class("netherite_ingot").id_class("has_netherite_scrap", De_1.id_class(rdy_3.OW)).id_class(consumer);
        UB.id_class(xu_3.Jk).id_class(Character.valueOf('O'), xu_3.Jd).id_class(Character.valueOf('G'), xu_3.Pa).id_class("OOO").id_class("GGG").id_class("OOO").id_class("has_obsidian", De_1.id_class((rpL_2)xu_3.Jd)).id_class(consumer);
        UB.id_class(xu_3.Jm, 4).id_class(Character.valueOf('#'), xu_3.Ju).id_class("#  ").id_class("## ").id_class("###").id_class("has_blackstone", De_1.id_class((rpL_2)xu_3.Ju)).id_class(consumer);
        UB.id_class(xu_3.Jp, 4).id_class(Character.valueOf('#'), xu_3.JF).id_class("#  ").id_class("## ").id_class("###").id_class("has_polished_blackstone", De_1.id_class((rpL_2)xu_3.JF)).id_class(consumer);
        UB.id_class(xu_3.Jl, 4).id_class(Character.valueOf('#'), xu_3.JL).id_class("#  ").id_class("## ").id_class("###").id_class("has_polished_blackstone_bricks", De_1.id_class((rpL_2)xu_3.JL)).id_class(consumer);
        UB.id_class(xu_3.Jv, 6).id_class(Character.valueOf('#'), xu_3.Ju).id_class("###").id_class("has_blackstone", De_1.id_class((rpL_2)xu_3.Ju)).id_class(consumer);
        UB.id_class(xu_3.Jq, 6).id_class(Character.valueOf('#'), xu_3.JF).id_class("###").id_class("has_polished_blackstone", De_1.id_class((rpL_2)xu_3.JF)).id_class(consumer);
        UB.id_class(xu_3.JC, 6).id_class(Character.valueOf('#'), xu_3.JL).id_class("###").id_class("has_polished_blackstone_bricks", De_1.id_class((rpL_2)xu_3.JL)).id_class(consumer);
        UB.id_class(xu_3.JF, 4).id_class(Character.valueOf('S'), xu_3.Ju).id_class("SS").id_class("SS").id_class("has_blackstone", De_1.id_class((rpL_2)xu_3.Ju)).id_class(consumer);
        UB.id_class(xu_3.JL, 4).id_class(Character.valueOf('#'), xu_3.JF).id_class("##").id_class("##").id_class("has_polished_blackstone", De_1.id_class((rpL_2)xu_3.JF)).id_class(consumer);
        UB.id_class(xu_3.Jn).id_class(Character.valueOf('#'), xu_3.Jq).id_class("#").id_class("#").id_class("has_polished_blackstone", De_1.id_class((rpL_2)xu_3.JF)).id_class(consumer);
        UB.id_class(xu_3.JZ, 6).id_class(Character.valueOf('#'), xu_3.Ju).id_class("###").id_class("###").id_class("has_blackstone", De_1.id_class((rpL_2)xu_3.Ju)).id_class(consumer);
        UB.id_class(xu_3.Jw, 6).id_class(Character.valueOf('#'), xu_3.JF).id_class("###").id_class("###").id_class("has_polished_blackstone", De_1.id_class((rpL_2)xu_3.JF)).id_class(consumer);
        UB.id_class(xu_3.JH, 6).id_class(Character.valueOf('#'), xu_3.JL).id_class("###").id_class("###").id_class("has_polished_blackstone_bricks", De_1.id_class((rpL_2)xu_3.JL)).id_class(consumer);
        Us_1.id_class(xu_3.Jt).id_break(xu_3.JF).id_class("has_polished_blackstone", De_1.id_class((rpL_2)xu_3.JF)).id_class(consumer);
        UB.id_class(xu_3.JT).id_class(Character.valueOf('#'), xu_3.JF).id_class("##").id_class("has_polished_blackstone", De_1.id_class((rpL_2)xu_3.JF)).id_class(consumer);
        UB.id_class(xu_3.Bj).id_class(Character.valueOf('I'), rdy_3.Ox).id_class(Character.valueOf('N'), rdy_3.kn).id_class("N").id_class("I").id_class("N").id_class("has_iron_nugget", De_1.id_class(rdy_3.kn)).id_class("has_iron_ingot", De_1.id_class(rdy_3.Ox)).id_class(consumer);
        DF.id_class(rkf_3.id_byte).id_class(consumer, "armor_dye");
        DF.id_class(rkf_3.id_extends).id_class(consumer, "banner_duplicate");
        DF.id_class(rkf_3.id_protected).id_class(consumer, "book_cloning");
        DF.id_class(rkf_3.id_catch).id_class(consumer, "firework_rocket");
        DF.id_class(rkf_3.id_private).id_class(consumer, "firework_star");
        DF.id_class(rkf_3.id_implements).id_class(consumer, "firework_star_fade");
        DF.id_class(rkf_3.id_throws).id_class(consumer, "map_cloning");
        DF.id_class(rkf_3.id_case).id_class(consumer, "map_extending");
        DF.id_class(rkf_3.id_package).id_class(consumer, "repair_item");
        DF.id_class(rkf_3.id_native).id_class(consumer, "shield_decoration");
        DF.id_class(rkf_3.id_volatile).id_class(consumer, "shulker_box_coloring");
        DF.id_class(rkf_3.id_finally).id_class(consumer, "tipped_arrow");
        DF.id_class(rkf_3.id_final).id_class(consumer, "suspicious_stew");
        DZ.id_break(rkg_3.id_class(rdy_3.dE), rdy_3.dG, 0.35f, 200).id_class("has_potato", De_1.id_class(rdy_3.dE)).id_class(consumer);
        DZ.id_break(rkg_3.id_class(rdy_3.XE), rdy_3.Xs, 0.3f, 200).id_class("has_clay_ball", De_1.id_class(rdy_3.XE)).id_class(consumer);
        DZ.id_break(rkg_3.id_class(rlc_3.id_int), rdy_3.OX, 0.15f, 200).id_class("has_log", De_1.id_class(rlc_3.id_int)).id_class(consumer);
        DZ.id_break(rkg_3.id_class(rdy_3.kO), rdy_3.kh, 0.1f, 200).id_class("has_chorus_fruit", De_1.id_class(rdy_3.kO)).id_class(consumer);
        DZ.id_break(rkg_3.id_class(xu_3.id_float.id_case()), rdy_3.Oh, 0.1f, 200).id_class("has_coal_ore", De_1.id_class((rpL_2)xu_3.id_float)).id_class(consumer, "coal_from_smelting");
        DZ.id_break(rkg_3.id_class(rdy_3.Jz), rdy_3.JQ, 0.35f, 200).id_class("has_beef", De_1.id_class(rdy_3.Jz)).id_class(consumer);
        DZ.id_break(rkg_3.id_class(rdy_3.JN), rdy_3.Jc, 0.35f, 200).id_class("has_chicken", De_1.id_class(rdy_3.JN)).id_class(consumer);
        DZ.id_break(rkg_3.id_class(rdy_3.Xz), rdy_3.Xu, 0.35f, 200).id_class("has_cod", De_1.id_class(rdy_3.Xz)).id_class(consumer);
        DZ.id_break(rkg_3.id_class(xu_3.OM), rdy_3.Jd, 0.1f, 200).id_class("has_kelp", De_1.id_class((rpL_2)xu_3.OM)).id_class(consumer, "dried_kelp_from_smelting");
        DZ.id_break(rkg_3.id_class(rdy_3.XQ), rdy_3.Xm, 0.35f, 200).id_class("has_salmon", De_1.id_class(rdy_3.XQ)).id_class(consumer);
        DZ.id_break(rkg_3.id_class(rdy_3.dg), rdy_3.dR, 0.35f, 200).id_class("has_mutton", De_1.id_class(rdy_3.dg)).id_class(consumer);
        DZ.id_break(rkg_3.id_class(rdy_3.hC), rdy_3.hl, 0.35f, 200).id_class("has_porkchop", De_1.id_class(rdy_3.hC)).id_class(consumer);
        DZ.id_break(rkg_3.id_class(rdy_3.dC), rdy_3.dl, 0.35f, 200).id_class("has_rabbit", De_1.id_class(rdy_3.dC)).id_class(consumer);
        DZ.id_break(rkg_3.id_class(xu_3.ri.id_case()), rdy_3.OJ, 1.0f, 200).id_class("has_diamond_ore", De_1.id_class((rpL_2)xu_3.ri)).id_class(consumer, "diamond_from_smelting");
        DZ.id_break(rkg_3.id_class(xu_3.m.id_case()), rdy_3.XF, 0.2f, 200).id_class("has_lapis_ore", De_1.id_class((rpL_2)xu_3.m)).id_class(consumer, "lapis_from_smelting");
        DZ.id_break(rkg_3.id_class(xu_3.Sk.id_case()), rdy_3.dP, 1.0f, 200).id_class("has_emerald_ore", De_1.id_class((rpL_2)xu_3.Sk)).id_class(consumer, "emerald_from_smelting");
        DZ.id_break(rkg_3.id_class(rlc_3.id_try), xu_3.u.id_case(), 0.1f, 200).id_class("has_sand", De_1.id_class(rlc_3.id_try)).id_class(consumer);
        DZ.id_break(rkg_3.id_class(rlc_3.id_boolean), rdy_3.Od, 1.0f, 200).id_class("has_gold_ore", De_1.id_class(rlc_3.id_boolean)).id_class(consumer);
        DZ.id_break(rkg_3.id_class(xu_3.hr.id_case()), rdy_3.XH, 0.1f, 200).id_class("has_sea_pickle", De_1.id_class((rpL_2)xu_3.hr)).id_class(consumer, "lime_dye_from_smelting");
        DZ.id_break(rkg_3.id_class(xu_3.Pw.id_case()), rdy_3.Xf, 1.0f, 200).id_class("has_cactus", De_1.id_class((rpL_2)xu_3.Pw)).id_class(consumer);
        DZ.id_break(rkg_3.id_class(rdy_3.OC, rdy_3.On, rdy_3.Ol, rdy_3.OH, rdy_3.OA, rdy_3.hc, rdy_3.hu, rdy_3.hm, rdy_3.hZ, rdy_3.dt), rdy_3.JF, 0.1f, 200).id_class("has_golden_pickaxe", De_1.id_class(rdy_3.OC)).id_class("has_golden_shovel", De_1.id_class(rdy_3.On)).id_class("has_golden_axe", De_1.id_class(rdy_3.Ol)).id_class("has_golden_hoe", De_1.id_class(rdy_3.OH)).id_class("has_golden_sword", De_1.id_class(rdy_3.OA)).id_class("has_golden_helmet", De_1.id_class(rdy_3.hc)).id_class("has_golden_chestplate", De_1.id_class(rdy_3.hu)).id_class("has_golden_leggings", De_1.id_class(rdy_3.hm)).id_class("has_golden_boots", De_1.id_class(rdy_3.hZ)).id_class("has_golden_horse_armor", De_1.id_class(rdy_3.dt)).id_class(consumer, "gold_nugget_from_smelting");
        DZ.id_break(rkg_3.id_class(rdy_3.Oq, rdy_3.Op, rdy_3.OT, rdy_3.Ot, rdy_3.Oy, rdy_3.hJ, rdy_3.hx, rdy_3.hd, rdy_3.hk, rdy_3.dT, rdy_3.hM, rdy_3.hO, rdy_3.hh, rdy_3.hX), rdy_3.kn, 0.1f, 200).id_class("has_iron_pickaxe", De_1.id_class(rdy_3.Oq)).id_class("has_iron_shovel", De_1.id_class(rdy_3.Op)).id_class("has_iron_axe", De_1.id_class(rdy_3.OT)).id_class("has_iron_hoe", De_1.id_class(rdy_3.Ot)).id_class("has_iron_sword", De_1.id_class(rdy_3.Oy)).id_class("has_iron_helmet", De_1.id_class(rdy_3.hJ)).id_class("has_iron_chestplate", De_1.id_class(rdy_3.hx)).id_class("has_iron_leggings", De_1.id_class(rdy_3.hd)).id_class("has_iron_boots", De_1.id_class(rdy_3.hk)).id_class("has_iron_horse_armor", De_1.id_class(rdy_3.dT)).id_class("has_chainmail_helmet", De_1.id_class(rdy_3.hM)).id_class("has_chainmail_chestplate", De_1.id_class(rdy_3.hO)).id_class("has_chainmail_leggings", De_1.id_class(rdy_3.hh)).id_class("has_chainmail_boots", De_1.id_class(rdy_3.hX)).id_class(consumer, "iron_nugget_from_smelting");
        DZ.id_break(rkg_3.id_class(xu_3.id_long.id_case()), rdy_3.Ox, 0.7f, 200).id_class("has_iron_ore", De_1.id_class(xu_3.id_long.id_case())).id_class(consumer);
        DZ.id_break(rkg_3.id_class(xu_3.PI), xu_3.Ee.id_case(), 0.35f, 200).id_class("has_clay_block", De_1.id_class((rpL_2)xu_3.PI)).id_class(consumer);
        DZ.id_break(rkg_3.id_class(xu_3.PR), rdy_3.dZ, 0.1f, 200).id_class("has_netherrack", De_1.id_class((rpL_2)xu_3.PR)).id_class(consumer);
        DZ.id_break(rkg_3.id_class(xu_3.sC), rdy_3.dv, 0.2f, 200).id_class("has_nether_quartz_ore", De_1.id_class((rpL_2)xu_3.sC)).id_class(consumer);
        DZ.id_break(rkg_3.id_class(xu_3.Pl), rdy_3.hD, 0.7f, 200).id_class("has_redstone_ore", De_1.id_class((rpL_2)xu_3.Pl)).id_class(consumer, "redstone_from_smelting");
        DZ.id_break(rkg_3.id_class(xu_3.c), xu_3.N.id_case(), 0.15f, 200).id_class("has_wet_sponge", De_1.id_class((rpL_2)xu_3.c)).id_class(consumer);
        DZ.id_break(rkg_3.id_class(xu_3.id_volatile), xu_3.id_break.id_case(), 0.1f, 200).id_class("has_cobblestone", De_1.id_class((rpL_2)xu_3.id_volatile)).id_class(consumer);
        DZ.id_break(rkg_3.id_class(xu_3.id_break), xu_3.bO.id_case(), 0.1f, 200).id_class("has_stone", De_1.id_class((rpL_2)xu_3.id_break)).id_class(consumer);
        DZ.id_break(rkg_3.id_class(xu_3.F), xu_3.bh.id_case(), 0.1f, 200).id_class("has_sandstone", De_1.id_class((rpL_2)xu_3.F)).id_class(consumer);
        DZ.id_break(rkg_3.id_class(xu_3.GI), xu_3.bJ.id_case(), 0.1f, 200).id_class("has_red_sandstone", De_1.id_class((rpL_2)xu_3.GI)).id_class(consumer);
        DZ.id_break(rkg_3.id_class(xu_3.sH), xu_3.bX.id_case(), 0.1f, 200).id_class("has_quartz_block", De_1.id_class((rpL_2)xu_3.sH)).id_class(consumer);
        DZ.id_break(rkg_3.id_class(xu_3.BL), xu_3.Bn.id_case(), 0.1f, 200).id_class("has_stone_bricks", De_1.id_class((rpL_2)xu_3.BL)).id_class(consumer);
        DZ.id_break(rkg_3.id_class(xu_3.Er), xu_3.MA.id_case(), 0.1f, 200).id_class("has_black_terracotta", De_1.id_class((rpL_2)xu_3.Er)).id_class(consumer);
        DZ.id_break(rkg_3.id_class(xu_3.sU), xu_3.MZ.id_case(), 0.1f, 200).id_class("has_blue_terracotta", De_1.id_class((rpL_2)xu_3.sU)).id_class(consumer);
        DZ.id_break(rkg_3.id_class(xu_3.se), xu_3.Mv.id_case(), 0.1f, 200).id_class("has_brown_terracotta", De_1.id_class((rpL_2)xu_3.se)).id_class(consumer);
        DZ.id_break(rkg_3.id_class(xu_3.sK), xu_3.Mu.id_case(), 0.1f, 200).id_class("has_cyan_terracotta", De_1.id_class((rpL_2)xu_3.sK)).id_class(consumer);
        DZ.id_break(rkg_3.id_class(xu_3.sY), xu_3.MN.id_case(), 0.1f, 200).id_class("has_gray_terracotta", De_1.id_class((rpL_2)xu_3.sY)).id_class(consumer);
        DZ.id_break(rkg_3.id_class(xu_3.sa), xu_3.MF.id_case(), 0.1f, 200).id_class("has_green_terracotta", De_1.id_class((rpL_2)xu_3.sa)).id_class(consumer);
        DZ.id_break(rkg_3.id_class(xu_3.sj), xu_3.Mk.id_case(), 0.1f, 200).id_class("has_light_blue_terracotta", De_1.id_class((rpL_2)xu_3.sj)).id_class(consumer);
        DZ.id_break(rkg_3.id_class(xu_3.so), xu_3.Mc.id_case(), 0.1f, 200).id_class("has_light_gray_terracotta", De_1.id_class((rpL_2)xu_3.so)).id_class(consumer);
        DZ.id_break(rkg_3.id_class(xu_3.sg), xu_3.Mz.id_case(), 0.1f, 200).id_class("has_lime_terracotta", De_1.id_class((rpL_2)xu_3.sg)).id_class(consumer);
        DZ.id_break(rkg_3.id_class(xu_3.sf), xu_3.Md.id_case(), 0.1f, 200).id_class("has_magenta_terracotta", De_1.id_class((rpL_2)xu_3.sf)).id_class(consumer);
        DZ.id_break(rkg_3.id_class(xu_3.sI), xu_3.Mx.id_case(), 0.1f, 200).id_class("has_orange_terracotta", De_1.id_class((rpL_2)xu_3.sI)).id_class(consumer);
        DZ.id_break(rkg_3.id_class(xu_3.sR), xu_3.MQ.id_case(), 0.1f, 200).id_class("has_pink_terracotta", De_1.id_class((rpL_2)xu_3.sR)).id_class(consumer);
        DZ.id_break(rkg_3.id_class(xu_3.sD), xu_3.Mm.id_case(), 0.1f, 200).id_class("has_purple_terracotta", De_1.id_class((rpL_2)xu_3.sD)).id_class(consumer);
        DZ.id_break(rkg_3.id_class(xu_3.si), xu_3.ML.id_case(), 0.1f, 200).id_class("has_red_terracotta", De_1.id_class((rpL_2)xu_3.si)).id_class(consumer);
        DZ.id_break(rkg_3.id_class(xu_3.sw), xu_3.MJ.id_case(), 0.1f, 200).id_class("has_white_terracotta", De_1.id_class((rpL_2)xu_3.sw)).id_class(consumer);
        DZ.id_break(rkg_3.id_class(xu_3.sV), xu_3.MW.id_case(), 0.1f, 200).id_class("has_yellow_terracotta", De_1.id_class((rpL_2)xu_3.sV)).id_class(consumer);
        DZ.id_break(rkg_3.id_class(xu_3.Jx), rdy_3.OW, 2.0f, 200).id_class("has_ancient_debris", De_1.id_class((rpL_2)xu_3.Jx)).id_class(consumer);
        DZ.id_break(rkg_3.id_class(xu_3.JL), xu_3.JA.id_case(), 0.1f, 200).id_class("has_blackstone_bricks", De_1.id_class((rpL_2)xu_3.JL)).id_class(consumer);
        DZ.id_break(rkg_3.id_class(xu_3.SP), xu_3.Jf.id_case(), 0.1f, 200).id_class("has_nether_bricks", De_1.id_class((rpL_2)xu_3.SP)).id_class(consumer);
        DZ.id_class(rkg_3.id_class(xu_3.id_long.id_case()), rdy_3.Ox, 0.7f, 100).id_class("has_iron_ore", De_1.id_class(xu_3.id_long.id_case())).id_class(consumer, "iron_ingot_from_blasting");
        DZ.id_class(rkg_3.id_class(rlc_3.id_boolean), rdy_3.Od, 1.0f, 100).id_class("has_gold_ore", De_1.id_class(rlc_3.id_boolean)).id_class(consumer, "gold_ingot_from_blasting");
        DZ.id_class(rkg_3.id_class(xu_3.ri.id_case()), rdy_3.OJ, 1.0f, 100).id_class("has_diamond_ore", De_1.id_class((rpL_2)xu_3.ri)).id_class(consumer, "diamond_from_blasting");
        DZ.id_class(rkg_3.id_class(xu_3.m.id_case()), rdy_3.XF, 0.2f, 100).id_class("has_lapis_ore", De_1.id_class((rpL_2)xu_3.m)).id_class(consumer, "lapis_from_blasting");
        DZ.id_class(rkg_3.id_class(xu_3.Pl), rdy_3.hD, 0.7f, 100).id_class("has_redstone_ore", De_1.id_class((rpL_2)xu_3.Pl)).id_class(consumer, "redstone_from_blasting");
        DZ.id_class(rkg_3.id_class(xu_3.id_float.id_case()), rdy_3.Oh, 0.1f, 100).id_class("has_coal_ore", De_1.id_class((rpL_2)xu_3.id_float)).id_class(consumer, "coal_from_blasting");
        DZ.id_class(rkg_3.id_class(xu_3.Sk.id_case()), rdy_3.dP, 1.0f, 100).id_class("has_emerald_ore", De_1.id_class((rpL_2)xu_3.Sk)).id_class(consumer, "emerald_from_blasting");
        DZ.id_class(rkg_3.id_class(xu_3.sC), rdy_3.dv, 0.2f, 100).id_class("has_nether_quartz_ore", De_1.id_class((rpL_2)xu_3.sC)).id_class(consumer, "quartz_from_blasting");
        DZ.id_class(rkg_3.id_class(rdy_3.OC, rdy_3.On, rdy_3.Ol, rdy_3.OH, rdy_3.OA, rdy_3.hc, rdy_3.hu, rdy_3.hm, rdy_3.hZ, rdy_3.dt), rdy_3.JF, 0.1f, 100).id_class("has_golden_pickaxe", De_1.id_class(rdy_3.OC)).id_class("has_golden_shovel", De_1.id_class(rdy_3.On)).id_class("has_golden_axe", De_1.id_class(rdy_3.Ol)).id_class("has_golden_hoe", De_1.id_class(rdy_3.OH)).id_class("has_golden_sword", De_1.id_class(rdy_3.OA)).id_class("has_golden_helmet", De_1.id_class(rdy_3.hc)).id_class("has_golden_chestplate", De_1.id_class(rdy_3.hu)).id_class("has_golden_leggings", De_1.id_class(rdy_3.hm)).id_class("has_golden_boots", De_1.id_class(rdy_3.hZ)).id_class("has_golden_horse_armor", De_1.id_class(rdy_3.dt)).id_class(consumer, "gold_nugget_from_blasting");
        DZ.id_class(rkg_3.id_class(rdy_3.Oq, rdy_3.Op, rdy_3.OT, rdy_3.Ot, rdy_3.Oy, rdy_3.hJ, rdy_3.hx, rdy_3.hd, rdy_3.hk, rdy_3.dT, rdy_3.hM, rdy_3.hO, rdy_3.hh, rdy_3.hX), rdy_3.kn, 0.1f, 100).id_class("has_iron_pickaxe", De_1.id_class(rdy_3.Oq)).id_class("has_iron_shovel", De_1.id_class(rdy_3.Op)).id_class("has_iron_axe", De_1.id_class(rdy_3.OT)).id_class("has_iron_hoe", De_1.id_class(rdy_3.Ot)).id_class("has_iron_sword", De_1.id_class(rdy_3.Oy)).id_class("has_iron_helmet", De_1.id_class(rdy_3.hJ)).id_class("has_iron_chestplate", De_1.id_class(rdy_3.hx)).id_class("has_iron_leggings", De_1.id_class(rdy_3.hd)).id_class("has_iron_boots", De_1.id_class(rdy_3.hk)).id_class("has_iron_horse_armor", De_1.id_class(rdy_3.dT)).id_class("has_chainmail_helmet", De_1.id_class(rdy_3.hM)).id_class("has_chainmail_chestplate", De_1.id_class(rdy_3.hO)).id_class("has_chainmail_leggings", De_1.id_class(rdy_3.hh)).id_class("has_chainmail_boots", De_1.id_class(rdy_3.hX)).id_class(consumer, "iron_nugget_from_blasting");
        DZ.id_class(rkg_3.id_class(xu_3.Jx), rdy_3.OW, 2.0f, 100).id_class("has_ancient_debris", De_1.id_class((rpL_2)xu_3.Jx)).id_class(consumer, "netherite_scrap_from_blasting");
        De_1.id_class(consumer, "smoking", rkf_3.id_continue, 100);
        De_1.id_class(consumer, "campfire_cooking", rkf_3.id_super, 600);
        UG.id_class(rkg_3.id_class(xu_3.id_break), xu_3.GU, 2).id_class("has_stone", De_1.id_class((rpL_2)xu_3.id_break)).id_class(consumer, "stone_slab_from_stone_stonecutting");
        UG.id_class(rkg_3.id_class(xu_3.id_break), xu_3.hk).id_class("has_stone", De_1.id_class((rpL_2)xu_3.id_break)).id_class(consumer, "stone_stairs_from_stone_stonecutting");
        UG.id_class(rkg_3.id_class(xu_3.id_break), xu_3.BL).id_class("has_stone", De_1.id_class((rpL_2)xu_3.id_break)).id_class(consumer, "stone_bricks_from_stone_stonecutting");
        UG.id_class(rkg_3.id_class(xu_3.id_break), xu_3.bS, 2).id_class("has_stone", De_1.id_class((rpL_2)xu_3.id_break)).id_class(consumer, "stone_brick_slab_from_stone_stonecutting");
        UG.id_class(rkg_3.id_class(xu_3.id_break), xu_3.Ba).id_class("has_stone", De_1.id_class((rpL_2)xu_3.id_break)).id_class(consumer, "stone_brick_stairs_from_stone_stonecutting");
        UG.id_class(rkg_3.id_class(xu_3.id_break), xu_3.BC).id_class("has_stone", De_1.id_class((rpL_2)xu_3.id_break)).id_class(consumer, "chiseled_stone_bricks_stone_from_stonecutting");
        UG.id_class(rkg_3.id_class(xu_3.id_break), xu_3.hV).id_class("has_stone", De_1.id_class((rpL_2)xu_3.id_break)).id_class(consumer, "stone_brick_walls_from_stone_stonecutting");
        UG.id_class(rkg_3.id_class(xu_3.F), xu_3.A).id_class("has_sandstone", De_1.id_class((rpL_2)xu_3.F)).id_class(consumer, "cut_sandstone_from_sandstone_stonecutting");
        UG.id_class(rkg_3.id_class(xu_3.F), xu_3.Ga, 2).id_class("has_sandstone", De_1.id_class((rpL_2)xu_3.F)).id_class(consumer, "sandstone_slab_from_sandstone_stonecutting");
        UG.id_class(rkg_3.id_class(xu_3.F), xu_3.Gi, 2).id_class("has_sandstone", De_1.id_class((rpL_2)xu_3.F)).id_class(consumer, "cut_sandstone_slab_from_sandstone_stonecutting");
        UG.id_class(rkg_3.id_class(xu_3.A), xu_3.Gi, 2).id_class("has_cut_sandstone", De_1.id_class((rpL_2)xu_3.F)).id_class(consumer, "cut_sandstone_slab_from_cut_sandstone_stonecutting");
        UG.id_class(rkg_3.id_class(xu_3.F), xu_3.Sd).id_class("has_sandstone", De_1.id_class((rpL_2)xu_3.F)).id_class(consumer, "sandstone_stairs_from_sandstone_stonecutting");
        UG.id_class(rkg_3.id_class(xu_3.F), xu_3.ho).id_class("has_sandstone", De_1.id_class((rpL_2)xu_3.F)).id_class(consumer, "sandstone_wall_from_sandstone_stonecutting");
        UG.id_class(rkg_3.id_class(xu_3.F), xu_3.L).id_class("has_sandstone", De_1.id_class((rpL_2)xu_3.F)).id_class(consumer, "chiseled_sandstone_from_sandstone_stonecutting");
        UG.id_class(rkg_3.id_class(xu_3.GI), xu_3.Gj).id_class("has_red_sandstone", De_1.id_class((rpL_2)xu_3.GI)).id_class(consumer, "cut_red_sandstone_from_red_sandstone_stonecutting");
        UG.id_class(rkg_3.id_class(xu_3.GI), xu_3.bG, 2).id_class("has_red_sandstone", De_1.id_class((rpL_2)xu_3.GI)).id_class(consumer, "red_sandstone_slab_from_red_sandstone_stonecutting");
        UG.id_class(rkg_3.id_class(xu_3.GI), xu_3.bb, 2).id_class("has_red_sandstone", De_1.id_class((rpL_2)xu_3.GI)).id_class(consumer, "cut_red_sandstone_slab_from_red_sandstone_stonecutting");
        UG.id_class(rkg_3.id_class(xu_3.Gj), xu_3.bb, 2).id_class("has_cut_red_sandstone", De_1.id_class((rpL_2)xu_3.GI)).id_class(consumer, "cut_red_sandstone_slab_from_cut_red_sandstone_stonecutting");
        UG.id_class(rkg_3.id_class(xu_3.GI), xu_3.GV).id_class("has_red_sandstone", De_1.id_class((rpL_2)xu_3.GI)).id_class(consumer, "red_sandstone_stairs_from_red_sandstone_stonecutting");
        UG.id_class(rkg_3.id_class(xu_3.GI), xu_3.hI).id_class("has_red_sandstone", De_1.id_class((rpL_2)xu_3.GI)).id_class(consumer, "red_sandstone_wall_from_red_sandstone_stonecutting");
        UG.id_class(rkg_3.id_class(xu_3.GI), xu_3.Gf).id_class("has_red_sandstone", De_1.id_class((rpL_2)xu_3.GI)).id_class(consumer, "chiseled_red_sandstone_from_red_sandstone_stonecutting");
        UG.id_class(rkg_3.id_class(xu_3.sH), xu_3.bE, 2).id_class("has_quartz_block", De_1.id_class((rpL_2)xu_3.sH)).id_class(consumer, "quartz_slab_from_stonecutting");
        UG.id_class(rkg_3.id_class(xu_3.sH), xu_3.sq).id_class("has_quartz_block", De_1.id_class((rpL_2)xu_3.sH)).id_class(consumer, "quartz_stairs_from_quartz_block_stonecutting");
        UG.id_class(rkg_3.id_class(xu_3.sH), xu_3.sp).id_class("has_quartz_block", De_1.id_class((rpL_2)xu_3.sH)).id_class(consumer, "quartz_pillar_from_quartz_block_stonecutting");
        UG.id_class(rkg_3.id_class(xu_3.sH), xu_3.sy).id_class("has_quartz_block", De_1.id_class((rpL_2)xu_3.sH)).id_class(consumer, "chiseled_quartz_block_from_quartz_block_stonecutting");
        UG.id_class(rkg_3.id_class(xu_3.sH), xu_3.Jj).id_class("has_quartz_block", De_1.id_class((rpL_2)xu_3.sH)).id_class(consumer, "quartz_bricks_from_quartz_block_stonecutting");
        UG.id_class(rkg_3.id_class(xu_3.id_volatile), xu_3.Pd).id_class("has_cobblestone", De_1.id_class((rpL_2)xu_3.id_volatile)).id_class(consumer, "cobblestone_stairs_from_cobblestone_stonecutting");
        UG.id_class(rkg_3.id_class(xu_3.id_volatile), xu_3.bP, 2).id_class("has_cobblestone", De_1.id_class((rpL_2)xu_3.id_volatile)).id_class(consumer, "cobblestone_slab_from_cobblestone_stonecutting");
        UG.id_class(rkg_3.id_class(xu_3.id_volatile), xu_3.SF).id_class("has_cobblestone", De_1.id_class((rpL_2)xu_3.id_volatile)).id_class(consumer, "cobblestone_wall_from_cobblestone_stonecutting");
        UG.id_class(rkg_3.id_class(xu_3.BL), xu_3.bS, 2).id_class("has_stone_bricks", De_1.id_class((rpL_2)xu_3.BL)).id_class(consumer, "stone_brick_slab_from_stone_bricks_stonecutting");
        UG.id_class(rkg_3.id_class(xu_3.BL), xu_3.Ba).id_class("has_stone_bricks", De_1.id_class((rpL_2)xu_3.BL)).id_class(consumer, "stone_brick_stairs_from_stone_bricks_stonecutting");
        UG.id_class(rkg_3.id_class(xu_3.BL), xu_3.hV).id_class("has_stone_bricks", De_1.id_class((rpL_2)xu_3.BL)).id_class(consumer, "stone_brick_wall_from_stone_bricks_stonecutting");
        UG.id_class(rkg_3.id_class(xu_3.BL), xu_3.BC).id_class("has_stone_bricks", De_1.id_class((rpL_2)xu_3.BL)).id_class(consumer, "chiseled_stone_bricks_from_stone_bricks_stonecutting");
        UG.id_class(rkg_3.id_class(xu_3.rI), xu_3.bB, 2).id_class("has_bricks", De_1.id_class((rpL_2)xu_3.rI)).id_class(consumer, "brick_slab_from_bricks_stonecutting");
        UG.id_class(rkg_3.id_class(xu_3.rI), xu_3.Be).id_class("has_bricks", De_1.id_class((rpL_2)xu_3.rI)).id_class(consumer, "brick_stairs_from_bricks_stonecutting");
        UG.id_class(rkg_3.id_class(xu_3.rI), xu_3.ht).id_class("has_bricks", De_1.id_class((rpL_2)xu_3.rI)).id_class(consumer, "brick_wall_from_bricks_stonecutting");
        UG.id_class(rkg_3.id_class(xu_3.SP), xu_3.bs, 2).id_class("has_nether_bricks", De_1.id_class((rpL_2)xu_3.SP)).id_class(consumer, "nether_brick_slab_from_nether_bricks_stonecutting");
        UG.id_class(rkg_3.id_class(xu_3.SP), xu_3.SS).id_class("has_nether_bricks", De_1.id_class((rpL_2)xu_3.SP)).id_class(consumer, "nether_brick_stairs_from_nether_bricks_stonecutting");
        UG.id_class(rkg_3.id_class(xu_3.SP), xu_3.hg).id_class("has_nether_bricks", De_1.id_class((rpL_2)xu_3.SP)).id_class(consumer, "nether_brick_wall_from_nether_bricks_stonecutting");
        UG.id_class(rkg_3.id_class(xu_3.SP), xu_3.JI).id_class("has_nether_bricks", De_1.id_class((rpL_2)xu_3.SP)).id_class(consumer, "chiseled_nether_bricks_from_nether_bricks_stonecutting");
        UG.id_class(rkg_3.id_class(xu_3.bR), xu_3.hp, 2).id_class("has_nether_bricks", De_1.id_class((rpL_2)xu_3.bR)).id_class(consumer, "red_nether_brick_slab_from_red_nether_bricks_stonecutting");
        UG.id_class(rkg_3.id_class(xu_3.bR), xu_3.hc).id_class("has_nether_bricks", De_1.id_class((rpL_2)xu_3.bR)).id_class(consumer, "red_nether_brick_stairs_from_red_nether_bricks_stonecutting");
        UG.id_class(rkg_3.id_class(xu_3.bR), xu_3.hY).id_class("has_nether_bricks", De_1.id_class((rpL_2)xu_3.bR)).id_class(consumer, "red_nether_brick_wall_from_red_nether_bricks_stonecutting");
        UG.id_class(rkg_3.id_class(xu_3.bH), xu_3.bM, 2).id_class("has_purpur_block", De_1.id_class((rpL_2)xu_3.bH)).id_class(consumer, "purpur_slab_from_purpur_block_stonecutting");
        UG.id_class(rkg_3.id_class(xu_3.bH), xu_3.bp).id_class("has_purpur_block", De_1.id_class((rpL_2)xu_3.bH)).id_class(consumer, "purpur_stairs_from_purpur_block_stonecutting");
        UG.id_class(rkg_3.id_class(xu_3.bH), xu_3.by).id_class("has_purpur_block", De_1.id_class((rpL_2)xu_3.bH)).id_class(consumer, "purpur_pillar_from_purpur_block_stonecutting");
        UG.id_class(rkg_3.id_class(xu_3.Em), xu_3.En, 2).id_class("has_prismarine", De_1.id_class((rpL_2)xu_3.Em)).id_class(consumer, "prismarine_slab_from_prismarine_stonecutting");
        UG.id_class(rkg_3.id_class(xu_3.Em), xu_3.EF).id_class("has_prismarine", De_1.id_class((rpL_2)xu_3.Em)).id_class(consumer, "prismarine_stairs_from_prismarine_stonecutting");
        UG.id_class(rkg_3.id_class(xu_3.Em), xu_3.hw).id_class("has_prismarine", De_1.id_class((rpL_2)xu_3.Em)).id_class(consumer, "prismarine_wall_from_prismarine_stonecutting");
        UG.id_class(rkg_3.id_class(xu_3.EZ), xu_3.EC, 2).id_class("has_prismarine_brick", De_1.id_class((rpL_2)xu_3.EZ)).id_class(consumer, "prismarine_brick_slab_from_prismarine_stonecutting");
        UG.id_class(rkg_3.id_class(xu_3.EZ), xu_3.EL).id_class("has_prismarine_brick", De_1.id_class((rpL_2)xu_3.EZ)).id_class(consumer, "prismarine_brick_stairs_from_prismarine_stonecutting");
        UG.id_class(rkg_3.id_class(xu_3.Ev), xu_3.El, 2).id_class("has_dark_prismarine", De_1.id_class((rpL_2)xu_3.Ev)).id_class(consumer, "dark_prismarine_slab_from_dark_prismarine_stonecutting");
        UG.id_class(rkg_3.id_class(xu_3.Ev), xu_3.EA).id_class("has_dark_prismarine", De_1.id_class((rpL_2)xu_3.Ev)).id_class(consumer, "dark_prismarine_stairs_from_dark_prismarine_stonecutting");
        UG.id_class(rkg_3.id_class(xu_3.id_catch), xu_3.hy, 2).id_class("has_andesite", De_1.id_class((rpL_2)xu_3.id_catch)).id_class(consumer, "andesite_slab_from_andesite_stonecutting");
        UG.id_class(rkg_3.id_class(xu_3.id_catch), xu_3.hN).id_class("has_andesite", De_1.id_class((rpL_2)xu_3.id_catch)).id_class(consumer, "andesite_stairs_from_andesite_stonecutting");
        UG.id_class(rkg_3.id_class(xu_3.id_catch), xu_3.hR).id_class("has_andesite", De_1.id_class((rpL_2)xu_3.id_catch)).id_class(consumer, "andesite_wall_from_andesite_stonecutting");
        UG.id_class(rkg_3.id_class(xu_3.id_catch), xu_3.id_private).id_class("has_andesite", De_1.id_class((rpL_2)xu_3.id_catch)).id_class(consumer, "polished_andesite_from_andesite_stonecutting");
        UG.id_class(rkg_3.id_class(xu_3.id_catch), xu_3.hq, 2).id_class("has_andesite", De_1.id_class((rpL_2)xu_3.id_catch)).id_class(consumer, "polished_andesite_slab_from_andesite_stonecutting");
        UG.id_class(rkg_3.id_class(xu_3.id_catch), xu_3.hu).id_class("has_andesite", De_1.id_class((rpL_2)xu_3.id_catch)).id_class(consumer, "polished_andesite_stairs_from_andesite_stonecutting");
        UG.id_class(rkg_3.id_class(xu_3.id_private), xu_3.hq, 2).id_class("has_polished_andesite", De_1.id_class((rpL_2)xu_3.id_private)).id_class(consumer, "polished_andesite_slab_from_polished_andesite_stonecutting");
        UG.id_class(rkg_3.id_class(xu_3.id_private), xu_3.hu).id_class("has_polished_andesite", De_1.id_class((rpL_2)xu_3.id_private)).id_class(consumer, "polished_andesite_stairs_from_polished_andesite_stonecutting");
        UG.id_class(rkg_3.id_class(xu_3.PK), xu_3.PD).id_class("has_basalt", De_1.id_class((rpL_2)xu_3.PK)).id_class(consumer, "polished_basalt_from_basalt_stonecutting");
        UG.id_class(rkg_3.id_class(xu_3.id_byte), xu_3.hH, 2).id_class("has_granite", De_1.id_class((rpL_2)xu_3.id_byte)).id_class(consumer, "granite_slab_from_granite_stonecutting");
        UG.id_class(rkg_3.id_class(xu_3.id_byte), xu_3.hQ).id_class("has_granite", De_1.id_class((rpL_2)xu_3.id_byte)).id_class(consumer, "granite_stairs_from_granite_stonecutting");
        UG.id_class(rkg_3.id_class(xu_3.id_byte), xu_3.hj).id_class("has_granite", De_1.id_class((rpL_2)xu_3.id_byte)).id_class(consumer, "granite_wall_from_granite_stonecutting");
        UG.id_class(rkg_3.id_class(xu_3.id_byte), xu_3.id_protected).id_class("has_granite", De_1.id_class((rpL_2)xu_3.id_byte)).id_class(consumer, "polished_granite_from_granite_stonecutting");
        UG.id_class(rkg_3.id_class(xu_3.id_byte), xu_3.hZ, 2).id_class("has_granite", De_1.id_class((rpL_2)xu_3.id_byte)).id_class(consumer, "polished_granite_slab_from_granite_stonecutting");
        UG.id_class(rkg_3.id_class(xu_3.id_byte), xu_3.hO).id_class("has_granite", De_1.id_class((rpL_2)xu_3.id_byte)).id_class(consumer, "polished_granite_stairs_from_granite_stonecutting");
        UG.id_class(rkg_3.id_class(xu_3.id_protected), xu_3.hZ, 2).id_class("has_polished_granite", De_1.id_class((rpL_2)xu_3.id_protected)).id_class(consumer, "polished_granite_slab_from_polished_granite_stonecutting");
        UG.id_class(rkg_3.id_class(xu_3.id_protected), xu_3.hO).id_class("has_polished_granite", De_1.id_class((rpL_2)xu_3.id_protected)).id_class(consumer, "polished_granite_stairs_from_polished_granite_stonecutting");
        UG.id_class(rkg_3.id_class(xu_3.id_throws), xu_3.hT, 2).id_class("has_diorite", De_1.id_class((rpL_2)xu_3.id_throws)).id_class(consumer, "diorite_slab_from_diorite_stonecutting");
        UG.id_class(rkg_3.id_class(xu_3.id_throws), xu_3.hm).id_class("has_diorite", De_1.id_class((rpL_2)xu_3.id_throws)).id_class(consumer, "diorite_stairs_from_diorite_stonecutting");
        UG.id_class(rkg_3.id_class(xu_3.id_throws), xu_3.hD).id_class("has_diorite", De_1.id_class((rpL_2)xu_3.id_throws)).id_class(consumer, "diorite_wall_from_diorite_stonecutting");
        UG.id_class(rkg_3.id_class(xu_3.id_throws), xu_3.id_case).id_class("has_diorite", De_1.id_class((rpL_2)xu_3.id_throws)).id_class(consumer, "polished_diorite_from_diorite_stonecutting");
        UG.id_class(rkg_3.id_class(xu_3.id_throws), xu_3.hL, 2).id_class("has_diorite", De_1.id_class((rpL_2)xu_3.id_case)).id_class(consumer, "polished_diorite_slab_from_diorite_stonecutting");
        UG.id_class(rkg_3.id_class(xu_3.id_throws), xu_3.hJ).id_class("has_diorite", De_1.id_class((rpL_2)xu_3.id_case)).id_class(consumer, "polished_diorite_stairs_from_diorite_stonecutting");
        UG.id_class(rkg_3.id_class(xu_3.id_case), xu_3.hL, 2).id_class("has_polished_diorite", De_1.id_class((rpL_2)xu_3.id_case)).id_class(consumer, "polished_diorite_slab_from_polished_diorite_stonecutting");
        UG.id_class(rkg_3.id_class(xu_3.id_case), xu_3.hJ).id_class("has_polished_diorite", De_1.id_class((rpL_2)xu_3.id_case)).id_class(consumer, "polished_diorite_stairs_from_polished_diorite_stonecutting");
        UG.id_class(rkg_3.id_class(xu_3.BA), xu_3.hF, 2).id_class("has_mossy_stone_bricks", De_1.id_class((rpL_2)xu_3.BA)).id_class(consumer, "mossy_stone_brick_slab_from_mossy_stone_brick_stonecutting");
        UG.id_class(rkg_3.id_class(xu_3.BA), xu_3.hX).id_class("has_mossy_stone_bricks", De_1.id_class((rpL_2)xu_3.BA)).id_class(consumer, "mossy_stone_brick_stairs_from_mossy_stone_brick_stonecutting");
        UG.id_class(rkg_3.id_class(xu_3.BA), xu_3.hf).id_class("has_mossy_stone_bricks", De_1.id_class((rpL_2)xu_3.BA)).id_class(consumer, "mossy_stone_brick_wall_from_mossy_stone_brick_stonecutting");
        UG.id_class(rkg_3.id_class(xu_3.rV), xu_3.hA, 2).id_class("has_mossy_cobblestone", De_1.id_class((rpL_2)xu_3.rV)).id_class(consumer, "mossy_cobblestone_slab_from_mossy_cobblestone_stonecutting");
        UG.id_class(rkg_3.id_class(xu_3.rV), xu_3.hx).id_class("has_mossy_cobblestone", De_1.id_class((rpL_2)xu_3.rV)).id_class(consumer, "mossy_cobblestone_stairs_from_mossy_cobblestone_stonecutting");
        UG.id_class(rkg_3.id_class(xu_3.rV), xu_3.SL).id_class("has_mossy_cobblestone", De_1.id_class((rpL_2)xu_3.rV)).id_class(consumer, "mossy_cobblestone_wall_from_mossy_cobblestone_stonecutting");
        UG.id_class(rkg_3.id_class(xu_3.bh), xu_3.hC, 2).id_class("has_smooth_sandstone", De_1.id_class((rpL_2)xu_3.bh)).id_class(consumer, "smooth_sandstone_slab_from_smooth_sandstone_stonecutting");
        UG.id_class(rkg_3.id_class(xu_3.bh), xu_3.hW).id_class("has_mossy_cobblestone", De_1.id_class((rpL_2)xu_3.bh)).id_class(consumer, "smooth_sandstone_stairs_from_smooth_sandstone_stonecutting");
        UG.id_class(rkg_3.id_class(xu_3.bJ), xu_3.hv, 2).id_class("has_smooth_red_sandstone", De_1.id_class((rpL_2)xu_3.bJ)).id_class(consumer, "smooth_red_sandstone_slab_from_smooth_red_sandstone_stonecutting");
        UG.id_class(rkg_3.id_class(xu_3.bJ), xu_3.hh).id_class("has_smooth_red_sandstone", De_1.id_class((rpL_2)xu_3.bJ)).id_class(consumer, "smooth_red_sandstone_stairs_from_smooth_red_sandstone_stonecutting");
        UG.id_class(rkg_3.id_class(xu_3.bX), xu_3.hl, 2).id_class("has_smooth_quartz", De_1.id_class((rpL_2)xu_3.bX)).id_class(consumer, "smooth_quartz_slab_from_smooth_quartz_stonecutting");
        UG.id_class(rkg_3.id_class(xu_3.bX), xu_3.hz).id_class("has_smooth_quartz", De_1.id_class((rpL_2)xu_3.bX)).id_class(consumer, "smooth_quartz_stairs_from_smooth_quartz_stonecutting");
        UG.id_class(rkg_3.id_class(xu_3.bq), xu_3.hn, 2).id_class("has_end_stone_brick", De_1.id_class((rpL_2)xu_3.bq)).id_class(consumer, "end_stone_brick_slab_from_end_stone_brick_stonecutting");
        UG.id_class(rkg_3.id_class(xu_3.bq), xu_3.hd).id_class("has_end_stone_brick", De_1.id_class((rpL_2)xu_3.bq)).id_class(consumer, "end_stone_brick_stairs_from_end_stone_brick_stonecutting");
        UG.id_class(rkg_3.id_class(xu_3.bq), xu_3.hK).id_class("has_end_stone_brick", De_1.id_class((rpL_2)xu_3.bq)).id_class(consumer, "end_stone_brick_wall_from_end_stone_brick_stonecutting");
        UG.id_class(rkg_3.id_class(xu_3.Sh), xu_3.bq).id_class("has_end_stone", De_1.id_class((rpL_2)xu_3.Sh)).id_class(consumer, "end_stone_bricks_from_end_stone_stonecutting");
        UG.id_class(rkg_3.id_class(xu_3.Sh), xu_3.hn, 2).id_class("has_end_stone", De_1.id_class((rpL_2)xu_3.Sh)).id_class(consumer, "end_stone_brick_slab_from_end_stone_stonecutting");
        UG.id_class(rkg_3.id_class(xu_3.Sh), xu_3.hd).id_class("has_end_stone", De_1.id_class((rpL_2)xu_3.Sh)).id_class(consumer, "end_stone_brick_stairs_from_end_stone_stonecutting");
        UG.id_class(rkg_3.id_class(xu_3.Sh), xu_3.hK).id_class("has_end_stone", De_1.id_class((rpL_2)xu_3.Sh)).id_class(consumer, "end_stone_brick_wall_from_end_stone_stonecutting");
        UG.id_class(rkg_3.id_class(xu_3.bO), xu_3.Ge, 2).id_class("has_smooth_stone", De_1.id_class((rpL_2)xu_3.bO)).id_class(consumer, "smooth_stone_slab_from_smooth_stone_stonecutting");
        UG.id_class(rkg_3.id_class(xu_3.Ju), xu_3.Jv, 2).id_class("has_blackstone", De_1.id_class((rpL_2)xu_3.Ju)).id_class(consumer, "blackstone_slab_from_blackstone_stonecutting");
        UG.id_class(rkg_3.id_class(xu_3.Ju), xu_3.Jm).id_class("has_blackstone", De_1.id_class((rpL_2)xu_3.Ju)).id_class(consumer, "blackstone_stairs_from_blackstone_stonecutting");
        UG.id_class(rkg_3.id_class(xu_3.Ju), xu_3.JZ).id_class("has_blackstone", De_1.id_class((rpL_2)xu_3.Ju)).id_class(consumer, "blackstone_wall_from_blackstone_stonecutting");
        UG.id_class(rkg_3.id_class(xu_3.Ju), xu_3.JF).id_class("has_blackstone", De_1.id_class((rpL_2)xu_3.Ju)).id_class(consumer, "polished_blackstone_from_blackstone_stonecutting");
        UG.id_class(rkg_3.id_class(xu_3.Ju), xu_3.Jw).id_class("has_blackstone", De_1.id_class((rpL_2)xu_3.Ju)).id_class(consumer, "polished_blackstone_wall_from_blackstone_stonecutting");
        UG.id_class(rkg_3.id_class(xu_3.Ju), xu_3.Jq, 2).id_class("has_blackstone", De_1.id_class((rpL_2)xu_3.Ju)).id_class(consumer, "polished_blackstone_slab_from_blackstone_stonecutting");
        UG.id_class(rkg_3.id_class(xu_3.Ju), xu_3.Jp).id_class("has_blackstone", De_1.id_class((rpL_2)xu_3.Ju)).id_class(consumer, "polished_blackstone_stairs_from_blackstone_stonecutting");
        UG.id_class(rkg_3.id_class(xu_3.Ju), xu_3.Jn).id_class("has_blackstone", De_1.id_class((rpL_2)xu_3.Ju)).id_class(consumer, "chiseled_polished_blackstone_from_blackstone_stonecutting");
        UG.id_class(rkg_3.id_class(xu_3.Ju), xu_3.JL).id_class("has_blackstone", De_1.id_class((rpL_2)xu_3.Ju)).id_class(consumer, "polished_blackstone_bricks_from_blackstone_stonecutting");
        UG.id_class(rkg_3.id_class(xu_3.Ju), xu_3.JC, 2).id_class("has_blackstone", De_1.id_class((rpL_2)xu_3.Ju)).id_class(consumer, "polished_blackstone_brick_slab_from_blackstone_stonecutting");
        UG.id_class(rkg_3.id_class(xu_3.Ju), xu_3.Jl).id_class("has_blackstone", De_1.id_class((rpL_2)xu_3.Ju)).id_class(consumer, "polished_blackstone_brick_stairs_from_blackstone_stonecutting");
        UG.id_class(rkg_3.id_class(xu_3.Ju), xu_3.JH).id_class("has_blackstone", De_1.id_class((rpL_2)xu_3.Ju)).id_class(consumer, "polished_blackstone_brick_wall_from_blackstone_stonecutting");
        UG.id_class(rkg_3.id_class(xu_3.JF), xu_3.Jq, 2).id_class("has_polished_blackstone", De_1.id_class((rpL_2)xu_3.JF)).id_class(consumer, "polished_blackstone_slab_from_polished_blackstone_stonecutting");
        UG.id_class(rkg_3.id_class(xu_3.JF), xu_3.Jp).id_class("has_polished_blackstone", De_1.id_class((rpL_2)xu_3.JF)).id_class(consumer, "polished_blackstone_stairs_from_polished_blackstone_stonecutting");
        UG.id_class(rkg_3.id_class(xu_3.JF), xu_3.JL).id_class("has_polished_blackstone", De_1.id_class((rpL_2)xu_3.JF)).id_class(consumer, "polished_blackstone_bricks_from_polished_blackstone_stonecutting");
        UG.id_class(rkg_3.id_class(xu_3.JF), xu_3.Jw).id_class("has_polished_blackstone", De_1.id_class((rpL_2)xu_3.JF)).id_class(consumer, "polished_blackstone_wall_from_polished_blackstone_stonecutting");
        UG.id_class(rkg_3.id_class(xu_3.JF), xu_3.JC, 2).id_class("has_polished_blackstone", De_1.id_class((rpL_2)xu_3.JF)).id_class(consumer, "polished_blackstone_brick_slab_from_polished_blackstone_stonecutting");
        UG.id_class(rkg_3.id_class(xu_3.JF), xu_3.Jl).id_class("has_polished_blackstone", De_1.id_class((rpL_2)xu_3.JF)).id_class(consumer, "polished_blackstone_brick_stairs_from_polished_blackstone_stonecutting");
        UG.id_class(rkg_3.id_class(xu_3.JF), xu_3.JH).id_class("has_polished_blackstone", De_1.id_class((rpL_2)xu_3.JF)).id_class(consumer, "polished_blackstone_brick_wall_from_polished_blackstone_stonecutting");
        UG.id_class(rkg_3.id_class(xu_3.JF), xu_3.Jn).id_class("has_polished_blackstone", De_1.id_class((rpL_2)xu_3.JF)).id_class(consumer, "chiseled_polished_blackstone_from_polished_blackstone_stonecutting");
        UG.id_class(rkg_3.id_class(xu_3.JL), xu_3.JC, 2).id_class("has_polished_blackstone_bricks", De_1.id_class((rpL_2)xu_3.JL)).id_class(consumer, "polished_blackstone_brick_slab_from_polished_blackstone_bricks_stonecutting");
        UG.id_class(rkg_3.id_class(xu_3.JL), xu_3.Jl).id_class("has_polished_blackstone_bricks", De_1.id_class((rpL_2)xu_3.JL)).id_class(consumer, "polished_blackstone_brick_stairs_from_polished_blackstone_bricks_stonecutting");
        UG.id_class(rkg_3.id_class(xu_3.JL), xu_3.JH).id_class("has_polished_blackstone_bricks", De_1.id_class((rpL_2)xu_3.JL)).id_class(consumer, "polished_blackstone_brick_wall_from_polished_blackstone_bricks_stonecutting");
        De_1.id_class(consumer, rdy_3.hz, rdy_3.hF);
        De_1.id_class(consumer, rdy_3.hQ, rdy_3.hL);
        De_1.id_class(consumer, rdy_3.hW, rdy_3.hv);
        De_1.id_class(consumer, rdy_3.hN, rdy_3.hA);
        De_1.id_class(consumer, rdy_3.Ow, rdy_3.Og);
        De_1.id_class(consumer, rdy_3.Oj, rdy_3.Oo);
        De_1.id_class(consumer, rdy_3.Of, rdy_3.OY);
        De_1.id_class(consumer, rdy_3.OV, rdy_3.OK);
        De_1.id_class(consumer, rdy_3.OI, rdy_3.OR);
    }

    private static void id_class(Consumer<Dw_1> consumer, rdb_3 rdb_32, rdb_3 rdb_33) {
        UM.id_class(rkg_3.id_class(rdb_32), rkg_3.id_class(rdy_3.Ok), rdb_33).id_class("has_netherite_ingot", De_1.id_class(rdy_3.Ok)).id_class(consumer, rVL.id_for.id_break(rdb_33.id_case()).id_break() + "_smithing");
    }

    private static void id_break(Consumer<Dw_1> consumer, rpL_2 rpL_22, rpL_2 rpL_23) {
        UB.id_class(rpL_22).id_class(Character.valueOf('#'), rpL_23).id_class("# #").id_class("###").id_break("boat").id_class("in_water", De_1.id_class(xu_3.id_try)).id_class(consumer);
    }

    private static void id_break(Dn_1 dn_1, JsonObject jsonObject, Path path) {
        try {
            String string = id_byte.toJson((JsonElement)jsonObject);
            String string2 = id_class.hashUnencodedChars((CharSequence)string).toString();
            if (!Objects.equals(dn_1.id_class(path), string2) || !Files.exists(path, new LinkOption[0])) {
                Files.createDirectories(path.getParent(), new FileAttribute[0]);
                try (BufferedWriter bufferedWriter = Files.newBufferedWriter(path, new OpenOption[0]);){
                    bufferedWriter.write(string);
                }
            }
            dn_1.id_class(path, string2);
        }
        catch (IOException iOException) {
            id_break.error("Couldn't save recipe advancement {}", (Object)path, (Object)iOException);
        }
    }

    private static void id_break(Consumer<Dw_1> consumer, rpL_2 rpL_22, rlb_3<rdb_3> rlb_32) {
        Us_1.id_class(rpL_22, 4).id_class(rlb_32).id_class("planks").id_class("has_logs", De_1.id_class(rlb_32)).id_class(consumer);
    }

    private static void id_throws(Consumer<Dw_1> consumer, rpL_2 rpL_22, rpL_2 rpL_23) {
        UB.id_class(rpL_22, 3).id_class(Character.valueOf('#'), rdy_3.OD).id_class(Character.valueOf('W'), rpL_23).id_class("W#W").id_class("W#W").id_break("wooden_fence").id_class("has_planks", De_1.id_class(rpL_23)).id_class(consumer);
    }

    private static void id_finally(Consumer<Dw_1> consumer, rpL_2 rpL_22, rpL_2 rpL_23) {
        UB.id_class(rpL_22, 2).id_class(Character.valueOf('#'), rpL_23).id_class("###").id_class("###").id_break("wooden_trapdoor").id_class("has_planks", De_1.id_class(rpL_23)).id_class(consumer);
    }

    private static void id_catch(Consumer<Dw_1> consumer, rpL_2 rpL_22, rpL_2 rpL_23) {
        UB.id_class(rpL_22).id_class(Character.valueOf('#'), rpL_23).id_class("##").id_break("wooden_pressure_plate").id_class("has_planks", De_1.id_class(rpL_23)).id_class(consumer);
    }

    private static void id_extends(Consumer<Dw_1> consumer, rpL_2 rpL_22, rpL_2 rpL_23) {
        String string = rVL.id_for.id_break(rpL_23.id_case()).id_break();
        UB.id_class(rpL_22, 3).id_break("sign").id_class(Character.valueOf('#'), rpL_23).id_class(Character.valueOf('X'), rdy_3.OD).id_class("###").id_class("###").id_class(" X ").id_class("has_" + string, De_1.id_class(rpL_23)).id_class(consumer);
    }

    private static void id_case(Consumer<Dw_1> consumer, rpL_2 rpL_22, rpL_2 rpL_23) {
        UB.id_class(rpL_22).id_class(Character.valueOf('#'), rdy_3.OD).id_class(Character.valueOf('W'), rpL_23).id_class("#W#").id_class("#W#").id_break("wooden_fence_gate").id_class("has_planks", De_1.id_class(rpL_23)).id_class(consumer);
    }

    private static void id_continue(Consumer<Dw_1> consumer, rpL_2 rpL_22, rpL_2 rpL_23) {
        UB.id_class(rpL_22, 8).id_class(Character.valueOf('#'), xu_3.u).id_class(Character.valueOf('X'), rpL_23).id_class("###").id_class("#X#").id_class("###").id_break("stained_glass").id_class("has_glass", De_1.id_class((rpL_2)xu_3.u)).id_class(consumer);
    }

    private static void id_else(Consumer<Dw_1> consumer, rpL_2 rpL_22, rpL_2 rpL_23) {
        UB.id_class(rpL_22, 8).id_class(Character.valueOf('#'), xu_3.Ee).id_class(Character.valueOf('X'), rpL_23).id_class("###").id_class("#X#").id_class("###").id_break("stained_terracotta").id_class("has_terracotta", De_1.id_class((rpL_2)xu_3.Ee)).id_class(consumer);
    }

    private static void id_implements(Consumer<Dw_1> consumer, rpL_2 rpL_22, rpL_2 rpL_23) {
        UB.id_class(rpL_22, 4).id_class(Character.valueOf('#'), rpL_23).id_class("#  ").id_class("## ").id_class("###").id_break("wooden_stairs").id_class("has_planks", De_1.id_class(rpL_23)).id_class(consumer);
    }

    private static void id_new(Consumer<Dw_1> consumer, rpL_2 rpL_22, rpL_2 rpL_23) {
        String string = rVL.id_for.id_break(rpL_23.id_case()).id_break();
        UB.id_class(rpL_22).id_class(Character.valueOf('#'), rpL_23).id_class(Character.valueOf('|'), rdy_3.OD).id_class("###").id_class("###").id_class(" | ").id_break("banner").id_class("has_" + string, De_1.id_class(rpL_23)).id_class(consumer);
    }

    private static void id_package(Consumer<Dw_1> consumer, rpL_2 rpL_22, rpL_2 rpL_23) {
        String string = rVL.id_for.id_break(rpL_23.id_case()).id_break();
        UB.id_class(rpL_22).id_class(Character.valueOf('#'), rpL_23).id_class(Character.valueOf('X'), rlc_3.id_byte).id_class("###").id_class("XXX").id_break("bed").id_class("has_" + string, De_1.id_class(rpL_23)).id_class(consumer);
    }

    private static void id_super(Consumer<Dw_1> consumer, rpL_2 rpL_22, rpL_2 rpL_23) {
        UB.id_class(rpL_22, 16).id_class(Character.valueOf('#'), rpL_23).id_class("###").id_class("###").id_break("stained_glass_pane").id_class("has_glass", De_1.id_class(rpL_23)).id_class(consumer);
    }

    private static void id_protected(Consumer<Dw_1> consumer, rpL_2 rpL_22, rpL_2 rpL_23) {
        UB.id_class(rpL_22, 3).id_class(Character.valueOf('#'), rpL_23).id_class("##").id_class("##").id_class("##").id_break("wooden_door").id_class("has_planks", De_1.id_class(rpL_23)).id_class(consumer);
    }

    private static void id_private(Consumer<Dw_1> consumer, rpL_2 rpL_22, rpL_2 rpL_23) {
        UB.id_class(rpL_22, 6).id_class(Character.valueOf('#'), rpL_23).id_class("###").id_break("wooden_slab").id_class("has_planks", De_1.id_class(rpL_23)).id_class(consumer);
    }

    private static void id_final(Consumer<Dw_1> consumer, rpL_2 rpL_22, rpL_2 rpL_23) {
        String string = rVL.id_for.id_break(rpL_22.id_case()).id_break();
        String string2 = rVL.id_for.id_break(rpL_23.id_case()).id_break();
        UB.id_class(rpL_22, 8).id_class(Character.valueOf('#'), xu_3.Ep).id_class(Character.valueOf('$'), rpL_23).id_class("###").id_class("#$#").id_class("###").id_break("carpet").id_class("has_white_carpet", De_1.id_class((rpL_2)xu_3.Ep)).id_class("has_" + string2, De_1.id_class(rpL_23)).id_class(consumer, string + "_from_white_carpet");
    }

    private static void id_volatile(Consumer<Dw_1> consumer, rpL_2 rpL_22, rpL_2 rpL_23) {
        String string = rVL.id_for.id_break(rpL_23.id_case()).id_break();
        UB.id_class(rpL_22, 3).id_class(Character.valueOf('#'), rpL_23).id_class("##").id_break("carpet").id_class("has_" + string, De_1.id_class(rpL_23)).id_class(consumer);
    }

    private static void id_synchronized(Consumer<Dw_1> consumer, rpL_2 rpL_22, rpL_2 rpL_23) {
        Us_1.id_class(rpL_22, 8).id_break(rpL_23).id_break(xu_3.id_throw, 4).id_break(xu_3.id_char, 4).id_class("concrete_powder").id_class("has_sand", De_1.id_class((rpL_2)xu_3.id_throw)).id_class("has_gravel", De_1.id_class((rpL_2)xu_3.id_char)).id_class(consumer);
    }

    private static void id_native(Consumer<Dw_1> consumer, rpL_2 rpL_22, rpL_2 rpL_23) {
        Us_1.id_class(rpL_22).id_break(rpL_23).id_break(xu_3.rs).id_class("wool").id_class("has_white_wool", De_1.id_class((rpL_2)xu_3.rs)).id_class(consumer);
    }
}

