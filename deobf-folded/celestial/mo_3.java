package celestial;

import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.OptionalLong;
import java.util.stream.Stream;
import org.apache.commons.lang3.mutable.MutableObject;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class mo_3 extends vm_3 {
   private static final Logger id_catch = LogManager.getLogger();
   static final rgP_2 id_private = new rgn_3("selectWorld.gameMode");
   private static final rgP_2 id_implements = new rgn_3("selectWorld.enterSeed");
   private static final rgP_2 id_finally = new rgn_3("selectWorld.seedInfo");
   private static final rgP_2 id_else = new rgn_3("selectWorld.enterName");
   private static final rgP_2 id_synchronized = new rgn_3("selectWorld.resultFolder");
   private static final rgP_2 id_return = new rgn_3("selectWorld.allowCommands.info");
   private final vm_3 id_public;
   private Lu_1 id_goto;
   String id_while;
   Zr_1 id_try = Zr_1.SURVIVAL;
   private Zr_1 id_instanceof;
   private rRO id_throw = rRO.NORMAL;
   rRO id_interface = rRO.NORMAL;
   boolean id_char;
   private boolean id_abstract;
   public boolean id_class;
   protected rTH id_throws;
   private Path id_long;
   private rAt_1 id_float;
   private boolean id_boolean;
   private LF id_transient;
   private LF id_for;
   private LF id_double;
   private LF id_switch;
   private LF r;
   private LF P;
   private LF B;
   rgP_2 S;
   rgP_2 s;
   private String E;
   private rRu_1 G = new rRu_1();
   public final vK_2 id_case;

   private void id_char() {
      this.id_byte(!this.id_boolean);
   }

   private void id_byte(boolean var1) {
      this.id_boolean = var1;
      this.id_for.id_new = !this.id_boolean;
      this.id_double.id_new = !this.id_boolean;
      if (this.id_case.id_class()) {
         this.P.id_new = false;
         this.id_for.id_int = false;
         if (this.id_instanceof == null) {
            this.id_instanceof = this.id_try;
         }

         this.id_class(Zr_1.DEBUG);
         this.B.id_new = false;
      } else {
         this.id_for.id_int = true;
         if (this.id_instanceof != null) {
            this.id_class(this.id_instanceof);
         }

         this.B.id_new = !this.id_boolean;
         this.P.id_new = !this.id_boolean;
      }

      this.id_case.id_break(this.id_boolean);
      this.id_goto.id_private(!this.id_boolean);
      if (this.id_boolean) {
         this.id_switch.id_break(cN_2.id_byte);
      } else {
         this.id_switch.id_break(new rgn_3("selectWorld.moreWorldOptions"));
      }

      this.r.id_new = !this.id_boolean;
   }

   private void id_int() {
      this.id_while = this.id_goto.id_private().trim();
      if (this.id_while.isEmpty()) {
         this.id_while = "World";
      }

      try {
         this.id_while = rpz_3.id_class(this.id_volatile.M().id_break(), this.id_while, "");
      } catch (Exception var4) {
         this.id_while = "World";

         try {
            this.id_while = rpz_3.id_class(this.id_volatile.M().id_break(), this.id_while, "");
         } catch (Exception var3) {
            throw new RuntimeException("Could not create save folder", var3);
         }
      }
   }

   private void id_long() {
      Pair var1 = this.id_static();
      if (var1 != null) {
         this.id_volatile.id_break(new vk_3(this, (rAt_1)var1.getSecond(), this::id_class, (File)var1.getFirst(), new rgn_3("dataPack.title")));
      }
   }

   private void id_float() {
      if (this.id_long != null) {
         try (Stream var1 = Files.walk(this.id_long)) {
            var1.sorted(Comparator.reverseOrder()).forEach(var0 -> {
               try {
                  Files.delete(var0);
               } catch (IOException var2) {
                  id_catch.warn("Failed to remove temporary file {}", var0, var2);
               }
            });
         } catch (IOException var6) {
            id_catch.warn("Failed to list temporary dir {}", this.id_long);
         }

         this.id_long = null;
      }
   }

   public mo_3(vm_3 var1, rYE var2, rrSp_1 var3, Path var4, rTH var5, rVv_1 var6) {
      this(var1, var5, new vK_2(var6, var3, mN_2.id_class(var3), OptionalLong.of(var3.id_class())));
      this.E = var2.id_class();
      this.id_char = var2.id_throws();
      this.id_abstract = true;
      this.id_throw = var2.id_protected();
      this.id_interface = this.id_throw;
      this.G.id_class(var2.id_case(), (rnW_2)null);
      if (var2.id_byte()) {
         this.id_try = Zr_1.HARDCORE;
      } else if (var2.id_break().id_case()) {
         this.id_try = Zr_1.SURVIVAL;
      } else if (var2.id_break().id_throws()) {
         this.id_try = Zr_1.CREATIVE;
      }

      this.id_long = var4;
   }

   private mo_3(vm_3 var1, rTH var2, vK_2 var3) {
      super(new rgn_3("selectWorld.create"));
      this.id_public = var1;
      this.E = jI_2.id_class("selectWorld.newWorld");
      this.id_throws = var2;
      this.id_case = var3;
   }

   private void id_interface() {
      this.id_volatile.id_class(new ZE(new rgn_3("createWorld.preparing")));
      if (this.id_void()) {
         this.id_abstract();
         rrSp_1 var1 = this.id_case.id_class(this.id_class);
         rYE var2;
         if (var1.id_catch()) {
            rRu_1 var3 = new rRu_1();
            var3.id_class(rRu_1.id_finally).id_class(false, (rnW_2)null);
            var2 = new rYE(this.id_goto.id_private().trim(), rRl_1.SPECTATOR, false, rRO.PEACEFUL, true, var3, rTH.id_class);
         } else {
            var2 = new rYE(
               this.id_goto.id_private().trim(),
               this.id_try.field_228218_f_,
               this.id_class,
               this.id_interface,
               this.id_char && !this.id_class,
               this.G,
               this.id_throws
            );
         }

         this.id_volatile.id_class(this.id_while, var2, this.id_case.id_break(), var1);
      }
   }

   private void id_class(rAt_1 var1) {
      ImmutableList var2 = ImmutableList.copyOf(var1.id_protected());
      List var3 = var1.id_break().stream().filter(var1x -> !var2.contains(var1x)).collect(ImmutableList.toImmutableList());
      rTH var4 = new rTH(var2, var3);
      if (var2.equals(this.id_throws.id_class())) {
         this.id_throws = var4;
      } else {
         this.id_volatile.id_private(() -> this.id_volatile.id_break(new ZE(new rgn_3("dataPack.validation.working"))));
         rAh_1.id_class(var1.id_case(), gq_3.INTEGRATED, 2, rqR_2.id_case(), this.id_volatile).handle((var2x, var3x) -> {
            if (var3x != null) {
               id_catch.warn("Failed to validate datapack", var3x);
               this.id_volatile.id_private(() -> this.id_volatile.id_break(new mT_2(var1xx -> {
                     if (var1xx) {
                        this.id_long();
                     } else {
                        this.id_throws = rTH.id_class;
                        this.id_volatile.id_break(this);
                     }
                  }, new rgn_3("dataPack.validation.failed"), rgN_2.id_byte, new rgn_3("dataPack.validation.back"), new rgn_3("dataPack.validation.reset"))));
            } else {
               this.id_volatile.id_private(() -> {
                  this.id_throws = var4;
                  this.id_case.id_class(var2x);
                  var2x.close();
                  this.id_volatile.id_break(this);
               });
            }

            return null;
         });
      }
   }

   private static void id_class(Path var0, Path var1, Path var2) {
      try {
         rqR_2.id_break(var0, var1, var2);
      } catch (IOException var4) {
         id_catch.warn("Failed to copy datapack file from {} to {}", var2, var1);
         throw new mi_3(var4);
      }
   }

   @Override
   public <T extends LZ> T id_class(T var1) {
      return super.id_class((T)var1);
   }

   public static Path id_class(Path var0, QY var1) {
      MutableObject var2 = new MutableObject();

      try (Stream var3 = Files.walk(var0)) {
         var3.filter(var1x -> !var1x.equals(var0)).forEach(var2x -> {
            Path var3x = (Path)var2.getValue();
            if (var3x == null) {
               try {
                  var3x = Files.createTempDirectory("mcworld-");
               } catch (IOException var5) {
                  id_catch.warn("Failed to create temporary dir");
                  throw new mi_3(var5);
               }

               var2.setValue(var3x);
            }

            id_class(var0, var3x, var2x);
         });
      } catch (IOException | mi_3 var8) {
         id_catch.warn("Failed to copy datapacks from world {}", var0, var8);
         return null;
      }

      return (Path)var2.getValue();
   }

   @Override
   public boolean id_class(int var1, int var2, int var3) {
      if (super.id_class(var1, var2, var3)) {
         return true;
      } else if (var1 != 257 && var1 != 335) {
         return false;
      } else {
         this.id_interface();
         return true;
      }
   }

   private void id_class(Zr_1 var1) {
      if (!this.id_abstract) {
         this.id_char = var1 == Zr_1.CREATIVE;
      }

      if (var1 == Zr_1.HARDCORE) {
         this.id_class = true;
         this.B.id_int = false;
         this.id_case.id_class.id_int = false;
         this.id_interface = rRO.HARD;
         this.id_double.id_int = false;
      } else {
         this.id_class = false;
         this.B.id_int = true;
         this.id_case.id_class.id_int = true;
         this.id_interface = this.id_throw;
         this.id_double.id_int = true;
      }

      this.id_try = var1;
      this.id_package();
   }

   @Override
   public void id_class(Ml_1 var1, int var2, int var3, float var4) {
      this.id_class(var1);
      id_class(var1, this.id_super, this.id_extends, this.id_package / 2, 20, -1);
      if (this.id_boolean) {
         id_break(var1, this.id_super, id_implements, this.id_package / 2 - 100, 47, -6250336);
         id_break(var1, this.id_super, id_finally, this.id_package / 2 - 100, 85, -6250336);
         this.id_case.id_class(var1, var2, var3, var4);
      } else {
         id_break(var1, this.id_super, id_else, this.id_package / 2 - 100, 47, -6250336);
         id_break(var1, this.id_super, new rgN_2("").id_class(id_synchronized).id_break(" ").id_break(this.id_while), this.id_package / 2 - 100, 85, -6250336);
         this.id_goto.id_class(var1, var2, var3, var4);
         id_break(var1, this.id_super, this.S, this.id_package / 2 - 150, 122, -6250336);
         id_break(var1, this.id_super, this.s, this.id_package / 2 - 150, 134, -6250336);
         if (this.B.id_new) {
            id_break(var1, this.id_super, id_return, this.id_package / 2 - 150, 172, -6250336);
         }
      }

      super.id_class(var1, var2, var3, var4);
   }

   public static mo_3 id_class(vm_3 var0) {
      rVv_1 var1 = rVm_1.id_break();
      return new mo_3(
         var0,
         rTH.id_class,
         new vK_2(
            var1, rrSp_1.id_class(var1.id_break(rVL.id_void), var1.id_break(rVL.n), var1.id_break(rVL.u)), Optional.of(mN_2.id_class), OptionalLong.empty()
         )
      );
   }

   private boolean id_void() {
      if (this.id_long != null) {
         try (
            rrGk_1 var1 = this.id_volatile.M().id_byte(this.id_while);
            Stream var2 = Files.walk(this.id_long);
         ) {
            Path var3 = var1.id_class(rrGr_1.id_catch);
            Files.createDirectories(var3);
            var2.filter(var1x -> !var1x.equals(this.id_long)).forEach(var2x -> id_class(this.id_long, var3, var2x));
         } catch (IOException | mi_3 var9) {
            id_catch.warn("Failed to copy datapacks to world {}", this.id_while, var9);
            this.id_native();
            return false;
         }
      }

      return true;
   }

   public void id_finally() {
      this.id_byte(this.id_boolean);
   }

   private void id_package() {
      this.S = new rgn_3("selectWorld.gameMode." + this.id_try.field_228217_e_ + ".line1");
      this.s = new rgn_3("selectWorld.gameMode." + this.id_try.field_228217_e_ + ".line2");
   }

   private Pair<File, rAt_1> id_static() {
      Path var1 = this.id_final();
      if (var1 != null) {
         File var2 = var1.toFile();
         if (this.id_float == null) {
            this.id_float = new rAt_1(new rAf_1(), new rAz_1(var2, rAZ.id_class));
            this.id_float.id_class();
         }

         this.id_float.id_class(this.id_throws.id_class());
         return Pair.of(var2, this.id_float);
      } else {
         return null;
      }
   }

   @Override
   protected <T extends cC_2> T id_protected(T var1) {
      return super.id_protected((T)var1);
   }

   @Override
   public void id_private() {
      this.id_goto.id_catch();
      this.id_case.id_private();
   }

   private void id_abstract() {
      if (this.id_float != null) {
         this.id_float.close();
      }

      this.id_float();
   }

   protected Path id_final() {
      if (this.id_long == null) {
         try {
            this.id_long = Files.createTempDirectory("mcworld-");
         } catch (IOException var2) {
            id_catch.warn("Failed to create temporary dir", var2);
            this.id_native();
         }
      }

      return this.id_long;
   }

   @Override
   public void id_volatile() {
      if (this.id_boolean) {
         this.id_byte(false);
      } else {
         this.id_native();
      }
   }

   public void id_native() {
      this.id_volatile.id_break(this.id_public);
      this.id_abstract();
   }

   @Override
   protected void v_() {
      ((Qj_1)this.id_volatile.id_class[23]).id_class(true);
      this.id_goto = new mK_2(this, this.id_super, this.id_package / 2 - 100, 60, 200, 20, new rgn_3("selectWorld.enterName"));
      this.id_goto.id_class(this.E);
      this.id_goto.id_class(var1x -> {
         this.E = var1x;
         this.id_transient.id_int = !this.id_goto.id_private().isEmpty();
         this.id_int();
      });
      this.id_native.add(this.id_goto);
      int var1 = this.id_package / 2 - 155;
      int var2 = this.id_package / 2 + 5;
      this.id_for = this.id_class(new mD_2(this, var1, 100, 150, 20, rgN_2.id_byte, var1x -> {
         switch (this.id_try) {
            case SURVIVAL:
               this.id_class(Zr_1.HARDCORE);
               break;
            case HARDCORE:
               this.id_class(Zr_1.CREATIVE);
               break;
            case CREATIVE:
               this.id_class(Zr_1.SURVIVAL);
         }
      }));
      this.id_double = this.id_class(new mU_2(this, var2, 100, 150, 20, new rgn_3("options.difficulty"), var1x -> {
         this.id_throw = this.id_throw.id_protected();
         this.id_interface = this.id_throw;
      }));
      this.B = this.id_class(new me_3(this, var1, 151, 150, 20, new rgn_3("selectWorld.allowCommands"), var1x -> {
         this.id_abstract = true;
         this.id_char = !this.id_char;
      }));
      this.P = this.id_class(new LF(var2, 151, 150, 20, new rgn_3("selectWorld.dataPacks"), var1x -> this.id_long()));
      this.r = this.id_class(
         new LF(var1, 185, 150, 20, new rgn_3("selectWorld.gameRules"), var1x -> this.id_volatile.id_break(new ZJ(this.G.id_break(), var1xx -> {
               this.id_volatile.id_break(this);
               var1xx.ifPresent(var1xxx -> this.G = var1xxx);
            })))
      );
      this.id_case.id_class(this, this.id_volatile, this.id_super);
      this.id_switch = this.id_class(new LF(var2, 185, 150, 20, new rgn_3("selectWorld.moreWorldOptions"), var1x -> this.id_char()));
      this.id_transient = this.id_class(new LF(var1, this.id_int - 28, 150, 20, new rgn_3("selectWorld.create"), var1x -> this.id_interface()));
      this.id_transient.id_int = !this.E.isEmpty();
      this.id_class(new LF(var2, this.id_int - 28, 150, 20, cN_2.id_protected, var1x -> this.id_native()));
      this.id_finally();
      this.id_break(this.id_goto);
      this.id_class(this.id_try);
      this.id_int();
   }

   @Override
   public void w_() {
      super.w_();
      ((Qj_1)this.id_volatile.id_class[23]).id_class(false);
   }
}
