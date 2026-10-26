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
   private static final Logger break_ = LogManager.getLogger();
   private static final Gson byte_ = new GsonBuilder().setPrettyPrinting().create();
   private final DA protected_;

   private static void byte_(Consumer<Dw_1> var0, rpL_2 var1, rpL_2 var2) {
      Us_1.class_(var1).break_(var2).class_("wooden_button").class_("has_planks", class_(var2)).class_(var0);
   }

   private static void int_(Consumer<Dw_1> var0, rpL_2 var1, rpL_2 var2) {
      String var3 = rVL.for_.break_(var1.case_()).break_();
      Us_1.class_(var1).break_(rdy_3.XK).break_(var2).class_("dyed_bed").class_("has_bed", class_(rdy_3.XK)).class_(var0, var3 + "_from_white_bed");
   }

   public De_1(DA var1) {
      this.protected_ = var1;
   }

   private static void this_(Consumer<Dw_1> var0, rpL_2 var1, rpL_2 var2) {
      String var3 = rVL.for_.break_(var1.case_()).break_();
      String var4 = rVL.for_.break_(var2.case_()).break_();
      UB.class_(var1, 8)
         .class_('#', xu_3.BV)
         .class_('$', var2)
         .class_("###")
         .class_("#$#")
         .class_("###")
         .break_("stained_glass_pane")
         .class_("has_glass_pane", class_((rpL_2)xu_3.BV))
         .class_("has_" + var4, class_(var2))
         .class_(var0, var3 + "_from_glass_pane");
   }

   @Override
   public String class_() {
      return "Recipes";
   }

   @Override
   public void class_(Dn_1 var1) throws IOException {
      Path var2 = this.protected_.break_();
      HashSet var3 = Sets.newHashSet();
      class_(var3x -> {
         if (!var3.add(var3x.break_())) {
            throw new IllegalStateException("Duplicate recipe " + var3x.break_());
         } else {
            class_(var1, var3x.throws_(), var2.resolve("data/" + var3x.break_().byte_() + "/recipes/" + var3x.break_().break_() + ".json"));
            JsonObject var4 = var3x.byte_();
            if (var4 != null) {
               break_(var1, var4, var2.resolve("data/" + var3x.break_().byte_() + "/advancements/" + var3x.protected_().break_() + ".json"));
            }
         }
      });
      break_(var1, Ot_1.class_().class_("impossible", new XE()).break_(), var2.resolve("data/minecraft/advancements/recipes/root.json"));
   }

   private static Xb_1 class_(rlb_3<rdb_3> var0) {
      return class_(XX.class_().class_(var0).break_());
   }

   private static void class_(Dn_1 var0, JsonObject var1, Path var2) {
      try {
         String var3 = byte_.toJson(var1);
         String var4 = class_.hashUnencodedChars(var3).toString();
         if (!Objects.equals(var0.class_(var2), var4) || !Files.exists(var2)) {
            Files.createDirectories(var2.getParent());

            try (BufferedWriter var5 = Files.newBufferedWriter(var2)) {
               var5.write(var3);
            }
         }

         var0.class_(var2, var4);
      } catch (IOException var10) {
         break_.error("Couldn't save recipe {}", var2, var10);
      }
   }

   private static Xb_1 class_(rpL_2 var0) {
      return class_(XX.class_().class_(var0).break_());
   }

   private static hw_3 class_(xd_3 var0) {
      return new hw_3(ho_3.class_, var0, JS.class_);
   }

   private static void class_(Consumer<Dw_1> var0, String var1, rkl_3<?> var2, int var3) {
      DZ.class_(rkg_3.class_(rdy_3.Jz), rdy_3.JQ, 0.35F, var3, var2).class_("has_beef", class_(rdy_3.Jz)).class_(var0, "cooked_beef_from_" + var1);
      DZ.class_(rkg_3.class_(rdy_3.JN), rdy_3.Jc, 0.35F, var3, var2).class_("has_chicken", class_(rdy_3.JN)).class_(var0, "cooked_chicken_from_" + var1);
      DZ.class_(rkg_3.class_(rdy_3.Xz), rdy_3.Xu, 0.35F, var3, var2).class_("has_cod", class_(rdy_3.Xz)).class_(var0, "cooked_cod_from_" + var1);
      DZ.class_(rkg_3.class_(xu_3.OM), rdy_3.Jd, 0.1F, var3, var2).class_("has_kelp", class_((rpL_2)xu_3.OM)).class_(var0, "dried_kelp_from_" + var1);
      DZ.class_(rkg_3.class_(rdy_3.XQ), rdy_3.Xm, 0.35F, var3, var2).class_("has_salmon", class_(rdy_3.XQ)).class_(var0, "cooked_salmon_from_" + var1);
      DZ.class_(rkg_3.class_(rdy_3.dg), rdy_3.dR, 0.35F, var3, var2).class_("has_mutton", class_(rdy_3.dg)).class_(var0, "cooked_mutton_from_" + var1);
      DZ.class_(rkg_3.class_(rdy_3.hC), rdy_3.hl, 0.35F, var3, var2).class_("has_porkchop", class_(rdy_3.hC)).class_(var0, "cooked_porkchop_from_" + var1);
      DZ.class_(rkg_3.class_(rdy_3.dE), rdy_3.dG, 0.35F, var3, var2).class_("has_potato", class_(rdy_3.dE)).class_(var0, "baked_potato_from_" + var1);
      DZ.class_(rkg_3.class_(rdy_3.dC), rdy_3.dl, 0.35F, var3, var2).class_("has_rabbit", class_(rdy_3.dC)).class_(var0, "cooked_rabbit_from_" + var1);
   }

   private static Xb_1 class_(Xh_1... var0) {
      return new Xb_1(ho_3.class_, XF.throws_, XF.throws_, XF.throws_, var0);
   }

   private static void class_(Consumer<Dw_1> var0, rpL_2 var1, rpL_2 var2) {
      UB.class_(var1, 3).class_('#', var2).class_("##").class_("##").break_("bark").class_("has_log", class_(var2)).class_(var0);
   }

   private static void class_(Consumer<Dw_1> var0, rpL_2 var1, rlb_3<rdb_3> var2) {
      Us_1.class_(var1, 4).class_(var2).class_("planks").class_("has_log", class_(var2)).class_(var0);
   }

   private static void class_(Consumer<Dw_1> var0) {
      class_(var0, xu_3.continue_, rlc_3.else_);
      break_(var0, xu_3.int_, rlc_3.this_);
      break_(var0, xu_3.Xq, rlc_3.public_);
      class_(var0, xu_3.super_, rlc_3.continue_);
      break_(var0, xu_3.new_, rlc_3.synchronized_);
      break_(var0, xu_3.final_, rlc_3.super_);
      break_(var0, xu_3.package_, rlc_3.return_);
      break_(var0, xu_3.XT, rlc_3.goto_);
      class_(var0, xu_3.E, xu_3.const_);
      class_(var0, xu_3.S, xu_3.short_);
      class_(var0, xu_3.G, xu_3.strictfp_);
      class_(var0, xu_3.s, xu_3.default_);
      class_(var0, xu_3.P, xu_3.static_);
      class_(var0, xu_3.B, xu_3.import_);
      class_(var0, xu_3.Xv, xu_3.Xm);
      class_(var0, xu_3.Xk, xu_3.Xx);
      class_(var0, xu_3.X, xu_3.double_);
      class_(var0, xu_3.O, xu_3.transient_);
      class_(var0, xu_3.J, xu_3.switch_);
      class_(var0, xu_3.h, xu_3.for_);
      class_(var0, xu_3.b, xu_3.r);
      class_(var0, xu_3.M, xu_3.boolean_);
      class_(var0, xu_3.XF, xu_3.XZ);
      class_(var0, xu_3.XW, xu_3.Xd);
      break_(var0, rdy_3.kv, xu_3.continue_);
      break_(var0, rdy_3.km, xu_3.int_);
      break_(var0, rdy_3.kF, xu_3.super_);
      break_(var0, rdy_3.kZ, xu_3.new_);
      break_(var0, rdy_3.he, xu_3.final_);
      break_(var0, rdy_3.ku, xu_3.package_);
      byte_(var0, xu_3.sG, xu_3.continue_);
      protected_(var0, xu_3.bL, xu_3.continue_);
      throws_(var0, xu_3.bu, xu_3.continue_);
      case_(var0, xu_3.bW, xu_3.continue_);
      catch_(var0, xu_3.Pn, xu_3.continue_);
      private_(var0, xu_3.GK, xu_3.continue_);
      implements_(var0, xu_3.Ez, xu_3.continue_);
      finally_(var0, xu_3.Bv, xu_3.continue_);
      extends_(var0, xu_3.PM, xu_3.continue_);
      byte_(var0, xu_3.ss, xu_3.int_);
      protected_(var0, xu_3.bv, xu_3.int_);
      throws_(var0, xu_3.bN, xu_3.int_);
      case_(var0, xu_3.bd, xu_3.int_);
      catch_(var0, xu_3.PL, xu_3.int_);
      private_(var0, xu_3.GY, xu_3.int_);
      implements_(var0, xu_3.Su, xu_3.int_);
      finally_(var0, xu_3.Bm, xu_3.int_);
      extends_(var0, xu_3.Pb, xu_3.int_);
      byte_(var0, xu_3.XU, xu_3.Xq);
      protected_(var0, xu_3.Xa, xu_3.Xq);
      throws_(var0, xu_3.Xj, xu_3.Xq);
      case_(var0, xu_3.XY, xu_3.Xq);
      catch_(var0, xu_3.XI, xu_3.Xq);
      private_(var0, xu_3.Xt, xu_3.Xq);
      implements_(var0, xu_3.XK, xu_3.Xq);
      finally_(var0, xu_3.Xg, xu_3.Xq);
      extends_(var0, xu_3.Jr, xu_3.Xq);
      byte_(var0, xu_3.sb, xu_3.super_);
      protected_(var0, xu_3.bA, xu_3.super_);
      throws_(var0, xu_3.bm, xu_3.super_);
      case_(var0, xu_3.bz, xu_3.super_);
      catch_(var0, xu_3.PC, xu_3.super_);
      private_(var0, xu_3.GD, xu_3.super_);
      implements_(var0, xu_3.EQ, xu_3.super_);
      finally_(var0, xu_3.BF, xu_3.super_);
      extends_(var0, xu_3.Ph, xu_3.super_);
      byte_(var0, xu_3.sE, xu_3.new_);
      protected_(var0, xu_3.bF, xu_3.new_);
      throws_(var0, xu_3.bc, xu_3.new_);
      case_(var0, xu_3.bk, xu_3.new_);
      catch_(var0, xu_3.PA, xu_3.new_);
      private_(var0, xu_3.Go, xu_3.new_);
      implements_(var0, xu_3.Sm, xu_3.new_);
      finally_(var0, xu_3.BZ, xu_3.new_);
      extends_(var0, xu_3.PO, xu_3.new_);
      byte_(var0, xu_3.sB, xu_3.final_);
      protected_(var0, xu_3.PX, xu_3.final_);
      throws_(var0, xu_3.PV, xu_3.final_);
      case_(var0, xu_3.BU, xu_3.final_);
      catch_(var0, xu_3.Pv, xu_3.final_);
      private_(var0, xu_3.Gg, xu_3.final_);
      implements_(var0, xu_3.rU, xu_3.final_);
      finally_(var0, xu_3.Bc, xu_3.final_);
      extends_(var0, xu_3.PE, xu_3.final_);
      byte_(var0, xu_3.sS, xu_3.package_);
      protected_(var0, xu_3.bZ, xu_3.package_);
      throws_(var0, xu_3.bQ, xu_3.package_);
      case_(var0, xu_3.bx, xu_3.package_);
      catch_(var0, xu_3.PF, xu_3.package_);
      private_(var0, xu_3.GR, xu_3.package_);
      implements_(var0, xu_3.Sc, xu_3.package_);
      finally_(var0, xu_3.Bu, xu_3.package_);
      extends_(var0, xu_3.PG, xu_3.package_);
      byte_(var0, xu_3.Xe, xu_3.XT);
      protected_(var0, xu_3.Xi, xu_3.XT);
      throws_(var0, xu_3.XV, xu_3.XT);
      case_(var0, xu_3.Xo, xu_3.XT);
      catch_(var0, xu_3.Xf, xu_3.XT);
      private_(var0, xu_3.Xw, xu_3.XT);
      implements_(var0, xu_3.XD, xu_3.XT);
      finally_(var0, xu_3.XR, xu_3.XT);
      extends_(var0, xu_3.JP, xu_3.XT);
      native_(var0, xu_3.rN, rdy_3.XV);
      volatile_(var0, xu_3.EU, xu_3.rN);
      final_(var0, xu_3.EU, rdy_3.XV);
      package_(var0, rdy_3.JO, xu_3.rN);
      int_(var0, rdy_3.JO, rdy_3.XV);
      new_(var0, rdy_3.kb, xu_3.rN);
      native_(var0, xu_3.rk, rdy_3.Xw);
      volatile_(var0, xu_3.EY, xu_3.rk);
      final_(var0, xu_3.EY, rdy_3.Xw);
      package_(var0, rdy_3.JE, xu_3.rk);
      int_(var0, rdy_3.JE, rdy_3.Xw);
      new_(var0, rdy_3.kS, xu_3.rk);
      native_(var0, xu_3.rW, rdy_3.XI);
      volatile_(var0, xu_3.Eo, xu_3.rW);
      final_(var0, xu_3.Eo, rdy_3.XI);
      package_(var0, rdy_3.JG, xu_3.rW);
      int_(var0, rdy_3.JG, rdy_3.XI);
      new_(var0, rdy_3.ks, xu_3.rW);
      native_(var0, xu_3.rx, rdy_3.XT);
      volatile_(var0, xu_3.Eg, xu_3.rx);
      final_(var0, xu_3.Eg, rdy_3.XT);
      package_(var0, rdy_3.JS, xu_3.rx);
      int_(var0, rdy_3.JS, rdy_3.XT);
      new_(var0, rdy_3.kP, xu_3.rx);
      native_(var0, xu_3.rX, rdy_3.Xp);
      volatile_(var0, xu_3.Ej, xu_3.rX);
      final_(var0, xu_3.Ej, rdy_3.Xp);
      package_(var0, rdy_3.JP, xu_3.rX);
      int_(var0, rdy_3.JP, rdy_3.Xp);
      new_(var0, rdy_3.di, xu_3.rX);
      native_(var0, xu_3.rz, rdy_3.Xf);
      volatile_(var0, xu_3.EK, xu_3.rz);
      final_(var0, xu_3.EK, rdy_3.Xf);
      package_(var0, rdy_3.Jb, xu_3.rz);
      int_(var0, rdy_3.Jb, rdy_3.Xf);
      new_(var0, rdy_3.kE, xu_3.rz);
      native_(var0, xu_3.rb, rdy_3.XC);
      volatile_(var0, xu_3.Et, xu_3.rb);
      final_(var0, xu_3.Et, rdy_3.XC);
      package_(var0, rdy_3.Xe, xu_3.rb);
      int_(var0, rdy_3.Xe, rdy_3.XC);
      new_(var0, rdy_3.dD, xu_3.rb);
      native_(var0, xu_3.rJ, rdy_3.Xq);
      volatile_(var0, xu_3.EV, xu_3.rJ);
      final_(var0, xu_3.EV, rdy_3.Xq);
      package_(var0, rdy_3.JB, xu_3.rJ);
      int_(var0, rdy_3.JB, rdy_3.Xq);
      new_(var0, rdy_3.kr, xu_3.rJ);
      native_(var0, xu_3.rO, rdy_3.XH);
      volatile_(var0, xu_3.EI, xu_3.rO);
      final_(var0, xu_3.EI, rdy_3.XH);
      package_(var0, rdy_3.Xi, xu_3.rO);
      int_(var0, rdy_3.Xi, rdy_3.XH);
      new_(var0, rdy_3.de, xu_3.rO);
      native_(var0, xu_3.rG, rdy_3.Xn);
      volatile_(var0, xu_3.ET, xu_3.rG);
      final_(var0, xu_3.ET, rdy_3.Xn);
      package_(var0, rdy_3.XU, xu_3.rG);
      int_(var0, rdy_3.XU, rdy_3.Xn);
      new_(var0, rdy_3.dK, xu_3.rG);
      native_(var0, xu_3.rE, rdy_3.XA);
      volatile_(var0, xu_3.Eq, xu_3.rE);
      final_(var0, xu_3.Eq, rdy_3.XA);
      package_(var0, rdy_3.XD, xu_3.rE);
      int_(var0, rdy_3.XD, rdy_3.XA);
      new_(var0, rdy_3.do_, xu_3.rE);
      native_(var0, xu_3.rh, rdy_3.Xy);
      volatile_(var0, xu_3.Ef, xu_3.rh);
      final_(var0, xu_3.Ef, rdy_3.Xy);
      package_(var0, rdy_3.Jr, xu_3.rh);
      int_(var0, rdy_3.Jr, rdy_3.Xy);
      new_(var0, rdy_3.da, xu_3.rh);
      native_(var0, xu_3.rd, rdy_3.Xt);
      volatile_(var0, xu_3.ER, xu_3.rd);
      final_(var0, xu_3.ER, rdy_3.Xt);
      package_(var0, rdy_3.Js, xu_3.rd);
      int_(var0, rdy_3.Js, rdy_3.Xt);
      new_(var0, rdy_3.kB, xu_3.rd);
      native_(var0, xu_3.rQ, rdy_3.Xj);
      volatile_(var0, xu_3.ED, xu_3.rQ);
      final_(var0, xu_3.ED, rdy_3.Xj);
      package_(var0, rdy_3.JM, xu_3.rQ);
      int_(var0, rdy_3.JM, rdy_3.Xj);
      new_(var0, rdy_3.kG, xu_3.rQ);
      volatile_(var0, xu_3.Ep, xu_3.rs);
      package_(var0, rdy_3.XK, xu_3.rs);
      new_(var0, rdy_3.dY, xu_3.rs);
      native_(var0, xu_3.rM, rdy_3.Xl);
      volatile_(var0, xu_3.Ew, xu_3.rM);
      final_(var0, xu_3.Ew, rdy_3.Xl);
      package_(var0, rdy_3.Xa, xu_3.rM);
      int_(var0, rdy_3.Xa, rdy_3.Xl);
      new_(var0, rdy_3.dU, xu_3.rM);
      continue_(var0, xu_3.BN, rdy_3.XV);
      super_(var0, xu_3.EW, xu_3.BN);
      this_(var0, xu_3.EW, rdy_3.XV);
      continue_(var0, xu_3.Bk, rdy_3.Xw);
      super_(var0, xu_3.EJ, xu_3.Bk);
      this_(var0, xu_3.EJ, rdy_3.Xw);
      continue_(var0, xu_3.BW, rdy_3.XI);
      super_(var0, xu_3.Ex, xu_3.BW);
      this_(var0, xu_3.Ex, rdy_3.XI);
      continue_(var0, xu_3.Bx, rdy_3.XT);
      super_(var0, xu_3.Eh, xu_3.Bx);
      this_(var0, xu_3.Eh, rdy_3.XT);
      continue_(var0, xu_3.BX, rdy_3.Xp);
      super_(var0, xu_3.EM, xu_3.BX);
      this_(var0, xu_3.EM, rdy_3.Xp);
      continue_(var0, xu_3.Bz, rdy_3.Xf);
      super_(var0, xu_3.Ed, xu_3.Bz);
      this_(var0, xu_3.Ed, rdy_3.Xf);
      continue_(var0, xu_3.Bb, rdy_3.XC);
      super_(var0, xu_3.Es, xu_3.Bb);
      this_(var0, xu_3.Es, rdy_3.XC);
      continue_(var0, xu_3.BJ, rdy_3.Xq);
      super_(var0, xu_3.EO, xu_3.BJ);
      this_(var0, xu_3.EO, rdy_3.Xq);
      continue_(var0, xu_3.BO, rdy_3.XH);
      super_(var0, xu_3.EG, xu_3.BO);
      this_(var0, xu_3.EG, rdy_3.XH);
      continue_(var0, xu_3.BG, rdy_3.Xn);
      super_(var0, xu_3.ES, xu_3.BG);
      this_(var0, xu_3.ES, rdy_3.Xn);
      continue_(var0, xu_3.BE, rdy_3.XA);
      super_(var0, xu_3.EB, xu_3.BE);
      this_(var0, xu_3.EB, rdy_3.XA);
      continue_(var0, xu_3.Bh, rdy_3.Xy);
      super_(var0, xu_3.Eb, xu_3.Bh);
      this_(var0, xu_3.Eb, rdy_3.Xy);
      continue_(var0, xu_3.Bd, rdy_3.Xt);
      super_(var0, xu_3.EX, xu_3.Bd);
      this_(var0, xu_3.EX, rdy_3.Xt);
      continue_(var0, xu_3.BQ, rdy_3.Xj);
      super_(var0, xu_3.Ek, xu_3.BQ);
      this_(var0, xu_3.Ek, rdy_3.Xj);
      continue_(var0, xu_3.Bs, rdy_3.XL);
      super_(var0, xu_3.EP, xu_3.Bs);
      this_(var0, xu_3.EP, rdy_3.XL);
      continue_(var0, xu_3.BM, rdy_3.Xl);
      super_(var0, xu_3.EE, xu_3.BM);
      this_(var0, xu_3.EE, rdy_3.Xl);
      else_(var0, xu_3.Er, rdy_3.XV);
      else_(var0, xu_3.sU, rdy_3.Xw);
      else_(var0, xu_3.se, rdy_3.XI);
      else_(var0, xu_3.sK, rdy_3.XT);
      else_(var0, xu_3.sY, rdy_3.Xp);
      else_(var0, xu_3.sa, rdy_3.Xf);
      else_(var0, xu_3.sj, rdy_3.XC);
      else_(var0, xu_3.so, rdy_3.Xq);
      else_(var0, xu_3.sg, rdy_3.XH);
      else_(var0, xu_3.sf, rdy_3.Xn);
      else_(var0, xu_3.sI, rdy_3.XA);
      else_(var0, xu_3.sR, rdy_3.Xy);
      else_(var0, xu_3.sD, rdy_3.Xt);
      else_(var0, xu_3.si, rdy_3.Xj);
      else_(var0, xu_3.sw, rdy_3.XL);
      else_(var0, xu_3.sV, rdy_3.Xl);
      synchronized_(var0, xu_3.Ob, rdy_3.XV);
      synchronized_(var0, xu_3.OS, rdy_3.Xw);
      synchronized_(var0, xu_3.Os, rdy_3.XI);
      synchronized_(var0, xu_3.OP, rdy_3.XT);
      synchronized_(var0, xu_3.Mi, rdy_3.Xp);
      synchronized_(var0, xu_3.OE, rdy_3.Xf);
      synchronized_(var0, xu_3.MD, rdy_3.XC);
      synchronized_(var0, xu_3.Or, rdy_3.Xq);
      synchronized_(var0, xu_3.Me, rdy_3.XH);
      synchronized_(var0, xu_3.MK, rdy_3.Xn);
      synchronized_(var0, xu_3.Mo, rdy_3.XA);
      synchronized_(var0, xu_3.Ma, rdy_3.Xy);
      synchronized_(var0, xu_3.OB, rdy_3.Xt);
      synchronized_(var0, xu_3.OG, rdy_3.Xj);
      synchronized_(var0, xu_3.MY, rdy_3.XL);
      synchronized_(var0, xu_3.MU, rdy_3.Xl);
      UB.class_(xu_3.sT, 6)
         .class_('#', xu_3.PH)
         .class_('S', rdy_3.OD)
         .class_('X', rdy_3.Ox)
         .class_("XSX")
         .class_("X#X")
         .class_("XSX")
         .class_("has_rail", class_((rpL_2)xu_3.Px))
         .class_(var0);
      Us_1.class_(xu_3.catch_, 2).break_(xu_3.throws_).break_(xu_3.volatile_).class_("has_stone", class_((rpL_2)xu_3.throws_)).class_(var0);
      UB.class_(xu_3.sc)
         .class_('I', xu_3.rw)
         .class_('i', rdy_3.Ox)
         .class_("III")
         .class_(" i ")
         .class_("iii")
         .class_("has_iron_block", class_((rpL_2)xu_3.rw))
         .class_(var0);
      UB.class_(rdy_3.dq)
         .class_('/', rdy_3.OD)
         .class_('_', xu_3.Ge)
         .class_("///")
         .class_(" / ")
         .class_("/_/")
         .class_("has_stone_slab", class_((rpL_2)xu_3.Ge))
         .class_(var0);
      UB.class_(rdy_3.OO, 4)
         .class_('#', rdy_3.OD)
         .class_('X', rdy_3.hn)
         .class_('Y', rdy_3.Oi)
         .class_("X")
         .class_("#")
         .class_("Y")
         .class_("has_feather", class_(rdy_3.Oi))
         .class_("has_flint", class_(rdy_3.hn))
         .class_(var0);
      UB.class_(xu_3.ha, 1)
         .class_('P', rlc_3.byte_)
         .class_('S', rlc_3.finally_)
         .class_("PSP")
         .class_("P P")
         .class_("PSP")
         .class_("has_planks", class_(rlc_3.byte_))
         .class_("has_wood_slab", class_(rlc_3.finally_))
         .class_(var0);
      UB.class_(xu_3.Sv)
         .class_('S', rdy_3.dQ)
         .class_('G', xu_3.u)
         .class_('O', xu_3.rg)
         .class_("GGG")
         .class_("GSG")
         .class_("OOO")
         .class_("has_nether_star", class_(rdy_3.dQ))
         .class_(var0);
      UB.class_(xu_3.JO)
         .class_('P', rlc_3.byte_)
         .class_('H', rdy_3.Wm)
         .class_("PPP")
         .class_("HHH")
         .class_("PPP")
         .class_("has_honeycomb", class_(rdy_3.Wm))
         .class_(var0);
      Us_1.class_(rdy_3.kx).break_(rdy_3.OU).break_(rdy_3.kX, 6).class_("has_beetroot", class_(rdy_3.kX)).class_(var0);
      Us_1.class_(rdy_3.XV).break_(rdy_3.XZ).class_("black_dye").class_("has_ink_sac", class_(rdy_3.XZ)).class_(var0);
      Us_1.class_(rdy_3.XV).break_(xu_3.ry).class_("black_dye").class_("has_black_flower", class_((rpL_2)xu_3.ry)).class_(var0, "black_dye_from_wither_rose");
      Us_1.class_(rdy_3.JH, 2).break_(rdy_3.JZ).class_("has_blaze_rod", class_(rdy_3.JZ)).class_(var0);
      Us_1.class_(rdy_3.Xw).break_(rdy_3.XF).class_("blue_dye").class_("has_lapis_lazuli", class_(rdy_3.XF)).class_(var0);
      Us_1.class_(rdy_3.Xw).break_(xu_3.rH).class_("blue_dye").class_("has_blue_flower", class_((rpL_2)xu_3.rH)).class_(var0, "blue_dye_from_cornflower");
      UB.class_(xu_3.hP).class_('#', xu_3.Ei).class_("###").class_("###").class_("###").class_("has_packed_ice", class_((rpL_2)xu_3.Ei)).class_(var0);
      UB.class_(xu_3.bY).class_('X', rdy_3.Xg).class_("XXX").class_("XXX").class_("XXX").class_("has_bonemeal", class_(rdy_3.Xg)).class_(var0);
      Us_1.class_(rdy_3.Xg, 3).break_(rdy_3.XR).class_("bonemeal").class_("has_bone", class_(rdy_3.XR)).class_(var0);
      Us_1.class_(rdy_3.Xg, 9).break_(xu_3.bY).class_("bonemeal").class_("has_bone_block", class_((rpL_2)xu_3.bY)).class_(var0, "bone_meal_from_bone_block");
      Us_1.class_(rdy_3.XM).break_(rdy_3.Xb, 3).break_(rdy_3.ha).class_("has_paper", class_(rdy_3.Xb)).class_(var0);
      UB.class_(xu_3.rj)
         .class_('#', rlc_3.byte_)
         .class_('X', rdy_3.XM)
         .class_("###")
         .class_("XXX")
         .class_("###")
         .class_("has_book", class_(rdy_3.XM))
         .class_(var0);
      UB.class_(rdy_3.OM)
         .class_('#', rdy_3.OD)
         .class_('X', rdy_3.Oa)
         .class_(" #X")
         .class_("# X")
         .class_(" #X")
         .class_("has_string", class_(rdy_3.Oa))
         .class_(var0);
      UB.class_(rdy_3.OU, 4)
         .class_('#', rlc_3.byte_)
         .class_("# #")
         .class_(" # ")
         .class_("has_brown_mushroom", class_((rpL_2)xu_3.rq))
         .class_("has_red_mushroom", class_((rpL_2)xu_3.rT))
         .class_("has_mushroom_stew", class_(rdy_3.Oe))
         .class_(var0);
      UB.class_(rdy_3.hS).class_('#', rdy_3.hB).class_("###").class_("has_wheat", class_(rdy_3.hB)).class_(var0);
      UB.class_(xu_3.SG).class_('B', rdy_3.JZ).class_('#', rlc_3.M).class_(" B ").class_("###").class_("has_blaze_rod", class_(rdy_3.JZ)).class_(var0);
      UB.class_(xu_3.rI).class_('#', rdy_3.Xs).class_("##").class_("##").class_("has_brick", class_(rdy_3.Xs)).class_(var0);
      UB.class_(xu_3.bB, 6).class_('#', xu_3.rI).class_("###").class_("has_brick_block", class_((rpL_2)xu_3.rI)).class_(var0);
      UB.class_(xu_3.Be, 4).class_('#', xu_3.rI).class_("#  ").class_("## ").class_("###").class_("has_brick_block", class_((rpL_2)xu_3.rI)).class_(var0);
      Us_1.class_(rdy_3.XI).break_(rdy_3.Xv).class_("brown_dye").class_("has_cocoa_beans", class_(rdy_3.Xv)).class_(var0);
      UB.class_(rdy_3.hg).class_('#', rdy_3.Ox).class_("# #").class_(" # ").class_("has_iron_ingot", class_(rdy_3.Ox)).class_(var0);
      UB.class_(xu_3.BB)
         .class_('A', rdy_3.hi)
         .class_('B', rdy_3.XY)
         .class_('C', rdy_3.hB)
         .class_('E', rdy_3.XJ)
         .class_("AAA")
         .class_("BEB")
         .class_("CCC")
         .class_("has_egg", class_(rdy_3.XJ))
         .class_(var0);
      UB.class_(xu_3.Xh)
         .class_('L', rlc_3.new_)
         .class_('S', rdy_3.OD)
         .class_('C', rlc_3.S)
         .class_(" S ")
         .class_("SCS")
         .class_("LLL")
         .class_("has_stick", class_(rdy_3.OD))
         .class_("has_coal", class_(rlc_3.S))
         .class_(var0);
      UB.class_(rdy_3.dW).class_('#', rdy_3.Xd).class_('X', rdy_3.ds).class_("# ").class_(" X").class_("has_carrot", class_(rdy_3.ds)).class_(var0);
      UB.class_(rdy_3.dz).class_('#', rdy_3.Xd).class_('X', rdy_3.rC).class_("# ").class_(" X").class_("has_warped_fungus", class_(rdy_3.rC)).class_(var0);
      UB.class_(xu_3.Sb).class_('#', rdy_3.Ox).class_("# #").class_("# #").class_("###").class_("has_water_bucket", class_(rdy_3.hR)).class_(var0);
      UB.class_(xu_3.JG).class_('#', rlc_3.finally_).class_("# #").class_("# #").class_("###").class_("has_wood_slab", class_(rlc_3.finally_)).class_(var0);
      UB.class_(xu_3.re)
         .class_('#', rlc_3.byte_)
         .class_("###")
         .class_("# #")
         .class_("###")
         .class_("has_lots_of_items", new Xb_1(ho_3.class_, XF.break_(10), XF.throws_, XF.throws_, new Xh_1[0]))
         .class_(var0);
      UB.class_(rdy_3.Xh).class_('A', xu_3.re).class_('B', rdy_3.ho).class_("A").class_("B").class_("has_minecart", class_(rdy_3.ho)).class_(var0);
      UB.class_(xu_3.JI).class_('#', xu_3.bs).class_("#").class_("#").class_("has_nether_bricks", class_((rpL_2)xu_3.SP)).class_(var0);
      UB.class_(xu_3.sy)
         .class_('#', xu_3.bE)
         .class_("#")
         .class_("#")
         .class_("has_chiseled_quartz_block", class_((rpL_2)xu_3.sy))
         .class_("has_quartz_block", class_((rpL_2)xu_3.sH))
         .class_("has_quartz_pillar", class_((rpL_2)xu_3.sp))
         .class_(var0);
      UB.class_(xu_3.BC).class_('#', xu_3.bS).class_("#").class_("#").class_("has_stone_bricks", class_(rlc_3.protected_)).class_(var0);
      UB.class_(xu_3.PI).class_('#', rdy_3.XE).class_("##").class_("##").class_("has_clay_ball", class_(rdy_3.XE)).class_(var0);
      UB.class_(rdy_3.Xk)
         .class_('#', rdy_3.Od)
         .class_('X', rdy_3.hD)
         .class_(" # ")
         .class_("#X#")
         .class_(" # ")
         .class_("has_redstone", class_(rdy_3.hD))
         .class_(var0);
      Us_1.class_(rdy_3.Oh, 9).break_(xu_3.Ea).class_("has_coal_block", class_((rpL_2)xu_3.Ea)).class_(var0);
      UB.class_(xu_3.Ea).class_('#', rdy_3.Oh).class_("###").class_("###").class_("###").class_("has_coal", class_(rdy_3.Oh)).class_(var0);
      UB.class_(xu_3.extends_, 4)
         .class_('D', xu_3.finally_)
         .class_('G', xu_3.char_)
         .class_("DG")
         .class_("GD")
         .class_("has_gravel", class_((rpL_2)xu_3.char_))
         .class_(var0);
      UB.class_(xu_3.bP, 6).class_('#', xu_3.volatile_).class_("###").class_("has_cobblestone", class_((rpL_2)xu_3.volatile_)).class_(var0);
      UB.class_(xu_3.SF, 6).class_('#', xu_3.volatile_).class_("###").class_("###").class_("has_cobblestone", class_((rpL_2)xu_3.volatile_)).class_(var0);
      UB.class_(xu_3.sL)
         .class_('#', xu_3.PH)
         .class_('X', rdy_3.dv)
         .class_('I', xu_3.break_)
         .class_(" # ")
         .class_("#X#")
         .class_("III")
         .class_("has_quartz", class_(rdy_3.dv))
         .class_(var0);
      UB.class_(rdy_3.Xx)
         .class_('#', rdy_3.Ox)
         .class_('X', rdy_3.hD)
         .class_(" # ")
         .class_("#X#")
         .class_(" # ")
         .class_("has_redstone", class_(rdy_3.hD))
         .class_(var0);
      UB.class_(rdy_3.Jh, 8).class_('#', rdy_3.hB).class_('X', rdy_3.Xv).class_("#X#").class_("has_cocoa", class_(rdy_3.Xv)).class_(var0);
      UB.class_(xu_3.PP).class_('#', rlc_3.byte_).class_("##").class_("##").class_("has_planks", class_(rlc_3.byte_)).class_(var0);
      UB.class_(rdy_3.kU)
         .class_('~', rdy_3.Oa)
         .class_('#', rdy_3.OD)
         .class_('&', rdy_3.Ox)
         .class_('$', xu_3.Sz)
         .class_("#&#")
         .class_("~$~")
         .class_(" # ")
         .class_("has_string", class_(rdy_3.Oa))
         .class_("has_stick", class_(rdy_3.OD))
         .class_("has_iron_ingot", class_(rdy_3.Ox))
         .class_("has_tripwire_hook", class_((rpL_2)xu_3.Sz))
         .class_(var0);
      UB.class_(xu_3.he).class_('#', rlc_3.byte_).class_('@', rdy_3.Oa).class_("@@").class_("##").class_("has_string", class_(rdy_3.Oa)).class_(var0);
      UB.class_(xu_3.Gf)
         .class_('#', xu_3.bG)
         .class_("#")
         .class_("#")
         .class_("has_red_sandstone", class_((rpL_2)xu_3.GI))
         .class_("has_chiseled_red_sandstone", class_((rpL_2)xu_3.Gf))
         .class_("has_cut_red_sandstone", class_((rpL_2)xu_3.Gj))
         .class_(var0);
      UB.class_(xu_3.L).class_('#', xu_3.Ga).class_("#").class_("#").class_("has_stone_slab", class_((rpL_2)xu_3.Ga)).class_(var0);
      Us_1.class_(rdy_3.XT, 2)
         .break_(rdy_3.Xw)
         .break_(rdy_3.Xf)
         .class_("has_green_dye", class_(rdy_3.Xf))
         .class_("has_blue_dye", class_(rdy_3.Xw))
         .class_(var0);
      UB.class_(xu_3.Ev)
         .class_('S', rdy_3.dA)
         .class_('I', rdy_3.XV)
         .class_("SSS")
         .class_("SIS")
         .class_("SSS")
         .class_("has_prismarine_shard", class_(rdy_3.dA))
         .class_(var0);
      UB.class_(xu_3.EF, 4).class_('#', xu_3.Em).class_("#  ").class_("## ").class_("###").class_("has_prismarine", class_((rpL_2)xu_3.Em)).class_(var0);
      UB.class_(xu_3.EL, 4).class_('#', xu_3.EZ).class_("#  ").class_("## ").class_("###").class_("has_prismarine_bricks", class_((rpL_2)xu_3.EZ)).class_(var0);
      UB.class_(xu_3.EA, 4).class_('#', xu_3.Ev).class_("#  ").class_("## ").class_("###").class_("has_dark_prismarine", class_((rpL_2)xu_3.Ev)).class_(var0);
      UB.class_(xu_3.sA)
         .class_('Q', rdy_3.dv)
         .class_('G', xu_3.u)
         .class_('W', rkg_3.class_(rlc_3.finally_))
         .class_("GGG")
         .class_("QQQ")
         .class_("WWW")
         .class_("has_quartz", class_(rdy_3.dv))
         .class_(var0);
      UB.class_(xu_3.K, 6)
         .class_('R', rdy_3.hD)
         .class_('#', xu_3.Pm)
         .class_('X', rdy_3.Ox)
         .class_("X X")
         .class_("X#X")
         .class_("XRX")
         .class_("has_rail", class_((rpL_2)xu_3.Px))
         .class_(var0);
      Us_1.class_(rdy_3.OJ, 9).break_(xu_3.Pr).class_("has_diamond_block", class_((rpL_2)xu_3.Pr)).class_(var0);
      UB.class_(rdy_3.Oj)
         .class_('#', rdy_3.OD)
         .class_('X', rdy_3.OJ)
         .class_("XX")
         .class_("X#")
         .class_(" #")
         .class_("has_diamond", class_(rdy_3.OJ))
         .class_(var0);
      UB.class_(xu_3.Pr).class_('#', rdy_3.OJ).class_("###").class_("###").class_("###").class_("has_diamond", class_(rdy_3.OJ)).class_(var0);
      UB.class_(rdy_3.hN).class_('X', rdy_3.OJ).class_("X X").class_("X X").class_("has_diamond", class_(rdy_3.OJ)).class_(var0);
      UB.class_(rdy_3.hz).class_('X', rdy_3.OJ).class_("X X").class_("XXX").class_("XXX").class_("has_diamond", class_(rdy_3.OJ)).class_(var0);
      UB.class_(rdy_3.hW).class_('X', rdy_3.OJ).class_("XXX").class_("X X").class_("has_diamond", class_(rdy_3.OJ)).class_(var0);
      UB.class_(rdy_3.OV)
         .class_('#', rdy_3.OD)
         .class_('X', rdy_3.OJ)
         .class_("XX")
         .class_(" #")
         .class_(" #")
         .class_("has_diamond", class_(rdy_3.OJ))
         .class_(var0);
      UB.class_(rdy_3.hQ).class_('X', rdy_3.OJ).class_("XXX").class_("X X").class_("X X").class_("has_diamond", class_(rdy_3.OJ)).class_(var0);
      UB.class_(rdy_3.Of)
         .class_('#', rdy_3.OD)
         .class_('X', rdy_3.OJ)
         .class_("XXX")
         .class_(" # ")
         .class_(" # ")
         .class_("has_diamond", class_(rdy_3.OJ))
         .class_(var0);
      UB.class_(rdy_3.OI).class_('#', rdy_3.OD).class_('X', rdy_3.OJ).class_("X").class_("#").class_("#").class_("has_diamond", class_(rdy_3.OJ)).class_(var0);
      UB.class_(rdy_3.Ow).class_('#', rdy_3.OD).class_('X', rdy_3.OJ).class_("X").class_("X").class_("#").class_("has_diamond", class_(rdy_3.OJ)).class_(var0);
      UB.class_(xu_3.throws_, 2)
         .class_('Q', rdy_3.dv)
         .class_('C', xu_3.volatile_)
         .class_("CQ")
         .class_("QC")
         .class_("has_quartz", class_(rdy_3.dv))
         .class_(var0);
      UB.class_(xu_3.v)
         .class_('R', rdy_3.hD)
         .class_('#', xu_3.volatile_)
         .class_('X', rdy_3.OM)
         .class_("###")
         .class_("#X#")
         .class_("#R#")
         .class_("has_bow", class_(rdy_3.OM))
         .class_(var0);
      UB.class_(xu_3.st)
         .class_('R', rdy_3.hD)
         .class_('#', xu_3.volatile_)
         .class_("###")
         .class_("# #")
         .class_("#R#")
         .class_("has_redstone", class_(rdy_3.hD))
         .class_(var0);
      Us_1.class_(rdy_3.dP, 9).break_(xu_3.SN).class_("has_emerald_block", class_((rpL_2)xu_3.SN)).class_(var0);
      UB.class_(xu_3.SN).class_('#', rdy_3.dP).class_("###").class_("###").class_("###").class_("has_emerald", class_(rdy_3.dP)).class_(var0);
      UB.class_(xu_3.SE)
         .class_('B', rdy_3.XM)
         .class_('#', xu_3.rg)
         .class_('D', rdy_3.OJ)
         .class_(" B ")
         .class_("D#D")
         .class_("###")
         .class_("has_obsidian", class_((rpL_2)xu_3.rg))
         .class_(var0);
      UB.class_(xu_3.SW)
         .class_('#', xu_3.rg)
         .class_('E', rdy_3.JT)
         .class_("###")
         .class_("#E#")
         .class_("###")
         .class_("has_ender_eye", class_(rdy_3.JT))
         .class_(var0);
      Us_1.class_(rdy_3.JT).break_(rdy_3.Jm).break_(rdy_3.JH).class_("has_blaze_powder", class_(rdy_3.JH)).class_(var0);
      UB.class_(xu_3.bq, 4).class_('#', xu_3.Sh).class_("##").class_("##").class_("has_end_stone", class_((rpL_2)xu_3.Sh)).class_(var0);
      UB.class_(rdy_3.kM)
         .class_('T', rdy_3.Jv)
         .class_('E', rdy_3.JT)
         .class_('G', xu_3.u)
         .class_("GGG")
         .class_("GEG")
         .class_("GTG")
         .class_("has_ender_eye", class_(rdy_3.JT))
         .class_(var0);
      UB.class_(xu_3.bn, 4)
         .class_('#', rdy_3.kh)
         .class_('/', rdy_3.JZ)
         .class_("/")
         .class_("#")
         .class_("has_chorus_fruit_popped", class_(rdy_3.kh))
         .class_(var0);
      Us_1.class_(rdy_3.Jl).break_(rdy_3.JC).break_(xu_3.rq).break_(rdy_3.XY).class_("has_spider_eye", class_(rdy_3.JC)).class_(var0);
      Us_1.class_(rdy_3.xa, 3)
         .break_(rdy_3.hr)
         .break_(rdy_3.JH)
         .class_(rkg_3.class_(rdy_3.Oh, rdy_3.OX))
         .class_("has_blaze_powder", class_(rdy_3.JH))
         .class_(var0);
      UB.class_(rdy_3.Xd)
         .class_('#', rdy_3.OD)
         .class_('X', rdy_3.Oa)
         .class_("  #")
         .class_(" #X")
         .class_("# X")
         .class_("has_string", class_(rdy_3.Oa))
         .class_(var0);
      Us_1.class_(rdy_3.OG).break_(rdy_3.Ox).break_(rdy_3.hn).class_("has_flint", class_(rdy_3.hn)).class_("has_obsidian", class_((rpL_2)xu_3.rg)).class_(var0);
      UB.class_(xu_3.SA).class_('#', rdy_3.Xs).class_("# #").class_(" # ").class_("has_brick", class_(rdy_3.Xs)).class_(var0);
      UB.class_(xu_3.Ps).class_('#', rlc_3.M).class_("###").class_("# #").class_("###").class_("has_cobblestone", class_(rlc_3.M)).class_(var0);
      UB.class_(rdy_3.XX).class_('A', xu_3.Ps).class_('B', rdy_3.ho).class_("A").class_("B").class_("has_minecart", class_(rdy_3.ho)).class_(var0);
      UB.class_(rdy_3.Jn, 3).class_('#', xu_3.u).class_("# #").class_(" # ").class_("has_glass", class_((rpL_2)xu_3.u)).class_(var0);
      UB.class_(xu_3.BV, 16).class_('#', xu_3.u).class_("###").class_("###").class_("has_glass", class_((rpL_2)xu_3.u)).class_(var0);
      UB.class_(xu_3.Pa).class_('#', rdy_3.XW).class_("##").class_("##").class_("has_glowstone_dust", class_(rdy_3.XW)).class_(var0);
      UB.class_(rdy_3.hy)
         .class_('#', rdy_3.Od)
         .class_('X', rdy_3.Ob)
         .class_("###")
         .class_("#X#")
         .class_("###")
         .class_("has_gold_ingot", class_(rdy_3.Od))
         .class_(var0);
      UB.class_(rdy_3.Ol)
         .class_('#', rdy_3.OD)
         .class_('X', rdy_3.Od)
         .class_("XX")
         .class_("X#")
         .class_(" #")
         .class_("has_gold_ingot", class_(rdy_3.Od))
         .class_(var0);
      UB.class_(rdy_3.hZ).class_('X', rdy_3.Od).class_("X X").class_("X X").class_("has_gold_ingot", class_(rdy_3.Od)).class_(var0);
      UB.class_(rdy_3.dO)
         .class_('#', rdy_3.JF)
         .class_('X', rdy_3.ds)
         .class_("###")
         .class_("#X#")
         .class_("###")
         .class_("has_gold_nugget", class_(rdy_3.JF))
         .class_(var0);
      UB.class_(rdy_3.hu).class_('X', rdy_3.Od).class_("X X").class_("XXX").class_("XXX").class_("has_gold_ingot", class_(rdy_3.Od)).class_(var0);
      UB.class_(rdy_3.hc).class_('X', rdy_3.Od).class_("XXX").class_("X X").class_("has_gold_ingot", class_(rdy_3.Od)).class_(var0);
      UB.class_(rdy_3.OH)
         .class_('#', rdy_3.OD)
         .class_('X', rdy_3.Od)
         .class_("XX")
         .class_(" #")
         .class_(" #")
         .class_("has_gold_ingot", class_(rdy_3.Od))
         .class_(var0);
      UB.class_(rdy_3.hm).class_('X', rdy_3.Od).class_("XXX").class_("X X").class_("X X").class_("has_gold_ingot", class_(rdy_3.Od)).class_(var0);
      UB.class_(rdy_3.OC)
         .class_('#', rdy_3.OD)
         .class_('X', rdy_3.Od)
         .class_("XXX")
         .class_(" # ")
         .class_(" # ")
         .class_("has_gold_ingot", class_(rdy_3.Od))
         .class_(var0);
      UB.class_(xu_3.o, 6)
         .class_('R', rdy_3.hD)
         .class_('#', rdy_3.OD)
         .class_('X', rdy_3.Od)
         .class_("X X")
         .class_("X#X")
         .class_("XRX")
         .class_("has_rail", class_((rpL_2)xu_3.Px))
         .class_(var0);
      UB.class_(rdy_3.On)
         .class_('#', rdy_3.OD)
         .class_('X', rdy_3.Od)
         .class_("X")
         .class_("#")
         .class_("#")
         .class_("has_gold_ingot", class_(rdy_3.Od))
         .class_(var0);
      UB.class_(rdy_3.OA)
         .class_('#', rdy_3.OD)
         .class_('X', rdy_3.Od)
         .class_("X")
         .class_("X")
         .class_("#")
         .class_("has_gold_ingot", class_(rdy_3.Od))
         .class_(var0);
      UB.class_(xu_3.rt).class_('#', rdy_3.Od).class_("###").class_("###").class_("###").class_("has_gold_ingot", class_(rdy_3.Od)).class_(var0);
      Us_1.class_(rdy_3.Od, 9).break_(xu_3.rt).class_("gold_ingot").class_("has_gold_block", class_((rpL_2)xu_3.rt)).class_(var0, "gold_ingot_from_gold_block");
      UB.class_(rdy_3.Od)
         .class_('#', rdy_3.JF)
         .class_("###")
         .class_("###")
         .class_("###")
         .break_("gold_ingot")
         .class_("has_gold_nugget", class_(rdy_3.JF))
         .class_(var0, "gold_ingot_from_nuggets");
      Us_1.class_(rdy_3.JF, 9).break_(rdy_3.Od).class_("has_gold_ingot", class_(rdy_3.Od)).class_(var0);
      Us_1.class_(xu_3.byte_).break_(xu_3.throws_).break_(rdy_3.dv).class_("has_quartz", class_(rdy_3.dv)).class_(var0);
      Us_1.class_(rdy_3.Xp, 2)
         .break_(rdy_3.XV)
         .break_(rdy_3.XL)
         .class_("has_white_dye", class_(rdy_3.XL))
         .class_("has_black_dye", class_(rdy_3.XV))
         .class_(var0);
      UB.class_(xu_3.Ey).class_('#', rdy_3.hB).class_("###").class_("###").class_("###").class_("has_wheat", class_(rdy_3.hB)).class_(var0);
      UB.class_(xu_3.sF).class_('#', rdy_3.Ox).class_("##").class_("has_iron_ingot", class_(rdy_3.Ox)).class_(var0);
      Us_1.class_(rdy_3.WF, 4).break_(rdy_3.WL).break_(rdy_3.Jn, 4).class_("has_honey_block", class_((rpL_2)xu_3.Jh)).class_(var0);
      UB.class_(xu_3.Jh, 1).class_('S', rdy_3.WF).class_("SS").class_("SS").class_("has_honey_bottle", class_(rdy_3.WF)).class_(var0);
      UB.class_(xu_3.JX).class_('H', rdy_3.Wm).class_("HH").class_("HH").class_("has_honeycomb", class_(rdy_3.Wm)).class_(var0);
      UB.class_(xu_3.sl)
         .class_('C', xu_3.re)
         .class_('I', rdy_3.Ox)
         .class_("I I")
         .class_("ICI")
         .class_(" I ")
         .class_("has_iron_ingot", class_(rdy_3.Ox))
         .class_(var0);
      UB.class_(rdy_3.dL).class_('A', xu_3.sl).class_('B', rdy_3.ho).class_("A").class_("B").class_("has_minecart", class_(rdy_3.ho)).class_(var0);
      UB.class_(rdy_3.OT)
         .class_('#', rdy_3.OD)
         .class_('X', rdy_3.Ox)
         .class_("XX")
         .class_("X#")
         .class_(" #")
         .class_("has_iron_ingot", class_(rdy_3.Ox))
         .class_(var0);
      UB.class_(xu_3.Bf, 16).class_('#', rdy_3.Ox).class_("###").class_("###").class_("has_iron_ingot", class_(rdy_3.Ox)).class_(var0);
      UB.class_(xu_3.rw).class_('#', rdy_3.Ox).class_("###").class_("###").class_("###").class_("has_iron_ingot", class_(rdy_3.Ox)).class_(var0);
      UB.class_(rdy_3.hk).class_('X', rdy_3.Ox).class_("X X").class_("X X").class_("has_iron_ingot", class_(rdy_3.Ox)).class_(var0);
      UB.class_(rdy_3.hx).class_('X', rdy_3.Ox).class_("X X").class_("XXX").class_("XXX").class_("has_iron_ingot", class_(rdy_3.Ox)).class_(var0);
      UB.class_(xu_3.PZ, 3).class_('#', rdy_3.Ox).class_("##").class_("##").class_("##").class_("has_iron_ingot", class_(rdy_3.Ox)).class_(var0);
      UB.class_(rdy_3.hJ).class_('X', rdy_3.Ox).class_("XXX").class_("X X").class_("has_iron_ingot", class_(rdy_3.Ox)).class_(var0);
      UB.class_(rdy_3.Ot)
         .class_('#', rdy_3.OD)
         .class_('X', rdy_3.Ox)
         .class_("XX")
         .class_(" #")
         .class_(" #")
         .class_("has_iron_ingot", class_(rdy_3.Ox))
         .class_(var0);
      Us_1.class_(rdy_3.Ox, 9).break_(xu_3.rw).class_("iron_ingot").class_("has_iron_block", class_((rpL_2)xu_3.rw)).class_(var0, "iron_ingot_from_iron_block");
      UB.class_(rdy_3.Ox)
         .class_('#', rdy_3.kn)
         .class_("###")
         .class_("###")
         .class_("###")
         .break_("iron_ingot")
         .class_("has_iron_nugget", class_(rdy_3.kn))
         .class_(var0, "iron_ingot_from_nuggets");
      UB.class_(rdy_3.hd).class_('X', rdy_3.Ox).class_("XXX").class_("X X").class_("X X").class_("has_iron_ingot", class_(rdy_3.Ox)).class_(var0);
      Us_1.class_(rdy_3.kn, 9).break_(rdy_3.Ox).class_("has_iron_ingot", class_(rdy_3.Ox)).class_(var0);
      UB.class_(rdy_3.Oq)
         .class_('#', rdy_3.OD)
         .class_('X', rdy_3.Ox)
         .class_("XXX")
         .class_(" # ")
         .class_(" # ")
         .class_("has_iron_ingot", class_(rdy_3.Ox))
         .class_(var0);
      UB.class_(rdy_3.Op)
         .class_('#', rdy_3.OD)
         .class_('X', rdy_3.Ox)
         .class_("X")
         .class_("#")
         .class_("#")
         .class_("has_iron_ingot", class_(rdy_3.Ox))
         .class_(var0);
      UB.class_(rdy_3.Oy)
         .class_('#', rdy_3.OD)
         .class_('X', rdy_3.Ox)
         .class_("X")
         .class_("X")
         .class_("#")
         .class_("has_iron_ingot", class_(rdy_3.Ox))
         .class_(var0);
      UB.class_(xu_3.Eu).class_('#', rdy_3.Ox).class_("##").class_("##").class_("has_iron_ingot", class_(rdy_3.Ox)).class_(var0);
      UB.class_(rdy_3.dB)
         .class_('#', rdy_3.OD)
         .class_('X', rdy_3.ha)
         .class_("###")
         .class_("#X#")
         .class_("###")
         .class_("has_leather", class_(rdy_3.ha))
         .class_(var0);
      UB.class_(xu_3.Pj)
         .class_('#', rlc_3.byte_)
         .class_('X', rdy_3.OJ)
         .class_("###")
         .class_("#X#")
         .class_("###")
         .class_("has_diamond", class_(rdy_3.OJ))
         .class_(var0);
      UB.class_(xu_3.PJ, 3).class_('#', rdy_3.OD).class_("# #").class_("###").class_("# #").class_("has_stick", class_(rdy_3.OD)).class_(var0);
      UB.class_(xu_3.Z).class_('#', rdy_3.XF).class_("###").class_("###").class_("###").class_("has_lapis", class_(rdy_3.XF)).class_(var0);
      Us_1.class_(rdy_3.XF, 9).break_(xu_3.Z).class_("has_lapis_block", class_((rpL_2)xu_3.Z)).class_(var0);
      UB.class_(rdy_3.df, 2)
         .class_('~', rdy_3.Oa)
         .class_('O', rdy_3.XO)
         .class_("~~ ")
         .class_("~O ")
         .class_("  ~")
         .class_("has_slime_ball", class_(rdy_3.XO))
         .class_(var0);
      UB.class_(rdy_3.ha).class_('#', rdy_3.dp).class_("##").class_("##").class_("has_rabbit_hide", class_(rdy_3.dp)).class_(var0);
      UB.class_(rdy_3.hb).class_('X', rdy_3.ha).class_("X X").class_("X X").class_("has_leather", class_(rdy_3.ha)).class_(var0);
      UB.class_(rdy_3.hE).class_('X', rdy_3.ha).class_("X X").class_("XXX").class_("XXX").class_("has_leather", class_(rdy_3.ha)).class_(var0);
      UB.class_(rdy_3.hs).class_('X', rdy_3.ha).class_("XXX").class_("X X").class_("has_leather", class_(rdy_3.ha)).class_(var0);
      UB.class_(rdy_3.hG).class_('X', rdy_3.ha).class_("XXX").class_("X X").class_("X X").class_("has_leather", class_(rdy_3.ha)).class_(var0);
      UB.class_(rdy_3.dI).class_('X', rdy_3.ha).class_("X X").class_("XXX").class_("X X").class_("has_leather", class_(rdy_3.ha)).class_(var0);
      UB.class_(xu_3.Xs)
         .class_('S', rlc_3.finally_)
         .class_('B', xu_3.rj)
         .class_("SSS")
         .class_(" B ")
         .class_(" S ")
         .class_("has_book", class_(rdy_3.XM))
         .class_(var0);
      UB.class_(xu_3.Pu)
         .class_('#', xu_3.volatile_)
         .class_('X', rdy_3.OD)
         .class_("X")
         .class_("#")
         .class_("has_cobblestone", class_((rpL_2)xu_3.volatile_))
         .class_(var0);
      Us_1.class_(rdy_3.XC)
         .break_(xu_3.rZ)
         .class_("light_blue_dye")
         .class_("has_red_flower", class_((rpL_2)xu_3.rZ))
         .class_(var0, "light_blue_dye_from_blue_orchid");
      Us_1.class_(rdy_3.XC, 2)
         .break_(rdy_3.Xw)
         .break_(rdy_3.XL)
         .class_("light_blue_dye")
         .class_("has_blue_dye", class_(rdy_3.Xw))
         .class_("has_white_dye", class_(rdy_3.XL))
         .class_(var0, "light_blue_dye_from_blue_white_dye");
      Us_1.class_(rdy_3.Xq)
         .break_(xu_3.rF)
         .class_("light_gray_dye")
         .class_("has_red_flower", class_((rpL_2)xu_3.rF))
         .class_(var0, "light_gray_dye_from_azure_bluet");
      Us_1.class_(rdy_3.Xq, 2)
         .break_(rdy_3.Xp)
         .break_(rdy_3.XL)
         .class_("light_gray_dye")
         .class_("has_gray_dye", class_(rdy_3.Xp))
         .class_("has_white_dye", class_(rdy_3.XL))
         .class_(var0, "light_gray_dye_from_gray_white_dye");
      Us_1.class_(rdy_3.Xq, 3)
         .break_(rdy_3.XV)
         .break_(rdy_3.XL, 2)
         .class_("light_gray_dye")
         .class_("has_white_dye", class_(rdy_3.XL))
         .class_("has_black_dye", class_(rdy_3.XV))
         .class_(var0, "light_gray_dye_from_black_white_dye");
      Us_1.class_(rdy_3.Xq)
         .break_(xu_3.rl)
         .class_("light_gray_dye")
         .class_("has_red_flower", class_((rpL_2)xu_3.rl))
         .class_(var0, "light_gray_dye_from_oxeye_daisy");
      Us_1.class_(rdy_3.Xq)
         .break_(xu_3.rn)
         .class_("light_gray_dye")
         .class_("has_red_flower", class_((rpL_2)xu_3.rn))
         .class_(var0, "light_gray_dye_from_white_tulip");
      UB.class_(xu_3.sv).class_('#', rdy_3.Od).class_("##").class_("has_gold_ingot", class_(rdy_3.Od)).class_(var0);
      Us_1.class_(rdy_3.XH, 2)
         .break_(rdy_3.Xf)
         .break_(rdy_3.XL)
         .class_("has_green_dye", class_(rdy_3.Xf))
         .class_("has_white_dye", class_(rdy_3.XL))
         .class_(var0);
      UB.class_(xu_3.BP).class_('A', xu_3.Br).class_('B', xu_3.rR).class_("A").class_("B").class_("has_carved_pumpkin", class_((rpL_2)xu_3.Br)).class_(var0);
      Us_1.class_(rdy_3.Xn).break_(xu_3.rv).class_("magenta_dye").class_("has_red_flower", class_((rpL_2)xu_3.rv)).class_(var0, "magenta_dye_from_allium");
      Us_1.class_(rdy_3.Xn, 4)
         .break_(rdy_3.Xw)
         .break_(rdy_3.Xj, 2)
         .break_(rdy_3.XL)
         .class_("magenta_dye")
         .class_("has_blue_dye", class_(rdy_3.Xw))
         .class_("has_rose_red", class_(rdy_3.Xj))
         .class_("has_white_dye", class_(rdy_3.XL))
         .class_(var0, "magenta_dye_from_blue_red_white_dye");
      Us_1.class_(rdy_3.Xn, 3)
         .break_(rdy_3.Xw)
         .break_(rdy_3.Xj)
         .break_(rdy_3.Xy)
         .class_("magenta_dye")
         .class_("has_pink_dye", class_(rdy_3.Xy))
         .class_("has_blue_dye", class_(rdy_3.Xw))
         .class_("has_red_dye", class_(rdy_3.Xj))
         .class_(var0, "magenta_dye_from_blue_red_pink");
      Us_1.class_(rdy_3.Xn, 2).break_(xu_3.GP).class_("magenta_dye").class_("has_double_plant", class_((rpL_2)xu_3.GP)).class_(var0, "magenta_dye_from_lilac");
      Us_1.class_(rdy_3.Xn, 2)
         .break_(rdy_3.Xt)
         .break_(rdy_3.Xy)
         .class_("magenta_dye")
         .class_("has_pink_dye", class_(rdy_3.Xy))
         .class_("has_purple_dye", class_(rdy_3.Xt))
         .class_(var0, "magenta_dye_from_purple_and_pink");
      UB.class_(xu_3.bV).class_('#', rdy_3.Jy).class_("##").class_("##").class_("has_magma_cream", class_(rdy_3.Jy)).class_(var0);
      Us_1.class_(rdy_3.Jy).break_(rdy_3.JH).break_(rdy_3.XO).class_("has_blaze_powder", class_(rdy_3.JH)).class_(var0);
      UB.class_(rdy_3.dM)
         .class_('#', rdy_3.Xb)
         .class_('X', rdy_3.Xx)
         .class_("###")
         .class_("#X#")
         .class_("###")
         .class_("has_compass", class_(rdy_3.Xx))
         .class_(var0);
      UB.class_(xu_3.Bg).class_('M', rdy_3.Jx).class_("MMM").class_("MMM").class_("MMM").class_("has_melon", class_(rdy_3.Jx)).class_(var0);
      Us_1.class_(rdy_3.JW).break_(rdy_3.Jx).class_("has_melon", class_(rdy_3.Jx)).class_(var0);
      UB.class_(rdy_3.ho).class_('#', rdy_3.Ox).class_("# #").class_("###").class_("has_iron_ingot", class_(rdy_3.Ox)).class_(var0);
      Us_1.class_(xu_3.rV).break_(xu_3.volatile_).break_(xu_3.BD).class_("has_vine", class_((rpL_2)xu_3.BD)).class_(var0);
      UB.class_(xu_3.SL, 6).class_('#', xu_3.rV).class_("###").class_("###").class_("has_mossy_cobblestone", class_((rpL_2)xu_3.rV)).class_(var0);
      Us_1.class_(xu_3.BA).break_(xu_3.BL).break_(xu_3.BD).class_("has_mossy_cobblestone", class_((rpL_2)xu_3.rV)).class_(var0);
      Us_1.class_(rdy_3.Oe)
         .break_(xu_3.rq)
         .break_(xu_3.rT)
         .break_(rdy_3.OU)
         .class_("has_mushroom_stew", class_(rdy_3.Oe))
         .class_("has_bowl", class_(rdy_3.OU))
         .class_("has_brown_mushroom", class_((rpL_2)xu_3.rq))
         .class_("has_red_mushroom", class_((rpL_2)xu_3.rT))
         .class_(var0);
      UB.class_(xu_3.SP).class_('N', rdy_3.dZ).class_("NN").class_("NN").class_("has_netherbrick", class_(rdy_3.dZ)).class_(var0);
      UB.class_(xu_3.SB, 6)
         .class_('#', xu_3.SP)
         .class_('-', rdy_3.dZ)
         .class_("#-#")
         .class_("#-#")
         .class_("has_nether_brick", class_((rpL_2)xu_3.SP))
         .class_(var0);
      UB.class_(xu_3.bs, 6).class_('#', xu_3.SP).class_("###").class_("has_nether_brick", class_((rpL_2)xu_3.SP)).class_(var0);
      UB.class_(xu_3.SS, 4).class_('#', xu_3.SP).class_("#  ").class_("## ").class_("###").class_("has_nether_brick", class_((rpL_2)xu_3.SP)).class_(var0);
      UB.class_(xu_3.bg).class_('#', rdy_3.JL).class_("###").class_("###").class_("###").class_("has_nether_wart", class_(rdy_3.JL)).class_(var0);
      UB.class_(xu_3.n)
         .class_('#', rlc_3.byte_)
         .class_('X', rdy_3.hD)
         .class_("###")
         .class_("#X#")
         .class_("###")
         .class_("has_redstone", class_(rdy_3.hD))
         .class_(var0);
      UB.class_(xu_3.bK)
         .class_('Q', rdy_3.dv)
         .class_('R', rdy_3.hD)
         .class_('#', xu_3.volatile_)
         .class_("###")
         .class_("RRQ")
         .class_("###")
         .class_("has_quartz", class_(rdy_3.dv))
         .class_(var0);
      Us_1.class_(rdy_3.XA).break_(xu_3.rA).class_("orange_dye").class_("has_red_flower", class_((rpL_2)xu_3.rA)).class_(var0, "orange_dye_from_orange_tulip");
      Us_1.class_(rdy_3.XA, 2)
         .break_(rdy_3.Xj)
         .break_(rdy_3.Xl)
         .class_("orange_dye")
         .class_("has_red_dye", class_(rdy_3.Xj))
         .class_("has_yellow_dye", class_(rdy_3.Xl))
         .class_(var0, "orange_dye_from_red_yellow");
      UB.class_(rdy_3.hH)
         .class_('#', rdy_3.OD)
         .class_('X', rkg_3.class_(rlc_3.break_))
         .class_("###")
         .class_("#X#")
         .class_("###")
         .class_("has_wool", class_(rlc_3.break_))
         .class_(var0);
      UB.class_(rdy_3.Xb, 3).class_('#', xu_3.Pf).class_("###").class_("has_reeds", class_((rpL_2)xu_3.Pf)).class_(var0);
      UB.class_(xu_3.sp, 2)
         .class_('#', xu_3.sH)
         .class_("#")
         .class_("#")
         .class_("has_chiseled_quartz_block", class_((rpL_2)xu_3.sy))
         .class_("has_quartz_block", class_((rpL_2)xu_3.sH))
         .class_("has_quartz_pillar", class_((rpL_2)xu_3.sp))
         .class_(var0);
      Us_1.class_(xu_3.Ei).break_(xu_3.PT, 9).class_("has_ice", class_((rpL_2)xu_3.PT)).class_(var0);
      Us_1.class_(rdy_3.Xy, 2).break_(xu_3.GS).class_("pink_dye").class_("has_double_plant", class_((rpL_2)xu_3.GS)).class_(var0, "pink_dye_from_peony");
      Us_1.class_(rdy_3.Xy).break_(xu_3.rC).class_("pink_dye").class_("has_red_flower", class_((rpL_2)xu_3.rC)).class_(var0, "pink_dye_from_pink_tulip");
      Us_1.class_(rdy_3.Xy, 2)
         .break_(rdy_3.Xj)
         .break_(rdy_3.XL)
         .class_("pink_dye")
         .class_("has_white_dye", class_(rdy_3.XL))
         .class_("has_red_dye", class_(rdy_3.Xj))
         .class_(var0, "pink_dye_from_red_white_dye");
      UB.class_(xu_3.rB)
         .class_('R', rdy_3.hD)
         .class_('#', xu_3.volatile_)
         .class_('T', rlc_3.byte_)
         .class_('X', rdy_3.Ox)
         .class_("TTT")
         .class_("#X#")
         .class_("#R#")
         .class_("has_redstone", class_(rdy_3.hD))
         .class_(var0);
      UB.class_(xu_3.PD, 4).class_('S', xu_3.PK).class_("SS").class_("SS").class_("has_basalt", class_((rpL_2)xu_3.PK)).class_(var0);
      UB.class_(xu_3.protected_, 4).class_('S', xu_3.byte_).class_("SS").class_("SS").class_("has_stone", class_((rpL_2)xu_3.byte_)).class_(var0);
      UB.class_(xu_3.case_, 4).class_('S', xu_3.throws_).class_("SS").class_("SS").class_("has_stone", class_((rpL_2)xu_3.throws_)).class_(var0);
      UB.class_(xu_3.private_, 4).class_('S', xu_3.catch_).class_("SS").class_("SS").class_("has_stone", class_((rpL_2)xu_3.catch_)).class_(var0);
      UB.class_(xu_3.Em).class_('S', rdy_3.dA).class_("SS").class_("SS").class_("has_prismarine_shard", class_(rdy_3.dA)).class_(var0);
      UB.class_(xu_3.EZ).class_('S', rdy_3.dA).class_("SSS").class_("SSS").class_("SSS").class_("has_prismarine_shard", class_(rdy_3.dA)).class_(var0);
      UB.class_(xu_3.En, 6).class_('#', xu_3.Em).class_("###").class_("has_prismarine", class_((rpL_2)xu_3.Em)).class_(var0);
      UB.class_(xu_3.EC, 6).class_('#', xu_3.EZ).class_("###").class_("has_prismarine_bricks", class_((rpL_2)xu_3.EZ)).class_(var0);
      UB.class_(xu_3.El, 6).class_('#', xu_3.Ev).class_("###").class_("has_dark_prismarine", class_((rpL_2)xu_3.Ev)).class_(var0);
      Us_1.class_(rdy_3.dN)
         .break_(xu_3.Pg)
         .break_(rdy_3.XY)
         .break_(rdy_3.XJ)
         .class_("has_carved_pumpkin", class_((rpL_2)xu_3.Br))
         .class_("has_pumpkin", class_((rpL_2)xu_3.Pg))
         .class_(var0);
      Us_1.class_(rdy_3.Jk, 4).break_(xu_3.Pg).class_("has_pumpkin", class_((rpL_2)xu_3.Pg)).class_(var0);
      Us_1.class_(rdy_3.Xt, 2).break_(rdy_3.Xw).break_(rdy_3.Xj).class_("has_blue_dye", class_(rdy_3.Xw)).class_("has_red_dye", class_(rdy_3.Xj)).class_(var0);
      UB.class_(xu_3.bD)
         .class_('#', xu_3.re)
         .class_('-', rdy_3.kA)
         .class_("-")
         .class_("#")
         .class_("-")
         .class_("has_shulker_shell", class_(rdy_3.kA))
         .class_(var0);
      UB.class_(xu_3.bH, 4).class_('F', rdy_3.kh).class_("FF").class_("FF").class_("has_chorus_fruit_popped", class_(rdy_3.kh)).class_(var0);
      UB.class_(xu_3.by).class_('#', xu_3.bM).class_("#").class_("#").class_("has_purpur_block", class_((rpL_2)xu_3.bH)).class_(var0);
      UB.class_(xu_3.bM, 6).class_('#', rkg_3.class_(xu_3.bH, xu_3.by)).class_("###").class_("has_purpur_block", class_((rpL_2)xu_3.bH)).class_(var0);
      UB.class_(xu_3.bp, 4)
         .class_('#', rkg_3.class_(xu_3.bH, xu_3.by))
         .class_("#  ")
         .class_("## ")
         .class_("###")
         .class_("has_purpur_block", class_((rpL_2)xu_3.bH))
         .class_(var0);
      UB.class_(xu_3.sH).class_('#', rdy_3.dv).class_("##").class_("##").class_("has_quartz", class_(rdy_3.dv)).class_(var0);
      UB.class_(xu_3.Jj, 4).class_('#', xu_3.sH).class_("##").class_("##").class_("has_quartz_block", class_((rpL_2)xu_3.sH)).class_(var0);
      UB.class_(xu_3.bE, 6)
         .class_('#', rkg_3.class_(xu_3.sy, xu_3.sH, xu_3.sp))
         .class_("###")
         .class_("has_chiseled_quartz_block", class_((rpL_2)xu_3.sy))
         .class_("has_quartz_block", class_((rpL_2)xu_3.sH))
         .class_("has_quartz_pillar", class_((rpL_2)xu_3.sp))
         .class_(var0);
      UB.class_(xu_3.sq, 4)
         .class_('#', rkg_3.class_(xu_3.sy, xu_3.sH, xu_3.sp))
         .class_("#  ")
         .class_("## ")
         .class_("###")
         .class_("has_chiseled_quartz_block", class_((rpL_2)xu_3.sy))
         .class_("has_quartz_block", class_((rpL_2)xu_3.sH))
         .class_("has_quartz_pillar", class_((rpL_2)xu_3.sp))
         .class_(var0);
      Us_1.class_(rdy_3.dH)
         .break_(rdy_3.dG)
         .break_(rdy_3.dl)
         .break_(rdy_3.OU)
         .break_(rdy_3.ds)
         .break_(xu_3.rq)
         .class_("rabbit_stew")
         .class_("has_cooked_rabbit", class_(rdy_3.dl))
         .class_(var0, "rabbit_stew_from_brown_mushroom");
      Us_1.class_(rdy_3.dH)
         .break_(rdy_3.dG)
         .break_(rdy_3.dl)
         .break_(rdy_3.OU)
         .break_(rdy_3.ds)
         .break_(xu_3.rT)
         .class_("rabbit_stew")
         .class_("has_cooked_rabbit", class_(rdy_3.dl))
         .class_(var0, "rabbit_stew_from_red_mushroom");
      UB.class_(xu_3.Px, 16)
         .class_('#', rdy_3.OD)
         .class_('X', rdy_3.Ox)
         .class_("X X")
         .class_("X#X")
         .class_("X X")
         .class_("has_minecart", class_(rdy_3.ho))
         .class_(var0);
      Us_1.class_(rdy_3.hD, 9).break_(xu_3.sn).class_("has_redstone_block", class_((rpL_2)xu_3.sn)).class_(var0);
      UB.class_(xu_3.sn).class_('#', rdy_3.hD).class_("###").class_("###").class_("###").class_("has_redstone", class_(rdy_3.hD)).class_(var0);
      UB.class_(xu_3.SJ)
         .class_('R', rdy_3.hD)
         .class_('G', xu_3.Pa)
         .class_(" R ")
         .class_("RGR")
         .class_(" R ")
         .class_("has_glowstone", class_((rpL_2)xu_3.Pa))
         .class_(var0);
      UB.class_(xu_3.PH).class_('#', rdy_3.OD).class_('X', rdy_3.hD).class_("X").class_("#").class_("has_redstone", class_(rdy_3.hD)).class_(var0);
      Us_1.class_(rdy_3.Xj).break_(rdy_3.kX).class_("red_dye").class_("has_beetroot", class_(rdy_3.kX)).class_(var0, "red_dye_from_beetroot");
      Us_1.class_(rdy_3.Xj).break_(xu_3.rm).class_("red_dye").class_("has_red_flower", class_((rpL_2)xu_3.rm)).class_(var0, "red_dye_from_poppy");
      Us_1.class_(rdy_3.Xj, 2).break_(xu_3.GB).class_("red_dye").class_("has_double_plant", class_((rpL_2)xu_3.GB)).class_(var0, "red_dye_from_rose_bush");
      Us_1.class_(rdy_3.Xj).break_(xu_3.rL).class_("red_dye").class_("has_red_flower", class_((rpL_2)xu_3.rL)).class_(var0, "red_dye_from_tulip");
      UB.class_(xu_3.bR).class_('W', rdy_3.JL).class_('N', rdy_3.dZ).class_("NW").class_("WN").class_("has_nether_wart", class_(rdy_3.JL)).class_(var0);
      UB.class_(xu_3.GI).class_('#', xu_3.interface_).class_("##").class_("##").class_("has_sand", class_((rpL_2)xu_3.interface_)).class_(var0);
      UB.class_(xu_3.bG, 6)
         .class_('#', rkg_3.class_(xu_3.GI, xu_3.Gf))
         .class_("###")
         .class_("has_red_sandstone", class_((rpL_2)xu_3.GI))
         .class_("has_chiseled_red_sandstone", class_((rpL_2)xu_3.Gf))
         .class_(var0);
      UB.class_(xu_3.bb, 6).class_('#', xu_3.Gj).class_("###").class_("has_cut_red_sandstone", class_((rpL_2)xu_3.Gj)).class_(var0);
      UB.class_(xu_3.GV, 4)
         .class_('#', rkg_3.class_(xu_3.GI, xu_3.Gf, xu_3.Gj))
         .class_("#  ")
         .class_("## ")
         .class_("###")
         .class_("has_red_sandstone", class_((rpL_2)xu_3.GI))
         .class_("has_chiseled_red_sandstone", class_((rpL_2)xu_3.Gf))
         .class_("has_cut_red_sandstone", class_((rpL_2)xu_3.Gj))
         .class_(var0);
      UB.class_(xu_3.BS)
         .class_('#', xu_3.PH)
         .class_('X', rdy_3.hD)
         .class_('I', xu_3.break_)
         .class_("#X#")
         .class_("III")
         .class_("has_redstone_torch", class_((rpL_2)xu_3.PH))
         .class_(var0);
      UB.class_(xu_3.F).class_('#', xu_3.throw_).class_("##").class_("##").class_("has_sand", class_((rpL_2)xu_3.throw_)).class_(var0);
      UB.class_(xu_3.Ga, 6)
         .class_('#', rkg_3.class_(xu_3.F, xu_3.L))
         .class_("###")
         .class_("has_sandstone", class_((rpL_2)xu_3.F))
         .class_("has_chiseled_sandstone", class_((rpL_2)xu_3.L))
         .class_(var0);
      UB.class_(xu_3.Gi, 6).class_('#', xu_3.A).class_("###").class_("has_cut_sandstone", class_((rpL_2)xu_3.A)).class_(var0);
      UB.class_(xu_3.Sd, 4)
         .class_('#', rkg_3.class_(xu_3.F, xu_3.L, xu_3.A))
         .class_("#  ")
         .class_("## ")
         .class_("###")
         .class_("has_sandstone", class_((rpL_2)xu_3.F))
         .class_("has_chiseled_sandstone", class_((rpL_2)xu_3.L))
         .class_("has_cut_sandstone", class_((rpL_2)xu_3.A))
         .class_(var0);
      UB.class_(xu_3.EH)
         .class_('S', rdy_3.dA)
         .class_('C', rdy_3.dn)
         .class_("SCS")
         .class_("CCC")
         .class_("SCS")
         .class_("has_prismarine_crystals", class_(rdy_3.dn))
         .class_(var0);
      UB.class_(rdy_3.JJ).class_('#', rdy_3.Ox).class_(" #").class_("# ").class_("has_iron_ingot", class_(rdy_3.Ox)).class_(var0);
      UB.class_(rdy_3.kN)
         .class_('W', rlc_3.byte_)
         .class_('o', rdy_3.Ox)
         .class_("WoW")
         .class_("WWW")
         .class_(" W ")
         .class_("has_iron_ingot", class_(rdy_3.Ox))
         .class_(var0);
      UB.class_(xu_3.EN).class_('#', rdy_3.XO).class_("###").class_("###").class_("###").class_("has_slime_ball", class_(rdy_3.XO)).class_(var0);
      Us_1.class_(rdy_3.XO, 9).break_(xu_3.EN).class_("has_slime", class_((rpL_2)xu_3.EN)).class_(var0);
      UB.class_(xu_3.Gj, 4).class_('#', xu_3.GI).class_("##").class_("##").class_("has_red_sandstone", class_((rpL_2)xu_3.GI)).class_(var0);
      UB.class_(xu_3.A, 4).class_('#', xu_3.F).class_("##").class_("##").class_("has_sandstone", class_((rpL_2)xu_3.F)).class_(var0);
      UB.class_(xu_3.Pt).class_('#', rdy_3.hU).class_("##").class_("##").class_("has_snowball", class_(rdy_3.hU)).class_(var0);
      UB.class_(xu_3.Pq, 6).class_('#', xu_3.Pt).class_("###").class_("has_snowball", class_(rdy_3.hU)).class_(var0);
      UB.class_(xu_3.XX)
         .class_('L', rlc_3.new_)
         .class_('S', rdy_3.OD)
         .class_('#', rlc_3.for_)
         .class_(" S ")
         .class_("S#S")
         .class_("LLL")
         .class_("has_stick", class_(rdy_3.OD))
         .class_("has_soul_sand", class_(rlc_3.for_))
         .class_(var0);
      UB.class_(rdy_3.Jt)
         .class_('#', rdy_3.JF)
         .class_('X', rdy_3.Jx)
         .class_("###")
         .class_("#X#")
         .class_("###")
         .class_("has_melon", class_(rdy_3.Jx))
         .class_(var0);
      UB.class_(rdy_3.kW, 2)
         .class_('#', rdy_3.XW)
         .class_('X', rdy_3.OO)
         .class_(" # ")
         .class_("#X#")
         .class_(" # ")
         .class_("has_glowstone_dust", class_(rdy_3.XW))
         .class_(var0);
      UB.class_(rdy_3.OD, 4).class_('#', rlc_3.byte_).class_("#").class_("#").break_("sticks").class_("has_planks", class_(rlc_3.byte_)).class_(var0);
      UB.class_(rdy_3.OD, 1)
         .class_('#', xu_3.hs)
         .class_("#")
         .class_("#")
         .break_("sticks")
         .class_("has_bamboo", class_((rpL_2)xu_3.hs))
         .class_(var0, "stick_from_bamboo_item");
      UB.class_(xu_3.D).class_('P', xu_3.rB).class_('S', rdy_3.XO).class_("S").class_("P").class_("has_slime_ball", class_(rdy_3.XO)).class_(var0);
      UB.class_(xu_3.BL, 4).class_('#', xu_3.break_).class_("##").class_("##").class_("has_stone", class_((rpL_2)xu_3.break_)).class_(var0);
      UB.class_(rdy_3.OF)
         .class_('#', rdy_3.OD)
         .class_('X', rlc_3.b)
         .class_("XX")
         .class_("X#")
         .class_(" #")
         .class_("has_cobblestone", class_(rlc_3.b))
         .class_(var0);
      UB.class_(xu_3.bS, 6).class_('#', xu_3.BL).class_("###").class_("has_stone_bricks", class_(rlc_3.protected_)).class_(var0);
      UB.class_(xu_3.Ba, 4).class_('#', xu_3.BL).class_("#  ").class_("## ").class_("###").class_("has_stone_bricks", class_(rlc_3.protected_)).class_(var0);
      Us_1.class_(xu_3.Pp).break_(xu_3.break_).class_("has_stone", class_((rpL_2)xu_3.break_)).class_(var0);
      UB.class_(rdy_3.OL)
         .class_('#', rdy_3.OD)
         .class_('X', rlc_3.b)
         .class_("XX")
         .class_(" #")
         .class_(" #")
         .class_("has_cobblestone", class_(rlc_3.b))
         .class_(var0);
      UB.class_(rdy_3.Ov)
         .class_('#', rdy_3.OD)
         .class_('X', rlc_3.b)
         .class_("XXX")
         .class_(" # ")
         .class_(" # ")
         .class_("has_cobblestone", class_(rlc_3.b))
         .class_(var0);
      UB.class_(xu_3.Pm).class_('#', xu_3.break_).class_("##").class_("has_stone", class_((rpL_2)xu_3.break_)).class_(var0);
      UB.class_(rdy_3.OZ)
         .class_('#', rdy_3.OD)
         .class_('X', rlc_3.b)
         .class_("X")
         .class_("#")
         .class_("#")
         .class_("has_cobblestone", class_(rlc_3.b))
         .class_(var0);
      UB.class_(xu_3.GU, 6).class_('#', xu_3.break_).class_("###").class_("has_stone", class_((rpL_2)xu_3.break_)).class_(var0);
      UB.class_(xu_3.Ge, 6).class_('#', xu_3.bO).class_("###").class_("has_smooth_stone", class_((rpL_2)xu_3.bO)).class_(var0);
      UB.class_(xu_3.Pd, 4)
         .class_('#', xu_3.volatile_)
         .class_("#  ")
         .class_("## ")
         .class_("###")
         .class_("has_cobblestone", class_((rpL_2)xu_3.volatile_))
         .class_(var0);
      UB.class_(rdy_3.Om)
         .class_('#', rdy_3.OD)
         .class_('X', rlc_3.b)
         .class_("X")
         .class_("X")
         .class_("#")
         .class_("has_cobblestone", class_(rlc_3.b))
         .class_(var0);
      UB.class_(xu_3.rs).class_('#', rdy_3.Oa).class_("##").class_("##").class_("has_string", class_(rdy_3.Oa)).class_(var0, "white_wool_from_string");
      Us_1.class_(rdy_3.XY).break_(xu_3.Pf).class_("sugar").class_("has_reeds", class_((rpL_2)xu_3.Pf)).class_(var0, "sugar_from_sugar_cane");
      Us_1.class_(rdy_3.XY, 3).break_(rdy_3.WF).class_("sugar").class_("has_honey_bottle", class_(rdy_3.WF)).class_(var0, "sugar_from_honey_bottle");
      UB.class_(xu_3.Jb)
         .class_('H', rdy_3.sR)
         .class_('R', rdy_3.hD)
         .class_(" R ")
         .class_("RHR")
         .class_(" R ")
         .class_("has_redstone", class_(rdy_3.hD))
         .class_("has_hay_block", class_((rpL_2)xu_3.Ey))
         .class_(var0);
      UB.class_(xu_3.rf)
         .class_('#', rkg_3.class_(xu_3.throw_, xu_3.interface_))
         .class_('X', rdy_3.hr)
         .class_("X#X")
         .class_("#X#")
         .class_("X#X")
         .class_("has_gunpowder", class_(rdy_3.hr))
         .class_(var0);
      UB.class_(rdy_3.dF).class_('A', xu_3.rf).class_('B', rdy_3.ho).class_("A").class_("B").class_("has_minecart", class_(rdy_3.ho)).class_(var0);
      UB.class_(xu_3.rR, 4)
         .class_('#', rdy_3.OD)
         .class_('X', rkg_3.class_(rdy_3.Oh, rdy_3.OX))
         .class_("X")
         .class_("#")
         .class_("has_stone_pickaxe", class_(rdy_3.Ov))
         .class_(var0);
      UB.class_(xu_3.PU, 4)
         .class_('X', rkg_3.class_(rdy_3.Oh, rdy_3.OX))
         .class_('#', rdy_3.OD)
         .class_('S', rlc_3.for_)
         .class_("X")
         .class_("#")
         .class_("S")
         .class_("has_soul_sand", class_(rlc_3.for_))
         .class_(var0);
      UB.class_(xu_3.XM)
         .class_('#', rdy_3.Pu)
         .class_('X', rdy_3.kn)
         .class_("XXX")
         .class_("X#X")
         .class_("XXX")
         .class_("has_iron_nugget", class_(rdy_3.kn))
         .class_("has_iron_ingot", class_(rdy_3.Ox))
         .class_(var0);
      UB.class_(xu_3.XO)
         .class_('#', rdy_3.Bu)
         .class_('X', rdy_3.kn)
         .class_("XXX")
         .class_("X#X")
         .class_("XXX")
         .class_("has_soul_torch", class_(rdy_3.Bu))
         .class_(var0);
      Us_1.class_(xu_3.sZ).break_(xu_3.re).break_(xu_3.Sz).class_("has_tripwire_hook", class_((rpL_2)xu_3.Sz)).class_(var0);
      UB.class_(xu_3.Sz, 2)
         .class_('#', rlc_3.byte_)
         .class_('S', rdy_3.OD)
         .class_('I', rdy_3.Ox)
         .class_("I")
         .class_("S")
         .class_("#")
         .class_("has_string", class_(rdy_3.Oa))
         .class_(var0);
      UB.class_(rdy_3.Os).class_('X', rdy_3.OE).class_("XXX").class_("X X").class_("has_scute", class_(rdy_3.OE)).class_(var0);
      Us_1.class_(rdy_3.hB, 9).break_(xu_3.Ey).class_("has_hay_block", class_((rpL_2)xu_3.Ey)).class_(var0);
      Us_1.class_(rdy_3.XL).break_(rdy_3.Xg).class_("white_dye").class_("has_bone_meal", class_(rdy_3.Xg)).class_(var0);
      Us_1.class_(rdy_3.XL)
         .break_(xu_3.rp)
         .class_("white_dye")
         .class_("has_white_flower", class_((rpL_2)xu_3.rp))
         .class_(var0, "white_dye_from_lily_of_the_valley");
      UB.class_(rdy_3.Oc)
         .class_('#', rdy_3.OD)
         .class_('X', rlc_3.byte_)
         .class_("XX")
         .class_("X#")
         .class_(" #")
         .class_("has_stick", class_(rdy_3.OD))
         .class_(var0);
      UB.class_(rdy_3.Ou)
         .class_('#', rdy_3.OD)
         .class_('X', rlc_3.byte_)
         .class_("XX")
         .class_(" #")
         .class_(" #")
         .class_("has_stick", class_(rdy_3.OD))
         .class_(var0);
      UB.class_(rdy_3.ON)
         .class_('#', rdy_3.OD)
         .class_('X', rlc_3.byte_)
         .class_("XXX")
         .class_(" # ")
         .class_(" # ")
         .class_("has_stick", class_(rdy_3.OD))
         .class_(var0);
      UB.class_(rdy_3.OQ).class_('#', rdy_3.OD).class_('X', rlc_3.byte_).class_("X").class_("#").class_("#").class_("has_stick", class_(rdy_3.OD)).class_(var0);
      UB.class_(rdy_3.Oz).class_('#', rdy_3.OD).class_('X', rlc_3.byte_).class_("X").class_("X").class_("#").class_("has_stick", class_(rdy_3.OD)).class_(var0);
      Us_1.class_(rdy_3.xi).break_(rdy_3.XM).break_(rdy_3.XZ).break_(rdy_3.Oi).class_("has_book", class_(rdy_3.XM)).class_(var0);
      Us_1.class_(rdy_3.Xl).break_(xu_3.ru).class_("yellow_dye").class_("has_yellow_flower", class_((rpL_2)xu_3.ru)).class_(var0, "yellow_dye_from_dandelion");
      Us_1.class_(rdy_3.Xl, 2)
         .break_(xu_3.Gr)
         .class_("yellow_dye")
         .class_("has_double_plant", class_((rpL_2)xu_3.Gr))
         .class_(var0, "yellow_dye_from_sunflower");
      Us_1.class_(rdy_3.Jd, 9).break_(xu_3.Oh).class_("has_dried_kelp_block", class_((rpL_2)xu_3.Oh)).class_(var0);
      Us_1.class_(xu_3.Oh).break_(rdy_3.Jd, 9).class_("has_dried_kelp", class_(rdy_3.Jd)).class_(var0);
      UB.class_(xu_3.hB)
         .class_('#', rdy_3.kK)
         .class_('X', rdy_3.kD)
         .class_("###")
         .class_("#X#")
         .class_("###")
         .class_("has_nautilus_core", class_(rdy_3.kD))
         .class_("has_nautilus_shell", class_(rdy_3.kK))
         .class_(var0);
      UB.class_(xu_3.hO, 4)
         .class_('#', xu_3.protected_)
         .class_("#  ")
         .class_("## ")
         .class_("###")
         .class_("has_polished_granite", class_((rpL_2)xu_3.protected_))
         .class_(var0);
      UB.class_(xu_3.hh, 4)
         .class_('#', xu_3.bJ)
         .class_("#  ")
         .class_("## ")
         .class_("###")
         .class_("has_smooth_red_sandstone", class_((rpL_2)xu_3.bJ))
         .class_(var0);
      UB.class_(xu_3.hX, 4)
         .class_('#', xu_3.BA)
         .class_("#  ")
         .class_("## ")
         .class_("###")
         .class_("has_mossy_stone_bricks", class_((rpL_2)xu_3.BA))
         .class_(var0);
      UB.class_(xu_3.hJ, 4)
         .class_('#', xu_3.case_)
         .class_("#  ")
         .class_("## ")
         .class_("###")
         .class_("has_polished_diorite", class_((rpL_2)xu_3.case_))
         .class_(var0);
      UB.class_(xu_3.hx, 4).class_('#', xu_3.rV).class_("#  ").class_("## ").class_("###").class_("has_mossy_cobblestone", class_((rpL_2)xu_3.rV)).class_(var0);
      UB.class_(xu_3.hd, 4).class_('#', xu_3.bq).class_("#  ").class_("## ").class_("###").class_("has_end_stone_bricks", class_((rpL_2)xu_3.bq)).class_(var0);
      UB.class_(xu_3.hk, 4).class_('#', xu_3.break_).class_("#  ").class_("## ").class_("###").class_("has_stone", class_((rpL_2)xu_3.break_)).class_(var0);
      UB.class_(xu_3.hW, 4).class_('#', xu_3.bh).class_("#  ").class_("## ").class_("###").class_("has_smooth_sandstone", class_((rpL_2)xu_3.bh)).class_(var0);
      UB.class_(xu_3.hz, 4).class_('#', xu_3.bX).class_("#  ").class_("## ").class_("###").class_("has_smooth_quartz", class_((rpL_2)xu_3.bX)).class_(var0);
      UB.class_(xu_3.hQ, 4).class_('#', xu_3.byte_).class_("#  ").class_("## ").class_("###").class_("has_granite", class_((rpL_2)xu_3.byte_)).class_(var0);
      UB.class_(xu_3.hN, 4).class_('#', xu_3.catch_).class_("#  ").class_("## ").class_("###").class_("has_andesite", class_((rpL_2)xu_3.catch_)).class_(var0);
      UB.class_(xu_3.hc, 4).class_('#', xu_3.bR).class_("#  ").class_("## ").class_("###").class_("has_red_nether_bricks", class_((rpL_2)xu_3.bR)).class_(var0);
      UB.class_(xu_3.hu, 4)
         .class_('#', xu_3.private_)
         .class_("#  ")
         .class_("## ")
         .class_("###")
         .class_("has_polished_andesite", class_((rpL_2)xu_3.private_))
         .class_(var0);
      UB.class_(xu_3.hm, 4).class_('#', xu_3.throws_).class_("#  ").class_("## ").class_("###").class_("has_diorite", class_((rpL_2)xu_3.throws_)).class_(var0);
      UB.class_(xu_3.hZ, 6).class_('#', xu_3.protected_).class_("###").class_("has_polished_granite", class_((rpL_2)xu_3.protected_)).class_(var0);
      UB.class_(xu_3.hv, 6).class_('#', xu_3.bJ).class_("###").class_("has_smooth_red_sandstone", class_((rpL_2)xu_3.bJ)).class_(var0);
      UB.class_(xu_3.hF, 6).class_('#', xu_3.BA).class_("###").class_("has_mossy_stone_bricks", class_((rpL_2)xu_3.BA)).class_(var0);
      UB.class_(xu_3.hL, 6).class_('#', xu_3.case_).class_("###").class_("has_polished_diorite", class_((rpL_2)xu_3.case_)).class_(var0);
      UB.class_(xu_3.hA, 6).class_('#', xu_3.rV).class_("###").class_("has_mossy_cobblestone", class_((rpL_2)xu_3.rV)).class_(var0);
      UB.class_(xu_3.hn, 6).class_('#', xu_3.bq).class_("###").class_("has_end_stone_bricks", class_((rpL_2)xu_3.bq)).class_(var0);
      UB.class_(xu_3.hC, 6).class_('#', xu_3.bh).class_("###").class_("has_smooth_sandstone", class_((rpL_2)xu_3.bh)).class_(var0);
      UB.class_(xu_3.hl, 6).class_('#', xu_3.bX).class_("###").class_("has_smooth_quartz", class_((rpL_2)xu_3.bX)).class_(var0);
      UB.class_(xu_3.hH, 6).class_('#', xu_3.byte_).class_("###").class_("has_granite", class_((rpL_2)xu_3.byte_)).class_(var0);
      UB.class_(xu_3.hy, 6).class_('#', xu_3.catch_).class_("###").class_("has_andesite", class_((rpL_2)xu_3.catch_)).class_(var0);
      UB.class_(xu_3.hp, 6).class_('#', xu_3.bR).class_("###").class_("has_red_nether_bricks", class_((rpL_2)xu_3.bR)).class_(var0);
      UB.class_(xu_3.hq, 6).class_('#', xu_3.private_).class_("###").class_("has_polished_andesite", class_((rpL_2)xu_3.private_)).class_(var0);
      UB.class_(xu_3.hT, 6).class_('#', xu_3.throws_).class_("###").class_("has_diorite", class_((rpL_2)xu_3.throws_)).class_(var0);
      UB.class_(xu_3.ht, 6).class_('#', xu_3.rI).class_("###").class_("###").class_("has_bricks", class_((rpL_2)xu_3.rI)).class_(var0);
      UB.class_(xu_3.hw, 6).class_('#', xu_3.Em).class_("###").class_("###").class_("has_prismarine", class_((rpL_2)xu_3.Em)).class_(var0);
      UB.class_(xu_3.hI, 6).class_('#', xu_3.GI).class_("###").class_("###").class_("has_red_sandstone", class_((rpL_2)xu_3.GI)).class_(var0);
      UB.class_(xu_3.hf, 6).class_('#', xu_3.BA).class_("###").class_("###").class_("has_mossy_stone_bricks", class_((rpL_2)xu_3.BA)).class_(var0);
      UB.class_(xu_3.hj, 6).class_('#', xu_3.byte_).class_("###").class_("###").class_("has_granite", class_((rpL_2)xu_3.byte_)).class_(var0);
      UB.class_(xu_3.hV, 6).class_('#', xu_3.BL).class_("###").class_("###").class_("has_stone_bricks", class_((rpL_2)xu_3.BL)).class_(var0);
      UB.class_(xu_3.hg, 6).class_('#', xu_3.SP).class_("###").class_("###").class_("has_nether_bricks", class_((rpL_2)xu_3.SP)).class_(var0);
      UB.class_(xu_3.hR, 6).class_('#', xu_3.catch_).class_("###").class_("###").class_("has_andesite", class_((rpL_2)xu_3.catch_)).class_(var0);
      UB.class_(xu_3.hY, 6).class_('#', xu_3.bR).class_("###").class_("###").class_("has_red_nether_bricks", class_((rpL_2)xu_3.bR)).class_(var0);
      UB.class_(xu_3.ho, 6).class_('#', xu_3.F).class_("###").class_("###").class_("has_sandstone", class_((rpL_2)xu_3.F)).class_(var0);
      UB.class_(xu_3.hK, 6).class_('#', xu_3.bq).class_("###").class_("###").class_("has_end_stone_bricks", class_((rpL_2)xu_3.bq)).class_(var0);
      UB.class_(xu_3.hD, 6).class_('#', xu_3.throws_).class_("###").class_("###").class_("has_diorite", class_((rpL_2)xu_3.throws_)).class_(var0);
      Us_1.class_(rdy_3.Wr).break_(rdy_3.Xb).break_(rdy_3.dd).class_("has_creeper_head", class_(rdy_3.dd)).class_(var0);
      Us_1.class_(rdy_3.WP).break_(rdy_3.Xb).break_(rdy_3.dX).class_("has_wither_skeleton_skull", class_(rdy_3.dX)).class_(var0);
      Us_1.class_(rdy_3.ki).break_(rdy_3.Xb).break_(xu_3.rl).class_("has_oxeye_daisy", class_((rpL_2)xu_3.rl)).class_(var0);
      Us_1.class_(rdy_3.WB).break_(rdy_3.Xb).break_(rdy_3.hp).class_("has_enchanted_golden_apple", class_(rdy_3.hp)).class_(var0);
      UB.class_(xu_3.hU, 6)
         .class_('~', rdy_3.Oa)
         .class_('I', xu_3.hs)
         .class_("I~I")
         .class_("I I")
         .class_("I I")
         .class_("has_bamboo", class_((rpL_2)xu_3.hs))
         .class_(var0);
      UB.class_(xu_3.XS)
         .class_('I', rdy_3.OD)
         .class_('-', xu_3.GU)
         .class_('#', rlc_3.byte_)
         .class_("I-I")
         .class_("# #")
         .class_("has_stone_slab", class_((rpL_2)xu_3.GU))
         .class_(var0);
      UB.class_(xu_3.Xr)
         .class_('#', xu_3.bO)
         .class_('X', xu_3.Ps)
         .class_('I', rdy_3.Ox)
         .class_("III")
         .class_("IXI")
         .class_("###")
         .class_("has_smooth_stone", class_((rpL_2)xu_3.bO))
         .class_(var0);
      UB.class_(xu_3.hi)
         .class_('#', rlc_3.new_)
         .class_('X', xu_3.Ps)
         .class_(" # ")
         .class_("#X#")
         .class_(" # ")
         .class_("has_furnace", class_((rpL_2)xu_3.Ps))
         .class_(var0);
      UB.class_(xu_3.XP)
         .class_('#', rlc_3.byte_)
         .class_('@', rdy_3.Xb)
         .class_("@@")
         .class_("##")
         .class_("##")
         .class_("has_paper", class_(rdy_3.Xb))
         .class_(var0);
      UB.class_(xu_3.XE)
         .class_('#', rlc_3.byte_)
         .class_('@', rdy_3.Ox)
         .class_("@@")
         .class_("##")
         .class_("##")
         .class_("has_iron_ingot", class_(rdy_3.Ox))
         .class_(var0);
      UB.class_(xu_3.XB)
         .class_('#', rlc_3.byte_)
         .class_('@', rdy_3.hn)
         .class_("@@")
         .class_("##")
         .class_("##")
         .class_("has_flint", class_(rdy_3.hn))
         .class_(var0);
      UB.class_(xu_3.XG)
         .class_('I', rdy_3.Ox)
         .class_('#', xu_3.break_)
         .class_(" I ")
         .class_("###")
         .class_("has_stone", class_((rpL_2)xu_3.break_))
         .class_(var0);
      UB.class_(xu_3.Jc)
         .class_('S', rdy_3.BV)
         .class_('#', rdy_3.Ok)
         .class_("SSS")
         .class_("S#S")
         .class_("SSS")
         .class_("has_netherite_ingot", class_(rdy_3.Ok))
         .class_(var0);
      UB.class_(xu_3.JJ).class_('#', rdy_3.Ok).class_("###").class_("###").class_("###").class_("has_netherite_ingot", class_(rdy_3.Ok)).class_(var0);
      Us_1.class_(rdy_3.Ok, 9)
         .break_(xu_3.JJ)
         .class_("netherite_ingot")
         .class_("has_netherite_block", class_((rpL_2)xu_3.JJ))
         .class_(var0, "netherite_ingot_from_netherite_block");
      Us_1.class_(rdy_3.Ok).break_(rdy_3.OW, 4).break_(rdy_3.Od, 4).class_("netherite_ingot").class_("has_netherite_scrap", class_(rdy_3.OW)).class_(var0);
      UB.class_(xu_3.Jk)
         .class_('O', xu_3.Jd)
         .class_('G', xu_3.Pa)
         .class_("OOO")
         .class_("GGG")
         .class_("OOO")
         .class_("has_obsidian", class_((rpL_2)xu_3.Jd))
         .class_(var0);
      UB.class_(xu_3.Jm, 4).class_('#', xu_3.Ju).class_("#  ").class_("## ").class_("###").class_("has_blackstone", class_((rpL_2)xu_3.Ju)).class_(var0);
      UB.class_(xu_3.Jp, 4)
         .class_('#', xu_3.JF)
         .class_("#  ")
         .class_("## ")
         .class_("###")
         .class_("has_polished_blackstone", class_((rpL_2)xu_3.JF))
         .class_(var0);
      UB.class_(xu_3.Jl, 4)
         .class_('#', xu_3.JL)
         .class_("#  ")
         .class_("## ")
         .class_("###")
         .class_("has_polished_blackstone_bricks", class_((rpL_2)xu_3.JL))
         .class_(var0);
      UB.class_(xu_3.Jv, 6).class_('#', xu_3.Ju).class_("###").class_("has_blackstone", class_((rpL_2)xu_3.Ju)).class_(var0);
      UB.class_(xu_3.Jq, 6).class_('#', xu_3.JF).class_("###").class_("has_polished_blackstone", class_((rpL_2)xu_3.JF)).class_(var0);
      UB.class_(xu_3.JC, 6).class_('#', xu_3.JL).class_("###").class_("has_polished_blackstone_bricks", class_((rpL_2)xu_3.JL)).class_(var0);
      UB.class_(xu_3.JF, 4).class_('S', xu_3.Ju).class_("SS").class_("SS").class_("has_blackstone", class_((rpL_2)xu_3.Ju)).class_(var0);
      UB.class_(xu_3.JL, 4).class_('#', xu_3.JF).class_("##").class_("##").class_("has_polished_blackstone", class_((rpL_2)xu_3.JF)).class_(var0);
      UB.class_(xu_3.Jn).class_('#', xu_3.Jq).class_("#").class_("#").class_("has_polished_blackstone", class_((rpL_2)xu_3.JF)).class_(var0);
      UB.class_(xu_3.JZ, 6).class_('#', xu_3.Ju).class_("###").class_("###").class_("has_blackstone", class_((rpL_2)xu_3.Ju)).class_(var0);
      UB.class_(xu_3.Jw, 6).class_('#', xu_3.JF).class_("###").class_("###").class_("has_polished_blackstone", class_((rpL_2)xu_3.JF)).class_(var0);
      UB.class_(xu_3.JH, 6).class_('#', xu_3.JL).class_("###").class_("###").class_("has_polished_blackstone_bricks", class_((rpL_2)xu_3.JL)).class_(var0);
      Us_1.class_(xu_3.Jt).break_(xu_3.JF).class_("has_polished_blackstone", class_((rpL_2)xu_3.JF)).class_(var0);
      UB.class_(xu_3.JT).class_('#', xu_3.JF).class_("##").class_("has_polished_blackstone", class_((rpL_2)xu_3.JF)).class_(var0);
      UB.class_(xu_3.Bj)
         .class_('I', rdy_3.Ox)
         .class_('N', rdy_3.kn)
         .class_("N")
         .class_("I")
         .class_("N")
         .class_("has_iron_nugget", class_(rdy_3.kn))
         .class_("has_iron_ingot", class_(rdy_3.Ox))
         .class_(var0);
      DF.class_(rkf_3.byte_).class_(var0, "armor_dye");
      DF.class_(rkf_3.extends_).class_(var0, "banner_duplicate");
      DF.class_(rkf_3.protected_).class_(var0, "book_cloning");
      DF.class_(rkf_3.catch_).class_(var0, "firework_rocket");
      DF.class_(rkf_3.private_).class_(var0, "firework_star");
      DF.class_(rkf_3.implements_).class_(var0, "firework_star_fade");
      DF.class_(rkf_3.throws_).class_(var0, "map_cloning");
      DF.class_(rkf_3.case_).class_(var0, "map_extending");
      DF.class_(rkf_3.package_).class_(var0, "repair_item");
      DF.class_(rkf_3.native_).class_(var0, "shield_decoration");
      DF.class_(rkf_3.volatile_).class_(var0, "shulker_box_coloring");
      DF.class_(rkf_3.finally_).class_(var0, "tipped_arrow");
      DF.class_(rkf_3.final_).class_(var0, "suspicious_stew");
      DZ.break_(rkg_3.class_(rdy_3.dE), rdy_3.dG, 0.35F, 200).class_("has_potato", class_(rdy_3.dE)).class_(var0);
      DZ.break_(rkg_3.class_(rdy_3.XE), rdy_3.Xs, 0.3F, 200).class_("has_clay_ball", class_(rdy_3.XE)).class_(var0);
      DZ.break_(rkg_3.class_(rlc_3.int_), rdy_3.OX, 0.15F, 200).class_("has_log", class_(rlc_3.int_)).class_(var0);
      DZ.break_(rkg_3.class_(rdy_3.kO), rdy_3.kh, 0.1F, 200).class_("has_chorus_fruit", class_(rdy_3.kO)).class_(var0);
      DZ.break_(rkg_3.class_(xu_3.float_.case_()), rdy_3.Oh, 0.1F, 200).class_("has_coal_ore", class_((rpL_2)xu_3.float_)).class_(var0, "coal_from_smelting");
      DZ.break_(rkg_3.class_(rdy_3.Jz), rdy_3.JQ, 0.35F, 200).class_("has_beef", class_(rdy_3.Jz)).class_(var0);
      DZ.break_(rkg_3.class_(rdy_3.JN), rdy_3.Jc, 0.35F, 200).class_("has_chicken", class_(rdy_3.JN)).class_(var0);
      DZ.break_(rkg_3.class_(rdy_3.Xz), rdy_3.Xu, 0.35F, 200).class_("has_cod", class_(rdy_3.Xz)).class_(var0);
      DZ.break_(rkg_3.class_(xu_3.OM), rdy_3.Jd, 0.1F, 200).class_("has_kelp", class_((rpL_2)xu_3.OM)).class_(var0, "dried_kelp_from_smelting");
      DZ.break_(rkg_3.class_(rdy_3.XQ), rdy_3.Xm, 0.35F, 200).class_("has_salmon", class_(rdy_3.XQ)).class_(var0);
      DZ.break_(rkg_3.class_(rdy_3.dg), rdy_3.dR, 0.35F, 200).class_("has_mutton", class_(rdy_3.dg)).class_(var0);
      DZ.break_(rkg_3.class_(rdy_3.hC), rdy_3.hl, 0.35F, 200).class_("has_porkchop", class_(rdy_3.hC)).class_(var0);
      DZ.break_(rkg_3.class_(rdy_3.dC), rdy_3.dl, 0.35F, 200).class_("has_rabbit", class_(rdy_3.dC)).class_(var0);
      DZ.break_(rkg_3.class_(xu_3.ri.case_()), rdy_3.OJ, 1.0F, 200).class_("has_diamond_ore", class_((rpL_2)xu_3.ri)).class_(var0, "diamond_from_smelting");
      DZ.break_(rkg_3.class_(xu_3.m.case_()), rdy_3.XF, 0.2F, 200).class_("has_lapis_ore", class_((rpL_2)xu_3.m)).class_(var0, "lapis_from_smelting");
      DZ.break_(rkg_3.class_(xu_3.Sk.case_()), rdy_3.dP, 1.0F, 200).class_("has_emerald_ore", class_((rpL_2)xu_3.Sk)).class_(var0, "emerald_from_smelting");
      DZ.break_(rkg_3.class_(rlc_3.try_), xu_3.u.case_(), 0.1F, 200).class_("has_sand", class_(rlc_3.try_)).class_(var0);
      DZ.break_(rkg_3.class_(rlc_3.boolean_), rdy_3.Od, 1.0F, 200).class_("has_gold_ore", class_(rlc_3.boolean_)).class_(var0);
      DZ.break_(rkg_3.class_(xu_3.hr.case_()), rdy_3.XH, 0.1F, 200).class_("has_sea_pickle", class_((rpL_2)xu_3.hr)).class_(var0, "lime_dye_from_smelting");
      DZ.break_(rkg_3.class_(xu_3.Pw.case_()), rdy_3.Xf, 1.0F, 200).class_("has_cactus", class_((rpL_2)xu_3.Pw)).class_(var0);
      DZ.break_(rkg_3.class_(rdy_3.OC, rdy_3.On, rdy_3.Ol, rdy_3.OH, rdy_3.OA, rdy_3.hc, rdy_3.hu, rdy_3.hm, rdy_3.hZ, rdy_3.dt), rdy_3.JF, 0.1F, 200)
         .class_("has_golden_pickaxe", class_(rdy_3.OC))
         .class_("has_golden_shovel", class_(rdy_3.On))
         .class_("has_golden_axe", class_(rdy_3.Ol))
         .class_("has_golden_hoe", class_(rdy_3.OH))
         .class_("has_golden_sword", class_(rdy_3.OA))
         .class_("has_golden_helmet", class_(rdy_3.hc))
         .class_("has_golden_chestplate", class_(rdy_3.hu))
         .class_("has_golden_leggings", class_(rdy_3.hm))
         .class_("has_golden_boots", class_(rdy_3.hZ))
         .class_("has_golden_horse_armor", class_(rdy_3.dt))
         .class_(var0, "gold_nugget_from_smelting");
      DZ.break_(
            rkg_3.class_(
               rdy_3.Oq, rdy_3.Op, rdy_3.OT, rdy_3.Ot, rdy_3.Oy, rdy_3.hJ, rdy_3.hx, rdy_3.hd, rdy_3.hk, rdy_3.dT, rdy_3.hM, rdy_3.hO, rdy_3.hh, rdy_3.hX
            ),
            rdy_3.kn,
            0.1F,
            200
         )
         .class_("has_iron_pickaxe", class_(rdy_3.Oq))
         .class_("has_iron_shovel", class_(rdy_3.Op))
         .class_("has_iron_axe", class_(rdy_3.OT))
         .class_("has_iron_hoe", class_(rdy_3.Ot))
         .class_("has_iron_sword", class_(rdy_3.Oy))
         .class_("has_iron_helmet", class_(rdy_3.hJ))
         .class_("has_iron_chestplate", class_(rdy_3.hx))
         .class_("has_iron_leggings", class_(rdy_3.hd))
         .class_("has_iron_boots", class_(rdy_3.hk))
         .class_("has_iron_horse_armor", class_(rdy_3.dT))
         .class_("has_chainmail_helmet", class_(rdy_3.hM))
         .class_("has_chainmail_chestplate", class_(rdy_3.hO))
         .class_("has_chainmail_leggings", class_(rdy_3.hh))
         .class_("has_chainmail_boots", class_(rdy_3.hX))
         .class_(var0, "iron_nugget_from_smelting");
      DZ.break_(rkg_3.class_(xu_3.long_.case_()), rdy_3.Ox, 0.7F, 200).class_("has_iron_ore", class_(xu_3.long_.case_())).class_(var0);
      DZ.break_(rkg_3.class_(xu_3.PI), xu_3.Ee.case_(), 0.35F, 200).class_("has_clay_block", class_((rpL_2)xu_3.PI)).class_(var0);
      DZ.break_(rkg_3.class_(xu_3.PR), rdy_3.dZ, 0.1F, 200).class_("has_netherrack", class_((rpL_2)xu_3.PR)).class_(var0);
      DZ.break_(rkg_3.class_(xu_3.sC), rdy_3.dv, 0.2F, 200).class_("has_nether_quartz_ore", class_((rpL_2)xu_3.sC)).class_(var0);
      DZ.break_(rkg_3.class_(xu_3.Pl), rdy_3.hD, 0.7F, 200).class_("has_redstone_ore", class_((rpL_2)xu_3.Pl)).class_(var0, "redstone_from_smelting");
      DZ.break_(rkg_3.class_(xu_3.c), xu_3.N.case_(), 0.15F, 200).class_("has_wet_sponge", class_((rpL_2)xu_3.c)).class_(var0);
      DZ.break_(rkg_3.class_(xu_3.volatile_), xu_3.break_.case_(), 0.1F, 200).class_("has_cobblestone", class_((rpL_2)xu_3.volatile_)).class_(var0);
      DZ.break_(rkg_3.class_(xu_3.break_), xu_3.bO.case_(), 0.1F, 200).class_("has_stone", class_((rpL_2)xu_3.break_)).class_(var0);
      DZ.break_(rkg_3.class_(xu_3.F), xu_3.bh.case_(), 0.1F, 200).class_("has_sandstone", class_((rpL_2)xu_3.F)).class_(var0);
      DZ.break_(rkg_3.class_(xu_3.GI), xu_3.bJ.case_(), 0.1F, 200).class_("has_red_sandstone", class_((rpL_2)xu_3.GI)).class_(var0);
      DZ.break_(rkg_3.class_(xu_3.sH), xu_3.bX.case_(), 0.1F, 200).class_("has_quartz_block", class_((rpL_2)xu_3.sH)).class_(var0);
      DZ.break_(rkg_3.class_(xu_3.BL), xu_3.Bn.case_(), 0.1F, 200).class_("has_stone_bricks", class_((rpL_2)xu_3.BL)).class_(var0);
      DZ.break_(rkg_3.class_(xu_3.Er), xu_3.MA.case_(), 0.1F, 200).class_("has_black_terracotta", class_((rpL_2)xu_3.Er)).class_(var0);
      DZ.break_(rkg_3.class_(xu_3.sU), xu_3.MZ.case_(), 0.1F, 200).class_("has_blue_terracotta", class_((rpL_2)xu_3.sU)).class_(var0);
      DZ.break_(rkg_3.class_(xu_3.se), xu_3.Mv.case_(), 0.1F, 200).class_("has_brown_terracotta", class_((rpL_2)xu_3.se)).class_(var0);
      DZ.break_(rkg_3.class_(xu_3.sK), xu_3.Mu.case_(), 0.1F, 200).class_("has_cyan_terracotta", class_((rpL_2)xu_3.sK)).class_(var0);
      DZ.break_(rkg_3.class_(xu_3.sY), xu_3.MN.case_(), 0.1F, 200).class_("has_gray_terracotta", class_((rpL_2)xu_3.sY)).class_(var0);
      DZ.break_(rkg_3.class_(xu_3.sa), xu_3.MF.case_(), 0.1F, 200).class_("has_green_terracotta", class_((rpL_2)xu_3.sa)).class_(var0);
      DZ.break_(rkg_3.class_(xu_3.sj), xu_3.Mk.case_(), 0.1F, 200).class_("has_light_blue_terracotta", class_((rpL_2)xu_3.sj)).class_(var0);
      DZ.break_(rkg_3.class_(xu_3.so), xu_3.Mc.case_(), 0.1F, 200).class_("has_light_gray_terracotta", class_((rpL_2)xu_3.so)).class_(var0);
      DZ.break_(rkg_3.class_(xu_3.sg), xu_3.Mz.case_(), 0.1F, 200).class_("has_lime_terracotta", class_((rpL_2)xu_3.sg)).class_(var0);
      DZ.break_(rkg_3.class_(xu_3.sf), xu_3.Md.case_(), 0.1F, 200).class_("has_magenta_terracotta", class_((rpL_2)xu_3.sf)).class_(var0);
      DZ.break_(rkg_3.class_(xu_3.sI), xu_3.Mx.case_(), 0.1F, 200).class_("has_orange_terracotta", class_((rpL_2)xu_3.sI)).class_(var0);
      DZ.break_(rkg_3.class_(xu_3.sR), xu_3.MQ.case_(), 0.1F, 200).class_("has_pink_terracotta", class_((rpL_2)xu_3.sR)).class_(var0);
      DZ.break_(rkg_3.class_(xu_3.sD), xu_3.Mm.case_(), 0.1F, 200).class_("has_purple_terracotta", class_((rpL_2)xu_3.sD)).class_(var0);
      DZ.break_(rkg_3.class_(xu_3.si), xu_3.ML.case_(), 0.1F, 200).class_("has_red_terracotta", class_((rpL_2)xu_3.si)).class_(var0);
      DZ.break_(rkg_3.class_(xu_3.sw), xu_3.MJ.case_(), 0.1F, 200).class_("has_white_terracotta", class_((rpL_2)xu_3.sw)).class_(var0);
      DZ.break_(rkg_3.class_(xu_3.sV), xu_3.MW.case_(), 0.1F, 200).class_("has_yellow_terracotta", class_((rpL_2)xu_3.sV)).class_(var0);
      DZ.break_(rkg_3.class_(xu_3.Jx), rdy_3.OW, 2.0F, 200).class_("has_ancient_debris", class_((rpL_2)xu_3.Jx)).class_(var0);
      DZ.break_(rkg_3.class_(xu_3.JL), xu_3.JA.case_(), 0.1F, 200).class_("has_blackstone_bricks", class_((rpL_2)xu_3.JL)).class_(var0);
      DZ.break_(rkg_3.class_(xu_3.SP), xu_3.Jf.case_(), 0.1F, 200).class_("has_nether_bricks", class_((rpL_2)xu_3.SP)).class_(var0);
      DZ.class_(rkg_3.class_(xu_3.long_.case_()), rdy_3.Ox, 0.7F, 100)
         .class_("has_iron_ore", class_(xu_3.long_.case_()))
         .class_(var0, "iron_ingot_from_blasting");
      DZ.class_(rkg_3.class_(rlc_3.boolean_), rdy_3.Od, 1.0F, 100).class_("has_gold_ore", class_(rlc_3.boolean_)).class_(var0, "gold_ingot_from_blasting");
      DZ.class_(rkg_3.class_(xu_3.ri.case_()), rdy_3.OJ, 1.0F, 100).class_("has_diamond_ore", class_((rpL_2)xu_3.ri)).class_(var0, "diamond_from_blasting");
      DZ.class_(rkg_3.class_(xu_3.m.case_()), rdy_3.XF, 0.2F, 100).class_("has_lapis_ore", class_((rpL_2)xu_3.m)).class_(var0, "lapis_from_blasting");
      DZ.class_(rkg_3.class_(xu_3.Pl), rdy_3.hD, 0.7F, 100).class_("has_redstone_ore", class_((rpL_2)xu_3.Pl)).class_(var0, "redstone_from_blasting");
      DZ.class_(rkg_3.class_(xu_3.float_.case_()), rdy_3.Oh, 0.1F, 100).class_("has_coal_ore", class_((rpL_2)xu_3.float_)).class_(var0, "coal_from_blasting");
      DZ.class_(rkg_3.class_(xu_3.Sk.case_()), rdy_3.dP, 1.0F, 100).class_("has_emerald_ore", class_((rpL_2)xu_3.Sk)).class_(var0, "emerald_from_blasting");
      DZ.class_(rkg_3.class_(xu_3.sC), rdy_3.dv, 0.2F, 100).class_("has_nether_quartz_ore", class_((rpL_2)xu_3.sC)).class_(var0, "quartz_from_blasting");
      DZ.class_(rkg_3.class_(rdy_3.OC, rdy_3.On, rdy_3.Ol, rdy_3.OH, rdy_3.OA, rdy_3.hc, rdy_3.hu, rdy_3.hm, rdy_3.hZ, rdy_3.dt), rdy_3.JF, 0.1F, 100)
         .class_("has_golden_pickaxe", class_(rdy_3.OC))
         .class_("has_golden_shovel", class_(rdy_3.On))
         .class_("has_golden_axe", class_(rdy_3.Ol))
         .class_("has_golden_hoe", class_(rdy_3.OH))
         .class_("has_golden_sword", class_(rdy_3.OA))
         .class_("has_golden_helmet", class_(rdy_3.hc))
         .class_("has_golden_chestplate", class_(rdy_3.hu))
         .class_("has_golden_leggings", class_(rdy_3.hm))
         .class_("has_golden_boots", class_(rdy_3.hZ))
         .class_("has_golden_horse_armor", class_(rdy_3.dt))
         .class_(var0, "gold_nugget_from_blasting");
      DZ.class_(
            rkg_3.class_(
               rdy_3.Oq, rdy_3.Op, rdy_3.OT, rdy_3.Ot, rdy_3.Oy, rdy_3.hJ, rdy_3.hx, rdy_3.hd, rdy_3.hk, rdy_3.dT, rdy_3.hM, rdy_3.hO, rdy_3.hh, rdy_3.hX
            ),
            rdy_3.kn,
            0.1F,
            100
         )
         .class_("has_iron_pickaxe", class_(rdy_3.Oq))
         .class_("has_iron_shovel", class_(rdy_3.Op))
         .class_("has_iron_axe", class_(rdy_3.OT))
         .class_("has_iron_hoe", class_(rdy_3.Ot))
         .class_("has_iron_sword", class_(rdy_3.Oy))
         .class_("has_iron_helmet", class_(rdy_3.hJ))
         .class_("has_iron_chestplate", class_(rdy_3.hx))
         .class_("has_iron_leggings", class_(rdy_3.hd))
         .class_("has_iron_boots", class_(rdy_3.hk))
         .class_("has_iron_horse_armor", class_(rdy_3.dT))
         .class_("has_chainmail_helmet", class_(rdy_3.hM))
         .class_("has_chainmail_chestplate", class_(rdy_3.hO))
         .class_("has_chainmail_leggings", class_(rdy_3.hh))
         .class_("has_chainmail_boots", class_(rdy_3.hX))
         .class_(var0, "iron_nugget_from_blasting");
      DZ.class_(rkg_3.class_(xu_3.Jx), rdy_3.OW, 2.0F, 100).class_("has_ancient_debris", class_((rpL_2)xu_3.Jx)).class_(var0, "netherite_scrap_from_blasting");
      class_(var0, "smoking", rkf_3.continue_, 100);
      class_(var0, "campfire_cooking", rkf_3.super_, 600);
      UG.class_(rkg_3.class_(xu_3.break_), xu_3.GU, 2).class_("has_stone", class_((rpL_2)xu_3.break_)).class_(var0, "stone_slab_from_stone_stonecutting");
      UG.class_(rkg_3.class_(xu_3.break_), xu_3.hk).class_("has_stone", class_((rpL_2)xu_3.break_)).class_(var0, "stone_stairs_from_stone_stonecutting");
      UG.class_(rkg_3.class_(xu_3.break_), xu_3.BL).class_("has_stone", class_((rpL_2)xu_3.break_)).class_(var0, "stone_bricks_from_stone_stonecutting");
      UG.class_(rkg_3.class_(xu_3.break_), xu_3.bS, 2).class_("has_stone", class_((rpL_2)xu_3.break_)).class_(var0, "stone_brick_slab_from_stone_stonecutting");
      UG.class_(rkg_3.class_(xu_3.break_), xu_3.Ba).class_("has_stone", class_((rpL_2)xu_3.break_)).class_(var0, "stone_brick_stairs_from_stone_stonecutting");
      UG.class_(rkg_3.class_(xu_3.break_), xu_3.BC)
         .class_("has_stone", class_((rpL_2)xu_3.break_))
         .class_(var0, "chiseled_stone_bricks_stone_from_stonecutting");
      UG.class_(rkg_3.class_(xu_3.break_), xu_3.hV).class_("has_stone", class_((rpL_2)xu_3.break_)).class_(var0, "stone_brick_walls_from_stone_stonecutting");
      UG.class_(rkg_3.class_(xu_3.F), xu_3.A).class_("has_sandstone", class_((rpL_2)xu_3.F)).class_(var0, "cut_sandstone_from_sandstone_stonecutting");
      UG.class_(rkg_3.class_(xu_3.F), xu_3.Ga, 2).class_("has_sandstone", class_((rpL_2)xu_3.F)).class_(var0, "sandstone_slab_from_sandstone_stonecutting");
      UG.class_(rkg_3.class_(xu_3.F), xu_3.Gi, 2).class_("has_sandstone", class_((rpL_2)xu_3.F)).class_(var0, "cut_sandstone_slab_from_sandstone_stonecutting");
      UG.class_(rkg_3.class_(xu_3.A), xu_3.Gi, 2)
         .class_("has_cut_sandstone", class_((rpL_2)xu_3.F))
         .class_(var0, "cut_sandstone_slab_from_cut_sandstone_stonecutting");
      UG.class_(rkg_3.class_(xu_3.F), xu_3.Sd).class_("has_sandstone", class_((rpL_2)xu_3.F)).class_(var0, "sandstone_stairs_from_sandstone_stonecutting");
      UG.class_(rkg_3.class_(xu_3.F), xu_3.ho).class_("has_sandstone", class_((rpL_2)xu_3.F)).class_(var0, "sandstone_wall_from_sandstone_stonecutting");
      UG.class_(rkg_3.class_(xu_3.F), xu_3.L).class_("has_sandstone", class_((rpL_2)xu_3.F)).class_(var0, "chiseled_sandstone_from_sandstone_stonecutting");
      UG.class_(rkg_3.class_(xu_3.GI), xu_3.Gj)
         .class_("has_red_sandstone", class_((rpL_2)xu_3.GI))
         .class_(var0, "cut_red_sandstone_from_red_sandstone_stonecutting");
      UG.class_(rkg_3.class_(xu_3.GI), xu_3.bG, 2)
         .class_("has_red_sandstone", class_((rpL_2)xu_3.GI))
         .class_(var0, "red_sandstone_slab_from_red_sandstone_stonecutting");
      UG.class_(rkg_3.class_(xu_3.GI), xu_3.bb, 2)
         .class_("has_red_sandstone", class_((rpL_2)xu_3.GI))
         .class_(var0, "cut_red_sandstone_slab_from_red_sandstone_stonecutting");
      UG.class_(rkg_3.class_(xu_3.Gj), xu_3.bb, 2)
         .class_("has_cut_red_sandstone", class_((rpL_2)xu_3.GI))
         .class_(var0, "cut_red_sandstone_slab_from_cut_red_sandstone_stonecutting");
      UG.class_(rkg_3.class_(xu_3.GI), xu_3.GV)
         .class_("has_red_sandstone", class_((rpL_2)xu_3.GI))
         .class_(var0, "red_sandstone_stairs_from_red_sandstone_stonecutting");
      UG.class_(rkg_3.class_(xu_3.GI), xu_3.hI)
         .class_("has_red_sandstone", class_((rpL_2)xu_3.GI))
         .class_(var0, "red_sandstone_wall_from_red_sandstone_stonecutting");
      UG.class_(rkg_3.class_(xu_3.GI), xu_3.Gf)
         .class_("has_red_sandstone", class_((rpL_2)xu_3.GI))
         .class_(var0, "chiseled_red_sandstone_from_red_sandstone_stonecutting");
      UG.class_(rkg_3.class_(xu_3.sH), xu_3.bE, 2).class_("has_quartz_block", class_((rpL_2)xu_3.sH)).class_(var0, "quartz_slab_from_stonecutting");
      UG.class_(rkg_3.class_(xu_3.sH), xu_3.sq).class_("has_quartz_block", class_((rpL_2)xu_3.sH)).class_(var0, "quartz_stairs_from_quartz_block_stonecutting");
      UG.class_(rkg_3.class_(xu_3.sH), xu_3.sp).class_("has_quartz_block", class_((rpL_2)xu_3.sH)).class_(var0, "quartz_pillar_from_quartz_block_stonecutting");
      UG.class_(rkg_3.class_(xu_3.sH), xu_3.sy)
         .class_("has_quartz_block", class_((rpL_2)xu_3.sH))
         .class_(var0, "chiseled_quartz_block_from_quartz_block_stonecutting");
      UG.class_(rkg_3.class_(xu_3.sH), xu_3.Jj).class_("has_quartz_block", class_((rpL_2)xu_3.sH)).class_(var0, "quartz_bricks_from_quartz_block_stonecutting");
      UG.class_(rkg_3.class_(xu_3.volatile_), xu_3.Pd)
         .class_("has_cobblestone", class_((rpL_2)xu_3.volatile_))
         .class_(var0, "cobblestone_stairs_from_cobblestone_stonecutting");
      UG.class_(rkg_3.class_(xu_3.volatile_), xu_3.bP, 2)
         .class_("has_cobblestone", class_((rpL_2)xu_3.volatile_))
         .class_(var0, "cobblestone_slab_from_cobblestone_stonecutting");
      UG.class_(rkg_3.class_(xu_3.volatile_), xu_3.SF)
         .class_("has_cobblestone", class_((rpL_2)xu_3.volatile_))
         .class_(var0, "cobblestone_wall_from_cobblestone_stonecutting");
      UG.class_(rkg_3.class_(xu_3.BL), xu_3.bS, 2)
         .class_("has_stone_bricks", class_((rpL_2)xu_3.BL))
         .class_(var0, "stone_brick_slab_from_stone_bricks_stonecutting");
      UG.class_(rkg_3.class_(xu_3.BL), xu_3.Ba)
         .class_("has_stone_bricks", class_((rpL_2)xu_3.BL))
         .class_(var0, "stone_brick_stairs_from_stone_bricks_stonecutting");
      UG.class_(rkg_3.class_(xu_3.BL), xu_3.hV)
         .class_("has_stone_bricks", class_((rpL_2)xu_3.BL))
         .class_(var0, "stone_brick_wall_from_stone_bricks_stonecutting");
      UG.class_(rkg_3.class_(xu_3.BL), xu_3.BC)
         .class_("has_stone_bricks", class_((rpL_2)xu_3.BL))
         .class_(var0, "chiseled_stone_bricks_from_stone_bricks_stonecutting");
      UG.class_(rkg_3.class_(xu_3.rI), xu_3.bB, 2).class_("has_bricks", class_((rpL_2)xu_3.rI)).class_(var0, "brick_slab_from_bricks_stonecutting");
      UG.class_(rkg_3.class_(xu_3.rI), xu_3.Be).class_("has_bricks", class_((rpL_2)xu_3.rI)).class_(var0, "brick_stairs_from_bricks_stonecutting");
      UG.class_(rkg_3.class_(xu_3.rI), xu_3.ht).class_("has_bricks", class_((rpL_2)xu_3.rI)).class_(var0, "brick_wall_from_bricks_stonecutting");
      UG.class_(rkg_3.class_(xu_3.SP), xu_3.bs, 2)
         .class_("has_nether_bricks", class_((rpL_2)xu_3.SP))
         .class_(var0, "nether_brick_slab_from_nether_bricks_stonecutting");
      UG.class_(rkg_3.class_(xu_3.SP), xu_3.SS)
         .class_("has_nether_bricks", class_((rpL_2)xu_3.SP))
         .class_(var0, "nether_brick_stairs_from_nether_bricks_stonecutting");
      UG.class_(rkg_3.class_(xu_3.SP), xu_3.hg)
         .class_("has_nether_bricks", class_((rpL_2)xu_3.SP))
         .class_(var0, "nether_brick_wall_from_nether_bricks_stonecutting");
      UG.class_(rkg_3.class_(xu_3.SP), xu_3.JI)
         .class_("has_nether_bricks", class_((rpL_2)xu_3.SP))
         .class_(var0, "chiseled_nether_bricks_from_nether_bricks_stonecutting");
      UG.class_(rkg_3.class_(xu_3.bR), xu_3.hp, 2)
         .class_("has_nether_bricks", class_((rpL_2)xu_3.bR))
         .class_(var0, "red_nether_brick_slab_from_red_nether_bricks_stonecutting");
      UG.class_(rkg_3.class_(xu_3.bR), xu_3.hc)
         .class_("has_nether_bricks", class_((rpL_2)xu_3.bR))
         .class_(var0, "red_nether_brick_stairs_from_red_nether_bricks_stonecutting");
      UG.class_(rkg_3.class_(xu_3.bR), xu_3.hY)
         .class_("has_nether_bricks", class_((rpL_2)xu_3.bR))
         .class_(var0, "red_nether_brick_wall_from_red_nether_bricks_stonecutting");
      UG.class_(rkg_3.class_(xu_3.bH), xu_3.bM, 2)
         .class_("has_purpur_block", class_((rpL_2)xu_3.bH))
         .class_(var0, "purpur_slab_from_purpur_block_stonecutting");
      UG.class_(rkg_3.class_(xu_3.bH), xu_3.bp).class_("has_purpur_block", class_((rpL_2)xu_3.bH)).class_(var0, "purpur_stairs_from_purpur_block_stonecutting");
      UG.class_(rkg_3.class_(xu_3.bH), xu_3.by).class_("has_purpur_block", class_((rpL_2)xu_3.bH)).class_(var0, "purpur_pillar_from_purpur_block_stonecutting");
      UG.class_(rkg_3.class_(xu_3.Em), xu_3.En, 2)
         .class_("has_prismarine", class_((rpL_2)xu_3.Em))
         .class_(var0, "prismarine_slab_from_prismarine_stonecutting");
      UG.class_(rkg_3.class_(xu_3.Em), xu_3.EF).class_("has_prismarine", class_((rpL_2)xu_3.Em)).class_(var0, "prismarine_stairs_from_prismarine_stonecutting");
      UG.class_(rkg_3.class_(xu_3.Em), xu_3.hw).class_("has_prismarine", class_((rpL_2)xu_3.Em)).class_(var0, "prismarine_wall_from_prismarine_stonecutting");
      UG.class_(rkg_3.class_(xu_3.EZ), xu_3.EC, 2)
         .class_("has_prismarine_brick", class_((rpL_2)xu_3.EZ))
         .class_(var0, "prismarine_brick_slab_from_prismarine_stonecutting");
      UG.class_(rkg_3.class_(xu_3.EZ), xu_3.EL)
         .class_("has_prismarine_brick", class_((rpL_2)xu_3.EZ))
         .class_(var0, "prismarine_brick_stairs_from_prismarine_stonecutting");
      UG.class_(rkg_3.class_(xu_3.Ev), xu_3.El, 2)
         .class_("has_dark_prismarine", class_((rpL_2)xu_3.Ev))
         .class_(var0, "dark_prismarine_slab_from_dark_prismarine_stonecutting");
      UG.class_(rkg_3.class_(xu_3.Ev), xu_3.EA)
         .class_("has_dark_prismarine", class_((rpL_2)xu_3.Ev))
         .class_(var0, "dark_prismarine_stairs_from_dark_prismarine_stonecutting");
      UG.class_(rkg_3.class_(xu_3.catch_), xu_3.hy, 2)
         .class_("has_andesite", class_((rpL_2)xu_3.catch_))
         .class_(var0, "andesite_slab_from_andesite_stonecutting");
      UG.class_(rkg_3.class_(xu_3.catch_), xu_3.hN)
         .class_("has_andesite", class_((rpL_2)xu_3.catch_))
         .class_(var0, "andesite_stairs_from_andesite_stonecutting");
      UG.class_(rkg_3.class_(xu_3.catch_), xu_3.hR).class_("has_andesite", class_((rpL_2)xu_3.catch_)).class_(var0, "andesite_wall_from_andesite_stonecutting");
      UG.class_(rkg_3.class_(xu_3.catch_), xu_3.private_)
         .class_("has_andesite", class_((rpL_2)xu_3.catch_))
         .class_(var0, "polished_andesite_from_andesite_stonecutting");
      UG.class_(rkg_3.class_(xu_3.catch_), xu_3.hq, 2)
         .class_("has_andesite", class_((rpL_2)xu_3.catch_))
         .class_(var0, "polished_andesite_slab_from_andesite_stonecutting");
      UG.class_(rkg_3.class_(xu_3.catch_), xu_3.hu)
         .class_("has_andesite", class_((rpL_2)xu_3.catch_))
         .class_(var0, "polished_andesite_stairs_from_andesite_stonecutting");
      UG.class_(rkg_3.class_(xu_3.private_), xu_3.hq, 2)
         .class_("has_polished_andesite", class_((rpL_2)xu_3.private_))
         .class_(var0, "polished_andesite_slab_from_polished_andesite_stonecutting");
      UG.class_(rkg_3.class_(xu_3.private_), xu_3.hu)
         .class_("has_polished_andesite", class_((rpL_2)xu_3.private_))
         .class_(var0, "polished_andesite_stairs_from_polished_andesite_stonecutting");
      UG.class_(rkg_3.class_(xu_3.PK), xu_3.PD).class_("has_basalt", class_((rpL_2)xu_3.PK)).class_(var0, "polished_basalt_from_basalt_stonecutting");
      UG.class_(rkg_3.class_(xu_3.byte_), xu_3.hH, 2).class_("has_granite", class_((rpL_2)xu_3.byte_)).class_(var0, "granite_slab_from_granite_stonecutting");
      UG.class_(rkg_3.class_(xu_3.byte_), xu_3.hQ).class_("has_granite", class_((rpL_2)xu_3.byte_)).class_(var0, "granite_stairs_from_granite_stonecutting");
      UG.class_(rkg_3.class_(xu_3.byte_), xu_3.hj).class_("has_granite", class_((rpL_2)xu_3.byte_)).class_(var0, "granite_wall_from_granite_stonecutting");
      UG.class_(rkg_3.class_(xu_3.byte_), xu_3.protected_)
         .class_("has_granite", class_((rpL_2)xu_3.byte_))
         .class_(var0, "polished_granite_from_granite_stonecutting");
      UG.class_(rkg_3.class_(xu_3.byte_), xu_3.hZ, 2)
         .class_("has_granite", class_((rpL_2)xu_3.byte_))
         .class_(var0, "polished_granite_slab_from_granite_stonecutting");
      UG.class_(rkg_3.class_(xu_3.byte_), xu_3.hO)
         .class_("has_granite", class_((rpL_2)xu_3.byte_))
         .class_(var0, "polished_granite_stairs_from_granite_stonecutting");
      UG.class_(rkg_3.class_(xu_3.protected_), xu_3.hZ, 2)
         .class_("has_polished_granite", class_((rpL_2)xu_3.protected_))
         .class_(var0, "polished_granite_slab_from_polished_granite_stonecutting");
      UG.class_(rkg_3.class_(xu_3.protected_), xu_3.hO)
         .class_("has_polished_granite", class_((rpL_2)xu_3.protected_))
         .class_(var0, "polished_granite_stairs_from_polished_granite_stonecutting");
      UG.class_(rkg_3.class_(xu_3.throws_), xu_3.hT, 2)
         .class_("has_diorite", class_((rpL_2)xu_3.throws_))
         .class_(var0, "diorite_slab_from_diorite_stonecutting");
      UG.class_(rkg_3.class_(xu_3.throws_), xu_3.hm)
         .class_("has_diorite", class_((rpL_2)xu_3.throws_))
         .class_(var0, "diorite_stairs_from_diorite_stonecutting");
      UG.class_(rkg_3.class_(xu_3.throws_), xu_3.hD).class_("has_diorite", class_((rpL_2)xu_3.throws_)).class_(var0, "diorite_wall_from_diorite_stonecutting");
      UG.class_(rkg_3.class_(xu_3.throws_), xu_3.case_)
         .class_("has_diorite", class_((rpL_2)xu_3.throws_))
         .class_(var0, "polished_diorite_from_diorite_stonecutting");
      UG.class_(rkg_3.class_(xu_3.throws_), xu_3.hL, 2)
         .class_("has_diorite", class_((rpL_2)xu_3.case_))
         .class_(var0, "polished_diorite_slab_from_diorite_stonecutting");
      UG.class_(rkg_3.class_(xu_3.throws_), xu_3.hJ)
         .class_("has_diorite", class_((rpL_2)xu_3.case_))
         .class_(var0, "polished_diorite_stairs_from_diorite_stonecutting");
      UG.class_(rkg_3.class_(xu_3.case_), xu_3.hL, 2)
         .class_("has_polished_diorite", class_((rpL_2)xu_3.case_))
         .class_(var0, "polished_diorite_slab_from_polished_diorite_stonecutting");
      UG.class_(rkg_3.class_(xu_3.case_), xu_3.hJ)
         .class_("has_polished_diorite", class_((rpL_2)xu_3.case_))
         .class_(var0, "polished_diorite_stairs_from_polished_diorite_stonecutting");
      UG.class_(rkg_3.class_(xu_3.BA), xu_3.hF, 2)
         .class_("has_mossy_stone_bricks", class_((rpL_2)xu_3.BA))
         .class_(var0, "mossy_stone_brick_slab_from_mossy_stone_brick_stonecutting");
      UG.class_(rkg_3.class_(xu_3.BA), xu_3.hX)
         .class_("has_mossy_stone_bricks", class_((rpL_2)xu_3.BA))
         .class_(var0, "mossy_stone_brick_stairs_from_mossy_stone_brick_stonecutting");
      UG.class_(rkg_3.class_(xu_3.BA), xu_3.hf)
         .class_("has_mossy_stone_bricks", class_((rpL_2)xu_3.BA))
         .class_(var0, "mossy_stone_brick_wall_from_mossy_stone_brick_stonecutting");
      UG.class_(rkg_3.class_(xu_3.rV), xu_3.hA, 2)
         .class_("has_mossy_cobblestone", class_((rpL_2)xu_3.rV))
         .class_(var0, "mossy_cobblestone_slab_from_mossy_cobblestone_stonecutting");
      UG.class_(rkg_3.class_(xu_3.rV), xu_3.hx)
         .class_("has_mossy_cobblestone", class_((rpL_2)xu_3.rV))
         .class_(var0, "mossy_cobblestone_stairs_from_mossy_cobblestone_stonecutting");
      UG.class_(rkg_3.class_(xu_3.rV), xu_3.SL)
         .class_("has_mossy_cobblestone", class_((rpL_2)xu_3.rV))
         .class_(var0, "mossy_cobblestone_wall_from_mossy_cobblestone_stonecutting");
      UG.class_(rkg_3.class_(xu_3.bh), xu_3.hC, 2)
         .class_("has_smooth_sandstone", class_((rpL_2)xu_3.bh))
         .class_(var0, "smooth_sandstone_slab_from_smooth_sandstone_stonecutting");
      UG.class_(rkg_3.class_(xu_3.bh), xu_3.hW)
         .class_("has_mossy_cobblestone", class_((rpL_2)xu_3.bh))
         .class_(var0, "smooth_sandstone_stairs_from_smooth_sandstone_stonecutting");
      UG.class_(rkg_3.class_(xu_3.bJ), xu_3.hv, 2)
         .class_("has_smooth_red_sandstone", class_((rpL_2)xu_3.bJ))
         .class_(var0, "smooth_red_sandstone_slab_from_smooth_red_sandstone_stonecutting");
      UG.class_(rkg_3.class_(xu_3.bJ), xu_3.hh)
         .class_("has_smooth_red_sandstone", class_((rpL_2)xu_3.bJ))
         .class_(var0, "smooth_red_sandstone_stairs_from_smooth_red_sandstone_stonecutting");
      UG.class_(rkg_3.class_(xu_3.bX), xu_3.hl, 2)
         .class_("has_smooth_quartz", class_((rpL_2)xu_3.bX))
         .class_(var0, "smooth_quartz_slab_from_smooth_quartz_stonecutting");
      UG.class_(rkg_3.class_(xu_3.bX), xu_3.hz)
         .class_("has_smooth_quartz", class_((rpL_2)xu_3.bX))
         .class_(var0, "smooth_quartz_stairs_from_smooth_quartz_stonecutting");
      UG.class_(rkg_3.class_(xu_3.bq), xu_3.hn, 2)
         .class_("has_end_stone_brick", class_((rpL_2)xu_3.bq))
         .class_(var0, "end_stone_brick_slab_from_end_stone_brick_stonecutting");
      UG.class_(rkg_3.class_(xu_3.bq), xu_3.hd)
         .class_("has_end_stone_brick", class_((rpL_2)xu_3.bq))
         .class_(var0, "end_stone_brick_stairs_from_end_stone_brick_stonecutting");
      UG.class_(rkg_3.class_(xu_3.bq), xu_3.hK)
         .class_("has_end_stone_brick", class_((rpL_2)xu_3.bq))
         .class_(var0, "end_stone_brick_wall_from_end_stone_brick_stonecutting");
      UG.class_(rkg_3.class_(xu_3.Sh), xu_3.bq).class_("has_end_stone", class_((rpL_2)xu_3.Sh)).class_(var0, "end_stone_bricks_from_end_stone_stonecutting");
      UG.class_(rkg_3.class_(xu_3.Sh), xu_3.hn, 2)
         .class_("has_end_stone", class_((rpL_2)xu_3.Sh))
         .class_(var0, "end_stone_brick_slab_from_end_stone_stonecutting");
      UG.class_(rkg_3.class_(xu_3.Sh), xu_3.hd)
         .class_("has_end_stone", class_((rpL_2)xu_3.Sh))
         .class_(var0, "end_stone_brick_stairs_from_end_stone_stonecutting");
      UG.class_(rkg_3.class_(xu_3.Sh), xu_3.hK)
         .class_("has_end_stone", class_((rpL_2)xu_3.Sh))
         .class_(var0, "end_stone_brick_wall_from_end_stone_stonecutting");
      UG.class_(rkg_3.class_(xu_3.bO), xu_3.Ge, 2)
         .class_("has_smooth_stone", class_((rpL_2)xu_3.bO))
         .class_(var0, "smooth_stone_slab_from_smooth_stone_stonecutting");
      UG.class_(rkg_3.class_(xu_3.Ju), xu_3.Jv, 2)
         .class_("has_blackstone", class_((rpL_2)xu_3.Ju))
         .class_(var0, "blackstone_slab_from_blackstone_stonecutting");
      UG.class_(rkg_3.class_(xu_3.Ju), xu_3.Jm).class_("has_blackstone", class_((rpL_2)xu_3.Ju)).class_(var0, "blackstone_stairs_from_blackstone_stonecutting");
      UG.class_(rkg_3.class_(xu_3.Ju), xu_3.JZ).class_("has_blackstone", class_((rpL_2)xu_3.Ju)).class_(var0, "blackstone_wall_from_blackstone_stonecutting");
      UG.class_(rkg_3.class_(xu_3.Ju), xu_3.JF)
         .class_("has_blackstone", class_((rpL_2)xu_3.Ju))
         .class_(var0, "polished_blackstone_from_blackstone_stonecutting");
      UG.class_(rkg_3.class_(xu_3.Ju), xu_3.Jw)
         .class_("has_blackstone", class_((rpL_2)xu_3.Ju))
         .class_(var0, "polished_blackstone_wall_from_blackstone_stonecutting");
      UG.class_(rkg_3.class_(xu_3.Ju), xu_3.Jq, 2)
         .class_("has_blackstone", class_((rpL_2)xu_3.Ju))
         .class_(var0, "polished_blackstone_slab_from_blackstone_stonecutting");
      UG.class_(rkg_3.class_(xu_3.Ju), xu_3.Jp)
         .class_("has_blackstone", class_((rpL_2)xu_3.Ju))
         .class_(var0, "polished_blackstone_stairs_from_blackstone_stonecutting");
      UG.class_(rkg_3.class_(xu_3.Ju), xu_3.Jn)
         .class_("has_blackstone", class_((rpL_2)xu_3.Ju))
         .class_(var0, "chiseled_polished_blackstone_from_blackstone_stonecutting");
      UG.class_(rkg_3.class_(xu_3.Ju), xu_3.JL)
         .class_("has_blackstone", class_((rpL_2)xu_3.Ju))
         .class_(var0, "polished_blackstone_bricks_from_blackstone_stonecutting");
      UG.class_(rkg_3.class_(xu_3.Ju), xu_3.JC, 2)
         .class_("has_blackstone", class_((rpL_2)xu_3.Ju))
         .class_(var0, "polished_blackstone_brick_slab_from_blackstone_stonecutting");
      UG.class_(rkg_3.class_(xu_3.Ju), xu_3.Jl)
         .class_("has_blackstone", class_((rpL_2)xu_3.Ju))
         .class_(var0, "polished_blackstone_brick_stairs_from_blackstone_stonecutting");
      UG.class_(rkg_3.class_(xu_3.Ju), xu_3.JH)
         .class_("has_blackstone", class_((rpL_2)xu_3.Ju))
         .class_(var0, "polished_blackstone_brick_wall_from_blackstone_stonecutting");
      UG.class_(rkg_3.class_(xu_3.JF), xu_3.Jq, 2)
         .class_("has_polished_blackstone", class_((rpL_2)xu_3.JF))
         .class_(var0, "polished_blackstone_slab_from_polished_blackstone_stonecutting");
      UG.class_(rkg_3.class_(xu_3.JF), xu_3.Jp)
         .class_("has_polished_blackstone", class_((rpL_2)xu_3.JF))
         .class_(var0, "polished_blackstone_stairs_from_polished_blackstone_stonecutting");
      UG.class_(rkg_3.class_(xu_3.JF), xu_3.JL)
         .class_("has_polished_blackstone", class_((rpL_2)xu_3.JF))
         .class_(var0, "polished_blackstone_bricks_from_polished_blackstone_stonecutting");
      UG.class_(rkg_3.class_(xu_3.JF), xu_3.Jw)
         .class_("has_polished_blackstone", class_((rpL_2)xu_3.JF))
         .class_(var0, "polished_blackstone_wall_from_polished_blackstone_stonecutting");
      UG.class_(rkg_3.class_(xu_3.JF), xu_3.JC, 2)
         .class_("has_polished_blackstone", class_((rpL_2)xu_3.JF))
         .class_(var0, "polished_blackstone_brick_slab_from_polished_blackstone_stonecutting");
      UG.class_(rkg_3.class_(xu_3.JF), xu_3.Jl)
         .class_("has_polished_blackstone", class_((rpL_2)xu_3.JF))
         .class_(var0, "polished_blackstone_brick_stairs_from_polished_blackstone_stonecutting");
      UG.class_(rkg_3.class_(xu_3.JF), xu_3.JH)
         .class_("has_polished_blackstone", class_((rpL_2)xu_3.JF))
         .class_(var0, "polished_blackstone_brick_wall_from_polished_blackstone_stonecutting");
      UG.class_(rkg_3.class_(xu_3.JF), xu_3.Jn)
         .class_("has_polished_blackstone", class_((rpL_2)xu_3.JF))
         .class_(var0, "chiseled_polished_blackstone_from_polished_blackstone_stonecutting");
      UG.class_(rkg_3.class_(xu_3.JL), xu_3.JC, 2)
         .class_("has_polished_blackstone_bricks", class_((rpL_2)xu_3.JL))
         .class_(var0, "polished_blackstone_brick_slab_from_polished_blackstone_bricks_stonecutting");
      UG.class_(rkg_3.class_(xu_3.JL), xu_3.Jl)
         .class_("has_polished_blackstone_bricks", class_((rpL_2)xu_3.JL))
         .class_(var0, "polished_blackstone_brick_stairs_from_polished_blackstone_bricks_stonecutting");
      UG.class_(rkg_3.class_(xu_3.JL), xu_3.JH)
         .class_("has_polished_blackstone_bricks", class_((rpL_2)xu_3.JL))
         .class_(var0, "polished_blackstone_brick_wall_from_polished_blackstone_bricks_stonecutting");
      class_(var0, rdy_3.hz, rdy_3.hF);
      class_(var0, rdy_3.hQ, rdy_3.hL);
      class_(var0, rdy_3.hW, rdy_3.hv);
      class_(var0, rdy_3.hN, rdy_3.hA);
      class_(var0, rdy_3.Ow, rdy_3.Og);
      class_(var0, rdy_3.Oj, rdy_3.Oo);
      class_(var0, rdy_3.Of, rdy_3.OY);
      class_(var0, rdy_3.OV, rdy_3.OK);
      class_(var0, rdy_3.OI, rdy_3.OR);
   }

   private static void class_(Consumer<Dw_1> var0, rdb_3 var1, rdb_3 var2) {
      UM.class_(rkg_3.class_(var1), rkg_3.class_(rdy_3.Ok), var2)
         .class_("has_netherite_ingot", class_(rdy_3.Ok))
         .class_(var0, rVL.for_.break_(var2.case_()).break_() + "_smithing");
   }

   private static void break_(Consumer<Dw_1> var0, rpL_2 var1, rpL_2 var2) {
      UB.class_(var1).class_('#', var2).class_("# #").class_("###").break_("boat").class_("in_water", class_(xu_3.try_)).class_(var0);
   }

   private static void break_(Dn_1 var0, JsonObject var1, Path var2) {
      try {
         String var3 = byte_.toJson(var1);
         String var4 = class_.hashUnencodedChars(var3).toString();
         if (!Objects.equals(var0.class_(var2), var4) || !Files.exists(var2)) {
            Files.createDirectories(var2.getParent());

            try (BufferedWriter var5 = Files.newBufferedWriter(var2)) {
               var5.write(var3);
            }
         }

         var0.class_(var2, var4);
      } catch (IOException var10) {
         break_.error("Couldn't save recipe advancement {}", var2, var10);
      }
   }

   private static void break_(Consumer<Dw_1> var0, rpL_2 var1, rlb_3<rdb_3> var2) {
      Us_1.class_(var1, 4).class_(var2).class_("planks").class_("has_logs", class_(var2)).class_(var0);
   }

   private static void throws_(Consumer<Dw_1> var0, rpL_2 var1, rpL_2 var2) {
      UB.class_(var1, 3)
         .class_('#', rdy_3.OD)
         .class_('W', var2)
         .class_("W#W")
         .class_("W#W")
         .break_("wooden_fence")
         .class_("has_planks", class_(var2))
         .class_(var0);
   }

   private static void finally_(Consumer<Dw_1> var0, rpL_2 var1, rpL_2 var2) {
      UB.class_(var1, 2).class_('#', var2).class_("###").class_("###").break_("wooden_trapdoor").class_("has_planks", class_(var2)).class_(var0);
   }

   private static void catch_(Consumer<Dw_1> var0, rpL_2 var1, rpL_2 var2) {
      UB.class_(var1).class_('#', var2).class_("##").break_("wooden_pressure_plate").class_("has_planks", class_(var2)).class_(var0);
   }

   private static void extends_(Consumer<Dw_1> var0, rpL_2 var1, rpL_2 var2) {
      String var3 = rVL.for_.break_(var2.case_()).break_();
      UB.class_(var1, 3)
         .break_("sign")
         .class_('#', var2)
         .class_('X', rdy_3.OD)
         .class_("###")
         .class_("###")
         .class_(" X ")
         .class_("has_" + var3, class_(var2))
         .class_(var0);
   }

   private static void case_(Consumer<Dw_1> var0, rpL_2 var1, rpL_2 var2) {
      UB.class_(var1)
         .class_('#', rdy_3.OD)
         .class_('W', var2)
         .class_("#W#")
         .class_("#W#")
         .break_("wooden_fence_gate")
         .class_("has_planks", class_(var2))
         .class_(var0);
   }

   private static void continue_(Consumer<Dw_1> var0, rpL_2 var1, rpL_2 var2) {
      UB.class_(var1, 8)
         .class_('#', xu_3.u)
         .class_('X', var2)
         .class_("###")
         .class_("#X#")
         .class_("###")
         .break_("stained_glass")
         .class_("has_glass", class_((rpL_2)xu_3.u))
         .class_(var0);
   }

   private static void else_(Consumer<Dw_1> var0, rpL_2 var1, rpL_2 var2) {
      UB.class_(var1, 8)
         .class_('#', xu_3.Ee)
         .class_('X', var2)
         .class_("###")
         .class_("#X#")
         .class_("###")
         .break_("stained_terracotta")
         .class_("has_terracotta", class_((rpL_2)xu_3.Ee))
         .class_(var0);
   }

   private static void implements_(Consumer<Dw_1> var0, rpL_2 var1, rpL_2 var2) {
      UB.class_(var1, 4).class_('#', var2).class_("#  ").class_("## ").class_("###").break_("wooden_stairs").class_("has_planks", class_(var2)).class_(var0);
   }

   private static void new_(Consumer<Dw_1> var0, rpL_2 var1, rpL_2 var2) {
      String var3 = rVL.for_.break_(var2.case_()).break_();
      UB.class_(var1)
         .class_('#', var2)
         .class_('|', rdy_3.OD)
         .class_("###")
         .class_("###")
         .class_(" | ")
         .break_("banner")
         .class_("has_" + var3, class_(var2))
         .class_(var0);
   }

   private static void package_(Consumer<Dw_1> var0, rpL_2 var1, rpL_2 var2) {
      String var3 = rVL.for_.break_(var2.case_()).break_();
      UB.class_(var1).class_('#', var2).class_('X', rlc_3.byte_).class_("###").class_("XXX").break_("bed").class_("has_" + var3, class_(var2)).class_(var0);
   }

   private static void super_(Consumer<Dw_1> var0, rpL_2 var1, rpL_2 var2) {
      UB.class_(var1, 16).class_('#', var2).class_("###").class_("###").break_("stained_glass_pane").class_("has_glass", class_(var2)).class_(var0);
   }

   private static void protected_(Consumer<Dw_1> var0, rpL_2 var1, rpL_2 var2) {
      UB.class_(var1, 3).class_('#', var2).class_("##").class_("##").class_("##").break_("wooden_door").class_("has_planks", class_(var2)).class_(var0);
   }

   private static void private_(Consumer<Dw_1> var0, rpL_2 var1, rpL_2 var2) {
      UB.class_(var1, 6).class_('#', var2).class_("###").break_("wooden_slab").class_("has_planks", class_(var2)).class_(var0);
   }

   private static void final_(Consumer<Dw_1> var0, rpL_2 var1, rpL_2 var2) {
      String var3 = rVL.for_.break_(var1.case_()).break_();
      String var4 = rVL.for_.break_(var2.case_()).break_();
      UB.class_(var1, 8)
         .class_('#', xu_3.Ep)
         .class_('$', var2)
         .class_("###")
         .class_("#$#")
         .class_("###")
         .break_("carpet")
         .class_("has_white_carpet", class_((rpL_2)xu_3.Ep))
         .class_("has_" + var4, class_(var2))
         .class_(var0, var3 + "_from_white_carpet");
   }

   private static void volatile_(Consumer<Dw_1> var0, rpL_2 var1, rpL_2 var2) {
      String var3 = rVL.for_.break_(var2.case_()).break_();
      UB.class_(var1, 3).class_('#', var2).class_("##").break_("carpet").class_("has_" + var3, class_(var2)).class_(var0);
   }

   private static void synchronized_(Consumer<Dw_1> var0, rpL_2 var1, rpL_2 var2) {
      Us_1.class_(var1, 8)
         .break_(var2)
         .break_(xu_3.throw_, 4)
         .break_(xu_3.char_, 4)
         .class_("concrete_powder")
         .class_("has_sand", class_((rpL_2)xu_3.throw_))
         .class_("has_gravel", class_((rpL_2)xu_3.char_))
         .class_(var0);
   }

   private static void native_(Consumer<Dw_1> var0, rpL_2 var1, rpL_2 var2) {
      Us_1.class_(var1).break_(var2).break_(xu_3.rs).class_("wool").class_("has_white_wool", class_((rpL_2)xu_3.rs)).class_(var0);
   }
}
