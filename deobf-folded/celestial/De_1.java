package celestial;

import com.google.common.collect.Sets;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashSet;
import java.util.Objects;
import java.util.function.Consumer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class De_1 implements DT {
   private static final Logger id_break = LogManager.getLogger();
   private static final Gson id_byte = new GsonBuilder().setPrettyPrinting().create();
   private final DA id_protected;

   private static void id_byte(Consumer<Dw_1> var0, rpL_2 var1, rpL_2 var2) {
      Us_1.id_class(var1).id_break(var2).id_class("wooden_button").id_class("has_planks", id_class(var2)).id_class(var0);
   }

   private static void id_int(Consumer<Dw_1> var0, rpL_2 var1, rpL_2 var2) {
      String var3 = rVL.id_for.id_break(var1.id_case()).id_break();
      Us_1.id_class(var1)
         .id_break(rdy_3.XK)
         .id_break(var2)
         .id_class("dyed_bed")
         .id_class("has_bed", id_class(rdy_3.XK))
         .id_class(var0, var3 + "_from_white_bed");
   }

   public De_1(DA var1) {
      this.id_protected = var1;
   }

   private static void id_this(Consumer<Dw_1> var0, rpL_2 var1, rpL_2 var2) {
      String var3 = rVL.id_for.id_break(var1.id_case()).id_break();
      String var4 = rVL.id_for.id_break(var2.id_case()).id_break();
      UB.id_class(var1, 8)
         .id_class('#', xu_3.BV)
         .id_class('$', var2)
         .id_class("###")
         .id_class("#$#")
         .id_class("###")
         .id_break("stained_glass_pane")
         .id_class("has_glass_pane", id_class((rpL_2)xu_3.BV))
         .id_class("has_" + var4, id_class(var2))
         .id_class(var0, var3 + "_from_glass_pane");
   }

   @Override
   public String id_class() {
      return "Recipes";
   }

   @Override
   public void id_class(Dn_1 var1) throws IOException {
      Path var2 = this.id_protected.id_break();
      HashSet var3 = Sets.newHashSet();
      id_class(var3x -> {
         if (!var3.add(var3x.id_break())) {
            throw new IllegalStateException("Duplicate recipe " + var3x.id_break());
         } else {
            id_class(var1, var3x.id_throws(), var2.resolve("data/" + var3x.id_break().id_byte() + "/recipes/" + var3x.id_break().id_break() + ".json"));
            JsonObject var4 = var3x.id_byte();
            if (var4 != null) {
               id_break(var1, var4, var2.resolve("data/" + var3x.id_break().id_byte() + "/advancements/" + var3x.id_protected().id_break() + ".json"));
            }
         }
      });
      id_break(var1, Ot_1.id_class().id_class("impossible", new XE()).id_break(), var2.resolve("data/minecraft/advancements/recipes/root.json"));
   }

   private static Xb_1 id_class(rlb_3<rdb_3> var0) {
      return id_class(XX.id_class().id_class(var0).id_break());
   }

   private static void id_class(Dn_1 var0, JsonObject var1, Path var2) {
      try {
         String var3 = id_byte.toJson(var1);
         String var4 = id_class.hashUnencodedChars(var3).toString();
         if (!Objects.equals(var0.id_class(var2), var4) || !Files.exists(var2)) {
            Files.createDirectories(var2.getParent());

            try (BufferedWriter var5 = Files.newBufferedWriter(var2)) {
               var5.write(var3);
            }
         }

         var0.id_class(var2, var4);
      } catch (IOException var10) {
         id_break.error("Couldn't save recipe {}", var2, var10);
      }
   }

   private static Xb_1 id_class(rpL_2 var0) {
      return id_class(XX.id_class().id_class(var0).id_break());
   }

   private static hw_3 id_class(xd_3 var0) {
      return new hw_3(ho_3.id_class, var0, JS.id_class);
   }

   private static void id_class(Consumer<Dw_1> var0, String var1, rkl_3<?> var2, int var3) {
      DZ.id_class(rkg_3.id_class(rdy_3.Jz), rdy_3.JQ, 0.35F, var3, var2).id_class("has_beef", id_class(rdy_3.Jz)).id_class(var0, "cooked_beef_from_" + var1);
      DZ.id_class(rkg_3.id_class(rdy_3.JN), rdy_3.Jc, 0.35F, var3, var2)
         .id_class("has_chicken", id_class(rdy_3.JN))
         .id_class(var0, "cooked_chicken_from_" + var1);
      DZ.id_class(rkg_3.id_class(rdy_3.Xz), rdy_3.Xu, 0.35F, var3, var2).id_class("has_cod", id_class(rdy_3.Xz)).id_class(var0, "cooked_cod_from_" + var1);
      DZ.id_class(rkg_3.id_class(xu_3.OM), rdy_3.Jd, 0.1F, var3, var2).id_class("has_kelp", id_class((rpL_2)xu_3.OM)).id_class(var0, "dried_kelp_from_" + var1);
      DZ.id_class(rkg_3.id_class(rdy_3.XQ), rdy_3.Xm, 0.35F, var3, var2)
         .id_class("has_salmon", id_class(rdy_3.XQ))
         .id_class(var0, "cooked_salmon_from_" + var1);
      DZ.id_class(rkg_3.id_class(rdy_3.dg), rdy_3.dR, 0.35F, var3, var2)
         .id_class("has_mutton", id_class(rdy_3.dg))
         .id_class(var0, "cooked_mutton_from_" + var1);
      DZ.id_class(rkg_3.id_class(rdy_3.hC), rdy_3.hl, 0.35F, var3, var2)
         .id_class("has_porkchop", id_class(rdy_3.hC))
         .id_class(var0, "cooked_porkchop_from_" + var1);
      DZ.id_class(rkg_3.id_class(rdy_3.dE), rdy_3.dG, 0.35F, var3, var2).id_class("has_potato", id_class(rdy_3.dE)).id_class(var0, "baked_potato_from_" + var1);
      DZ.id_class(rkg_3.id_class(rdy_3.dC), rdy_3.dl, 0.35F, var3, var2)
         .id_class("has_rabbit", id_class(rdy_3.dC))
         .id_class(var0, "cooked_rabbit_from_" + var1);
   }

   private static Xb_1 id_class(Xh_1... var0) {
      return new Xb_1(ho_3.id_class, XF.id_throws, XF.id_throws, XF.id_throws, var0);
   }

   private static void id_class(Consumer<Dw_1> var0, rpL_2 var1, rpL_2 var2) {
      UB.id_class(var1, 3).id_class('#', var2).id_class("##").id_class("##").id_break("bark").id_class("has_log", id_class(var2)).id_class(var0);
   }

   private static void id_class(Consumer<Dw_1> var0, rpL_2 var1, rlb_3<rdb_3> var2) {
      Us_1.id_class(var1, 4).id_class(var2).id_class("planks").id_class("has_log", id_class(var2)).id_class(var0);
   }

   private static void id_class(Consumer<Dw_1> var0) {
      id_class(var0, xu_3.id_continue, rlc_3.id_else);
      id_break(var0, xu_3.id_int, rlc_3.id_this);
      id_break(var0, xu_3.Xq, rlc_3.id_public);
      id_class(var0, xu_3.id_super, rlc_3.id_continue);
      id_break(var0, xu_3.id_new, rlc_3.id_synchronized);
      id_break(var0, xu_3.id_final, rlc_3.id_super);
      id_break(var0, xu_3.id_package, rlc_3.id_return);
      id_break(var0, xu_3.XT, rlc_3.id_goto);
      id_class(var0, xu_3.E, xu_3.id_const);
      id_class(var0, xu_3.S, xu_3.id_short);
      id_class(var0, xu_3.G, xu_3.id_strictfp);
      id_class(var0, xu_3.s, xu_3.id_default);
      id_class(var0, xu_3.P, xu_3.id_static);
      id_class(var0, xu_3.B, xu_3.id_import);
      id_class(var0, xu_3.Xv, xu_3.Xm);
      id_class(var0, xu_3.Xk, xu_3.Xx);
      id_class(var0, xu_3.X, xu_3.id_double);
      id_class(var0, xu_3.O, xu_3.id_transient);
      id_class(var0, xu_3.J, xu_3.id_switch);
      id_class(var0, xu_3.h, xu_3.id_for);
      id_class(var0, xu_3.b, xu_3.r);
      id_class(var0, xu_3.M, xu_3.id_boolean);
      id_class(var0, xu_3.XF, xu_3.XZ);
      id_class(var0, xu_3.XW, xu_3.Xd);
      id_break(var0, rdy_3.kv, xu_3.id_continue);
      id_break(var0, rdy_3.km, xu_3.id_int);
      id_break(var0, rdy_3.kF, xu_3.id_super);
      id_break(var0, rdy_3.kZ, xu_3.id_new);
      id_break(var0, rdy_3.he, xu_3.id_final);
      id_break(var0, rdy_3.ku, xu_3.id_package);
      id_byte(var0, xu_3.sG, xu_3.id_continue);
      id_protected(var0, xu_3.bL, xu_3.id_continue);
      id_throws(var0, xu_3.bu, xu_3.id_continue);
      id_case(var0, xu_3.bW, xu_3.id_continue);
      id_catch(var0, xu_3.Pn, xu_3.id_continue);
      id_private(var0, xu_3.GK, xu_3.id_continue);
      id_implements(var0, xu_3.Ez, xu_3.id_continue);
      id_finally(var0, xu_3.Bv, xu_3.id_continue);
      id_extends(var0, xu_3.PM, xu_3.id_continue);
      id_byte(var0, xu_3.ss, xu_3.id_int);
      id_protected(var0, xu_3.bv, xu_3.id_int);
      id_throws(var0, xu_3.bN, xu_3.id_int);
      id_case(var0, xu_3.bd, xu_3.id_int);
      id_catch(var0, xu_3.PL, xu_3.id_int);
      id_private(var0, xu_3.GY, xu_3.id_int);
      id_implements(var0, xu_3.Su, xu_3.id_int);
      id_finally(var0, xu_3.Bm, xu_3.id_int);
      id_extends(var0, xu_3.Pb, xu_3.id_int);
      id_byte(var0, xu_3.XU, xu_3.Xq);
      id_protected(var0, xu_3.Xa, xu_3.Xq);
      id_throws(var0, xu_3.Xj, xu_3.Xq);
      id_case(var0, xu_3.XY, xu_3.Xq);
      id_catch(var0, xu_3.XI, xu_3.Xq);
      id_private(var0, xu_3.Xt, xu_3.Xq);
      id_implements(var0, xu_3.XK, xu_3.Xq);
      id_finally(var0, xu_3.Xg, xu_3.Xq);
      id_extends(var0, xu_3.Jr, xu_3.Xq);
      id_byte(var0, xu_3.sb, xu_3.id_super);
      id_protected(var0, xu_3.bA, xu_3.id_super);
      id_throws(var0, xu_3.bm, xu_3.id_super);
      id_case(var0, xu_3.bz, xu_3.id_super);
      id_catch(var0, xu_3.PC, xu_3.id_super);
      id_private(var0, xu_3.GD, xu_3.id_super);
      id_implements(var0, xu_3.EQ, xu_3.id_super);
      id_finally(var0, xu_3.BF, xu_3.id_super);
      id_extends(var0, xu_3.Ph, xu_3.id_super);
      id_byte(var0, xu_3.sE, xu_3.id_new);
      id_protected(var0, xu_3.bF, xu_3.id_new);
      id_throws(var0, xu_3.bc, xu_3.id_new);
      id_case(var0, xu_3.bk, xu_3.id_new);
      id_catch(var0, xu_3.PA, xu_3.id_new);
      id_private(var0, xu_3.Go, xu_3.id_new);
      id_implements(var0, xu_3.Sm, xu_3.id_new);
      id_finally(var0, xu_3.BZ, xu_3.id_new);
      id_extends(var0, xu_3.PO, xu_3.id_new);
      id_byte(var0, xu_3.sB, xu_3.id_final);
      id_protected(var0, xu_3.PX, xu_3.id_final);
      id_throws(var0, xu_3.PV, xu_3.id_final);
      id_case(var0, xu_3.BU, xu_3.id_final);
      id_catch(var0, xu_3.Pv, xu_3.id_final);
      id_private(var0, xu_3.Gg, xu_3.id_final);
      id_implements(var0, xu_3.rU, xu_3.id_final);
      id_finally(var0, xu_3.Bc, xu_3.id_final);
      id_extends(var0, xu_3.PE, xu_3.id_final);
      id_byte(var0, xu_3.sS, xu_3.id_package);
      id_protected(var0, xu_3.bZ, xu_3.id_package);
      id_throws(var0, xu_3.bQ, xu_3.id_package);
      id_case(var0, xu_3.bx, xu_3.id_package);
      id_catch(var0, xu_3.PF, xu_3.id_package);
      id_private(var0, xu_3.GR, xu_3.id_package);
      id_implements(var0, xu_3.Sc, xu_3.id_package);
      id_finally(var0, xu_3.Bu, xu_3.id_package);
      id_extends(var0, xu_3.PG, xu_3.id_package);
      id_byte(var0, xu_3.Xe, xu_3.XT);
      id_protected(var0, xu_3.Xi, xu_3.XT);
      id_throws(var0, xu_3.XV, xu_3.XT);
      id_case(var0, xu_3.Xo, xu_3.XT);
      id_catch(var0, xu_3.Xf, xu_3.XT);
      id_private(var0, xu_3.Xw, xu_3.XT);
      id_implements(var0, xu_3.XD, xu_3.XT);
      id_finally(var0, xu_3.XR, xu_3.XT);
      id_extends(var0, xu_3.JP, xu_3.XT);
      id_native(var0, xu_3.rN, rdy_3.XV);
      id_volatile(var0, xu_3.EU, xu_3.rN);
      id_final(var0, xu_3.EU, rdy_3.XV);
      id_package(var0, rdy_3.JO, xu_3.rN);
      id_int(var0, rdy_3.JO, rdy_3.XV);
      id_new(var0, rdy_3.kb, xu_3.rN);
      id_native(var0, xu_3.rk, rdy_3.Xw);
      id_volatile(var0, xu_3.EY, xu_3.rk);
      id_final(var0, xu_3.EY, rdy_3.Xw);
      id_package(var0, rdy_3.JE, xu_3.rk);
      id_int(var0, rdy_3.JE, rdy_3.Xw);
      id_new(var0, rdy_3.kS, xu_3.rk);
      id_native(var0, xu_3.rW, rdy_3.XI);
      id_volatile(var0, xu_3.Eo, xu_3.rW);
      id_final(var0, xu_3.Eo, rdy_3.XI);
      id_package(var0, rdy_3.JG, xu_3.rW);
      id_int(var0, rdy_3.JG, rdy_3.XI);
      id_new(var0, rdy_3.ks, xu_3.rW);
      id_native(var0, xu_3.rx, rdy_3.XT);
      id_volatile(var0, xu_3.Eg, xu_3.rx);
      id_final(var0, xu_3.Eg, rdy_3.XT);
      id_package(var0, rdy_3.JS, xu_3.rx);
      id_int(var0, rdy_3.JS, rdy_3.XT);
      id_new(var0, rdy_3.kP, xu_3.rx);
      id_native(var0, xu_3.rX, rdy_3.Xp);
      id_volatile(var0, xu_3.Ej, xu_3.rX);
      id_final(var0, xu_3.Ej, rdy_3.Xp);
      id_package(var0, rdy_3.JP, xu_3.rX);
      id_int(var0, rdy_3.JP, rdy_3.Xp);
      id_new(var0, rdy_3.di, xu_3.rX);
      id_native(var0, xu_3.rz, rdy_3.Xf);
      id_volatile(var0, xu_3.EK, xu_3.rz);
      id_final(var0, xu_3.EK, rdy_3.Xf);
      id_package(var0, rdy_3.Jb, xu_3.rz);
      id_int(var0, rdy_3.Jb, rdy_3.Xf);
      id_new(var0, rdy_3.kE, xu_3.rz);
      id_native(var0, xu_3.rb, rdy_3.XC);
      id_volatile(var0, xu_3.Et, xu_3.rb);
      id_final(var0, xu_3.Et, rdy_3.XC);
      id_package(var0, rdy_3.Xe, xu_3.rb);
      id_int(var0, rdy_3.Xe, rdy_3.XC);
      id_new(var0, rdy_3.dD, xu_3.rb);
      id_native(var0, xu_3.rJ, rdy_3.Xq);
      id_volatile(var0, xu_3.EV, xu_3.rJ);
      id_final(var0, xu_3.EV, rdy_3.Xq);
      id_package(var0, rdy_3.JB, xu_3.rJ);
      id_int(var0, rdy_3.JB, rdy_3.Xq);
      id_new(var0, rdy_3.kr, xu_3.rJ);
      id_native(var0, xu_3.rO, rdy_3.XH);
      id_volatile(var0, xu_3.EI, xu_3.rO);
      id_final(var0, xu_3.EI, rdy_3.XH);
      id_package(var0, rdy_3.Xi, xu_3.rO);
      id_int(var0, rdy_3.Xi, rdy_3.XH);
      id_new(var0, rdy_3.de, xu_3.rO);
      id_native(var0, xu_3.rG, rdy_3.Xn);
      id_volatile(var0, xu_3.ET, xu_3.rG);
      id_final(var0, xu_3.ET, rdy_3.Xn);
      id_package(var0, rdy_3.XU, xu_3.rG);
      id_int(var0, rdy_3.XU, rdy_3.Xn);
      id_new(var0, rdy_3.dK, xu_3.rG);
      id_native(var0, xu_3.rE, rdy_3.XA);
      id_volatile(var0, xu_3.Eq, xu_3.rE);
      id_final(var0, xu_3.Eq, rdy_3.XA);
      id_package(var0, rdy_3.XD, xu_3.rE);
      id_int(var0, rdy_3.XD, rdy_3.XA);
      id_new(var0, rdy_3.id_do, xu_3.rE);
      id_native(var0, xu_3.rh, rdy_3.Xy);
      id_volatile(var0, xu_3.Ef, xu_3.rh);
      id_final(var0, xu_3.Ef, rdy_3.Xy);
      id_package(var0, rdy_3.Jr, xu_3.rh);
      id_int(var0, rdy_3.Jr, rdy_3.Xy);
      id_new(var0, rdy_3.da, xu_3.rh);
      id_native(var0, xu_3.rd, rdy_3.Xt);
      id_volatile(var0, xu_3.ER, xu_3.rd);
      id_final(var0, xu_3.ER, rdy_3.Xt);
      id_package(var0, rdy_3.Js, xu_3.rd);
      id_int(var0, rdy_3.Js, rdy_3.Xt);
      id_new(var0, rdy_3.kB, xu_3.rd);
      id_native(var0, xu_3.rQ, rdy_3.Xj);
      id_volatile(var0, xu_3.ED, xu_3.rQ);
      id_final(var0, xu_3.ED, rdy_3.Xj);
      id_package(var0, rdy_3.JM, xu_3.rQ);
      id_int(var0, rdy_3.JM, rdy_3.Xj);
      id_new(var0, rdy_3.kG, xu_3.rQ);
      id_volatile(var0, xu_3.Ep, xu_3.rs);
      id_package(var0, rdy_3.XK, xu_3.rs);
      id_new(var0, rdy_3.dY, xu_3.rs);
      id_native(var0, xu_3.rM, rdy_3.Xl);
      id_volatile(var0, xu_3.Ew, xu_3.rM);
      id_final(var0, xu_3.Ew, rdy_3.Xl);
      id_package(var0, rdy_3.Xa, xu_3.rM);
      id_int(var0, rdy_3.Xa, rdy_3.Xl);
      id_new(var0, rdy_3.dU, xu_3.rM);
      id_continue(var0, xu_3.BN, rdy_3.XV);
      id_super(var0, xu_3.EW, xu_3.BN);
      id_this(var0, xu_3.EW, rdy_3.XV);
      id_continue(var0, xu_3.Bk, rdy_3.Xw);
      id_super(var0, xu_3.EJ, xu_3.Bk);
      id_this(var0, xu_3.EJ, rdy_3.Xw);
      id_continue(var0, xu_3.BW, rdy_3.XI);
      id_super(var0, xu_3.Ex, xu_3.BW);
      id_this(var0, xu_3.Ex, rdy_3.XI);
      id_continue(var0, xu_3.Bx, rdy_3.XT);
      id_super(var0, xu_3.Eh, xu_3.Bx);
      id_this(var0, xu_3.Eh, rdy_3.XT);
      id_continue(var0, xu_3.BX, rdy_3.Xp);
      id_super(var0, xu_3.EM, xu_3.BX);
      id_this(var0, xu_3.EM, rdy_3.Xp);
      id_continue(var0, xu_3.Bz, rdy_3.Xf);
      id_super(var0, xu_3.Ed, xu_3.Bz);
      id_this(var0, xu_3.Ed, rdy_3.Xf);
      id_continue(var0, xu_3.Bb, rdy_3.XC);
      id_super(var0, xu_3.Es, xu_3.Bb);
      id_this(var0, xu_3.Es, rdy_3.XC);
      id_continue(var0, xu_3.BJ, rdy_3.Xq);
      id_super(var0, xu_3.EO, xu_3.BJ);
      id_this(var0, xu_3.EO, rdy_3.Xq);
      id_continue(var0, xu_3.BO, rdy_3.XH);
      id_super(var0, xu_3.EG, xu_3.BO);
      id_this(var0, xu_3.EG, rdy_3.XH);
      id_continue(var0, xu_3.BG, rdy_3.Xn);
      id_super(var0, xu_3.ES, xu_3.BG);
      id_this(var0, xu_3.ES, rdy_3.Xn);
      id_continue(var0, xu_3.BE, rdy_3.XA);
      id_super(var0, xu_3.EB, xu_3.BE);
      id_this(var0, xu_3.EB, rdy_3.XA);
      id_continue(var0, xu_3.Bh, rdy_3.Xy);
      id_super(var0, xu_3.Eb, xu_3.Bh);
      id_this(var0, xu_3.Eb, rdy_3.Xy);
      id_continue(var0, xu_3.Bd, rdy_3.Xt);
      id_super(var0, xu_3.EX, xu_3.Bd);
      id_this(var0, xu_3.EX, rdy_3.Xt);
      id_continue(var0, xu_3.BQ, rdy_3.Xj);
      id_super(var0, xu_3.Ek, xu_3.BQ);
      id_this(var0, xu_3.Ek, rdy_3.Xj);
      id_continue(var0, xu_3.Bs, rdy_3.XL);
      id_super(var0, xu_3.EP, xu_3.Bs);
      id_this(var0, xu_3.EP, rdy_3.XL);
      id_continue(var0, xu_3.BM, rdy_3.Xl);
      id_super(var0, xu_3.EE, xu_3.BM);
      id_this(var0, xu_3.EE, rdy_3.Xl);
      id_else(var0, xu_3.Er, rdy_3.XV);
      id_else(var0, xu_3.sU, rdy_3.Xw);
      id_else(var0, xu_3.se, rdy_3.XI);
      id_else(var0, xu_3.sK, rdy_3.XT);
      id_else(var0, xu_3.sY, rdy_3.Xp);
      id_else(var0, xu_3.sa, rdy_3.Xf);
      id_else(var0, xu_3.sj, rdy_3.XC);
      id_else(var0, xu_3.so, rdy_3.Xq);
      id_else(var0, xu_3.sg, rdy_3.XH);
      id_else(var0, xu_3.sf, rdy_3.Xn);
      id_else(var0, xu_3.sI, rdy_3.XA);
      id_else(var0, xu_3.sR, rdy_3.Xy);
      id_else(var0, xu_3.sD, rdy_3.Xt);
      id_else(var0, xu_3.si, rdy_3.Xj);
      id_else(var0, xu_3.sw, rdy_3.XL);
      id_else(var0, xu_3.sV, rdy_3.Xl);
      id_synchronized(var0, xu_3.Ob, rdy_3.XV);
      id_synchronized(var0, xu_3.OS, rdy_3.Xw);
      id_synchronized(var0, xu_3.Os, rdy_3.XI);
      id_synchronized(var0, xu_3.OP, rdy_3.XT);
      id_synchronized(var0, xu_3.Mi, rdy_3.Xp);
      id_synchronized(var0, xu_3.OE, rdy_3.Xf);
      id_synchronized(var0, xu_3.MD, rdy_3.XC);
      id_synchronized(var0, xu_3.Or, rdy_3.Xq);
      id_synchronized(var0, xu_3.Me, rdy_3.XH);
      id_synchronized(var0, xu_3.MK, rdy_3.Xn);
      id_synchronized(var0, xu_3.Mo, rdy_3.XA);
      id_synchronized(var0, xu_3.Ma, rdy_3.Xy);
      id_synchronized(var0, xu_3.OB, rdy_3.Xt);
      id_synchronized(var0, xu_3.OG, rdy_3.Xj);
      id_synchronized(var0, xu_3.MY, rdy_3.XL);
      id_synchronized(var0, xu_3.MU, rdy_3.Xl);
      UB.id_class(xu_3.sT, 6)
         .id_class('#', xu_3.PH)
         .id_class('S', rdy_3.OD)
         .id_class('X', rdy_3.Ox)
         .id_class("XSX")
         .id_class("X#X")
         .id_class("XSX")
         .id_class("has_rail", id_class((rpL_2)xu_3.Px))
         .id_class(var0);
      Us_1.id_class(xu_3.id_catch, 2).id_break(xu_3.id_throws).id_break(xu_3.id_volatile).id_class("has_stone", id_class((rpL_2)xu_3.id_throws)).id_class(var0);
      UB.id_class(xu_3.sc)
         .id_class('I', xu_3.rw)
         .id_class('i', rdy_3.Ox)
         .id_class("III")
         .id_class(" i ")
         .id_class("iii")
         .id_class("has_iron_block", id_class((rpL_2)xu_3.rw))
         .id_class(var0);
      UB.id_class(rdy_3.dq)
         .id_class('/', rdy_3.OD)
         .id_class('_', xu_3.Ge)
         .id_class("///")
         .id_class(" / ")
         .id_class("/_/")
         .id_class("has_stone_slab", id_class((rpL_2)xu_3.Ge))
         .id_class(var0);
      UB.id_class(rdy_3.OO, 4)
         .id_class('#', rdy_3.OD)
         .id_class('X', rdy_3.hn)
         .id_class('Y', rdy_3.Oi)
         .id_class("X")
         .id_class("#")
         .id_class("Y")
         .id_class("has_feather", id_class(rdy_3.Oi))
         .id_class("has_flint", id_class(rdy_3.hn))
         .id_class(var0);
      UB.id_class(xu_3.ha, 1)
         .id_class('P', rlc_3.id_byte)
         .id_class('S', rlc_3.id_finally)
         .id_class("PSP")
         .id_class("P P")
         .id_class("PSP")
         .id_class("has_planks", id_class(rlc_3.id_byte))
         .id_class("has_wood_slab", id_class(rlc_3.id_finally))
         .id_class(var0);
      UB.id_class(xu_3.Sv)
         .id_class('S', rdy_3.dQ)
         .id_class('G', xu_3.u)
         .id_class('O', xu_3.rg)
         .id_class("GGG")
         .id_class("GSG")
         .id_class("OOO")
         .id_class("has_nether_star", id_class(rdy_3.dQ))
         .id_class(var0);
      UB.id_class(xu_3.JO)
         .id_class('P', rlc_3.id_byte)
         .id_class('H', rdy_3.Wm)
         .id_class("PPP")
         .id_class("HHH")
         .id_class("PPP")
         .id_class("has_honeycomb", id_class(rdy_3.Wm))
         .id_class(var0);
      Us_1.id_class(rdy_3.kx).id_break(rdy_3.OU).id_break(rdy_3.kX, 6).id_class("has_beetroot", id_class(rdy_3.kX)).id_class(var0);
      Us_1.id_class(rdy_3.XV).id_break(rdy_3.XZ).id_class("black_dye").id_class("has_ink_sac", id_class(rdy_3.XZ)).id_class(var0);
      Us_1.id_class(rdy_3.XV)
         .id_break(xu_3.ry)
         .id_class("black_dye")
         .id_class("has_black_flower", id_class((rpL_2)xu_3.ry))
         .id_class(var0, "black_dye_from_wither_rose");
      Us_1.id_class(rdy_3.JH, 2).id_break(rdy_3.JZ).id_class("has_blaze_rod", id_class(rdy_3.JZ)).id_class(var0);
      Us_1.id_class(rdy_3.Xw).id_break(rdy_3.XF).id_class("blue_dye").id_class("has_lapis_lazuli", id_class(rdy_3.XF)).id_class(var0);
      Us_1.id_class(rdy_3.Xw)
         .id_break(xu_3.rH)
         .id_class("blue_dye")
         .id_class("has_blue_flower", id_class((rpL_2)xu_3.rH))
         .id_class(var0, "blue_dye_from_cornflower");
      UB.id_class(xu_3.hP)
         .id_class('#', xu_3.Ei)
         .id_class("###")
         .id_class("###")
         .id_class("###")
         .id_class("has_packed_ice", id_class((rpL_2)xu_3.Ei))
         .id_class(var0);
      UB.id_class(xu_3.bY).id_class('X', rdy_3.Xg).id_class("XXX").id_class("XXX").id_class("XXX").id_class("has_bonemeal", id_class(rdy_3.Xg)).id_class(var0);
      Us_1.id_class(rdy_3.Xg, 3).id_break(rdy_3.XR).id_class("bonemeal").id_class("has_bone", id_class(rdy_3.XR)).id_class(var0);
      Us_1.id_class(rdy_3.Xg, 9)
         .id_break(xu_3.bY)
         .id_class("bonemeal")
         .id_class("has_bone_block", id_class((rpL_2)xu_3.bY))
         .id_class(var0, "bone_meal_from_bone_block");
      Us_1.id_class(rdy_3.XM).id_break(rdy_3.Xb, 3).id_break(rdy_3.ha).id_class("has_paper", id_class(rdy_3.Xb)).id_class(var0);
      UB.id_class(xu_3.rj)
         .id_class('#', rlc_3.id_byte)
         .id_class('X', rdy_3.XM)
         .id_class("###")
         .id_class("XXX")
         .id_class("###")
         .id_class("has_book", id_class(rdy_3.XM))
         .id_class(var0);
      UB.id_class(rdy_3.OM)
         .id_class('#', rdy_3.OD)
         .id_class('X', rdy_3.Oa)
         .id_class(" #X")
         .id_class("# X")
         .id_class(" #X")
         .id_class("has_string", id_class(rdy_3.Oa))
         .id_class(var0);
      UB.id_class(rdy_3.OU, 4)
         .id_class('#', rlc_3.id_byte)
         .id_class("# #")
         .id_class(" # ")
         .id_class("has_brown_mushroom", id_class((rpL_2)xu_3.rq))
         .id_class("has_red_mushroom", id_class((rpL_2)xu_3.rT))
         .id_class("has_mushroom_stew", id_class(rdy_3.Oe))
         .id_class(var0);
      UB.id_class(rdy_3.hS).id_class('#', rdy_3.hB).id_class("###").id_class("has_wheat", id_class(rdy_3.hB)).id_class(var0);
      UB.id_class(xu_3.SG)
         .id_class('B', rdy_3.JZ)
         .id_class('#', rlc_3.M)
         .id_class(" B ")
         .id_class("###")
         .id_class("has_blaze_rod", id_class(rdy_3.JZ))
         .id_class(var0);
      UB.id_class(xu_3.rI).id_class('#', rdy_3.Xs).id_class("##").id_class("##").id_class("has_brick", id_class(rdy_3.Xs)).id_class(var0);
      UB.id_class(xu_3.bB, 6).id_class('#', xu_3.rI).id_class("###").id_class("has_brick_block", id_class((rpL_2)xu_3.rI)).id_class(var0);
      UB.id_class(xu_3.Be, 4)
         .id_class('#', xu_3.rI)
         .id_class("#  ")
         .id_class("## ")
         .id_class("###")
         .id_class("has_brick_block", id_class((rpL_2)xu_3.rI))
         .id_class(var0);
      Us_1.id_class(rdy_3.XI).id_break(rdy_3.Xv).id_class("brown_dye").id_class("has_cocoa_beans", id_class(rdy_3.Xv)).id_class(var0);
      UB.id_class(rdy_3.hg).id_class('#', rdy_3.Ox).id_class("# #").id_class(" # ").id_class("has_iron_ingot", id_class(rdy_3.Ox)).id_class(var0);
      UB.id_class(xu_3.BB)
         .id_class('A', rdy_3.hi)
         .id_class('B', rdy_3.XY)
         .id_class('C', rdy_3.hB)
         .id_class('E', rdy_3.XJ)
         .id_class("AAA")
         .id_class("BEB")
         .id_class("CCC")
         .id_class("has_egg", id_class(rdy_3.XJ))
         .id_class(var0);
      UB.id_class(xu_3.Xh)
         .id_class('L', rlc_3.id_new)
         .id_class('S', rdy_3.OD)
         .id_class('C', rlc_3.S)
         .id_class(" S ")
         .id_class("SCS")
         .id_class("LLL")
         .id_class("has_stick", id_class(rdy_3.OD))
         .id_class("has_coal", id_class(rlc_3.S))
         .id_class(var0);
      UB.id_class(rdy_3.dW)
         .id_class('#', rdy_3.Xd)
         .id_class('X', rdy_3.ds)
         .id_class("# ")
         .id_class(" X")
         .id_class("has_carrot", id_class(rdy_3.ds))
         .id_class(var0);
      UB.id_class(rdy_3.dz)
         .id_class('#', rdy_3.Xd)
         .id_class('X', rdy_3.rC)
         .id_class("# ")
         .id_class(" X")
         .id_class("has_warped_fungus", id_class(rdy_3.rC))
         .id_class(var0);
      UB.id_class(xu_3.Sb)
         .id_class('#', rdy_3.Ox)
         .id_class("# #")
         .id_class("# #")
         .id_class("###")
         .id_class("has_water_bucket", id_class(rdy_3.hR))
         .id_class(var0);
      UB.id_class(xu_3.JG)
         .id_class('#', rlc_3.id_finally)
         .id_class("# #")
         .id_class("# #")
         .id_class("###")
         .id_class("has_wood_slab", id_class(rlc_3.id_finally))
         .id_class(var0);
      UB.id_class(xu_3.re)
         .id_class('#', rlc_3.id_byte)
         .id_class("###")
         .id_class("# #")
         .id_class("###")
         .id_class("has_lots_of_items", new Xb_1(ho_3.id_class, XF.id_break(10), XF.id_throws, XF.id_throws, new Xh_1[0]))
         .id_class(var0);
      UB.id_class(rdy_3.Xh)
         .id_class('A', xu_3.re)
         .id_class('B', rdy_3.ho)
         .id_class("A")
         .id_class("B")
         .id_class("has_minecart", id_class(rdy_3.ho))
         .id_class(var0);
      UB.id_class(xu_3.JI).id_class('#', xu_3.bs).id_class("#").id_class("#").id_class("has_nether_bricks", id_class((rpL_2)xu_3.SP)).id_class(var0);
      UB.id_class(xu_3.sy)
         .id_class('#', xu_3.bE)
         .id_class("#")
         .id_class("#")
         .id_class("has_chiseled_quartz_block", id_class((rpL_2)xu_3.sy))
         .id_class("has_quartz_block", id_class((rpL_2)xu_3.sH))
         .id_class("has_quartz_pillar", id_class((rpL_2)xu_3.sp))
         .id_class(var0);
      UB.id_class(xu_3.BC).id_class('#', xu_3.bS).id_class("#").id_class("#").id_class("has_stone_bricks", id_class(rlc_3.id_protected)).id_class(var0);
      UB.id_class(xu_3.PI).id_class('#', rdy_3.XE).id_class("##").id_class("##").id_class("has_clay_ball", id_class(rdy_3.XE)).id_class(var0);
      UB.id_class(rdy_3.Xk)
         .id_class('#', rdy_3.Od)
         .id_class('X', rdy_3.hD)
         .id_class(" # ")
         .id_class("#X#")
         .id_class(" # ")
         .id_class("has_redstone", id_class(rdy_3.hD))
         .id_class(var0);
      Us_1.id_class(rdy_3.Oh, 9).id_break(xu_3.Ea).id_class("has_coal_block", id_class((rpL_2)xu_3.Ea)).id_class(var0);
      UB.id_class(xu_3.Ea).id_class('#', rdy_3.Oh).id_class("###").id_class("###").id_class("###").id_class("has_coal", id_class(rdy_3.Oh)).id_class(var0);
      UB.id_class(xu_3.id_extends, 4)
         .id_class('D', xu_3.id_finally)
         .id_class('G', xu_3.id_char)
         .id_class("DG")
         .id_class("GD")
         .id_class("has_gravel", id_class((rpL_2)xu_3.id_char))
         .id_class(var0);
      UB.id_class(xu_3.bP, 6).id_class('#', xu_3.id_volatile).id_class("###").id_class("has_cobblestone", id_class((rpL_2)xu_3.id_volatile)).id_class(var0);
      UB.id_class(xu_3.SF, 6)
         .id_class('#', xu_3.id_volatile)
         .id_class("###")
         .id_class("###")
         .id_class("has_cobblestone", id_class((rpL_2)xu_3.id_volatile))
         .id_class(var0);
      UB.id_class(xu_3.sL)
         .id_class('#', xu_3.PH)
         .id_class('X', rdy_3.dv)
         .id_class('I', xu_3.id_break)
         .id_class(" # ")
         .id_class("#X#")
         .id_class("III")
         .id_class("has_quartz", id_class(rdy_3.dv))
         .id_class(var0);
      UB.id_class(rdy_3.Xx)
         .id_class('#', rdy_3.Ox)
         .id_class('X', rdy_3.hD)
         .id_class(" # ")
         .id_class("#X#")
         .id_class(" # ")
         .id_class("has_redstone", id_class(rdy_3.hD))
         .id_class(var0);
      UB.id_class(rdy_3.Jh, 8).id_class('#', rdy_3.hB).id_class('X', rdy_3.Xv).id_class("#X#").id_class("has_cocoa", id_class(rdy_3.Xv)).id_class(var0);
      UB.id_class(xu_3.PP).id_class('#', rlc_3.id_byte).id_class("##").id_class("##").id_class("has_planks", id_class(rlc_3.id_byte)).id_class(var0);
      UB.id_class(rdy_3.kU)
         .id_class('~', rdy_3.Oa)
         .id_class('#', rdy_3.OD)
         .id_class('&', rdy_3.Ox)
         .id_class('$', xu_3.Sz)
         .id_class("#&#")
         .id_class("~$~")
         .id_class(" # ")
         .id_class("has_string", id_class(rdy_3.Oa))
         .id_class("has_stick", id_class(rdy_3.OD))
         .id_class("has_iron_ingot", id_class(rdy_3.Ox))
         .id_class("has_tripwire_hook", id_class((rpL_2)xu_3.Sz))
         .id_class(var0);
      UB.id_class(xu_3.he)
         .id_class('#', rlc_3.id_byte)
         .id_class('@', rdy_3.Oa)
         .id_class("@@")
         .id_class("##")
         .id_class("has_string", id_class(rdy_3.Oa))
         .id_class(var0);
      UB.id_class(xu_3.Gf)
         .id_class('#', xu_3.bG)
         .id_class("#")
         .id_class("#")
         .id_class("has_red_sandstone", id_class((rpL_2)xu_3.GI))
         .id_class("has_chiseled_red_sandstone", id_class((rpL_2)xu_3.Gf))
         .id_class("has_cut_red_sandstone", id_class((rpL_2)xu_3.Gj))
         .id_class(var0);
      UB.id_class(xu_3.L).id_class('#', xu_3.Ga).id_class("#").id_class("#").id_class("has_stone_slab", id_class((rpL_2)xu_3.Ga)).id_class(var0);
      Us_1.id_class(rdy_3.XT, 2)
         .id_break(rdy_3.Xw)
         .id_break(rdy_3.Xf)
         .id_class("has_green_dye", id_class(rdy_3.Xf))
         .id_class("has_blue_dye", id_class(rdy_3.Xw))
         .id_class(var0);
      UB.id_class(xu_3.Ev)
         .id_class('S', rdy_3.dA)
         .id_class('I', rdy_3.XV)
         .id_class("SSS")
         .id_class("SIS")
         .id_class("SSS")
         .id_class("has_prismarine_shard", id_class(rdy_3.dA))
         .id_class(var0);
      UB.id_class(xu_3.EF, 4)
         .id_class('#', xu_3.Em)
         .id_class("#  ")
         .id_class("## ")
         .id_class("###")
         .id_class("has_prismarine", id_class((rpL_2)xu_3.Em))
         .id_class(var0);
      UB.id_class(xu_3.EL, 4)
         .id_class('#', xu_3.EZ)
         .id_class("#  ")
         .id_class("## ")
         .id_class("###")
         .id_class("has_prismarine_bricks", id_class((rpL_2)xu_3.EZ))
         .id_class(var0);
      UB.id_class(xu_3.EA, 4)
         .id_class('#', xu_3.Ev)
         .id_class("#  ")
         .id_class("## ")
         .id_class("###")
         .id_class("has_dark_prismarine", id_class((rpL_2)xu_3.Ev))
         .id_class(var0);
      UB.id_class(xu_3.sA)
         .id_class('Q', rdy_3.dv)
         .id_class('G', xu_3.u)
         .id_class('W', rkg_3.id_class(rlc_3.id_finally))
         .id_class("GGG")
         .id_class("QQQ")
         .id_class("WWW")
         .id_class("has_quartz", id_class(rdy_3.dv))
         .id_class(var0);
      UB.id_class(xu_3.K, 6)
         .id_class('R', rdy_3.hD)
         .id_class('#', xu_3.Pm)
         .id_class('X', rdy_3.Ox)
         .id_class("X X")
         .id_class("X#X")
         .id_class("XRX")
         .id_class("has_rail", id_class((rpL_2)xu_3.Px))
         .id_class(var0);
      Us_1.id_class(rdy_3.OJ, 9).id_break(xu_3.Pr).id_class("has_diamond_block", id_class((rpL_2)xu_3.Pr)).id_class(var0);
      UB.id_class(rdy_3.Oj)
         .id_class('#', rdy_3.OD)
         .id_class('X', rdy_3.OJ)
         .id_class("XX")
         .id_class("X#")
         .id_class(" #")
         .id_class("has_diamond", id_class(rdy_3.OJ))
         .id_class(var0);
      UB.id_class(xu_3.Pr).id_class('#', rdy_3.OJ).id_class("###").id_class("###").id_class("###").id_class("has_diamond", id_class(rdy_3.OJ)).id_class(var0);
      UB.id_class(rdy_3.hN).id_class('X', rdy_3.OJ).id_class("X X").id_class("X X").id_class("has_diamond", id_class(rdy_3.OJ)).id_class(var0);
      UB.id_class(rdy_3.hz).id_class('X', rdy_3.OJ).id_class("X X").id_class("XXX").id_class("XXX").id_class("has_diamond", id_class(rdy_3.OJ)).id_class(var0);
      UB.id_class(rdy_3.hW).id_class('X', rdy_3.OJ).id_class("XXX").id_class("X X").id_class("has_diamond", id_class(rdy_3.OJ)).id_class(var0);
      UB.id_class(rdy_3.OV)
         .id_class('#', rdy_3.OD)
         .id_class('X', rdy_3.OJ)
         .id_class("XX")
         .id_class(" #")
         .id_class(" #")
         .id_class("has_diamond", id_class(rdy_3.OJ))
         .id_class(var0);
      UB.id_class(rdy_3.hQ).id_class('X', rdy_3.OJ).id_class("XXX").id_class("X X").id_class("X X").id_class("has_diamond", id_class(rdy_3.OJ)).id_class(var0);
      UB.id_class(rdy_3.Of)
         .id_class('#', rdy_3.OD)
         .id_class('X', rdy_3.OJ)
         .id_class("XXX")
         .id_class(" # ")
         .id_class(" # ")
         .id_class("has_diamond", id_class(rdy_3.OJ))
         .id_class(var0);
      UB.id_class(rdy_3.OI)
         .id_class('#', rdy_3.OD)
         .id_class('X', rdy_3.OJ)
         .id_class("X")
         .id_class("#")
         .id_class("#")
         .id_class("has_diamond", id_class(rdy_3.OJ))
         .id_class(var0);
      UB.id_class(rdy_3.Ow)
         .id_class('#', rdy_3.OD)
         .id_class('X', rdy_3.OJ)
         .id_class("X")
         .id_class("X")
         .id_class("#")
         .id_class("has_diamond", id_class(rdy_3.OJ))
         .id_class(var0);
      UB.id_class(xu_3.id_throws, 2)
         .id_class('Q', rdy_3.dv)
         .id_class('C', xu_3.id_volatile)
         .id_class("CQ")
         .id_class("QC")
         .id_class("has_quartz", id_class(rdy_3.dv))
         .id_class(var0);
      UB.id_class(xu_3.v)
         .id_class('R', rdy_3.hD)
         .id_class('#', xu_3.id_volatile)
         .id_class('X', rdy_3.OM)
         .id_class("###")
         .id_class("#X#")
         .id_class("#R#")
         .id_class("has_bow", id_class(rdy_3.OM))
         .id_class(var0);
      UB.id_class(xu_3.st)
         .id_class('R', rdy_3.hD)
         .id_class('#', xu_3.id_volatile)
         .id_class("###")
         .id_class("# #")
         .id_class("#R#")
         .id_class("has_redstone", id_class(rdy_3.hD))
         .id_class(var0);
      Us_1.id_class(rdy_3.dP, 9).id_break(xu_3.SN).id_class("has_emerald_block", id_class((rpL_2)xu_3.SN)).id_class(var0);
      UB.id_class(xu_3.SN).id_class('#', rdy_3.dP).id_class("###").id_class("###").id_class("###").id_class("has_emerald", id_class(rdy_3.dP)).id_class(var0);
      UB.id_class(xu_3.SE)
         .id_class('B', rdy_3.XM)
         .id_class('#', xu_3.rg)
         .id_class('D', rdy_3.OJ)
         .id_class(" B ")
         .id_class("D#D")
         .id_class("###")
         .id_class("has_obsidian", id_class((rpL_2)xu_3.rg))
         .id_class(var0);
      UB.id_class(xu_3.SW)
         .id_class('#', xu_3.rg)
         .id_class('E', rdy_3.JT)
         .id_class("###")
         .id_class("#E#")
         .id_class("###")
         .id_class("has_ender_eye", id_class(rdy_3.JT))
         .id_class(var0);
      Us_1.id_class(rdy_3.JT).id_break(rdy_3.Jm).id_break(rdy_3.JH).id_class("has_blaze_powder", id_class(rdy_3.JH)).id_class(var0);
      UB.id_class(xu_3.bq, 4).id_class('#', xu_3.Sh).id_class("##").id_class("##").id_class("has_end_stone", id_class((rpL_2)xu_3.Sh)).id_class(var0);
      UB.id_class(rdy_3.kM)
         .id_class('T', rdy_3.Jv)
         .id_class('E', rdy_3.JT)
         .id_class('G', xu_3.u)
         .id_class("GGG")
         .id_class("GEG")
         .id_class("GTG")
         .id_class("has_ender_eye", id_class(rdy_3.JT))
         .id_class(var0);
      UB.id_class(xu_3.bn, 4)
         .id_class('#', rdy_3.kh)
         .id_class('/', rdy_3.JZ)
         .id_class("/")
         .id_class("#")
         .id_class("has_chorus_fruit_popped", id_class(rdy_3.kh))
         .id_class(var0);
      Us_1.id_class(rdy_3.Jl).id_break(rdy_3.JC).id_break(xu_3.rq).id_break(rdy_3.XY).id_class("has_spider_eye", id_class(rdy_3.JC)).id_class(var0);
      Us_1.id_class(rdy_3.xa, 3)
         .id_break(rdy_3.hr)
         .id_break(rdy_3.JH)
         .id_class(rkg_3.id_class(rdy_3.Oh, rdy_3.OX))
         .id_class("has_blaze_powder", id_class(rdy_3.JH))
         .id_class(var0);
      UB.id_class(rdy_3.Xd)
         .id_class('#', rdy_3.OD)
         .id_class('X', rdy_3.Oa)
         .id_class("  #")
         .id_class(" #X")
         .id_class("# X")
         .id_class("has_string", id_class(rdy_3.Oa))
         .id_class(var0);
      Us_1.id_class(rdy_3.OG)
         .id_break(rdy_3.Ox)
         .id_break(rdy_3.hn)
         .id_class("has_flint", id_class(rdy_3.hn))
         .id_class("has_obsidian", id_class((rpL_2)xu_3.rg))
         .id_class(var0);
      UB.id_class(xu_3.SA).id_class('#', rdy_3.Xs).id_class("# #").id_class(" # ").id_class("has_brick", id_class(rdy_3.Xs)).id_class(var0);
      UB.id_class(xu_3.Ps).id_class('#', rlc_3.M).id_class("###").id_class("# #").id_class("###").id_class("has_cobblestone", id_class(rlc_3.M)).id_class(var0);
      UB.id_class(rdy_3.XX)
         .id_class('A', xu_3.Ps)
         .id_class('B', rdy_3.ho)
         .id_class("A")
         .id_class("B")
         .id_class("has_minecart", id_class(rdy_3.ho))
         .id_class(var0);
      UB.id_class(rdy_3.Jn, 3).id_class('#', xu_3.u).id_class("# #").id_class(" # ").id_class("has_glass", id_class((rpL_2)xu_3.u)).id_class(var0);
      UB.id_class(xu_3.BV, 16).id_class('#', xu_3.u).id_class("###").id_class("###").id_class("has_glass", id_class((rpL_2)xu_3.u)).id_class(var0);
      UB.id_class(xu_3.Pa).id_class('#', rdy_3.XW).id_class("##").id_class("##").id_class("has_glowstone_dust", id_class(rdy_3.XW)).id_class(var0);
      UB.id_class(rdy_3.hy)
         .id_class('#', rdy_3.Od)
         .id_class('X', rdy_3.Ob)
         .id_class("###")
         .id_class("#X#")
         .id_class("###")
         .id_class("has_gold_ingot", id_class(rdy_3.Od))
         .id_class(var0);
      UB.id_class(rdy_3.Ol)
         .id_class('#', rdy_3.OD)
         .id_class('X', rdy_3.Od)
         .id_class("XX")
         .id_class("X#")
         .id_class(" #")
         .id_class("has_gold_ingot", id_class(rdy_3.Od))
         .id_class(var0);
      UB.id_class(rdy_3.hZ).id_class('X', rdy_3.Od).id_class("X X").id_class("X X").id_class("has_gold_ingot", id_class(rdy_3.Od)).id_class(var0);
      UB.id_class(rdy_3.dO)
         .id_class('#', rdy_3.JF)
         .id_class('X', rdy_3.ds)
         .id_class("###")
         .id_class("#X#")
         .id_class("###")
         .id_class("has_gold_nugget", id_class(rdy_3.JF))
         .id_class(var0);
      UB.id_class(rdy_3.hu)
         .id_class('X', rdy_3.Od)
         .id_class("X X")
         .id_class("XXX")
         .id_class("XXX")
         .id_class("has_gold_ingot", id_class(rdy_3.Od))
         .id_class(var0);
      UB.id_class(rdy_3.hc).id_class('X', rdy_3.Od).id_class("XXX").id_class("X X").id_class("has_gold_ingot", id_class(rdy_3.Od)).id_class(var0);
      UB.id_class(rdy_3.OH)
         .id_class('#', rdy_3.OD)
         .id_class('X', rdy_3.Od)
         .id_class("XX")
         .id_class(" #")
         .id_class(" #")
         .id_class("has_gold_ingot", id_class(rdy_3.Od))
         .id_class(var0);
      UB.id_class(rdy_3.hm)
         .id_class('X', rdy_3.Od)
         .id_class("XXX")
         .id_class("X X")
         .id_class("X X")
         .id_class("has_gold_ingot", id_class(rdy_3.Od))
         .id_class(var0);
      UB.id_class(rdy_3.OC)
         .id_class('#', rdy_3.OD)
         .id_class('X', rdy_3.Od)
         .id_class("XXX")
         .id_class(" # ")
         .id_class(" # ")
         .id_class("has_gold_ingot", id_class(rdy_3.Od))
         .id_class(var0);
      UB.id_class(xu_3.o, 6)
         .id_class('R', rdy_3.hD)
         .id_class('#', rdy_3.OD)
         .id_class('X', rdy_3.Od)
         .id_class("X X")
         .id_class("X#X")
         .id_class("XRX")
         .id_class("has_rail", id_class((rpL_2)xu_3.Px))
         .id_class(var0);
      UB.id_class(rdy_3.On)
         .id_class('#', rdy_3.OD)
         .id_class('X', rdy_3.Od)
         .id_class("X")
         .id_class("#")
         .id_class("#")
         .id_class("has_gold_ingot", id_class(rdy_3.Od))
         .id_class(var0);
      UB.id_class(rdy_3.OA)
         .id_class('#', rdy_3.OD)
         .id_class('X', rdy_3.Od)
         .id_class("X")
         .id_class("X")
         .id_class("#")
         .id_class("has_gold_ingot", id_class(rdy_3.Od))
         .id_class(var0);
      UB.id_class(xu_3.rt)
         .id_class('#', rdy_3.Od)
         .id_class("###")
         .id_class("###")
         .id_class("###")
         .id_class("has_gold_ingot", id_class(rdy_3.Od))
         .id_class(var0);
      Us_1.id_class(rdy_3.Od, 9)
         .id_break(xu_3.rt)
         .id_class("gold_ingot")
         .id_class("has_gold_block", id_class((rpL_2)xu_3.rt))
         .id_class(var0, "gold_ingot_from_gold_block");
      UB.id_class(rdy_3.Od)
         .id_class('#', rdy_3.JF)
         .id_class("###")
         .id_class("###")
         .id_class("###")
         .id_break("gold_ingot")
         .id_class("has_gold_nugget", id_class(rdy_3.JF))
         .id_class(var0, "gold_ingot_from_nuggets");
      Us_1.id_class(rdy_3.JF, 9).id_break(rdy_3.Od).id_class("has_gold_ingot", id_class(rdy_3.Od)).id_class(var0);
      Us_1.id_class(xu_3.id_byte).id_break(xu_3.id_throws).id_break(rdy_3.dv).id_class("has_quartz", id_class(rdy_3.dv)).id_class(var0);
      Us_1.id_class(rdy_3.Xp, 2)
         .id_break(rdy_3.XV)
         .id_break(rdy_3.XL)
         .id_class("has_white_dye", id_class(rdy_3.XL))
         .id_class("has_black_dye", id_class(rdy_3.XV))
         .id_class(var0);
      UB.id_class(xu_3.Ey).id_class('#', rdy_3.hB).id_class("###").id_class("###").id_class("###").id_class("has_wheat", id_class(rdy_3.hB)).id_class(var0);
      UB.id_class(xu_3.sF).id_class('#', rdy_3.Ox).id_class("##").id_class("has_iron_ingot", id_class(rdy_3.Ox)).id_class(var0);
      Us_1.id_class(rdy_3.WF, 4).id_break(rdy_3.WL).id_break(rdy_3.Jn, 4).id_class("has_honey_block", id_class((rpL_2)xu_3.Jh)).id_class(var0);
      UB.id_class(xu_3.Jh, 1).id_class('S', rdy_3.WF).id_class("SS").id_class("SS").id_class("has_honey_bottle", id_class(rdy_3.WF)).id_class(var0);
      UB.id_class(xu_3.JX).id_class('H', rdy_3.Wm).id_class("HH").id_class("HH").id_class("has_honeycomb", id_class(rdy_3.Wm)).id_class(var0);
      UB.id_class(xu_3.sl)
         .id_class('C', xu_3.re)
         .id_class('I', rdy_3.Ox)
         .id_class("I I")
         .id_class("ICI")
         .id_class(" I ")
         .id_class("has_iron_ingot", id_class(rdy_3.Ox))
         .id_class(var0);
      UB.id_class(rdy_3.dL)
         .id_class('A', xu_3.sl)
         .id_class('B', rdy_3.ho)
         .id_class("A")
         .id_class("B")
         .id_class("has_minecart", id_class(rdy_3.ho))
         .id_class(var0);
      UB.id_class(rdy_3.OT)
         .id_class('#', rdy_3.OD)
         .id_class('X', rdy_3.Ox)
         .id_class("XX")
         .id_class("X#")
         .id_class(" #")
         .id_class("has_iron_ingot", id_class(rdy_3.Ox))
         .id_class(var0);
      UB.id_class(xu_3.Bf, 16).id_class('#', rdy_3.Ox).id_class("###").id_class("###").id_class("has_iron_ingot", id_class(rdy_3.Ox)).id_class(var0);
      UB.id_class(xu_3.rw)
         .id_class('#', rdy_3.Ox)
         .id_class("###")
         .id_class("###")
         .id_class("###")
         .id_class("has_iron_ingot", id_class(rdy_3.Ox))
         .id_class(var0);
      UB.id_class(rdy_3.hk).id_class('X', rdy_3.Ox).id_class("X X").id_class("X X").id_class("has_iron_ingot", id_class(rdy_3.Ox)).id_class(var0);
      UB.id_class(rdy_3.hx)
         .id_class('X', rdy_3.Ox)
         .id_class("X X")
         .id_class("XXX")
         .id_class("XXX")
         .id_class("has_iron_ingot", id_class(rdy_3.Ox))
         .id_class(var0);
      UB.id_class(xu_3.PZ, 3)
         .id_class('#', rdy_3.Ox)
         .id_class("##")
         .id_class("##")
         .id_class("##")
         .id_class("has_iron_ingot", id_class(rdy_3.Ox))
         .id_class(var0);
      UB.id_class(rdy_3.hJ).id_class('X', rdy_3.Ox).id_class("XXX").id_class("X X").id_class("has_iron_ingot", id_class(rdy_3.Ox)).id_class(var0);
      UB.id_class(rdy_3.Ot)
         .id_class('#', rdy_3.OD)
         .id_class('X', rdy_3.Ox)
         .id_class("XX")
         .id_class(" #")
         .id_class(" #")
         .id_class("has_iron_ingot", id_class(rdy_3.Ox))
         .id_class(var0);
      Us_1.id_class(rdy_3.Ox, 9)
         .id_break(xu_3.rw)
         .id_class("iron_ingot")
         .id_class("has_iron_block", id_class((rpL_2)xu_3.rw))
         .id_class(var0, "iron_ingot_from_iron_block");
      UB.id_class(rdy_3.Ox)
         .id_class('#', rdy_3.kn)
         .id_class("###")
         .id_class("###")
         .id_class("###")
         .id_break("iron_ingot")
         .id_class("has_iron_nugget", id_class(rdy_3.kn))
         .id_class(var0, "iron_ingot_from_nuggets");
      UB.id_class(rdy_3.hd)
         .id_class('X', rdy_3.Ox)
         .id_class("XXX")
         .id_class("X X")
         .id_class("X X")
         .id_class("has_iron_ingot", id_class(rdy_3.Ox))
         .id_class(var0);
      Us_1.id_class(rdy_3.kn, 9).id_break(rdy_3.Ox).id_class("has_iron_ingot", id_class(rdy_3.Ox)).id_class(var0);
      UB.id_class(rdy_3.Oq)
         .id_class('#', rdy_3.OD)
         .id_class('X', rdy_3.Ox)
         .id_class("XXX")
         .id_class(" # ")
         .id_class(" # ")
         .id_class("has_iron_ingot", id_class(rdy_3.Ox))
         .id_class(var0);
      UB.id_class(rdy_3.Op)
         .id_class('#', rdy_3.OD)
         .id_class('X', rdy_3.Ox)
         .id_class("X")
         .id_class("#")
         .id_class("#")
         .id_class("has_iron_ingot", id_class(rdy_3.Ox))
         .id_class(var0);
      UB.id_class(rdy_3.Oy)
         .id_class('#', rdy_3.OD)
         .id_class('X', rdy_3.Ox)
         .id_class("X")
         .id_class("X")
         .id_class("#")
         .id_class("has_iron_ingot", id_class(rdy_3.Ox))
         .id_class(var0);
      UB.id_class(xu_3.Eu).id_class('#', rdy_3.Ox).id_class("##").id_class("##").id_class("has_iron_ingot", id_class(rdy_3.Ox)).id_class(var0);
      UB.id_class(rdy_3.dB)
         .id_class('#', rdy_3.OD)
         .id_class('X', rdy_3.ha)
         .id_class("###")
         .id_class("#X#")
         .id_class("###")
         .id_class("has_leather", id_class(rdy_3.ha))
         .id_class(var0);
      UB.id_class(xu_3.Pj)
         .id_class('#', rlc_3.id_byte)
         .id_class('X', rdy_3.OJ)
         .id_class("###")
         .id_class("#X#")
         .id_class("###")
         .id_class("has_diamond", id_class(rdy_3.OJ))
         .id_class(var0);
      UB.id_class(xu_3.PJ, 3).id_class('#', rdy_3.OD).id_class("# #").id_class("###").id_class("# #").id_class("has_stick", id_class(rdy_3.OD)).id_class(var0);
      UB.id_class(xu_3.Z).id_class('#', rdy_3.XF).id_class("###").id_class("###").id_class("###").id_class("has_lapis", id_class(rdy_3.XF)).id_class(var0);
      Us_1.id_class(rdy_3.XF, 9).id_break(xu_3.Z).id_class("has_lapis_block", id_class((rpL_2)xu_3.Z)).id_class(var0);
      UB.id_class(rdy_3.df, 2)
         .id_class('~', rdy_3.Oa)
         .id_class('O', rdy_3.XO)
         .id_class("~~ ")
         .id_class("~O ")
         .id_class("  ~")
         .id_class("has_slime_ball", id_class(rdy_3.XO))
         .id_class(var0);
      UB.id_class(rdy_3.ha).id_class('#', rdy_3.dp).id_class("##").id_class("##").id_class("has_rabbit_hide", id_class(rdy_3.dp)).id_class(var0);
      UB.id_class(rdy_3.hb).id_class('X', rdy_3.ha).id_class("X X").id_class("X X").id_class("has_leather", id_class(rdy_3.ha)).id_class(var0);
      UB.id_class(rdy_3.hE).id_class('X', rdy_3.ha).id_class("X X").id_class("XXX").id_class("XXX").id_class("has_leather", id_class(rdy_3.ha)).id_class(var0);
      UB.id_class(rdy_3.hs).id_class('X', rdy_3.ha).id_class("XXX").id_class("X X").id_class("has_leather", id_class(rdy_3.ha)).id_class(var0);
      UB.id_class(rdy_3.hG).id_class('X', rdy_3.ha).id_class("XXX").id_class("X X").id_class("X X").id_class("has_leather", id_class(rdy_3.ha)).id_class(var0);
      UB.id_class(rdy_3.dI).id_class('X', rdy_3.ha).id_class("X X").id_class("XXX").id_class("X X").id_class("has_leather", id_class(rdy_3.ha)).id_class(var0);
      UB.id_class(xu_3.Xs)
         .id_class('S', rlc_3.id_finally)
         .id_class('B', xu_3.rj)
         .id_class("SSS")
         .id_class(" B ")
         .id_class(" S ")
         .id_class("has_book", id_class(rdy_3.XM))
         .id_class(var0);
      UB.id_class(xu_3.Pu)
         .id_class('#', xu_3.id_volatile)
         .id_class('X', rdy_3.OD)
         .id_class("X")
         .id_class("#")
         .id_class("has_cobblestone", id_class((rpL_2)xu_3.id_volatile))
         .id_class(var0);
      Us_1.id_class(rdy_3.XC)
         .id_break(xu_3.rZ)
         .id_class("light_blue_dye")
         .id_class("has_red_flower", id_class((rpL_2)xu_3.rZ))
         .id_class(var0, "light_blue_dye_from_blue_orchid");
      Us_1.id_class(rdy_3.XC, 2)
         .id_break(rdy_3.Xw)
         .id_break(rdy_3.XL)
         .id_class("light_blue_dye")
         .id_class("has_blue_dye", id_class(rdy_3.Xw))
         .id_class("has_white_dye", id_class(rdy_3.XL))
         .id_class(var0, "light_blue_dye_from_blue_white_dye");
      Us_1.id_class(rdy_3.Xq)
         .id_break(xu_3.rF)
         .id_class("light_gray_dye")
         .id_class("has_red_flower", id_class((rpL_2)xu_3.rF))
         .id_class(var0, "light_gray_dye_from_azure_bluet");
      Us_1.id_class(rdy_3.Xq, 2)
         .id_break(rdy_3.Xp)
         .id_break(rdy_3.XL)
         .id_class("light_gray_dye")
         .id_class("has_gray_dye", id_class(rdy_3.Xp))
         .id_class("has_white_dye", id_class(rdy_3.XL))
         .id_class(var0, "light_gray_dye_from_gray_white_dye");
      Us_1.id_class(rdy_3.Xq, 3)
         .id_break(rdy_3.XV)
         .id_break(rdy_3.XL, 2)
         .id_class("light_gray_dye")
         .id_class("has_white_dye", id_class(rdy_3.XL))
         .id_class("has_black_dye", id_class(rdy_3.XV))
         .id_class(var0, "light_gray_dye_from_black_white_dye");
      Us_1.id_class(rdy_3.Xq)
         .id_break(xu_3.rl)
         .id_class("light_gray_dye")
         .id_class("has_red_flower", id_class((rpL_2)xu_3.rl))
         .id_class(var0, "light_gray_dye_from_oxeye_daisy");
      Us_1.id_class(rdy_3.Xq)
         .id_break(xu_3.rn)
         .id_class("light_gray_dye")
         .id_class("has_red_flower", id_class((rpL_2)xu_3.rn))
         .id_class(var0, "light_gray_dye_from_white_tulip");
      UB.id_class(xu_3.sv).id_class('#', rdy_3.Od).id_class("##").id_class("has_gold_ingot", id_class(rdy_3.Od)).id_class(var0);
      Us_1.id_class(rdy_3.XH, 2)
         .id_break(rdy_3.Xf)
         .id_break(rdy_3.XL)
         .id_class("has_green_dye", id_class(rdy_3.Xf))
         .id_class("has_white_dye", id_class(rdy_3.XL))
         .id_class(var0);
      UB.id_class(xu_3.BP)
         .id_class('A', xu_3.Br)
         .id_class('B', xu_3.rR)
         .id_class("A")
         .id_class("B")
         .id_class("has_carved_pumpkin", id_class((rpL_2)xu_3.Br))
         .id_class(var0);
      Us_1.id_class(rdy_3.Xn)
         .id_break(xu_3.rv)
         .id_class("magenta_dye")
         .id_class("has_red_flower", id_class((rpL_2)xu_3.rv))
         .id_class(var0, "magenta_dye_from_allium");
      Us_1.id_class(rdy_3.Xn, 4)
         .id_break(rdy_3.Xw)
         .id_break(rdy_3.Xj, 2)
         .id_break(rdy_3.XL)
         .id_class("magenta_dye")
         .id_class("has_blue_dye", id_class(rdy_3.Xw))
         .id_class("has_rose_red", id_class(rdy_3.Xj))
         .id_class("has_white_dye", id_class(rdy_3.XL))
         .id_class(var0, "magenta_dye_from_blue_red_white_dye");
      Us_1.id_class(rdy_3.Xn, 3)
         .id_break(rdy_3.Xw)
         .id_break(rdy_3.Xj)
         .id_break(rdy_3.Xy)
         .id_class("magenta_dye")
         .id_class("has_pink_dye", id_class(rdy_3.Xy))
         .id_class("has_blue_dye", id_class(rdy_3.Xw))
         .id_class("has_red_dye", id_class(rdy_3.Xj))
         .id_class(var0, "magenta_dye_from_blue_red_pink");
      Us_1.id_class(rdy_3.Xn, 2)
         .id_break(xu_3.GP)
         .id_class("magenta_dye")
         .id_class("has_double_plant", id_class((rpL_2)xu_3.GP))
         .id_class(var0, "magenta_dye_from_lilac");
      Us_1.id_class(rdy_3.Xn, 2)
         .id_break(rdy_3.Xt)
         .id_break(rdy_3.Xy)
         .id_class("magenta_dye")
         .id_class("has_pink_dye", id_class(rdy_3.Xy))
         .id_class("has_purple_dye", id_class(rdy_3.Xt))
         .id_class(var0, "magenta_dye_from_purple_and_pink");
      UB.id_class(xu_3.bV).id_class('#', rdy_3.Jy).id_class("##").id_class("##").id_class("has_magma_cream", id_class(rdy_3.Jy)).id_class(var0);
      Us_1.id_class(rdy_3.Jy).id_break(rdy_3.JH).id_break(rdy_3.XO).id_class("has_blaze_powder", id_class(rdy_3.JH)).id_class(var0);
      UB.id_class(rdy_3.dM)
         .id_class('#', rdy_3.Xb)
         .id_class('X', rdy_3.Xx)
         .id_class("###")
         .id_class("#X#")
         .id_class("###")
         .id_class("has_compass", id_class(rdy_3.Xx))
         .id_class(var0);
      UB.id_class(xu_3.Bg).id_class('M', rdy_3.Jx).id_class("MMM").id_class("MMM").id_class("MMM").id_class("has_melon", id_class(rdy_3.Jx)).id_class(var0);
      Us_1.id_class(rdy_3.JW).id_break(rdy_3.Jx).id_class("has_melon", id_class(rdy_3.Jx)).id_class(var0);
      UB.id_class(rdy_3.ho).id_class('#', rdy_3.Ox).id_class("# #").id_class("###").id_class("has_iron_ingot", id_class(rdy_3.Ox)).id_class(var0);
      Us_1.id_class(xu_3.rV).id_break(xu_3.id_volatile).id_break(xu_3.BD).id_class("has_vine", id_class((rpL_2)xu_3.BD)).id_class(var0);
      UB.id_class(xu_3.SL, 6).id_class('#', xu_3.rV).id_class("###").id_class("###").id_class("has_mossy_cobblestone", id_class((rpL_2)xu_3.rV)).id_class(var0);
      Us_1.id_class(xu_3.BA).id_break(xu_3.BL).id_break(xu_3.BD).id_class("has_mossy_cobblestone", id_class((rpL_2)xu_3.rV)).id_class(var0);
      Us_1.id_class(rdy_3.Oe)
         .id_break(xu_3.rq)
         .id_break(xu_3.rT)
         .id_break(rdy_3.OU)
         .id_class("has_mushroom_stew", id_class(rdy_3.Oe))
         .id_class("has_bowl", id_class(rdy_3.OU))
         .id_class("has_brown_mushroom", id_class((rpL_2)xu_3.rq))
         .id_class("has_red_mushroom", id_class((rpL_2)xu_3.rT))
         .id_class(var0);
      UB.id_class(xu_3.SP).id_class('N', rdy_3.dZ).id_class("NN").id_class("NN").id_class("has_netherbrick", id_class(rdy_3.dZ)).id_class(var0);
      UB.id_class(xu_3.SB, 6)
         .id_class('#', xu_3.SP)
         .id_class('-', rdy_3.dZ)
         .id_class("#-#")
         .id_class("#-#")
         .id_class("has_nether_brick", id_class((rpL_2)xu_3.SP))
         .id_class(var0);
      UB.id_class(xu_3.bs, 6).id_class('#', xu_3.SP).id_class("###").id_class("has_nether_brick", id_class((rpL_2)xu_3.SP)).id_class(var0);
      UB.id_class(xu_3.SS, 4)
         .id_class('#', xu_3.SP)
         .id_class("#  ")
         .id_class("## ")
         .id_class("###")
         .id_class("has_nether_brick", id_class((rpL_2)xu_3.SP))
         .id_class(var0);
      UB.id_class(xu_3.bg)
         .id_class('#', rdy_3.JL)
         .id_class("###")
         .id_class("###")
         .id_class("###")
         .id_class("has_nether_wart", id_class(rdy_3.JL))
         .id_class(var0);
      UB.id_class(xu_3.n)
         .id_class('#', rlc_3.id_byte)
         .id_class('X', rdy_3.hD)
         .id_class("###")
         .id_class("#X#")
         .id_class("###")
         .id_class("has_redstone", id_class(rdy_3.hD))
         .id_class(var0);
      UB.id_class(xu_3.bK)
         .id_class('Q', rdy_3.dv)
         .id_class('R', rdy_3.hD)
         .id_class('#', xu_3.id_volatile)
         .id_class("###")
         .id_class("RRQ")
         .id_class("###")
         .id_class("has_quartz", id_class(rdy_3.dv))
         .id_class(var0);
      Us_1.id_class(rdy_3.XA)
         .id_break(xu_3.rA)
         .id_class("orange_dye")
         .id_class("has_red_flower", id_class((rpL_2)xu_3.rA))
         .id_class(var0, "orange_dye_from_orange_tulip");
      Us_1.id_class(rdy_3.XA, 2)
         .id_break(rdy_3.Xj)
         .id_break(rdy_3.Xl)
         .id_class("orange_dye")
         .id_class("has_red_dye", id_class(rdy_3.Xj))
         .id_class("has_yellow_dye", id_class(rdy_3.Xl))
         .id_class(var0, "orange_dye_from_red_yellow");
      UB.id_class(rdy_3.hH)
         .id_class('#', rdy_3.OD)
         .id_class('X', rkg_3.id_class(rlc_3.id_break))
         .id_class("###")
         .id_class("#X#")
         .id_class("###")
         .id_class("has_wool", id_class(rlc_3.id_break))
         .id_class(var0);
      UB.id_class(rdy_3.Xb, 3).id_class('#', xu_3.Pf).id_class("###").id_class("has_reeds", id_class((rpL_2)xu_3.Pf)).id_class(var0);
      UB.id_class(xu_3.sp, 2)
         .id_class('#', xu_3.sH)
         .id_class("#")
         .id_class("#")
         .id_class("has_chiseled_quartz_block", id_class((rpL_2)xu_3.sy))
         .id_class("has_quartz_block", id_class((rpL_2)xu_3.sH))
         .id_class("has_quartz_pillar", id_class((rpL_2)xu_3.sp))
         .id_class(var0);
      Us_1.id_class(xu_3.Ei).id_break(xu_3.PT, 9).id_class("has_ice", id_class((rpL_2)xu_3.PT)).id_class(var0);
      Us_1.id_class(rdy_3.Xy, 2)
         .id_break(xu_3.GS)
         .id_class("pink_dye")
         .id_class("has_double_plant", id_class((rpL_2)xu_3.GS))
         .id_class(var0, "pink_dye_from_peony");
      Us_1.id_class(rdy_3.Xy)
         .id_break(xu_3.rC)
         .id_class("pink_dye")
         .id_class("has_red_flower", id_class((rpL_2)xu_3.rC))
         .id_class(var0, "pink_dye_from_pink_tulip");
      Us_1.id_class(rdy_3.Xy, 2)
         .id_break(rdy_3.Xj)
         .id_break(rdy_3.XL)
         .id_class("pink_dye")
         .id_class("has_white_dye", id_class(rdy_3.XL))
         .id_class("has_red_dye", id_class(rdy_3.Xj))
         .id_class(var0, "pink_dye_from_red_white_dye");
      UB.id_class(xu_3.rB)
         .id_class('R', rdy_3.hD)
         .id_class('#', xu_3.id_volatile)
         .id_class('T', rlc_3.id_byte)
         .id_class('X', rdy_3.Ox)
         .id_class("TTT")
         .id_class("#X#")
         .id_class("#R#")
         .id_class("has_redstone", id_class(rdy_3.hD))
         .id_class(var0);
      UB.id_class(xu_3.PD, 4).id_class('S', xu_3.PK).id_class("SS").id_class("SS").id_class("has_basalt", id_class((rpL_2)xu_3.PK)).id_class(var0);
      UB.id_class(xu_3.id_protected, 4)
         .id_class('S', xu_3.id_byte)
         .id_class("SS")
         .id_class("SS")
         .id_class("has_stone", id_class((rpL_2)xu_3.id_byte))
         .id_class(var0);
      UB.id_class(xu_3.id_case, 4)
         .id_class('S', xu_3.id_throws)
         .id_class("SS")
         .id_class("SS")
         .id_class("has_stone", id_class((rpL_2)xu_3.id_throws))
         .id_class(var0);
      UB.id_class(xu_3.id_private, 4)
         .id_class('S', xu_3.id_catch)
         .id_class("SS")
         .id_class("SS")
         .id_class("has_stone", id_class((rpL_2)xu_3.id_catch))
         .id_class(var0);
      UB.id_class(xu_3.Em).id_class('S', rdy_3.dA).id_class("SS").id_class("SS").id_class("has_prismarine_shard", id_class(rdy_3.dA)).id_class(var0);
      UB.id_class(xu_3.EZ)
         .id_class('S', rdy_3.dA)
         .id_class("SSS")
         .id_class("SSS")
         .id_class("SSS")
         .id_class("has_prismarine_shard", id_class(rdy_3.dA))
         .id_class(var0);
      UB.id_class(xu_3.En, 6).id_class('#', xu_3.Em).id_class("###").id_class("has_prismarine", id_class((rpL_2)xu_3.Em)).id_class(var0);
      UB.id_class(xu_3.EC, 6).id_class('#', xu_3.EZ).id_class("###").id_class("has_prismarine_bricks", id_class((rpL_2)xu_3.EZ)).id_class(var0);
      UB.id_class(xu_3.El, 6).id_class('#', xu_3.Ev).id_class("###").id_class("has_dark_prismarine", id_class((rpL_2)xu_3.Ev)).id_class(var0);
      Us_1.id_class(rdy_3.dN)
         .id_break(xu_3.Pg)
         .id_break(rdy_3.XY)
         .id_break(rdy_3.XJ)
         .id_class("has_carved_pumpkin", id_class((rpL_2)xu_3.Br))
         .id_class("has_pumpkin", id_class((rpL_2)xu_3.Pg))
         .id_class(var0);
      Us_1.id_class(rdy_3.Jk, 4).id_break(xu_3.Pg).id_class("has_pumpkin", id_class((rpL_2)xu_3.Pg)).id_class(var0);
      Us_1.id_class(rdy_3.Xt, 2)
         .id_break(rdy_3.Xw)
         .id_break(rdy_3.Xj)
         .id_class("has_blue_dye", id_class(rdy_3.Xw))
         .id_class("has_red_dye", id_class(rdy_3.Xj))
         .id_class(var0);
      UB.id_class(xu_3.bD)
         .id_class('#', xu_3.re)
         .id_class('-', rdy_3.kA)
         .id_class("-")
         .id_class("#")
         .id_class("-")
         .id_class("has_shulker_shell", id_class(rdy_3.kA))
         .id_class(var0);
      UB.id_class(xu_3.bH, 4).id_class('F', rdy_3.kh).id_class("FF").id_class("FF").id_class("has_chorus_fruit_popped", id_class(rdy_3.kh)).id_class(var0);
      UB.id_class(xu_3.by).id_class('#', xu_3.bM).id_class("#").id_class("#").id_class("has_purpur_block", id_class((rpL_2)xu_3.bH)).id_class(var0);
      UB.id_class(xu_3.bM, 6)
         .id_class('#', rkg_3.id_class(xu_3.bH, xu_3.by))
         .id_class("###")
         .id_class("has_purpur_block", id_class((rpL_2)xu_3.bH))
         .id_class(var0);
      UB.id_class(xu_3.bp, 4)
         .id_class('#', rkg_3.id_class(xu_3.bH, xu_3.by))
         .id_class("#  ")
         .id_class("## ")
         .id_class("###")
         .id_class("has_purpur_block", id_class((rpL_2)xu_3.bH))
         .id_class(var0);
      UB.id_class(xu_3.sH).id_class('#', rdy_3.dv).id_class("##").id_class("##").id_class("has_quartz", id_class(rdy_3.dv)).id_class(var0);
      UB.id_class(xu_3.Jj, 4).id_class('#', xu_3.sH).id_class("##").id_class("##").id_class("has_quartz_block", id_class((rpL_2)xu_3.sH)).id_class(var0);
      UB.id_class(xu_3.bE, 6)
         .id_class('#', rkg_3.id_class(xu_3.sy, xu_3.sH, xu_3.sp))
         .id_class("###")
         .id_class("has_chiseled_quartz_block", id_class((rpL_2)xu_3.sy))
         .id_class("has_quartz_block", id_class((rpL_2)xu_3.sH))
         .id_class("has_quartz_pillar", id_class((rpL_2)xu_3.sp))
         .id_class(var0);
      UB.id_class(xu_3.sq, 4)
         .id_class('#', rkg_3.id_class(xu_3.sy, xu_3.sH, xu_3.sp))
         .id_class("#  ")
         .id_class("## ")
         .id_class("###")
         .id_class("has_chiseled_quartz_block", id_class((rpL_2)xu_3.sy))
         .id_class("has_quartz_block", id_class((rpL_2)xu_3.sH))
         .id_class("has_quartz_pillar", id_class((rpL_2)xu_3.sp))
         .id_class(var0);
      Us_1.id_class(rdy_3.dH)
         .id_break(rdy_3.dG)
         .id_break(rdy_3.dl)
         .id_break(rdy_3.OU)
         .id_break(rdy_3.ds)
         .id_break(xu_3.rq)
         .id_class("rabbit_stew")
         .id_class("has_cooked_rabbit", id_class(rdy_3.dl))
         .id_class(var0, "rabbit_stew_from_brown_mushroom");
      Us_1.id_class(rdy_3.dH)
         .id_break(rdy_3.dG)
         .id_break(rdy_3.dl)
         .id_break(rdy_3.OU)
         .id_break(rdy_3.ds)
         .id_break(xu_3.rT)
         .id_class("rabbit_stew")
         .id_class("has_cooked_rabbit", id_class(rdy_3.dl))
         .id_class(var0, "rabbit_stew_from_red_mushroom");
      UB.id_class(xu_3.Px, 16)
         .id_class('#', rdy_3.OD)
         .id_class('X', rdy_3.Ox)
         .id_class("X X")
         .id_class("X#X")
         .id_class("X X")
         .id_class("has_minecart", id_class(rdy_3.ho))
         .id_class(var0);
      Us_1.id_class(rdy_3.hD, 9).id_break(xu_3.sn).id_class("has_redstone_block", id_class((rpL_2)xu_3.sn)).id_class(var0);
      UB.id_class(xu_3.sn).id_class('#', rdy_3.hD).id_class("###").id_class("###").id_class("###").id_class("has_redstone", id_class(rdy_3.hD)).id_class(var0);
      UB.id_class(xu_3.SJ)
         .id_class('R', rdy_3.hD)
         .id_class('G', xu_3.Pa)
         .id_class(" R ")
         .id_class("RGR")
         .id_class(" R ")
         .id_class("has_glowstone", id_class((rpL_2)xu_3.Pa))
         .id_class(var0);
      UB.id_class(xu_3.PH)
         .id_class('#', rdy_3.OD)
         .id_class('X', rdy_3.hD)
         .id_class("X")
         .id_class("#")
         .id_class("has_redstone", id_class(rdy_3.hD))
         .id_class(var0);
      Us_1.id_class(rdy_3.Xj).id_break(rdy_3.kX).id_class("red_dye").id_class("has_beetroot", id_class(rdy_3.kX)).id_class(var0, "red_dye_from_beetroot");
      Us_1.id_class(rdy_3.Xj).id_break(xu_3.rm).id_class("red_dye").id_class("has_red_flower", id_class((rpL_2)xu_3.rm)).id_class(var0, "red_dye_from_poppy");
      Us_1.id_class(rdy_3.Xj, 2)
         .id_break(xu_3.GB)
         .id_class("red_dye")
         .id_class("has_double_plant", id_class((rpL_2)xu_3.GB))
         .id_class(var0, "red_dye_from_rose_bush");
      Us_1.id_class(rdy_3.Xj).id_break(xu_3.rL).id_class("red_dye").id_class("has_red_flower", id_class((rpL_2)xu_3.rL)).id_class(var0, "red_dye_from_tulip");
      UB.id_class(xu_3.bR)
         .id_class('W', rdy_3.JL)
         .id_class('N', rdy_3.dZ)
         .id_class("NW")
         .id_class("WN")
         .id_class("has_nether_wart", id_class(rdy_3.JL))
         .id_class(var0);
      UB.id_class(xu_3.GI)
         .id_class('#', xu_3.id_interface)
         .id_class("##")
         .id_class("##")
         .id_class("has_sand", id_class((rpL_2)xu_3.id_interface))
         .id_class(var0);
      UB.id_class(xu_3.bG, 6)
         .id_class('#', rkg_3.id_class(xu_3.GI, xu_3.Gf))
         .id_class("###")
         .id_class("has_red_sandstone", id_class((rpL_2)xu_3.GI))
         .id_class("has_chiseled_red_sandstone", id_class((rpL_2)xu_3.Gf))
         .id_class(var0);
      UB.id_class(xu_3.bb, 6).id_class('#', xu_3.Gj).id_class("###").id_class("has_cut_red_sandstone", id_class((rpL_2)xu_3.Gj)).id_class(var0);
      UB.id_class(xu_3.GV, 4)
         .id_class('#', rkg_3.id_class(xu_3.GI, xu_3.Gf, xu_3.Gj))
         .id_class("#  ")
         .id_class("## ")
         .id_class("###")
         .id_class("has_red_sandstone", id_class((rpL_2)xu_3.GI))
         .id_class("has_chiseled_red_sandstone", id_class((rpL_2)xu_3.Gf))
         .id_class("has_cut_red_sandstone", id_class((rpL_2)xu_3.Gj))
         .id_class(var0);
      UB.id_class(xu_3.BS)
         .id_class('#', xu_3.PH)
         .id_class('X', rdy_3.hD)
         .id_class('I', xu_3.id_break)
         .id_class("#X#")
         .id_class("III")
         .id_class("has_redstone_torch", id_class((rpL_2)xu_3.PH))
         .id_class(var0);
      UB.id_class(xu_3.F).id_class('#', xu_3.id_throw).id_class("##").id_class("##").id_class("has_sand", id_class((rpL_2)xu_3.id_throw)).id_class(var0);
      UB.id_class(xu_3.Ga, 6)
         .id_class('#', rkg_3.id_class(xu_3.F, xu_3.L))
         .id_class("###")
         .id_class("has_sandstone", id_class((rpL_2)xu_3.F))
         .id_class("has_chiseled_sandstone", id_class((rpL_2)xu_3.L))
         .id_class(var0);
      UB.id_class(xu_3.Gi, 6).id_class('#', xu_3.A).id_class("###").id_class("has_cut_sandstone", id_class((rpL_2)xu_3.A)).id_class(var0);
      UB.id_class(xu_3.Sd, 4)
         .id_class('#', rkg_3.id_class(xu_3.F, xu_3.L, xu_3.A))
         .id_class("#  ")
         .id_class("## ")
         .id_class("###")
         .id_class("has_sandstone", id_class((rpL_2)xu_3.F))
         .id_class("has_chiseled_sandstone", id_class((rpL_2)xu_3.L))
         .id_class("has_cut_sandstone", id_class((rpL_2)xu_3.A))
         .id_class(var0);
      UB.id_class(xu_3.EH)
         .id_class('S', rdy_3.dA)
         .id_class('C', rdy_3.dn)
         .id_class("SCS")
         .id_class("CCC")
         .id_class("SCS")
         .id_class("has_prismarine_crystals", id_class(rdy_3.dn))
         .id_class(var0);
      UB.id_class(rdy_3.JJ).id_class('#', rdy_3.Ox).id_class(" #").id_class("# ").id_class("has_iron_ingot", id_class(rdy_3.Ox)).id_class(var0);
      UB.id_class(rdy_3.kN)
         .id_class('W', rlc_3.id_byte)
         .id_class('o', rdy_3.Ox)
         .id_class("WoW")
         .id_class("WWW")
         .id_class(" W ")
         .id_class("has_iron_ingot", id_class(rdy_3.Ox))
         .id_class(var0);
      UB.id_class(xu_3.EN)
         .id_class('#', rdy_3.XO)
         .id_class("###")
         .id_class("###")
         .id_class("###")
         .id_class("has_slime_ball", id_class(rdy_3.XO))
         .id_class(var0);
      Us_1.id_class(rdy_3.XO, 9).id_break(xu_3.EN).id_class("has_slime", id_class((rpL_2)xu_3.EN)).id_class(var0);
      UB.id_class(xu_3.Gj, 4).id_class('#', xu_3.GI).id_class("##").id_class("##").id_class("has_red_sandstone", id_class((rpL_2)xu_3.GI)).id_class(var0);
      UB.id_class(xu_3.A, 4).id_class('#', xu_3.F).id_class("##").id_class("##").id_class("has_sandstone", id_class((rpL_2)xu_3.F)).id_class(var0);
      UB.id_class(xu_3.Pt).id_class('#', rdy_3.hU).id_class("##").id_class("##").id_class("has_snowball", id_class(rdy_3.hU)).id_class(var0);
      UB.id_class(xu_3.Pq, 6).id_class('#', xu_3.Pt).id_class("###").id_class("has_snowball", id_class(rdy_3.hU)).id_class(var0);
      UB.id_class(xu_3.XX)
         .id_class('L', rlc_3.id_new)
         .id_class('S', rdy_3.OD)
         .id_class('#', rlc_3.id_for)
         .id_class(" S ")
         .id_class("S#S")
         .id_class("LLL")
         .id_class("has_stick", id_class(rdy_3.OD))
         .id_class("has_soul_sand", id_class(rlc_3.id_for))
         .id_class(var0);
      UB.id_class(rdy_3.Jt)
         .id_class('#', rdy_3.JF)
         .id_class('X', rdy_3.Jx)
         .id_class("###")
         .id_class("#X#")
         .id_class("###")
         .id_class("has_melon", id_class(rdy_3.Jx))
         .id_class(var0);
      UB.id_class(rdy_3.kW, 2)
         .id_class('#', rdy_3.XW)
         .id_class('X', rdy_3.OO)
         .id_class(" # ")
         .id_class("#X#")
         .id_class(" # ")
         .id_class("has_glowstone_dust", id_class(rdy_3.XW))
         .id_class(var0);
      UB.id_class(rdy_3.OD, 4)
         .id_class('#', rlc_3.id_byte)
         .id_class("#")
         .id_class("#")
         .id_break("sticks")
         .id_class("has_planks", id_class(rlc_3.id_byte))
         .id_class(var0);
      UB.id_class(rdy_3.OD, 1)
         .id_class('#', xu_3.hs)
         .id_class("#")
         .id_class("#")
         .id_break("sticks")
         .id_class("has_bamboo", id_class((rpL_2)xu_3.hs))
         .id_class(var0, "stick_from_bamboo_item");
      UB.id_class(xu_3.D)
         .id_class('P', xu_3.rB)
         .id_class('S', rdy_3.XO)
         .id_class("S")
         .id_class("P")
         .id_class("has_slime_ball", id_class(rdy_3.XO))
         .id_class(var0);
      UB.id_class(xu_3.BL, 4).id_class('#', xu_3.id_break).id_class("##").id_class("##").id_class("has_stone", id_class((rpL_2)xu_3.id_break)).id_class(var0);
      UB.id_class(rdy_3.OF)
         .id_class('#', rdy_3.OD)
         .id_class('X', rlc_3.b)
         .id_class("XX")
         .id_class("X#")
         .id_class(" #")
         .id_class("has_cobblestone", id_class(rlc_3.b))
         .id_class(var0);
      UB.id_class(xu_3.bS, 6).id_class('#', xu_3.BL).id_class("###").id_class("has_stone_bricks", id_class(rlc_3.id_protected)).id_class(var0);
      UB.id_class(xu_3.Ba, 4)
         .id_class('#', xu_3.BL)
         .id_class("#  ")
         .id_class("## ")
         .id_class("###")
         .id_class("has_stone_bricks", id_class(rlc_3.id_protected))
         .id_class(var0);
      Us_1.id_class(xu_3.Pp).id_break(xu_3.id_break).id_class("has_stone", id_class((rpL_2)xu_3.id_break)).id_class(var0);
      UB.id_class(rdy_3.OL)
         .id_class('#', rdy_3.OD)
         .id_class('X', rlc_3.b)
         .id_class("XX")
         .id_class(" #")
         .id_class(" #")
         .id_class("has_cobblestone", id_class(rlc_3.b))
         .id_class(var0);
      UB.id_class(rdy_3.Ov)
         .id_class('#', rdy_3.OD)
         .id_class('X', rlc_3.b)
         .id_class("XXX")
         .id_class(" # ")
         .id_class(" # ")
         .id_class("has_cobblestone", id_class(rlc_3.b))
         .id_class(var0);
      UB.id_class(xu_3.Pm).id_class('#', xu_3.id_break).id_class("##").id_class("has_stone", id_class((rpL_2)xu_3.id_break)).id_class(var0);
      UB.id_class(rdy_3.OZ)
         .id_class('#', rdy_3.OD)
         .id_class('X', rlc_3.b)
         .id_class("X")
         .id_class("#")
         .id_class("#")
         .id_class("has_cobblestone", id_class(rlc_3.b))
         .id_class(var0);
      UB.id_class(xu_3.GU, 6).id_class('#', xu_3.id_break).id_class("###").id_class("has_stone", id_class((rpL_2)xu_3.id_break)).id_class(var0);
      UB.id_class(xu_3.Ge, 6).id_class('#', xu_3.bO).id_class("###").id_class("has_smooth_stone", id_class((rpL_2)xu_3.bO)).id_class(var0);
      UB.id_class(xu_3.Pd, 4)
         .id_class('#', xu_3.id_volatile)
         .id_class("#  ")
         .id_class("## ")
         .id_class("###")
         .id_class("has_cobblestone", id_class((rpL_2)xu_3.id_volatile))
         .id_class(var0);
      UB.id_class(rdy_3.Om)
         .id_class('#', rdy_3.OD)
         .id_class('X', rlc_3.b)
         .id_class("X")
         .id_class("X")
         .id_class("#")
         .id_class("has_cobblestone", id_class(rlc_3.b))
         .id_class(var0);
      UB.id_class(xu_3.rs)
         .id_class('#', rdy_3.Oa)
         .id_class("##")
         .id_class("##")
         .id_class("has_string", id_class(rdy_3.Oa))
         .id_class(var0, "white_wool_from_string");
      Us_1.id_class(rdy_3.XY).id_break(xu_3.Pf).id_class("sugar").id_class("has_reeds", id_class((rpL_2)xu_3.Pf)).id_class(var0, "sugar_from_sugar_cane");
      Us_1.id_class(rdy_3.XY, 3)
         .id_break(rdy_3.WF)
         .id_class("sugar")
         .id_class("has_honey_bottle", id_class(rdy_3.WF))
         .id_class(var0, "sugar_from_honey_bottle");
      UB.id_class(xu_3.Jb)
         .id_class('H', rdy_3.sR)
         .id_class('R', rdy_3.hD)
         .id_class(" R ")
         .id_class("RHR")
         .id_class(" R ")
         .id_class("has_redstone", id_class(rdy_3.hD))
         .id_class("has_hay_block", id_class((rpL_2)xu_3.Ey))
         .id_class(var0);
      UB.id_class(xu_3.rf)
         .id_class('#', rkg_3.id_class(xu_3.id_throw, xu_3.id_interface))
         .id_class('X', rdy_3.hr)
         .id_class("X#X")
         .id_class("#X#")
         .id_class("X#X")
         .id_class("has_gunpowder", id_class(rdy_3.hr))
         .id_class(var0);
      UB.id_class(rdy_3.dF)
         .id_class('A', xu_3.rf)
         .id_class('B', rdy_3.ho)
         .id_class("A")
         .id_class("B")
         .id_class("has_minecart", id_class(rdy_3.ho))
         .id_class(var0);
      UB.id_class(xu_3.rR, 4)
         .id_class('#', rdy_3.OD)
         .id_class('X', rkg_3.id_class(rdy_3.Oh, rdy_3.OX))
         .id_class("X")
         .id_class("#")
         .id_class("has_stone_pickaxe", id_class(rdy_3.Ov))
         .id_class(var0);
      UB.id_class(xu_3.PU, 4)
         .id_class('X', rkg_3.id_class(rdy_3.Oh, rdy_3.OX))
         .id_class('#', rdy_3.OD)
         .id_class('S', rlc_3.id_for)
         .id_class("X")
         .id_class("#")
         .id_class("S")
         .id_class("has_soul_sand", id_class(rlc_3.id_for))
         .id_class(var0);
      UB.id_class(xu_3.XM)
         .id_class('#', rdy_3.Pu)
         .id_class('X', rdy_3.kn)
         .id_class("XXX")
         .id_class("X#X")
         .id_class("XXX")
         .id_class("has_iron_nugget", id_class(rdy_3.kn))
         .id_class("has_iron_ingot", id_class(rdy_3.Ox))
         .id_class(var0);
      UB.id_class(xu_3.XO)
         .id_class('#', rdy_3.Bu)
         .id_class('X', rdy_3.kn)
         .id_class("XXX")
         .id_class("X#X")
         .id_class("XXX")
         .id_class("has_soul_torch", id_class(rdy_3.Bu))
         .id_class(var0);
      Us_1.id_class(xu_3.sZ).id_break(xu_3.re).id_break(xu_3.Sz).id_class("has_tripwire_hook", id_class((rpL_2)xu_3.Sz)).id_class(var0);
      UB.id_class(xu_3.Sz, 2)
         .id_class('#', rlc_3.id_byte)
         .id_class('S', rdy_3.OD)
         .id_class('I', rdy_3.Ox)
         .id_class("I")
         .id_class("S")
         .id_class("#")
         .id_class("has_string", id_class(rdy_3.Oa))
         .id_class(var0);
      UB.id_class(rdy_3.Os).id_class('X', rdy_3.OE).id_class("XXX").id_class("X X").id_class("has_scute", id_class(rdy_3.OE)).id_class(var0);
      Us_1.id_class(rdy_3.hB, 9).id_break(xu_3.Ey).id_class("has_hay_block", id_class((rpL_2)xu_3.Ey)).id_class(var0);
      Us_1.id_class(rdy_3.XL).id_break(rdy_3.Xg).id_class("white_dye").id_class("has_bone_meal", id_class(rdy_3.Xg)).id_class(var0);
      Us_1.id_class(rdy_3.XL)
         .id_break(xu_3.rp)
         .id_class("white_dye")
         .id_class("has_white_flower", id_class((rpL_2)xu_3.rp))
         .id_class(var0, "white_dye_from_lily_of_the_valley");
      UB.id_class(rdy_3.Oc)
         .id_class('#', rdy_3.OD)
         .id_class('X', rlc_3.id_byte)
         .id_class("XX")
         .id_class("X#")
         .id_class(" #")
         .id_class("has_stick", id_class(rdy_3.OD))
         .id_class(var0);
      UB.id_class(rdy_3.Ou)
         .id_class('#', rdy_3.OD)
         .id_class('X', rlc_3.id_byte)
         .id_class("XX")
         .id_class(" #")
         .id_class(" #")
         .id_class("has_stick", id_class(rdy_3.OD))
         .id_class(var0);
      UB.id_class(rdy_3.ON)
         .id_class('#', rdy_3.OD)
         .id_class('X', rlc_3.id_byte)
         .id_class("XXX")
         .id_class(" # ")
         .id_class(" # ")
         .id_class("has_stick", id_class(rdy_3.OD))
         .id_class(var0);
      UB.id_class(rdy_3.OQ)
         .id_class('#', rdy_3.OD)
         .id_class('X', rlc_3.id_byte)
         .id_class("X")
         .id_class("#")
         .id_class("#")
         .id_class("has_stick", id_class(rdy_3.OD))
         .id_class(var0);
      UB.id_class(rdy_3.Oz)
         .id_class('#', rdy_3.OD)
         .id_class('X', rlc_3.id_byte)
         .id_class("X")
         .id_class("X")
         .id_class("#")
         .id_class("has_stick", id_class(rdy_3.OD))
         .id_class(var0);
      Us_1.id_class(rdy_3.xi).id_break(rdy_3.XM).id_break(rdy_3.XZ).id_break(rdy_3.Oi).id_class("has_book", id_class(rdy_3.XM)).id_class(var0);
      Us_1.id_class(rdy_3.Xl)
         .id_break(xu_3.ru)
         .id_class("yellow_dye")
         .id_class("has_yellow_flower", id_class((rpL_2)xu_3.ru))
         .id_class(var0, "yellow_dye_from_dandelion");
      Us_1.id_class(rdy_3.Xl, 2)
         .id_break(xu_3.Gr)
         .id_class("yellow_dye")
         .id_class("has_double_plant", id_class((rpL_2)xu_3.Gr))
         .id_class(var0, "yellow_dye_from_sunflower");
      Us_1.id_class(rdy_3.Jd, 9).id_break(xu_3.Oh).id_class("has_dried_kelp_block", id_class((rpL_2)xu_3.Oh)).id_class(var0);
      Us_1.id_class(xu_3.Oh).id_break(rdy_3.Jd, 9).id_class("has_dried_kelp", id_class(rdy_3.Jd)).id_class(var0);
      UB.id_class(xu_3.hB)
         .id_class('#', rdy_3.kK)
         .id_class('X', rdy_3.kD)
         .id_class("###")
         .id_class("#X#")
         .id_class("###")
         .id_class("has_nautilus_core", id_class(rdy_3.kD))
         .id_class("has_nautilus_shell", id_class(rdy_3.kK))
         .id_class(var0);
      UB.id_class(xu_3.hO, 4)
         .id_class('#', xu_3.id_protected)
         .id_class("#  ")
         .id_class("## ")
         .id_class("###")
         .id_class("has_polished_granite", id_class((rpL_2)xu_3.id_protected))
         .id_class(var0);
      UB.id_class(xu_3.hh, 4)
         .id_class('#', xu_3.bJ)
         .id_class("#  ")
         .id_class("## ")
         .id_class("###")
         .id_class("has_smooth_red_sandstone", id_class((rpL_2)xu_3.bJ))
         .id_class(var0);
      UB.id_class(xu_3.hX, 4)
         .id_class('#', xu_3.BA)
         .id_class("#  ")
         .id_class("## ")
         .id_class("###")
         .id_class("has_mossy_stone_bricks", id_class((rpL_2)xu_3.BA))
         .id_class(var0);
      UB.id_class(xu_3.hJ, 4)
         .id_class('#', xu_3.id_case)
         .id_class("#  ")
         .id_class("## ")
         .id_class("###")
         .id_class("has_polished_diorite", id_class((rpL_2)xu_3.id_case))
         .id_class(var0);
      UB.id_class(xu_3.hx, 4)
         .id_class('#', xu_3.rV)
         .id_class("#  ")
         .id_class("## ")
         .id_class("###")
         .id_class("has_mossy_cobblestone", id_class((rpL_2)xu_3.rV))
         .id_class(var0);
      UB.id_class(xu_3.hd, 4)
         .id_class('#', xu_3.bq)
         .id_class("#  ")
         .id_class("## ")
         .id_class("###")
         .id_class("has_end_stone_bricks", id_class((rpL_2)xu_3.bq))
         .id_class(var0);
      UB.id_class(xu_3.hk, 4)
         .id_class('#', xu_3.id_break)
         .id_class("#  ")
         .id_class("## ")
         .id_class("###")
         .id_class("has_stone", id_class((rpL_2)xu_3.id_break))
         .id_class(var0);
      UB.id_class(xu_3.hW, 4)
         .id_class('#', xu_3.bh)
         .id_class("#  ")
         .id_class("## ")
         .id_class("###")
         .id_class("has_smooth_sandstone", id_class((rpL_2)xu_3.bh))
         .id_class(var0);
      UB.id_class(xu_3.hz, 4)
         .id_class('#', xu_3.bX)
         .id_class("#  ")
         .id_class("## ")
         .id_class("###")
         .id_class("has_smooth_quartz", id_class((rpL_2)xu_3.bX))
         .id_class(var0);
      UB.id_class(xu_3.hQ, 4)
         .id_class('#', xu_3.id_byte)
         .id_class("#  ")
         .id_class("## ")
         .id_class("###")
         .id_class("has_granite", id_class((rpL_2)xu_3.id_byte))
         .id_class(var0);
      UB.id_class(xu_3.hN, 4)
         .id_class('#', xu_3.id_catch)
         .id_class("#  ")
         .id_class("## ")
         .id_class("###")
         .id_class("has_andesite", id_class((rpL_2)xu_3.id_catch))
         .id_class(var0);
      UB.id_class(xu_3.hc, 4)
         .id_class('#', xu_3.bR)
         .id_class("#  ")
         .id_class("## ")
         .id_class("###")
         .id_class("has_red_nether_bricks", id_class((rpL_2)xu_3.bR))
         .id_class(var0);
      UB.id_class(xu_3.hu, 4)
         .id_class('#', xu_3.id_private)
         .id_class("#  ")
         .id_class("## ")
         .id_class("###")
         .id_class("has_polished_andesite", id_class((rpL_2)xu_3.id_private))
         .id_class(var0);
      UB.id_class(xu_3.hm, 4)
         .id_class('#', xu_3.id_throws)
         .id_class("#  ")
         .id_class("## ")
         .id_class("###")
         .id_class("has_diorite", id_class((rpL_2)xu_3.id_throws))
         .id_class(var0);
      UB.id_class(xu_3.hZ, 6)
         .id_class('#', xu_3.id_protected)
         .id_class("###")
         .id_class("has_polished_granite", id_class((rpL_2)xu_3.id_protected))
         .id_class(var0);
      UB.id_class(xu_3.hv, 6).id_class('#', xu_3.bJ).id_class("###").id_class("has_smooth_red_sandstone", id_class((rpL_2)xu_3.bJ)).id_class(var0);
      UB.id_class(xu_3.hF, 6).id_class('#', xu_3.BA).id_class("###").id_class("has_mossy_stone_bricks", id_class((rpL_2)xu_3.BA)).id_class(var0);
      UB.id_class(xu_3.hL, 6).id_class('#', xu_3.id_case).id_class("###").id_class("has_polished_diorite", id_class((rpL_2)xu_3.id_case)).id_class(var0);
      UB.id_class(xu_3.hA, 6).id_class('#', xu_3.rV).id_class("###").id_class("has_mossy_cobblestone", id_class((rpL_2)xu_3.rV)).id_class(var0);
      UB.id_class(xu_3.hn, 6).id_class('#', xu_3.bq).id_class("###").id_class("has_end_stone_bricks", id_class((rpL_2)xu_3.bq)).id_class(var0);
      UB.id_class(xu_3.hC, 6).id_class('#', xu_3.bh).id_class("###").id_class("has_smooth_sandstone", id_class((rpL_2)xu_3.bh)).id_class(var0);
      UB.id_class(xu_3.hl, 6).id_class('#', xu_3.bX).id_class("###").id_class("has_smooth_quartz", id_class((rpL_2)xu_3.bX)).id_class(var0);
      UB.id_class(xu_3.hH, 6).id_class('#', xu_3.id_byte).id_class("###").id_class("has_granite", id_class((rpL_2)xu_3.id_byte)).id_class(var0);
      UB.id_class(xu_3.hy, 6).id_class('#', xu_3.id_catch).id_class("###").id_class("has_andesite", id_class((rpL_2)xu_3.id_catch)).id_class(var0);
      UB.id_class(xu_3.hp, 6).id_class('#', xu_3.bR).id_class("###").id_class("has_red_nether_bricks", id_class((rpL_2)xu_3.bR)).id_class(var0);
      UB.id_class(xu_3.hq, 6).id_class('#', xu_3.id_private).id_class("###").id_class("has_polished_andesite", id_class((rpL_2)xu_3.id_private)).id_class(var0);
      UB.id_class(xu_3.hT, 6).id_class('#', xu_3.id_throws).id_class("###").id_class("has_diorite", id_class((rpL_2)xu_3.id_throws)).id_class(var0);
      UB.id_class(xu_3.ht, 6).id_class('#', xu_3.rI).id_class("###").id_class("###").id_class("has_bricks", id_class((rpL_2)xu_3.rI)).id_class(var0);
      UB.id_class(xu_3.hw, 6).id_class('#', xu_3.Em).id_class("###").id_class("###").id_class("has_prismarine", id_class((rpL_2)xu_3.Em)).id_class(var0);
      UB.id_class(xu_3.hI, 6).id_class('#', xu_3.GI).id_class("###").id_class("###").id_class("has_red_sandstone", id_class((rpL_2)xu_3.GI)).id_class(var0);
      UB.id_class(xu_3.hf, 6)
         .id_class('#', xu_3.BA)
         .id_class("###")
         .id_class("###")
         .id_class("has_mossy_stone_bricks", id_class((rpL_2)xu_3.BA))
         .id_class(var0);
      UB.id_class(xu_3.hj, 6).id_class('#', xu_3.id_byte).id_class("###").id_class("###").id_class("has_granite", id_class((rpL_2)xu_3.id_byte)).id_class(var0);
      UB.id_class(xu_3.hV, 6).id_class('#', xu_3.BL).id_class("###").id_class("###").id_class("has_stone_bricks", id_class((rpL_2)xu_3.BL)).id_class(var0);
      UB.id_class(xu_3.hg, 6).id_class('#', xu_3.SP).id_class("###").id_class("###").id_class("has_nether_bricks", id_class((rpL_2)xu_3.SP)).id_class(var0);
      UB.id_class(xu_3.hR, 6)
         .id_class('#', xu_3.id_catch)
         .id_class("###")
         .id_class("###")
         .id_class("has_andesite", id_class((rpL_2)xu_3.id_catch))
         .id_class(var0);
      UB.id_class(xu_3.hY, 6).id_class('#', xu_3.bR).id_class("###").id_class("###").id_class("has_red_nether_bricks", id_class((rpL_2)xu_3.bR)).id_class(var0);
      UB.id_class(xu_3.ho, 6).id_class('#', xu_3.F).id_class("###").id_class("###").id_class("has_sandstone", id_class((rpL_2)xu_3.F)).id_class(var0);
      UB.id_class(xu_3.hK, 6).id_class('#', xu_3.bq).id_class("###").id_class("###").id_class("has_end_stone_bricks", id_class((rpL_2)xu_3.bq)).id_class(var0);
      UB.id_class(xu_3.hD, 6)
         .id_class('#', xu_3.id_throws)
         .id_class("###")
         .id_class("###")
         .id_class("has_diorite", id_class((rpL_2)xu_3.id_throws))
         .id_class(var0);
      Us_1.id_class(rdy_3.Wr).id_break(rdy_3.Xb).id_break(rdy_3.dd).id_class("has_creeper_head", id_class(rdy_3.dd)).id_class(var0);
      Us_1.id_class(rdy_3.WP).id_break(rdy_3.Xb).id_break(rdy_3.dX).id_class("has_wither_skeleton_skull", id_class(rdy_3.dX)).id_class(var0);
      Us_1.id_class(rdy_3.ki).id_break(rdy_3.Xb).id_break(xu_3.rl).id_class("has_oxeye_daisy", id_class((rpL_2)xu_3.rl)).id_class(var0);
      Us_1.id_class(rdy_3.WB).id_break(rdy_3.Xb).id_break(rdy_3.hp).id_class("has_enchanted_golden_apple", id_class(rdy_3.hp)).id_class(var0);
      UB.id_class(xu_3.hU, 6)
         .id_class('~', rdy_3.Oa)
         .id_class('I', xu_3.hs)
         .id_class("I~I")
         .id_class("I I")
         .id_class("I I")
         .id_class("has_bamboo", id_class((rpL_2)xu_3.hs))
         .id_class(var0);
      UB.id_class(xu_3.XS)
         .id_class('I', rdy_3.OD)
         .id_class('-', xu_3.GU)
         .id_class('#', rlc_3.id_byte)
         .id_class("I-I")
         .id_class("# #")
         .id_class("has_stone_slab", id_class((rpL_2)xu_3.GU))
         .id_class(var0);
      UB.id_class(xu_3.Xr)
         .id_class('#', xu_3.bO)
         .id_class('X', xu_3.Ps)
         .id_class('I', rdy_3.Ox)
         .id_class("III")
         .id_class("IXI")
         .id_class("###")
         .id_class("has_smooth_stone", id_class((rpL_2)xu_3.bO))
         .id_class(var0);
      UB.id_class(xu_3.hi)
         .id_class('#', rlc_3.id_new)
         .id_class('X', xu_3.Ps)
         .id_class(" # ")
         .id_class("#X#")
         .id_class(" # ")
         .id_class("has_furnace", id_class((rpL_2)xu_3.Ps))
         .id_class(var0);
      UB.id_class(xu_3.XP)
         .id_class('#', rlc_3.id_byte)
         .id_class('@', rdy_3.Xb)
         .id_class("@@")
         .id_class("##")
         .id_class("##")
         .id_class("has_paper", id_class(rdy_3.Xb))
         .id_class(var0);
      UB.id_class(xu_3.XE)
         .id_class('#', rlc_3.id_byte)
         .id_class('@', rdy_3.Ox)
         .id_class("@@")
         .id_class("##")
         .id_class("##")
         .id_class("has_iron_ingot", id_class(rdy_3.Ox))
         .id_class(var0);
      UB.id_class(xu_3.XB)
         .id_class('#', rlc_3.id_byte)
         .id_class('@', rdy_3.hn)
         .id_class("@@")
         .id_class("##")
         .id_class("##")
         .id_class("has_flint", id_class(rdy_3.hn))
         .id_class(var0);
      UB.id_class(xu_3.XG)
         .id_class('I', rdy_3.Ox)
         .id_class('#', xu_3.id_break)
         .id_class(" I ")
         .id_class("###")
         .id_class("has_stone", id_class((rpL_2)xu_3.id_break))
         .id_class(var0);
      UB.id_class(xu_3.Jc)
         .id_class('S', rdy_3.BV)
         .id_class('#', rdy_3.Ok)
         .id_class("SSS")
         .id_class("S#S")
         .id_class("SSS")
         .id_class("has_netherite_ingot", id_class(rdy_3.Ok))
         .id_class(var0);
      UB.id_class(xu_3.JJ)
         .id_class('#', rdy_3.Ok)
         .id_class("###")
         .id_class("###")
         .id_class("###")
         .id_class("has_netherite_ingot", id_class(rdy_3.Ok))
         .id_class(var0);
      Us_1.id_class(rdy_3.Ok, 9)
         .id_break(xu_3.JJ)
         .id_class("netherite_ingot")
         .id_class("has_netherite_block", id_class((rpL_2)xu_3.JJ))
         .id_class(var0, "netherite_ingot_from_netherite_block");
      Us_1.id_class(rdy_3.Ok)
         .id_break(rdy_3.OW, 4)
         .id_break(rdy_3.Od, 4)
         .id_class("netherite_ingot")
         .id_class("has_netherite_scrap", id_class(rdy_3.OW))
         .id_class(var0);
      UB.id_class(xu_3.Jk)
         .id_class('O', xu_3.Jd)
         .id_class('G', xu_3.Pa)
         .id_class("OOO")
         .id_class("GGG")
         .id_class("OOO")
         .id_class("has_obsidian", id_class((rpL_2)xu_3.Jd))
         .id_class(var0);
      UB.id_class(xu_3.Jm, 4)
         .id_class('#', xu_3.Ju)
         .id_class("#  ")
         .id_class("## ")
         .id_class("###")
         .id_class("has_blackstone", id_class((rpL_2)xu_3.Ju))
         .id_class(var0);
      UB.id_class(xu_3.Jp, 4)
         .id_class('#', xu_3.JF)
         .id_class("#  ")
         .id_class("## ")
         .id_class("###")
         .id_class("has_polished_blackstone", id_class((rpL_2)xu_3.JF))
         .id_class(var0);
      UB.id_class(xu_3.Jl, 4)
         .id_class('#', xu_3.JL)
         .id_class("#  ")
         .id_class("## ")
         .id_class("###")
         .id_class("has_polished_blackstone_bricks", id_class((rpL_2)xu_3.JL))
         .id_class(var0);
      UB.id_class(xu_3.Jv, 6).id_class('#', xu_3.Ju).id_class("###").id_class("has_blackstone", id_class((rpL_2)xu_3.Ju)).id_class(var0);
      UB.id_class(xu_3.Jq, 6).id_class('#', xu_3.JF).id_class("###").id_class("has_polished_blackstone", id_class((rpL_2)xu_3.JF)).id_class(var0);
      UB.id_class(xu_3.JC, 6).id_class('#', xu_3.JL).id_class("###").id_class("has_polished_blackstone_bricks", id_class((rpL_2)xu_3.JL)).id_class(var0);
      UB.id_class(xu_3.JF, 4).id_class('S', xu_3.Ju).id_class("SS").id_class("SS").id_class("has_blackstone", id_class((rpL_2)xu_3.Ju)).id_class(var0);
      UB.id_class(xu_3.JL, 4).id_class('#', xu_3.JF).id_class("##").id_class("##").id_class("has_polished_blackstone", id_class((rpL_2)xu_3.JF)).id_class(var0);
      UB.id_class(xu_3.Jn).id_class('#', xu_3.Jq).id_class("#").id_class("#").id_class("has_polished_blackstone", id_class((rpL_2)xu_3.JF)).id_class(var0);
      UB.id_class(xu_3.JZ, 6).id_class('#', xu_3.Ju).id_class("###").id_class("###").id_class("has_blackstone", id_class((rpL_2)xu_3.Ju)).id_class(var0);
      UB.id_class(xu_3.Jw, 6)
         .id_class('#', xu_3.JF)
         .id_class("###")
         .id_class("###")
         .id_class("has_polished_blackstone", id_class((rpL_2)xu_3.JF))
         .id_class(var0);
      UB.id_class(xu_3.JH, 6)
         .id_class('#', xu_3.JL)
         .id_class("###")
         .id_class("###")
         .id_class("has_polished_blackstone_bricks", id_class((rpL_2)xu_3.JL))
         .id_class(var0);
      Us_1.id_class(xu_3.Jt).id_break(xu_3.JF).id_class("has_polished_blackstone", id_class((rpL_2)xu_3.JF)).id_class(var0);
      UB.id_class(xu_3.JT).id_class('#', xu_3.JF).id_class("##").id_class("has_polished_blackstone", id_class((rpL_2)xu_3.JF)).id_class(var0);
      UB.id_class(xu_3.Bj)
         .id_class('I', rdy_3.Ox)
         .id_class('N', rdy_3.kn)
         .id_class("N")
         .id_class("I")
         .id_class("N")
         .id_class("has_iron_nugget", id_class(rdy_3.kn))
         .id_class("has_iron_ingot", id_class(rdy_3.Ox))
         .id_class(var0);
      DF.id_class(rkf_3.id_byte).id_class(var0, "armor_dye");
      DF.id_class(rkf_3.id_extends).id_class(var0, "banner_duplicate");
      DF.id_class(rkf_3.id_protected).id_class(var0, "book_cloning");
      DF.id_class(rkf_3.id_catch).id_class(var0, "firework_rocket");
      DF.id_class(rkf_3.id_private).id_class(var0, "firework_star");
      DF.id_class(rkf_3.id_implements).id_class(var0, "firework_star_fade");
      DF.id_class(rkf_3.id_throws).id_class(var0, "map_cloning");
      DF.id_class(rkf_3.id_case).id_class(var0, "map_extending");
      DF.id_class(rkf_3.id_package).id_class(var0, "repair_item");
      DF.id_class(rkf_3.id_native).id_class(var0, "shield_decoration");
      DF.id_class(rkf_3.id_volatile).id_class(var0, "shulker_box_coloring");
      DF.id_class(rkf_3.id_finally).id_class(var0, "tipped_arrow");
      DF.id_class(rkf_3.id_final).id_class(var0, "suspicious_stew");
      DZ.id_break(rkg_3.id_class(rdy_3.dE), rdy_3.dG, 0.35F, 200).id_class("has_potato", id_class(rdy_3.dE)).id_class(var0);
      DZ.id_break(rkg_3.id_class(rdy_3.XE), rdy_3.Xs, 0.3F, 200).id_class("has_clay_ball", id_class(rdy_3.XE)).id_class(var0);
      DZ.id_break(rkg_3.id_class(rlc_3.id_int), rdy_3.OX, 0.15F, 200).id_class("has_log", id_class(rlc_3.id_int)).id_class(var0);
      DZ.id_break(rkg_3.id_class(rdy_3.kO), rdy_3.kh, 0.1F, 200).id_class("has_chorus_fruit", id_class(rdy_3.kO)).id_class(var0);
      DZ.id_break(rkg_3.id_class(xu_3.id_float.id_case()), rdy_3.Oh, 0.1F, 200)
         .id_class("has_coal_ore", id_class((rpL_2)xu_3.id_float))
         .id_class(var0, "coal_from_smelting");
      DZ.id_break(rkg_3.id_class(rdy_3.Jz), rdy_3.JQ, 0.35F, 200).id_class("has_beef", id_class(rdy_3.Jz)).id_class(var0);
      DZ.id_break(rkg_3.id_class(rdy_3.JN), rdy_3.Jc, 0.35F, 200).id_class("has_chicken", id_class(rdy_3.JN)).id_class(var0);
      DZ.id_break(rkg_3.id_class(rdy_3.Xz), rdy_3.Xu, 0.35F, 200).id_class("has_cod", id_class(rdy_3.Xz)).id_class(var0);
      DZ.id_break(rkg_3.id_class(xu_3.OM), rdy_3.Jd, 0.1F, 200).id_class("has_kelp", id_class((rpL_2)xu_3.OM)).id_class(var0, "dried_kelp_from_smelting");
      DZ.id_break(rkg_3.id_class(rdy_3.XQ), rdy_3.Xm, 0.35F, 200).id_class("has_salmon", id_class(rdy_3.XQ)).id_class(var0);
      DZ.id_break(rkg_3.id_class(rdy_3.dg), rdy_3.dR, 0.35F, 200).id_class("has_mutton", id_class(rdy_3.dg)).id_class(var0);
      DZ.id_break(rkg_3.id_class(rdy_3.hC), rdy_3.hl, 0.35F, 200).id_class("has_porkchop", id_class(rdy_3.hC)).id_class(var0);
      DZ.id_break(rkg_3.id_class(rdy_3.dC), rdy_3.dl, 0.35F, 200).id_class("has_rabbit", id_class(rdy_3.dC)).id_class(var0);
      DZ.id_break(rkg_3.id_class(xu_3.ri.id_case()), rdy_3.OJ, 1.0F, 200)
         .id_class("has_diamond_ore", id_class((rpL_2)xu_3.ri))
         .id_class(var0, "diamond_from_smelting");
      DZ.id_break(rkg_3.id_class(xu_3.m.id_case()), rdy_3.XF, 0.2F, 200)
         .id_class("has_lapis_ore", id_class((rpL_2)xu_3.m))
         .id_class(var0, "lapis_from_smelting");
      DZ.id_break(rkg_3.id_class(xu_3.Sk.id_case()), rdy_3.dP, 1.0F, 200)
         .id_class("has_emerald_ore", id_class((rpL_2)xu_3.Sk))
         .id_class(var0, "emerald_from_smelting");
      DZ.id_break(rkg_3.id_class(rlc_3.id_try), xu_3.u.id_case(), 0.1F, 200).id_class("has_sand", id_class(rlc_3.id_try)).id_class(var0);
      DZ.id_break(rkg_3.id_class(rlc_3.id_boolean), rdy_3.Od, 1.0F, 200).id_class("has_gold_ore", id_class(rlc_3.id_boolean)).id_class(var0);
      DZ.id_break(rkg_3.id_class(xu_3.hr.id_case()), rdy_3.XH, 0.1F, 200)
         .id_class("has_sea_pickle", id_class((rpL_2)xu_3.hr))
         .id_class(var0, "lime_dye_from_smelting");
      DZ.id_break(rkg_3.id_class(xu_3.Pw.id_case()), rdy_3.Xf, 1.0F, 200).id_class("has_cactus", id_class((rpL_2)xu_3.Pw)).id_class(var0);
      DZ.id_break(rkg_3.id_class(rdy_3.OC, rdy_3.On, rdy_3.Ol, rdy_3.OH, rdy_3.OA, rdy_3.hc, rdy_3.hu, rdy_3.hm, rdy_3.hZ, rdy_3.dt), rdy_3.JF, 0.1F, 200)
         .id_class("has_golden_pickaxe", id_class(rdy_3.OC))
         .id_class("has_golden_shovel", id_class(rdy_3.On))
         .id_class("has_golden_axe", id_class(rdy_3.Ol))
         .id_class("has_golden_hoe", id_class(rdy_3.OH))
         .id_class("has_golden_sword", id_class(rdy_3.OA))
         .id_class("has_golden_helmet", id_class(rdy_3.hc))
         .id_class("has_golden_chestplate", id_class(rdy_3.hu))
         .id_class("has_golden_leggings", id_class(rdy_3.hm))
         .id_class("has_golden_boots", id_class(rdy_3.hZ))
         .id_class("has_golden_horse_armor", id_class(rdy_3.dt))
         .id_class(var0, "gold_nugget_from_smelting");
      DZ.id_break(
            rkg_3.id_class(
               rdy_3.Oq, rdy_3.Op, rdy_3.OT, rdy_3.Ot, rdy_3.Oy, rdy_3.hJ, rdy_3.hx, rdy_3.hd, rdy_3.hk, rdy_3.dT, rdy_3.hM, rdy_3.hO, rdy_3.hh, rdy_3.hX
            ),
            rdy_3.kn,
            0.1F,
            200
         )
         .id_class("has_iron_pickaxe", id_class(rdy_3.Oq))
         .id_class("has_iron_shovel", id_class(rdy_3.Op))
         .id_class("has_iron_axe", id_class(rdy_3.OT))
         .id_class("has_iron_hoe", id_class(rdy_3.Ot))
         .id_class("has_iron_sword", id_class(rdy_3.Oy))
         .id_class("has_iron_helmet", id_class(rdy_3.hJ))
         .id_class("has_iron_chestplate", id_class(rdy_3.hx))
         .id_class("has_iron_leggings", id_class(rdy_3.hd))
         .id_class("has_iron_boots", id_class(rdy_3.hk))
         .id_class("has_iron_horse_armor", id_class(rdy_3.dT))
         .id_class("has_chainmail_helmet", id_class(rdy_3.hM))
         .id_class("has_chainmail_chestplate", id_class(rdy_3.hO))
         .id_class("has_chainmail_leggings", id_class(rdy_3.hh))
         .id_class("has_chainmail_boots", id_class(rdy_3.hX))
         .id_class(var0, "iron_nugget_from_smelting");
      DZ.id_break(rkg_3.id_class(xu_3.id_long.id_case()), rdy_3.Ox, 0.7F, 200).id_class("has_iron_ore", id_class(xu_3.id_long.id_case())).id_class(var0);
      DZ.id_break(rkg_3.id_class(xu_3.PI), xu_3.Ee.id_case(), 0.35F, 200).id_class("has_clay_block", id_class((rpL_2)xu_3.PI)).id_class(var0);
      DZ.id_break(rkg_3.id_class(xu_3.PR), rdy_3.dZ, 0.1F, 200).id_class("has_netherrack", id_class((rpL_2)xu_3.PR)).id_class(var0);
      DZ.id_break(rkg_3.id_class(xu_3.sC), rdy_3.dv, 0.2F, 200).id_class("has_nether_quartz_ore", id_class((rpL_2)xu_3.sC)).id_class(var0);
      DZ.id_break(rkg_3.id_class(xu_3.Pl), rdy_3.hD, 0.7F, 200).id_class("has_redstone_ore", id_class((rpL_2)xu_3.Pl)).id_class(var0, "redstone_from_smelting");
      DZ.id_break(rkg_3.id_class(xu_3.c), xu_3.N.id_case(), 0.15F, 200).id_class("has_wet_sponge", id_class((rpL_2)xu_3.c)).id_class(var0);
      DZ.id_break(rkg_3.id_class(xu_3.id_volatile), xu_3.id_break.id_case(), 0.1F, 200)
         .id_class("has_cobblestone", id_class((rpL_2)xu_3.id_volatile))
         .id_class(var0);
      DZ.id_break(rkg_3.id_class(xu_3.id_break), xu_3.bO.id_case(), 0.1F, 200).id_class("has_stone", id_class((rpL_2)xu_3.id_break)).id_class(var0);
      DZ.id_break(rkg_3.id_class(xu_3.F), xu_3.bh.id_case(), 0.1F, 200).id_class("has_sandstone", id_class((rpL_2)xu_3.F)).id_class(var0);
      DZ.id_break(rkg_3.id_class(xu_3.GI), xu_3.bJ.id_case(), 0.1F, 200).id_class("has_red_sandstone", id_class((rpL_2)xu_3.GI)).id_class(var0);
      DZ.id_break(rkg_3.id_class(xu_3.sH), xu_3.bX.id_case(), 0.1F, 200).id_class("has_quartz_block", id_class((rpL_2)xu_3.sH)).id_class(var0);
      DZ.id_break(rkg_3.id_class(xu_3.BL), xu_3.Bn.id_case(), 0.1F, 200).id_class("has_stone_bricks", id_class((rpL_2)xu_3.BL)).id_class(var0);
      DZ.id_break(rkg_3.id_class(xu_3.Er), xu_3.MA.id_case(), 0.1F, 200).id_class("has_black_terracotta", id_class((rpL_2)xu_3.Er)).id_class(var0);
      DZ.id_break(rkg_3.id_class(xu_3.sU), xu_3.MZ.id_case(), 0.1F, 200).id_class("has_blue_terracotta", id_class((rpL_2)xu_3.sU)).id_class(var0);
      DZ.id_break(rkg_3.id_class(xu_3.se), xu_3.Mv.id_case(), 0.1F, 200).id_class("has_brown_terracotta", id_class((rpL_2)xu_3.se)).id_class(var0);
      DZ.id_break(rkg_3.id_class(xu_3.sK), xu_3.Mu.id_case(), 0.1F, 200).id_class("has_cyan_terracotta", id_class((rpL_2)xu_3.sK)).id_class(var0);
      DZ.id_break(rkg_3.id_class(xu_3.sY), xu_3.MN.id_case(), 0.1F, 200).id_class("has_gray_terracotta", id_class((rpL_2)xu_3.sY)).id_class(var0);
      DZ.id_break(rkg_3.id_class(xu_3.sa), xu_3.MF.id_case(), 0.1F, 200).id_class("has_green_terracotta", id_class((rpL_2)xu_3.sa)).id_class(var0);
      DZ.id_break(rkg_3.id_class(xu_3.sj), xu_3.Mk.id_case(), 0.1F, 200).id_class("has_light_blue_terracotta", id_class((rpL_2)xu_3.sj)).id_class(var0);
      DZ.id_break(rkg_3.id_class(xu_3.so), xu_3.Mc.id_case(), 0.1F, 200).id_class("has_light_gray_terracotta", id_class((rpL_2)xu_3.so)).id_class(var0);
      DZ.id_break(rkg_3.id_class(xu_3.sg), xu_3.Mz.id_case(), 0.1F, 200).id_class("has_lime_terracotta", id_class((rpL_2)xu_3.sg)).id_class(var0);
      DZ.id_break(rkg_3.id_class(xu_3.sf), xu_3.Md.id_case(), 0.1F, 200).id_class("has_magenta_terracotta", id_class((rpL_2)xu_3.sf)).id_class(var0);
      DZ.id_break(rkg_3.id_class(xu_3.sI), xu_3.Mx.id_case(), 0.1F, 200).id_class("has_orange_terracotta", id_class((rpL_2)xu_3.sI)).id_class(var0);
      DZ.id_break(rkg_3.id_class(xu_3.sR), xu_3.MQ.id_case(), 0.1F, 200).id_class("has_pink_terracotta", id_class((rpL_2)xu_3.sR)).id_class(var0);
      DZ.id_break(rkg_3.id_class(xu_3.sD), xu_3.Mm.id_case(), 0.1F, 200).id_class("has_purple_terracotta", id_class((rpL_2)xu_3.sD)).id_class(var0);
      DZ.id_break(rkg_3.id_class(xu_3.si), xu_3.ML.id_case(), 0.1F, 200).id_class("has_red_terracotta", id_class((rpL_2)xu_3.si)).id_class(var0);
      DZ.id_break(rkg_3.id_class(xu_3.sw), xu_3.MJ.id_case(), 0.1F, 200).id_class("has_white_terracotta", id_class((rpL_2)xu_3.sw)).id_class(var0);
      DZ.id_break(rkg_3.id_class(xu_3.sV), xu_3.MW.id_case(), 0.1F, 200).id_class("has_yellow_terracotta", id_class((rpL_2)xu_3.sV)).id_class(var0);
      DZ.id_break(rkg_3.id_class(xu_3.Jx), rdy_3.OW, 2.0F, 200).id_class("has_ancient_debris", id_class((rpL_2)xu_3.Jx)).id_class(var0);
      DZ.id_break(rkg_3.id_class(xu_3.JL), xu_3.JA.id_case(), 0.1F, 200).id_class("has_blackstone_bricks", id_class((rpL_2)xu_3.JL)).id_class(var0);
      DZ.id_break(rkg_3.id_class(xu_3.SP), xu_3.Jf.id_case(), 0.1F, 200).id_class("has_nether_bricks", id_class((rpL_2)xu_3.SP)).id_class(var0);
      DZ.id_class(rkg_3.id_class(xu_3.id_long.id_case()), rdy_3.Ox, 0.7F, 100)
         .id_class("has_iron_ore", id_class(xu_3.id_long.id_case()))
         .id_class(var0, "iron_ingot_from_blasting");
      DZ.id_class(rkg_3.id_class(rlc_3.id_boolean), rdy_3.Od, 1.0F, 100)
         .id_class("has_gold_ore", id_class(rlc_3.id_boolean))
         .id_class(var0, "gold_ingot_from_blasting");
      DZ.id_class(rkg_3.id_class(xu_3.ri.id_case()), rdy_3.OJ, 1.0F, 100)
         .id_class("has_diamond_ore", id_class((rpL_2)xu_3.ri))
         .id_class(var0, "diamond_from_blasting");
      DZ.id_class(rkg_3.id_class(xu_3.m.id_case()), rdy_3.XF, 0.2F, 100)
         .id_class("has_lapis_ore", id_class((rpL_2)xu_3.m))
         .id_class(var0, "lapis_from_blasting");
      DZ.id_class(rkg_3.id_class(xu_3.Pl), rdy_3.hD, 0.7F, 100).id_class("has_redstone_ore", id_class((rpL_2)xu_3.Pl)).id_class(var0, "redstone_from_blasting");
      DZ.id_class(rkg_3.id_class(xu_3.id_float.id_case()), rdy_3.Oh, 0.1F, 100)
         .id_class("has_coal_ore", id_class((rpL_2)xu_3.id_float))
         .id_class(var0, "coal_from_blasting");
      DZ.id_class(rkg_3.id_class(xu_3.Sk.id_case()), rdy_3.dP, 1.0F, 100)
         .id_class("has_emerald_ore", id_class((rpL_2)xu_3.Sk))
         .id_class(var0, "emerald_from_blasting");
      DZ.id_class(rkg_3.id_class(xu_3.sC), rdy_3.dv, 0.2F, 100)
         .id_class("has_nether_quartz_ore", id_class((rpL_2)xu_3.sC))
         .id_class(var0, "quartz_from_blasting");
      DZ.id_class(rkg_3.id_class(rdy_3.OC, rdy_3.On, rdy_3.Ol, rdy_3.OH, rdy_3.OA, rdy_3.hc, rdy_3.hu, rdy_3.hm, rdy_3.hZ, rdy_3.dt), rdy_3.JF, 0.1F, 100)
         .id_class("has_golden_pickaxe", id_class(rdy_3.OC))
         .id_class("has_golden_shovel", id_class(rdy_3.On))
         .id_class("has_golden_axe", id_class(rdy_3.Ol))
         .id_class("has_golden_hoe", id_class(rdy_3.OH))
         .id_class("has_golden_sword", id_class(rdy_3.OA))
         .id_class("has_golden_helmet", id_class(rdy_3.hc))
         .id_class("has_golden_chestplate", id_class(rdy_3.hu))
         .id_class("has_golden_leggings", id_class(rdy_3.hm))
         .id_class("has_golden_boots", id_class(rdy_3.hZ))
         .id_class("has_golden_horse_armor", id_class(rdy_3.dt))
         .id_class(var0, "gold_nugget_from_blasting");
      DZ.id_class(
            rkg_3.id_class(
               rdy_3.Oq, rdy_3.Op, rdy_3.OT, rdy_3.Ot, rdy_3.Oy, rdy_3.hJ, rdy_3.hx, rdy_3.hd, rdy_3.hk, rdy_3.dT, rdy_3.hM, rdy_3.hO, rdy_3.hh, rdy_3.hX
            ),
            rdy_3.kn,
            0.1F,
            100
         )
         .id_class("has_iron_pickaxe", id_class(rdy_3.Oq))
         .id_class("has_iron_shovel", id_class(rdy_3.Op))
         .id_class("has_iron_axe", id_class(rdy_3.OT))
         .id_class("has_iron_hoe", id_class(rdy_3.Ot))
         .id_class("has_iron_sword", id_class(rdy_3.Oy))
         .id_class("has_iron_helmet", id_class(rdy_3.hJ))
         .id_class("has_iron_chestplate", id_class(rdy_3.hx))
         .id_class("has_iron_leggings", id_class(rdy_3.hd))
         .id_class("has_iron_boots", id_class(rdy_3.hk))
         .id_class("has_iron_horse_armor", id_class(rdy_3.dT))
         .id_class("has_chainmail_helmet", id_class(rdy_3.hM))
         .id_class("has_chainmail_chestplate", id_class(rdy_3.hO))
         .id_class("has_chainmail_leggings", id_class(rdy_3.hh))
         .id_class("has_chainmail_boots", id_class(rdy_3.hX))
         .id_class(var0, "iron_nugget_from_blasting");
      DZ.id_class(rkg_3.id_class(xu_3.Jx), rdy_3.OW, 2.0F, 100)
         .id_class("has_ancient_debris", id_class((rpL_2)xu_3.Jx))
         .id_class(var0, "netherite_scrap_from_blasting");
      id_class(var0, "smoking", rkf_3.id_continue, 100);
      id_class(var0, "campfire_cooking", rkf_3.id_super, 600);
      UG.id_class(rkg_3.id_class(xu_3.id_break), xu_3.GU, 2)
         .id_class("has_stone", id_class((rpL_2)xu_3.id_break))
         .id_class(var0, "stone_slab_from_stone_stonecutting");
      UG.id_class(rkg_3.id_class(xu_3.id_break), xu_3.hk)
         .id_class("has_stone", id_class((rpL_2)xu_3.id_break))
         .id_class(var0, "stone_stairs_from_stone_stonecutting");
      UG.id_class(rkg_3.id_class(xu_3.id_break), xu_3.BL)
         .id_class("has_stone", id_class((rpL_2)xu_3.id_break))
         .id_class(var0, "stone_bricks_from_stone_stonecutting");
      UG.id_class(rkg_3.id_class(xu_3.id_break), xu_3.bS, 2)
         .id_class("has_stone", id_class((rpL_2)xu_3.id_break))
         .id_class(var0, "stone_brick_slab_from_stone_stonecutting");
      UG.id_class(rkg_3.id_class(xu_3.id_break), xu_3.Ba)
         .id_class("has_stone", id_class((rpL_2)xu_3.id_break))
         .id_class(var0, "stone_brick_stairs_from_stone_stonecutting");
      UG.id_class(rkg_3.id_class(xu_3.id_break), xu_3.BC)
         .id_class("has_stone", id_class((rpL_2)xu_3.id_break))
         .id_class(var0, "chiseled_stone_bricks_stone_from_stonecutting");
      UG.id_class(rkg_3.id_class(xu_3.id_break), xu_3.hV)
         .id_class("has_stone", id_class((rpL_2)xu_3.id_break))
         .id_class(var0, "stone_brick_walls_from_stone_stonecutting");
      UG.id_class(rkg_3.id_class(xu_3.F), xu_3.A)
         .id_class("has_sandstone", id_class((rpL_2)xu_3.F))
         .id_class(var0, "cut_sandstone_from_sandstone_stonecutting");
      UG.id_class(rkg_3.id_class(xu_3.F), xu_3.Ga, 2)
         .id_class("has_sandstone", id_class((rpL_2)xu_3.F))
         .id_class(var0, "sandstone_slab_from_sandstone_stonecutting");
      UG.id_class(rkg_3.id_class(xu_3.F), xu_3.Gi, 2)
         .id_class("has_sandstone", id_class((rpL_2)xu_3.F))
         .id_class(var0, "cut_sandstone_slab_from_sandstone_stonecutting");
      UG.id_class(rkg_3.id_class(xu_3.A), xu_3.Gi, 2)
         .id_class("has_cut_sandstone", id_class((rpL_2)xu_3.F))
         .id_class(var0, "cut_sandstone_slab_from_cut_sandstone_stonecutting");
      UG.id_class(rkg_3.id_class(xu_3.F), xu_3.Sd)
         .id_class("has_sandstone", id_class((rpL_2)xu_3.F))
         .id_class(var0, "sandstone_stairs_from_sandstone_stonecutting");
      UG.id_class(rkg_3.id_class(xu_3.F), xu_3.ho)
         .id_class("has_sandstone", id_class((rpL_2)xu_3.F))
         .id_class(var0, "sandstone_wall_from_sandstone_stonecutting");
      UG.id_class(rkg_3.id_class(xu_3.F), xu_3.L)
         .id_class("has_sandstone", id_class((rpL_2)xu_3.F))
         .id_class(var0, "chiseled_sandstone_from_sandstone_stonecutting");
      UG.id_class(rkg_3.id_class(xu_3.GI), xu_3.Gj)
         .id_class("has_red_sandstone", id_class((rpL_2)xu_3.GI))
         .id_class(var0, "cut_red_sandstone_from_red_sandstone_stonecutting");
      UG.id_class(rkg_3.id_class(xu_3.GI), xu_3.bG, 2)
         .id_class("has_red_sandstone", id_class((rpL_2)xu_3.GI))
         .id_class(var0, "red_sandstone_slab_from_red_sandstone_stonecutting");
      UG.id_class(rkg_3.id_class(xu_3.GI), xu_3.bb, 2)
         .id_class("has_red_sandstone", id_class((rpL_2)xu_3.GI))
         .id_class(var0, "cut_red_sandstone_slab_from_red_sandstone_stonecutting");
      UG.id_class(rkg_3.id_class(xu_3.Gj), xu_3.bb, 2)
         .id_class("has_cut_red_sandstone", id_class((rpL_2)xu_3.GI))
         .id_class(var0, "cut_red_sandstone_slab_from_cut_red_sandstone_stonecutting");
      UG.id_class(rkg_3.id_class(xu_3.GI), xu_3.GV)
         .id_class("has_red_sandstone", id_class((rpL_2)xu_3.GI))
         .id_class(var0, "red_sandstone_stairs_from_red_sandstone_stonecutting");
      UG.id_class(rkg_3.id_class(xu_3.GI), xu_3.hI)
         .id_class("has_red_sandstone", id_class((rpL_2)xu_3.GI))
         .id_class(var0, "red_sandstone_wall_from_red_sandstone_stonecutting");
      UG.id_class(rkg_3.id_class(xu_3.GI), xu_3.Gf)
         .id_class("has_red_sandstone", id_class((rpL_2)xu_3.GI))
         .id_class(var0, "chiseled_red_sandstone_from_red_sandstone_stonecutting");
      UG.id_class(rkg_3.id_class(xu_3.sH), xu_3.bE, 2).id_class("has_quartz_block", id_class((rpL_2)xu_3.sH)).id_class(var0, "quartz_slab_from_stonecutting");
      UG.id_class(rkg_3.id_class(xu_3.sH), xu_3.sq)
         .id_class("has_quartz_block", id_class((rpL_2)xu_3.sH))
         .id_class(var0, "quartz_stairs_from_quartz_block_stonecutting");
      UG.id_class(rkg_3.id_class(xu_3.sH), xu_3.sp)
         .id_class("has_quartz_block", id_class((rpL_2)xu_3.sH))
         .id_class(var0, "quartz_pillar_from_quartz_block_stonecutting");
      UG.id_class(rkg_3.id_class(xu_3.sH), xu_3.sy)
         .id_class("has_quartz_block", id_class((rpL_2)xu_3.sH))
         .id_class(var0, "chiseled_quartz_block_from_quartz_block_stonecutting");
      UG.id_class(rkg_3.id_class(xu_3.sH), xu_3.Jj)
         .id_class("has_quartz_block", id_class((rpL_2)xu_3.sH))
         .id_class(var0, "quartz_bricks_from_quartz_block_stonecutting");
      UG.id_class(rkg_3.id_class(xu_3.id_volatile), xu_3.Pd)
         .id_class("has_cobblestone", id_class((rpL_2)xu_3.id_volatile))
         .id_class(var0, "cobblestone_stairs_from_cobblestone_stonecutting");
      UG.id_class(rkg_3.id_class(xu_3.id_volatile), xu_3.bP, 2)
         .id_class("has_cobblestone", id_class((rpL_2)xu_3.id_volatile))
         .id_class(var0, "cobblestone_slab_from_cobblestone_stonecutting");
      UG.id_class(rkg_3.id_class(xu_3.id_volatile), xu_3.SF)
         .id_class("has_cobblestone", id_class((rpL_2)xu_3.id_volatile))
         .id_class(var0, "cobblestone_wall_from_cobblestone_stonecutting");
      UG.id_class(rkg_3.id_class(xu_3.BL), xu_3.bS, 2)
         .id_class("has_stone_bricks", id_class((rpL_2)xu_3.BL))
         .id_class(var0, "stone_brick_slab_from_stone_bricks_stonecutting");
      UG.id_class(rkg_3.id_class(xu_3.BL), xu_3.Ba)
         .id_class("has_stone_bricks", id_class((rpL_2)xu_3.BL))
         .id_class(var0, "stone_brick_stairs_from_stone_bricks_stonecutting");
      UG.id_class(rkg_3.id_class(xu_3.BL), xu_3.hV)
         .id_class("has_stone_bricks", id_class((rpL_2)xu_3.BL))
         .id_class(var0, "stone_brick_wall_from_stone_bricks_stonecutting");
      UG.id_class(rkg_3.id_class(xu_3.BL), xu_3.BC)
         .id_class("has_stone_bricks", id_class((rpL_2)xu_3.BL))
         .id_class(var0, "chiseled_stone_bricks_from_stone_bricks_stonecutting");
      UG.id_class(rkg_3.id_class(xu_3.rI), xu_3.bB, 2).id_class("has_bricks", id_class((rpL_2)xu_3.rI)).id_class(var0, "brick_slab_from_bricks_stonecutting");
      UG.id_class(rkg_3.id_class(xu_3.rI), xu_3.Be).id_class("has_bricks", id_class((rpL_2)xu_3.rI)).id_class(var0, "brick_stairs_from_bricks_stonecutting");
      UG.id_class(rkg_3.id_class(xu_3.rI), xu_3.ht).id_class("has_bricks", id_class((rpL_2)xu_3.rI)).id_class(var0, "brick_wall_from_bricks_stonecutting");
      UG.id_class(rkg_3.id_class(xu_3.SP), xu_3.bs, 2)
         .id_class("has_nether_bricks", id_class((rpL_2)xu_3.SP))
         .id_class(var0, "nether_brick_slab_from_nether_bricks_stonecutting");
      UG.id_class(rkg_3.id_class(xu_3.SP), xu_3.SS)
         .id_class("has_nether_bricks", id_class((rpL_2)xu_3.SP))
         .id_class(var0, "nether_brick_stairs_from_nether_bricks_stonecutting");
      UG.id_class(rkg_3.id_class(xu_3.SP), xu_3.hg)
         .id_class("has_nether_bricks", id_class((rpL_2)xu_3.SP))
         .id_class(var0, "nether_brick_wall_from_nether_bricks_stonecutting");
      UG.id_class(rkg_3.id_class(xu_3.SP), xu_3.JI)
         .id_class("has_nether_bricks", id_class((rpL_2)xu_3.SP))
         .id_class(var0, "chiseled_nether_bricks_from_nether_bricks_stonecutting");
      UG.id_class(rkg_3.id_class(xu_3.bR), xu_3.hp, 2)
         .id_class("has_nether_bricks", id_class((rpL_2)xu_3.bR))
         .id_class(var0, "red_nether_brick_slab_from_red_nether_bricks_stonecutting");
      UG.id_class(rkg_3.id_class(xu_3.bR), xu_3.hc)
         .id_class("has_nether_bricks", id_class((rpL_2)xu_3.bR))
         .id_class(var0, "red_nether_brick_stairs_from_red_nether_bricks_stonecutting");
      UG.id_class(rkg_3.id_class(xu_3.bR), xu_3.hY)
         .id_class("has_nether_bricks", id_class((rpL_2)xu_3.bR))
         .id_class(var0, "red_nether_brick_wall_from_red_nether_bricks_stonecutting");
      UG.id_class(rkg_3.id_class(xu_3.bH), xu_3.bM, 2)
         .id_class("has_purpur_block", id_class((rpL_2)xu_3.bH))
         .id_class(var0, "purpur_slab_from_purpur_block_stonecutting");
      UG.id_class(rkg_3.id_class(xu_3.bH), xu_3.bp)
         .id_class("has_purpur_block", id_class((rpL_2)xu_3.bH))
         .id_class(var0, "purpur_stairs_from_purpur_block_stonecutting");
      UG.id_class(rkg_3.id_class(xu_3.bH), xu_3.by)
         .id_class("has_purpur_block", id_class((rpL_2)xu_3.bH))
         .id_class(var0, "purpur_pillar_from_purpur_block_stonecutting");
      UG.id_class(rkg_3.id_class(xu_3.Em), xu_3.En, 2)
         .id_class("has_prismarine", id_class((rpL_2)xu_3.Em))
         .id_class(var0, "prismarine_slab_from_prismarine_stonecutting");
      UG.id_class(rkg_3.id_class(xu_3.Em), xu_3.EF)
         .id_class("has_prismarine", id_class((rpL_2)xu_3.Em))
         .id_class(var0, "prismarine_stairs_from_prismarine_stonecutting");
      UG.id_class(rkg_3.id_class(xu_3.Em), xu_3.hw)
         .id_class("has_prismarine", id_class((rpL_2)xu_3.Em))
         .id_class(var0, "prismarine_wall_from_prismarine_stonecutting");
      UG.id_class(rkg_3.id_class(xu_3.EZ), xu_3.EC, 2)
         .id_class("has_prismarine_brick", id_class((rpL_2)xu_3.EZ))
         .id_class(var0, "prismarine_brick_slab_from_prismarine_stonecutting");
      UG.id_class(rkg_3.id_class(xu_3.EZ), xu_3.EL)
         .id_class("has_prismarine_brick", id_class((rpL_2)xu_3.EZ))
         .id_class(var0, "prismarine_brick_stairs_from_prismarine_stonecutting");
      UG.id_class(rkg_3.id_class(xu_3.Ev), xu_3.El, 2)
         .id_class("has_dark_prismarine", id_class((rpL_2)xu_3.Ev))
         .id_class(var0, "dark_prismarine_slab_from_dark_prismarine_stonecutting");
      UG.id_class(rkg_3.id_class(xu_3.Ev), xu_3.EA)
         .id_class("has_dark_prismarine", id_class((rpL_2)xu_3.Ev))
         .id_class(var0, "dark_prismarine_stairs_from_dark_prismarine_stonecutting");
      UG.id_class(rkg_3.id_class(xu_3.id_catch), xu_3.hy, 2)
         .id_class("has_andesite", id_class((rpL_2)xu_3.id_catch))
         .id_class(var0, "andesite_slab_from_andesite_stonecutting");
      UG.id_class(rkg_3.id_class(xu_3.id_catch), xu_3.hN)
         .id_class("has_andesite", id_class((rpL_2)xu_3.id_catch))
         .id_class(var0, "andesite_stairs_from_andesite_stonecutting");
      UG.id_class(rkg_3.id_class(xu_3.id_catch), xu_3.hR)
         .id_class("has_andesite", id_class((rpL_2)xu_3.id_catch))
         .id_class(var0, "andesite_wall_from_andesite_stonecutting");
      UG.id_class(rkg_3.id_class(xu_3.id_catch), xu_3.id_private)
         .id_class("has_andesite", id_class((rpL_2)xu_3.id_catch))
         .id_class(var0, "polished_andesite_from_andesite_stonecutting");
      UG.id_class(rkg_3.id_class(xu_3.id_catch), xu_3.hq, 2)
         .id_class("has_andesite", id_class((rpL_2)xu_3.id_catch))
         .id_class(var0, "polished_andesite_slab_from_andesite_stonecutting");
      UG.id_class(rkg_3.id_class(xu_3.id_catch), xu_3.hu)
         .id_class("has_andesite", id_class((rpL_2)xu_3.id_catch))
         .id_class(var0, "polished_andesite_stairs_from_andesite_stonecutting");
      UG.id_class(rkg_3.id_class(xu_3.id_private), xu_3.hq, 2)
         .id_class("has_polished_andesite", id_class((rpL_2)xu_3.id_private))
         .id_class(var0, "polished_andesite_slab_from_polished_andesite_stonecutting");
      UG.id_class(rkg_3.id_class(xu_3.id_private), xu_3.hu)
         .id_class("has_polished_andesite", id_class((rpL_2)xu_3.id_private))
         .id_class(var0, "polished_andesite_stairs_from_polished_andesite_stonecutting");
      UG.id_class(rkg_3.id_class(xu_3.PK), xu_3.PD).id_class("has_basalt", id_class((rpL_2)xu_3.PK)).id_class(var0, "polished_basalt_from_basalt_stonecutting");
      UG.id_class(rkg_3.id_class(xu_3.id_byte), xu_3.hH, 2)
         .id_class("has_granite", id_class((rpL_2)xu_3.id_byte))
         .id_class(var0, "granite_slab_from_granite_stonecutting");
      UG.id_class(rkg_3.id_class(xu_3.id_byte), xu_3.hQ)
         .id_class("has_granite", id_class((rpL_2)xu_3.id_byte))
         .id_class(var0, "granite_stairs_from_granite_stonecutting");
      UG.id_class(rkg_3.id_class(xu_3.id_byte), xu_3.hj)
         .id_class("has_granite", id_class((rpL_2)xu_3.id_byte))
         .id_class(var0, "granite_wall_from_granite_stonecutting");
      UG.id_class(rkg_3.id_class(xu_3.id_byte), xu_3.id_protected)
         .id_class("has_granite", id_class((rpL_2)xu_3.id_byte))
         .id_class(var0, "polished_granite_from_granite_stonecutting");
      UG.id_class(rkg_3.id_class(xu_3.id_byte), xu_3.hZ, 2)
         .id_class("has_granite", id_class((rpL_2)xu_3.id_byte))
         .id_class(var0, "polished_granite_slab_from_granite_stonecutting");
      UG.id_class(rkg_3.id_class(xu_3.id_byte), xu_3.hO)
         .id_class("has_granite", id_class((rpL_2)xu_3.id_byte))
         .id_class(var0, "polished_granite_stairs_from_granite_stonecutting");
      UG.id_class(rkg_3.id_class(xu_3.id_protected), xu_3.hZ, 2)
         .id_class("has_polished_granite", id_class((rpL_2)xu_3.id_protected))
         .id_class(var0, "polished_granite_slab_from_polished_granite_stonecutting");
      UG.id_class(rkg_3.id_class(xu_3.id_protected), xu_3.hO)
         .id_class("has_polished_granite", id_class((rpL_2)xu_3.id_protected))
         .id_class(var0, "polished_granite_stairs_from_polished_granite_stonecutting");
      UG.id_class(rkg_3.id_class(xu_3.id_throws), xu_3.hT, 2)
         .id_class("has_diorite", id_class((rpL_2)xu_3.id_throws))
         .id_class(var0, "diorite_slab_from_diorite_stonecutting");
      UG.id_class(rkg_3.id_class(xu_3.id_throws), xu_3.hm)
         .id_class("has_diorite", id_class((rpL_2)xu_3.id_throws))
         .id_class(var0, "diorite_stairs_from_diorite_stonecutting");
      UG.id_class(rkg_3.id_class(xu_3.id_throws), xu_3.hD)
         .id_class("has_diorite", id_class((rpL_2)xu_3.id_throws))
         .id_class(var0, "diorite_wall_from_diorite_stonecutting");
      UG.id_class(rkg_3.id_class(xu_3.id_throws), xu_3.id_case)
         .id_class("has_diorite", id_class((rpL_2)xu_3.id_throws))
         .id_class(var0, "polished_diorite_from_diorite_stonecutting");
      UG.id_class(rkg_3.id_class(xu_3.id_throws), xu_3.hL, 2)
         .id_class("has_diorite", id_class((rpL_2)xu_3.id_case))
         .id_class(var0, "polished_diorite_slab_from_diorite_stonecutting");
      UG.id_class(rkg_3.id_class(xu_3.id_throws), xu_3.hJ)
         .id_class("has_diorite", id_class((rpL_2)xu_3.id_case))
         .id_class(var0, "polished_diorite_stairs_from_diorite_stonecutting");
      UG.id_class(rkg_3.id_class(xu_3.id_case), xu_3.hL, 2)
         .id_class("has_polished_diorite", id_class((rpL_2)xu_3.id_case))
         .id_class(var0, "polished_diorite_slab_from_polished_diorite_stonecutting");
      UG.id_class(rkg_3.id_class(xu_3.id_case), xu_3.hJ)
         .id_class("has_polished_diorite", id_class((rpL_2)xu_3.id_case))
         .id_class(var0, "polished_diorite_stairs_from_polished_diorite_stonecutting");
      UG.id_class(rkg_3.id_class(xu_3.BA), xu_3.hF, 2)
         .id_class("has_mossy_stone_bricks", id_class((rpL_2)xu_3.BA))
         .id_class(var0, "mossy_stone_brick_slab_from_mossy_stone_brick_stonecutting");
      UG.id_class(rkg_3.id_class(xu_3.BA), xu_3.hX)
         .id_class("has_mossy_stone_bricks", id_class((rpL_2)xu_3.BA))
         .id_class(var0, "mossy_stone_brick_stairs_from_mossy_stone_brick_stonecutting");
      UG.id_class(rkg_3.id_class(xu_3.BA), xu_3.hf)
         .id_class("has_mossy_stone_bricks", id_class((rpL_2)xu_3.BA))
         .id_class(var0, "mossy_stone_brick_wall_from_mossy_stone_brick_stonecutting");
      UG.id_class(rkg_3.id_class(xu_3.rV), xu_3.hA, 2)
         .id_class("has_mossy_cobblestone", id_class((rpL_2)xu_3.rV))
         .id_class(var0, "mossy_cobblestone_slab_from_mossy_cobblestone_stonecutting");
      UG.id_class(rkg_3.id_class(xu_3.rV), xu_3.hx)
         .id_class("has_mossy_cobblestone", id_class((rpL_2)xu_3.rV))
         .id_class(var0, "mossy_cobblestone_stairs_from_mossy_cobblestone_stonecutting");
      UG.id_class(rkg_3.id_class(xu_3.rV), xu_3.SL)
         .id_class("has_mossy_cobblestone", id_class((rpL_2)xu_3.rV))
         .id_class(var0, "mossy_cobblestone_wall_from_mossy_cobblestone_stonecutting");
      UG.id_class(rkg_3.id_class(xu_3.bh), xu_3.hC, 2)
         .id_class("has_smooth_sandstone", id_class((rpL_2)xu_3.bh))
         .id_class(var0, "smooth_sandstone_slab_from_smooth_sandstone_stonecutting");
      UG.id_class(rkg_3.id_class(xu_3.bh), xu_3.hW)
         .id_class("has_mossy_cobblestone", id_class((rpL_2)xu_3.bh))
         .id_class(var0, "smooth_sandstone_stairs_from_smooth_sandstone_stonecutting");
      UG.id_class(rkg_3.id_class(xu_3.bJ), xu_3.hv, 2)
         .id_class("has_smooth_red_sandstone", id_class((rpL_2)xu_3.bJ))
         .id_class(var0, "smooth_red_sandstone_slab_from_smooth_red_sandstone_stonecutting");
      UG.id_class(rkg_3.id_class(xu_3.bJ), xu_3.hh)
         .id_class("has_smooth_red_sandstone", id_class((rpL_2)xu_3.bJ))
         .id_class(var0, "smooth_red_sandstone_stairs_from_smooth_red_sandstone_stonecutting");
      UG.id_class(rkg_3.id_class(xu_3.bX), xu_3.hl, 2)
         .id_class("has_smooth_quartz", id_class((rpL_2)xu_3.bX))
         .id_class(var0, "smooth_quartz_slab_from_smooth_quartz_stonecutting");
      UG.id_class(rkg_3.id_class(xu_3.bX), xu_3.hz)
         .id_class("has_smooth_quartz", id_class((rpL_2)xu_3.bX))
         .id_class(var0, "smooth_quartz_stairs_from_smooth_quartz_stonecutting");
      UG.id_class(rkg_3.id_class(xu_3.bq), xu_3.hn, 2)
         .id_class("has_end_stone_brick", id_class((rpL_2)xu_3.bq))
         .id_class(var0, "end_stone_brick_slab_from_end_stone_brick_stonecutting");
      UG.id_class(rkg_3.id_class(xu_3.bq), xu_3.hd)
         .id_class("has_end_stone_brick", id_class((rpL_2)xu_3.bq))
         .id_class(var0, "end_stone_brick_stairs_from_end_stone_brick_stonecutting");
      UG.id_class(rkg_3.id_class(xu_3.bq), xu_3.hK)
         .id_class("has_end_stone_brick", id_class((rpL_2)xu_3.bq))
         .id_class(var0, "end_stone_brick_wall_from_end_stone_brick_stonecutting");
      UG.id_class(rkg_3.id_class(xu_3.Sh), xu_3.bq)
         .id_class("has_end_stone", id_class((rpL_2)xu_3.Sh))
         .id_class(var0, "end_stone_bricks_from_end_stone_stonecutting");
      UG.id_class(rkg_3.id_class(xu_3.Sh), xu_3.hn, 2)
         .id_class("has_end_stone", id_class((rpL_2)xu_3.Sh))
         .id_class(var0, "end_stone_brick_slab_from_end_stone_stonecutting");
      UG.id_class(rkg_3.id_class(xu_3.Sh), xu_3.hd)
         .id_class("has_end_stone", id_class((rpL_2)xu_3.Sh))
         .id_class(var0, "end_stone_brick_stairs_from_end_stone_stonecutting");
      UG.id_class(rkg_3.id_class(xu_3.Sh), xu_3.hK)
         .id_class("has_end_stone", id_class((rpL_2)xu_3.Sh))
         .id_class(var0, "end_stone_brick_wall_from_end_stone_stonecutting");
      UG.id_class(rkg_3.id_class(xu_3.bO), xu_3.Ge, 2)
         .id_class("has_smooth_stone", id_class((rpL_2)xu_3.bO))
         .id_class(var0, "smooth_stone_slab_from_smooth_stone_stonecutting");
      UG.id_class(rkg_3.id_class(xu_3.Ju), xu_3.Jv, 2)
         .id_class("has_blackstone", id_class((rpL_2)xu_3.Ju))
         .id_class(var0, "blackstone_slab_from_blackstone_stonecutting");
      UG.id_class(rkg_3.id_class(xu_3.Ju), xu_3.Jm)
         .id_class("has_blackstone", id_class((rpL_2)xu_3.Ju))
         .id_class(var0, "blackstone_stairs_from_blackstone_stonecutting");
      UG.id_class(rkg_3.id_class(xu_3.Ju), xu_3.JZ)
         .id_class("has_blackstone", id_class((rpL_2)xu_3.Ju))
         .id_class(var0, "blackstone_wall_from_blackstone_stonecutting");
      UG.id_class(rkg_3.id_class(xu_3.Ju), xu_3.JF)
         .id_class("has_blackstone", id_class((rpL_2)xu_3.Ju))
         .id_class(var0, "polished_blackstone_from_blackstone_stonecutting");
      UG.id_class(rkg_3.id_class(xu_3.Ju), xu_3.Jw)
         .id_class("has_blackstone", id_class((rpL_2)xu_3.Ju))
         .id_class(var0, "polished_blackstone_wall_from_blackstone_stonecutting");
      UG.id_class(rkg_3.id_class(xu_3.Ju), xu_3.Jq, 2)
         .id_class("has_blackstone", id_class((rpL_2)xu_3.Ju))
         .id_class(var0, "polished_blackstone_slab_from_blackstone_stonecutting");
      UG.id_class(rkg_3.id_class(xu_3.Ju), xu_3.Jp)
         .id_class("has_blackstone", id_class((rpL_2)xu_3.Ju))
         .id_class(var0, "polished_blackstone_stairs_from_blackstone_stonecutting");
      UG.id_class(rkg_3.id_class(xu_3.Ju), xu_3.Jn)
         .id_class("has_blackstone", id_class((rpL_2)xu_3.Ju))
         .id_class(var0, "chiseled_polished_blackstone_from_blackstone_stonecutting");
      UG.id_class(rkg_3.id_class(xu_3.Ju), xu_3.JL)
         .id_class("has_blackstone", id_class((rpL_2)xu_3.Ju))
         .id_class(var0, "polished_blackstone_bricks_from_blackstone_stonecutting");
      UG.id_class(rkg_3.id_class(xu_3.Ju), xu_3.JC, 2)
         .id_class("has_blackstone", id_class((rpL_2)xu_3.Ju))
         .id_class(var0, "polished_blackstone_brick_slab_from_blackstone_stonecutting");
      UG.id_class(rkg_3.id_class(xu_3.Ju), xu_3.Jl)
         .id_class("has_blackstone", id_class((rpL_2)xu_3.Ju))
         .id_class(var0, "polished_blackstone_brick_stairs_from_blackstone_stonecutting");
      UG.id_class(rkg_3.id_class(xu_3.Ju), xu_3.JH)
         .id_class("has_blackstone", id_class((rpL_2)xu_3.Ju))
         .id_class(var0, "polished_blackstone_brick_wall_from_blackstone_stonecutting");
      UG.id_class(rkg_3.id_class(xu_3.JF), xu_3.Jq, 2)
         .id_class("has_polished_blackstone", id_class((rpL_2)xu_3.JF))
         .id_class(var0, "polished_blackstone_slab_from_polished_blackstone_stonecutting");
      UG.id_class(rkg_3.id_class(xu_3.JF), xu_3.Jp)
         .id_class("has_polished_blackstone", id_class((rpL_2)xu_3.JF))
         .id_class(var0, "polished_blackstone_stairs_from_polished_blackstone_stonecutting");
      UG.id_class(rkg_3.id_class(xu_3.JF), xu_3.JL)
         .id_class("has_polished_blackstone", id_class((rpL_2)xu_3.JF))
         .id_class(var0, "polished_blackstone_bricks_from_polished_blackstone_stonecutting");
      UG.id_class(rkg_3.id_class(xu_3.JF), xu_3.Jw)
         .id_class("has_polished_blackstone", id_class((rpL_2)xu_3.JF))
         .id_class(var0, "polished_blackstone_wall_from_polished_blackstone_stonecutting");
      UG.id_class(rkg_3.id_class(xu_3.JF), xu_3.JC, 2)
         .id_class("has_polished_blackstone", id_class((rpL_2)xu_3.JF))
         .id_class(var0, "polished_blackstone_brick_slab_from_polished_blackstone_stonecutting");
      UG.id_class(rkg_3.id_class(xu_3.JF), xu_3.Jl)
         .id_class("has_polished_blackstone", id_class((rpL_2)xu_3.JF))
         .id_class(var0, "polished_blackstone_brick_stairs_from_polished_blackstone_stonecutting");
      UG.id_class(rkg_3.id_class(xu_3.JF), xu_3.JH)
         .id_class("has_polished_blackstone", id_class((rpL_2)xu_3.JF))
         .id_class(var0, "polished_blackstone_brick_wall_from_polished_blackstone_stonecutting");
      UG.id_class(rkg_3.id_class(xu_3.JF), xu_3.Jn)
         .id_class("has_polished_blackstone", id_class((rpL_2)xu_3.JF))
         .id_class(var0, "chiseled_polished_blackstone_from_polished_blackstone_stonecutting");
      UG.id_class(rkg_3.id_class(xu_3.JL), xu_3.JC, 2)
         .id_class("has_polished_blackstone_bricks", id_class((rpL_2)xu_3.JL))
         .id_class(var0, "polished_blackstone_brick_slab_from_polished_blackstone_bricks_stonecutting");
      UG.id_class(rkg_3.id_class(xu_3.JL), xu_3.Jl)
         .id_class("has_polished_blackstone_bricks", id_class((rpL_2)xu_3.JL))
         .id_class(var0, "polished_blackstone_brick_stairs_from_polished_blackstone_bricks_stonecutting");
      UG.id_class(rkg_3.id_class(xu_3.JL), xu_3.JH)
         .id_class("has_polished_blackstone_bricks", id_class((rpL_2)xu_3.JL))
         .id_class(var0, "polished_blackstone_brick_wall_from_polished_blackstone_bricks_stonecutting");
      id_class(var0, rdy_3.hz, rdy_3.hF);
      id_class(var0, rdy_3.hQ, rdy_3.hL);
      id_class(var0, rdy_3.hW, rdy_3.hv);
      id_class(var0, rdy_3.hN, rdy_3.hA);
      id_class(var0, rdy_3.Ow, rdy_3.Og);
      id_class(var0, rdy_3.Oj, rdy_3.Oo);
      id_class(var0, rdy_3.Of, rdy_3.OY);
      id_class(var0, rdy_3.OV, rdy_3.OK);
      id_class(var0, rdy_3.OI, rdy_3.OR);
   }

   private static void id_class(Consumer<Dw_1> var0, rdb_3 var1, rdb_3 var2) {
      UM.id_class(rkg_3.id_class(var1), rkg_3.id_class(rdy_3.Ok), var2)
         .id_class("has_netherite_ingot", id_class(rdy_3.Ok))
         .id_class(var0, rVL.id_for.id_break(var2.id_case()).id_break() + "_smithing");
   }

   private static void id_break(Consumer<Dw_1> var0, rpL_2 var1, rpL_2 var2) {
      UB.id_class(var1).id_class('#', var2).id_class("# #").id_class("###").id_break("boat").id_class("in_water", id_class(xu_3.id_try)).id_class(var0);
   }

   private static void id_break(Dn_1 var0, JsonObject var1, Path var2) {
      try {
         String var3 = id_byte.toJson(var1);
         String var4 = id_class.hashUnencodedChars(var3).toString();
         if (!Objects.equals(var0.id_class(var2), var4) || !Files.exists(var2)) {
            Files.createDirectories(var2.getParent());

            try (BufferedWriter var5 = Files.newBufferedWriter(var2)) {
               var5.write(var3);
            }
         }

         var0.id_class(var2, var4);
      } catch (IOException var10) {
         id_break.error("Couldn't save recipe advancement {}", var2, var10);
      }
   }

   private static void id_break(Consumer<Dw_1> var0, rpL_2 var1, rlb_3<rdb_3> var2) {
      Us_1.id_class(var1, 4).id_class(var2).id_class("planks").id_class("has_logs", id_class(var2)).id_class(var0);
   }

   private static void id_throws(Consumer<Dw_1> var0, rpL_2 var1, rpL_2 var2) {
      UB.id_class(var1, 3)
         .id_class('#', rdy_3.OD)
         .id_class('W', var2)
         .id_class("W#W")
         .id_class("W#W")
         .id_break("wooden_fence")
         .id_class("has_planks", id_class(var2))
         .id_class(var0);
   }

   private static void id_finally(Consumer<Dw_1> var0, rpL_2 var1, rpL_2 var2) {
      UB.id_class(var1, 2)
         .id_class('#', var2)
         .id_class("###")
         .id_class("###")
         .id_break("wooden_trapdoor")
         .id_class("has_planks", id_class(var2))
         .id_class(var0);
   }

   private static void id_catch(Consumer<Dw_1> var0, rpL_2 var1, rpL_2 var2) {
      UB.id_class(var1).id_class('#', var2).id_class("##").id_break("wooden_pressure_plate").id_class("has_planks", id_class(var2)).id_class(var0);
   }

   private static void id_extends(Consumer<Dw_1> var0, rpL_2 var1, rpL_2 var2) {
      String var3 = rVL.id_for.id_break(var2.id_case()).id_break();
      UB.id_class(var1, 3)
         .id_break("sign")
         .id_class('#', var2)
         .id_class('X', rdy_3.OD)
         .id_class("###")
         .id_class("###")
         .id_class(" X ")
         .id_class("has_" + var3, id_class(var2))
         .id_class(var0);
   }

   private static void id_case(Consumer<Dw_1> var0, rpL_2 var1, rpL_2 var2) {
      UB.id_class(var1)
         .id_class('#', rdy_3.OD)
         .id_class('W', var2)
         .id_class("#W#")
         .id_class("#W#")
         .id_break("wooden_fence_gate")
         .id_class("has_planks", id_class(var2))
         .id_class(var0);
   }

   private static void id_continue(Consumer<Dw_1> var0, rpL_2 var1, rpL_2 var2) {
      UB.id_class(var1, 8)
         .id_class('#', xu_3.u)
         .id_class('X', var2)
         .id_class("###")
         .id_class("#X#")
         .id_class("###")
         .id_break("stained_glass")
         .id_class("has_glass", id_class((rpL_2)xu_3.u))
         .id_class(var0);
   }

   private static void id_else(Consumer<Dw_1> var0, rpL_2 var1, rpL_2 var2) {
      UB.id_class(var1, 8)
         .id_class('#', xu_3.Ee)
         .id_class('X', var2)
         .id_class("###")
         .id_class("#X#")
         .id_class("###")
         .id_break("stained_terracotta")
         .id_class("has_terracotta", id_class((rpL_2)xu_3.Ee))
         .id_class(var0);
   }

   private static void id_implements(Consumer<Dw_1> var0, rpL_2 var1, rpL_2 var2) {
      UB.id_class(var1, 4)
         .id_class('#', var2)
         .id_class("#  ")
         .id_class("## ")
         .id_class("###")
         .id_break("wooden_stairs")
         .id_class("has_planks", id_class(var2))
         .id_class(var0);
   }

   private static void id_new(Consumer<Dw_1> var0, rpL_2 var1, rpL_2 var2) {
      String var3 = rVL.id_for.id_break(var2.id_case()).id_break();
      UB.id_class(var1)
         .id_class('#', var2)
         .id_class('|', rdy_3.OD)
         .id_class("###")
         .id_class("###")
         .id_class(" | ")
         .id_break("banner")
         .id_class("has_" + var3, id_class(var2))
         .id_class(var0);
   }

   private static void id_package(Consumer<Dw_1> var0, rpL_2 var1, rpL_2 var2) {
      String var3 = rVL.id_for.id_break(var2.id_case()).id_break();
      UB.id_class(var1)
         .id_class('#', var2)
         .id_class('X', rlc_3.id_byte)
         .id_class("###")
         .id_class("XXX")
         .id_break("bed")
         .id_class("has_" + var3, id_class(var2))
         .id_class(var0);
   }

   private static void id_super(Consumer<Dw_1> var0, rpL_2 var1, rpL_2 var2) {
      UB.id_class(var1, 16)
         .id_class('#', var2)
         .id_class("###")
         .id_class("###")
         .id_break("stained_glass_pane")
         .id_class("has_glass", id_class(var2))
         .id_class(var0);
   }

   private static void id_protected(Consumer<Dw_1> var0, rpL_2 var1, rpL_2 var2) {
      UB.id_class(var1, 3)
         .id_class('#', var2)
         .id_class("##")
         .id_class("##")
         .id_class("##")
         .id_break("wooden_door")
         .id_class("has_planks", id_class(var2))
         .id_class(var0);
   }

   private static void id_private(Consumer<Dw_1> var0, rpL_2 var1, rpL_2 var2) {
      UB.id_class(var1, 6).id_class('#', var2).id_class("###").id_break("wooden_slab").id_class("has_planks", id_class(var2)).id_class(var0);
   }

   private static void id_final(Consumer<Dw_1> var0, rpL_2 var1, rpL_2 var2) {
      String var3 = rVL.id_for.id_break(var1.id_case()).id_break();
      String var4 = rVL.id_for.id_break(var2.id_case()).id_break();
      UB.id_class(var1, 8)
         .id_class('#', xu_3.Ep)
         .id_class('$', var2)
         .id_class("###")
         .id_class("#$#")
         .id_class("###")
         .id_break("carpet")
         .id_class("has_white_carpet", id_class((rpL_2)xu_3.Ep))
         .id_class("has_" + var4, id_class(var2))
         .id_class(var0, var3 + "_from_white_carpet");
   }

   private static void id_volatile(Consumer<Dw_1> var0, rpL_2 var1, rpL_2 var2) {
      String var3 = rVL.id_for.id_break(var2.id_case()).id_break();
      UB.id_class(var1, 3).id_class('#', var2).id_class("##").id_break("carpet").id_class("has_" + var3, id_class(var2)).id_class(var0);
   }

   private static void id_synchronized(Consumer<Dw_1> var0, rpL_2 var1, rpL_2 var2) {
      Us_1.id_class(var1, 8)
         .id_break(var2)
         .id_break(xu_3.id_throw, 4)
         .id_break(xu_3.id_char, 4)
         .id_class("concrete_powder")
         .id_class("has_sand", id_class((rpL_2)xu_3.id_throw))
         .id_class("has_gravel", id_class((rpL_2)xu_3.id_char))
         .id_class(var0);
   }

   private static void id_native(Consumer<Dw_1> var0, rpL_2 var1, rpL_2 var2) {
      Us_1.id_class(var1).id_break(var2).id_break(xu_3.rs).id_class("wool").id_class("has_white_wool", id_class((rpL_2)xu_3.rs)).id_class(var0);
   }
}
